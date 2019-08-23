package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;

public class ew extends ex {

    /* renamed from: a  reason: collision with root package name */
    public static String f81989a = "";

    /* renamed from: b  reason: collision with root package name */
    public static String f81990b = "";

    public ew(Context context, int i) {
        super(context, i);
    }

    private String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        String[] split = str2.split(",");
        if (split.length <= 10) {
            return str2;
        }
        String str3 = str;
        for (int length = split.length - 1; length >= split.length - 10; length--) {
            str3 = str3 + split[length];
        }
        return str3;
    }

    public int a() {
        return 12;
    }

    /* renamed from: a  reason: collision with other method in class */
    public im m211a() {
        return im.BroadcastAction;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m212a() {
        String str = "";
        if (!TextUtils.isEmpty(f81989a)) {
            str = a(ep.f319a, f81989a);
            f81989a = "";
        }
        if (TextUtils.isEmpty(f81990b)) {
            return str;
        }
        String str2 = str + a(ep.f81986b, f81990b);
        f81990b = "";
        return str2;
    }
}
