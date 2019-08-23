package com.ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.host.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.sdk.activity.LiveDummyActivity;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.LiveBroadcastSigningActivity;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import java.util.Map;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53427a;

    public final void a(String str, String str2, Context context) {
        String str3 = str;
        String str4 = str2;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{str3, str4, context2}, this, f53427a, false, 55722, new Class[]{String.class, String.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, context2}, this, f53427a, false, 55722, new Class[]{String.class, String.class, Context.class}, Void.TYPE);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("hide_nav_bar", TextUtils.isEmpty(str2));
        bundle.putString(PushConstants.TITLE, str4);
        a(str3, bundle, context2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0099, code lost:
        if (r9.equals("//verify/acitivity") != false) goto L_0x00b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.content.Context r17, java.lang.String r18, android.os.Bundle r19) {
        /*
            r16 = this;
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = 3
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r12 = 0
            r0[r12] = r8
            r13 = 1
            r0[r13] = r9
            r14 = 2
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f53427a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r5[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 55726(0xd9ae, float:7.8089E-41)
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x005d
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            r0[r13] = r9
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f53427a
            r3 = 0
            r4 = 55726(0xd9ae, float:7.8089E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r5[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r16
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x005d:
            boolean r15 = r8 instanceof android.app.Activity
            if (r15 != 0) goto L_0x0062
            return r12
        L_0x0062:
            r0 = -1
            int r1 = r18.hashCode()
            switch(r1) {
                case -1863814380: goto L_0x00a6;
                case -1813849575: goto L_0x009c;
                case -570110082: goto L_0x0093;
                case -262720268: goto L_0x0089;
                case 337200928: goto L_0x007f;
                case 947267529: goto L_0x0075;
                case 1392218355: goto L_0x006b;
                default: goto L_0x006a;
            }
        L_0x006a:
            goto L_0x00b0
        L_0x006b:
            java.lang.String r1 = "//item"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00b0
            r11 = 4
            goto L_0x00b1
        L_0x0075:
            java.lang.String r1 = "//profile"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00b0
            r11 = 5
            goto L_0x00b1
        L_0x007f:
            java.lang.String r1 = "//chargeDeal"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00b0
            r11 = 0
            goto L_0x00b1
        L_0x0089:
            java.lang.String r1 = "//live/detail"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00b0
            r11 = 2
            goto L_0x00b1
        L_0x0093:
            java.lang.String r1 = "//verify/acitivity"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00b0
            goto L_0x00b1
        L_0x009c:
            java.lang.String r1 = "//webview"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00b0
            r11 = 6
            goto L_0x00b1
        L_0x00a6:
            java.lang.String r1 = "//report"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x00b0
            r11 = 1
            goto L_0x00b1
        L_0x00b0:
            r11 = -1
        L_0x00b1:
            switch(r11) {
                case 0: goto L_0x01ee;
                case 1: goto L_0x0128;
                case 2: goto L_0x011b;
                case 3: goto L_0x0116;
                case 4: goto L_0x00fd;
                case 5: goto L_0x00e4;
                case 6: goto L_0x00b6;
                default: goto L_0x00b4;
            }
        L_0x00b4:
            goto L_0x01fa
        L_0x00b6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "aweme://webview/?url="
            r0.append(r1)
            java.lang.String r1 = "bundle_open_url"
            java.lang.Object r1 = r10.get(r1)
            r0.append(r1)
            java.lang.String r1 = "title"
            boolean r1 = r10.containsKey(r1)
            if (r1 == 0) goto L_0x00df
            java.lang.String r1 = "&title="
            r0.append(r1)
            java.lang.String r1 = "title"
            java.lang.Object r1 = r10.get(r1)
            r0.append(r1)
        L_0x00df:
            java.lang.String r0 = r0.toString()
            goto L_0x0118
        L_0x00e4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "aweme://user/profile/"
            r0.<init>(r1)
            java.lang.String r1 = "user_id"
            java.lang.Object r1 = r10.get(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r7.a((java.lang.String) r0, (android.os.Bundle) r10)
            goto L_0x0118
        L_0x00fd:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "aweme://aweme/detail/"
            r0.<init>(r1)
            java.lang.String r1 = "extra_key_id"
            java.lang.Object r1 = r10.get(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r7.a((java.lang.String) r0, (android.os.Bundle) r10)
            goto L_0x0118
        L_0x0116:
            java.lang.String r0 = "aweme://aweme/zhima/live"
        L_0x0118:
            r9 = r0
            goto L_0x01fa
        L_0x011b:
            java.lang.String r0 = "live.intent.extra.ROOM_ID"
            long r0 = r10.getLong(r0)
            java.lang.String r2 = ""
            com.ss.android.ugc.aweme.live.a.a(r8, r0, r10, r2)
            goto L_0x01fa
        L_0x0128:
            r11 = r8
            android.app.Activity r11 = (android.app.Activity) r11
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r12] = r11
            r0[r13] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f53427a
            r3 = 0
            r4 = 55730(0xd9b2, float:7.8094E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r5[r12] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x016a
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r12] = r11
            r0[r13] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f53427a
            r3 = 0
            r4 = 55730(0xd9b2, float:7.8094E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r5[r12] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01fa
        L_0x016a:
            if (r11 == 0) goto L_0x01fa
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = com.ss.android.g.a.b()
            if (r1 == 0) goto L_0x017d
            java.lang.String r1 = "https://musical.ly/report/"
            r0.append(r1)
            goto L_0x018e
        L_0x017d:
            boolean r1 = com.ss.android.g.a.c()
            if (r1 == 0) goto L_0x0189
            java.lang.String r1 = "https://www.tiktokv.com/aweme/in_app/report/"
            r0.append(r1)
            goto L_0x018e
        L_0x0189:
            java.lang.String r1 = "https://aweme.snssdk.com/falcon/douyin_falcon/report/index.html/"
            r0.append(r1)
        L_0x018e:
            java.lang.String r1 = "?object_id="
            r0.append(r1)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r1 = "reportVideo.user.id"
            java.lang.Object r1 = r10.get(r1)     // Catch:{ Exception -> 0x01c6 }
            r0.append(r1)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r1 = "&owner_id="
            r0.append(r1)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r1 = "reportVideo.user.id"
            java.lang.Object r1 = r10.get(r1)     // Catch:{ Exception -> 0x01c6 }
            r0.append(r1)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r1 = "&report_type="
            r0.append(r1)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r1 = "reportVideo.activity.type"
            java.lang.Object r1 = r10.get(r1)     // Catch:{ Exception -> 0x01c6 }
            r0.append(r1)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r1 = "&room_id="
            r0.append(r1)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r1 = "reportVideo.media.id"
            java.lang.Object r1 = r10.get(r1)     // Catch:{ Exception -> 0x01c6 }
            r0.append(r1)     // Catch:{ Exception -> 0x01c6 }
        L_0x01c6:
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity> r2 = com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.class
            r1.<init>(r11, r2)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "show_load_dialog"
            r2.putBoolean(r3, r12)
            java.lang.String r3 = "hide_nav_bar"
            r2.putBoolean(r3, r13)
            r1.putExtras(r2)
            java.lang.String r0 = r0.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1.setData(r0)
            r11.startActivity(r1)
            goto L_0x01fa
        L_0x01ee:
            com.ss.android.ugc.aweme.live.livehostimpl.d r0 = new com.ss.android.ugc.aweme.live.livehostimpl.d
            r0.<init>()
            r1 = r8
            android.app.Activity r1 = (android.app.Activity) r1
            r0.a((android.app.Activity) r1)
            return r13
        L_0x01fa:
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r12] = r8
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f53427a
            r3 = 0
            r4 = 55731(0xd9b3, float:7.8096E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r5[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x023f
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r12] = r8
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f53427a
            r3 = 0
            r4 = 55731(0xd9b3, float:7.8096E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r5[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r16
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x023f:
            if (r15 != 0) goto L_0x0242
            return r12
        L_0x0242:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x0249
            return r12
        L_0x0249:
            java.lang.String r0 = "sslocal://showcaseh5"
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto L_0x0255
            com.ss.android.ugc.aweme.commercialize.utils.g.d((android.content.Context) r8, (java.lang.String) r9)
            return r13
        L_0x0255:
            com.ss.android.ugc.aweme.ag.h r0 = com.ss.android.ugc.aweme.ag.h.a()
            r1 = r8
            android.app.Activity r1 = (android.app.Activity) r1
            r0.a((android.app.Activity) r1, (java.lang.String) r9)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.c.a(android.content.Context, java.lang.String, android.os.Bundle):boolean");
    }

    private String a(String str, Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{str, bundle2}, this, f53427a, false, 55728, new Class[]{String.class, Bundle.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str, bundle2}, this, f53427a, false, 55728, new Class[]{String.class, Bundle.class}, String.class);
        }
        j a2 = j.a(str);
        for (String str2 : bundle.keySet()) {
            Object obj = bundle2.get(str2);
            if (obj != null) {
                a2.a(str2, obj.toString());
            }
        }
        return a2.a();
    }

    public final void a(long j, Map<String, String> map) {
        long j2 = j;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), map2}, this, f53427a, false, 55725, new Class[]{Long.TYPE, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), map2}, this, f53427a, false, 55725, new Class[]{Long.TYPE, Map.class}, Void.TYPE);
            return;
        }
        j a2 = j.a("aweme://user/profile/" + j2).a("previous_page", "live").a("scene_id", "1037").a("enter_from", "live");
        if (map2 != null) {
            for (String next : map.keySet()) {
                a2.a(next, map2.get(next));
            }
        }
        h.a().a(a2.a());
    }

    public final void a(Context context, Intent intent) {
        Context context2 = context;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{context2, intent2}, this, f53427a, false, 55727, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, intent2}, this, f53427a, false, 55727, new Class[]{Context.class, Intent.class}, Void.TYPE);
            return;
        }
        intent2.setClass(context2, LiveBroadcastSigningActivity.class);
        context.startActivity(intent);
    }

    public final void a(String str, Context context) {
        String str2 = str;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{str2, context2}, this, f53427a, false, 55724, new Class[]{String.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, context2}, this, f53427a, false, 55724, new Class[]{String.class, Context.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, CrossPlatformActivity.class);
        intent.setData(Uri.parse("https://aweme.snssdk.com/falcon/douyin_falcon/faq/?enter_from=" + str2));
        intent.putExtra("hide_nav_bar", true);
        context2.startActivity(intent);
    }

    public final void a(String str, Bundle bundle, Context context) {
        String str2 = str;
        Bundle bundle2 = bundle;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{str2, bundle2, context2}, this, f53427a, false, 55723, new Class[]{String.class, Bundle.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, bundle2, context2}, this, f53427a, false, 55723, new Class[]{String.class, Bundle.class, Context.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, LiveDummyActivity.class);
        bundle2.putString(PushConstants.WEB_URL, str2);
        bundle2.putBoolean("show_progress", false);
        intent.putExtra("intent_type", 1);
        intent.putExtras(bundle2);
        if (!(context2 instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context2.startActivity(intent);
    }
}
