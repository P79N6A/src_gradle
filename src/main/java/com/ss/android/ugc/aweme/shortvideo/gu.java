package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.client.Header;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ttuploader.TTExternNetLoader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class gu implements TTExternNetLoader {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67962a;

    /* renamed from: b  reason: collision with root package name */
    private Call<String> f67963b;

    public final void cancelTask() {
        if (PatchProxy.isSupport(new Object[0], this, f67962a, false, 74763, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67962a, false, 74763, new Class[0], Void.TYPE);
            return;
        }
        if (this.f67963b != null) {
            this.f67963b.cancel();
        }
    }

    private List<Header> a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, f67962a, false, 74765, new Class[]{JSONObject.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f67962a, false, 74765, new Class[]{JSONObject.class}, List.class);
        } else if (jSONObject2 == null) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                arrayList.add(new Header(next, jSONObject2.optString(next)));
            }
            return arrayList;
        }
    }

    public final JSONObject a(List<Header> list) {
        List<Header> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f67962a, false, 74766, new Class[]{List.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{list2}, this, f67962a, false, 74766, new Class[]{List.class}, JSONObject.class);
        } else if (list2 == null && list.size() == 0) {
            return null;
        } else {
            JSONObject jSONObject = new JSONObject();
            for (int i = 0; i < list.size(); i++) {
                Header header = list2.get(i);
                try {
                    jSONObject.put(header.getName(), header.getValue());
                } catch (JSONException unused) {
                }
            }
            return jSONObject;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x010e, code lost:
        if (r2.equals("post") == false) goto L_0x0127;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int sendRequest(com.ss.ttuploader.TTExternRequestInfo r20, com.ss.ttuploader.TTExternNetLoaderListener r21) {
        /*
            r19 = this;
            r7 = r19
            r8 = r21
            r9 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r20
            r11 = 1
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f67962a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.ttuploader.TTExternRequestInfo> r1 = com.ss.ttuploader.TTExternRequestInfo.class
            r5[r10] = r1
            java.lang.Class<com.ss.ttuploader.TTExternNetLoaderListener> r1 = com.ss.ttuploader.TTExternNetLoaderListener.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r3 = 0
            r4 = 74762(0x1240a, float:1.04764E-40)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004c
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r20
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f67962a
            r3 = 0
            r4 = 74762(0x1240a, float:1.04764E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.ttuploader.TTExternRequestInfo> r1 = com.ss.ttuploader.TTExternRequestInfo.class
            r5[r10] = r1
            java.lang.Class<com.ss.ttuploader.TTExternNetLoaderListener> r1 = com.ss.ttuploader.TTExternNetLoaderListener.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r19
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x004c:
            java.lang.String r0 = r20.getUrl()
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0207
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>()
            android.util.Pair r1 = com.bytedance.frameworks.baselib.network.http.util.UrlUtils.parseUrl(r0, r14)     // Catch:{ IOException -> 0x01ee }
            if (r1 == 0) goto L_0x01d5
            java.lang.Object r0 = r1.first
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r1.second
            r15 = r1
            java.lang.String r15 = (java.lang.String) r15
            com.bytedance.retrofit2.Retrofit r0 = com.bytedance.ttnet.utils.RetrofitUtils.getSsRetrofit(r0)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.IUploadFileApi> r1 = com.ss.android.ugc.aweme.shortvideo.IUploadFileApi.class
            java.lang.Object r0 = r0.create(r1)
            r12 = r0
            com.ss.android.ugc.aweme.shortvideo.IUploadFileApi r12 = (com.ss.android.ugc.aweme.shortvideo.IUploadFileApi) r12
            org.json.JSONObject r13 = r20.getRequestHeader()
            java.lang.String r6 = "Content-Type"
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r13
            r0[r11] = r6
            com.meituan.robust.ChangeQuickRedirect r2 = f67962a
            r3 = 0
            r4 = 74764(0x1240c, float:1.04767E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r1 = r19
            r11 = r6
            r6 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r1 = 0
            if (r0 == 0) goto L_0x00c5
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r13
            r16 = 1
            r0[r16] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f67962a
            r3 = 0
            r4 = 74764(0x1240c, float:1.04767E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r16] = r1
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r19
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x00e3
        L_0x00c5:
            r16 = 1
            if (r13 == 0) goto L_0x00e3
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L_0x00d0
            goto L_0x00e3
        L_0x00d0:
            java.lang.String r0 = r13.optString(r11)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x00e2
            java.lang.String r0 = r11.toLowerCase()
            java.lang.String r0 = r13.optString(r0, r1)
        L_0x00e2:
            r1 = r0
        L_0x00e3:
            java.util.List r0 = r7.a((org.json.JSONObject) r13)
            com.bytedance.frameworks.baselib.network.http.b r18 = r20.getExtraInfo()
            java.lang.String r2 = r20.getMethod()
            java.lang.String r2 = r2.toLowerCase()
            r3 = -1
            int r4 = r2.hashCode()
            r5 = 102230(0x18f56, float:1.43255E-40)
            if (r4 == r5) goto L_0x011c
            r5 = 111375(0x1b30f, float:1.5607E-40)
            if (r4 == r5) goto L_0x0111
            r5 = 3446944(0x3498a0, float:4.830197E-39)
            if (r4 == r5) goto L_0x0108
            goto L_0x0127
        L_0x0108:
            java.lang.String r4 = "post"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x0127
            goto L_0x0129
        L_0x0111:
            java.lang.String r4 = "put"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x0127
            r16 = 2
            goto L_0x0129
        L_0x011c:
            java.lang.String r4 = "get"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x0127
            r16 = 0
            goto L_0x0129
        L_0x0127:
            r16 = -1
        L_0x0129:
            switch(r16) {
                case 0: goto L_0x01bd;
                case 1: goto L_0x0181;
                case 2: goto L_0x0145;
                default: goto L_0x012c;
            }
        L_0x012c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Method("
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r2 = ") is unsupported."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0145:
            byte[] r2 = r20.getData()
            if (r2 == 0) goto L_0x0154
            com.bytedance.retrofit2.mime.TypedByteArray r3 = new com.bytedance.retrofit2.mime.TypedByteArray
            java.lang.String[] r4 = new java.lang.String[r10]
            r3.<init>(r1, r2, r4)
            r2 = r3
            goto L_0x0173
        L_0x0154:
            com.bytedance.retrofit2.mime.TypedByteArray r2 = new com.bytedance.retrofit2.mime.TypedByteArray
            java.lang.String r3 = "null"
            byte[] r3 = r3.getBytes()
            java.lang.String[] r4 = new java.lang.String[r10]
            r2.<init>(r1, r3, r4)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0173
            com.bytedance.retrofit2.client.Header r1 = new com.bytedance.retrofit2.client.Header
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/unknown"
            r1.<init>(r3, r4)
            r0.add(r1)
        L_0x0173:
            r13 = -1
            r3 = r14
            r14 = r2
            r16 = r3
            r17 = r0
            com.bytedance.retrofit2.Call r0 = r12.doPut(r13, r14, r15, r16, r17, r18)
            r7.f67963b = r0
            goto L_0x01ca
        L_0x0181:
            r3 = r14
            byte[] r2 = r20.getData()
            if (r2 == 0) goto L_0x0191
            com.bytedance.retrofit2.mime.TypedByteArray r4 = new com.bytedance.retrofit2.mime.TypedByteArray
            java.lang.String[] r5 = new java.lang.String[r10]
            r4.<init>(r1, r2, r5)
            r14 = r4
            goto L_0x01b1
        L_0x0191:
            com.bytedance.retrofit2.mime.TypedByteArray r2 = new com.bytedance.retrofit2.mime.TypedByteArray
            java.lang.String r4 = "null"
            byte[] r4 = r4.getBytes()
            java.lang.String[] r5 = new java.lang.String[r10]
            r2.<init>(r1, r4, r5)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x01b0
            com.bytedance.retrofit2.client.Header r1 = new com.bytedance.retrofit2.client.Header
            java.lang.String r4 = "Content-Type"
            java.lang.String r5 = "application/unknown"
            r1.<init>(r4, r5)
            r0.add(r1)
        L_0x01b0:
            r14 = r2
        L_0x01b1:
            r13 = -1
            r16 = r3
            r17 = r0
            com.bytedance.retrofit2.Call r0 = r12.postBody(r13, r14, r15, r16, r17, r18)
            r7.f67963b = r0
            goto L_0x01ca
        L_0x01bd:
            r3 = r14
            r13 = 0
            r14 = -1
            r16 = r3
            r17 = r0
            com.bytedance.retrofit2.Call r0 = r12.doGet(r13, r14, r15, r16, r17, r18)
            r7.f67963b = r0
        L_0x01ca:
            com.bytedance.retrofit2.Call<java.lang.String> r0 = r7.f67963b
            com.ss.android.ugc.aweme.shortvideo.gu$1 r1 = new com.ss.android.ugc.aweme.shortvideo.gu$1
            r1.<init>(r8)
            r0.enqueue(r1)
            return r10
        L_0x01d5:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x01ee }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01ee }
            java.lang.String r3 = "Request url("
            r2.<init>(r3)     // Catch:{ IOException -> 0x01ee }
            r2.append(r0)     // Catch:{ IOException -> 0x01ee }
            java.lang.String r3 = ") is invalid."
            r2.append(r3)     // Catch:{ IOException -> 0x01ee }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x01ee }
            r1.<init>(r2)     // Catch:{ IOException -> 0x01ee }
            throw r1     // Catch:{ IOException -> 0x01ee }
        L_0x01ee:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Request url("
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ") is invalid."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0207:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Request url("
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ") is null or empty."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.gu.sendRequest(com.ss.ttuploader.TTExternRequestInfo, com.ss.ttuploader.TTExternNetLoaderListener):int");
    }
}
