package com.ss.android.ugc.aweme.fe.b;

import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.q.c;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44412a;

    /* renamed from: b  reason: collision with root package name */
    public SharedPreferences f44413b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences.Editor f44414c;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static d f44415a = new d((byte) 0);
    }

    public static d a() {
        return a.f44415a;
    }

    private d() {
        this.f44413b = c.a(com.ss.android.ugc.aweme.framework.core.a.b().f3307e, "fe-storage", 0);
    }

    private SharedPreferences.Editor b() {
        if (PatchProxy.isSupport(new Object[0], this, f44412a, false, 39890, new Class[0], SharedPreferences.Editor.class)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(new Object[0], this, f44412a, false, 39890, new Class[0], SharedPreferences.Editor.class);
        }
        if (this.f44414c == null) {
            this.f44414c = this.f44413b.edit();
        }
        return this.f44414c;
    }

    /* synthetic */ d(byte b2) {
        this();
    }

    public final Boolean a(String str, Boolean bool) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2, bool}, this, f44412a, false, 39893, new Class[]{String.class, Boolean.class}, Boolean.class)) {
            return Boolean.valueOf(this.f44413b.getBoolean(str2, bool.booleanValue()));
        }
        return (Boolean) PatchProxy.accessDispatch(new Object[]{str2, bool}, this, f44412a, false, 39893, new Class[]{String.class, Boolean.class}, Boolean.class);
    }

    public final void b(String str, Boolean bool) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, bool}, this, f44412a, false, 39897, new Class[]{String.class, Boolean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, bool}, this, f44412a, false, 39897, new Class[]{String.class, Boolean.class}, Void.TYPE);
            return;
        }
        b().putBoolean(str2, bool.booleanValue()).apply();
    }

    public final Integer a(String str, Integer num) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2, num}, this, f44412a, false, 39891, new Class[]{String.class, Integer.class}, Integer.class)) {
            return Integer.valueOf(this.f44413b.getInt(str2, num.intValue()));
        }
        return (Integer) PatchProxy.accessDispatch(new Object[]{str2, num}, this, f44412a, false, 39891, new Class[]{String.class, Integer.class}, Integer.class);
    }

    public final void b(String str, Integer num) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, num}, this, f44412a, false, 39895, new Class[]{String.class, Integer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, num}, this, f44412a, false, 39895, new Class[]{String.class, Integer.class}, Void.TYPE);
            return;
        }
        b().putInt(str2, num.intValue()).apply();
    }

    public final String a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (!PatchProxy.isSupport(new Object[]{str3, str4}, this, f44412a, false, 39894, new Class[]{String.class, String.class}, String.class)) {
            return this.f44413b.getString(str3, str4);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f44412a, false, 39894, new Class[]{String.class, String.class}, String.class);
    }

    public final void b(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f44412a, false, 39898, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f44412a, false, 39898, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        b().putString(str3, str4).apply();
    }

    public final boolean a(String str, Object obj) {
        String str2 = str;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{str2, obj2}, this, f44412a, false, 39901, new Class[]{String.class, Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, obj2}, this, f44412a, false, 39901, new Class[]{String.class, Object.class}, Boolean.TYPE)).booleanValue();
        } else if (str2 == null || obj2 == null) {
            return false;
        } else {
            try {
                if (obj2 instanceof String) {
                    try {
                        b(str2, (String) obj2);
                        return true;
                    } catch (Exception unused) {
                        return false;
                    }
                } else {
                    return false;
                }
            } catch (Exception unused2) {
                return false;
            }
        }
    }
}
