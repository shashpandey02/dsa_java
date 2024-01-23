import java.util.Stack;

public class balance {
    public static void main(String[] args) {
        String exp="([(a+b)*{(a+b)+(c+d)}])";
        if(balance_exp(exp)==0){
            System.out.println("Expression is balanced");
        }
        else{
            System.out.println("Expression is not balanced");
        }
    }
    public static int balance_exp(String exp){
        int notbalanced=0;
        Stack<Character>s=new Stack<Character>();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{' ){
                // for opening bracket
                // push into the stack
                s.push(ch);
            }
            if(ch==')'){
                // for closing bracket we need to check
                if(s.empty()){
                    notbalanced++;
                    return notbalanced;
                }
                if(s.peek()=='('){
                    // balance for ()
                    // simply pop the balanced set
                    s.pop();
                }
                else{
                    notbalanced++;
                    return notbalanced;
                }
            }
            if(ch==']'){
                // for closing bracket we need to check
                if(s.empty()){
                    notbalanced++;
                    return notbalanced;
                }
                if(s.peek()=='['){
                    // balance for ()
                    // simply pop the balanced set
                    s.pop();
                }
                else{
                    notbalanced++;
                    return notbalanced;
                }
            }
            if(ch=='}'){
                // for closing bracket we need to check
                if(s.empty()){
                    notbalanced++;
                    return notbalanced;
                }
                if(s.peek()=='{'){
                    // balance for ()
                    // simply pop the balanced set
                    s.pop();
                }
                else{
                    notbalanced++;
                    return notbalanced;
                }
            }
        }
        return notbalanced;

    }
}
