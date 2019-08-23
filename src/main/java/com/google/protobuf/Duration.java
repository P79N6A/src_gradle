package com.google.protobuf;

import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Duration extends GeneratedMessageV3 implements DurationOrBuilder {
    private static final Duration DEFAULT_INSTANCE = new Duration();
    public static final Parser<Duration> PARSER = new AbstractParser<Duration>() {
        public final Duration parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Duration(codedInputStream, extensionRegistryLite);
        }
    };
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    public int nanos_;
    public long seconds_;

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DurationOrBuilder {
        private int nanos_;
        private long seconds_;

        private void maybeForceBuilderInitialization() {
        }

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DurationProto.internal_static_google_protobuf_Duration_descriptor;
        }

        public final Descriptors.Descriptor getDescriptorForType() {
            return DurationProto.internal_static_google_protobuf_Duration_descriptor;
        }

        public final int getNanos() {
            return this.nanos_;
        }

        public final long getSeconds() {
            return this.seconds_;
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        public final Builder clearNanos() {
            this.nanos_ = 0;
            onChanged();
            return this;
        }

        public final Builder clearSeconds() {
            this.seconds_ = 0;
            onChanged();
            return this;
        }

        public final Duration getDefaultInstanceForType() {
            return Duration.getDefaultInstance();
        }

        public final Duration build() {
            Duration buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public final Builder clear() {
            super.clear();
            this.seconds_ = 0;
            this.nanos_ = 0;
            return this;
        }

        /* access modifiers changed from: protected */
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DurationProto.internal_static_google_protobuf_Duration_fieldAccessorTable.ensureFieldAccessorsInitialized(Duration.class, Builder.class);
        }

        public final Duration buildPartial() {
            Duration duration = new Duration((GeneratedMessageV3.Builder) this);
            duration.seconds_ = this.seconds_;
            duration.nanos_ = this.nanos_;
            onBuilt();
            return duration;
        }

        public final Builder clone() {
            return (Builder) super.clone();
        }

        public final Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public final Builder setNanos(int i) {
            this.nanos_ = i;
            onChanged();
            return this;
        }

        public final Builder setSeconds(long j) {
            this.seconds_ = j;
            onChanged();
            return this;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            maybeForceBuilderInitialization();
        }

        public final Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }

        public final Builder mergeFrom(Duration duration) {
            if (duration == Duration.getDefaultInstance()) {
                return this;
            }
            if (duration.getSeconds() != 0) {
                setSeconds(duration.getSeconds());
            }
            if (duration.getNanos() != 0) {
                setNanos(duration.getNanos());
            }
            mergeUnknownFields(duration.unknownFields);
            onChanged();
            return this;
        }

        public final Builder mergeFrom(Message message) {
            if (message instanceof Duration) {
                return mergeFrom((Duration) message);
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
        public final com.google.protobuf.Duration.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser<com.google.protobuf.Duration> r1 = com.google.protobuf.Duration.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                com.google.protobuf.Duration r3 = (com.google.protobuf.Duration) r3     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                if (r3 == 0) goto L_0x000e
                r2.mergeFrom((com.google.protobuf.Duration) r3)
            L_0x000e:
                return r2
            L_0x000f:
                r3 = move-exception
                goto L_0x001f
            L_0x0011:
                r3 = move-exception
                com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x000f }
                com.google.protobuf.Duration r4 = (com.google.protobuf.Duration) r4     // Catch:{ all -> 0x000f }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001d }
                throw r3     // Catch:{ all -> 0x001d }
            L_0x001d:
                r3 = move-exception
                r0 = r4
            L_0x001f:
                if (r0 == 0) goto L_0x0024
                r2.mergeFrom((com.google.protobuf.Duration) r0)
            L_0x0024:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Duration.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.Duration$Builder");
        }

        public final Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
        }
    }

    public static Duration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return DurationProto.internal_static_google_protobuf_Duration_descriptor;
    }

    public static Parser<Duration> parser() {
        return PARSER;
    }

    public final Duration getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public final int getNanos() {
        return this.nanos_;
    }

    public final Parser<Duration> getParserForType() {
        return PARSER;
    }

    public final long getSeconds() {
        return this.seconds_;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    public static Duration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Duration) PARSER.parseFrom(bArr);
    }

    public static Duration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Duration) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    private Duration() {
        this.memoizedIsInitialized = -1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public final Builder newBuilderForType() {
        return newBuilder();
    }

    /* access modifiers changed from: protected */
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return DurationProto.internal_static_google_protobuf_Duration_fieldAccessorTable.ensureFieldAccessorsInitialized(Duration.class, Builder.class);
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
        if (this.seconds_ != 0) {
            i2 = 0 + CodedOutputStream.computeInt64Size(1, this.seconds_);
        }
        if (this.nanos_ != 0) {
            i2 += CodedOutputStream.computeInt32Size(2, this.nanos_);
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public final int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((getDescriptor().hashCode() + 779) * 37) + 1) * 53) + Internal.hashLong(getSeconds())) * 37) + 2) * 53) + getNanos()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    private Duration(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    public static Builder newBuilder(Duration duration) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(duration);
    }

    public static Duration parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Duration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Duration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Duration) PARSER.parseFrom(byteString);
    }

    /* access modifiers changed from: protected */
    public final Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.seconds_ != 0) {
            codedOutputStream.writeInt64(1, this.seconds_);
        }
        if (this.nanos_ != 0) {
            codedOutputStream.writeInt32(2, this.nanos_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static Duration parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Duration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return super.equals(obj);
        }
        Duration duration = (Duration) obj;
        if (getSeconds() == duration.getSeconds()) {
            z = true;
        } else {
            z = false;
        }
        if (!z || getNanos() != duration.getNanos()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 || !this.unknownFields.equals(duration.unknownFields)) {
            z3 = false;
        }
        return z3;
    }

    public static Duration parseFrom(InputStream inputStream) throws IOException {
        return (Duration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Duration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Duration) PARSER.parseFrom(byteBuffer);
    }

    public static Duration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Duration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Duration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Duration) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    private Duration(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.seconds_ = codedInputStream.readInt64();
                        } else if (readTag == 16) {
                            this.nanos_ = codedInputStream.readInt32();
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

    public static Duration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Duration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public static Duration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Duration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Duration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Duration) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }
}
