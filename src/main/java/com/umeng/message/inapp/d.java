package com.umeng.message.inapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.MsgConstant;
import com.umeng.message.UTrack;
import com.umeng.message.common.impl.json.JUtrack;
import com.umeng.message.entity.UInAppMessage;
import com.umeng.message.proguard.h;
import java.io.File;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f81246a = "com.umeng.message.inapp.d";
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static boolean f81247c;
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d  reason: collision with root package name */
    private static d f81248d;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Context f81249b;

    /* access modifiers changed from: private */
    public JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("header", UTrack.getInstance(this.f81249b).getHeader());
        if (InAppMessageManager.f81176a) {
            jSONObject.put("pmode", PushConstants.PUSH_TYPE_NOTIFY);
        } else {
            jSONObject.put("pmode", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        }
        return jSONObject;
    }

    private void c() {
        if (f81247c) {
            UMLog.mutlInfo(f81246a, 2, "sendInAppCacheLog已经在队列里，忽略该请求");
            return;
        }
        f81247c = true;
        UMLog.mutlInfo(f81246a, 2, "sendInAppCacheLog开始");
        com.umeng.message.common.d.a(new Runnable() {
            public void run() {
                try {
                    Iterator it2 = InAppMessageManager.getInstance(d.this.f81249b).j().iterator();
                    while (it2.hasNext()) {
                        a aVar = (a) it2.next();
                        JSONObject a2 = d.this.b(aVar.f81229b, aVar.f81230c, aVar.f81231d, aVar.f81232e, aVar.f81233f, aVar.g, aVar.h, aVar.i, aVar.j);
                        if (a2 != null && TextUtils.equals(a2.getString("success"), "ok")) {
                            InAppMessageManager.getInstance(d.this.f81249b).h(aVar.f81229b);
                        }
                    }
                } catch (Exception unused) {
                } finally {
                    boolean unused2 = d.f81247c = false;
                }
            }
        });
    }

    private d(Context context) {
        this.f81249b = context.getApplicationContext();
    }

    public static d a(Context context) {
        if (f81248d == null) {
            synchronized (d.class) {
                if (f81248d == null) {
                    f81248d = new d(context.getApplicationContext());
                }
            }
        }
        return f81248d;
    }

    /* access modifiers changed from: package-private */
    public void a(final IUmengInAppMessageCallback iUmengInAppMessageCallback) {
        c();
        com.umeng.message.common.d.a(new Runnable() {
            public void run() {
                UInAppMessage uInAppMessage;
                UMLog.mutlInfo(d.f81246a, 2, "get splash message begin");
                try {
                    JSONObject sendRequest = JUtrack.sendRequest(d.this.b(), MsgConstant.SPLASH_MSG_ENDPOINT);
                    if (sendRequest != null && TextUtils.equals(sendRequest.getString("success"), "ok")) {
                        UMLog.mutlInfo(d.f81246a, 2, "get splash message success" + sendRequest);
                        JSONObject jSONObject = sendRequest.getJSONObject("data");
                        InAppMessageManager.f81177b = jSONObject.getInt("pduration") * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                        InAppMessageManager.f81178c = jSONObject.getInt("sduration") * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                        iUmengInAppMessageCallback.onSplashMessage(new UInAppMessage(jSONObject.getJSONObject("launch")));
                        InAppMessageManager.getInstance(d.this.f81249b).c();
                    } else if (sendRequest == null || !TextUtils.equals(sendRequest.getString("success"), "fail") || !TextUtils.equals(sendRequest.getString("error"), "no message")) {
                        iUmengInAppMessageCallback.onSplashMessage(null);
                    } else {
                        String e2 = InAppMessageManager.getInstance(d.this.f81249b).e();
                        if (!TextUtils.isEmpty(e2)) {
                            try {
                                uInAppMessage = new UInAppMessage(new JSONObject(e2));
                            } catch (JSONException unused) {
                                uInAppMessage = null;
                            }
                            if (uInAppMessage != null) {
                                InAppMessageManager.getInstance(d.this.f81249b).a(new File(h.d(d.this.f81249b, uInAppMessage.msg_id)));
                                InAppMessageManager.getInstance(d.this.f81249b).a((UInAppMessage) null);
                            }
                        }
                    }
                } catch (Exception unused2) {
                    iUmengInAppMessageCallback.onSplashMessage(null);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void a(final String str, final IUmengInAppMessageCallback iUmengInAppMessageCallback) {
        c();
        com.umeng.message.common.d.a(new Runnable() {
            public void run() {
                UInAppMessage uInAppMessage;
                UMLog.mutlInfo(d.f81246a, 2, "get card message begin");
                try {
                    JSONObject a2 = d.this.b();
                    a2.put("label", str);
                    JSONObject sendRequest = JUtrack.sendRequest(a2, MsgConstant.CARD_MSG_ENDPOINT);
                    if (sendRequest != null && TextUtils.equals(sendRequest.getString("success"), "ok")) {
                        UMLog.mutlInfo(d.f81246a, 2, "get card message success" + sendRequest);
                        JSONObject jSONObject = sendRequest.getJSONObject("data");
                        InAppMessageManager.f81177b = jSONObject.getInt("pduration") * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                        InAppMessageManager.f81178c = jSONObject.getInt("sduration") * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                        iUmengInAppMessageCallback.onCardMessage(new UInAppMessage(jSONObject.getJSONObject("card")));
                        InAppMessageManager.getInstance(d.this.f81249b).a(a2.optString("label", ""));
                    } else if (sendRequest == null || !TextUtils.equals(sendRequest.getString("success"), "fail") || !TextUtils.equals(sendRequest.getString("error"), "no message")) {
                        iUmengInAppMessageCallback.onCardMessage(null);
                    } else {
                        String c2 = InAppMessageManager.getInstance(d.this.f81249b).c(str);
                        if (!TextUtils.isEmpty(c2)) {
                            try {
                                uInAppMessage = new UInAppMessage(new JSONObject(c2));
                            } catch (JSONException unused) {
                                uInAppMessage = null;
                            }
                            if (uInAppMessage != null) {
                                InAppMessageManager.getInstance(d.this.f81249b).a(new File(h.d(d.this.f81249b, uInAppMessage.msg_id)));
                                InAppMessageManager.getInstance(d.this.f81249b).a((UInAppMessage) null, str);
                            }
                        }
                    }
                } catch (Exception unused2) {
                    iUmengInAppMessageCallback.onCardMessage(null);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public JSONObject b(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("header", UTrack.getInstance(this.f81249b).getHeader());
        jSONObject.put("msg_id", str);
        jSONObject.put("msg_type", i);
        jSONObject.put("num_display", i2);
        jSONObject.put("num_open_full", i3);
        jSONObject.put("num_open_top", i4);
        jSONObject.put("num_open_bottom", i5);
        jSONObject.put("num_close", i6);
        jSONObject.put("num_duration", i7);
        jSONObject.put("num_custom", i8);
        return JUtrack.sendRequest(jSONObject, MsgConstant.STATS_ENDPOINT);
    }

    /* access modifiers changed from: package-private */
    public void a(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        final String str2 = str;
        final int i9 = i;
        final int i10 = i2;
        final int i11 = i3;
        final int i12 = i4;
        final int i13 = i5;
        final int i14 = i6;
        final int i15 = i7;
        final int i16 = i8;
        AnonymousClass3 r0 = new Runnable() {
            public void run() {
                try {
                    UMLog.mutlInfo(d.f81246a, 2, "track in app msg begin");
                    JSONObject a2 = d.this.b(str2, i9, i10, i11, i12, i13, i14, i15, i16);
                    if (a2 != null && TextUtils.equals(a2.getString("success"), "ok")) {
                        UMLog.mutlInfo(d.f81246a, 2, "track in app msg success");
                    }
                } catch (Exception unused) {
                    InAppMessageManager.getInstance(d.this.f81249b).a(str2, i9, i10, i11, i12, i13, i14, i15, i16);
                }
            }
        };
        com.umeng.message.common.d.a(r0);
    }
}
