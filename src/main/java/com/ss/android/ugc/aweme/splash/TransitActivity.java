package com.ss.android.ugc.aweme.splash;

import android.os.Bundle;
import android.os.Handler;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class TransitActivity extends AbsActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71586a;

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f71586a, false, 81955, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f71586a, false, 81955, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.TransitActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f71586a, false, 81953, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71586a, false, 81953, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        new Handler().postDelayed(new q(this), 500);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f71586a, false, 81952, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71586a, false, 81952, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.TransitActivity", "onResume", true);
        super.onResume();
        new Handler().postDelayed(new p(this), 50);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.TransitActivity", "onResume", false);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f71586a, false, 81951, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f71586a, false, 81951, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.TransitActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.ed);
        ((DmtLoadingLayout) findViewById(C0906R.id.bjl)).setUseScreenHeight(getResources().getDimensionPixelSize(C0906R.dimen.lj));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.TransitActivity", "onCreate", false);
    }
}
