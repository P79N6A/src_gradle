package com.crashlytics.android.answers;

import java.math.BigDecimal;
import java.util.Currency;

public class StartCheckoutEvent extends PredefinedEvent<StartCheckoutEvent> {
    static final BigDecimal MICRO_CONSTANT = BigDecimal.valueOf(1000000);

    /* access modifiers changed from: package-private */
    public String getPredefinedType() {
        return "startCheckout";
    }

    /* access modifiers changed from: package-private */
    public long priceToMicros(BigDecimal bigDecimal) {
        return MICRO_CONSTANT.multiply(bigDecimal).longValue();
    }

    public StartCheckoutEvent putItemCount(int i) {
        this.predefinedAttributes.put("itemCount", (Number) Integer.valueOf(i));
        return this;
    }

    public StartCheckoutEvent putCurrency(Currency currency) {
        if (!this.validator.isNull(currency, "currency")) {
            this.predefinedAttributes.put("currency", currency.getCurrencyCode());
        }
        return this;
    }

    public StartCheckoutEvent putTotalPrice(BigDecimal bigDecimal) {
        if (!this.validator.isNull(bigDecimal, "totalPrice")) {
            this.predefinedAttributes.put("totalPrice", (Number) Long.valueOf(priceToMicros(bigDecimal)));
        }
        return this;
    }
}
