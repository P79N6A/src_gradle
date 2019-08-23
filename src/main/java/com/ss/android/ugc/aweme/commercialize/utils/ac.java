package com.ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.crossplatform.activity.f;
import com.ss.android.ugc.aweme.crossplatform.business.j;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.c;
import com.ss.android.ugc.aweme.crossplatform.view.a;
import com.ss.android.ugc.aweme.crossplatform.view.h;
import org.jetbrains.annotations.NotNull;

public class ac implements f {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f2941b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    protected final Activity f2942c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    protected a f2943d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    protected c f2944e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    protected final com.ss.android.ugc.aweme.crossplatform.params.base.a f2945f;
    @NonNull
    protected final j g = j.a.a(this);

    public void a(CharSequence charSequence) {
    }

    public void e() {
    }

    public void f() {
    }

    public String g() {
        return null;
    }

    @NonNull
    public a c() {
        return this.f2943d;
    }

    public c d() {
        return this.f2944e;
    }

    @NonNull
    public Context getContext() {
        return this.f2942c;
    }

    @NotNull
    public j getCrossPlatformBusiness() {
        return this.g;
    }

    @NotNull
    public com.ss.android.ugc.aweme.crossplatform.params.base.a getCrossPlatformParams() {
        return this.f2945f;
    }

    public boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f2941b, false, 32528, new Class[0], Boolean.TYPE)) {
            return this.f2943d.a();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2941b, false, 32528, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f2941b, false, 32527, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2941b, false, 32527, new Class[0], Void.TYPE);
            return;
        }
        this.f2943d.b();
    }

    public void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f2941b, false, 32526, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f2941b, false, 32526, new Class[]{String.class}, Void.TYPE);
            return;
        }
        ((h) this.f2943d.a(h.class)).a(str2);
    }

    ac(@NonNull Activity activity, @NonNull a aVar, @NonNull c cVar, @NonNull com.ss.android.ugc.aweme.crossplatform.params.base.a aVar2) {
        this.f2942c = activity;
        this.f2943d = aVar;
        this.f2944e = cVar;
        this.f2945f = aVar2;
    }
}
