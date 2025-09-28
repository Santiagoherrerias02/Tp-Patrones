package command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Command> comandos = new ArrayList<>();

    public void addCommand(Command c) {
        comandos.add(c);
    }

    public void run() {
        for (Command c : comandos) c.execute();
        comandos.clear();
    }
}