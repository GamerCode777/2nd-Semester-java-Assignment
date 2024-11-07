/*2) String Manipulation, Arrays and Control Statements
The objective of this program is to practice working with strings, arrays, type casting, and
control
statements (if and switch) in Java. You will be given a string containing a list of student names
and
their scores. Your task is to process this data and perform various operations on it.*/
class Question_26 {
    public static void main(String[] args) {
        // Declare studentData string
        String studentData = "John:85, Alice:92, Bob:78, Carol:95, David:88, Emma:79, Frank:90";

        // Split studentData into individual records
        String[] records = studentData.split(", ");

        // arrays to store names and scores
        String[] studentNames = new String[records.length];
        int[] studentScores = new int[records.length];

        // Populate the arrays
        for (int i = 0; i < records.length; i++) {
            String[] parts = records[i].split(":"); // Split each record into name and score
            studentNames[i] = parts[0]; // Store the name
            studentScores[i] = Integer.parseInt(parts[1]); // Convert and store the score
        }

        // total number of students
        int totalStudents = studentNames.length;
        System.out.println("Total number of students: " + totalStudents);

        // Calculate average score
        int sum = 0;
        for (int score : studentScores) {
            sum += score;
        }
        double averageScore = (double) sum / totalStudents;
        System.out.printf("Average score: %.2f%n", averageScore);

        // Find the highest score and student's name
        int highestScore = studentScores[0];
        String topStudent = studentNames[0];
        for (int i = 1; i < studentScores.length; i++) {
            if (studentScores[i] > highestScore) {
                highestScore = studentScores[i];
                topStudent = studentNames[i];
            }
        }
        System.out.println("Highest score: " + highestScore + " by " + topStudent);

        // Find the lowest score and student's name
        int lowestScore = studentScores[0];
        String lowestStudent = studentNames[0];
        for (int i = 1; i < studentScores.length; i++) {
            if (studentScores[i] < lowestScore) {
                lowestScore = studentScores[i];
                lowestStudent = studentNames[i];
            }
        }
        System.out.println("Lowest score: " + lowestScore + " by " + lowestStudent);
    }
}