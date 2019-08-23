package com.ss.android.ugc.aweme.im.sdk;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class b<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f22838a;

    /* renamed from: b  reason: collision with root package name */
    public Context f22839b;

    /* renamed from: c  reason: collision with root package name */
    protected View f22840c;

    /* renamed from: d  reason: collision with root package name */
    public T f22841d;

    public void a() {
    }

    public void b() {
    }

    public final Context c() {
        return this.f22839b;
    }

    public final Activity d() {
        return (Activity) this.f22839b;
    }

    public b(Context context, View view) {
        this.f22839b = context;
        this.f22840c = view;
        if (PatchProxy.isSupport(new Object[0], this, f22838a, false, 50115, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f22838a, false, 50115, new Class[0], Void.TYPE);
            return;
        }
        a();
        b();
    }
}
