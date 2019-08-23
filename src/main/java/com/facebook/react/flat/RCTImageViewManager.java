package com.facebook.react.flat;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.react.views.image.GlobalImageLoadListener;
import javax.annotation.Nullable;

public final class RCTImageViewManager extends FlatViewManager {
    @Nullable
    private final Object mCallerContext;
    @Nullable
    private AbstractDraweeControllerBuilder mDraweeControllerBuilder;
    @Nullable
    private GlobalImageLoadListener mGlobalImageLoadListener;

    public final String getName() {
        return "RCTImageView";
    }

    public final Object getCallerContext() {
        return this.mCallerContext;
    }

    public final Class<RCTImageView> getShadowNodeClass() {
        return RCTImageView.class;
    }

    public RCTImageViewManager() {
        this(null, null);
    }

    public final RCTImageView createShadowNodeInstance() {
        return new RCTImageView(new DrawImageWithDrawee(this.mGlobalImageLoadListener));
    }

    public final AbstractDraweeControllerBuilder getDraweeControllerBuilder() {
        if (this.mDraweeControllerBuilder == null) {
            this.mDraweeControllerBuilder = Fresco.newDraweeControllerBuilder();
        }
        return this.mDraweeControllerBuilder;
    }

    public final /* bridge */ /* synthetic */ void removeAllViews(FlatViewGroup flatViewGroup) {
        super.removeAllViews(flatViewGroup);
    }

    public final /* bridge */ /* synthetic */ void setBackgroundColor(FlatViewGroup flatViewGroup, int i) {
        super.setBackgroundColor(flatViewGroup, i);
    }

    public RCTImageViewManager(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, Object obj) {
        this(abstractDraweeControllerBuilder, null, obj);
    }

    public RCTImageViewManager(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, @Nullable GlobalImageLoadListener globalImageLoadListener, Object obj) {
        this.mDraweeControllerBuilder = abstractDraweeControllerBuilder;
        this.mGlobalImageLoadListener = globalImageLoadListener;
        this.mCallerContext = obj;
    }
}
