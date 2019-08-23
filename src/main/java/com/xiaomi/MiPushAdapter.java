package com.xiaomi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.push.PushDependManager;
import com.ss.android.pushmanager.a.d;
import com.ss.android.pushmanager.f;
import com.ss.android.pushmanager.setting.a;
import com.ss.android.pushmanager.setting.b;
import com.ss.android.pushmanager.thirdparty.IPushAdapter;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.android.ugc.aweme.q.c;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import com.xiaomi.mipush.sdk.Logger;
import com.xiaomi.mipush.sdk.MiPushClient;
import org.json.JSONObject;

public class MiPushAdapter implements IPushAdapter {
    public boolean isPushAvailable(Context context, int i) {
        return true;
    }

    public void trackPush(Context context, int i, Object obj) {
    }

    @SuppressLint({"ApplySharedPref"})
    private void doUpgradeMiPush(Context context) {
        if (!a.a().a("mipush_upgrade_3616", Boolean.FALSE)) {
            a a2 = a.a();
            if (PatchProxy.isSupport(new Object[]{"mipush_upgrade_3616", (byte) 1}, a2, a.f30585a, false, 19123, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
                a aVar = a2;
                PatchProxy.accessDispatch(new Object[]{"mipush_upgrade_3616", (byte) 1}, aVar, a.f30585a, false, 19123, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            } else {
                SharedPreferences.Editor edit = a2.f30587b.edit();
                edit.putBoolean("mipush_upgrade_3616", true);
                edit.apply();
            }
            c.a(context, "mipush_account", 0).edit().clear().commit();
            c.a(context, "mipush_extra", 0).edit().clear().commit();
            c.a(context, "mipush", 0).edit().clear().commit();
            c.a(context, "XMPushServiceConfig", 0).edit().clear().commit();
        }
    }

    public boolean checkThirdPushConfig(String str, Context context) throws Exception {
        return ManifestChecker.checkManifest(str, context);
    }

    public void unregisterPush(Context context, int i) {
        if (context != null && i == 1) {
            if (PushDependManager.inst().loggerDebug()) {
                PushDependManager.inst().loggerD("MiPush", "unregisterMiPush");
            }
            try {
                MiPushClient.pausePush(context.getApplicationContext(), null);
                MiPushClient.unregisterPush(context.getApplicationContext());
            } catch (Throwable unused) {
            }
        }
    }

    public void registerPush(Context context, int i) {
        String str = null;
        if (context == null || i != 1) {
            if (context == null) {
                str = "空 context";
            } else if (i != 1) {
                str = "通道注册错误";
            }
            d.a(i, BaseLoginOrRegisterActivity.o, PushConstants.PUSH_TYPE_NOTIFY, str);
            return;
        }
        if (PushDependManager.inst().loggerDebug()) {
            PushDependManager.inst().loggerD("MiPush", "registerMiPush");
        }
        try {
            Pair<String, String> pushConfig = PushDependManager.inst().getPushConfig(1);
            if (pushConfig == null) {
                d.a(i, 106, PushConstants.PUSH_TYPE_NOTIFY, "配置为空");
                return;
            }
            doUpgradeMiPush(context);
            MiPushClient.registerPush(context, (String) pushConfig.first, (String) pushConfig.second);
            MiPushClient.resumePush(context.getApplicationContext(), null);
            Logger.setLogger(context, new LoggerInterface() {
                public void setTag(String str) {
                }

                public void log(String str) {
                    if (b.a().v()) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(PushConstants.CONTENT, str);
                            f.a().a("mipush_log", jSONObject);
                        } catch (Exception unused) {
                        }
                    }
                }

                public void log(String str, Throwable th) {
                    if (b.a().v()) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("Throwable", th.getMessage());
                            jSONObject.put(PushConstants.CONTENT, str);
                            f.a().a("mipush_log", jSONObject);
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0042 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setAlias(android.content.Context r5, java.lang.String r6, int r7) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0053
            r0 = 1
            if (r7 == r0) goto L_0x0006
            goto L_0x0053
        L_0x0006:
            com.ss.android.push.PushDependManager r0 = com.ss.android.push.PushDependManager.inst()
            boolean r0 = r0.loggerDebug()
            if (r0 == 0) goto L_0x001b
            com.ss.android.push.PushDependManager r0 = com.ss.android.push.PushDependManager.inst()
            java.lang.String r1 = "MiPush"
            java.lang.String r2 = "setAlias"
            r0.loggerD(r1, r2)
        L_0x001b:
            r0 = 0
            java.util.List r1 = com.xiaomi.mipush.sdk.MiPushClient.getAllAlias(r5)     // Catch:{ Exception -> 0x0042 }
            if (r1 == 0) goto L_0x0042
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0042 }
        L_0x0026:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x0042 }
            if (r2 == 0) goto L_0x0042
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x0042 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0042 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0042 }
            if (r3 != 0) goto L_0x0026
            boolean r3 = r2.equals(r6)     // Catch:{ Exception -> 0x0042 }
            if (r3 != 0) goto L_0x0026
            com.xiaomi.mipush.sdk.MiPushClient.unsetAlias(r5, r2, r0)     // Catch:{ Exception -> 0x0042 }
            goto L_0x0026
        L_0x0042:
            com.xiaomi.mipush.sdk.MiPushClient.setAlias(r5, r6, r0)     // Catch:{ Exception -> 0x0046 }
            return
        L_0x0046:
            r5 = move-exception
            r6 = 105(0x69, float:1.47E-43)
            java.lang.String r0 = "0"
            java.lang.String r5 = android.util.Log.getStackTraceString(r5)
            com.ss.android.pushmanager.a.d.a(r7, r6, r0, r5)
            return
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.MiPushAdapter.setAlias(android.content.Context, java.lang.String, int):void");
    }
}
