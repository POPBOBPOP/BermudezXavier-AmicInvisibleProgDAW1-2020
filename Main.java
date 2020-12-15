import java.util.*;
public class Main {

	public static void main(String[] args) {
		int c,r=0,clrel[]= new int [21];		
		String clna[] = {"Daniel Barbancho Montero","Xavier Bermúdez Molgó","Joel Berrocal Urbina","Marc Bouzas Guadalupe","Nil Carvajal Playa","Quim Comas Navarro","Aleix Deumal Tripiana","Pau Domènech Pacheco","Gerard Fernández Requena","Sergio Garcia Ruiz","Adrián Gil Moreno","Oriol Pacheco Acevedo","Marcel Josep Paulí Lara","Pol Pavon Pozo","Gerard Pedrero Carbonell","Martí Puig Martín","Ruben Recolons Reig","Josep Recolons Rodriguez","Pau Riera Mas","Carlos Abel Silva Teixeira","Joan Pardo"};
		boolean bob=false,bobe[]=new boolean [21];
		Random rand = new Random(); 
		for(c=0;c<clrel.length;c++,bob=false) {
			while(bob == false) {
				r= rand.nextInt(21);
				if(bobe[r]!=true && r!=c) {
					bob=true;
				}
			}
			clrel[c]=r;
			bobe[r]=true;
		}
		for(c=0;c<clrel.length;c++) {
			System.out.println("El alumne "+clna[c]+" li fara de amic invisible a "+clna[clrel[c]]);
		}		
	}
}
