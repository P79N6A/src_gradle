package com.ss.android.ugc.aweme.story.shootvideo.edit;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.shootvideo.c;
import java.util.concurrent.Callable;

public final /* synthetic */ class m implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73497a;

    /* renamed from: b  reason: collision with root package name */
    private final a f73498b;

    m(a aVar) {
        this.f73498b = aVar;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f73497a, false, 85252, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f73497a, false, 85252, new Class[0], Object.class);
        }
        a aVar = this.f73498b;
        return c.a((View) aVar.l.f74199d, aVar.D.f(), aVar.D.g());
    }
}
