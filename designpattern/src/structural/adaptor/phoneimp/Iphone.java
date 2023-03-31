package structural.adaptor.phoneimp;

import structural.adaptor.phoneiface.Lightningphone;

public class Iphone implements Lightningphone {
	private boolean connector;

	@Override
	public void recharge() {
		if(connector) {
			System.out.println("lightinging started");
			System.out.println("lightning stoped");
		}else {
			System.out.println("connect microusb first");


	}
	}

	@Override
	public void useLightning() {
		connector= true;
		
		
		System.out.println("Lighting connected");
	}

}
