package com.ss.android.ugc.aweme.account.util;

import com.bytedance.sdk.account.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.login.f;
import com.ss.android.ugc.aweme.b;
import com.ss.android.ugc.aweme.v;
import java.util.concurrent.Callable;

public final /* synthetic */ class w implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33122a;

    /* renamed from: b  reason: collision with root package name */
    static final Callable f33123b = new w();

    private w() {
    }

    public final Object call() {
        c cVar;
        if (PatchProxy.isSupport(new Object[0], this, f33122a, false, 21454, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f33122a, false, 21454, new Class[0], Object.class);
        }
        if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.w.f50726a, true, 19479, new Class[0], c.class)) {
            cVar = (c) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.w.f50726a, true, 19479, new Class[0], c.class);
        } else {
            v moduleContext = com.ss.android.ugc.aweme.w.f50728c.getModuleContext();
            if (PatchProxy.isSupport(new Object[0], moduleContext, v.f50725a, false, 19465, new Class[0], c.class)) {
                cVar = (c) PatchProxy.accessDispatch(new Object[0], moduleContext, v.f50725a, false, 19465, new Class[0], c.class);
            } else {
                cVar = b.f34451c.c();
            }
        }
        return cVar.a(Integer.MAX_VALUE, f.f32225b);
    }
}
