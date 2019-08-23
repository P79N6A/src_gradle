package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.v4.app.NotificationManagerCompat;
import android.text.TextUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.main.bp;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import java.util.Map;

public final class cy {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75714a;

    public interface a {
    }

    public static boolean a(Context context) {
        int i;
        if (PatchProxy.isSupport(new Object[]{context}, null, f75714a, true, 88461, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f75714a, true, 88461, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            if (Build.VERSION.SDK_INT > 19) {
                return NotificationManagerCompat.from(context).areNotificationsEnabled();
            }
            if (PatchProxy.isSupport(new Object[]{context}, null, cx.f75713a, true, 88452, new Class[]{Context.class}, Integer.TYPE)) {
                i = ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, cx.f75713a, true, 88452, new Class[]{Context.class}, Integer.TYPE)).intValue();
            } else {
                int a2 = cx.a(context);
                if (a2 == 0) {
                    i = 0;
                } else if (a2 == 1) {
                    i = 1;
                } else {
                    i = -1;
                }
            }
            if (i == 1) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void b(Context context, boolean z) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f75714a, true, 88465, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Byte.valueOf(z)}, null, f75714a, true, 88465, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(context2, z, null, null);
    }

    public static boolean a(Context context, boolean z) {
        int i;
        int i2;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f75714a, true, 88464, new Class[]{Context.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, Byte.valueOf(z)}, null, f75714a, true, 88464, new Class[]{Context.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        SharedPreferences a2 = c.a(context2, "NotificationGuide", 0);
        if (a(context)) {
            return false;
        }
        if (z) {
            return true;
        }
        int i3 = a2.getInt("guide_show_times", 0);
        AbTestManager a3 = AbTestManager.a();
        if (PatchProxy.isSupport(new Object[0], a3, AbTestManager.f63777a, false, 71718, new Class[0], Integer.TYPE)) {
            i = ((Integer) PatchProxy.accessDispatch(new Object[0], a3, AbTestManager.f63777a, false, 71718, new Class[0], Integer.TYPE)).intValue();
        } else {
            if (a3.f63780d == null) {
                AbTestModel d2 = a3.d();
                if (d2 == null) {
                    a3.f63780d = 1;
                } else {
                    a3.f63780d = Integer.valueOf(d2.showPushPrePermissionViewMaxTimes);
                }
                if (a3.f63780d.intValue() <= 0) {
                    a3.f63780d = 1;
                }
            }
            i = a3.f63780d.intValue();
        }
        if (i3 >= i) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - a2.getLong("guide_last_time", 0);
        AbTestManager a4 = AbTestManager.a();
        if (PatchProxy.isSupport(new Object[0], a4, AbTestManager.f63777a, false, 71719, new Class[0], Integer.TYPE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], a4, AbTestManager.f63777a, false, 71719, new Class[0], Integer.TYPE)).intValue();
        } else {
            if (a4.f63781e == null) {
                AbTestModel d3 = a4.d();
                if (d3 == null) {
                    a4.f63781e = 0;
                } else {
                    a4.f63781e = Integer.valueOf(d3.showPushPrePermissionViewInterval);
                }
            }
            i2 = a4.f63781e.intValue();
        }
        if (currentTimeMillis < ((long) i2) * 60000) {
            return false;
        }
        return true;
    }

    private static void a(Context context, boolean z, Runnable runnable, a aVar) {
        final Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Byte.valueOf(z ? (byte) 1 : 0), null, null}, null, f75714a, true, 88468, new Class[]{Context.class, Boolean.TYPE, Runnable.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Byte.valueOf(z), null, null}, null, f75714a, true, 88468, new Class[]{Context.class, Boolean.TYPE, Runnable.class, a.class}, Void.TYPE);
            return;
        }
        bp bpVar = (bp) com.ss.android.ugc.aweme.base.sharedpref.c.a(context2, bp.class);
        if (a(context, z) && Build.VERSION.SDK_INT >= 21) {
            try {
                if ((context2 instanceof Activity) && !((Activity) context2).isFinishing()) {
                    final boolean z2 = z;
                    com.ss.android.b.a.a.a.b(new Runnable(null, null) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f75715a;

                        public final void run() {
                            String str;
                            if (PatchProxy.isSupport(new Object[0], this, f75715a, false, 88470, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f75715a, false, 88470, new Class[0], Void.TYPE);
                                return;
                            }
                            Activity activity = (Activity) context2;
                            if (z2) {
                                str = context2.getString(C0906R.string.a51);
                            } else {
                                str = (String) SharePrefCache.inst().getRequestNotificationText().c();
                                if (TextUtils.isEmpty(str)) {
                                    str = context2.getString(C0906R.string.a50);
                                }
                            }
                            String str2 = (String) SharePrefCache.inst().getRequestNotificationTitle().c();
                            if (TextUtils.isEmpty(str2)) {
                                str2 = context2.getString(C0906R.string.clp);
                            }
                            com.bytedance.ies.dmt.ui.b.a a2 = new a.C0185a(context2).c(2130840181).a(str2).b(str).a((int) C0906R.string.om, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f75722a;

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f75722a, false, 88473, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f75722a, false, 88473, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    try {
                                        cx.b(context2);
                                    } catch (Exception unused) {
                                        context2.startActivity(new Intent("android.settings.SETTINGS"));
                                    }
                                    if (z2) {
                                        r.a("notification_setting_alert_click", (Map) d.a().a("enter_from", "notification_setting_page").f34114b);
                                    } else {
                                        r.a("push_pre_permission_auth", (Map) d.a().f34114b);
                                    }
                                    if (dialogInterface != null) {
                                        dialogInterface.dismiss();
                                    }
                                    SharedPreferences a2 = c.a(context2, "NotificationGuide", 0);
                                    SharedPreferences.Editor edit = a2.edit();
                                    edit.putInt("guide_show_times", a2.getInt("guide_show_times", 0) + 1);
                                    edit.putLong("guide_last_time", System.currentTimeMillis());
                                    edit.apply();
                                    if (null != null) {
                                        null.run();
                                    }
                                }
                            }, true).b((int) C0906R.string.b51, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f75720a;

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f75720a, false, 88472, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f75720a, false, 88472, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    dialogInterface.dismiss();
                                    if (z2) {
                                        r.a("notification_setting_alert_close", (Map) d.a().a("enter_from", "notification_setting_page").f34114b);
                                    } else {
                                        r.a("push_pre_permission_deny", (Map) d.a().f34114b);
                                    }
                                    SharedPreferences a2 = c.a(context2, "NotificationGuide", 0);
                                    SharedPreferences.Editor edit = a2.edit();
                                    edit.putInt("guide_show_times", a2.getInt("guide_show_times", 0) + 1);
                                    edit.putLong("guide_last_time", System.currentTimeMillis());
                                    edit.apply();
                                    if (null != null) {
                                        null.run();
                                    }
                                }
                            }, true).a();
                            if (!activity.isFinishing()) {
                                try {
                                    Dialog b2 = a2.b();
                                    b2.setCanceledOnTouchOutside(false);
                                    b2.setOnDismissListener(new cz(null));
                                    if (z2) {
                                        r.a("notification_setting_alert_show", (Map) d.a().a("enter_from", "notification_setting_page").f34114b);
                                    } else {
                                        r.a("push_pre_permission_show", (Map) d.a().f34114b);
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }
                    });
                    bpVar.a(true);
                }
            } catch (Exception unused) {
            }
        }
    }
}
