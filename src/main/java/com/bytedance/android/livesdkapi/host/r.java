package com.bytedance.android.livesdkapi.host;

import com.meituan.robust.ChangeQuickRedirect;

public enum r {
    WEIXIN("WEIXIN"),
    ALIPAY("ALIPAY"),
    TEST("TEST"),
    FIRE("FIRE"),
    GOOGLE("GooglePay"),
    DIAMOND("DIAMOND"),
    ONECARD("OneCard"),
    VISA("Visa"),
    MASTERCARD("MasterCard"),
    BOKU("Pay by mobile"),
    HUOLI("Huoli"),
    CJ("CJ"),
    UNKNOWN("UNKNOWN");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    String value;

    public final String getValue() {
        return this.value;
    }

    private r(String str) {
        this.value = str;
    }
}
