package com.ss.android.ugc.aweme.zhima;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.setting.model.CommonResponse;
import com.ss.android.ugc.aweme.w.a.a;
import java.util.concurrent.Callable;

public final class b extends a<CommonResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76952a;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f76952a, false, 90161, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76952a, false, 90161, new Class[0], Void.TYPE);
            return;
        }
        m.a().a(this.mHandler, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f76953a;

            public final Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f76953a, false, 90163, new Class[0], Object.class)) {
                    return VerifyApi.a();
                }
                return PatchProxy.accessDispatch(new Object[0], this, f76953a, false, 90163, new Class[0], Object.class);
            }
        }, 0);
    }

    public final /* synthetic */ void handleData(Object obj) {
        CommonResponse commonResponse = (CommonResponse) obj;
        if (PatchProxy.isSupport(new Object[]{commonResponse}, this, f76952a, false, 90162, new Class[]{CommonResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{commonResponse}, this, f76952a, false, 90162, new Class[]{CommonResponse.class}, Void.TYPE);
            return;
        }
        super.handleData(commonResponse);
        if (((CommonResponse) this.mData).statusCode == 0) {
            com.bytedance.ies.dmt.ui.d.a.c(i.a().getContext(), "清除成功~ 可以去重新走认证流程了", 0).a();
        } else {
            com.bytedance.ies.dmt.ui.d.a.b(i.a().getContext(), "清除失败@_@", 0).a();
        }
    }
}
