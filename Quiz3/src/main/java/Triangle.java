
public class Triangle extends GeometricObject {
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle(){
		//default
	}

	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	/**
	 * Returns side 1 as a double.
	 */
	public double getSide1(){
		return(this.side1);
	}
	/**
	 * Returns side 2 as a double.
	 * 
	 */
	public double getSide2(){
		return(this.side2);
	}
	/**
	 * Returns side 3 as a double.
	 */
	public double getSide3(){
		return(this.side3);
	}
	
	/**
	 * Returns the area of the triangle.
	 */
	public double getArea() {
		double side1sq = getSide1()*getSide1();
		double side2sq = getSide2()*getSide2();
		double side3sq = getSide3()*getSide3();
		
		double s = getPerimeter()/2;
		double area = Math.sqrt(s*(s-getSide1())*(s-getSide2())*(s-getSide3()));
		
//		double height = side2sq-((side2sq-side3sq+side1sq)/(getSide1()*2));
//		height = Math.sqrt(height);
//		double area = (getSide1()*height)/2.0;
		
		return(area);
	}
	
	/**
	 * Returns the perimeter of the triangle.
	 */
	public double getPerimeter() {
		return(getSide1()+getSide2()+getSide3());
	}
	
	/**
	 * Returns a String of information about the triangle.
	 */
	public String toString(){
		return("This triangle has sides of length "+this.side1+", "+this.side2+", and "+this.side3+".\nThe perimeter is "+getPerimeter()+" and the area is "+getArea()+" .");
	}
}
