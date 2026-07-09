
public class Exam_09 {
	public static void main(String[] args) {
		double tmp = 365.2422;
		int day = 0,hour = 0, min = 0,sec = 0;
		System.out.printf("1년은 %.4f일 이다.\n",tmp);
		
		//(int)tmp =365를 대입한다
		day = (int)tmp;
		tmp -= day; //day는 365일, tmp에 나머지 값인 0.2422일을 대입
		hour = (int)(tmp*24); // 1일은 24시간이므로 tmp(0.2422일)에 24시간/1일을 곱해준다
		
		tmp = (tmp*24)-hour;
		min = (int)(tmp*60);
		
		tmp=(tmp*60)-min;
		sec=(int)(tmp*60);
		
		System.out.printf("%d일 %d시 %d분 %d초\n",day,hour,min,sec);
		
				
		

	}

}
