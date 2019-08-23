package com.ss.android.ugc.aweme.base.component;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.analysis.c;
import com.ss.android.ugc.aweme.u.ao;
import java.lang.ref.WeakReference;

public class AnalysisStayTimeFragmentComponent implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2735a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2736b = true;

    /* renamed from: c  reason: collision with root package name */
    public a f2737c;

    /* renamed from: d  reason: collision with root package name */
    private long f2738d = -1;

    /* renamed from: e  reason: collision with root package name */
    private WeakReference<c> f2739e;

    /* renamed from: f  reason: collision with root package name */
    private Fragment f2740f;

    public interface a {
        ao a(ao aoVar);
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f2735a, false, 24564, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2735a, false, 24564, new Class[0], Void.TYPE);
            return;
        }
        this.f2738d = System.currentTimeMillis();
    }

    private Analysis c() {
        c cVar;
        if (PatchProxy.isSupport(new Object[0], this, f2735a, false, 24569, new Class[0], Analysis.class)) {
            return (Analysis) PatchProxy.accessDispatch(new Object[0], this, f2735a, false, 24569, new Class[0], Analysis.class);
        }
        if (this.f2739e != null) {
            cVar = (c) this.f2739e.get();
        } else {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.getAnalysis();
        }
        return null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f2735a, false, 24565, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2735a, false, 24565, new Class[0], Void.TYPE);
        } else if (this.f2736b) {
            b();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f2735a, false, 24563, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2735a, false, 24563, new Class[0], Void.TYPE);
        } else if (this.f2736b) {
            a();
        }
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f2735a, false, 24566, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2735a, false, 24566, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2738d != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f2738d;
            if (currentTimeMillis > 100 && c() != null && !TextUtils.isEmpty(c().getLabelName())) {
                ao b2 = new ao().a(String.valueOf(currentTimeMillis)).b(c().getLabelName());
                if (this.f2737c != null) {
                    b2 = this.f2737c.a(b2);
                }
                b2.e();
            }
            this.f2738d = -1;
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2735a, false, 24567, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2735a, false, 24567, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        b(!z);
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2735a, false, 24568, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2735a, false, 24568, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f2736b = z;
        if (this.f2736b) {
            a();
        } else {
            b();
        }
    }

    public AnalysisStayTimeFragmentComponent(Fragment fragment, boolean z) {
        this.f2740f = fragment;
        this.f2739e = new WeakReference<>((c) fragment);
        fragment.getLifecycle().addObserver(this);
    }
}
