package com.bytedance.lighten.loader;

import com.bytedance.lighten.core.b;
import com.facebook.drawee.generic.RoundingParams;

public final class h {
    public static RoundingParams.RoundingMethod a(b.C0222b bVar) {
        switch (bVar) {
            case BITMAP_ONLY:
                return RoundingParams.RoundingMethod.BITMAP_ONLY;
            case OVERLAY_COLOR:
                return RoundingParams.RoundingMethod.OVERLAY_COLOR;
            default:
                return RoundingParams.RoundingMethod.BITMAP_ONLY;
        }
    }
}
