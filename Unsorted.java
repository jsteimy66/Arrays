/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joes
 */
public class Unsorted {private int[] myArray;
        private int top;
        
        public Unsorted(){
            top = -1;
            myArray = new int[16];
        }
        public Unsorted(int val){
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
        public boolean fetch(int value){
            for(int i = 0; i<myArray.length; i++){
                if(myArray[i] == value){
                    return true;
                }
            }
            return false;
        }
        
        public boolean remove(int value) {
            if (fetch(value)) { 
                for (int i = 0; i <= top; i++) {
                    if (myArray[i] == value) {
                        for (int j = i; j < top; j++) { 
                            myArray[j] = myArray[j + 1];
                        }
                        top--; 
                        return true; 
                    }
                }
            }
            return false; 
        }
}
        
        
        
        
        
        
        
        
        
        
    
    


    

