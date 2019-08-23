package com.ss.android.ugc.aweme.draft;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.port.in.a;

public class DraftBoxActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43399a;

    /* renamed from: b  reason: collision with root package name */
    private DraftBoxFragment f43400b;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f43399a, false, 38400, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43399a, false, 38400, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.draft.DraftBoxActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.draft.DraftBoxActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f43399a, false, 38401, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f43399a, false, 38401, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.draft.DraftBoxActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f43399a, false, 38397, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43399a, false, 38397, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f43399a, false, 38398, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43399a, false, 38398, new Class[0], Void.TYPE);
            return;
        }
        this.f43400b = (DraftBoxFragment) getSupportFragmentManager().findFragmentById(C0906R.id.aic);
        if (this.f43400b == null) {
            this.f43400b = new DraftBoxFragment();
            getSupportFragmentManager().beginTransaction().add((int) C0906R.id.aic, (Fragment) this.f43400b).commitAllowingStateLoss();
        }
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f43399a, false, 38399, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43399a, false, 38399, new Class[0], Void.TYPE);
            return;
        }
        if (this.f43400b != null) {
            DraftBoxFragment draftBoxFragment = this.f43400b;
            if (PatchProxy.isSupport(new Object[0], draftBoxFragment, DraftBoxFragment.f43401a, false, 38419, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], draftBoxFragment, DraftBoxFragment.f43401a, false, 38419, new Class[0], Void.TYPE);
            } else if (draftBoxFragment.j) {
                draftBoxFragment.j = false;
                draftBoxFragment.b();
                draftBoxFragment.a();
            } else {
                draftBoxFragment.getActivity().finish();
            }
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f43399a, false, 38396, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f43399a, false, 38396, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.draft.DraftBoxActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.cp);
        if (a.H.E().c(this) == 0) {
            a();
        } else {
            a.H.E().a(this, new f(this), "android.permission.WRITE_EXTERNAL_STORAGE");
        }
        ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.yx).fitsSystemWindows(true).statusBarDarkFont(com.ss.android.g.a.b()).init();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.draft.DraftBoxActivity", "onCreate", false);
    }
}
