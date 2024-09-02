package DataStructures;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        /*
        stacks = LIFO data structure. Last-In First-Out
                    stores objects into a sort of "vertical tower"
                    push() to add to the top
                    pop() to remove from the top
         */

        Stack<String> stack = new Stack<String>();

        System.out.println(stack.empty()); //checks if the stack si empty

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        stack.pop();
        stack.pop();
        String myFavGame = stack.pop(); // the item popped can be stored and printed as needed

        System.out.println(stack.search("Skyrim")); // returns the index of the item mentioned
        System.out.println(stack.peek()); // prints the last item without removing it
        System.out.println(stack);
        System.out.println(myFavGame);

        /*
         uses of stacks:
         1. undo/redo features in text editors
         2. moving back/forward through browser history
         3. backtracking algorithms (maze, file directories)
         4. calling functions (call stack)
         */
    }
}
