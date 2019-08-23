package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ip;
import com.xiaomi.push.service.ag;
import java.util.HashMap;
import java.util.Map;

public class g implements AbstractPushManager {

    /* renamed from: a  reason: collision with root package name */
    private static volatile g f81794a;

    /* renamed from: a  reason: collision with other field name */
    private Context f126a;

    /* renamed from: a  reason: collision with other field name */
    private PushConfiguration f127a;

    /* renamed from: a  reason: collision with other field name */
    private Map<f, AbstractPushManager> f128a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with other field name */
    public boolean f129a;

    private g(Context context) {
        this.f126a = context.getApplicationContext();
    }

    public static g a(Context context) {
        if (f81794a == null) {
            synchronized (g.class) {
                try {
                    if (f81794a == null) {
                        f81794a = new g(context);
                    }
                } catch (Throwable th) {
                    Class<g> cls = g.class;
                    throw th;
                }
            }
        }
        return f81794a;
    }

    private void a() {
        if (this.f127a != null) {
            if (this.f127a.getOpenHmsPush()) {
                StringBuilder sb = new StringBuilder("ASSEMBLE_PUSH : ");
                sb.append(" HW user switch : " + this.f127a.getOpenHmsPush() + " HW online switch : " + j.a(this.f126a, f.ASSEMBLE_PUSH_HUAWEI) + " HW isSupport : " + ap.HUAWEI.equals(o.a(this.f126a)));
                b.a(sb.toString());
            }
            if (this.f127a.getOpenHmsPush() && j.a(this.f126a, f.ASSEMBLE_PUSH_HUAWEI) && ap.HUAWEI.equals(o.a(this.f126a))) {
                if (!a(f.ASSEMBLE_PUSH_HUAWEI)) {
                    a(f.ASSEMBLE_PUSH_HUAWEI, at.a(this.f126a, f.ASSEMBLE_PUSH_HUAWEI));
                }
                b.c("hw manager add to list");
            } else if (a(f.ASSEMBLE_PUSH_HUAWEI)) {
                AbstractPushManager a2 = a(f.ASSEMBLE_PUSH_HUAWEI);
                if (a2 != null) {
                    a(f.ASSEMBLE_PUSH_HUAWEI);
                    a2.unregister();
                }
            }
            if (this.f127a.getOpenFCMPush()) {
                StringBuilder sb2 = new StringBuilder("ASSEMBLE_PUSH : ");
                sb2.append(" FCM user switch : " + this.f127a.getOpenFCMPush() + " FCM online switch : " + j.a(this.f126a, f.ASSEMBLE_PUSH_FCM) + " FCM isSupport : " + o.a(this.f126a));
                b.a(sb2.toString());
            }
            if (this.f127a.getOpenFCMPush() && j.a(this.f126a, f.ASSEMBLE_PUSH_FCM) && o.a(this.f126a)) {
                if (!a(f.ASSEMBLE_PUSH_FCM)) {
                    a(f.ASSEMBLE_PUSH_FCM, at.a(this.f126a, f.ASSEMBLE_PUSH_FCM));
                }
                b.c("fcm manager add to list");
            } else if (a(f.ASSEMBLE_PUSH_FCM)) {
                AbstractPushManager a3 = a(f.ASSEMBLE_PUSH_FCM);
                if (a3 != null) {
                    a(f.ASSEMBLE_PUSH_FCM);
                    a3.unregister();
                }
            }
            if (this.f127a.getOpenCOSPush()) {
                StringBuilder sb3 = new StringBuilder("ASSEMBLE_PUSH : ");
                sb3.append(" COS user switch : " + this.f127a.getOpenCOSPush() + " COS online switch : " + j.a(this.f126a, f.ASSEMBLE_PUSH_COS) + " COS isSupport : " + o.b(this.f126a));
                b.a(sb3.toString());
            }
            if (this.f127a.getOpenCOSPush() && j.a(this.f126a, f.ASSEMBLE_PUSH_COS) && o.b(this.f126a)) {
                a(f.ASSEMBLE_PUSH_COS, at.a(this.f126a, f.ASSEMBLE_PUSH_COS));
            } else if (a(f.ASSEMBLE_PUSH_COS)) {
                AbstractPushManager a4 = a(f.ASSEMBLE_PUSH_COS);
                if (a4 != null) {
                    a(f.ASSEMBLE_PUSH_COS);
                    a4.unregister();
                }
            }
            if (this.f127a.getOpenFTOSPush() && j.a(this.f126a, f.ASSEMBLE_PUSH_FTOS) && o.c(this.f126a)) {
                a(f.ASSEMBLE_PUSH_FTOS, at.a(this.f126a, f.ASSEMBLE_PUSH_FTOS));
            } else if (a(f.ASSEMBLE_PUSH_FTOS)) {
                AbstractPushManager a5 = a(f.ASSEMBLE_PUSH_FTOS);
                if (a5 != null) {
                    a(f.ASSEMBLE_PUSH_FTOS);
                    a5.unregister();
                }
            }
        }
    }

    public AbstractPushManager a(f fVar) {
        return this.f128a.get(fVar);
    }

    public void a(PushConfiguration pushConfiguration) {
        this.f127a = pushConfiguration;
        this.f129a = ag.a(this.f126a).a(ip.AggregatePushSwitch.a(), true);
        if (this.f127a.getOpenHmsPush() || this.f127a.getOpenFCMPush() || this.f127a.getOpenCOSPush()) {
            ag.a(this.f126a).a((ag.a) new h(this, BaseLoginOrRegisterActivity.o, "assemblePush"));
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m69a(f fVar) {
        this.f128a.remove(fVar);
    }

    public void a(f fVar, AbstractPushManager abstractPushManager) {
        if (abstractPushManager != null) {
            if (this.f128a.containsKey(fVar)) {
                this.f128a.remove(fVar);
            }
            this.f128a.put(fVar, abstractPushManager);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m70a(f fVar) {
        return this.f128a.containsKey(fVar);
    }

    public boolean b(f fVar) {
        boolean z = false;
        switch (i.f81796a[fVar.ordinal()]) {
            case 1:
                if (this.f127a != null) {
                    return this.f127a.getOpenHmsPush();
                }
                return false;
            case 2:
                if (this.f127a != null) {
                    return this.f127a.getOpenFCMPush();
                }
                return false;
            case 3:
                if (this.f127a != null) {
                    z = this.f127a.getOpenCOSPush();
                    break;
                }
                break;
            case 4:
                break;
            default:
                return false;
        }
        return this.f127a != null ? this.f127a.getOpenFTOSPush() : z;
    }

    public void register() {
        b.a("ASSEMBLE_PUSH : assemble push register");
        if (this.f128a.size() <= 0) {
            a();
        }
        if (this.f128a.size() > 0) {
            for (AbstractPushManager next : this.f128a.values()) {
                if (next != null) {
                    next.register();
                }
            }
            j.a(this.f126a);
        }
    }

    public void unregister() {
        b.a("ASSEMBLE_PUSH : assemble push unregister");
        for (AbstractPushManager next : this.f128a.values()) {
            if (next != null) {
                next.unregister();
            }
        }
        this.f128a.clear();
    }
}
