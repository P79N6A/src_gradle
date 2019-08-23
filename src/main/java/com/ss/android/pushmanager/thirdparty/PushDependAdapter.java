package com.ss.android.pushmanager.thirdparty;

import android.app.Service;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.concurrent.AsyncTaskUtils;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.common.utility.reflect.ReflectUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.pushmanager.app.c;
import com.ss.android.pushmanager.f;
import com.ss.android.pushmanager.h;
import com.ss.android.pushmanager.setting.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.zip.DataFormatException;
import org.json.JSONArray;
import org.json.JSONObject;

public class PushDependAdapter implements IPushDepend {
    public static PushDependAdapter INSTANCE = new PushDependAdapter();
    public static ChangeQuickRedirect changeQuickRedirect;

    public void loggerD(String str, String str2) {
    }

    public void setAdapter(IPushDepend iPushDepend) {
    }

    private PushDependAdapter() {
    }

    public static void inJect() throws Throwable {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 19273, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 19273, new Class[0], Void.TYPE);
            return;
        }
        Object invokeMethod = ReflectUtils.invokeMethod(Class.forName("com.ss.android.push.PushDependManager"), "inst", new Object[0]);
        if (invokeMethod instanceof IPushDepend) {
            ((IPushDepend) invokeMethod).setAdapter(INSTANCE);
        }
    }

    public boolean loggerDebug() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19275, new Class[0], Boolean.TYPE)) {
            return Logger.debug();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19275, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void executeAsyncTask(AsyncTask asyncTask) {
        AsyncTask asyncTask2 = asyncTask;
        if (PatchProxy.isSupport(new Object[]{asyncTask2}, this, changeQuickRedirect, false, 19274, new Class[]{AsyncTask.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{asyncTask2}, this, changeQuickRedirect, false, 19274, new Class[]{AsyncTask.class}, Void.TYPE);
            return;
        }
        AsyncTaskUtils.executeAsyncTask(asyncTask2, new Object[0]);
    }

    public void hackJobHandler(Service service) {
        if (PatchProxy.isSupport(new Object[]{service}, this, changeQuickRedirect, false, 19282, new Class[]{Service.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{service}, this, changeQuickRedirect, false, 19282, new Class[]{Service.class}, Void.TYPE);
            return;
        }
        c.a(service);
    }

    public void tryHookInit(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 19276, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 19276, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        f.a().a(context2);
    }

    public Pair<String, String> getPushConfig(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19279, new Class[]{Integer.TYPE}, Pair.class)) {
            return (Pair) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19279, new Class[]{Integer.TYPE}, Pair.class);
        } else if (i2 == 1) {
            return f.a().b();
        } else {
            if (i2 == 8) {
                return f.a().c();
            }
            if (i2 == 10) {
                return f.a().d();
            }
            return null;
        }
    }

    public boolean isAllowPushService(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19277, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return h.a(i);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19277, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public List<String> getWakeupBlacklistPkg(Context context) {
        String str;
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 19290, new Class[]{Context.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 19290, new Class[]{Context.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        try {
            b a2 = b.a();
            if (PatchProxy.isSupport(new Object[0], a2, b.f2543a, false, 19233, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], a2, b.f2543a, false, 19233, new Class[0], String.class);
            } else {
                str = a2.f2546c.a("wakeup_black_list_package", "");
            }
            if (TextUtils.isEmpty(str)) {
                return arrayList;
            }
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.optString(i));
            }
            return arrayList;
        } catch (Exception unused) {
        }
    }

    public JSONObject getMessage(byte[] bArr, boolean z) throws DataFormatException, IOException {
        if (!PatchProxy.isSupport(new Object[]{bArr, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 19278, new Class[]{byte[].class, Boolean.TYPE}, JSONObject.class)) {
            return com.ss.android.pushmanager.app.f.a(bArr, z);
        }
        return (JSONObject) PatchProxy.accessDispatch(new Object[]{bArr, Byte.valueOf(z)}, this, changeQuickRedirect, false, 19278, new Class[]{byte[].class, Boolean.TYPE}, JSONObject.class);
    }

    public void saveMapToProvider(Context context, Map<String, ?> map) {
        Map<String, ?> map2 = map;
        if (PatchProxy.isSupport(new Object[]{context, map2}, this, changeQuickRedirect, false, 19289, new Class[]{Context.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, map2}, this, changeQuickRedirect, false, 19289, new Class[]{Context.class, Map.class}, Void.TYPE);
            return;
        }
        b.a().b(map2);
    }

    public String getToken(Context context, int i) {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19281, new Class[]{Context.class, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19281, new Class[]{Context.class, Integer.TYPE}, String.class);
        }
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, b.f30591a, true, 19304, new Class[]{Integer.TYPE}, String.class)) {
            return b.a().a(b.a(i), "");
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, b.f30591a, true, 19304, new Class[]{Integer.TYPE}, String.class);
    }

    public void sendToken(Context context, ISendTokenCallBack iSendTokenCallBack) {
        Context context2 = context;
        ISendTokenCallBack iSendTokenCallBack2 = iSendTokenCallBack;
        if (PatchProxy.isSupport(new Object[]{context2, iSendTokenCallBack2}, this, changeQuickRedirect, false, 19280, new Class[]{Context.class, ISendTokenCallBack.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, iSendTokenCallBack2}, this, changeQuickRedirect, false, 19280, new Class[]{Context.class, ISendTokenCallBack.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{context2, iSendTokenCallBack2}, null, b.f30591a, true, 19303, new Class[]{Context.class, ISendTokenCallBack.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, iSendTokenCallBack2}, null, b.f30591a, true, 19303, new Class[]{Context.class, ISendTokenCallBack.class}, Void.TYPE);
            return;
        }
        b bVar = new b(context2, iSendTokenCallBack2);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ThreadPlus.submitRunnable(bVar);
        } else {
            bVar.run();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:15|16|(1:18)(3:19|(2:21|(1:23)(1:24))|25)|26|(2:28|29)|30|31|32) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x016f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNotificationArrived(android.content.Context r20, org.json.JSONObject r21) {
        /*
            r19 = this;
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r20
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<org.json.JSONObject> r4 = org.json.JSONObject.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 19284(0x4b54, float:2.7023E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0043
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r20
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = changeQuickRedirect
            r15 = 0
            r16 = 19284(0x4b54, float:2.7023E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0043:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r10] = r20
            r3[r11] = r1
            r4 = 0
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.message.f.f30003a
            r6 = 1
            r7 = 17842(0x45b2, float:2.5002E-41)
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            r8[r10] = r9
            java.lang.Class<org.json.JSONObject> r9 = org.json.JSONObject.class
            r8[r11] = r9
            java.lang.Class r9 = java.lang.Void.TYPE
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x007f
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r20
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.message.f.f30003a
            r15 = 1
            r16 = 17842(0x45b2, float:2.5002E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x007f:
            if (r20 == 0) goto L_0x0174
            if (r1 != 0) goto L_0x0085
            goto L_0x0174
        L_0x0085:
            com.ss.android.pushmanager.setting.b r0 = com.ss.android.pushmanager.setting.b.a()
            java.lang.Object[] r2 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.pushmanager.setting.b.f2543a
            r5 = 0
            r6 = 19241(0x4b29, float:2.6962E-41)
            java.lang.Class[] r7 = new java.lang.Class[r10]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r0
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x00b2
            java.lang.Object[] r2 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.pushmanager.setting.b.f2543a
            r5 = 0
            r6 = 19241(0x4b29, float:2.6962E-41)
            java.lang.Class[] r7 = new java.lang.Class[r10]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x00ba
        L_0x00b2:
            com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$b r0 = r0.f2546c
            java.lang.String r2 = "is_send_mz_message_receiver_data"
            boolean r0 = r0.a((java.lang.String) r2, (boolean) r10)
        L_0x00ba:
            if (r0 == 0) goto L_0x0173
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0173 }
            r0.<init>()     // Catch:{ Throwable -> 0x0173 }
            java.lang.String r2 = "id"
            java.lang.String r3 = "id"
            int r1 = r1.optInt(r3, r10)     // Catch:{ Throwable -> 0x0173 }
            long r3 = (long) r1     // Catch:{ Throwable -> 0x0173 }
            r0.put(r2, r3)     // Catch:{ Throwable -> 0x0173 }
            java.lang.String r1 = "did"
            com.ss.android.pushmanager.setting.b r2 = com.ss.android.pushmanager.setting.b.a()     // Catch:{ Throwable -> 0x0173 }
            java.lang.String r2 = r2.n()     // Catch:{ Throwable -> 0x0173 }
            long r2 = java.lang.Long.parseLong(r2)     // Catch:{ Throwable -> 0x0173 }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x0173 }
            java.lang.String r1 = "code"
            r0.put(r1, r10)     // Catch:{ Throwable -> 0x0173 }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x0173 }
            java.lang.String r1 = "UTF-8"
            byte[] r0 = r0.getBytes(r1)     // Catch:{ Throwable -> 0x0173 }
            com.ss.android.pushmanager.app.e r1 = com.ss.android.pushmanager.app.e.a()     // Catch:{ Throwable -> 0x0173 }
            java.util.Map r1 = r1.c()     // Catch:{ Throwable -> 0x0173 }
            java.lang.Object[] r2 = new java.lang.Object[r10]     // Catch:{ Throwable -> 0x0173 }
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.pushmanager.f.f2537a     // Catch:{ Throwable -> 0x0173 }
            r5 = 1
            r6 = 18939(0x49fb, float:2.6539E-41)
            java.lang.Class[] r7 = new java.lang.Class[r10]     // Catch:{ Throwable -> 0x0173 }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x0173 }
            if (r2 == 0) goto L_0x011a
            java.lang.Object[] r3 = new java.lang.Object[r10]     // Catch:{ Throwable -> 0x0173 }
            r4 = 0
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.pushmanager.f.f2537a     // Catch:{ Throwable -> 0x0173 }
            r6 = 1
            r7 = 18939(0x49fb, float:2.6539E-41)
            java.lang.Class[] r8 = new java.lang.Class[r10]     // Catch:{ Throwable -> 0x0173 }
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x0173 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x0173 }
            goto L_0x013a
        L_0x011a:
            com.ss.android.pushmanager.b r2 = com.ss.android.pushmanager.f.k     // Catch:{ Throwable -> 0x0173 }
            if (r2 == 0) goto L_0x0138
            com.ss.android.pushmanager.b r2 = com.ss.android.pushmanager.f.k     // Catch:{ Throwable -> 0x0173 }
            java.lang.String r2 = r2.a()     // Catch:{ Throwable -> 0x0173 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x0173 }
            if (r2 == 0) goto L_0x012b
            goto L_0x0138
        L_0x012b:
            com.ss.android.pushmanager.b r2 = com.ss.android.pushmanager.f.k     // Catch:{ Throwable -> 0x0173 }
            java.lang.String r2 = r2.a()     // Catch:{ Throwable -> 0x0173 }
            java.lang.String r3 = "/cloudpush/callback/meizu/"
            java.lang.String r2 = com.ss.android.pushmanager.f.a(r2, r3)     // Catch:{ Throwable -> 0x0173 }
            goto L_0x013a
        L_0x0138:
            java.lang.String r2 = com.ss.android.pushmanager.f.f2542f     // Catch:{ Throwable -> 0x0173 }
        L_0x013a:
            java.lang.String r1 = com.ss.android.message.b.k.a((java.lang.String) r2, (java.util.Map<java.lang.String, java.lang.String>) r1)     // Catch:{ Throwable -> 0x0173 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Throwable -> 0x0173 }
            r2.<init>()     // Catch:{ Throwable -> 0x0173 }
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/json; charset=utf-8"
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x0173 }
            com.bytedance.common.utility.NetworkClient$ReqContext r3 = new com.bytedance.common.utility.NetworkClient$ReqContext     // Catch:{ Throwable -> 0x0173 }
            r3.<init>()     // Catch:{ Throwable -> 0x0173 }
            r3.addCommonParams = r11     // Catch:{ Throwable -> 0x0173 }
            com.bytedance.common.utility.NetworkClient r4 = com.bytedance.common.utility.NetworkClient.getDefault()     // Catch:{ Throwable -> 0x0173 }
            java.lang.String r0 = r4.post((java.lang.String) r1, (byte[]) r0, (java.util.Map<java.lang.String, java.lang.String>) r2, (com.bytedance.common.utility.NetworkClient.ReqContext) r3)     // Catch:{ Throwable -> 0x0173 }
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x0173 }
            if (r1 != 0) goto L_0x016f
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x016f }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x016f }
            java.lang.String r0 = "success"
            java.lang.String r2 = "reason"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ JSONException -> 0x016f }
            r0.equals(r1)     // Catch:{ JSONException -> 0x016f }
        L_0x016f:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0173 }
            return
        L_0x0173:
            return
        L_0x0174:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.pushmanager.thirdparty.PushDependAdapter.onNotificationArrived(android.content.Context, org.json.JSONObject):void");
    }

    public String getProviderString(Context context, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (!PatchProxy.isSupport(new Object[]{context, str3, str4}, this, changeQuickRedirect, false, 19287, new Class[]{Context.class, String.class, String.class}, String.class)) {
            return b.a().a(str3, str4);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{context, str3, str4}, this, changeQuickRedirect, false, 19287, new Class[]{Context.class, String.class, String.class}, String.class);
    }

    public void sendMonitor(Context context, String str, JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{context, str, jSONObject}, this, changeQuickRedirect, false, 19283, new Class[]{Context.class, String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, jSONObject}, this, changeQuickRedirect, false, 19283, new Class[]{Context.class, String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        f.a();
    }

    public Boolean getProviderBoolean(Context context, String str, Boolean bool) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2, bool}, this, changeQuickRedirect, false, 19288, new Class[]{Context.class, String.class, Boolean.class}, Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[]{context, str2, bool}, this, changeQuickRedirect, false, 19288, new Class[]{Context.class, String.class, Boolean.class}, Boolean.class);
        }
        b a2 = b.a();
        if (!PatchProxy.isSupport(new Object[]{str2, bool}, a2, b.f2543a, false, 19270, new Class[]{String.class, Boolean.class}, Boolean.class)) {
            return Boolean.valueOf(a2.f2546c.a(str2, bool.booleanValue()));
        }
        return (Boolean) PatchProxy.accessDispatch(new Object[]{str2, bool}, a2, b.f2543a, false, 19270, new Class[]{String.class, Boolean.class}, Boolean.class);
    }

    public int getProviderInt(Context context, String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19285, new Class[]{Context.class, String.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context, str2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19285, new Class[]{Context.class, String.class, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        b a2 = b.a();
        if (!PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, a2, b.f2543a, false, 19267, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)) {
            return a2.f2546c.a(str2, i);
        }
        Object[] objArr = {str2, Integer.valueOf(i)};
        return ((Integer) PatchProxy.accessDispatch(objArr, a2, b.f2543a, false, 19267, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public long getProviderLong(Context context, String str, long j) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context, str2, new Long(j2)}, this, changeQuickRedirect, false, 19286, new Class[]{Context.class, String.class, Long.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{context, str2, new Long(j2)}, this, changeQuickRedirect, false, 19286, new Class[]{Context.class, String.class, Long.TYPE}, Long.TYPE)).longValue();
        }
        b a2 = b.a();
        if (!PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, a2, b.f2543a, false, 19268, new Class[]{String.class, Long.TYPE}, Long.TYPE)) {
            return a2.f2546c.a(str2, j2);
        }
        Object[] objArr = {str2, new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = b.f2543a;
        return ((Long) PatchProxy.accessDispatch(objArr, a2, changeQuickRedirect2, false, 19268, new Class[]{String.class, Long.TYPE}, Long.TYPE)).longValue();
    }

    public void onClickNotPassThroughNotification(Context context, int i, String str, int i2, String str2) {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i), str, Integer.valueOf(i2), str2}, this, changeQuickRedirect, false, 19292, new Class[]{Context.class, Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {context, Integer.valueOf(i), str, Integer.valueOf(i2), str2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 19292, new Class[]{Context.class, Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        f.a().a(context, i, str, i2, str2);
    }

    public void logEvent(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, str3, new Long(j3), new Long(j4), jSONObject}, this, changeQuickRedirect, false, 19291, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2, str3, new Long(j3), new Long(j4), jSONObject}, this, changeQuickRedirect, false, 19291, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        com.ss.android.message.log.c.a(context, str, str2, str3, j, j2, jSONObject);
    }
}
