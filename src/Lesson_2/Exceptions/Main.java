package Lesson_2.Exceptions;

public class Main {
    public static void main(String[] args) {
        String[][] array = {{"1","2","3","4"}, {"5","6","6","7"}, {"5","6","8"}, {"5","6","9","10"} };
        try {
            System.out.println("Сумма чисел в массиве array: " + arraySum(array));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    static int arraySum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int result = 0;
        if (array.length != 4 || array[0].length != 4 || array[1].length != 4 || array[2].length != 4 || array[3].length != 4){
            throw new MyArraySizeException("Размер массива не соотвествует 4*4");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try{
                    result+= Integer.parseInt(array[i][j]);
                }catch (Exception e){
                    throw new MyArrayDataException("содержится не числовой элемент", i, j);
                }
            }
        }
        return result;
    }
}
