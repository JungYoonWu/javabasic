package bookMarket.controller;

import bookMarket.model.BookStorage;
import bookMarket.model.Cart;
import bookMarket.view.ConsoleView;

public class BookMarketController {
	
	ConsoleView view;
	BookStorage mBookStorage;
	Cart mCart;
	String[] menuList = {
		"0. 종료", "1. 도서 정보 보기", "2. 장바구니에 도서담기", "3. 장바구니 보기", "4. 장바구니 비우기"	
	};

	public BookMarketController(BookStorage bookStorage, Cart cart, ConsoleView view) {
		this.view = view;
		this.mBookStorage = bookStorage;
		this.mCart = cart;
	}

	public void start() {
		view.displayWelcome();
		
		//menuNum을 받고 메뉴를 확인하니까 dowhile
		int menu;
		do {
			menu = view.selectMenu(menuList);
			
			switch(menu) {
			case 1:
				viewBookInfo();
				break;
			}
		}while(menu != 0);
		
	}

	private void viewBookInfo() {
		view.displayBookInfo(mBookStorage);
		
		
	}

}
