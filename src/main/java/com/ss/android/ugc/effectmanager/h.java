package com.ss.android.ugc.effectmanager;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.d.a;
import com.ss.android.ugc.effectmanager.effect.b.f;
import com.ss.android.ugc.effectmanager.effect.b.g;
import com.ss.android.ugc.effectmanager.effect.b.i;
import com.ss.android.ugc.effectmanager.effect.b.m;
import com.ss.android.ugc.effectmanager.effect.b.p;
import com.ss.android.ugc.effectmanager.effect.c.b;
import com.ss.android.ugc.effectmanager.effect.c.c;
import com.ss.android.ugc.effectmanager.effect.c.d;
import com.ss.android.ugc.effectmanager.effect.c.e;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.link.LinkSelector;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class h {

    /* renamed from: f  reason: collision with root package name */
    public static a f77487f;

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.effectmanager.effect.c.a f77488a;

    /* renamed from: b  reason: collision with root package name */
    public b f77489b;

    /* renamed from: c  reason: collision with root package name */
    public d f77490c;

    /* renamed from: d  reason: collision with root package name */
    public e f77491d;

    /* renamed from: e  reason: collision with root package name */
    public c f77492e;
    public boolean g;
    public com.ss.android.ugc.effectmanager.a.a h;
    public LinkSelector i;

    public static a a() {
        return f77487f;
    }

    public final void a(List<String> list, final boolean z, Map<String, String> map, final com.ss.android.ugc.effectmanager.effect.b.h hVar) {
        if (this.h == null || this.f77489b == null) {
            if (hVar != null) {
                hVar.a(new com.ss.android.ugc.effectmanager.common.e.c((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        AnonymousClass5 r0 = new com.ss.android.ugc.effectmanager.effect.b.h() {
            public final void a(com.ss.android.ugc.effectmanager.common.e.c cVar) {
                hVar.a(cVar);
            }

            public final void a(List<Effect> list) {
                if (z) {
                    h.this.a(list, hVar);
                } else {
                    hVar.a(list);
                }
            }
        };
        String b2 = b();
        this.h.f77204a.z.a(b2, (com.ss.android.ugc.effectmanager.effect.b.h) r0);
        this.f77489b.a(list, b2, map);
    }

    public final boolean a(Effect effect) {
        return this.f77492e != null && com.ss.android.ugc.effectmanager.common.f.b.a(effect) && this.f77492e.a(effect) && f77487f.d(effect.id);
    }

    public static String b() {
        return UUID.randomUUID().toString();
    }

    public final boolean b(Effect effect) {
        if (this.f77492e == null || !com.ss.android.ugc.effectmanager.common.f.b.a(effect) || !this.f77492e.b(effect)) {
            return false;
        }
        return true;
    }

    public final void a(Effect effect, i iVar) {
        if (this.h == null || this.f77489b == null) {
            if (iVar != null) {
                iVar.a(effect, new com.ss.android.ugc.effectmanager.common.e.c((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        String b2 = b();
        this.h.f77204a.z.a(b2, iVar);
        if (!b(effect)) {
            this.f77489b.a(effect, b2);
        }
    }

    public final void a(String str, g gVar) {
        if (this.h == null || this.f77488a == null) {
            if (gVar != null) {
                gVar.a(new com.ss.android.ugc.effectmanager.common.e.c((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        String b2 = b();
        this.h.f77204a.z.a(b2, gVar);
        if (!TextUtils.isEmpty(str)) {
            this.f77488a.a(str, b2, true);
        } else {
            this.f77488a.a("default", b2, true);
        }
    }

    public final void a(List<Effect> list, com.ss.android.ugc.effectmanager.effect.b.h hVar) {
        if (this.h == null || this.f77489b == null) {
            if (hVar != null) {
                hVar.a(new com.ss.android.ugc.effectmanager.common.e.c((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        String b2 = b();
        this.h.f77204a.z.a(b2, hVar);
        this.f77489b.a(list, b2);
    }

    public final void a(String str, @NonNull String str2, com.ss.android.ugc.effectmanager.effect.b.a aVar) {
        a(str, str2, 1, aVar);
    }

    public final void a(String str, String str2, m mVar) {
        if (this.f77491d == null) {
            mVar.b();
            return;
        }
        this.f77491d.a(b(), str, str2, mVar);
    }

    public final void a(String str, String str2, p pVar) {
        if (this.f77491d == null) {
            if (pVar != null) {
                pVar.a();
            }
            return;
        }
        this.f77491d.b(b(), str, str2, pVar);
    }

    public final void a(String str, final boolean z, final g gVar) {
        if (this.h == null || this.f77488a == null) {
            if (gVar != null) {
                gVar.a(new com.ss.android.ugc.effectmanager.common.e.c((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        AnonymousClass3 r0 = new g() {
            public final void a(com.ss.android.ugc.effectmanager.common.e.c cVar) {
                if (gVar != null) {
                    gVar.a(cVar);
                }
            }

            public final void a(final EffectChannelResponse effectChannelResponse) {
                if (z) {
                    final String a2 = com.ss.android.ugc.effectmanager.common.f.a.a(h.this.h.f77204a.f77480f, effectChannelResponse.panel);
                    final String a3 = h.f77487f.a(a2);
                    h.f77487f.c(a2);
                    h hVar = h.this;
                    List<Effect> list = effectChannelResponse.allCategoryEffects;
                    ArrayList arrayList = new ArrayList();
                    List<Effect> list2 = hVar.f77492e.f77366c;
                    for (Effect next : list) {
                        if (!list2.contains(next)) {
                            arrayList.add(next);
                        }
                    }
                    h.this.a((List<Effect>) arrayList, (com.ss.android.ugc.effectmanager.effect.b.h) new com.ss.android.ugc.effectmanager.effect.b.h() {
                        public final void a(com.ss.android.ugc.effectmanager.common.e.c cVar) {
                            if (gVar != null) {
                                gVar.a(cVar);
                            }
                        }

                        public final void a(List<Effect> list) {
                            EffectChannelResponse effectChannelResponse = effectChannelResponse;
                            effectChannelResponse.allCategoryEffects = list;
                            for (EffectCategoryResponse next : effectChannelResponse.categoryResponseList) {
                                ArrayList arrayList = new ArrayList();
                                for (Effect next2 : next.totalEffects) {
                                    if (list.contains(next2)) {
                                        arrayList.add(next2);
                                    }
                                }
                                next.totalEffects = arrayList;
                            }
                            if (gVar != null) {
                                gVar.a(effectChannelResponse);
                            }
                            h.f77487f.a(a2, a3);
                        }
                    });
                    return;
                }
                if (gVar != null) {
                    gVar.a(effectChannelResponse);
                }
            }
        };
        String b2 = b();
        this.h.f77204a.z.a(b2, (g) r0);
        if (!TextUtils.isEmpty(str)) {
            this.f77488a.a(str, b2, false);
        } else {
            this.f77488a.a("default", b2, false);
        }
    }

    public void a(String str, @Nullable String str2, int i2, com.ss.android.ugc.effectmanager.effect.b.a aVar) {
        if (this.h == null || this.f77488a == null) {
            if (aVar != null) {
                aVar.a(new com.ss.android.ugc.effectmanager.common.e.c((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        String b2 = b();
        this.h.f77204a.z.a(b2, aVar);
        this.f77488a.a(str, str2, i2, b2);
    }

    public final void b(String str, String str2, int i2, int i3, int i4, String str3, f fVar) {
        f fVar2 = fVar;
        if (this.h == null || this.f77488a == null) {
            fVar2.a(new com.ss.android.ugc.effectmanager.common.e.c((Exception) new IllegalStateException("请先初始化")));
            return;
        }
        String b2 = b();
        this.h.f77204a.z.a(b2, fVar2);
        this.f77488a.a(str, b2, str2, i2, i3, i4, str3, true);
    }

    public final void a(String str, String str2, int i2, int i3, int i4, String str3, f fVar) {
        f fVar2 = fVar;
        if (this.h == null || this.f77488a == null) {
            if (fVar2 != null) {
                fVar2.a(new com.ss.android.ugc.effectmanager.common.e.c((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        String b2 = b();
        this.h.f77204a.z.a(b2, fVar2);
        this.f77488a.a(str, b2, str2, i2, i3, i4, str3, false);
    }
}
