package com.google.protobuf;

import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UInt32Value extends GeneratedMessageV3 implements UInt32ValueOrBuilder {
    private static final UInt32Value DEFAULT_INSTANCE = new UInt32Value();
    public static final Parser<UInt32Value> PARSER = new AbstractParser<UInt32Value>() {
        public final UInt32Value parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new UInt32Value(codedInputStream, extensionRegistryLite);
        }
    };
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    public int value_;

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UInt32ValueOrBuilder {
        private int value_;

        private void maybeForceBuilderInitialization() {
        }

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WrappersProto.internal_static_google_protobuf_UInt32Value_descriptor;
        }

        public final Descriptors.Descriptor getDescriptorForType() {
            return WrappersProto.internal_static_google_protobuf_UInt32Value_descriptor;
        }

        public final int getValue() {
            return this.value_;
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        public final Builder clearValue() {
            this.value_ = 0;
            onChanged();
            return this;
        }

        /* access modifiers changed from: protected */
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WrappersProto.internal_static_google_protobuf_UInt32Value_fieldAccessorTable.ensureFieldAccessorsInitialized(UInt32Value.class, Builder.class);
        }

        public final UInt32Value build() {
            UInt32Value buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public final UInt32Value buildPartial() {
            UInt32Value uInt32Value = new UInt32Value((GeneratedMessageV3.Builder) this);
            uInt32Value.value_ = this.value_;
            onBuilt();
            return uInt32Value;
        }

        public final UInt32Value getDefaultInstanceForType() {
            return UInt32Value.getDefaultInstance();
        }

        public final Builder clear() {
            super.clear();
            this.value_ = 0;
            return this;
        }

        public final Builder clone() {
            return (Builder) super.clone();
        }

        public final Builder setValue(int i) {
            this.value_ = i;
            onChanged();
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            maybeForceBuilderInitialization();
        }

        public final Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
        }

        public final Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }

        public final Builder mergeFrom(Message message) {
            if (message instanceof UInt32Value) {
                return mergeFrom((UInt32Value) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public final Builder mergeFrom(UInt32Value uInt32Value) {
            if (uInt32Value == UInt32Value.getDefaultInstance()) {
                return this;
            }
            if (uInt32Value.getValue() != 0) {
                setValue(uInt32Value.getValue());
            }
            mergeUnknownFields(uInt32Value.unknownFields);
            onChanged();
            return this;
        }

        public final Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        public final Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.google.protobuf.UInt32Value.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser<com.google.protobuf.UInt32Value> r1 = com.google.protobuf.UInt32Value.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                com.google.protobuf.UInt32Value r3 = (com.google.protobuf.UInt32Value) r3     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                if (r3 == 0) goto L_0x000e
                r2.mergeFrom((com.google.protobuf.UInt32Value) r3)
            L_0x000e:
                return r2
            L_0x000f:
                r3 = move-exception
                goto L_0x001f
            L_0x0011:
                r3 = move-exception
                com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x000f }
                com.google.protobuf.UInt32Value r4 = (com.google.protobuf.UInt32Value) r4     // Catch:{ all -> 0x000f }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001d }
                throw r3     // Catch:{ all -> 0x001d }
            L_0x001d:
                r3 = move-exception
                r0 = r4
            L_0x001f:
                if (r0 == 0) goto L_0x0024
                r2.mergeFrom((com.google.protobuf.UInt32Value) r0)
            L_0x0024:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.UInt32Value.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.UInt32Value$Builder");
        }

        public final Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
        }
    }

    public static UInt32Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return WrappersProto.internal_static_google_protobuf_UInt32Value_descriptor;
    }

    public static Parser<UInt32Value> parser() {
        return PARSER;
    }

    public final UInt32Value getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public final Parser<UInt32Value> getParserForType() {
        return PARSER;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    public final int getValue() {
        return this.value_;
    }

    public static UInt32Value parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UInt32Value) PARSER.parseFrom(bArr);
    }

    public static UInt32Value parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UInt32Value) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    private UInt32Value() {
        this.memoizedIsInitialized = -1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return WrappersProto.internal_static_google_protobuf_UInt32Value_fieldAccessorTable.ensureFieldAccessorsInitialized(UInt32Value.class, Builder.class);
    }

    public final boolean isInitialized() {
        byte b2 = this.memoizedIsInitialized;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.value_ != 0) {
            i2 = 0 + CodedOutputStream.computeUInt32Size(1, this.value_);
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public final Builder toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new Builder();
        }
        return new Builder().mergeFrom(this);
    }

    public final int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((getDescriptor().hashCode() + 779) * 37) + 1) * 53) + getValue()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public final Builder newBuilderForType() {
        return newBuilder();
    }

    private UInt32Value(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    public static Builder newBuilder(UInt32Value uInt32Value) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(uInt32Value);
    }

    public static UInt32Value of(int i) {
        return newBuilder().setValue(i).build();
    }

    public static UInt32Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UInt32Value) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static UInt32Value parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UInt32Value) PARSER.parseFrom(byteString);
    }

    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.value_ != 0) {
            codedOutputStream.writeUInt32(1, this.value_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static UInt32Value parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UInt32Value) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UInt32Value)) {
            return super.equals(obj);
        }
        UInt32Value uInt32Value = (UInt32Value) obj;
        if (getValue() == uInt32Value.getValue()) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !this.unknownFields.equals(uInt32Value.unknownFields)) {
            z2 = false;
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    public final Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static UInt32Value parseFrom(InputStream inputStream) throws IOException {
        return (UInt32Value) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static UInt32Value parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UInt32Value) PARSER.parseFrom(byteBuffer);
    }

    public static UInt32Value parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UInt32Value) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static UInt32Value parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UInt32Value) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    private UInt32Value(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.value_ = codedInputStream.readUInt32();
                        } else if (!parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
            return;
        }
        throw new NullPointerException();
    }

    public static UInt32Value parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UInt32Value) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public static UInt32Value parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UInt32Value) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static UInt32Value parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UInt32Value) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }
}
