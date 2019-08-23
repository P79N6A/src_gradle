package com.ss.android.downloadlib.addownload;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.download.api.c.b;
import com.ss.android.downloadad.api.a.c;
import com.ss.android.downloadlib.c.k;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f28720b;

    /* renamed from: a  reason: collision with root package name */
    Map<String, com.ss.android.downloadlib.addownload.d.a> f28721a;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, b> f28722c = new HashMap();

    private a() {
    }

    public static a a() {
        if (f28720b == null) {
            synchronized (a.class) {
                if (f28720b == null) {
                    f28720b = new a();
                }
            }
        }
        return f28720b;
    }

    private boolean b(String str) {
        return this.f28722c.containsKey(str);
    }

    public final void a(String str) {
        String str2 = str;
        if (this.f28721a != null && !TextUtils.isEmpty(str) && this.f28721a.containsKey(str2)) {
            com.ss.android.downloadlib.addownload.d.a remove = this.f28721a.remove(str2);
            remove.h = System.currentTimeMillis();
            com.ss.android.downloadlib.addownload.a.a a2 = com.ss.android.downloadlib.addownload.a.a.a();
            if (remove != null && !a2.f28728e.containsKey(Long.valueOf(remove.f28755b))) {
                a2.f28728e.put(Long.valueOf(remove.f28755b), remove);
                com.ss.android.downloadlib.addownload.a.b.a("sp_name_installed_app", "key_installed_list", a2.f28728e);
            }
            if (remove.f28755b > 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("scene", 4);
                } catch (JSONException unused) {
                }
                j.a(k.l(), "install_finish", true, remove.f28755b, remove.f28759f, remove.f28756c, jSONObject, 2);
            }
            this.f28721a.remove(str2);
        }
    }

    private static void a(b bVar, String str) {
        if (bVar != null) {
            j.a("embeded_ad", str, true, bVar.f28461a, bVar.f28466f, bVar.f28462b, 2);
        }
    }

    public final void a(Context context, String str) {
        if (b(str)) {
            b bVar = this.f28722c.get(str);
            if (bVar != null) {
                this.f28722c.remove(str);
            }
            if (bVar != null) {
                try {
                    a(bVar, "deeplink_url_app");
                    String str2 = bVar.f28464d;
                    if (context != null) {
                        if (TextUtils.isEmpty(str2)) {
                            k.d(context, str);
                        } else {
                            k.b(context, str2, str);
                        }
                        throw new com.ss.android.downloadlib.addownload.b.a(0);
                    }
                    throw new com.ss.android.downloadlib.addownload.b.a(0);
                } catch (com.ss.android.downloadlib.addownload.b.a e2) {
                    switch (e2.getFinalStatus()) {
                        case 1:
                        case 2:
                            a(bVar, "deeplink_open_success");
                            k.c();
                            new c.a().a(bVar.f28461a).b(bVar.f28462b).a(new b(bVar.f28464d, bVar.f28463c, bVar.f28465e)).a(bVar.f28466f).a();
                            e2.getOpenAppPackageName();
                            return;
                        default:
                            a(bVar, "deeplink_open_fail");
                            break;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r16, long r17) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            java.util.Map<java.lang.String, com.ss.android.download.api.c.b> r2 = r0.f28722c     // Catch:{ Exception -> 0x0062 }
            if (r2 == 0) goto L_0x0061
            java.util.Map<java.lang.String, com.ss.android.download.api.c.b> r2 = r0.f28722c     // Catch:{ Exception -> 0x0062 }
            int r2 = r2.size()     // Catch:{ Exception -> 0x0062 }
            if (r2 <= 0) goto L_0x0061
            boolean r2 = r15.b(r16)     // Catch:{ Exception -> 0x0062 }
            if (r2 == 0) goto L_0x0016
            goto L_0x0061
        L_0x0016:
            java.util.Map<java.lang.String, com.ss.android.download.api.c.b> r2 = r0.f28722c     // Catch:{ Exception -> 0x0062 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ Exception -> 0x0062 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0062 }
        L_0x0020:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x0062 }
            if (r3 == 0) goto L_0x0060
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x0062 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ Exception -> 0x0062 }
            java.lang.Object r4 = r3.getKey()     // Catch:{ Exception -> 0x0062 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0062 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ Exception -> 0x0062 }
            com.ss.android.download.api.c.b r3 = (com.ss.android.download.api.c.b) r3     // Catch:{ Exception -> 0x0062 }
            if (r3 == 0) goto L_0x0020
            long r5 = r3.f28461a     // Catch:{ Exception -> 0x0062 }
            int r9 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x0020
            boolean r2 = android.text.TextUtils.equals(r1, r4)     // Catch:{ Exception -> 0x0062 }
            if (r2 != 0) goto L_0x0060
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ Exception -> 0x0062 }
            r13.<init>()     // Catch:{ Exception -> 0x0062 }
            r13.put(r1, r4)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r6 = "deeplink_open_fail_for_packagename_no_match"
            if (r3 == 0) goto L_0x0062
            java.lang.String r5 = "embeded_ad"
            r7 = 1
            long r8 = r3.f28461a     // Catch:{ Exception -> 0x0062 }
            java.lang.String r10 = r3.f28466f     // Catch:{ Exception -> 0x0062 }
            long r11 = r3.f28462b     // Catch:{ Exception -> 0x0062 }
            r14 = 2
            com.ss.android.downloadlib.addownload.j.a(r5, r6, r7, r8, r10, r11, r13, r14)     // Catch:{ Exception -> 0x0062 }
            goto L_0x0062
        L_0x0060:
            return
        L_0x0061:
            return
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.addownload.a.a(java.lang.String, long):void");
    }

    public final void a(String str, b bVar) {
        if (!TextUtils.isEmpty(bVar.f28464d)) {
            this.f28722c.put(str, bVar);
        } else {
            this.f28722c.remove(str);
        }
    }
}
