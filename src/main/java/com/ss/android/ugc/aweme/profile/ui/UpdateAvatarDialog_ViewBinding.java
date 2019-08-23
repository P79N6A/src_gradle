package com.ss.android.ugc.aweme.profile.ui;

import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;

public class UpdateAvatarDialog_ViewBinding extends UpdateUserInfoDialog_ViewBinding {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62368a;

    /* renamed from: c  reason: collision with root package name */
    private UpdateAvatarDialog f62369c;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f62368a, false, 69070, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62368a, false, 69070, new Class[0], Void.TYPE);
            return;
        }
        UpdateAvatarDialog updateAvatarDialog = this.f62369c;
        if (updateAvatarDialog != null) {
            this.f62369c = null;
            updateAvatarDialog.mPolicyDes = null;
            updateAvatarDialog.mAvatarImageView = null;
            updateAvatarDialog.txtDisclaimer = null;
            updateAvatarDialog.ivDisclaimer = null;
            updateAvatarDialog.mVpExpandContainer = null;
            updateAvatarDialog.mAvatarContainer = null;
            updateAvatarDialog.mAvatarDecoration = null;
            updateAvatarDialog.mDecorationRecyclerView = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public UpdateAvatarDialog_ViewBinding(UpdateAvatarDialog updateAvatarDialog, View view) {
        super(updateAvatarDialog, view);
        this.f62369c = updateAvatarDialog;
        updateAvatarDialog.mPolicyDes = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.c4_, "field 'mPolicyDes'", TextView.class);
        updateAvatarDialog.mAvatarImageView = (AvatarImageView) Utils.findRequiredViewAsType(view, C0906R.id.c6t, "field 'mAvatarImageView'", AvatarImageView.class);
        updateAvatarDialog.txtDisclaimer = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.ab2, "field 'txtDisclaimer'", TextView.class);
        updateAvatarDialog.ivDisclaimer = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.ab1, "field 'ivDisclaimer'", ImageView.class);
        updateAvatarDialog.mVpExpandContainer = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.ab0, "field 'mVpExpandContainer'", ViewGroup.class);
        updateAvatarDialog.mAvatarContainer = Utils.findRequiredView(view, C0906R.id.ht, "field 'mAvatarContainer'");
        updateAvatarDialog.mAvatarDecoration = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.c6u, "field 'mAvatarDecoration'", ImageView.class);
        updateAvatarDialog.mDecorationRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.i0, "field 'mDecorationRecyclerView'", RecyclerView.class);
    }
}
