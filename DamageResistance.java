package DnD;
import DnD.Damage;
public class DamageResistance
{
	int [] fire, cold, electric, positive, negitive, acid, slashingNonMagical, bashingNonMagical, piercingNonMagical, slashing, piercing, bashing, thunder, poison;
	Damage damage;
	//creates a damage resistance in order to calculate damage dealt
	//takes in 14 int[] of size 2
	//each [0] is damage multiplier
	//each [1] is damage modifier
	//the arrays are for each damage type
	//also takes in raw damage
	public DamageResistance(int[] fire, int[] cold, int[] electric, int[] positive, int[] negative, int[] acid, int[] slashingNonMagical, int[] bashingNonMagical, int[] piercingNonMagical, int[] slashing, int[] piercing, int[] bashing, int[] thunder, int[] poison, Damage damage)
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
		this.damage = damage;
	}
	//creates a damage resistance that is not meant to be used immediately
	DamageResistance(int[] fire, int[] cold, int[] electric, int[] positive, int[] negative, int[] acid, int[] slashingNonMagical, int[] bashingNonMagical, int[] piercingNonMagical, int[] slashing, int[] piercing, int[] bashing, int[] thunder, int[] poison)
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
		this.damage = null;
	}
	//takes a damage object and calculates damage dealt by applying the resistance to the damage
	public int DamageTotal()
	{
		int[] damageUnmodified = damage.CombineDamage();
		int fireDamage = damageUnmodified[0] * fire[0] - fire[1];
		int coldDamage = damageUnmodified[1] * cold[0] - cold[1];
		int electricDamage = damageUnmodified[2] * electric[0] - electric[1];
		int positiveDamage = damageUnmodified[3] * positive[0] - positive[1];
		int negitiveDamage = damageUnmodified[4] * negitive[0] - negitive[1];
		int acidDamage = damageUnmodified[5] * acid[0] - acid[1];
		int slashingNonMagicalDamage = damageUnmodified[6] * slashingNonMagical[0] - slashingNonMagical[1];
		int bashingNonMagicalDamage = damageUnmodified[7] * bashingNonMagical[0] - bashingNonMagical[1];
		int piercingNonMagicalDamage = damageUnmodified[8] * piercingNonMagical[0] - piercingNonMagical[1];
		int slashingDamage = damageUnmodified[9] * slashing[0] - slashing[1];
		int piercingDamage = damageUnmodified[10] * piercing[0] - piercing[1];
		int bashingDamage = damageUnmodified[11] * bashing[0] - bashing[1];
		int thunderDamage = damageUnmodified[12] * thunder[0] - thunder[1];
		int poisonDamage = damageUnmodified[13] * poison[0] - poison[1];
		return fireDamage + coldDamage + electricDamage + positiveDamage + negitiveDamage + acidDamage + slashingNonMagicalDamage + bashingNonMagicalDamage + piercingNonMagicalDamage + slashingDamage + piercingDamage + bashingDamage + thunderDamage + poisonDamage;
	}
	//returns a damage resistance in a 14 by 2 array
	//the 14 is for each damage type
	//the 2 is for damage multiplier and damage modifier
	public int[][] GetDamageResistance()
	{
		int[][] damageResistance = new int[14][2];
		damageResistance[0] = this.fire;
		damageResistance[1] = this.cold;
		damageResistance[2] = this.electric;
		damageResistance[3] = this.positive;
		damageResistance[4] = this.negitive;
		damageResistance[5] = this.acid;
		damageResistance[6] = this.slashingNonMagical;
		damageResistance[7] = this.bashingNonMagical;
		damageResistance[8] = this.piercingNonMagical;
		damageResistance[9] = this.slashing;
		damageResistance[10] = this.piercing;
		damageResistance[11] = this.bashing;
		damageResistance[12] = this.thunder;
		damageResistance[13] = this.poison;
		return damageResistance;
	}
}
