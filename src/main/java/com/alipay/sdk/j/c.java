package com.alipay.sdk.j;

public enum c {
    WIFI(0, "WIFI"),
    NETWORK_TYPE_1(1, "unicom2G"),
    NETWORK_TYPE_2(2, "mobile2G"),
    NETWORK_TYPE_4(4, "telecom2G"),
    NETWORK_TYPE_5(5, "telecom3G"),
    NETWORK_TYPE_6(6, "telecom3G"),
    NETWORK_TYPE_12(12, "telecom3G"),
    NETWORK_TYPE_8(8, "unicom3G"),
    NETWORK_TYPE_3(3, "unicom3G"),
    NETWORK_TYPE_13(13, "LTE"),
    NETWORK_TYPE_11(11, "IDEN"),
    NETWORK_TYPE_9(9, "HSUPA"),
    NETWORK_TYPE_10(10, "HSPA"),
    NETWORK_TYPE_15(15, "HSPAP"),
    NONE(-1, "none");
    
    public String p;
    private int q;

    private int a() {
        return this.q;
    }

    private String b() {
        return this.p;
    }

    public static c a(int i) {
        for (c cVar : values()) {
            if (cVar.q == i) {
                return cVar;
            }
        }
        return NONE;
    }

    private c(int i, String str) {
        this.q = i;
        this.p = str;
    }
}
