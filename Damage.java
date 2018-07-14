package DnD;
import DnD.Roll;

public class Damage
{
	int [] fire, cold, electric, positive, negitive, acid, slashingNonMagical, bashingNonMagical, piercingNonMagical, slashing, piercing, bashing, thunder, poison;
	public Damage(int[] fire, int[] cold, int[] electric, int[] positive, int[] negative, int[] acid, int[] slashingNonMagical, int[] bashingNonMagical, int[] piercingNonMagical, int[] slashing, int[] piercing, int[] bashing, int[] thunder, int[] poison)
	{
		this.fire = fire;
		this.cold = cold;
		this.electric = electric;
		this.positive = positive;
		this.negitive = negative;
		this.acid = acid;
		this.slashingNonMagical = slashingNonMagical;
		this.bashingNonMagical = bashingNonMagical;
		this.piercingNonMagical = piercingNonMagical;
		this.slashing = slashing;
		this.piercing = piercing;
		this.bashing = bashing;
		this.thunder = thunder;
		this.poison = poison;
	}
	public int[] CombineDamage()
	{
		int[] combinedDamage;
		combinedDamage = new int[14];
		combinedDamage[0] = CombineFire();
		combinedDamage[1] = CombineCold();
		combinedDamage[2] = CombineElectric();
		combinedDamage[3] = CombinePositive();
		combinedDamage[4] = CombineNegitive();
		combinedDamage[5] = CombineAcid();
		combinedDamage[6] = CombineSlashingNonMagical();
		combinedDamage[7] = CombinebashingNonMagical();
		combinedDamage[8] = CombinePiercingNonMagical();
		combinedDamage[9] = CombineSlashing();
		combinedDamage[10] = CombinePiercing();
		combinedDamage[11] = CombineBashing();
		combinedDamage[12] = CombineThunder();
		combinedDamage[13] = CombinePoison();
		return combinedDamage;
	}
	private int CombineFire()
	{
		int total = 0;
		for(int i = 0; i <= fire[0]; i++)
		{
			total += Roll.roll(2);
		}
		for(int i = 0; i <= fire[1]; i++)
		{
			total += Roll.roll(4);
		}
		for(int i = 0; i <= fire[2]; i++)
		{
			total += Roll.roll(6);
		}
		for(int i = 0; i <= fire[3]; i++)
		{
			total += Roll.roll(8);
		}
		for(int i = 0; i <= fire[4]; i++)
		{
			total += Roll.roll(10);
		}
		for(int i = 0; i <= fire[5]; i++)
		{
			total += Roll.roll(12);
		}
		for(int i = 0; i <= fire[6]; i++)
		{
			total += Roll.roll(20);
		}
		total += fire[7];
		return total;
	}
	private int CombineCold()
	{
		int total = 0;
		for(int i = 0; i <= cold[0]; i++)
		{
			total += Roll.roll(2);
		}
		for(int i = 0; i <= cold[1]; i++)
		{
			total += Roll.roll(4);
		}
		for(int i = 0; i <= cold[2]; i++)
		{
			total += Roll.roll(6);
		}
		for(int i = 0; i <= cold[3]; i++)
		{
			total += Roll.roll(8);
		}
		for(int i = 0; i <= cold[4]; i++)
		{
			total += Roll.roll(10);
		}
		for(int i = 0; i <= cold[5]; i++)
		{
			total += Roll.roll(12);
		}
		for(int i = 0; i <= cold[6]; i++)
		{
			total += Roll.roll(20);
		}
		total += cold[7];
		return total;
	}
	private int CombineElectric()
	{
		int total = 0;
		for(int i = 0; i <= electric[0]; i++)
		{
			total += Roll.roll(2);
		}
		for(int i = 0; i <= electric[1]; i++)
		{
			total += Roll.roll(4);
		}
		for(int i = 0; i <= electric[2]; i++)
		{
			total += Roll.roll(6);
		}
		for(int i = 0; i <= electric[3]; i++)
		{
			total += Roll.roll(8);
		}
		for(int i = 0; i <= electric[4]; i++)
		{
			total += Roll.roll(10);
		}
		for(int i = 0; i <= electric[5]; i++)
		{
			total += Roll.roll(12);
		}
		for(int i = 0; i <= electric[6]; i++)
		{
			total += Roll.roll(20);
		}
		total += electric[7];
		return total;
	}
	private int CombinePositive()
	{
		int total = 0;
		for(int i = 0; i <= positive[0]; i++)
		{
			total += Roll.roll(2);
		}
		for(int i = 0; i <= positive[1]; i++)
		{
			total += Roll.roll(4);
		}
		for(int i = 0; i <= positive[2]; i++)
		{
			total += Roll.roll(6);
		}
		for(int i = 0; i <= positive[3]; i++)
		{
			total += Roll.roll(8);
		}
		for(int i = 0; i <= positive[4]; i++)
		{
			total += Roll.roll(10);
		}
		for(int i = 0; i <= positive[5]; i++)
		{
			total += Roll.roll(12);
		}
		for(int i = 0; i <= positive[6]; i++)
		{
			total += Roll.roll(20);
		}
		total += positive[7];
		return total;
	}
	private int CombineNegitive()
	{
		int total = 0;
		for(int i = 0; i <= negitive[0]; i++)
		{
			total += Roll.roll(2);
		}
		for(int i = 0; i <= negitive[1]; i++)
		{
			total += Roll.roll(4);
		}
		for(int i = 0; i <= negitive[2]; i++)
		{
			total += Roll.roll(6);
		}
		for(int i = 0; i <= negitive[3]; i++)
		{
			total += Roll.roll(8);
		}
		for(int i = 0; i <= negitive[4]; i++)
		{
			total += Roll.roll(10);
		}
		for(int i = 0; i <= negitive[5]; i++)
		{
			total += Roll.roll(12);
		}
		for(int i = 0; i <= negitive[6]; i++)
		{
			total += Roll.roll(20);
		}
		total += negitive[7];
		return total;
	}
	private int CombineAcid()
	{
		int total = 0;
		for(int i = 0; i <= acid[0]; i++)
		{
			total += Roll.roll(2);
		}
		for(int i = 0; i <= acid[1]; i++)
		{
			total += Roll.roll(4);
		}
		for(int i = 0; i <= acid[2]; i++)
		{
			total += Roll.roll(6);
		}
		for(int i = 0; i <= acid[3]; i++)
		{
			total += Roll.roll(8);
		}
		for(int i = 0; i <= acid[4]; i++)
		{
			total += Roll.roll(10);
		}
		for(int i = 0; i <= acid[5]; i++)
		{
			total += Roll.roll(12);
		}
		for(int i = 0; i <= acid[6]; i++)
		{
			total += Roll.roll(20);
		}
		total += acid[7];
		return total;
	}
	private int CombineSlashingNonMagical()
	{
		int total = 0;
		for(int i = 0; i <= slashingNonMagical[0]; i++)
		{
			total += Roll.roll(2);
		}
		for(int i = 0; i <= slashingNonMagical[1]; i++)
		{
			total += Roll.roll(4);
		}
		for(int i = 0; i <= slashingNonMagical[2]; i++)
		{
			total += Roll.roll(6);
		}
		for(int i = 0; i <= slashingNonMagical[3]; i++)
		{
			total += Roll.roll(8);
		}
		for(int i = 0; i <= slashingNonMagical[4]; i++)
		{
			total += Roll.roll(10);
		}
		for(int i = 0; i <= slashingNonMagical[5]; i++)
		{
			total += Roll.roll(12);
		}
		for(int i = 0; i <= slashingNonMagical[6]; i++)
		{
			total += Roll.roll(20);
		}
		total += slashingNonMagical[7];
		return total;
	}
	private int CombinebashingNonMagical()
	{
		int total = 0;
		for(int i = 0; i <= bashingNonMagical[0]; i++)
		{
			total += Roll.roll(2);
		}
		for(int i = 0; i <= bashingNonMagical[1]; i++)
		{
			total += Roll.roll(4);
		}
		for(int i = 0; i <= bashingNonMagical[2]; i++)
		{
			total += Roll.roll(6);
		}
		for(int i = 0; i <= bashingNonMagical[3]; i++)
		{
			total += Roll.roll(8);
		}
		for(int i = 0; i <= bashingNonMagical[4]; i++)
		{
			total += Roll.roll(10);
		}
		for(int i = 0; i <= bashingNonMagical[5]; i++)
		{
			total += Roll.roll(12);
		}
		for(int i = 0; i <= bashingNonMagical[6]; i++)
		{
			total += Roll.roll(20);
		}
		total += bashingNonMagical[7];
		return total;
	}
	private int CombinePiercingNonMagical()
	{
		int total = 0;
		for(int i = 0; i <= piercingNonMagical[0]; i++)
		{
			total += Roll.roll(2);
		}
		for(int i = 0; i <= piercingNonMagical[1]; i++)
		{
			total += Roll.roll(4);
		}
		for(int i = 0; i <= piercingNonMagical[2]; i++)
		{
			total += Roll.roll(6);
		}
		for(int i = 0; i <= piercingNonMagical[3]; i++)
		{
			total += Roll.roll(8);
		}
		for(int i = 0; i <= piercingNonMagical[4]; i++)
		{
			total += Roll.roll(10);
		}
		for(int i = 0; i <= piercingNonMagical[5]; i++)
		{
			total += Roll.roll(12);
		}
		for(int i = 0; i <= piercingNonMagical[6]; i++)
		{
			total += Roll.roll(20);
		}
		total += piercingNonMagical[7];
		return total;
	}
	private int CombineSlashing()
	{
		int total = 0;
		for(int i = 0; i <= slashing[0]; i++)
		{
			total += Roll.roll(2);
		}
		for(int i = 0; i <= slashing[1]; i++)
		{
			total += Roll.roll(4);
		}
		for(int i = 0; i <= slashing[2]; i++)
		{
			total += Roll.roll(6);
		}
		for(int i = 0; i <= slashing[3]; i++)
		{
			total += Roll.roll(8);
		}
		for(int i = 0; i <= slashing[4]; i++)
		{
			total += Roll.roll(10);
		}
		for(int i = 0; i <= slashing[5]; i++)
		{
			total += Roll.roll(12);
		}
		for(int i = 0; i <= slashing[6]; i++)
		{
			total += Roll.roll(20);
		}
		total += slashing[7];
		return total;
	}
	private int CombinePiercing()
	{
		int total = 0;
		for(int i = 0; i <= piercing[0]; i++)
		{
			total += Roll.roll(2);
		}
		for(int i = 0; i <= piercing[1]; i++)
		{
			total += Roll.roll(4);
		}
		for(int i = 0; i <= piercing[2]; i++)
		{
			total += Roll.roll(6);
		}
		for(int i = 0; i <= piercing[3]; i++)
		{
			total += Roll.roll(8);
		}
		for(int i = 0; i <= piercing[4]; i++)
		{
			total += Roll.roll(10);
		}
		for(int i = 0; i <= piercing[5]; i++)
		{
			total += Roll.roll(12);
		}
		for(int i = 0; i <= piercing[6]; i++)
		{
			total += Roll.roll(20);
		}
		total += piercing[7];
		return total;
	}
	private int CombineBashing()
	{
		int total = 0;
		for(int i = 0; i <= bashing[0]; i++)
		{
			total += Roll.roll(2);
		}
		for(int i = 0; i <= bashing[1]; i++)
		{
			total += Roll.roll(4);
		}
		for(int i = 0; i <= bashing[2]; i++)
		{
			total += Roll.roll(6);
		}
		for(int i = 0; i <= bashing[3]; i++)
		{
			total += Roll.roll(8);
		}
		for(int i = 0; i <= bashing[4]; i++)
		{
			total += Roll.roll(10);
		}
		for(int i = 0; i <= bashing[5]; i++)
		{
			total += Roll.roll(12);
		}
		for(int i = 0; i <= bashing[6]; i++)
		{
			total += Roll.roll(20);
		}
		total += bashing[7];
		return total;
	}
	private int CombineThunder()
	{
		int total = 0;
		for(int i = 0; i <= thunder[0]; i++)
		{
			total += Roll.roll(2);
		}
		for(int i = 0; i <= thunder[1]; i++)
		{
			total += Roll.roll(4);
		}
		for(int i = 0; i <= thunder[2]; i++)
		{
			total += Roll.roll(6);
		}
		for(int i = 0; i <= thunder[3]; i++)
		{
			total += Roll.roll(8);
		}
		for(int i = 0; i <= thunder[4]; i++)
		{
			total += Roll.roll(10);
		}
		for(int i = 0; i <= thunder[5]; i++)
		{
			total += Roll.roll(12);
		}
		for(int i = 0; i <= thunder[6]; i++)
		{
			total += Roll.roll(20);
		}
		total += thunder[7];
		return total;
	}
	private int CombinePoison()
	{
		int total = 0;
		for(int i = 0; i <= poison[0]; i++)
		{
			total += Roll.roll(2);
		}
		for(int i = 0; i <= poison[1]; i++)
		{
			total += Roll.roll(4);
		}
		for(int i = 0; i <= poison[2]; i++)
		{
			total += Roll.roll(6);
		}
		for(int i = 0; i <= poison[3]; i++)
		{
			total += Roll.roll(8);
		}
		for(int i = 0; i <= poison[4]; i++)
		{
			total += Roll.roll(10);
		}
		for(int i = 0; i <= poison[5]; i++)
		{
			total += Roll.roll(12);
		}
		for(int i = 0; i <= poison[6]; i++)
		{
			total += Roll.roll(20);
		}
		total += poison[7];
		return total;
	}
}