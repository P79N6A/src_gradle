package com.ss.android.ugc.aweme.plugin.b.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;

public final class a extends IOException {
    public static ChangeQuickRedirect changeQuickRedirect;

    private a(String str) {
        super(str);
    }

    public static void rethrowEstablishConnectionException(Exception exc) throws a {
        String str;
        if (PatchProxy.isSupport(new Object[]{exc}, null, changeQuickRedirect, true, 64606, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, null, changeQuickRedirect, true, 64606, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (exc != null) {
            str = exc.getMessage();
        } else {
            str = "";
        }
        throw new a("EstablishConnectionException: " + str);
    }
}
