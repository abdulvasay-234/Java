import javax.swing.*;
public class ListExample {
    ListExample(){
        JFrame f=new JFrame();
        DefaultListModel<String> ll =new DefaultListModel<>();
        ll.addElement("iteam 1");
        ll.addElement("iteam 2"); JList<String>
        list=new JList<>(ll);
        list.setBounds(100,100,70,70);
        f.add(list);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new ListExample();
    }
}