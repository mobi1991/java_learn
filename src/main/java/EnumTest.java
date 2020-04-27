public class EnumTest {

    enum Color{
        REN("1"),GREEN("2"),BLUE("3");
        private String order;
        private String getOrder(){
            return order;
        }
        private Color(String order){
            this.order=order;
        }
    }

    public static void main(String[] args) {
        Color c1 = Color.BLUE;
        System.out.println(c1);
    }
}
