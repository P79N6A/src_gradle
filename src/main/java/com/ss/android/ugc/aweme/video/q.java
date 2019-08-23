package com.ss.android.ugc.aweme.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.player.sdk.api.a;
import com.ss.android.ugc.playerkit.b.b;

public final /* synthetic */ class q implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76264a;

    /* renamed from: b  reason: collision with root package name */
    static final a f76265b = new q();

    private q() {
    }

    public final String a(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, this, f76264a, false, 89026, new Class[]{String.class}, String.class)) {
            return b.b(str);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f76264a, false, 89026, new Class[]{String.class}, String.class);
    }
}
