package przeciązenieMetod;

public class PriceFormater {
    String currency = "zł";

    public static void main(String[] args) {
        PriceFormater priceFormater = new PriceFormater();
        priceFormater.currency = "PLN";
        System.out.println(priceFormater.formatPrice(107));
        System.out.println(priceFormater.formatPrice(1075.30));
        System.out.println(priceFormater.formatPrice("3.78"));
    }
    String formatPrice(int value){
        return String.format("%d,00 %s",value,currency);
    }
    String formatPrice(double value){
        return String.format("%.2f %s",value,currency);
    }
    String formatPrice(String value){
        return String.format("%.2f %s",Double.parseDouble(value),currency);
    }

}
