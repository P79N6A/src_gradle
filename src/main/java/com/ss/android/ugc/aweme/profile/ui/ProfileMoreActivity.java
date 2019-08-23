package com.ss.android.ugc.aweme.profile.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import java.util.List;

public class ProfileMoreActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62242a;

    public interface a {
        boolean a();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f62242a, false, 68848, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62242a, false, 68848, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileMoreActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileMoreActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f62242a, false, 68849, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f62242a, false, 68849, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileMoreActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public int getStatusBarColor() {
        if (!PatchProxy.isSupport(new Object[0], this, f62242a, false, 68846, new Class[0], Integer.TYPE)) {
            return getResources().getColor(C0906R.color.ano);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f62242a, false, 68846, new Class[0], Integer.TYPE)).intValue();
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f62242a, false, 68847, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62242a, false, 68847, new Class[0], Void.TYPE);
            return;
        }
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        if (CollectionUtils.isEmpty(fragments)) {
            super.onBackPressed();
            return;
        }
        boolean z = true;
        for (Fragment next : fragments) {
            if (next instanceof a) {
                z = ((a) next).a();
                if (!z) {
                    break;
                }
            }
        }
        if (z) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        ProfileMoreFragment profileMoreFragment;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f62242a, false, 68845, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f62242a, false, 68845, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileMoreActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.ae);
        if (!com.ss.android.g.a.a()) {
            getWindow().setSoftInputMode(48);
        }
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Bundle extras = getIntent().getExtras();
        if (PatchProxy.isSupport(new Object[]{extras}, null, ProfileMoreFragment.f3803a, true, 68850, new Class[]{Bundle.class}, ProfileMoreFragment.class)) {
            profileMoreFragment = (ProfileMoreFragment) PatchProxy.accessDispatch(new Object[]{extras}, null, ProfileMoreFragment.f3803a, true, 68850, new Class[]{Bundle.class}, ProfileMoreFragment.class);
        } else {
            profileMoreFragment = new ProfileMoreFragment();
            profileMoreFragment.setArguments(extras);
        }
        beginTransaction.add((int) C0906R.id.aic, (Fragment) profileMoreFragment);
        beginTransaction.commit();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileMoreActivity", "onCreate", false);
    }
}
