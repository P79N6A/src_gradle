package com.bytedance.android.livesdk.live;

import com.bytedance.android.livesdk.j.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15781a;

    /* renamed from: b  reason: collision with root package name */
    public static long f15782b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f15783c;

    /* renamed from: com.bytedance.android.livesdk.live.a$a  reason: collision with other inner class name */
    public enum C0110a {
        API("api"),
        LIVE_SDK("livesdk"),
        AGORA("agora");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final String value;

        private C0110a(String str) {
            this.value = str;
        }
    }

    public static long a() {
        long j;
        if (PatchProxy.isSupport(new Object[0], null, f15781a, true, 10234, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], null, f15781a, true, 10234, new Class[0], Long.TYPE)).longValue();
        }
        if (f15782b > 0) {
            j = System.currentTimeMillis() - f15782b;
        } else {
            j = 0;
        }
        f15782b = 0;
        return j;
    }

    public static void a(boolean z) {
        f15783c = z;
    }

    public static void a(Exception exc, boolean z) {
        Exception exc2 = exc;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{exc2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f15781a, true, 10235, new Class[]{Exception.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2, Byte.valueOf(z)}, null, f15781a, true, 10235, new Class[]{Exception.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a();
        if (exc2 instanceof com.bytedance.android.live.a.a.b.a) {
            com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) exc2;
            a(C0110a.API.value, aVar.getErrorCode(), aVar.getErrorMsg(), z2);
            return;
        }
        a(C0110a.API.value, -1, exc.toString(), z2);
    }

    public static void a(boolean z, int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), str2}, null, f15781a, true, 10237, new Class[]{Boolean.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), str2}, null, f15781a, true, 10237, new Class[]{Boolean.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        new h().a("errorCode", (Object) Integer.valueOf(i)).a("errorDesc", (Object) str2).a("hotsoon_live_anchor_close_room", z ^ true ? 1 : 0);
    }

    private static void a(String str, int i, String str2, boolean z) {
        String str3;
        String str4 = str;
        String str5 = str2;
        if (PatchProxy.isSupport(new Object[]{str4, Integer.valueOf(i), str5, Byte.valueOf(z ? (byte) 1 : 0)}, null, f15781a, true, 10238, new Class[]{String.class, Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, Integer.valueOf(i), str5, Byte.valueOf(z)}, null, f15781a, true, 10238, new Class[]{String.class, Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorDomain", str4);
            jSONObject.put("errorCode", i);
            jSONObject.put("errorDesc", str5);
            if (z) {
                str3 = "audio";
            } else {
                str3 = "video";
            }
            jSONObject.put("mediaType", str3);
            new h().a(jSONObject).a("hotsoon_live_start_live_failure_rate", 1);
            b.a(i, str2, z);
        } catch (JSONException unused) {
        }
    }
}
