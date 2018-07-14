package DnD;

public class Roll {
	//returns a random number from 1 to the input variable
	public static int roll(int sides)
	{
		return (int) (Math.random() * sides + 1);
	}
	//rolls 2 dice adds the offset to second die
	//the ofset is the modifiers for the second roll - the modifiers for the first
	//returns true if the first roll is greater than or equal to the modified second roll
	public static boolean opposedRoll(int sides, int offset)
	{
		int roll1 = roll(sides);
		int roll2 = roll(sides);
		return (roll1>=roll2+offset);
	}
	//a variant of opposed roll with advantage or disadvantage on the first roll
	//advantage means to roll twice and take the higher
	//disadvantage means to roll twice take the lower
	public static boolean opposedRoll(int sides, int offset, boolean advantage1)
	{
		int roll1 = roll(sides);
		int roll2 = roll(sides);
		int roll3 = roll(sides);
		if (advantage1)
		{
			if (roll3 > roll1)
				roll1 = roll3;
		}
		else
			if (roll3 < roll1)
				roll1 = roll3;
		return (roll1 >= roll2 + offset);
	}
	//a variant of opposed roll with advantage or disadvantage on the second roll
	public static boolean opposedRoll(int sides, boolean advantage2, int offset)
	{
		int roll1 = roll(sides);
		int roll2 = roll(sides);
		int roll3 = roll(sides);
		if (advantage2)
		{
			if (roll3 > roll2)
				roll2 = roll3;
		}
		else
			if (roll3 < roll2)
				roll2 = roll3;
		return (roll1>=roll2+offset);
	}
	//a variant of opposed roll with advantage or disadvantage on both rolls
	public static boolean opposedRoll(int sides, boolean advantage2, int offset, boolean advantage1)
	{
		int roll1 = roll(sides);
		int roll2 = roll(sides);
		int roll3 = roll(sides);
		int roll4 = roll(sides);
		if (advantage1)
		{
			if (roll3 > roll1)
				roll1 = roll3;
		}
		else
			if (roll3 < roll1)
				roll1 = roll3;
		if (advantage2)
		{
			if (roll4 > roll2)
				roll2 = roll4;
		}
		else
			if (roll4 < roll2)
				roll2 = roll4;
		return (roll1>=roll2+offset);
	}
	//a single roll of the dice modified by the modifier and checked against the threshold value
	//returns true if the modified roll is equal to or greater than the threshold
	public static boolean thresholdRoll(int sides, int threshold, int modifier)
	{
		return (roll(sides) + modifier >= threshold);
	}
	//a threshold roll with a chance of auto success
	//returns 0 if the modified roll is less than both the auto success value and the threshold
	//returns 1 if greater than the threshold but less than the auto success
	//returns 2 if greater than the auto success value
	public static int thresholdRoll(int sides, int threshold, int modifier, int autoSuccess)
	{
		int roll = roll(sides);
		if (roll >= autoSuccess)
			return 2;
		if (roll + modifier >= threshold)
			return 1;
		return 0;
	}
}
