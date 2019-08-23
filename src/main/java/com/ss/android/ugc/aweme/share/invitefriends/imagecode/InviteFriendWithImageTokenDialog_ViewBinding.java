package com.ss.android.ugc.aweme.share.invitefriends.imagecode;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class InviteFriendWithImageTokenDialog_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65075a;

    /* renamed from: b  reason: collision with root package name */
    private InviteFriendWithImageTokenDialog f65076b;

    /* renamed from: c  reason: collision with root package name */
    private View f65077c;

    /* renamed from: d  reason: collision with root package name */
    private View f65078d;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f65075a, false, 73557, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65075a, false, 73557, new Class[0], Void.TYPE);
            return;
        }
        InviteFriendWithImageTokenDialog inviteFriendWithImageTokenDialog = this.f65076b;
        if (inviteFriendWithImageTokenDialog != null) {
            this.f65076b = null;
            inviteFriendWithImageTokenDialog.mForSaveImageView = null;
            inviteFriendWithImageTokenDialog.mTitle = null;
            inviteFriendWithImageTokenDialog.mTitle2 = null;
            inviteFriendWithImageTokenDialog.mDescription = null;
            inviteFriendWithImageTokenDialog.mDescription2 = null;
            inviteFriendWithImageTokenDialog.mQrCode = null;
            inviteFriendWithImageTokenDialog.mQrCode2 = null;
            this.f65077c.setOnClickListener(null);
            this.f65077c = null;
            this.f65078d.setOnClickListener(null);
            this.f65078d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public InviteFriendWithImageTokenDialog_ViewBinding(final InviteFriendWithImageTokenDialog inviteFriendWithImageTokenDialog, View view) {
        this.f65076b = inviteFriendWithImageTokenDialog;
        inviteFriendWithImageTokenDialog.mForSaveImageView = Utils.findRequiredView(view, C0906R.id.aho, "field 'mForSaveImageView'");
        inviteFriendWithImageTokenDialog.mTitle = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.title, "field 'mTitle'", TextView.class);
        inviteFriendWithImageTokenDialog.mTitle2 = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.d3_, "field 'mTitle2'", TextView.class);
        inviteFriendWithImageTokenDialog.mDescription = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.a3u, "field 'mDescription'", TextView.class);
        inviteFriendWithImageTokenDialog.mDescription2 = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.a3v, "field 'mDescription2'", TextView.class);
        inviteFriendWithImageTokenDialog.mQrCode = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.c9n, "field 'mQrCode'", RemoteImageView.class);
        inviteFriendWithImageTokenDialog.mQrCode2 = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.c9o, "field 'mQrCode2'", RemoteImageView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.ti, "method 'onCloseClick'");
        this.f65077c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65079a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f65079a, false, 73558, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f65079a, false, 73558, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                inviteFriendWithImageTokenDialog.onCloseClick();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.a4g, "method 'onConfirmClick'");
        this.f65078d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65082a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f65082a, false, 73559, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f65082a, false, 73559, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                inviteFriendWithImageTokenDialog.onConfirmClick();
            }
        });
    }
}
