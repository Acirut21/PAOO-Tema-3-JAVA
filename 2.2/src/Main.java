public class Main {
    public static void main(String[] args) {
        WebHelper webHelper = WebHelper.getInstance();

        System.out.println("Conținutul paginii web:");
        System.out.println(webHelper.getWebSiteContent());
    }
}