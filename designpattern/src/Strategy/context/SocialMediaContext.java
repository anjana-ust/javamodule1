package Strategy.context;

import Strategy.iface.IsocialMedia;

public class SocialMediaContext {
	IsocialMedia smStrategy;
	 
	  public void setSocialmediaStrategy(IsocialMedia smStrategy) 
	  {
	    this.smStrategy = smStrategy;
	  }
	 
	  public void connect(String name) 
	  {
	    smStrategy.connectTo(name);
	  }


}
