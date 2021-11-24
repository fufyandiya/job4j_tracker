package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker, UserAction[] userActions) {
        boolean run = true;
        while (run) {
            this.showMenu(userActions);
            int select = input.askInt("Select: ");
            UserAction userAction = userActions[select];
            run = userAction.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] userActions) {
        System.out.println("Menu.");
        for (int index = 0; index < userActions.length; index++) {
            System.out.println(index + ". " + userActions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] userActions = {
                new CreateAction(), new ShowAction(), new EditAction(),
                new DeleteAction(), new FindIdsAction(), new FindNamesAction(),
                new StopAction()
        };
        new StartUI().init(input, tracker, userActions);
    }
}
