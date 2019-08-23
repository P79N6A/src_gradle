package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;
import org.json.JSONObject;

public final /* synthetic */ class bg implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13019a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13020b;

    public bg(String str) {
        this.f13020b = str;
    }

    public final Object apply(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f13019a, false, 7033, new Class[]{Object.class}, Object.class)) {
            return new JSONObject(this.f13020b);
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f13019a, false, 7033, new Class[]{Object.class}, Object.class);
    }
}
