package com.bytedance.android.livesdk.effect;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.effect.model.FilterModel;
import com.bytedance.android.livesdk.effect.model.LocalFilterModel;
import com.bytedance.android.livesdk.s;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.effect.b.g;
import com.ss.android.ugc.effectmanager.effect.b.i;
import com.ss.android.ugc.effectmanager.effect.b.m;
import com.ss.android.ugc.effectmanager.effect.b.p;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.h;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13783a;

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f13784f = ac.f(C0906R.array.ae);
    private static final String[] g = ac.f(C0906R.array.ad);
    private static final int[] h = new int[f13784f.length];
    private static String i;

    /* renamed from: b  reason: collision with root package name */
    public final List<FilterModel> f13785b;

    /* renamed from: c  reason: collision with root package name */
    h f13786c;

    /* renamed from: d  reason: collision with root package name */
    public String f13787d;

    /* renamed from: e  reason: collision with root package name */
    public String f13788e;
    private final List<Object> j;
    private final List<a> k;
    private String[] l;

    public interface a {
        void a(boolean z);
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final j f13797a = new j((byte) 0);
    }

    public static final j a() {
        return b.f13797a;
    }

    private j() {
        this.f13786c = TTLiveSDKContext.getHostService().a().i();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.f13785b = new ArrayList();
        b();
    }

    static {
        TypedArray typedArray;
        i = ac.a((int) C0906R.string.d1e);
        if (com.bytedance.android.live.uikit.a.a.f() && ((Integer) com.bytedance.android.livesdk.w.b.f17768f.a()).intValue() == 3) {
            i = "mtfeature";
        }
        Resources a2 = ac.a();
        if (a2 != null) {
            if (com.bytedance.android.livesdkapi.a.a.f18614b) {
                typedArray = a2.obtainTypedArray(C0906R.array.al);
            } else {
                typedArray = a2.obtainTypedArray(C0906R.array.am);
            }
            for (int i2 = 0; i2 < f13784f.length; i2++) {
                h[i2] = typedArray.getResourceId(i2, 0);
            }
            typedArray.recycle();
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f13783a, false, 8185, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13783a, false, 8185, new Class[0], Void.TYPE);
        } else if (this.f13786c != null) {
            AnonymousClass1 r1 = new g() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f13789a;

                public final void a(c cVar) {
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f13789a, false, 8198, new Class[]{c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f13789a, false, 8198, new Class[]{c.class}, Void.TYPE);
                        return;
                    }
                    j.this.a(false);
                }

                public final void a(EffectChannelResponse effectChannelResponse) {
                    EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                    if (PatchProxy.isSupport(new Object[]{effectChannelResponse2}, this, f13789a, false, 8197, new Class[]{EffectChannelResponse.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{effectChannelResponse2}, this, f13789a, false, 8197, new Class[]{EffectChannelResponse.class}, Void.TYPE);
                    } else if (effectChannelResponse2 != null && !Lists.isEmpty(effectChannelResponse2.allCategoryEffects)) {
                        if (effectChannelResponse.getPanelModel().tags.contains("new")) {
                            j.this.f13787d = effectChannelResponse.getPanelModel().id;
                            j.this.f13788e = effectChannelResponse.getPanelModel().tags_updated_at;
                        }
                        j jVar = j.this;
                        List<Effect> list = effectChannelResponse2.allCategoryEffects;
                        if (PatchProxy.isSupport(new Object[]{list}, jVar, j.f13783a, false, 8186, new Class[]{List.class}, Void.TYPE)) {
                            j jVar2 = jVar;
                            PatchProxy.accessDispatch(new Object[]{list}, jVar2, j.f13783a, false, 8186, new Class[]{List.class}, Void.TYPE);
                            return;
                        }
                        jVar.b();
                        for (int i = 0; i < list.size(); i++) {
                            Effect effect = list.get(i);
                            FilterModel filterModel = new FilterModel();
                            filterModel.setFilterType(2);
                            filterModel.setEffect(effect);
                            filterModel.setTags(effect.getTags());
                            if (com.ss.android.ugc.effectmanager.c.a()) {
                                if (jVar.f13786c != null && !com.ss.android.ugc.effectmanager.c.b().a(jVar.f13786c, effect)) {
                                    jVar.a(effect, i);
                                }
                            } else if (jVar.f13786c != null && !jVar.f13786c.a(effect) && !jVar.f13786c.b(effect)) {
                                jVar.a(effect, i);
                            }
                            jVar.f13785b.add(filterModel);
                            if (PatchProxy.isSupport(new Object[]{filterModel}, jVar, j.f13783a, false, 8187, new Class[]{FilterModel.class}, Void.TYPE)) {
                                j jVar3 = jVar;
                                PatchProxy.accessDispatch(new Object[]{filterModel}, jVar3, j.f13783a, false, 8187, new Class[]{FilterModel.class}, Void.TYPE);
                            } else if (filterModel.getEffect().getTags().contains("new")) {
                                j a2 = j.a();
                                String str = filterModel.getEffect().id;
                                String str2 = filterModel.getEffect().tags_updated_at;
                                AnonymousClass2 r15 = new m(filterModel) {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f13791a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ FilterModel f13792b;

                                    public final void a() {
                                        if (PatchProxy.isSupport(new Object[0], this, f13791a, false, 8199, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], this, f13791a, false, 8199, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        this.f13792b.setNew(true);
                                    }

                                    public final void b() {
                                        if (PatchProxy.isSupport(new Object[0], this, f13791a, false, 8200, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], this, f13791a, false, 8200, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        this.f13792b.setNew(false);
                                    }

                                    {
                                        this.f13792b = r2;
                                    }
                                };
                                Class[] clsArr = {String.class, String.class, m.class};
                                AnonymousClass2 r5 = r15;
                                if (PatchProxy.isSupport(new Object[]{str, str2, r15}, a2, j.f13783a, false, 8191, clsArr, Void.TYPE)) {
                                    j jVar4 = a2;
                                    PatchProxy.accessDispatch(new Object[]{str, str2, r5}, jVar4, j.f13783a, false, 8191, new Class[]{String.class, String.class, m.class}, Void.TYPE);
                                } else if (a2.f13786c == null || str == null || str2 == null || TextUtils.equals("NULL", str2.toUpperCase())) {
                                    r5.b();
                                } else {
                                    a2.f13786c.a(str, str2, (m) r5);
                                }
                            }
                        }
                        jVar.a(true);
                    }
                }
            };
            if (NetworkUtils.isNetworkAvailable(ac.e())) {
                this.f13786c.a(i, false, (g) r1);
            } else {
                this.f13786c.a(i, (g) r1);
            }
        }
    }

    public final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f13783a, false, 8196, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f13783a, false, 8196, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f13785b != null) {
            for (FilterModel isNew : this.f13785b) {
                if (isNew.isNew()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f13783a, false, 8184, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13783a, false, 8184, new Class[0], Void.TYPE);
            return;
        }
        this.f13785b.clear();
        if (PatchProxy.isSupport(new Object[0], this, f13783a, false, 8176, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13783a, false, 8176, new Class[0], Void.TYPE);
        } else if (com.bytedance.android.livesdkapi.a.a.f18614b) {
            this.l = ac.e().getResources().getStringArray(C0906R.array.an);
        } else {
            this.l = ac.e().getResources().getStringArray(C0906R.array.ao);
        }
        for (int i2 = 0; i2 < f13784f.length; i2++) {
            LocalFilterModel localFilterModel = new LocalFilterModel();
            localFilterModel.setId(String.valueOf(i2));
            localFilterModel.setName(this.l[i2]);
            localFilterModel.setCoverResId(h[i2]);
            localFilterModel.setFilterFilePath(s.INST.getFilterFilePath() + File.separator + f13784f[i2]);
            FilterModel filterModel = new FilterModel();
            if (i2 == 0) {
                filterModel.setFilterType(0);
            } else {
                filterModel.setFilterType(1);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(g[i2]);
            arrayList.add("beautyTag:whitenIntensity");
            filterModel.setTags(arrayList);
            filterModel.setLocalFilter(localFilterModel);
            this.f13785b.add(filterModel);
        }
    }

    /* synthetic */ j(byte b2) {
        this();
    }

    public final void a(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f13783a, false, 8179, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f13783a, false, 8179, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.k.add(aVar2);
    }

    public final void b(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f13783a, false, 8180, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f13783a, false, 8180, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.k.remove(aVar2);
    }

    public final boolean b(FilterModel filterModel) {
        if (PatchProxy.isSupport(new Object[]{filterModel}, this, f13783a, false, 8182, new Class[]{FilterModel.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{filterModel}, this, f13783a, false, 8182, new Class[]{FilterModel.class}, Boolean.TYPE)).booleanValue();
        } else if (filterModel == null) {
            return false;
        } else {
            if (filterModel.getFilterType() != 2) {
                return true;
            }
            if (!com.ss.android.ugc.effectmanager.c.a() || filterModel.getEffect() == null) {
                if (this.f13786c == null || !this.f13786c.a(filterModel.getEffect())) {
                    return false;
                }
                return true;
            } else if (this.f13786c == null || !com.ss.android.ugc.effectmanager.c.b().a(this.f13786c, filterModel.getEffect())) {
                return false;
            } else {
                return true;
            }
        }
    }

    public final void a(FilterModel filterModel) {
        if (PatchProxy.isSupport(new Object[]{filterModel}, this, f13783a, false, 8181, new Class[]{FilterModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{filterModel}, this, f13783a, false, 8181, new Class[]{FilterModel.class}, Void.TYPE);
        } else if (filterModel.getFilterType() == 2) {
            a(filterModel.getEffect(), this.f13785b.indexOf(filterModel));
        }
    }

    public final boolean c(FilterModel filterModel) {
        if (PatchProxy.isSupport(new Object[]{filterModel}, this, f13783a, false, 8183, new Class[]{FilterModel.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{filterModel}, this, f13783a, false, 8183, new Class[]{FilterModel.class}, Boolean.TYPE)).booleanValue();
        } else if (filterModel.getFilterType() == 2 && this.f13786c != null && this.f13786c.b(filterModel.getEffect())) {
            return true;
        } else {
            return false;
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f13783a, false, 8189, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f13783a, false, 8189, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!Lists.isEmpty(this.k)) {
            for (a a2 : this.k) {
                a2.a(z);
            }
        }
    }

    public final void a(int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f13783a, false, 8190, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z)}, this, f13783a, false, 8190, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (!Lists.isEmpty(this.j)) {
            for (int i3 = 0; i3 < this.j.size(); i3++) {
                this.j.get(i3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Effect effect, final int i2) {
        if (PatchProxy.isSupport(new Object[]{effect, Integer.valueOf(i2)}, this, f13783a, false, 8188, new Class[]{Effect.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect, Integer.valueOf(i2)}, this, f13783a, false, 8188, new Class[]{Effect.class, Integer.TYPE}, Void.TYPE);
        } else if (effect != null && NetworkUtils.isNetworkAvailable(ac.e())) {
            this.f13786c.a(effect, (i) new i() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f13794a;

                public final void b(Effect effect) {
                }

                public final void a(Effect effect) {
                    if (PatchProxy.isSupport(new Object[]{effect}, this, f13794a, false, 8201, new Class[]{Effect.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{effect}, this, f13794a, false, 8201, new Class[]{Effect.class}, Void.TYPE);
                        return;
                    }
                    j.this.a(i2, true);
                }

                public final void a(Effect effect, c cVar) {
                    if (PatchProxy.isSupport(new Object[]{effect, cVar}, this, f13794a, false, 8202, new Class[]{Effect.class, c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{effect, cVar}, this, f13794a, false, 8202, new Class[]{Effect.class, c.class}, Void.TYPE);
                        return;
                    }
                    j.this.a(i2, false);
                }
            });
        }
    }

    public final void a(String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, (byte) 0}, this, f13783a, false, 8195, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, (byte) 0}, this, f13783a, false, 8195, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f13785b != null && !TextUtils.isEmpty(str)) {
            for (FilterModel next : this.f13785b) {
                if (next.getEffect() != null && str2.equals(next.getEffect().id)) {
                    next.setNew(false);
                    String str3 = next.getEffect().tags_updated_at;
                    if (PatchProxy.isSupport(new Object[]{str2, str3, null}, this, f13783a, false, 8192, new Class[]{String.class, String.class, p.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str2, str3, null}, this, f13783a, false, 8192, new Class[]{String.class, String.class, p.class}, Void.TYPE);
                    } else if (this.f13786c != null) {
                        this.f13786c.a(str2, str3, (p) null);
                    }
                }
            }
        }
    }
}
