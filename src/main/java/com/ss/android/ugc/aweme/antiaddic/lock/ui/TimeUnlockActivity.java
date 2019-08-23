package com.ss.android.ugc.aweme.antiaddic.lock.ui;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.d;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.TimeUnlockFragment;

public class TimeUnlockActivity extends BaseLockActivity {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f33470c = null;

    /* renamed from: d  reason: collision with root package name */
    public static String f33471d = "UNLOCK";

    public final int a() {
        return C0906R.layout.ef;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f33470c, false, 21926, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f33470c, false, 21926, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.TimeUnlockActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.TimeUnlockActivity", "onCreate", false);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f33470c, false, 21927, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33470c, false, 21927, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.TimeUnlockActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.TimeUnlockActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f33470c, false, 21928, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f33470c, false, 21928, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.TimeUnlockActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f33470c, false, 21923, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33470c, false, 21923, new Class[0], Void.TYPE);
            return;
        }
        if (d.b() != null) {
            super.onBackPressed();
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f33470c, false, 21925, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33470c, false, 21925, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f33470c, false, 21922, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33470c, false, 21922, new Class[0], Void.TYPE);
            return;
        }
        View findViewById = findViewById(C0906R.id.aic);
        if (a.a()) {
            findViewById.setBackgroundColor(getResources().getColor(C0906R.color.a17));
        }
        this.f33460b = com.ss.android.ugc.aweme.mobile.a.a.a(TimeUnlockFragment.class).a();
        this.f33460b.setArguments(getIntent().getExtras());
        com.ss.android.ugc.aweme.base.ui.session.a<Boolean> b2 = d.b();
        if (b2 != null) {
            b2.a((LifecycleOwner) this.f33460b);
        }
        a(this.f33460b);
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f33470c, false, 21924, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33470c, false, 21924, new Class[0], Void.TYPE);
        } else if (a.b()) {
            ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.w1).statusBarDarkFont(true).init();
        } else {
            ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.yx).init();
        }
    }
}
