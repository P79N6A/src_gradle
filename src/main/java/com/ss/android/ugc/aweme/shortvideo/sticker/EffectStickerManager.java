package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import com.bytedance.common.utility.Lists;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.image.CloseableImage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.model.e;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.sticker.k;
import com.ss.android.ugc.aweme.shortvideo.sticker.m;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurChildStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurParentStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.StickerFetchViewModel;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.utils.de;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class EffectStickerManager implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3970a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public Effect f3971b;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<String, HashSet<String>> f3972c;

    /* renamed from: d  reason: collision with root package name */
    AppCompatActivity f3973d;

    /* renamed from: e  reason: collision with root package name */
    public HashMap<String, Effect> f3974e;

    /* renamed from: f  reason: collision with root package name */
    public List<EffectCategoryModel> f3975f;
    public EffectPlatform g;
    m.a h;
    public boolean i = true;
    public int j = 2;
    public Effect k;
    fh l;
    public ad m;
    public boolean n = true;
    public r o;
    private String p;
    private HashMap<String, CategoryEffectModel> q;
    private int r = -1;
    private n s;
    private a t;
    private d u;

    class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69207a;

        /* renamed from: b  reason: collision with root package name */
        Boolean f69208b;

        /* renamed from: c  reason: collision with root package name */
        Boolean f69209c;

        /* renamed from: d  reason: collision with root package name */
        k.c f69210d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EffectStickerManager f69211e;

        /* renamed from: f  reason: collision with root package name */
        private ah f69212f;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f69207a, false, 78614, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f69207a, false, 78614, new Class[0], Void.TYPE);
            } else if (!b()) {
                if (this.f69209c == null) {
                    this.f69211e.b(this.f69212f, (k.c) new k.c() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f69213a;

                        public final void a(Effect effect) {
                            Effect effect2 = effect;
                            if (PatchProxy.isSupport(new Object[]{effect2}, this, f69213a, false, 78616, new Class[]{Effect.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{effect2}, this, f69213a, false, 78616, new Class[]{Effect.class}, Void.TYPE);
                                return;
                            }
                            a.this.f69210d.a(effect2);
                        }

                        public final void b(Effect effect) {
                            if (PatchProxy.isSupport(new Object[]{effect}, this, f69213a, false, 78617, new Class[]{Effect.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{effect}, this, f69213a, false, 78617, new Class[]{Effect.class}, Void.TYPE);
                                return;
                            }
                            a.this.f69209c = Boolean.TRUE;
                            a.this.b();
                        }

                        public final void a(Effect effect, int i) {
                            if (PatchProxy.isSupport(new Object[]{effect, Integer.valueOf(i)}, this, f69213a, false, 78619, new Class[]{Effect.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{effect, Integer.valueOf(i)}, this, f69213a, false, 78619, new Class[]{Effect.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            a.this.f69209c = Boolean.FALSE;
                            a.this.f69210d.a(effect, i);
                        }

                        public final void a(Effect effect, c cVar) {
                            if (PatchProxy.isSupport(new Object[]{effect, cVar}, this, f69213a, false, 78618, new Class[]{Effect.class, c.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{effect, cVar}, this, f69213a, false, 78618, new Class[]{Effect.class, c.class}, Void.TYPE);
                                return;
                            }
                            a.this.f69209c = Boolean.FALSE;
                            a.this.f69210d.a(effect, cVar);
                        }
                    });
                }
                if (this.f69208b == null) {
                    com.ss.android.ugc.aweme.base.c.a(com.ss.android.ugc.aweme.effectplatform.a.a(this.f69212f.f69295b.hint_icon), (c.a) new c.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f69215a;

                        public final void a(DataSource<CloseableReference<CloseableImage>> dataSource) {
                            if (PatchProxy.isSupport(new Object[]{dataSource}, this, f69215a, false, 78620, new Class[]{DataSource.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dataSource}, this, f69215a, false, 78620, new Class[]{DataSource.class}, Void.TYPE);
                                return;
                            }
                            a.this.f69208b = Boolean.TRUE;
                            a.this.b();
                        }

                        public final void a(Exception exc) {
                            if (PatchProxy.isSupport(new Object[]{exc}, this, f69215a, false, 78621, new Class[]{Exception.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{exc}, this, f69215a, false, 78621, new Class[]{Exception.class}, Void.TYPE);
                                return;
                            }
                            a.this.f69208b = Boolean.TRUE;
                            a.this.b();
                        }
                    });
                }
            }
        }

        public final boolean b() {
            if (PatchProxy.isSupport(new Object[0], this, f69207a, false, 78615, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f69207a, false, 78615, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (this.f69209c == null || !this.f69209c.booleanValue() || this.f69208b == null || !this.f69208b.booleanValue()) {
                return false;
            } else {
                this.f69210d.b(this.f69212f.f69295b);
                return true;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        a(com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r19, com.ss.android.ugc.aweme.shortvideo.sticker.ah r20, com.ss.android.ugc.aweme.shortvideo.sticker.k.c r21) {
            /*
                r18 = this;
                r0 = r18
                r1 = r19
                r2 = r20
                r0.f69211e = r1
                r18.<init>()
                r0.f69212f = r2
                com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r2.f69295b
                com.ss.android.ugc.aweme.effectplatform.EffectPlatform r1 = r1.g
                boolean r1 = com.ss.android.ugc.aweme.shortvideo.sticker.ah.a((com.ss.android.ugc.effectmanager.effect.model.Effect) r3, (com.ss.android.ugc.aweme.effectplatform.g) r1)
                if (r1 == 0) goto L_0x001b
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r0.f69209c = r1
            L_0x001b:
                com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r2.f69295b
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r10 = 0
                r3[r10] = r1
                r4 = 0
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager.f3970a
                r6 = 1
                r7 = 78592(0x13300, float:1.10131E-40)
                java.lang.Class[] r8 = new java.lang.Class[r2]
                java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r9 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
                r8[r10] = r9
                java.lang.Class r9 = java.lang.Boolean.TYPE
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                if (r3 == 0) goto L_0x0058
                java.lang.Object[] r11 = new java.lang.Object[r2]
                r11[r10] = r1
                r12 = 0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager.f3970a
                r14 = 1
                r15 = 78592(0x13300, float:1.10131E-40)
                java.lang.Class[] r1 = new java.lang.Class[r2]
                java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r2 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
                r1[r10] = r2
                java.lang.Class r17 = java.lang.Boolean.TYPE
                r16 = r1
                java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r2 = r1.booleanValue()
                goto L_0x00b5
            L_0x0058:
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r3[r10] = r1
                r4 = 0
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager.f3970a
                r6 = 1
                r7 = 78593(0x13301, float:1.10132E-40)
                java.lang.Class[] r8 = new java.lang.Class[r2]
                java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r9 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
                r8[r10] = r9
                java.lang.Class<java.lang.String> r9 = java.lang.String.class
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                if (r3 == 0) goto L_0x008e
                java.lang.Object[] r11 = new java.lang.Object[r2]
                r11[r10] = r1
                r12 = 0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager.f3970a
                r14 = 1
                r15 = 78593(0x13301, float:1.10132E-40)
                java.lang.Class[] r1 = new java.lang.Class[r2]
                java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r3 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
                r1[r10] = r3
                java.lang.Class<java.lang.String> r17 = java.lang.String.class
                r16 = r1
                java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                r4 = r1
                java.lang.String r4 = (java.lang.String) r4
                goto L_0x00a3
            L_0x008e:
                com.ss.android.ugc.effectmanager.common.model.UrlModel r1 = r1.hint_icon
                if (r1 != 0) goto L_0x0093
                goto L_0x00a3
            L_0x0093:
                java.util.List<java.lang.String> r1 = r1.url_list
                boolean r3 = com.ss.android.ugc.aweme.base.utils.j.a((java.util.Collection<T>) r1)
                if (r3 == 0) goto L_0x009c
                goto L_0x00a3
            L_0x009c:
                java.lang.Object r1 = r1.get(r10)
                r4 = r1
                java.lang.String r4 = (java.lang.String) r4
            L_0x00a3:
                boolean r1 = android.text.TextUtils.isEmpty(r4)
                if (r1 != 0) goto L_0x00b4
                android.net.Uri r1 = android.net.Uri.parse(r4)
                boolean r1 = com.ss.android.ugc.aweme.base.c.a((android.net.Uri) r1)
                if (r1 != 0) goto L_0x00b4
                goto L_0x00b5
            L_0x00b4:
                r2 = 0
            L_0x00b5:
                if (r2 != 0) goto L_0x00bb
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r0.f69208b = r1
            L_0x00bb:
                r1 = r21
                r0.f69210d = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager.a.<init>(com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager, com.ss.android.ugc.aweme.shortvideo.sticker.ah, com.ss.android.ugc.aweme.shortvideo.sticker.k$c):void");
        }
    }

    public final void a(String str, CategoryEffectModel categoryEffectModel) {
        boolean z;
        String str2 = str;
        CategoryEffectModel categoryEffectModel2 = categoryEffectModel;
        if (PatchProxy.isSupport(new Object[]{str2, categoryEffectModel2}, this, f3970a, false, 78589, new Class[]{String.class, CategoryEffectModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, categoryEffectModel2}, this, f3970a, false, 78589, new Class[]{String.class, CategoryEffectModel.class}, Void.TYPE);
            return;
        }
        if (categoryEffectModel2 != null) {
            List<Effect> list = categoryEffectModel2.effects;
            if (PatchProxy.isSupport(new Object[]{list}, this, f3970a, false, 78610, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f3970a, false, 78610, new Class[]{List.class}, Void.TYPE);
            } else {
                fh fhVar = ((ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) this.f3973d).get(ShortVideoContextViewModel.class)).f65401b;
                if (!(fhVar == null || list == null)) {
                    boolean b2 = fhVar.b();
                    boolean c2 = fhVar.c();
                    e e2 = com.ss.android.ugc.aweme.port.in.a.x.e();
                    boolean z2 = e2 != null && e2.j();
                    Iterator<Effect> it2 = list.iterator();
                    while (it2.hasNext()) {
                        Effect next = it2.next();
                        if (b2) {
                            if (PatchProxy.isSupport(new Object[]{"voice_recognization", next}, null, ae.f69286a, true, 78791, new Class[]{String.class, Effect.class}, Boolean.TYPE)) {
                                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{"voice_recognization", next}, null, ae.f69286a, true, 78791, new Class[]{String.class, Effect.class}, Boolean.TYPE)).booleanValue();
                            } else {
                                z = next != null && Lists.notEmpty(next.getTags()) && next.getTags().contains("voice_recognization");
                            }
                            if (z) {
                                it2.remove();
                            }
                        }
                        if (c2 && ae.c(next)) {
                            it2.remove();
                        } else if (ae.m(next) && !z2) {
                            it2.remove();
                        }
                    }
                }
            }
            if (this.o != null) {
                this.o.a(categoryEffectModel2.effects);
            }
            List<Effect> list2 = categoryEffectModel2.collection;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                this.f3974e.put(list2.get(i2).effect_id, list2.get(i2));
            }
        }
        this.q.put(str2, categoryEffectModel2);
    }

    public final void a(Effect effect, int i2, @Nullable ah ahVar) {
        if (PatchProxy.isSupport(new Object[]{effect, Integer.valueOf(i2), ahVar}, this, f3970a, false, 78595, new Class[]{Effect.class, Integer.TYPE, ah.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect, Integer.valueOf(i2), ahVar}, this, f3970a, false, 78595, new Class[]{Effect.class, Integer.TYPE, ah.class}, Void.TYPE);
            return;
        }
        b(effect, i2, ahVar);
    }

    public boolean a(@NonNull ah ahVar) {
        ah ahVar2 = ahVar;
        if (!PatchProxy.isSupport(new Object[]{ahVar2}, this, f3970a, false, 78609, new Class[]{ah.class}, Boolean.TYPE)) {
            return ahVar2.f69297d == 3 && ae.b(ahVar) && !ae.d(ahVar);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{ahVar2}, this, f3970a, false, 78609, new Class[]{ah.class}, Boolean.TYPE)).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f3971b = null;
        this.r = -1;
    }

    @NonNull
    public final String a() {
        if (this.p == null) {
            return "";
        }
        return this.p;
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f3970a, false, 78597, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3970a, false, 78597, new Class[0], Void.TYPE);
            return;
        }
        if (this.s != null) {
            this.s.a(null, null);
        }
    }

    @NonNull
    public final List<EffectCategoryModel> b() {
        if (PatchProxy.isSupport(new Object[0], this, f3970a, false, 78588, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f3970a, false, 78588, new Class[0], List.class);
        } else if (this.f3975f == null) {
            return new ArrayList();
        } else {
            return this.f3975f;
        }
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3970a, false, 78611, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3970a, false, 78611, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.e();
        }
    }

    public final EffectStickerManager a(ad adVar) {
        this.m = adVar;
        return this;
    }

    public final void c(Effect effect) {
        this.f3971b = effect;
        this.k = null;
        this.r = -1;
    }

    private void d(Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, this, f3970a, false, 78598, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect}, this, f3970a, false, 78598, new Class[]{Effect.class}, Void.TYPE);
            return;
        }
        if (this.s != null) {
            this.s.a(effect, null);
        }
    }

    private boolean e(Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, this, f3970a, false, 78600, new Class[]{Effect.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect}, this, f3970a, false, 78600, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f3971b == null || effect == null || this.f3971b.children == null) {
            return false;
        } else {
            return this.f3971b.children.contains(effect.effect_id);
        }
    }

    @Nullable
    public final CategoryEffectModel a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f3970a, false, 78590, new Class[]{String.class}, CategoryEffectModel.class)) {
            return this.q.get(str2);
        }
        return (CategoryEffectModel) PatchProxy.accessDispatch(new Object[]{str2}, this, f3970a, false, 78590, new Class[]{String.class}, CategoryEffectModel.class);
    }

    public final void a(LinearLayout linearLayout) {
        LinearLayout linearLayout2 = linearLayout;
        if (PatchProxy.isSupport(new Object[]{linearLayout2}, this, f3970a, false, 78585, new Class[]{LinearLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{linearLayout2}, this, f3970a, false, 78585, new Class[]{LinearLayout.class}, Void.TYPE);
            return;
        }
        this.s = new n(linearLayout2, linearLayout.getContext());
    }

    public final boolean b(Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, this, f3970a, false, 78603, new Class[]{Effect.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect}, this, f3970a, false, 78603, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f3971b == null || !this.f3971b.effect_id.equals(effect.effect_id)) {
            return false;
        } else {
            return true;
        }
    }

    public final void a(@Nullable Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, this, f3970a, false, 78599, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect}, this, f3970a, false, 78599, new Class[]{Effect.class}, Void.TYPE);
            return;
        }
        if (this.s != null) {
            this.s.a(null, null);
        }
        if (this.t != null) {
            this.t.a((Effect) null, 0);
        }
        if (this.u != null) {
            this.u.a(null, "");
        }
        ((CurUseStickerViewModel) ViewModelProviders.of((FragmentActivity) this.f3973d).get(CurUseStickerViewModel.class)).a(null);
        if (!e(effect)) {
            ((CurParentStickerViewModel) ViewModelProviders.of((FragmentActivity) this.f3973d).get(CurParentStickerViewModel.class)).a(new Pair(this.f3971b, null));
            if (this.m != null) {
                this.m.a(false, effect);
            }
            this.h.b(q.a(effect));
            c();
        }
    }

    @Nullable
    public final ah a(@Nullable List<ah> list, int i2) {
        List<ah> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i2)}, this, f3970a, false, 78601, new Class[]{List.class, Integer.TYPE}, ah.class)) {
            return (ah) PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i2)}, this, f3970a, false, 78601, new Class[]{List.class, Integer.TYPE}, ah.class);
        } else if (list2 == null) {
            return null;
        } else {
            int i3 = i2;
            if (list.size() - 2 < i3) {
                return null;
            }
            while (i3 < list.size()) {
                if (a(list2.get(i3))) {
                    return list2.get(i3);
                }
                i3++;
            }
            return null;
        }
    }

    public final void b(LinearLayout linearLayout, Context context) {
        LinearLayout linearLayout2 = linearLayout;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{linearLayout2, context2}, this, f3970a, false, 78587, new Class[]{LinearLayout.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{linearLayout2, context2}, this, f3970a, false, 78587, new Class[]{LinearLayout.class, Context.class}, Void.TYPE);
            return;
        }
        this.u = new d(linearLayout2, context2);
    }

    public final void b(@Nullable final ah ahVar, @Nullable final k.c cVar) {
        if (PatchProxy.isSupport(new Object[]{ahVar, cVar}, this, f3970a, false, 78606, new Class[]{ah.class, k.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ahVar, cVar}, this, f3970a, false, 78606, new Class[]{ah.class, k.c.class}, Void.TYPE);
        } else if (this.f3973d != null) {
            ((StickerFetchViewModel) ViewModelProviders.of((FragmentActivity) this.f3973d).get(StickerFetchViewModel.class)).a(this.g).observe(this.f3973d, new Observer<k>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69203a;

                public final /* synthetic */ void onChanged(@Nullable Object obj) {
                    k kVar = (k) obj;
                    if (PatchProxy.isSupport(new Object[]{kVar}, this, f69203a, false, 78613, new Class[]{k.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{kVar}, this, f69203a, false, 78613, new Class[]{k.class}, Void.TYPE);
                        return;
                    }
                    if (kVar != null) {
                        if (cVar == null) {
                            kVar.a(ahVar);
                            return;
                        }
                        kVar.a(ahVar, cVar);
                    }
                }
            });
        }
    }

    public final void a(LinearLayout linearLayout, Context context) {
        LinearLayout linearLayout2 = linearLayout;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{linearLayout2, context2}, this, f3970a, false, 78586, new Class[]{LinearLayout.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{linearLayout2, context2}, this, f3970a, false, 78586, new Class[]{LinearLayout.class, Context.class}, Void.TYPE);
            return;
        }
        this.t = new a(linearLayout2, context2);
    }

    public final void a(ah ahVar, k.c cVar) {
        ah ahVar2 = ahVar;
        k.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{ahVar2, cVar2}, this, f3970a, false, 78591, new Class[]{ah.class, k.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ahVar2, cVar2}, this, f3970a, false, 78591, new Class[]{ah.class, k.c.class}, Void.TYPE);
            return;
        }
        new a(this, ahVar2, cVar2).a();
    }

    public final void b(Effect effect, int i2, @Nullable ah ahVar) {
        String str;
        Effect effect2 = effect;
        int i3 = i2;
        ah ahVar2 = ahVar;
        if (PatchProxy.isSupport(new Object[]{effect2, Integer.valueOf(i2), ahVar2}, this, f3970a, false, 78596, new Class[]{Effect.class, Integer.TYPE, ah.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect2, Integer.valueOf(i2), ahVar2}, this, f3970a, false, 78596, new Class[]{Effect.class, Integer.TYPE, ah.class}, Void.TYPE);
            return;
        }
        if (!e(effect)) {
            if (this.l != null && this.n) {
                com.ss.android.ugc.aweme.utils.a.f75468b.a("prop_click", d.a().a("prop_id", effect2.effect_id).a("tab_name", FaceStickerBean.sCurPropSource).a("order", i3 - 1).a("enter_method", "click_main_panel").a("enter_from", "video_shoot_page").a("creation_id", this.l.q).a("shoot_way", this.l.r).a("draft_id", this.l.v).f34114b);
            }
            ((CurParentStickerViewModel) ViewModelProviders.of((FragmentActivity) this.f3973d).get(CurParentStickerViewModel.class)).a(new Pair(this.f3971b, effect2));
        } else {
            if (!(this.r == -1 || this.r == i3)) {
                ((CurChildStickerViewModel) ViewModelProviders.of((FragmentActivity) this.f3973d).get(CurChildStickerViewModel.class)).a(new Pair(Integer.valueOf(this.r), Integer.valueOf(i2)));
            }
            this.r = i3;
            this.k = effect2;
            if (this.l != null && this.n) {
                com.ss.android.ugc.aweme.utils.a.f75468b.a("prop_click", d.a().a("prop_id", effect2.effect_id).a("tab_name", FaceStickerBean.sCurPropSource).a("order", i3 - 1).a("enter_method", "click_banner").a("enter_from", "video_shoot_page").a("creation_id", this.l.q).a("shoot_way", this.l.r).a("draft_id", this.l.v).a("parent_pop_id", effect2.parent).f34114b);
            }
        }
        de.a();
        ((CurUseStickerViewModel) ViewModelProviders.of((FragmentActivity) this.f3973d).get(CurUseStickerViewModel.class)).a(effect2);
        this.h.a(q.a(effect));
        if (this.m != null) {
            this.m.a(true, this.f3971b);
        }
        d dVar = this.u;
        if (this.l != null) {
            str = this.l.r;
        } else {
            str = "";
        }
        if (dVar.a(effect2, str)) {
            d();
        } else if (this.t.a(effect2, i3)) {
            d();
        } else {
            d(effect);
        }
        if (ahVar2 != null) {
            b(ahVar2, (k.c) null);
        }
    }

    public EffectStickerManager(AppCompatActivity appCompatActivity, LifecycleOwner lifecycleOwner, EffectPlatform effectPlatform, m.a aVar, String str, fh fhVar) {
        this.p = str;
        this.f3973d = appCompatActivity;
        this.g = effectPlatform;
        this.h = aVar;
        this.f3972c = new HashMap<>();
        this.q = new HashMap<>();
        this.f3974e = new HashMap<>();
        this.l = fhVar;
        lifecycleOwner.getLifecycle().addObserver(this);
        if (PatchProxy.isSupport(new Object[0], this, f3970a, false, 78607, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3970a, false, 78607, new Class[0], Void.TYPE);
            return;
        }
        ((CurParentStickerViewModel) ViewModelProviders.of((FragmentActivity) this.f3973d).get(CurParentStickerViewModel.class)).f70247b.observe(this.f3973d, new f(this));
    }
}
