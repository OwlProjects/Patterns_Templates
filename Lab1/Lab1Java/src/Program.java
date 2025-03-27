import graph.AbstractGOFactory;
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
		
		new RealSceneBuilder();

		Scene.instance.draw();

	}

}
