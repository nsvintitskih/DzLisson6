public class Main {
    public static void main(String[] args) {
        int[] mas = new int[50];
        // библиотека метод рендум дабл от 0 до1
        for(int i =0; i<mas.length; i++){
            mas[i] =(int) (Math.random()*100-50);//это отриц числа, полож просто умнож на 50
        }
        for(int item: mas){// перебор всех элеентов в цикле
            System.out.println(item + " ");
        }
        int pos = 0;
        int neg = 0;
        int zero =0;
        int sumPos = 0;
        int sumNeg = 0;
        int averge;

        for (int item : mas){
            if (item>0){
                pos++;
                sumPos = sumPos + item;
            }else if(item<0){
                neg++;
                sumNeg = sumNeg + item;
            }else{
                zero++;

            }

        } averge = (sumPos + sumNeg)/50;

        System.out.println("Info");
        System.out.println("+:" + pos);
        System.out.println("-:" + neg);
        System.out.println("0:" + zero);
        System.out.println("SumPos:" + sumPos);
        System.out.println("SumNeg:" + sumNeg);
        System.out.println("Averge:" + averge);
    }

}