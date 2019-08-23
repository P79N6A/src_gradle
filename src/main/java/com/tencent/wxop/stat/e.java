package com.tencent.wxop.stat;

public enum e {
    INSTANT(1),
    ONLY_WIFI(2),
    BATCH(3),
    APP_LAUNCH(4),
    DEVELOPER(5),
    PERIOD(6),
    ONLY_WIFI_NO_CACHE(7);
    

    /* renamed from: a  reason: collision with root package name */
    int f79891a;

    private e(int i) {
        this.f79891a = i;
    }

    public static e getStatReportStrategy(int i) {
        for (e eVar : values()) {
            if (i == eVar.a()) {
                return eVar;
            }
        }
        return null;
    }

    public final int a() {
        return this.f79891a;
    }
}
