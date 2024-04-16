package bookMarket.view;

import java.util.Scanner;

import bookMarket.model.BookStorage;

public class ConsoleView {

	public void displayWelcome() {
		String welcome = ("*****************************************\n"
                + "*    Welcome to YoonWu Book Market      *\n"
                + "*****************************************");
		System.out.println(welcome);
	}

	public int selectMenu(String[] menuList) {
		displayMenu(menuList);
		Scanner input = new Scanner(System.in);
		int menu;
		do {
			System.out.print(">> 메뉴 선택 : ");
			 menu = input.nextInt();	
			 if(menu <0 || menu>= menuList.length) {
				 System.out.println("0부터" + (menuList.length-1) + "까지의 숫자를 입력하세요.");
			 }
		}while(menu < 0 || menu >= menuList.length);
		
		return menu;
	}

	private void displayMenu(String[] menuList) {
		System.out.println("=========================================");
		for(int i = 1; i < menuList.length; i++) {
			System.out.println(menuList[i]);
		}
		System.out.println(menuList[0]);
		System.out.println("=========================================");
	}

	

	public void displayBookInfo(BookStorage mBookStorage) {
		for(int i = 0; i < mBookStorage.getNumBooks(); i++) {
			String bookInfo = mBookStorage.getBookInfo(i);
			System.out.println(bookInfo);
		}
	}

}
