package com.ss.android.ugc.aweme.live.livehostimpl;

import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdkapi.host.o;
import com.bytedance.retrofit2.client.Header;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.sdk.c.c;
import com.ss.android.ugc.aweme.web.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class x implements o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53490a;

    /* renamed from: b  reason: collision with root package name */
    private c f53491b;

    public final List<String> a() {
        return f.f76629b;
    }

    x() {
        BaseAppData a2 = BaseAppData.a();
        this.f53491b = new c(a2.o().a()).a(y.f53493b).a(a2.f2499b).a(com.bytedance.android.livesdkapi.e.c.f18754c);
        b.a(o.class, this);
    }

    public final List<String> a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f53490a, false, 55858, new Class[]{String.class}, List.class)) {
            return NetworkUtils.getShareCookie(CookieManager.getInstance(), str2);
        }
        return (List) PatchProxy.accessDispatch(new Object[]{str2}, this, f53490a, false, 55858, new Class[]{String.class}, List.class);
    }

    public final Map<String, String> b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f53490a, false, 55859, new Class[]{String.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{str2}, this, f53490a, false, 55859, new Class[]{String.class}, Map.class);
        }
        ArrayList<Header> arrayList = new ArrayList<>();
        com.ss.android.account.token.c.a(str2, (List<Header>) arrayList);
        HashMap hashMap = new HashMap();
        for (Header header : arrayList) {
            hashMap.put(header.getName(), header.getValue());
        }
        return hashMap;
    }

    public final WebResourceResponse c(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f53490a, false, 55860, new Class[]{String.class}, WebResourceResponse.class)) {
            return this.f53491b.a(str2);
        }
        return (WebResourceResponse) PatchProxy.accessDispatch(new Object[]{str2}, this, f53490a, false, 55860, new Class[]{String.class}, WebResourceResponse.class);
    }
}
