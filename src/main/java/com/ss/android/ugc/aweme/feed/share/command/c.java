package com.ss.android.ugc.aweme.feed.share.command;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45937a;

    /* renamed from: b  reason: collision with root package name */
    private final CommandObserver f45938b;

    /* renamed from: c  reason: collision with root package name */
    private final String f45939c;

    c(CommandObserver commandObserver, String str) {
        this.f45938b = commandObserver;
        this.f45939c = str;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f45937a, false, 42155, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45937a, false, 42155, new Class[0], Void.TYPE);
            return;
        }
        this.f45938b.a(this.f45939c, "sms_invite_code", 0);
    }
}
