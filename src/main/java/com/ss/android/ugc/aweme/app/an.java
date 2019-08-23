package com.ss.android.ugc.aweme.app;

import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.Set;

public class an<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2631a;

    /* renamed from: b  reason: collision with root package name */
    protected T f2632b;

    /* renamed from: c  reason: collision with root package name */
    public String f2633c;

    public final SharedPreferences a() {
        if (!PatchProxy.isSupport(new Object[0], this, f2631a, false, 22945, new Class[0], SharedPreferences.class)) {
            return SharePrefCache.inst().getSharePref();
        }
        return (SharedPreferences) PatchProxy.accessDispatch(new Object[0], this, f2631a, false, 22945, new Class[0], SharedPreferences.class);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f2631a, false, 22946, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2631a, false, 22946, new Class[0], Void.TYPE);
            return;
        }
        b(this.f2632b);
    }

    public T c() {
        T t;
        if (PatchProxy.isSupport(new Object[0], this, f2631a, false, 22951, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f2631a, false, 22951, new Class[0], Object.class);
        }
        SharedPreferences a2 = a();
        try {
            Class<?> cls = this.f2632b.getClass();
            if (cls == String.class) {
                t = a2.getString(this.f2633c, (String) this.f2632b);
            } else if (cls == Integer.class) {
                t = Integer.valueOf(a2.getInt(this.f2633c, ((Integer) this.f2632b).intValue()));
            } else if (cls == Float.class) {
                t = Float.valueOf(a2.getFloat(this.f2633c, ((Float) this.f2632b).floatValue()));
            } else if (cls == Long.class) {
                t = Long.valueOf(a2.getLong(this.f2633c, ((Long) this.f2632b).longValue()));
            } else if (cls == Boolean.class) {
                t = Boolean.valueOf(a2.getBoolean(this.f2633c, ((Boolean) this.f2632b).booleanValue()));
            } else if (Set.class.isAssignableFrom(cls)) {
                t = a2.getStringSet(this.f2633c, (Set) this.f2632b);
            } else {
                throw new AssertionError();
            }
            if (t == null) {
                b(this.f2632b);
                t = this.f2632b;
            }
            if (t.getClass() != this.f2632b.getClass()) {
                t = this.f2632b;
            }
            return t;
        } catch (Exception unused) {
            return this.f2632b;
        }
    }

    private void b(T t) {
        T t2 = t;
        if (PatchProxy.isSupport(new Object[]{t2}, this, f2631a, false, 22947, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t2}, this, f2631a, false, 22947, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a(t2, false);
    }

    public final void a(T t) {
        T t2 = t;
        if (PatchProxy.isSupport(new Object[]{t2}, this, f2631a, false, 22952, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t2}, this, f2631a, false, 22952, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        b(t2, false);
    }

    public an(String str, T t) {
        if (t != null) {
            this.f2632b = t;
            this.f2633c = str;
            return;
        }
        throw new NullPointerException();
    }

    public void a(SharedPreferences.Editor editor, T t) {
        if (PatchProxy.isSupport(new Object[]{editor, t}, this, f2631a, false, 22949, new Class[]{SharedPreferences.Editor.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{editor, t}, this, f2631a, false, 22949, new Class[]{SharedPreferences.Editor.class, Object.class}, Void.TYPE);
        } else if (t instanceof String) {
            editor.putString(this.f2633c, (String) t);
        } else if (t instanceof Integer) {
            editor.putInt(this.f2633c, ((Integer) t).intValue());
        } else if (t instanceof Float) {
            editor.putFloat(this.f2633c, ((Float) t).floatValue());
        } else if (t instanceof Long) {
            editor.putLong(this.f2633c, ((Long) t).longValue());
        } else if (t instanceof Boolean) {
            editor.putBoolean(this.f2633c, ((Boolean) t).booleanValue());
        } else {
            if (t instanceof Set) {
                editor.putStringSet(this.f2633c, (Set) t);
            }
        }
    }

    public final void b(SharedPreferences.Editor editor, T t) {
        if (PatchProxy.isSupport(new Object[]{editor, t}, this, f2631a, false, 22954, new Class[]{SharedPreferences.Editor.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{editor, t}, this, f2631a, false, 22954, new Class[]{SharedPreferences.Editor.class, Object.class}, Void.TYPE);
        } else if (editor != null) {
            AbTestManager.a();
            a(editor, t);
        } else {
            throw new IllegalArgumentException("editor can not be null!");
        }
    }

    public void a(T t, boolean z) {
        if (PatchProxy.isSupport(new Object[]{t, Byte.valueOf(z ? (byte) 1 : 0)}, this, f2631a, false, 22948, new Class[]{Object.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t, Byte.valueOf(z)}, this, f2631a, false, 22948, new Class[]{Object.class, Boolean.TYPE}, Void.TYPE);
        } else if (t != null) {
            SharedPreferences.Editor edit = a().edit();
            if (t instanceof String) {
                edit.putString(this.f2633c, (String) t);
            } else if (t instanceof Integer) {
                edit.putInt(this.f2633c, ((Integer) t).intValue());
            } else if (t instanceof Float) {
                edit.putFloat(this.f2633c, ((Float) t).floatValue());
            } else if (t instanceof Long) {
                edit.putLong(this.f2633c, ((Long) t).longValue());
            } else if (t instanceof Boolean) {
                edit.putBoolean(this.f2633c, ((Boolean) t).booleanValue());
            } else if (t instanceof Set) {
                edit.putStringSet(this.f2633c, (Set) t);
            }
            if (z) {
                edit.commit();
            } else {
                edit.apply();
            }
        }
    }

    public final void b(T t, boolean z) {
        if (PatchProxy.isSupport(new Object[]{t, Byte.valueOf(z ? (byte) 1 : 0)}, this, f2631a, false, 22953, new Class[]{Object.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t, Byte.valueOf(z)}, this, f2631a, false, 22953, new Class[]{Object.class, Boolean.TYPE}, Void.TYPE);
        } else if (t != null) {
            a(t, z);
        }
    }
}
