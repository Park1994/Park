package com.atm;

import java.io.*;
public class Bank {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 계좌 객체 생성(이름을 매개변수로 가지고)
		Account na = new Account("가길동");
		
		String strWork;
		
		do {
			System.out.println("\n어떤 업무를 보시겠습니까?");
			System.out.println("================");
			System.out.println("   입           금   =====> 1");
			System.out.println("   출           금   =====> 2");
			System.out.println("   잔  액  조  회   =====> 3");
			System.out.println("   종           료   =====> 0");
			System.out.println("================");
			System.out.print("업 무 선 택: ");
			strWork = br.readLine();
			
			int n = 0;
			if(strWork != null) {
				n = Integer.parseInt(strWork);
			}
			else {
				System.out.println("작업을 선택하지 않았습니다. 입력해 주세요.");
				System.exit(0); // return; 과 같은 기능
			}
			
			switch(n) {
			case 0:
				System.out.println("ATM 업무를 종료합니다.");
				return;
			case 1: // 입금
				System.out.println("\n==============");
				System.out.print("입금할 금액 입력: ");
				String strdepositIn = br.readLine();
				long depositLong = Long.parseLong(strdepositIn);
				na.deposit(depositLong);
				System.out.println("\n==============");
				break;
			case 2: // 출금
				System.out.println("\n==============");
				System.out.print("출금할 금액 입력: ");
				String strwithdrawIn = br.readLine();
				long withdrawLong = Long.parseLong(strwithdrawIn);
				na.withdraw(withdrawLong);
				break;
			case 3: // 잔액 조회
				System.out.println(na.getName() + "님의 현재 계좌의 잔액은 " + na.getBalance() + "원 입니다.");
				break;
			default:
				System.out.println("업 무는 0 ~ 3 까지의 숫자만 입력 가능합니다.\n");
				break;
			}
		} while(!strWork.equals("0"));
		
	}

}
