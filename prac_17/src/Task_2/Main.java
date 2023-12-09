package Task_2;

public class Main {
    public static void main(String[] args) {
        Employee model = new Employee("Someone Unknown", 20.0, 140);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();

        controller.setEmployeeHourlyRate(25.0);
        controller.updateView();
    }
}