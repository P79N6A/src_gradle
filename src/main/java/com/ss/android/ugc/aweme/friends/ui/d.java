package com.ss.android.ugc.aweme.friends.ui;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.widget.RemarkEditDialog;

public final /* synthetic */ class d implements RemarkEditDialog.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49449a;

    /* renamed from: b  reason: collision with root package name */
    private final ContactsActivity f49450b;

    /* renamed from: c  reason: collision with root package name */
    private final User f49451c;

    /* renamed from: d  reason: collision with root package name */
    private final FollowStatus f49452d;

    d(ContactsActivity contactsActivity, User user, FollowStatus followStatus) {
        this.f49450b = contactsActivity;
        this.f49451c = user;
        this.f49452d = followStatus;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f49449a, false, 47087, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49449a, false, 47087, new Class[0], Void.TYPE);
            return;
        }
        ContactsActivity contactsActivity = this.f49450b;
        User user = this.f49451c;
        FollowStatus followStatus = this.f49452d;
        if (!TextUtils.isEmpty(user.getRemarkName())) {
            int b2 = contactsActivity.f3330b.b(followStatus.userId);
            if (b2 != -1) {
                contactsActivity.f3330b.notifyItemChanged(b2);
            }
        }
    }
}
