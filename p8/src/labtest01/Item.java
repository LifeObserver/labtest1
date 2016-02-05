package labtest01;

import java.util.Comparator;

/**
 * An item in a grocery store: Jar of peanut butter, package of pasta, whatever.
 */
public class Item {

	private static final Comparator<Item> PRICE_COMPARATOR = new PriceComparator();

	private final String aName;
	private final int aId;
	private final int aPrice; // In cents: 100 = one dollar

	/**
	 * Creates a new item.
	 * 
	 * @param pName
	 *            The name of the item. Not necessarily unique.
	 * @param pId
	 *            A unique id for the item
	 * @param pPrice
	 *            The price of the item in cents
	 */
	public Item(String pName, int pId, int pPrice) {
		aName = pName;
		aId = pId;
		aPrice = pPrice;
	}

	/**
	 * @return The name of the item
	 */
	public String getName() {
		return aName;
	}

	/**
	 * @return The ID of the item.
	 */
	public int getId() {
		return aId;
	}

	/**
	 * @return The price of the item in cents
	 */
	public int getPrice() {
		return aPrice;
	}

	public static Comparator<Item> getPriceComparator() {
		return PRICE_COMPARATOR;
	}

	private static class PriceComparator implements Comparator<Item> {
		/**
		 * @pre pItem1 != null && pItem2 != null
		 */
		@Override
		public int compare(Item pItem1, Item pItem2) {
			assert pItem1 != null & pItem2 != null;
			return pItem1.aPrice - pItem2.aPrice;
		}
	}
}
