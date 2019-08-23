package com.ss.android.ugc.aweme.commercialize.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.net.c;
import com.ss.android.ugc.aweme.net.e;
import com.ss.android.ugc.aweme.net.p;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38502a;

    public static void a(e eVar, String str, boolean z) {
        String str2;
        e eVar2 = eVar;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{eVar2, str3, Byte.valueOf(z ? (byte) 1 : 0)}, null, f38502a, true, 30423, new Class[]{e.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2, str3, Byte.valueOf(z)}, null, f38502a, true, 30423, new Class[]{e.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.ss.android.http.a.b.e("aweme_id", str3));
        if (z) {
            str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str2 = PushConstants.PUSH_TYPE_NOTIFY;
        }
        arrayList.add(new com.ss.android.http.a.b.e("need_top", String.valueOf(str2)));
        c cVar = new c("https://aweme.snssdk.com/aweme/v2/commit/item/top/", p.POST, (List<com.ss.android.http.a.b.e>) arrayList, String.class);
        cVar.a(eVar2);
        cVar.h = false;
        cVar.a();
    }
}
