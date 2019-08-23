package com.bytedance.android.livesdk.y;

import android.app.Dialog;
import android.content.Context;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.h.c;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.v.h;
import com.bytedance.android.livesdk.w.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.Calendar;
import java.util.Date;

public final class a implements com.bytedance.android.livesdk.l.a.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18603a;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f18604c;

    /* renamed from: b  reason: collision with root package name */
    private Dialog f18605b;

    /* renamed from: com.bytedance.android.livesdk.y.a$a  reason: collision with other inner class name */
    public static final class C0129a implements h.b<com.bytedance.android.livesdk.l.a.a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18606a;

        @NonNull
        public final h.b.a<com.bytedance.android.livesdk.l.a.a> a(h.b.a<com.bytedance.android.livesdk.l.a.a> aVar) {
            h.b.a<com.bytedance.android.livesdk.l.a.a> aVar2 = aVar;
            if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f18606a, false, 13512, new Class[]{h.b.a.class}, h.b.a.class)) {
                return aVar2.a(new a()).a();
            }
            return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f18606a, false, 13512, new Class[]{h.b.a.class}, h.b.a.class);
        }
    }

    public final boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f18603a, false, 13508, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f18603a, false, 13508, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f18605b != null && this.f18605b.isShowing()) {
            z = true;
        }
        return z;
    }

    public final boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, f18603a, false, 13509, new Class[0], Boolean.TYPE)) {
            return d();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f18603a, false, 13509, new Class[0], Boolean.TYPE)).booleanValue();
    }

    private boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f18603a, false, 13511, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f18603a, false, 13511, new Class[0], Boolean.TYPE)).booleanValue();
        }
        long longValue = ((Long) b.aL.a()).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance.setTime(new Date(longValue));
        instance2.setTime(new Date(currentTimeMillis));
        if (instance.get(6) == instance2.get(6) && instance.get(1) == instance2.get(1)) {
            return true;
        }
        return false;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f18603a, false, 13507, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18603a, false, 13507, new Class[0], Void.TYPE);
            return;
        }
        if (this.f18605b != null) {
            Dialog dialog = this.f18605b;
            if (PatchProxy.isSupport(new Object[]{dialog}, null, b.f18607a, true, 13513, new Class[]{Dialog.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialog}, null, b.f18607a, true, 13513, new Class[]{Dialog.class}, Void.TYPE);
            } else if (!com.ss.android.ugc.aweme.g.a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
                dialog.dismiss();
            } else {
                throw new IllegalStateException("debug check! this method should be called from main thread!");
            }
            this.f18605b = null;
        }
    }

    public final void b(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f18603a, false, 13510, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f18603a, false, 13510, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (!f18604c) {
            ai.a(context2, (int) C0906R.string.dfk);
            f18604c = true;
        }
    }

    public final void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f18603a, false, 13504, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f18603a, false, 13504, new Class[]{Context.class}, Void.TYPE);
        } else if (this.f18605b == null || !this.f18605b.isShowing()) {
            if (((Boolean) LiveSettingKeys.ENABLE_FLOW_CARD_TIP_NEW_STYLE.a()).booleanValue()) {
                if (PatchProxy.isSupport(new Object[]{context}, this, f18603a, false, 13506, new Class[]{Context.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context}, this, f18603a, false, 13506, new Class[]{Context.class}, Void.TYPE);
                } else {
                    this.f18605b = new c(context);
                    this.f18605b.show();
                    this.f18605b.setCanceledOnTouchOutside(false);
                }
            } else {
                if (PatchProxy.isSupport(new Object[]{context}, this, f18603a, false, 13505, new Class[]{Context.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context}, this, f18603a, false, 13505, new Class[]{Context.class}, Void.TYPE);
                } else if (!d()) {
                    this.f18605b = new com.bytedance.android.livesdk.h.a(context);
                    this.f18605b.show();
                    this.f18605b.setCanceledOnTouchOutside(false);
                }
            }
        }
    }
}
