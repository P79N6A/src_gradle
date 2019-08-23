package com.umeng.message;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.common.d;
import com.umeng.message.proguard.m;
import java.util.Iterator;

public class UmengMessageBootReceiver extends BroadcastReceiver {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final String f81129b = "com.umeng.message.UmengMessageBootReceiver";

    /* renamed from: a  reason: collision with root package name */
    Runnable f81130a = new Runnable() {
        public void run() {
            try {
                Iterator<m.c> it2 = m.a(UmengMessageBootReceiver.this.f81131d).b().iterator();
                while (it2.hasNext()) {
                    m.c next = it2.next();
                    if (m.a(UmengMessageBootReceiver.this.f81131d).a(next.f81312a) == null && next.f81313b.equals("notification")) {
                        m.a(UmengMessageBootReceiver.this.f81131d).a(next.f81312a, 2, System.currentTimeMillis(), "");
                    }
                }
                Iterator<m.d> it3 = m.a(UmengMessageBootReceiver.this.f81131d).d().iterator();
                while (it3.hasNext()) {
                    m.d next2 = it3.next();
                    if (m.a(UmengMessageBootReceiver.this.f81131d).c(next2.f81315a) == null && next2.f81317c.equals("notification")) {
                        m.a(UmengMessageBootReceiver.this.f81131d).a(next2.f81315a, next2.f81316b, "9", System.currentTimeMillis());
                    }
                }
            } catch (Exception e2) {
                UMLog.mutlInfo(UmengMessageBootReceiver.f81129b, 2, e2.toString());
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Context f81131d;

    public void onReceive(Context context, Intent intent) {
        try {
            UMLog.mutlInfo(f81129b, 2, "Boot this system , UmengMessageBootReceiver onReceive()");
            String action = intent.getAction();
            if (action != null) {
                if (!action.equals("")) {
                    String str = f81129b;
                    UMLog.mutlInfo(str, 2, "action=" + intent.getAction());
                    if (TextUtils.equals(intent.getAction(), "android.intent.action.BOOT_COMPLETED")) {
                        this.f81131d = context;
                        d.a(this.f81130a);
                    }
                }
            }
        } catch (Exception e2) {
            UMLog.mutlInfo(f81129b, 0, e2.toString());
        }
    }
}
