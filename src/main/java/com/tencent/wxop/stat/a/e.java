package com.tencent.wxop.stat.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.tencent.wxop.stat.d;
import java.util.Locale;
import java.util.TimeZone;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    String f79795a;

    /* renamed from: b  reason: collision with root package name */
    String f79796b;

    /* renamed from: c  reason: collision with root package name */
    DisplayMetrics f79797c;

    /* renamed from: d  reason: collision with root package name */
    int f79798d;

    /* renamed from: e  reason: collision with root package name */
    String f79799e;

    /* renamed from: f  reason: collision with root package name */
    String f79800f;
    String g;
    String h;
    String i;
    String j;
    String k;
    int l;
    String m;
    String n;
    Context o;
    String p;
    String q;
    String r;
    String s;

    /* synthetic */ e(Context context, byte b2) {
        this(context);
    }

    private e(Context context) {
        String str;
        this.f79796b = "2.0.4";
        this.f79798d = Build.VERSION.SDK_INT;
        this.f79799e = Build.MODEL;
        this.f79800f = Build.MANUFACTURER;
        this.g = Locale.getDefault().getLanguage();
        this.l = 0;
        String str2 = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.o = context.getApplicationContext();
        Context context2 = this.o;
        if (n.f79818a == null) {
            n.f79818a = new DisplayMetrics();
            ((WindowManager) context2.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(n.f79818a);
        }
        this.f79797c = n.f79818a;
        this.f79795a = n.f(this.o);
        this.h = d.g();
        this.i = n.e(this.o);
        this.j = TimeZone.getDefault().getID();
        this.l = n.b();
        this.k = n.j(this.o);
        this.m = this.o.getPackageName();
        if (this.f79798d >= 14) {
            this.p = n.o(this.o);
        }
        this.q = n.e().toString();
        this.r = n.n(this.o);
        if (n.c(n.f79819b)) {
            str = n.f79819b;
        } else {
            long blockSize = (long) new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
            new StatFs(Environment.getDataDirectory().getPath());
            str = String.valueOf((((long) r4.getBlockSize()) * ((long) r4.getAvailableBlocks())) / 1000000) + "/" + String.valueOf((((long) r2.getBlockCount()) * blockSize) / 1000000);
            n.f79819b = str;
        }
        this.s = str;
        Context context3 = this.o;
        if (context3 != null) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            ResolveInfo resolveActivity = context3.getPackageManager().resolveActivity(intent, 0);
            if (resolveActivity.activityInfo != null && !resolveActivity.activityInfo.packageName.equals("android")) {
                str2 = resolveActivity.activityInfo.packageName;
            }
        }
        this.n = str2;
    }
}
