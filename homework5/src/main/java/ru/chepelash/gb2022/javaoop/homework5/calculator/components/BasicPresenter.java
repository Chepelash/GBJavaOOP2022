package ru.chepelash.gb2022.javaoop.homework5.calculator.components;

public class BasicPresenter implements Presenter{
    private final View view;

    private final Model model;

    public BasicPresenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void showMenu() {
        view.printString("Calculator can do maths!");
        view.printString("Enter 'math' to do math, 'q' to quit");
    }

    @Override
    public void executeOperation() throws NumberFormatException, IllegalArgumentException, ArithmeticException {
        try {
            model.setFirst(Integer.parseInt(view.getInput("Input first value > ")));
            model.setSecond(Integer.parseInt(view.getInput("Input second value > ")));
        } catch (NumberFormatException e){
            view.printString(String.format("%s: %s", "Error in inputs", e.getMessage()));
            return;
        }
        OperationEnum operation;
        try {
             operation = OperationEnum.convertFromString(view.getInput("Input an operation > "));
        } catch (IllegalArgumentException e) {
            view.printString(String.format("%s: %s", "Error in operation", e.getMessage()));
            return;
        }
        Number result;
        switch (operation){
            case SUM:
                result = model.getSum();
                break;
            case DIFF:
                result = model.getDiff();
                break;
            case DIVISION:
                try {
                    result = model.getDivision();
                } catch (ArithmeticException e) {
                    view.printString(e.getMessage());
                    return;
                }
                break;
            case MULTIPLY:
                result = model.getMultiply();
                break;
            default:
                result = 0;
        }
        view.printString(String.format("Result: %d %s %d = %s", model.getFirst(),operation.label,
                model.getSecond(), result));
    }
}
