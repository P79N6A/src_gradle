package com.ss.android.ugc.aweme.feedback;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.a.b;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.utils.bg;
import java.io.File;

public class k implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47186a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f47187b = new Handler(this.f47188c.getMainLooper(), this);

    /* renamed from: c  reason: collision with root package name */
    public Context f47188c;

    /* renamed from: d  reason: collision with root package name */
    public b f47189d;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f47186a, false, 43809, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47186a, false, 43809, new Class[0], Void.TYPE);
            return;
        }
        if (this.f47187b != null) {
            a.a(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f47190a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f47190a, false, 43817, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f47190a, false, 43817, new Class[0], Void.TYPE);
                        return;
                    }
                    try {
                        long a2 = b.a(k.this.f47188c).a(true);
                        if (k.this.f47188c.getFilesDir() != null) {
                            File file = new File(k.this.f47188c.getFilesDir().getParent() + "/shared_prefs", "feedback_last_time.xml");
                            if (file.exists()) {
                                if (a2 <= 0) {
                                    SharedPreferences a3 = c.a(k.this.f47188c, "feedback_last_time", 0);
                                    if (a3.contains("key_last_time")) {
                                        a2 = a3.getLong("key_last_time", -1);
                                    }
                                }
                                file.delete();
                            }
                        }
                        long j = a2;
                        if (j > 0) {
                            o oVar = new o(0, j, 50, 0, 2);
                            new FeedbackThread2(k.this.f47187b, k.this.f47188c, oVar).start();
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    private k(Context context) {
        this.f47188c = context.getApplicationContext();
    }

    public static k a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f47186a, true, 43808, new Class[]{Context.class}, k.class)) {
            return new k(context2);
        }
        return (k) PatchProxy.accessDispatch(new Object[]{context2}, null, f47186a, true, 43808, new Class[]{Context.class}, k.class);
    }

    public boolean handleMessage(Message message) {
        boolean z;
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f47186a, false, 43810, new Class[]{Message.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{message2}, this, f47186a, false, 43810, new Class[]{Message.class}, Boolean.TYPE)).booleanValue();
        } else if (message2.what != 10 || !(message2.obj instanceof o)) {
            return false;
        } else {
            o oVar = (o) message2.obj;
            if (PatchProxy.isSupport(new Object[]{oVar}, this, f47186a, false, 43811, new Class[]{o.class}, Boolean.TYPE)) {
                ((Boolean) PatchProxy.accessDispatch(new Object[]{oVar}, this, f47186a, false, 43811, new Class[]{o.class}, Boolean.TYPE)).booleanValue();
            } else if (oVar != null && (!CollectionUtils.isEmpty(oVar.g))) {
                if (PatchProxy.isSupport(new Object[0], this, f47186a, false, 43812, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f47186a, false, 43812, new Class[0], Void.TYPE);
                } else {
                    Activity f2 = AwemeAppData.p().f();
                    if (!(f2 instanceof FeedbackActivity)) {
                        if ((f2 instanceof AbsActivity) && ((AbsActivity) f2).isActive()) {
                            if (PatchProxy.isSupport(new Object[0], this, f47186a, false, 43813, new Class[0], Boolean.TYPE)) {
                                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f47186a, false, 43813, new Class[0], Boolean.TYPE)).booleanValue();
                            } else if (AwemeAppData.p().g || AwemeAppData.p().b() > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                bg.a(new c());
                            }
                        }
                        AwemeAppData.p().f2501f = true;
                    }
                }
            }
            return false;
        }
    }
}
