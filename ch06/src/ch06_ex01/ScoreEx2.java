package ch06_ex01;

class Score2 {		
	int kor, eng, math;			// 과목별 인스턴스 변수를 선언해준다.

	Score2(int k, int e, int m) {
		kor = k;		// 인스턴스 변수 = 매개변수
		eng = e;
		math = m;
	}

	void print() {
		int sum = kor + eng + math;
		System.out.print("국어: " + kor + "영어: " + eng + "수학: " + math + "\t");
		System.out.println("합계: " + sum + "평균: " + sum / 3);
	}
}

public class ScoreEx2 {

	public static void main(String[] args) {
		Score2 sc1 = new Score2(78, 88, 97);
		Score2 sc2 = new Score2(88, 98, 96);
		sc1.print();
		sc2.print();

	}

}
