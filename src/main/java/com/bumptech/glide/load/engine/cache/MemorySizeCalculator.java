package com.bumptech.glide.load.engine.cache;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.support.annotation.VisibleForTesting;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.util.Preconditions;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public final class MemorySizeCalculator {
    private final int arrayPoolSize;
    private final int bitmapPoolSize;
    private final Context context;
    private final int memoryCacheSize;

    public static final class Builder {
        static final int BITMAP_POOL_TARGET_SCREENS;
        ActivityManager activityManager;
        int arrayPoolSizeBytes = 4194304;
        float bitmapPoolScreens = ((float) BITMAP_POOL_TARGET_SCREENS);
        final Context context;
        float lowMemoryMaxSizeMultiplier = 0.33f;
        float maxSizeMultiplier = 0.4f;
        float memoryCacheScreens = 2.0f;
        ScreenDimensions screenDimensions;

        public final MemorySizeCalculator build() {
            return new MemorySizeCalculator(this);
        }

        static {
            int i;
            if (Build.VERSION.SDK_INT < 26) {
                i = 4;
            } else {
                i = 1;
            }
            BITMAP_POOL_TARGET_SCREENS = i;
        }

        /* access modifiers changed from: package-private */
        @VisibleForTesting
        public final Builder setActivityManager(ActivityManager activityManager2) {
            this.activityManager = activityManager2;
            return this;
        }

        public final Builder setArrayPoolSize(int i) {
            this.arrayPoolSizeBytes = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        @VisibleForTesting
        public final Builder setScreenDimensions(ScreenDimensions screenDimensions2) {
            this.screenDimensions = screenDimensions2;
            return this;
        }

        public final Builder setBitmapPoolScreens(float f2) {
            boolean z;
            if (f2 >= 0.0f) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Bitmap pool screens must be greater than or equal to 0");
            this.bitmapPoolScreens = f2;
            return this;
        }

        public final Builder setMemoryCacheScreens(float f2) {
            boolean z;
            if (f2 >= 0.0f) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Memory cache screens must be greater than or equal to 0");
            this.memoryCacheScreens = f2;
            return this;
        }

        public final Builder setLowMemoryMaxSizeMultiplier(float f2) {
            boolean z;
            if (f2 < 0.0f || f2 > 1.0f) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkArgument(z, "Low memory max size multiplier must be between 0 and 1");
            this.lowMemoryMaxSizeMultiplier = f2;
            return this;
        }

        public final Builder setMaxSizeMultiplier(float f2) {
            boolean z;
            if (f2 < 0.0f || f2 > 1.0f) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkArgument(z, "Size multiplier must be between 0 and 1");
            this.maxSizeMultiplier = f2;
            return this;
        }

        public Builder(Context context2) {
            this.context = context2;
            this.activityManager = (ActivityManager) context2.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            this.screenDimensions = new DisplayMetricsScreenDimensions(context2.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && MemorySizeCalculator.isLowMemoryDevice(this.activityManager)) {
                this.bitmapPoolScreens = 0.0f;
            }
        }
    }

    static final class DisplayMetricsScreenDimensions implements ScreenDimensions {
        private final DisplayMetrics displayMetrics;

        public final int getHeightPixels() {
            return this.displayMetrics.heightPixels;
        }

        public final int getWidthPixels() {
            return this.displayMetrics.widthPixels;
        }

        DisplayMetricsScreenDimensions(DisplayMetrics displayMetrics2) {
            this.displayMetrics = displayMetrics2;
        }
    }

    interface ScreenDimensions {
        int getHeightPixels();

        int getWidthPixels();
    }

    public final int getArrayPoolSizeInBytes() {
        return this.arrayPoolSize;
    }

    public final int getBitmapPoolSize() {
        return this.bitmapPoolSize;
    }

    public final int getMemoryCacheSize() {
        return this.memoryCacheSize;
    }

    private String toMb(int i) {
        return Formatter.formatFileSize(this.context, (long) i);
    }

    @TargetApi(19)
    static boolean isLowMemoryDevice(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    MemorySizeCalculator(Builder builder) {
        int i;
        boolean z;
        this.context = builder.context;
        if (isLowMemoryDevice(builder.activityManager)) {
            i = builder.arrayPoolSizeBytes / 2;
        } else {
            i = builder.arrayPoolSizeBytes;
        }
        this.arrayPoolSize = i;
        int maxSize = getMaxSize(builder.activityManager, builder.maxSizeMultiplier, builder.lowMemoryMaxSizeMultiplier);
        float widthPixels = (float) (builder.screenDimensions.getWidthPixels() * builder.screenDimensions.getHeightPixels() * 4);
        int round = Math.round(builder.bitmapPoolScreens * widthPixels);
        int round2 = Math.round(widthPixels * builder.memoryCacheScreens);
        int i2 = maxSize - this.arrayPoolSize;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.memoryCacheSize = round2;
            this.bitmapPoolSize = round;
        } else {
            float f2 = ((float) i2) / (builder.bitmapPoolScreens + builder.memoryCacheScreens);
            this.memoryCacheSize = Math.round(builder.memoryCacheScreens * f2);
            this.bitmapPoolSize = Math.round(f2 * builder.bitmapPoolScreens);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb.append(toMb(this.memoryCacheSize));
            sb.append(", pool size: ");
            sb.append(toMb(this.bitmapPoolSize));
            sb.append(", byte array size: ");
            sb.append(toMb(this.arrayPoolSize));
            sb.append(", memory class limited? ");
            if (i3 > maxSize) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(", max size: ");
            sb.append(toMb(maxSize));
            sb.append(", memoryClass: ");
            sb.append(builder.activityManager.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(isLowMemoryDevice(builder.activityManager));
        }
    }

    private static int getMaxSize(ActivityManager activityManager, float f2, float f3) {
        boolean isLowMemoryDevice = isLowMemoryDevice(activityManager);
        float memoryClass = (float) (activityManager.getMemoryClass() * 1024 * 1024);
        if (isLowMemoryDevice) {
            f2 = f3;
        }
        return Math.round(memoryClass * f2);
    }
}
