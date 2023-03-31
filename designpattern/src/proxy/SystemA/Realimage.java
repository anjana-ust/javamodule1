package proxy.SystemA;

import proxy.iface.Image;

public class Realimage implements Image{
	private final String filename;

	public Realimage(String filename) {
		super();
		this.filename = filename;
		loadImageFromDisk();
	}

	private void loadImageFromDisk() {
		
		System.out.println("Loading ...... "+filename);
	}

	
	public void showImage() {
		
		System.out.println("Dispalying Image..... "+filename);
	}

}
