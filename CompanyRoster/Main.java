package CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Map<String,List<Employee>> map = new LinkedHashMap<>();
        for (int i = 1; i <= n ; i++) {
            Employee employee = null;
            String [] info = scan.nextLine().split("\\s+");
            String name = info[0];
            double salary = Double.parseDouble(info[1]);
            String position = info[2];
            String department = info[3];
            if(info.length == 4) {
                employee = new Employee(name,salary,position,department);
            }else
            if(info.length == 5) {
                if (info[4].contains("@")) {
                    String email = info[4];
                    employee = new Employee(name,salary,position,department,email);
                } else {
                    int age = Integer.parseInt(info[4]);
                    employee = new Employee(name,salary,position,department,age);
                }
            }else
            if(info.length == 6){
                String email = info[4];
                int age = Integer.parseInt(info[5]);
                employee = new Employee(name,salary,position,department,email,age);

            }
            if(!map.containsKey(department)){
                map.put(department,new ArrayList<>());
                map.get(department).add(employee);
            }else{
                map.get(department).add(employee);
            }
        }
        String maxAverageDepartment = map.entrySet()
                .stream()
                .max(Comparator.comparingDouble(entry -> getAverageSalary(entry.getValue())))
                .get()
                .getKey();
        System.out.printf("Highest Average Salary: %s%n",maxAverageDepartment);
        List<Employee> employeeList = map.get(maxAverageDepartment);
        employeeList.sort(Comparator.comparingDouble( e -> e.getSalary()));
        Collections.reverse(employeeList);
        for (Employee employee: employeeList) {
            System.out.println(employee.toString());
        }

    }

    public static double getAverageSalary (List<Employee> employees){
        double sum = 0;
        for (Employee employee : employees ) {
            sum += employee.getSalary();
        }
        return sum/employees.size();
    }
}
