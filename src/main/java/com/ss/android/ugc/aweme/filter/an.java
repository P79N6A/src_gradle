package com.ss.android.ugc.aweme.filter;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MediatorLiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.common.collect.ab;
import com.google.common.collect.ay;
import com.google.common.collect.be;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

public final class an {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47500a;

    /* renamed from: b  reason: collision with root package name */
    public a f47501b;

    /* renamed from: c  reason: collision with root package name */
    public MutableLiveData<List<h>> f47502c = new MutableLiveData<>();

    /* renamed from: d  reason: collision with root package name */
    public final MediatorLiveData<Map<EffectCategoryResponse, List<h>>> f47503d = new MediatorLiveData<Map<EffectCategoryResponse, List<h>>>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47506a;

        public final void observe(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<Map<EffectCategoryResponse, List<h>>> observer) {
            if (PatchProxy.isSupport(new Object[]{lifecycleOwner, observer}, this, f47506a, false, 44375, new Class[]{LifecycleOwner.class, Observer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{lifecycleOwner, observer}, this, f47506a, false, 44375, new Class[]{LifecycleOwner.class, Observer.class}, Void.TYPE);
                return;
            }
            super.observe(lifecycleOwner, observer);
            an.this.a(this, an.this.f47504e);
        }
    };

    /* renamed from: e  reason: collision with root package name */
    public MutableLiveData<ay<EffectCategoryResponse, h>> f47504e = new MutableLiveData<ay<EffectCategoryResponse, h>>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47508a;

        public final void onActive() {
            if (PatchProxy.isSupport(new Object[0], this, f47508a, false, 44377, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f47508a, false, 44377, new Class[0], Void.TYPE);
                return;
            }
            super.onActive();
            if (((ay) getValue()) == null) {
                c c2 = c.c();
                c2.putAll(new EffectCategoryResponse(), aa.a().e());
                setValue(c2);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void setValue(ay<EffectCategoryResponse, h> ayVar) {
            if (PatchProxy.isSupport(new Object[]{ayVar}, this, f47508a, false, 44378, new Class[]{ay.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{ayVar}, this, f47508a, false, 44378, new Class[]{ay.class}, Void.TYPE);
                return;
            }
            b(ayVar);
            super.setValue(ayVar);
        }

        private void b(ay<EffectCategoryResponse, h> ayVar) {
            if (PatchProxy.isSupport(new Object[]{ayVar}, this, f47508a, false, 44379, new Class[]{ay.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{ayVar}, this, f47508a, false, 44379, new Class[]{ay.class}, Void.TYPE);
                return;
            }
            r.a(ayVar);
        }

        public final void observe(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<ay<EffectCategoryResponse, h>> observer) {
            if (PatchProxy.isSupport(new Object[]{lifecycleOwner, observer}, this, f47508a, false, 44376, new Class[]{LifecycleOwner.class, Observer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{lifecycleOwner, observer}, this, f47508a, false, 44376, new Class[]{LifecycleOwner.class, Observer.class}, Void.TYPE);
                return;
            }
            super.observe(lifecycleOwner, observer);
            an.this.a(an.this.f47503d, this);
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private List<EffectCategoryResponse> f47505f;
    private Map<String, Effect> g = new ConcurrentHashMap();
    private MutableLiveData<List<h>> h;
    private final b i = new b(this, (byte) 0);

    public interface a {
        @NonNull
        List<h> d();

        @NonNull
        List<h> e();
    }

    class b implements Observer<ay<EffectCategoryResponse, h>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47513a;

        private b() {
        }

        public final /* synthetic */ void onChanged(@Nullable Object obj) {
            ay ayVar = (ay) obj;
            if (PatchProxy.isSupport(new Object[]{ayVar}, this, f47513a, false, 44385, new Class[]{ay.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{ayVar}, this, f47513a, false, 44385, new Class[]{ay.class}, Void.TYPE);
                return;
            }
            if (ayVar != null) {
                an.this.f47503d.setValue(ayVar.asMap());
            }
        }

        /* synthetic */ b(an anVar, byte b2) {
            this();
        }
    }

    static class c<K, V> extends ab<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47515a;
        @NonNull

        /* renamed from: b  reason: collision with root package name */
        private final ay<K, V> f47516b;

        /* renamed from: a */
        public final ay<K, V> delegate() {
            return this.f47516b;
        }

        private c() {
            this.f47516b = an.c();
        }

        public static <K, V> c<K, V> c() {
            if (PatchProxy.isSupport(new Object[0], null, f47515a, true, 44386, new Class[0], c.class)) {
                return (c) PatchProxy.accessDispatch(new Object[0], null, f47515a, true, 44386, new Class[0], c.class);
            }
            return new c<>();
        }

        /* synthetic */ c(byte b2) {
            this();
        }

        public boolean put(@NotNull K k, @NotNull V v) {
            V v2 = v;
            if (PatchProxy.isSupport(new Object[]{k, v2}, this, f47515a, false, 44387, new Class[]{Object.class, Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{k, v2}, this, f47515a, false, 44387, new Class[]{Object.class, Object.class}, Boolean.TYPE)).booleanValue();
            }
            List list = get((Object) k);
            if (!list.contains(v2)) {
                return list.add(v2);
            }
            return false;
        }
    }

    public static <K, V> ay<K, V> c() {
        if (PatchProxy.isSupport(new Object[0], null, f47500a, true, 44374, new Class[0], ay.class)) {
            return (ay) PatchProxy.accessDispatch(new Object[0], null, f47500a, true, 44374, new Class[0], ay.class);
        }
        return be.a().b().b();
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f47500a, false, 44367, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47500a, false, 44367, new Class[0], Void.TYPE);
            return;
        }
        if (this.h == null) {
            this.h = new MutableLiveData<List<h>>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f47510a;

                /* renamed from: b  reason: collision with root package name */
                final List<h> f47511b = Collections.emptyList();

                public final void onInactive() {
                    if (PatchProxy.isSupport(new Object[0], this, f47510a, false, 44381, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f47510a, false, 44381, new Class[0], Void.TYPE);
                        return;
                    }
                    super.onInactive();
                }

                public final void onActive() {
                    List<h> list;
                    if (PatchProxy.isSupport(new Object[0], this, f47510a, false, 44380, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f47510a, false, 44380, new Class[0], Void.TYPE);
                        return;
                    }
                    super.onActive();
                    if (getValue() == null) {
                        if (PatchProxy.isSupport(new Object[0], this, f47510a, false, 44382, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f47510a, false, 44382, new Class[0], Void.TYPE);
                            return;
                        }
                        if (an.this.f47501b != null) {
                            list = an.this.f47501b.d();
                        } else {
                            list = this.f47511b;
                        }
                        setValue(list);
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void setValue(List<h> list) {
                    if (PatchProxy.isSupport(new Object[]{list}, this, f47510a, false, 44383, new Class[]{List.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{list}, this, f47510a, false, 44383, new Class[]{List.class}, Void.TYPE);
                        return;
                    }
                    b(list);
                    super.setValue(list);
                }

                private void b(List<h> list) {
                    if (PatchProxy.isSupport(new Object[]{list}, this, f47510a, false, 44384, new Class[]{List.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{list}, this, f47510a, false, 44384, new Class[]{List.class}, Void.TYPE);
                        return;
                    }
                    r.a(list);
                }
            };
        }
    }

    @NonNull
    public final MutableLiveData<List<h>> a() {
        if (PatchProxy.isSupport(new Object[0], this, f47500a, false, 44364, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f47500a, false, 44364, new Class[0], MutableLiveData.class);
        }
        d();
        return this.h;
    }

    @Nullable
    public final List<h> b() {
        if (PatchProxy.isSupport(new Object[0], this, f47500a, false, 44365, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f47500a, false, 44365, new Class[0], List.class);
        } else if (this.f47501b == null) {
            return null;
        } else {
            return this.f47501b.d();
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final Effect a(@Nullable h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f47500a, false, 44363, new Class[]{h.class}, Effect.class)) {
            return (Effect) PatchProxy.accessDispatch(new Object[]{hVar}, this, f47500a, false, 44363, new Class[]{h.class}, Effect.class);
        }
        Effect effect = null;
        if (hVar == null) {
            return null;
        }
        if (hVar.f47599c != null) {
            effect = this.g.get(hVar.f47599c);
        }
        if (effect == null && hVar.f47600d != null) {
            effect = this.g.get(hVar.f47600d);
        }
        return effect;
    }

    public final void b(List<h> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f47500a, false, 44369, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f47500a, false, 44369, new Class[]{List.class}, Void.TYPE);
            return;
        }
        d();
        ArrayList arrayList = new ArrayList();
        for (h e2 : list) {
            arrayList.add(w.e(e2));
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.h.setValue(arrayList);
        } else {
            this.h.postValue(arrayList);
        }
    }

    @Nullable
    public final String c(h hVar) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, this, f47500a, false, 44373, new Class[]{h.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{hVar2}, this, f47500a, false, 44373, new Class[]{h.class}, String.class);
        } else if (hVar2 == null) {
            return null;
        } else {
            if (hVar2 instanceof o) {
                return ((o) hVar2).n;
            }
            EffectCategoryResponse b2 = b(hVar);
            if (b2 != null) {
                return b2.name;
            }
            return null;
        }
    }

    @Nullable
    public final EffectCategoryResponse b(@Nullable h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f47500a, false, 44372, new Class[]{h.class}, EffectCategoryResponse.class)) {
            return (EffectCategoryResponse) PatchProxy.accessDispatch(new Object[]{hVar}, this, f47500a, false, 44372, new Class[]{h.class}, EffectCategoryResponse.class);
        } else if (this.f47505f == null || this.f47505f.isEmpty() || hVar == null) {
            return null;
        } else {
            loop0:
            for (EffectCategoryResponse next : this.f47505f) {
                Iterator<Effect> it2 = next.totalEffects.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Effect next2 = it2.next();
                        if (!next2.name.equals(hVar.f47599c)) {
                            if (next2.name.equals(hVar.f47600d)) {
                                break loop0;
                            }
                        } else {
                            break loop0;
                        }
                    }
                }
                return next;
            }
            return this.f47505f.get(0);
        }
    }

    public final void a(List<EffectCategoryResponse> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f47500a, false, 44362, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f47500a, false, 44362, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.f47505f = list;
        c c2 = c.c();
        List<h> d2 = this.f47501b.d();
        for (h next : this.f47501b.e()) {
            EffectCategoryResponse b2 = b(next);
            if (b2 != null && !d2.contains(next)) {
                c2.get(b2).add(next);
            }
        }
        this.f47504e.setValue(c2);
        for (EffectCategoryResponse effectCategoryResponse : list) {
            for (Effect next2 : effectCategoryResponse.totalEffects) {
                this.g.put(next2.name, next2);
            }
        }
    }

    public void c(List<h> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f47500a, false, 44371, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f47500a, false, 44371, new Class[]{List.class}, Void.TYPE);
            return;
        }
        c c2 = c.c();
        for (h next : list) {
            EffectCategoryResponse b2 = b(next);
            if (c2.get(b2) == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("filtersInCategory is null\n");
                sb.append("current filter: \n");
                sb.append("name          = ");
                sb.append(next.f47599c);
                sb.append("\n");
                sb.append("en name       = ");
                sb.append(next.f47600d);
                sb.append("\n");
                sb.append("id            = ");
                sb.append(next.f47598b);
                sb.append("\n");
                sb.append("-------------------------\n");
                sb.append("filters info:\n");
                for (h next2 : list) {
                    sb.append("name      = ");
                    sb.append(next2.f47599c);
                    sb.append("\n");
                    sb.append("en name   = ");
                    sb.append(next2.f47600d);
                    sb.append("\n");
                    sb.append("id        = ");
                    sb.append(next2.f47598b);
                    sb.append("\n");
                }
                sb.append("-------------------------\n");
                sb.append("category response list info:\n");
                if (this.f47505f != null) {
                    for (EffectCategoryResponse next3 : this.f47505f) {
                        sb.append("EffectCategoryResponse info = ");
                        sb.append(next3.toString());
                        sb.append("\n");
                        sb.append("EffectCategoryResponse size = ");
                        sb.append(next3.totalEffects);
                        sb.append("\n");
                    }
                } else {
                    sb.append("mCategoryResponseList : null\n");
                }
                throw new NullPointerException(sb.toString());
            }
            c2.put(b2, next);
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.f47504e.setValue(c2);
        } else {
            this.f47504e.postValue(c2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.filter.t r26) {
        /*
            r25 = this;
            r7 = r25
            r8 = r26
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f47500a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.filter.t> r1 = com.ss.android.ugc.aweme.filter.t.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 44366(0xad4e, float:6.217E-41)
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f47500a
            r3 = 0
            r4 = 44366(0xad4e, float:6.217E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.filter.t> r1 = com.ss.android.ugc.aweme.filter.t.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            android.arch.lifecycle.MutableLiveData<com.google.common.collect.ay<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, com.ss.android.ugc.aweme.filter.h>> r0 = r7.f47504e
            java.lang.Object r0 = r0.getValue()
            com.google.common.collect.ay r0 = (com.google.common.collect.ay) r0
            if (r0 != 0) goto L_0x0047
            com.ss.android.ugc.aweme.filter.an$c r0 = new com.ss.android.ugc.aweme.filter.an$c
            r0.<init>(r10)
        L_0x0047:
            java.util.Map<java.lang.String, com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = r7.g
            r2 = 3
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r10] = r1
            r11[r9] = r0
            r3 = 2
            r11[r3] = r8
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.filter.r.f47642a
            r14 = 1
            r15 = 44130(0xac62, float:6.184E-41)
            java.lang.Class[] r4 = new java.lang.Class[r2]
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            r4[r10] = r5
            java.lang.Class<com.google.common.collect.ay> r5 = com.google.common.collect.ay.class
            r4[r9] = r5
            java.lang.Class<com.ss.android.ugc.aweme.filter.t> r5 = com.ss.android.ugc.aweme.filter.t.class
            r4[r3] = r5
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r4 == 0) goto L_0x0098
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r10] = r1
            r11[r9] = r0
            r11[r3] = r8
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.filter.r.f47642a
            r14 = 1
            r15 = 44130(0xac62, float:6.184E-41)
            java.lang.Class[] r1 = new java.lang.Class[r2]
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            r1[r10] = r2
            java.lang.Class<com.google.common.collect.ay> r2 = com.google.common.collect.ay.class
            r1[r9] = r2
            java.lang.Class<com.ss.android.ugc.aweme.filter.t> r2 = com.ss.android.ugc.aweme.filter.t.class
            r1[r3] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x049b
        L_0x0098:
            com.ss.android.ugc.aweme.filter.r$a r4 = com.ss.android.ugc.aweme.filter.r.f47643b
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r10] = r1
            r5[r9] = r0
            r5[r3] = r8
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.filter.r.a.f47644a
            r21 = 0
            r22 = 44142(0xac6e, float:6.1856E-41)
            java.lang.Class[] r6 = new java.lang.Class[r2]
            java.lang.Class<java.util.Map> r11 = java.util.Map.class
            r6[r10] = r11
            java.lang.Class<com.google.common.collect.ay> r11 = com.google.common.collect.ay.class
            r6[r9] = r11
            java.lang.Class<com.ss.android.ugc.aweme.filter.t> r11 = com.ss.android.ugc.aweme.filter.t.class
            r6[r3] = r11
            java.lang.Class r24 = java.lang.Void.TYPE
            r18 = r5
            r19 = r4
            r23 = r6
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r18, r19, r20, r21, r22, r23, r24)
            if (r5 == 0) goto L_0x00ef
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r10] = r1
            r5[r9] = r0
            r5[r3] = r8
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.filter.r.a.f47644a
            r21 = 0
            r22 = 44142(0xac6e, float:6.1856E-41)
            java.lang.Class[] r1 = new java.lang.Class[r2]
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            r1[r10] = r2
            java.lang.Class<com.google.common.collect.ay> r2 = com.google.common.collect.ay.class
            r1[r9] = r2
            java.lang.Class<com.ss.android.ugc.aweme.filter.t> r2 = com.ss.android.ugc.aweme.filter.t.class
            r1[r3] = r2
            java.lang.Class r24 = java.lang.Void.TYPE
            r18 = r5
            r19 = r4
            r23 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x049b
        L_0x00ef:
            java.lang.String r5 = "categoryEffectMap"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r5)
            java.lang.String r5 = "categorySourcesValue"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r5)
            java.lang.String r5 = "patch"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r5)
            com.ss.android.ugc.aweme.filter.r$a r4 = (com.ss.android.ugc.aweme.filter.r.a) r4
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r11[r10] = r1
            r11[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.filter.r.a.f47644a
            r14 = 0
            r15 = 44143(0xac6f, float:6.1858E-41)
            java.lang.Class[] r5 = new java.lang.Class[r3]
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            r5[r10] = r6
            java.lang.Class<com.ss.android.ugc.aweme.filter.t> r6 = com.ss.android.ugc.aweme.filter.t.class
            r5[r9] = r6
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r4
            r16 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r5 == 0) goto L_0x0141
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r11[r10] = r1
            r11[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.filter.r.a.f47644a
            r14 = 0
            r15 = 44143(0xac6f, float:6.1858E-41)
            java.lang.Class[] r1 = new java.lang.Class[r3]
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            r1[r10] = r5
            java.lang.Class<com.ss.android.ugc.aweme.filter.t> r5 = com.ss.android.ugc.aweme.filter.t.class
            r1[r9] = r5
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r4
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x020b
        L_0x0141:
            com.google.common.collect.bd<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel, com.ss.android.ugc.aweme.filter.o> r5 = r8.f47651c
            java.util.Collection r5 = r5.entries()
            java.util.Iterator r5 = r5.iterator()
        L_0x014b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x020b
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r11 = r6.getKey()
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel r11 = (com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel) r11
            java.lang.Object r6 = r6.getValue()
            com.ss.android.ugc.aweme.filter.o r6 = (com.ss.android.ugc.aweme.filter.o) r6
            java.lang.String r12 = "k"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r12)
            java.lang.String r11 = r11.name
            java.lang.String r12 = "k.name"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r12)
            java.lang.String r12 = "v"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r12)
            java.lang.Object[] r13 = new java.lang.Object[r9]
            r13[r10] = r6
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.effectplatform.f.f43848a
            r16 = 1
            r17 = 38990(0x984e, float:5.4637E-41)
            java.lang.Class[] r12 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.filter.o> r18 = com.ss.android.ugc.aweme.filter.o.class
            r12[r10] = r18
            java.lang.Class<com.ss.android.ugc.aweme.effectplatform.e> r19 = com.ss.android.ugc.aweme.effectplatform.e.class
            r18 = r12
            boolean r12 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r12 == 0) goto L_0x01ad
            java.lang.Object[] r13 = new java.lang.Object[r9]
            r13[r10] = r6
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.effectplatform.f.f43848a
            r16 = 1
            r17 = 38990(0x984e, float:5.4637E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.filter.o> r12 = com.ss.android.ugc.aweme.filter.o.class
            r6[r10] = r12
            java.lang.Class<com.ss.android.ugc.aweme.effectplatform.e> r19 = com.ss.android.ugc.aweme.effectplatform.e.class
            r18 = r6
            java.lang.Object r6 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            com.ss.android.ugc.aweme.effectplatform.e r6 = (com.ss.android.ugc.aweme.effectplatform.e) r6
            goto L_0x0206
        L_0x01ad:
            java.lang.String r12 = "$this$toEffect"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r12)
            com.ss.android.ugc.aweme.effectplatform.e r12 = new com.ss.android.ugc.aweme.effectplatform.e
            r12.<init>()
            java.lang.String r13 = r6.f47599c
            r12.name = r13
            java.lang.String r13 = r6.f47600d
            r6.f47600d = r13
            int r13 = r6.f47598b
            java.lang.String r13 = java.lang.String.valueOf(r13)
            r12.effect_id = r13
            com.ss.android.ugc.effectmanager.common.model.UrlModel r13 = new com.ss.android.ugc.effectmanager.common.model.UrlModel
            r13.<init>()
            android.net.Uri r14 = r6.g
            java.lang.String r14 = r14.toString()
            java.util.List r14 = kotlin.collections.CollectionsKt.listOf(r14)
            r13.url_list = r14
            r12.icon_url = r13
            com.ss.android.ugc.effectmanager.common.model.UrlModel r13 = new com.ss.android.ugc.effectmanager.common.model.UrlModel
            r13.<init>()
            com.ss.android.ugc.aweme.tools.bb r14 = r6.f47601e
            java.lang.String r15 = "filterBean.resource"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r14, r15)
            java.lang.String r14 = r14.f74652b
            r13.uri = r14
            com.ss.android.ugc.aweme.tools.bb r14 = r6.f47601e
            java.lang.String r15 = "filterBean.resource"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r14, r15)
            java.util.List<java.lang.String> r14 = r14.f74653c
            r13.url_list = r14
            r12.file_url = r13
            java.util.List r13 = r6.a()
            r12.tags = r13
            boolean r13 = r6.l
            r12.f43845b = r13
            boolean r6 = r6.m
            r12.f43846c = r6
            r6 = r12
        L_0x0206:
            r1.put(r11, r6)
            goto L_0x014b
        L_0x020b:
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r11[r10] = r0
            r11[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.filter.r.a.f47644a
            r14 = 0
            r15 = 44144(0xac70, float:6.1859E-41)
            java.lang.Class[] r1 = new java.lang.Class[r3]
            java.lang.Class<com.google.common.collect.ay> r5 = com.google.common.collect.ay.class
            r1[r10] = r5
            java.lang.Class<com.ss.android.ugc.aweme.filter.t> r5 = com.ss.android.ugc.aweme.filter.t.class
            r1[r9] = r5
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r4
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x024c
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r11[r10] = r0
            r11[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.filter.r.a.f47644a
            r14 = 0
            r15 = 44144(0xac70, float:6.1859E-41)
            java.lang.Class[] r1 = new java.lang.Class[r3]
            java.lang.Class<com.google.common.collect.ay> r6 = com.google.common.collect.ay.class
            r1[r10] = r6
            java.lang.Class<com.ss.android.ugc.aweme.filter.t> r6 = com.ss.android.ugc.aweme.filter.t.class
            r1[r9] = r6
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r4
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x03a7
        L_0x024c:
            com.google.common.collect.bd<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel, com.ss.android.ugc.aweme.filter.o> r1 = r8.f47650b
            com.ss.android.ugc.aweme.filter.r$a$a r6 = new com.ss.android.ugc.aweme.filter.r$a$a
            r6.<init>(r8, r0)
            com.google.common.a.n r6 = (com.google.common.a.n) r6
            com.google.common.collect.bd r1 = com.google.common.collect.bf.a(r1, r6)
            com.google.common.collect.be$c r6 = com.google.common.collect.be.a()
            com.google.common.collect.be$b r6 = r6.b()
            com.google.common.collect.ay r6 = r6.b()
            r6.putAll(r1)
            java.util.Collection r1 = r6.values()
            java.lang.String r11 = "filteredEntries.values()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r11)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0277:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L_0x02ef
            java.lang.Object r11 = r1.next()
            com.ss.android.ugc.aweme.filter.o r11 = (com.ss.android.ugc.aweme.filter.o) r11
            com.ss.android.ugc.aweme.filter.aa r12 = com.ss.android.ugc.aweme.filter.aa.a()
            java.lang.String r13 = "FilterManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r12, r13)
            java.util.List r12 = r12.h()
            java.lang.String r13 = "FilterManager.getInstance().filterList"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r12, r13)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
        L_0x029b:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x02bd
            java.lang.Object r13 = r12.next()
            r14 = r13
            com.ss.android.ugc.aweme.filter.h r14 = (com.ss.android.ugc.aweme.filter.h) r14
            java.lang.String r15 = "it"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r14, r15)
            java.lang.String r14 = r14.f47600d
            java.lang.String r15 = "filter"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r15)
            java.lang.String r15 = r11.f47600d
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r15)
            if (r14 == 0) goto L_0x029b
            goto L_0x02be
        L_0x02bd:
            r13 = 0
        L_0x02be:
            com.ss.android.ugc.aweme.filter.h r13 = (com.ss.android.ugc.aweme.filter.h) r13
            if (r13 == 0) goto L_0x02cb
            java.lang.String r12 = "filter"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r12)
            java.lang.String r12 = r13.j
            r11.j = r12
        L_0x02cb:
            java.lang.String r12 = "filter"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r12)
            java.lang.String r12 = r11.j
            if (r12 == 0) goto L_0x02e1
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            int r12 = r12.length()
            if (r12 != 0) goto L_0x02de
            r12 = 1
            goto L_0x02df
        L_0x02de:
            r12 = 0
        L_0x02df:
            if (r12 == 0) goto L_0x0277
        L_0x02e1:
            com.ss.android.ugc.aweme.filter.v r12 = com.ss.android.ugc.aweme.filter.v.a()
            r13 = r11
            com.ss.android.ugc.aweme.filter.h r13 = (com.ss.android.ugc.aweme.filter.h) r13
            java.lang.String r12 = r12.a((com.ss.android.ugc.aweme.filter.h) r13)
            r11.j = r12
            goto L_0x0277
        L_0x02ef:
            com.google.common.collect.bg r1 = r0.keys()
            r0.clear()
            java.util.Map r6 = r6.asMap()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0302:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L_0x03a7
            java.lang.Object r11 = r6.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.String r12 = "existingCategories"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r12)
            r12 = r1
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
        L_0x031a:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0342
            java.lang.Object r13 = r12.next()
            r14 = r13
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse r14 = (com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse) r14
            java.lang.String r15 = "it"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r14, r15)
            java.lang.String r14 = r14.id
            java.lang.Object r15 = r11.getKey()
            java.lang.String r5 = "entry.key"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r15, r5)
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel r15 = (com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel) r15
            java.lang.String r5 = r15.id
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x031a
            goto L_0x0343
        L_0x0342:
            r13 = 0
        L_0x0343:
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse r13 = (com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse) r13
            if (r13 != 0) goto L_0x039b
            java.lang.Object r5 = r11.getKey()
            java.lang.String r12 = "entry.key"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r12)
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel r5 = (com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel) r5
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r10] = r5
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.filter.s.f47648a
            r15 = 1
            r16 = 44151(0xac77, float:6.1869E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel> r17 = com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel.class
            r2[r10] = r17
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse> r18 = com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse.class
            r17 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x038a
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r10] = r5
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.filter.s.f47648a
            r15 = 1
            r16 = 44151(0xac77, float:6.1869E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel> r5 = com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel.class
            r2[r10] = r5
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse> r18 = com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse.class
            r17 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            r13 = r2
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse r13 = (com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse) r13
            goto L_0x039b
        L_0x038a:
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse r13 = new com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse
            r13.<init>()
            java.lang.String r2 = r5.id
            r13.id = r2
            java.lang.String r2 = r5.name
            r13.name = r2
            java.lang.String r2 = r5.key
            r13.key = r2
        L_0x039b:
            java.lang.Object r2 = r11.getValue()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r0.putAll(r13, r2)
            r2 = 3
            goto L_0x0302
        L_0x03a7:
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r11[r10] = r0
            r11[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.filter.r.a.f47644a
            r14 = 0
            r15 = 44145(0xac71, float:6.186E-41)
            java.lang.Class[] r1 = new java.lang.Class[r3]
            java.lang.Class<com.google.common.collect.ay> r2 = com.google.common.collect.ay.class
            r1[r10] = r2
            java.lang.Class<com.ss.android.ugc.aweme.filter.t> r2 = com.ss.android.ugc.aweme.filter.t.class
            r1[r9] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r4
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x03e8
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r11[r10] = r0
            r11[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.filter.r.a.f47644a
            r14 = 0
            r15 = 44145(0xac71, float:6.186E-41)
            java.lang.Class[] r1 = new java.lang.Class[r3]
            java.lang.Class<com.google.common.collect.ay> r2 = com.google.common.collect.ay.class
            r1[r10] = r2
            java.lang.Class<com.ss.android.ugc.aweme.filter.t> r2 = com.ss.android.ugc.aweme.filter.t.class
            r1[r9] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r4
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x049b
        L_0x03e8:
            com.google.common.collect.bd<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel, com.ss.android.ugc.aweme.filter.o> r1 = r8.f47652d
            java.util.Collection r1 = r1.entries()
            java.util.Iterator r1 = r1.iterator()
        L_0x03f2:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x049b
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel r4 = (com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel) r4
            java.lang.Object r2 = r2.getValue()
            com.ss.android.ugc.aweme.filter.o r2 = (com.ss.android.ugc.aweme.filter.o) r2
            java.lang.String r5 = "k"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            java.lang.String r5 = "v"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r5)
            com.ss.android.ugc.aweme.filter.h r2 = (com.ss.android.ugc.aweme.filter.h) r2
            r5 = 3
            java.lang.Object[] r11 = new java.lang.Object[r5]
            r11[r10] = r0
            r11[r9] = r4
            r11[r3] = r2
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.filter.s.f47648a
            r14 = 1
            r15 = 44150(0xac76, float:6.1867E-41)
            java.lang.Class[] r6 = new java.lang.Class[r5]
            java.lang.Class<com.google.common.collect.ay> r5 = com.google.common.collect.ay.class
            r6[r10] = r5
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel> r5 = com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel.class
            r6[r9] = r5
            java.lang.Class<com.ss.android.ugc.aweme.filter.h> r5 = com.ss.android.ugc.aweme.filter.h.class
            r6[r3] = r5
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r6
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r5 == 0) goto L_0x0464
            r5 = 3
            java.lang.Object[] r11 = new java.lang.Object[r5]
            r11[r10] = r0
            r11[r9] = r4
            r11[r3] = r2
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.filter.s.f47648a
            r14 = 1
            r15 = 44150(0xac76, float:6.1867E-41)
            java.lang.Class[] r2 = new java.lang.Class[r5]
            java.lang.Class<com.google.common.collect.ay> r4 = com.google.common.collect.ay.class
            r2[r10] = r4
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel> r4 = com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel.class
            r2[r9] = r4
            java.lang.Class<com.ss.android.ugc.aweme.filter.h> r4 = com.ss.android.ugc.aweme.filter.h.class
            r2[r3] = r4
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x03f2
        L_0x0464:
            r5 = 3
            com.google.common.collect.bg r6 = r0.keys()
            java.lang.String r8 = "this.keys()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r8)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x0474:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0491
            java.lang.Object r8 = r6.next()
            r11 = r8
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse r11 = (com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse) r11
            java.lang.String r12 = "it"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r12)
            java.lang.String r11 = r11.id
            java.lang.String r12 = r4.id
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r12)
            if (r11 == 0) goto L_0x0474
            goto L_0x0492
        L_0x0491:
            r8 = 0
        L_0x0492:
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse r8 = (com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse) r8
            if (r8 == 0) goto L_0x03f2
            r0.remove(r8, r2)
            goto L_0x03f2
        L_0x049b:
            android.arch.lifecycle.MutableLiveData<com.google.common.collect.ay<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, com.ss.android.ugc.aweme.filter.h>> r1 = r7.f47504e
            r1.setValue(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.filter.an.a(com.ss.android.ugc.aweme.filter.t):void");
    }

    public final void a(MediatorLiveData<Map<EffectCategoryResponse, List<h>>> mediatorLiveData, MutableLiveData<ay<EffectCategoryResponse, h>> mutableLiveData) {
        MediatorLiveData<Map<EffectCategoryResponse, List<h>>> mediatorLiveData2 = mediatorLiveData;
        MutableLiveData<ay<EffectCategoryResponse, h>> mutableLiveData2 = mutableLiveData;
        if (PatchProxy.isSupport(new Object[]{mediatorLiveData2, mutableLiveData2}, this, f47500a, false, 44361, new Class[]{MediatorLiveData.class, MutableLiveData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mediatorLiveData2, mutableLiveData2}, this, f47500a, false, 44361, new Class[]{MediatorLiveData.class, MutableLiveData.class}, Void.TYPE);
            return;
        }
        mediatorLiveData2.addSource(mutableLiveData2, this.i);
    }
}
