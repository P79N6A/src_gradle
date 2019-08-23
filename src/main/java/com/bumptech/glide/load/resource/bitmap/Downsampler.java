package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public final class Downsampler {
    public static final Option<Boolean> ALLOW_HARDWARE_CONFIG = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", Boolean.FALSE);
    public static final Option<DecodeFormat> DECODE_FORMAT = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.DEFAULT);
    @Deprecated
    public static final Option<DownsampleStrategy> DOWNSAMPLE_STRATEGY = DownsampleStrategy.OPTION;
    private static final DecodeCallbacks EMPTY_CALLBACKS = new DecodeCallbacks() {
        public void onDecodeComplete(BitmapPool bitmapPool, Bitmap bitmap) {
        }

        public void onObtainBounds() {
        }
    };
    public static final Option<Boolean> FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", Boolean.FALSE);
    private static final Set<String> NO_DOWNSAMPLE_PRE_N_MIME_TYPES = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));
    private static final Queue<BitmapFactory.Options> OPTIONS_QUEUE = Util.createQueue(0);
    private static final Set<ImageHeaderParser.ImageType> TYPES_THAT_USE_POOL_PRE_KITKAT = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
    private final BitmapPool bitmapPool;
    private final ArrayPool byteArrayPool;
    private final DisplayMetrics displayMetrics;
    private final HardwareConfigState hardwareConfigState = HardwareConfigState.getInstance();
    private final List<ImageHeaderParser> parsers;

    public interface DecodeCallbacks {
        void onDecodeComplete(BitmapPool bitmapPool, Bitmap bitmap) throws IOException;

        void onObtainBounds();
    }

    private static void logDecode(int i, int i2, String str, BitmapFactory.Options options, Bitmap bitmap, int i3, int i4, long j) {
    }

    private static int round(double d2) {
        return (int) (d2 + 0.5d);
    }

    public final boolean handles(InputStream inputStream) {
        return true;
    }

    public final boolean handles(ByteBuffer byteBuffer) {
        return true;
    }

    private static synchronized BitmapFactory.Options getDefaultOptions() {
        BitmapFactory.Options poll;
        synchronized (Downsampler.class) {
            synchronized (OPTIONS_QUEUE) {
                poll = OPTIONS_QUEUE.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                resetOptions(poll);
            }
        }
        return poll;
    }

    private static String getInBitmapString(BitmapFactory.Options options) {
        return getBitmapString(options.inBitmap);
    }

    private static void releaseOptions(BitmapFactory.Options options) {
        resetOptions(options);
        synchronized (OPTIONS_QUEUE) {
            OPTIONS_QUEUE.offer(options);
        }
    }

    private boolean shouldUsePool(ImageHeaderParser.ImageType imageType) {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return TYPES_THAT_USE_POOL_PRE_KITKAT.contains(imageType);
    }

    private static int getDensityMultiplier(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    private static boolean isScaling(BitmapFactory.Options options) {
        if (options.inTargetDensity <= 0 || options.inDensity <= 0 || options.inTargetDensity == options.inDensity) {
            return false;
        }
        return true;
    }

    private static void resetOptions(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int adjustTargetDensityForError(double d2) {
        int densityMultiplier = getDensityMultiplier(d2);
        double d3 = (double) densityMultiplier;
        Double.isNaN(d3);
        int round = round(d3 * d2);
        double d4 = (double) (((float) round) / ((float) densityMultiplier));
        Double.isNaN(d4);
        double d5 = (double) round;
        Double.isNaN(d5);
        return round((d2 / d4) * d5);
    }

    @Nullable
    @TargetApi(19)
    private static String getBitmapString(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            str = " (" + bitmap.getAllocationByteCount() + ")";
        } else {
            str = "";
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + str;
    }

    public final Resource<Bitmap> decode(InputStream inputStream, int i, int i2, Options options) throws IOException {
        return decode(inputStream, i, i2, options, EMPTY_CALLBACKS);
    }

    private static int[] getDimensions(InputStream inputStream, BitmapFactory.Options options, DecodeCallbacks decodeCallbacks, BitmapPool bitmapPool2) throws IOException {
        options.inJustDecodeBounds = true;
        decodeStream(inputStream, options, decodeCallbacks, bitmapPool2);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    @TargetApi(26)
    private static void setInBitmap(BitmapFactory.Options options, BitmapPool bitmapPool2, int i, int i2) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = bitmapPool2.getDirty(i, i2, config);
    }

    public Downsampler(List<ImageHeaderParser> list, DisplayMetrics displayMetrics2, BitmapPool bitmapPool2, ArrayPool arrayPool) {
        this.parsers = list;
        this.displayMetrics = (DisplayMetrics) Preconditions.checkNotNull(displayMetrics2);
        this.bitmapPool = (BitmapPool) Preconditions.checkNotNull(bitmapPool2);
        this.byteArrayPool = (ArrayPool) Preconditions.checkNotNull(arrayPool);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap decodeStream(java.io.InputStream r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks r7, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r8) throws java.io.IOException {
        /*
            boolean r0 = r6.inJustDecodeBounds
            if (r0 == 0) goto L_0x000a
            r0 = 10485760(0xa00000, float:1.469368E-38)
            r5.mark(r0)
            goto L_0x000d
        L_0x000a:
            r7.onObtainBounds()
        L_0x000d:
            int r0 = r6.outWidth
            int r1 = r6.outHeight
            java.lang.String r2 = r6.outMimeType
            java.util.concurrent.locks.Lock r3 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.getBitmapDrawableLock()
            r3.lock()
            r3 = 0
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r5, r3, r6)     // Catch:{ IllegalArgumentException -> 0x0030 }
            java.util.concurrent.locks.Lock r7 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.getBitmapDrawableLock()
            r7.unlock()
            boolean r6 = r6.inJustDecodeBounds
            if (r6 == 0) goto L_0x002d
            r5.reset()
        L_0x002d:
            return r4
        L_0x002e:
            r5 = move-exception
            goto L_0x0051
        L_0x0030:
            r4 = move-exception
            java.io.IOException r0 = newIoExceptionForInBitmapAssertion(r4, r0, r1, r2, r6)     // Catch:{ all -> 0x002e }
            android.graphics.Bitmap r1 = r6.inBitmap     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x0050
            r5.reset()     // Catch:{ IOException -> 0x004f }
            android.graphics.Bitmap r1 = r6.inBitmap     // Catch:{ IOException -> 0x004f }
            r8.put(r1)     // Catch:{ IOException -> 0x004f }
            r6.inBitmap = r3     // Catch:{ IOException -> 0x004f }
            android.graphics.Bitmap r5 = decodeStream(r5, r6, r7, r8)     // Catch:{ IOException -> 0x004f }
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.getBitmapDrawableLock()
            r6.unlock()
            return r5
        L_0x004f:
            throw r0     // Catch:{ all -> 0x002e }
        L_0x0050:
            throw r0     // Catch:{ all -> 0x002e }
        L_0x0051:
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.getBitmapDrawableLock()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.Downsampler.decodeStream(java.io.InputStream, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.Downsampler$DecodeCallbacks, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool):android.graphics.Bitmap");
    }

    private static IOException newIoExceptionForInBitmapAssertion(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + getInBitmapString(options), illegalArgumentException);
    }

    public final Resource<Bitmap> decode(InputStream inputStream, int i, int i2, Options options, DecodeCallbacks decodeCallbacks) throws IOException {
        boolean z;
        Options options2 = options;
        Preconditions.checkArgument(inputStream.markSupported(), "You must provide an InputStream that supports mark()");
        byte[] bArr = (byte[]) this.byteArrayPool.get(65536, byte[].class);
        BitmapFactory.Options defaultOptions = getDefaultOptions();
        defaultOptions.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) options2.get(DECODE_FORMAT);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) options2.get(DownsampleStrategy.OPTION);
        boolean booleanValue = ((Boolean) options2.get(FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS)).booleanValue();
        if (options2.get(ALLOW_HARDWARE_CONFIG) == null || !((Boolean) options2.get(ALLOW_HARDWARE_CONFIG)).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        try {
            return BitmapResource.obtain(decodeFromWrappedStreams(inputStream, defaultOptions, downsampleStrategy, decodeFormat, z, i, i2, booleanValue, decodeCallbacks), this.bitmapPool);
        } finally {
            releaseOptions(defaultOptions);
            this.byteArrayPool.put(bArr);
        }
    }

    private void calculateConfig(InputStream inputStream, DecodeFormat decodeFormat, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) {
        boolean z3;
        Bitmap.Config config;
        if (!this.hardwareConfigState.setHardwareConfigIfAllowed(i, i2, options, decodeFormat, z, z2)) {
            if (decodeFormat == DecodeFormat.PREFER_ARGB_8888 || Build.VERSION.SDK_INT == 16) {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                return;
            }
            try {
                z3 = ImageHeaderParserUtils.getType(this.parsers, inputStream, this.byteArrayPool).hasAlpha();
            } catch (IOException unused) {
                z3 = false;
            }
            if (z3) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.RGB_565;
            }
            options.inPreferredConfig = config;
            if (options.inPreferredConfig == Bitmap.Config.RGB_565) {
                options.inDither = true;
            }
        }
    }

    private Bitmap decodeFromWrappedStreams(InputStream inputStream, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, boolean z, int i, int i2, boolean z2, DecodeCallbacks decodeCallbacks) throws IOException {
        boolean z3;
        int i3;
        int i4;
        int i5;
        Downsampler downsampler;
        int i6;
        float f2;
        InputStream inputStream2 = inputStream;
        BitmapFactory.Options options2 = options;
        DecodeCallbacks decodeCallbacks2 = decodeCallbacks;
        long logTime = LogTime.getLogTime();
        int[] dimensions = getDimensions(inputStream2, options2, decodeCallbacks2, this.bitmapPool);
        boolean z4 = false;
        int i7 = dimensions[0];
        int i8 = dimensions[1];
        String str = options2.outMimeType;
        if (i7 == -1 || i8 == -1) {
            z3 = false;
        } else {
            z3 = z;
        }
        int orientation = ImageHeaderParserUtils.getOrientation(this.parsers, inputStream2, this.byteArrayPool);
        int exifOrientationDegrees = TransformationUtils.getExifOrientationDegrees(orientation);
        boolean isExifOrientationRequired = TransformationUtils.isExifOrientationRequired(orientation);
        int i9 = i;
        if (i9 == Integer.MIN_VALUE) {
            i4 = i2;
            i3 = i7;
        } else {
            i4 = i2;
            i3 = i9;
        }
        if (i4 == Integer.MIN_VALUE) {
            i5 = i8;
        } else {
            i5 = i4;
        }
        ImageHeaderParser.ImageType type = ImageHeaderParserUtils.getType(this.parsers, inputStream2, this.byteArrayPool);
        BitmapPool bitmapPool2 = this.bitmapPool;
        ImageHeaderParser.ImageType imageType = type;
        calculateScaling(type, inputStream, decodeCallbacks, bitmapPool2, downsampleStrategy, exifOrientationDegrees, i7, i8, i3, i5, options);
        int i10 = orientation;
        String str2 = str;
        int i11 = i8;
        int i12 = i7;
        DecodeCallbacks decodeCallbacks3 = decodeCallbacks2;
        BitmapFactory.Options options3 = options2;
        calculateConfig(inputStream, decodeFormat, z3, isExifOrientationRequired, options, i3, i5);
        if (Build.VERSION.SDK_INT >= 19) {
            z4 = true;
        }
        if (options3.inSampleSize == 1 || z4) {
            downsampler = this;
            if (downsampler.shouldUsePool(imageType)) {
                if (i12 < 0 || i11 < 0 || !z2 || !z4) {
                    if (isScaling(options)) {
                        f2 = ((float) options3.inTargetDensity) / ((float) options3.inDensity);
                    } else {
                        f2 = 1.0f;
                    }
                    float f3 = (float) options3.inSampleSize;
                    i3 = Math.round(((float) ((int) Math.ceil((double) (((float) i12) / f3)))) * f2);
                    i5 = Math.round(((float) ((int) Math.ceil((double) (((float) i11) / f3)))) * f2);
                }
                int i13 = i3;
                int i14 = i5;
                if (i13 > 0 && i14 > 0) {
                    setInBitmap(options3, downsampler.bitmapPool, i13, i14);
                }
            }
        } else {
            downsampler = this;
        }
        Bitmap decodeStream = decodeStream(inputStream, options3, decodeCallbacks3, downsampler.bitmapPool);
        decodeCallbacks3.onDecodeComplete(downsampler.bitmapPool, decodeStream);
        if (Log.isLoggable("Downsampler", 2)) {
            i6 = i10;
            logDecode(i12, i11, str2, options, decodeStream, i, i2, logTime);
        } else {
            i6 = i10;
        }
        Bitmap bitmap = null;
        if (decodeStream != null) {
            decodeStream.setDensity(downsampler.displayMetrics.densityDpi);
            bitmap = TransformationUtils.rotateImageExif(downsampler.bitmapPool, decodeStream, i6);
            if (!decodeStream.equals(bitmap)) {
                downsampler.bitmapPool.put(decodeStream);
            }
        }
        return bitmap;
    }

    private static void calculateScaling(ImageHeaderParser.ImageType imageType, InputStream inputStream, DecodeCallbacks decodeCallbacks, BitmapPool bitmapPool2, DownsampleStrategy downsampleStrategy, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) throws IOException {
        float f2;
        int i6;
        int i7;
        int i8;
        int i9;
        ImageHeaderParser.ImageType imageType2 = imageType;
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        int i10 = i;
        int i11 = i2;
        int i12 = i3;
        int i13 = i4;
        int i14 = i5;
        BitmapFactory.Options options2 = options;
        if (i11 > 0 && i12 > 0) {
            if (i10 == 90 || i10 == 270) {
                f2 = downsampleStrategy2.getScaleFactor(i12, i11, i13, i14);
            } else {
                f2 = downsampleStrategy2.getScaleFactor(i11, i12, i13, i14);
            }
            if (f2 > 0.0f) {
                DownsampleStrategy.SampleSizeRounding sampleSizeRounding = downsampleStrategy2.getSampleSizeRounding(i11, i12, i13, i14);
                if (sampleSizeRounding != null) {
                    float f3 = (float) i11;
                    float f4 = (float) i12;
                    int round = i11 / round((double) (f2 * f3));
                    int round2 = i12 / round((double) (f2 * f4));
                    if (sampleSizeRounding == DownsampleStrategy.SampleSizeRounding.MEMORY) {
                        i6 = Math.max(round, round2);
                    } else {
                        i6 = Math.min(round, round2);
                    }
                    if (Build.VERSION.SDK_INT > 23 || !NO_DOWNSAMPLE_PRE_N_MIME_TYPES.contains(options2.outMimeType)) {
                        i7 = Math.max(1, Integer.highestOneBit(i6));
                        if (sampleSizeRounding == DownsampleStrategy.SampleSizeRounding.MEMORY && ((float) i7) < 1.0f / f2) {
                            i7 <<= 1;
                        }
                    } else {
                        i7 = 1;
                    }
                    options2.inSampleSize = i7;
                    if (imageType2 == ImageHeaderParser.ImageType.JPEG) {
                        float min = (float) Math.min(i7, 8);
                        i8 = (int) Math.ceil((double) (f3 / min));
                        i9 = (int) Math.ceil((double) (f4 / min));
                        int i15 = i7 / 8;
                        if (i15 > 0) {
                            i8 /= i15;
                            i9 /= i15;
                        }
                    } else if (imageType2 == ImageHeaderParser.ImageType.PNG || imageType2 == ImageHeaderParser.ImageType.PNG_A) {
                        float f5 = (float) i7;
                        i8 = (int) Math.floor((double) (f3 / f5));
                        i9 = (int) Math.floor((double) (f4 / f5));
                    } else if (imageType2 == ImageHeaderParser.ImageType.WEBP || imageType2 == ImageHeaderParser.ImageType.WEBP_A) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            float f6 = (float) i7;
                            i8 = Math.round(f3 / f6);
                            i9 = Math.round(f4 / f6);
                        } else {
                            float f7 = (float) i7;
                            i8 = (int) Math.floor((double) (f3 / f7));
                            i9 = (int) Math.floor((double) (f4 / f7));
                        }
                    } else if (i11 % i7 == 0 && i12 % i7 == 0) {
                        i8 = i11 / i7;
                        i9 = i12 / i7;
                    } else {
                        int[] dimensions = getDimensions(inputStream, options2, decodeCallbacks, bitmapPool2);
                        i8 = dimensions[0];
                        i9 = dimensions[1];
                    }
                    double scaleFactor = (double) downsampleStrategy2.getScaleFactor(i8, i9, i13, i14);
                    if (Build.VERSION.SDK_INT >= 19) {
                        options2.inTargetDensity = adjustTargetDensityForError(scaleFactor);
                        options2.inDensity = getDensityMultiplier(scaleFactor);
                    }
                    if (isScaling(options)) {
                        options2.inScaled = true;
                        return;
                    }
                    options2.inTargetDensity = 0;
                    options2.inDensity = 0;
                    return;
                }
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            throw new IllegalArgumentException("Cannot scale with factor: " + f2 + " from: " + downsampleStrategy2 + ", source: [" + i11 + "x" + i12 + "], target: [" + i13 + "x" + i14 + "]");
        }
    }
}
