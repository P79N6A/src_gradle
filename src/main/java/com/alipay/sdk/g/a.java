package com.alipay.sdk.g;

import android.text.TextUtils;

public enum a {
    None("none"),
    WapPay("js://wappay"),
    Update("js://update");
    

    /* renamed from: d  reason: collision with root package name */
    private String f5502d;

    public static a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return None;
        }
        a aVar = None;
        a[] values = values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            a aVar2 = values[i];
            if (str.startsWith(aVar2.f5502d)) {
                aVar = aVar2;
                break;
            }
            i++;
        }
        return aVar;
    }

    private a(String str) {
        this.f5502d = str;
    }
}
