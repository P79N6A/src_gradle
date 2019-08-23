package com.ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.j;
import com.ss.android.ugc.aweme.crossplatform.params.base.a;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.c;
import com.ss.android.ugc.aweme.crossplatform.view.a;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public class CommercializeWebViewHelper extends ac implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2940a;
    private LifecycleOwner h;
    private long i;

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    public final /* bridge */ /* synthetic */ void f() {
        super.f();
    }

    @NonNull
    public final /* bridge */ /* synthetic */ a c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ c d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ String g() {
        return super.g();
    }

    @NonNull
    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    @NotNull
    public /* bridge */ /* synthetic */ j getCrossPlatformBusiness() {
        return super.getCrossPlatformBusiness();
    }

    @NotNull
    public /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.crossplatform.params.base.a getCrossPlatformParams() {
        return super.getCrossPlatformParams();
    }

    public final /* bridge */ /* synthetic */ boolean a() {
        return super.a();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f2940a, false, 32476, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2940a, false, 32476, new Class[0], Void.TYPE);
            return;
        }
        this.f2943d.a(this.f2942c);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f2940a, false, 32479, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2940a, false, 32479, new Class[0], Void.TYPE);
            return;
        }
        this.f2943d.d(this.f2942c);
        this.h.getLifecycle().removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f2940a, false, 32478, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2940a, false, 32478, new Class[0], Void.TYPE);
            return;
        }
        this.f2943d.c(this.f2942c);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.g.a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.a(false);
        }
        long currentTimeMillis = System.currentTimeMillis() - this.i;
        this.i = 0;
        d a2 = d.a();
        a2.a("duration", currentTimeMillis);
        r.a("h5_stay_time", (Map) a2.f34114b);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f2940a, false, 32477, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2940a, false, 32477, new Class[0], Void.TYPE);
            return;
        }
        this.f2943d.b(this.f2942c);
        this.g.a();
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.g.a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.a();
        }
        this.i = System.currentTimeMillis();
    }

    public final /* bridge */ /* synthetic */ void a(CharSequence charSequence) {
        super.a(charSequence);
    }

    public final /* bridge */ /* synthetic */ void a(String str) {
        super.a(str);
    }

    private CommercializeWebViewHelper(@NonNull Activity activity, @NonNull a aVar, @NonNull c cVar, @NonNull com.ss.android.ugc.aweme.crossplatform.params.base.a aVar2, @NonNull LifecycleOwner lifecycleOwner) {
        super(activity, aVar, cVar, aVar2);
        aVar.setCrossPlatformActivityContainer(this);
        this.h = lifecycleOwner;
        this.h.getLifecycle().addObserver(this);
    }

    @NonNull
    public static CommercializeWebViewHelper a(@NonNull a aVar, @NonNull c cVar, @NonNull LifecycleOwner lifecycleOwner, @NonNull Activity activity, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{aVar, cVar, lifecycleOwner, activity, bundle}, null, f2940a, true, 32474, new Class[]{a.class, c.class, LifecycleOwner.class, Activity.class, Bundle.class}, CommercializeWebViewHelper.class)) {
            return (CommercializeWebViewHelper) PatchProxy.accessDispatch(new Object[]{aVar, cVar, lifecycleOwner, activity, bundle}, null, f2940a, true, 32474, new Class[]{a.class, c.class, LifecycleOwner.class, Activity.class, Bundle.class}, CommercializeWebViewHelper.class);
        }
        CommercializeWebViewHelper commercializeWebViewHelper = new CommercializeWebViewHelper(activity, aVar, cVar, a.C0525a.a(bundle), lifecycleOwner);
        return commercializeWebViewHelper;
    }
}
