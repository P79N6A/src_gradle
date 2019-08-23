package com.bytedance.android.livesdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.m.b.d;
import com.bytedance.android.livesdk.m.f;
import com.bytedance.android.livesdk.utils.al;
import com.bytedance.common.util.JellyBeanMR1V17Compat;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17527a;

    /* renamed from: b  reason: collision with root package name */
    private static String f17528b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f17529c;

    public static void a(String str, al.b bVar, String str2, String str3) {
        String str4;
        String str5 = str;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str5, bVar, null, str6}, null, f17527a, true, 13602, new Class[]{String.class, al.b.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str5, bVar, null, str6}, null, f17527a, true, 13602, new Class[]{String.class, al.b.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (str5.equals("android.permission.ACCESS_FINE_LOCATION")) {
            str4 = "system_position";
        } else if (str5.equals("android.permission.READ_PHONE_STATE")) {
            str4 = "call";
        } else {
            str4 = (str5.equals("android.permission.WRITE_EXTERNAL_STORAGE") || str5.equals("android.permission.READ_EXTERNAL_STORAGE")) ? "save" : null;
        }
        if (!TextUtils.isEmpty(str4)) {
            j jVar = new j();
            if (!TextUtils.isEmpty(null)) {
                jVar.d(null);
            }
            if (!TextUtils.isEmpty(str3)) {
                jVar.g(str6);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("popup_type", str4);
            com.bytedance.android.livesdk.j.a.a().a("system_popup", hashMap, new j().b("video").f(bVar.getType()));
        }
    }

    public static boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f17527a, true, 13603, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f17527a, true, 13603, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (StringUtils.isEmpty(str)) {
            return false;
        } else {
            return str2.startsWith("http://") || str2.startsWith("https://");
        }
    }

    public static void a(HashMap<String, String> hashMap, String str, JSONObject jSONObject) {
        HashMap<String, String> hashMap2 = hashMap;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{hashMap2, null, jSONObject2}, null, f17527a, true, 13604, new Class[]{HashMap.class, String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hashMap2, null, jSONObject2}, null, f17527a, true, 13604, new Class[]{HashMap.class, String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (jSONObject2 != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys != null && keys.hasNext()) {
                try {
                    String next = keys.next();
                    String optString = jSONObject2.optString(next);
                    if (!StringUtils.isEmpty(next)) {
                        if (!StringUtils.isEmpty(optString)) {
                            hashMap2.put(next, optString);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (!StringUtils.isEmpty(null)) {
            hashMap2.put("User-Agent", null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r23, android.webkit.WebView r24, java.util.Map<java.lang.String, java.lang.String> r25) {
        /*
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f17527a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r11] = r5
            java.lang.Class<android.webkit.WebView> r5 = android.webkit.WebView.class
            r9[r12] = r5
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            r9[r13] = r5
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = 0
            r7 = 1
            r8 = 13607(0x3527, float:1.9067E-41)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0053
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f17527a
            r17 = 1
            r18 = 13607(0x3527, float:1.9067E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<android.webkit.WebView> r1 = android.webkit.WebView.class
            r0[r12] = r1
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Void.TYPE
            r19 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x0053:
            if (r1 == 0) goto L_0x025b
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r23)
            if (r3 == 0) goto L_0x005d
            goto L_0x025b
        L_0x005d:
            boolean r3 = a(r23)
            android.content.Context r4 = r24.getContext()
            if (r3 == 0) goto L_0x0071
            if (r4 == 0) goto L_0x0071
            com.bytedance.ttnet.config.a r3 = com.bytedance.ttnet.config.a.a((android.content.Context) r4)
            java.lang.String r0 = r3.g(r0)
        L_0x0071:
            com.bytedance.android.livesdkapi.service.c r3 = com.bytedance.android.livesdk.TTLiveSDKContext.getLiveService()
            com.bytedance.android.livesdkapi.depend.d.n r3 = r3.d()
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r3.a()
            if (r3 != 0) goto L_0x0082
            r6 = 0
            goto L_0x0086
        L_0x0082:
            long r6 = r3.getId()
        L_0x0086:
            if (r3 != 0) goto L_0x008b
            r8 = 0
            goto L_0x008f
        L_0x008b:
            long r8 = r3.getOwnerUserId()
        L_0x008f:
            com.bytedance.android.livesdk.v.e r10 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r10 = r10.k()
            long r13 = r10.b()
            if (r3 != 0) goto L_0x00a0
            java.lang.String r10 = ""
            goto L_0x00a4
        L_0x00a0:
            java.lang.String r10 = r3.getLog_pb()
        L_0x00a4:
            if (r3 != 0) goto L_0x00a9
            java.lang.String r3 = ""
            goto L_0x00ad
        L_0x00a9:
            java.lang.String r3 = r3.getRequestId()
        L_0x00ad:
            com.bytedance.android.livesdk.j.a r15 = com.bytedance.android.livesdk.j.a.a()
            java.lang.Class<com.bytedance.android.livesdk.j.c.j> r11 = com.bytedance.android.livesdk.j.c.j.class
            com.bytedance.android.livesdk.j.b.g r11 = r15.a((java.lang.Class) r11)
            java.lang.String r15 = ""
            java.lang.String r16 = ""
            java.lang.String r17 = ""
            java.lang.String r18 = ""
            boolean r12 = r11 instanceof com.bytedance.android.livesdk.j.b.k
            if (r12 == 0) goto L_0x013a
            com.bytedance.android.livesdk.j.b.k r11 = (com.bytedance.android.livesdk.j.b.k) r11
            java.util.Map r12 = r11.a()
            java.lang.String r15 = "enter_from"
            boolean r12 = r12.containsKey(r15)
            if (r12 == 0) goto L_0x00da
            java.util.Map r12 = r11.a()
            java.lang.String r15 = "enter_from"
            r12.get(r15)
        L_0x00da:
            java.util.Map r12 = r11.a()
            java.lang.String r15 = "source"
            boolean r12 = r12.containsKey(r15)
            if (r12 == 0) goto L_0x00ef
            java.util.Map r12 = r11.a()
            java.lang.String r15 = "source"
            r12.get(r15)
        L_0x00ef:
            java.util.Map r12 = r11.a()
            java.lang.String r15 = "action_type"
            boolean r12 = r12.containsKey(r15)
            if (r12 == 0) goto L_0x0109
            java.util.Map r12 = r11.a()
            java.lang.String r15 = "action_type"
            java.lang.Object r12 = r12.get(r15)
            java.lang.String r12 = (java.lang.String) r12
            r17 = r12
        L_0x0109:
            java.util.Map r12 = r11.a()
            java.lang.String r15 = "video_id"
            boolean r12 = r12.containsKey(r15)
            if (r12 == 0) goto L_0x0123
            java.util.Map r12 = r11.a()
            java.lang.String r15 = "video_id"
            java.lang.Object r12 = r12.get(r15)
            java.lang.String r12 = (java.lang.String) r12
            r18 = r12
        L_0x0123:
            java.util.Map r11 = r11.a()
            java.lang.String r12 = "enter_from_merge"
            java.lang.Object r12 = r11.get(r12)
            r15 = r12
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r12 = "enter_method"
            java.lang.Object r11 = r11.get(r12)
            r16 = r11
            java.lang.String r16 = (java.lang.String) r16
        L_0x013a:
            r11 = r16
            r12 = r17
            r22 = r18
            android.net.Uri r16 = android.net.Uri.parse(r0)
            java.lang.String r17 = r16.getHost()
            if (r17 == 0) goto L_0x0175
            com.bytedance.android.livesdk.v.e r17 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdkapi.host.o r17 = r17.l()
            java.util.List r17 = r17.a()
            java.util.Iterator r17 = r17.iterator()
        L_0x015a:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto L_0x0175
            java.lang.Object r18 = r17.next()
            r4 = r18
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = r16.getHost()
            boolean r4 = r5.endsWith(r4)
            if (r4 == 0) goto L_0x015a
            r21 = 1
            goto L_0x0177
        L_0x0175:
            r21 = 0
        L_0x0177:
            java.util.Set r4 = r16.getQueryParameterNames()
            if (r21 == 0) goto L_0x0244
            if (r4 == 0) goto L_0x0244
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r5 = "room_id"
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L_0x019f
            r16 = 0
            int r5 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x01a1
            java.lang.String r5 = "room_id"
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r0.appendQueryParameter(r5, r6)
            goto L_0x01a1
        L_0x019f:
            r16 = 0
        L_0x01a1:
            java.lang.String r5 = "anchor_id"
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L_0x01b6
            int r5 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x01b6
            java.lang.String r5 = "anchor_id"
            java.lang.String r6 = java.lang.String.valueOf(r8)
            r0.appendQueryParameter(r5, r6)
        L_0x01b6:
            java.lang.String r5 = "user_id"
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L_0x01c7
            java.lang.String r5 = "user_id"
            java.lang.String r6 = java.lang.String.valueOf(r13)
            r0.appendQueryParameter(r5, r6)
        L_0x01c7:
            java.lang.String r5 = "enter_from_merge"
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L_0x01d4
            java.lang.String r5 = "enter_from_merge"
            r0.appendQueryParameter(r5, r15)
        L_0x01d4:
            java.lang.String r5 = "enter_method"
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L_0x01e1
            java.lang.String r5 = "enter_method"
            r0.appendQueryParameter(r5, r11)
        L_0x01e1:
            java.lang.String r5 = "action_type"
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L_0x01ee
            java.lang.String r5 = "action_type"
            r0.appendQueryParameter(r5, r12)
        L_0x01ee:
            java.lang.String r5 = "log_pb"
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L_0x0201
            boolean r5 = android.text.TextUtils.isEmpty(r10)
            if (r5 != 0) goto L_0x0201
            java.lang.String r5 = "log_pb"
            r0.appendQueryParameter(r5, r10)
        L_0x0201:
            java.lang.String r5 = "request_id"
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L_0x0214
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L_0x0214
            java.lang.String r5 = "request_id"
            r0.appendQueryParameter(r5, r3)
        L_0x0214:
            java.lang.String r3 = "video_id"
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L_0x0229
            boolean r3 = android.text.TextUtils.isEmpty(r22)
            if (r3 != 0) goto L_0x0229
            java.lang.String r3 = "video_id"
            r5 = r22
            r0.appendQueryParameter(r3, r5)
        L_0x0229:
            java.lang.String r3 = "action_type"
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L_0x023c
            boolean r3 = android.text.TextUtils.isEmpty(r12)
            if (r3 != 0) goto L_0x023c
            java.lang.String r3 = "action_type"
            r0.appendQueryParameter(r3, r12)
        L_0x023c:
            android.net.Uri r0 = r0.build()
            java.lang.String r0 = r0.toString()
        L_0x0244:
            com.bytedance.android.monitor.webview.h r3 = com.bytedance.android.monitor.webview.h.a()
            r3.a(r1, r0)
            if (r2 == 0) goto L_0x0257
            boolean r3 = r25.isEmpty()
            if (r3 != 0) goto L_0x0257
            com.bytedance.android.livesdk.utils.f.a(r1, r0, r2)
            return
        L_0x0257:
            com.bytedance.android.live.core.utils.u.a(r1, r0)
            return
        L_0x025b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.utils.a.a(java.lang.String, android.webkit.WebView, java.util.Map):void");
    }

    public static boolean b(String str) {
        PackageInfo packageInfo;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f17527a, true, 13608, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f17527a, true, 13608, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            packageInfo = ac.e().getPackageManager().getPackageInfo(str2, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007b, code lost:
        if (r1 != null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
        if (r1 != null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.net.Uri a(android.content.Context r19, java.lang.String r20) {
        /*
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r19
            r11 = 1
            r3[r11] = r20
            com.meituan.robust.ChangeQuickRedirect r5 = f17527a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class<android.net.Uri> r9 = android.net.Uri.class
            r4 = 0
            r6 = 1
            r7 = 13600(0x3520, float:1.9058E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0042
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r19
            r12[r11] = r20
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f17527a
            r15 = 1
            r16 = 13600(0x3520, float:1.9058E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<android.net.Uri> r18 = android.net.Uri.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            android.net.Uri r0 = (android.net.Uri) r0
            return r0
        L_0x0042:
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r20)
            r3 = 0
            if (r2 == 0) goto L_0x004a
            return r3
        L_0x004a:
            android.content.ContentResolver r4 = r19.getContentResolver()     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            java.lang.String r7 = "_data= ?"
            java.lang.String[] r8 = new java.lang.String[r11]     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            r8[r10] = r20     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            java.lang.String r0 = "_id"
            r6[r10] = r0     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            android.net.Uri r5 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            r9 = 0
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            boolean r0 = r1.moveToFirst()     // Catch:{ Exception -> 0x0089, all -> 0x007e }
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = r1.getString(r10)     // Catch:{ Exception -> 0x0089, all -> 0x007e }
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0089, all -> 0x007e }
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0089, all -> 0x007e }
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r2, r4)     // Catch:{ Exception -> 0x0089, all -> 0x007e }
            if (r1 == 0) goto L_0x007a
            r1.close()
        L_0x007a:
            return r0
        L_0x007b:
            if (r1 == 0) goto L_0x008e
            goto L_0x008b
        L_0x007e:
            r0 = move-exception
            r3 = r1
            goto L_0x0082
        L_0x0081:
            r0 = move-exception
        L_0x0082:
            if (r3 == 0) goto L_0x0087
            r3.close()
        L_0x0087:
            throw r0
        L_0x0088:
            r1 = r3
        L_0x0089:
            if (r1 == 0) goto L_0x008e
        L_0x008b:
            r1.close()
        L_0x008e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.utils.a.a(android.content.Context, java.lang.String):android.net.Uri");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        if (r1 != null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009c, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a5, code lost:
        if (r1 == null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f4, code lost:
        if (r3 != null) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0105, code lost:
        if (r3 != null) goto L_0x00f6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:18:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009f A[SYNTHETIC, Splitter:B:34:0x009f] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0100 A[SYNTHETIC, Splitter:B:71:0x0100] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r16, android.net.Uri r17) {
        /*
            r1 = 2
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r15 = 0
            r8[r15] = r16
            r6 = 1
            r8[r6] = r17
            com.meituan.robust.ChangeQuickRedirect r10 = f17527a
            java.lang.Class[] r13 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r13[r15] = r2
            java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
            r13[r6] = r2
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            r9 = 0
            r11 = 1
            r12 = 13601(0x3521, float:1.9059E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r8, r9, r10, r11, r12, r13, r14)
            if (r2 == 0) goto L_0x0041
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r15] = r16
            r2[r6] = r17
            r8 = 0
            com.meituan.robust.ChangeQuickRedirect r9 = f17527a
            r10 = 1
            r11 = 13601(0x3521, float:1.9059E-41)
            java.lang.Class[] r12 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r12[r15] = r0
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            r12[r6] = r0
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            r7 = r2
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0041:
            r8 = 0
            if (r17 != 0) goto L_0x0045
            return r8
        L_0x0045:
            java.lang.String r1 = r17.getScheme()
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x010a
            java.lang.String r2 = "file"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0059
            goto L_0x010a
        L_0x0059:
            java.lang.String r2 = "http"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0066
            java.lang.String r0 = r17.toString()
            return r0
        L_0x0066:
            java.lang.String r2 = "content"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0109
            java.lang.String[] r11 = new java.lang.String[r6]
            java.lang.String r1 = "_data"
            r11[r15] = r1
            java.lang.String r9 = ""
            android.content.ContentResolver r1 = r16.getContentResolver()     // Catch:{ Exception -> 0x00a3, all -> 0x009b }
            r4 = 0
            r5 = 0
            r10 = 0
            r2 = r17
            r3 = r11
            r12 = 1
            r6 = r10
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00a4, all -> 0x009b }
            boolean r2 = r1.moveToFirst()     // Catch:{ Exception -> 0x00a5, all -> 0x0099 }
            if (r2 == 0) goto L_0x0091
            java.lang.String r2 = r1.getString(r15)     // Catch:{ Exception -> 0x00a5, all -> 0x0099 }
            r9 = r2
        L_0x0091:
            if (r1 == 0) goto L_0x0096
            r1.close()     // Catch:{ Exception -> 0x00a5, all -> 0x0099 }
        L_0x0096:
            if (r1 == 0) goto L_0x00aa
            goto L_0x00a7
        L_0x0099:
            r0 = move-exception
            goto L_0x009d
        L_0x009b:
            r0 = move-exception
            r1 = r8
        L_0x009d:
            if (r1 == 0) goto L_0x00a2
            r1.close()     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            throw r0
        L_0x00a3:
            r12 = 1
        L_0x00a4:
            r1 = r8
        L_0x00a5:
            if (r1 == 0) goto L_0x00aa
        L_0x00a7:
            r1.close()     // Catch:{ Exception -> 0x00aa }
        L_0x00aa:
            r2 = r1
            r1 = r9
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r1)
            if (r3 == 0) goto L_0x0108
            android.content.ContentResolver r9 = r16.getContentResolver()     // Catch:{ Exception -> 0x0104, all -> 0x00fd }
            java.lang.String r0 = "_id= ?"
            java.lang.String r3 = r17.getLastPathSegment()     // Catch:{ Exception -> 0x0104, all -> 0x00fd }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0104, all -> 0x00fd }
            r5 = 19
            if (r4 < r5) goto L_0x00d8
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0104, all -> 0x00fd }
            if (r4 != 0) goto L_0x00d8
            java.lang.String r4 = ":"
            boolean r4 = r3.contains(r4)     // Catch:{ Exception -> 0x0104, all -> 0x00fd }
            if (r4 == 0) goto L_0x00d8
            java.lang.String r4 = ":"
            java.lang.String[] r3 = r3.split(r4)     // Catch:{ Exception -> 0x0104, all -> 0x00fd }
            r3 = r3[r12]     // Catch:{ Exception -> 0x0104, all -> 0x00fd }
        L_0x00d8:
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ Exception -> 0x0104, all -> 0x00fd }
            r13[r15] = r3     // Catch:{ Exception -> 0x0104, all -> 0x00fd }
            android.net.Uri r10 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0104, all -> 0x00fd }
            r14 = 0
            r12 = r0
            android.database.Cursor r3 = r9.query(r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0104, all -> 0x00fd }
            boolean r0 = r3.moveToFirst()     // Catch:{ Exception -> 0x0105, all -> 0x00fa }
            if (r0 == 0) goto L_0x00ef
            java.lang.String r0 = r3.getString(r15)     // Catch:{ Exception -> 0x0105, all -> 0x00fa }
            r1 = r0
        L_0x00ef:
            if (r3 == 0) goto L_0x00f4
            r3.close()     // Catch:{ Exception -> 0x0105, all -> 0x00fa }
        L_0x00f4:
            if (r3 == 0) goto L_0x0108
        L_0x00f6:
            r3.close()     // Catch:{ Exception -> 0x0108 }
            goto L_0x0108
        L_0x00fa:
            r0 = move-exception
            r2 = r3
            goto L_0x00fe
        L_0x00fd:
            r0 = move-exception
        L_0x00fe:
            if (r2 == 0) goto L_0x0103
            r2.close()     // Catch:{ Exception -> 0x0103 }
        L_0x0103:
            throw r0
        L_0x0104:
            r3 = r2
        L_0x0105:
            if (r3 == 0) goto L_0x0108
            goto L_0x00f6
        L_0x0108:
            return r1
        L_0x0109:
            return r8
        L_0x010a:
            java.lang.String r0 = r17.getPath()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.utils.a.a(android.content.Context, android.net.Uri):java.lang.String");
    }

    public static String a(Context context, WebView webView) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, webView}, null, f17527a, true, 13609, new Class[]{Context.class, WebView.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2, webView}, null, f17527a, true, 13609, new Class[]{Context.class, WebView.class}, String.class);
        }
        if (webView != null) {
            String userAgentString = webView.getSettings().getUserAgentString();
            if (!StringUtils.isEmpty(userAgentString)) {
                f17528b = userAgentString;
                return userAgentString;
            }
        }
        if (!StringUtils.isEmpty(f17528b)) {
            return f17528b;
        }
        String webViewDefaultUserAgent = JellyBeanMR1V17Compat.getWebViewDefaultUserAgent(context);
        f17528b = webViewDefaultUserAgent;
        if (!StringUtils.isEmpty(webViewDefaultUserAgent)) {
            return f17528b;
        }
        if (!f17529c && webView == null && (context2 instanceof Activity)) {
            f17529c = true;
            try {
                WebView webView2 = new WebView(context2);
                f17528b = webView2.getSettings().getUserAgentString();
                webView2.destroy();
            } catch (Throwable unused) {
            }
        }
        return f17528b;
    }

    public static void a(Activity activity, Fragment fragment, int i) {
        final Activity activity2 = activity;
        final Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{activity2, fragment2, 40003}, null, f17527a, true, 13598, new Class[]{Activity.class, Fragment.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, fragment2, 40003}, null, f17527a, true, 13598, new Class[]{Activity.class, Fragment.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        f.a(activity).a(b.f17588b).b(c.f17594b).a(new d(40003) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f17530a;

            public final void b(String... strArr) {
                if (PatchProxy.isSupport(new Object[]{strArr}, this, f17530a, false, 13615, new Class[]{String[].class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{strArr}, this, f17530a, false, 13615, new Class[]{String[].class}, Void.TYPE);
                    return;
                }
                a.a("android.permission.WRITE_EXTERNAL_STORAGE", al.b.CLICK, (String) null, "cancel");
            }

            public final void a(String... strArr) {
                if (PatchProxy.isSupport(new Object[]{strArr}, this, f17530a, false, 13614, new Class[]{String[].class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{strArr}, this, f17530a, false, 13614, new Class[]{String[].class}, Void.TYPE);
                } else if (!"mounted".equals(Environment.getExternalStorageState())) {
                    UIUtils.displayToastWithIcon((Context) activity2, 2130841006, (int) C0906R.string.ct1);
                } else {
                    Intent intent = new Intent();
                    intent.setType("image/*");
                    intent.setAction("android.intent.action.GET_CONTENT");
                    try {
                        if (fragment2 != null) {
                            fragment2.startActivityForResult(intent, 40003);
                        } else {
                            activity2.startActivityForResult(intent, 40003);
                        }
                    } catch (Exception unused) {
                        UIUtils.displayToastWithIcon((Context) activity2, 2130841006, (int) C0906R.string.ct0);
                    }
                }
            }
        }, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public static void a(String str, WebView webView, String str2, boolean z) {
        String str3;
        String str4 = str;
        WebView webView2 = webView;
        if (PatchProxy.isSupport(new Object[]{str4, webView2, str2, (byte) 1}, null, f17527a, true, 13606, new Class[]{String.class, WebView.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, webView2, str2, (byte) 1}, null, f17527a, true, 13606, new Class[]{String.class, WebView.class, String.class, Boolean.TYPE}, Void.TYPE);
        } else if (webView2 != null && !StringUtils.isEmpty(str)) {
            boolean a2 = a(str);
            if (!a2 || !StringUtils.isEmpty(str2)) {
                str3 = str2;
            } else {
                str3 = "https://nativeapp.toutiao.com";
            }
            if (!a2) {
                str3 = null;
            }
            HashMap hashMap = new HashMap();
            if (!StringUtils.isEmpty(str3)) {
                hashMap.put("Referer", str3);
            }
            a(str4, webView2, (Map) hashMap);
        }
    }
}
