package com.amap.api.services.a;

import com.amap.api.services.a.bn;
import com.amap.api.services.core.ServiceSettings;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f6872a = {"com.amap.api.services", "com.amap.api.search.admic"};

    public static String a() {
        if (ServiceSettings.getInstance().getProtocol() == 1) {
            return "http://restapi.amap.com/v3";
        }
        return "https://restapi.amap.com/v3";
    }

    public static String b() {
        if (ServiceSettings.getInstance().getProtocol() == 1) {
            return "http://restapi.amap.com/v4";
        }
        return "https://restapi.amap.com/v4";
    }

    public static String c() {
        if (ServiceSettings.getInstance().getProtocol() == 1) {
            return "http://yuntuapi.amap.com";
        }
        return "https://yuntuapi.amap.com";
    }

    public static String d() {
        if (ServiceSettings.getInstance().getProtocol() == 1) {
            return "http://m5.amap.com/ws/mapapi/shortaddress/transform";
        }
        return "https://m5.amap.com/ws/mapapi/shortaddress/transform";
    }

    public static bn a(boolean z) {
        try {
            return new bn.a("sea", "6.1.0", "AMAP SDK Android Search 6.1.0").a(f6872a).a(z).a("6.1.0").a();
        } catch (be e2) {
            j.a(e2, "ConfigableConst", "getSDKInfo");
            return null;
        }
    }
}
