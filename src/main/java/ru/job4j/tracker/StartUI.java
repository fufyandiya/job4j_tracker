package ru.job4j.tracker;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, UserAction[] userActions) {
        boolean run = true;
        while (run) {
            this.showMenu(userActions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= userActions.length) {
                out.println("Wrong input, you can select: 0 .. " + (userActions.length - 1));
                continue;
            }
            UserAction userAction = userActions[select];
            run = userAction.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] userActions) {
        out.println("Menu:");
        for (int index = 0; index < userActions.length; index++) {
            out.println(index + ". " + userActions[index].name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        UserAction[] userActions = {
                new CreateAction(output), new ShowAction(output), new EditAction(output),
                new DeleteAction(output), new FindIdsAction(output), new FindNamesAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(input, tracker, userActions);
    }
}
