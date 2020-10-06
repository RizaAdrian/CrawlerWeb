public class Main {
    public static void main(String[] args) {
        String rootUrl = "add a site here";
        Thread spiderDownloader = new WebPageDownloader(rootUrl);

        spiderDownloader.start();
    }
}
