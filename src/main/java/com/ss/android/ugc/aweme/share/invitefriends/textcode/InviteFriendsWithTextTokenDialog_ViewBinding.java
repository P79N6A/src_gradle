package com.ss.android.ugc.aweme.share.invitefriends.textcode;

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
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;

public class InviteFriendsWithTextTokenDialog_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65181a;

    /* renamed from: b  reason: collision with root package name */
    private InviteFriendsWithTextTokenDialog f65182b;

    /* renamed from: c  reason: collision with root package name */
    private View f65183c;

    /* renamed from: d  reason: collision with root package name */
    private View f65184d;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f65181a, false, 73616, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65181a, false, 73616, new Class[0], Void.TYPE);
            return;
        }
        InviteFriendsWithTextTokenDialog inviteFriendsWithTextTokenDialog = this.f65182b;
        if (inviteFriendsWithTextTokenDialog != null) {
            this.f65182b = null;
            inviteFriendsWithTextTokenDialog.mAvatarImageView = null;
            inviteFriendsWithTextTokenDialog.mTextTokenTextView = null;
            inviteFriendsWithTextTokenDialog.mDescriptionTextView = null;
            inviteFriendsWithTextTokenDialog.mConfirmButton = null;
            inviteFriendsWithTextTokenDialog.mTitleTextView = null;
            this.f65183c.setOnClickListener(null);
            this.f65183c = null;
            this.f65184d.setOnClickListener(null);
            this.f65184d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public InviteFriendsWithTextTokenDialog_ViewBinding(final InviteFriendsWithTextTokenDialog inviteFriendsWithTextTokenDialog, View view) {
        this.f65182b = inviteFriendsWithTextTokenDialog;
        inviteFriendsWithTextTokenDialog.mAvatarImageView = (AvatarWithBorderView) Utils.findRequiredViewAsType(view, C0906R.id.ayr, "field 'mAvatarImageView'", AvatarWithBorderView.class);
        inviteFriendsWithTextTokenDialog.mTextTokenTextView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.d20, "field 'mTextTokenTextView'", TextView.class);
        inviteFriendsWithTextTokenDialog.mDescriptionTextView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.a3u, "field 'mDescriptionTextView'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.a4g, "field 'mConfirmButton' and method 'onConfirmClick'");
        inviteFriendsWithTextTokenDialog.mConfirmButton = (Button) Utils.castView(findRequiredView, C0906R.id.a4g, "field 'mConfirmButton'", Button.class);
        this.f65183c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65185a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f65185a, false, 73617, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f65185a, false, 73617, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                inviteFriendsWithTextTokenDialog.onConfirmClick();
            }
        });
        inviteFriendsWithTextTokenDialog.mTitleTextView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.title, "field 'mTitleTextView'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.ti, "method 'onCloseClick'");
        this.f65184d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65188a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f65188a, false, 73618, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f65188a, false, 73618, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                inviteFriendsWithTextTokenDialog.onCloseClick();
            }
        });
    }
}
