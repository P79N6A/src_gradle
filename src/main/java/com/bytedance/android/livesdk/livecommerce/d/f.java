package com.bytedance.android.livesdk.livecommerce.d;

import a.i;
import com.bytedance.android.live.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16136a;

    public static i<i> a(String str, String str2) {
        final String str3 = str;
        final String str4 = str2;
        if (!PatchProxy.isSupport(new Object[]{str3, str4}, null, f16136a, true, 10699, new Class[]{String.class, String.class}, i.class)) {
            return i.a((Callable<TResult>) new Callable<i>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f16137a;

                /* access modifiers changed from: private */
                /* renamed from: a */
                public i call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f16137a, false, 10705, new Class[0], i.class)) {
                        return (i) PatchProxy.accessDispatch(new Object[0], this, f16137a, false, 10705, new Class[0], i.class);
                    }
                    ArrayList<e> arrayList = new ArrayList<>();
                    arrayList.add(new e("page", str3));
                    arrayList.add(new e("chosen_ids", str4));
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    for (e eVar : arrayList) {
                        if (byteArrayOutputStream.size() > 0) {
                            byteArrayOutputStream.write(38);
                        }
                        try {
                            String encode = URLEncoder.encode(eVar.a(), "UTF-8");
                            String encode2 = URLEncoder.encode(eVar.b(), "UTF-8");
                            byteArrayOutputStream.write(encode.getBytes("UTF-8"));
                            byteArrayOutputStream.write(61);
                            byteArrayOutputStream.write(encode2.getBytes("UTF-8"));
                        } catch (IOException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                    return (i) a.a().fromJson(f.a("https://lianmengapi.snssdk.com/live/author/shoplist/", (List<e>) arrayList), i.class);
                }
            });
        }
        return (i) PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f16136a, true, 10699, new Class[]{String.class, String.class}, i.class);
    }

    public static String b(String str, List<e> list) throws Exception {
        String str2 = str;
        List<e> list2 = list;
        if (!PatchProxy.isSupport(new Object[]{str2, list2}, null, f16136a, true, 10698, new Class[]{String.class, List.class}, String.class)) {
            return a(str2, list2, false);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2, list2}, null, f16136a, true, 10698, new Class[]{String.class, List.class}, String.class);
    }

    public static String a(String str, List<e> list) throws Exception {
        String str2 = str;
        List<e> list2 = list;
        if (!PatchProxy.isSupport(new Object[]{str2, list2}, null, f16136a, true, 10697, new Class[]{String.class, List.class}, String.class)) {
            return a(str2, list2, true);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2, list2}, null, f16136a, true, 10697, new Class[]{String.class, List.class}, String.class);
    }

    public static i<d> a(String str, String str2, String str3) {
        final String str4 = str;
        final String str5 = str2;
        final String str6 = str3;
        if (!PatchProxy.isSupport(new Object[]{str4, str5, str6}, null, f16136a, true, 10700, new Class[]{String.class, String.class, String.class}, i.class)) {
            return i.a((Callable<TResult>) new Callable<d>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f16140a;

                public final /* synthetic */ Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f16140a, false, 10706, new Class[0], d.class)) {
                        return (d) PatchProxy.accessDispatch(new Object[0], this, f16140a, false, 10706, new Class[0], d.class);
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new e("author_id", str4));
                    arrayList.add(new e("room_id", str5));
                    arrayList.add(new e("promotion_ids", str6));
                    return (d) a.a().fromJson(f.a("https://lianmengapi.snssdk.com/live/author/bind/", (List<e>) arrayList), d.class);
                }
            });
        }
        return (i) PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, null, f16136a, true, 10700, new Class[]{String.class, String.class, String.class}, i.class);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.String r20, java.util.List<com.bytedance.android.livesdk.livecommerce.d.e> r21, boolean r22) throws java.lang.Exception {
        /*
            r0 = r20
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r21
            java.lang.Byte r4 = java.lang.Byte.valueOf(r22)
            r12 = 2
            r3[r12] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = f16136a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<java.util.List> r4 = java.util.List.class
            r8[r11] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r8[r12] = r4
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r4 = 0
            r6 = 1
            r7 = 10696(0x29c8, float:1.4988E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x005a
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r10] = r0
            r13[r11] = r21
            java.lang.Byte r0 = java.lang.Byte.valueOf(r22)
            r13[r12] = r0
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f16136a
            r16 = 1
            r17 = 10696(0x29c8, float:1.4988E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r12] = r1
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x005a:
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            java.util.Iterator r1 = r21.iterator()
        L_0x0063:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00ad
            java.lang.Object r4 = r1.next()
            com.bytedance.android.livesdk.livecommerce.d.e r4 = (com.bytedance.android.livesdk.livecommerce.d.e) r4
            int r5 = r3.size()
            if (r5 <= 0) goto L_0x007a
            r5 = 38
            r3.write(r5)
        L_0x007a:
            java.lang.String r5 = r4.a()     // Catch:{ IOException -> 0x00a6 }
            java.lang.String r6 = "UTF-8"
            java.lang.String r5 = java.net.URLEncoder.encode(r5, r6)     // Catch:{ IOException -> 0x00a6 }
            java.lang.String r4 = r4.b()     // Catch:{ IOException -> 0x00a6 }
            java.lang.String r6 = "UTF-8"
            java.lang.String r4 = java.net.URLEncoder.encode(r4, r6)     // Catch:{ IOException -> 0x00a6 }
            java.lang.String r6 = "UTF-8"
            byte[] r5 = r5.getBytes(r6)     // Catch:{ IOException -> 0x00a6 }
            r3.write(r5)     // Catch:{ IOException -> 0x00a6 }
            r5 = 61
            r3.write(r5)     // Catch:{ IOException -> 0x00a6 }
            java.lang.String r5 = "UTF-8"
            byte[] r4 = r4.getBytes(r5)     // Catch:{ IOException -> 0x00a6 }
            r3.write(r4)     // Catch:{ IOException -> 0x00a6 }
            goto L_0x0063
        L_0x00a6:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x00ad:
            r1 = 0
            if (r22 == 0) goto L_0x011f
            java.lang.String r4 = "application/x-www-form-urlencoded; charset=UTF-8"
            byte[] r3 = r3.toByteArray()
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r10] = r0
            r13[r11] = r4
            r13[r12] = r3
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.livecommerce.c.f16117a
            r16 = 1
            r17 = 10437(0x28c5, float:1.4625E-41)
            java.lang.Class[] r5 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r10] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r11] = r6
            java.lang.Class<byte[]> r6 = byte[].class
            r5[r12] = r6
            java.lang.Class<com.bytedance.android.livesdkapi.i.e> r19 = com.bytedance.android.livesdkapi.i.e.class
            r18 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r5 == 0) goto L_0x0105
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r10] = r0
            r13[r11] = r4
            r13[r12] = r3
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.livecommerce.c.f16117a
            r16 = 1
            r17 = 10437(0x28c5, float:1.4625E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<byte[]> r1 = byte[].class
            r0[r12] = r1
            java.lang.Class<com.bytedance.android.livesdkapi.i.e> r19 = com.bytedance.android.livesdkapi.i.e.class
            r18 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            com.bytedance.android.livesdkapi.i.e r0 = (com.bytedance.android.livesdkapi.i.e) r0
            goto L_0x0111
        L_0x0105:
            com.bytedance.android.livesdkapi.service.b r2 = com.bytedance.android.livesdkapi.h.f()
            com.bytedance.android.livesdkapi.host.h r2 = r2.i()
            com.bytedance.android.livesdkapi.i.e r0 = r2.a(r0, r1, r4, r3)
        L_0x0111:
            java.lang.Object r0 = r0.a()
            com.bytedance.android.livesdkapi.i.d r0 = (com.bytedance.android.livesdkapi.i.d) r0
            java.lang.String r1 = new java.lang.String
            byte[] r0 = r0.f18821e
            r1.<init>(r0)
            return r1
        L_0x011f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "?"
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[r11]
            r2[r10] = r0
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = com.bytedance.android.livesdk.livecommerce.c.f16117a
            r5 = 1
            r6 = 10436(0x28c4, float:1.4624E-41)
            java.lang.Class[] r7 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r10] = r8
            java.lang.Class<com.bytedance.android.livesdkapi.i.e> r8 = com.bytedance.android.livesdkapi.i.e.class
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0164
            java.lang.Object[] r3 = new java.lang.Object[r11]
            r3[r10] = r0
            r4 = 0
            com.meituan.robust.ChangeQuickRedirect r5 = com.bytedance.android.livesdk.livecommerce.c.f16117a
            r6 = 1
            r7 = 10436(0x28c4, float:1.4624E-41)
            java.lang.Class[] r8 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r8[r10] = r0
            java.lang.Class<com.bytedance.android.livesdkapi.i.e> r9 = com.bytedance.android.livesdkapi.i.e.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            com.bytedance.android.livesdkapi.i.e r0 = (com.bytedance.android.livesdkapi.i.e) r0
            goto L_0x0170
        L_0x0164:
            com.bytedance.android.livesdkapi.service.b r2 = com.bytedance.android.livesdkapi.h.f()
            com.bytedance.android.livesdkapi.host.h r2 = r2.i()
            com.bytedance.android.livesdkapi.i.e r0 = r2.a(r0, r1)
        L_0x0170:
            java.lang.Object r0 = r0.a()
            com.bytedance.android.livesdkapi.i.d r0 = (com.bytedance.android.livesdkapi.i.d) r0
            java.lang.String r1 = new java.lang.String
            byte[] r0 = r0.f18821e
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livecommerce.d.f.a(java.lang.String, java.util.List, boolean):java.lang.String");
    }
}
