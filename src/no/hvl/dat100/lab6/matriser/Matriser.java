package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		System.out.println("\n");
		for(int i[]:matrise) {
			for(int j:i) {
				System.out.println(j);
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

	String A="";
		
		for(int i=0; i<matrise.length; i++) {
			for(int j=0; j<matrise[0].length; j++) {
				if(j==2) {
					A=A+matrise[i][j]+"\n";
				}
				else
				A=A+matrise[i][j];
			}
		}
		return A;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
int skalert[][]=new int[matrise.length][matrise[0].length];
		
		for(int i=0; i<matrise.length; i++) {
			for(int j=0; j<matrise[0].length; j++) {
				skalert[i][j]=matrise[i][j]*tall;
			}
		
	}
		return skalert;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if(a.length!=b.length || a[0].length!=b[0].length) {
			return false;
			}
			else
				
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[0].length; j++) {
					if(a[i][j]!=b[i][j]) {
						return false;
					}
				}
		}
			
			return true;
		
	}

	
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int speilet[][]=new int[matrise.length][matrise[0].length];
		
		
		for(int i=0; i<matrise.length; i++) {
			for(int j=0; j<matrise[0].length; j++) {
				speilet[i][j]=matrise[j][i];
				
			}

				 }
			 
			
		
		
		return speilet;
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {


		int multiplisert[][]=new int[a.length][a[0].length];
		
		for (int i =0; i<a.length; i++) {
			for (int j=0; j<a[0].length; j++) {
				multiplisert[i][j]=a[i][j]*b[i][j];
			}
			
		}
		return multiplisert;
	
	}
}
