package Characters;

public class Champion {
	public Abilitie skillQ, skillW, skillE;
	public Abilitie passiveD;
	public Abilitie heroSkill1;
	public Abilitie heroSkill2;
	public String name;
	
	public Champion(String name){
		this.name=name;
	}
	
	public void skillQ(String name){this.skillQ(name);}
	public void skillW(String name){this.skillW(name);}
	public void skillE(String name){this.skillE(name);}
	public void passiveD(String name){this.passiveD(name);}
	public void heroSkill1(String name){this.heroSkill1(name);}	
	public void heroSkill2(String name){heroSkill2(name);}
		
	

}
