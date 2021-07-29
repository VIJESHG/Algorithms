
import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<Character>();
       for(int i = 0; i < s.length(); i++){
           char ch = s.charAt(i);
           HashMap <Character,Character> hm = new HashMap<Character,Character>();
           hm.put('(', ')');
           hm.put('[', ']');
           hm.put('{', '}');
           if(hm.containsKey(ch)){
               stk.push(ch);
           }
           else if(!stk.empty()){
               if(hm.containsValue(ch)){
                   if(hm.get(stk.pop()) == ch){
                       continue;
                   }
                   else{
                       return false;
                   }    
               }
           }
           else{
               return false;
           }
       }
        if(!stk.empty())
           return false;
        else
           return true;
   }

     public static void main(String args[]){
         ValidParenthesis vp = new ValidParenthesis();
         String str = "()";
         System.out.println(vp.isValid(str));
     }
}
