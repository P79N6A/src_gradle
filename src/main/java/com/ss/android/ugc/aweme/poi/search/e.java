package com.ss.android.ugc.aweme.poi.search;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

public final class e extends a {
    public final String getPoiSearchRegionType() {
        return "domestic";
    }

    public final int getSearchType() {
        if (this.f60332b) {
            return 2;
        }
        return 0;
    }

    public e(@NonNull Context context, String str, boolean z) {
        this(context, null, str, z);
    }

    private e(@NonNull Context context, @Nullable AttributeSet attributeSet, String str, boolean z) {
        this(context, null, 0, str, z);
    }

    private e(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, String str, boolean z) {
        super(context, attributeSet, 0, str, z);
    }
}
