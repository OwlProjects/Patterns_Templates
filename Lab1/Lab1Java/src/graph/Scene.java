package graph;

import java.util.ArrayList;
import java.util.List;

public class Scene {
	private final List<GraphObject> objects ;
	public static final Scene instance = new Scene();
	
	private Scene() {
		objects = new ArrayList<>();
	}
	
	public void add(GraphObject o) {
		objects.add(o);
	} 
	
	public void clear() {
		objects.clear();
	}
	
	public void draw() {
		for(GraphObject g : objects)
			g.draw();
	}
	

}
