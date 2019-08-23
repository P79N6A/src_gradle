package com.ss.android.ugc.aweme.plugin.b.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;

public final class b extends IOException {
    public static ChangeQuickRedirect changeQuickRedirect;

    private b(String str) {
        super(str);
    }

    public static void rethrowReadDataException(IOException iOException) throws b {
        String str;
        if (PatchProxy.isSupport(new Object[]{iOException}, null, changeQuickRedirect, true, 64608, new Class[]{IOException.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iOException}, null, changeQuickRedirect, true, 64608, new Class[]{IOException.class}, Void.TYPE);
            return;
        }
        if (iOException != null) {
            str = iOException.getMessage();
        } else {
            str = "";
        }
        throw new b("ReadDataException: " + str);
    }
}
