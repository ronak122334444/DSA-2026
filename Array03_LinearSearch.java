public class Array03_LinearSearch {
    public static int linearSearch(int number[], int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1; //key not found
    }
    public static void main(String args[]){
        int key=10;
        int number[]={2,4,6,8,10,12,14,16};
        int index=linearSearch(number,key);
        if(index==-1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found at index: "+index);
        }


    }
    
}
