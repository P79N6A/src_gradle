package com.bytedance.android.livesdk.message;

import android.text.TextUtils;
import com.bytedance.android.live.core.d.d;
import com.bytedance.android.live.core.d.e;
import com.bytedance.android.livesdk.j.c;
import com.google.a.a.a.a.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16389a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, Object> f16390b = new HashMap();

    public static void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f16389a, true, 10956, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f16389a, true, 10956, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", PushConstants.PUSH_TYPE_NOTIFY);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("stack_trace", str4);
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("error_msg", str3);
        }
        e.a(d.b("ttlive_fetch_message"), 1, (Map<String, Object>) hashMap);
        a(d.b("ttlive_fetch_message"), (Map<String, Object>) hashMap);
    }

    public static void a(Exception exc, String str) {
        Exception exc2 = exc;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{exc2, str2}, null, f16389a, true, 10957, new Class[]{Exception.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2, str2}, null, f16389a, true, 10957, new Class[]{Exception.class, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        StringWriter stringWriter = new StringWriter();
        a.a((Throwable) exc2, new PrintWriter(stringWriter));
        hashMap.put("error_code", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        hashMap.put("method_name", str2);
        hashMap.put("error_msg", exc.getMessage());
        hashMap.put("stack_trace", stringWriter.toString());
        e.a(d.b("ttlive_fetch_message"), 1, (Map<String, Object>) hashMap);
        a(d.b("ttlive_fetch_message"), (Map<String, Object>) hashMap);
    }

    private static void a(String str, Map<String, Object> map) {
        Map<String, Object> map2 = map;
        if (PatchProxy.isSupport(new Object[]{str, map2}, null, f16389a, true, 10958, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, map2}, null, f16389a, true, 10958, new Class[]{String.class, Map.class}, Void.TYPE);
            return;
        }
        map2.put("event_name", str.toUpperCase());
        c.b().c("ttlive_msg", map2);
    }

    public static void a(String str, String str2, long j) {
        String str3 = str;
        String str4 = str2;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str3, str4, new Long(j2)}, null, f16389a, true, 10959, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, new Long(j2)}, null, f16389a, true, 10959, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        f16390b.put("event_name", str3);
        f16390b.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, str4);
        f16390b.put("msg_id", Long.valueOf(j));
        c.b().b("ttlive_msg", f16390b);
    }
}
