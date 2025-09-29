public class Iteration {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        // row_traverse(arr);
        // col_traverse(arr);
        spiral(arr);
    }
    public static void row_traverse(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void col_traverse(int[][] arr){
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void reverse(int[][] arr){
        for(int i=0;i<arr.length;i++){
            int l=0;
            int k=arr.length-1;
            while(l<k){
                int temp=arr[i][l];
                arr[i][l]=arr[i][k];
                arr[i][k]=temp;
                l++;
                k--;
            }
        }
    }

    public static void spiral(int[][] arr){
        int total=arr.length*arr[0].length;
        int c=0;
        int minr=0,minc=0;
        int maxr=arr.length-1,maxc=arr[0].length-1;
        while(c<total){
            //l->r
            for(int i=minc;i<=maxc && c<total;i++){
                System.out.print(arr[minr][i]+" ");
                c++;
            }
            minr++;
            //t->b
            for(int i=minr;i<=maxr && c<total;i++){
                System.out.print(arr[i][maxc]+" ");
                c++;
            }
            maxc--;
            //r->l
            for(int i=maxc;i>=minc && c<total;i--){
                System.out.print(arr[maxr][i]+" ");
                c++;
            }
            maxr--;
            //b->u
            for(int i=maxr;i>=minr && c<total;i--){
                System.out.print(arr[i][minc]+" ");
                c++;
            }
            minc++;

        }


    }
}
