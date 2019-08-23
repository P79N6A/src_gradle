package com.bumptech.glide.load.resource.bitmap;

import android.support.annotation.NonNull;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public final class DefaultImageHeaderParser implements ImageHeaderParser {
    private static final int[] BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
    static final byte[] JPEG_EXIF_SEGMENT_PREAMBLE_BYTES = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    static final class ByteBufferReader implements Reader {
        private final ByteBuffer byteBuffer;

        public final short getUInt8() {
            return (short) (getByte() & 255);
        }

        public final int getByte() {
            if (this.byteBuffer.remaining() <= 0) {
                return -1;
            }
            return this.byteBuffer.get();
        }

        public final int getUInt16() {
            return ((getByte() << 8) & 65280) | (getByte() & 255);
        }

        ByteBufferReader(ByteBuffer byteBuffer2) {
            this.byteBuffer = byteBuffer2;
            byteBuffer2.order(ByteOrder.BIG_ENDIAN);
        }

        public final long skip(long j) {
            int min = (int) Math.min((long) this.byteBuffer.remaining(), j);
            this.byteBuffer.position(this.byteBuffer.position() + min);
            return (long) min;
        }

        public final int read(byte[] bArr, int i) {
            int min = Math.min(i, this.byteBuffer.remaining());
            if (min == 0) {
                return -1;
            }
            this.byteBuffer.get(bArr, 0, min);
            return min;
        }
    }

    static final class RandomAccessReader {
        private final ByteBuffer data;

        /* access modifiers changed from: package-private */
        public final int length() {
            return this.data.remaining();
        }

        /* access modifiers changed from: package-private */
        public final void order(ByteOrder byteOrder) {
            this.data.order(byteOrder);
        }

        /* access modifiers changed from: package-private */
        public final short getInt16(int i) {
            if (isAvailable(i, 2)) {
                return this.data.getShort(i);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public final int getInt32(int i) {
            if (isAvailable(i, 4)) {
                return this.data.getInt(i);
            }
            return -1;
        }

        private boolean isAvailable(int i, int i2) {
            if (this.data.remaining() - i >= i2) {
                return true;
            }
            return false;
        }

        RandomAccessReader(byte[] bArr, int i) {
            this.data = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }
    }

    interface Reader {
        int getByte() throws IOException;

        int getUInt16() throws IOException;

        short getUInt8() throws IOException;

        int read(byte[] bArr, int i) throws IOException;

        long skip(long j) throws IOException;
    }

    static final class StreamReader implements Reader {
        private final InputStream is;

        public final int getByte() throws IOException {
            return this.is.read();
        }

        public final short getUInt8() throws IOException {
            return (short) (this.is.read() & 255);
        }

        public final int getUInt16() throws IOException {
            return ((this.is.read() << 8) & 65280) | (this.is.read() & 255);
        }

        StreamReader(InputStream inputStream) {
            this.is = inputStream;
        }

        public final long skip(long j) throws IOException {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.is.skip(j2);
                if (skip <= 0) {
                    if (this.is.read() == -1) {
                        break;
                    }
                    j2--;
                } else {
                    j2 -= skip;
                }
            }
            return j - j2;
        }

        public final int read(byte[] bArr, int i) throws IOException {
            int i2 = i;
            while (i2 > 0) {
                int read = this.is.read(bArr, i - i2, i2);
                if (read == -1) {
                    break;
                }
                i2 -= read;
            }
            return i - i2;
        }
    }

    private static int calcTagOffset(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    private static boolean handles(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    @NonNull
    public final ImageHeaderParser.ImageType getType(@NonNull InputStream inputStream) throws IOException {
        return getType((Reader) new StreamReader((InputStream) Preconditions.checkNotNull(inputStream)));
    }

    @NonNull
    public final ImageHeaderParser.ImageType getType(@NonNull ByteBuffer byteBuffer) throws IOException {
        return getType((Reader) new ByteBufferReader((ByteBuffer) Preconditions.checkNotNull(byteBuffer)));
    }

    private int moveToExifSegmentAndGetLength(Reader reader) throws IOException {
        while (reader.getUInt8() == 255) {
            short uInt8 = reader.getUInt8();
            if (uInt8 == 218 || uInt8 == 217) {
                return -1;
            }
            int uInt16 = reader.getUInt16() - 2;
            if (uInt8 == 225) {
                return uInt16;
            }
            long j = (long) uInt16;
            if (reader.skip(j) != j) {
                return -1;
            }
        }
        return -1;
    }

    @NonNull
    private ImageHeaderParser.ImageType getType(Reader reader) throws IOException {
        int uInt16 = reader.getUInt16();
        if (uInt16 == 65496) {
            return ImageHeaderParser.ImageType.JPEG;
        }
        int uInt162 = ((uInt16 << 16) & -65536) | (reader.getUInt16() & 65535);
        if (uInt162 == -1991225785) {
            reader.skip(21);
            if (reader.getByte() >= 3) {
                return ImageHeaderParser.ImageType.PNG_A;
            }
            return ImageHeaderParser.ImageType.PNG;
        } else if ((uInt162 >> 8) == 4671814) {
            return ImageHeaderParser.ImageType.GIF;
        } else {
            if (uInt162 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            reader.skip(4);
            if ((((reader.getUInt16() << 16) & -65536) | (reader.getUInt16() & 65535)) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int uInt163 = ((reader.getUInt16() << 16) & -65536) | (reader.getUInt16() & 65535);
            if ((uInt163 & -256) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i = uInt163 & 255;
            if (i == 88) {
                reader.skip(4);
                if ((reader.getByte() & 16) != 0) {
                    return ImageHeaderParser.ImageType.WEBP_A;
                }
                return ImageHeaderParser.ImageType.WEBP;
            } else if (i != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            } else {
                reader.skip(4);
                if ((reader.getByte() & 8) != 0) {
                    return ImageHeaderParser.ImageType.WEBP_A;
                }
                return ImageHeaderParser.ImageType.WEBP;
            }
        }
    }

    private static int parseExifSegment(RandomAccessReader randomAccessReader) {
        ByteOrder byteOrder;
        short int16 = randomAccessReader.getInt16(6);
        if (int16 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (int16 != 19789) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        randomAccessReader.order(byteOrder);
        int int32 = randomAccessReader.getInt32(10) + 6;
        short int162 = randomAccessReader.getInt16(int32);
        for (int i = 0; i < int162; i++) {
            int calcTagOffset = calcTagOffset(int32, i);
            if (randomAccessReader.getInt16(calcTagOffset) == 274) {
                short int163 = randomAccessReader.getInt16(calcTagOffset + 2);
                if (int163 <= 0 || int163 > 12) {
                    boolean isLoggable = Log.isLoggable("DfltImageHeaderParser", 3);
                } else {
                    int int322 = randomAccessReader.getInt32(calcTagOffset + 4);
                    if (int322 < 0) {
                        boolean isLoggable2 = Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        int i2 = int322 + BYTES_PER_FORMAT[int163];
                        if (i2 > 4) {
                            boolean isLoggable3 = Log.isLoggable("DfltImageHeaderParser", 3);
                        } else {
                            int i3 = calcTagOffset + 8;
                            if (i3 < 0 || i3 > randomAccessReader.length()) {
                                boolean isLoggable4 = Log.isLoggable("DfltImageHeaderParser", 3);
                            } else if (i2 >= 0 && i2 + i3 <= randomAccessReader.length()) {
                                return randomAccessReader.getInt16(i3);
                            } else {
                                boolean isLoggable5 = Log.isLoggable("DfltImageHeaderParser", 3);
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    public final int getOrientation(@NonNull InputStream inputStream, @NonNull ArrayPool arrayPool) throws IOException {
        return getOrientation((Reader) new StreamReader((InputStream) Preconditions.checkNotNull(inputStream)), (ArrayPool) Preconditions.checkNotNull(arrayPool));
    }

    private int getOrientation(Reader reader, ArrayPool arrayPool) throws IOException {
        if (!handles(reader.getUInt16())) {
            return -1;
        }
        int moveToExifSegmentAndGetLength = moveToExifSegmentAndGetLength(reader);
        if (moveToExifSegmentAndGetLength == -1) {
            return -1;
        }
        byte[] bArr = (byte[]) arrayPool.get(moveToExifSegmentAndGetLength, byte[].class);
        try {
            return parseExifSegment(reader, bArr, moveToExifSegmentAndGetLength);
        } finally {
            arrayPool.put(bArr);
        }
    }

    private boolean hasJpegExifPreamble(byte[] bArr, int i) {
        boolean z;
        if (bArr == null || i <= JPEG_EXIF_SEGMENT_PREAMBLE_BYTES.length) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return z;
        }
        for (int i2 = 0; i2 < JPEG_EXIF_SEGMENT_PREAMBLE_BYTES.length; i2++) {
            if (bArr[i2] != JPEG_EXIF_SEGMENT_PREAMBLE_BYTES[i2]) {
                return false;
            }
        }
        return z;
    }

    public final int getOrientation(@NonNull ByteBuffer byteBuffer, @NonNull ArrayPool arrayPool) throws IOException {
        return getOrientation((Reader) new ByteBufferReader((ByteBuffer) Preconditions.checkNotNull(byteBuffer)), (ArrayPool) Preconditions.checkNotNull(arrayPool));
    }

    private int parseExifSegment(Reader reader, byte[] bArr, int i) throws IOException {
        if (reader.read(bArr, i) == i && hasJpegExifPreamble(bArr, i)) {
            return parseExifSegment(new RandomAccessReader(bArr, i));
        }
        return -1;
    }
}
