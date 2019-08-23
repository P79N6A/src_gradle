package android.support.v7.graphics;

import android.support.annotation.FloatRange;
import android.support.annotation.NonNull;

public final class Target {
    public static final Target DARK_MUTED;
    public static final Target DARK_VIBRANT;
    public static final Target LIGHT_MUTED;
    public static final Target LIGHT_VIBRANT;
    public static final Target MUTED;
    public static final Target VIBRANT;
    boolean mIsExclusive = true;
    final float[] mLightnessTargets = new float[3];
    final float[] mSaturationTargets = new float[3];
    final float[] mWeights = new float[3];

    public static final class Builder {
        private final Target mTarget;

        @NonNull
        public final Target build() {
            return this.mTarget;
        }

        public Builder() {
            this.mTarget = new Target();
        }

        @NonNull
        public final Builder setExclusive(boolean z) {
            this.mTarget.mIsExclusive = z;
            return this;
        }

        @NonNull
        public final Builder setLightnessWeight(@FloatRange(from = 0.0d) float f2) {
            this.mTarget.mWeights[1] = f2;
            return this;
        }

        @NonNull
        public final Builder setMaximumLightness(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
            this.mTarget.mLightnessTargets[2] = f2;
            return this;
        }

        @NonNull
        public final Builder setMaximumSaturation(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
            this.mTarget.mSaturationTargets[2] = f2;
            return this;
        }

        @NonNull
        public final Builder setMinimumLightness(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
            this.mTarget.mLightnessTargets[0] = f2;
            return this;
        }

        @NonNull
        public final Builder setMinimumSaturation(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
            this.mTarget.mSaturationTargets[0] = f2;
            return this;
        }

        @NonNull
        public final Builder setPopulationWeight(@FloatRange(from = 0.0d) float f2) {
            this.mTarget.mWeights[2] = f2;
            return this;
        }

        @NonNull
        public final Builder setSaturationWeight(@FloatRange(from = 0.0d) float f2) {
            this.mTarget.mWeights[0] = f2;
            return this;
        }

        @NonNull
        public final Builder setTargetLightness(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
            this.mTarget.mLightnessTargets[1] = f2;
            return this;
        }

        @NonNull
        public final Builder setTargetSaturation(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
            this.mTarget.mSaturationTargets[1] = f2;
            return this;
        }

        public Builder(@NonNull Target target) {
            this.mTarget = new Target(target);
        }
    }

    public final boolean isExclusive() {
        return this.mIsExclusive;
    }

    public final float getLightnessWeight() {
        return this.mWeights[1];
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float getMaximumLightness() {
        return this.mLightnessTargets[2];
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float getMaximumSaturation() {
        return this.mSaturationTargets[2];
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float getMinimumLightness() {
        return this.mLightnessTargets[0];
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float getMinimumSaturation() {
        return this.mSaturationTargets[0];
    }

    public final float getPopulationWeight() {
        return this.mWeights[2];
    }

    public final float getSaturationWeight() {
        return this.mWeights[0];
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float getTargetLightness() {
        return this.mLightnessTargets[1];
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float getTargetSaturation() {
        return this.mSaturationTargets[1];
    }

    private void setDefaultWeights() {
        this.mWeights[0] = 0.24f;
        this.mWeights[1] = 0.52f;
        this.mWeights[2] = 0.24f;
    }

    Target() {
        setTargetDefaultValues(this.mSaturationTargets);
        setTargetDefaultValues(this.mLightnessTargets);
        setDefaultWeights();
    }

    /* access modifiers changed from: package-private */
    public final void normalizeWeights() {
        float f2 = 0.0f;
        for (float f3 : this.mWeights) {
            if (f3 > 0.0f) {
                f2 += f3;
            }
        }
        if (f2 != 0.0f) {
            int length = this.mWeights.length;
            for (int i = 0; i < length; i++) {
                if (this.mWeights[i] > 0.0f) {
                    float[] fArr = this.mWeights;
                    fArr[i] = fArr[i] / f2;
                }
            }
        }
    }

    static {
        Target target = new Target();
        LIGHT_VIBRANT = target;
        setDefaultLightLightnessValues(target);
        setDefaultVibrantSaturationValues(LIGHT_VIBRANT);
        Target target2 = new Target();
        VIBRANT = target2;
        setDefaultNormalLightnessValues(target2);
        setDefaultVibrantSaturationValues(VIBRANT);
        Target target3 = new Target();
        DARK_VIBRANT = target3;
        setDefaultDarkLightnessValues(target3);
        setDefaultVibrantSaturationValues(DARK_VIBRANT);
        Target target4 = new Target();
        LIGHT_MUTED = target4;
        setDefaultLightLightnessValues(target4);
        setDefaultMutedSaturationValues(LIGHT_MUTED);
        Target target5 = new Target();
        MUTED = target5;
        setDefaultNormalLightnessValues(target5);
        setDefaultMutedSaturationValues(MUTED);
        Target target6 = new Target();
        DARK_MUTED = target6;
        setDefaultDarkLightnessValues(target6);
        setDefaultMutedSaturationValues(DARK_MUTED);
    }

    private static void setDefaultVibrantSaturationValues(Target target) {
        target.mSaturationTargets[0] = 0.35f;
        target.mSaturationTargets[1] = 1.0f;
    }

    private static void setTargetDefaultValues(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    private static void setDefaultDarkLightnessValues(Target target) {
        target.mLightnessTargets[1] = 0.26f;
        target.mLightnessTargets[2] = 0.45f;
    }

    private static void setDefaultLightLightnessValues(Target target) {
        target.mLightnessTargets[0] = 0.55f;
        target.mLightnessTargets[1] = 0.74f;
    }

    private static void setDefaultMutedSaturationValues(Target target) {
        target.mSaturationTargets[1] = 0.3f;
        target.mSaturationTargets[2] = 0.4f;
    }

    private static void setDefaultNormalLightnessValues(Target target) {
        target.mLightnessTargets[0] = 0.3f;
        target.mLightnessTargets[1] = 0.5f;
        target.mLightnessTargets[2] = 0.7f;
    }

    Target(@NonNull Target target) {
        System.arraycopy(target.mSaturationTargets, 0, this.mSaturationTargets, 0, this.mSaturationTargets.length);
        System.arraycopy(target.mLightnessTargets, 0, this.mLightnessTargets, 0, this.mLightnessTargets.length);
        System.arraycopy(target.mWeights, 0, this.mWeights, 0, this.mWeights.length);
    }
}
