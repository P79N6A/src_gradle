package com.ss.android.ugc.aweme.comment.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.collection.WeakContainer;
import com.bytedance.ies.uikit.base.LifeCycleMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.Iterator;

public class BaseBottomDialogFragment extends BottomSheetDialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36473a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f36474b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f36475c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f36476d;

    /* renamed from: e  reason: collision with root package name */
    private WeakContainer<LifeCycleMonitor> f36477e = new WeakContainer<>();

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f36473a, false, 27420, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36473a, false, 27420, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        this.f36475c = false;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f36473a, false, 27421, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36473a, false, 27421, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.f36475c = false;
        this.f36476d = true;
        if (!this.f36477e.isEmpty()) {
            Iterator it2 = this.f36477e.iterator();
            while (it2.hasNext()) {
                LifeCycleMonitor lifeCycleMonitor = (LifeCycleMonitor) it2.next();
                if (lifeCycleMonitor != null) {
                    lifeCycleMonitor.onDestroy();
                }
            }
            this.f36477e.clear();
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f36473a, false, 27418, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36473a, false, 27418, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (!this.f36477e.isEmpty()) {
            Iterator it2 = this.f36477e.iterator();
            while (it2.hasNext()) {
                LifeCycleMonitor lifeCycleMonitor = (LifeCycleMonitor) it2.next();
                if (lifeCycleMonitor != null) {
                    lifeCycleMonitor.onPause();
                }
            }
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f36473a, false, 27416, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36473a, false, 27416, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.f36474b = true;
        if (!this.f36477e.isEmpty()) {
            Iterator it2 = this.f36477e.iterator();
            while (it2.hasNext()) {
                LifeCycleMonitor lifeCycleMonitor = (LifeCycleMonitor) it2.next();
                if (lifeCycleMonitor != null) {
                    lifeCycleMonitor.onResume();
                }
            }
        }
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f36473a, false, 27419, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36473a, false, 27419, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        this.f36474b = false;
        if (!this.f36477e.isEmpty()) {
            Iterator it2 = this.f36477e.iterator();
            while (it2.hasNext()) {
                LifeCycleMonitor lifeCycleMonitor = (LifeCycleMonitor) it2.next();
                if (lifeCycleMonitor != null) {
                    lifeCycleMonitor.onStop();
                }
            }
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f36473a, false, 27422, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f36473a, false, 27422, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        super.onCancel(dialogInterface);
        dismiss();
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f36473a, false, 27411, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f36473a, false, 27411, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.f36474b = false;
        this.f36475c = false;
        this.f36476d = false;
        setStyle(0, C0906R.style.ff);
    }

    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f36473a, false, 27415, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f36473a, false, 27415, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        if (bundle2 != null) {
            bundle2.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
        super.onSaveInstanceState(bundle);
    }

    public void onActivityCreated(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f36473a, false, 27413, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f36473a, false, 27413, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        getDialog().setOnShowListener(new DialogInterface.OnShowListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36478a;

            public final void onShow(DialogInterface dialogInterface) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f36478a, false, 27424, new Class[]{DialogInterface.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f36478a, false, 27424, new Class[]{DialogInterface.class}, Void.TYPE);
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) ((BottomSheetDialog) dialogInterface).findViewById(C0906R.id.a3z);
                BottomSheetBehavior from = BottomSheetBehavior.from(frameLayout);
                from.setPeekHeight(frameLayout.getHeight());
                from.setSkipCollapsed(true);
            }
        });
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (!PatchProxy.isSupport(new Object[]{bundle}, this, f36473a, false, 27412, new Class[]{Bundle.class}, Dialog.class)) {
            return new BottomSheetDialog(getActivity(), getTheme());
        }
        return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f36473a, false, 27412, new Class[]{Bundle.class}, Dialog.class);
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f36473a, false, 27414, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f36473a, false, 27414, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f36475c = true;
    }
}
