import java.util.*;
class stack1  //   stack is a linear data structure
               // follows LIFO (last in first out)
               // insertion and deletion take place the top
               // 4 major methode use in data mainpulat 
               //1:-push (use to add element)
               // 2:-pop(remove the top element)
               //3:- peek(peek methode use in get to top element)
               //4:-IsEmpty( to cheak emoty or not )


{
    public static void main(String[] args)
    {
        Stack<Integer> st=new Stack<Integer>();
        boolean result=st.empty();
        System.out.println(result);

        st.push(10);
        st.push(39);
        st.push(45);
        st.push(1);
        st.push(16);
        System.out.println(st);
        st.remove(3);
        System.out.println(st);
        st.pop();         
        System.out.println(st);
        // st.pop();
        // st.pop();
        // st.pop();
        st.add(78);
        System.out.println(st);
        // serch element
         int v=st.search(10);
        System.out.println(v);

        // iterat element


        Stack m1=new Stack();
        m1.push("yograj");
        m1.push("dak");
        m1.push("amar");
        m1.push("maske");
        m1.push("tata");
        Iterator i=m1.iterator(); // creat iterator object

        while(i.hasNext()) // use in while loop
        {
           Object value=i.next();
           System.out.println(value);
        }

         Stack t1=new Stack();
         t1.push(67);
         t1.push(70);
         t1.push(90);
         t1.push(200);
         System.out.println(t1);
         System.out.println(t1.peek()); // peek methode use in get to top element
         System.out.println(t1.isEmpty());// to cheak emoty or not 

         





    }
}