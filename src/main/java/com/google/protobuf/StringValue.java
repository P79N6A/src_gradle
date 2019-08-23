package com.google.protobuf;

import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class StringValue extends GeneratedMessageV3 implements StringValueOrBuilder {
    private static final StringValue DEFAULT_INSTANCE = new StringValue();
    public static final Parser<StringValue> PARSER = new AbstractParser<StringValue>() {
        public final StringValue parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new StringValue(codedInputStream, extensionRegistryLite);
        }
    };
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    public volatile Object value_;

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StringValueOrBuilder {
        private Object value_;

        private void maybeForceBuilderInitialization() {
        }

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WrappersProto.internal_static_google_protobuf_StringValue_descriptor;
        }

        public final Descriptors.Descriptor getDescriptorForType() {
            return WrappersProto.internal_static_google_protobuf_StringValue_descriptor;
        }

        private Builder() {
            this.value_ = "";
            maybeForceBuilderInitialization();
        }

        public final Builder clearValue() {
            this.value_ = StringValue.getDefaultInstance().getValue();
            onChanged();
            return this;
        }

        /* access modifiers changed from: protected */
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WrappersProto.internal_static_google_protobuf_StringValue_fieldAccessorTable.ensureFieldAccessorsInitialized(StringValue.class, Builder.class);
        }

        public final StringValue build() {
            StringValue buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public final StringValue buildPartial() {
            StringValue stringValue = new StringValue((GeneratedMessageV3.Builder) this);
            stringValue.value_ = this.value_;
            onBuilt();
            return stringValue;
        }

        public final StringValue getDefaultInstanceForType() {
            return StringValue.getDefaultInstance();
        }

        public final String getValue() {
            Object obj = this.value_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.value_ = stringUtf8;
            return stringUtf8;
        }

        public final ByteString getValueBytes() {
            Object obj = this.value_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.value_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final Builder clear() {
            super.clear();
            this.value_ = "";
            return this;
        }

        public final Builder clone() {
            return (Builder) super.clone();
        }

        public final Builder setValue(String str) {
            if (str != null) {
                this.value_ = str;
                onChanged();
                return this;
            }
            throw new NullPointerException();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.value_ = "";
            maybeForceBuilderInitialization();
        }

        public final Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
        }

        public final Builder setValueBytes(ByteString byteString) {
            if (byteString != null) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.value_ = byteString;
                onChanged();
                return this;
            }
            throw new NullPointerException();
        }

        public final Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }

        public final Builder mergeFrom(Message message) {
            if (message instanceof StringValue) {
                return mergeFrom((StringValue) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public final Builder mergeFrom(StringValue stringValue) {
            if (stringValue == StringValue.getDefaultInstance()) {
                return this;
            }
            if (!stringValue.getValue().isEmpty()) {
                this.value_ = stringValue.value_;
                onChanged();
            }
            mergeUnknownFields(stringValue.unknownFields);
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
        public final com.google.protobuf.StringValue.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser<com.google.protobuf.StringValue> r1 = com.google.protobuf.StringValue.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                com.google.protobuf.StringValue r3 = (com.google.protobuf.StringValue) r3     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                if (r3 == 0) goto L_0x000e
                r2.mergeFrom((com.google.protobuf.StringValue) r3)
            L_0x000e:
                return r2
            L_0x000f:
                r3 = move-exception
                goto L_0x001f
            L_0x0011:
                r3 = move-exception
                com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x000f }
                com.google.protobuf.StringValue r4 = (com.google.protobuf.StringValue) r4     // Catch:{ all -> 0x000f }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001d }
                throw r3     // Catch:{ all -> 0x001d }
            L_0x001d:
                r3 = move-exception
                r0 = r4
            L_0x001f:
                if (r0 == 0) goto L_0x0024
                r2.mergeFrom((com.google.protobuf.StringValue) r0)
            L_0x0024:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.StringValue.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.StringValue$Builder");
        }

        public final Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
        }
    }

    public static StringValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return WrappersProto.internal_static_google_protobuf_StringValue_descriptor;
    }

    public static Parser<StringValue> parser() {
        return PARSER;
    }

    public final StringValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public final Parser<StringValue> getParserForType() {
        return PARSER;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    public static StringValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (StringValue) PARSER.parseFrom(bArr);
    }

    public static StringValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StringValue) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    private StringValue() {
        this.memoizedIsInitialized = -1;
        this.value_ = "";
    }

    /* access modifiers changed from: protected */
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return WrappersProto.internal_static_google_protobuf_StringValue_fieldAccessorTable.ensureFieldAccessorsInitialized(StringValue.class, Builder.class);
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

    public final String getValue() {
        Object obj = this.value_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.value_ = stringUtf8;
        return stringUtf8;
    }

    public final ByteString getValueBytes() {
        Object obj = this.value_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.value_ = copyFromUtf8;
        return copyFromUtf8;
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
        if (!getValueBytes().isEmpty()) {
            i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.value_);
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

    public final Builder newBuilderForType() {
        return newBuilder();
    }

    private StringValue(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    public static Builder newBuilder(StringValue stringValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(stringValue);
    }

    public static StringValue of(String str) {
        return newBuilder().setValue(str).build();
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StringValue) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static StringValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (StringValue) PARSER.parseFrom(byteString);
    }

    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getValueBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.value_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static StringValue parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (StringValue) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StringValue)) {
            return super.equals(obj);
        }
        StringValue stringValue = (StringValue) obj;
        if (!getValue().equals(stringValue.getValue()) || !this.unknownFields.equals(stringValue.unknownFields)) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public final Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static StringValue parseFrom(InputStream inputStream) throws IOException {
        return (StringValue) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (StringValue) PARSER.parseFrom(byteBuffer);
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StringValue) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static StringValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StringValue) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    private StringValue(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            this.value_ = codedInputStream.readStringRequireUtf8();
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

    public static StringValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StringValue) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public static StringValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StringValue) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StringValue) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }
}
