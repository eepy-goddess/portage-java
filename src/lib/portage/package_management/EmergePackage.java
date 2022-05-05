package lib.portage.package_management;

public class EmergePackage {
  private String path;
  private boolean verbose_mode = true;
  public EmergePackage(String path) {
    this.path = path;
    
  }
  /**
   * IMPORTANT: do NOT use this method for setting the path of the package,
   * must only be used if the user specified the name but not the package category*/
  public EmergePackage setPath(String path) {
	  this.path = path;
	  return this;
  }
  public String getPath() {
	  return this.path;
  }
  public EmergePackage setVerboseMode(boolean verbose) {
	  this.verbose_mode = verbose;
	  return this;
  }
  public boolean getVerboseMode() {
	  return this.verbose_mode;
  }
}
