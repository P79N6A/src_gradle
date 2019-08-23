package com.ss.android.ugc.aweme.framework.core;

import android.app.Activity;
import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3303a;

    /* renamed from: b  reason: collision with root package name */
    public String f3304b;

    /* renamed from: c  reason: collision with root package name */
    public String f3305c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3306d;

    /* renamed from: e  reason: collision with root package name */
    public Application f3307e;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<Activity> f3308f;

    /* renamed from: com.ss.android.ugc.aweme.framework.core.a$a  reason: collision with other inner class name */
    static final class C0025a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3309a = new a((byte) 0);
    }

    private a() {
    }

    public static a b() {
        return C0025a.f3309a;
    }

    public final Activity a() {
        if (PatchProxy.isSupport(new Object[0], this, f3303a, false, 45896, new Class[0], Activity.class)) {
            return (Activity) PatchProxy.accessDispatch(new Object[0], this, f3303a, false, 45896, new Class[0], Activity.class);
        } else if (this.f3308f != null) {
            return (Activity) this.f3308f.get();
        } else {
            return null;
        }
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final void a(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, f3303a, false, 45895, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, f3303a, false, 45895, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        this.f3308f = new WeakReference<>(activity2);
    }
}
