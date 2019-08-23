package com.ss.android.ugc.aweme.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.player.sdk.api.a;
import com.ss.android.ugc.playerkit.b.b;

public final /* synthetic */ class p implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76184a;

    /* renamed from: b  reason: collision with root package name */
    static final a f76185b = new p();

    private p() {
    }

    public final String a(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, this, f76184a, false, 89025, new Class[]{String.class}, String.class)) {
            return b.b(str);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f76184a, false, 89025, new Class[]{String.class}, String.class);
    }
}
