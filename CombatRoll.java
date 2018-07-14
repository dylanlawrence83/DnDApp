package DnD;
import DnD.Damage;
import DnD.DamageResistance;

public class CombatRoll extends Roll
{
	//all attackRolls return damage dealt by the attack
	// still need to take resistance into account
	public static int attackRoll(int ab, int ac, int critThreshold, int[][] damageDice, int[][] resistance, int damageBonus)
	{
		int rollResult = thresholdRoll(20, ac, ab, critThreshold);
		if (rollResult == 0)
			return 0;
		if (rollResult == 1)
			return damage(resistance, damageDice, false);
		return damage(resistance, damageDice, true);
	}
	//advantage true means it has advantage and false means disadvantage
	//having advantage means roll twice take the highest
	//having disadvantage means roll twice take the lowest
	//ab stands for attack bonus and is the bonus added to the attack roll
	//ac stands for armor class and is the number that must be rolled to hit
	public static int attackRoll(int ab, int ac, int critThreshold, int[][] damageDice, int[][] resistance, boolean advantage)
	{
		int rollResult = thresholdRoll(20, ac, ab, critThreshold);
		int roll2 = thresholdRoll(20, ac, ab, critThreshold);
		if (advantage)
			if (roll2 > rollResult)
				rollResult = roll2;
		else
			if (roll2 < rollResult)
				rollResult = roll2;
		if (rollResult == 0)
			return 0;
		if (rollResult == 1)
			return damage(resistance, damageDice, false);
		return damage(resistance, damageDice, true);
	}
	//damage dealt
	//needs resistances
	public static int damage(int[][] resistance, int[][] damageDice, boolean crit)
	{
		if (crit)
			for(int i = 0; i < 14; i++)
				for (int j = 0; j<7; j++)
					damageDice[i][j] *= 2;
		Damage damage = new Damage(damageDice[0], damageDice[1], damageDice[2], damageDice[3], damageDice[4], damageDice[5], damageDice[6], damageDice[7], damageDice[8], damageDice[9], damageDice[10], damageDice[11], damageDice[12], damageDice[13]);
		DamageResistance damageResistance = new DamageResistance(resistance[0], resistance[1], resistance[2], resistance[3], resistance[4], resistance[5], resistance[6], resistance[7], resistance[8], resistance[9], resistance[10], resistance[11], resistance[12], resistance[13], damage);
		return damageResistance.DamageTotal();
	}
	//saving throws and skill check advantage means with advantage and false means with disadvantage
	//dc stands for difficulty check and is the minimum roll to succeed after modified by bonus
	//returns true or false based on weather the roll is passed or not
	public static boolean savingThrow(int dc, int bonus)
	{
		return thresholdRoll(20, dc, bonus);
	}
	public static boolean savingThrow(int dc, int bonus, boolean advantage)
	{
		return (thresholdRoll(20, dc, bonus) || thresholdRoll(20, dc, bonus));
	}
	//ending with 1 means the person making the first roll, 2 means the second roll
	//advantage true is advantage false is disadvantage
	//bonus1 modifies the roll of the first person rolling
	//bonus2 modifies the roll of the second person rolling
	//the first person rolling wins ties
	//returns true or false based on weather the first roll beats the second roll
	public static boolean opposedSkillRoll(int bonus1, int bonus2)
	{
		return opposedRoll(20, bonus2 - bonus1);
	}
	public static boolean opposedSkillRoll(int bonus1, boolean advantage1, int bonus2)
	{
		return opposedRoll(20, bonus2 - bonus1, advantage1);
	}
	public static boolean opposedSkillRoll(int bonus1, int bonus2, boolean advantage2)
	{
		return opposedRoll(20, advantage2, bonus2 - bonus1);
	}
	public static boolean opposedSkillRoll(int bonus1, boolean advantage1, int bonus2, boolean advantage2)
	{
		return opposedRoll(20, advantage2, bonus2 - bonus1, advantage1);
	}
}
