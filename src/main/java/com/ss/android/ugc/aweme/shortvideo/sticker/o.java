package com.ss.android.ugc.aweme.shortvideo.sticker;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.Callable;

public final /* synthetic */ class o implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70177a;

    /* renamed from: b  reason: collision with root package name */
    private final Effect f70178b;

    o(Effect effect) {
        this.f70178b = effect;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f70177a, false, 78665, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f70177a, false, 78665, new Class[0], Object.class);
        }
        return a.x.a(this.f70178b.designer_id);
    }
}
