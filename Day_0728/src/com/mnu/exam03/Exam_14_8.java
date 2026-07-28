	package com.mnu.exam03;
	
	public class Exam_14_8 {
		public static void main(String[] args) {
			String str1 = String.valueOf(true);
			String str2 = String.valueOf('a');
			
			System.out.println(str1);
			System.out.println(str2);
			
			int userCode = 1029481;

			// 숫자를 문자열로 변환!
			String codeStr = String.valueOf(userCode);

			// 이제 문자열 메소드로 자릿수 체크가 가능해집니다.
			System.out.println("코드 자릿수: " + codeStr.length()); // 출력: 7

			// 특정 자리의 숫자를 뽑아낼 수도 있습니다.
			System.out.println("첫번째 숫자: " + codeStr.charAt(0));  // 출력: 1
		}
		
	
	}
