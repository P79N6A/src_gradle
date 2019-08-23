package com.ss.android.ugc.aweme.global.config.settings;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.global.config.settings.pojo.a;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49531a;

    /* renamed from: b  reason: collision with root package name */
    private final a f49532b;

    b(a aVar) {
        this.f49532b = aVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f49531a, false, 47548, new Class[0], Object.class)) {
            return com.bytedance.ies.b.a(GlobalContext.getContext(), (Message) this.f49532b.f49568b);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f49531a, false, 47548, new Class[0], Object.class);
    }
}
