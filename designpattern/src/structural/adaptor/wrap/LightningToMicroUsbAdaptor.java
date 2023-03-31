package structural.adaptor.wrap;

import structural.adaptor.phoneiface.Lightningphone;
import structural.adaptor.phoneiface.MicroUsbPhone;

public class LightningToMicroUsbAdaptor implements MicroUsbPhone {
	
    private Lightningphone lightningPhone ;

    public void LightningToMicroUsbAdapter(Lightningphone lightningPhone) {
        this.lightningPhone = lightningPhone;
    }

    @Override
    public void useMicroUsb() {
        System.out.println("MicroUsb connected");
        lightningPhone.useLightning();
    }

    @Override
    public void recharge() {
        lightningPhone.recharge();
    }


}
