import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashSet;

public class InvalidTransactions {

    public static List<String> invalidTransactions(String[] transactions) {

        List<String> invalidList = new ArrayList<>();
        int size = transactions.length;
        boolean[] booleanArr = new boolean[size];

        
        for(int i=0; i<size; i++) {
            String[] data = transactions[i].split(",");

            if(Double.parseDouble(data[2]) > 1000 ) {
                booleanArr[i] = true;
            }

            for(int j=i+1; j<size; j++) {
                String[] data2 = transactions[j].split(",");

                if(data[0].equals(data2[0]) && !data[3].equals(data2[3])) {
                    if(Math.abs(Double.parseDouble(data[1]) - Double.parseDouble(data2[1])) <= 60) {
                        booleanArr[j] = true;
                        booleanArr[i] = true;
                    }
                }
            }
        }

        for(int i=0; i<size; i++ ) {
            if(booleanArr[i]) {
                invalidList.add(transactions[i]);
            }
        }
        return invalidList;
    }

    public static void main(String[] args) {
        String[] arr = {"alice,20,800,mtv","bob,50,1200,mtv"};
        String[] arr2 = { "alice,20,800,mtv", "alice,50,100,beijing" };
        String[] arr3 = { "alice,20,800,mtv", "alice,50,100,mtv", "alice,51,100,frankfurt" };
        String[] arr4 = { "alice,20,800,mtv","alice,50,1200,mtv"};
        System.out.println(invalidTransactions(arr).toString());
        System.out.println(invalidTransactions(arr2).toString());
        System.out.println(invalidTransactions(arr3).toString());
        System.out.println(invalidTransactions(arr4).toString());
    }

}

// ["alice,20,800,mtv","alice,50,100,mtv","alice,51,100,frankfurt"]