package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.sticker.Sticker;
import com.ss.android.ugc.aweme.video.b;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70099a;

    /* renamed from: b  reason: collision with root package name */
    public ProviderEffect f70100b;
    @Sticker.StickerState

    /* renamed from: c  reason: collision with root package name */
    public int f70101c;

    /* renamed from: d  reason: collision with root package name */
    public int f70102d;

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f70099a, false, 79406, new Class[0], Integer.TYPE)) {
            return super.hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f70099a, false, 79406, new Class[0], Integer.TYPE)).intValue();
    }

    public static boolean a(@Nullable ProviderEffect providerEffect) {
        ProviderEffect providerEffect2 = providerEffect;
        if (PatchProxy.isSupport(new Object[]{providerEffect2}, null, f70099a, true, 79403, new Class[]{ProviderEffect.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{providerEffect2}, null, f70099a, true, 79403, new Class[]{ProviderEffect.class}, Boolean.TYPE)).booleanValue();
        }
        if (providerEffect2 != null && TextUtils.isEmpty(providerEffect2.path)) {
            providerEffect2.path = a.f61119b.getFilesDir() + File.separator + "effect" + File.separator + providerEffect2.id + ".gif";
        }
        if (providerEffect2 == null || !b.b(providerEffect2.path)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f70099a, false, 79405, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f70099a, false, 79405, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f70100b.equals(((p) obj).f70100b);
        }
    }

    public static List<p> a(@Nullable List<ProviderEffect> list) {
        int i;
        if (PatchProxy.isSupport(new Object[]{list}, null, f70099a, true, 79400, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, null, f70099a, true, 79400, new Class[]{List.class}, List.class);
        } else if (CollectionUtils.isEmpty(list)) {
            return new ArrayList();
        } else {
            ArrayList arrayList = new ArrayList();
            for (ProviderEffect next : list) {
                if (PatchProxy.isSupport(new Object[]{next}, null, f70099a, true, 79404, new Class[]{ProviderEffect.class}, Integer.TYPE)) {
                    i = ((Integer) PatchProxy.accessDispatch(new Object[]{next}, null, f70099a, true, 79404, new Class[]{ProviderEffect.class}, Integer.TYPE)).intValue();
                } else if (a(next)) {
                    i = 1;
                } else {
                    i = 3;
                }
                arrayList.add(new p(next, i));
            }
            return arrayList;
        }
    }

    private p(ProviderEffect providerEffect, @Sticker.StickerState int i) {
        this.f70100b = providerEffect;
        this.f70101c = i;
    }
}
