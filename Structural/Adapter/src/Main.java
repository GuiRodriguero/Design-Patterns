public class Main {
    public static void main(String[] args) {
        //Usando ClassAdapter
        EmployeeClassAdapter classAdapter = new EmployeeClassAdapter();
        populateEmployee(classAdapter);
        BussinessCardDesigner designer = new BussinessCardDesigner();
        String card = designer.designCard(classAdapter);
        System.out.println(card);

        System.out.println("\n\n");

        //Usando ObjectAdapter
        Employee employee = new Employee();
        populateEmployee(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        String card2 = designer.designCard(objectAdapter);
        System.out.println(card2);
    }

    public static void populateEmployee(Employee employee){
        employee.setFullName("Guilherme Rodriguero");
        employee.setJobTitle("Dev");
        employee.setOfficeLocation("SP");
    }
}
