package DnD;

public class Roll {
	public static int roll(int sides)
	{
		return (int) (Math.random() * sides + 1);
	}
	public static boolean opposedRoll(int sides, int offset)
	{
		int roll1 = roll(sides);
		int roll2 = roll(sides);
		return (roll1>=roll2+offset);
	}
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
	public static boolean thresholdRoll(int sides, int threshold, int modifier)
	{
		return (roll(sides) + modifier >= threshold);
	}
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
