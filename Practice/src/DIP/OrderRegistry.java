package DIP;

import java.util.HashMap;
import java.util.Map;

public class OrderRegistry {

    private static Map<String, PaymentMethod> orderRegistry = new HashMap<>();

    static {
        orderRegistry.put("credit", new CreditCardPayment());
        orderRegistry.put("debit", new DebitCardPayment());
    }

    public static PaymentMethod getPaymentMethods(String type){
        PaymentMethod payMethod = orderRegistry.get(type.toLowerCase());
        if (payMethod == null){
            throw new IllegalArgumentException("payment type not found: "+type);
        }
        return payMethod;
    }
}
