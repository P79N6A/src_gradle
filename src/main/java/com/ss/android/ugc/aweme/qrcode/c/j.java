package com.ss.android.ugc.aweme.qrcode.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.qrcode.g;
import java.io.File;

public final class j extends b {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f63385b;

    public final File b() {
        if (!PatchProxy.isSupport(new Object[0], this, f63385b, false, 70428, new Class[0], File.class)) {
            return g.a(1);
        }
        return (File) PatchProxy.accessDispatch(new Object[0], this, f63385b, false, 70428, new Class[0], File.class);
    }

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f63385b, false, 70429, new Class[0], Boolean.TYPE)) {
            return g.c(1);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63385b, false, 70429, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f63385b, false, 70430, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f63385b, false, 70430, new Class[]{String.class}, Void.TYPE);
            return;
        }
        g.a(str2, 1);
    }
}
