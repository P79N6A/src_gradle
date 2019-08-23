package com.bytedance.android.livesdk.gift;

import com.bytedance.android.live.core.d.d;
import com.bytedance.android.live.core.d.e;
import com.bytedance.android.livesdk.j.a.a;
import com.bytedance.android.livesdk.j.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15142a;

    public static void a(long j, String str, String str2) {
        long j2 = j;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str3, str4}, null, f15142a, true, 9281, new Class[]{Long.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), str3, str4}, null, f15142a, true, 9281, new Class[]{Long.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("gift_id", Long.valueOf(j));
        hashMap.put("gift_icon_url", str3);
        hashMap.put("error_msg", str4);
        e.a(a("ttlive_gift_icon_load_status"), 1, (Map<String, Object>) hashMap);
        e.a(b("ttlive_gift_icon_load_status"), 1, (Map<String, Object>) hashMap);
        a.a().a(b.Gift.info, "ttlive_gift_icon_load_status", 1, (Map) hashMap);
    }

    public static String a(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, null, f15142a, true, 9278, new Class[]{String.class}, String.class)) {
            return d.a(str);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str}, null, f15142a, true, 9278, new Class[]{String.class}, String.class);
    }

    public static String b(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, null, f15142a, true, 9279, new Class[]{String.class}, String.class)) {
            return d.b(str);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str}, null, f15142a, true, 9279, new Class[]{String.class}, String.class);
    }

    public static void c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f15142a, true, 9287, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f15142a, true, 9287, new Class[]{String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("error_msg", str2);
        e.a(a("ttlive_gift_list_status"), 1, 0, (Map<String, Object>) hashMap);
        e.a(b("ttlive_gift_list_status"), 1, (Map<String, Object>) hashMap);
        a.a().a(b.Gift.info, "ttlive_gift_list_status", 1, (Map) hashMap);
    }

    public static void d(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f15142a, true, 9291, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f15142a, true, 9291, new Class[]{String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("error_msg", str2);
        e.a(a("ttlive_task_gift_list_status"), 1, 0, (Map<String, Object>) hashMap);
        e.a(b("ttlive_task_gift_list_status"), 1, (Map<String, Object>) hashMap);
        a.a().a(b.Gift.info, "ttlive_task_gift_list_status", 1, (Map) hashMap);
    }

    public static void a(long j, int i) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i)}, null, f15142a, true, 9284, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i)}, null, f15142a, true, 9284, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("asset_id", Long.valueOf(j));
        hashMap.put("source_type", Integer.valueOf(i));
        e.a(a("ttlive_gift_asset_download_source"), 0, (Map<String, Object>) hashMap);
    }

    public static void a(long j, String str) {
        long j2 = j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str2}, null, f15142a, true, 9280, new Class[]{Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), str2}, null, f15142a, true, 9280, new Class[]{Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("gift_id", Long.valueOf(j));
        hashMap.put("gift_icon_url", str2);
        e.a(a("ttlive_gift_icon_load_status"), 0, (Map<String, Object>) hashMap);
    }

    public static void a(long j, long j2, long j3) {
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        if (PatchProxy.isSupport(new Object[]{new Long(j4), new Long(j5), new Long(j6)}, null, f15142a, true, 9296, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {new Long(j4), new Long(j5), new Long(j6)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f15142a, true, 9296, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(j2));
        hashMap.put("gift_id", Long.valueOf(j));
        e.a(a("ttlive_gift_send_status"), 0, j6, (Map<String, Object>) hashMap);
    }

    public static void b(long j, long j2, long j3) {
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        if (PatchProxy.isSupport(new Object[]{new Long(j4), new Long(j5), new Long(j6)}, null, f15142a, true, 9298, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {new Long(j4), new Long(j5), new Long(j6)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f15142a, true, 9298, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(j2));
        hashMap.put("prop_id", Long.valueOf(j));
        e.a(a("ttlive_prop_send_status"), 0, j6, (Map<String, Object>) hashMap);
    }

    public static void c(long j, long j2, long j3) {
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        if (PatchProxy.isSupport(new Object[]{new Long(j4), new Long(j5), new Long(j6)}, null, f15142a, true, 9300, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {new Long(j4), new Long(j5), new Long(j6)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f15142a, true, 9300, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(j2));
        hashMap.put("gift_id", Long.valueOf(j));
        e.a(a("ttlive_task_gift_send_status"), 0, j6, (Map<String, Object>) hashMap);
    }

    public static void a(long j, long j2, String str) {
        long j3 = j;
        long j4 = j2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), str2}, null, f15142a, true, 9301, new Class[]{Long.TYPE, Long.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {new Long(j3), new Long(j4), str2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f15142a, true, 9301, new Class[]{Long.TYPE, Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(j2));
        hashMap.put("gift_id", Long.valueOf(j));
        hashMap.put("error_msg", str2);
        e.a(a("ttlive_task_gift_send_status"), 1, 0, (Map<String, Object>) hashMap);
        e.a(b("ttlive_task_gift_send_status"), 1, (Map<String, Object>) hashMap);
        a.a().a(b.Gift.info, "ttlive_task_gift_send_status", 1, (Map) hashMap);
    }

    public static void b(long j, long j2, Throwable th) {
        long j3 = j;
        long j4 = j2;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), th2}, null, f15142a, true, 9299, new Class[]{Long.TYPE, Long.TYPE, Throwable.class}, Void.TYPE)) {
            Object[] objArr = {new Long(j3), new Long(j4), th2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f15142a, true, 9299, new Class[]{Long.TYPE, Long.TYPE, Throwable.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(j2));
        hashMap.put("prop_id", Long.valueOf(j));
        if (th2 instanceof com.bytedance.android.live.a.a.a) {
            hashMap.put("error_code", Integer.valueOf(((com.bytedance.android.live.a.a.a) th2).getErrorCode()));
        } else {
            hashMap.put("error_code", 0);
        }
        hashMap.put("error_msg", th.getMessage());
        e.a(a("ttlive_prop_send_status"), 1, 0, (Map<String, Object>) hashMap);
        e.a(b("ttlive_prop_send_status"), 1, (Map<String, Object>) hashMap);
        a.a().a(b.Gift.info, "ttlive_prop_send_status", 1, (Map) hashMap);
    }

    public static void a(long j, long j2, Throwable th) {
        long j3 = j;
        long j4 = j2;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), th2}, null, f15142a, true, 9297, new Class[]{Long.TYPE, Long.TYPE, Throwable.class}, Void.TYPE)) {
            Object[] objArr = {new Long(j3), new Long(j4), th2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f15142a, true, 9297, new Class[]{Long.TYPE, Long.TYPE, Throwable.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(j2));
        hashMap.put("gift_id", Long.valueOf(j));
        if (th2 instanceof com.bytedance.android.live.a.a.a) {
            hashMap.put("error_code", Integer.valueOf(((com.bytedance.android.live.a.a.a) th2).getErrorCode()));
        } else {
            hashMap.put("error_code", 0);
        }
        hashMap.put("error_msg", th.getMessage());
        e.a(a("ttlive_gift_send_status"), 1, 0, (Map<String, Object>) hashMap);
        e.a(b("ttlive_gift_send_status"), 1, (Map<String, Object>) hashMap);
        a.a().a(b.Gift.info, "ttlive_gift_send_status", 1, (Map) hashMap);
    }
}
