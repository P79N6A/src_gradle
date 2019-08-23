package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.common.d;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f80916a = "native";

    /* renamed from: b  reason: collision with root package name */
    public static String f80917b = "";

    /* renamed from: c  reason: collision with root package name */
    public static int f80918c;

    /* renamed from: d  reason: collision with root package name */
    private static String f80919d;

    public static String a(Context context) {
        if (TextUtils.isEmpty(f80919d)) {
            f80919d = d.a(context).b();
        }
        return f80919d;
    }
}
