package com.ss.android.ugc.aweme.web;

import android.text.TextUtils;
import com.bytedance.ies.geckoclient.h;
import com.bytedance.ies.geckoclient.model.d;
import com.bytedance.ies.geckoclient.model.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.commercialize.feed.b.a;
import com.ss.android.ugc.aweme.crossplatform.platform.rn.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public final class e implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76627a;

    private JSONObject a(int i, Exception exc) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), exc}, this, f76627a, false, 89861, new Class[]{Integer.TYPE, Exception.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), exc}, this, f76627a, false, 89861, new Class[]{Integer.TYPE, Exception.class}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        if (i != -1) {
            try {
                jSONObject.put("gecko_id", String.valueOf(i));
            } catch (JSONException unused) {
            }
        }
        if (exc != null) {
            jSONObject.put("errorDesc", exc.toString());
        }
        return jSONObject;
    }

    public final void b(int i, d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), dVar2}, this, f76627a, false, 89858, new Class[]{Integer.TYPE, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), dVar2}, this, f76627a, false, 89858, new Class[]{Integer.TYPE, d.class}, Void.TYPE);
            return;
        }
        n.a("aweme_service_gecko_activate_rate", 0, a(i, (Exception) null));
        if (TextUtils.equals(dVar2.f20791c, "rn_base_android")) {
            c.b();
        }
    }

    public final void a(List<d> list, Exception exc) {
        List<d> list2 = list;
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{list2, exc2}, this, f76627a, false, 89855, new Class[]{List.class, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, exc2}, this, f76627a, false, 89855, new Class[]{List.class, Exception.class}, Void.TYPE);
            return;
        }
        n.a("aweme_service_gecko_check_update_rate", 1, a(-1, exc2));
        a.f38813e.a(list2, false);
    }

    public final void a(int i, d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), dVar2}, this, f76627a, false, 89856, new Class[]{Integer.TYPE, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), dVar2}, this, f76627a, false, 89856, new Class[]{Integer.TYPE, d.class}, Void.TYPE);
            return;
        }
        n.a("aweme_service_gecko_download_rate", 0, a(i, (Exception) null));
        a aVar = a.f38813e;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), dVar2}, aVar, a.f38809a, false, 30789, new Class[]{Integer.TYPE, d.class}, Void.TYPE)) {
            a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), dVar2}, aVar2, a.f38809a, false, 30789, new Class[]{Integer.TYPE, d.class}, Void.TYPE);
            return;
        }
        if (dVar2 != null) {
            if (aVar.a().contains(dVar2.f20791c)) {
                com.ss.android.ugc.aweme.commercialize.feed.b.d dVar3 = a.f38811c.get(dVar2.f20791c);
                if (dVar3 != null) {
                    Intrinsics.checkExpressionValueIsNotNull(dVar3, "downloadMsgMap[geckoPackage.channel] ?: return");
                    HashMap hashMap = new HashMap();
                    Map map = hashMap;
                    map.put("download_status", 1);
                    map.put("is_diff", Integer.valueOf(dVar3.f38821c));
                    map.put("download_duration", Long.valueOf(System.currentTimeMillis() - dVar3.f38820b));
                    map.put("download_size", Long.valueOf(aVar.a(dVar2)));
                    map.put("package_id", Integer.valueOf(i));
                    com.ss.android.ugc.aweme.commercialize.log.d.a().b("ad_landing_common_download_finish").a("ad_wap_stat").a((Object) hashMap).b();
                    a.f38811c.remove(dVar2.f20791c);
                } else {
                    return;
                }
            }
            com.ss.android.ugc.aweme.commercialize.feed.b.d dVar4 = a.f38811c.get(dVar2.f20791c);
            if (dVar4 != null) {
                HashMap hashMap2 = new HashMap();
                Map map2 = hashMap2;
                map2.put("download_status", 1);
                map2.put("is_diff", Integer.valueOf(dVar4.f38821c));
                map2.put("site_id", dVar4.f38822d);
                map2.put("download_duration", Long.valueOf(System.currentTimeMillis() - dVar4.f38820b));
                map2.put("download_size", Long.valueOf(a.f38813e.a(dVar2)));
                map2.put("package_id", Integer.valueOf(i));
                com.ss.android.ugc.aweme.commercialize.log.d.a().b("ad_landing_channel_download_finish").a("ad_wap_stat").a(Long.valueOf(dVar4.f38823e)).g(dVar4.f38824f).a((Object) hashMap2).b();
                a.f38811c.remove(dVar2.f20791c);
            }
        }
    }

    public final void a(d dVar, boolean z) {
        d dVar2 = dVar;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{dVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f76627a, false, 89860, new Class[]{d.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2, Byte.valueOf(z)}, this, f76627a, false, 89860, new Class[]{d.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a aVar = a.f38813e;
        if (PatchProxy.isSupport(new Object[]{dVar2, Byte.valueOf(z)}, aVar, a.f38809a, false, 30788, new Class[]{d.class, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {dVar2, Byte.valueOf(z)};
            ChangeQuickRedirect changeQuickRedirect = a.f38809a;
            Object[] objArr2 = objArr;
            a aVar2 = aVar;
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, 30788, new Class[]{d.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (dVar2 != null) {
            if (aVar.a().contains(dVar2.f20791c)) {
                String str = dVar2.f20791c;
                Intrinsics.checkExpressionValueIsNotNull(str, "geckoPackage.channel");
                com.ss.android.ugc.aweme.commercialize.feed.b.d dVar3 = new com.ss.android.ugc.aweme.commercialize.feed.b.d(str, 0, null, 6);
                dVar3.f38820b = System.currentTimeMillis();
                String str2 = dVar2.f20791c;
                Intrinsics.checkExpressionValueIsNotNull(str2, "geckoPackage.channel");
                a.f38811c.put(str2, dVar3);
                HashMap hashMap = new HashMap();
                dVar3.f38821c = z2;
                hashMap.put("is_diff", Integer.valueOf(dVar3.f38821c));
                com.ss.android.ugc.aweme.commercialize.log.d.a().b("ad_landing_common_download_start").a("ad_wap_stat").a((Object) hashMap).b();
                return;
            }
            com.ss.android.ugc.aweme.commercialize.feed.b.d dVar4 = a.f38811c.get(dVar2.f20791c);
            if (dVar4 != null) {
                dVar4.f38820b = System.currentTimeMillis();
                HashMap hashMap2 = new HashMap();
                dVar4.f38821c = z2 ? 1 : 0;
                Map map = hashMap2;
                map.put("is_diff", Integer.valueOf(dVar4.f38821c));
                map.put("site_id", dVar4.f38822d);
                com.ss.android.ugc.aweme.commercialize.log.d.a().b("ad_landing_channel_download_start").a("ad_wap_stat").a(Long.valueOf(dVar4.f38823e)).g(dVar4.f38824f).a((Object) hashMap2).b();
            }
        }
    }

    public final void a(List<d> list, List<j> list2) {
        List<d> list3 = list;
        if (PatchProxy.isSupport(new Object[]{list3, list2}, this, f76627a, false, 89854, new Class[]{List.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3, list2}, this, f76627a, false, 89854, new Class[]{List.class, List.class}, Void.TYPE);
            return;
        }
        n.a("aweme_service_gecko_check_update_rate", 0, a(-1, (Exception) null));
        c.b();
        a.f38813e.a(list3, true);
    }

    public final void b(int i, d dVar, Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), dVar, exc2}, this, f76627a, false, 89859, new Class[]{Integer.TYPE, d.class, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), dVar, exc2}, this, f76627a, false, 89859, new Class[]{Integer.TYPE, d.class, Exception.class}, Void.TYPE);
            return;
        }
        n.a("aweme_service_gecko_activate_rate", 1, a(i, exc2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0121, code lost:
        if (r3 == null) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x01a5, code lost:
        if (r1 == null) goto L_0x01a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r21, com.bytedance.ies.geckoclient.model.d r22, java.lang.Exception r23) {
        /*
            r20 = this;
            r0 = r22
            r1 = r23
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
            r10 = 0
            r3[r10] = r4
            r11 = 1
            r3[r11] = r0
            r12 = 2
            r3[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f76627a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r10] = r4
            java.lang.Class<com.bytedance.ies.geckoclient.model.d> r4 = com.bytedance.ies.geckoclient.model.d.class
            r8[r11] = r4
            java.lang.Class<java.lang.Exception> r4 = java.lang.Exception.class
            r8[r12] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 89857(0x15f01, float:1.25916E-40)
            r4 = r20
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x005d
            java.lang.Object[] r13 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            r13[r10] = r3
            r13[r11] = r0
            r13[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r15 = f76627a
            r16 = 0
            r17 = 89857(0x15f01, float:1.25916E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class<com.bytedance.ies.geckoclient.model.d> r1 = com.bytedance.ies.geckoclient.model.d.class
            r0[r11] = r1
            java.lang.Class<java.lang.Exception> r1 = java.lang.Exception.class
            r0[r12] = r1
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r20
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x005d:
            java.lang.String r3 = "aweme_service_gecko_download_rate"
            r4 = r20
            r5 = r21
            org.json.JSONObject r6 = r4.a((int) r5, (java.lang.Exception) r1)
            com.ss.android.ugc.aweme.app.n.a((java.lang.String) r3, (int) r11, (org.json.JSONObject) r6)
            com.ss.android.ugc.aweme.commercialize.feed.b.a r3 = com.ss.android.ugc.aweme.commercialize.feed.b.a.f38813e
            java.lang.Object[] r13 = new java.lang.Object[r2]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r21)
            r13[r10] = r6
            r13[r11] = r0
            r13[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.commercialize.feed.b.a.f38809a
            r16 = 0
            r17 = 30790(0x7846, float:4.3146E-41)
            java.lang.Class[] r6 = new java.lang.Class[r2]
            java.lang.Class r7 = java.lang.Integer.TYPE
            r6[r10] = r7
            java.lang.Class<com.bytedance.ies.geckoclient.model.d> r7 = com.bytedance.ies.geckoclient.model.d.class
            r6[r11] = r7
            java.lang.Class<java.lang.Exception> r7 = java.lang.Exception.class
            r6[r12] = r7
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r3
            r18 = r6
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r6 == 0) goto L_0x00c0
            java.lang.Object[] r13 = new java.lang.Object[r2]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r21)
            r13[r10] = r5
            r13[r11] = r0
            r13[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.commercialize.feed.b.a.f38809a
            r16 = 0
            r17 = 30790(0x7846, float:4.3146E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class<com.bytedance.ies.geckoclient.model.d> r1 = com.bytedance.ies.geckoclient.model.d.class
            r0[r11] = r1
            java.lang.Class<java.lang.Exception> r1 = java.lang.Exception.class
            r0[r12] = r1
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r3
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x00c0:
            if (r0 == 0) goto L_0x01e4
            java.util.List r2 = r3.a()
            java.lang.String r6 = r0.f20791c
            boolean r2 = r2.contains(r6)
            if (r2 == 0) goto L_0x014f
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.commercialize.feed.b.d> r2 = com.ss.android.ugc.aweme.commercialize.feed.b.a.f38811c
            java.lang.String r6 = r0.f20791c
            java.lang.Object r2 = r2.get(r6)
            com.ss.android.ugc.aweme.commercialize.feed.b.d r2 = (com.ss.android.ugc.aweme.commercialize.feed.b.d) r2
            if (r2 != 0) goto L_0x00db
            return
        L_0x00db:
            java.lang.String r6 = "downloadMsgMap[geckoPackage.channel] ?: return"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r6)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r7 = r6
            java.util.Map r7 = (java.util.Map) r7
            java.lang.String r8 = "download_status"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r7.put(r8, r9)
            java.lang.String r8 = "is_diff"
            int r9 = r2.f38821c
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7.put(r8, r9)
            java.lang.String r8 = "download_duration"
            long r11 = java.lang.System.currentTimeMillis()
            long r13 = r2.f38820b
            long r11 = r11 - r13
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            r7.put(r8, r2)
            java.lang.String r2 = "download_size"
            long r8 = r3.a((com.bytedance.ies.geckoclient.model.d) r0)
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            r7.put(r2, r3)
            java.lang.String r2 = "download_fail_reason"
            if (r1 == 0) goto L_0x0123
            java.lang.String r3 = r23.getMessage()
            if (r3 != 0) goto L_0x0125
        L_0x0123:
            java.lang.String r3 = ""
        L_0x0125:
            r7.put(r2, r3)
            java.lang.String r2 = "package_id"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            r7.put(r2, r3)
            com.ss.android.ugc.aweme.commercialize.log.d$b r2 = com.ss.android.ugc.aweme.commercialize.log.d.a()
            java.lang.String r3 = "ad_landing_common_download_finish"
            com.ss.android.ugc.aweme.commercialize.log.d$b r2 = r2.b((java.lang.String) r3)
            java.lang.String r3 = "ad_wap_stat"
            com.ss.android.ugc.aweme.commercialize.log.d$b r2 = r2.a((java.lang.String) r3)
            com.ss.android.ugc.aweme.commercialize.log.d$b r2 = r2.a((java.lang.Object) r6)
            r2.b()
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.commercialize.feed.b.d> r2 = com.ss.android.ugc.aweme.commercialize.feed.b.a.f38811c
            java.lang.String r3 = r0.f20791c
            r2.remove(r3)
        L_0x014f:
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.commercialize.feed.b.d> r2 = com.ss.android.ugc.aweme.commercialize.feed.b.a.f38811c
            java.lang.String r3 = r0.f20791c
            java.lang.Object r2 = r2.get(r3)
            com.ss.android.ugc.aweme.commercialize.feed.b.d r2 = (com.ss.android.ugc.aweme.commercialize.feed.b.d) r2
            if (r2 == 0) goto L_0x01e4
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r6 = r3
            java.util.Map r6 = (java.util.Map) r6
            java.lang.String r7 = "download_status"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r6.put(r7, r8)
            java.lang.String r7 = "is_diff"
            int r8 = r2.f38821c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6.put(r7, r8)
            java.lang.String r7 = "site_id"
            java.lang.String r8 = r2.f38822d
            r6.put(r7, r8)
            java.lang.String r7 = "download_duration"
            long r8 = java.lang.System.currentTimeMillis()
            long r10 = r2.f38820b
            long r8 = r8 - r10
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r6.put(r7, r8)
            java.lang.String r7 = "download_size"
            com.ss.android.ugc.aweme.commercialize.feed.b.a r8 = com.ss.android.ugc.aweme.commercialize.feed.b.a.f38813e
            long r8 = r8.a((com.bytedance.ies.geckoclient.model.d) r0)
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r6.put(r7, r8)
            java.lang.String r7 = "download_fail_reason"
            if (r1 == 0) goto L_0x01a7
            java.lang.String r1 = r23.getMessage()
            if (r1 != 0) goto L_0x01a9
        L_0x01a7:
            java.lang.String r1 = ""
        L_0x01a9:
            r6.put(r7, r1)
            java.lang.String r1 = "package_id"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r21)
            r6.put(r1, r5)
            com.ss.android.ugc.aweme.commercialize.log.d$b r1 = com.ss.android.ugc.aweme.commercialize.log.d.a()
            java.lang.String r5 = "ad_landing_channel_download_finish"
            com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.b((java.lang.String) r5)
            java.lang.String r5 = "ad_wap_stat"
            com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.a((java.lang.String) r5)
            long r5 = r2.f38823e
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.a((java.lang.Long) r5)
            java.lang.String r2 = r2.f38824f
            com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.g(r2)
            com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.a((java.lang.Object) r3)
            r1.b()
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.commercialize.feed.b.d> r1 = com.ss.android.ugc.aweme.commercialize.feed.b.a.f38811c
            java.lang.String r0 = r0.f20791c
            r1.remove(r0)
            return
        L_0x01e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.web.e.a(int, com.bytedance.ies.geckoclient.model.d, java.lang.Exception):void");
    }
}
