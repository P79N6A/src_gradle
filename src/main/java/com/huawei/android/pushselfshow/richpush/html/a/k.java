package com.huawei.android.pushselfshow.richpush.html.a;

import android.content.Context;
import android.content.Intent;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushselfshow.richpush.html.api.NativeToJsMessageQueue;
import com.huawei.android.pushselfshow.richpush.html.api.d;
import org.json.JSONObject;

public class k implements h {

    /* renamed from: a  reason: collision with root package name */
    private NativeToJsMessageQueue f25311a;

    /* renamed from: b  reason: collision with root package name */
    private String f25312b;

    /* renamed from: c  reason: collision with root package name */
    private Context f25313c;

    /* renamed from: d  reason: collision with root package name */
    private String f25314d;

    public k(Context context) {
        e.e("PushSelfShowLog", "init VideoPlayer");
        this.f25313c = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(org.json.JSONObject r7) {
        /*
            r6 = this;
            com.huawei.android.pushselfshow.richpush.html.api.NativeToJsMessageQueue r0 = r6.f25311a
            if (r0 != 0) goto L_0x000c
            java.lang.String r7 = "PushSelfShowLog"
            java.lang.String r0 = "jsMessageQueue is null while run into Video Player exec"
            com.huawei.android.pushagent.utils.a.e.a(r7, r0)
            return
        L_0x000c:
            r0 = 0
            if (r7 == 0) goto L_0x00ee
            java.lang.String r1 = "url"
            boolean r1 = r7.has(r1)
            if (r1 == 0) goto L_0x00ee
            java.lang.String r1 = "url"
            java.lang.String r1 = r7.getString(r1)     // Catch:{ Exception | JSONException -> 0x00e6 }
            com.huawei.android.pushselfshow.richpush.html.api.NativeToJsMessageQueue r2 = r6.f25311a     // Catch:{ Exception | JSONException -> 0x00e6 }
            java.lang.String r2 = r2.a()     // Catch:{ Exception | JSONException -> 0x00e6 }
            java.lang.String r2 = com.huawei.android.pushselfshow.richpush.html.api.b.a((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ Exception | JSONException -> 0x00e6 }
            if (r2 == 0) goto L_0x00c4
            int r3 = r2.length()     // Catch:{ Exception | JSONException -> 0x00e6 }
            if (r3 <= 0) goto L_0x00c4
            r6.f25314d = r2     // Catch:{ Exception | JSONException -> 0x00e6 }
            java.lang.String r1 = "video/*"
            java.lang.String r2 = "mime-type"
            boolean r2 = r7.has(r2)     // Catch:{ Exception | JSONException -> 0x00e6 }
            if (r2 == 0) goto L_0x006b
            java.lang.String r2 = "mime-type"
            java.lang.String r2 = r7.getString(r2)     // Catch:{ JSONException -> 0x0066, Exception -> 0x005e }
            java.lang.String r3 = "PushSelfShowLog"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0066, Exception -> 0x005e }
            java.lang.String r5 = "the custom mimetype is "
            r4.<init>(r5)     // Catch:{ JSONException -> 0x0066, Exception -> 0x005e }
            r4.append(r2)     // Catch:{ JSONException -> 0x0066, Exception -> 0x005e }
            java.lang.String r4 = r4.toString()     // Catch:{ JSONException -> 0x0066, Exception -> 0x005e }
            com.huawei.android.pushagent.utils.a.e.e(r3, r4)     // Catch:{ JSONException -> 0x0066, Exception -> 0x005e }
            java.lang.String r3 = "video/"
            boolean r3 = r2.startsWith(r3)     // Catch:{ JSONException -> 0x0066, Exception -> 0x005e }
            if (r3 == 0) goto L_0x006b
            r1 = r2
            goto L_0x006b
        L_0x005e:
            java.lang.String r2 = "PushSelfShowLog"
            java.lang.String r3 = "get mime-type error"
        L_0x0062:
            com.huawei.android.pushagent.utils.a.e.e(r2, r3)     // Catch:{ Exception | JSONException -> 0x00e6 }
            goto L_0x006b
        L_0x0066:
            java.lang.String r2 = "PushSelfShowLog"
            java.lang.String r3 = "get mime-type error"
            goto L_0x0062
        L_0x006b:
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception | JSONException -> 0x00e6 }
            java.lang.String r3 = "android.intent.action.VIEW"
            r2.<init>(r3)     // Catch:{ Exception | JSONException -> 0x00e6 }
            java.lang.String r3 = r6.f25314d     // Catch:{ Exception | JSONException -> 0x00e6 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ Exception | JSONException -> 0x00e6 }
            r2.setDataAndType(r3, r1)     // Catch:{ Exception | JSONException -> 0x00e6 }
            java.lang.String r1 = "package-name"
            boolean r1 = r7.has(r1)     // Catch:{ Exception | JSONException -> 0x00e6 }
            if (r1 == 0) goto L_0x00b3
            java.lang.String r1 = "package-name"
            java.lang.String r7 = r7.getString(r1)     // Catch:{ JSONException -> 0x00ac }
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00ac }
            java.lang.String r4 = "the custom packageName is "
            r3.<init>(r4)     // Catch:{ JSONException -> 0x00ac }
            r3.append(r7)     // Catch:{ JSONException -> 0x00ac }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x00ac }
            com.huawei.android.pushagent.utils.a.e.e(r1, r3)     // Catch:{ JSONException -> 0x00ac }
            android.content.Context r1 = r6.f25313c     // Catch:{ JSONException -> 0x00ac }
            java.util.ArrayList r1 = com.huawei.android.pushselfshow.richpush.html.api.b.a((android.content.Context) r1, (android.content.Intent) r2)     // Catch:{ JSONException -> 0x00ac }
            boolean r1 = r1.contains(r7)     // Catch:{ JSONException -> 0x00ac }
            if (r1 == 0) goto L_0x00b3
            r2.setPackage(r7)     // Catch:{ JSONException -> 0x00ac }
            goto L_0x00b3
        L_0x00ac:
            java.lang.String r7 = "PushSelfShowLog"
            java.lang.String r1 = "get packageName error"
            com.huawei.android.pushagent.utils.a.e.e(r7, r1)     // Catch:{ Exception | JSONException -> 0x00e6 }
        L_0x00b3:
            android.content.Context r7 = r6.f25313c     // Catch:{ Exception | JSONException -> 0x00e6 }
            r7.startActivity(r2)     // Catch:{ Exception | JSONException -> 0x00e6 }
            com.huawei.android.pushselfshow.richpush.html.api.NativeToJsMessageQueue r7 = r6.f25311a     // Catch:{ Exception | JSONException -> 0x00e6 }
            java.lang.String r1 = r6.f25312b     // Catch:{ Exception | JSONException -> 0x00e6 }
            com.huawei.android.pushselfshow.richpush.html.api.d$a r2 = com.huawei.android.pushselfshow.richpush.html.api.d.a.OK     // Catch:{ Exception | JSONException -> 0x00e6 }
            java.lang.String r3 = "success"
            r7.a(r1, r2, r3, r0)     // Catch:{ Exception | JSONException -> 0x00e6 }
            goto L_0x00f9
        L_0x00c4:
            java.lang.String r7 = "PushSelfShowLog"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception | JSONException -> 0x00e6 }
            r2.<init>()     // Catch:{ Exception | JSONException -> 0x00e6 }
            r2.append(r1)     // Catch:{ Exception | JSONException -> 0x00e6 }
            java.lang.String r1 = "File not exist"
            r2.append(r1)     // Catch:{ Exception | JSONException -> 0x00e6 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception | JSONException -> 0x00e6 }
            com.huawei.android.pushagent.utils.a.e.e(r7, r1)     // Catch:{ Exception | JSONException -> 0x00e6 }
            com.huawei.android.pushselfshow.richpush.html.api.NativeToJsMessageQueue r7 = r6.f25311a     // Catch:{ Exception | JSONException -> 0x00e6 }
            java.lang.String r1 = r6.f25312b     // Catch:{ Exception | JSONException -> 0x00e6 }
            com.huawei.android.pushselfshow.richpush.html.api.d$a r2 = com.huawei.android.pushselfshow.richpush.html.api.d.a.AUDIO_ONLY_SUPPORT_HTTP     // Catch:{ Exception | JSONException -> 0x00e6 }
            java.lang.String r3 = "error"
            r7.a(r1, r2, r3, r0)     // Catch:{ Exception | JSONException -> 0x00e6 }
            return
        L_0x00e6:
            r7 = move-exception
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.String r2 = "startPlaying failed "
            com.huawei.android.pushagent.utils.a.e.d(r1, r2, r7)
        L_0x00ee:
            com.huawei.android.pushselfshow.richpush.html.api.NativeToJsMessageQueue r7 = r6.f25311a
            java.lang.String r1 = r6.f25312b
            com.huawei.android.pushselfshow.richpush.html.api.d$a r2 = com.huawei.android.pushselfshow.richpush.html.api.d.a.JSON_EXCEPTION
            java.lang.String r3 = "error"
            r7.a(r1, r2, r3, r0)
        L_0x00f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushselfshow.richpush.html.a.k.a(org.json.JSONObject):void");
    }

    public String a(String str, JSONObject jSONObject) {
        return null;
    }

    public void a(int i, int i2, Intent intent) {
    }

    public void a(NativeToJsMessageQueue nativeToJsMessageQueue, String str, String str2, JSONObject jSONObject) {
        if (nativeToJsMessageQueue == null) {
            e.a("PushSelfShowLog", "jsMessageQueue is null while run into Video Player exec");
            return;
        }
        this.f25311a = nativeToJsMessageQueue;
        if ("playVideo".equals(str)) {
            d();
            if (str2 != null) {
                this.f25312b = str2;
                a(jSONObject);
                return;
            }
            e.a("PushSelfShowLog", "Audio exec callback is null ");
            return;
        }
        nativeToJsMessageQueue.a(str2, d.a.METHOD_NOT_FOUND_EXCEPTION, "error", null);
    }

    public void b() {
    }

    public void c() {
        d();
    }

    public void d() {
        this.f25312b = null;
        this.f25314d = null;
    }
}
