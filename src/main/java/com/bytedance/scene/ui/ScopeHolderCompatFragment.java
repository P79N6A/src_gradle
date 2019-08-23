package com.bytedance.scene.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.bytedance.scene.i;

public class ScopeHolderCompatFragment extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public final i f22215a = i.f22137a.a();

    private static ScopeHolderCompatFragment a() {
        return new ScopeHolderCompatFragment();
    }

    private static void a(FragmentTransaction fragmentTransaction) {
        fragmentTransaction.commitNowAllowingStateLoss();
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public static ScopeHolderCompatFragment a(Fragment fragment, String str, boolean z) {
        String str2 = str + "_ScopeHolderCompatFragment";
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        ScopeHolderCompatFragment scopeHolderCompatFragment = (ScopeHolderCompatFragment) childFragmentManager.findFragmentByTag(str2);
        if (scopeHolderCompatFragment != null && z) {
            FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
            beginTransaction.remove(scopeHolderCompatFragment);
            a(beginTransaction);
            childFragmentManager.executePendingTransactions();
            scopeHolderCompatFragment = null;
        }
        if (scopeHolderCompatFragment != null) {
            return scopeHolderCompatFragment;
        }
        ScopeHolderCompatFragment a2 = a();
        FragmentTransaction beginTransaction2 = childFragmentManager.beginTransaction();
        beginTransaction2.add((Fragment) a2, str2);
        a(beginTransaction2);
        childFragmentManager.executePendingTransactions();
        return a2;
    }
}
