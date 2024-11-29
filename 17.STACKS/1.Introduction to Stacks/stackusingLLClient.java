public class stackusingLlCLient {

    public static void main(String args[]) {

        stackusingLL s = new stackusingLL();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.pop());// 4
        s.display();
        System.out.println(s.isEmpty());
        System.out.println(s.peek());

    }

}
