package com.ss.android.ugc.awemepushlib.interaction;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.arch.lifecycle.ProcessLifecycleOwner;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.common.utility.reflect.Reflect;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.message.sswo.SswoActivity;
import com.ss.android.pushmanager.a;
import com.ss.android.pushmanager.app.OpenUrlReceiver;
import com.ss.android.pushmanager.client.MessageAppManager;
import com.ss.android.pushmanager.client.c;
import com.ss.android.pushmanager.client.e;
import com.ss.android.pushmanager.f;
import com.ss.android.pushmanager.setting.b;
import com.ss.android.ugc.awemepushapi.IPushApi;
import com.ss.android.ugc.awemepushapi.d;
import com.ss.android.ugc.awemepushapi.g;
import com.ss.android.ugc.awemepushlib.interaction.k;
import com.ss.android.ugc.awemepushlib.manager.AwemeRedBadgerManager;
import com.ss.android.ugc.awemepushlib.widget.b;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

public class PushService implements IPushApi {
    public static ChangeQuickRedirect changeQuickRedirect;

    public String getApiUrlPrefix() {
        return a.f30472e;
    }

    public String iPrefix() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90256, new Class[0], String.class)) {
            return f.b().a();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90256, new Class[0], String.class);
    }

    public boolean isSswoAct(Activity activity) {
        return activity instanceof SswoActivity;
    }

    public void onLastActivityDestroy(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 90252, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 90252, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        c.a(context);
    }

    public void registerScreenOnRecevier(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 90259, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 90259, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.awemepushlib.manager.f.a().e(context2);
    }

    public synchronized boolean getConfirmPush(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 90241, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 90241, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        return com.ss.android.ugc.awemepushlib.manager.a.a().d(context);
    }

    public boolean getNotifyEnabled(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 90244, new Class[]{Context.class}, Boolean.TYPE)) {
            return com.ss.android.ugc.awemepushlib.manager.a.a().e(context2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 90244, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
    }

    public void setPushRepeatCheckCallback(d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, changeQuickRedirect, false, 90251, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, changeQuickRedirect, false, 90251, new Class[]{d.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.awemepushlib.di.a.a(com.ss.android.ugc.aweme.framework.e.a.a()).f76981b = dVar2;
    }

    public void notifyAllowNetwork(Context context, boolean z) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 90246, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 90246, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        e.a().a(context2, z);
    }

    public synchronized void setConfirmPush(Context context, boolean z) {
        if (PatchProxy.isSupport(new Object[]{context, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 90242, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Byte.valueOf(z)}, this, changeQuickRedirect, false, 90242, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.awemepushlib.manager.a.a().a(context, z);
    }

    public void setNotifyEnabled(Context context, boolean z) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 90254, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 90254, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.awemepushlib.manager.a.a().b(context2, z);
    }

    public void notifyLoc(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, this, changeQuickRedirect, false, 90257, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str2}, this, changeQuickRedirect, false, 90257, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        e a2 = e.a();
        if (PatchProxy.isSupport(new Object[]{context, str2}, a2, e.f30552a, false, 19084, new Class[]{Context.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context, str2};
            e eVar = a2;
            ChangeQuickRedirect changeQuickRedirect2 = e.f30552a;
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect2, false, 19084, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        b a3 = b.a();
        if (PatchProxy.isSupport(new Object[]{str2}, a3, b.f2543a, false, 19188, new Class[]{String.class}, Void.TYPE)) {
            b bVar = a3;
            PatchProxy.accessDispatch(new Object[]{str2}, bVar, b.f2543a, false, 19188, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a3.f2546c.a().a("loc", str2).a();
    }

    public void registerHttpMonitorServer(Context context, com.ss.android.ugc.awemepushapi.a aVar) {
        com.ss.android.pushmanager.app.a aVar2;
        com.ss.android.ugc.awemepushapi.a aVar3 = aVar;
        if (PatchProxy.isSupport(new Object[]{context, aVar3}, this, changeQuickRedirect, false, 90258, new Class[]{Context.class, com.ss.android.ugc.awemepushapi.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, aVar3}, this, changeQuickRedirect, false, 90258, new Class[]{Context.class, com.ss.android.ugc.awemepushapi.a.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{context}, null, OpenUrlReceiver.f30489a, true, 19016, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, null, OpenUrlReceiver.f30489a, true, 19016, new Class[]{Context.class}, Void.TYPE);
        } else if (context != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.ss.android.action.openurl");
            context.getApplicationContext().registerReceiver(OpenUrlReceiver.a(), intentFilter);
        }
        aVar.getClass();
        if (PatchProxy.isSupport(new Object[]{aVar3}, null, s.f77046a, true, 90261, new Class[]{com.ss.android.ugc.awemepushapi.a.class}, com.ss.android.pushmanager.app.a.class)) {
            Object[] objArr = {aVar3};
            aVar2 = (com.ss.android.pushmanager.app.a) PatchProxy.accessDispatch(objArr, null, s.f77046a, true, 90261, new Class[]{com.ss.android.ugc.awemepushapi.a.class}, com.ss.android.pushmanager.app.a.class);
        } else {
            aVar2 = new s(aVar3);
        }
        OpenUrlReceiver.f30490b = aVar2;
    }

    public void setType(Context context, int i) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90253, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90253, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.awemepushlib.manager.f a2 = com.ss.android.ugc.awemepushlib.manager.f.a();
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i)}, a2, com.ss.android.ugc.awemepushlib.manager.f.f77088a, false, 90345, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {context2, Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            com.ss.android.ugc.awemepushlib.manager.f fVar = a2;
            PatchProxy.accessDispatch(objArr2, fVar, com.ss.android.ugc.awemepushlib.manager.f.f77088a, false, 90345, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a2.a(context2).edit().putInt("screen_on_push_type", i).apply();
    }

    public void trackPush(Context context, int i, Object obj) {
        Context context2 = context;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), obj2}, this, changeQuickRedirect, false, 90248, new Class[]{Context.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i), obj2}, this, changeQuickRedirect, false, 90248, new Class[]{Context.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        MessageAppManager.inst().trackPush(context2, i, obj2);
    }

    public boolean tryUpdateAppSetting(Context context, JSONObject jSONObject, int i) {
        Context context2 = context;
        JSONObject jSONObject2 = jSONObject;
        if (!PatchProxy.isSupport(new Object[]{context2, jSONObject2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90245, new Class[]{Context.class, JSONObject.class, Integer.TYPE}, Boolean.TYPE)) {
            return com.ss.android.ugc.awemepushlib.manager.a.a().a(context2, jSONObject2, i);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, jSONObject2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90245, new Class[]{Context.class, JSONObject.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public void setNotifyEnabled(Context context, Boolean bool, int i) {
        Context context2 = context;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{context2, bool, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90243, new Class[]{Context.class, Boolean.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, bool, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90243, new Class[]{Context.class, Boolean.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        boolean e2 = com.ss.android.ugc.awemepushlib.manager.a.a().e(context2);
        if (e2 != bool.booleanValue()) {
            e a2 = e.a();
            boolean booleanValue = bool.booleanValue();
            if (PatchProxy.isSupport(new Object[]{context2, Byte.valueOf(booleanValue ? (byte) 1 : 0)}, a2, e.f30552a, false, 19083, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
                e eVar = a2;
                PatchProxy.accessDispatch(new Object[]{context2, Byte.valueOf(booleanValue)}, eVar, e.f30552a, false, 19083, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            } else {
                b a3 = b.a();
                Object[] objArr = {Byte.valueOf(booleanValue)};
                if (PatchProxy.isSupport(objArr, a3, b.f2543a, false, 19185, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    Object[] objArr2 = {Byte.valueOf(booleanValue)};
                    Object[] objArr3 = objArr2;
                    b bVar = a3;
                    PatchProxy.accessDispatch(objArr3, bVar, b.f2543a, false, 19185, new Class[]{Boolean.TYPE}, Void.TYPE);
                } else {
                    a3.f2546c.a().a("push_notify_enable", booleanValue).a();
                }
                if (booleanValue) {
                    MessageAppManager.inst().registerAllThirdPush(context2);
                    MessageAppManager.inst().registerSelfPush(context2);
                } else {
                    MessageAppManager.inst().unRegisterAllThirdPush(context2);
                }
                com.ss.android.pushmanager.client.d.a(context2, booleanValue);
            }
        }
        com.ss.android.ugc.awemepushlib.manager.a.a().b(context2, bool.booleanValue());
        if (e2 && com.ss.android.ugc.awemepushlib.manager.a.a().a(context2)) {
            e a4 = e.a();
            if (i > 0) {
                z = true;
            }
            a4.a(context2, z);
            Map<String, String> a5 = k.a();
            if (!com.ss.android.ugc.awemepushlib.c.a.a((Map) a5)) {
                com.ss.android.ugc.awemepushlib.c.a.a((Runnable) new r(context2, a5));
            }
        }
    }

    public void onEvent(Context context, String str, long j, long j2, JSONObject... jSONObjectArr) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{context, str, new Long(j3), new Long(j4), jSONObjectArr}, this, changeQuickRedirect, false, 90247, new Class[]{Context.class, String.class, Long.TYPE, Long.TYPE, JSONObject[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, new Long(j3), new Long(j4), jSONObjectArr}, this, changeQuickRedirect, false, 90247, new Class[]{Context.class, String.class, Long.TYPE, Long.TYPE, JSONObject[].class}, Void.TYPE);
            return;
        }
        k.a(context, str, j, j2, jSONObjectArr);
    }

    public Dialog buildNotificationDialog(Activity activity, String str, String str2, Intent intent, int i) {
        Activity activity2 = activity;
        String str3 = str;
        String str4 = str2;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{activity2, str3, str4, intent2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90255, new Class[]{Activity.class, String.class, String.class, Intent.class, Integer.TYPE}, Dialog.class)) {
            Object[] objArr = {activity2, str3, str4, intent2, Integer.valueOf(i)};
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 90255, new Class[]{Activity.class, String.class, String.class, Intent.class, Integer.TYPE}, Dialog.class);
        }
        if (PatchProxy.isSupport(new Object[]{activity2, str3, str4, intent2, Integer.valueOf(i)}, null, com.ss.android.ugc.awemepushlib.widget.b.f77113a, true, 90449, new Class[]{Activity.class, String.class, String.class, Intent.class, Integer.TYPE}, Dialog.class)) {
            Object[] objArr2 = {activity2, str3, str4, intent2, Integer.valueOf(i)};
            return (Dialog) PatchProxy.accessDispatch(objArr2, null, com.ss.android.ugc.awemepushlib.widget.b.f77113a, true, 90449, new Class[]{Activity.class, String.class, String.class, Intent.class, Integer.TYPE}, Dialog.class);
        }
        Context applicationContext = activity.getApplicationContext();
        b.a aVar = new b.a(activity2);
        aVar.f77120c = str3;
        aVar.f77121d = str4;
        aVar.f77119b = new DialogInterface.OnClickListener(applicationContext, intent2, i) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f77114a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Context f77115b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Intent f77116c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f77117d;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f77114a, false, 90450, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f77114a, false, 90450, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                dialogInterface.dismiss();
                switch (i) {
                    case -2:
                        k.a(this.f77115b, "news_alert_close", (long) this.f77117d, -1, new JSONObject[0]);
                        break;
                    case -1:
                        try {
                            this.f77115b.startActivity(this.f77116c);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                }
            }

            {
                this.f77115b = r1;
                this.f77116c = r2;
                this.f77117d = r3;
            }
        };
        return aVar;
    }

    public void trackClickPush(Context context, long j, boolean z, String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        long j2 = j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, new Long(j2), Byte.valueOf(z ? (byte) 1 : 0), str2, jSONObject}, this, changeQuickRedirect, false, 90249, new Class[]{Context.class, Long.TYPE, Boolean.TYPE, String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, new Long(j2), Byte.valueOf(z), str2, jSONObject}, this, changeQuickRedirect, false, 90249, new Class[]{Context.class, Long.TYPE, Boolean.TYPE, String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (!com.ss.android.ugc.aweme.i18n.c.a()) {
            MessageAppManager.inst().trackClickPush(context, j, z, str, jSONObject);
        } else {
            if (PatchProxy.isSupport(new Object[]{new Long(j2), str2, jSONObject, Byte.valueOf(z)}, null, k.f77027a, true, 90224, new Class[]{Long.TYPE, String.class, JSONObject.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{new Long(j2), str2, jSONObject, Byte.valueOf(z)}, null, k.f77027a, true, 90224, new Class[]{Long.TYPE, String.class, JSONObject.class, Boolean.TYPE}, Void.TYPE);
            } else {
                if (jSONObject == null) {
                    try {
                        jSONObject2 = new JSONObject();
                    } catch (Exception unused) {
                    }
                } else {
                    jSONObject2 = jSONObject;
                }
                if (z) {
                    jSONObject2.put("click_position", "notify");
                } else {
                    jSONObject2.put("click_position", "alert");
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject2.put("post_back", str2);
                }
                jSONObject2.put("rule_id", j2);
                AppLogNewUtils.onEventV3("push_click", jSONObject2);
            }
        }
        Application a2 = com.ss.android.ugc.aweme.framework.e.a.a();
        final long j3 = j;
        final boolean z2 = z;
        final String str3 = str;
        final JSONObject jSONObject3 = jSONObject;
        AnonymousClass1 r0 = new Application.ActivityLifecycleCallbacks() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f76999a;

            public final void onActivityCreated(Activity activity, Bundle bundle) {
            }

            public final void onActivityDestroyed(Activity activity) {
            }

            public final void onActivityPaused(Activity activity) {
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityStarted(Activity activity) {
            }

            public final void onActivityStopped(Activity activity) {
            }

            public final void onActivityResumed(Activity activity) {
                if (PatchProxy.isSupport(new Object[]{activity}, this, f76999a, false, 90263, new Class[]{Activity.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{activity}, this, f76999a, false, 90263, new Class[]{Activity.class}, Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.framework.e.a.a().unregisterActivityLifecycleCallbacks(this);
                com.ss.android.b.a.a.a.b(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f77005a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f77005a, false, 90264, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f77005a, false, 90264, new Class[0], Void.TYPE);
                            return;
                        }
                        long j = j3;
                        boolean z = z2;
                        String str = str3;
                        JSONObject jSONObject = jSONObject3;
                        if (PatchProxy.isSupport(new Object[]{new Long(j), Byte.valueOf(z ? (byte) 1 : 0), str, jSONObject}, null, k.f77027a, true, 90223, new Class[]{Long.TYPE, Boolean.TYPE, String.class, JSONObject.class}, Void.TYPE)) {
                            Object[] objArr = {new Long(j), Byte.valueOf(z), str, jSONObject};
                            Object[] objArr2 = objArr;
                            PatchProxy.accessDispatch(objArr2, null, k.f77027a, true, 90223, new Class[]{Long.TYPE, Boolean.TYPE, String.class, JSONObject.class}, Void.TYPE);
                            return;
                        }
                        if (jSONObject == null) {
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        if (z) {
                            jSONObject.put("click_position", "notify");
                        } else {
                            jSONObject.put("click_position", "alert");
                        }
                        if (!TextUtils.isEmpty(str)) {
                            jSONObject.put("post_back", str);
                        }
                        jSONObject.put("rule_id", j);
                        AppLogNewUtils.onEventV3("push_click_v2", jSONObject);
                    }
                });
            }
        };
        a2.registerActivityLifecycleCallbacks(r0);
    }

    public void init(Context context, com.ss.android.ugc.awemepushapi.b bVar, boolean z, com.ss.android.ugc.awemepushapi.e eVar, g gVar) {
        Context context2 = context;
        com.ss.android.ugc.awemepushapi.b bVar2 = bVar;
        boolean z2 = z;
        g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{context2, bVar2, Byte.valueOf(z ? (byte) 1 : 0), eVar, gVar2}, this, changeQuickRedirect, false, 90250, new Class[]{Context.class, com.ss.android.ugc.awemepushapi.b.class, Boolean.TYPE, com.ss.android.ugc.awemepushapi.e.class, g.class}, Void.TYPE)) {
            Object[] objArr = {context2, bVar2, Byte.valueOf(z), eVar, gVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 90250, new Class[]{Context.class, com.ss.android.ugc.awemepushapi.b.class, Boolean.TYPE, com.ss.android.ugc.awemepushapi.e.class, g.class}, Void.TYPE);
            return;
        }
        Object[] objArr3 = {context2, bVar2, Byte.valueOf(z), eVar, gVar2};
        if (PatchProxy.isSupport(objArr3, null, PushInitializer.f76989a, true, 90225, new Class[]{Context.class, com.ss.android.ugc.awemepushapi.b.class, Boolean.TYPE, com.ss.android.ugc.awemepushapi.e.class, g.class}, Void.TYPE)) {
            Object[] objArr4 = {context2, bVar2, Byte.valueOf(z), eVar, gVar2};
            Object[] objArr5 = objArr4;
            PatchProxy.accessDispatch(objArr5, null, PushInitializer.f76989a, true, 90225, new Class[]{Context.class, com.ss.android.ugc.awemepushapi.b.class, Boolean.TYPE, com.ss.android.ugc.awemepushapi.e.class, g.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.g.a.a()) {
            MessageAppManager.inst().setDefaultChannelName(false, "");
            MessageAppManager.inst().setIExtraMessageDepend(new com.ss.android.pushmanager.b() {
                public final java.lang.String a(
/*
Method generation error in method: com.ss.android.ugc.awemepushlib.interaction.PushInitializer.1.a():java.lang.String, dex: classes6.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.awemepushlib.interaction.PushInitializer.1.a():java.lang.String, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                
*/
            });
        }
        j.a(eVar);
        f.j = new com.ss.android.ugc.awemepushlib.di.b();
        com.bytedance.ies.common.push.a.a.f20216a.f20217b = new com.ss.android.ugc.awemepushlib.b.a();
        com.ss.android.newmedia.message.localpush.b a2 = com.ss.android.newmedia.message.localpush.b.a(context);
        com.ss.android.ugc.awemepushlib.di.a a3 = com.ss.android.ugc.awemepushlib.di.a.a(context);
        synchronized (com.ss.android.newmedia.message.localpush.b.class) {
            if (!a2.f30243b) {
                a2.f30244c = a3;
                a2.f30243b = true;
            }
        }
        MessageAppManager.inst().initPushSetting(context2);
        MessageAppManager.inst().setDebuggable(com.ss.android.ugc.aweme.framework.core.a.b().f3306d);
        if (z2) {
            com.ss.android.ugc.awemepushlib.manager.a.a().a(context2, true);
            com.ss.android.ugc.awemepushlib.manager.a.a().f(context2);
            com.ss.android.push.window.oppo.c.a(context2, new com.ss.android.ugc.awemepushlib.di.c());
            com.ss.android.ugc.awemepushlib.manager.a.a().f77067d = com.ss.android.ugc.aweme.aj.b.b().b(context2, "is_allow_oppo_push", true);
            com.ss.android.ugc.awemepushlib.b.c a4 = com.ss.android.ugc.awemepushlib.b.c.a();
            if (PatchProxy.isSupport(new Object[]{gVar2}, a4, com.ss.android.ugc.awemepushlib.b.c.f76967a, false, 90371, new Class[]{g.class}, Void.TYPE)) {
                com.ss.android.ugc.awemepushlib.b.c cVar = a4;
                PatchProxy.accessDispatch(new Object[]{gVar2}, cVar, com.ss.android.ugc.awemepushlib.b.c.f76967a, false, 90371, new Class[]{g.class}, Void.TYPE);
            } else {
                if (a4.f76969b == null) {
                    a4.f76969b = new ArrayList();
                }
                if (!a4.f76969b.contains(gVar2)) {
                    a4.f76969b.add(gVar2);
                }
            }
            AwemeRedBadgerManager a5 = AwemeRedBadgerManager.a();
            if (PatchProxy.isSupport(new Object[0], a5, AwemeRedBadgerManager.f77048a, false, 90299, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], a5, AwemeRedBadgerManager.f77048a, false, 90299, new Class[0], Void.TYPE);
            } else {
                ProcessLifecycleOwner.get().getLifecycle().addObserver(a5);
            }
            j.a().setMainObserver(new b(context2));
            if (PatchProxy.isSupport(new Object[0], null, PushInitializer.f76989a, true, 90226, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, PushInitializer.f76989a, true, 90226, new Class[0], Void.TYPE);
            } else {
                if (com.ss.android.ugc.aweme.g.a.a()) {
                    MessageAppManager.inst().setMonitorEnable(!Debug.isDebuggerConnected());
                }
                MessageAppManager.inst().setMonitorImpl(new com.ss.android.pushmanager.a.a() {

                    /* renamed from: a */
                    public static ChangeQuickRedirect f76998a;

                    public final void a(
/*
Method generation error in method: com.ss.android.ugc.awemepushlib.interaction.PushInitializer.3.a(java.lang.String, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject):void, dex: classes6.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.awemepushlib.interaction.PushInitializer.3.a(java.lang.String, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject):void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                    
*/
                });
            }
        }
        if (PatchProxy.isSupport(new Object[0], null, PushInitializer.f76989a, true, 90231, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, PushInitializer.f76989a, true, 90231, new Class[0], Void.TYPE);
        } else {
            try {
                Reflect call = Reflect.on(Class.forName("android.app.ActivityThread")).call("currentActivityThread");
                if (call != null) {
                    Class<?> cls = Class.forName("android.app.ActivityThread$H");
                    Reflect on = Reflect.on(Class.forName("android.app.ActivityThread$H"));
                    int intValue = ((Integer) on.field("SCHEDULE_CRASH", new Class[0]).get()).intValue();
                    int intValue2 = ((Integer) on.field("RECEIVER", new Class[0]).get()).intValue();
                    int intValue3 = ((Integer) on.field("CREATE_SERVICE", new Class[0]).get()).intValue();
                    int intValue4 = ((Integer) on.field("BIND_SERVICE", new Class[0]).get()).intValue();
                    int intValue5 = ((Integer) on.field("SERVICE_ARGS", new Class[0]).get()).intValue();
                    Handler handler = (Handler) call.field("mH", cls).get();
                    if (handler != null) {
                        Reflect on2 = Reflect.on((Object) handler);
                        o oVar = new o(intValue, intValue2, intValue3, intValue4, intValue5, (Handler.Callback) on2.field("mCallback", Handler.Callback.class).get());
                        on2.set("mCallback", oVar);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        PushInitializer.f76992d.addFirst(new Runnable(z2, context2, bVar2) {

            /* renamed from: a */
            public static ChangeQuickRedirect f76994a;

            /* renamed from: b */
            final /* synthetic */ boolean f76995b;

            /* renamed from: c */
            final /* synthetic */ Context f76996c;

            /* renamed from: d */
            final /* synthetic */ com.ss.android.ugc.awemepushapi.b f76997d;

            public final void run(
/*
Method generation error in method: com.ss.android.ugc.awemepushlib.interaction.PushInitializer.2.run():void, dex: classes6.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.awemepushlib.interaction.PushInitializer.2.run():void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
            
*/
        });
        if (z2) {
            PushInitializer.f76991c.execute(l.f77029b);
        } else {
            PushInitializer.a(4);
        }
    }
}
