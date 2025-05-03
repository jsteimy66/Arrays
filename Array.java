/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joes
 */
public class Array {
    
        
        private int[] myArray;
        private int top;
        
        public Array(){
            top = -1;
            myArray = new int[16];
        }
        public Array(int val){
            top = -1;
            myArray = new int[val];
        }
        public void insert(int value){
            if(myArray.length == top+1){ 
                int[] temp = new int[myArray.length * 2];
                for(int i = 0; i< myArray.length; i++){
                    temp[i] = myArray[i];
            }
            myArray = temp;
            }
            myArray[++top] = value;
        }       
        public boolean fetch(int value) {
        for (int i = 0; i <= top; i++) {
            if (myArray[i] == value) {
                // Move closer to the front by swapping
                if (i > 0) {
                    int temp = myArray[i];
                    myArray[i] = myArray[i - 1];
                    myArray[i - 1] = temp;
                }
                return true;
            }
        }
        return false;
    }
        public boolean remove(int value) {
        for (int i = 0; i <= top; i++) {
            if (myArray[i] == value) {
                // Shift elements left to maintain order
                for (int j = i; j < top; j++) {
                    myArray[j] = myArray[j + 1];
                }
                top--; // Reduce size
                return true;
            }
        }
        return false;
    }
}
        
        
        
        
        
        
        
        
        
        
    
    

