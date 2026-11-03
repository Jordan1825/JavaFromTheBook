public class CaseStudy8_5TestGrader {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'C', 'D', 'C', 'B', 'A', 'B', 'A', 'A', 'D'},
                {'D', 'C', 'D', 'D', 'D', 'B', 'B', 'E', 'A', 'D'},
                {'C', 'C', 'D', 'C', 'B', 'A', 'C', 'B', 'A', 'D'},
                {'A', 'A', 'D', 'C', 'B', 'B', 'B', 'E', 'A', 'D'}
        };

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++){
                if (answers[i][j] == keys[j]) {
                    correctCount++;
                }
            }
            System.out.println("Student " + i + "'s correct count is " + correctCount);
        }
    }
}
