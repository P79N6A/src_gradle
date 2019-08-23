package com.meizu.cloud.pushsdk.base;

import com.meizu.cloud.pushsdk.base.a.a;
import com.meizu.cloud.pushsdk.base.a.d;

public class k {
    public static String a(String str) {
        d a2 = a.a("android.os.SystemProperties").a("get", String.class).a(str);
        if (a2.f27048a) {
            return (String) a2.f27049b;
        }
        return null;
    }
}
