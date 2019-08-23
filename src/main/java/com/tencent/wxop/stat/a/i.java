package com.tencent.wxop.stat.a;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import java.lang.reflect.Method;

public class i {

    /* renamed from: c  reason: collision with root package name */
    private static volatile i f79802c;

    /* renamed from: a  reason: collision with root package name */
    private int f79803a = 10;

    /* renamed from: b  reason: collision with root package name */
    private int f79804b;

    /* renamed from: d  reason: collision with root package name */
    private Context f79805d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f79806e;

    private i(Context context) {
        this.f79805d = context.getApplicationContext();
        try {
            this.f79806e = s.a(this.f79805d, "android.permission.WRITE_SETTINGS");
            if (this.f79806e && Build.VERSION.SDK_INT >= 23) {
                Method declaredMethod = Settings.System.class.getDeclaredMethod("canWrite", new Class[]{Context.class});
                declaredMethod.setAccessible(true);
                this.f79806e = ((Boolean) declaredMethod.invoke(null, new Object[]{this.f79805d})).booleanValue();
            }
        } catch (Throwable unused) {
            this.f79804b++;
        }
    }

    public static i a(Context context) {
        if (f79802c == null) {
            synchronized (i.class) {
                if (f79802c == null) {
                    f79802c = new i(context);
                }
            }
        }
        return f79802c;
    }

    public final String a(String str) {
        try {
            return Settings.System.getString(this.f79805d.getContentResolver(), str);
        } catch (Throwable unused) {
            this.f79804b++;
            return null;
        }
    }

    public final boolean a(String str, String str2) {
        if (this.f79806e) {
            try {
                return Settings.System.putString(this.f79805d.getContentResolver(), str, str2);
            } catch (Throwable unused) {
                this.f79804b++;
            }
        }
        return false;
    }
}
