import entities.DateInfo;

public class Date1 {
    public static void main(String[] args) {

        String fullDate = "09/06/2025";
        String[] data = fullDate.split("/");

        String fullDate2 = "01/01/2013";
        String[] data2 = fullDate2.split("/");

        String fullDate3 = "19/6/2022";
        String[] data3 = fullDate3.split("/");

        System.out.println(new DateInfo(Integer.parseInt(data[0]),Integer.parseInt(data[1]),Integer.parseInt(data[2])));
        System.out.println();
        System.out.println(new DateInfo(Integer.parseInt(data2[0]),Integer.parseInt(data2[1]),Integer.parseInt(data2[2])));
        System.out.println();
        System.out.println(new DateInfo(Integer.parseInt(data3[0]),Integer.parseInt(data3[1]),Integer.parseInt(data3[2])));

    }
    
}
