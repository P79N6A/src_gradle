package com.ss.android.ugc.aweme.net.interceptor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.framework.a.a;
import io.reactivex.functions.Action;
import java.util.List;
import org.json.JSONObject;

public final /* synthetic */ class l implements Action {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56977a;

    /* renamed from: b  reason: collision with root package name */
    private final String f56978b;

    l(String str) {
        this.f56978b = str;
    }

    public final void run() {
        List list;
        if (PatchProxy.isSupport(new Object[0], this, f56977a, false, 60944, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56977a, false, 60944, new Class[0], Void.TYPE);
            return;
        }
        String str = this.f56978b;
        try {
            Class<?> cls = Class.forName("com.ss.ugc.aweme.proto.aweme_v2_feed_response");
            if (PatchProxy.isSupport(new Object[]{str, cls}, null, h.f56972a, true, 60929, new Class[]{String.class, Class.class}, List.class)) {
                list = (List) PatchProxy.accessDispatch(new Object[]{str, cls}, null, h.f56972a, true, 60929, new Class[]{String.class, Class.class}, List.class);
            } else {
                list = h.a(new JSONObject(str), cls);
            }
            if (!list.isEmpty()) {
                a.a("FeedApiProto", "verify fields error:\n" + list.toString());
                com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), "maybe miss field in *.proto?please contact liuyiming.777").a();
            }
        } catch (Throwable th) {
            a.a("FeedApiProto", "verify error:" + th);
        }
    }
}
