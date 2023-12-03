import java.util.Arrays;

public class Stack {
    static int[] content = new int[50];
    static int index = 0;
    public static void main(String[] args){
        Stack myStack = new Stack();
        myStack.add(2);
        myStack.add(1);
        System.out.println(Arrays.toString(myStack.myContent()));
    }

    static void add(int n){
        
        content[index] = n;
        index = index+1;
    }

    static int[] myContent(){
        int[] result = new int[index];
        for (int i = 0; i < index; i++){
            result[i] = content[i];
        }
        return result;
    }
    
}