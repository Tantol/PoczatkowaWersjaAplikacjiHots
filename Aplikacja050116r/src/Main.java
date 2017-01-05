
public class Main {

	public static void main(String[] args) {
		String[] names = { "Abathur","Alarak" ,"Anub'arak" ,"Artanis" ,"Arthas" ,"Auriel" ,"Azmodan" ,"Brightwing","Chen","Chromie","Dehaka","Diablo","E.T.C.","Falstad","Gazlowe","Greymane","Gul'dan","Illidan","Jaina","Johanna","Kael'thas","Kerrigan","Kharazim","Leoric","Li Li","Li-Ming","Lt.Morales","Lunara","Malfurion","Medivh","Muradin","Murky","Nazeebo","Nova","Ragnaros","Raynor","Rehgar","Rexxar","Samuro","Sgt.Hammer","Sonya","Stitches","Sylvanas","Tassadar","The Butcher","The Lost Vikings","Thrall","Tracer","Tychus","Tyrael","Tyrande","Uther","Valla","Varian","Xul","Zagara","Zarya","Zeratul","Zul'jin"};
		int co5nazwa=0;
		for(String name : names){
			co5nazwa++;
			System.out.print(name+" | ");
			if(co5nazwa%5==0){System.out.print("\n");}

	}

}
}