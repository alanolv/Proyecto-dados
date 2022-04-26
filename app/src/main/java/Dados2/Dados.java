/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados2;
import java.util.*;
public class Dados {
    private int d1;
	private int d2;
	private String edoJuego;
	private int sumaAnt;

	public int getD1() {
            Random random = new Random();
		return d1=((int)(random.nextDouble()*7));
	}

	public int getD2() {
            Random random = new Random();
		return d2=((int)(random.nextDouble()*7));
	}
        
	public String getEdoJuego() {
            int suma = d1 + d2;
            edoJuego="JC";

		if (suma == 7) {

			 edoJuego = "JP";

		}

		if (suma == sumaAnt) {
			 edoJuego = "JG";

		}
                if (suma == 7 || suma == 11) {
			 edoJuego = "JG";

		}

		if (suma == 2 || suma == 3 || suma == 12) {
			 edoJuego = "JP";

		}
                 return edoJuego;
		
	}
}
