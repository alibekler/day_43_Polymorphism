package day48_Collections_part3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMaps {
    public static void main(String[] args) {

        List<Map<String, String>> employees = new ArrayList<>();
        Map<String , String > emp1Data = new HashMap<>();
        emp1Data.put("EmpID", "123");
        emp1Data.put("EmpName", "Kozim");
        emp1Data.put("Jobtitle", "SDET");
        emp1Data.put("Salary", "100000");

        Map<String , String > emp2Data = new HashMap<>();
        emp2Data.put("EmpID", "12223");
        emp2Data.put("EmpName", "Luqmon");
        emp2Data.put("Jobtitle", "Dev");
        emp2Data.put("Salary", "120000");

        employees.add(emp1Data);
        employees.add(emp2Data);

        System.out.println(employees);

        System.out.println(employees.size());
        System.out.println(employees.get(1));

        System.out.println("Employee Name " + employees.get(0).get("EmpName"));

        //print each employee using for each loop

        int totalSalary=0;
        for (Map<String, String> s : employees) {
            System.out.println(s.get("EmpName"));
            totalSalary+=Integer.parseInt(s.get("Salary"));
        }
        System.out.println(totalSalary);


    }
}
