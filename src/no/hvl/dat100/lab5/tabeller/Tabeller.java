package no.hvl.dat100.lab5.tabeller;

public class Tabeller {
	
	// a)
	public static void skrivUt(int[] tabell) {
		
		for(int i=0; i<tabell.length; i++) {
			System.out.println(tabell[i]);
		}
	
	}

	// b)
	public static String tilStreng(int[] tabell) {

		System.out.println(tabell[2]);
		
		int y=tabell.length;
		String x="";
		int i=0;
		while(i<tabell.length) {
			if(i==0) {
				x=x+"[" +tabell[i]+",";
				i++;
			}
			if(i==y-1) {
				x=x+tabell[i];
				i++;
			}
			else if (i>0 && i<y) {
				x=x+tabell[i]+",";
				i++;
			}	
				if(i==y) {
				System.out.println(x+"]");
			}
				
		}
		
		return x;
		
	}

	// c)
	public static int summer(int[] tabell) {
		int x=0;
		for(int i=0; i<tabell.length; i++) {
			x+=tabell[i];
		}
		return x;
		
	// kommenterer ut de to andre summer metodene her
		
		//public static int summer2(int[]tabell) {
			//int x=0;
			//int i=0;
		 	//while(i<tabell.length) {
				//x+=tabell[i];
				//i++;
			//}return x;
			
			//public static int summer3(int[]tabell) {
				//int sum=0;
				//for(int enhet:tabell) {
					//sum+=enhet;
				//}return sum;
			//}	
		
		
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		int z=tabell.length;
		int i =0;
		while(i<z) {
			if(tall==tabell[i]) {
			return true;
		}i++;
		
			
		}return false;
		
	}
	

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int i =0;
		int z=tabell.length;
		while(i<z) {
			if(tall==tabell[i]) {
				return i;
			}i++;		
		}return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int x=0; 
		int z=tabell.length;
		for(int i=0; i<z/2; i++ ) {
			x=tabell[i];
			tabell[i]=tabell[z-1-i];
			tabell[z-1-i]=x;
		
		}return tabell;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		int i=0;
		int z=tabell.length;
		while(i<tabell.length) {
			if(tabell[i]<tabell[i+1]) {
				i++;
				if(i==z-1) {
					return true;
				}
			}
			else if(tabell[i]>=tabell[i+1]) {
				return false;
			}
		}	
		return false;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int [] tabell3=new int [tabell1.length+tabell2.length];
		
		for(int i=0; i<tabell1.length; i++) {
			tabell3[i]=tabell1[i];
		}
		for(int j=0; j<tabell2.length; j++) {
			tabell3[j+tabell1.length]=tabell2[j];
		}
		for(int i=0; i<tabell3.length; i++) {
			System.out.println(tabell3[i]);
		}
		return tabell3;
	}
}
