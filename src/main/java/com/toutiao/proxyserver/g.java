package com.toutiao.proxyserver;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;

public final class g extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f80081a;

    /* renamed from: b  reason: collision with root package name */
    public final File f80082b;

    /* access modifiers changed from: package-private */
    public final File d(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, this, f80081a, false, 91624, new Class[]{String.class}, File.class)) {
            return f(str);
        }
        return (File) PatchProxy.accessDispatch(new Object[]{str}, this, f80081a, false, 91624, new Class[]{String.class}, File.class);
    }

    /* access modifiers changed from: package-private */
    public final File e(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, this, f80081a, false, 91625, new Class[]{String.class}, File.class)) {
            return f(str);
        }
        return (File) PatchProxy.accessDispatch(new Object[]{str}, this, f80081a, false, 91625, new Class[]{String.class}, File.class);
    }

    private File f(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f80081a, false, 91627, new Class[]{String.class}, File.class)) {
            return new File(this.f80082b, str2);
        }
        return (File) PatchProxy.accessDispatch(new Object[]{str2}, this, f80081a, false, 91627, new Class[]{String.class}, File.class);
    }
}
