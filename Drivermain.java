public class Drivermain {
    
        public static void main(String[] args) {
            // Accept employee information from user
            System.out.println("Enter employee ID:");
            int empId = Integer.parseInt(System.console().readLine());
            System.out.println("Enter employee name:");
            String name = System.console().readLine();
            System.out.println("Enter employee salary:");
            double salary = Double.parseDouble(System.console().readLine());
    
            Employee employee = new Employee(empId, name, salary);
            System.out.println("Income Tax: " + employee.calcTax());
    
            // Accept product information from user
            System.out.println("Enter product ID:");
            int pid = Integer.parseInt(System.console().readLine());
            System.out.println("Enter product price:");
            double price = Double.parseDouble(System.console().readLine());
            System.out.println("Enter product quantity:");
            int quantity = Integer.parseInt(System.console().readLine());
    
            Product product = new Product(pid, price, quantity);
            System.out.println("Sales Tax: " + product.calcTax());
        }
    }
    
    

