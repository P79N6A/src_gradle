package android.support.v7.graphics;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.Px;
import android.support.v4.graphics.ColorUtils;
import android.support.v4.util.ArrayMap;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class Palette {
    static final Filter DEFAULT_FILTER = new Filter() {
        private boolean isBlack(float[] fArr) {
            if (fArr[2] <= 0.05f) {
                return true;
            }
            return false;
        }

        private boolean isWhite(float[] fArr) {
            if (fArr[2] >= 0.95f) {
                return true;
            }
            return false;
        }

        private boolean isNearRedILine(float[] fArr) {
            if (fArr[0] < 10.0f || fArr[0] > 37.0f || fArr[1] > 0.82f) {
                return false;
            }
            return true;
        }

        public final boolean isAllowed(int i, float[] fArr) {
            if (isWhite(fArr) || isBlack(fArr) || isNearRedILine(fArr)) {
                return false;
            }
            return true;
        }
    };
    @Nullable
    private final Swatch mDominantSwatch = findDominantSwatch();
    private final Map<Target, Swatch> mSelectedSwatches = new ArrayMap();
    private final List<Swatch> mSwatches;
    private final List<Target> mTargets;
    private final SparseBooleanArray mUsedColors = new SparseBooleanArray();

    public static final class Builder {
        @Nullable
        private final Bitmap mBitmap;
        private final List<Filter> mFilters = new ArrayList();
        private int mMaxColors = 16;
        @Nullable
        private Rect mRegion;
        private int mResizeArea = 12544;
        private int mResizeMaxDimension = -1;
        @Nullable
        private final List<Swatch> mSwatches;
        private final List<Target> mTargets = new ArrayList();

        @NonNull
        public final Builder clearRegion() {
            this.mRegion = null;
            return this;
        }

        @NonNull
        public final Builder clearFilters() {
            this.mFilters.clear();
            return this;
        }

        @NonNull
        public final Builder clearTargets() {
            if (this.mTargets != null) {
                this.mTargets.clear();
            }
            return this;
        }

        @NonNull
        public final Palette generate() {
            List<Swatch> list;
            Filter[] filterArr;
            if (this.mBitmap != null) {
                Bitmap scaleBitmapDown = scaleBitmapDown(this.mBitmap);
                Rect rect = this.mRegion;
                if (!(scaleBitmapDown == this.mBitmap || rect == null)) {
                    double width = (double) scaleBitmapDown.getWidth();
                    double width2 = (double) this.mBitmap.getWidth();
                    Double.isNaN(width);
                    Double.isNaN(width2);
                    double d2 = width / width2;
                    double d3 = (double) rect.left;
                    Double.isNaN(d3);
                    rect.left = (int) Math.floor(d3 * d2);
                    double d4 = (double) rect.top;
                    Double.isNaN(d4);
                    rect.top = (int) Math.floor(d4 * d2);
                    double d5 = (double) rect.right;
                    Double.isNaN(d5);
                    rect.right = Math.min((int) Math.ceil(d5 * d2), scaleBitmapDown.getWidth());
                    double d6 = (double) rect.bottom;
                    Double.isNaN(d6);
                    rect.bottom = Math.min((int) Math.ceil(d6 * d2), scaleBitmapDown.getHeight());
                }
                int[] pixelsFromBitmap = getPixelsFromBitmap(scaleBitmapDown);
                int i = this.mMaxColors;
                if (this.mFilters.isEmpty()) {
                    filterArr = null;
                } else {
                    filterArr = (Filter[]) this.mFilters.toArray(new Filter[this.mFilters.size()]);
                }
                ColorCutQuantizer colorCutQuantizer = new ColorCutQuantizer(pixelsFromBitmap, i, filterArr);
                if (scaleBitmapDown != this.mBitmap) {
                    scaleBitmapDown.recycle();
                }
                list = colorCutQuantizer.getQuantizedColors();
            } else if (this.mSwatches != null) {
                list = this.mSwatches;
            } else {
                throw new AssertionError();
            }
            Palette palette = new Palette(list, this.mTargets);
            palette.generate();
            return palette;
        }

        @NonNull
        public final Builder maximumColorCount(int i) {
            this.mMaxColors = i;
            return this;
        }

        @NonNull
        public final Builder addFilter(Filter filter) {
            if (filter != null) {
                this.mFilters.add(filter);
            }
            return this;
        }

        @NonNull
        public final Builder resizeBitmapArea(int i) {
            this.mResizeArea = i;
            this.mResizeMaxDimension = -1;
            return this;
        }

        @Deprecated
        @NonNull
        public final Builder resizeBitmapSize(int i) {
            this.mResizeMaxDimension = i;
            this.mResizeArea = -1;
            return this;
        }

        @NonNull
        public final Builder addTarget(@NonNull Target target) {
            if (!this.mTargets.contains(target)) {
                this.mTargets.add(target);
            }
            return this;
        }

        @NonNull
        public final AsyncTask<Bitmap, Void, Palette> generate(@NonNull final PaletteAsyncListener paletteAsyncListener) {
            if (paletteAsyncListener != null) {
                return new AsyncTask<Bitmap, Void, Palette>() {
                    /* access modifiers changed from: protected */
                    public void onPostExecute(@Nullable Palette palette) {
                        paletteAsyncListener.onGenerated(palette);
                    }

                    /* access modifiers changed from: protected */
                    @Nullable
                    public Palette doInBackground(Bitmap... bitmapArr) {
                        try {
                            return Builder.this.generate();
                        } catch (Exception unused) {
                            return null;
                        }
                    }
                }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Bitmap[]{this.mBitmap});
            }
            throw new IllegalArgumentException("listener can not be null");
        }

        public Builder(@NonNull List<Swatch> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("List of Swatches is not valid");
            }
            this.mFilters.add(Palette.DEFAULT_FILTER);
            this.mSwatches = list;
            this.mBitmap = null;
        }

        public Builder(@NonNull Bitmap bitmap) {
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            this.mFilters.add(Palette.DEFAULT_FILTER);
            this.mBitmap = bitmap;
            this.mSwatches = null;
            this.mTargets.add(Target.LIGHT_VIBRANT);
            this.mTargets.add(Target.VIBRANT);
            this.mTargets.add(Target.DARK_VIBRANT);
            this.mTargets.add(Target.LIGHT_MUTED);
            this.mTargets.add(Target.MUTED);
            this.mTargets.add(Target.DARK_MUTED);
        }

        private int[] getPixelsFromBitmap(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[(width * height)];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            if (this.mRegion == null) {
                return iArr;
            }
            int width2 = this.mRegion.width();
            int height2 = this.mRegion.height();
            int[] iArr2 = new int[(width2 * height2)];
            for (int i = 0; i < height2; i++) {
                System.arraycopy(iArr, ((this.mRegion.top + i) * width) + this.mRegion.left, iArr2, i * width2, width2);
            }
            return iArr2;
        }

        private Bitmap scaleBitmapDown(Bitmap bitmap) {
            double d2 = -1.0d;
            if (this.mResizeArea > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                if (width > this.mResizeArea) {
                    double d3 = (double) this.mResizeArea;
                    double d4 = (double) width;
                    Double.isNaN(d3);
                    Double.isNaN(d4);
                    d2 = Math.sqrt(d3 / d4);
                }
            } else if (this.mResizeMaxDimension > 0) {
                int max = Math.max(bitmap.getWidth(), bitmap.getHeight());
                if (max > this.mResizeMaxDimension) {
                    double d5 = (double) this.mResizeMaxDimension;
                    double d6 = (double) max;
                    Double.isNaN(d5);
                    Double.isNaN(d6);
                    d2 = d5 / d6;
                }
            }
            if (d2 <= 0.0d) {
                return bitmap;
            }
            double width2 = (double) bitmap.getWidth();
            Double.isNaN(width2);
            int ceil = (int) Math.ceil(width2 * d2);
            double height = (double) bitmap.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(bitmap, ceil, (int) Math.ceil(height * d2), false);
        }

        @NonNull
        public final Builder setRegion(@Px int i, @Px int i2, @Px int i3, @Px int i4) {
            if (this.mBitmap != null) {
                if (this.mRegion == null) {
                    this.mRegion = new Rect();
                }
                this.mRegion.set(0, 0, this.mBitmap.getWidth(), this.mBitmap.getHeight());
                if (!this.mRegion.intersect(i, i2, i3, i4)) {
                    throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
                }
            }
            return this;
        }
    }

    public interface Filter {
        boolean isAllowed(@ColorInt int i, @NonNull float[] fArr);
    }

    public interface PaletteAsyncListener {
        void onGenerated(@Nullable Palette palette);
    }

    public static final class Swatch {
        private final int mBlue;
        private int mBodyTextColor;
        private boolean mGeneratedTextColors;
        private final int mGreen;
        @Nullable
        private float[] mHsl;
        private final int mPopulation;
        private final int mRed;
        private final int mRgb;
        private int mTitleTextColor;

        public final int getPopulation() {
            return this.mPopulation;
        }

        @ColorInt
        public final int getRgb() {
            return this.mRgb;
        }

        @ColorInt
        public final int getBodyTextColor() {
            ensureTextColorsGenerated();
            return this.mBodyTextColor;
        }

        @ColorInt
        public final int getTitleTextColor() {
            ensureTextColorsGenerated();
            return this.mTitleTextColor;
        }

        public final int hashCode() {
            return (this.mRgb * 31) + this.mPopulation;
        }

        @NonNull
        public final float[] getHsl() {
            if (this.mHsl == null) {
                this.mHsl = new float[3];
            }
            ColorUtils.RGBToHSL(this.mRed, this.mGreen, this.mBlue, this.mHsl);
            return this.mHsl;
        }

        private void ensureTextColorsGenerated() {
            int i;
            int i2;
            if (!this.mGeneratedTextColors) {
                int calculateMinimumAlpha = ColorUtils.calculateMinimumAlpha(-1, this.mRgb, 4.5f);
                int calculateMinimumAlpha2 = ColorUtils.calculateMinimumAlpha(-1, this.mRgb, 3.0f);
                if (calculateMinimumAlpha == -1 || calculateMinimumAlpha2 == -1) {
                    int calculateMinimumAlpha3 = ColorUtils.calculateMinimumAlpha(-16777216, this.mRgb, 4.5f);
                    int calculateMinimumAlpha4 = ColorUtils.calculateMinimumAlpha(-16777216, this.mRgb, 3.0f);
                    if (calculateMinimumAlpha3 == -1 || calculateMinimumAlpha4 == -1) {
                        if (calculateMinimumAlpha != -1) {
                            i = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha);
                        } else {
                            i = ColorUtils.setAlphaComponent(-16777216, calculateMinimumAlpha3);
                        }
                        this.mBodyTextColor = i;
                        if (calculateMinimumAlpha2 != -1) {
                            i2 = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha2);
                        } else {
                            i2 = ColorUtils.setAlphaComponent(-16777216, calculateMinimumAlpha4);
                        }
                        this.mTitleTextColor = i2;
                        this.mGeneratedTextColors = true;
                    } else {
                        this.mBodyTextColor = ColorUtils.setAlphaComponent(-16777216, calculateMinimumAlpha3);
                        this.mTitleTextColor = ColorUtils.setAlphaComponent(-16777216, calculateMinimumAlpha4);
                        this.mGeneratedTextColors = true;
                    }
                } else {
                    this.mBodyTextColor = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha);
                    this.mTitleTextColor = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha2);
                    this.mGeneratedTextColors = true;
                }
            }
        }

        public final String toString() {
            return getClass().getSimpleName() + " [RGB: #" + Integer.toHexString(getRgb()) + ']' + " [HSL: " + Arrays.toString(getHsl()) + ']' + " [Population: " + this.mPopulation + ']' + " [Title Text: #" + Integer.toHexString(getTitleTextColor()) + ']' + " [Body Text: #" + Integer.toHexString(getBodyTextColor()) + ']';
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Swatch swatch = (Swatch) obj;
            if (this.mPopulation == swatch.mPopulation && this.mRgb == swatch.mRgb) {
                return true;
            }
            return false;
        }

        Swatch(float[] fArr, int i) {
            this(ColorUtils.HSLToColor(fArr), i);
            this.mHsl = fArr;
        }

        public Swatch(@ColorInt int i, int i2) {
            this.mRed = Color.red(i);
            this.mGreen = Color.green(i);
            this.mBlue = Color.blue(i);
            this.mRgb = i;
            this.mPopulation = i2;
        }

        Swatch(int i, int i2, int i3, int i4) {
            this.mRed = i;
            this.mGreen = i2;
            this.mBlue = i3;
            this.mRgb = Color.rgb(i, i2, i3);
            this.mPopulation = i4;
        }
    }

    @Nullable
    public final Swatch getDominantSwatch() {
        return this.mDominantSwatch;
    }

    @Nullable
    public final Swatch getDarkMutedSwatch() {
        return getSwatchForTarget(Target.DARK_MUTED);
    }

    @Nullable
    public final Swatch getDarkVibrantSwatch() {
        return getSwatchForTarget(Target.DARK_VIBRANT);
    }

    @Nullable
    public final Swatch getLightMutedSwatch() {
        return getSwatchForTarget(Target.LIGHT_MUTED);
    }

    @Nullable
    public final Swatch getLightVibrantSwatch() {
        return getSwatchForTarget(Target.LIGHT_VIBRANT);
    }

    @Nullable
    public final Swatch getMutedSwatch() {
        return getSwatchForTarget(Target.MUTED);
    }

    @NonNull
    public final List<Swatch> getSwatches() {
        return Collections.unmodifiableList(this.mSwatches);
    }

    @NonNull
    public final List<Target> getTargets() {
        return Collections.unmodifiableList(this.mTargets);
    }

    @Nullable
    public final Swatch getVibrantSwatch() {
        return getSwatchForTarget(Target.VIBRANT);
    }

    @Nullable
    private Swatch findDominantSwatch() {
        int size = this.mSwatches.size();
        int i = Integer.MIN_VALUE;
        Swatch swatch = null;
        for (int i2 = 0; i2 < size; i2++) {
            Swatch swatch2 = this.mSwatches.get(i2);
            if (swatch2.getPopulation() > i) {
                i = swatch2.getPopulation();
                swatch = swatch2;
            }
        }
        return swatch;
    }

    /* access modifiers changed from: package-private */
    public final void generate() {
        int size = this.mTargets.size();
        for (int i = 0; i < size; i++) {
            Target target = this.mTargets.get(i);
            target.normalizeWeights();
            this.mSelectedSwatches.put(target, generateScoredTarget(target));
        }
        this.mUsedColors.clear();
    }

    @NonNull
    public static Builder from(@NonNull Bitmap bitmap) {
        return new Builder(bitmap);
    }

    @ColorInt
    public final int getDarkMutedColor(@ColorInt int i) {
        return getColorForTarget(Target.DARK_MUTED, i);
    }

    @ColorInt
    public final int getDarkVibrantColor(@ColorInt int i) {
        return getColorForTarget(Target.DARK_VIBRANT, i);
    }

    @ColorInt
    public final int getLightMutedColor(@ColorInt int i) {
        return getColorForTarget(Target.LIGHT_MUTED, i);
    }

    @ColorInt
    public final int getLightVibrantColor(@ColorInt int i) {
        return getColorForTarget(Target.LIGHT_VIBRANT, i);
    }

    @ColorInt
    public final int getMutedColor(@ColorInt int i) {
        return getColorForTarget(Target.MUTED, i);
    }

    @ColorInt
    public final int getVibrantColor(@ColorInt int i) {
        return getColorForTarget(Target.VIBRANT, i);
    }

    @NonNull
    public static Palette from(@NonNull List<Swatch> list) {
        return new Builder(list).generate();
    }

    @Deprecated
    public static Palette generate(Bitmap bitmap) {
        return from(bitmap).generate();
    }

    @ColorInt
    public final int getDominantColor(@ColorInt int i) {
        if (this.mDominantSwatch != null) {
            return this.mDominantSwatch.getRgb();
        }
        return i;
    }

    @Nullable
    public final Swatch getSwatchForTarget(@NonNull Target target) {
        return this.mSelectedSwatches.get(target);
    }

    @Nullable
    private Swatch generateScoredTarget(Target target) {
        Swatch maxScoredSwatchForTarget = getMaxScoredSwatchForTarget(target);
        if (maxScoredSwatchForTarget != null && target.isExclusive()) {
            this.mUsedColors.append(maxScoredSwatchForTarget.getRgb(), true);
        }
        return maxScoredSwatchForTarget;
    }

    @Nullable
    private Swatch getMaxScoredSwatchForTarget(Target target) {
        int size = this.mSwatches.size();
        float f2 = 0.0f;
        Swatch swatch = null;
        for (int i = 0; i < size; i++) {
            Swatch swatch2 = this.mSwatches.get(i);
            if (shouldBeScoredForTarget(swatch2, target)) {
                float generateScore = generateScore(swatch2, target);
                if (swatch == null || generateScore > f2) {
                    swatch = swatch2;
                    f2 = generateScore;
                }
            }
        }
        return swatch;
    }

    @ColorInt
    public final int getColorForTarget(@NonNull Target target, @ColorInt int i) {
        Swatch swatchForTarget = getSwatchForTarget(target);
        if (swatchForTarget != null) {
            return swatchForTarget.getRgb();
        }
        return i;
    }

    Palette(List<Swatch> list, List<Target> list2) {
        this.mSwatches = list;
        this.mTargets = list2;
    }

    @Deprecated
    public static Palette generate(Bitmap bitmap, int i) {
        return from(bitmap).maximumColorCount(i).generate();
    }

    @Deprecated
    public static AsyncTask<Bitmap, Void, Palette> generateAsync(Bitmap bitmap, PaletteAsyncListener paletteAsyncListener) {
        return from(bitmap).generate(paletteAsyncListener);
    }

    private boolean shouldBeScoredForTarget(Swatch swatch, Target target) {
        float[] hsl = swatch.getHsl();
        if (hsl[1] < target.getMinimumSaturation() || hsl[1] > target.getMaximumSaturation() || hsl[2] < target.getMinimumLightness() || hsl[2] > target.getMaximumLightness() || this.mUsedColors.get(swatch.getRgb())) {
            return false;
        }
        return true;
    }

    private float generateScore(Swatch swatch, Target target) {
        int i;
        float f2;
        float f3;
        float[] hsl = swatch.getHsl();
        if (this.mDominantSwatch != null) {
            i = this.mDominantSwatch.getPopulation();
        } else {
            i = 1;
        }
        float f4 = 0.0f;
        if (target.getSaturationWeight() > 0.0f) {
            f2 = (1.0f - Math.abs(hsl[1] - target.getTargetSaturation())) * target.getSaturationWeight();
        } else {
            f2 = 0.0f;
        }
        if (target.getLightnessWeight() > 0.0f) {
            f3 = target.getLightnessWeight() * (1.0f - Math.abs(hsl[2] - target.getTargetLightness()));
        } else {
            f3 = 0.0f;
        }
        if (target.getPopulationWeight() > 0.0f) {
            f4 = target.getPopulationWeight() * (((float) swatch.getPopulation()) / ((float) i));
        }
        return f2 + f3 + f4;
    }

    @Deprecated
    public static AsyncTask<Bitmap, Void, Palette> generateAsync(Bitmap bitmap, int i, PaletteAsyncListener paletteAsyncListener) {
        return from(bitmap).maximumColorCount(i).generate(paletteAsyncListener);
    }
}
