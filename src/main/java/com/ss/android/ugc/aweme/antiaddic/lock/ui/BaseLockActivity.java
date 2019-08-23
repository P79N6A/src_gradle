package com.ss.android.ugc.aweme.antiaddic.lock.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.inputmethod.InputMethodManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.mobile.a.b;

public abstract class BaseLockActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33459a;

    /* renamed from: b  reason: collision with root package name */
    protected Fragment f33460b;

    public abstract int a();

    public abstract void b();

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f33459a, false, 21877, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33459a, false, 21877, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, f33459a, true, 21878, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, f33459a, true, 21878, new Class[]{Activity.class}, Void.TYPE);
        } else if (getCurrentFocus() != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
        if (getSupportFragmentManager().getBackStackEntryCount() == 1) {
            b.a(this, false, true);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f33459a, false, 21879, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33459a, false, 21879, new Class[0], Void.TYPE);
            return;
        }
        try {
            getSupportFragmentManager().popBackStack();
        } catch (Exception unused) {
        }
    }

    public final void a(Fragment fragment) {
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragment2}, this, f33459a, false, 21874, new Class[]{Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2}, this, f33459a, false, 21874, new Class[]{Fragment.class}, Void.TYPE);
            return;
        }
        a(fragment2, false);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f33459a, false, 21876, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f33459a, false, 21876, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(a());
        b();
    }

    private void a(Fragment fragment, boolean z) {
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragment2, (byte) 0}, this, f33459a, false, 21875, new Class[]{Fragment.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2, (byte) 0}, this, f33459a, false, 21875, new Class[]{Fragment.class, Boolean.TYPE}, Void.TYPE);
        } else if (getSupportFragmentManager().getFragments() == null) {
            getSupportFragmentManager().beginTransaction().add((int) C0906R.id.aic, fragment2).commitAllowingStateLoss();
        } else {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.setCustomAnimations(C0906R.anim.cz, C0906R.anim.d8, C0906R.anim.cx, C0906R.anim.da);
            beginTransaction.replace(C0906R.id.aic, fragment2);
            beginTransaction.addToBackStack(null);
            beginTransaction.commitAllowingStateLoss();
        }
    }
}
