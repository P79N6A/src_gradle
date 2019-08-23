package com.ss.android.ugc.aweme.qrcode.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.qrcode.g;
import java.io.File;

public final class i extends b {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f63384b;

    public final File b() {
        if (PatchProxy.isSupport(new Object[0], this, f63384b, false, 70425, new Class[0], File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[0], this, f63384b, false, 70425, new Class[0], File.class);
        } else if (PatchProxy.isSupport(new Object[0], null, g.f63484a, true, 70388, new Class[0], File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[0], null, g.f63484a, true, 70388, new Class[0], File.class);
        } else {
            return g.a(0);
        }
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f63384b, false, 70426, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63384b, false, 70426, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (PatchProxy.isSupport(new Object[0], null, g.f63484a, true, 70392, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, g.f63484a, true, 70392, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            return g.c(0);
        }
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f63384b, false, 70427, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f63384b, false, 70427, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{str2}, null, g.f63484a, true, 70394, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, g.f63484a, true, 70394, new Class[]{String.class}, Void.TYPE);
            return;
        }
        g.a(str2, 0);
    }
}
