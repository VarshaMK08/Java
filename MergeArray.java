public class MergeArray {
    public static void main(String[] args){
        int[] arr1 = {10,20};
        int[] arr2 = {30,40,50};
        int[] merged = new int[arr1.length + arr2.length];
        
        // Copying of array 1
        for(int i = 0;i<arr1.length;i++){
            merged[i] = arr1[i];
        }

        //Copying of array 2
        for(int i = 0;i<arr2.length;i++){
            merged[arr1.length+i] = arr2[i];
        }

        for(int i = 0;i<merged.length;i++){
            System.out.print(merged[i] +" ");
        }
        
    }
}
