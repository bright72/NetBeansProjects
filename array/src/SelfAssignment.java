public class SelfAssignment {

    public static void main(String[] args) {
       
        char[] stdAnswer = {'A','B','C','D','A'};
        char solAnswer[] = {'A','B','C','D','A'};
        System.out.println(examChecking(stdAnswer, solAnswer));
    }

    public static int examChecking(char[] stdAnswer, char[] solAnswer) {
        int result = -1;
        if (stdAnswer.length == solAnswer.length) {
            result = 0;
            for (int i = 0; i < stdAnswer.length; i++) {
                if (stdAnswer[i] == solAnswer[i]) {
                    result++;
                }
            }
        }
        return result;
    }
}