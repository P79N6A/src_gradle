package com.ss.android.ugc.aweme.shortvideo.ui;

import com.google.common.a.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.o.c;

public final /* synthetic */ class e implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70885a;

    /* renamed from: b  reason: collision with root package name */
    static final f f70886b = new e();

    private e() {
    }

    public final Object apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f70885a, false, 80165, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f70885a, false, 80165, new Class[]{Object.class}, Object.class);
        }
        return new c().apply(com.ss.android.ugc.aweme.music.util.c.f56796b.a((Music) obj));
    }
}
