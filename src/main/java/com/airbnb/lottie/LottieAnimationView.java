package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.FloatRange;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RawRes;
import android.support.annotation.VisibleForTesting;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.JsonReader;
import android.view.View;
import com.airbnb.lottie.c.e;
import com.airbnb.lottie.c.g;
import com.airbnb.lottie.g.c;
import java.io.StringReader;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public class LottieAnimationView extends AppCompatImageView {
    public static final a DEFAULT_CACHE_STRATEGY = a.Weak;
    private static final String TAG = LottieAnimationView.class.getSimpleName();
    private String animationName;
    @RawRes
    private int animationResId;
    private boolean autoPlay = false;
    @Nullable
    private LottieComposition composition;
    @Nullable
    private k compositionTask;
    private a defaultCacheStrategy;
    private final h<Throwable> failureListener = new h<Throwable>() {
        public final /* synthetic */ void a(Object obj) {
            throw new IllegalStateException("Unable to parse composition", (Throwable) obj);
        }
    };
    private final h<LottieComposition> loadedListener = new h<LottieComposition>() {
        public final /* synthetic */ void a(Object obj) {
            LottieAnimationView.this.setComposition((LottieComposition) obj);
        }
    };
    private final LottieDrawable lottieDrawable = new LottieDrawable();
    private boolean useHardwareLayer = false;
    private boolean wasAnimatingWhenDetached = false;

    @Deprecated
    public enum a {
        None,
        Weak,
        Strong
    }

    static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new b[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new b(parcel, (byte) 0);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        String f4530a;

        /* renamed from: b  reason: collision with root package name */
        int f4531b;

        /* renamed from: c  reason: collision with root package name */
        float f4532c;

        /* renamed from: d  reason: collision with root package name */
        boolean f4533d;

        /* renamed from: e  reason: collision with root package name */
        String f4534e;

        /* renamed from: f  reason: collision with root package name */
        int f4535f;
        int g;

        b(Parcelable parcelable) {
            super(parcelable);
        }

        private b(Parcel parcel) {
            super(parcel);
            this.f4530a = parcel.readString();
            this.f4532c = parcel.readFloat();
            this.f4533d = parcel.readInt() != 1 ? false : true;
            this.f4534e = parcel.readString();
            this.f4535f = parcel.readInt();
            this.g = parcel.readInt();
        }

        /* synthetic */ b(Parcel parcel, byte b2) {
            this(parcel);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f4530a);
            parcel.writeFloat(this.f4532c);
            parcel.writeInt(this.f4533d ? 1 : 0);
            parcel.writeString(this.f4534e);
            parcel.writeInt(this.f4535f);
            parcel.writeInt(this.g);
        }
    }

    @Nullable
    public LottieComposition getComposition() {
        return this.composition;
    }

    public boolean getUseHardwareAcceleration() {
        return this.useHardwareLayer;
    }

    public int getFrame() {
        return this.lottieDrawable.getFrame();
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.lottieDrawable.getImageAssetsFolder();
    }

    public float getMaxFrame() {
        return this.lottieDrawable.getMaxFrame();
    }

    public float getMinFrame() {
        return this.lottieDrawable.getMinFrame();
    }

    @Nullable
    public m getPerformanceTracker() {
        return this.lottieDrawable.getPerformanceTracker();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.lottieDrawable.getProgress();
    }

    public int getRepeatCount() {
        return this.lottieDrawable.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.lottieDrawable.getRepeatMode();
    }

    public float getScale() {
        return this.lottieDrawable.getScale();
    }

    public float getSpeed() {
        return this.lottieDrawable.getSpeed();
    }

    public boolean hasMasks() {
        return this.lottieDrawable.hasMasks();
    }

    public boolean hasMatte() {
        return this.lottieDrawable.hasMatte();
    }

    public boolean isAnimating() {
        return this.lottieDrawable.isAnimating();
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.lottieDrawable.isMergePathsEnabledForKitKatAndAbove();
    }

    public void removeAllAnimatorListeners() {
        this.lottieDrawable.removeAllAnimatorListeners();
    }

    public void removeAllUpdateListeners() {
        this.lottieDrawable.removeAllUpdateListeners();
    }

    public void reverseAnimationSpeed() {
        this.lottieDrawable.reverseAnimationSpeed();
    }

    @Deprecated
    public void useExperimentalHardwareAcceleration() {
        useHardwareAcceleration(true);
    }

    public void useHardwareAcceleration() {
        useHardwareAcceleration(true);
    }

    private void clearComposition() {
        this.composition = null;
        this.lottieDrawable.clearComposition();
    }

    @MainThread
    public void cancelAnimation() {
        this.lottieDrawable.cancelAnimation();
        enableOrDisableHardwareLayer();
    }

    public long getDuration() {
        if (this.composition != null) {
            return (long) this.composition.getDuration();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.autoPlay && this.wasAnimatingWhenDetached) {
            playAnimation();
        }
    }

    @MainThread
    public void pauseAnimation() {
        this.lottieDrawable.pauseAnimation();
        enableOrDisableHardwareLayer();
    }

    @MainThread
    public void playAnimation() {
        this.lottieDrawable.playAnimation();
        enableOrDisableHardwareLayer();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public void recycleBitmaps() {
        if (this.lottieDrawable != null) {
            this.lottieDrawable.recycleBitmaps();
        }
    }

    @MainThread
    public void resumeAnimation() {
        this.lottieDrawable.resumeAnimation();
        enableOrDisableHardwareLayer();
    }

    private void cancelLoaderTask() {
        if (this.compositionTask != null) {
            this.compositionTask.b(this.loadedListener);
            this.compositionTask.d(this.failureListener);
        }
    }

    private void enableOrDisableHardwareLayer() {
        boolean z;
        int i = 1;
        if (!this.useHardwareLayer || !this.lottieDrawable.isAnimating()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i = 2;
        }
        setLayerType(i, null);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (isAnimating()) {
            cancelAnimation();
            this.wasAnimatingWhenDetached = true;
        }
        e.a(this);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f4530a = this.animationName;
        bVar.f4531b = this.animationResId;
        bVar.f4532c = this.lottieDrawable.getProgress();
        bVar.f4533d = this.lottieDrawable.isAnimating();
        bVar.f4534e = this.lottieDrawable.getImageAssetsFolder();
        bVar.f4535f = this.lottieDrawable.getRepeatMode();
        bVar.g = this.lottieDrawable.getRepeatCount();
        return bVar;
    }

    @Deprecated
    public void useExperimentalHardwareAcceleration(boolean z) {
        useHardwareAcceleration(z);
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.addAnimatorListener(animatorListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.addAnimatorUpdateListener(animatorUpdateListener);
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
        this.lottieDrawable.enableMergePathsForKitKatAndAbove(z);
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.removeAnimatorListener(animatorListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.removeAnimatorUpdateListener(animatorUpdateListener);
    }

    public List<e> resolveKeyPath(e eVar) {
        return this.lottieDrawable.resolveKeyPath(eVar);
    }

    @Deprecated
    public void setAnimation(JsonReader jsonReader) {
        setAnimation(jsonReader, (String) null);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setFontAssetDelegate(b bVar) {
        this.lottieDrawable.setFontAssetDelegate(bVar);
    }

    public void setFrame(int i) {
        this.lottieDrawable.setFrame(i);
    }

    public void setImageAssetDelegate(c cVar) {
        this.lottieDrawable.setImageAssetDelegate(cVar);
    }

    public void setImageAssetsFolder(String str) {
        this.lottieDrawable.setImagesAssetsFolder(str);
    }

    public void setImageDrawable(Drawable drawable) {
        setImageDrawable(drawable, true);
    }

    public void setMaxFrame(int i) {
        this.lottieDrawable.setMaxFrame(i);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.lottieDrawable.setMaxProgress(f2);
    }

    public void setMinFrame(int i) {
        this.lottieDrawable.setMinFrame(i);
    }

    public void setMinProgress(float f2) {
        this.lottieDrawable.setMinProgress(f2);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.lottieDrawable.setPerformanceTrackingEnabled(z);
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.lottieDrawable.setProgress(f2);
    }

    public void setRepeatCount(int i) {
        this.lottieDrawable.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.lottieDrawable.setRepeatMode(i);
    }

    public void setSpeed(float f2) {
        this.lottieDrawable.setSpeed(f2);
    }

    public void setTextDelegate(o oVar) {
        this.lottieDrawable.setTextDelegate(oVar);
    }

    @Deprecated
    public void loop(boolean z) {
        int i;
        LottieDrawable lottieDrawable2 = this.lottieDrawable;
        if (z) {
            i = -1;
        } else {
            i = 0;
        }
        lottieDrawable2.setRepeatCount(i);
    }

    public void setImageBitmap(Bitmap bitmap) {
        e.a(this);
        cancelLoaderTask();
        super.setImageBitmap(bitmap);
    }

    public void setImageResource(int i) {
        e.a(this);
        cancelLoaderTask();
        super.setImageResource(i);
    }

    public void useHardwareAcceleration(boolean z) {
        if (this.useHardwareLayer != z) {
            this.useHardwareLayer = z;
            enableOrDisableHardwareLayer();
        }
    }

    public void invalidateDrawable(@NonNull Drawable drawable) {
        if (getDrawable() == this.lottieDrawable) {
            super.invalidateDrawable(this.lottieDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void setScale(float f2) {
        this.lottieDrawable.setScale(f2);
        if (getDrawable() == this.lottieDrawable) {
            setImageDrawable(null, false);
            setImageDrawable(this.lottieDrawable, false);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        init(null);
    }

    public void setAnimation(@RawRes final int i) {
        this.animationResId = i;
        this.animationName = null;
        LottieComposition a2 = g.a().a(Integer.toString(i));
        if (a2 != null) {
            setComposition(a2);
            return;
        }
        clearComposition();
        cancelLoaderTask();
        this.compositionTask = f.a(getContext(), i).a((h<T>) new h<LottieComposition>() {
            public final /* synthetic */ void a(Object obj) {
                g.a().a(Integer.toString(i), (LottieComposition) obj);
            }
        }).a(this.loadedListener).c(this.failureListener);
    }

    public void setAnimationFromUrl(String str) {
        clearComposition();
        cancelLoaderTask();
        this.compositionTask = new k(new Callable<j<LottieComposition>>() {
            public final /* synthetic */ Object call() throws Exception {
                return c.this.a();
            }
        }).a(this.loadedListener).c(this.failureListener);
    }

    public void setComposition(@NonNull LottieComposition lottieComposition) {
        this.lottieDrawable.setCallback(this);
        this.composition = lottieComposition;
        boolean composition2 = this.lottieDrawable.setComposition(lottieComposition);
        enableOrDisableHardwareLayer();
        if (getDrawable() != this.lottieDrawable || composition2) {
            setImageDrawable(null);
            setImageDrawable(this.lottieDrawable);
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        this.animationName = bVar.f4530a;
        if (!TextUtils.isEmpty(this.animationName)) {
            setAnimation(this.animationName);
        }
        this.animationResId = bVar.f4531b;
        if (this.animationResId != 0) {
            setAnimation(this.animationResId);
        }
        setProgress(bVar.f4532c);
        if (bVar.f4533d) {
            playAnimation();
        }
        this.lottieDrawable.setImagesAssetsFolder(bVar.f4534e);
        setRepeatMode(bVar.f4535f);
        setRepeatCount(bVar.g);
    }

    public void setAnimation(final String str) {
        this.animationName = str;
        this.animationResId = 0;
        LottieComposition a2 = g.a().a(str);
        if (a2 != null) {
            setComposition(a2);
            return;
        }
        clearComposition();
        cancelLoaderTask();
        this.compositionTask = f.b(getContext(), str).a((h<T>) new h<LottieComposition>() {
            public final /* bridge */ /* synthetic */ void a(Object obj) {
                g.a().a(str, (LottieComposition) obj);
            }
        }).a(this.loadedListener).c(this.failureListener);
    }

    private void init(@Nullable AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.LottieAnimationView);
        this.defaultCacheStrategy = a.values()[obtainStyledAttributes.getInt(4, DEFAULT_CACHE_STRATEGY.ordinal())];
        if (!isInEditMode()) {
            boolean hasValue = obtainStyledAttributes.hasValue(8);
            boolean hasValue2 = obtainStyledAttributes.hasValue(0);
            boolean hasValue3 = obtainStyledAttributes.hasValue(12);
            if (hasValue && hasValue2) {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use use only one at once.");
            } else if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(8, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    setAnimation(string);
                }
            } else if (hasValue3) {
                String string2 = obtainStyledAttributes.getString(12);
                if (string2 != null) {
                    setAnimationFromUrl(string2);
                }
            }
        }
        if (obtainStyledAttributes.getBoolean(1, false)) {
            this.wasAnimatingWhenDetached = true;
            this.autoPlay = true;
        }
        if (obtainStyledAttributes.getBoolean(2, false)) {
            this.lottieDrawable.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(10)) {
            setRepeatMode(obtainStyledAttributes.getInt(10, 1));
        }
        if (obtainStyledAttributes.hasValue(9)) {
            setRepeatCount(obtainStyledAttributes.getInt(9, -1));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(3));
        setProgress(obtainStyledAttributes.getFloat(7, 0.0f));
        enableMergePathsForKitKatAndAbove(obtainStyledAttributes.getBoolean(6, false));
        if (obtainStyledAttributes.hasValue(5)) {
            n nVar = new n(obtainStyledAttributes.getColor(5, 0));
            addValueCallback(new e("**"), (T) i.x, new c<>(nVar));
        }
        if (obtainStyledAttributes.hasValue(11)) {
            this.lottieDrawable.setScale(obtainStyledAttributes.getFloat(11, 1.0f));
        }
        obtainStyledAttributes.recycle();
        enableOrDisableHardwareLayer();
    }

    @Deprecated
    public void setAnimation(JSONObject jSONObject) {
        setAnimation(new JsonReader(new StringReader(jSONObject.toString())));
    }

    @Deprecated
    public void setAnimation(@RawRes int i, a aVar) {
        setAnimation(i);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.lottieDrawable.setMinAndMaxFrame(i, i2);
    }

    public void setMinAndMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f2, @FloatRange(from = 0.0d, to = 1.0d) float f3) {
        this.lottieDrawable.setMinAndMaxProgress(f2, f3);
    }

    @Nullable
    public Bitmap updateBitmap(String str, @Nullable Bitmap bitmap) {
        return this.lottieDrawable.updateBitmap(str, bitmap);
    }

    private void setImageDrawable(Drawable drawable, boolean z) {
        if (z && drawable != this.lottieDrawable) {
            e.a(this);
        }
        cancelLoaderTask();
        super.setImageDrawable(drawable);
    }

    @Deprecated
    public void setAnimation(String str, a aVar) {
        setAnimation(str);
    }

    public void setAnimationFromJson(String str, @Nullable String str2) {
        setAnimation(new JsonReader(new StringReader(str)), str2);
    }

    public void setAnimation(JsonReader jsonReader, @Nullable String str) {
        clearComposition();
        cancelLoaderTask();
        this.compositionTask = f.a(jsonReader, str).a(this.loadedListener).c(this.failureListener);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public <T> void addValueCallback(e eVar, T t, c<T> cVar) {
        this.lottieDrawable.addValueCallback(eVar, t, cVar);
    }

    public <T> void addValueCallback(e eVar, T t, final com.airbnb.lottie.g.e<T> eVar2) {
        this.lottieDrawable.addValueCallback(eVar, t, (c<T>) new c<T>() {
            public final T a(com.airbnb.lottie.g.b<T> bVar) {
                return eVar2.a();
            }
        });
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }
}
