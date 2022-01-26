public class Helper{
    public static void display(String msg, String from){
        if(msg == null || msg.trim().equals("")){
            System.out.println("No message to display from class "+from);
        }else {
            System.out.println(msg+" from class "+from);
        }
    }
}
