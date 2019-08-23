package com.ss.android.ugc.aweme.common.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.View;
import com.bytedance.common.utility.collection.WeakContainer;
import com.bytedance.ies.uikit.base.LifeCycleMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;
import org.greenrobot.eventbus.c;

public class BaseDialogFragment extends DialogFragment {
    public static ChangeQuickRedirect m;

    /* renamed from: a  reason: collision with root package name */
    private WeakContainer<LifeCycleMonitor> f2980a = new WeakContainer<>();
    public boolean n;
    protected boolean o;
    public boolean p;

    public boolean i() {
        return this.o;
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 33494, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 33494, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        this.o = false;
        c.a();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 33495, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 33495, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.o = false;
        this.p = true;
        if (!this.f2980a.isEmpty()) {
            Iterator it2 = this.f2980a.iterator();
            while (it2.hasNext()) {
                LifeCycleMonitor lifeCycleMonitor = (LifeCycleMonitor) it2.next();
                if (lifeCycleMonitor != null) {
                    lifeCycleMonitor.onDestroy();
                }
            }
            this.f2980a.clear();
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 33492, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 33492, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (!this.f2980a.isEmpty()) {
            Iterator it2 = this.f2980a.iterator();
            while (it2.hasNext()) {
                LifeCycleMonitor lifeCycleMonitor = (LifeCycleMonitor) it2.next();
                if (lifeCycleMonitor != null) {
                    lifeCycleMonitor.onPause();
                }
            }
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 33490, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 33490, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.n = true;
        if (!this.f2980a.isEmpty()) {
            Iterator it2 = this.f2980a.iterator();
            while (it2.hasNext()) {
                LifeCycleMonitor lifeCycleMonitor = (LifeCycleMonitor) it2.next();
                if (lifeCycleMonitor != null) {
                    lifeCycleMonitor.onResume();
                }
            }
        }
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 33493, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 33493, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        this.n = false;
        if (!this.f2980a.isEmpty()) {
            Iterator it2 = this.f2980a.iterator();
            while (it2.hasNext()) {
                LifeCycleMonitor lifeCycleMonitor = (LifeCycleMonitor) it2.next();
                if (lifeCycleMonitor != null) {
                    lifeCycleMonitor.onStop();
                }
            }
        }
    }

    public void onAttach(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, m, false, 33485, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, m, false, 33485, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        super.onAttach(context);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, m, false, 33486, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, m, false, 33486, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.n = false;
        this.o = false;
        this.p = false;
    }

    public void onActivityCreated(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, m, false, 33488, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, m, false, 33488, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        c.a().b((Object) this);
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, m, false, 33496, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, m, false, 33496, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        super.onCancel(dialogInterface);
        if (getFragmentManager() != null && isAdded()) {
            try {
                dismiss();
            } catch (IllegalStateException unused) {
                dismissAllowingStateLoss();
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, m, false, 33489, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, m, false, 33489, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        if (bundle2 != null) {
            bundle2.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
        super.onSaveInstanceState(bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, m, false, 33487, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, m, false, 33487, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.o = true;
    }
}
