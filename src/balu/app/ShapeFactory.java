package balu.app;

public class ShapeFactory 
{
 public static AbstShape getobj(ShapeTypes st)
 {
	 AbstShape shape=null;
	 if(ShapeTypes.CIR.equals(st))
	 {
		 shape=new Circle();
	 }
	 else if(ShapeTypes.SQR.equals(st))
	 {
		 shape=new Square();
	 }
	 else if(ShapeTypes.RECT.equals(st))
	 {
		 shape=new Rectangle();
	 }
	return shape;	 
 }
}
