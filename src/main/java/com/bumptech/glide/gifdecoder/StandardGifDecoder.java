package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.gifdecoder.GifDecoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

public class StandardGifDecoder implements GifDecoder {
    private static final String TAG = "StandardGifDecoder";
    @ColorInt
    private int[] act;
    @NonNull
    private Bitmap.Config bitmapConfig;
    private final GifDecoder.BitmapProvider bitmapProvider;
    private byte[] block;
    private int downsampledHeight;
    private int downsampledWidth;
    private int framePointer;
    private GifHeader header;
    @Nullable
    private Boolean isFirstFrameTransparent;
    private byte[] mainPixels;
    @ColorInt
    private int[] mainScratch;
    private GifHeaderParser parser;
    @ColorInt
    private final int[] pct;
    private byte[] pixelStack;
    private short[] prefix;
    private Bitmap previousImage;
    private ByteBuffer rawData;
    private int sampleSize;
    private boolean savePrevious;
    private int status;
    private byte[] suffix;

    public void resetFrameIndex() {
        this.framePointer = -1;
    }

    public int getCurrentFrameIndex() {
        return this.framePointer;
    }

    @NonNull
    public ByteBuffer getData() {
        return this.rawData;
    }

    public int getStatus() {
        return this.status;
    }

    public int getFrameCount() {
        return this.header.frameCount;
    }

    public int getHeight() {
        return this.header.height;
    }

    public int getNetscapeLoopCount() {
        return this.header.loopCount;
    }

    public int getWidth() {
        return this.header.width;
    }

    @NonNull
    private GifHeaderParser getHeaderParser() {
        if (this.parser == null) {
            this.parser = new GifHeaderParser();
        }
        return this.parser;
    }

    private int readByte() {
        return this.rawData.get() & 255;
    }

    public void advance() {
        this.framePointer = (this.framePointer + 1) % this.header.frameCount;
    }

    @Deprecated
    public int getLoopCount() {
        if (this.header.loopCount == -1) {
            return 1;
        }
        return this.header.loopCount;
    }

    private int readBlock() {
        int readByte = readByte();
        if (readByte <= 0) {
            return readByte;
        }
        this.rawData.get(this.block, 0, Math.min(readByte, this.rawData.remaining()));
        return readByte;
    }

    public int getByteSize() {
        return this.rawData.limit() + this.mainPixels.length + (this.mainScratch.length * 4);
    }

    public int getNextDelay() {
        if (this.header.frameCount <= 0 || this.framePointer < 0) {
            return 0;
        }
        return getDelay(this.framePointer);
    }

    public int getTotalIterationCount() {
        if (this.header.loopCount == -1) {
            return 1;
        }
        if (this.header.loopCount == 0) {
            return 0;
        }
        return this.header.loopCount + 1;
    }

    private Bitmap getNextBitmap() {
        Bitmap.Config config;
        if (this.isFirstFrameTransparent == null || this.isFirstFrameTransparent.booleanValue()) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = this.bitmapConfig;
        }
        Bitmap obtain = this.bitmapProvider.obtain(this.downsampledWidth, this.downsampledHeight, config);
        obtain.setHasAlpha(true);
        return obtain;
    }

    public void clear() {
        this.header = null;
        if (this.mainPixels != null) {
            this.bitmapProvider.release(this.mainPixels);
        }
        if (this.mainScratch != null) {
            this.bitmapProvider.release(this.mainScratch);
        }
        if (this.previousImage != null) {
            this.bitmapProvider.release(this.previousImage);
        }
        this.previousImage = null;
        this.rawData = null;
        this.isFirstFrameTransparent = null;
        if (this.block != null) {
            this.bitmapProvider.release(this.block);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007b, code lost:
        return null;
     */
    @android.support.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap getNextFrame() {
        /*
            r6 = this;
            monitor-enter(r6)
            com.bumptech.glide.gifdecoder.GifHeader r0 = r6.header     // Catch:{ all -> 0x007c }
            int r0 = r0.frameCount     // Catch:{ all -> 0x007c }
            r1 = 1
            if (r0 <= 0) goto L_0x000c
            int r0 = r6.framePointer     // Catch:{ all -> 0x007c }
            if (r0 >= 0) goto L_0x000e
        L_0x000c:
            r6.status = r1     // Catch:{ all -> 0x007c }
        L_0x000e:
            int r0 = r6.status     // Catch:{ all -> 0x007c }
            r2 = 0
            if (r0 == r1) goto L_0x007a
            int r0 = r6.status     // Catch:{ all -> 0x007c }
            r3 = 2
            if (r0 != r3) goto L_0x0019
            goto L_0x007a
        L_0x0019:
            r0 = 0
            r6.status = r0     // Catch:{ all -> 0x007c }
            byte[] r3 = r6.block     // Catch:{ all -> 0x007c }
            if (r3 != 0) goto L_0x002a
            com.bumptech.glide.gifdecoder.GifDecoder$BitmapProvider r3 = r6.bitmapProvider     // Catch:{ all -> 0x007c }
            r4 = 255(0xff, float:3.57E-43)
            byte[] r3 = r3.obtainByteArray(r4)     // Catch:{ all -> 0x007c }
            r6.block = r3     // Catch:{ all -> 0x007c }
        L_0x002a:
            com.bumptech.glide.gifdecoder.GifHeader r3 = r6.header     // Catch:{ all -> 0x007c }
            java.util.List<com.bumptech.glide.gifdecoder.GifFrame> r3 = r3.frames     // Catch:{ all -> 0x007c }
            int r4 = r6.framePointer     // Catch:{ all -> 0x007c }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x007c }
            com.bumptech.glide.gifdecoder.GifFrame r3 = (com.bumptech.glide.gifdecoder.GifFrame) r3     // Catch:{ all -> 0x007c }
            int r4 = r6.framePointer     // Catch:{ all -> 0x007c }
            int r4 = r4 - r1
            if (r4 < 0) goto L_0x0046
            com.bumptech.glide.gifdecoder.GifHeader r5 = r6.header     // Catch:{ all -> 0x007c }
            java.util.List<com.bumptech.glide.gifdecoder.GifFrame> r5 = r5.frames     // Catch:{ all -> 0x007c }
            java.lang.Object r4 = r5.get(r4)     // Catch:{ all -> 0x007c }
            com.bumptech.glide.gifdecoder.GifFrame r4 = (com.bumptech.glide.gifdecoder.GifFrame) r4     // Catch:{ all -> 0x007c }
            goto L_0x0047
        L_0x0046:
            r4 = r2
        L_0x0047:
            int[] r5 = r3.lct     // Catch:{ all -> 0x007c }
            if (r5 == 0) goto L_0x004e
            int[] r5 = r3.lct     // Catch:{ all -> 0x007c }
            goto L_0x0052
        L_0x004e:
            com.bumptech.glide.gifdecoder.GifHeader r5 = r6.header     // Catch:{ all -> 0x007c }
            int[] r5 = r5.gct     // Catch:{ all -> 0x007c }
        L_0x0052:
            r6.act = r5     // Catch:{ all -> 0x007c }
            int[] r5 = r6.act     // Catch:{ all -> 0x007c }
            if (r5 != 0) goto L_0x005c
            r6.status = r1     // Catch:{ all -> 0x007c }
            monitor-exit(r6)
            return r2
        L_0x005c:
            boolean r1 = r3.transparency     // Catch:{ all -> 0x007c }
            if (r1 == 0) goto L_0x0074
            int[] r1 = r6.act     // Catch:{ all -> 0x007c }
            int[] r2 = r6.pct     // Catch:{ all -> 0x007c }
            int[] r5 = r6.act     // Catch:{ all -> 0x007c }
            int r5 = r5.length     // Catch:{ all -> 0x007c }
            java.lang.System.arraycopy(r1, r0, r2, r0, r5)     // Catch:{ all -> 0x007c }
            int[] r1 = r6.pct     // Catch:{ all -> 0x007c }
            r6.act = r1     // Catch:{ all -> 0x007c }
            int[] r1 = r6.act     // Catch:{ all -> 0x007c }
            int r2 = r3.transIndex     // Catch:{ all -> 0x007c }
            r1[r2] = r0     // Catch:{ all -> 0x007c }
        L_0x0074:
            android.graphics.Bitmap r0 = r6.setPixels(r3, r4)     // Catch:{ all -> 0x007c }
            monitor-exit(r6)
            return r0
        L_0x007a:
            monitor-exit(r6)
            return r2
        L_0x007c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.gifdecoder.StandardGifDecoder.getNextFrame():android.graphics.Bitmap");
    }

    public StandardGifDecoder(@NonNull GifDecoder.BitmapProvider bitmapProvider2) {
        this.pct = new int[256];
        this.bitmapConfig = Bitmap.Config.ARGB_8888;
        this.bitmapProvider = bitmapProvider2;
        this.header = new GifHeader();
    }

    public int getDelay(int i) {
        if (i < 0 || i >= this.header.frameCount) {
            return -1;
        }
        return this.header.frames.get(i).delay;
    }

    public synchronized int read(@Nullable byte[] bArr) {
        this.header = getHeaderParser().setData(bArr).parseHeader();
        if (bArr != null) {
            setData(this.header, bArr);
        }
        return this.status;
    }

    public void setDefaultBitmapConfig(@NonNull Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.bitmapConfig = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    private void copyIntoScratchFast(GifFrame gifFrame) {
        boolean z;
        boolean z2;
        GifFrame gifFrame2 = gifFrame;
        int[] iArr = this.mainScratch;
        int i = gifFrame2.ih;
        int i2 = gifFrame2.iy;
        int i3 = gifFrame2.iw;
        int i4 = gifFrame2.ix;
        if (this.framePointer == 0) {
            z = true;
        } else {
            z = false;
        }
        int i5 = this.downsampledWidth;
        byte[] bArr = this.mainPixels;
        int[] iArr2 = this.act;
        int i6 = 0;
        byte b2 = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            byte b3 = b2;
            int i11 = gifFrame2.iw * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b4 = bArr[i11];
                int i13 = i;
                byte b5 = b4 & 255;
                if (b5 != b3) {
                    int i14 = iArr2[b5];
                    if (i14 != 0) {
                        iArr[i12] = i14;
                    } else {
                        b3 = b4;
                    }
                }
                i11++;
                i12++;
                i = i13;
                GifFrame gifFrame3 = gifFrame;
            }
            int i15 = i;
            i6++;
            b2 = b3;
            gifFrame2 = gifFrame;
        }
        if (this.isFirstFrameTransparent != null || !z || b2 == -1) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.isFirstFrameTransparent = Boolean.valueOf(z2);
    }

    private void copyCopyIntoScratchRobust(GifFrame gifFrame) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        int i2;
        int i3;
        GifFrame gifFrame2 = gifFrame;
        int[] iArr = this.mainScratch;
        int i4 = gifFrame2.ih / this.sampleSize;
        int i5 = gifFrame2.iy / this.sampleSize;
        int i6 = gifFrame2.iw / this.sampleSize;
        int i7 = gifFrame2.ix / this.sampleSize;
        if (this.framePointer == 0) {
            z = true;
        } else {
            z = false;
        }
        int i8 = this.sampleSize;
        int i9 = this.downsampledWidth;
        int i10 = this.downsampledHeight;
        byte[] bArr = this.mainPixels;
        int[] iArr2 = this.act;
        Boolean bool = this.isFirstFrameTransparent;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        int i14 = 8;
        while (i12 < i4) {
            if (gifFrame2.interlace) {
                if (i11 >= i4) {
                    i13++;
                    switch (i13) {
                        case 2:
                            i11 = 4;
                            break;
                        case 3:
                            i11 = 2;
                            i14 = 4;
                            break;
                        case 4:
                            i11 = 1;
                            i14 = 2;
                            break;
                    }
                }
                i = i11 + i14;
            } else {
                i = i11;
                i11 = i12;
            }
            int i15 = i11 + i5;
            int i16 = i4;
            if (i8 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i15 < i10) {
                int i17 = i15 * i9;
                int i18 = i17 + i7;
                int i19 = i18 + i6;
                int i20 = i17 + i9;
                if (i20 < i19) {
                    i19 = i20;
                }
                i3 = i5;
                int i21 = i12 * i8 * gifFrame2.iw;
                if (z3) {
                    int i22 = i18;
                    while (i22 < i19) {
                        int i23 = i6;
                        int i24 = iArr2[bArr[i21] & 255];
                        if (i24 != 0) {
                            iArr[i22] = i24;
                        } else if (z && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i21 += i8;
                        i22++;
                        i6 = i23;
                    }
                } else {
                    i2 = i6;
                    int i25 = ((i19 - i18) * i8) + i21;
                    int i26 = i18;
                    while (i26 < i19) {
                        int i27 = i19;
                        int averageColorsNear = averageColorsNear(i21, i25, gifFrame2.iw);
                        if (averageColorsNear != 0) {
                            iArr[i26] = averageColorsNear;
                        } else if (z && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i21 += i8;
                        i26++;
                        i19 = i27;
                    }
                    i12++;
                    i11 = i;
                    i4 = i16;
                    i5 = i3;
                    i6 = i2;
                }
            } else {
                i3 = i5;
            }
            i2 = i6;
            i12++;
            i11 = i;
            i4 = i16;
            i5 = i3;
            i6 = i2;
        }
        if (this.isFirstFrameTransparent == null) {
            if (bool == null) {
                z2 = false;
            } else {
                z2 = bool.booleanValue();
            }
            this.isFirstFrameTransparent = Boolean.valueOf(z2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r4v15, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void decodeBitmapData(com.bumptech.glide.gifdecoder.GifFrame r33) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            if (r1 == 0) goto L_0x000d
            java.nio.ByteBuffer r2 = r0.rawData
            int r3 = r1.bufferFrameStart
            r2.position(r3)
        L_0x000d:
            if (r1 != 0) goto L_0x001a
            com.bumptech.glide.gifdecoder.GifHeader r1 = r0.header
            int r1 = r1.width
            com.bumptech.glide.gifdecoder.GifHeader r2 = r0.header
            int r2 = r2.height
            int r1 = r1 * r2
            goto L_0x0020
        L_0x001a:
            int r2 = r1.iw
            int r1 = r1.ih
            int r1 = r1 * r2
        L_0x0020:
            byte[] r2 = r0.mainPixels
            if (r2 == 0) goto L_0x0029
            byte[] r2 = r0.mainPixels
            int r2 = r2.length
            if (r2 >= r1) goto L_0x0031
        L_0x0029:
            com.bumptech.glide.gifdecoder.GifDecoder$BitmapProvider r2 = r0.bitmapProvider
            byte[] r2 = r2.obtainByteArray(r1)
            r0.mainPixels = r2
        L_0x0031:
            byte[] r2 = r0.mainPixels
            short[] r3 = r0.prefix
            r4 = 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L_0x003d
            short[] r3 = new short[r4]
            r0.prefix = r3
        L_0x003d:
            short[] r3 = r0.prefix
            byte[] r5 = r0.suffix
            if (r5 != 0) goto L_0x0047
            byte[] r5 = new byte[r4]
            r0.suffix = r5
        L_0x0047:
            byte[] r5 = r0.suffix
            byte[] r6 = r0.pixelStack
            if (r6 != 0) goto L_0x0053
            r6 = 4097(0x1001, float:5.741E-42)
            byte[] r6 = new byte[r6]
            r0.pixelStack = r6
        L_0x0053:
            byte[] r6 = r0.pixelStack
            int r7 = r32.readByte()
            r8 = 1
            int r9 = r8 << r7
            int r10 = r9 + 1
            int r11 = r9 + 2
            int r7 = r7 + r8
            int r12 = r8 << r7
            int r12 = r12 - r8
            r13 = 0
            r14 = 0
        L_0x0066:
            if (r14 >= r9) goto L_0x0070
            r3[r14] = r13
            byte r15 = (byte) r14
            r5[r14] = r15
            int r14 = r14 + 1
            goto L_0x0066
        L_0x0070:
            byte[] r14 = r0.block
            r15 = -1
            r26 = r7
            r24 = r11
            r25 = r12
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = -1
            r22 = 0
            r23 = 0
        L_0x0089:
            if (r13 >= r1) goto L_0x0165
            if (r16 != 0) goto L_0x009a
            int r16 = r32.readBlock()
            if (r16 > 0) goto L_0x0098
            r3 = 3
            r0.status = r3
            goto L_0x0165
        L_0x0098:
            r20 = 0
        L_0x009a:
            byte r4 = r14[r20]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r18
            int r19 = r19 + r4
            int r18 = r18 + 8
            int r20 = r20 + 1
            int r16 = r16 + -1
            r4 = r18
            r8 = r21
            r28 = r22
            r27 = r24
            r18 = r17
            r17 = r13
            r13 = r26
        L_0x00b6:
            if (r4 < r13) goto L_0x014c
            r15 = r19 & r25
            int r19 = r19 >> r13
            int r4 = r4 - r13
            if (r15 != r9) goto L_0x00c7
            r13 = r7
            r27 = r11
            r25 = r12
            r8 = -1
        L_0x00c5:
            r15 = -1
            goto L_0x00b6
        L_0x00c7:
            if (r15 == r10) goto L_0x0132
            r0 = -1
            if (r8 != r0) goto L_0x00da
            byte r8 = r5[r15]
            r2[r18] = r8
            int r18 = r18 + 1
            int r17 = r17 + 1
            r8 = r15
            r28 = r8
        L_0x00d7:
            r0 = r32
            goto L_0x00c5
        L_0x00da:
            r0 = r27
            if (r15 < r0) goto L_0x00e9
            r29 = r4
            r4 = r28
            byte r4 = (byte) r4
            r6[r23] = r4
            int r23 = r23 + 1
            r4 = r8
            goto L_0x00ec
        L_0x00e9:
            r29 = r4
            r4 = r15
        L_0x00ec:
            if (r4 < r9) goto L_0x00f7
            byte r21 = r5[r4]
            r6[r23] = r21
            int r23 = r23 + 1
            short r4 = r3[r4]
            goto L_0x00ec
        L_0x00f7:
            byte r4 = r5[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r30 = r7
            byte r7 = (byte) r4
            r2[r18] = r7
            int r18 = r18 + 1
            int r17 = r17 + 1
        L_0x0104:
            if (r23 <= 0) goto L_0x0111
            int r23 = r23 + -1
            byte r21 = r6[r23]
            r2[r18] = r21
            int r18 = r18 + 1
            int r17 = r17 + 1
            goto L_0x0104
        L_0x0111:
            r31 = r4
            r4 = 4096(0x1000, float:5.74E-42)
            if (r0 >= r4) goto L_0x0128
            short r8 = (short) r8
            r3[r0] = r8
            r5[r0] = r7
            int r0 = r0 + 1
            r7 = r0 & r25
            if (r7 != 0) goto L_0x0128
            if (r0 >= r4) goto L_0x0128
            int r13 = r13 + 1
            int r25 = r25 + r0
        L_0x0128:
            r27 = r0
            r8 = r15
            r4 = r29
            r7 = r30
            r28 = r31
            goto L_0x00d7
        L_0x0132:
            r29 = r4
            r0 = r27
            r24 = r0
            r21 = r8
            r26 = r13
            r13 = r17
            r17 = r18
            r22 = r28
            r18 = r29
            r0 = r32
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r15 = -1
            goto L_0x0089
        L_0x014c:
            r29 = r4
            r0 = r27
            r24 = r0
            r21 = r8
            r26 = r13
            r13 = r17
            r17 = r18
            r22 = r28
            r18 = r29
            r0 = r32
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            goto L_0x0089
        L_0x0165:
            r13 = r17
            r0 = 0
            java.util.Arrays.fill(r2, r13, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.gifdecoder.StandardGifDecoder.decodeBitmapData(com.bumptech.glide.gifdecoder.GifFrame):void");
    }

    public synchronized void setData(@NonNull GifHeader gifHeader, @NonNull ByteBuffer byteBuffer) {
        setData(gifHeader, byteBuffer, 1);
    }

    public synchronized void setData(@NonNull GifHeader gifHeader, @NonNull byte[] bArr) {
        setData(gifHeader, ByteBuffer.wrap(bArr));
    }

    public int read(@Nullable InputStream inputStream, int i) {
        int i2;
        if (inputStream != null) {
            if (i > 0) {
                i2 = i + 4096;
            } else {
                i2 = 16384;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = inputStream.read(bArr, 0, 16384);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                read(byteArrayOutputStream.toByteArray());
            } catch (IOException unused) {
            }
        } else {
            this.status = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
        }
        return this.status;
    }

    private Bitmap setPixels(GifFrame gifFrame, GifFrame gifFrame2) {
        int[] iArr = this.mainScratch;
        int i = 0;
        if (gifFrame2 == null) {
            if (this.previousImage != null) {
                this.bitmapProvider.release(this.previousImage);
            }
            this.previousImage = null;
            Arrays.fill(iArr, 0);
        }
        if (gifFrame2 != null && gifFrame2.dispose == 3 && this.previousImage == null) {
            Arrays.fill(iArr, 0);
        }
        if (gifFrame2 != null && gifFrame2.dispose > 0) {
            if (gifFrame2.dispose == 2) {
                if (!gifFrame.transparency) {
                    int i2 = this.header.bgColor;
                    if (gifFrame.lct == null || this.header.bgIndex != gifFrame.transIndex) {
                        i = i2;
                    }
                } else if (this.framePointer == 0) {
                    this.isFirstFrameTransparent = Boolean.TRUE;
                }
                int i3 = gifFrame2.ih / this.sampleSize;
                int i4 = gifFrame2.iy / this.sampleSize;
                int i5 = gifFrame2.iw / this.sampleSize;
                int i6 = (i4 * this.downsampledWidth) + (gifFrame2.ix / this.sampleSize);
                int i7 = (i3 * this.downsampledWidth) + i6;
                while (i6 < i7) {
                    int i8 = i6 + i5;
                    for (int i9 = i6; i9 < i8; i9++) {
                        iArr[i9] = i;
                    }
                    i6 += this.downsampledWidth;
                }
            } else if (gifFrame2.dispose == 3 && this.previousImage != null) {
                this.previousImage.getPixels(iArr, 0, this.downsampledWidth, 0, 0, this.downsampledWidth, this.downsampledHeight);
            }
        }
        decodeBitmapData(gifFrame);
        if (gifFrame.interlace || this.sampleSize != 1) {
            copyCopyIntoScratchRobust(gifFrame);
        } else {
            copyIntoScratchFast(gifFrame);
        }
        if (this.savePrevious && (gifFrame.dispose == 0 || gifFrame.dispose == 1)) {
            if (this.previousImage == null) {
                this.previousImage = getNextBitmap();
            }
            this.previousImage.setPixels(iArr, 0, this.downsampledWidth, 0, 0, this.downsampledWidth, this.downsampledHeight);
        }
        Bitmap nextBitmap = getNextBitmap();
        nextBitmap.setPixels(iArr, 0, this.downsampledWidth, 0, 0, this.downsampledWidth, this.downsampledHeight);
        return nextBitmap;
    }

    public StandardGifDecoder(@NonNull GifDecoder.BitmapProvider bitmapProvider2, GifHeader gifHeader, ByteBuffer byteBuffer) {
        this(bitmapProvider2, gifHeader, byteBuffer, 1);
    }

    @ColorInt
    private int averageColorsNear(int i, int i2, int i3) {
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i4 < this.sampleSize + i && i4 < this.mainPixels.length && i4 < i2) {
            int i10 = this.act[this.mainPixels[i4] & 255];
            if (i10 != 0) {
                i5 += (i10 >> 24) & 255;
                i6 += (i10 >> 16) & 255;
                i7 += (i10 >> 8) & 255;
                i8 += i10 & 255;
                i9++;
            }
            i4++;
        }
        int i11 = i + i3;
        int i12 = i11;
        while (i12 < this.sampleSize + i11 && i12 < this.mainPixels.length && i12 < i2) {
            int i13 = this.act[this.mainPixels[i12] & 255];
            if (i13 != 0) {
                i5 += (i13 >> 24) & 255;
                i6 += (i13 >> 16) & 255;
                i7 += (i13 >> 8) & 255;
                i8 += i13 & 255;
                i9++;
            }
            i12++;
        }
        if (i9 == 0) {
            return 0;
        }
        return ((i5 / i9) << 24) | ((i6 / i9) << 16) | ((i7 / i9) << 8) | (i8 / i9);
    }

    public synchronized void setData(@NonNull GifHeader gifHeader, @NonNull ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.status = 0;
            this.header = gifHeader;
            this.framePointer = -1;
            this.rawData = byteBuffer.asReadOnlyBuffer();
            this.rawData.position(0);
            this.rawData.order(ByteOrder.LITTLE_ENDIAN);
            this.savePrevious = false;
            Iterator<GifFrame> it2 = gifHeader.frames.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().dispose == 3) {
                        this.savePrevious = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.sampleSize = highestOneBit;
            this.downsampledWidth = gifHeader.width / highestOneBit;
            this.downsampledHeight = gifHeader.height / highestOneBit;
            this.mainPixels = this.bitmapProvider.obtainByteArray(gifHeader.width * gifHeader.height);
            this.mainScratch = this.bitmapProvider.obtainIntArray(this.downsampledWidth * this.downsampledHeight);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
        }
    }

    public StandardGifDecoder(@NonNull GifDecoder.BitmapProvider bitmapProvider2, GifHeader gifHeader, ByteBuffer byteBuffer, int i) {
        this(bitmapProvider2);
        setData(gifHeader, byteBuffer, i);
    }
}
