package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.data.IMessage;
import io.reactivex.functions.Function;

public final /* synthetic */ class gv implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10773a;

    /* renamed from: b  reason: collision with root package name */
    private final IMessage f10774b;

    gv(IMessage iMessage) {
        this.f10774b = iMessage;
    }

    public final Object apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10773a, false, 5010, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f10773a, false, 5010, new Class[]{Object.class}, Object.class);
        }
        return a.a().toJson((Object) this.f10774b);
    }
}
