public class mod1 {

    public enum DaysOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    } 
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;

      switch (z) {
        case 1: case 3: case 5:
        case 7: case 8: case 10:
        case 12:
            z = 31;
            break;
        case 4: case 6:
        case 9: case 35:
            z = 30;
            break;
      }

      //BITWISE COMPLEMENT 
      int bit = 5;
      String binaryBit = Integer.toBinaryString(bit);
      System.out.println("5"+binaryBit);
      System.out.println(~bit);


      System.out.println("x+y = " + z);
      System.out.println(++z%6 == 0?"Gui acertou": "Gui errou");
      System.out.println(DaysOfWeek.FRIDAY);
    }
}