// Дан массив двоичных чисел вывести макс кол-во подряд идущих 1
public static void task2() {
    int[] arr = new int[] {1,1,1,1,1,1,1,0,1}; //Массив
    int findNumber = 1; //Число которое надо найти
    int count = 0; //
    int countMax = 0;
    int maxLenghtArray = arr.length - 1;
    for(int i : arr) {
        if(findNumber == i) {
             count+=1;
             if(maxLenghtArray == 0) {
                 if(count >= countMax) {
                     countMax = count;
                 }
                 count=0;
             }
        }
        else {
            if(count >= countMax) {
                countMax = count;
            }
            count=0;
        }
        maxLenghtArray = 1;
    }
    System.out.println(countMax);
}

public class maxcounter {
    public static void main(String[] args) {
    int[] arr = new int[]{1, 1, 0, 1, 1, 1};
    int counter = 0;
    int localCounter = 0;
    for (int elem : arr) {
    if (elem == 1) {
    localCounter++;
    } else {
    counter = (counter < localCounter) ? localCounter : counter;
    // if (counter < localCounter) {
    // counter = localCounter;
    // } else {
    // counter = counter;
    // }
    localCounter = 0;
    }
    }
    counter = (counter < localCounter) ? localCounter : counter;
    System.out.println(counter);
    }
    }

    public static void main(String[] args) {

        int[] array = new int[]{0,1,0,1,0};
        int max = 0;
        for(int i=0;i<array.length;i++)
        {
        int count =0;
        while(i < array.length && array[i]==1)
        {
        count++;
        i++;
        }
        if(count>max)
        max = count;
        }
        System.out.println(String.format("Maximum ones into array: %d", max));
        }
        }