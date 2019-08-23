package com.ss.android.ugc.effectmanager.effect.c;

import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.common.h;
import com.ss.android.ugc.effectmanager.common.i;
import com.ss.android.ugc.effectmanager.effect.e.a.d;
import com.ss.android.ugc.effectmanager.effect.e.a.e;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.g;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class b implements i.a {

    /* renamed from: a  reason: collision with root package name */
    public g f77359a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.effectmanager.a.a f77360b;

    /* renamed from: c  reason: collision with root package name */
    public a f77361c;

    /* renamed from: d  reason: collision with root package name */
    public Handler f77362d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap<Effect, com.ss.android.ugc.effectmanager.common.e.a> f77363e = new HashMap<>();

    public interface a {
        void a(String str, Effect effect, int i, c cVar);

        void a(String str, List<Effect> list, c cVar);
    }

    public b(com.ss.android.ugc.effectmanager.a.a aVar) {
        this.f77360b = aVar;
        this.f77359a = this.f77360b.f77204a;
        this.f77362d = new i(this);
    }

    public final void a(Message message) {
        if (this.f77361c != null) {
            if (message.what == 15 && (message.obj instanceof e)) {
                e eVar = (e) message.obj;
                Effect effect = eVar.f77398b;
                c cVar = eVar.f77399c;
                if (cVar == null) {
                    this.f77361c.a(eVar.f77314a, effect, 20, null);
                } else {
                    this.f77361c.a(eVar.f77314a, effect, 26, cVar);
                }
                this.f77363e.remove(effect);
            }
            if (message.what == 17 && (message.obj instanceof d)) {
                d dVar = (d) message.obj;
                c cVar2 = dVar.f77397c;
                if (cVar2 == null) {
                    this.f77361c.a(dVar.f77314a, dVar.f77396b, null);
                } else {
                    this.f77361c.a(dVar.f77314a, dVar.f77396b, cVar2);
                }
            }
            if (message.what == 19 && (message.obj instanceof com.ss.android.ugc.effectmanager.effect.e.a.a)) {
                com.ss.android.ugc.effectmanager.effect.e.a.a aVar = (com.ss.android.ugc.effectmanager.effect.e.a.a) message.obj;
                c cVar3 = aVar.f77389c;
                com.ss.android.ugc.effectmanager.effect.b.b c2 = this.f77359a.z.c(aVar.f77314a);
                if (c2 != null) {
                    if (cVar3 == null) {
                        c2.a(aVar.f77388b);
                    } else {
                        c2.a(aVar.f77388b, aVar.f77389c);
                    }
                }
            }
            if (message.what == 54 && (message.obj instanceof com.ss.android.ugc.effectmanager.effect.e.a.a)) {
                com.ss.android.ugc.effectmanager.effect.e.a.a aVar2 = (com.ss.android.ugc.effectmanager.effect.e.a.a) message.obj;
                com.ss.android.ugc.effectmanager.effect.b.b c3 = this.f77359a.z.c(aVar2.f77314a);
                if (c3 != null && (c3 instanceof com.ss.android.ugc.effectmanager.effect.b.c)) {
                    ((com.ss.android.ugc.effectmanager.effect.b.c) c3).a(aVar2.f77388b, aVar2.f77391e, aVar2.f77390d);
                }
            }
            if (message.what == 42 && (message.obj instanceof e)) {
                e eVar2 = (e) message.obj;
                com.ss.android.ugc.effectmanager.effect.b.i a2 = this.f77359a.z.a(eVar2.f77314a);
                if (a2 != null) {
                    a2.b(eVar2.f77398b);
                }
            }
            if (message.what == 53 && (message.obj instanceof e)) {
                e eVar3 = (e) message.obj;
                com.ss.android.ugc.effectmanager.effect.b.i a3 = this.f77359a.z.a(eVar3.f77314a);
                if (a3 instanceof com.ss.android.ugc.effectmanager.effect.b.e) {
                    ((com.ss.android.ugc.effectmanager.effect.b.e) a3).a(eVar3.f77398b, eVar3.f77400d, eVar3.f77401e);
                }
            }
        }
    }

    public final void a(Effect effect, String str) {
        com.ss.android.ugc.effectmanager.effect.e.b.e eVar = new com.ss.android.ugc.effectmanager.effect.e.b.e(effect, this.f77360b, str, this.f77362d);
        this.f77361c.a("", effect, 21, null);
        this.f77363e.put(effect, eVar);
        this.f77359a.q.a(eVar);
    }

    public final void a(List<Effect> list, String str) {
        for (Effect a2 : list) {
            this.f77361c.a("", a2, 21, null);
        }
        this.f77359a.q.a(new com.ss.android.ugc.effectmanager.effect.e.b.d(this.f77360b, list, str, this.f77362d));
    }

    public final void a(List<String> list, String str, Map<String, String> map) {
        h hVar = this.f77359a.q;
        com.ss.android.ugc.effectmanager.effect.e.b.c cVar = new com.ss.android.ugc.effectmanager.effect.e.b.c(this.f77360b, list, this.f77362d, str, map);
        hVar.a(cVar);
    }
}
