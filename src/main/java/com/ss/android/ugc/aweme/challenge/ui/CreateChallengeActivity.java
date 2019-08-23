package com.ss.android.ugc.aweme.challenge.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;

public class CreateChallengeActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35515a;

    /* renamed from: b  reason: collision with root package name */
    private CreateChallengeDialogFragment f35516b;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f35515a, false, 26189, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35515a, false, 26189, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.CreateChallengeActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.CreateChallengeActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f35515a, false, 26190, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f35515a, false, 26190, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.CreateChallengeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f35515a, false, 26187, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f35515a, false, 26187, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.CreateChallengeActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.b1);
        if (PatchProxy.isSupport(new Object[0], this, f35515a, false, 26188, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35515a, false, 26188, new Class[0], Void.TYPE);
        } else {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("create_challenge");
            if (findFragmentByTag == null) {
                this.f35516b = new CreateChallengeDialogFragment();
                Bundle bundle2 = new Bundle(1);
                bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", 1);
                this.f35516b.setArguments(bundle2);
                this.f35516b.show(supportFragmentManager, "create_challenge");
            } else if (findFragmentByTag != null) {
                this.f35516b = (CreateChallengeDialogFragment) findFragmentByTag;
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.CreateChallengeActivity", "onCreate", false);
    }
}
