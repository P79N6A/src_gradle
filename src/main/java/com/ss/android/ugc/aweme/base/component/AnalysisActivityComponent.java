package com.ss.android.ugc.aweme.base.component;

import android.app.Activity;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.lib.a;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.analysis.c;
import com.ss.android.ugc.aweme.u.ao;
import java.lang.ref.WeakReference;

public class AnalysisActivityComponent implements GenericLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34678a;

    /* renamed from: b  reason: collision with root package name */
    Activity f34679b;

    /* renamed from: c  reason: collision with root package name */
    private long f34680c;

    /* renamed from: d  reason: collision with root package name */
    private WeakReference<c> f34681d;

    private Analysis a() {
        c cVar;
        if (PatchProxy.isSupport(new Object[0], this, f34678a, false, 24557, new Class[0], Analysis.class)) {
            return (Analysis) PatchProxy.accessDispatch(new Object[0], this, f34678a, false, 24557, new Class[0], Analysis.class);
        }
        if (this.f34681d != null) {
            cVar = (c) this.f34681d.get();
        } else {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.getAnalysis();
        }
        return null;
    }

    public AnalysisActivityComponent(Activity activity) {
        this.f34679b = activity;
        if (activity instanceof c) {
            this.f34681d = new WeakReference<>((c) activity);
        }
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner, event}, this, f34678a, false, 24558, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner, event}, this, f34678a, false, 24558, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE);
            return;
        }
        switch (event) {
            case ON_RESUME:
                if (PatchProxy.isSupport(new Object[0], this, f34678a, false, 24555, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f34678a, false, 24555, new Class[0], Void.TYPE);
                    break;
                } else {
                    this.f34680c = System.currentTimeMillis();
                    return;
                }
            case ON_PAUSE:
                if (!PatchProxy.isSupport(new Object[0], this, f34678a, false, 24556, new Class[0], Void.TYPE)) {
                    if (this.f34680c != -1) {
                        long currentTimeMillis = System.currentTimeMillis() - this.f34680c;
                        if (currentTimeMillis > 0 && a() != null && !TextUtils.isEmpty(a().getLabelName())) {
                            a.a(this.f34679b, "stay_time", a().getLabelName(), currentTimeMillis, a().getExt_value());
                            new ao().a(String.valueOf(currentTimeMillis)).b(a().getLabelName()).f(com.ss.android.ugc.aweme.feed.a.a().b(String.valueOf(a().getValue()))).e();
                        }
                        this.f34680c = -1;
                        break;
                    }
                } else {
                    PatchProxy.accessDispatch(new Object[0], this, f34678a, false, 24556, new Class[0], Void.TYPE);
                    return;
                }
                break;
        }
    }
}
