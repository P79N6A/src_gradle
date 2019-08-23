package com.ss.android.h.b;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.ss.android.h.b;
import com.ss.android.h.f;
import java.io.File;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f29111b;

    /* renamed from: a  reason: collision with root package name */
    public Context f29112a;

    private a(Context context) {
        if (context == null || !(context instanceof Application)) {
            throw new IllegalArgumentException("context should be application context");
        }
        this.f29112a = context;
    }

    public static a a(Context context) {
        if (f29111b == null) {
            synchronized (a.class) {
                if (f29111b == null) {
                    f29111b = new a(context);
                }
            }
        }
        return f29111b;
    }

    public final boolean a(String str, int i) {
        try {
            for (File file : new File(b.a()).listFiles()) {
                if (file.getName().contains(str)) {
                    PackageInfo packageArchiveInfo = this.f29112a.getPackageManager().getPackageArchiveInfo(file.getPath(), 0);
                    if (TextUtils.equals(packageArchiveInfo.packageName, str) && packageArchiveInfo.versionCode == i) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public final void a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                str = null;
            } else if (str.endsWith(".jar")) {
                str = str.substring(0, str.indexOf(".jar"));
            }
            String replaceAll = str.replaceAll("\\.", "_");
            if (f.a(this.f29112a).f29128e != null) {
                f.a(this.f29112a).f29128e.a(this.f29112a, replaceAll, str2, 0, 0, null);
            }
        }
    }
}
