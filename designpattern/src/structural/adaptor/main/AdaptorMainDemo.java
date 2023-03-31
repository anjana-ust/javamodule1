package structural.adaptor.main;

import structural.adaptor.phoneiface.Lightningphone;
import structural.adaptor.phoneiface.MicroUsbPhone;
import structural.adaptor.phoneimp.Android;
import structural.adaptor.phoneimp.Iphone;

public class AdaptorMainDemo {
	public static void rechargeMicroUsbPhone(MicroUsbPhone phone) {
		phone.useMicroUsb();
		phone.recharge();
	}

	public static void rechargeLightningPhone(Lightningphone phone) {
		phone.useLightning();
		phone.recharge();
	}

	public static void main(String[] args) {
		Android android = new Android();
		Iphone iPhone = new Iphone();
		
		boolean result = android instanceof MicroUsbPhone;
		System.out.println(result);
		
}
}