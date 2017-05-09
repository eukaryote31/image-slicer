package imageSlicer;

import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public class Slicer {
	private Slicer() {
		throw new AssertionError();
	}
	
	public static BufferedImage[] slice(BufferedImage img, int slices) {
		//TODO
		BufferedImage[] retn = new BufferedImage[slices];
		Raster r = img.getRaster();
		for(int i=0;i<slices;i++) {
			r.
		}
		
		return null;
	}
}
