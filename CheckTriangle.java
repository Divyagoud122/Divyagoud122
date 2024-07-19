package labprgms2;

public class CheckTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double firstAngle =60;
		double secondAngle=60;
		double thirdAngle=120;
		double totalAngle =firstAngle+secondAngle+thirdAngle;
		if(totalAngle==180) {
			System.out.println("It is a Triangle");
		}
		else {
			System.out.println("It is not a Triangle");
		}

	}

}
