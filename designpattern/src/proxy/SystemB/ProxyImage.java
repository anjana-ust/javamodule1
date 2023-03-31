package proxy.SystemB;

import proxy.SystemA.Realimage;
import proxy.iface.Image;

public class ProxyImage implements Image {
	private final String filename;
	private Realimage image;

	public ProxyImage(String filename) {
		this.filename = filename;
	}

	public void showImage() {
		
		if (image == null) {
			image = new Realimage(filename);
		}
		image.showImage();
	}

}
