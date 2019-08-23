package com.ss.android.message;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.pushmanager.setting.b;
import com.ss.android.ugc.aweme.q.c;
import java.text.DateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class MessageReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29791a;

    /* renamed from: b  reason: collision with root package name */
    private Handler f29792b = new Handler();

    public void onReceive(Context context, Intent intent) {
        long j;
        final Context context2 = context;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{context2, intent}, this, f29791a, false, 17843, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, intent}, this, f29791a, false, 17843, new Class[]{Context.class, Intent.class}, Void.TYPE);
        } else if (context2 != null && intent != null) {
            final String action = intent.getAction();
            final Uri data = intent.getData();
            if (!"android.intent.action.DATE_CHANGED".equals(action)) {
                a(context.getApplicationContext(), action, data);
                return;
            }
            if (PatchProxy.isSupport(new Object[]{context2}, this, f29791a, false, 17845, new Class[]{Context.class}, Long.TYPE)) {
                j = ((Long) PatchProxy.accessDispatch(new Object[]{context2}, this, f29791a, false, 17845, new Class[]{Context.class}, Long.TYPE)).longValue();
            } else {
                Context applicationContext = context.getApplicationContext();
                if (Build.VERSION.SDK_INT >= 11) {
                    i = 4;
                }
                j = c.a(applicationContext, "push_multi_process_config", i).getLong("date_change_delay_interval", 0);
            }
            long j2 = j;
            if (j2 > 0) {
                long nextFloat = (long) (new Random((long) UUID.randomUUID().hashCode()).nextFloat() * ((float) j2));
                this.f29792b.postDelayed(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f29793a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f29793a, false, 17848, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f29793a, false, 17848, new Class[0], Void.TYPE);
                            return;
                        }
                        MessageReceiver.this.a(context2.getApplicationContext(), action, data);
                    }
                }, nextFloat);
                a(action, j2, nextFloat);
            } else if (j2 == 0) {
                a(context.getApplicationContext(), action, data);
                a(action, 0, 0);
            } else {
                a(action, -1, -1);
            }
        }
    }

    public final void a(Context context, String str, Uri uri) {
        final Context context2 = context;
        final String str2 = str;
        final Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{context2, str2, uri2}, this, f29791a, false, 17846, new Class[]{Context.class, String.class, Uri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2, uri2}, this, f29791a, false, 17846, new Class[]{Context.class, String.class, Uri.class}, Void.TYPE);
            return;
        }
        ThreadPlus.submitRunnable(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f29798a;

            public final void run() {
                String str;
                if (PatchProxy.isSupport(new Object[0], this, f29798a, false, 17849, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f29798a, false, 17849, new Class[0], Void.TYPE);
                    return;
                }
                MessageReceiver messageReceiver = MessageReceiver.this;
                Context context = context2;
                String str2 = str2;
                Uri uri = uri2;
                if (PatchProxy.isSupport(new Object[]{context, str2, uri}, messageReceiver, MessageReceiver.f29791a, false, 17847, new Class[]{Context.class, String.class, Uri.class}, Void.TYPE)) {
                    Object[] objArr = {context, str2, uri};
                    MessageReceiver messageReceiver2 = messageReceiver;
                    PatchProxy.accessDispatch(objArr, messageReceiver2, MessageReceiver.f29791a, false, 17847, new Class[]{Context.class, String.class, Uri.class}, Void.TYPE);
                    return;
                }
                com.ss.android.push.daemon.c.a(context).a();
                if (!TextUtils.isEmpty(str2) && (!"android.intent.action.BOOT_COMPLETED".equals(str2) || !b.a().j())) {
                    if (b.a().b()) {
                        try {
                            com.ss.android.message.b.b.a(context);
                        } catch (Throwable unused) {
                        }
                    } else if ("android.intent.action.BOOT_COMPLETED".equals(str2)) {
                        try {
                            if (!b.a().j()) {
                                Logger.debug();
                                h.d(context);
                            }
                        } catch (Exception unused2) {
                        }
                    } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(str2)) {
                        try {
                            Logger.debug();
                            h.d(context);
                        } catch (Exception unused3) {
                        }
                    } else if ("android.intent.action.DATE_CHANGED".equals(str2)) {
                        try {
                            Logger.debug();
                            h.d(context);
                        } catch (Exception unused4) {
                        }
                    } else if ("android.intent.action.MEDIA_MOUNTED".equals(str2)) {
                        try {
                            Logger.debug();
                            h.d(context);
                        } catch (Exception unused5) {
                        }
                    } else if ("android.intent.action.MEDIA_UNMOUNTED".equals(str2)) {
                        try {
                            Logger.debug();
                            h.d(context);
                        } catch (Exception unused6) {
                        }
                    } else if ("android.intent.action.USER_PRESENT".equals(str2)) {
                        try {
                            Logger.debug();
                            h.d(context);
                        } catch (Exception unused7) {
                        }
                    } else if ("android.intent.action.SCREEN_OFF".equals(str2)) {
                        try {
                            Logger.debug();
                            h.d(context);
                        } catch (Exception unused8) {
                        }
                    } else if ("android.intent.action.SCREEN_ON".equals(str2)) {
                        try {
                            Logger.debug();
                            h.d(context);
                        } catch (Exception unused9) {
                        }
                    } else if ("android.intent.action.PACKAGE_ADDED".equals(str2)) {
                        try {
                            Logger.debug();
                            h.d(context);
                        } catch (Exception unused10) {
                        }
                    } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(str2)) {
                        try {
                            Logger.debug();
                            h.d(context);
                        } catch (Exception unused11) {
                        }
                    } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(str2)) {
                        try {
                            Logger.debug();
                            h.d(context);
                        } catch (Exception unused12) {
                        }
                    } else if ("android.intent.action.PACKAGE_REMOVED".equals(str2)) {
                        if (uri != null) {
                            try {
                                str = uri.getSchemeSpecificPart();
                            } catch (Exception unused13) {
                            }
                        } else {
                            str = null;
                        }
                        Logger.debug();
                        if (!StringUtils.isEmpty(str)) {
                            Intent b2 = h.b(context);
                            b2.putExtra("remove_app", true);
                            b2.putExtra("remove_app_package", str);
                            context.startService(b2);
                        }
                    }
                }
            }
        });
    }

    private void a(String str, long j, long j2) {
        String str2 = str;
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j3), new Long(j4)}, this, f29791a, false, 17844, new Class[]{String.class, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {str2, new Long(j3), new Long(j4)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f29791a, false, 17844, new Class[]{String.class, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("time", DateFormat.getDateTimeInstance().format(new Date()));
            bundle.putString("way", str2);
            bundle.putLong("max_delay", j3);
            bundle.putLong("real_delay", j4);
            com.ss.android.message.log.c.a("push_alive", bundle);
        } catch (Throwable unused) {
        }
    }
}
