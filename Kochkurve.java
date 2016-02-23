public class Kochkurve {

	static void kochkurve(Staffelei s, int ordnung) {
		if(ordnung == 0){
			s.drawForward(10);
		}
		else{
			kochkurve(s,ordnung-1);
			s.rotate(-60);
			kochkurve(s,ordnung-1);
			s.rotate(120);
			kochkurve(s,ordnung-1);
			s.rotate(-60);
			kochkurve(s,ordnung-1);
			}
	}
	public static void main(String[] args) {
		Staffelei s = new Staffelei();
		s.rotate(-90);
		kochkurve(s, 3);
		s.rotate(120);
		kochkurve(s, 3);
		s.rotate(120);
		kochkurve(s, 3);
		System.out.printf("test");
        System.out.printf("test2");
		
	}
}
