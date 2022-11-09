
public class Aims {
	public static void main(String[] args) {
		Cart an0rder = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("the lion king", "Animation", "Roger Allers", 87, 19.95f);
		an0rder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "george Lucas", 87, 24.95f);
		an0rder.addDigitalVideoDisc(dvd2);

		System.out.println("Total Cost is: ");
		System.out.println(an0rder.totalCost());
		
		an0rder.removeDigitalVideoDisc(dvd2);
		System.out.println("Total cost after deletion is: ");
		System.out.println(an0rder.totalCost());
	}
}
