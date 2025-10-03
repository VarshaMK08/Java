public class AddMatrix {
    public static void main(String[] args){
        if(args.length != 1){
            System.out.println("Enter the number");
            return;
        }
        int n = Integer.parseInt(args[0]);
        int[][]m1 = new int [n][n];
        int[][]m2 = new int[n][n];
        int [][]res = new int[n][n];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                m1[i][j] =  i + j;
                m2[i][j] = 2*(i+j);
            }
        }
        for(int i = 0;i < n;i++){
            for(int j = 0; j < n;j++){
                res[i][j] = m1[i][j] + m2[i][j];
            
            }
        }
        System.out.println("Matrix 1");
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                System.out.print(m1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix 2");
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                System.out.print(m2[i][j]+" ");
            
            }
            System.out.println();
        }
        System.out.println("Resultant Matrix");
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
