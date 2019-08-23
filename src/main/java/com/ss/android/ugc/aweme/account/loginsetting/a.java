package com.ss.android.ugc.aweme.account.loginsetting;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.a.a.b;
import com.ss.android.ugc.aweme.account.i.a;
import com.ss.android.ugc.aweme.account.loginsetting.LoginSettingResponse;
import com.ss.android.ugc.aweme.account.views.a;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.main.h.v;
import com.ss.android.ugc.aweme.w;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32699a;

    /* renamed from: com.ss.android.ugc.aweme.account.loginsetting.a$a  reason: collision with other inner class name */
    public interface C0414a {
        void a();
    }

    private static void a(Activity activity, LoginSettingResponse.SettingInfo settingInfo, C0414a aVar, String str) {
        String str2;
        Activity activity2 = activity;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{activity2, settingInfo, aVar, str3}, null, f32699a, true, 20864, new Class[]{Activity.class, LoginSettingResponse.SettingInfo.class, C0414a.class, String.class}, Void.TYPE)) {
            Object[] objArr = {activity2, settingInfo, aVar, str3};
            PatchProxy.accessDispatch(objArr, null, f32699a, true, 20864, new Class[]{Activity.class, LoginSettingResponse.SettingInfo.class, C0414a.class, String.class}, Void.TYPE);
        } else if (settingInfo != null) {
            com.ss.android.ugc.aweme.account.views.a a2 = new a.C0416a().b(settingInfo.getDialog_content()).a(settingInfo.getDialog_title()).a(2130840154).c(settingInfo.getL_button_dialog()).d(settingInfo.getR_button_dialog()).a((Context) activity2);
            final com.ss.android.ugc.aweme.account.views.a aVar2 = a2;
            final LoginSettingResponse.SettingInfo settingInfo2 = settingInfo;
            final C0414a aVar3 = aVar;
            final Activity activity3 = activity;
            final String str4 = str;
            AnonymousClass1 r0 = new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f32700a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f32700a, false, 20868, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f32700a, false, 20868, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    try {
                        aVar2.dismiss();
                        a.a(settingInfo2.getL_jump_type(), settingInfo2.getL_jump_url(), aVar3, activity3, str4);
                    } catch (Exception unused) {
                    }
                }
            };
            a2.b(r0);
            AnonymousClass2 r02 = new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f32706a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f32706a, false, 20869, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f32706a, false, 20869, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    try {
                        aVar2.dismiss();
                        a.a(settingInfo2.getR_jump_type(), settingInfo2.getR_jump_url(), aVar3, activity3, str4);
                    } catch (Exception unused) {
                    }
                }
            };
            a2.a(r02);
            a2.setCanceledOnTouchOutside(false);
            try {
                a2.show();
                b a3 = new b().a("enter_from", "login_page").a("enter_method", str3);
                if (TextUtils.equals(str3, "qzone_sns")) {
                    str2 = "qq";
                } else {
                    str2 = str3;
                }
                r.a("block_authorize_login_alert", (Map) a3.a("platform", str2).f31599b);
            } catch (Exception unused) {
            }
        }
    }

    private static void b(Activity activity, LoginSettingResponse.SettingInfo settingInfo, C0414a aVar, String str) {
        String str2;
        Activity activity2 = activity;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{activity2, settingInfo, aVar, str3}, null, f32699a, true, 20865, new Class[]{Activity.class, LoginSettingResponse.SettingInfo.class, C0414a.class, String.class}, Void.TYPE)) {
            Object[] objArr = {activity2, settingInfo, aVar, str3};
            PatchProxy.accessDispatch(objArr, null, f32699a, true, 20865, new Class[]{Activity.class, LoginSettingResponse.SettingInfo.class, C0414a.class, String.class}, Void.TYPE);
        } else if (settingInfo != null) {
            com.ss.android.ugc.aweme.account.views.a a2 = new a.C0416a().b(settingInfo.getDialog_content()).a(settingInfo.getDialog_title()).a(2130840154).c(settingInfo.getButton_dialog()).a((Context) activity2);
            final com.ss.android.ugc.aweme.account.views.a aVar2 = a2;
            final LoginSettingResponse.SettingInfo settingInfo2 = settingInfo;
            final C0414a aVar3 = aVar;
            final Activity activity3 = activity;
            final String str4 = str;
            AnonymousClass3 r0 = new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f32712a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f32712a, false, 20870, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f32712a, false, 20870, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    try {
                        aVar2.dismiss();
                        a.a(settingInfo2.getJump_type(), settingInfo2.getJump_url(), aVar3, activity3, str4);
                    } catch (Exception unused) {
                    }
                }
            };
            a2.b(r0);
            a2.setCanceledOnTouchOutside(false);
            try {
                a2.show();
                b a3 = new b().a("enter_from", "login_page").a("enter_method", str3);
                if (TextUtils.equals(str3, "qzone_sns")) {
                    str2 = "qq";
                } else {
                    str2 = str3;
                }
                r.a("block_authorize_login_alert", (Map) a3.a("platform", str2).f31599b);
            } catch (Exception unused) {
            }
        }
    }

    public static void a(int i, @Nullable String str, @Nullable C0414a aVar, @Nullable Activity activity, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        int i2 = i;
        String str7 = str;
        Activity activity2 = activity;
        String str8 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str7, aVar, activity2, str8}, null, f32699a, true, 20866, new Class[]{Integer.TYPE, String.class, C0414a.class, Activity.class, String.class}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i), str7, aVar, activity2, str8};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f32699a, true, 20866, new Class[]{Integer.TYPE, String.class, C0414a.class, Activity.class, String.class}, Void.TYPE);
            return;
        }
        a.b bVar = a.b.THIRD_MATCH_SETTING_CLICK;
        a.C0406a aVar2 = a.C0406a.THIRD_PARTY;
        com.ss.android.ugc.aweme.account.i.a.b(bVar, aVar2, "jumpType=" + i2 + " jumpUrl=" + str7);
        if (activity2 != null) {
            switch (i2) {
                case 0:
                    if (aVar != null) {
                        aVar.a();
                    }
                    b a2 = new b().a("enter_from", "login_page").a("enter_method", str8);
                    if (TextUtils.equals(str8, "qzone_sns")) {
                        str3 = "qq";
                    } else {
                        str3 = str8;
                    }
                    r.a("block_authorize_login_click", (Map) a2.a("platform", str3).a("target_action", "continue").f31599b);
                    return;
                case 1:
                    if (!TextUtils.isEmpty(str)) {
                        v vVar = (v) w.a(v.class);
                        if (vVar != null) {
                            vVar.a((Context) activity2, str7, true);
                        }
                        b a3 = new b().a("enter_from", "login_page").a("enter_method", str8);
                        if (TextUtils.equals(str8, "qzone_sns")) {
                            str4 = "qq";
                        } else {
                            str4 = str8;
                        }
                        r.a("block_authorize_login_click", (Map) a3.a("platform", str4).a("target_action", "h5").f31599b);
                        return;
                    }
                    break;
                case 2:
                    b a4 = new b().a("enter_from", "login_page").a("enter_method", str8);
                    if (TextUtils.equals(str8, "qzone_sns")) {
                        str5 = "qq";
                    } else {
                        str5 = str8;
                    }
                    r.a("block_authorize_login_click", (Map) a4.a("platform", str5).a("target_action", "close").f31599b);
                    break;
                case 3:
                    if (!TextUtils.isEmpty(str)) {
                        h.a().a(str7);
                        b a5 = new b().a("enter_from", "login_page").a("enter_method", str8);
                        if (TextUtils.equals(str8, "qzone_sns")) {
                            str6 = "qq";
                        } else {
                            str6 = str8;
                        }
                        r.a("block_authorize_login_click", (Map) a5.a("platform", str6).a("target_action", "rn").f31599b);
                        return;
                    }
                    break;
            }
        }
    }

    public static boolean a(List<LoginSettingResponse.SettingInfo> list, String str, int i, boolean z, Activity activity, C0414a aVar) {
        int i2;
        String str2 = str;
        Activity activity2 = activity;
        C0414a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{list, str2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), activity2, aVar2}, null, f32699a, true, 20863, new Class[]{List.class, String.class, Integer.TYPE, Boolean.TYPE, Activity.class, C0414a.class}, Boolean.TYPE)) {
            Object[] objArr = {list, str2, Integer.valueOf(i), Byte.valueOf(z), activity2, aVar2};
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, f32699a, true, 20863, new Class[]{List.class, String.class, Integer.TYPE, Boolean.TYPE, Activity.class, C0414a.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str) || CollectionUtils.isEmpty(list) || activity2 == null) {
            return false;
        } else {
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1530308138) {
                if (hashCode != -791575966) {
                    if (hashCode == -471473230 && str2.equals("sina_weibo")) {
                        c2 = 2;
                    }
                } else if (str2.equals("weixin")) {
                    c2 = 1;
                }
            } else if (str2.equals("qzone_sns")) {
                c2 = 0;
            }
            switch (c2) {
                case 0:
                    i2 = 4;
                    break;
                case 1:
                    i2 = 5;
                    break;
                case 2:
                    i2 = 6;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            LoginSettingResponse.SettingInfo settingInfo = null;
            Iterator<LoginSettingResponse.SettingInfo> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    LoginSettingResponse.SettingInfo next = it2.next();
                    if (next.getLogin_platform() == i2) {
                        settingInfo = next;
                    }
                }
            }
            if (settingInfo != null) {
                if (z && settingInfo.getPlan_type() == 1) {
                    a(activity2, settingInfo, aVar2, str2);
                    com.ss.android.ugc.aweme.account.i.a.b(a.b.THIRD_MATCH_SETTING_BEFORE_LOGIN, a.C0406a.THIRD_PARTY, "");
                    return true;
                } else if (!z && settingInfo.getPlan_type() == 2 && !CollectionUtils.isEmpty(settingInfo.getError_codes())) {
                    for (Integer num : settingInfo.getError_codes()) {
                        if (num.intValue() == 8888 || num.intValue() == i) {
                            b(activity2, settingInfo, aVar2, str2);
                            a.b bVar = a.b.THIRD_MATCH_SETTING_AFTER_LOGIN;
                            a.C0406a aVar3 = a.C0406a.THIRD_PARTY;
                            com.ss.android.ugc.aweme.account.i.a.b(bVar, aVar3, "errorCode=" + num);
                            return true;
                        } else if (i2 == 6) {
                            b(activity2, settingInfo, aVar2, str2);
                            a.b bVar2 = a.b.THIRD_MATCH_SETTING_AFTER_LOGIN;
                            a.C0406a aVar32 = a.C0406a.THIRD_PARTY;
                            com.ss.android.ugc.aweme.account.i.a.b(bVar2, aVar32, "errorCode=" + num);
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }
}
