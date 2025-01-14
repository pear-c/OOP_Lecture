import java.util.*;
import java.util.stream.Collectors;

public class Main {
    @FunctionalInterface
    interface DiscountCalculator {
        double applyDiscount(double price);
    }

    public static void main(String[] args) {
        List<Map<String, Object>> products = Arrays.asList(
                Map.of("name", "Laptop", "price", 1200.0),
                Map.of("name", "SmartPhone", "price", 800.0),
                Map.of("name", "Tablet", "price", 1000.0)
        );

        // 익명 내부 클래스 이용한 구현
        DiscountCalculator discountWithAnnonymousClass = new DiscountCalculator() {
            @Override
            public double applyDiscount(double price) {
                return price * 0.9;
            }
        };
        // 람다 이용한 구현
        DiscountCalculator discountWithLambda = (price -> price * 0.9);
        // 스트림과 람다 이용해 할인 적용
        List<String> discountProducts = products.stream()
                .map(product -> Map.of(
                        "name", product.get("name"),
                        "discountPrice", discountWithLambda.applyDiscount((Double) product.get("price"))
                ))
                .sorted(Comparator.comparingDouble(product -> (double) product.get("discountPrice")))
                .map(product -> product.get("name") + ": " + String.format("%.2f", product.get("discountPrice")) + "원")
                .collect(Collectors.toList());

        discountProducts.forEach(System.out::println);
    }

}
