package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.support.annotation.Nullable;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effectplatform.g;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.sticker.Sticker;
import com.ss.android.ugc.aweme.video.b;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;

public class ah {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69294a;

    /* renamed from: b  reason: collision with root package name */
    public Effect f69295b;

    /* renamed from: c  reason: collision with root package name */
    public String f69296c;
    @Sticker.StickerState

    /* renamed from: d  reason: collision with root package name */
    public int f69297d;

    /* renamed from: e  reason: collision with root package name */
    public int f69298e;

    public static boolean a(@Nullable Effect effect, @Nullable g gVar, boolean z) {
        Effect effect2 = effect;
        g gVar2 = gVar;
        if (!PatchProxy.isSupport(new Object[]{effect2, gVar2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f69294a, true, 78814, new Class[]{Effect.class, g.class, Boolean.TYPE}, Boolean.TYPE)) {
            return z ? effect2 != null && b.b(effect2.unzipPath) : (gVar2 == null || effect2 == null || (!gVar2.a(effect2) && effect2.effect_type == 0 && !effect.getTags().contains("hw_beauty"))) ? false : true;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect2, gVar2, Byte.valueOf(z)}, null, f69294a, true, 78814, new Class[]{Effect.class, g.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f69294a, false, 78817, new Class[0], Integer.TYPE)) {
            return super.hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f69294a, false, 78817, new Class[0], Integer.TYPE)).intValue();
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f69294a, false, 78816, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f69294a, false, 78816, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f69295b.equals(((ah) obj).f69295b);
        }
    }

    public static ah a(ah ahVar, @Nullable g gVar) {
        ah ahVar2 = ahVar;
        g gVar2 = gVar;
        if (!PatchProxy.isSupport(new Object[]{ahVar2, gVar2}, null, f69294a, true, 78810, new Class[]{ah.class, g.class}, ah.class)) {
            return new ah(ahVar2.f69295b, ahVar2.f69296c, b(ahVar2.f69295b, gVar2));
        }
        return (ah) PatchProxy.accessDispatch(new Object[]{ahVar2, gVar2}, null, f69294a, true, 78810, new Class[]{ah.class, g.class}, ah.class);
    }

    @Sticker.StickerState
    public static int b(@Nullable Effect effect, @Nullable g gVar) {
        if (PatchProxy.isSupport(new Object[]{effect, gVar}, null, f69294a, true, 78815, new Class[]{Effect.class, g.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{effect, gVar}, null, f69294a, true, 78815, new Class[]{Effect.class, g.class}, Integer.TYPE)).intValue();
        } else if (a(effect, gVar)) {
            return 1;
        } else {
            return 3;
        }
    }

    public static ah a(Effect effect, @Nullable String str) {
        Effect effect2 = effect;
        String str2 = str;
        boolean z = false;
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{effect2, str2}, null, f69294a, true, 78811, new Class[]{Effect.class, String.class}, ah.class)) {
            return (ah) PatchProxy.accessDispatch(new Object[]{effect2, str2}, null, f69294a, true, 78811, new Class[]{Effect.class, String.class}, ah.class);
        }
        if (effect2 != null && (b.b(effect2.unzipPath) || effect2.effect_type != 0 || effect.getTags().contains("hw_beauty"))) {
            z = true;
        }
        if (!z) {
            i = 3;
        }
        return new ah(effect2, str2, i);
    }

    public static List<ah> a(@Nullable List<Effect> list, @Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{list, str2}, null, f69294a, true, 78808, new Class[]{List.class, String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list, str2}, null, f69294a, true, 78808, new Class[]{List.class, String.class}, List.class);
        } else if (CollectionUtils.isEmpty(list)) {
            return new ArrayList();
        } else {
            ArrayList arrayList = new ArrayList();
            for (Effect next : list) {
                if ((a.x.c() || !ae.g(next)) && (!a.x.a() || !ae.g(next))) {
                    arrayList.add(new ah(next, str2, 3));
                }
            }
            return arrayList;
        }
    }

    public static boolean a(@Nullable Effect effect, @Nullable g gVar) {
        Effect effect2 = effect;
        g gVar2 = gVar;
        if (!PatchProxy.isSupport(new Object[]{effect2, gVar2}, null, f69294a, true, 78813, new Class[]{Effect.class, g.class}, Boolean.TYPE)) {
            return a(effect2, gVar2, false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect2, gVar2}, null, f69294a, true, 78813, new Class[]{Effect.class, g.class}, Boolean.TYPE)).booleanValue();
    }

    private ah(Effect effect, String str, @Sticker.StickerState int i) {
        this.f69295b = effect;
        this.f69296c = str;
        this.f69297d = i;
    }

    public static ah a(Effect effect, @Nullable String str, @Nullable g gVar) {
        Effect effect2 = effect;
        String str2 = str;
        g gVar2 = gVar;
        int i = 3;
        if (PatchProxy.isSupport(new Object[]{effect2, str2, gVar2}, null, f69294a, true, 78809, new Class[]{Effect.class, String.class, g.class}, ah.class)) {
            return (ah) PatchProxy.accessDispatch(new Object[]{effect2, str2, gVar2}, null, f69294a, true, 78809, new Class[]{Effect.class, String.class, g.class}, ah.class);
        }
        if (a(effect2, gVar2)) {
            i = 1;
        }
        return new ah(effect2, str2, i);
    }
}
