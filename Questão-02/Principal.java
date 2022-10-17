package questao_empresas_APDS;

import java.util.Scanner;
import java.time.LocalDate;  
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class Principal {

	public static void main(String[] args) /*throws Exception*/{

		Scanner l = new Scanner(System.in);
		Scanner o = new Scanner(System.in);
		int i, j, t, n;
		System.out.println("Quantas pessoas trabalharam?");
		n = l.nextInt();
		String a[] = new String[n];
		String r[] = new String[n];
		int k = 0;
		
		for(i=0; i<n; i++) {
			System.out.println("\nA "+(i+1)+"ª pessoa trabalhou em quantas empresas?");
			t = l.nextInt();
			k++;
				for(j=1; j<t+1; j++) {
				System.out.println("\nDigite a data de admissão na "+j+"ª empresa da "+k+"ª pessoa : (Obs.: Utilize o método yyyy-MM-dd)");
				a[i] = o.nextLine();
				System.out.println("Digite a data de rescisão na "+j+"ª empresa da "+k+"ª pessoa : (Obs.: Utilize o método yyyy-MM-dd)");
				r[i] = o.nextLine();
				LocalDate x = LocalDate.parse(a[i], DateTimeFormatter.ISO_LOCAL_DATE);
				LocalDate y = LocalDate.parse(r[i], DateTimeFormatter.ISO_LOCAL_DATE);
				Period period = Period.between(x, y);
				int anos = Math.abs(period.getYears());
			    int meses = Math.abs(period.getMonths());
			    int dias = Math.abs(period.getDays());
			    System.out.println("\nO tempo da "+k+"ª pessoa trabalhado na "+j+"ª empresa foi de: "+anos+" anos, "+meses+" meses, "+dias+" dias");
				}
		}
	}
}