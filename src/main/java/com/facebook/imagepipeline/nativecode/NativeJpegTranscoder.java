package com.facebook.imagepipeline.nativecode;

import com.facebook.b.c;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.producers.p;
import com.facebook.imagepipeline.transcoder.a;
import com.facebook.imagepipeline.transcoder.b;
import com.facebook.imagepipeline.transcoder.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;

@DoNotStrip
public class NativeJpegTranscoder implements b {
    private int mMaxBitmapSize;
    private boolean mResizingEnabled;
    private boolean mUseDownsamplingRatio;

    @DoNotStrip
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    @DoNotStrip
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    public String getIdentifier() {
        return "NativeJpegTranscoder";
    }

    static {
        a.load();
    }

    public boolean canTranscode(c cVar) {
        if (cVar == com.facebook.b.b.f23288a) {
            return true;
        }
        return false;
    }

    public NativeJpegTranscoder(boolean z, int i, boolean z2) {
        this.mResizingEnabled = z;
        this.mMaxBitmapSize = i;
        this.mUseDownsamplingRatio = z2;
    }

    public boolean canResize(com.facebook.imagepipeline.image.b bVar, @Nullable RotationOptions rotationOptions, @Nullable ResizeOptions resizeOptions) {
        if (rotationOptions == null) {
            rotationOptions = RotationOptions.autoRotate();
        }
        if (d.getSoftwareNumerator(rotationOptions, resizeOptions, bVar, this.mResizingEnabled) < 8) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    public static void transcodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        if (i2 <= 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        if (i3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Preconditions.checkArgument(z3);
        if (i3 <= 100) {
            z4 = true;
        } else {
            z4 = false;
        }
        Preconditions.checkArgument(z4);
        Preconditions.checkArgument(d.isRotationAngleAllowed(i));
        if (!(i2 == 8 && i == 0)) {
            z5 = true;
        }
        Preconditions.checkArgument(z5, "no transformation requested");
        nativeTranscodeJpeg((InputStream) Preconditions.checkNotNull(inputStream), (OutputStream) Preconditions.checkNotNull(outputStream), i, i2, i3);
    }

    @VisibleForTesting
    public static void transcodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        if (i2 <= 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        if (i3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Preconditions.checkArgument(z3);
        if (i3 <= 100) {
            z4 = true;
        } else {
            z4 = false;
        }
        Preconditions.checkArgument(z4);
        Preconditions.checkArgument(d.isExifOrientationAllowed(i));
        if (!(i2 == 8 && i == 1)) {
            z5 = true;
        }
        Preconditions.checkArgument(z5, "no transformation requested");
        nativeTranscodeJpegWithExifOrientation((InputStream) Preconditions.checkNotNull(inputStream), (OutputStream) Preconditions.checkNotNull(outputStream), i, i2, i3);
    }

    public a transcode(com.facebook.imagepipeline.image.b bVar, OutputStream outputStream, @Nullable RotationOptions rotationOptions, @Nullable ResizeOptions resizeOptions, @Nullable c cVar, @Nullable Integer num) throws IOException {
        InputStream inputStream;
        if (num == null) {
            num = 85;
        }
        if (rotationOptions == null) {
            rotationOptions = RotationOptions.autoRotate();
        }
        int determineSampleSize = p.determineSampleSize(rotationOptions, resizeOptions, bVar, this.mMaxBitmapSize);
        try {
            int softwareNumerator = d.getSoftwareNumerator(rotationOptions, resizeOptions, bVar, this.mResizingEnabled);
            int calculateDownsampleNumerator = d.calculateDownsampleNumerator(determineSampleSize);
            if (this.mUseDownsamplingRatio) {
                softwareNumerator = calculateDownsampleNumerator;
            }
            inputStream = bVar.getInputStream();
            try {
                if (d.INVERTED_EXIF_ORIENTATIONS.contains(Integer.valueOf(bVar.getExifOrientation()))) {
                    transcodeJpegWithExifOrientation(inputStream, outputStream, d.getForceRotatedInvertedExifOrientation(rotationOptions, bVar), softwareNumerator, num.intValue());
                } else {
                    transcodeJpeg(inputStream, outputStream, d.getRotationAngle(rotationOptions, bVar), softwareNumerator, num.intValue());
                }
                com.facebook.common.internal.c.a(inputStream);
                int i = 1;
                if (determineSampleSize != 1) {
                    i = 0;
                }
                return new a(i);
            } catch (Throwable th) {
                th = th;
                com.facebook.common.internal.c.a(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            com.facebook.common.internal.c.a(inputStream);
            throw th;
        }
    }
}
