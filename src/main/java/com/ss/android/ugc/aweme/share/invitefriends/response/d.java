package com.ss.android.ugc.aweme.share.invitefriends.response;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.u.d;
import com.ss.android.ugc.aweme.u.s;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65164a;

    /* renamed from: b  reason: collision with root package name */
    private final SmsInviteFriendDialog f65165b;

    d(SmsInviteFriendDialog smsInviteFriendDialog) {
        this.f65165b = smsInviteFriendDialog;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f65164a, false, 73591, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65164a, false, 73591, new Class[0], Void.TYPE);
            return;
        }
        SmsInviteFriendDialog smsInviteFriendDialog = this.f65165b;
        smsInviteFriendDialog.f65138c.a();
        s sVar = new s("follow");
        sVar.h(smsInviteFriendDialog.f65137b.getUid()).b("invite_friend_popup").c("follow_button").a("scene_id", "1032", d.a.f75112a);
        sVar.e();
    }
}
