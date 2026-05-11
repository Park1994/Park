package com.forextwo;

public class ForTwoEx03 {

	public static void main(String[] args) {
		
		for(int x = 0; x <= 2; x++) {
			for(int i = 1; i <= 9; i++) { // 단
				for(int j = 2; j <= 9; j++) { // 안쪽: 1 ~ 9
					if(j >= x * 3 + 2 && j <= x * 3 + 4) {
						System.out.printf("%d * %d = %3d \t", j, i, i * j);
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

