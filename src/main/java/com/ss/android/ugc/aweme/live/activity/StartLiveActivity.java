package com.ss.android.ugc.aweme.live.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.live.a;

public class StartLiveActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53194a;

    /* renamed from: b  reason: collision with root package name */
    LiveActivityProxy f53195b;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f53194a, false, 55438, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53194a, false, 55438, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.activity.StartLiveActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.activity.StartLiveActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f53194a, false, 55439, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f53194a, false, 55439, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.activity.StartLiveActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f53194a, false, 55437, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53194a, false, 55437, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f53195b.c_()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f53194a, false, 55436, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f53194a, false, 55436, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.activity.StartLiveActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f53195b = a.d().a((FragmentActivity) this, 7);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.activity.StartLiveActivity", "onCreate", false);
    }
}
