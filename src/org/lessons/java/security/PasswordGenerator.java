package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci il tuo nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Inserisci il tuo cognome: ");
		String cognome = sc.nextLine();
		
		System.out.print("Inserisci il tuo colore preferito: ");
		String colore = sc.nextLine();
		
		System.out.print("Inserisci il tuo giorno di nascita: ");
		int giorno = sc.nextInt();
		
		System.out.print("Inserisci il tuo mese di nascita: ");
		int mese = sc.nextInt();
		
		System.out.print("Inserisci il tuo anno di nascita: ");
		int anno = sc.nextInt();
		
		sc.close();
		
		int sommaData = giorno + mese + anno;
		
		System.out.println("La password generata è la seguente: " + nome + "-" + cognome + "-" + colore + "-" + sommaData  );
}
}
