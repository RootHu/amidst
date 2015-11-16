package amidst.map.layers;

import amidst.Options;
import amidst.map.Fragment;
import amidst.map.IconLayer;

public class TempleLayer extends IconLayer {
	private TempleFinder finder = new TempleFinder();

	@Override
	public boolean isVisible() {
		return Options.instance.showTemples.get();
	}

	@Override
	public void generateMapObjects(Fragment fragment) {
		finder.generateMapObjects(Options.instance.seed, this, fragment);
	}
}
