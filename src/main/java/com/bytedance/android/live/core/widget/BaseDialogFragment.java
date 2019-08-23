package com.bytedance.android.live.core.widget;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.BaseDialogFragmentV2;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import com.bytedance.common.utility.collection.WeakContainer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;

public class BaseDialogFragment extends BaseDialogFragmentV2 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8338a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8339b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8340c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8341d;

    /* renamed from: e  reason: collision with root package name */
    private WeakContainer<Object> f8342e = new WeakContainer<>();

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f8338a, false, 1483, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8338a, false, 1483, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        this.f8340c = false;
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f8338a, false, 1481, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8338a, false, 1481, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (!this.f8342e.isEmpty()) {
            Iterator it2 = this.f8342e.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f8338a, false, 1484, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8338a, false, 1484, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.f8340c = false;
        this.f8341d = true;
        if (!this.f8342e.isEmpty()) {
            Iterator it2 = this.f8342e.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            this.f8342e.clear();
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f8338a, false, 1480, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8338a, false, 1480, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.f8339b = true;
        if (!this.f8342e.isEmpty()) {
            Iterator it2 = this.f8342e.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f8338a, false, 1482, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8338a, false, 1482, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        this.f8339b = false;
        if (!this.f8342e.isEmpty()) {
            Iterator it2 = this.f8342e.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f8338a, false, 1485, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f8338a, false, 1485, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        super.onCancel(dialogInterface);
        try {
            dismiss();
        } catch (IllegalStateException unused) {
            dismissAllowingStateLoss();
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f8338a, false, 1477, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f8338a, false, 1477, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.f8339b = false;
        this.f8340c = false;
        this.f8341d = false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f8338a, false, 1479, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f8338a, false, 1479, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        if (bundle2 != null) {
            bundle2.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
        super.onSaveInstanceState(bundle);
    }

    public static void a(FragmentActivity fragmentActivity, DialogFragment dialogFragment) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        DialogFragment dialogFragment2 = dialogFragment;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, dialogFragment2}, null, f8338a, true, 1489, new Class[]{FragmentActivity.class, DialogFragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity2, dialogFragment2}, null, f8338a, true, 1489, new Class[]{FragmentActivity.class, DialogFragment.class}, Void.TYPE);
            return;
        }
        a(fragmentActivity2, dialogFragment2, dialogFragment.getClass().getCanonicalName());
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f8338a, false, 1478, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f8338a, false, 1478, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f8340c = true;
        getDialog().setOnKeyListener(new a(this));
    }

    public static void a(FragmentManager fragmentManager, BaseDialogFragment baseDialogFragment) {
        FragmentManager fragmentManager2 = fragmentManager;
        BaseDialogFragment baseDialogFragment2 = baseDialogFragment;
        if (PatchProxy.isSupport(new Object[]{fragmentManager2, baseDialogFragment2}, null, f8338a, true, 1490, new Class[]{FragmentManager.class, BaseDialogFragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager2, baseDialogFragment2}, null, f8338a, true, 1490, new Class[]{FragmentManager.class, BaseDialogFragment.class}, Void.TYPE);
        } else if (fragmentManager2 != null && baseDialogFragment2 != null) {
            baseDialogFragment2.show(fragmentManager2, baseDialogFragment.getClass().getCanonicalName());
        }
    }

    public static void a(FragmentActivity fragmentActivity, DialogFragment dialogFragment, String str) {
        DialogFragment dialogFragment2 = dialogFragment;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity, dialogFragment2, str2}, null, f8338a, true, 1488, new Class[]{FragmentActivity.class, DialogFragment.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity, dialogFragment2, str2}, null, f8338a, true, 1488, new Class[]{FragmentActivity.class, DialogFragment.class, String.class}, Void.TYPE);
        } else if (fragmentActivity != null && dialogFragment2 != null) {
            dialogFragment2.show(fragmentActivity.getSupportFragmentManager(), str2);
        }
    }
}
