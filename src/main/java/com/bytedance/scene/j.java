package com.bytedance.scene;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class j extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public final i f22143a = i.f22137a.a();

    private static j a() {
        return new j();
    }

    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    private static void a(FragmentTransaction fragmentTransaction) {
        if (Build.VERSION.SDK_INT >= 24) {
            fragmentTransaction.commitNowAllowingStateLoss();
        } else {
            fragmentTransaction.commitAllowingStateLoss();
        }
    }

    public static j a(Activity activity, String str, boolean z) {
        String str2 = str + "_ScopeHolderFragment";
        FragmentManager fragmentManager = activity.getFragmentManager();
        j jVar = (j) fragmentManager.findFragmentByTag(str2);
        if (jVar != null && z) {
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.remove(jVar);
            a(beginTransaction);
            fragmentManager.executePendingTransactions();
            jVar = null;
        }
        if (jVar != null) {
            return jVar;
        }
        j a2 = a();
        FragmentTransaction beginTransaction2 = fragmentManager.beginTransaction();
        beginTransaction2.add(a2, str2);
        a(beginTransaction2);
        fragmentManager.executePendingTransactions();
        return a2;
    }
}
