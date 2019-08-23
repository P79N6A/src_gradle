package com.ss.android.ugc.aweme.friends.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;

public final /* synthetic */ class b implements SwipeRefreshLayout.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49445a;

    /* renamed from: b  reason: collision with root package name */
    private final ContactsActivity f49446b;

    b(ContactsActivity contactsActivity) {
        this.f49446b = contactsActivity;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f49445a, false, 47085, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49445a, false, 47085, new Class[0], Void.TYPE);
            return;
        }
        ContactsActivity contactsActivity = this.f49446b;
        if (contactsActivity.f3331c != null) {
            contactsActivity.f3331c.a(1);
            return;
        }
        contactsActivity.mRefreshLayout.setRefreshing(false);
    }
}
