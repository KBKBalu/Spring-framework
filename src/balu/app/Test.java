package balu.app;

public class Test 
{
public static void main(String[] args) 
{
	//added code
	AbstShape s=ShapeFactory.getobj(ShapeTypes.CIR);
	s.SetArea(500);
	s.draw();
}
}
