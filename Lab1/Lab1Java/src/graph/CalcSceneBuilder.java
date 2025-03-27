package graph;

public class CalcSceneBuilder  implements SceneBuilder {
    private final Scene scene = Scene.instance;
    private int size;

	@Override
    public void reset() {
        scene.clear();
    }
    @Override
	public void addPoints() {
        scene.add(new Point(1,1));
        scene.add(new Point(2,2));
        size = 2;
    }
    @Override
	public void addLines() {
        scene.add(new Line(1,1,2,2));
        size++;
    }
    @Override
	public void addCircles() {
        scene.add(new Circle(1,1,5));
        size++;
    }
    @Override
	public void finish() {
        System.out.printf("Scene size: %d objects", size);
    }
}
