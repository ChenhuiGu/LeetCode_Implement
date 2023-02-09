package src;

public class VerifyPostorder {
    public boolean verifyPostorder(int[] postorder) {
        return recursion(postorder,0,postorder.length-1);
    }

    private boolean recursion(int[] postorder,int i,int j){
        if(i >= j) return true;
        int m = i;
        while (postorder[m] < postorder[j]) m++;
        int k = m;
        while (postorder[k] > postorder[j]) k++;
        return k == j && recursion(postorder,i,m-1) && recursion(postorder,m,j-1);
    }
}
