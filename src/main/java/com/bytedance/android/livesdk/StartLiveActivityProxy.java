package com.bytedance.android.livesdk;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.bytedance.android.livesdk.o.a;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.bytedance.android.livesdkapi.host.i;
import com.bytedance.common.utility.NetworkUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

public class StartLiveActivityProxy extends LiveActivityProxy {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f1828a;

    /* renamed from: b  reason: collision with root package name */
    m f1829b;

    /* renamed from: c  reason: collision with root package name */
    int f1830c;

    /* renamed from: d  reason: collision with root package name */
    public int f1831d;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f1828a, false, 2766, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f1828a, false, 2766, new Class[0], Void.TYPE);
            return;
        }
        s.INST.isLoadedRes.observe(this.f1870f, new aq(this));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f1828a, false, 2764, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f1828a, false, 2764, new Class[0], Void.TYPE);
            return;
        }
        if (this.f1829b != null && this.f1829b.isShowing()) {
            this.f1829b.dismiss();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f1828a, false, 2765, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f1828a, false, 2765, new Class[0], Void.TYPE);
        } else if (a.a(com.bytedance.android.livesdkapi.j.a.LiveResource)) {
            b();
        } else if (!NetworkUtils.isNetworkAvailable(this.f1870f)) {
            com.bytedance.android.live.uikit.d.a.a((Context) this.f1870f, (int) C0906R.string.csv);
        } else if (NetworkUtils.getNetworkType(this.f1870f) == NetworkUtils.NetworkType.MOBILE_2G) {
            com.bytedance.android.live.uikit.d.a.a((Context) this.f1870f, (int) C0906R.string.dg1);
        } else if (this.f1831d <= 3) {
            com.bytedance.android.livesdkapi.j.a.LiveResource.checkInstall(this.f1870f, new i.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f8832a;

                public final void b(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f8832a, false, 2770, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f8832a, false, 2770, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    StartLiveActivityProxy.this.a();
                    StartLiveActivityProxy.this.f1831d++;
                }

                public final void a(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f8832a, false, 2769, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f8832a, false, 2769, new Class[]{String.class}, Void.TYPE);
                    } else if (!NetworkUtils.isNetworkAvailable(StartLiveActivityProxy.this.f1870f)) {
                        com.bytedance.android.live.uikit.d.a.a((Context) StartLiveActivityProxy.this.f1870f, (int) C0906R.string.csv);
                    } else if (NetworkUtils.getNetworkType(StartLiveActivityProxy.this.f1870f) == NetworkUtils.NetworkType.MOBILE_2G) {
                        com.bytedance.android.live.uikit.d.a.a((Context) StartLiveActivityProxy.this.f1870f, (int) C0906R.string.dg1);
                    } else {
                        StartLiveActivityProxy.this.b();
                    }
                }
            });
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f1828a, false, 2762, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f1828a, false, 2762, new Class[0], Void.TYPE);
            return;
        }
        this.f1870f.setContentView(C0906R.layout.aht);
        g.a().b();
        this.f1870f.getWindow().addFlags(SearchJediMixFeedAdapter.f42517f);
        a();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f1828a, false, 2763, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f1828a, false, 2763, new Class[0], Void.TYPE);
        } else if (!s.INST.isLoadedRes() && (this.f1829b == null || !this.f1829b.isShowing())) {
            this.f1829b = new m.a(this.f1870f, 2).a((DialogInterface.OnDismissListener) new ap(this)).c();
        }
    }

    public StartLiveActivityProxy(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
}
