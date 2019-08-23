package com.ss.android.ugc.aweme.account.ui;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class VerificationCodeFragment_ViewBinding extends BaseAccountFragment_ViewBinding {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f33005c;

    /* renamed from: a  reason: collision with root package name */
    private VerificationCodeFragment f33006a;

    /* renamed from: d  reason: collision with root package name */
    private View f33007d;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f33005c, false, 21276, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33005c, false, 21276, new Class[0], Void.TYPE);
        } else if (this.f33006a != null) {
            this.f33006a = null;
            this.f33007d.setOnClickListener(null);
            this.f33007d = null;
            super.unbind();
        } else {
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    @UiThread
    public VerificationCodeFragment_ViewBinding(final VerificationCodeFragment verificationCodeFragment, View view) {
        super(verificationCodeFragment, view);
        this.f33006a = verificationCodeFragment;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.dnl, "method 'reSendCode'");
        this.f33007d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f33008a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f33008a, false, 21277, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f33008a, false, 21277, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                verificationCodeFragment.reSendCode();
            }
        });
    }
}
