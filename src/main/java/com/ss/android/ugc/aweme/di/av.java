package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.n;
import dagger.Module;
import org.json.JSONException;
import org.json.JSONObject;

@Module
public final class av {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41420a;

    private static void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f41420a, true, 35400, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f41420a, true, 35400, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("use_broker", z);
        } catch (JSONException unused) {
        }
        n.a("broker_cn", jSONObject);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.ss.android.ugc.aweme.im.service.IIMService} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014b  */
    @javax.inject.Singleton
    @dagger.Provides
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.im.service.IIMService a(com.ss.android.ugc.aweme.app.k r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f41420a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.app.k> r3 = com.ss.android.ugc.aweme.app.k.class
            r7[r9] = r3
            java.lang.Class<com.ss.android.ugc.aweme.im.service.IIMService> r8 = com.ss.android.ugc.aweme.im.service.IIMService.class
            r3 = 0
            r5 = 1
            r6 = 35399(0x8a47, float:4.9605E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f41420a
            r13 = 1
            r14 = 35399(0x8a47, float:4.9605E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.app.k> r0 = com.ss.android.ugc.aweme.app.k.class
            r15[r9] = r0
            java.lang.Class<com.ss.android.ugc.aweme.im.service.IIMService> r16 = com.ss.android.ugc.aweme.im.service.IIMService.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.ss.android.ugc.aweme.im.service.IIMService r0 = (com.ss.android.ugc.aweme.im.service.IIMService) r0
            return r0
        L_0x0037:
            java.lang.Class<com.ss.android.ugc.aweme.im.service.IIMService> r2 = com.ss.android.ugc.aweme.im.service.IIMService.class
            com.ss.android.ugc.broker.a r3 = new com.ss.android.ugc.broker.a
            r4 = 0
            r3.<init>(r2, r4)
            r2 = 1002(0x3ea, float:1.404E-42)
            r3.i = r2
            com.ss.android.ugc.broker.c r5 = r3.f77179f
            if (r5 == 0) goto L_0x007f
            java.lang.String r5 = r3.f77174a
            if (r5 == 0) goto L_0x0063
            com.ss.android.ugc.broker.c r5 = r3.f77179f
            java.lang.String r5 = r3.f77174a
            java.lang.Object[] r6 = r3.f77176c
            com.ss.android.ugc.broker.c.a()
            com.ss.android.ugc.broker.g r7 = com.ss.android.ugc.broker.c.f77185b
            if (r7 == 0) goto L_0x007f
            com.ss.android.ugc.broker.g r7 = com.ss.android.ugc.broker.c.f77185b
            com.ss.android.ugc.broker.g r7 = r7.a((java.lang.String) r5)
            java.lang.Object r5 = r7.a((java.lang.String) r5, (java.lang.Object[]) r6)
            goto L_0x0080
        L_0x0063:
            java.lang.Class r5 = r3.f77175b
            if (r5 == 0) goto L_0x007f
            com.ss.android.ugc.broker.c r5 = r3.f77179f
            java.lang.Class r5 = r3.f77175b
            java.lang.Object[] r6 = r3.f77176c
            com.ss.android.ugc.broker.c.a()
            com.ss.android.ugc.broker.g r7 = com.ss.android.ugc.broker.c.f77185b
            if (r7 == 0) goto L_0x007f
            com.ss.android.ugc.broker.g r7 = com.ss.android.ugc.broker.c.f77185b
            com.ss.android.ugc.broker.g r7 = r7.a((java.lang.Class) r5)
            java.util.List r5 = r7.a((java.lang.Class<T>) r5, (java.lang.Object[]) r6)
            goto L_0x0080
        L_0x007f:
            r5 = r4
        L_0x0080:
            if (r5 != 0) goto L_0x008c
            com.ss.android.ugc.broker.f r6 = r3.g
            if (r6 == 0) goto L_0x008c
            java.lang.String r5 = r3.f77174a
            java.lang.Object r5 = com.ss.android.ugc.broker.f.a(r5)
        L_0x008c:
            if (r5 != 0) goto L_0x009c
            com.ss.android.ugc.broker.d r6 = r3.h
            if (r6 == 0) goto L_0x009c
            com.ss.android.ugc.broker.d r5 = r3.h
            java.lang.Class r6 = r3.f77177d
            java.lang.Class r7 = r3.f77178e
            java.lang.Object r5 = r5.a(r6, r7)
        L_0x009c:
            if (r5 != 0) goto L_0x009f
            goto L_0x00f8
        L_0x009f:
            boolean r6 = r5 instanceof java.util.List
            r7 = 1001(0x3e9, float:1.403E-42)
            if (r6 == 0) goto L_0x00ea
            int r6 = r3.i
            if (r6 != r2) goto L_0x00b7
            java.util.List r5 = (java.util.List) r5
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L_0x00b2
            goto L_0x00f8
        L_0x00b2:
            java.lang.Object r4 = r5.get(r9)
            goto L_0x00f8
        L_0x00b7:
            int r2 = r3.i
            if (r2 != r7) goto L_0x00f7
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.ss.android.ugc.broker.e<java.lang.Class> r4 = r3.j
            if (r4 == 0) goto L_0x00e3
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r4 = r5.iterator()
        L_0x00ca:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00e8
            java.lang.Object r5 = r4.next()
            com.ss.android.ugc.broker.e<java.lang.Class> r6 = r3.j
            r5.getClass()
            boolean r6 = r6.a()
            if (r6 == 0) goto L_0x00ca
            r2.add(r5)
            goto L_0x00ca
        L_0x00e3:
            java.util.Collection r5 = (java.util.Collection) r5
            r2.addAll(r5)
        L_0x00e8:
            r4 = r2
            goto L_0x00f8
        L_0x00ea:
            int r2 = r3.i
            if (r2 != r7) goto L_0x00f7
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r5)
            goto L_0x00f8
        L_0x00f7:
            r4 = r5
        L_0x00f8:
            com.ss.android.ugc.aweme.im.service.IIMService r4 = (com.ss.android.ugc.aweme.im.service.IIMService) r4
            if (r4 != 0) goto L_0x010b
            java.lang.String r2 = "com.ss.android.ugc.aweme.im.sdk.providedservices.IMService"
            java.lang.Class<com.ss.android.ugc.aweme.im.DefaultIMService> r3 = com.ss.android.ugc.aweme.im.DefaultIMService.class
            java.lang.Object r2 = com.ss.android.ugc.aweme.common.u.a(r2, r3)
            r4 = r2
            com.ss.android.ugc.aweme.im.service.IIMService r4 = (com.ss.android.ugc.aweme.im.service.IIMService) r4
            a((boolean) r9)
            goto L_0x010e
        L_0x010b:
            a((boolean) r1)
        L_0x010e:
            r2 = 2
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r10[r9] = r0
            r10[r1] = r4
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.im.b.f50051a
            r13 = 1
            r14 = 50031(0xc36f, float:7.0108E-41)
            java.lang.Class[] r15 = new java.lang.Class[r2]
            java.lang.Class<android.app.Application> r3 = android.app.Application.class
            r15[r9] = r3
            java.lang.Class<com.ss.android.ugc.aweme.im.service.IIMService> r3 = com.ss.android.ugc.aweme.im.service.IIMService.class
            r15[r1] = r3
            java.lang.Class r16 = java.lang.Void.TYPE
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r3 == 0) goto L_0x014b
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r10[r9] = r0
            r10[r1] = r4
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.im.b.f50051a
            r13 = 1
            r14 = 50031(0xc36f, float:7.0108E-41)
            java.lang.Class[] r15 = new java.lang.Class[r2]
            java.lang.Class<android.app.Application> r0 = android.app.Application.class
            r15[r9] = r0
            java.lang.Class<com.ss.android.ugc.aweme.im.service.IIMService> r0 = com.ss.android.ugc.aweme.im.service.IIMService.class
            r15[r1] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0196
        L_0x014b:
            if (r4 == 0) goto L_0x0196
            com.ss.android.ugc.aweme.im.service.a r1 = new com.ss.android.ugc.aweme.im.service.a
            r1.<init>()
            com.ss.android.ugc.aweme.app.i r2 = com.ss.android.ugc.aweme.app.i.a()
            int r2 = r2.getVersionCode()
            r1.g = r2
            com.ss.android.ugc.aweme.app.i r2 = com.ss.android.ugc.aweme.app.i.a()
            java.lang.String r2 = r2.getChannel()
            r1.f52865f = r2
            java.lang.String r2 = "https://aweme.snssdk.com/aweme/v1/"
            r1.f52864e = r2
            java.lang.String r2 = "https://aweme.snssdk.com/"
            r1.f52863d = r2
            java.lang.String r2 = "https://imapi.snssdk.com/"
            r1.f52862c = r2
            java.lang.String r2 = "wss://frontier.snssdk.com/ws/v2"
            r1.f52861b = r2
            com.ss.android.ugc.aweme.app.i r2 = com.ss.android.ugc.aweme.app.i.a()
            java.lang.String r2 = r2.getAppName()
            r1.h = r2
            boolean r2 = com.ss.android.ugc.aweme.g.a.a()
            r1.f52860a = r2
            com.ss.android.ugc.aweme.im.c r2 = new com.ss.android.ugc.aweme.im.c
            r2.<init>()
            r4.initialize(r0, r1, r2)
            com.ss.android.ugc.aweme.im.b$1 r0 = new com.ss.android.ugc.aweme.im.b$1
            r0.<init>()
            r4.setAbInterface(r0)
        L_0x0196:
            com.ss.android.ugc.aweme.commercialize.im.a r0 = new com.ss.android.ugc.aweme.commercialize.im.a
            r0.<init>()
            r4.setInputMenuCustomizer(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.di.av.a(com.ss.android.ugc.aweme.app.k):com.ss.android.ugc.aweme.im.service.IIMService");
    }
}
