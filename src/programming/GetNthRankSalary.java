package programming;

import java.util.*;
import java.util.stream.Collectors;

public class GetNthRankSalary {

    public static void main(String[] args) {
        Map<String, Integer> employeeMap = new HashMap<>();
        employeeMap.put("AJ", 36522);
        employeeMap.put("AJ1", 36522);
        employeeMap.put("AJ2", 36522);
        employeeMap.put("AJ3", 36522);
        employeeMap.put("AJ4", 36522);
        employeeMap.put("TR", 36522);
        employeeMap.put("TR1", 36522);
        employeeMap.put("TR2", 36522);
        employeeMap.put("TR3", 345678);
        employeeMap.put("TR4", 36522);
        employeeMap.put("CK", 342);
        employeeMap.put("CK1", 6754);
        employeeMap.put("CK2", 243);
        employeeMap.put("CK3", 3453);
        employeeMap.put("CK4", 23453635);

        new GetNthRankSalary().getNthRankSalaryEmployees(employeeMap, 2, true);
        new GetNthRankSalary().getNthRankSalaryEmployees(employeeMap, 2, false);


    }

    private void getNthRankSalaryEmployees(Map<String, Integer> employeeMap, int rank, boolean isFromTop) {

        Map<Integer, List<String>> listOfEmployees = employeeMap.entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())));

        System.out.println(listOfEmployees);

        List<Integer> salaries = new ArrayList<>();
        if (isFromTop) {
            salaries = listOfEmployees.keySet().stream().sorted(Collections.reverseOrder()).toList();
        } else {
            salaries = listOfEmployees.keySet().stream().sorted().toList();
        }

        System.out.println(salaries);
        System.out.println("Rank "+ rank +" : Salary "+ salaries.get(rank-1) +"  : List of Employees : " + listOfEmployees.get(salaries.get(rank-1)));
    }
}
