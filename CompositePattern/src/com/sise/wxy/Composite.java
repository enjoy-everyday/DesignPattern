package com.sise.wxy;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
	
	private List<Component> components;
	
	public Composite() {
		components = new ArrayList<Component>();
	}

	@Override
	public void operation() {
		for(Component com : components) {
			com.operation();
		}
	}

	@Override
	public void add(Component component) {
		components.add(component);
	}

	@Override
	public void remove(Component component) {
		components.remove(component);
	}
	
}
