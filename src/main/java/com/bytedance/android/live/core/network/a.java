package com.bytedance.android.live.core.network;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.live.core.network.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7847a;

    public void a(Map<String, String> map) {
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{map2}, this, f7847a, false, 400, new Class[]{Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map2}, this, f7847a, false, 400, new Class[]{Map.class}, Void.TYPE);
            return;
        }
        map2.put("webcast_sdk_version", "1150");
    }

    public final c.a a(c.a aVar) {
        c.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f7847a, false, 401, new Class[]{c.a.class}, c.a.class)) {
            return (c.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f7847a, false, 401, new Class[]{c.a.class}, c.a.class);
        }
        String str = aVar2.f7858a;
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder(str);
            a(sb);
            aVar2.f7858a = sb.toString();
        }
        return aVar2;
    }

    private void a(StringBuilder sb) {
        StringBuilder sb2 = sb;
        if (PatchProxy.isSupport(new Object[]{sb2}, this, f7847a, false, 399, new Class[]{StringBuilder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sb2}, this, f7847a, false, 399, new Class[]{StringBuilder.class}, Void.TYPE);
            return;
        }
        if (sb.toString().indexOf(63) < 0) {
            sb2.append("?");
        } else {
            sb2.append("&");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a((Map<String, String>) linkedHashMap);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        sb2.append(e.a((List<Pair<String, String>>) arrayList, "UTF-8"));
    }
}
