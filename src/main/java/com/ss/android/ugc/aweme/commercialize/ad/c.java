package com.ss.android.ugc.aweme.commercialize.ad;

import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tB\u0017\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bB\u0005¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/ad/CircleDrawable;", "Landroid/graphics/drawable/GradientDrawable;", "bgColor", "", "topLeft", "", "topRight", "bottomRight", "bottomLeft", "(IFFFF)V", "radius", "(FI)V", "()V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c extends GradientDrawable {
    public c() {
    }

    public c(float f2, int i) {
        this();
        setColor(i);
        setCornerRadius(f2);
    }

    public c(int i, float f2, float f3, float f4, float f5) {
        this();
        setColor(i);
        setCornerRadii(new float[]{f2, f2, f3, f3, 0.0f, 0.0f, 0.0f, 0.0f});
    }
}
