package com.ss.android.ugc.aweme.analysis;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.agilelogger.ALog;
import com.ss.android.agilelogger.a;
import com.ss.android.ugc.aweme.framework.a.b;
import java.io.File;
import java.util.Map;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33317a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f33318b;

    public final void a(String str, Object obj) {
    }

    public final void a(String str, String str2, Map map) {
        if (PatchProxy.isSupport(new Object[]{str, str2, map}, this, f33317a, false, 21583, new Class[]{String.class, String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, map}, this, f33317a, false, 21583, new Class[]{String.class, String.class, Map.class}, Void.TYPE);
        }
    }

    public final String b() {
        return "AppLog";
    }

    public final boolean a() {
        return this.f33318b;
    }

    public a(boolean z) {
        this.f33318b = z;
    }

    public final void a(Context context) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{context}, this, f33317a, false, 21579, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f33317a, false, 21579, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.C0323a aVar = new a.C0323a(context.getApplicationContext());
        aVar.f27865a = 52428800;
        aVar.f27866b = 2097152;
        com.ss.android.agilelogger.a aVar2 = new com.ss.android.agilelogger.a((byte) 0);
        aVar2.f27859a = aVar.f27865a;
        aVar2.f27860b = aVar.f27866b;
        if (TextUtils.isEmpty(aVar.f27869e)) {
            File filesDir = ALog.getContext().getFilesDir();
            if (filesDir != null) {
                File file = new File(filesDir.getAbsolutePath(), "ALOG");
                if (!file.exists()) {
                    file.mkdir();
                }
                str = file.getAbsolutePath();
            } else {
                str = null;
            }
        } else {
            str = aVar.f27869e;
        }
        aVar2.f27861c = str;
        aVar2.h = aVar.f27867c;
        if (TextUtils.isEmpty(aVar.f27870f)) {
            Context context2 = ALog.getContext();
            File externalFilesDir = context2.getExternalFilesDir("logs");
            if (externalFilesDir == null) {
                externalFilesDir = new File(context2.getFilesDir(), "logs");
            }
            if (!externalFilesDir.exists()) {
                externalFilesDir.mkdir();
            }
            str2 = externalFilesDir.getAbsolutePath();
        } else {
            str2 = aVar.f27870f;
        }
        aVar2.f27862d = str2;
        aVar2.f27863e = aVar.g;
        aVar2.f27864f = aVar.h;
        aVar2.g = aVar.f27868d;
        ALog.setsPackageClassName(com.ss.android.ugc.aweme.framework.a.a.class.getCanonicalName());
        ALog.setDebug(false);
        ALog.init(aVar2);
        com.ss.b.a.a.a(new b());
    }

    public final void a(String str, Throwable th) {
        if (PatchProxy.isSupport(new Object[]{str, th}, this, f33317a, false, 21581, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, th}, this, f33317a, false, 21581, new Class[]{String.class, Throwable.class}, Void.TYPE);
            return;
        }
        ALog.e(str, th);
    }

    public final void a(int i, String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, str2}, this, f33317a, false, 21582, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, str2}, this, f33317a, false, 21582, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        switch (i) {
            case 2:
                ALog.v(str, str2);
                return;
            case 3:
                ALog.d(str, str2);
                return;
            case 4:
                ALog.i(str, str2);
                return;
            case 5:
                ALog.w(str, str2);
                break;
            case 6:
                ALog.e(str, str2);
                return;
        }
    }

    public final void a(String str, String str2, Exception exc) {
        if (PatchProxy.isSupport(new Object[]{str, str2, exc}, this, f33317a, false, 21580, new Class[]{String.class, String.class, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, exc}, this, f33317a, false, 21580, new Class[]{String.class, String.class, Exception.class}, Void.TYPE);
            return;
        }
        ALog.e(str, str2, exc);
    }
}
