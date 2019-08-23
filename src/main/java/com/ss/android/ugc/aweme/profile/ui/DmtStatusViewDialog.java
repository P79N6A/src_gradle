package com.ss.android.ugc.aweme.profile.ui;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Looper;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.g.a;

public class DmtStatusViewDialog extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61791a;
    @BindView(2131497340)
    DmtStatusView mDmtStatusView;

    public void show() {
        if (PatchProxy.isSupport(new Object[0], this, f61791a, false, 67950, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61791a, false, 67950, new Class[0], Void.TYPE);
        } else if (getOwnerActivity() != null && !getOwnerActivity().isFinishing()) {
            super.show();
            if (this.mDmtStatusView != null) {
                this.mDmtStatusView.d();
            }
        }
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f61791a, false, 67951, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61791a, false, 67951, new Class[0], Void.TYPE);
        } else if (getOwnerActivity() != null && !getOwnerActivity().isFinishing()) {
            try {
                if (PatchProxy.isSupport(new Object[]{this}, null, m.f62959a, true, 67952, new Class[]{Dialog.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{this}, null, m.f62959a, true, 67952, new Class[]{Dialog.class}, Void.TYPE);
                } else {
                    if (a.a()) {
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            throw new IllegalStateException("debug check! this method should be called from main thread!");
                        }
                    }
                    super.dismiss();
                }
            } catch (Exception unused) {
            }
            if (this.mDmtStatusView != null) {
                this.mDmtStatusView.setVisibility(8);
            }
        }
    }

    public DmtStatusViewDialog(Activity activity) {
        super(activity, C0906R.style.t);
        setOwnerActivity(activity);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f61791a, false, 67948, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f61791a, false, 67948, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (PatchProxy.isSupport(new Object[0], this, f61791a, false, 67949, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61791a, false, 67949, new Class[0], Void.TYPE);
            return;
        }
        setContentView(C0906R.layout.f4507it);
        ButterKnife.bind((Dialog) this);
        this.mDmtStatusView.setBuilder(DmtStatusView.a.a(getContext()));
    }
}
