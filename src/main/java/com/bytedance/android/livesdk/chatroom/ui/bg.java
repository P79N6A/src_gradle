package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.livesdk.sticker.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import io.reactivex.functions.Function;

public final /* synthetic */ class bg implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11929a;

    /* renamed from: b  reason: collision with root package name */
    static final Function f11930b = new bg();

    private bg() {
    }

    public final Object apply(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f11929a, false, 5792, new Class[]{Object.class}, Object.class)) {
            return h.a((Effect) obj);
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f11929a, false, 5792, new Class[]{Object.class}, Object.class);
    }
}
