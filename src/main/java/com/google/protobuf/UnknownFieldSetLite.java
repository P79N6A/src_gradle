package com.google.protobuf;

import java.io.IOException;
import java.util.Arrays;

public final class UnknownFieldSetLite {
    private static final UnknownFieldSetLite DEFAULT_INSTANCE = new UnknownFieldSetLite(0, new int[0], new Object[0], false);
    private int count;
    private boolean isMutable;
    private int memoizedSerializedSize;
    private Object[] objects;
    private int[] tags;

    public final void makeImmutable() {
        this.isMutable = false;
    }

    public static UnknownFieldSetLite getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    static UnknownFieldSetLite newInstance() {
        return new UnknownFieldSetLite();
    }

    private UnknownFieldSetLite() {
        this(0, new int[8], new Object[8], true);
    }

    /* access modifiers changed from: package-private */
    public final void checkMutable() {
        if (!this.isMutable) {
            throw new UnsupportedOperationException();
        }
    }

    public final int hashCode() {
        return ((((this.count + 527) * 31) + Arrays.hashCode(this.tags)) * 31) + Arrays.deepHashCode(this.objects);
    }

    private void ensureCapacity() {
        int i;
        if (this.count == this.tags.length) {
            if (this.count < 4) {
                i = 8;
            } else {
                i = this.count >> 1;
            }
            int i2 = this.count + i;
            this.tags = Arrays.copyOf(this.tags, i2);
            this.objects = Arrays.copyOf(this.objects, i2);
        }
    }

    public final int getSerializedSizeAsMessageSet() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            i2 += CodedOutputStream.computeRawMessageSetExtensionSize(WireFormat.getTagFieldNumber(this.tags[i3]), (ByteString) this.objects[i3]);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public final int getSerializedSize() {
        int i;
        int i2 = this.memoizedSerializedSize;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.count; i4++) {
            int i5 = this.tags[i4];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i5);
            int tagWireType = WireFormat.getTagWireType(i5);
            if (tagWireType != 5) {
                switch (tagWireType) {
                    case 0:
                        i = CodedOutputStream.computeUInt64Size(tagFieldNumber, ((Long) this.objects[i4]).longValue());
                        break;
                    case 1:
                        i = CodedOutputStream.computeFixed64Size(tagFieldNumber, ((Long) this.objects[i4]).longValue());
                        break;
                    case 2:
                        i = CodedOutputStream.computeBytesSize(tagFieldNumber, (ByteString) this.objects[i4]);
                        break;
                    case 3:
                        i = (CodedOutputStream.computeTagSize(tagFieldNumber) * 2) + ((UnknownFieldSetLite) this.objects[i4]).getSerializedSize();
                        break;
                    default:
                        throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
                }
            } else {
                i = CodedOutputStream.computeFixed32Size(tagFieldNumber, ((Integer) this.objects[i4]).intValue());
            }
            i3 += i;
        }
        this.memoizedSerializedSize = i3;
        return i3;
    }

    private UnknownFieldSetLite mergeFrom(CodedInputStream codedInputStream) throws IOException {
        int readTag;
        do {
            readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            }
        } while (mergeFieldFrom(readTag, codedInputStream));
        return this;
    }

    public final void writeAsMessageSetTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.count; i++) {
            codedOutputStream.writeRawMessageSetExtension(WireFormat.getTagFieldNumber(this.tags[i]), (ByteString) this.objects[i]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnknownFieldSetLite)) {
            return false;
        }
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        if (this.count != unknownFieldSetLite.count || !equals(this.tags, unknownFieldSetLite.tags, this.count) || !equals(this.objects, unknownFieldSetLite.objects, this.count)) {
            return false;
        }
        return true;
    }

    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.count; i++) {
            int i2 = this.tags[i];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i2);
            int tagWireType = WireFormat.getTagWireType(i2);
            if (tagWireType != 5) {
                switch (tagWireType) {
                    case 0:
                        codedOutputStream.writeUInt64(tagFieldNumber, ((Long) this.objects[i]).longValue());
                        break;
                    case 1:
                        codedOutputStream.writeFixed64(tagFieldNumber, ((Long) this.objects[i]).longValue());
                        break;
                    case 2:
                        codedOutputStream.writeBytes(tagFieldNumber, (ByteString) this.objects[i]);
                        break;
                    case 3:
                        codedOutputStream.writeTag(tagFieldNumber, 3);
                        ((UnknownFieldSetLite) this.objects[i]).writeTo(codedOutputStream);
                        codedOutputStream.writeTag(tagFieldNumber, 4);
                        break;
                    default:
                        throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                codedOutputStream.writeFixed32(tagFieldNumber, ((Integer) this.objects[i]).intValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final UnknownFieldSetLite mergeLengthDelimitedField(int i, ByteString byteString) {
        checkMutable();
        if (i != 0) {
            storeField(WireFormat.makeTag(i, 2), byteString);
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* access modifiers changed from: package-private */
    public final UnknownFieldSetLite mergeVarintField(int i, int i2) {
        checkMutable();
        if (i != 0) {
            storeField(WireFormat.makeTag(i, 0), Long.valueOf((long) i2));
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* access modifiers changed from: package-private */
    public final void printWithIndent(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            MessageLiteToString.printField(sb, i, String.valueOf(WireFormat.getTagFieldNumber(this.tags[i2])), this.objects[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void storeField(int i, Object obj) {
        checkMutable();
        ensureCapacity();
        this.tags[this.count] = i;
        this.objects[this.count] = obj;
        this.count++;
    }

    static UnknownFieldSetLite mutableCopyOf(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        int i = unknownFieldSetLite.count + unknownFieldSetLite2.count;
        int[] copyOf = Arrays.copyOf(unknownFieldSetLite.tags, i);
        System.arraycopy(unknownFieldSetLite2.tags, 0, copyOf, unknownFieldSetLite.count, unknownFieldSetLite2.count);
        Object[] copyOf2 = Arrays.copyOf(unknownFieldSetLite.objects, i);
        System.arraycopy(unknownFieldSetLite2.objects, 0, copyOf2, unknownFieldSetLite.count, unknownFieldSetLite2.count);
        return new UnknownFieldSetLite(i, copyOf, copyOf2, true);
    }

    /* access modifiers changed from: package-private */
    public final boolean mergeFieldFrom(int i, CodedInputStream codedInputStream) throws IOException {
        checkMutable();
        int tagFieldNumber = WireFormat.getTagFieldNumber(i);
        switch (WireFormat.getTagWireType(i)) {
            case 0:
                storeField(i, Long.valueOf(codedInputStream.readInt64()));
                return true;
            case 1:
                storeField(i, Long.valueOf(codedInputStream.readFixed64()));
                return true;
            case 2:
                storeField(i, codedInputStream.readBytes());
                return true;
            case 3:
                UnknownFieldSetLite unknownFieldSetLite = new UnknownFieldSetLite();
                unknownFieldSetLite.mergeFrom(codedInputStream);
                codedInputStream.checkLastTagWas(WireFormat.makeTag(tagFieldNumber, 4));
                storeField(i, unknownFieldSetLite);
                return true;
            case 4:
                return false;
            case 5:
                storeField(i, Integer.valueOf(codedInputStream.readFixed32()));
                return true;
            default:
                throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    private static boolean equals(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static boolean equals(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    private UnknownFieldSetLite(int i, int[] iArr, Object[] objArr, boolean z) {
        this.memoizedSerializedSize = -1;
        this.count = i;
        this.tags = iArr;
        this.objects = objArr;
        this.isMutable = z;
    }
}
