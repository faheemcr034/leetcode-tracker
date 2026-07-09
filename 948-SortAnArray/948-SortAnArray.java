// Last updated: 09/07/2026, 10:07:05
class Solution {
    void mergeSort(int[] arr,int l,int r){

        if(l>=r) return;
        int m = l+(r-l)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        merge(arr,l,m,r);
        

    }

    void merge(int[] arr,int l,int m,int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] leftpart = new int[n1];
        int[] rightpart = new int[n2];

        for(int i = 0;i<n1;i++){
            leftpart[i] = arr[l+i];
        }
        for (int i = 0; i < n2; i++) {
            rightpart[i] = arr[m + 1 + i];
        }
        int i = 0;    
        int j = 0;     
        int k = l; 
        while(i<n1 && j<n2){
            if(leftpart[i] <= rightpart[j]){
                arr[k] = leftpart[i];
                i++;    
            }
            else{
                arr[k] = rightpart[j];
                j++; 
            }
            k++;
        }
        while(i<n1){
            arr[k] = leftpart[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = rightpart[j];
            j++;
            k++;
        }
    }

    public int[] sortArray(int[] nums) {
       mergeSort(nums, 0, nums.length - 1);
       return nums;
    }
}