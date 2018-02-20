
public class Circle extends Shape{

	
	void draw(){
		System.out.println("draw from circle");
	}
	
	void erase(){
		System.out.println("erase from circle");
	}
	
	
	public static void main(String[] args) {
		Shape cir = new Circle();
		cir.draw();
		cir.erase();

	}

}
