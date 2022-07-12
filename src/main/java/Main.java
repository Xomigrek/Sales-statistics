import ru.netology.stats.StatsService.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int [] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.sumSales(sale));
        System.out.println(service.midSales(sale));
        System.out.println(service.maxSales(sale));
        System.out.println(service.minSales(sale));
        System.out.println(service.downMidSales(sale));
        System.out.println(service.upMidSales(sale));
    }
}
