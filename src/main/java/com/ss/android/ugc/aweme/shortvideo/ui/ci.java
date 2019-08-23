package com.ss.android.ugc.aweme.shortvideo.ui;

import a.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class ci implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70868a;

    /* renamed from: b  reason: collision with root package name */
    private final String f70869b;

    /* renamed from: c  reason: collision with root package name */
    private final j f70870c;

    ci(String str, j jVar) {
        this.f70869b = str;
        this.f70870c = jVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f70868a, false, 80727, new Class[0], Object.class)) {
            return VideoRecordPermissionActivity.a(this.f70869b, this.f70870c);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f70868a, false, 80727, new Class[0], Object.class);
    }
}
