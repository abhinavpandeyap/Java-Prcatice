//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class arr1{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
    
        int sum=arr[0],i=0,j=0;
        
        while(true)
        {
            if(sum==s){
            	 ans.add(i+1);
                 ans.add(j+1);
                 return(ans);
                    }
            else if (sum<s) {
            	if (j<n-1) {
            		j++;
            		sum = sum + arr[j];
            	}
            	else {
            		break;
            	}
			}
            else {
            	if(i<j) {
            		sum = sum - arr[i];
            		i++;
            	}
            	else if (j<n-1)
            	{
            		i++;
            		j++;
            		sum = arr[i];
            	}
            	else {
            		break;
            	}
            }
     
            
                  
        }
        
        ans.add(-1);
        return(ans);
        
    }
}