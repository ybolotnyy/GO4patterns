package GoFpatterns.Behavioral.Command.Receivers;

import GoFpatterns.Behavioral.Command.Commands.Command;

public class Invoker {
  private Command[] commands;
  int position;
  String name;

  public Invoker(String n) {
    name = n;
    commands = new Command[12];
    position = 0;
  }

  public void addCommand(Command c) {
    commands[position++] = c;
  }

  public void listCommands() {
    System.out.print("List of commands: ");

    for (Command c : commands) {
      if (c != null) {
        System.out.printf("%s ", c.getClass().getSimpleName());
      }
    }
  }

  public void run() {
    System.out.printf("\n\n  Invoking '%s' operation.... \n\n", name);
    for (Command c : commands) {
      if (c != null) {
        c.execute();
      }
    }
  }
}
