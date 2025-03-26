package graph;

public class ColorGOFactory extends AbstractGOFactory {
	public static final Point DEFAULT_POINT = new Point(0,0); 	
	public static final Line DEFAULT_LINE = new Line(0, 0, 10, 10); 	
	
	@Override
	public Point createPoint() {
		Point p = DEFAULT_POINT.clone();
		Scene.instance.add(p); // hook
		return p;
	}

	@Override
	public Line createLine() {
		Line l = DEFAULT_LINE.clone();
		Scene.instance.add(l);
		return l; 
	}

	@Override
	public Circle createCircle() {
		Circle c = new Circle(0,0,1);
		Scene.instance.add(c);
		return c;
	}

}
