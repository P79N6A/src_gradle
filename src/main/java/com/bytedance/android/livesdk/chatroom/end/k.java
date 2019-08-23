package com.bytedance.android.livesdk.chatroom.end;

import com.bytedance.android.livesdkapi.depend.model.live.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;

public final /* synthetic */ class k implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10117a;

    /* renamed from: b  reason: collision with root package name */
    static final Function f10118b = new k();

    private k() {
    }

    public final Object apply(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f10117a, false, 4278, new Class[]{Object.class}, Object.class)) {
            return Long.valueOf(((g) obj).f18736b.getId());
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f10117a, false, 4278, new Class[]{Object.class}, Object.class);
    }
}
