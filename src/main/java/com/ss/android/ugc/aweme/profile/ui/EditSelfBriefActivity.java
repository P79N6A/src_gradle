package com.ss.android.ugc.aweme.profile.ui;

import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;

public class EditSelfBriefActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61794a;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f61794a, false, 67964, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61794a, false, 67964, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.EditSelfBriefActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.EditSelfBriefActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f61794a, false, 67965, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f61794a, false, 67965, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.EditSelfBriefActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f61794a, false, 67963, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61794a, false, 67963, new Class[0], Void.TYPE);
            return;
        }
        super.onBackPressed();
        finish();
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f61794a, false, 67961, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f61794a, false, 67961, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.EditSelfBriefActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.ae);
        if (PatchProxy.isSupport(new Object[0], this, f61794a, false, 67962, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61794a, false, 67962, new Class[0], Void.TYPE);
        } else {
            ProfileEditSignatureFragment a2 = ProfileEditSignatureFragment.a(d.a().getCurUser().getSignature());
            a2.setUserVisibleHint(true);
            a2.show(getSupportFragmentManager(), "EditSignatureDialog");
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.EditSelfBriefActivity", "onCreate", false);
    }
}
