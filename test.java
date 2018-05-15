package DnD;
import DnD.CombatRoll;
public class test {

	public static void main(String[] args)
	{
		System.out.println(Roll.roll(6));
		System.out.println(Roll.opposedRoll(6, 4));
		System.out.println(Roll.thresholdRoll(20, 30, 19, 19));
		System.out.println(Roll.thresholdRoll(20, 30, 19));
		int[] damageDice = {6, 6};
		System.out.println(CombatRoll.attackRoll(6, 17, 20, damageDice, 1));
		System.out.println(CombatRoll.savingThrow(30, 21, true));
	}

}
