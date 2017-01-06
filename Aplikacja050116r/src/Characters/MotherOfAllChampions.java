package Characters;


public abstract class MotherOfAllChampions {
	 private String[] tabRole = { "Warrior", "Assasin", "Support", "Specialist"};
	 private String[] tabUniverse = { "Warcraft", "StarCraft", "Diablo", "Retro", "Overwatch" };
	 private String role;
	 private String universe;
	 private String name;
	 
	 public MotherOfAllChampions(String name, int universe, int role) {
		 this.role=tabRole[role];
		 this.universe=tabUniverse[universe];
		 this.name=name;

	   }


}
