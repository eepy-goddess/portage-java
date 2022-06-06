package lib.portage.enums;

import lib.portage.Main;
import lib.portage.package_management.flags.*;

public enum EmergeFlags {
  UPDATE("--update", "-u", 0, Main.flags.add(new Update())),
  QUIET("--quiet", "-q", 1, Main.flags.add(new Quiet())),
  DEEP("--deep", "-D", 2, Main.flags.add(new Deep())),
  VERBOSE("--verbose", "-v", 3, Main.flags.add(new Verbose())),
  HELP("--help", null, 4, Main.flags.add(new Help()));
  public final String flag;
  public final String shortflag;
  public final int flagId;
  EmergeFlags(String flag, String shortflag, int flagId, boolean listadd){
	this.flag = flag;
    this.shortflag = shortflag;
    this.flagId = flagId;
  }
   
}
