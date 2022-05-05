package lib.portage.enums;

import lib.portage.Main;
import lib.portage.package_management.flags.Deep;
import lib.portage.package_management.flags.Quiet;
import lib.portage.package_management.flags.Update;
import lib.portage.package_management.flags.Verbose;

public enum EmergeFlags {
  UPDATE("--update", "-u", 0, Main.flags.add(new Update())),
  QUIET("--quiet", "-q", 1, Main.flags.add(new Quiet())),
  DEEP("--deep", "-D", 2, Main.flags.add(new Deep())),
  VERBOSE("--verbose", "-v", 3, Main.flags.add(new Verbose()));
  public String flag;
  public String shortflag;
  public int flagId;
  EmergeFlags(String flag, String shortflag, int flagId, boolean listadd){
	this.flag = flag;
    this.shortflag = shortflag;
    this.flagId = flagId;
  }
   
}
