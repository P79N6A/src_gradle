package com.xiaomi.push;

public enum iq {
    MISC_CONFIG(1),
    PLUGIN_CONFIG(2);
    

    /* renamed from: a  reason: collision with other field name */
    private final int f556a;

    private iq(int i) {
        this.f556a = i;
    }

    public static iq a(int i) {
        switch (i) {
            case 1:
                return MISC_CONFIG;
            case 2:
                return PLUGIN_CONFIG;
            default:
                return null;
        }
    }

    public final int a() {
        return this.f556a;
    }
}
