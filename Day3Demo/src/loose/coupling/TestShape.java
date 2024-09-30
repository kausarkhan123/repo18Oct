package loose.coupling;

public class TestShape {

	public static void main(String[] args) 
	{
		ShapeClass s=new ShapeClass();
		Shape shape=new Rectangle();//upcasting
		s.paint(shape);
	}

}
