package graph;

public class RealSceneBuilder implements SceneBuilder {
    private Scene scene = Scene.instance;

	@Override
    public void reset() {
        scene.clear();
    }
    @Override
	public void addPoints() {
        scene.add(new Point(1,1));
        scene.add(new Point(2,2));
    }
    @Override
	public void addLines() {
        scene.add(new Line(1,1,2,2));
    }
    @Override
	public void addCircles() {
        scene.add(new Circle(1,1,5));
    }
    @Override
	public void finish() {
        scene.draw();
    }
}
