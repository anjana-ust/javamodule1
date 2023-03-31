package Strategy.impl;

import Strategy.iface.IsocialMedia;

public class FacebookStrategy implements IsocialMedia {
	public void connectTo(String friendName) 
	  {
	    System.out.println(
	    		"Connecting with " + friendName + " through Facebook");
	  }

}
