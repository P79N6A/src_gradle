package com.facebook.react.flat;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.a;
import com.facebook.react.flat.FlatViewGroup;
import javax.annotation.Nullable;

public final class DraweeRequestHelper {
    private static AbstractDraweeControllerBuilder sControllerBuilder;
    private static GenericDraweeHierarchyBuilder sHierarchyBuilder;
    private int mAttachCounter;
    private final DraweeController mDraweeController;

    /* access modifiers changed from: package-private */
    public final void detach() {
        this.mAttachCounter--;
        if (this.mAttachCounter == 0) {
            this.mDraweeController.onDetach();
        }
    }

    /* access modifiers changed from: package-private */
    public final Drawable getDrawable() {
        return getHierarchy().getTopLevelDrawable();
    }

    /* access modifiers changed from: package-private */
    public final GenericDraweeHierarchy getHierarchy() {
        return (GenericDraweeHierarchy) a.a(this.mDraweeController.getHierarchy());
    }

    static void setDraweeControllerBuilder(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder) {
        sControllerBuilder = abstractDraweeControllerBuilder;
    }

    static void setResources(Resources resources) {
        sHierarchyBuilder = new GenericDraweeHierarchyBuilder(resources);
    }

    /* access modifiers changed from: package-private */
    public final void attach(FlatViewGroup.InvalidateCallback invalidateCallback) {
        this.mAttachCounter++;
        if (this.mAttachCounter == 1) {
            getDrawable().setCallback((Drawable.Callback) invalidateCallback.get());
            this.mDraweeController.onAttach();
        }
    }

    DraweeRequestHelper(ImageRequest imageRequest, @Nullable ImageRequest imageRequest2, ControllerListener controllerListener) {
        AbstractDraweeControllerBuilder controllerListener2 = sControllerBuilder.setImageRequest(imageRequest).setCallerContext(RCTImageView.getCallerContext()).setControllerListener(controllerListener);
        if (imageRequest2 != null) {
            controllerListener2.setLowResImageRequest(imageRequest2);
        }
        AbstractDraweeController build = controllerListener2.build();
        build.setHierarchy(sHierarchyBuilder.build());
        this.mDraweeController = build;
    }
}
