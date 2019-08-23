package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.FloatRange;
import android.support.annotation.IntRange;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.airbnb.lottie.c.a.l;
import com.airbnb.lottie.c.c.b;
import com.airbnb.lottie.c.c.d;
import com.airbnb.lottie.c.e;
import com.airbnb.lottie.c.h;
import com.airbnb.lottie.f.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LottieDrawable extends Drawable implements Animatable, Drawable.Callback {
    private static final String TAG = "LottieDrawable";
    private int alpha = 255;
    public final c animator = new c();
    private final Set<Object> colorFilterData = new HashSet();
    private LottieComposition composition;
    @Nullable
    public b compositionLayer;
    private boolean enableMergePaths;
    @Nullable
    b fontAssetDelegate;
    @Nullable
    private com.airbnb.lottie.b.a fontAssetManager;
    @Nullable
    private c imageAssetDelegate;
    @Nullable
    private com.airbnb.lottie.b.b imageAssetManager;
    @Nullable
    private String imageAssetsFolder;
    private final ArrayList<a> lazyCompositionTasks = new ArrayList<>();
    private final Matrix matrix = new Matrix();
    private boolean performanceTrackingEnabled;
    private float scale = 1.0f;
    @Nullable
    o textDelegate;

    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    interface a {
        void a();
    }

    public int getOpacity() {
        return -3;
    }

    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public boolean enableMergePathsForKitKatAndAbove() {
        return this.enableMergePaths;
    }

    public int getAlpha() {
        return this.alpha;
    }

    public LottieComposition getComposition() {
        return this.composition;
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.imageAssetsFolder;
    }

    public float getScale() {
        return this.scale;
    }

    @Nullable
    public o getTextDelegate() {
        return this.textDelegate;
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.enableMergePaths;
    }

    @MainThread
    public void start() {
        playAnimation();
    }

    @MainThread
    public void stop() {
        endAnimation();
    }

    public int getFrame() {
        return (int) this.animator.f4842d;
    }

    public float getMaxFrame() {
        return this.animator.i();
    }

    public float getMinFrame() {
        return this.animator.h();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.animator.b();
    }

    public int getRepeatCount() {
        return this.animator.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.animator.getRepeatMode();
    }

    public float getSpeed() {
        return this.animator.f4840b;
    }

    public boolean isAnimating() {
        return this.animator.isRunning();
    }

    public boolean isRunning() {
        return isAnimating();
    }

    public void removeAllAnimatorListeners() {
        this.animator.removeAllListeners();
    }

    public void removeAllUpdateListeners() {
        this.animator.removeAllUpdateListeners();
    }

    public void reverseAnimationSpeed() {
        this.animator.c();
    }

    public void cancelAnimation() {
        this.lazyCompositionTasks.clear();
        this.animator.cancel();
    }

    @MainThread
    public void endAnimation() {
        this.lazyCompositionTasks.clear();
        this.animator.e();
    }

    @Nullable
    public m getPerformanceTracker() {
        if (this.composition != null) {
            return this.composition.getPerformanceTracker();
        }
        return null;
    }

    public boolean hasMasks() {
        if (this.compositionLayer == null || !this.compositionLayer.e()) {
            return false;
        }
        return true;
    }

    public void invalidateSelf() {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isLooping() {
        if (this.animator.getRepeatCount() == -1) {
            return true;
        }
        return false;
    }

    public void pauseAnimation() {
        this.lazyCompositionTasks.clear();
        this.animator.f();
    }

    public void recycleBitmaps() {
        if (this.imageAssetManager != null) {
            this.imageAssetManager.a();
        }
    }

    @Nullable
    private Context getContext() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private com.airbnb.lottie.b.a getFontAssetManager() {
        if (getCallback() == null) {
            return null;
        }
        if (this.fontAssetManager == null) {
            this.fontAssetManager = new com.airbnb.lottie.b.a(getCallback(), this.fontAssetDelegate);
        }
        return this.fontAssetManager;
    }

    public int getIntrinsicHeight() {
        if (this.composition == null) {
            return -1;
        }
        return (int) (((float) this.composition.getBounds().height()) * getScale());
    }

    public int getIntrinsicWidth() {
        if (this.composition == null) {
            return -1;
        }
        return (int) (((float) this.composition.getBounds().width()) * getScale());
    }

    @MainThread
    public void playAnimation() {
        if (this.compositionLayer == null) {
            this.lazyCompositionTasks.add(new a() {
                public final void a() {
                    LottieDrawable.this.playAnimation();
                }
            });
        } else {
            this.animator.d();
        }
    }

    @MainThread
    public void resumeAnimation() {
        if (this.compositionLayer == null) {
            this.lazyCompositionTasks.add(new a() {
                public final void a() {
                    LottieDrawable.this.resumeAnimation();
                }
            });
        } else {
            this.animator.g();
        }
    }

    public boolean useTextGlyphs() {
        if (this.textDelegate != null || this.composition.getCharacters().size() <= 0) {
            return false;
        }
        return true;
    }

    public LottieDrawable() {
        this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (LottieDrawable.this.compositionLayer != null) {
                    LottieDrawable.this.compositionLayer.a(LottieDrawable.this.animator.b());
                }
            }
        });
    }

    private void updateBounds() {
        if (this.composition != null) {
            float scale2 = getScale();
            setBounds(0, 0, (int) (((float) this.composition.getBounds().width()) * scale2), (int) (((float) this.composition.getBounds().height()) * scale2));
        }
    }

    public void clearComposition() {
        recycleBitmaps();
        if (this.animator.isRunning()) {
            this.animator.cancel();
        }
        this.composition = null;
        this.compositionLayer = null;
        this.imageAssetManager = null;
        c cVar = this.animator;
        cVar.g = null;
        cVar.f4843e = -2.14748365E9f;
        cVar.f4844f = 2.14748365E9f;
        invalidateSelf();
    }

    private void buildCompositionLayer() {
        LottieComposition lottieComposition = this.composition;
        Rect bounds = lottieComposition.getBounds();
        List emptyList = Collections.emptyList();
        d.a aVar = d.a.PreComp;
        List emptyList2 = Collections.emptyList();
        l lVar = r7;
        l lVar2 = new l();
        d dVar = r2;
        d dVar2 = new d(emptyList, lottieComposition, "__container", -1, aVar, -1, null, emptyList2, lVar, 0, 0, 0, 0.0f, 0.0f, bounds.width(), bounds.height(), null, null, Collections.emptyList(), d.b.None, null);
        this.compositionLayer = new b(this, dVar, this.composition.getLayers(), this.composition);
    }

    private com.airbnb.lottie.b.b getImageAssetManager() {
        boolean z;
        if (getCallback() == null) {
            return null;
        }
        if (this.imageAssetManager != null) {
            com.airbnb.lottie.b.b bVar = this.imageAssetManager;
            Context context = getContext();
            if (!(context == null && bVar.f4676a == null) && !bVar.f4676a.equals(context)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                this.imageAssetManager.a();
                this.imageAssetManager = null;
            }
        }
        if (this.imageAssetManager == null) {
            this.imageAssetManager = new com.airbnb.lottie.b.b(getCallback(), this.imageAssetsFolder, this.imageAssetDelegate, this.composition.getImages());
        }
        return this.imageAssetManager;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasMatte() {
        /*
            r4 = this;
            com.airbnb.lottie.c.c.b r0 = r4.compositionLayer
            if (r0 == 0) goto L_0x0043
            com.airbnb.lottie.c.c.b r0 = r4.compositionLayer
            java.lang.Boolean r1 = r0.h
            r2 = 1
            if (r1 != 0) goto L_0x003a
            boolean r1 = r0.c()
            if (r1 == 0) goto L_0x0017
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.h = r1
        L_0x0015:
            r0 = 1
            goto L_0x0040
        L_0x0017:
            java.util.List<com.airbnb.lottie.c.c.a> r1 = r0.g
            int r1 = r1.size()
            int r1 = r1 - r2
        L_0x001e:
            if (r1 < 0) goto L_0x0036
            java.util.List<com.airbnb.lottie.c.c.a> r3 = r0.g
            java.lang.Object r3 = r3.get(r1)
            com.airbnb.lottie.c.c.a r3 = (com.airbnb.lottie.c.c.a) r3
            boolean r3 = r3.c()
            if (r3 == 0) goto L_0x0033
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.h = r1
            goto L_0x0015
        L_0x0033:
            int r1 = r1 + -1
            goto L_0x001e
        L_0x0036:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.h = r1
        L_0x003a:
            java.lang.Boolean r0 = r0.h
            boolean r0 = r0.booleanValue()
        L_0x0040:
            if (r0 == 0) goto L_0x0043
            return r2
        L_0x0043:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieDrawable.hasMatte():boolean");
    }

    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
        this.alpha = i;
    }

    public void setImagesAssetsFolder(@Nullable String str) {
        this.imageAssetsFolder = str;
    }

    public void setTextDelegate(o oVar) {
        this.textDelegate = oVar;
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.animator.addListener(animatorListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.animator.addUpdateListener(animatorUpdateListener);
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.animator.removeListener(animatorListener);
    }

    public void removeAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.animator.removeUpdateListener(animatorUpdateListener);
    }

    public void setRepeatCount(int i) {
        this.animator.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.animator.setRepeatMode(i);
    }

    public void setScale(float f2) {
        this.scale = f2;
        updateBounds();
    }

    public void setSpeed(float f2) {
        this.animator.f4840b = f2;
    }

    @Nullable
    public Bitmap getImageAsset(String str) {
        com.airbnb.lottie.b.b imageAssetManager2 = getImageAssetManager();
        if (imageAssetManager2 != null) {
            return imageAssetManager2.a(str);
        }
        return null;
    }

    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Deprecated
    public void loop(boolean z) {
        int i;
        c cVar = this.animator;
        if (z) {
            i = -1;
        } else {
            i = 0;
        }
        cVar.setRepeatCount(i);
    }

    public void setFontAssetDelegate(b bVar) {
        this.fontAssetDelegate = bVar;
        if (this.fontAssetManager != null) {
            this.fontAssetManager.f4673e = bVar;
        }
    }

    public void setImageAssetDelegate(c cVar) {
        this.imageAssetDelegate = cVar;
        if (this.imageAssetManager != null) {
            this.imageAssetManager.f4677b = cVar;
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.performanceTrackingEnabled = z;
        if (this.composition != null) {
            this.composition.setPerformanceTrackingEnabled(z);
        }
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
        if (this.enableMergePaths != z && Build.VERSION.SDK_INT >= 19) {
            this.enableMergePaths = z;
            if (this.composition != null) {
                buildCompositionLayer();
            }
        }
    }

    public List<e> resolveKeyPath(e eVar) {
        if (this.compositionLayer == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.compositionLayer.a(eVar, 0, (List<e>) arrayList, new e(new String[0]));
        return arrayList;
    }

    public void setFrame(final int i) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new a() {
                public final void a() {
                    LottieDrawable.this.setFrame(i);
                }
            });
        } else {
            this.animator.a(i);
        }
    }

    public void setMaxFrame(final int i) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new a() {
                public final void a() {
                    LottieDrawable.this.setMaxFrame(i);
                }
            });
            return;
        }
        c cVar = this.animator;
        cVar.a((int) cVar.f4843e, i);
    }

    public void setMinFrame(final int i) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new a() {
                public final void a() {
                    LottieDrawable.this.setMinFrame(i);
                }
            });
            return;
        }
        c cVar = this.animator;
        cVar.a(i, (int) cVar.f4844f);
    }

    private float getMaxScale(@NonNull Canvas canvas) {
        return Math.min(((float) canvas.getWidth()) / ((float) this.composition.getBounds().width()), ((float) canvas.getHeight()) / ((float) this.composition.getBounds().height()));
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) final float f2) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new a() {
                public final void a() {
                    LottieDrawable.this.setMaxProgress(f2);
                }
            });
        } else {
            setMaxFrame((int) com.airbnb.lottie.f.e.a(this.composition.getStartFrame(), this.composition.getEndFrame(), f2));
        }
    }

    public void setMinProgress(final float f2) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new a() {
                public final void a() {
                    LottieDrawable.this.setMinProgress(f2);
                }
            });
        } else {
            setMinFrame((int) com.airbnb.lottie.f.e.a(this.composition.getStartFrame(), this.composition.getEndFrame(), f2));
        }
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) final float f2) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new a() {
                public final void a() {
                    LottieDrawable.this.setProgress(f2);
                }
            });
        } else {
            setFrame((int) com.airbnb.lottie.f.e.a(this.composition.getStartFrame(), this.composition.getEndFrame(), f2));
        }
    }

    public void draw(@NonNull Canvas canvas) {
        float f2;
        d.b("Drawable#draw");
        if (this.compositionLayer != null) {
            float f3 = this.scale;
            float maxScale = getMaxScale(canvas);
            if (f3 > maxScale) {
                f2 = this.scale / maxScale;
            } else {
                maxScale = f3;
                f2 = 1.0f;
            }
            if (f2 > 1.0f) {
                canvas.save();
                float width = ((float) this.composition.getBounds().width()) / 2.0f;
                float height = ((float) this.composition.getBounds().height()) / 2.0f;
                float f4 = width * maxScale;
                float f5 = height * maxScale;
                canvas.translate((getScale() * width) - f4, (getScale() * height) - f5);
                canvas.scale(f2, f2, f4, f5);
            }
            this.matrix.reset();
            this.matrix.preScale(maxScale, maxScale);
            this.compositionLayer.a(canvas, this.matrix, this.alpha);
            d.c("Drawable#draw");
            if (f2 > 1.0f) {
                canvas.restore();
            }
        }
    }

    public boolean setComposition(LottieComposition lottieComposition) {
        boolean z = false;
        if (this.composition == lottieComposition) {
            return false;
        }
        clearComposition();
        this.composition = lottieComposition;
        buildCompositionLayer();
        c cVar = this.animator;
        if (cVar.g == null) {
            z = true;
        }
        cVar.g = lottieComposition;
        if (z) {
            cVar.a((int) Math.max(cVar.f4843e, lottieComposition.getStartFrame()), (int) Math.min(cVar.f4844f, lottieComposition.getEndFrame()));
        } else {
            cVar.a((int) lottieComposition.getStartFrame(), (int) lottieComposition.getEndFrame());
        }
        cVar.a((int) cVar.f4842d);
        cVar.f4841c = System.nanoTime();
        setProgress(this.animator.getAnimatedFraction());
        setScale(this.scale);
        updateBounds();
        Iterator it2 = new ArrayList(this.lazyCompositionTasks).iterator();
        while (it2.hasNext()) {
            ((a) it2.next()).a();
            it2.remove();
        }
        this.lazyCompositionTasks.clear();
        lottieComposition.setPerformanceTrackingEnabled(this.performanceTrackingEnabled);
        return true;
    }

    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void setMinAndMaxFrame(final int i, final int i2) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new a() {
                public final void a() {
                    LottieDrawable.this.setMinAndMaxFrame(i, i2);
                }
            });
        } else {
            this.animator.a(i, i2);
        }
    }

    @Nullable
    public Bitmap updateBitmap(String str, @Nullable Bitmap bitmap) {
        Bitmap bitmap2;
        com.airbnb.lottie.b.b imageAssetManager2 = getImageAssetManager();
        if (imageAssetManager2 == null) {
            return null;
        }
        if (bitmap == null) {
            g gVar = imageAssetManager2.f4678c.get(str);
            bitmap2 = gVar.f4858f;
            gVar.f4858f = null;
        } else {
            bitmap2 = imageAssetManager2.a(str, bitmap);
        }
        invalidateSelf();
        return bitmap2;
    }

    public void setMinAndMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) final float f2, @FloatRange(from = 0.0d, to = 1.0d) final float f3) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new a() {
                public final void a() {
                    LottieDrawable.this.setMinAndMaxProgress(f2, f3);
                }
            });
        } else {
            setMinAndMaxFrame((int) com.airbnb.lottie.f.e.a(this.composition.getStartFrame(), this.composition.getEndFrame(), f2), (int) com.airbnb.lottie.f.e.a(this.composition.getStartFrame(), this.composition.getEndFrame(), f3));
        }
    }

    @Nullable
    public Typeface getTypeface(String str, String str2) {
        com.airbnb.lottie.b.a fontAssetManager2 = getFontAssetManager();
        if (fontAssetManager2 == null) {
            return null;
        }
        h<String> hVar = fontAssetManager2.f4669a;
        hVar.f4799a = str;
        hVar.f4800b = str2;
        Typeface typeface = fontAssetManager2.f4670b.get(fontAssetManager2.f4669a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typeface2 = fontAssetManager2.f4671c.get(str);
        if (typeface2 == null) {
            typeface2 = Typeface.createFromAsset(fontAssetManager2.f4672d, "fonts/" + str + fontAssetManager2.f4674f);
            fontAssetManager2.f4671c.put(str, typeface2);
        }
        int i = 0;
        boolean contains = str2.contains("Italic");
        boolean contains2 = str2.contains("Bold");
        if (contains && contains2) {
            i = 3;
        } else if (contains) {
            i = 2;
        } else if (contains2) {
            i = 1;
        }
        if (typeface2.getStyle() != i) {
            typeface2 = Typeface.create(typeface2, i);
        }
        fontAssetManager2.f4670b.put(fontAssetManager2.f4669a, typeface2);
        return typeface2;
    }

    public <T> void addValueCallback(e eVar, T t, final com.airbnb.lottie.g.e<T> eVar2) {
        addValueCallback(eVar, t, (com.airbnb.lottie.g.c<T>) new com.airbnb.lottie.g.c<T>() {
            public final T a(com.airbnb.lottie.g.b<T> bVar) {
                return eVar2.a();
            }
        });
    }

    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public <T> void addValueCallback(final e eVar, final T t, final com.airbnb.lottie.g.c<T> cVar) {
        if (this.compositionLayer == null) {
            this.lazyCompositionTasks.add(new a() {
                public final void a() {
                    LottieDrawable.this.addValueCallback(eVar, t, cVar);
                }
            });
            return;
        }
        boolean z = true;
        if (eVar.f4795a != null) {
            eVar.f4795a.a(t, cVar);
        } else {
            List<e> resolveKeyPath = resolveKeyPath(eVar);
            for (int i = 0; i < resolveKeyPath.size(); i++) {
                resolveKeyPath.get(i).f4795a.a(t, cVar);
            }
            if (resolveKeyPath.isEmpty()) {
                z = false;
            }
        }
        if (z) {
            invalidateSelf();
            if (t == i.w) {
                setProgress(getProgress());
            }
        }
    }
}
