package Assignments.Grade;

public class FindGrade {
    public static void main(String[] args) {
        // --- STUDENT GRADES ---
        // Modify these variables for each student's specific grades
        double midtermScore = 37.5; // Your score out of the maximum
        double finalExamScore = 32; // Your score out of the maximum (e.g., if you haven't taken it, use 0.0)
        double homeworkScore = 5.0; // Your score out of the maximum
        double bonusHomeworkScore = 2.0; // Your bonus score
        double quiz1Score = 19.5; //20 Your score on Quiz 1
        double quiz2Score = 19.0; //20 Your score on Quiz 2
        double quiz3Score = 15; //15 Your score on Quiz 3 (use 0.0 if not taken yet)
        double quiz3BonusScore = 0.0; // Your bonus score for Quiz 3

        // --- GRADE WEIGHTS AND MAXIMUMS ---
        // These are standard for the course and should not change
        double examsWeight = 0.75;
        double homeworkWeight = 0.05;
        double quizzesWeight = 0.20;

        double midtermMax = 37.5;
        double finalExamMax = 37.5; // Updated based on your request
        double homeworkMax = 5.0;
        double bonusHwMax = 2.0;
        double quiz1Max = 20.0;
        double quiz2Max = 20.0;
        double quiz3Max = 15.0;
        double quiz3BonusMax = 3.0;

        // --- CALCULATIONS ---
        // Calculate the percentage score for each category
        double midtermPercent = midtermScore / midtermMax;
        double finalExamPercent = finalExamScore / finalExamMax;
        double homeworkPercent = (homeworkScore + bonusHomeworkScore) / homeworkMax; //Not divide bonus

        double totalQuizzesScore = quiz1Score + quiz2Score + quiz3Score + quiz3BonusScore;
        double totalQuizzesMax = quiz1Max + quiz2Max + quiz3Max; // Not divide bonus
        double quizzesPercent = totalQuizzesScore / totalQuizzesMax;

        // Calculate the overall final grade
        double totalExamsMax = midtermMax + finalExamMax;
        double examsPercent = (midtermScore + finalExamScore) / totalExamsMax;

        double finalGrade = (examsPercent * examsWeight) + (homeworkPercent * homeworkWeight) + (quizzesPercent * quizzesWeight);

        // --- OUTPUT RESULTS ---
        System.out.println("--- Grade Breakdown ---");
        System.out.println("Midterm: " + String.format("%.2f", midtermPercent * 100) + "%");
        System.out.println("Final Exam: " + String.format("%.2f", finalExamPercent * 100) + "%");
        System.out.println("Homework: " + String.format("%.2f", homeworkPercent * 100) + "%");
        System.out.println("Quizzes: " + String.format("%.2f", quizzesPercent * 100) + "%");

        System.out.println("\n--- Overall Grade ---");
        System.out.println("Your overall percentage is: " + String.format("%.2f", finalGrade * 100) + "%");
        displayLetterGradeAndGPA(finalGrade * 100);

        // --- Calculate what is needed for a B (83%) ---
        double targetGrade = 0.83;

        double currentWeightedScore = (midtermPercent * midtermMax / totalExamsMax * examsWeight) +
                (homeworkPercent * homeworkWeight) +
                (quizzesPercent * quizzesWeight);

        double requiredWeightedScoreFromFinal = targetGrade - currentWeightedScore;
        double requiredFinalExamPercent = requiredWeightedScoreFromFinal / (finalExamMax / totalExamsMax * examsWeight);
        double finalExamNeeded = requiredFinalExamPercent * finalExamMax;

        System.out.println("\n--- To Achieve a B (83%) ---");
        System.out.println("You need a final exam score of at least: " + String.format("%.2f", requiredFinalExamPercent * 100) + "%");
        System.out.println("This is " + String.format("%.2f", finalExamNeeded) + " out of " + finalExamMax + " points.");
    }

    /**
     * Prints the letter grade and GPA based on a percentage score.
     *
     * @param percentage The overall percentage score (e.g., 85.5)
     */
    public static void displayLetterGradeAndGPA(double percentage) {
        String letterGrade;
        double gpaPoints;

        if (percentage >= 93) {
            letterGrade = "A";
            gpaPoints = 4.0;
        } else if (percentage >= 90) {
            letterGrade = "A-";
            gpaPoints = 3.7;
        } else if (percentage >= 87) {
            letterGrade = "B+";
            gpaPoints = 3.3;
        } else if (percentage >= 83) {
            letterGrade = "B";
            gpaPoints = 3.0;
        } else if (percentage >= 80) {
            letterGrade = "B-";
            gpaPoints = 2.7;
        } else if (percentage >= 77) {
            letterGrade = "C+";
            gpaPoints = 2.3;
        } else if (percentage >= 73) {
            letterGrade = "C";
            gpaPoints = 2.0;
        } else if (percentage >= 70) {
            letterGrade = "C-";
            gpaPoints = 1.7;
        } else {
            letterGrade = "NC (No Credit)";
            gpaPoints = 0.0;
        }

        System.out.println("Your letter grade is: " + letterGrade);
        System.out.println("Your GPA points are: " + gpaPoints);
    }
}