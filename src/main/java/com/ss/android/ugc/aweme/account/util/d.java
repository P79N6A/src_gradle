package com.ss.android.ugc.aweme.account.util;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.ui.BindMobileActivity;
import com.ss.android.ugc.aweme.account.ui.VerificationActivity;
import com.ss.android.ugc.aweme.global.config.settings.g;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33085a;

    /* renamed from: b  reason: collision with root package name */
    public static final Set<Integer> f33086b = new HashSet(Arrays.asList(new Integer[]{1, 6}));

    public static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f33085a, true, 21302, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f33085a, true, 21302, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str) || !str2.contains("third_party_")) {
            return null;
        } else {
            return str2.replace("third_party_", "");
        }
    }

    public static boolean b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f33085a, true, 21303, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, null, f33085a, true, 21303, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        List<Integer> aF = g.b().aF();
        if (!CollectionUtils.isEmpty(aF) && aF.contains(Integer.valueOf(c(str)))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int c(java.lang.String r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f33085a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Integer.TYPE
            r3 = 0
            r5 = 1
            r6 = 21304(0x5338, float:2.9853E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0039
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f33085a
            r13 = 1
            r14 = 21304(0x5338, float:2.9853E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Integer.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x0039:
            int r2 = r17.hashCode()
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = -1
            switch(r2) {
                case -1530308138: goto L_0x0077;
                case -1134307907: goto L_0x006d;
                case -791575966: goto L_0x0063;
                case -471473230: goto L_0x0059;
                case 635922494: goto L_0x004f;
                case 1851692357: goto L_0x0045;
                default: goto L_0x0044;
            }
        L_0x0044:
            goto L_0x0081
        L_0x0045:
            java.lang.String r2 = "flipchat"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0081
            r0 = 5
            goto L_0x0082
        L_0x004f:
            java.lang.String r2 = "toutiao_v2"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0081
            r0 = 4
            goto L_0x0082
        L_0x0059:
            java.lang.String r2 = "sina_weibo"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0081
            r0 = 2
            goto L_0x0082
        L_0x0063:
            java.lang.String r2 = "weixin"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0081
            r0 = 1
            goto L_0x0082
        L_0x006d:
            java.lang.String r2 = "toutiao"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0081
            r0 = 3
            goto L_0x0082
        L_0x0077:
            java.lang.String r2 = "qzone_sns"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0081
            r0 = 0
            goto L_0x0082
        L_0x0081:
            r0 = -1
        L_0x0082:
            switch(r0) {
                case 0: goto L_0x008a;
                case 1: goto L_0x0089;
                case 2: goto L_0x0088;
                case 3: goto L_0x0087;
                case 4: goto L_0x0087;
                case 5: goto L_0x0086;
                default: goto L_0x0085;
            }
        L_0x0085:
            return r6
        L_0x0086:
            return r3
        L_0x0087:
            return r4
        L_0x0088:
            return r5
        L_0x0089:
            return r1
        L_0x008a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.util.d.c(java.lang.String):int");
    }

    private static boolean a(int i, Activity activity) {
        int i2 = i;
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), activity2}, null, f33085a, true, 21299, new Class[]{Integer.TYPE, Activity.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), activity2}, null, f33085a, true, 21299, new Class[]{Integer.TYPE, Activity.class}, Boolean.TYPE)).booleanValue();
        } else if (i2 == 2000) {
            Intent intent = new Intent(activity2, VerificationActivity.class);
            intent.putExtra("verify_type", 1024);
            activity2.startActivityForResult(intent, 2048);
            return true;
        } else if (i2 == 2001) {
            activity2.startActivityForResult(new Intent(activity2, BindMobileActivity.class), 1024);
            return true;
        } else if (i2 != 2002) {
            return false;
        } else {
            Intent intent2 = new Intent(activity2, VerificationActivity.class);
            intent2.putExtra("verify_type", 2048);
            activity2.startActivityForResult(intent2, 3072);
            return true;
        }
    }

    public static boolean a(JSONObject jSONObject, Activity activity, int i) {
        JSONObject jSONObject2 = jSONObject;
        Activity activity2 = activity;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, activity2, Integer.valueOf(i)}, null, f33085a, true, 21298, new Class[]{JSONObject.class, Activity.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject2, activity2, Integer.valueOf(i)}, null, f33085a, true, 21298, new Class[]{JSONObject.class, Activity.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (jSONObject2 == null || TextUtils.equals(jSONObject2.optString("message"), "success") || activity2 == null) {
            return false;
        } else {
            JSONObject optJSONObject = jSONObject2.optJSONObject("data");
            if (optJSONObject == null) {
                return false;
            }
            int optInt = optJSONObject.optInt("error_code");
            if (i2 == 0) {
                return a(optInt, activity2);
            }
            if (i2 == 2) {
                return a(optInt, activity2, optJSONObject.optString("verify_mobile"), optJSONObject.optString("shark_ticket"), optJSONObject.optString("profile_key"));
            }
            return false;
        }
    }

    private static boolean a(int i, Activity activity, String str, String str2, String str3) {
        int i2 = i;
        Activity activity2 = activity;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), activity2, str4, str5, str6}, null, f33085a, true, 21300, new Class[]{Integer.TYPE, Activity.class, String.class, String.class, String.class}, Boolean.TYPE)) {
            Object[] objArr = {Integer.valueOf(i), activity2, str4, str5, str6};
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, f33085a, true, 21300, new Class[]{Integer.TYPE, Activity.class, String.class, String.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (i2 == 2000) {
            Intent intent = new Intent(activity2, VerificationActivity.class);
            intent.putExtra("verify_type", 3072);
            intent.putExtra("shark_ticket", str5);
            activity2.startActivityForResult(intent, 2049);
            return true;
        } else if (i2 == 2001) {
            a.c(activity.getApplicationContext(), (int) C0906R.string.mu).a();
            Intent intent2 = new Intent(activity2, BindMobileActivity.class);
            intent2.putExtra("type", 4);
            intent2.putExtra("profile_key", str6);
            activity2.startActivityForResult(intent2, 1025);
            return true;
        } else if (i2 != 2002) {
            return false;
        } else {
            Intent intent3 = new Intent(activity2, VerificationActivity.class);
            intent3.putExtra("verify_type", 4096);
            intent3.putExtra("shark_ticket", str5);
            intent3.putExtra("phone", str4);
            activity2.startActivityForResult(intent3, 3073);
            return true;
        }
    }
}
