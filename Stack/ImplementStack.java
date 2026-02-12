    package Stack;
    import java.util.*;

    public class ImplementStack {

        class MyStack<T> {
            ArrayList<T> arr;
            public MyStack() {
            arr = new ArrayList<>();
            }

            public void push(T data){
                arr.add(data);
            }
            public T pop(){
                if(arr.isEmpty()) return null;
            T d=arr.remove(arr.size()-1);
            return d; 
            }

        }
        
        public static void main(String args[]) { 
            MyStack st = new ImplementStack().new MyStack<Object>();
            st.push(1);
            st.push("Akshay raj gandu");
            st.push("Ta0pan chaubey");
            st.push("jaddu");
            System.out.println(st.pop());

        }
    }
