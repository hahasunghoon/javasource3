package poly;

public class CarEx {

	public static void main(String[] args) {
		
//		Car car1 = new FireEngine();
//		Car  car2 = new Ambulance();
		//왼쪽 부모 / 오른쪽 자식 생각하자
		Car car = null;
		
		FireEngine fireEngine = new FireEngine();
		FireEngine fireEngine2 = null;
		
		fireEngine.water();
		car = fireEngine; // Car car = new FireEngine();
		
		fireEngine2 = (FireEngine) car; // 무조건 강제 형변환 () 하자
		fireEngine2.water();
		
//		FireEngine fe =(FireEngine) new Car();  // new Car(); 했을때 밑줄나오는데 cast하자
//		fe.drive();
		
//		FireEngine fe = new Ambulance(); 
		
		
		
		
		

	}

}
