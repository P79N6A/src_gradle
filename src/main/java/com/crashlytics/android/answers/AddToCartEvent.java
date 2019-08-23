package com.crashlytics.android.answers;

import java.math.BigDecimal;
import java.util.Currency;

public class AddToCartEvent extends PredefinedEvent<AddToCartEvent> {
    static final BigDecimal MICRO_CONSTANT = BigDecimal.valueOf(1000000);

    /* access modifiers changed from: package-private */
    public String getPredefinedType() {
        return "addToCart";
    }

    public AddToCartEvent putItemId(String str) {
        this.predefinedAttributes.put("itemId", str);
        return this;
    }

    public AddToCartEvent putItemName(String str) {
        this.predefinedAttributes.put("itemName", str);
        return this;
    }

    public AddToCartEvent putItemType(String str) {
        this.predefinedAttributes.put("itemType", str);
        return this;
    }

    /* access modifiers changed from: package-private */
    public long priceToMicros(BigDecimal bigDecimal) {
        return MICRO_CONSTANT.multiply(bigDecimal).longValue();
    }

    public AddToCartEvent putCurrency(Currency currency) {
        if (!this.validator.isNull(currency, "currency")) {
            this.predefinedAttributes.put("currency", currency.getCurrencyCode());
        }
        return this;
    }

    public AddToCartEvent putItemPrice(BigDecimal bigDecimal) {
        if (!this.validator.isNull(bigDecimal, "itemPrice")) {
            this.predefinedAttributes.put("itemPrice", (Number) Long.valueOf(priceToMicros(bigDecimal)));
        }
        return this;
    }
}
