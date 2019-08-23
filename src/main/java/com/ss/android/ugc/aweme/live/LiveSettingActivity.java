package com.ss.android.ugc.aweme.live;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class LiveSettingActivity extends BaseLiveSdkActivity {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f53182b;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f53182b, false, 55430, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53182b, false, 55430, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveSettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f53182b, false, 55431, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f53182b, false, 55431, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f53182b, false, 55429, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f53182b, false, 55429, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.c6);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add((int) C0906R.id.aic, a.d().g());
        beginTransaction.commit();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveSettingActivity", "onCreate", false);
    }
}
