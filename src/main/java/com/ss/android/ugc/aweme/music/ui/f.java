package com.ss.android.ugc.aweme.music.ui;

import android.support.v4.util.ArrayMap;
import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.al.a;
import java.io.IOException;

public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56700a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayMap<String, Pair<Long, byte[]>> f56701b = new ArrayMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final a f56702c;

    public final void close() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f56700a, false, 60152, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56700a, false, 60152, new Class[0], Void.TYPE);
            return;
        }
        this.f56701b.clear();
        this.f56702c.close();
    }

    public f(a aVar) {
        this.f56702c = aVar;
    }
}
