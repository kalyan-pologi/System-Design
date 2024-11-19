package OCP;

import java.util.HashMap;
import java.util.Map;

public class PaymentRegistry {

    private static Map<String, Class<? extends Payment>> paymentMethods = new HashMap<>();

    static {
        paymentMethods.put("creditcard", CreditCardPayment.class);
        // add new
    }

    public static Payment getPaymentMethods(String type){
        Class<? extends Payment> pay = paymentMethods.get(type.toLowerCase());
        if(pay == null){
            throw new IllegalArgumentException("Invalid OCP.Payment method: "+ type);
        }
        try {
            return pay.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Error creating payment instance for type: "+ type);
        }
    }
}
