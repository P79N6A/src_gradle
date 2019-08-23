package com.google.protobuf;

import com.google.protobuf.MessageLite;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class CodedInputStream {
    private static volatile boolean proto3DiscardUnknownFieldsDefault;
    private boolean explicitDiscardUnknownFields;
    int recursionDepth;
    int recursionLimit;
    int sizeLimit;

    static final class ArrayDecoder extends CodedInputStream {
        private final byte[] buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private int limit;
        private int pos;
        private int startPos;

        public final int getLastTag() {
            return this.lastTag;
        }

        public final int getTotalBytesRead() {
            return this.pos - this.startPos;
        }

        public final int readEnum() throws IOException {
            return readRawVarint32();
        }

        public final int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        public final long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        public final int readInt32() throws IOException {
            return readRawVarint32();
        }

        public final long readInt64() throws IOException {
            return readRawVarint64();
        }

        public final int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        public final long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        public final int readUInt32() throws IOException {
            return readRawVarint32();
        }

        public final long readUInt64() throws IOException {
            return readRawVarint64();
        }

        public final void resetSizeCounter() {
            this.startPos = this.pos;
        }

        public final boolean isAtEnd() throws IOException {
            if (this.pos == this.limit) {
                return true;
            }
            return false;
        }

        public final boolean readBool() throws IOException {
            if (readRawVarint64() != 0) {
                return true;
            }
            return false;
        }

        public final byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        public final int readSInt32() throws IOException {
            return decodeZigZag32(readRawVarint32());
        }

        public final long readSInt64() throws IOException {
            return decodeZigZag64(readRawVarint64());
        }

        public final void skipMessage() throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag));
        }

        private void skipRawVarint() throws IOException {
            if (this.limit - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws IOException {
            int i = 0;
            while (i < 10) {
                byte[] bArr = this.buffer;
                int i2 = this.pos;
                this.pos = i2 + 1;
                if (bArr[i2] < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws IOException {
            int i = 0;
            while (i < 10) {
                if (readRawByte() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public final int getBytesUntilLimit() {
            if (this.currentLimit == Integer.MAX_VALUE) {
                return -1;
            }
            return this.currentLimit - getTotalBytesRead();
        }

        public final byte readRawByte() throws IOException {
            if (this.pos != this.limit) {
                byte[] bArr = this.buffer;
                int i = this.pos;
                this.pos = i + 1;
                return bArr[i];
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* access modifiers changed from: package-private */
        public final long readRawVarint64SlowPath() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte readRawByte = readRawByte();
                j |= ((long) (readRawByte & Byte.MAX_VALUE)) << i;
                if ((readRawByte & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public final int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            this.lastTag = readRawVarint32();
            if (WireFormat.getTagFieldNumber(this.lastTag) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        private void recomputeBufferSizeAfterLimit() {
            this.limit += this.bufferSizeAfterLimit;
            int i = this.limit - this.startPos;
            if (i > this.currentLimit) {
                this.bufferSizeAfterLimit = i - this.currentLimit;
                this.limit -= this.bufferSizeAfterLimit;
                return;
            }
            this.bufferSizeAfterLimit = 0;
        }

        public final ByteString readBytes() throws IOException {
            ByteString byteString;
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0 && readRawVarint32 <= this.limit - this.pos) {
                if (!this.immutable || !this.enableAliasing) {
                    byteString = ByteString.copyFrom(this.buffer, this.pos, readRawVarint32);
                } else {
                    byteString = ByteString.wrap(this.buffer, this.pos, readRawVarint32);
                }
                this.pos += readRawVarint32;
                return byteString;
            } else if (readRawVarint32 == 0) {
                return ByteString.EMPTY;
            } else {
                return ByteString.wrap(readRawBytes(readRawVarint32));
            }
        }

        public final int readRawLittleEndian32() throws IOException {
            int i = this.pos;
            if (this.limit - i >= 4) {
                byte[] bArr = this.buffer;
                this.pos = i + 4;
                return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        public final String readString() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0 && readRawVarint32 <= this.limit - this.pos) {
                String str = new String(this.buffer, this.pos, readRawVarint32, Internal.UTF_8);
                this.pos += readRawVarint32;
                return str;
            } else if (readRawVarint32 == 0) {
                return "";
            } else {
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        public final ByteBuffer readByteBuffer() throws IOException {
            ByteBuffer byteBuffer;
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0 && readRawVarint32 <= this.limit - this.pos) {
                if (this.immutable || !this.enableAliasing) {
                    byteBuffer = ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, this.pos, this.pos + readRawVarint32));
                } else {
                    byteBuffer = ByteBuffer.wrap(this.buffer, this.pos, readRawVarint32).slice();
                }
                this.pos += readRawVarint32;
                return byteBuffer;
            } else if (readRawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            } else {
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        public final long readRawLittleEndian64() throws IOException {
            int i = this.pos;
            if (this.limit - i >= 8) {
                byte[] bArr = this.buffer;
                this.pos = i + 8;
                return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r1[r2] >= 0) goto L_0x006a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int readRawVarint32() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.pos
                int r1 = r5.limit
                if (r1 == r0) goto L_0x006d
                byte[] r1 = r5.buffer
                int r2 = r0 + 1
                byte r0 = r1[r0]
                if (r0 < 0) goto L_0x0011
                r5.pos = r2
                return r0
            L_0x0011:
                int r3 = r5.limit
                int r3 = r3 - r2
                r4 = 9
                if (r3 < r4) goto L_0x006d
                int r3 = r2 + 1
                byte r2 = r1[r2]
                int r2 = r2 << 7
                r0 = r0 ^ r2
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x006a
            L_0x0024:
                int r2 = r3 + 1
                byte r3 = r1[r3]
                int r3 = r3 << 14
                r0 = r0 ^ r3
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r3 = r2
                goto L_0x006a
            L_0x0031:
                int r3 = r2 + 1
                byte r2 = r1[r2]
                int r2 = r2 << 21
                r0 = r0 ^ r2
                if (r0 >= 0) goto L_0x003f
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x006a
            L_0x003f:
                int r2 = r3 + 1
                byte r3 = r1[r3]
                int r4 = r3 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r3 >= 0) goto L_0x002f
                int r3 = r2 + 1
                byte r2 = r1[r2]
                if (r2 >= 0) goto L_0x006a
                int r2 = r3 + 1
                byte r3 = r1[r3]
                if (r3 >= 0) goto L_0x002f
                int r3 = r2 + 1
                byte r2 = r1[r2]
                if (r2 >= 0) goto L_0x006a
                int r2 = r3 + 1
                byte r3 = r1[r3]
                if (r3 >= 0) goto L_0x002f
                int r3 = r2 + 1
                byte r1 = r1[r2]
                if (r1 < 0) goto L_0x006d
            L_0x006a:
                r5.pos = r3
                return r0
            L_0x006d:
                long r0 = r5.readRawVarint64SlowPath()
                int r0 = (int) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.ArrayDecoder.readRawVarint32():int");
        }

        public final String readStringRequireUtf8() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 <= 0 || readRawVarint32 > this.limit - this.pos) {
                if (readRawVarint32 == 0) {
                    return "";
                }
                if (readRawVarint32 <= 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (Utf8.isValidUtf8(this.buffer, this.pos, this.pos + readRawVarint32)) {
                int i = this.pos;
                this.pos += readRawVarint32;
                return new String(this.buffer, i, readRawVarint32, Internal.UTF_8);
            } else {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
            if (((long) r1[r0]) >= 0) goto L_0x0071;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long readRawVarint64() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.pos
                int r1 = r11.limit
                if (r1 == r0) goto L_0x00bb
                byte[] r1 = r11.buffer
                int r2 = r0 + 1
                byte r0 = r1[r0]
                if (r0 < 0) goto L_0x0012
                r11.pos = r2
                long r0 = (long) r0
                return r0
            L_0x0012:
                int r3 = r11.limit
                int r3 = r3 - r2
                r4 = 9
                if (r3 < r4) goto L_0x00bb
                int r3 = r2 + 1
                byte r2 = r1[r2]
                int r2 = r2 << 7
                r0 = r0 ^ r2
                if (r0 >= 0) goto L_0x002a
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                long r0 = (long) r0
            L_0x0025:
                r9 = r0
                r0 = r3
            L_0x0027:
                r2 = r9
                goto L_0x00b8
            L_0x002a:
                int r2 = r3 + 1
                byte r3 = r1[r3]
                int r3 = r3 << 14
                r0 = r0 ^ r3
                if (r0 < 0) goto L_0x0039
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r0 = r2
                goto L_0x0027
            L_0x0039:
                int r3 = r2 + 1
                byte r2 = r1[r2]
                int r2 = r2 << 21
                r0 = r0 ^ r2
                if (r0 >= 0) goto L_0x0048
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                long r0 = (long) r0
                goto L_0x0025
            L_0x0048:
                long r4 = (long) r0
                int r0 = r3 + 1
                byte r2 = r1[r3]
                long r2 = (long) r2
                r6 = 28
                long r2 = r2 << r6
                long r2 = r2 ^ r4
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L_0x005d
                r4 = 266354560(0xfe03f80, double:1.315966377E-315)
                long r2 = r2 ^ r4
                goto L_0x00b8
            L_0x005d:
                int r6 = r0 + 1
                byte r0 = r1[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r2 = r2 ^ r7
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 >= 0) goto L_0x0073
                r0 = -34093383808(0xfffffff80fe03f80, double:NaN)
                long r0 = r0 ^ r2
            L_0x0070:
                r2 = r0
            L_0x0071:
                r0 = r6
                goto L_0x00b8
            L_0x0073:
                int r0 = r6 + 1
                byte r6 = r1[r6]
                long r6 = (long) r6
                r8 = 42
                long r6 = r6 << r8
                long r2 = r2 ^ r6
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L_0x0087
                r4 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                long r2 = r2 ^ r4
                goto L_0x00b8
            L_0x0087:
                int r6 = r0 + 1
                byte r0 = r1[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r2 = r2 ^ r7
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 >= 0) goto L_0x009b
                r0 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                long r0 = r0 ^ r2
                goto L_0x0070
            L_0x009b:
                int r0 = r6 + 1
                byte r6 = r1[r6]
                long r6 = (long) r6
                r8 = 56
                long r6 = r6 << r8
                long r2 = r2 ^ r6
                r6 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r2 = r2 ^ r6
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 >= 0) goto L_0x00b8
                int r6 = r0 + 1
                byte r0 = r1[r0]
                long r0 = (long) r0
                int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r7 < 0) goto L_0x00bb
                goto L_0x0071
            L_0x00b8:
                r11.pos = r0
                return r2
            L_0x00bb:
                long r0 = r11.readRawVarint64SlowPath()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.ArrayDecoder.readRawVarint64():long");
        }

        public final void enableAliasing(boolean z) {
            this.enableAliasing = z;
        }

        public final void popLimit(int i) {
            this.currentLimit = i;
            recomputeBufferSizeAfterLimit();
        }

        public final void checkLastTagWas(int i) throws InvalidProtocolBufferException {
            if (this.lastTag != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        public final int pushLimit(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int totalBytesRead = i + getTotalBytesRead();
                int i2 = this.currentLimit;
                if (totalBytesRead <= i2) {
                    this.currentLimit = totalBytesRead;
                    recomputeBufferSizeAfterLimit();
                    return i2;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        public final void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag, codedOutputStream));
        }

        public final void skipRawBytes(int i) throws IOException {
            if (i >= 0 && i <= this.limit - this.pos) {
                this.pos += i;
            } else if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        public final byte[] readRawBytes(int i) throws IOException {
            if (i > 0 && i <= this.limit - this.pos) {
                int i2 = this.pos;
                this.pos += i;
                return Arrays.copyOfRange(this.buffer, i2, this.pos);
            } else if (i > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (i == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            } else {
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        public final boolean skipField(int i) throws IOException {
            switch (WireFormat.getTagWireType(i)) {
                case 0:
                    skipRawVarint();
                    return true;
                case 1:
                    skipRawBytes(8);
                    return true;
                case 2:
                    skipRawBytes(readRawVarint32());
                    return true;
                case 3:
                    skipMessage();
                    checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4));
                    return true;
                case 4:
                    return false;
                case 5:
                    skipRawBytes(4);
                    return true;
                default:
                    throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        @Deprecated
        public final void readUnknownGroup(int i, MessageLite.Builder builder) throws IOException {
            readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        public final <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (this.recursionDepth < this.recursionLimit) {
                int pushLimit = pushLimit(readRawVarint32);
                this.recursionDepth++;
                T t = (MessageLite) parser.parsePartialFrom((CodedInputStream) this, extensionRegistryLite);
                checkLastTagWas(0);
                this.recursionDepth--;
                popLimit(pushLimit);
                return t;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        public final void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (this.recursionDepth < this.recursionLimit) {
                int pushLimit = pushLimit(readRawVarint32);
                this.recursionDepth++;
                builder.mergeFrom((CodedInputStream) this, extensionRegistryLite);
                checkLastTagWas(0);
                this.recursionDepth--;
                popLimit(pushLimit);
                return;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        public final boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException {
            switch (WireFormat.getTagWireType(i)) {
                case 0:
                    long readInt64 = readInt64();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeUInt64NoTag(readInt64);
                    return true;
                case 1:
                    long readRawLittleEndian64 = readRawLittleEndian64();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                    return true;
                case 2:
                    ByteString readBytes = readBytes();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeBytesNoTag(readBytes);
                    return true;
                case 3:
                    codedOutputStream.writeRawVarint32(i);
                    skipMessage(codedOutputStream);
                    int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
                    checkLastTagWas(makeTag);
                    codedOutputStream.writeRawVarint32(makeTag);
                    return true;
                case 4:
                    return false;
                case 5:
                    int readRawLittleEndian32 = readRawLittleEndian32();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                    return true;
                default:
                    throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        public final <T extends MessageLite> T readGroup(int i, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            if (this.recursionDepth < this.recursionLimit) {
                this.recursionDepth++;
                T t = (MessageLite) parser.parsePartialFrom((CodedInputStream) this, extensionRegistryLite);
                checkLastTagWas(WireFormat.makeTag(i, 4));
                this.recursionDepth--;
                return t;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        public final void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            if (this.recursionDepth < this.recursionLimit) {
                this.recursionDepth++;
                builder.mergeFrom((CodedInputStream) this, extensionRegistryLite);
                checkLastTagWas(WireFormat.makeTag(i, 4));
                this.recursionDepth--;
                return;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        private ArrayDecoder(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = bArr;
            this.limit = i2 + i;
            this.pos = i;
            this.startPos = this.pos;
            this.immutable = z;
        }
    }

    static final class IterableDirectByteBufferDecoder extends CodedInputStream {
        private int bufferSizeAfterCurrentLimit;
        private long currentAddress;
        private ByteBuffer currentByteBuffer;
        private long currentByteBufferLimit;
        private long currentByteBufferPos;
        private long currentByteBufferStartPos;
        private int currentLimit;
        private boolean enableAliasing;
        private boolean immutable;
        private Iterable<ByteBuffer> input;
        private Iterator<ByteBuffer> iterator;
        private int lastTag;
        private int startOffset;
        private int totalBufferSize;
        private int totalBytesRead;

        public final int getLastTag() {
            return this.lastTag;
        }

        private long currentRemaining() {
            return this.currentByteBufferLimit - this.currentByteBufferPos;
        }

        public final int readEnum() throws IOException {
            return readRawVarint32();
        }

        public final int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        public final long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        public final int readInt32() throws IOException {
            return readRawVarint32();
        }

        public final long readInt64() throws IOException {
            return readRawVarint64();
        }

        public final int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        public final long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        public final int readUInt32() throws IOException {
            return readRawVarint32();
        }

        public final long readUInt64() throws IOException {
            return readRawVarint64();
        }

        private int remaining() {
            return (int) ((((long) (this.totalBufferSize - this.totalBytesRead)) - this.currentByteBufferPos) + this.currentByteBufferStartPos);
        }

        public final int getTotalBytesRead() {
            return (int) ((((long) (this.totalBytesRead - this.startOffset)) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        public final boolean readBool() throws IOException {
            if (readRawVarint64() != 0) {
                return true;
            }
            return false;
        }

        public final byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        public final int readSInt32() throws IOException {
            return decodeZigZag32(readRawVarint32());
        }

        public final long readSInt64() throws IOException {
            return decodeZigZag64(readRawVarint64());
        }

        public final void resetSizeCounter() {
            this.startOffset = (int) ((((long) this.totalBytesRead) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        public final void skipMessage() throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag));
        }

        private void getNextByteBuffer() throws InvalidProtocolBufferException {
            if (this.iterator.hasNext()) {
                tryGetNextByteBuffer();
                return;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        private void skipRawVarint() throws IOException {
            int i = 0;
            while (i < 10) {
                if (readRawByte() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public final int getBytesUntilLimit() {
            if (this.currentLimit == Integer.MAX_VALUE) {
                return -1;
            }
            return this.currentLimit - getTotalBytesRead();
        }

        public final boolean isAtEnd() throws IOException {
            if ((((long) this.totalBytesRead) + this.currentByteBufferPos) - this.currentByteBufferStartPos == ((long) this.totalBufferSize)) {
                return true;
            }
            return false;
        }

        public final byte readRawByte() throws IOException {
            if (currentRemaining() == 0) {
                getNextByteBuffer();
            }
            long j = this.currentByteBufferPos;
            this.currentByteBufferPos = 1 + j;
            return UnsafeUtil.getByte(j);
        }

        /* access modifiers changed from: package-private */
        public final long readRawVarint64SlowPath() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte readRawByte = readRawByte();
                j |= ((long) (readRawByte & Byte.MAX_VALUE)) << i;
                if ((readRawByte & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public final int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            this.lastTag = readRawVarint32();
            if (WireFormat.getTagFieldNumber(this.lastTag) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        private void recomputeBufferSizeAfterLimit() {
            this.totalBufferSize += this.bufferSizeAfterCurrentLimit;
            int i = this.totalBufferSize - this.startOffset;
            if (i > this.currentLimit) {
                this.bufferSizeAfterCurrentLimit = i - this.currentLimit;
                this.totalBufferSize -= this.bufferSizeAfterCurrentLimit;
                return;
            }
            this.bufferSizeAfterCurrentLimit = 0;
        }

        private void tryGetNextByteBuffer() {
            this.currentByteBuffer = this.iterator.next();
            this.totalBytesRead += (int) (this.currentByteBufferPos - this.currentByteBufferStartPos);
            this.currentByteBufferPos = (long) this.currentByteBuffer.position();
            this.currentByteBufferStartPos = this.currentByteBufferPos;
            this.currentByteBufferLimit = (long) this.currentByteBuffer.limit();
            this.currentAddress = UnsafeUtil.addressOffset(this.currentByteBuffer);
            this.currentByteBufferPos += this.currentAddress;
            this.currentByteBufferStartPos += this.currentAddress;
            this.currentByteBufferLimit += this.currentAddress;
        }

        public final ByteBuffer readByteBuffer() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = (long) readRawVarint32;
                if (j <= currentRemaining()) {
                    if (this.immutable || !this.enableAliasing) {
                        byte[] bArr = new byte[readRawVarint32];
                        UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, 0, j);
                        this.currentByteBufferPos += j;
                        return ByteBuffer.wrap(bArr);
                    }
                    this.currentByteBufferPos += j;
                    return slice((int) ((this.currentByteBufferPos - this.currentAddress) - j), (int) (this.currentByteBufferPos - this.currentAddress));
                }
            }
            if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[readRawVarint32];
                readRawBytesTo(bArr2, 0, readRawVarint32);
                return ByteBuffer.wrap(bArr2);
            } else if (readRawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            } else {
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        public final ByteString readBytes() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = (long) readRawVarint32;
                if (j <= this.currentByteBufferLimit - this.currentByteBufferPos) {
                    if (!this.immutable || !this.enableAliasing) {
                        byte[] bArr = new byte[readRawVarint32];
                        UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, 0, j);
                        this.currentByteBufferPos += j;
                        return ByteString.wrap(bArr);
                    }
                    int i = (int) (this.currentByteBufferPos - this.currentAddress);
                    ByteString wrap = ByteString.wrap(slice(i, readRawVarint32 + i));
                    this.currentByteBufferPos += j;
                    return wrap;
                }
            }
            if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[readRawVarint32];
                readRawBytesTo(bArr2, 0, readRawVarint32);
                return ByteString.wrap(bArr2);
            } else if (readRawVarint32 == 0) {
                return ByteString.EMPTY;
            } else {
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        public final int readRawLittleEndian32() throws IOException {
            if (currentRemaining() < 4) {
                return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
            }
            long j = this.currentByteBufferPos;
            this.currentByteBufferPos += 4;
            return ((UnsafeUtil.getByte(j + 3) & 255) << 24) | (UnsafeUtil.getByte(j) & 255) | ((UnsafeUtil.getByte(1 + j) & 255) << 8) | ((UnsafeUtil.getByte(2 + j) & 255) << 16);
        }

        public final String readString() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = (long) readRawVarint32;
                if (j <= this.currentByteBufferLimit - this.currentByteBufferPos) {
                    byte[] bArr = new byte[readRawVarint32];
                    UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, 0, j);
                    String str = new String(bArr, Internal.UTF_8);
                    this.currentByteBufferPos += j;
                    return str;
                }
            }
            if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[readRawVarint32];
                readRawBytesTo(bArr2, 0, readRawVarint32);
                return new String(bArr2, Internal.UTF_8);
            } else if (readRawVarint32 == 0) {
                return "";
            } else {
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        public final String readStringRequireUtf8() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = (long) readRawVarint32;
                if (j <= this.currentByteBufferLimit - this.currentByteBufferPos) {
                    byte[] bArr = new byte[readRawVarint32];
                    UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, 0, j);
                    if (Utf8.isValidUtf8(bArr)) {
                        String str = new String(bArr, Internal.UTF_8);
                        this.currentByteBufferPos += j;
                        return str;
                    }
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
            }
            if (readRawVarint32 >= 0 && readRawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[readRawVarint32];
                readRawBytesTo(bArr2, 0, readRawVarint32);
                if (Utf8.isValidUtf8(bArr2)) {
                    return new String(bArr2, Internal.UTF_8);
                }
                throw InvalidProtocolBufferException.invalidUtf8();
            } else if (readRawVarint32 == 0) {
                return "";
            } else {
                if (readRawVarint32 <= 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        public final long readRawLittleEndian64() throws IOException {
            if (currentRemaining() < 8) {
                return (((long) readRawByte()) & 255) | ((((long) readRawByte()) & 255) << 8) | ((((long) readRawByte()) & 255) << 16) | ((((long) readRawByte()) & 255) << 24) | ((((long) readRawByte()) & 255) << 32) | ((((long) readRawByte()) & 255) << 40) | ((((long) readRawByte()) & 255) << 48) | ((((long) readRawByte()) & 255) << 56);
            }
            long j = this.currentByteBufferPos;
            this.currentByteBufferPos += 8;
            return ((((long) UnsafeUtil.getByte(j + 7)) & 255) << 56) | ((((long) UnsafeUtil.getByte(6 + j)) & 255) << 48) | ((((long) UnsafeUtil.getByte(4 + j)) & 255) << 32) | ((((long) UnsafeUtil.getByte(2 + j)) & 255) << 16) | (((long) UnsafeUtil.getByte(j)) & 255) | ((((long) UnsafeUtil.getByte(1 + j)) & 255) << 8) | ((((long) UnsafeUtil.getByte(3 + j)) & 255) << 24) | ((((long) UnsafeUtil.getByte(5 + j)) & 255) << 40);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x008a, code lost:
            if (com.google.protobuf.UnsafeUtil.getByte(r4) >= 0) goto L_0x008c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int readRawVarint32() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.currentByteBufferPos
                long r2 = r10.currentByteBufferLimit
                long r4 = r10.currentByteBufferPos
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L_0x008f
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r0)
                if (r0 < 0) goto L_0x001a
                long r4 = r10.currentByteBufferPos
                long r4 = r4 + r2
                r10.currentByteBufferPos = r4
                return r0
            L_0x001a:
                long r6 = r10.currentByteBufferLimit
                long r8 = r10.currentByteBufferPos
                long r6 = r6 - r8
                r8 = 10
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 < 0) goto L_0x008f
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.getByte(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x0033
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x008c
            L_0x0033:
                r1 = 0
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.getByte(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0043
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x0041:
                r6 = r4
                goto L_0x008c
            L_0x0043:
                r1 = 0
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.getByte(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x0054
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x008c
            L_0x0054:
                r1 = 0
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.getByte(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L_0x0041
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.getByte(r4)
                if (r1 >= 0) goto L_0x008c
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.getByte(r6)
                if (r1 >= 0) goto L_0x0041
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.getByte(r4)
                if (r1 >= 0) goto L_0x008c
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.getByte(r6)
                if (r1 >= 0) goto L_0x0041
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.getByte(r4)
                if (r1 < 0) goto L_0x008f
            L_0x008c:
                r10.currentByteBufferPos = r6
                return r0
            L_0x008f:
                long r0 = r10.readRawVarint64SlowPath()
                int r0 = (int) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.IterableDirectByteBufferDecoder.readRawVarint32():int");
        }

        public final long readRawVarint64() throws IOException {
            long j;
            long j2;
            long j3;
            long j4 = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != this.currentByteBufferPos) {
                long j5 = j4 + 1;
                byte b2 = UnsafeUtil.getByte(j4);
                if (b2 >= 0) {
                    this.currentByteBufferPos++;
                    return (long) b2;
                } else if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                    long j6 = j5 + 1;
                    byte b3 = b2 ^ (UnsafeUtil.getByte(j5) << 7);
                    if (b3 < 0) {
                        j2 = (long) (b3 ^ Byte.MIN_VALUE);
                    } else {
                        j = j6 + 1;
                        byte b4 = b3 ^ (UnsafeUtil.getByte(j6) << 14);
                        if (b4 >= 0) {
                            j2 = (long) (b4 ^ 16256);
                        } else {
                            j6 = j + 1;
                            byte b5 = b4 ^ (UnsafeUtil.getByte(j) << 21);
                            if (b5 < 0) {
                                j2 = (long) (b5 ^ -2080896);
                            } else {
                                j = j6 + 1;
                                long j7 = ((long) b5) ^ (((long) UnsafeUtil.getByte(j6)) << 28);
                                if (j7 >= 0) {
                                    j2 = j7 ^ 266354560;
                                } else {
                                    long j8 = j + 1;
                                    long j9 = j7 ^ (((long) UnsafeUtil.getByte(j)) << 35);
                                    if (j9 < 0) {
                                        j3 = j9 ^ -34093383808L;
                                    } else {
                                        j = j8 + 1;
                                        long j10 = j9 ^ (((long) UnsafeUtil.getByte(j8)) << 42);
                                        if (j10 >= 0) {
                                            j2 = j10 ^ 4363953127296L;
                                        } else {
                                            j8 = j + 1;
                                            long j11 = j10 ^ (((long) UnsafeUtil.getByte(j)) << 49);
                                            if (j11 < 0) {
                                                j3 = j11 ^ -558586000294016L;
                                            } else {
                                                j = j8 + 1;
                                                j2 = (j11 ^ (((long) UnsafeUtil.getByte(j8)) << 56)) ^ 71499008037633920L;
                                                if (j2 < 0) {
                                                    long j12 = 1 + j;
                                                    if (((long) UnsafeUtil.getByte(j)) >= 0) {
                                                        j = j12;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = j8;
                                }
                            }
                        }
                        this.currentByteBufferPos = j;
                        return j2;
                    }
                    j = j6;
                    this.currentByteBufferPos = j;
                    return j2;
                }
            }
            return readRawVarint64SlowPath();
        }

        public final void enableAliasing(boolean z) {
            this.enableAliasing = z;
        }

        public final void popLimit(int i) {
            this.currentLimit = i;
            recomputeBufferSizeAfterLimit();
        }

        public final void checkLastTagWas(int i) throws InvalidProtocolBufferException {
            if (this.lastTag != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        public final int pushLimit(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int totalBytesRead2 = i + getTotalBytesRead();
                int i2 = this.currentLimit;
                if (totalBytesRead2 <= i2) {
                    this.currentLimit = totalBytesRead2;
                    recomputeBufferSizeAfterLimit();
                    return i2;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        public final void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag, codedOutputStream));
        }

        public final byte[] readRawBytes(int i) throws IOException {
            if (i >= 0) {
                long j = (long) i;
                if (j <= currentRemaining()) {
                    byte[] bArr = new byte[i];
                    UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, 0, j);
                    this.currentByteBufferPos += j;
                    return bArr;
                }
            }
            if (i >= 0 && i <= remaining()) {
                byte[] bArr2 = new byte[i];
                readRawBytesTo(bArr2, 0, i);
                return bArr2;
            } else if (i > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (i == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            } else {
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        public final void skipRawBytes(int i) throws IOException {
            if (i >= 0 && ((long) i) <= (((long) (this.totalBufferSize - this.totalBytesRead)) - this.currentByteBufferPos) + this.currentByteBufferStartPos) {
                while (i > 0) {
                    if (currentRemaining() == 0) {
                        getNextByteBuffer();
                    }
                    int min = Math.min(i, (int) currentRemaining());
                    i -= min;
                    this.currentByteBufferPos += (long) min;
                }
            } else if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        public final boolean skipField(int i) throws IOException {
            switch (WireFormat.getTagWireType(i)) {
                case 0:
                    skipRawVarint();
                    return true;
                case 1:
                    skipRawBytes(8);
                    return true;
                case 2:
                    skipRawBytes(readRawVarint32());
                    return true;
                case 3:
                    skipMessage();
                    checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4));
                    return true;
                case 4:
                    return false;
                case 5:
                    skipRawBytes(4);
                    return true;
                default:
                    throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        @Deprecated
        public final void readUnknownGroup(int i, MessageLite.Builder builder) throws IOException {
            readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:6|7|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
            throw r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
            r3.currentByteBuffer.position(r0);
            r3.currentByteBuffer.limit(r1);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0029 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.nio.ByteBuffer slice(int r4, int r5) throws java.io.IOException {
            /*
                r3 = this;
                java.nio.ByteBuffer r0 = r3.currentByteBuffer
                int r0 = r0.position()
                java.nio.ByteBuffer r1 = r3.currentByteBuffer
                int r1 = r1.limit()
                java.nio.ByteBuffer r2 = r3.currentByteBuffer     // Catch:{ IllegalArgumentException -> 0x0029 }
                r2.position(r4)     // Catch:{ IllegalArgumentException -> 0x0029 }
                java.nio.ByteBuffer r4 = r3.currentByteBuffer     // Catch:{ IllegalArgumentException -> 0x0029 }
                r4.limit(r5)     // Catch:{ IllegalArgumentException -> 0x0029 }
                java.nio.ByteBuffer r4 = r3.currentByteBuffer     // Catch:{ IllegalArgumentException -> 0x0029 }
                java.nio.ByteBuffer r4 = r4.slice()     // Catch:{ IllegalArgumentException -> 0x0029 }
                java.nio.ByteBuffer r5 = r3.currentByteBuffer
                r5.position(r0)
                java.nio.ByteBuffer r5 = r3.currentByteBuffer
                r5.limit(r1)
                return r4
            L_0x0027:
                r4 = move-exception
                goto L_0x002e
            L_0x0029:
                com.google.protobuf.InvalidProtocolBufferException r4 = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage()     // Catch:{ all -> 0x0027 }
                throw r4     // Catch:{ all -> 0x0027 }
            L_0x002e:
                java.nio.ByteBuffer r5 = r3.currentByteBuffer
                r5.position(r0)
                java.nio.ByteBuffer r5 = r3.currentByteBuffer
                r5.limit(r1)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.IterableDirectByteBufferDecoder.slice(int, int):java.nio.ByteBuffer");
        }

        public final <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (this.recursionDepth < this.recursionLimit) {
                int pushLimit = pushLimit(readRawVarint32);
                this.recursionDepth++;
                T t = (MessageLite) parser.parsePartialFrom((CodedInputStream) this, extensionRegistryLite);
                checkLastTagWas(0);
                this.recursionDepth--;
                popLimit(pushLimit);
                return t;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        public final void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (this.recursionDepth < this.recursionLimit) {
                int pushLimit = pushLimit(readRawVarint32);
                this.recursionDepth++;
                builder.mergeFrom((CodedInputStream) this, extensionRegistryLite);
                checkLastTagWas(0);
                this.recursionDepth--;
                popLimit(pushLimit);
                return;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        public final boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException {
            switch (WireFormat.getTagWireType(i)) {
                case 0:
                    long readInt64 = readInt64();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeUInt64NoTag(readInt64);
                    return true;
                case 1:
                    long readRawLittleEndian64 = readRawLittleEndian64();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                    return true;
                case 2:
                    ByteString readBytes = readBytes();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeBytesNoTag(readBytes);
                    return true;
                case 3:
                    codedOutputStream.writeRawVarint32(i);
                    skipMessage(codedOutputStream);
                    int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
                    checkLastTagWas(makeTag);
                    codedOutputStream.writeRawVarint32(makeTag);
                    return true;
                case 4:
                    return false;
                case 5:
                    int readRawLittleEndian32 = readRawLittleEndian32();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                    return true;
                default:
                    throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        private IterableDirectByteBufferDecoder(Iterable<ByteBuffer> iterable, int i, boolean z) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.totalBufferSize = i;
            this.input = iterable;
            this.iterator = this.input.iterator();
            this.immutable = z;
            this.totalBytesRead = 0;
            this.startOffset = 0;
            if (i == 0) {
                this.currentByteBuffer = Internal.EMPTY_BYTE_BUFFER;
                this.currentByteBufferPos = 0;
                this.currentByteBufferStartPos = 0;
                this.currentByteBufferLimit = 0;
                this.currentAddress = 0;
                return;
            }
            tryGetNextByteBuffer();
        }

        public final <T extends MessageLite> T readGroup(int i, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            if (this.recursionDepth < this.recursionLimit) {
                this.recursionDepth++;
                T t = (MessageLite) parser.parsePartialFrom((CodedInputStream) this, extensionRegistryLite);
                checkLastTagWas(WireFormat.makeTag(i, 4));
                this.recursionDepth--;
                return t;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        private void readRawBytesTo(byte[] bArr, int i, int i2) throws IOException {
            if (i2 >= 0 && i2 <= remaining()) {
                int i3 = i2;
                while (i3 > 0) {
                    if (currentRemaining() == 0) {
                        getNextByteBuffer();
                    }
                    int min = Math.min(i3, (int) currentRemaining());
                    long j = (long) min;
                    UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, (long) ((i2 - i3) + i), j);
                    i3 -= min;
                    this.currentByteBufferPos += j;
                }
            } else if (i2 > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (i2 != 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        public final void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            if (this.recursionDepth < this.recursionLimit) {
                this.recursionDepth++;
                builder.mergeFrom((CodedInputStream) this, extensionRegistryLite);
                checkLastTagWas(WireFormat.makeTag(i, 4));
                this.recursionDepth--;
                return;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    static final class StreamDecoder extends CodedInputStream {
        public final byte[] buffer;
        private int bufferSize;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private final InputStream input;
        private int lastTag;
        public int pos;
        private RefillCallback refillCallback;
        private int totalBytesRetired;

        interface RefillCallback {
            void onRefill();
        }

        class SkippedDataSink implements RefillCallback {
            private ByteArrayOutputStream byteArrayStream;
            private int lastPos = StreamDecoder.this.pos;

            /* access modifiers changed from: package-private */
            public ByteBuffer getSkippedData() {
                if (this.byteArrayStream == null) {
                    return ByteBuffer.wrap(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos - this.lastPos);
                }
                this.byteArrayStream.write(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos);
                return ByteBuffer.wrap(this.byteArrayStream.toByteArray());
            }

            public void onRefill() {
                if (this.byteArrayStream == null) {
                    this.byteArrayStream = new ByteArrayOutputStream();
                }
                this.byteArrayStream.write(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos - this.lastPos);
                this.lastPos = 0;
            }

            private SkippedDataSink() {
            }
        }

        public final void enableAliasing(boolean z) {
        }

        public final int getLastTag() {
            return this.lastTag;
        }

        public final int getTotalBytesRead() {
            return this.totalBytesRetired + this.pos;
        }

        public final int readEnum() throws IOException {
            return readRawVarint32();
        }

        public final int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        public final long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        public final int readInt32() throws IOException {
            return readRawVarint32();
        }

        public final long readInt64() throws IOException {
            return readRawVarint64();
        }

        public final int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        public final long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        public final int readUInt32() throws IOException {
            return readRawVarint32();
        }

        public final long readUInt64() throws IOException {
            return readRawVarint64();
        }

        public final void resetSizeCounter() {
            this.totalBytesRetired = -this.pos;
        }

        public final boolean isAtEnd() throws IOException {
            if (this.pos != this.bufferSize || tryRefillBuffer(1)) {
                return false;
            }
            return true;
        }

        public final boolean readBool() throws IOException {
            if (readRawVarint64() != 0) {
                return true;
            }
            return false;
        }

        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        public final int readSInt32() throws IOException {
            return decodeZigZag32(readRawVarint32());
        }

        public final long readSInt64() throws IOException {
            return decodeZigZag64(readRawVarint64());
        }

        public final void skipMessage() throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag));
        }

        private void skipRawVarint() throws IOException {
            if (this.bufferSize - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws IOException {
            int i = 0;
            while (i < 10) {
                byte[] bArr = this.buffer;
                int i2 = this.pos;
                this.pos = i2 + 1;
                if (bArr[i2] < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws IOException {
            int i = 0;
            while (i < 10) {
                if (readRawByte() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public final int getBytesUntilLimit() {
            if (this.currentLimit == Integer.MAX_VALUE) {
                return -1;
            }
            return this.currentLimit - (this.totalBytesRetired + this.pos);
        }

        public final byte readRawByte() throws IOException {
            if (this.pos == this.bufferSize) {
                refillBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i = this.pos;
            this.pos = i + 1;
            return bArr[i];
        }

        /* access modifiers changed from: package-private */
        public final long readRawVarint64SlowPath() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte readRawByte = readRawByte();
                j |= ((long) (readRawByte & Byte.MAX_VALUE)) << i;
                if ((readRawByte & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public final int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            this.lastTag = readRawVarint32();
            if (WireFormat.getTagFieldNumber(this.lastTag) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        private void recomputeBufferSizeAfterLimit() {
            this.bufferSize += this.bufferSizeAfterLimit;
            int i = this.totalBytesRetired + this.bufferSize;
            if (i > this.currentLimit) {
                this.bufferSizeAfterLimit = i - this.currentLimit;
                this.bufferSize -= this.bufferSizeAfterLimit;
                return;
            }
            this.bufferSizeAfterLimit = 0;
        }

        public final byte[] readByteArray() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > this.bufferSize - this.pos || readRawVarint32 <= 0) {
                return readRawBytesSlowPath(readRawVarint32);
            }
            byte[] copyOfRange = Arrays.copyOfRange(this.buffer, this.pos, this.pos + readRawVarint32);
            this.pos += readRawVarint32;
            return copyOfRange;
        }

        public final ByteBuffer readByteBuffer() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 <= this.bufferSize - this.pos && readRawVarint32 > 0) {
                ByteBuffer wrap = ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, this.pos, this.pos + readRawVarint32));
                this.pos += readRawVarint32;
                return wrap;
            } else if (readRawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            } else {
                return ByteBuffer.wrap(readRawBytesSlowPath(readRawVarint32));
            }
        }

        public final ByteString readBytes() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 <= this.bufferSize - this.pos && readRawVarint32 > 0) {
                ByteString copyFrom = ByteString.copyFrom(this.buffer, this.pos, readRawVarint32);
                this.pos += readRawVarint32;
                return copyFrom;
            } else if (readRawVarint32 == 0) {
                return ByteString.EMPTY;
            } else {
                return readBytesSlowPath(readRawVarint32);
            }
        }

        public final int readRawLittleEndian32() throws IOException {
            int i = this.pos;
            if (this.bufferSize - i < 4) {
                refillBuffer(4);
                i = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public final long readRawLittleEndian64() throws IOException {
            int i = this.pos;
            if (this.bufferSize - i < 8) {
                refillBuffer(8);
                i = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r1[r2] >= 0) goto L_0x006a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int readRawVarint32() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.pos
                int r1 = r5.bufferSize
                if (r1 == r0) goto L_0x006d
                byte[] r1 = r5.buffer
                int r2 = r0 + 1
                byte r0 = r1[r0]
                if (r0 < 0) goto L_0x0011
                r5.pos = r2
                return r0
            L_0x0011:
                int r3 = r5.bufferSize
                int r3 = r3 - r2
                r4 = 9
                if (r3 < r4) goto L_0x006d
                int r3 = r2 + 1
                byte r2 = r1[r2]
                int r2 = r2 << 7
                r0 = r0 ^ r2
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x006a
            L_0x0024:
                int r2 = r3 + 1
                byte r3 = r1[r3]
                int r3 = r3 << 14
                r0 = r0 ^ r3
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r3 = r2
                goto L_0x006a
            L_0x0031:
                int r3 = r2 + 1
                byte r2 = r1[r2]
                int r2 = r2 << 21
                r0 = r0 ^ r2
                if (r0 >= 0) goto L_0x003f
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x006a
            L_0x003f:
                int r2 = r3 + 1
                byte r3 = r1[r3]
                int r4 = r3 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r3 >= 0) goto L_0x002f
                int r3 = r2 + 1
                byte r2 = r1[r2]
                if (r2 >= 0) goto L_0x006a
                int r2 = r3 + 1
                byte r3 = r1[r3]
                if (r3 >= 0) goto L_0x002f
                int r3 = r2 + 1
                byte r2 = r1[r2]
                if (r2 >= 0) goto L_0x006a
                int r2 = r3 + 1
                byte r3 = r1[r3]
                if (r3 >= 0) goto L_0x002f
                int r3 = r2 + 1
                byte r1 = r1[r2]
                if (r1 < 0) goto L_0x006d
            L_0x006a:
                r5.pos = r3
                return r0
            L_0x006d:
                long r0 = r5.readRawVarint64SlowPath()
                int r0 = (int) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.StreamDecoder.readRawVarint32():int");
        }

        public final String readString() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0 && readRawVarint32 <= this.bufferSize - this.pos) {
                String str = new String(this.buffer, this.pos, readRawVarint32, Internal.UTF_8);
                this.pos += readRawVarint32;
                return str;
            } else if (readRawVarint32 == 0) {
                return "";
            } else {
                if (readRawVarint32 > this.bufferSize) {
                    return new String(readRawBytesSlowPath(readRawVarint32), Internal.UTF_8);
                }
                refillBuffer(readRawVarint32);
                String str2 = new String(this.buffer, this.pos, readRawVarint32, Internal.UTF_8);
                this.pos += readRawVarint32;
                return str2;
            }
        }

        public final String readStringRequireUtf8() throws IOException {
            byte[] bArr;
            int readRawVarint32 = readRawVarint32();
            int i = this.pos;
            int i2 = 0;
            if (readRawVarint32 <= this.bufferSize - i && readRawVarint32 > 0) {
                bArr = this.buffer;
                this.pos = i + readRawVarint32;
                i2 = i;
            } else if (readRawVarint32 == 0) {
                return "";
            } else {
                if (readRawVarint32 <= this.bufferSize) {
                    refillBuffer(readRawVarint32);
                    bArr = this.buffer;
                    this.pos = readRawVarint32 + 0;
                } else {
                    bArr = readRawBytesSlowPath(readRawVarint32);
                }
            }
            if (Utf8.isValidUtf8(bArr, i2, i2 + readRawVarint32)) {
                return new String(bArr, i2, readRawVarint32, Internal.UTF_8);
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
            if (((long) r1[r0]) >= 0) goto L_0x0071;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long readRawVarint64() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.pos
                int r1 = r11.bufferSize
                if (r1 == r0) goto L_0x00bb
                byte[] r1 = r11.buffer
                int r2 = r0 + 1
                byte r0 = r1[r0]
                if (r0 < 0) goto L_0x0012
                r11.pos = r2
                long r0 = (long) r0
                return r0
            L_0x0012:
                int r3 = r11.bufferSize
                int r3 = r3 - r2
                r4 = 9
                if (r3 < r4) goto L_0x00bb
                int r3 = r2 + 1
                byte r2 = r1[r2]
                int r2 = r2 << 7
                r0 = r0 ^ r2
                if (r0 >= 0) goto L_0x002a
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                long r0 = (long) r0
            L_0x0025:
                r9 = r0
                r0 = r3
            L_0x0027:
                r2 = r9
                goto L_0x00b8
            L_0x002a:
                int r2 = r3 + 1
                byte r3 = r1[r3]
                int r3 = r3 << 14
                r0 = r0 ^ r3
                if (r0 < 0) goto L_0x0039
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r0 = r2
                goto L_0x0027
            L_0x0039:
                int r3 = r2 + 1
                byte r2 = r1[r2]
                int r2 = r2 << 21
                r0 = r0 ^ r2
                if (r0 >= 0) goto L_0x0048
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                long r0 = (long) r0
                goto L_0x0025
            L_0x0048:
                long r4 = (long) r0
                int r0 = r3 + 1
                byte r2 = r1[r3]
                long r2 = (long) r2
                r6 = 28
                long r2 = r2 << r6
                long r2 = r2 ^ r4
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L_0x005d
                r4 = 266354560(0xfe03f80, double:1.315966377E-315)
                long r2 = r2 ^ r4
                goto L_0x00b8
            L_0x005d:
                int r6 = r0 + 1
                byte r0 = r1[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r2 = r2 ^ r7
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 >= 0) goto L_0x0073
                r0 = -34093383808(0xfffffff80fe03f80, double:NaN)
                long r0 = r0 ^ r2
            L_0x0070:
                r2 = r0
            L_0x0071:
                r0 = r6
                goto L_0x00b8
            L_0x0073:
                int r0 = r6 + 1
                byte r6 = r1[r6]
                long r6 = (long) r6
                r8 = 42
                long r6 = r6 << r8
                long r2 = r2 ^ r6
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L_0x0087
                r4 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                long r2 = r2 ^ r4
                goto L_0x00b8
            L_0x0087:
                int r6 = r0 + 1
                byte r0 = r1[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r2 = r2 ^ r7
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 >= 0) goto L_0x009b
                r0 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                long r0 = r0 ^ r2
                goto L_0x0070
            L_0x009b:
                int r0 = r6 + 1
                byte r6 = r1[r6]
                long r6 = (long) r6
                r8 = 56
                long r6 = r6 << r8
                long r2 = r2 ^ r6
                r6 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r2 = r2 ^ r6
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 >= 0) goto L_0x00b8
                int r6 = r0 + 1
                byte r0 = r1[r0]
                long r0 = (long) r0
                int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r7 < 0) goto L_0x00bb
                goto L_0x0071
            L_0x00b8:
                r11.pos = r0
                return r2
            L_0x00bb:
                long r0 = r11.readRawVarint64SlowPath()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.StreamDecoder.readRawVarint64():long");
        }

        public final void popLimit(int i) {
            this.currentLimit = i;
            recomputeBufferSizeAfterLimit();
        }

        public final void checkLastTagWas(int i) throws InvalidProtocolBufferException {
            if (this.lastTag != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        private void refillBuffer(int i) throws IOException {
            if (tryRefillBuffer(i)) {
                return;
            }
            if (i > (this.sizeLimit - this.totalBytesRetired) - this.pos) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        public final int pushLimit(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int i2 = i + this.totalBytesRetired + this.pos;
                int i3 = this.currentLimit;
                if (i2 <= i3) {
                    this.currentLimit = i2;
                    recomputeBufferSizeAfterLimit();
                    return i3;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        public final byte[] readRawBytes(int i) throws IOException {
            int i2 = this.pos;
            if (i > this.bufferSize - i2 || i <= 0) {
                return readRawBytesSlowPath(i);
            }
            int i3 = i + i2;
            this.pos = i3;
            return Arrays.copyOfRange(this.buffer, i2, i3);
        }

        public final void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag, codedOutputStream));
        }

        public final void skipRawBytes(int i) throws IOException {
            if (i > this.bufferSize - this.pos || i < 0) {
                skipRawBytesSlowPath(i);
            } else {
                this.pos += i;
            }
        }

        private byte[] readRawBytesSlowPath(int i) throws IOException {
            byte[] readRawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i);
            if (readRawBytesSlowPathOneChunk != null) {
                return readRawBytesSlowPathOneChunk;
            }
            int i2 = this.pos;
            int i3 = this.bufferSize - this.pos;
            this.totalBytesRetired += this.bufferSize;
            this.pos = 0;
            this.bufferSize = 0;
            List<byte[]> readRawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i - i3);
            byte[] bArr = new byte[i];
            System.arraycopy(this.buffer, i2, bArr, 0, i3);
            for (byte[] next : readRawBytesSlowPathRemainingChunks) {
                System.arraycopy(next, 0, bArr, i3, next.length);
                i3 += next.length;
            }
            return bArr;
        }

        private List<byte[]> readRawBytesSlowPathRemainingChunks(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                byte[] bArr = new byte[Math.min(i, 4096)];
                int i2 = 0;
                while (i2 < bArr.length) {
                    int read = this.input.read(bArr, i2, bArr.length - i2);
                    if (read != -1) {
                        this.totalBytesRetired += read;
                        i2 += read;
                    } else {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                }
                i -= bArr.length;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private ByteString readBytesSlowPath(int i) throws IOException {
            byte[] readRawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i);
            if (readRawBytesSlowPathOneChunk != null) {
                return ByteString.wrap(readRawBytesSlowPathOneChunk);
            }
            int i2 = this.pos;
            int i3 = this.bufferSize - this.pos;
            this.totalBytesRetired += this.bufferSize;
            this.pos = 0;
            this.bufferSize = 0;
            List<byte[]> readRawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i - i3);
            ArrayList arrayList = new ArrayList(readRawBytesSlowPathRemainingChunks.size() + 1);
            arrayList.add(ByteString.copyFrom(this.buffer, i2, i3));
            for (byte[] wrap : readRawBytesSlowPathRemainingChunks) {
                arrayList.add(ByteString.wrap(wrap));
            }
            return ByteString.copyFrom((Iterable<ByteString>) arrayList);
        }

        private byte[] readRawBytesSlowPathOneChunk(int i) throws IOException {
            if (i == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            if (i >= 0) {
                int i2 = this.totalBytesRetired + this.pos + i;
                if (i2 - this.sizeLimit > 0) {
                    throw InvalidProtocolBufferException.sizeLimitExceeded();
                } else if (i2 <= this.currentLimit) {
                    int i3 = this.bufferSize - this.pos;
                    int i4 = i - i3;
                    if (i4 >= 4096 && i4 > this.input.available()) {
                        return null;
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.buffer, this.pos, bArr, 0, i3);
                    this.totalBytesRetired += this.bufferSize;
                    this.pos = 0;
                    this.bufferSize = 0;
                    while (i3 < i) {
                        int read = this.input.read(bArr, i3, i - i3);
                        if (read != -1) {
                            this.totalBytesRetired += read;
                            i3 += read;
                        } else {
                            throw InvalidProtocolBufferException.truncatedMessage();
                        }
                    }
                    return bArr;
                } else {
                    skipRawBytes((this.currentLimit - this.totalBytesRetired) - this.pos);
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } else {
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        private void skipRawBytesSlowPath(int i) throws IOException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            } else if (this.totalBytesRetired + this.pos + i <= this.currentLimit) {
                int i2 = this.bufferSize - this.pos;
                this.pos = this.bufferSize;
                refillBuffer(1);
                while (true) {
                    int i3 = i - i2;
                    if (i3 > this.bufferSize) {
                        i2 += this.bufferSize;
                        this.pos = this.bufferSize;
                        refillBuffer(1);
                    } else {
                        this.pos = i3;
                        return;
                    }
                }
            } else {
                skipRawBytes((this.currentLimit - this.totalBytesRetired) - this.pos);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        public final boolean skipField(int i) throws IOException {
            switch (WireFormat.getTagWireType(i)) {
                case 0:
                    skipRawVarint();
                    return true;
                case 1:
                    skipRawBytes(8);
                    return true;
                case 2:
                    skipRawBytes(readRawVarint32());
                    return true;
                case 3:
                    skipMessage();
                    checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4));
                    return true;
                case 4:
                    return false;
                case 5:
                    skipRawBytes(4);
                    return true;
                default:
                    throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        private boolean tryRefillBuffer(int i) throws IOException {
            while (this.pos + i > this.bufferSize) {
                if (i > (this.sizeLimit - this.totalBytesRetired) - this.pos || this.totalBytesRetired + this.pos + i > this.currentLimit) {
                    return false;
                }
                if (this.refillCallback != null) {
                    this.refillCallback.onRefill();
                }
                int i2 = this.pos;
                if (i2 > 0) {
                    if (this.bufferSize > i2) {
                        byte[] bArr = this.buffer;
                        System.arraycopy(bArr, i2, bArr, 0, this.bufferSize - i2);
                    }
                    this.totalBytesRetired += i2;
                    this.bufferSize -= i2;
                    this.pos = 0;
                }
                int read = this.input.read(this.buffer, this.bufferSize, Math.min(this.buffer.length - this.bufferSize, (this.sizeLimit - this.totalBytesRetired) - this.bufferSize));
                if (read == 0 || read < -1 || read > this.buffer.length) {
                    throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read <= 0) {
                    return false;
                } else {
                    this.bufferSize += read;
                    recomputeBufferSizeAfterLimit();
                    if (this.bufferSize >= i) {
                        return true;
                    }
                }
            }
            throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
        }

        @Deprecated
        public final void readUnknownGroup(int i, MessageLite.Builder builder) throws IOException {
            readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        private StreamDecoder(InputStream inputStream, int i) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            Internal.checkNotNull(inputStream, "input");
            this.input = inputStream;
            this.buffer = new byte[i];
            this.bufferSize = 0;
            this.pos = 0;
            this.totalBytesRetired = 0;
        }

        public final <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (this.recursionDepth < this.recursionLimit) {
                int pushLimit = pushLimit(readRawVarint32);
                this.recursionDepth++;
                T t = (MessageLite) parser.parsePartialFrom((CodedInputStream) this, extensionRegistryLite);
                checkLastTagWas(0);
                this.recursionDepth--;
                popLimit(pushLimit);
                return t;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        public final void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (this.recursionDepth < this.recursionLimit) {
                int pushLimit = pushLimit(readRawVarint32);
                this.recursionDepth++;
                builder.mergeFrom((CodedInputStream) this, extensionRegistryLite);
                checkLastTagWas(0);
                this.recursionDepth--;
                popLimit(pushLimit);
                return;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        public final boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException {
            switch (WireFormat.getTagWireType(i)) {
                case 0:
                    long readInt64 = readInt64();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeUInt64NoTag(readInt64);
                    return true;
                case 1:
                    long readRawLittleEndian64 = readRawLittleEndian64();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                    return true;
                case 2:
                    ByteString readBytes = readBytes();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeBytesNoTag(readBytes);
                    return true;
                case 3:
                    codedOutputStream.writeRawVarint32(i);
                    skipMessage(codedOutputStream);
                    int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
                    checkLastTagWas(makeTag);
                    codedOutputStream.writeRawVarint32(makeTag);
                    return true;
                case 4:
                    return false;
                case 5:
                    int readRawLittleEndian32 = readRawLittleEndian32();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                    return true;
                default:
                    throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        public final <T extends MessageLite> T readGroup(int i, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            if (this.recursionDepth < this.recursionLimit) {
                this.recursionDepth++;
                T t = (MessageLite) parser.parsePartialFrom((CodedInputStream) this, extensionRegistryLite);
                checkLastTagWas(WireFormat.makeTag(i, 4));
                this.recursionDepth--;
                return t;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        public final void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            if (this.recursionDepth < this.recursionLimit) {
                this.recursionDepth++;
                builder.mergeFrom((CodedInputStream) this, extensionRegistryLite);
                checkLastTagWas(WireFormat.makeTag(i, 4));
                this.recursionDepth--;
                return;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    static final class UnsafeDirectNioDecoder extends CodedInputStream {
        private final long address;
        private final ByteBuffer buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private long limit;
        private long pos;
        private long startPos;

        public final int getLastTag() {
            return this.lastTag;
        }

        static boolean isSupported() {
            return UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private int remaining() {
            return (int) (this.limit - this.pos);
        }

        public final int getTotalBytesRead() {
            return (int) (this.pos - this.startPos);
        }

        public final int readEnum() throws IOException {
            return readRawVarint32();
        }

        public final int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        public final long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        public final int readInt32() throws IOException {
            return readRawVarint32();
        }

        public final long readInt64() throws IOException {
            return readRawVarint64();
        }

        public final int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        public final long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        public final int readUInt32() throws IOException {
            return readRawVarint32();
        }

        public final long readUInt64() throws IOException {
            return readRawVarint64();
        }

        public final void resetSizeCounter() {
            this.startPos = this.pos;
        }

        private void skipRawVarint() throws IOException {
            if (remaining() >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        public final boolean isAtEnd() throws IOException {
            if (this.pos == this.limit) {
                return true;
            }
            return false;
        }

        public final boolean readBool() throws IOException {
            if (readRawVarint64() != 0) {
                return true;
            }
            return false;
        }

        public final byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        public final int readSInt32() throws IOException {
            return decodeZigZag32(readRawVarint32());
        }

        public final long readSInt64() throws IOException {
            return decodeZigZag64(readRawVarint64());
        }

        public final void skipMessage() throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag));
        }

        private void skipRawVarintFastPath() throws IOException {
            int i = 0;
            while (i < 10) {
                long j = this.pos;
                this.pos = 1 + j;
                if (UnsafeUtil.getByte(j) < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws IOException {
            int i = 0;
            while (i < 10) {
                if (readRawByte() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public final int getBytesUntilLimit() {
            if (this.currentLimit == Integer.MAX_VALUE) {
                return -1;
            }
            return this.currentLimit - getTotalBytesRead();
        }

        public final byte readRawByte() throws IOException {
            if (this.pos != this.limit) {
                long j = this.pos;
                this.pos = 1 + j;
                return UnsafeUtil.getByte(j);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* access modifiers changed from: package-private */
        public final long readRawVarint64SlowPath() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte readRawByte = readRawByte();
                j |= ((long) (readRawByte & Byte.MAX_VALUE)) << i;
                if ((readRawByte & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public final int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            this.lastTag = readRawVarint32();
            if (WireFormat.getTagFieldNumber(this.lastTag) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        private void recomputeBufferSizeAfterLimit() {
            this.limit += (long) this.bufferSizeAfterLimit;
            int i = (int) (this.limit - this.startPos);
            if (i > this.currentLimit) {
                this.bufferSizeAfterLimit = i - this.currentLimit;
                this.limit -= (long) this.bufferSizeAfterLimit;
                return;
            }
            this.bufferSizeAfterLimit = 0;
        }

        public final int readRawLittleEndian32() throws IOException {
            long j = this.pos;
            if (this.limit - j >= 4) {
                this.pos = 4 + j;
                return ((UnsafeUtil.getByte(j + 3) & 255) << 24) | (UnsafeUtil.getByte(j) & 255) | ((UnsafeUtil.getByte(1 + j) & 255) << 8) | ((UnsafeUtil.getByte(2 + j) & 255) << 16);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        public final String readString() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
                byte[] bArr = new byte[readRawVarint32];
                long j = (long) readRawVarint32;
                UnsafeUtil.copyMemory(this.pos, bArr, 0, j);
                String str = new String(bArr, Internal.UTF_8);
                this.pos += j;
                return str;
            } else if (readRawVarint32 == 0) {
                return "";
            } else {
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        public final ByteBuffer readByteBuffer() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 <= 0 || readRawVarint32 > remaining()) {
                if (readRawVarint32 == 0) {
                    return Internal.EMPTY_BYTE_BUFFER;
                }
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (this.immutable || !this.enableAliasing) {
                byte[] bArr = new byte[readRawVarint32];
                long j = (long) readRawVarint32;
                UnsafeUtil.copyMemory(this.pos, bArr, 0, j);
                this.pos += j;
                return ByteBuffer.wrap(bArr);
            } else {
                long j2 = (long) readRawVarint32;
                ByteBuffer slice = slice(this.pos, this.pos + j2);
                this.pos += j2;
                return slice;
            }
        }

        public final ByteString readBytes() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 <= 0 || readRawVarint32 > remaining()) {
                if (readRawVarint32 == 0) {
                    return ByteString.EMPTY;
                }
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (!this.immutable || !this.enableAliasing) {
                byte[] bArr = new byte[readRawVarint32];
                long j = (long) readRawVarint32;
                UnsafeUtil.copyMemory(this.pos, bArr, 0, j);
                this.pos += j;
                return ByteString.wrap(bArr);
            } else {
                long j2 = (long) readRawVarint32;
                ByteBuffer slice = slice(this.pos, this.pos + j2);
                this.pos += j2;
                return ByteString.wrap(slice);
            }
        }

        public final long readRawLittleEndian64() throws IOException {
            long j = this.pos;
            if (this.limit - j >= 8) {
                this.pos = 8 + j;
                return ((((long) UnsafeUtil.getByte(j + 7)) & 255) << 56) | (((long) UnsafeUtil.getByte(j)) & 255) | ((((long) UnsafeUtil.getByte(1 + j)) & 255) << 8) | ((((long) UnsafeUtil.getByte(2 + j)) & 255) << 16) | ((((long) UnsafeUtil.getByte(3 + j)) & 255) << 24) | ((((long) UnsafeUtil.getByte(4 + j)) & 255) << 32) | ((((long) UnsafeUtil.getByte(5 + j)) & 255) << 40) | ((((long) UnsafeUtil.getByte(6 + j)) & 255) << 48);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        public final String readStringRequireUtf8() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 >= 0 && readRawVarint32 <= remaining()) {
                byte[] bArr = new byte[readRawVarint32];
                long j = (long) readRawVarint32;
                UnsafeUtil.copyMemory(this.pos, bArr, 0, j);
                if (Utf8.isValidUtf8(bArr)) {
                    String str = new String(bArr, Internal.UTF_8);
                    this.pos += j;
                    return str;
                }
                throw InvalidProtocolBufferException.invalidUtf8();
            } else if (readRawVarint32 == 0) {
                return "";
            } else {
                if (readRawVarint32 <= 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
            if (com.google.protobuf.UnsafeUtil.getByte(r4) >= 0) goto L_0x0085;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int readRawVarint32() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.pos
                long r2 = r10.limit
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 == 0) goto L_0x0088
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r0)
                if (r0 < 0) goto L_0x0015
                r10.pos = r4
                return r0
            L_0x0015:
                long r6 = r10.limit
                long r6 = r6 - r4
                r8 = 9
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 < 0) goto L_0x0088
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.getByte(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x002c
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0085
            L_0x002c:
                r1 = 0
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.getByte(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003c
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x003a:
                r6 = r4
                goto L_0x0085
            L_0x003c:
                r1 = 0
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.getByte(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x004d
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x0085
            L_0x004d:
                r1 = 0
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.getByte(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L_0x003a
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.getByte(r4)
                if (r1 >= 0) goto L_0x0085
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.getByte(r6)
                if (r1 >= 0) goto L_0x003a
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.getByte(r4)
                if (r1 >= 0) goto L_0x0085
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.getByte(r6)
                if (r1 >= 0) goto L_0x003a
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.getByte(r4)
                if (r1 < 0) goto L_0x0088
            L_0x0085:
                r10.pos = r6
                return r0
            L_0x0088:
                long r0 = r10.readRawVarint64SlowPath()
                int r0 = (int) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.UnsafeDirectNioDecoder.readRawVarint32():int");
        }

        public final long readRawVarint64() throws IOException {
            long j;
            long j2;
            long j3;
            long j4 = this.pos;
            if (this.limit != j4) {
                long j5 = j4 + 1;
                byte b2 = UnsafeUtil.getByte(j4);
                if (b2 >= 0) {
                    this.pos = j5;
                    return (long) b2;
                } else if (this.limit - j5 >= 9) {
                    long j6 = j5 + 1;
                    byte b3 = b2 ^ (UnsafeUtil.getByte(j5) << 7);
                    if (b3 < 0) {
                        j2 = (long) (b3 ^ Byte.MIN_VALUE);
                    } else {
                        j = j6 + 1;
                        byte b4 = b3 ^ (UnsafeUtil.getByte(j6) << 14);
                        if (b4 >= 0) {
                            j2 = (long) (b4 ^ 16256);
                        } else {
                            j6 = j + 1;
                            byte b5 = b4 ^ (UnsafeUtil.getByte(j) << 21);
                            if (b5 < 0) {
                                j2 = (long) (b5 ^ -2080896);
                            } else {
                                j = j6 + 1;
                                long j7 = ((long) b5) ^ (((long) UnsafeUtil.getByte(j6)) << 28);
                                if (j7 >= 0) {
                                    j2 = j7 ^ 266354560;
                                } else {
                                    long j8 = j + 1;
                                    long j9 = j7 ^ (((long) UnsafeUtil.getByte(j)) << 35);
                                    if (j9 < 0) {
                                        j3 = j9 ^ -34093383808L;
                                    } else {
                                        j = j8 + 1;
                                        long j10 = j9 ^ (((long) UnsafeUtil.getByte(j8)) << 42);
                                        if (j10 >= 0) {
                                            j2 = j10 ^ 4363953127296L;
                                        } else {
                                            j8 = j + 1;
                                            long j11 = j10 ^ (((long) UnsafeUtil.getByte(j)) << 49);
                                            if (j11 < 0) {
                                                j3 = j11 ^ -558586000294016L;
                                            } else {
                                                j = j8 + 1;
                                                j2 = (j11 ^ (((long) UnsafeUtil.getByte(j8)) << 56)) ^ 71499008037633920L;
                                                if (j2 < 0) {
                                                    long j12 = 1 + j;
                                                    if (((long) UnsafeUtil.getByte(j)) >= 0) {
                                                        j = j12;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = j8;
                                }
                            }
                        }
                        this.pos = j;
                        return j2;
                    }
                    j = j6;
                    this.pos = j;
                    return j2;
                }
            }
            return readRawVarint64SlowPath();
        }

        public final void enableAliasing(boolean z) {
            this.enableAliasing = z;
        }

        private int bufferPos(long j) {
            return (int) (j - this.address);
        }

        public final void popLimit(int i) {
            this.currentLimit = i;
            recomputeBufferSizeAfterLimit();
        }

        public final void checkLastTagWas(int i) throws InvalidProtocolBufferException {
            if (this.lastTag != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        public final int pushLimit(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int totalBytesRead = i + getTotalBytesRead();
                int i2 = this.currentLimit;
                if (totalBytesRead <= i2) {
                    this.currentLimit = totalBytesRead;
                    recomputeBufferSizeAfterLimit();
                    return i2;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        public final void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag, codedOutputStream));
        }

        public final void skipRawBytes(int i) throws IOException {
            if (i >= 0 && i <= remaining()) {
                this.pos += (long) i;
            } else if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        public final byte[] readRawBytes(int i) throws IOException {
            if (i >= 0 && i <= remaining()) {
                byte[] bArr = new byte[i];
                long j = (long) i;
                slice(this.pos, this.pos + j).get(bArr);
                this.pos += j;
                return bArr;
            } else if (i > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (i == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            } else {
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        public final boolean skipField(int i) throws IOException {
            switch (WireFormat.getTagWireType(i)) {
                case 0:
                    skipRawVarint();
                    return true;
                case 1:
                    skipRawBytes(8);
                    return true;
                case 2:
                    skipRawBytes(readRawVarint32());
                    return true;
                case 3:
                    skipMessage();
                    checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4));
                    return true;
                case 4:
                    return false;
                case 5:
                    skipRawBytes(4);
                    return true;
                default:
                    throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        @Deprecated
        public final void readUnknownGroup(int i, MessageLite.Builder builder) throws IOException {
            readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        private UnsafeDirectNioDecoder(ByteBuffer byteBuffer, boolean z) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = byteBuffer;
            this.address = UnsafeUtil.addressOffset(byteBuffer);
            this.limit = this.address + ((long) byteBuffer.limit());
            this.pos = this.address + ((long) byteBuffer.position());
            this.startPos = this.pos;
            this.immutable = z;
        }

        public final <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (this.recursionDepth < this.recursionLimit) {
                int pushLimit = pushLimit(readRawVarint32);
                this.recursionDepth++;
                T t = (MessageLite) parser.parsePartialFrom((CodedInputStream) this, extensionRegistryLite);
                checkLastTagWas(0);
                this.recursionDepth--;
                popLimit(pushLimit);
                return t;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
            throw r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x002f, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
            r3.buffer.position(r0);
            r3.buffer.limit(r1);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0031 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.nio.ByteBuffer slice(long r4, long r6) throws java.io.IOException {
            /*
                r3 = this;
                java.nio.ByteBuffer r0 = r3.buffer
                int r0 = r0.position()
                java.nio.ByteBuffer r1 = r3.buffer
                int r1 = r1.limit()
                java.nio.ByteBuffer r2 = r3.buffer     // Catch:{ IllegalArgumentException -> 0x0031 }
                int r4 = r3.bufferPos(r4)     // Catch:{ IllegalArgumentException -> 0x0031 }
                r2.position(r4)     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r4 = r3.buffer     // Catch:{ IllegalArgumentException -> 0x0031 }
                int r5 = r3.bufferPos(r6)     // Catch:{ IllegalArgumentException -> 0x0031 }
                r4.limit(r5)     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r4 = r3.buffer     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r4 = r4.slice()     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r5 = r3.buffer
                r5.position(r0)
                java.nio.ByteBuffer r5 = r3.buffer
                r5.limit(r1)
                return r4
            L_0x002f:
                r4 = move-exception
                goto L_0x0036
            L_0x0031:
                com.google.protobuf.InvalidProtocolBufferException r4 = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage()     // Catch:{ all -> 0x002f }
                throw r4     // Catch:{ all -> 0x002f }
            L_0x0036:
                java.nio.ByteBuffer r5 = r3.buffer
                r5.position(r0)
                java.nio.ByteBuffer r5 = r3.buffer
                r5.limit(r1)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.UnsafeDirectNioDecoder.slice(long, long):java.nio.ByteBuffer");
        }

        public final void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (this.recursionDepth < this.recursionLimit) {
                int pushLimit = pushLimit(readRawVarint32);
                this.recursionDepth++;
                builder.mergeFrom((CodedInputStream) this, extensionRegistryLite);
                checkLastTagWas(0);
                this.recursionDepth--;
                popLimit(pushLimit);
                return;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        public final boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException {
            switch (WireFormat.getTagWireType(i)) {
                case 0:
                    long readInt64 = readInt64();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeUInt64NoTag(readInt64);
                    return true;
                case 1:
                    long readRawLittleEndian64 = readRawLittleEndian64();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                    return true;
                case 2:
                    ByteString readBytes = readBytes();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeBytesNoTag(readBytes);
                    return true;
                case 3:
                    codedOutputStream.writeRawVarint32(i);
                    skipMessage(codedOutputStream);
                    int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
                    checkLastTagWas(makeTag);
                    codedOutputStream.writeRawVarint32(makeTag);
                    return true;
                case 4:
                    return false;
                case 5:
                    int readRawLittleEndian32 = readRawLittleEndian32();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                    return true;
                default:
                    throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        public final <T extends MessageLite> T readGroup(int i, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            if (this.recursionDepth < this.recursionLimit) {
                this.recursionDepth++;
                T t = (MessageLite) parser.parsePartialFrom((CodedInputStream) this, extensionRegistryLite);
                checkLastTagWas(WireFormat.makeTag(i, 4));
                this.recursionDepth--;
                return t;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }

        public final void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            if (this.recursionDepth < this.recursionLimit) {
                this.recursionDepth++;
                builder.mergeFrom((CodedInputStream) this, extensionRegistryLite);
                checkLastTagWas(WireFormat.makeTag(i, 4));
                this.recursionDepth--;
                return;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    public static int decodeZigZag32(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long decodeZigZag64(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    static void setProto3DiscardUnknownsByDefaultForTest() {
        proto3DiscardUnknownFieldsDefault = true;
    }

    static void setProto3KeepUnknownsByDefaultForTest() {
        proto3DiscardUnknownFieldsDefault = false;
    }

    public abstract void checkLastTagWas(int i) throws InvalidProtocolBufferException;

    /* access modifiers changed from: package-private */
    public final void discardUnknownFields() {
        this.explicitDiscardUnknownFields = true;
    }

    public abstract void enableAliasing(boolean z);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws IOException;

    public abstract void popLimit(int i);

    public abstract int pushLimit(int i) throws InvalidProtocolBufferException;

    public abstract boolean readBool() throws IOException;

    public abstract byte[] readByteArray() throws IOException;

    public abstract ByteBuffer readByteBuffer() throws IOException;

    public abstract ByteString readBytes() throws IOException;

    public abstract double readDouble() throws IOException;

    public abstract int readEnum() throws IOException;

    public abstract int readFixed32() throws IOException;

    public abstract long readFixed64() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract <T extends MessageLite> T readGroup(int i, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract int readInt32() throws IOException;

    public abstract long readInt64() throws IOException;

    public abstract <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract byte readRawByte() throws IOException;

    public abstract byte[] readRawBytes(int i) throws IOException;

    public abstract int readRawLittleEndian32() throws IOException;

    public abstract long readRawLittleEndian64() throws IOException;

    public abstract int readRawVarint32() throws IOException;

    public abstract long readRawVarint64() throws IOException;

    /* access modifiers changed from: package-private */
    public abstract long readRawVarint64SlowPath() throws IOException;

    public abstract int readSFixed32() throws IOException;

    public abstract long readSFixed64() throws IOException;

    public abstract int readSInt32() throws IOException;

    public abstract long readSInt64() throws IOException;

    public abstract String readString() throws IOException;

    public abstract String readStringRequireUtf8() throws IOException;

    public abstract int readTag() throws IOException;

    public abstract int readUInt32() throws IOException;

    public abstract long readUInt64() throws IOException;

    @Deprecated
    public abstract void readUnknownGroup(int i, MessageLite.Builder builder) throws IOException;

    public abstract void resetSizeCounter();

    public abstract boolean skipField(int i) throws IOException;

    @Deprecated
    public abstract boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException;

    public abstract void skipMessage() throws IOException;

    public abstract void skipMessage(CodedOutputStream codedOutputStream) throws IOException;

    public abstract void skipRawBytes(int i) throws IOException;

    /* access modifiers changed from: package-private */
    public final void unsetDiscardUnknownFields() {
        this.explicitDiscardUnknownFields = false;
    }

    static boolean getProto3DiscardUnknownFieldsDefault() {
        return proto3DiscardUnknownFieldsDefault;
    }

    /* access modifiers changed from: package-private */
    public final boolean shouldDiscardUnknownFields() {
        return this.explicitDiscardUnknownFields;
    }

    private CodedInputStream() {
        this.recursionLimit = 100;
        this.sizeLimit = Integer.MAX_VALUE;
    }

    /* access modifiers changed from: package-private */
    public final boolean shouldDiscardUnknownFieldsProto3() {
        if (this.explicitDiscardUnknownFields) {
            return true;
        }
        return proto3DiscardUnknownFieldsDefault;
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return newInstance(inputStream, 4096);
    }

    public static CodedInputStream newInstance(Iterable<ByteBuffer> iterable) {
        if (!UnsafeDirectNioDecoder.isSupported()) {
            return newInstance((InputStream) new IterableByteBufferInputStream(iterable));
        }
        return newInstance(iterable, false);
    }

    static int readRawVarint32(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return readRawVarint32(read, inputStream);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public final int setRecursionLimit(int i) {
        if (i >= 0) {
            int i2 = this.recursionLimit;
            this.recursionLimit = i;
            return i2;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + i);
    }

    public final int setSizeLimit(int i) {
        if (i >= 0) {
            int i2 = this.sizeLimit;
            this.sizeLimit = i;
            return i2;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i);
    }

    public static CodedInputStream newInstance(ByteBuffer byteBuffer) {
        return newInstance(byteBuffer, false);
    }

    public static CodedInputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    static CodedInputStream newInstance(InputStream inputStream, int i) {
        if (inputStream == null) {
            return newInstance(Internal.EMPTY_BYTE_ARRAY);
        }
        return new StreamDecoder(inputStream, i);
    }

    static CodedInputStream newInstance(Iterable<ByteBuffer> iterable, boolean z) {
        int i = 0;
        boolean z2 = false;
        for (ByteBuffer next : iterable) {
            i += next.remaining();
            if (next.hasArray()) {
                z2 |= true;
            } else if (next.isDirect()) {
                z2 |= true;
            } else {
                z2 |= true;
            }
        }
        if (z2) {
            return new IterableDirectByteBufferDecoder(iterable, i, z);
        }
        return newInstance((InputStream) new IterableByteBufferInputStream(iterable));
    }

    public static int readRawVarint32(int i, InputStream inputStream) throws IOException {
        if ((i & SearchJediMixFeedAdapter.f42517f) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read != -1) {
                i2 |= (read & 127) << i3;
                if ((read & SearchJediMixFeedAdapter.f42517f) == 0) {
                    return i2;
                }
                i3 += 7;
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if ((read2 & SearchJediMixFeedAdapter.f42517f) == 0) {
                return i2;
            } else {
                i3 += 7;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    static CodedInputStream newInstance(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return newInstance(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && UnsafeDirectNioDecoder.isSupported()) {
            return new UnsafeDirectNioDecoder(byteBuffer, z);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.duplicate().get(bArr);
        return newInstance(bArr, 0, bArr.length, true);
    }

    public static CodedInputStream newInstance(byte[] bArr, int i, int i2) {
        return newInstance(bArr, i, i2, false);
    }

    static CodedInputStream newInstance(byte[] bArr, int i, int i2, boolean z) {
        ArrayDecoder arrayDecoder = new ArrayDecoder(bArr, i, i2, z);
        try {
            arrayDecoder.pushLimit(i2);
            return arrayDecoder;
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
