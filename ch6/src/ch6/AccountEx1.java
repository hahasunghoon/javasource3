package ch6;

public class AccountEx1 {

	public static void main(String[] args) {
		Account account1 = new Account("110-10-10000", "홍길동", 1000);
		Account account2 = new Account("110-10-10003", "성춘향", 200000);
		
		//홍길동 계좌 입/출금 기능 사용 ==> 메소드 호출
		System.out.println(account1.owner);
		System.out.println("==========================");
		System.out.println("현재 잔액 "+account1.deposit(50000));
		System.out.println("현재 잔액 "+account1.withdraw(23000));
		
		System.out.println();
		//성춘향 계좌 입// 출금
		System.out.println(account1.owner);
		System.out.println("==========================");
		System.out.println("현재 잔액 : "+account2.deposit(30000));
		System.out.println("현재 잔액 : "+account2.withdraw(120000));
	}

}