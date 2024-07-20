package Arrays;


public class AscendingOrder {
    public static void main(String[] args){
        int number[] = {89,98,67,78,56,49};

        for(int i=0; i<number.length; i++){
            for(int j=0; j<number.length; j++){
                if(number[i]<number[j]){
                    number[i]=number[j];
                    number[j]=number[i];
                }
                System.out.println(number[i]+" "+number[j]);
            }
        }
    }
}
