package com.ss.android.ugc.aweme.net;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.retrofit2.client.Header;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;

public final class ai {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56913a;

    public static List<Header> a(Headers headers) {
        Headers headers2 = headers;
        if (PatchProxy.isSupport(new Object[]{headers2}, null, f56913a, true, 60828, new Class[]{Headers.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{headers2}, null, f56913a, true, 60828, new Class[]{Headers.class}, List.class);
        } else if (headers2 == null) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (String next : headers.names()) {
                arrayList.add(new Header(next, headers2.get(next)));
            }
            return arrayList;
        }
    }

    public static Headers a(List<Header> list) {
        if (PatchProxy.isSupport(new Object[]{list}, null, f56913a, true, 60829, new Class[]{List.class}, Headers.class)) {
            return (Headers) PatchProxy.accessDispatch(new Object[]{list}, null, f56913a, true, 60829, new Class[]{List.class}, Headers.class);
        } else if (CollectionUtils.isEmpty(list)) {
            return null;
        } else {
            HashMap hashMap = new HashMap();
            for (Header next : list) {
                hashMap.put(next.getName(), next.getValue());
            }
            return Headers.of((Map<String, String>) hashMap);
        }
    }
}
