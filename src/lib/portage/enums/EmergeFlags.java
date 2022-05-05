package lib.portage.enums;

public enum EmergeFlags {
  UPDATE("--update", null, 0),
  QUIET("--quiet", "-q", 1),
  DEEP("--deep", null, 2),
  VERBOSE("--verbose", null, 3);
  public String flag;
  public String shortflag;
  public int flagId;
  EmergeFlags(String flag, String shortflag, int flagId){
	this.flag = flag;
    this.shortflag = shortflag;
    this.flagId = flagId;
  }
   
}
