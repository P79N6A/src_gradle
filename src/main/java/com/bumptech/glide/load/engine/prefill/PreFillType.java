package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.bumptech.glide.util.Preconditions;

public final class PreFillType {
    @VisibleForTesting
    static final Bitmap.Config DEFAULT_CONFIG = Bitmap.Config.RGB_565;
    private final Bitmap.Config config;
    private final int height;
    private final int weight;
    private final int width;

    public static class Builder {
        private Bitmap.Config config;
        private final int height;
        private int weight;
        private final int width;

        /* access modifiers changed from: package-private */
        public Bitmap.Config getConfig() {
            return this.config;
        }

        /* access modifiers changed from: package-private */
        public PreFillType build() {
            return new PreFillType(this.width, this.height, this.config, this.weight);
        }

        public Builder(int i) {
            this(i, i);
        }

        public Builder setConfig(@Nullable Bitmap.Config config2) {
            this.config = config2;
            return this;
        }

        public Builder setWeight(int i) {
            if (i > 0) {
                this.weight = i;
                return this;
            }
            throw new IllegalArgumentException("Weight must be > 0");
        }

        public Builder(int i, int i2) {
            this.weight = 1;
            if (i <= 0) {
                throw new IllegalArgumentException("Width must be > 0");
            } else if (i2 > 0) {
                this.width = i;
                this.height = i2;
            } else {
                throw new IllegalArgumentException("Height must be > 0");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Bitmap.Config getConfig() {
        return this.config;
    }

    /* access modifiers changed from: package-private */
    public final int getHeight() {
        return this.height;
    }

    /* access modifiers changed from: package-private */
    public final int getWeight() {
        return this.weight;
    }

    /* access modifiers changed from: package-private */
    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        return (((((this.width * 31) + this.height) * 31) + this.config.hashCode()) * 31) + this.weight;
    }

    public final String toString() {
        return "PreFillSize{width=" + this.width + ", height=" + this.height + ", config=" + this.config + ", weight=" + this.weight + '}';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PreFillType)) {
            return false;
        }
        PreFillType preFillType = (PreFillType) obj;
        if (this.height == preFillType.height && this.width == preFillType.width && this.weight == preFillType.weight && this.config == preFillType.config) {
            return true;
        }
        return false;
    }

    PreFillType(int i, int i2, Bitmap.Config config2, int i3) {
        this.config = (Bitmap.Config) Preconditions.checkNotNull(config2, "Config must not be null");
        this.width = i;
        this.height = i2;
        this.weight = i3;
    }
}
