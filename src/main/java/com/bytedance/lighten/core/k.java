package com.bytedance.lighten.core;

import android.support.annotation.Nullable;

public enum k {
    LOW,
    MEDIUM,
    HIGH;

    public static k getHigherPriority(@Nullable k kVar, @Nullable k kVar2) {
        if (kVar == null) {
            return kVar2;
        }
        if (kVar2 != null && kVar.ordinal() <= kVar2.ordinal()) {
            return kVar2;
        }
        return kVar;
    }
}
