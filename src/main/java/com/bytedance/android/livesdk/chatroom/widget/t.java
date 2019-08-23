package com.bytedance.android.livesdk.chatroom.widget;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class t implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13553a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f13554b = new t();

    private t() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13553a, false, 7981, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13553a, false, 7981, new Class[]{Object.class}, Void.TYPE);
        }
    }
}
