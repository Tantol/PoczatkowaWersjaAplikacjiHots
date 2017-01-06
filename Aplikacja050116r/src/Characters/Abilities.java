package Characters;

public class Abilities {
	//Info about abilitie
	public String name;
	public double cooldown;
	public double time;
	public double value;
	public double rangeOfSkill;
	public String info;
	//Negative effects of skills [Debuffs]
	public boolean stun;
	public boolean silent;
	public boolean blinde;
	public boolean damageOverTime;
	public boolean dmg;
	public boolean cripple;
	public boolean slow;
	//Positive effects of skills [Buffs]
	public boolean heal;
	public boolean speed;
	public boolean shield;
	//Just effects
	public boolean range;
	public boolean aEoDMG;
	
	public Abilities(String name){
		this.name=name;
		this.cooldown=0;
		this.time=0;
		this.value=0;
		this.rangeOfSkill=0;
		this.info=""; //On the end of this class
		//Negative effects of skills [Debuffs]
		this.stun=false;
		this.silent=false;
		this.blinde=false;
		this.damageOverTime=false;
		this.dmg=false;
		this.cripple=false;
		this.slow=false;
		//Positive effects of skills [Buffs]
		this.heal=false;
		this.speed=false;
		this.shield=false;
		//Just effects
		this.range=false;
		this.aEoDMG=false;
	}
	//Info about abilitie
	    public void name(String name){this.name=name;}
		public void cooldown(double cooldown){this.cooldown=cooldown;}
		public void time(double time){this.time=time;}
		public void value(double value){this.value=value;}
		public void rangeOfSkill(double rangeOfSkill){this.rangeOfSkill=rangeOfSkill;}
		//Negative effects of skills [Debuffs]
		public void stun(boolean answer){this.stun=answer;}
		public void silent(boolean answer){this.silent=answer;}
		public void blinde(boolean answer){this.blinde=answer;}
		public void damageOverTime(boolean answer){this.damageOverTime=answer;}
		public void dmg(boolean answer){this.dmg=answer;}
		public void cripple(boolean answer){this.cripple=answer;}
		public void slow(boolean answer){this.slow=answer;}
		//Positive effects of skills [Buffs]
		public void heal(boolean answer){this.heal=answer;}
		public void speed(boolean answer){this.speed=answer;}
		public void shield(boolean answer){this.shield=answer;}
		//Just effects
		public void range(boolean answer){this.range=answer;}
		public void aEoDMG(boolean answer){this.aEoDMG=answer;}
		
		public void info(){}
	

	
	
}
