import java.util.Random;

public class slotMachine {
    public static void main(String[] args){
        String[][] slotFruits = {{"🍒","🍒","🍒","🍒","🍒"},
                                 {"🍋","🍋","🍋","🍋","🍋"},
                                 {"⭐","⭐","⭐","⭐","⭐"},
                                 {"🍎","🍎","🍎","🍎","🍎"},
                                 {"🍇","🍇","🍇","🍇","🍇"}};
        int randomElement;
        String[] result = new String[slotFruits.length];
        Random random = new Random();

        for(int i = 0; i < slotFruits.length; i++)
            for(int j = 0; j < 1; j++){
                randomElement = random.nextInt(slotFruits[i].length);
                result[i] = slotFruits[i][randomElement];
            }
      for(String res : result){
          System.out.print(res);
      }
    }
}
