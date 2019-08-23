package com.taobao.agoo.a;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.utl.d;
import com.taobao.agoo.ICallback;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.Config;
import org.json.JSONException;
import org.json.JSONObject;

public class b extends AccsAbstractDataListener {

    /* renamed from: b  reason: collision with root package name */
    public static a f79130b;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, ICallback> f79131a = new HashMap();

    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
    }

    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
    }

    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
    }

    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
    }

    public b(Context context) {
        if (f79130b == null) {
            f79130b = new a(context.getApplicationContext());
        }
    }

    private void a(JSONObject jSONObject, ICallback iCallback) throws JSONException {
        String a2 = d.a(jSONObject, "pushAliasToken", null);
        if (!TextUtils.isEmpty(a2)) {
            Config.b(GlobalClientInfo.getContext(), a2);
            if (iCallback != null) {
                iCallback.onSuccess();
                f79130b.c(iCallback.extra);
            }
        } else if (iCallback != null) {
            iCallback.onFailure("", "agoo server error-pushtoken null");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0129, code lost:
        if ("AgooDeviceCmd".equals(r6) != false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012b, code lost:
        r5.f79131a.remove(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0130, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0143, code lost:
        if ("AgooDeviceCmd".equals(r6) == false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0146, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResponse(java.lang.String r6, java.lang.String r7, int r8, byte[] r9, com.taobao.accs.base.TaoBaseService.ExtraInfo r10) {
        /*
            r5 = this;
            r10 = 0
            java.lang.String r0 = "AgooDeviceCmd"
            boolean r0 = r0.equals(r6)     // Catch:{ Throwable -> 0x0133 }
            if (r0 == 0) goto L_0x0123
            java.util.Map<java.lang.String, com.taobao.agoo.ICallback> r0 = r5.f79131a     // Catch:{ Throwable -> 0x0133 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ Throwable -> 0x0133 }
            com.taobao.agoo.ICallback r0 = (com.taobao.agoo.ICallback) r0     // Catch:{ Throwable -> 0x0133 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r8 != r1) goto L_0x0118
            java.lang.String r8 = new java.lang.String     // Catch:{ Throwable -> 0x0133 }
            java.lang.String r1 = "utf-8"
            r8.<init>(r9, r1)     // Catch:{ Throwable -> 0x0133 }
            java.lang.String r9 = "RequestListener"
            java.lang.String r1 = "RequestListener onResponse"
            r2 = 6
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x0133 }
            java.lang.String r3 = "dataId"
            r2[r10] = r3     // Catch:{ Throwable -> 0x0133 }
            r3 = 1
            r2[r3] = r7     // Catch:{ Throwable -> 0x0133 }
            r3 = 2
            java.lang.String r4 = "listener"
            r2[r3] = r4     // Catch:{ Throwable -> 0x0133 }
            r3 = 3
            r2[r3] = r0     // Catch:{ Throwable -> 0x0133 }
            r3 = 4
            java.lang.String r4 = "json"
            r2[r3] = r4     // Catch:{ Throwable -> 0x0133 }
            r3 = 5
            r2[r3] = r8     // Catch:{ Throwable -> 0x0133 }
            com.taobao.accs.utl.ALog.i(r9, r1, r2)     // Catch:{ Throwable -> 0x0133 }
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0133 }
            r9.<init>(r8)     // Catch:{ Throwable -> 0x0133 }
            java.lang.String r8 = "resultCode"
            r1 = 0
            java.lang.String r8 = com.taobao.accs.utl.d.a(r9, r8, r1)     // Catch:{ Throwable -> 0x0133 }
            java.lang.String r2 = "cmd"
            java.lang.String r2 = com.taobao.accs.utl.d.a(r9, r2, r1)     // Catch:{ Throwable -> 0x0133 }
            java.lang.String r3 = "success"
            boolean r3 = r3.equals(r8)     // Catch:{ Throwable -> 0x0133 }
            if (r3 != 0) goto L_0x0070
            if (r0 == 0) goto L_0x0062
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Throwable -> 0x0133 }
            java.lang.String r9 = "agoo server error"
            r0.onFailure(r8, r9)     // Catch:{ Throwable -> 0x0133 }
        L_0x0062:
            java.lang.String r8 = "AgooDeviceCmd"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x006f
            java.util.Map<java.lang.String, com.taobao.agoo.ICallback> r6 = r5.f79131a
            r6.remove(r7)
        L_0x006f:
            return
        L_0x0070:
            java.lang.String r8 = "register"
            boolean r8 = r8.equals(r2)     // Catch:{ Throwable -> 0x0133 }
            if (r8 == 0) goto L_0x00c2
            java.lang.String r8 = "deviceId"
            java.lang.String r8 = com.taobao.accs.utl.d.a(r9, r8, r1)     // Catch:{ Throwable -> 0x0133 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Throwable -> 0x0133 }
            if (r9 == 0) goto L_0x008e
            if (r0 == 0) goto L_0x00b4
            java.lang.String r8 = ""
            java.lang.String r9 = "agoo server error deviceid null"
            r0.onFailure(r8, r9)     // Catch:{ Throwable -> 0x0133 }
            goto L_0x00b4
        L_0x008e:
            android.content.Context r9 = com.taobao.accs.client.GlobalClientInfo.getContext()     // Catch:{ Throwable -> 0x0133 }
            org.android.agoo.common.Config.a((android.content.Context) r9, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0133 }
            com.taobao.agoo.a.a r9 = f79130b     // Catch:{ Throwable -> 0x0133 }
            android.content.Context r1 = com.taobao.accs.client.GlobalClientInfo.getContext()     // Catch:{ Throwable -> 0x0133 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ Throwable -> 0x0133 }
            r9.a(r1)     // Catch:{ Throwable -> 0x0133 }
            boolean r9 = r0 instanceof com.taobao.agoo.IRegister     // Catch:{ Throwable -> 0x0133 }
            if (r9 == 0) goto L_0x00b4
            java.lang.String r9 = "Agoo_AppStore"
            android.content.Context r1 = com.taobao.accs.client.GlobalClientInfo.getContext()     // Catch:{ Throwable -> 0x0133 }
            com.taobao.accs.utl.UtilityImpl.b((java.lang.String) r9, (android.content.Context) r1)     // Catch:{ Throwable -> 0x0133 }
            com.taobao.agoo.IRegister r0 = (com.taobao.agoo.IRegister) r0     // Catch:{ Throwable -> 0x0133 }
            r0.onSuccess(r8)     // Catch:{ Throwable -> 0x0133 }
        L_0x00b4:
            java.lang.String r8 = "AgooDeviceCmd"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x00c1
            java.util.Map<java.lang.String, com.taobao.agoo.ICallback> r6 = r5.f79131a
            r6.remove(r7)
        L_0x00c1:
            return
        L_0x00c2:
            java.lang.String r8 = "setAlias"
            boolean r8 = r8.equals(r2)     // Catch:{ Throwable -> 0x0133 }
            if (r8 == 0) goto L_0x00db
            r5.a(r9, r0)     // Catch:{ Throwable -> 0x0133 }
            java.lang.String r8 = "AgooDeviceCmd"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x00da
            java.util.Map<java.lang.String, com.taobao.agoo.ICallback> r6 = r5.f79131a
            r6.remove(r7)
        L_0x00da:
            return
        L_0x00db:
            java.lang.String r8 = "removeAlias"
            boolean r8 = r8.equals(r2)     // Catch:{ Throwable -> 0x0133 }
            if (r8 == 0) goto L_0x0102
            android.content.Context r8 = com.taobao.accs.client.GlobalClientInfo.getContext()     // Catch:{ Throwable -> 0x0133 }
            org.android.agoo.common.Config.b((android.content.Context) r8, (java.lang.String) r1)     // Catch:{ Throwable -> 0x0133 }
            if (r0 == 0) goto L_0x00ef
            r0.onSuccess()     // Catch:{ Throwable -> 0x0133 }
        L_0x00ef:
            com.taobao.agoo.a.a r8 = f79130b     // Catch:{ Throwable -> 0x0133 }
            r8.a()     // Catch:{ Throwable -> 0x0133 }
            java.lang.String r8 = "AgooDeviceCmd"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0101
            java.util.Map<java.lang.String, com.taobao.agoo.ICallback> r6 = r5.f79131a
            r6.remove(r7)
        L_0x0101:
            return
        L_0x0102:
            java.lang.String r8 = "enablePush"
            boolean r8 = r8.equals(r2)     // Catch:{ Throwable -> 0x0133 }
            if (r8 != 0) goto L_0x0112
            java.lang.String r8 = "disablePush"
            boolean r8 = r8.equals(r2)     // Catch:{ Throwable -> 0x0133 }
            if (r8 == 0) goto L_0x0123
        L_0x0112:
            if (r0 == 0) goto L_0x0123
            r0.onSuccess()     // Catch:{ Throwable -> 0x0133 }
            goto L_0x0123
        L_0x0118:
            if (r0 == 0) goto L_0x0123
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Throwable -> 0x0133 }
            java.lang.String r9 = "accs channel error"
            r0.onFailure(r8, r9)     // Catch:{ Throwable -> 0x0133 }
        L_0x0123:
            java.lang.String r8 = "AgooDeviceCmd"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0146
        L_0x012b:
            java.util.Map<java.lang.String, com.taobao.agoo.ICallback> r6 = r5.f79131a
            r6.remove(r7)
            return
        L_0x0131:
            r8 = move-exception
            goto L_0x0147
        L_0x0133:
            r8 = move-exception
            java.lang.String r9 = "RequestListener"
            java.lang.String r0 = "onResponse"
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x0131 }
            com.taobao.accs.utl.ALog.e(r9, r0, r8, r10)     // Catch:{ all -> 0x0131 }
            java.lang.String r8 = "AgooDeviceCmd"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0146
            goto L_0x012b
        L_0x0146:
            return
        L_0x0147:
            java.lang.String r9 = "AgooDeviceCmd"
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L_0x0154
            java.util.Map<java.lang.String, com.taobao.agoo.ICallback> r6 = r5.f79131a
            r6.remove(r7)
        L_0x0154:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.agoo.a.b.onResponse(java.lang.String, java.lang.String, int, byte[], com.taobao.accs.base.TaoBaseService$ExtraInfo):void");
    }
}
