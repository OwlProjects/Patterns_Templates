package graph;

public class Line extends GraphObject {
    private Coords point1;
    private Coords point2;

    public Line(int x1, int y1, int x2, int y2, String color) {
        super(color);
        point1 = new Coords(x1, y1);
        point2 = new Coords(x2, y2);
    }

    public Line(int x1, int y1, int x2, int y2) {
        this(x1, y1, x2, y2, DEFAULT_COLOR);
    }

    public Line(Coords point1, Coords point2, String color) {
        super(color);
        this.point1 = point1;
        this.point2 = point2;
    }

    public Line(Coords point1, Coords point2) {
        this(point1, point2, DEFAULT_COLOR);
    }

    public Line(Line l) {
        this(l.getPoint1(), l.getPoint2(), l.getColor());
    }

    public int getX1() {
		return point1.getX();
	}

	public void setX1(int x) {
		point1.setX(x);
	}

	public int getY1() {
		return point1.getY();
	}

	public void setY1(int y) {
		point1.setY(y);
	}
    
    public int getX2() {
		return point2.getX();
	}

	public void setX2(int x) {
		point2.setX(x);
	}

	public int getY2() {
		return point2.getY();
	}

	public void setY2(int y) {
		point2.setY(y);
	}

    public Coords getPoint1() {
        return point1;
    }

    public Coords getPoint2() {
        return point2;
    }

    @Override 
    public Line clone() {
        return new Line(this);
    }

    @Override
    public void draw() {
        System.out.printf("Line ([%d, %d], [%d, %d]) %s\n", getX1(), getY1(), getX2(), getY2(), getColor());
    }


}
