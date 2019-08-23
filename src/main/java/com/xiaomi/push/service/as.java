package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import com.xiaomi.push.ac;

public class as {

    /* renamed from: a  reason: collision with root package name */
    private static as f82522a;

    /* renamed from: a  reason: collision with other field name */
    private int f949a;

    /* renamed from: a  reason: collision with other field name */
    private Context f950a;

    private as(Context context) {
        this.f950a = context.getApplicationContext();
    }

    public static as a(Context context) {
        if (f82522a == null) {
            f82522a = new as(context);
        }
        return f82522a;
    }

    @SuppressLint({"NewApi"})
    public int a() {
        if (this.f949a == 0) {
            this.f949a = Build.VERSION.SDK_INT >= 17 ? Settings.Global.getInt(this.f950a.getContentResolver(), "device_provisioned", 0) : Settings.Secure.getInt(this.f950a.getContentResolver(), "device_provisioned", 0);
        }
        return this.f949a;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a  reason: collision with other method in class */
    public Uri m612a() {
        return Build.VERSION.SDK_INT >= 17 ? Settings.Global.getUriFor("device_provisioned") : Settings.Secure.getUriFor("device_provisioned");
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m613a() {
        return ac.f144a.contains("xmsf") || ac.f144a.contains("xiaomi") || ac.f144a.contains("miui");
    }
}
