package collections;

import java.util.HashMap;
import java.util.Map;

public class StudentGradebook {

    public static void main(String[] args) {

        /*****************************************************************
         This is how your code will be called.
         Your answer should be a map with the best scores for each student.
         You can edit this code to try different testing cases.
         *****************************************************************/
        var grades = new HashMap<String, Integer>();
        grades.put("Isaac", 95);
        grades.put("Hannah", 55);
        grades.put("Charlie", 80);
        grades.put("Alice", 24);
        grades.put("Bob", 32);
        grades.put("Jane", 63);
        grades.put("Daniel", 50);
        grades.put("Grace", 59);
        grades.put("Frank", 40);
        grades.put("Eve", 79);


        var makeupGrades = new HashMap<String, Integer>();
        makeupGrades.put("Isaac", 90);
        makeupGrades.put("Hannah", 95);
        makeupGrades.put("Charlie", 76);
        makeupGrades.put("Alice", 97);
        makeupGrades.put("Bob", 82);
        makeupGrades.put("Jane", 62);
        makeupGrades.put("Daniel", 89);
        makeupGrades.put("Grace", 80);
        makeupGrades.put("Frank", 98);
        makeupGrades.put("Eve", 79);

        var gradebook = StudentGradebook.updateGrades(grades, makeupGrades);

        for (Map.Entry<String, Integer> entry : gradebook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

    static Map<String, Integer> updateGrades(Map<String, Integer> gradebook,
                                             Map<String, Integer> makeupGrades) {

        // TODO: Update gradebook entry if the makeup grade is better
        for (Map.Entry<String, Integer> entry : makeupGrades.entrySet()) {

            String student = entry.getKey();
            int newGrade = entry.getValue();

            // текущая оценка из gradebook
            int currentGrade = gradebook.get(student);

            // обновляем только если новая оценка выше
            if (newGrade > currentGrade) {
                gradebook.put(student, newGrade);
            }
        }

        return gradebook;
    }

    // Second option for method static Map<String, Integer> updateGrades(Map<String,
    // Integer> gradebook, Map<String, Integer> makeupGrades) {...}
/*

    static Map<String, Integer> updateGrades(Map<String, Integer> gradebook,
           Map<String, Integer> makeupGrades) {

        // TODO: Update gradebook entry if the makeup grade is better
        for (String student : makeupGrades.keySet()) {
            int oldGrade = gradebook.get(student);
            int newGrade = makeupGrades.get(student);

            if (newGrade > oldGrade) {
                gradebook.put(student, newGrade);
            }
        }
        return gradebook;
    }
*/

}
