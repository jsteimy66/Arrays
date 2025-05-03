/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joes
 */
public class SortedArray {
        
        private int[] myArray;
        private int top;
        
        public SortedArray(){
            top = -1;
            myArray = new int[16];
        }
        public SortedArray(int val){
            top = -1;
            myArray = new int[val];
        }
    public void insert(int value) {
        // Resize array if full
        if (top == myArray.length - 1) {
            int[] temp = new int[myArray.length * 2];

            // Manually copy elements to new array
            for (int k = 0; k < myArray.length; k++) {
                temp[k] = myArray[k];
            }

            myArray = temp;
        }

        int i;
        // Find correct insertion position
        for (i = top; i >= 0 && myArray[i] > value; i--) {
            myArray[i + 1] = myArray[i]; // Shift elements right
        }

        myArray[i + 1] = value; // Insert value
        top++; // Increase top index
    }
       public boolean remove(int value) {
            int j = find(value);
            if(j == top){
                return false; 
            }
                else
                    {
                        for (int k = j; k < top; k++) { 
                            myArray[k] = myArray[k + 1];
                        }
                        top--; 
                        return true; 
                    }
                }
           
        
        public int find(int key){
            
            int low = 0;
            int high = top;
            int curr;
            
            while(true){
                
                curr = (low + high)/2;
                
                if(myArray[curr] == key)
                    return curr;                       
                
                else if (low > high)
                    return top;
                
                else{
                    if(myArray[curr] < key)
                        low = curr + 1;
                    else 
                        high = curr - 1;
                                           
                }                             
            }
            
        }
}

        
        
        
        
        
    

