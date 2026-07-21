
public class Student {
	int hakbun;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave;
	String grade;
	
	Student(){}
	
	Student(int hakbun,String name, int kor, int eng, int mat){
		this.hakbun=hakbun;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		
		
	}
	//총점, 평균, 학점을 구하는 메소드 구현
	void cal() {
		tot=kor+mat+eng;
		ave=tot/3.;
	}
	//학점을 구하여 반환하는 메소드
	String getGrade() {
		if(ave>=90) {
			grade = "A";
		}else if(ave>=80) {
			grade = "B";
		}else if(ave>=70) {
			grade = "C";
		}else if(ave>=60) {
			grade = "D";
		}else {
			grade = "F";							
		}
		return grade;
	}
}