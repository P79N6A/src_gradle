package com.ss.android.ugc.aweme.account.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.login.ui.CheckButton;

public class VerifyIDCardFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33020a;

    /* renamed from: b  reason: collision with root package name */
    private VerifyIDCardFragment f33021b;

    /* renamed from: c  reason: collision with root package name */
    private View f33022c;

    /* renamed from: d  reason: collision with root package name */
    private View f33023d;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f33020a, false, 21291, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33020a, false, 21291, new Class[0], Void.TYPE);
            return;
        }
        VerifyIDCardFragment verifyIDCardFragment = this.f33021b;
        if (verifyIDCardFragment != null) {
            this.f33021b = null;
            verifyIDCardFragment.mSubTitle = null;
            verifyIDCardFragment.mIdCardEditText = null;
            verifyIDCardFragment.mDoneBtn = null;
            verifyIDCardFragment.mStatusView = null;
            this.f33022c.setOnClickListener(null);
            this.f33022c = null;
            this.f33023d.setOnClickListener(null);
            this.f33023d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public VerifyIDCardFragment_ViewBinding(final VerifyIDCardFragment verifyIDCardFragment, View view) {
        this.f33021b = verifyIDCardFragment;
        verifyIDCardFragment.mSubTitle = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.cx6, "field 'mSubTitle'", TextView.class);
        verifyIDCardFragment.mIdCardEditText = (EditText) Utils.findRequiredViewAsType(view, C0906R.id.a8f, "field 'mIdCardEditText'", EditText.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.nw, "field 'mDoneBtn' and method 'onClick'");
        verifyIDCardFragment.mDoneBtn = (CheckButton) Utils.castView(findRequiredView, C0906R.id.nw, "field 'mDoneBtn'", CheckButton.class);
        this.f33022c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f33024a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f33024a, false, 21292, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f33024a, false, 21292, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                verifyIDCardFragment.onClick(view2);
            }
        });
        verifyIDCardFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.ix, "method 'onClick'");
        this.f33023d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f33027a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f33027a, false, 21293, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f33027a, false, 21293, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                verifyIDCardFragment.onClick(view2);
            }
        });
    }
}
