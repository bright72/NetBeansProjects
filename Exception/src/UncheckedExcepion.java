
public class UncheckedExcepion {

    public static void main(String[] args) {
//        String bright = "";
//        System.out.println(bright.substring(5));
        System.out.println("===============Begin main=================");
        try {
            double avg = avg(new int[]{1, 2, 3});
            System.out.println("average" + avg);
        } catch (ArrayIndexOutOfBoundsException aio) {
            System.out.println("Exception occured : " + aio.getMessage());
            aio.printStackTrace();
        } catch (RuntimeException aio) {

            System.out.println("Exception occured : " + aio.getMessage());
            aio.printStackTrace();
        } catch (Exception aio) {
            System.out.println("Exception occured : " + aio.getMessage());
            aio.printStackTrace();
        } finally {
            System.out.println("Finally block is working");
        }
        System.out.println("Good bye");

    }

    public static double avg(int[] nums) throws ArrayIndexOutOfBoundsException {
        System.out.println("--------------Begin---------------");
        double sum = 0;
        for (int index = 0; index <= nums.length; index++) {
            sum += nums[index];
        }
        System.out.println("--------------End---------------");
        return sum / nums.length;
    }
}
