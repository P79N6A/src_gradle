package com.ss.android.ugc.aweme.tools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class be {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74661a;

    /* renamed from: b  reason: collision with root package name */
    private final List<bh> f74662b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private boolean f74663c;

    /* renamed from: d  reason: collision with root package name */
    private PrintWriter f74664d;

    public final bd a() {
        PrintWriter printWriter;
        if (PatchProxy.isSupport(new Object[0], this, f74661a, false, 87009, new Class[0], bd.class)) {
            return (bd) PatchProxy.accessDispatch(new Object[0], this, f74661a, false, 87009, new Class[0], bd.class);
        }
        Collections.reverse(this.f74662b);
        List<bh> list = this.f74662b;
        boolean z = this.f74663c;
        if (!this.f74663c) {
            printWriter = null;
        } else if (this.f74664d == null) {
            printWriter = new PrintWriter(System.out);
        } else {
            printWriter = this.f74664d;
        }
        return new bd(list, z, printWriter);
    }

    public final be a(PrintWriter printWriter) {
        this.f74664d = printWriter;
        return this;
    }

    public final be a(boolean z) {
        this.f74663c = z;
        return this;
    }

    public final be a(bh bhVar) {
        if (PatchProxy.isSupport(new Object[]{bhVar}, this, f74661a, false, 87007, new Class[]{bh.class}, be.class)) {
            return (be) PatchProxy.accessDispatch(new Object[]{bhVar}, this, f74661a, false, 87007, new Class[]{bh.class}, be.class);
        }
        this.f74662b.add(bhVar);
        return this;
    }
}
