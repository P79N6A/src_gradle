package com.ss.android.ugc.aweme.discover.base;

import android.support.v7.graphics.Palette;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.base.e;
import java.util.List;

class PaletteDelegate$1$1 implements Palette.PaletteAsyncListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42127a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e.AnonymousClass1 f42128b;

    PaletteDelegate$1$1(e.AnonymousClass1 r1) {
        this.f42128b = r1;
    }

    public void onGenerated(Palette palette) {
        if (PatchProxy.isSupport(new Object[]{palette}, this, f42127a, false, 36163, new Class[]{Palette.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{palette}, this, f42127a, false, 36163, new Class[]{Palette.class}, Void.TYPE);
        } else if (palette != null && !CollectionUtils.isEmpty(palette.getSwatches())) {
            List<Palette.Swatch> swatches = palette.getSwatches();
            Palette.Swatch swatch = swatches.get(0);
            for (Palette.Swatch next : swatches) {
                if (next.getPopulation() > swatch.getPopulation()) {
                    swatch = next;
                }
            }
            e.f42160e.put(Integer.valueOf(this.f42128b.f42166b.hashCode()), Integer.valueOf(swatch.getRgb()));
            if (e.this.a(this.f42128b.f42166b)) {
                e.this.a(swatch.getRgb());
                e.this.f42164f = palette;
            }
        } else if (e.this.a(this.f42128b.f42166b)) {
            e.this.a(e.this.f42161b);
        }
    }
}
