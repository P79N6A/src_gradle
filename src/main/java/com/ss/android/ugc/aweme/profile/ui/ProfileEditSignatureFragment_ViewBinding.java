package com.ss.android.ugc.aweme.profile.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ProfileEditSignatureFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62227a;

    /* renamed from: b  reason: collision with root package name */
    private ProfileEditSignatureFragment f62228b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f62227a, false, 68822, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62227a, false, 68822, new Class[0], Void.TYPE);
            return;
        }
        ProfileEditSignatureFragment profileEditSignatureFragment = this.f62228b;
        if (profileEditSignatureFragment != null) {
            this.f62228b = null;
            profileEditSignatureFragment.mSignatureInput = null;
            profileEditSignatureFragment.mSignatureLengthHint = null;
            profileEditSignatureFragment.mDmtStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public ProfileEditSignatureFragment_ViewBinding(ProfileEditSignatureFragment profileEditSignatureFragment, View view) {
        this.f62228b = profileEditSignatureFragment;
        profileEditSignatureFragment.mSignatureInput = (EditText) Utils.findRequiredViewAsType(view, C0906R.id.aak, "field 'mSignatureInput'", EditText.class);
        profileEditSignatureFragment.mSignatureLengthHint = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dj3, "field 'mSignatureLengthHint'", TextView.class);
        profileEditSignatureFragment.mDmtStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mDmtStatusView'", DmtStatusView.class);
    }
}
