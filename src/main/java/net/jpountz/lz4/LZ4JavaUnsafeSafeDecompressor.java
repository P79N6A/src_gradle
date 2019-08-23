package net.jpountz.lz4;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.UnsafeUtils;

public final class LZ4JavaUnsafeSafeDecompressor extends LZ4SafeDecompressor {
    public static final LZ4SafeDecompressor INSTANCE = new LZ4JavaUnsafeSafeDecompressor();

    LZ4JavaUnsafeSafeDecompressor() {
    }

    public final int decompress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        byte b2;
        byte[] bArr3 = bArr;
        int i8 = i2;
        byte[] bArr4 = bArr2;
        int i9 = i3;
        UnsafeUtils.checkRange(bArr, i, i2);
        UnsafeUtils.checkRange(bArr2, i3, i4);
        if (i4 != 0) {
            int i10 = i + i8;
            int i11 = i9 + i4;
            int i12 = i;
            int i13 = i9;
            while (true) {
                byte readByte = UnsafeUtils.readByte(bArr3, i12) & 255;
                i5 = i12 + 1;
                i6 = readByte >>> 4;
                if (i6 == 15) {
                    byte b3 = -1;
                    while (true) {
                        if (i5 >= i10) {
                            break;
                        }
                        int i14 = i5 + 1;
                        byte readByte2 = UnsafeUtils.readByte(bArr3, i5);
                        if (readByte2 != -1) {
                            int i15 = i14;
                            b3 = readByte2;
                            i5 = i15;
                            break;
                        }
                        i6 += 255;
                        int i16 = i14;
                        b3 = readByte2;
                        i5 = i16;
                    }
                    i6 += b3 & 255;
                }
                i7 = i13 + i6;
                int i17 = i11 - 8;
                if (i7 > i17) {
                    break;
                }
                int i18 = i5 + i6;
                if (i18 > i10 - 8) {
                    break;
                }
                LZ4UnsafeUtils.wildArraycopy(bArr3, i5, bArr4, i13, i6);
                int readShortLE = UnsafeUtils.readShortLE(bArr3, i18);
                int i19 = i18 + 2;
                int i20 = i7 - readShortLE;
                if (i20 >= i9) {
                    int i21 = readByte & 15;
                    if (i21 == 15) {
                        byte b4 = -1;
                        while (true) {
                            if (i19 >= i10) {
                                b2 = b4;
                                break;
                            }
                            int i22 = i19 + 1;
                            b2 = UnsafeUtils.readByte(bArr3, i19);
                            if (b2 != -1) {
                                i19 = i22;
                                break;
                            }
                            i21 += 255;
                            i19 = i22;
                            b4 = b2;
                        }
                        i21 += b2 & 255;
                    }
                    int i23 = i21 + 4;
                    int i24 = i7 + i23;
                    if (i24 <= i17) {
                        LZ4UnsafeUtils.wildIncrementalCopy(bArr4, i20, i7, i24);
                    } else if (i24 <= i11) {
                        LZ4UnsafeUtils.safeIncrementalCopy(bArr4, i20, i7, i23);
                    } else {
                        throw new LZ4Exception("Malformed input at " + i19);
                    }
                    i13 = i24;
                    i12 = i19;
                } else {
                    throw new LZ4Exception("Malformed input at " + i19);
                }
            }
            if (i7 > i11) {
                throw new LZ4Exception();
            } else if (i5 + i6 == i10) {
                LZ4UnsafeUtils.safeArraycopy(bArr3, i5, bArr4, i13, i6);
                return i7 - i9;
            } else {
                throw new LZ4Exception("Malformed input at " + i5);
            }
        } else if (i8 == 1 && UnsafeUtils.readByte(bArr, i) == 0) {
            return 0;
        } else {
            throw new LZ4Exception("Output buffer too small");
        }
    }

    public final int decompress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        byte b2;
        int i8 = i;
        int i9 = i2;
        int i10 = i3;
        int i11 = i4;
        if (!byteBuffer.hasArray() || !byteBuffer2.hasArray()) {
            ByteBuffer inNativeByteOrder = ByteBufferUtils.inNativeByteOrder(byteBuffer);
            ByteBuffer inNativeByteOrder2 = ByteBufferUtils.inNativeByteOrder(byteBuffer2);
            ByteBufferUtils.checkRange(inNativeByteOrder, i8, i9);
            ByteBufferUtils.checkRange(inNativeByteOrder2, i10, i11);
            if (i11 != 0) {
                int i12 = i9 + i8;
                int i13 = i11 + i10;
                int i14 = i10;
                while (true) {
                    byte readByte = ByteBufferUtils.readByte(inNativeByteOrder, i8) & 255;
                    i5 = i8 + 1;
                    i6 = readByte >>> 4;
                    if (i6 == 15) {
                        byte b3 = -1;
                        while (true) {
                            if (i5 >= i12) {
                                break;
                            }
                            int i15 = i5 + 1;
                            byte readByte2 = ByteBufferUtils.readByte(inNativeByteOrder, i5);
                            if (readByte2 != -1) {
                                int i16 = i15;
                                b3 = readByte2;
                                i5 = i16;
                                break;
                            }
                            i6 += 255;
                            int i17 = i15;
                            b3 = readByte2;
                            i5 = i17;
                        }
                        i6 += b3 & 255;
                    }
                    i7 = i14 + i6;
                    int i18 = i13 - 8;
                    if (i7 > i18) {
                        break;
                    }
                    int i19 = i5 + i6;
                    if (i19 > i12 - 8) {
                        break;
                    }
                    LZ4ByteBufferUtils.wildArraycopy(inNativeByteOrder, i5, inNativeByteOrder2, i14, i6);
                    int readShortLE = ByteBufferUtils.readShortLE(inNativeByteOrder, i19);
                    int i20 = i19 + 2;
                    int i21 = i7 - readShortLE;
                    if (i21 >= i10) {
                        int i22 = readByte & 15;
                        if (i22 == 15) {
                            byte b4 = -1;
                            while (true) {
                                if (i20 >= i12) {
                                    b2 = b4;
                                    break;
                                }
                                int i23 = i20 + 1;
                                b2 = ByteBufferUtils.readByte(inNativeByteOrder, i20);
                                if (b2 != -1) {
                                    i20 = i23;
                                    break;
                                }
                                i22 += 255;
                                i20 = i23;
                                b4 = b2;
                            }
                            i22 += b2 & 255;
                        }
                        int i24 = i22 + 4;
                        int i25 = i7 + i24;
                        if (i25 <= i18) {
                            LZ4ByteBufferUtils.wildIncrementalCopy(inNativeByteOrder2, i21, i7, i25);
                        } else if (i25 <= i13) {
                            LZ4ByteBufferUtils.safeIncrementalCopy(inNativeByteOrder2, i21, i7, i24);
                        } else {
                            throw new LZ4Exception("Malformed input at " + i20);
                        }
                        i14 = i25;
                        i8 = i20;
                    } else {
                        throw new LZ4Exception("Malformed input at " + i20);
                    }
                }
                if (i7 > i13) {
                    throw new LZ4Exception();
                } else if (i5 + i6 == i12) {
                    LZ4ByteBufferUtils.safeArraycopy(inNativeByteOrder, i5, inNativeByteOrder2, i14, i6);
                    return i7 - i10;
                } else {
                    throw new LZ4Exception("Malformed input at " + i5);
                }
            } else if (i9 == 1 && ByteBufferUtils.readByte(inNativeByteOrder, i8) == 0) {
                return 0;
            } else {
                throw new LZ4Exception("Output buffer too small");
            }
        } else {
            return decompress(byteBuffer.array(), byteBuffer.arrayOffset() + i8, i2, byteBuffer2.array(), i10 + byteBuffer2.arrayOffset(), i4);
        }
    }
}
