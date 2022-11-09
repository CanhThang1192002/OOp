import java.util.Scanner;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc items0rdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered >= MAX_NUMBERS_ORDERED)
			System.out.println("The cart is full");
		else {
			items0rdered[qtyOrdered].setTitle(disc.getTitle());
			items0rdered[qtyOrdered].setCategory(disc.getCategory());
			items0rdered[qtyOrdered].setDirector(disc.getDirector());
			items0rdered[qtyOrdered].setLength(disc.getLength());
			items0rdered[qtyOrdered].setCost(disc.getCost());
			qtyOrdered++;
			System.out.println("The disc has been added");
		}
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int i, j;
		for (i = 0; i < qtyOrdered; i++) {
			if (items0rdered[i] == disc) {
				for (j = i; j < qtyOrdered; j++) {
					items0rdered[j] = items0rdered[j + 1];
				}
				qtyOrdered--;
				break;
			}
		}
	}

	public float totalCost() {
		int i;
		float sum = 0;
		for (i = 0; i < qtyOrdered; i++) {
			sum = sum + items0rdered[i].getCost();
		}
		return sum;
	}

	public int getQtyOrdered() {
		return qtyOrdered;
	}
}
