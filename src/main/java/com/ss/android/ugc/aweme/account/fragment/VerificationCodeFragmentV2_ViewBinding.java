package com.ss.android.ugc.aweme.account.fragment;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.ui.VerificationCodeFragment_ViewBinding;

public class VerificationCodeFragmentV2_ViewBinding extends VerificationCodeFragment_ViewBinding {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31951a;

    /* renamed from: d  reason: collision with root package name */
    private VerificationCodeFragmentV2 f31952d;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f31951a, false, 19965, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31951a, false, 19965, new Class[0], Void.TYPE);
            return;
        }
        VerificationCodeFragmentV2 verificationCodeFragmentV2 = this.f31952d;
        if (verificationCodeFragmentV2 != null) {
            this.f31952d = null;
            verificationCodeFragmentV2.mTextTitleBar = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public VerificationCodeFragmentV2_ViewBinding(VerificationCodeFragmentV2 verificationCodeFragmentV2, View view) {
        super(verificationCodeFragmentV2, view);
        this.f31952d = verificationCodeFragmentV2;
        verificationCodeFragmentV2.mTextTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, C0906R.id.d3m, "field 'mTextTitleBar'", TextTitleBar.class);
    }
}
