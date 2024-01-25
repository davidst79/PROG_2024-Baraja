package vectoresBaraja;

public class Start {

	public static void main(String[] args) {
		
		
		Baraja deck = new Baraja();
		System.out.println(deck);
		
		System.out.println();
		
		deck.voltearCarta('A', 'C');
		System.out.println(deck);

		

	}

}
