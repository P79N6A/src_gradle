package com.ss.android.ugc.aweme.net.a;

import android.content.Context;
import android.location.Address;
import com.bytedance.ttnet.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.NetUtil;
import com.ss.android.common.util.MultiProcessSharedProvider;
import com.ss.android.newmedia.a;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.common.q;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.CommonApi;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class h implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56847a;

    /* renamed from: c  reason: collision with root package name */
    private static volatile h f56848c;

    /* renamed from: d  reason: collision with root package name */
    private static Map<String, String> f56849d;

    /* renamed from: b  reason: collision with root package name */
    private CommonApi f56850b = ((CommonApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(a.k).create(CommonApi.class));

    public final String d() {
        return "ib";
    }

    public final String f() {
        return "";
    }

    public final Map<String, String> e() {
        return f56849d;
    }

    public final void a(Context context, String str, String str2, JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{context, str, str2, jSONObject}, this, f56847a, false, 60874, new Class[]{Context.class, String.class, String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2, jSONObject}, this, f56847a, false, 60874, new Class[]{Context.class, String.class, String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (context != null) {
            if (jSONObject == null) {
                q.a(context, str, str2);
                return;
            }
            q.a(context, "umeng", str, str2, 0, 0, jSONObject);
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{str, jSONObject}, this, f56847a, false, 60879, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, jSONObject}, this, f56847a, false, 60879, new Class[]{String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        n.a(str, jSONObject);
    }

    public final void a(Context context, Map<String, ?> map) {
        if (PatchProxy.isSupport(new Object[]{context, map}, this, f56847a, false, 60881, new Class[]{Context.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, map}, this, f56847a, false, 60881, new Class[]{Context.class, Map.class}, Void.TYPE);
            return;
        }
        try {
            MultiProcessSharedProvider.a a2 = MultiProcessSharedProvider.a(context);
            for (Map.Entry next : map.entrySet()) {
                Object value = next.getValue();
                if (value instanceof Integer) {
                    a2.a((String) next.getKey(), ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    a2.a((String) next.getKey(), ((Long) value).longValue());
                } else if (value instanceof Float) {
                    a2.a((String) next.getKey(), ((Float) value).floatValue());
                } else if (value instanceof Boolean) {
                    a2.a((String) next.getKey(), ((Boolean) value).booleanValue());
                } else if (value instanceof String) {
                    a2.a((String) next.getKey(), (String) value);
                }
            }
            a2.a();
        } catch (Throwable unused) {
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f56849d = hashMap;
        hashMap.put("ib.snssdk.com", "ib");
        f56849d.put("security.snssdk.com", "si");
        f56849d.put("isub.snssdk.com", "isub");
        f56849d.put("ichannel.snssdk.com", "ichannel");
        f56849d.put("log.snssdk.com", "log");
        f56849d.put("mon.snssdk.com", "mon");
    }

    public final Context a() {
        if (!PatchProxy.isSupport(new Object[0], this, f56847a, false, 60873, new Class[0], Context.class)) {
            return i.a().getContext();
        }
        return (Context) PatchProxy.accessDispatch(new Object[0], this, f56847a, false, 60873, new Class[0], Context.class);
    }

    public final String c() {
        if (PatchProxy.isSupport(new Object[0], this, f56847a, false, 60884, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f56847a, false, 60884, new Class[0], String.class);
        } else if (!com.ss.android.g.a.a()) {
            return ".snssdk.com";
        } else {
            return ".tiktokv.com";
        }
    }

    public static h g() {
        if (PatchProxy.isSupport(new Object[0], null, f56847a, true, 60872, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], null, f56847a, true, 60872, new Class[0], h.class);
        }
        if (f56848c == null) {
            synchronized (h.class) {
                if (f56848c == null) {
                    f56848c = new h();
                }
            }
        }
        return f56848c;
    }

    public final String[] b() {
        if (PatchProxy.isSupport(new Object[0], this, f56847a, false, 60883, new Class[0], String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[0], this, f56847a, false, 60883, new Class[0], String[].class);
        } else if (com.ss.android.g.a.b()) {
            return new String[]{"dm16.musical.ly", "dm-maliva16.byteoversea.com", "dm16.byteoversea.com", "dm.toutiao.com"};
        } else if (com.ss.android.g.a.c()) {
            return new String[]{"dm16.tiktokv.com", "dm16.byteoversea.com", "dm-maliva16.byteoversea.com", "dm.toutiao.com"};
        } else {
            return new String[]{"dm.toutiao.com", "dm.bytedance.com", "dm-hl.toutiao.com"};
        }
    }

    public final Address a(Context context) {
        if (!PatchProxy.isSupport(new Object[]{context}, this, f56847a, false, 60876, new Class[]{Context.class}, Address.class)) {
            return af.a(context).f2627d.f();
        }
        return (Address) PatchProxy.accessDispatch(new Object[]{context}, this, f56847a, false, 60876, new Class[]{Context.class}, Address.class);
    }

    public final int a(Throwable th, String[] strArr) {
        Throwable th2 = th;
        if (!PatchProxy.isSupport(new Object[]{th2, null}, this, f56847a, false, 60878, new Class[]{Throwable.class, String[].class}, Integer.TYPE)) {
            return NetUtil.checkHttpRequestException(th2, null);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{th2, null}, this, f56847a, false, 60878, new Class[]{Throwable.class, String[].class}, Integer.TYPE)).intValue();
    }

    public final String a(int i, String str) throws Exception {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{-1, str2}, this, f56847a, false, 60877, new Class[]{Integer.TYPE, String.class}, String.class)) {
            return (String) this.f56850b.doGet(str2, -1).execute().body();
        }
        return (String) PatchProxy.accessDispatch(new Object[]{-1, str2}, this, f56847a, false, 60877, new Class[]{Integer.TYPE, String.class}, String.class);
    }

    public final int a(Context context, String str, int i) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{context, str2, Integer.valueOf(i)}, this, f56847a, false, 60882, new Class[]{Context.class, String.class, Integer.TYPE}, Integer.TYPE)) {
            return MultiProcessSharedProvider.b(context).a(str2, i);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{context, str2, Integer.valueOf(i)}, this, f56847a, false, 60882, new Class[]{Context.class, String.class, Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public final String a(Context context, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (!PatchProxy.isSupport(new Object[]{context, str3, str4}, this, f56847a, false, 60880, new Class[]{Context.class, String.class, String.class}, String.class)) {
            return MultiProcessSharedProvider.b(context).a(str3, str4);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{context, str3, str4}, this, f56847a, false, 60880, new Class[]{Context.class, String.class, String.class}, String.class);
    }
}
