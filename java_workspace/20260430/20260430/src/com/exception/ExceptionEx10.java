package com.exception;





public class ExceptionEx10 {
		
	//프로그램 설치 시작
	static void startInstall()throws SpaceException,MemoryException{
		if(enoughMemory())
		{
			throw new SpaceException("설치할 공간이 부족합니다.");
		}
		
		if(enoughMemory())
		{
			 throw new MemoryException("메모리 공간이 부족합니다.");
		}
	}
	//파일복사
	static void copyFiles() {
		
	}
	//임시 파일삭제
	static void deleteFiles() {
		
	}
	//설치하는데 필요한 공간이 있는지를 판단하는 코드
	static boolean enoughSpace() {
		return false;
	}
	//설치하는데 필요한 메모리 공간이 있는지를 판단하는 코드
	static boolean enoughMemory() {
		return true;
	}
	
	
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
			
		} catch (SpaceException se) {
			System.out.println("에러 메시지"+se.getMessage());
			se.printStackTrace();
			System.out.println("공간을 확보하신 후 다시 설치");
		} catch(MemoryException me) {
			System.out.println("에러 메시지" +me.getMessage());
			me.printStackTrace();
			System.gc();
			System.out.println("다시 설치를 하시기 바랍니다.");
		}finally {
			//파일의 프로그램 설치에 사용된 임시파일들을 삭제 처리한다.
			deleteFiles();
		}
	}
}
