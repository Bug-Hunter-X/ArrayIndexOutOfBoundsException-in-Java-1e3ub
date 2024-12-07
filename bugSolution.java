public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if(arr.length>5){
            arr[5] = 10; 
        }else{
            System.out.println("Error: Index out of bounds");
        }
        System.out.println(arr[0]);
    }
}