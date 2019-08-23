package com.ss.android.ugc.aweme.freeflowcard;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class FreeFlowCardPhoto_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48542a;

    /* renamed from: b  reason: collision with root package name */
    private FreeFlowCardPhoto f48543b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f48542a, false, 46038, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48542a, false, 46038, new Class[0], Void.TYPE);
            return;
        }
        FreeFlowCardPhoto freeFlowCardPhoto = this.f48543b;
        if (freeFlowCardPhoto != null) {
            this.f48543b = null;
            freeFlowCardPhoto.mAvatarView = null;
            freeFlowCardPhoto.mNickNameView = null;
            freeFlowCardPhoto.mInviteCodeView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FreeFlowCardPhoto_ViewBinding(FreeFlowCardPhoto freeFlowCardPhoto, View view) {
        this.f48543b = freeFlowCardPhoto;
        freeFlowCardPhoto.mAvatarView = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.i1, "field 'mAvatarView'", RemoteImageView.class);
        freeFlowCardPhoto.mNickNameView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dfe, "field 'mNickNameView'", TextView.class);
        freeFlowCardPhoto.mInviteCodeView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.ddd, "field 'mInviteCodeView'", TextView.class);
    }
}
