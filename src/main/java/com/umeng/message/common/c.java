package com.umeng.message.common;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.PushAgent;
import com.umeng.message.proguard.k;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f81151a = "com.umeng.message.common.c";

    /* renamed from: b  reason: collision with root package name */
    private static c f81152b;

    /* renamed from: e  reason: collision with root package name */
    private static Class f81153e;

    /* renamed from: f  reason: collision with root package name */
    private static Class f81154f;
    private static Class g;
    private static Class h;
    private static Class i;
    private static Class j;
    private static Class k;
    private static Class l;

    /* renamed from: c  reason: collision with root package name */
    private Context f81155c;

    /* renamed from: d  reason: collision with root package name */
    private String f81156d;

    public String a() {
        if (TextUtils.isEmpty(this.f81156d)) {
            return this.f81155c.getPackageName();
        }
        return this.f81156d;
    }

    public void k(String str) {
        this.f81156d = str;
    }

    public int a(String str) {
        return a(h, str);
    }

    public int b(String str) {
        return a(f81153e, str);
    }

    public int c(String str) throws Exception {
        return b(f81153e, str);
    }

    public int d(String str) {
        return a(f81154f, str);
    }

    public int e(String str) {
        return a(g, str);
    }

    public int f(String str) throws Exception {
        return b(g, str);
    }

    public int g(String str) {
        return a(i, str);
    }

    public int h(String str) {
        return a(j, str);
    }

    public int i(String str) {
        return a(k, str);
    }

    public int j(String str) {
        return a(l, str);
    }

    public static c a(Context context) {
        if (f81152b == null) {
            f81152b = new c(context);
        }
        return f81152b;
    }

    private c(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        this.f81155c = context.getApplicationContext();
        String str9 = f81151a;
        UMLog.mutlInfo(str9, 2, "packageName=" + this.f81155c.getPackageName());
        try {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(PushAgent.getInstance(this.f81155c).getResourcePackageName())) {
                str8 = PushAgent.getInstance(this.f81155c).getResourcePackageName();
            } else {
                str8 = this.f81155c.getPackageName();
            }
            sb.append(str8);
            sb.append(".R$drawable");
            f81154f = Class.forName(sb.toString());
        } catch (ClassNotFoundException e2) {
            UMLog.mutlInfo(f81151a, 0, e2.getMessage());
            UMLog.aq(k.f81299c, 0, "\\|");
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(PushAgent.getInstance(this.f81155c).getResourcePackageName())) {
                str7 = PushAgent.getInstance(this.f81155c).getResourcePackageName();
            } else {
                str7 = this.f81155c.getPackageName();
            }
            sb2.append(str7);
            sb2.append(".R$layout");
            g = Class.forName(sb2.toString());
        } catch (ClassNotFoundException e3) {
            UMLog.mutlInfo(f81151a, 0, e3.getMessage());
        }
        try {
            StringBuilder sb3 = new StringBuilder();
            if (!TextUtils.isEmpty(PushAgent.getInstance(this.f81155c).getResourcePackageName())) {
                str6 = PushAgent.getInstance(this.f81155c).getResourcePackageName();
            } else {
                str6 = this.f81155c.getPackageName();
            }
            sb3.append(str6);
            sb3.append(".R$id");
            f81153e = Class.forName(sb3.toString());
        } catch (ClassNotFoundException e4) {
            UMLog.mutlInfo(f81151a, 0, e4.getMessage());
        }
        try {
            StringBuilder sb4 = new StringBuilder();
            if (!TextUtils.isEmpty(PushAgent.getInstance(this.f81155c).getResourcePackageName())) {
                str5 = PushAgent.getInstance(this.f81155c).getResourcePackageName();
            } else {
                str5 = this.f81155c.getPackageName();
            }
            sb4.append(str5);
            sb4.append(".R$anim");
            h = Class.forName(sb4.toString());
        } catch (ClassNotFoundException e5) {
            UMLog.mutlInfo(f81151a, 0, e5.getMessage());
        }
        try {
            StringBuilder sb5 = new StringBuilder();
            if (!TextUtils.isEmpty(PushAgent.getInstance(this.f81155c).getResourcePackageName())) {
                str4 = PushAgent.getInstance(this.f81155c).getResourcePackageName();
            } else {
                str4 = this.f81155c.getPackageName();
            }
            sb5.append(str4);
            sb5.append(".R$style");
            i = Class.forName(sb5.toString());
        } catch (ClassNotFoundException e6) {
            UMLog.mutlInfo(f81151a, 0, e6.getMessage());
        }
        try {
            StringBuilder sb6 = new StringBuilder();
            if (!TextUtils.isEmpty(PushAgent.getInstance(this.f81155c).getResourcePackageName())) {
                str3 = PushAgent.getInstance(this.f81155c).getResourcePackageName();
            } else {
                str3 = this.f81155c.getPackageName();
            }
            sb6.append(str3);
            sb6.append(".R$string");
            j = Class.forName(sb6.toString());
        } catch (ClassNotFoundException e7) {
            UMLog.mutlInfo(f81151a, 0, e7.getMessage());
        }
        try {
            StringBuilder sb7 = new StringBuilder();
            if (!TextUtils.isEmpty(PushAgent.getInstance(this.f81155c).getResourcePackageName())) {
                str2 = PushAgent.getInstance(this.f81155c).getResourcePackageName();
            } else {
                str2 = this.f81155c.getPackageName();
            }
            sb7.append(str2);
            sb7.append(".R$array");
            k = Class.forName(sb7.toString());
        } catch (ClassNotFoundException e8) {
            UMLog.mutlInfo(f81151a, 0, e8.getMessage());
        }
        try {
            StringBuilder sb8 = new StringBuilder();
            if (!TextUtils.isEmpty(PushAgent.getInstance(this.f81155c).getResourcePackageName())) {
                str = PushAgent.getInstance(this.f81155c).getResourcePackageName();
            } else {
                str = this.f81155c.getPackageName();
            }
            sb8.append(str);
            sb8.append(".R$raw");
            l = Class.forName(sb8.toString());
        } catch (ClassNotFoundException e9) {
            UMLog.mutlInfo(f81151a, 0, e9.getMessage());
        }
    }

    private int a(Class<?> cls, String str) {
        if (cls != null) {
            try {
                return cls.getField(str).getInt(str);
            } catch (Exception e2) {
                String str2 = f81151a;
                UMLog.mutlInfo(str2, 0, "getRes(" + cls.getName() + ", " + str + ")");
                UMLog.mutlInfo(f81151a, 0, "获取资源错误，确保你已经把res目录下的所有资源从SDK拷贝到了你的主工程");
                UMLog.mutlInfo(f81151a, 0, e2.getMessage());
                return -1;
            }
        } else {
            String str3 = f81151a;
            UMLog.mutlInfo(str3, 0, "getRes(null," + str + ")");
            throw new IllegalArgumentException("ResClass未初始化，请确保你已经添加了必要的资源。同时确保你在混淆文件中添加了" + this.f81155c.getPackageName() + ".R$* 。 field=" + str);
        }
    }

    private int b(Class<?> cls, String str) throws Exception {
        if (cls != null) {
            int i2 = cls.getField(str).getInt(str);
            String str2 = f81151a;
            UMLog.mutlInfo(str2, 0, "getRes(" + cls.getName() + ", " + str + ")");
            UMLog.mutlInfo(f81151a, 0, "获取资源错误，确保你已经把res目录下的所有资源从SDK拷贝到了你的主工程");
            return i2;
        }
        String str3 = f81151a;
        UMLog.mutlInfo(str3, 0, "getRes(null," + str + ")");
        throw new IllegalArgumentException("ResClass未初始化，请确保你已经添加了必要的资源。同时确保你在混淆文件中添加了" + this.f81155c.getPackageName() + ".R$* 。 field=" + str);
    }
}
