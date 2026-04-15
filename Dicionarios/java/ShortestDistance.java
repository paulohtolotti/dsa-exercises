public class ShortestDistance {

    public static int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int min = -1;

        // indo para a direita
        for (int i = 0; i < n; i++) {
            int idx = (startIndex + i) % n;
            if (words[idx].equals(target)) {
                if (min == -1 || i < min) min = i;
                break;
            }
        }

        // indo para a esquerda
        for (int i = 0; i < n; i++) {
            int idx = (startIndex - i + n) % n;
            if (words[idx].equals(target)) {
                if (min == -1 || i < min) min = i;
                break;
            }
        }

        return min;
    }
    
    public static void main(String[] args) {
        String words[] = {"hsdqinnoha","mqhskgeqzr","zemkwvqrww","zemkwvqrww","daljcrktje","fghofclnwp","djwdworyka","cxfpybanhd","fghofclnwp","fghofclnwp"};
        String target = "zemkwvqrww";
        int startIndex = 8;

        System.out.println(closestTarget(words, target, startIndex));
    }
}
