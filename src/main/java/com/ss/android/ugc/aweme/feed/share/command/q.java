package com.ss.android.ugc.aweme.feed.share.command;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.share.e;
import java.io.File;

public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46036a;

    /* renamed from: b  reason: collision with root package name */
    private final e.b f46037b;

    /* renamed from: c  reason: collision with root package name */
    private final File f46038c;

    q(e.b bVar, File file) {
        this.f46037b = bVar;
        this.f46038c = file;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f46036a, false, 42288, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46036a, false, 42288, new Class[0], Void.TYPE);
            return;
        }
        this.f46037b.a(this.f46038c);
    }
}
