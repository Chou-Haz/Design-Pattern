import java.util.Iterator;

public class Waitress {
	Menu dinerMenu;
	Menu pancakeMenu;

	public Waitress(Menu pancakeMenu,Menu dinerMenu) {
		this.dinerMenu = dinerMenu;
		this.pancakeMenu = pancakeMenu;
	}

	public void printMenu() {
		Iterator pancakeIterator = pancakeMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();

		printMenu(pancakeIterator);
		printMenu(dinerIterator);
	}

	private void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.println(menuItem.getName()+",");
			System.out.print(menuItem.getPrice()+"--");
			System.out.println(menuItem.getDescription());
		}
	}

}