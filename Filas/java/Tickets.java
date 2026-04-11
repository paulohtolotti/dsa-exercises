import java.util.LinkedList;
import java.util.Queue;

public class Tickets {

    public static int timeRequiredToBuy(int[] tickets, int k) {

        int total = 0; int size = tickets.length;
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < size; i++) {
            queue.add(i);
        }

        while(true) {

            int i = queue.poll();
            tickets[i]--;
            total++;

            if(tickets[i] != 0) {
                queue.add(i);
            }

            if(tickets[k] == 0) return total;
        }
        
    }
    public static void main (String[] args) {

        int[] tickets = {2, 3, 2};
        System.out.println(timeRequiredToBuy(tickets, 2));
    }
}