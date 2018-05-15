package DnD;

public class CombatRoll extends Roll
{
	//all attackRolls return damage dealt by the attack
	// still need to take resistance into account
	public static int attackRoll(int ab, int ac, int critThreshold, int[] damageDice, int damageBonus)
	{
		int rollResult = thresholdRoll(20, ac, ab, critThreshold);
		if (rollResult == 0)
			return 0;
		if (rollResult == 1)
			return damage(damageDice, damageBonus, false);
		return damage(damageDice, damageBonus, true);
	}
	//advantage true means it has advantage and false means disadvantage
	public static int attackRoll(int ab, int ac, int critThreshold, int[] damageDice, int damageBonus, boolean advantage)
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
			return damage(damageDice, damageBonus, false);
		return damage(damageDice, damageBonus, true);
	}
	//damage dealt
	//needs resistances
	public static int damage(int[] damageDice, int damageBonus, boolean crit)
	{
		int damage = 0;
		for (int damageDie : damageDice)
		{
			damage += roll(damageDie);
		}
		if (crit)
		{
			int maxDie = damageDice[0];
			for (int damageDie : damageDice)
			{
				if (damageDie > maxDie)
					maxDie = damageDie;
			}
			damage += roll(maxDie);
		}
		return damage + damageBonus;
	}
	//saving throws and skill check advantage means with advantage and false means with disadvantage
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
