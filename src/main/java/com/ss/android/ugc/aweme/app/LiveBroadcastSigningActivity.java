package com.ss.android.ugc.aweme.app;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.live.a;

public class LiveBroadcastSigningActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33652a;

    /* renamed from: b  reason: collision with root package name */
    LiveActivityProxy f33653b;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f33652a, false, 22527, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33652a, false, 22527, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.LiveBroadcastSigningActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.LiveBroadcastSigningActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f33652a, false, 22528, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f33652a, false, 22528, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.LiveBroadcastSigningActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f33652a, false, 22526, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33652a, false, 22526, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f33653b.c_()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f33652a, false, 22525, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f33652a, false, 22525, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.LiveBroadcastSigningActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f33653b = a.d().a((FragmentActivity) this, 9);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.LiveBroadcastSigningActivity", "onCreate", false);
    }
}
