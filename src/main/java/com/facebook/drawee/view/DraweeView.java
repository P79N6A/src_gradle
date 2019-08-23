package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.common.internal.Objects;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.drawee.view.a;
import com.facebook.imagepipeline.e.b;
import javax.annotation.Nullable;

public class DraweeView<DH extends DraweeHierarchy> extends ImageView {
    private static boolean sGlobalLegacyVisibilityHandlingEnabled;
    private float mAspectRatio = 0.0f;
    private DraweeHolder<DH> mDraweeHolder;
    private boolean mInitialised = false;
    private boolean mLegacyVisibilityHandlingEnabled = false;
    private final a.C0262a mMeasureSpec = new a.C0262a();

    public float getAspectRatio() {
        return this.mAspectRatio;
    }

    /* access modifiers changed from: protected */
    public void onAttach() {
        doAttach();
    }

    /* access modifiers changed from: protected */
    public void onDetach() {
        doDetach();
    }

    /* access modifiers changed from: protected */
    public void doAttach() {
        this.mDraweeHolder.onAttach();
    }

    /* access modifiers changed from: protected */
    public void doDetach() {
        this.mDraweeHolder.onDetach();
    }

    @Nullable
    public DraweeController getController() {
        return this.mDraweeHolder.getController();
    }

    public DH getHierarchy() {
        return this.mDraweeHolder.getHierarchy();
    }

    @Nullable
    public Drawable getTopLevelDrawable() {
        return this.mDraweeHolder.getTopLevelDrawable();
    }

    public boolean hasHierarchy() {
        return this.mDraweeHolder.hasHierarchy();
    }

    public boolean hasController() {
        if (this.mDraweeHolder.getController() != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeOverrideVisibilityHandling();
        onAttach();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        maybeOverrideVisibilityHandling();
        onDetach();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        maybeOverrideVisibilityHandling();
        onAttach();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        maybeOverrideVisibilityHandling();
        onDetach();
    }

    private void maybeOverrideVisibilityHandling() {
        boolean z;
        if (this.mLegacyVisibilityHandlingEnabled) {
            Drawable drawable = getDrawable();
            if (drawable != null) {
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable.setVisible(z, false);
            }
        }
    }

    public String toString() {
        String str;
        Objects.ToStringHelper stringHelper = Objects.toStringHelper((Object) this);
        if (this.mDraweeHolder != null) {
            str = this.mDraweeHolder.toString();
        } else {
            str = "<no holder set>";
        }
        return stringHelper.add("holder", (Object) str).toString();
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        sGlobalLegacyVisibilityHandlingEnabled = z;
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.mLegacyVisibilityHandlingEnabled = z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mDraweeHolder.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f2) {
        if (f2 != this.mAspectRatio) {
            this.mAspectRatio = f2;
            requestLayout();
        }
    }

    public void setController(@Nullable DraweeController draweeController) {
        this.mDraweeHolder.setController(draweeController);
        super.setImageDrawable(this.mDraweeHolder.getTopLevelDrawable());
    }

    public void setHierarchy(DH dh) {
        this.mDraweeHolder.setHierarchy(dh);
        super.setImageDrawable(this.mDraweeHolder.getTopLevelDrawable());
    }

    public DraweeView(Context context) {
        super(context);
        init(context);
    }

    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        init(getContext());
        this.mDraweeHolder.setController(null);
        super.setImageBitmap(bitmap);
    }

    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        init(getContext());
        this.mDraweeHolder.setController(null);
        super.setImageDrawable(drawable);
    }

    @Deprecated
    public void setImageResource(int i) {
        init(getContext());
        this.mDraweeHolder.setController(null);
        super.setImageResource(i);
    }

    @Deprecated
    public void setImageURI(Uri uri) {
        init(getContext());
        this.mDraweeHolder.setController(null);
        super.setImageURI(uri);
    }

    private void init(Context context) {
        try {
            if (b.isTracing()) {
                b.beginSection("DraweeView#init");
            }
            if (!this.mInitialised) {
                boolean z = true;
                this.mInitialised = true;
                this.mDraweeHolder = DraweeHolder.create(null, context);
                if (Build.VERSION.SDK_INT >= 21) {
                    ColorStateList imageTintList = getImageTintList();
                    if (imageTintList == null) {
                        if (b.isTracing()) {
                            b.endSection();
                        }
                        return;
                    }
                    setColorFilter(imageTintList.getDefaultColor());
                }
                if (!sGlobalLegacyVisibilityHandlingEnabled || context.getApplicationInfo().targetSdkVersion < 24) {
                    z = false;
                }
                this.mLegacyVisibilityHandlingEnabled = z;
                if (b.isTracing()) {
                    b.endSection();
                }
            }
        } finally {
            if (b.isTracing()) {
                b.endSection();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        maybeOverrideVisibilityHandling();
    }

    public DraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.mMeasureSpec.f23745a = i;
        this.mMeasureSpec.f23746b = i2;
        a.C0262a aVar = this.mMeasureSpec;
        float f2 = this.mAspectRatio;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (f2 > 0.0f && layoutParams != null) {
            if (a.a(layoutParams.height)) {
                aVar.f23746b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (View.MeasureSpec.getSize(aVar.f23745a) - paddingLeft)) / f2) + ((float) paddingTop)), aVar.f23746b), 1073741824);
            } else if (a.a(layoutParams.width)) {
                aVar.f23745a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (View.MeasureSpec.getSize(aVar.f23746b) - paddingTop)) * f2) + ((float) paddingLeft)), aVar.f23745a), 1073741824);
            }
        }
        super.onMeasure(this.mMeasureSpec.f23745a, this.mMeasureSpec.f23746b);
    }

    public DraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    @TargetApi(21)
    public DraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context);
    }
}
