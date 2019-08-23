package com.ss.android.ugc.aweme.challenge.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.common.ui.b;

public class AddChallengeActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35435a;

    /* renamed from: b  reason: collision with root package name */
    private String f35436b;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f35435a, false, 25952, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35435a, false, 25952, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.AddChallengeActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.AddChallengeActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f35435a, false, 25953, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f35435a, false, 25953, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.AddChallengeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f35435a, false, 25948, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35435a, false, 25948, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        superOverridePendingTransition(C0906R.anim.n, C0906R.anim.s);
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f35435a, false, 25951, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35435a, false, 25951, new Class[0], Void.TYPE);
            return;
        }
        b.a((Activity) this, findViewById(C0906R.id.y9));
        super.onBackPressed();
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f35435a, false, 25949, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35435a, false, 25949, new Class[0], Void.TYPE);
            return;
        }
        if (a.b()) {
            StatusBarUtils.setTransparent(this);
        }
    }

    public void onCreate(Bundle bundle) {
        AddChallengeFragment addChallengeFragment;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f35435a, false, 25947, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f35435a, false, 25947, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.AddChallengeActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.b1);
        superOverridePendingTransition(C0906R.anim.r, C0906R.anim.n);
        findViewById(C0906R.id.y9).setBackgroundColor(getResources().getColor(C0906R.color.a17));
        if (PatchProxy.isSupport(new Object[0], this, f35435a, false, 25950, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35435a, false, 25950, new Class[0], Void.TYPE);
        } else {
            this.f35436b = getIntent().getStringExtra("from");
            if (this.f35436b == null) {
                this.f35436b = "";
            }
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            String str = this.f35436b;
            if (PatchProxy.isSupport(new Object[]{str}, null, AddChallengeFragment.f2801a, true, 25954, new Class[]{String.class}, AddChallengeFragment.class)) {
                addChallengeFragment = (AddChallengeFragment) PatchProxy.accessDispatch(new Object[]{str}, null, AddChallengeFragment.f2801a, true, 25954, new Class[]{String.class}, AddChallengeFragment.class);
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putString("from", str);
                addChallengeFragment = new AddChallengeFragment();
                addChallengeFragment.setArguments(bundle2);
            }
            addChallengeFragment.setUserVisibleHint(true);
            beginTransaction.replace(C0906R.id.y9, addChallengeFragment);
            beginTransaction.commit();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.AddChallengeActivity", "onCreate", false);
    }
}
