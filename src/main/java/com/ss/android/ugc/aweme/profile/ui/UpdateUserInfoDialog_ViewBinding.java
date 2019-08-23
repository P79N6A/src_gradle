package com.ss.android.ugc.aweme.profile.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class UpdateUserInfoDialog_ViewBinding implements Unbinder {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f62380b;

    /* renamed from: a  reason: collision with root package name */
    private UpdateUserInfoDialog f62381a;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f62380b, false, 69091, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62380b, false, 69091, new Class[0], Void.TYPE);
            return;
        }
        UpdateUserInfoDialog updateUserInfoDialog = this.f62381a;
        if (updateUserInfoDialog != null) {
            this.f62381a = null;
            updateUserInfoDialog.mNickNameEditText = null;
            updateUserInfoDialog.mConfirmUpdate = null;
            updateUserInfoDialog.mClose = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public UpdateUserInfoDialog_ViewBinding(UpdateUserInfoDialog updateUserInfoDialog, View view) {
        this.f62381a = updateUserInfoDialog;
        updateUserInfoDialog.mNickNameEditText = (EditText) Utils.findRequiredViewAsType(view, C0906R.id.bqp, "field 'mNickNameEditText'", EditText.class);
        updateUserInfoDialog.mConfirmUpdate = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.y3, "field 'mConfirmUpdate'", TextView.class);
        updateUserInfoDialog.mClose = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.f4429tv, "field 'mClose'", ImageView.class);
    }
}
