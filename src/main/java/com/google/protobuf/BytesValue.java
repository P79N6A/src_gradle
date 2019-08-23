package com.google.protobuf;

import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class BytesValue extends GeneratedMessageV3 implements BytesValueOrBuilder {
    private static final BytesValue DEFAULT_INSTANCE = new BytesValue();
    public static final Parser<BytesValue> PARSER = new AbstractParser<BytesValue>() {
        public final BytesValue parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new BytesValue(codedInputStream, extensionRegistryLite);
        }
    };
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    public ByteString value_;

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BytesValueOrBuilder {
        private ByteString value_;

        private void maybeForceBuilderInitialization() {
        }

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WrappersProto.internal_static_google_protobuf_BytesValue_descriptor;
        }

        public final Descriptors.Descriptor getDescriptorForType() {
            return WrappersProto.internal_static_google_protobuf_BytesValue_descriptor;
        }

        public final ByteString getValue() {
            return this.value_;
        }

        public final BytesValue getDefaultInstanceForType() {
            return BytesValue.getDefaultInstance();
        }

        private Builder() {
            this.value_ = ByteString.EMPTY;
            maybeForceBuilderInitialization();
        }

        public final BytesValue build() {
            BytesValue buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public final BytesValue buildPartial() {
            BytesValue bytesValue = new BytesValue((GeneratedMessageV3.Builder) this);
            bytesValue.value_ = this.value_;
            onBuilt();
            return bytesValue;
        }

        public final Builder clear() {
            super.clear();
            this.value_ = ByteString.EMPTY;
            return this;
        }

        public final Builder clearValue() {
            this.value_ = BytesValue.getDefaultInstance().getValue();
            onChanged();
            return this;
        }

        /* access modifiers changed from: protected */
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WrappersProto.internal_static_google_protobuf_BytesValue_fieldAccessorTable.ensureFieldAccessorsInitialized(BytesValue.class, Builder.class);
        }

        public final Builder clone() {
            return (Builder) super.clone();
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

        public final Builder setValue(ByteString byteString) {
            if (byteString != null) {
                this.value_ = byteString;
                onChanged();
                return this;
            }
            throw new NullPointerException();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.value_ = ByteString.EMPTY;
            maybeForceBuilderInitialization();
        }

        public final Builder mergeFrom(BytesValue bytesValue) {
            if (bytesValue == BytesValue.getDefaultInstance()) {
                return this;
            }
            if (bytesValue.getValue() != ByteString.EMPTY) {
                setValue(bytesValue.getValue());
            }
            mergeUnknownFields(bytesValue.unknownFields);
            onChanged();
            return this;
        }

        public final Builder mergeFrom(Message message) {
            if (message instanceof BytesValue) {
                return mergeFrom((BytesValue) message);
            }
            super.mergeFrom(message);
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
        public final com.google.protobuf.BytesValue.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser<com.google.protobuf.BytesValue> r1 = com.google.protobuf.BytesValue.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                com.google.protobuf.BytesValue r3 = (com.google.protobuf.BytesValue) r3     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                if (r3 == 0) goto L_0x000e
                r2.mergeFrom((com.google.protobuf.BytesValue) r3)
            L_0x000e:
                return r2
            L_0x000f:
                r3 = move-exception
                goto L_0x001f
            L_0x0011:
                r3 = move-exception
                com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x000f }
                com.google.protobuf.BytesValue r4 = (com.google.protobuf.BytesValue) r4     // Catch:{ all -> 0x000f }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001d }
                throw r3     // Catch:{ all -> 0x001d }
            L_0x001d:
                r3 = move-exception
                r0 = r4
            L_0x001f:
                if (r0 == 0) goto L_0x0024
                r2.mergeFrom((com.google.protobuf.BytesValue) r0)
            L_0x0024:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.BytesValue.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.BytesValue$Builder");
        }

        public final Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
        }
    }

    public static BytesValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return WrappersProto.internal_static_google_protobuf_BytesValue_descriptor;
    }

    public static Parser<BytesValue> parser() {
        return PARSER;
    }

    public final BytesValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public final Parser<BytesValue> getParserForType() {
        return PARSER;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    public final ByteString getValue() {
        return this.value_;
    }

    public static BytesValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BytesValue) PARSER.parseFrom(bArr);
    }

    public static BytesValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BytesValue) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public final Builder newBuilderForType() {
        return newBuilder();
    }

    private BytesValue() {
        this.memoizedIsInitialized = -1;
        this.value_ = ByteString.EMPTY;
    }

    /* access modifiers changed from: protected */
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return WrappersProto.internal_static_google_protobuf_BytesValue_fieldAccessorTable.ensureFieldAccessorsInitialized(BytesValue.class, Builder.class);
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

    public final Builder toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new Builder();
        }
        return new Builder().mergeFrom(this);
    }

    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.value_.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeBytesSize(1, this.value_);
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public final int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((getDescriptor().hashCode() + 779) * 37) + 1) * 53) + getValue().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    private BytesValue(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    public static Builder newBuilder(BytesValue bytesValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(bytesValue);
    }

    public static BytesValue of(ByteString byteString) {
        return newBuilder().setValue(byteString).build();
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BytesValue) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static BytesValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BytesValue) PARSER.parseFrom(byteString);
    }

    /* access modifiers changed from: protected */
    public final Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.value_.isEmpty()) {
            codedOutputStream.writeBytes(1, this.value_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static BytesValue parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BytesValue) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BytesValue)) {
            return super.equals(obj);
        }
        BytesValue bytesValue = (BytesValue) obj;
        if (!getValue().equals(bytesValue.getValue()) || !this.unknownFields.equals(bytesValue.unknownFields)) {
            z = false;
        }
        return z;
    }

    public static BytesValue parseFrom(InputStream inputStream) throws IOException {
        return (BytesValue) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BytesValue) PARSER.parseFrom(byteBuffer);
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BytesValue) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BytesValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BytesValue) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    private BytesValue(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            this.value_ = codedInputStream.readBytes();
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

    public static BytesValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BytesValue) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public static BytesValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BytesValue) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BytesValue) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }
}
