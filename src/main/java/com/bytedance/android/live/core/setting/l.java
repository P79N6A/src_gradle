package com.bytedance.android.live.core.setting;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Type;

public class l<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8180a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8181b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8182c;

    /* renamed from: d  reason: collision with root package name */
    public final T f8183d;

    /* renamed from: e  reason: collision with root package name */
    public final T f8184e;

    /* renamed from: f  reason: collision with root package name */
    public final Type f8185f;
    public final String[] g;

    public T a() {
        if (PatchProxy.isSupport(new Object[0], this, f8180a, false, 927, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f8180a, false, 927, new Class[0], Object.class);
        } else if (m.b()) {
            return this.f8184e;
        } else {
            return m.a("key_ttlive_sdk_setting", this.f8181b, this.f8185f, this.f8183d);
        }
    }

    @Deprecated
    public l(String str, Class<T> cls) {
        this(str, cls, "");
    }

    @Deprecated
    public l(String str, @NonNull T t) {
        this(str, t, "");
    }

    @Deprecated
    public l(String str, @NonNull T t, String str2) {
        this(str, str2, t, t);
    }

    @Deprecated
    public l(String str, Class<T> cls, String str2) {
        this(str, cls, str2, (T) null, (T) null);
    }

    @Deprecated
    public l(String str, @NonNull T t, String str2, String... strArr) {
        this(str, str2, t, t, strArr);
    }

    public l(String str, String str2, @NonNull T t, @NonNull T t2) {
        this(str, t.getClass(), str2, t, t2, null);
    }

    public l(String str, Class<T> cls, String str2, T t, T t2) {
        this(str, cls, str2, null, null, null);
    }

    public l(String str, String str2, @NonNull T t, @NonNull T t2, String... strArr) {
        this(str, t.getClass(), str2, t, t2, strArr);
    }

    private l(String str, Class<T> cls, String str2, T t, T t2, String[] strArr) {
        this.f8181b = str;
        this.f8182c = str2;
        this.f8183d = t;
        this.f8184e = t2;
        this.f8185f = cls;
        this.g = strArr;
    }
}
