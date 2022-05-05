package lib.portage.interfaces;
import lib.portage.package_management.EmergePackage;


public interface FlagFeature {
  public int flagId();
  /**
   * 
   * @return returns true if portage can move on to the next flag, exits program if false*/
  public boolean deployFlag(EmergePackage packag);
}
