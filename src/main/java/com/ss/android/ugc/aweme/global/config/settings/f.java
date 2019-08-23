package com.ss.android.ugc.aweme.global.config.settings;

import android.content.SharedPreferences;
import com.bytedance.ies.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public final class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49544a;

    /* renamed from: b  reason: collision with root package name */
    boolean f49545b = false;

    /* renamed from: c  reason: collision with root package name */
    Map<String, Object> f49546c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private boolean f49547d;

    /* renamed from: e  reason: collision with root package name */
    private SharedPreferences f49548e;

    /* renamed from: f  reason: collision with root package name */
    private c f49549f;

    f() {
        b();
        this.f49549f = new c();
    }

    /* access modifiers changed from: package-private */
    public SharedPreferences a() {
        if (PatchProxy.isSupport(new Object[0], this, f49544a, false, 47577, new Class[0], SharedPreferences.class)) {
            return (SharedPreferences) PatchProxy.accessDispatch(new Object[0], this, f49544a, false, 47577, new Class[0], SharedPreferences.class);
        }
        if (this.f49548e == null) {
            this.f49548e = com.ss.android.ugc.aweme.q.c.a(k.a(), "settings-mock", 0);
        }
        return this.f49548e;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f49544a, false, 47578, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49544a, false, 47578, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f49547d && this.f49545b) {
            this.f49547d = true;
            this.f49546c.putAll(a().getAll());
        }
    }

    @Nullable
    public final <T> T a(String str, Class<T> cls, T t) {
        String str2 = str;
        Class<T> cls2 = cls;
        T t2 = t;
        if (PatchProxy.isSupport(new Object[]{str2, cls2, t2}, this, f49544a, false, 47580, new Class[]{String.class, Class.class, Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{str2, cls2, t2}, this, f49544a, false, 47580, new Class[]{String.class, Class.class, Object.class}, Object.class);
        } else if (!this.f49545b) {
            return this.f49549f.a(str2, cls2, t2);
        } else {
            T t3 = this.f49546c.get(str2);
            if (t3 == null) {
                t3 = this.f49549f.a(str2, cls2, t2);
            }
            return t3;
        }
    }

    @Nullable
    public final <T> List<T> a(String str, Class<T> cls, List<T> list) {
        String str2 = str;
        Class<T> cls2 = cls;
        List<T> list2 = list;
        if (PatchProxy.isSupport(new Object[]{str2, cls2, list2}, this, f49544a, false, 47581, new Class[]{String.class, Class.class, List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str2, cls2, list2}, this, f49544a, false, 47581, new Class[]{String.class, Class.class, List.class}, List.class);
        } else if (!this.f49545b) {
            return this.f49549f.a(str2, cls2, list2);
        } else {
            Object obj = this.f49546c.get(str2);
            if (obj == null) {
                return this.f49549f.a(str2, cls2, list2);
            }
            return (List) obj;
        }
    }
}
