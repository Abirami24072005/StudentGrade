public class StudentGrade {

    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 65};

        int total = 0;
        int highest = marks[0];
        for (int m : marks) {
            total += m;
            if (m > highest) {
                highest = m;
            }
        }
        double average = (double) total / marks.length;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Highest: " + highest);
        System.out.println("Grade: " + getGrade(average));
    }

    static String getGrade(double avg) {
        if (avg >= 90) return "A+";
        else if (avg >= 80) return "A";
        else if (avg >= 70) return "B";
        else if (avg >= 60) return "C";
        else return "F";
    }
}