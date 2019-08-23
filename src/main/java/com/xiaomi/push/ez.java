package com.xiaomi.push;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class ez extends ex {

    /* renamed from: a  reason: collision with root package name */
    private boolean f81996a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f81997b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f81998c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f81999d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f82000e;

    public ez(Context context, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(context, i);
        this.f81996a = z;
        this.f81997b = z2;
        this.f81998c = z3;
        this.f81999d = z4;
        this.f82000e = z5;
    }

    private String b() {
        if (!this.f81996a) {
            return "off";
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) this.f321a.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.heightPixels + "," + displayMetrics.widthPixels;
        } catch (Throwable unused) {
            return "";
        }
    }

    private String c() {
        if (!this.f81997b) {
            return "off";
        }
        try {
            return Build.VERSION.RELEASE;
        } catch (Throwable unused) {
            return "";
        }
    }

    private String d() {
        if (!this.f81998c) {
            return "off";
        }
        try {
            return String.valueOf(Build.VERSION.SDK_INT);
        } catch (Throwable unused) {
            return "";
        }
    }

    private String e() {
        if (!this.f81999d) {
            return "off";
        }
        try {
            return Settings.Secure.getString(this.f321a.getContentResolver(), "android_id");
        } catch (Throwable unused) {
            return "";
        }
    }

    private String f() {
        if (!this.f82000e) {
            return "off";
        }
        try {
            return ((TelephonyManager) this.f321a.getSystemService("phone")).getSimOperator();
        } catch (Throwable unused) {
            return "";
        }
    }

    public int a() {
        return 3;
    }

    /* renamed from: a  reason: collision with other method in class */
    public im m217a() {
        return im.DeviceInfoV2;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m218a() {
        return b() + "|" + c() + "|" + d() + "|" + e() + "|" + f();
    }
}
