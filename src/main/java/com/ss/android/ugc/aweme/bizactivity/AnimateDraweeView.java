package com.ss.android.ugc.aweme.bizactivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.h;
import com.ss.android.ugc.aweme.base.utils.n;
import javax.annotation.Nullable;

public class AnimateDraweeView extends RemoteImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35205a;

    /* renamed from: b  reason: collision with root package name */
    private UrlModel f35206b;

    /* renamed from: c  reason: collision with root package name */
    private h.a f35207c;

    public AnimateDraweeView(Context context) {
        super(context);
    }

    public void setController(@Nullable DraweeController draweeController) {
        if (PatchProxy.isSupport(new Object[]{draweeController}, this, f35205a, false, 25674, new Class[]{DraweeController.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{draweeController}, this, f35205a, false, 25674, new Class[]{DraweeController.class}, Void.TYPE);
            return;
        }
        super.setController(draweeController);
    }

    private void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f35205a, false, 25677, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f35205a, false, 25677, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        DraweeController draweeController = null;
        try {
            draweeController = getController();
        } catch (NullPointerException unused) {
        }
        if (draweeController != null) {
            Animatable animatable = draweeController.getAnimatable();
            if (animatable != null) {
                if (i == 0) {
                    animatable.start();
                } else {
                    animatable.stop();
                }
            }
        }
    }

    public void onWindowVisibilityChanged(int i) {
        int i2;
        AnimateDraweeView animateDraweeView;
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f35205a, false, 25675, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f35205a, false, 25675, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            if (getVisibility() == 0) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            i2 = i3;
            animateDraweeView = this;
        } else {
            animateDraweeView = this;
            i2 = i;
        }
        animateDraweeView.a(i2);
    }

    public AnimateDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnimateDraweeView(Context context, GenericDraweeHierarchy genericDraweeHierarchy) {
        super(context, genericDraweeHierarchy);
    }

    public void onVisibilityChanged(@NonNull View view, int i) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f35205a, false, 25676, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f35205a, false, 25676, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onVisibilityChanged(view, i);
        a(i);
    }

    public AnimateDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void a(UrlModel urlModel, boolean z, Bitmap.Config config) {
        UrlModel urlModel2 = urlModel;
        Bitmap.Config config2 = config;
        if (PatchProxy.isSupport(new Object[]{urlModel2, (byte) 1, config2}, this, f35205a, false, 25668, new Class[]{UrlModel.class, Boolean.TYPE, Bitmap.Config.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel2, (byte) 1, config2}, this, f35205a, false, 25668, new Class[]{UrlModel.class, Boolean.TYPE, Bitmap.Config.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{urlModel2, (byte) 1, config2, null}, this, f35205a, false, 25669, new Class[]{UrlModel.class, Boolean.TYPE, Bitmap.Config.class, BaseControllerListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel2, (byte) 1, config2, null}, this, f35205a, false, 25669, new Class[]{UrlModel.class, Boolean.TYPE, Bitmap.Config.class, BaseControllerListener.class}, Void.TYPE);
            return;
        }
        if (!n.a(this.f35206b, urlModel2)) {
            this.f35206b = urlModel2;
            if (this.f35207c == null) {
                this.f35207c = new h.a();
            }
            h.a aVar = this.f35207c;
            UrlModel urlModel3 = this.f35206b;
            if (PatchProxy.isSupport(new Object[]{this, urlModel3, (byte) 1, config2, null}, aVar, h.a.f35023a, false, 25209, new Class[]{AnimateDraweeView.class, UrlModel.class, Boolean.TYPE, Bitmap.Config.class, BaseControllerListener.class}, Void.TYPE)) {
                Object[] objArr = {this, urlModel3, (byte) 1, config2, null};
                Object[] objArr2 = objArr;
                h.a aVar2 = aVar;
                PatchProxy.accessDispatch(objArr2, aVar2, h.a.f35023a, false, 25209, new Class[]{AnimateDraweeView.class, UrlModel.class, Boolean.TYPE, Bitmap.Config.class, BaseControllerListener.class}, Void.TYPE);
                return;
            }
            aVar.f35028f = this;
            aVar.f35027e = urlModel3;
            aVar.f35024b = true;
            aVar.f35025c = config2;
            if (PatchProxy.isSupport(new Object[]{null}, aVar, h.a.f35023a, false, 25213, new Class[]{BaseControllerListener.class}, Void.TYPE)) {
                Object[] objArr3 = {null};
                h.a aVar3 = aVar;
                PatchProxy.accessDispatch(objArr3, aVar3, h.a.f35023a, false, 25213, new Class[]{BaseControllerListener.class}, Void.TYPE);
                return;
            }
            aVar.a(aVar.f35024b, aVar.f35025c, (BaseControllerListener<ImageInfo>) null);
        }
    }
}
