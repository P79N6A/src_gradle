package com.facebook.imagepipeline.common;

import com.facebook.common.f.b;
import com.facebook.common.internal.Preconditions;
import javax.annotation.Nullable;

public class ResizeOptions {
    public final int height;
    public final float maxBitmapSize;
    public final float roundUpFraction;
    public final int width;

    public int hashCode() {
        return b.a(this.width, this.height);
    }

    public String toString() {
        return String.format(null, "%dx%d", new Object[]{Integer.valueOf(this.width), Integer.valueOf(this.height)});
    }

    @Nullable
    public static ResizeOptions forSquareSize(int i) {
        if (i <= 0) {
            return null;
        }
        return new ResizeOptions(i, i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResizeOptions)) {
            return false;
        }
        ResizeOptions resizeOptions = (ResizeOptions) obj;
        if (this.width == resizeOptions.width && this.height == resizeOptions.height) {
            return true;
        }
        return false;
    }

    public ResizeOptions(int i, int i2) {
        this(i, i2, 2048.0f);
    }

    @Nullable
    public static ResizeOptions forDimensions(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return null;
        }
        return new ResizeOptions(i, i2);
    }

    public ResizeOptions(int i, int i2, float f2) {
        this(i, i2, f2, 0.6666667f);
    }

    public ResizeOptions(int i, int i2, float f2, float f3) {
        boolean z;
        boolean z2 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        Preconditions.checkArgument(i2 > 0 ? true : z2);
        this.width = i;
        this.height = i2;
        this.maxBitmapSize = f2;
        this.roundUpFraction = f3;
    }
}
