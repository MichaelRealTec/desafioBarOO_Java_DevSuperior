package entities;

import java.util.Scanner;

public class Bill {
	// Atributos
	// Conta do bar em inglês = Bill
	public char gender;    // gender = sexo
	public int beer;       // beer = cerveja
	public int barbecue;   // barbecue = espetinhos
	public int softDrink;  // softDrink = refrigerante
	
	//Scanner sc = new Scanner(System.in);	
	
	// Métodos
	public double cover() {  // Cover = Cover artitistico
		
		if(feeding() > 30) {
			return 0;
		}else {
			return 4.00;
		}		
	}
	
	public double feeding() {  // Feeding = Consumo
		return ( (beer * 5.00) + (barbecue * 7.00) + (softDrink * 3.00));
	}
	
	public double ticket(char gender) {   // Ticket = Ingresso
		this.gender = gender;
		if(gender == 'M') {
			return 10.00;
		}else {
			return 8.00;
		}
	}
	
	public double total() {    // Total = Conta total
		return ticket(gender) + feeding() + cover(); 
	}
	
}

