package com.ss.android.ugc.aweme.comment.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.n;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36279a;

    public static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f36279a, true, 27184, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f36279a, true, 27184, new Class[]{String.class}, Void.TYPE);
            return;
        }
        n.a("comment_not_show", new c().a("comment_not_show_message", str2).b());
    }

    public static void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f36279a, true, 27185, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f36279a, true, 27185, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a("NOTICE:" + str2);
    }
}
