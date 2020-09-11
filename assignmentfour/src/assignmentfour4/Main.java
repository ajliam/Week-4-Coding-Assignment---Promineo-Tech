package assignmentfour4;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//  1.	Create an instance of an ArrayList of String called employeeNames
        List<String> employeeNames = new ArrayList<String>();

//System.out.println("========================================================================================");

//  2.	Create an instance of a HashSet of Integer called ids
        HashSet<Integer> ids = new HashSet<>();

//System.out.println("========================================================================================");

//  3.	Create an instance of a HashMap of Integer, String called employeeMap
        Map<Integer, String> employeeMap = new HashMap<Integer, String>();

//System.out.println("========================================================================================");

//  4.	Add at least five entries to the employeeNames and ids (make sure both collections have the same number of entries).

        employeeNames.add("Aristotle");
        employeeNames.add("Plato");
        employeeNames.add("Socrates");
        employeeNames.add("Kant");
        employeeNames.add("Nietzsche");

        ids.add(385);
        ids.add(000);
        ids.add(399);
        ids.add(1724);
        ids.add(1844);

//System.out.println("========================================================================================");

//  5.	Create a variable int i = 0; then iterate over ids using an enhanced for loop. Inside the enhanced for loop use employeeMap.put() to add a new entry to the map. The entry should consist of a key that is the id in the enhanced loop’s current iteration, and a value that is the employeeName at position i of the employeeNames ArrayList. Increment i so that each iteration grabs the next element in the ArrayList.
        int i = 0;

        for (Integer id : ids) {
            employeeMap.put(id, employeeNames.get(i));
            i++;
        }

//System.out.println("========================================================================================");

//  6.	Once the employeeMap is fully populated, use another enhanced for loop to iterate over the employeeMap.keySet(), and use the key for each current iteration to print to the console both the current key and its associated value in the map.
    for(Integer key : ids) {
        System.out.println("Employee " + key + " : " + employeeMap.get(key));
    }

//System.out.println("========================================================================================");

//  7.	Create a StringBuilder called idsBuilder.
        StringBuilder idsBuilder = new StringBuilder();

//System.out.println("========================================================================================");

//  8.	Iterate over the ids HashSet and append each id, followed by a dash “-“ to idsBuilder.
        for(Integer id : ids) {
            idsBuilder.append(id).append(" - ");
        }

//System.out.println("========================================================================================");

//  9.	Print the result of idsBuilder.toString() to the console.
        System.out.println(idsBuilder.toString());

//System.out.println("========================================================================================");

//  10.	Create another StringBuilder called namesBuilder.
        StringBuilder namesBuilder = new StringBuilder();

//System.out.println("========================================================================================");

//  11.	Iterate over the employeeNames ArrayList and append each name, followed by a space “ “ to the namesBuilder.
        for(String employeeName : employeeNames) {
            namesBuilder.append(employeeNames).append(" ");
        }

//System.out.println("========================================================================================");

//  12.	Print the result of namesBuilder.toString() to the console.
        System.out.println(namesBuilder.toString());

    }
}
