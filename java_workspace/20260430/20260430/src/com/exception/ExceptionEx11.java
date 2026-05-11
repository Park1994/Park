package com.exception;

public class ExceptionEx11 {
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
	
	static void install() throws InstallException, MemoryException{
		try {
			startInstall();
			copyFiles();
			
		} catch (SpaceException se) {
			InstallException ie = new InstallException("설치중 예외 발생");
			ie.initCause(se);//지정한 예외를 원인 예외로 등록시켜서 원인 예외를 반환
			throw ie;
			
		}catch(MemoryException me) {
			InstallException ie = new InstallException("설치중 예외 발생");
			ie.initCause(me);
			throw ie;
		}finally {
			deleteFiles();
		}
	}
	public static void main(String[] args) throws MemoryException {

		try {
			install();
		}catch (InstallException ee) {
			ee.printStackTrace();
		} 
	}
}
