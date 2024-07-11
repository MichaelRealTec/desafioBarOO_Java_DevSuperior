package entities;

public class Bill {
	// Atributos
	// Conta do bar em inglês = Bill
	public char gender;    // gender = sexo
	public int beer;       // beer = cerveja
	public int barbecue;   // barbecue = espetinhos
	public int softDrink;  // softDrink = refrigerante
	
	// Métodos
	public double cover() {  // Cover = Cover artitistico
		couvert = 0.00;
		if(feeding() > 30) {
			couvert = 0.00;
			System.out.println("Isento de Couvert");
		}else {
			couvert = 4.00;
		}
		return 
	}
	
	public double feeding() {  // Feeding = Consumo
		return ( (beer * 5.00) + (barbecue * 7.00) + (softDrink * 3.00));
	}
	
	public double ticket() {   // Ticket = Ingresso
		return 
	}
	
	public double total() {    // Total = Conta total
		return  
	}
	
}
