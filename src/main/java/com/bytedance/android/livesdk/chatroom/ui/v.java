package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;

public final /* synthetic */ class v implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12303a;

    /* renamed from: b  reason: collision with root package name */
    static final Function f12304b = new v();

    private v() {
    }

    public final Object apply(Object obj) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f12303a, false, 5591, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f12303a, false, 5591, new Class[]{Object.class}, Object.class);
        }
        User user = (User) ((i) obj);
        if (user.getPayScores() > 0) {
            z = false;
        }
        user.setNeverRecharge(z);
        return user;
    }
}
