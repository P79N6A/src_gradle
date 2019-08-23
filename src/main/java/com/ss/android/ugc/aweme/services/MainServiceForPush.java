package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.c.b;
import com.ss.android.common.config.AppConfig;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.newmedia.c;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.AdsAppBaseActivity;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.feed.ag;
import com.ss.android.ugc.aweme.framework.e.a;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.splash.SplashActivity;
import com.ss.android.ugc.aweme.utils.ev;
import com.ss.android.ugc.awemepushapi.e;
import com.ss.android.ugc.awemepushapi.f;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class MainServiceForPush implements e {
    private static int applicationId;
    public static ChangeQuickRedirect changeQuickRedirect;

    public boolean forbidShowPushNotification() {
        return false;
    }

    public String getBaseHost() {
        return b.k;
    }

    public boolean getAllowNetwork() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71433, new Class[0], Boolean.TYPE)) {
            return BaseAppData.i(a.a());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71433, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public String getSessionKey() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71422, new Class[0], String.class)) {
            return d.a().getSessionKey();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71422, new Class[0], String.class);
    }

    public boolean isAppBackground() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71417, new Class[0], Boolean.TYPE)) {
            return p.a().b();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71417, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean isAppNotActive() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71423, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71423, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (BaseAppData.a().f() == null) {
            return true;
        } else {
            return false;
        }
    }

    private static String getCustomScheme() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 71441, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 71441, new Class[0], String.class);
        }
        if (!com.ss.android.g.a.b()) {
            return com.ss.android.ugc.aweme.app.e.f34153c + applicationId;
        } else if (TextUtils.isEmpty(com.ss.android.g.a.d())) {
            return "musically";
        } else {
            return com.ss.android.g.a.d();
        }
    }

    public String getDefaultUninstallQuestionUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71432, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71432, new Class[0], String.class);
        } else if (!com.ss.android.g.a.a()) {
            return ev.a().toString();
        } else {
            if (!AbTestManager.a().d().showUninstallSheet) {
                return "";
            }
            return ev.a().toString() + "&";
        }
    }

    public int getPushDelayDuration() {
        Integer num;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71437, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71437, new Class[0], Integer.TYPE)).intValue();
        }
        com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = g.b();
        if (PatchProxy.isSupport(new Object[0], b2, com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a, false, 48800, new Class[0], Integer.class)) {
            num = (Integer) PatchProxy.accessDispatch(new Object[0], b2, com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a, false, 48800, new Class[0], Integer.class);
        } else if (b2.f49569c == null) {
            num = b2.f49568b.getPushdelayinitSwitch();
        } else {
            num = (Integer) com.ss.android.ugc.aweme.global.config.settings.pojo.a.a(b2.f49569c, "pushdelayinit_switch", Integer.class, b2.f49568b.getPushdelayinitSwitch());
        }
        return num.intValue();
    }

    public int getScreenOnPushMaxSize() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71418, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71418, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestManager a2 = AbTestManager.a();
        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71717, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71717, new Class[0], Integer.TYPE)).intValue();
        }
        if (a2.f63778b == null) {
            AbTestModel d2 = a2.d();
            if (d2 == null) {
                a2.f63778b = 0;
            } else {
                a2.f63778b = Integer.valueOf(d2.screen_on_push_max_size);
            }
        }
        return a2.f63778b.intValue();
    }

    public int getScreenOnPushWaitTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71419, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71419, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestManager a2 = AbTestManager.a();
        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71720, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71720, new Class[0], Integer.TYPE)).intValue();
        }
        if (a2.f63779c == null) {
            AbTestModel d2 = a2.d();
            if (d2 == null) {
                a2.f63779c = 0;
            } else {
                a2.f63779c = Integer.valueOf(d2.wait_time);
            }
        }
        return a2.f63779c.intValue();
    }

    public boolean isLowPushWhenActive() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71420, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71420, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestManager a2 = AbTestManager.a();
        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71707, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71707, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = a2.d();
        if (d2 == null) {
            return false;
        }
        return d2.isLowPushWhenActive;
    }

    public boolean isSplashActivity(Activity activity) {
        return activity instanceof SplashActivity;
    }

    public MainServiceForPush(int i) {
        applicationId = i;
    }

    public boolean canShowHwErrorDialog(Activity activity) {
        if ((activity instanceof AdsAppBaseActivity) || (activity instanceof SplashActivity)) {
            return false;
        }
        return true;
    }

    public Intent getProfileAddFriendIntent(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 71427, new Class[]{Context.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 71427, new Class[]{Context.class}, Intent.class);
        }
        BaseAppData.a();
        return null;
    }

    public Intent getProfileFanFriendIntent(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 71426, new Class[]{Context.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 71426, new Class[]{Context.class}, Intent.class);
        }
        BaseAppData.a();
        return null;
    }

    public void reportReceiveOpenUrl(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 71434, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 71434, new Class[]{String.class}, Void.TYPE);
            return;
        }
        reportOpenUrl(str);
    }

    public boolean filterAppNotify(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 71424, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 71424, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (StringUtils.isEmpty(str)) {
            return false;
        } else {
            try {
                BaseAppData.a();
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public boolean isSelfScheme(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 71429, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 71429, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (StringUtils.isEmpty(str)) {
            return false;
        } else {
            if (com.ss.android.ugc.aweme.app.e.f34152b.equals(str2)) {
                return true;
            }
            String customScheme = getCustomScheme();
            if (StringUtils.isEmpty(customScheme) || !customScheme.equals(str2)) {
                return false;
            }
            return true;
        }
    }

    public void setMainObserver(final f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, changeQuickRedirect, false, 71439, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, changeQuickRedirect, false, 71439, new Class[]{f.class}, Void.TYPE);
            return;
        }
        BaseAppData.a().a((BaseAppData.a) new BaseAppData.a() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public void handleMsg(Message message) {
                Message message2 = message;
                if (PatchProxy.isSupport(new Object[]{message2}, this, changeQuickRedirect, false, 71443, new Class[]{Message.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{message2}, this, changeQuickRedirect, false, 71443, new Class[]{Message.class}, Void.TYPE);
                    return;
                }
                fVar.a(message2);
            }

            public void onActivityPaused(Activity activity) {
                Activity activity2 = activity;
                if (PatchProxy.isSupport(new Object[]{activity2}, this, changeQuickRedirect, false, 71445, new Class[]{Activity.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{activity2}, this, changeQuickRedirect, false, 71445, new Class[]{Activity.class}, Void.TYPE);
                    return;
                }
                fVar.b(activity2);
            }

            public void onActivityResumed(Activity activity) {
                Activity activity2 = activity;
                if (PatchProxy.isSupport(new Object[]{activity2}, this, changeQuickRedirect, false, 71444, new Class[]{Activity.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{activity2}, this, changeQuickRedirect, false, 71444, new Class[]{Activity.class}, Void.TYPE);
                    return;
                }
                fVar.a(activity2);
            }

            public void onLoadData(Context context) {
                Context context2 = context;
                if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 71447, new Class[]{Context.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 71447, new Class[]{Context.class}, Void.TYPE);
                    return;
                }
                fVar.b(context2);
            }

            public void onSaveData(Context context) {
                Context context2 = context;
                if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 71446, new Class[]{Context.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 71446, new Class[]{Context.class}, Void.TYPE);
                    return;
                }
                fVar.a(context2);
            }

            public void onAccountRefresh(boolean z, int i, Context context) {
                Context context2 = context;
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), context2}, this, changeQuickRedirect, false, 71448, new Class[]{Boolean.TYPE, Integer.TYPE, Context.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), context2}, this, changeQuickRedirect, false, 71448, new Class[]{Boolean.TYPE, Integer.TYPE, Context.class}, Void.TYPE);
                    return;
                }
                fVar.a(z, i, context2);
            }
        });
        ag.i().a(new ag.a() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public void onRender() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71449, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71449, new Class[0], Void.TYPE);
                    return;
                }
                fVar.a();
            }
        });
    }

    public String tryConvertScheme(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 71442, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 71442, new Class[]{String.class}, String.class);
        } else if (StringUtils.isEmpty(str)) {
            return str2;
        } else {
            try {
                String scheme = Uri.parse(str).getScheme();
                String customScheme = getCustomScheme();
                if (com.ss.android.ugc.aweme.app.e.f34152b.equals(scheme) || com.ss.android.ugc.aweme.app.e.f34154d.equals(scheme)) {
                    str2 = str2.replace(scheme, customScheme);
                }
            } catch (Exception unused) {
            }
            return str2;
        }
    }

    public static void reportOpenUrl(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 71435, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 71435, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            String host = parse.getHost();
            List<String> pathSegments = parse.getPathSegments();
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            StringBuilder sb = new StringBuilder("//");
            sb.append(host);
            for (String next : pathSegments) {
                if (!TextUtils.isEmpty(next)) {
                    sb.append("/");
                    try {
                        Long.parseLong(next);
                        sb.append("xxx");
                    } catch (NumberFormatException unused) {
                        sb.append(next);
                    }
                }
            }
            if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                sb.append("?");
                Iterator<String> it2 = queryParameterNames.iterator();
                while (it2.hasNext()) {
                    sb.append(it2.next());
                    if (it2.hasNext()) {
                        sb.append("&");
                    }
                }
            }
            try {
                n.a("deep_link_collect", "", new JSONObject().put(com.ss.android.ugc.aweme.app.f.f34168b, sb.toString()));
            } catch (JSONException unused2) {
            }
        }
    }

    public String filterUrl(Context context, String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{context, str2}, this, changeQuickRedirect, false, 71421, new Class[]{Context.class, String.class}, String.class)) {
            return AppConfig.getInstance(context).filterUrl(str2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{context, str2}, this, changeQuickRedirect, false, 71421, new Class[]{Context.class, String.class}, String.class);
    }

    public void interceptAppNotifyUrl(String str, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 71430, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, changeQuickRedirect, false, 71430, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        BaseAppData.a();
    }

    public void monitorCommonLog(String str, JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{str, jSONObject}, this, changeQuickRedirect, false, 71436, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, jSONObject}, this, changeQuickRedirect, false, 71436, new Class[]{String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        n.a(str, jSONObject);
    }

    public void monitorStatusRate(String str, int i, JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), jSONObject}, this, changeQuickRedirect, false, 71438, new Class[]{String.class, Integer.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), jSONObject}, this, changeQuickRedirect, false, 71438, new Class[]{String.class, Integer.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        n.a(str, i, jSONObject);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void onEvent(android.content.Context r20, java.lang.String r21, long r22, long r24, org.json.JSONObject... r26) {
        /*
            r3 = r22
            r5 = r24
            r1 = r26
            r7 = 5
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r15 = 0
            r8[r15] = r20
            r16 = 1
            r8[r16] = r21
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r3)
            r17 = 2
            r8[r17] = r9
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r5)
            r18 = 3
            r8[r18] = r9
            r19 = 4
            r8[r19] = r1
            com.meituan.robust.ChangeQuickRedirect r10 = changeQuickRedirect
            java.lang.Class[] r13 = new java.lang.Class[r7]
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            r13[r15] = r9
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r13[r16] = r9
            java.lang.Class r9 = java.lang.Long.TYPE
            r13[r17] = r9
            java.lang.Class r9 = java.lang.Long.TYPE
            r13[r18] = r9
            java.lang.Class<org.json.JSONObject[]> r9 = org.json.JSONObject[].class
            r13[r19] = r9
            java.lang.Class r14 = java.lang.Void.TYPE
            r9 = 0
            r11 = 1
            r12 = 71440(0x11710, float:1.00109E-40)
            boolean r8 = com.meituan.robust.PatchProxy.isSupport(r8, r9, r10, r11, r12, r13, r14)
            if (r8 == 0) goto L_0x0092
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r15] = r20
            r8[r16] = r21
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r3)
            r8[r17] = r0
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r5)
            r8[r18] = r0
            r8[r19] = r1
            r0 = 0
            com.meituan.robust.ChangeQuickRedirect r1 = changeQuickRedirect
            r2 = 1
            r3 = 71440(0x11710, float:1.00109E-40)
            java.lang.Class[] r4 = new java.lang.Class[r7]
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r4[r15] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r16] = r5
            java.lang.Class r5 = java.lang.Long.TYPE
            r4[r17] = r5
            java.lang.Class r5 = java.lang.Long.TYPE
            r4[r18] = r5
            java.lang.Class<org.json.JSONObject[]> r5 = org.json.JSONObject[].class
            r4[r19] = r5
            java.lang.Class r5 = java.lang.Void.TYPE
            r20 = r8
            r21 = r0
            r22 = r1
            r23 = r2
            r24 = r3
            r25 = r4
            r26 = r5
            com.meituan.robust.PatchProxy.accessDispatch(r20, r21, r22, r23, r24, r25, r26)
            return
        L_0x0092:
            if (r1 == 0) goto L_0x00a9
            int r7 = r1.length
            if (r7 <= 0) goto L_0x00a9
            java.lang.String r7 = "apn"
            r8 = r1[r15]
            r0 = r20
            r1 = r7
            r2 = r21
            r3 = r22
            r5 = r24
            r7 = r8
            com.ss.android.common.lib.a.a(r0, r1, r2, r3, r5, r7)
            return
        L_0x00a9:
            java.lang.String r1 = "apn"
            r0 = r20
            r2 = r21
            r3 = r22
            r5 = r24
            com.ss.android.common.lib.a.a(r0, r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.MainServiceForPush.onEvent(android.content.Context, java.lang.String, long, long, org.json.JSONObject[]):void");
    }

    public Intent getAppNotifyIntent(Context context, int i, int i2, JSONObject jSONObject, boolean z) {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i), Integer.valueOf(i2), jSONObject, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 71428, new Class[]{Context.class, Integer.TYPE, Integer.TYPE, JSONObject.class, Boolean.TYPE}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i), Integer.valueOf(i2), jSONObject, Byte.valueOf(z)}, this, changeQuickRedirect, false, 71428, new Class[]{Context.class, Integer.TYPE, Integer.TYPE, JSONObject.class, Boolean.TYPE}, Intent.class);
        }
        BaseAppData.a();
        return null;
    }

    public Intent getUserProfileIntent(Context context, long j, String str, String str2, String str3) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context, new Long(j2), str, str2, str3}, this, changeQuickRedirect, false, 71425, new Class[]{Context.class, Long.TYPE, String.class, String.class, String.class}, Intent.class)) {
            Object[] objArr = {context, new Long(j2), str, str2, str3};
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 71425, new Class[]{Context.class, Long.TYPE, String.class, String.class, String.class}, Intent.class);
        }
        BaseAppData.a();
        return null;
    }

    public boolean tryShowNotifyDialog(String str, String str2, String str3, Intent intent, int i) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{str, str2, str3, intent, Integer.valueOf(i)}, this, changeQuickRedirect, false, 71431, new Class[]{String.class, String.class, String.class, Intent.class, Integer.TYPE}, Boolean.TYPE)) {
            Object[] objArr = {str, str2, str3, intent, Integer.valueOf(i)};
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 71431, new Class[]{String.class, String.class, String.class, Intent.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        try {
            BaseAppData a2 = BaseAppData.a();
            Activity f2 = a2.f();
            if (f2 != null) {
                c cVar = a2.V;
                if (PatchProxy.isSupport(new Object[0], cVar, c.f30182a, false, 18225, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], cVar, c.f30182a, false, 18225, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    Dialog dialog = null;
                    if (cVar.g != null) {
                        dialog = (Dialog) cVar.g.get();
                    }
                    if (dialog == null || !dialog.isShowing()) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (!z) {
                    Dialog buildNotificationDialog = com.ss.android.di.push.a.a().buildNotificationDialog(f2, str, str2, intent, i);
                    cVar.a(buildNotificationDialog);
                    buildNotificationDialog.show();
                    onEvent(f2.getApplicationContext(), "news_alert_show", (long) i, -1, new JSONObject[0]);
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
