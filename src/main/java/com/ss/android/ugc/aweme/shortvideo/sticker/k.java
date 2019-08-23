package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effectplatform.g;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.effectmanager.effect.b.e;
import com.ss.android.ugc.effectmanager.effect.b.i;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.ConcurrentHashMap;

public interface k {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70131a;

        /* renamed from: b  reason: collision with root package name */
        public c f70132b;

        public final void a(@NonNull Effect effect) {
            if (PatchProxy.isSupport(new Object[]{effect}, this, f70131a, false, 78653, new Class[]{Effect.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{effect}, this, f70131a, false, 78653, new Class[]{Effect.class}, Void.TYPE);
                return;
            }
            if (this.f70132b != null) {
                this.f70132b.b(effect);
            }
        }
    }

    public static class b implements k {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70133a;

        /* renamed from: b  reason: collision with root package name */
        g f70134b;

        /* renamed from: c  reason: collision with root package name */
        ConcurrentHashMap<String, a> f70135c = new ConcurrentHashMap<>();

        public b(@NonNull g gVar) {
            this.f70134b = gVar;
        }

        public final void a(@Nullable final ah ahVar) {
            if (PatchProxy.isSupport(new Object[]{ahVar}, this, f70133a, false, 78655, new Class[]{ah.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{ahVar}, this, f70133a, false, 78655, new Class[]{ah.class}, Void.TYPE);
            } else if (ahVar != null && !this.f70135c.containsKey(ahVar.f69295b.effect_id)) {
                this.f70135c.put(ahVar.f69295b.effect_id, new a());
                if (ah.a(ahVar.f69295b, this.f70134b)) {
                    ahVar.f69297d = 1;
                    this.f70135c.get(ahVar.f69295b.effect_id).a(ahVar.f69295b);
                    this.f70135c.remove(ahVar.f69295b.effect_id);
                    return;
                }
                this.f70134b.a(ahVar.f69295b, (i) com.ss.android.ugc.aweme.effectplatform.k.a((i) new i() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f70136a;

                    public final void b(Effect effect) {
                    }

                    public final void a(Effect effect) {
                        if (PatchProxy.isSupport(new Object[]{effect}, this, f70136a, false, 78657, new Class[]{Effect.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{effect}, this, f70136a, false, 78657, new Class[]{Effect.class}, Void.TYPE);
                            return;
                        }
                        ahVar.f69297d = 1;
                        b.this.f70135c.get(ahVar.f69295b.effect_id).a(effect);
                        b.this.f70135c.remove(ahVar.f69295b.effect_id);
                    }

                    public final void a(Effect effect, com.ss.android.ugc.effectmanager.common.e.c cVar) {
                        Effect effect2 = effect;
                        com.ss.android.ugc.effectmanager.common.e.c cVar2 = cVar;
                        if (PatchProxy.isSupport(new Object[]{effect2, cVar2}, this, f70136a, false, 78658, new Class[]{Effect.class, com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{effect2, cVar2}, this, f70136a, false, 78658, new Class[]{Effect.class, com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE);
                            return;
                        }
                        ahVar.f69297d = 3;
                        a aVar = b.this.f70135c.get(ahVar.f69295b.effect_id);
                        if (PatchProxy.isSupport(new Object[]{effect2, cVar2}, aVar, a.f70131a, false, 78654, new Class[]{Effect.class, com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE)) {
                            a aVar2 = aVar;
                            PatchProxy.accessDispatch(new Object[]{effect2, cVar2}, aVar2, a.f70131a, false, 78654, new Class[]{Effect.class, com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE);
                        } else if (aVar.f70132b != null) {
                            aVar.f70132b.a(effect2, cVar2);
                        }
                        b.this.f70135c.remove(ahVar.f69295b.effect_id);
                    }
                }));
            }
        }

        public final void a(@Nullable final ah ahVar, final c cVar) {
            if (PatchProxy.isSupport(new Object[]{ahVar, cVar}, this, f70133a, false, 78656, new Class[]{ah.class, c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{ahVar, cVar}, this, f70133a, false, 78656, new Class[]{ah.class, c.class}, Void.TYPE);
            } else if (ahVar != null) {
                if (this.f70135c.get(ahVar.f69295b.effect_id) != null) {
                    cVar.a(ahVar.f69295b);
                    this.f70135c.get(ahVar.f69295b.effect_id).f70132b = cVar;
                    return;
                }
                cVar.a(ahVar.f69295b);
                this.f70135c.put(ahVar.f69295b.effect_id, new a());
                this.f70134b.a(ahVar.f69295b, (i) com.ss.android.ugc.aweme.effectplatform.k.a((i) new e() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f70139a;

                    public final void b(Effect effect) {
                    }

                    public final void a(Effect effect) {
                        if (PatchProxy.isSupport(new Object[]{effect}, this, f70139a, false, 78660, new Class[]{Effect.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{effect}, this, f70139a, false, 78660, new Class[]{Effect.class}, Void.TYPE);
                            return;
                        }
                        if (!ah.a(effect, b.this.f70134b)) {
                            ai.b("Effect is not ready " + effect.name);
                        } else {
                            ai.a("Effect is ready" + effect.name);
                        }
                        ahVar.f69297d = 1;
                        cVar.b(effect);
                        b.this.f70135c.remove(ahVar.f69295b.effect_id);
                    }

                    public final void a(Effect effect, com.ss.android.ugc.effectmanager.common.e.c cVar) {
                        if (PatchProxy.isSupport(new Object[]{effect, cVar}, this, f70139a, false, 78661, new Class[]{Effect.class, com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{effect, cVar}, this, f70139a, false, 78661, new Class[]{Effect.class, com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE);
                            return;
                        }
                        ahVar.f69297d = 3;
                        cVar.a(effect, cVar);
                        b.this.f70135c.remove(ahVar.f69295b.effect_id);
                    }

                    public final void a(Effect effect, int i, long j) {
                        Effect effect2 = effect;
                        long j2 = j;
                        if (PatchProxy.isSupport(new Object[]{effect2, Integer.valueOf(i), new Long(j2)}, this, f70139a, false, 78659, new Class[]{Effect.class, Integer.TYPE, Long.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{effect2, Integer.valueOf(i), new Long(j2)}, this, f70139a, false, 78659, new Class[]{Effect.class, Integer.TYPE, Long.TYPE}, Void.TYPE);
                            return;
                        }
                        ahVar.f69297d = 5;
                        cVar.a(effect2, i);
                    }
                }));
            }
        }
    }

    public interface c {
        void a(Effect effect);

        void a(Effect effect, int i);

        void a(Effect effect, com.ss.android.ugc.effectmanager.common.e.c cVar);

        void b(Effect effect);
    }

    void a(@Nullable ah ahVar);

    void a(@Nullable ah ahVar, c cVar);
}
