package GoFpatterns.Creational.Builder.Interfaces;

import java.util.ArrayList;

public interface RobotBuildable {
  public enum actionType {
    findParts,
    assembleIt,
    switchOn,
    switchOff,
    testIt
  }

  public void go();
}
