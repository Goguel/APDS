package dominio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Retangulo {

	 public void CalculaBatida() {
	 String path = "C:\\Users\\migue\\in.txt";
     try (BufferedReader br = new BufferedReader(new FileReader(path))) { 
        
         String line = br.readLine();
         while (line != null) { 
        	 String[] retangulo1 = line.split(" ");
             line = br.readLine();
             int ax0= Integer.parseInt(retangulo1[0]);
             int ay0= Integer.parseInt(retangulo1[1]);
             int ax1= Integer.parseInt(retangulo1[2]);
             int ay1= Integer.parseInt(retangulo1[3]);
               
             String[] retangulo2 = line.split(" ");
             line = br.readLine();
             int bx0= Integer.parseInt(retangulo2[0]);
             int by0= Integer.parseInt(retangulo2[1]);
             int bx1= Integer.parseInt(retangulo2[2]);
             int by1= Integer.parseInt(retangulo2[3]);
             
             if (ax1<bx0 || bx1<ax0 || ay1 < by0 || by1 < ay0 || ax0 > bx1 || bx0 > ax1 || ay0 > by1 || by0 > ay1 ) System.out.println("0");
             else System.out.println("1");;
         }
     } catch(IOException e) {
         System.out.println("Error: " + e.getMessage());
     }
    }
}
