package com.umeng.message.inapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.ss.android.ugc.aweme.utils.eq;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.PushAgent;
import com.umeng.message.common.UmengMessageDeviceConfig;
import com.umeng.message.entity.UInAppMessage;
import com.umeng.message.inapp.UImageLoadTask;
import java.io.ByteArrayOutputStream;
import java.util.Calendar;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;
import org.json.JSONArray;
import org.json.JSONException;

public final class b implements IUmengInAppMessageCallback, UImageLoadTask.ImageLoaderCallback {

    /* renamed from: a  reason: collision with root package name */
    private static final String f81234a = "com.umeng.message.inapp.b";

    /* renamed from: b  reason: collision with root package name */
    private Context f81235b;

    /* renamed from: c  reason: collision with root package name */
    private String f81236c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f81237d;

    /* renamed from: e  reason: collision with root package name */
    private UInAppMessage f81238e;
    private IUmengInAppMsgCloseCallback g;

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
            if (Build.VERSION.SDK_INT == 25) {
                eq.a(toast);
            }
            toast.show();
        }
    }

    public final void onSplashMessage(UInAppMessage uInAppMessage) {
    }

    private void b() {
        try {
            UmengCardMessage umengCardMessage = new UmengCardMessage();
            umengCardMessage.a(this.g);
            Bundle bundle = new Bundle();
            bundle.putString("label", this.f81236c);
            bundle.putString("msg", this.f81238e.getRaw().toString());
            umengCardMessage.setArguments(bundle);
            umengCardMessage.show(((Activity) this.f81235b).getFragmentManager(), this.f81236c);
            InAppMessageManager.getInstance(this.f81235b).a(this.f81238e.msg_id, 1);
            InAppMessageManager.getInstance(this.f81235b).f(this.f81236c);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (TextUtils.isEmpty(this.f81236c.trim())) {
            if (PushAgent.DEBUG) {
                _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(this.f81235b, "插屏消息的标签不能为空", 1));
            }
            UMLog.mutlInfo(f81234a, 0, "插屏消息的标签不能为空");
        } else if (!a(this.f81236c)) {
            UMLog.mutlInfo(f81234a, 0, "插屏消息的最大标签数为 10");
        } else if (InAppMessageManager.f81176a) {
            d.a(this.f81235b).a(this.f81236c, this);
        } else if (System.currentTimeMillis() - InAppMessageManager.getInstance(this.f81235b).b(this.f81236c) > ((long) InAppMessageManager.f81177b)) {
            d.a(this.f81235b).a(this.f81236c, this);
        } else {
            onCardMessage(null);
        }
    }

    public final void onLoadImage(Bitmap[] bitmapArr) {
        if (!this.f81237d) {
            a(bitmapArr[0]);
        }
        InAppMessageManager.getInstance(this.f81235b).a(this.f81238e, this.f81236c);
    }

    private boolean b(String str) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(InAppMessageManager.getInstance(this.f81235b).g(str));
        Calendar instance2 = Calendar.getInstance();
        if (instance.get(6) == instance2.get(6) && instance.get(1) == instance2.get(1)) {
            return true;
        }
        return false;
    }

    private void a(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                UmengCardMessage umengCardMessage = new UmengCardMessage();
                umengCardMessage.a(this.g);
                Bundle bundle = new Bundle();
                bundle.putString("label", this.f81236c);
                bundle.putString("msg", this.f81238e.getRaw().toString());
                bundle.putByteArray("bitmapByte", byteArray);
                umengCardMessage.setArguments(bundle);
                umengCardMessage.show(((Activity) this.f81235b).getFragmentManager(), this.f81236c);
                InAppMessageManager.getInstance(this.f81235b).a(this.f81238e.msg_id, 1);
                InAppMessageManager.getInstance(this.f81235b).f(this.f81236c);
            } catch (Exception unused) {
            }
        }
    }

    private boolean a(String str) {
        if (!UmengMessageDeviceConfig.getAppVersionCode(this.f81235b).equals(InAppMessageManager.getInstance(this.f81235b).g())) {
            InAppMessageManager.getInstance(this.f81235b).d("");
        }
        InAppMessageManager.getInstance(this.f81235b).e(UmengMessageDeviceConfig.getAppVersionCode(this.f81235b));
        String f2 = InAppMessageManager.getInstance(this.f81235b).f();
        JSONArray jSONArray = null;
        if (!TextUtils.isEmpty(f2)) {
            try {
                jSONArray = new JSONArray(f2);
            } catch (JSONException unused) {
            }
        }
        if (jSONArray == null) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(str);
            InAppMessageManager.getInstance(this.f81235b).d(jSONArray2.toString());
            return true;
        } else if (a(jSONArray, str)) {
            return true;
        } else {
            if (jSONArray.length() >= 10) {
                return false;
            }
            jSONArray.put(str);
            InAppMessageManager.getInstance(this.f81235b).d(jSONArray.toString());
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCardMessage(com.umeng.message.entity.UInAppMessage r5) {
        /*
            r4 = this;
            android.content.Context r0 = r4.f81235b
            com.umeng.message.inapp.InAppMessageManager r0 = com.umeng.message.inapp.InAppMessageManager.getInstance(r0)
            java.lang.String r1 = r4.f81236c
            java.lang.String r0 = r0.c((java.lang.String) r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x001d
            com.umeng.message.entity.UInAppMessage r1 = new com.umeng.message.entity.UInAppMessage     // Catch:{ JSONException -> 0x001d }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x001d }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x001d }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x001d }
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            if (r5 == 0) goto L_0x0045
            if (r1 == 0) goto L_0x0042
            java.lang.String r0 = r5.msg_id
            java.lang.String r2 = r1.msg_id
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0042
            java.io.File r0 = new java.io.File
            android.content.Context r2 = r4.f81235b
            java.lang.String r1 = r1.msg_id
            java.lang.String r1 = com.umeng.message.proguard.h.d(r2, r1)
            r0.<init>(r1)
            android.content.Context r1 = r4.f81235b
            com.umeng.message.inapp.InAppMessageManager r1 = com.umeng.message.inapp.InAppMessageManager.getInstance(r1)
            r1.a((java.io.File) r0)
        L_0x0042:
            r4.f81238e = r5
            goto L_0x0049
        L_0x0045:
            if (r1 == 0) goto L_0x00bc
            r4.f81238e = r1
        L_0x0049:
            com.umeng.message.entity.UInAppMessage r5 = r4.f81238e
            int r5 = r5.show_type
            r0 = 0
            r1 = 1
            if (r5 != r1) goto L_0x0066
            java.lang.String r5 = r4.f81236c
            boolean r5 = r4.b(r5)
            if (r5 != 0) goto L_0x0066
            android.content.Context r5 = r4.f81235b
            com.umeng.message.inapp.InAppMessageManager r5 = com.umeng.message.inapp.InAppMessageManager.getInstance(r5)
            com.umeng.message.entity.UInAppMessage r2 = r4.f81238e
            java.lang.String r2 = r2.msg_id
            r5.a((java.lang.String) r2, (int) r0)
        L_0x0066:
            android.content.Context r5 = r4.f81235b
            com.umeng.message.inapp.InAppMessageManager r5 = com.umeng.message.inapp.InAppMessageManager.getInstance(r5)
            com.umeng.message.entity.UInAppMessage r2 = r4.f81238e
            boolean r5 = r5.b((com.umeng.message.entity.UInAppMessage) r2)
            if (r5 == 0) goto L_0x00bb
            android.content.Context r5 = r4.f81235b
            com.umeng.message.inapp.InAppMessageManager r5 = com.umeng.message.inapp.InAppMessageManager.getInstance(r5)
            com.umeng.message.entity.UInAppMessage r2 = r4.f81238e
            boolean r5 = r5.c((com.umeng.message.entity.UInAppMessage) r2)
            if (r5 != 0) goto L_0x0083
            goto L_0x00bb
        L_0x0083:
            com.umeng.message.entity.UInAppMessage r5 = r4.f81238e
            int r5 = r5.msg_type
            r2 = 5
            if (r5 == r2) goto L_0x00aa
            com.umeng.message.entity.UInAppMessage r5 = r4.f81238e
            int r5 = r5.msg_type
            r2 = 6
            if (r5 != r2) goto L_0x0092
            goto L_0x00aa
        L_0x0092:
            com.umeng.message.inapp.UImageLoadTask r5 = new com.umeng.message.inapp.UImageLoadTask
            android.content.Context r2 = r4.f81235b
            com.umeng.message.entity.UInAppMessage r3 = r4.f81238e
            r5.<init>(r2, r3)
            r5.a((com.umeng.message.inapp.UImageLoadTask.ImageLoaderCallback) r4)
            java.lang.String[] r1 = new java.lang.String[r1]
            com.umeng.message.entity.UInAppMessage r2 = r4.f81238e
            java.lang.String r2 = r2.image_url
            r1[r0] = r2
            r5.execute(r1)
            return
        L_0x00aa:
            android.content.Context r5 = r4.f81235b
            com.umeng.message.inapp.InAppMessageManager r5 = com.umeng.message.inapp.InAppMessageManager.getInstance(r5)
            com.umeng.message.entity.UInAppMessage r0 = r4.f81238e
            java.lang.String r1 = r4.f81236c
            r5.a((com.umeng.message.entity.UInAppMessage) r0, (java.lang.String) r1)
            r4.b()
            return
        L_0x00bb:
            return
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.inapp.b.onCardMessage(com.umeng.message.entity.UInAppMessage):void");
    }

    public b(Context context, String str) {
        this.f81235b = context.getApplicationContext();
        this.f81236c = str;
        this.f81237d = true;
    }

    private boolean a(JSONArray jSONArray, String str) {
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                if (jSONArray.getString(i).equals(str)) {
                    return true;
                }
                i++;
            } catch (JSONException unused) {
            }
        }
        return false;
    }

    public b(Activity activity, String str, IUmengInAppMsgCloseCallback iUmengInAppMsgCloseCallback) {
        this.f81235b = activity;
        this.f81236c = str;
        this.g = iUmengInAppMsgCloseCallback;
    }
}
