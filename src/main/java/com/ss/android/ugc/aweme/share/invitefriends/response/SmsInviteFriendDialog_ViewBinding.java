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

public class SmsInviteFriendDialog_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65140a;

    /* renamed from: b  reason: collision with root package name */
    private SmsInviteFriendDialog f65141b;

    /* renamed from: c  reason: collision with root package name */
    private View f65142c;

    /* renamed from: d  reason: collision with root package name */
    private View f65143d;

    /* renamed from: e  reason: collision with root package name */
    private View f65144e;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f65140a, false, 73595, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65140a, false, 73595, new Class[0], Void.TYPE);
            return;
        }
        SmsInviteFriendDialog smsInviteFriendDialog = this.f65141b;
        if (smsInviteFriendDialog != null) {
            this.f65141b = null;
            smsInviteFriendDialog.mAvatarView = null;
            smsInviteFriendDialog.mUserName = null;
            smsInviteFriendDialog.mDescription = null;
            smsInviteFriendDialog.mConfirmButton = null;
            this.f65142c.setOnClickListener(null);
            this.f65142c = null;
            this.f65143d.setOnClickListener(null);
            this.f65143d = null;
            this.f65144e.setOnClickListener(null);
            this.f65144e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public SmsInviteFriendDialog_ViewBinding(final SmsInviteFriendDialog smsInviteFriendDialog, View view) {
        this.f65141b = smsInviteFriendDialog;
        smsInviteFriendDialog.mAvatarView = (AvatarImageView) Utils.findRequiredViewAsType(view, C0906R.id.ayr, "field 'mAvatarView'", AvatarImageView.class);
        smsInviteFriendDialog.mUserName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.title, "field 'mUserName'", TextView.class);
        smsInviteFriendDialog.mDescription = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.a3u, "field 'mDescription'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.a4g, "field 'mConfirmButton' and method 'onConfirmButtonClick'");
        smsInviteFriendDialog.mConfirmButton = (Button) Utils.castView(findRequiredView, C0906R.id.a4g, "field 'mConfirmButton'", Button.class);
        this.f65142c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65145a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f65145a, false, 73596, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f65145a, false, 73596, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                smsInviteFriendDialog.onConfirmButtonClick();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.ti, "method 'onCloseClick'");
        this.f65143d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65148a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f65148a, false, 73597, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f65148a, false, 73597, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                smsInviteFriendDialog.onCloseClick();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.alb, "method 'onGotoProfile'");
        this.f65144e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65151a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f65151a, false, 73598, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f65151a, false, 73598, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                smsInviteFriendDialog.onGotoProfile();
            }
        });
    }
}
