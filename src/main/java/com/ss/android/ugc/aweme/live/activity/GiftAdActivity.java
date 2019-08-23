package com.ss.android.ugc.aweme.live.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.live.a;

public class GiftAdActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53192a;

    /* renamed from: b  reason: collision with root package name */
    LiveActivityProxy f53193b;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f53192a, false, 55434, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53192a, false, 55434, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.activity.GiftAdActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.activity.GiftAdActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f53192a, false, 55435, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f53192a, false, 55435, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.activity.GiftAdActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f53192a, false, 55433, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53192a, false, 55433, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f53193b.c_()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f53192a, false, 55432, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f53192a, false, 55432, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.activity.GiftAdActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f53193b = a.d().a((FragmentActivity) this, 1);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.activity.GiftAdActivity", "onCreate", false);
    }
}
