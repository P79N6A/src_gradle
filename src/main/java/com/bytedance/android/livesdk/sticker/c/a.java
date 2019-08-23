package com.bytedance.android.livesdk.sticker.c;

import android.text.TextUtils;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.sticker.d;
import com.bytedance.android.livesdk.sticker.e;
import com.bytedance.android.livesdk.sticker.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.effectmanager.c;
import com.ss.android.ugc.effectmanager.effect.b.i;
import com.ss.android.ugc.effectmanager.effect.b.m;
import com.ss.android.ugc.effectmanager.effect.b.p;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.h;
import java.util.ArrayList;
import java.util.List;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17260a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f17261b = ac.a((int) C0906R.string.d1g);

    /* renamed from: c  reason: collision with root package name */
    public static final String f17262c = ac.a((int) C0906R.string.d1f);

    /* renamed from: d  reason: collision with root package name */
    public static final String f17263d = ac.a((int) C0906R.string.d1h);

    /* renamed from: e  reason: collision with root package name */
    public static final String f17264e = ac.a((int) C0906R.string.d1d);

    /* renamed from: f  reason: collision with root package name */
    public final h f17265f = TTLiveSDKContext.getHostService().a().i();
    public final List<C0122a> g = new ArrayList();
    public final List<String> h = new ArrayList();

    /* renamed from: com.bytedance.android.livesdk.sticker.c.a$a  reason: collision with other inner class name */
    public interface C0122a {
        void a(String str, com.bytedance.android.livesdk.sticker.b.a aVar);

        void b(String str, com.bytedance.android.livesdk.sticker.b.a aVar);

        void c(String str, com.bytedance.android.livesdk.sticker.b.a aVar);
    }

    public interface b {
        void a();

        void a(EffectChannelResponse effectChannelResponse);
    }

    public abstract void a(String str, b bVar);

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f17260a, false, 13416, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17260a, false, 13416, new Class[0], Void.TYPE);
            return;
        }
        this.g.clear();
    }

    private g a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f17260a, false, 13413, new Class[]{String.class}, g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[]{str2}, this, f17260a, false, 13413, new Class[]{String.class}, g.class);
        } else if (f17261b.equals(str2)) {
            return new d();
        } else {
            if (f17262c.equals(str2)) {
                return new e();
            }
            return new g();
        }
    }

    public final boolean a(com.bytedance.android.livesdk.sticker.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f17260a, false, 13411, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar}, this, f17260a, false, 13411, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Boolean.TYPE)).booleanValue();
        } else if (aVar == null || this.h.contains(aVar.r)) {
            return true;
        } else {
            if (c.a()) {
                return c.b().a(this.f17265f, com.bytedance.android.livesdk.sticker.h.a(aVar));
            }
            return this.f17265f.a(com.bytedance.android.livesdk.sticker.h.a(aVar));
        }
    }

    public final void a(String str, com.bytedance.android.livesdk.sticker.b.a aVar, C0122a aVar2) {
        final String str2 = str;
        com.bytedance.android.livesdk.sticker.b.a aVar3 = aVar;
        final C0122a aVar4 = aVar2;
        if (PatchProxy.isSupport(new Object[]{str2, aVar3, aVar4}, this, f17260a, false, 13412, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class, C0122a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, aVar3, aVar4}, this, f17260a, false, 13412, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class, C0122a.class}, Void.TYPE);
        } else if (aVar3 != null && aVar3.f17251c != null && !aVar3.f17251c.f7711c.isEmpty() && !a(aVar3)) {
            final g a2 = a(str);
            a2.e();
            this.f17265f.a(com.bytedance.android.livesdk.sticker.h.a(aVar), (i) new i() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f17266a;

                public final void b(Effect effect) {
                }

                public final void a(Effect effect) {
                    if (PatchProxy.isSupport(new Object[]{effect}, this, f17266a, false, 13417, new Class[]{Effect.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{effect}, this, f17266a, false, 13417, new Class[]{Effect.class}, Void.TYPE);
                        return;
                    }
                    com.bytedance.android.livesdk.sticker.b.a a2 = com.bytedance.android.livesdk.sticker.h.a(effect);
                    a2.t = false;
                    a2.s = true;
                    a2.b();
                    for (C0122a c2 : a.this.g) {
                        c2.c(str2, a2);
                    }
                    a.this.h.add(effect.unzipPath);
                    if (aVar4 != null) {
                        aVar4.c(str2, a2);
                    }
                }

                public final void a(Effect effect, com.ss.android.ugc.effectmanager.common.e.c cVar) {
                    if (PatchProxy.isSupport(new Object[]{effect, cVar}, this, f17266a, false, 13418, new Class[]{Effect.class, com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{effect, cVar}, this, f17266a, false, 13418, new Class[]{Effect.class, com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE);
                        return;
                    }
                    if (effect != null) {
                        h.f77487f.c(effect.id);
                        com.ss.android.ugc.effectmanager.common.d.a aVar = h.f77487f;
                        aVar.c(effect.id + ".zip");
                    }
                    com.bytedance.android.livesdk.sticker.b.a a2 = com.bytedance.android.livesdk.sticker.h.a(effect);
                    a2.t = false;
                    a2.b(cVar.f77315a, cVar.f77316b);
                    for (C0122a b2 : a.this.g) {
                        b2.b(str2, a2);
                    }
                    if (aVar4 != null) {
                        aVar4.b(str2, a2);
                    }
                }
            });
            aVar3.t = true;
            for (C0122a a3 : this.g) {
                a3.a(str2, aVar3);
            }
            if (aVar4 != null) {
                aVar4.a(str2, aVar3);
            }
        }
    }

    public final void a(String str, String str2, m mVar) {
        String str3 = str;
        String str4 = str2;
        m mVar2 = mVar;
        if (PatchProxy.isSupport(new Object[]{str3, str4, mVar2}, this, f17260a, false, 13414, new Class[]{String.class, String.class, m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, mVar2}, this, f17260a, false, 13414, new Class[]{String.class, String.class, m.class}, Void.TYPE);
        } else if (mVar2 != null) {
            if (this.f17265f == null || str3 == null || str4 == null || TextUtils.equals("NULL", str2.toUpperCase())) {
                mVar.b();
            } else {
                this.f17265f.a(str3, str4, mVar2);
            }
        }
    }

    public final void a(String str, String str2, p pVar) {
        String str3 = str;
        String str4 = str2;
        p pVar2 = pVar;
        if (PatchProxy.isSupport(new Object[]{str3, str4, pVar2}, this, f17260a, false, 13415, new Class[]{String.class, String.class, p.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, pVar2}, this, f17260a, false, 13415, new Class[]{String.class, String.class, p.class}, Void.TYPE);
            return;
        }
        if (this.f17265f != null) {
            this.f17265f.a(str3, str4, pVar2);
        }
    }
}
