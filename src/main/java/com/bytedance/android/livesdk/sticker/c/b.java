package com.bytedance.android.livesdk.sticker.c;

import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.sticker.c.a;
import com.bytedance.android.livesdk.sticker.d;
import com.bytedance.android.livesdk.sticker.e;
import com.bytedance.android.livesdk.sticker.g;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class b extends a {
    public static ChangeQuickRedirect i;
    public final List<a.b> j = new ArrayList();
    public final Map<String, EffectChannelResponse> k = new HashMap();
    private final Map<String, com.bytedance.android.livesdk.sticker.b.a> l = new HashMap();

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 13426, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 13426, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.j.clear();
        this.k.clear();
    }

    private g c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, i, false, 13425, new Class[]{String.class}, g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[]{str2}, this, i, false, 13425, new Class[]{String.class}, g.class);
        } else if (a.f17261b.equals(str2)) {
            return new d();
        } else {
            if (a.f17262c.equals(str2)) {
                return new e();
            }
            return new g();
        }
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, i, false, 13421, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, i, false, 13421, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a(str2, (a.b) null);
    }

    public final com.bytedance.android.livesdk.sticker.b.a b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, i, false, 13424, new Class[]{String.class}, com.bytedance.android.livesdk.sticker.b.a.class)) {
            return (com.bytedance.android.livesdk.sticker.b.a) PatchProxy.accessDispatch(new Object[]{str}, this, i, false, 13424, new Class[]{String.class}, com.bytedance.android.livesdk.sticker.b.a.class);
        } else if (this.l.containsKey(str)) {
            return this.l.get(str);
        } else {
            return null;
        }
    }

    public final void a(String str, com.bytedance.android.livesdk.sticker.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{str, aVar}, this, i, false, 13423, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, aVar}, this, i, false, 13423, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
        } else if (!this.l.containsKey(str)) {
            this.l.put(str, aVar);
        }
    }

    public final void a(String str, a.b bVar) {
        String str2 = str;
        a.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{str2, bVar2}, this, i, false, 13422, new Class[]{String.class, a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, bVar2}, this, i, false, 13422, new Class[]{String.class, a.b.class}, Void.TYPE);
        } else if (this.k.containsKey(str)) {
            for (a.b next : this.j) {
                if (next != null) {
                    next.a(this.k.get(str));
                }
            }
            if (bVar2 != null) {
                bVar2.a(this.k.get(str));
            }
        } else if (this.f17265f != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            g c2 = c(str);
            final String str3 = str;
            final AtomicBoolean atomicBoolean2 = atomicBoolean;
            final g gVar = c2;
            final a.b bVar3 = bVar;
            AnonymousClass1 r0 = new com.ss.android.ugc.effectmanager.effect.b.g() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f17271a;

                public final void a(c cVar) {
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f17271a, false, 13428, new Class[]{c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f17271a, false, 13428, new Class[]{c.class}, Void.TYPE);
                        return;
                    }
                    if (atomicBoolean2.get()) {
                        gVar.a(cVar.f77315a, cVar.f77316b);
                    }
                    for (a.b next : b.this.j) {
                        if (next != null) {
                            next.a();
                        }
                    }
                    if (bVar3 != null) {
                        bVar3.a();
                    }
                }

                public final void a(EffectChannelResponse effectChannelResponse) {
                    if (PatchProxy.isSupport(new Object[]{effectChannelResponse}, this, f17271a, false, 13427, new Class[]{EffectChannelResponse.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{effectChannelResponse}, this, f17271a, false, 13427, new Class[]{EffectChannelResponse.class}, Void.TYPE);
                    } else if (effectChannelResponse != null && (!Lists.isEmpty(effectChannelResponse.categoryResponseList) || !Lists.isEmpty(effectChannelResponse.allCategoryEffects))) {
                        b.this.k.put(str3, effectChannelResponse);
                        if (atomicBoolean2.get()) {
                            gVar.a();
                        }
                        for (a.b next : b.this.j) {
                            if (next != null) {
                                next.a(b.this.k.get(str3));
                            }
                        }
                        j.q().o().a(effectChannelResponse);
                        if (bVar3 != null) {
                            bVar3.a(b.this.k.get(str3));
                        }
                    }
                }
            };
            c2.c();
            if (NetworkUtils.isNetworkAvailable(ac.e())) {
                atomicBoolean.set(true);
                this.f17265f.a(str, false, (com.ss.android.ugc.effectmanager.effect.b.g) r0);
                return;
            }
            atomicBoolean.set(false);
            this.f17265f.a(str, (com.ss.android.ugc.effectmanager.effect.b.g) r0);
        }
    }
}
