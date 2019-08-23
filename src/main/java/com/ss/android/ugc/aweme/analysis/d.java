package com.ss.android.ugc.aweme.analysis;

import android.content.Context;
import com.crashlytics.android.Crashlytics;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.CustomEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.b;
import java.util.Map;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33320a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f33321b;

    public final void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f33320a, false, 21610, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f33320a, false, 21610, new Class[]{Context.class}, Void.TYPE);
        }
    }

    public final String b() {
        return "CrashlyticsCore";
    }

    public final boolean a() {
        return this.f33321b;
    }

    public d(boolean z) {
        this.f33321b = z;
    }

    public final void a(String str, Object obj) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, obj}, this, f33320a, false, 21608, new Class[]{String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, obj}, this, f33320a, false, 21608, new Class[]{String.class, Object.class}, Void.TYPE);
            return;
        }
        Crashlytics.setString(str2, String.valueOf(obj));
    }

    public final void a(String str, Throwable th) {
        if (PatchProxy.isSupport(new Object[]{str, th}, this, f33320a, false, 21606, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, th}, this, f33320a, false, 21606, new Class[]{String.class, Throwable.class}, Void.TYPE);
            return;
        }
        Crashlytics.logException(th);
    }

    public final void a(int i, String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, str2}, this, f33320a, false, 21607, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, str2}, this, f33320a, false, 21607, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        Crashlytics.log(i, str, str2);
    }

    public final void a(String str, String str2, Exception exc) {
        if (PatchProxy.isSupport(new Object[]{str, str2, exc}, this, f33320a, false, 21605, new Class[]{String.class, String.class, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, exc}, this, f33320a, false, 21605, new Class[]{String.class, String.class, Exception.class}, Void.TYPE);
            return;
        }
        Crashlytics.logException(exc);
    }

    public final void a(String str, String str2, Map<String, String> map) {
        String str3 = str2;
        if (PatchProxy.isSupport(new Object[]{str, str3, map}, this, f33320a, false, 21609, new Class[]{String.class, String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str3, map}, this, f33320a, false, 21609, new Class[]{String.class, String.class, Map.class}, Void.TYPE);
            return;
        }
        try {
            CustomEvent customEvent = new CustomEvent(str3);
            if (map != null && !map.isEmpty()) {
                for (Map.Entry next : map.entrySet()) {
                    String str4 = (String) next.getKey();
                    String str5 = (String) next.getValue();
                    if (str5 != null) {
                        customEvent.putCustomAttribute(str4, str5);
                    }
                }
            }
            Answers.getInstance().logCustom(customEvent);
        } catch (Exception unused) {
        }
    }
}
