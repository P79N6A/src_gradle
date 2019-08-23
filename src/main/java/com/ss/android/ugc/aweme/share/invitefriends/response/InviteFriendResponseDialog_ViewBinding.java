package com.ss.android.ugc.aweme.share.invitefriends.response;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;

public class InviteFriendResponseDialog_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65126a;

    /* renamed from: b  reason: collision with root package name */
    private InviteFriendResponseDialog f65127b;

    /* renamed from: c  reason: collision with root package name */
    private View f65128c;

    /* renamed from: d  reason: collision with root package name */
    private View f65129d;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f65126a, false, 73572, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65126a, false, 73572, new Class[0], Void.TYPE);
            return;
        }
        InviteFriendResponseDialog inviteFriendResponseDialog = this.f65127b;
        if (inviteFriendResponseDialog != null) {
            this.f65127b = null;
            inviteFriendResponseDialog.mAvatarView = null;
            inviteFriendResponseDialog.mUserName = null;
            inviteFriendResponseDialog.mDescription = null;
            inviteFriendResponseDialog.mConfirmButton = null;
            this.f65128c.setOnClickListener(null);
            this.f65128c = null;
            this.f65129d.setOnClickListener(null);
            this.f65129d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public InviteFriendResponseDialog_ViewBinding(final InviteFriendResponseDialog inviteFriendResponseDialog, View view) {
        this.f65127b = inviteFriendResponseDialog;
        inviteFriendResponseDialog.mAvatarView = (AvatarImageView) Utils.findRequiredViewAsType(view, C0906R.id.ayr, "field 'mAvatarView'", AvatarImageView.class);
        inviteFriendResponseDialog.mUserName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.title, "field 'mUserName'", TextView.class);
        inviteFriendResponseDialog.mDescription = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.a3u, "field 'mDescription'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.a4g, "field 'mConfirmButton' and method 'onConfirmButtonClick'");
        inviteFriendResponseDialog.mConfirmButton = (Button) Utils.castView(findRequiredView, C0906R.id.a4g, "field 'mConfirmButton'", Button.class);
        this.f65128c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65130a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f65130a, false, 73573, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f65130a, false, 73573, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                inviteFriendResponseDialog.onConfirmButtonClick();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.ti, "method 'onCloseClick'");
        this.f65129d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65133a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f65133a, false, 73574, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f65133a, false, 73574, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                inviteFriendResponseDialog.onCloseClick();
            }
        });
    }
}
