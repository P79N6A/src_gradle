package com.ss.android.ugc.aweme.tools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.bc;
import com.taobao.android.dexposed.ClassUtils;
import java.io.PrintWriter;

public final class ab<T extends bc> implements bg<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74596a;

    /* renamed from: b  reason: collision with root package name */
    bg<T> f74597b;

    /* renamed from: c  reason: collision with root package name */
    PrintWriter f74598c;

    private String a(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f74596a, false, 86971, new Class[]{Object.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{obj}, this, f74596a, false, 86971, new Class[]{Object.class}, String.class);
        }
        String name = obj.getClass().getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    public ab(bg<T> bgVar, PrintWriter printWriter) {
        this.f74597b = bgVar;
        this.f74598c = printWriter;
    }

    public final void a(Object obj, T t) {
        if (PatchProxy.isSupport(new Object[]{obj, t}, this, f74596a, false, 86970, new Class[]{Object.class, bc.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj, t}, this, f74596a, false, 86970, new Class[]{Object.class, bc.class}, Void.TYPE);
            return;
        }
        String a2 = a(obj);
        String a3 = a(this.f74597b);
        PrintWriter printWriter = this.f74598c;
        printWriter.println("Dispatching " + t + " from " + a2 + " to " + a3 + ClassUtils.PACKAGE_SEPARATOR);
        try {
            this.f74597b.a(obj, t);
        } catch (RuntimeException e2) {
            PrintWriter printWriter2 = this.f74598c;
            printWriter2.println("RuntimeException occurred dispatching event " + t + " from " + a2 + " to handler " + a3 + ".\n" + e2.toString());
            throw e2;
        } catch (Error e3) {
            PrintWriter printWriter3 = this.f74598c;
            printWriter3.println("Error occurred dispatching event " + t + " from " + a2 + " to handler " + a3 + ".\n" + e3.toString());
            throw e3;
        }
    }
}
