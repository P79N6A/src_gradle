package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.frameworks.baselib.network.http.util.UrlUtils;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.CommonApi;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0004H\u0002J2\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011J2\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002J.\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001a2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001b\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/utils/NetworkApi;", "", "()V", "CONTENT_TYPE_JSON", "", "GZIP_ENCODING", "SIZE", "", "createApi", "Lcom/ss/android/ugc/aweme/net/CommonApi;", "baseUrl", "executePost", "url", "json", "Lorg/json/JSONObject;", "contentType", "headers", "", "Lcom/bytedance/retrofit2/client/Header;", "executePut", "getGzipData", "", "data", "jsonObjectToFieldMap", "", "fieldMap", "", "preKey", "network_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class cu {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75698a;

    /* renamed from: b  reason: collision with root package name */
    public static final cu f75699b = new cu();

    private cu() {
    }

    private final CommonApi a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f75698a, false, 88428, new Class[]{String.class}, CommonApi.class)) {
            return (CommonApi) PatchProxy.accessDispatch(new Object[]{str2}, this, f75698a, false, 88428, new Class[]{String.class}, CommonApi.class);
        } else if (StringUtils.isEmpty(str)) {
            return null;
        } else {
            return (CommonApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(str2).create(CommonApi.class);
        }
    }

    private final byte[] a(byte[] bArr) throws Exception {
        byte[] bArr2;
        if (PatchProxy.isSupport(new Object[]{bArr}, this, f75698a, false, 88430, new Class[]{byte[].class}, byte[].class)) {
            return (byte[]) PatchProxy.accessDispatch(new Object[]{bArr}, this, f75698a, false, 88430, new Class[]{byte[].class}, byte[].class);
        }
        if (bArr == null) {
            bArr2 = new byte[0];
        } else {
            bArr2 = bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr2);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            Throwable th2 = th;
            gZIPOutputStream.close();
            throw th2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ba, code lost:
        if (r1 == null) goto L_0x00bc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.util.Map<java.lang.String, java.lang.String> r16, org.json.JSONObject r17, java.lang.String r18) throws org.json.JSONException {
        /*
            r15 = this;
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = 3
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r12 = 0
            r0[r12] = r8
            r13 = 1
            r0[r13] = r9
            r14 = 2
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f75698a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            r5[r12] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r13] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 88429(0x1596d, float:1.23915E-40)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0053
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            r0[r13] = r9
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f75698a
            r3 = 0
            r4 = 88429(0x1596d, float:1.23915E-40)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            r5[r12] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r13] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0053:
            if (r9 != 0) goto L_0x0056
            return
        L_0x0056:
            java.util.Iterator r0 = r17.keys()
        L_0x005a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00c2
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = r10
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0076
            java.lang.String r2 = "key"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r2 = r1
            goto L_0x008f
        L_0x0076:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r3 = 91
            r2.append(r3)
            r2.append(r1)
            r3 = 93
            r2.append(r3)
            java.lang.String r2 = r2.toString()
        L_0x008f:
            java.lang.Object r1 = r9.get(r1)
            boolean r3 = r1 instanceof org.json.JSONObject
            if (r3 == 0) goto L_0x009d
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            r15.a(r8, r1, r2)
            goto L_0x005a
        L_0x009d:
            boolean r3 = r1 instanceof org.json.JSONArray
            if (r3 == 0) goto L_0x00b4
            org.json.JSONArray r1 = (org.json.JSONArray) r1
            int r3 = r1.length()
            r4 = 0
        L_0x00a8:
            if (r4 >= r3) goto L_0x005a
            org.json.JSONObject r5 = r1.getJSONObject(r4)
            r15.a(r8, r5, r2)
            int r4 = r4 + 1
            goto L_0x00a8
        L_0x00b4:
            if (r1 == 0) goto L_0x00bc
            java.lang.String r1 = r1.toString()
            if (r1 != 0) goto L_0x00be
        L_0x00bc:
            java.lang.String r1 = ""
        L_0x00be:
            r8.put(r2, r1)
            goto L_0x005a
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.cu.a(java.util.Map, org.json.JSONObject, java.lang.String):void");
    }

    @NotNull
    public final String b(@NotNull String str, @Nullable JSONObject jSONObject, @Nullable String str2, @Nullable List<Header> list) throws Exception {
        List<Header> list2;
        String str3 = str;
        JSONObject jSONObject2 = jSONObject;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, jSONObject2, str4, list}, this, f75698a, false, 88427, new Class[]{String.class, JSONObject.class, String.class, List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3, jSONObject2, str4, list}, this, f75698a, false, 88427, new Class[]{String.class, JSONObject.class, String.class, List.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(str3, PushConstants.WEB_URL);
        byte[] bArr = null;
        Pair<String, String> parseUrl = UrlUtils.parseUrl(str3, null);
        String str5 = (String) parseUrl.first;
        String str6 = (String) parseUrl.second;
        Intrinsics.checkExpressionValueIsNotNull(str5, "baseUrl");
        CommonApi a2 = a(str5);
        if (a2 != null) {
            if (list == null) {
                list2 = new ArrayList<>();
            } else {
                list2 = list;
            }
            if (!TextUtils.isEmpty(str4)) {
                list2.add(new Header("Content-Type", str4));
            }
            if (str4 == null || !StringsKt.startsWith$default(str4, "application/json", false, 2, null)) {
                Map hashMap = new HashMap();
                a(hashMap, jSONObject2, "");
                Object body = a2.doPost(str6, hashMap, list2).execute().body();
                Intrinsics.checkExpressionValueIsNotNull(body, "api.doPost(relativePath,…headers).execute().body()");
                return (String) body;
            }
            if (jSONObject2 != null) {
                String jSONObject3 = jSONObject.toString();
                if (jSONObject3 != null) {
                    Charset forName = Charset.forName("UTF-8");
                    Intrinsics.checkExpressionValueIsNotNull(forName, "Charset.forName(charsetName)");
                    if (jSONObject3 != null) {
                        bArr = jSONObject3.getBytes(forName);
                        Intrinsics.checkExpressionValueIsNotNull(bArr, "(this as java.lang.String).getBytes(charset)");
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
            TypedByteArray typedByteArray = new TypedByteArray(str4, a(bArr), new String[0]);
            list2.add(new Header("Content-Encoding", "gzip"));
            Object body2 = a2.postBody(str6, typedByteArray, list2).execute().body();
            Intrinsics.checkExpressionValueIsNotNull(body2, "api.postBody(relativePat…headers).execute().body()");
            return (String) body2;
        }
        throw new RuntimeException("CommonApi is null,url=" + str3);
    }

    @NotNull
    public final String a(@NotNull String str, @Nullable JSONObject jSONObject, @Nullable String str2, @Nullable List<Header> list) throws Exception {
        List<Header> list2;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, jSONObject, str4, list}, this, f75698a, false, 88426, new Class[]{String.class, JSONObject.class, String.class, List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3, jSONObject, str4, list}, this, f75698a, false, 88426, new Class[]{String.class, JSONObject.class, String.class, List.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(str3, PushConstants.WEB_URL);
        byte[] bArr = null;
        Pair<String, String> parseUrl = UrlUtils.parseUrl(str3, null);
        String str5 = (String) parseUrl.first;
        String str6 = (String) parseUrl.second;
        Intrinsics.checkExpressionValueIsNotNull(str5, "baseUrl");
        CommonApi a2 = a(str5);
        if (a2 != null) {
            if (list == null) {
                list2 = new ArrayList<>();
            } else {
                list2 = list;
            }
            if (!TextUtils.isEmpty(str4)) {
                list2.add(new Header("Content-Type", str4));
            }
            if (jSONObject != null) {
                String jSONObject2 = jSONObject.toString();
                if (jSONObject2 != null) {
                    Charset forName = Charset.forName("UTF-8");
                    Intrinsics.checkExpressionValueIsNotNull(forName, "Charset.forName(charsetName)");
                    if (jSONObject2 != null) {
                        bArr = jSONObject2.getBytes(forName);
                        Intrinsics.checkExpressionValueIsNotNull(bArr, "(this as java.lang.String).getBytes(charset)");
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
            TypedByteArray typedByteArray = new TypedByteArray(str4, a(bArr), new String[0]);
            list2.add(new Header("Content-Encoding", "gzip"));
            Object body = a2.putBody(str6, typedByteArray, list2).execute().body();
            Intrinsics.checkExpressionValueIsNotNull(body, "api.putBody(relativePath…headers).execute().body()");
            return (String) body;
        }
        throw new RuntimeException("CommonApi is null,url=" + str3);
    }
}
