package com.bytedance.android.livesdk.chatroom.interact;

import com.bytedance.android.livesdk.chatroom.api.LogReportApi;
import com.bytedance.android.livesdk.chatroom.model.r;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;

public final /* synthetic */ class p implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10988a;

    /* renamed from: b  reason: collision with root package name */
    static final Function f10989b = new p();

    private p() {
    }

    public final Object apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10988a, false, 4423, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f10988a, false, 4423, new Class[]{Object.class}, Object.class);
        }
        return ((LogReportApi) j.q().d().a(LogReportApi.class)).logReport("a", (r) obj);
    }
}
