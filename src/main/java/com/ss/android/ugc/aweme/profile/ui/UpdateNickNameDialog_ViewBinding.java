package com.ss.android.ugc.aweme.profile.ui;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class UpdateNickNameDialog_ViewBinding extends UpdateUserInfoDialog_ViewBinding {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62373a;

    /* renamed from: c  reason: collision with root package name */
    private UpdateNickNameDialog f62374c;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f62373a, false, 69075, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62373a, false, 69075, new Class[0], Void.TYPE);
            return;
        }
        UpdateNickNameDialog updateNickNameDialog = this.f62374c;
        if (updateNickNameDialog != null) {
            this.f62374c = null;
            updateNickNameDialog.mPolicyDes = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public UpdateNickNameDialog_ViewBinding(UpdateNickNameDialog updateNickNameDialog, View view) {
        super(updateNickNameDialog, view);
        this.f62374c = updateNickNameDialog;
        updateNickNameDialog.mPolicyDes = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.c4_, "field 'mPolicyDes'", TextView.class);
    }
}
