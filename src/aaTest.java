public class aaTest {
    public static void main(String[] args) {
         int a = 5, b = 0;

         try {
             System.out.println(a/b);
         } catch (ArithmeticException e){
             System.out.println("출력1");
         } catch (ArrayIndexOutOfBoundsException e){
             System.out.println("출력2");
         } catch (NumberFormatException e) {
             System.out.println("출력3");
         } catch (Exception e) {
             System.out.println("출력4");
         } finally {
             
         }
    }
}
