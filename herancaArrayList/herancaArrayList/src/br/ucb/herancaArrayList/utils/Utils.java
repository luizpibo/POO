package br.ucb.herancaArrayList.utils;

import java.time.LocalDate;
import java.util.Scanner;

public class Utils {
	static public String lerEValidaStringVazia(String text) {
		Scanner input = new Scanner(System.in);
		String entrada;
		do {
			System.out.println(text);
			entrada = input.nextLine();
			if(entrada.isEmpty())
				System.out.println("/nTEXTO VAZIO INVALIDO !! DIGITE NOVAMENTE !!/n");
		}while(entrada.isEmpty());
		return entrada;
	}
	static public int lerEValidaInteiro(String text, int min, int max) {
		Scanner input = new Scanner(System.in);
		int num;
		do {
			System.out.println(text);
			num = input.nextInt();
			if(num<min && num>max)
				System.out.println("/nNUMERO INVALIDO !! DIGITE NOVAMENTE !!/n");
		}while(num<min && num>max);
		return num;
	}
	
	static public LocalDate lerEValidaLocalDate(String text) {
		Scanner input = new Scanner(System.in);
		int dia;
		int mes;
		int ano;
		do {
			System.out.println("/nQual o dia: ");
			dia = input.nextInt();
			System.out.println("/nQual o mes: ");
			mes = input.nextInt();
			System.out.println("/nQual o ano: ");
			ano = input.nextInt();
			if((dia>30 && dia<1) || (mes>12 && mes<1) || (ano<1990 && ano>LocalDate.now().getDayOfYear())) {
				System.out.println("/nDATA INVALIDA DIGITE NOVAMENTE /n");
			}
		}while((dia>30 && dia<1) || (mes>12 && mes<1) || (ano<1990 && ano>LocalDate.now().getDayOfYear()));
		return LocalDate.of(ano, mes, dia);
	}
}
