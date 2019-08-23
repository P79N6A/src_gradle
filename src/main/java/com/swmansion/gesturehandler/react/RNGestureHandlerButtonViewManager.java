package com.swmansion.gesturehandler.react;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;

public class RNGestureHandlerButtonViewManager extends ViewGroupManager<a> {

    static class a extends ViewGroup {

        /* renamed from: a  reason: collision with root package name */
        static TypedValue f78802a = new TypedValue();

        /* renamed from: b  reason: collision with root package name */
        static a f78803b;

        /* renamed from: c  reason: collision with root package name */
        int f78804c;

        /* renamed from: d  reason: collision with root package name */
        boolean f78805d;

        /* renamed from: e  reason: collision with root package name */
        boolean f78806e;

        /* renamed from: f  reason: collision with root package name */
        float f78807f;
        boolean g = true;

        public final void dispatchDrawableHotspotChanged(float f2, float f3) {
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* access modifiers changed from: package-private */
        public Drawable a() {
            String str;
            int i = Build.VERSION.SDK_INT;
            if (!this.f78806e || i < 21) {
                str = "selectableItemBackground";
            } else {
                str = "selectableItemBackgroundBorderless";
            }
            getContext().getTheme().resolveAttribute(getResources().getIdentifier(str, "attr", "android"), f78802a, true);
            if (i >= 21) {
                return getResources().getDrawable(f78802a.resourceId, getContext().getTheme());
            }
            return com.ss.android.ugc.bytex.a.a.a.a(getResources(), f78802a.resourceId);
        }

        public final void setUseBorderlessDrawable(boolean z) {
            this.f78806e = z;
        }

        public final void setBackgroundColor(int i) {
            this.f78804c = i;
            this.g = true;
        }

        public final void setUseDrawableOnForeground(boolean z) {
            this.f78805d = z;
            this.g = true;
        }

        public a(Context context) {
            super(context);
            setClickable(true);
            setFocusable(true);
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            onTouchEvent(motionEvent);
            if (isPressed()) {
                return true;
            }
            return false;
        }

        public final void setBorderRadius(float f2) {
            this.f78807f = f2 * getResources().getDisplayMetrics().density;
            this.g = true;
        }

        public final void setPressed(boolean z) {
            if (z && f78803b == null) {
                f78803b = this;
            }
            if (!z || f78803b == this) {
                super.setPressed(z);
            }
            if (!z && f78803b == this) {
                f78803b = null;
            }
        }

        public final void drawableHotspotChanged(float f2, float f3) {
            if (f78803b == null || f78803b == this) {
                super.drawableHotspotChanged(f2, f3);
            }
        }
    }

    public String getName() {
        return "RNGestureHandlerButton";
    }

    public a createViewInstance(ThemedReactContext themedReactContext) {
        return new a(themedReactContext);
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(a aVar) {
        if (aVar.g) {
            aVar.g = false;
            if (aVar.f78804c == 0) {
                aVar.setBackground(null);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                aVar.setForeground(null);
            }
            if (aVar.f78805d && Build.VERSION.SDK_INT >= 23) {
                aVar.setForeground(aVar.a());
                if (aVar.f78804c != 0) {
                    aVar.setBackgroundColor(aVar.f78804c);
                }
            } else if (aVar.f78804c == 0) {
                aVar.setBackground(aVar.a());
            } else {
                PaintDrawable paintDrawable = new PaintDrawable(aVar.f78804c);
                Drawable a2 = aVar.a();
                if (aVar.f78807f != 0.0f) {
                    paintDrawable.setCornerRadius(aVar.f78807f);
                    if (Build.VERSION.SDK_INT >= 21 && (a2 instanceof RippleDrawable)) {
                        PaintDrawable paintDrawable2 = new PaintDrawable(-1);
                        paintDrawable2.setCornerRadius(aVar.f78807f);
                        ((RippleDrawable) a2).setDrawableByLayerId(16908334, paintDrawable2);
                    }
                }
                aVar.setBackground(new LayerDrawable(new Drawable[]{paintDrawable, a2}));
            }
        }
    }

    @ReactProp(name = "borderRadius")
    public void setBorderRadius(a aVar, float f2) {
        aVar.setBorderRadius(f2);
    }

    @ReactProp(name = "borderless")
    public void setBorderless(a aVar, boolean z) {
        aVar.setUseBorderlessDrawable(z);
    }

    @ReactProp(name = "enabled")
    public void setEnabled(a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    @ReactProp(name = "foreground")
    @TargetApi(23)
    public void setForeground(a aVar, boolean z) {
        aVar.setUseDrawableOnForeground(z);
    }
}
