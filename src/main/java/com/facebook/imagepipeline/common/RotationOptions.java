package com.facebook.imagepipeline.common;

import com.facebook.common.f.b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class RotationOptions {
    private static final RotationOptions ROTATION_OPTIONS_AUTO_ROTATE = new RotationOptions(-1, false);
    private static final RotationOptions ROTATION_OPTIONS_DISABLE_ROTATION = new RotationOptions(-2, false);
    private static final RotationOptions ROTATION_OPTIONS_ROTATE_AT_RENDER_TIME = new RotationOptions(-1, true);
    private final boolean mDeferUntilRendered;
    private final int mRotation;

    @Retention(RetentionPolicy.SOURCE)
    public @interface RotationAngle {
    }

    public static RotationOptions autoRotate() {
        return ROTATION_OPTIONS_AUTO_ROTATE;
    }

    public static RotationOptions autoRotateAtRenderTime() {
        return ROTATION_OPTIONS_ROTATE_AT_RENDER_TIME;
    }

    public static RotationOptions disableRotation() {
        return ROTATION_OPTIONS_DISABLE_ROTATION;
    }

    public boolean canDeferUntilRendered() {
        return this.mDeferUntilRendered;
    }

    public boolean rotationEnabled() {
        if (this.mRotation != -2) {
            return true;
        }
        return false;
    }

    public boolean useImageMetadata() {
        if (this.mRotation == -1) {
            return true;
        }
        return false;
    }

    public int getForcedAngle() {
        if (!useImageMetadata()) {
            return this.mRotation;
        }
        throw new IllegalStateException("Rotation is set to use EXIF");
    }

    public String toString() {
        return String.format(null, "%d defer:%b", new Object[]{Integer.valueOf(this.mRotation), Boolean.valueOf(this.mDeferUntilRendered)});
    }

    public int hashCode() {
        int i;
        Integer valueOf = Integer.valueOf(this.mRotation);
        Boolean valueOf2 = Boolean.valueOf(this.mDeferUntilRendered);
        int i2 = 0;
        if (valueOf == null) {
            i = 0;
        } else {
            i = valueOf.hashCode();
        }
        if (valueOf2 != null) {
            i2 = valueOf2.hashCode();
        }
        return b.a(i, i2);
    }

    public static RotationOptions forceRotation(int i) {
        return new RotationOptions(i, false);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RotationOptions)) {
            return false;
        }
        RotationOptions rotationOptions = (RotationOptions) obj;
        if (this.mRotation == rotationOptions.mRotation && this.mDeferUntilRendered == rotationOptions.mDeferUntilRendered) {
            return true;
        }
        return false;
    }

    private RotationOptions(int i, boolean z) {
        this.mRotation = i;
        this.mDeferUntilRendered = z;
    }
}
