package com.bytedance.android.livesdk.activity;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.widget.FrameLayout;
import com.bytedance.android.live.excitingvideoad.e;
import com.bytedance.android.live.excitingvideoad.sdk.ExcitingVideoFragment;
import com.bytedance.android.live.excitingvideoad.sdk.b;
import com.bytedance.android.live.excitingvideoad.sdk.c;
import com.bytedance.android.live.excitingvideoad.sdk.d;
import com.bytedance.android.livesdk.u.a;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class GiftAdActivityProxy extends LiveActivityProxy implements b, c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f1835a;

    /* renamed from: b  reason: collision with root package name */
    private ExcitingVideoFragment f1836b;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f1835a, false, 3042, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f1835a, false, 3042, new Class[0], Void.TYPE);
            return;
        }
        if (this.f1870f != null) {
            this.f1870f.finish();
        }
    }

    public final boolean c_() {
        if (PatchProxy.isSupport(new Object[0], this, f1835a, false, 3043, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f1835a, false, 3043, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f1836b == null || !this.f1836b.b()) {
            return super.c_();
        } else {
            return true;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f1835a, false, 3041, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f1835a, false, 3041, new Class[0], Void.TYPE);
            return;
        }
        this.f1870f.requestWindowFeature(1);
        if (this.f1870f.getWindow() != null) {
            this.f1870f.getWindow().setFlags(1024, 1024);
        }
        this.f1870f.setRequestedOrientation(1);
        FrameLayout frameLayout = new FrameLayout(this.f1870f);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(C0906R.id.d75);
        this.f1870f.setContentView(frameLayout);
        FragmentManager supportFragmentManager = this.f1870f.getSupportFragmentManager();
        com.bytedance.android.live.excitingvideoad.a.b bVar = d.a().f8453f;
        e eVar = d.a().f8449b;
        if (bVar == null || eVar == null) {
            ai.a((int) C0906R.string.czk);
            this.f1870f.finish();
            return;
        }
        this.f1836b = new ExcitingVideoFragment();
        this.f1836b.p = this;
        supportFragmentManager.beginTransaction().replace(C0906R.id.d75, this.f1836b).commitAllowingStateLoss();
        a.a().a((Object) new com.bytedance.android.livesdk.z.a(true));
    }

    public GiftAdActivityProxy(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
}
