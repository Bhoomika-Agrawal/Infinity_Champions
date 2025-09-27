public class Upper_lower_bound {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int[] ans={-1,-1};
        int first=find(7,arr,true);
        int second=find(7,arr,false);
        ans[0]=first;
        ans[1]=second;
        System.out.println(ans[0]+" "+ans[1]);

    }
    public static int find(int target,int[] arr,boolean isfirst){
        int lo=0;
        int hi=arr.length-1;
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]<target){
                lo=mid+1;
            }
            else if(arr[mid]>target){
                hi=mid-1;
            }
            else{
                ans=mid;
                if(isfirst){
                    
                    hi=mid-1;
                }
                else{
                    
                    lo=mid+1;
                }
            }
        }
        return ans;
    }
}
