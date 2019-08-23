package com.ss.android.ugc.aweme.account.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import butterknife.BindView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.account.util.j;

public class BaseAccountActivity extends AmeBaseActivity {
    public static ChangeQuickRedirect o;
    @BindView(2131493065)
    public FrameLayout mContainer;
    @Nullable
    @BindView(2131493309)
    public ViewGroup mRootContainer;
    @Nullable
    @BindView(2131493387)
    public DmtStatusView mStatusView;

    public int a() {
        return C0906R.layout.a7;
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 21043, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 21043, new Class[0], Void.TYPE);
            return;
        }
        getSupportFragmentManager().popBackStack();
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 21042, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 21042, new Class[0], Void.TYPE);
        } else if (getSupportFragmentManager().getBackStackEntryCount() == 1) {
            j.a(this, true, true);
        } else {
            b();
        }
    }

    public final void a(Fragment fragment) {
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragment2}, this, o, false, 21040, new Class[]{Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2}, this, o, false, 21040, new Class[]{Fragment.class}, Void.TYPE);
            return;
        }
        a(fragment2, false);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, o, false, 21038, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, o, false, 21038, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
    }

    public final void a(Fragment fragment, boolean z) {
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragment2, Byte.valueOf(z ? (byte) 1 : 0)}, this, o, false, 21041, new Class[]{Fragment.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2, Byte.valueOf(z)}, this, o, false, 21041, new Class[]{Fragment.class, Boolean.TYPE}, Void.TYPE);
        } else if (getSupportFragmentManager().getFragments() == null) {
            getSupportFragmentManager().beginTransaction().add((int) C0906R.id.aic, fragment2).commitAllowingStateLoss();
        } else if (!z || getSupportFragmentManager().getBackStackEntryCount() <= 1) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.setCustomAnimations(C0906R.anim.cz, C0906R.anim.d8, C0906R.anim.cx, C0906R.anim.da);
            beginTransaction.replace(C0906R.id.aic, fragment2);
            beginTransaction.addToBackStack(null);
            beginTransaction.commitAllowingStateLoss();
        } else {
            b();
        }
    }
}
