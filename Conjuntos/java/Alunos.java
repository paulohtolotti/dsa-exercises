import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Alunos {

    // Solução O(N²): dois fors aninhados
    public static int studentsCount(List<List<Integer>> courses) {
        Set<Integer> idSet = new HashSet<>();

        for(List<Integer> course : courses) {
            for(Integer student : course) {
                idSet.add(student);
            }
        }

        return idSet.size();
    }

    public static void main(String[] args) {

        List<List<Integer>> courses = new ArrayList <>(Arrays.asList(
            new ArrayList<>(Arrays.asList(15, 21, 80, 42)),
            new ArrayList<>(Arrays.asList(21, 80, 47)),
            new ArrayList<>(Arrays.asList(12, 21, 47, 35))
        ));

        System.out.println("Count: " + studentsCount(courses));
    }
    
}
