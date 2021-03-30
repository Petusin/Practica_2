
public class Main {

	public static void main(String[] args) {
		
		Apartment studioManhattan = new Apartment(1, 16, 5500);
		Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
		Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);
				
		System.out.println("Method Large");		
		//False
		System.out.println("StudioManhattan");
		System.out.println(studioManhattan.larger(twoRoomsBrooklyn));
		//True
		System.out.println("fourAndKitchenBronx");
		System.out.println(fourAndKitchenBronx.larger(twoRoomsBrooklyn) + "\n");
				
		System.out.println("Method Difference");
		//71600
		System.out.println("StudioManhattan");
		System.out.println(studioManhattan.priceDifference(twoRoomsBrooklyn));
		//35400
		System.out.println("fourAndKitchenBronx");
		System.out.println(fourAndKitchenBronx.priceDifference(twoRoomsBrooklyn) + "\n");
				
				
		System.out.println("Method ExpensiveThan");
		//false
		System.out.println("StudioManhattan");
		System.out.println(studioManhattan.moreExpensiveThan(twoRoomsBrooklyn));
		//true
		System.out.println("fourAndKitchenBronx");
		System.out.println(fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn));
				

	}

}
