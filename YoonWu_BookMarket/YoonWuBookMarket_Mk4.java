package bookMarket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YoonWuBookMarket_Mk4 {

	// 책 목록을 2차원 String배열로 정의
    static String[][] bookList = { 
        { "ID2401", "쉽게 배우는 자바 프로그래밍 2판", "우종정", "한빛아카데미", "20,000원" },
        { "ID2402", "코딩 자율학습 HTML+CSS+자바스크립트", "김기수", "길벗", "30,000원" },
        { "ID2403", "Do It! 자료구조와 함께 배우는 알고리즘 입문 - 자바편", "보요시바타", "이지스퍼블리싱", "25,000원" } 
    };
    static int[] cartList = {0, 0, 0};	// 장바구니 배열
    static int numCartItem = 0;			// 장바구니에 담긴 책 권수
    static int NUM_MENU = 4;			// 메뉴

    public static void main(String[] args) throws IOException {
        displayWelcome();	// 환영 메세지 출력
        bookMarket();		// 북마켓 실행
    }
    
    //북마켓 의 전체적인 틀을 잡아주는 메소드
    static void bookMarket() throws IOException {
        boolean loop_TF = true;				// 반복문을 시작하기 위한 boolean형 변수
        while (loop_TF) {					// boolean형 변수인 loop_TF가 true선언임으로 반복문 시작
        	int numMenu = displayGetMenu();	// 메뉴출력 및 메뉴선택한 입력값을 return하는 메소드 return값을 numMenu에 대입
            switch (numMenu) {				// getMenu메소드에서 받은 numMenu값으로 switch문의 case 시작
                case 1:
                    menuBookList();			// 도서목록을 보여주는 메소드
                    break;
                case 2:
                    menuCartList();			// 장바구니를 보여주는 메소드
                    break;
                case 3:
                	menuBookList();			// 장바구니에 추가하기 전에 도서목록 보여주기 
                    menuAddCartItem();		// 장바구니에 추가하는 메소드
                    break;
                case 4:
                    menuClearCart();		// 장바구니를 비우는 메소드
                    break;
                case 0:
                    menuExit();				// 종료화면 출력 메소드
                    loop_TF = false;		// 종료를 위해서는 반복문이 끝나야 해서 loop_TF 값에 false 대입
                    break;
                default:
                	menuWrongNumber();		// case값이 입력되지 않았을때 잘못된 번호를 입력했다고 보여주는 메소드
                    break;
            }
        }
    }
    
    // 환영메세지 출력하는 메소드 시작할때 씀
    static void displayWelcome() {
        System.out.println("*****************************************\n"
                + "*    Welcome to YoonWu Book Market    *\n"
                + "*****************************************");
    }
    
    // 메뉴를 출력하고 출력된 메뉴에서 번호를 선택하면 선택한 번호를 case에 적용하기 위한 return값을 가지는 메소드
    static int displayGetMenu() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("=========================================\n"
                + "1. 도서 목록 보기\n"
                + "2. 장바구니 보기\n"
                + "3. 장바구니에 도서 추가\n"
                + "4. 장바구니 비우기\n"
                + "0. 종료\n"
                + "=========================================\n"
                + ">> 메뉴 선택 : ");
        int numMenu = Integer.parseInt(br.readLine());

        return numMenu;
    }
    
    // static으로 선언한 bookㅣist이차원 배열에서 도서목록을 출력
    static void menuBookList() {
        System.out.println(">> 도서 목록\n"
                + "------------------------------------------------------------------------");
        for (int i = 0; i < bookList.length; i++) {		//행의 길이값보다 작다를 통해서 배열에 있는 값을 출력 ->StringBuilder이용하면 출력문을 좀더 간결하게 가능할듯
            String[] book = bookList[i];				
            System.out.println(book[0] + ", " + book[1] + ", " + book[2] + ", " + book[3] + ", " + book[4]);
        }
        System.out.println("------------------------------------------------------------------------");
    }

    //종료안내문 출력하는 메소드
    static void menuExit() {
        System.out.println("YoonWu Book Market을 종료합니다. ");
    }

    //장바구니 목록 출력
    static void menuCartList() {
        System.out.println(">> 장바구니 보기\n"
                + "------------------------------------------------------------------------");
        boolean cartEmpty = true;	//시작할때 장바구니가 비어있으니까 장바구니가 비어있는지 아닌지 나타내는 boolean형 변수를 true로 선언
        //static으로 선언된 cartList에서 값이 있으면 장바구니에 담긴 책이 있는거니까 cartEmpty에 false대입하고 cartList[i]에 있는 값이 장바구니에 있는 그 책의 권수니까 그 권수를 출력에 적용
        for (int i = 0; i < cartList.length; i++) {
            if (cartList[i] > 0) {
                cartEmpty = false;
                String[] book = bookList[i];
                System.out.println(cartList[i] + "권, " + book[0] + ", " + book[1] + ", " + book[2] + ", " + book[3] + ", " + book[4]);
            }
        }
        if (cartEmpty) {	//장바구니가 비어있으면 비었다고 알려줌
            System.out.println("장바구니가 비어 있습니다.");
        }
        System.out.println("------------------------------------------------------------------------");
    }

    //장바구니에 책 추가하는 메소드
    static void menuAddCartItem() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(">> 추가할 도서 ID 입력 : ");

        String bookID = br.readLine();
        boolean found = false;

        for (int i = 0; i < bookList.length; i++) {	// i값을 0부터 시작해서 이차원배열에서 i로 행을 바꾸는 for문 
            if (bookList[i][0].equals(bookID)) {	// 배열안의 내용과 bookID가 같은지 확인하는 조건문 equals가 아닌 ==을 사용하면 주소값이 될걸?
                // 장바구니에 추가
                cartList[i]++;						// 세종류의 책중 어떤 책이 추가됐는지 i값을 통해서 표현했으므로 그 위치의 배열값을 증가시킴
                numCartItem++;						// 책이 추가됐으니까 권수 증가
                found = true;						// 책이 추가됐는지 알려주는 boolean변수 found를 true로 바꿈
                System.out.println(">> 장바구니에 추가되었습니다.");
                break;
            }
        }

        if (!found) {								//found가 아니면 이라는 조건식 같은 의미로 found == false 랑 같은말
            System.out.println("없는 ID입니다. 도서 목록에 있는 ID를 입력하세요.");
        }
    }

    //장바구니에 담긴 내용을 초기화해주는 메소드
    static void menuClearCart() {
        for (int i = 0; i < cartList.length; i++) {
            cartList[i] = 0; // 장바구니 비우기
        }
        numCartItem = 0;	// 권수 초기화
        System.out.println(">> 장바구니에 있는 아이템을 모두 삭제하였습니다.");
    }
    
    //switch에서 case에 없는 번호를 입력받았을때 default에서 실행될 메소드
    static void menuWrongNumber() {
        System.out.println("없는 메뉴입니다. 0번부터 " + NUM_MENU + "번까지의 메뉴중에서 선택하세요");
     }
}
