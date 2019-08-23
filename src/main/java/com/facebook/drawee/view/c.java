package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.GenericDraweeHierarchyInflater;
import com.facebook.imagepipeline.e.b;
import javax.annotation.Nullable;

public class c extends DraweeView<GenericDraweeHierarchy> {
    public c(Context context) {
        super(context);
        inflateHierarchy(context, null);
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflateHierarchy(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void inflateHierarchy(Context context, @Nullable AttributeSet attributeSet) {
        if (b.isTracing()) {
            b.beginSection("GenericDraweeView#inflateHierarchy");
        }
        GenericDraweeHierarchyBuilder inflateBuilder = GenericDraweeHierarchyInflater.inflateBuilder(context, attributeSet);
        setAspectRatio(inflateBuilder.getDesiredAspectRatio());
        setHierarchy(inflateBuilder.build());
        if (b.isTracing()) {
            b.endSection();
        }
    }

    public c(Context context, GenericDraweeHierarchy genericDraweeHierarchy) {
        super(context);
        setHierarchy(genericDraweeHierarchy);
    }

    public c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflateHierarchy(context, attributeSet);
    }

    @TargetApi(21)
    public c(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        inflateHierarchy(context, attributeSet);
    }
}
