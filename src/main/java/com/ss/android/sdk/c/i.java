package com.ss.android.sdk.c;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f30744a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30745b;

    /* renamed from: c  reason: collision with root package name */
    public String f30746c;

    /* renamed from: d  reason: collision with root package name */
    public long f30747d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f30748e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f30749f = new ArrayList();
    public final List<String> g = new ArrayList();

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        return str + "_" + str2;
    }

    public i(String str, String str2, String str3) {
        this.f30744a = str2 == null ? "" : str2;
        this.f30745b = str3 == null ? "" : str3;
        this.f30746c = str == null ? "" : str;
    }
}
