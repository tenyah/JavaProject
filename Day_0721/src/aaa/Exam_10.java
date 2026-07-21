	package aaa;
	
	public class Exam_10 {
	
		public static void main(String[] args) {
			//키보드 입력
			int hak = 1101;
			String name = "홍길동";
			boolean gender = true;
			int age = 22;
			int kor = 90;
			int eng = 80;
			int mat = 70;
			
			
			Student stu1 = new Student();
			stu1.setHak(1101);
			stu1.setName("홍");
			stu1.setGender(true);
			stu1.setAge(22);
			stu1.setKor(90);
			stu1.setEng(80);
			stu1.setMat(70);
			
			Student stu2 = new Student(1102,"이사람",false,30,77,88,99);
			
			
			
			
			
			//초기화
			
			
			int tot = stu1.getKor() + stu1.getEng() + stu1.getMat();
			double ave = tot / 3.;
			
			int tot2 = stu2.getKor() + stu2.getEng() + stu2.getMat();
			double ave2 = tot / 3.;
			
			
			//출력
			//학번   이름   성별   나이   국어   영어   수학   총점   평균
			System.out.println("학번\t이름\t성별\t나이\t국어\t영어\t수학\t총점\t평균");
			System.out.print(stu1.getHak() + "\t");
			System.out.print(stu1.getName() + "\t");
			if(stu1.isGender()==true) {
				System.out.print("남\t");
			}else {
				System.out.print("여\t");
			}
			/* String str = "여자"
			 * if(stu1.isGender())
			 * 		str="남자"
			 * 
			 */
			System.out.print(stu1.getAge() + "\t");
			System.out.print(stu1.getKor() + "\t");
			System.out.print(stu1.getEng() + "\t");
			System.out.print(stu1.getMat() + "\t");
			System.out.print(tot + "\t");
			System.out.printf("%.2f" , ave);
			System.out.print("\n");
			
			
			
			System.out.println("학번\t이름\t성별\t나이\t국어\t영어\t수학\t총점\t평균");
			System.out.print(stu2.getHak() + "\t");
			System.out.print(stu2.getName() + "\t");
			if(stu2.isGender()==true) {
				System.out.print("남\t");
			}else {
				System.out.print("여\t");
			}
			System.out.print(stu2.getAge() + "\t");
			System.out.print(stu2.getKor() + "\t");
			System.out.print(stu2.getEng() + "\t");
			System.out.print(stu2.getMat() + "\t");
			System.out.print(tot2 + "\t");
			System.out.printf("%.2f" , ave2);
		}
	
	}
