package com.ss.android.ugc.aweme.effectplatform;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.effect.b.f;
import com.ss.android.ugc.effectmanager.effect.b.g;
import com.ss.android.ugc.effectmanager.effect.b.k;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.h;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43812a;

    /* renamed from: d  reason: collision with root package name */
    private static final File f43813d = new File(a.f61119b.getFilesDir(), "effect");

    /* renamed from: b  reason: collision with root package name */
    boolean f43814b;

    /* renamed from: c  reason: collision with root package name */
    public h f43815c;

    public final void a(@NonNull String str, boolean z, String str2, int i, int i2, k kVar) {
        k kVar2 = kVar;
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0), str2, Integer.valueOf(i), Integer.valueOf(i2), kVar2}, this, f43812a, false, 38949, new Class[]{String.class, Boolean.TYPE, String.class, Integer.TYPE, Integer.TYPE, k.class}, Void.TYPE)) {
            Object[] objArr = {str, Byte.valueOf(z), str2, Integer.valueOf(i), Integer.valueOf(i2), kVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f43812a, false, 38949, new Class[]{String.class, Boolean.TYPE, String.class, Integer.TYPE, Integer.TYPE, k.class}, Void.TYPE);
            return;
        }
        h hVar = this.f43815c;
        if (hVar.h == null || hVar.f77488a == null) {
            if (kVar2 != null) {
                kVar2.a(new c((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        String b2 = h.b();
        hVar.h.f77204a.z.a(b2, kVar2);
        hVar.f77488a.a(str, b2, z, str2, i, i2, true);
    }

    public final boolean a(@Nullable Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, this, f43812a, false, 38974, new Class[]{Effect.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect}, this, f43812a, false, 38974, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
        } else if (effect == null || this.f43815c == null) {
            return false;
        } else {
            return com.ss.android.ugc.effectmanager.c.b().a(this.f43815c, effect);
        }
    }

    public static String a() {
        if (PatchProxy.isSupport(new Object[0], null, f43812a, true, 38944, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f43812a, true, 38944, new Class[0], String.class);
        }
        return f43813d.getAbsolutePath();
    }

    /* access modifiers changed from: package-private */
    public c b() {
        if (PatchProxy.isSupport(new Object[0], this, f43812a, false, 38965, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], this, f43812a, false, 38965, new Class[0], c.class);
        }
        c cVar = new c(new Exception());
        cVar.f77315a = -1;
        cVar.f77316b = "effect sdk manager init failed";
        return cVar;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public Map<String, String> a(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f43812a, false, 38964, new Class[]{String.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{str2}, this, f43812a, false, 38964, new Class[]{String.class}, Map.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("scene", str2);
            return hashMap;
        }
    }

    private void a(@NonNull String str, @NonNull com.ss.android.ugc.effectmanager.effect.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{str, aVar}, this, f43812a, false, 38946, new Class[]{String.class, com.ss.android.ugc.effectmanager.effect.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, aVar}, this, f43812a, false, 38946, new Class[]{String.class, com.ss.android.ugc.effectmanager.effect.b.a.class}, Void.TYPE);
        } else if (!this.f43814b) {
            aVar.a(b());
        } else {
            this.f43815c.a(str, (String) null, 0, aVar);
        }
    }

    public final void a(@NonNull String str, @NonNull g gVar) {
        if (PatchProxy.isSupport(new Object[]{str, gVar}, this, f43812a, false, 38954, new Class[]{String.class, g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, gVar}, this, f43812a, false, 38954, new Class[]{String.class, g.class}, Void.TYPE);
        } else if (!this.f43814b) {
            gVar.a(b());
        } else {
            this.f43815c.a(str, gVar);
        }
    }

    public final void b(@NonNull final String str, boolean z, @NonNull g gVar) {
        String str2 = str;
        final g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0), gVar2}, this, f43812a, false, 38955, new Class[]{String.class, Boolean.TYPE, g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z), gVar2}, this, f43812a, false, 38955, new Class[]{String.class, Boolean.TYPE, g.class}, Void.TYPE);
        } else if (!this.f43814b) {
            gVar2.a(b());
        } else {
            final boolean z2 = z;
            a(str, (com.ss.android.ugc.effectmanager.effect.b.a) new com.ss.android.ugc.effectmanager.effect.b.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f43828a;

                public final void a(c cVar) {
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f43828a, false, 38980, new Class[]{c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f43828a, false, 38980, new Class[]{c.class}, Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.framework.a.a.a("EffectPlatform", "checkChannel fail : " + cVar.toString());
                    d.this.a(str, (g) new g() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f43835a;

                        public final void a(c cVar) {
                            if (PatchProxy.isSupport(new Object[]{cVar}, this, f43835a, false, 38984, new Class[]{c.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{cVar}, this, f43835a, false, 38984, new Class[]{c.class}, Void.TYPE);
                                return;
                            }
                            com.ss.android.ugc.aweme.framework.a.a.a("EffectPlatform", "fetchListFromCache fail : " + cVar.toString());
                            d.this.a(str, z2, gVar2);
                        }

                        public final void a(EffectChannelResponse effectChannelResponse) {
                            if (PatchProxy.isSupport(new Object[]{effectChannelResponse}, this, f43835a, false, 38983, new Class[]{EffectChannelResponse.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{effectChannelResponse}, this, f43835a, false, 38983, new Class[]{EffectChannelResponse.class}, Void.TYPE);
                            } else if (effectChannelResponse.allCategoryEffects.size() == 0) {
                                d.this.a(str, z2, gVar2);
                            } else {
                                gVar2.a(effectChannelResponse);
                            }
                        }
                    });
                }

                public final void a(boolean z) {
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f43828a, false, 38979, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f43828a, false, 38979, new Class[]{Boolean.TYPE}, Void.TYPE);
                    } else if (z) {
                        d.this.a(str, z2, gVar2);
                    } else {
                        d.this.a(str, (g) new g() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f43833a;

                            public final void a(c cVar) {
                                if (PatchProxy.isSupport(new Object[]{cVar}, this, f43833a, false, 38982, new Class[]{c.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f43833a, false, 38982, new Class[]{c.class}, Void.TYPE);
                                    return;
                                }
                                com.ss.android.ugc.aweme.framework.a.a.a("EffectPlatform", "fetchListFromCache fail : " + cVar.toString());
                                d.this.a(str, z2, gVar2);
                            }

                            public final void a(EffectChannelResponse effectChannelResponse) {
                                if (PatchProxy.isSupport(new Object[]{effectChannelResponse}, this, f43833a, false, 38981, new Class[]{EffectChannelResponse.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{effectChannelResponse}, this, f43833a, false, 38981, new Class[]{EffectChannelResponse.class}, Void.TYPE);
                                } else if (effectChannelResponse.allCategoryEffects.size() == 0) {
                                    d.this.a(str, z2, gVar2);
                                } else {
                                    gVar2.a(effectChannelResponse);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public final void a(@NonNull String str, boolean z, @NonNull g gVar) {
        String str2 = str;
        g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0), gVar2}, this, f43812a, false, 38947, new Class[]{String.class, Boolean.TYPE, g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z), gVar2}, this, f43812a, false, 38947, new Class[]{String.class, Boolean.TYPE, g.class}, Void.TYPE);
            return;
        }
        j a2 = j.a(str, gVar2);
        if (!this.f43814b) {
            a2.a(b());
        } else {
            this.f43815c.a(str, z, (g) a2);
        }
    }

    public final void a(@NonNull String str, String str2, int i, int i2, int i3, String str3, boolean z, @NonNull f fVar) {
        String str4 = str;
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{str4, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str3, Byte.valueOf(z ? (byte) 1 : 0), fVar2}, this, f43812a, false, 38958, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str3, Byte.valueOf(z), fVar2}, this, f43812a, false, 38958, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE, f.class}, Void.TYPE);
            return;
        }
        final i a2 = i.a(str4, i, i2, fVar2);
        if (z) {
            final f fVar3 = fVar;
            final String str5 = str;
            final String str6 = str2;
            final int i4 = i;
            final int i5 = i2;
            final int i6 = i3;
            h hVar = this.f43815c;
            final String str7 = str3;
            AnonymousClass4 r0 = new f() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f43837a;

                public final void a(CategoryPageModel categoryPageModel) {
                    CategoryPageModel categoryPageModel2 = categoryPageModel;
                    if (PatchProxy.isSupport(new Object[]{categoryPageModel2}, this, f43837a, false, 38985, new Class[]{CategoryPageModel.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{categoryPageModel2}, this, f43837a, false, 38985, new Class[]{CategoryPageModel.class}, Void.TYPE);
                        return;
                    }
                    fVar3.a(categoryPageModel2);
                }

                public final void a(c cVar) {
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f43837a, false, 38986, new Class[]{c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f43837a, false, 38986, new Class[]{c.class}, Void.TYPE);
                        return;
                    }
                    d.this.f43815c.a(str5, str6, i4, i5, i6, str7, a2);
                }
            };
            hVar.b(str, str2, i, i2, i3, str3, r0);
            return;
        }
        this.f43815c.a(str, str2, i, i2, i3, str3, a2);
    }
}
