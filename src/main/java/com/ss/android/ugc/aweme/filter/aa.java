package com.ss.android.ugc.aweme.filter;

import a.i;
import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effect.c.a;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.filter.a.b;
import com.ss.android.ugc.aweme.filter.aa;
import com.ss.android.ugc.aweme.filter.an;
import com.ss.android.ugc.aweme.filter.d.a;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.shortvideo.ff;
import com.ss.android.ugc.aweme.shortvideo.fg;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.effect.b.g;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

public class aa implements an.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47466a;

    /* renamed from: c  reason: collision with root package name */
    private static volatile aa f47467c;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f47468b = false;

    /* renamed from: d  reason: collision with root package name */
    private a f47469d;

    /* renamed from: e  reason: collision with root package name */
    private List<h> f47470e = Collections.synchronizedList(new LinkedList());

    /* renamed from: f  reason: collision with root package name */
    private List<h> f47471f = Collections.synchronizedList(new LinkedList());
    private final Object g = new Object();
    private volatile com.ss.android.ugc.aweme.effect.c.a<h, Void> h;
    private List<h> i;

    private aa() {
    }

    private synchronized a j() {
        if (PatchProxy.isSupport(new Object[0], this, f47466a, false, 44305, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, f47466a, false, 44305, new Class[0], a.class);
        }
        if (this.f47469d == null) {
            this.f47469d = new a();
        }
        return this.f47469d;
    }

    private String k() {
        if (PatchProxy.isSupport(new Object[0], this, f47466a, false, 44308, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f47466a, false, 44308, new Class[0], String.class);
        } else if (com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.ColorFilterPanel) == 2) {
            return "colorfilterexperiment";
        } else {
            return "colorfilternew";
        }
    }

    @NonNull
    public final List<h> d() {
        if (PatchProxy.isSupport(new Object[0], this, f47466a, false, 44302, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f47466a, false, 44302, new Class[0], List.class);
        }
        if (this.i == null) {
            this.i = v.a().a(fg.s);
        }
        return this.i;
    }

    @NonNull
    public final List<h> e() {
        if (!PatchProxy.isSupport(new Object[0], this, f47466a, false, 44303, new Class[0], List.class)) {
            return h();
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, f47466a, false, 44303, new Class[0], List.class);
    }

    public final EffectPlatform f() {
        if (!PatchProxy.isSupport(new Object[0], this, f47466a, false, 44304, new Class[0], EffectPlatform.class)) {
            return j().a((Context) com.ss.android.ugc.aweme.port.in.a.f61119b);
        }
        return (EffectPlatform) PatchProxy.accessDispatch(new Object[0], this, f47466a, false, 44304, new Class[0], EffectPlatform.class);
    }

    public static aa a() {
        if (PatchProxy.isSupport(new Object[0], null, f47466a, true, 44294, new Class[0], aa.class)) {
            return (aa) PatchProxy.accessDispatch(new Object[0], null, f47466a, true, 44294, new Class[0], aa.class);
        }
        if (f47467c == null) {
            synchronized (aa.class) {
                if (f47467c == null) {
                    f47467c = new aa();
                }
            }
        }
        return f47467c;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f47466a, false, 44296, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47466a, false, 44296, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.effect.c.a<h, Void> c2 = c();
        if (PatchProxy.isSupport(new Object[0], c2, com.ss.android.ugc.aweme.effect.c.a.f43716a, false, 38862, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], c2, com.ss.android.ugc.aweme.effect.c.a.f43716a, false, 38862, new Class[0], Void.TYPE);
            return;
        }
        c2.a((Function0<? extends Object>) new a.k<Object>(c2));
    }

    public final com.ss.android.ugc.aweme.effect.c.a<h, Void> c() {
        if (PatchProxy.isSupport(new Object[0], this, f47466a, false, 44297, new Class[0], com.ss.android.ugc.aweme.effect.c.a.class)) {
            return (com.ss.android.ugc.aweme.effect.c.a) PatchProxy.accessDispatch(new Object[0], this, f47466a, false, 44297, new Class[0], com.ss.android.ugc.aweme.effect.c.a.class);
        }
        if (this.h == null) {
            synchronized (this.g) {
                if (this.h == null) {
                    this.h = new com.ss.android.ugc.aweme.effect.c.a<>(3, new b());
                    this.h.f43718c = 0;
                    this.h.f43720e = true;
                    this.h.f43719d = true;
                    this.h.f43721f = ab.f47474b;
                }
            }
        }
        return this.h;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final List<h> h() {
        if (PatchProxy.isSupport(new Object[0], this, f47466a, false, 44311, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f47466a, false, 44311, new Class[0], List.class);
        } else if (Lists.notEmpty(this.f47470e)) {
            return this.f47470e;
        } else {
            if (Lists.isEmpty(this.f47471f)) {
                this.f47471f = v.a().a(ff.s);
            }
            return this.f47471f;
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f47466a, false, 44306, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47466a, false, 44306, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.filter.d.a j = j();
        Application application = com.ss.android.ugc.aweme.port.in.a.f61119b;
        String k = k();
        if (PatchProxy.isSupport(new Object[]{application, k}, j, com.ss.android.ugc.aweme.filter.d.a.f47571a, false, 44462, new Class[]{Context.class, String.class}, Void.TYPE)) {
            com.ss.android.ugc.aweme.filter.d.a aVar = j;
            PatchProxy.accessDispatch(new Object[]{application, k}, aVar, com.ss.android.ugc.aweme.filter.d.a.f47571a, false, 44462, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        EffectPlatform a2 = j.a((Context) application);
        a.AnonymousClass2 r2 = new g() {
            public final void a(c cVar) {
            }

            public final void a(EffectChannelResponse effectChannelResponse) {
            }
        };
        if (PatchProxy.isSupport(new Object[]{k, (byte) 0, r2}, a2, EffectPlatform.f3091a, false, 38917, new Class[]{String.class, Boolean.TYPE, g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{k, (byte) 0, r2}, a2, EffectPlatform.f3091a, false, 38917, new Class[]{String.class, Boolean.TYPE, g.class}, Void.TYPE);
            return;
        }
        a2.c();
        a2.f3095e.a(k, false, r2);
    }

    public final synchronized void i() {
        if (PatchProxy.isSupport(new Object[0], this, f47466a, false, 44312, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47466a, false, 44312, new Class[0], Void.TYPE);
        } else if (!Lists.notEmpty(this.f47470e)) {
            if (!this.f47468b) {
                this.f47468b = true;
                if (PatchProxy.isSupport(new Object[0], this, f47466a, false, 44307, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f47466a, false, 44307, new Class[0], Void.TYPE);
                    return;
                }
                this.f47469d = j();
                com.ss.android.ugc.aweme.filter.d.a aVar = this.f47469d;
                Application application = com.ss.android.ugc.aweme.port.in.a.f61119b;
                String k = k();
                AnonymousClass1 r12 = new g() {
                    public final void a(EffectChannelResponse effectChannelResponse) {
                    }

                    public final void a(c cVar) {
                        aa.this.f47468b = false;
                    }
                };
                if (PatchProxy.isSupport(new Object[]{application, k, r12}, aVar, com.ss.android.ugc.aweme.filter.d.a.f47571a, false, 44460, new Class[]{Context.class, String.class, g.class}, Void.TYPE)) {
                    com.ss.android.ugc.aweme.filter.d.a aVar2 = aVar;
                    PatchProxy.accessDispatch(new Object[]{application, k, r12}, aVar2, com.ss.android.ugc.aweme.filter.d.a.f47571a, false, 44460, new Class[]{Context.class, String.class, g.class}, Void.TYPE);
                    return;
                }
                aVar.f47572b = aVar.a((Context) application);
                aVar.f47572b.a(k, false, (g) new g(r12) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f47573a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ g f47574b;

                    public final void a(c cVar) {
                        if (PatchProxy.isSupport(new Object[]{cVar}, this, f47573a, false, 44464, new Class[]{c.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{cVar}, this, f47573a, false, 44464, new Class[]{c.class}, Void.TYPE);
                            return;
                        }
                        if (this.f47574b != null) {
                            this.f47574b.a(cVar);
                        }
                    }

                    public final void a(EffectChannelResponse effectChannelResponse) {
                        if (PatchProxy.isSupport(new Object[]{effectChannelResponse}, this, f47573a, false, 44463, new Class[]{EffectChannelResponse.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{effectChannelResponse}, this, f47573a, false, 44463, new Class[]{EffectChannelResponse.class}, Void.TYPE);
                            return;
                        }
                        List<EffectCategoryResponse> list = effectChannelResponse.categoryResponseList;
                        if (!CollectionUtils.isEmpty(list)) {
                            i.a((Callable<TResult>) new b<TResult>(this, list), i.f1052b).a(c.f47581b, (Executor) i.f1051a).a((a.g<TResult, TContinuationResult>) new d<TResult,TContinuationResult>(this.f47574b, effectChannelResponse), i.f1052b);
                        }
                    }

                    /* access modifiers changed from: package-private */
                    public final /* synthetic */ List a(List list) throws Exception {
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.addAll(((EffectCategoryResponse) it2.next()).totalEffects);
                        }
                        List<h> a2 = a.this.a((List<Effect>) arrayList);
                        aa.a().a(a2);
                        com.ss.android.ugc.aweme.port.in.a.d().a(list);
                        an d2 = com.ss.android.ugc.aweme.port.in.a.d();
                        if (PatchProxy.isSupport(new Object[]{a2}, d2, an.f47500a, false, 44368, new Class[]{List.class}, Void.TYPE)) {
                            an anVar = d2;
                            PatchProxy.accessDispatch(new Object[]{a2}, anVar, an.f47500a, false, 44368, new Class[]{List.class}, Void.TYPE);
                        } else {
                            ArrayList arrayList2 = new ArrayList(a2);
                            if (Looper.getMainLooper() == Looper.myLooper()) {
                                d2.f47502c.setValue(arrayList2);
                            } else {
                                d2.f47502c.postValue(arrayList2);
                            }
                            d2.c(a2);
                        }
                        return a2;
                    }

                    {
                        this.f47574b = r2;
                    }
                });
            }
        }
    }

    public final void a(@NonNull List<h> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f47466a, false, 44309, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f47466a, false, 44309, new Class[]{List.class}, Void.TYPE);
        } else if (!Lists.isEmpty(list)) {
            for (h next : list) {
                if (PatchProxy.isSupport(new Object[]{next}, this, f47466a, false, 44310, new Class[]{h.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{next}, this, f47466a, false, 44310, new Class[]{h.class}, Void.TYPE);
                } else if (next != null && !this.f47470e.contains(next)) {
                    this.f47470e.add(next);
                }
            }
        }
    }

    public final void a(@NonNull h hVar, @NonNull com.ss.android.ugc.aweme.effect.c.a.a<h, Void> aVar) {
        h hVar2 = hVar;
        com.ss.android.ugc.aweme.effect.c.a.a<h, Void> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{hVar2, aVar2}, this, f47466a, false, 44300, new Class[]{h.class, com.ss.android.ugc.aweme.effect.c.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, aVar2}, this, f47466a, false, 44300, new Class[]{h.class, com.ss.android.ugc.aweme.effect.c.a.a.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.effect.c.a<h, Void> c2 = c();
        if (PatchProxy.isSupport(new Object[]{hVar2, aVar2}, c2, com.ss.android.ugc.aweme.effect.c.a.f43716a, false, 38879, new Class[]{Object.class, com.ss.android.ugc.aweme.effect.c.a.a.class}, Void.TYPE)) {
            Object[] objArr = {hVar2, aVar2};
            Object[] objArr2 = objArr;
            com.ss.android.ugc.aweme.effect.c.a<h, Void> aVar3 = c2;
            ChangeQuickRedirect changeQuickRedirect = com.ss.android.ugc.aweme.effect.c.a.f43716a;
            PatchProxy.accessDispatch(objArr2, aVar3, changeQuickRedirect, false, 38879, new Class[]{Object.class, com.ss.android.ugc.aweme.effect.c.a.a.class}, Void.TYPE);
            return;
        }
        c2.a(hVar2, aVar2, null);
    }

    public final void b(@Nullable h hVar, @Nullable com.ss.android.ugc.aweme.effect.c.a.a<h, Void> aVar) {
        h hVar2 = hVar;
        com.ss.android.ugc.aweme.effect.c.a.a<h, Void> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{hVar2, aVar2}, this, f47466a, false, 44301, new Class[]{h.class, com.ss.android.ugc.aweme.effect.c.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, aVar2}, this, f47466a, false, 44301, new Class[]{h.class, com.ss.android.ugc.aweme.effect.c.a.a.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.effect.c.a<h, Void> c2 = c();
        if (PatchProxy.isSupport(new Object[]{hVar2, aVar2}, c2, com.ss.android.ugc.aweme.effect.c.a.f43716a, false, 38880, new Class[]{Object.class, com.ss.android.ugc.aweme.effect.c.a.a.class}, Void.TYPE)) {
            Object[] objArr = {hVar2, aVar2};
            Object[] objArr2 = objArr;
            com.ss.android.ugc.aweme.effect.c.a<h, Void> aVar3 = c2;
            ChangeQuickRedirect changeQuickRedirect = com.ss.android.ugc.aweme.effect.c.a.f43716a;
            PatchProxy.accessDispatch(objArr2, aVar3, changeQuickRedirect, false, 38880, new Class[]{Object.class, com.ss.android.ugc.aweme.effect.c.a.a.class}, Void.TYPE);
            return;
        }
        c2.a((Function0<? extends Object>) new a.l<Object>(c2, hVar2, aVar2));
    }

    public final void a(@Nullable h hVar, boolean z, @Nullable com.ss.android.ugc.aweme.effect.c.a.a<h, Void> aVar) {
        h hVar2 = hVar;
        com.ss.android.ugc.aweme.effect.c.a.a<h, Void> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{hVar2, Byte.valueOf(z ? (byte) 1 : 0), aVar2}, this, f47466a, false, 44299, new Class[]{h.class, Boolean.TYPE, com.ss.android.ugc.aweme.effect.c.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, Byte.valueOf(z), aVar2}, this, f47466a, false, 44299, new Class[]{h.class, Boolean.TYPE, com.ss.android.ugc.aweme.effect.c.a.a.class}, Void.TYPE);
        } else if (hVar2 != null) {
            if (z) {
                c().b(hVar2, aVar2);
            } else {
                c().a(hVar2, aVar2);
            }
        }
    }
}
