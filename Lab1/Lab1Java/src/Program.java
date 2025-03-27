import graph.AbstractGOFactory;
import graph.CalcSceneBuilder;
import graph.ColorGOFactory;
import graph.RealSceneBuilder;
import graph.Scene;

public class Program {

	public static void main(String[] args) {
		AbstractGOFactory gof = new ColorGOFactory();
		gof.createPoint().setColor("red");
		gof.createPoint().setColor("green");
		
		gof.createCircle().setColor("blue");
		gof.createLine().setColor("purple");
		
		Scene.instance.draw();

		var realBuilder = new RealSceneBuilder();
		realBuilder.reset();
		realBuilder.addPoints();
		realBuilder.addLines();
		realBuilder.addCircles();
		Scene.instance.draw();

		var calcBuilder = new CalcSceneBuilder();
		calcBuilder.reset();
		calcBuilder.addPoints();
		calcBuilder.addLines();
		calcBuilder.addCircles();
		calcBuilder.finish();
	}

}
