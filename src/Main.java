public class Main {
    public static void main(String[] args) {
        // Initializing Employee.
        Employee employee = new Employee();

        // Assigning name, age, phone number, address and salary to employee.
        employee.setName("John Mathews");
        employee.setAge(28);
        employee.setSalary(45000.0);
        employee.setPhoneNumber("(+1) 3452-24556");
        employee.setAddress("245 Ohio Drive");

        // Setting specialization for employee.
        employee.setSpecialization("Application Developer Associate");

        // Prints information about employee.
        System.out.println("Employee Details\n-----------");
        printDetails(employee);
        System.out.println("Specialization = " + employee.getSpecialization());

        // Divider
        System.out.println();

        // Initializing Manager.
        Manager manager = new Manager();

        // Assigning name, age, phone number, address and salary to manager.
        manager.setName("Carl Jackson");
        manager.setAge(37);
        manager.setSalary(110000.0);
        manager.setPhoneNumber("(+1) 6542-42345");
        manager.setAddress("112 Indiana Block 4");

        // Setting department for manager.
        manager.setDepartment("Sales");

        // Prints information about manager.
        System.out.println("Manager Details\n-----------");
        printDetails(manager);
        System.out.println("Department = " + manager.getDepartment());
    }

    /**
     * Prints details of a Member.
     */
    public static void printDetails(Member member) {
        System.out.println("Name = " + member.getName());
        System.out.println("Age = " + member.getAge());
        System.out.println("Phone Number = " + member.getPhoneNumber());
        System.out.println("Address = " + member.getAddress());
        member.printSalary();
    }
}