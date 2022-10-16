package questao_empresas_APDS;

import java.util.Scanner;
import java.time.LocalDate;  
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class Principal {

	public static void main(String[] args) {

		Scanner l = new Scanner(System.in);
		Scanner o = new Scanner(System.in);
		int i, j, t;
		
		String a[] = new String[5];
		String r[] = new String[5];
		int k = 0;
		
		for(i=0; i<5; i++) {
			System.out.println("\nA "+(i+1)+"ª pessoa trabalhou em quantas empresas?");
			t = l.nextInt();
			k++;
				for(j=1; j<t+1; j++) {
				System.out.println("\nDigite a data de admissão na "+j+"ª empresa da "+k+"ª pessoa : (Obs.: Utilize o método yyyy-MM-dd)");
				a[i] = o.nextLine();
				System.out.println("Digite a data de rescisão na "+j+"ª empresa da "+k+"ª pessoa : (Obs.: Utilize o método yyyy-MM-dd)");
				r[i] = o.nextLine();
				LocalDate d3 = LocalDate.parse(a[i], DateTimeFormatter.ISO_LOCAL_DATE);
				LocalDate d4 = LocalDate.parse(r[i], DateTimeFormatter.ISO_LOCAL_DATE);
				Period period = Period.between(d3, d4);
				int years = Math.abs(period.getYears());
			    int months = Math.abs(period.getMonths());
			    int days = Math.abs(period.getDays());
			    System.out.println("\nO tempo da "+k+" pessoa trabalhado na "+j+"ª empresa foi de: "+years+" anos, "+months+" meses, "+days+" dias");
				}
		}
	}
}
