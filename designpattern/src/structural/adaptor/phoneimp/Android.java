package structural.adaptor.phoneimp;

import structural.adaptor.phoneiface.MicroUsbPhone;

public class Android implements MicroUsbPhone {
	public boolean connector;

	@Override
	public void recharge() {
		if(connector) {
			System.out.println("Recharging started");
			System.out.println("Recharging stoped");
		}else {
			System.out.println("connect microusb first");

	}
	}

	

	@Override
	public void useMicroUsb() {
		// TODO Auto-generated method stub
		connector=true;
		
		System.out.println("Microusb connected");
		
	}

}
