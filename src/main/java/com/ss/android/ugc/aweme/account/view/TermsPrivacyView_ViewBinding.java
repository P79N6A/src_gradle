package com.ss.android.ugc.aweme.account.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class TermsPrivacyView_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33155a;

    /* renamed from: b  reason: collision with root package name */
    private TermsPrivacyView f33156b;

    /* renamed from: c  reason: collision with root package name */
    private View f33157c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f33155a, false, 21502, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33155a, false, 21502, new Class[0], Void.TYPE);
            return;
        }
        TermsPrivacyView termsPrivacyView = this.f33156b;
        if (termsPrivacyView != null) {
            this.f33156b = null;
            termsPrivacyView.mDtTermPrivacy = null;
            termsPrivacyView.mCheckAgree = null;
            ((CompoundButton) this.f33157c).setOnCheckedChangeListener(null);
            this.f33157c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public TermsPrivacyView_ViewBinding(final TermsPrivacyView termsPrivacyView, View view) {
        this.f33156b = termsPrivacyView;
        termsPrivacyView.mDtTermPrivacy = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.a82, "field 'mDtTermPrivacy'", DmtTextView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.c60, "field 'mCheckAgree' and method 'onCheckedChanged'");
        termsPrivacyView.mCheckAgree = (CheckBox) Utils.castView(findRequiredView, C0906R.id.c60, "field 'mCheckAgree'", CheckBox.class);
        this.f33157c = findRequiredView;
        ((CompoundButton) findRequiredView).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f33158a;

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CompoundButton compoundButton2 = compoundButton;
                if (PatchProxy.isSupport(new Object[]{compoundButton2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f33158a, false, 21503, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{compoundButton2, Byte.valueOf(z)}, this, f33158a, false, 21503, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE);
                    return;
                }
                termsPrivacyView.onCheckedChanged(compoundButton2, z);
            }
        });
    }
}
