package com.kh.library.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.library.controller.BookController;
import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

public class LibraryRun {

	public static void main(String[] args) {// 소장책 DB
		
//		LibraryRun r = new LibraryRun();
//		r.printBooks(null);
		ArrayList<Book> bList = new ArrayList<>();
		
		{
		// 생성 DB
		bList.add(new Book("100", "잃어버린 주원이를 찾아서", "저자 고경원", "상호 출판사", 8500, "『유정스』, 『르 몽드』 선정 20세기 최고의 책"));
		bList.add(new Book("101", "현우의 자서전", "지완이가 옮김", "빛나는 현수출판사", 8500, "영화배우 민병진이 추천한 젊음에 바치는 영혼의 자서전"));
		bList.add(new Magazine("102", "박경훈 과학동아", "편집부 박용진 선생", "혜수 사이언스", 8500, "관우의 유튜브에 소개된 과학만화 잡지", 2023,3));
		bList.add(new Book("103", "관현이의 코딩스쿨", "코딩천재 윤재성", "정묵이네 동네", 9900, "제 13회 래언이가 주는 문학상 수상작"));
		bList.add(new Magazine("104", "수진이와 지영이의 여행일기", "서울대 이승준 교수", "시연21", 3800, "영화감독 이원종pd가 집필한 영화 전문 잡지", 2023, 4));
		bList.add(new Magazine("105", "호연이의 OOTD", "인플루언서 장희주", "유리네 책방", 12000, "핫가이 조대현의 샤라웃을 받은 잡지", 2022,11));
		bList.add(new Book("106", "조준하의 미라클모닝", "샤이걸 성윤찡", "연우 출판사", 6300, "용석이도 2번이나 성공한 미라클모닝"));
		bList.add(new Book("107", "민정이의 백만가지 요리레시피", "제주도에서 온 상원이", "우리반 출판사", 6300, "제주에서 밥해먹고 사는 일상"));
		}
		
		printBooks(bList);

	}

	public static void printBooks(ArrayList<Book> bs) {
		// 여기서 메뉴열고 구현 시작
		
		BookController bc = new BookController();
		
		for(Book b : bs) {
			System.out.println(b);
			bc.addBook(b);
		}
		
		boolean flag = true; // 메뉴 스위치

		while (flag == true) { // 메뉴 스위치가 켜져있는 동안 무한반복
			System.out.println("===============================");
			System.out.println("KH 우리반전용 도서관 관리 페이지입니다.");
			System.out.println("1. 조회하기");
			System.out.println("2. 추가하기");
			System.out.println("3. 책 찾기");
			System.out.println("4. 전체책 가격 합계 및 평균 조회");
			System.out.println("5. 프로그램 종료");
			System.out.println("===============================");

			Scanner sc = new Scanner(System.in);
			System.out.print("메뉴번호를 입력해주세요 : ");
			int menu = sc.nextInt(); // 메뉴 번호 입력
			sc.nextLine();
			
			switch (menu) {
			case 1: // 1. 조회하기
				System.out.println("===============================");
				System.out.println("어떤 방법으로 책을 조회하겠습니까?");
				System.out.println("1. 도서관 전체 소장책 조회하기");
				System.out.println("2. 일반도서만 조회하기(잡지 제외)");
				System.out.println("3. 잡지만 조회하기(일반도서 제외)");
				System.out.println("4. 이전으로");
				System.out.println("===============================");


				System.out.print("메뉴번호를 입력해주세요 : ");
				int search = sc.nextInt();
				sc.nextLine();
				
				if (search == 1) {
					ArrayList<Book> bList = bc.getAllBook();

					for (int i = 0; i < bList.size(); i++) {
						System.out.println(bList.get(i));
					}

				}
				else if (search == 2) {
					ArrayList<Book> temp = bc.onlySearchBook();
					for(int i = 0; i < temp.size(); i++) {
						System.out.println(temp.get(i));
					}
				}
				else if (search == 3) {
					ArrayList<Book> temp = bc.onlySearchMagazine();
					for(int i = 0; i < temp.size(); i++) {
						System.out.println(temp.get(i));
					}
					
				}
				else if (search == 4) {
					// 이전으로 가야함
					flag = true;
					break;
				}
				break;
				
				
				
			case 2: // 2. 추가하기
				
				System.out.print("bNo을 입력하세요 : ");
				String bNo = sc.nextLine();
				
				System.out.print("책 제목을 입력하세요 : ");
				String title = sc.nextLine();
				
				System.out.print("작가를 입력하세요 : ");
				String author  = sc.nextLine();
				
				System.out.print("출판사를 입력하세요 : ");
				String publisher = sc.nextLine();
				
				System.out.print("가격을 입력하세요 : ");
				int price = sc.nextInt();
				
				sc.nextLine();
				
				System.out.print("간단한 설명을 입력하세요 : ");
				String description = sc.nextLine();
				
				System.out.print("일반도서이면 true, 잡지이면 false를 입력하세요 : ");
				Boolean bkOrMaga = sc.nextBoolean();
				
				if (bkOrMaga.equals(true)) {
					bc.addBook(new Book(bNo, title, author, publisher, price, description));
				} else if (bkOrMaga.equals(false)) {
					System.out.print("출간연도를 입력하세요 : ");
					int year = sc.nextInt();
					sc.nextLine();
					System.out.print("출간월을 입력하세요 : ");
					int month = sc.nextInt();
					sc.nextLine();
					bc.addBook(new Magazine(bNo, title, author, publisher, price, description, year, month));
				}

				break;
				
			case 3:// 3. 책 찾기
				System.out.println("===============================");
				System.out.println("어떤 방법으로 책을 찾겠습니까?");
				System.out.println("1. bNo으로 책 찾기");
				System.out.println("2. 책 제목으로 책 찾기");
				System.out.println("3. 출간연도로 잡지 찾기");
				System.out.println("4. 출판사로 책 찾기");
				System.out.println("5. 특정 가격 밑으로 책 찾기");
				System.out.println("6. 이전으로");
				System.out.println("===============================");
				System.out.print("메뉴번호를 입력해주세요 : ");
				search = sc.nextInt();
				sc.nextLine();

				if (search == 1) { // bNo으로 책 찾기
					System.out.print("bNo을 입력하세요 : ");
					bNo = sc.nextLine();
					System.out.println(bc.searchBookBybNo(bNo)); // null 이거나 책 한권
					
					
				} else if (search == 2) { // 책 제목으로 책 찾기
					System.out.print("책 제목을 입력하세요 : ");
					title = sc.nextLine();
					ArrayList<Book> temp = bc.searchBookByTitle(title);
					System.out.println(temp);
					
				} else if (search == 3) { // 출간연도로 잡지 찾기
					System.out.print("출간연도를 입력하세요 : (올해 --> 2022) : ");
					int year = sc.nextInt();
					sc.nextLine();
					ArrayList<Book> temp = bc.magazineOfThisYearInfo(year);
					System.out.println(temp);
					
				} else if (search == 4) { // 4. 출판사로 책 찾기
					System.out.print("출판사를 입력하세요 : ");
					publisher = sc.nextLine();
					ArrayList<Book> temp = bc.searchBookByPublisher(publisher);
					System.out.println(temp);
				} else if (search == 5) { // 5. 특정 가격 밑으로 책 찾기
					System.out.print("가격을 입력하세요 : ");
					price = sc.nextInt();
					sc.nextLine();
					System.out.println(bc.searchBookByPrice(price));
					//
				} else if (search == 6)
					flag = true; // 6. 이전으로
				else
					System.out.println("잘못 입력하셨습니다.");
				
				break;
				
			case 4:// 4. 전체책 가격 합계 및 평균 조회
				System.out.print("전체책 가격 합계 : " );
				System.out.println(bc.getTotalPrice());
				
				System.out.print("전체책 가격 평균 : " );
				System.out.println(bc.getAvgPrice());
				break;
				
			case 5: 
				System.out.println("프로그램을 종료합니다");
				return;
			default:
				break;
			}
		}
	}
}
