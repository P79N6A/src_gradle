package com.ss.android.ugc.aweme.friends.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49447a;

    /* renamed from: b  reason: collision with root package name */
    private final ContactsActivity f49448b;

    c(ContactsActivity contactsActivity) {
        this.f49448b = contactsActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f49447a, false, 47086, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49447a, false, 47086, new Class[0], Void.TYPE);
            return;
        }
        ContactsActivity contactsActivity = this.f49448b;
        if (!contactsActivity.isFinishing()) {
            contactsActivity.f3331c.a(1);
        }
    }
}
