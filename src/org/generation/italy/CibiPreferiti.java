package org.generation.italy;

public class CibiPreferiti {

	public static void main(String[] args) {
		String[] CibiPreferiti = {"Carbonara", "Frittura di pesce", "Boscaiola", "Piadina", "Granita all'amarena", "Maritozzo alla panna", "Mortadella Fiorucci"};
		int len = CibiPreferiti.length;
		System.out.println(CibiPreferiti.length);
		System.out.println(CibiPreferiti[0]);
		
		// non essendo possibile avere una mediana perfetta con numero di elementi pari, questa formula dovrebbe avvicinarcisi.
		System.out.println(CibiPreferiti[(len - 1)/2]);
		
		
		System.out.println(CibiPreferiti[CibiPreferiti.length - 1]);
	}
}
