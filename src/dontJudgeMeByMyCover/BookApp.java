package dontJudgeMeByMyCover;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book kuroko = new Book();
		System.out.println(kuroko.getText());
		System.out.println();
		System.out.println(kuroko.cart(5));
		System.out.println();
		kuroko.setInStock(4);
		System.out.println(kuroko.cart(5));
		System.out.println();
		kuroko.setInStock(0);
		System.out.println(kuroko.cart(5));
	}

}
