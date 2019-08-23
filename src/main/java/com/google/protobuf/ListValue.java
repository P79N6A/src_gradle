package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Value;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ListValue extends GeneratedMessageV3 implements ListValueOrBuilder {
    private static final ListValue DEFAULT_INSTANCE = new ListValue();
    public static final Parser<ListValue> PARSER = new AbstractParser<ListValue>() {
        public final ListValue parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new ListValue(codedInputStream, extensionRegistryLite);
        }
    };
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    public List<Value> values_;

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ListValueOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilderV3<Value, Value.Builder, ValueOrBuilder> valuesBuilder_;
        private List<Value> values_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return StructProto.internal_static_google_protobuf_ListValue_descriptor;
        }

        public final Descriptors.Descriptor getDescriptorForType() {
            return StructProto.internal_static_google_protobuf_ListValue_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                getValuesFieldBuilder();
            }
        }

        public final ListValue getDefaultInstanceForType() {
            return ListValue.getDefaultInstance();
        }

        private Builder() {
            this.values_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        public final Value.Builder addValuesBuilder() {
            return (Value.Builder) getValuesFieldBuilder().addBuilder(Value.getDefaultInstance());
        }

        public final ListValue build() {
            ListValue buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public final List<Value.Builder> getValuesBuilderList() {
            return getValuesFieldBuilder().getBuilderList();
        }

        /* access modifiers changed from: protected */
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StructProto.internal_static_google_protobuf_ListValue_fieldAccessorTable.ensureFieldAccessorsInitialized(ListValue.class, Builder.class);
        }

        private void ensureValuesIsMutable() {
            if ((this.bitField0_ & 1) != 1) {
                this.values_ = new ArrayList(this.values_);
                this.bitField0_ |= 1;
            }
        }

        public final Builder clear() {
            super.clear();
            if (this.valuesBuilder_ == null) {
                this.values_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                this.valuesBuilder_.clear();
            }
            return this;
        }

        public final Builder clearValues() {
            if (this.valuesBuilder_ == null) {
                this.values_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                this.valuesBuilder_.clear();
            }
            return this;
        }

        public final int getValuesCount() {
            if (this.valuesBuilder_ == null) {
                return this.values_.size();
            }
            return this.valuesBuilder_.getCount();
        }

        public final List<Value> getValuesList() {
            if (this.valuesBuilder_ == null) {
                return Collections.unmodifiableList(this.values_);
            }
            return this.valuesBuilder_.getMessageList();
        }

        public final List<? extends ValueOrBuilder> getValuesOrBuilderList() {
            if (this.valuesBuilder_ != null) {
                return this.valuesBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.values_);
        }

        private RepeatedFieldBuilderV3<Value, Value.Builder, ValueOrBuilder> getValuesFieldBuilder() {
            if (this.valuesBuilder_ == null) {
                List<Value> list = this.values_;
                boolean z = true;
                if ((this.bitField0_ & 1) != 1) {
                    z = false;
                }
                this.valuesBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                this.values_ = null;
            }
            return this.valuesBuilder_;
        }

        public final ListValue buildPartial() {
            ListValue listValue = new ListValue((GeneratedMessageV3.Builder) this);
            if (this.valuesBuilder_ == null) {
                if ((this.bitField0_ & 1) == 1) {
                    this.values_ = Collections.unmodifiableList(this.values_);
                    this.bitField0_ &= -2;
                }
                listValue.values_ = this.values_;
            } else {
                listValue.values_ = this.valuesBuilder_.build();
            }
            onBuilt();
            return listValue;
        }

        public final Builder clone() {
            return (Builder) super.clone();
        }

        public final Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public final Value.Builder getValuesBuilder(int i) {
            return (Value.Builder) getValuesFieldBuilder().getBuilder(i);
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.values_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        public final Builder addAllValues(Iterable<? extends Value> iterable) {
            if (this.valuesBuilder_ == null) {
                ensureValuesIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.values_);
                onChanged();
            } else {
                this.valuesBuilder_.addAllMessages(iterable);
            }
            return this;
        }

        public final Value.Builder addValuesBuilder(int i) {
            return (Value.Builder) getValuesFieldBuilder().addBuilder(i, Value.getDefaultInstance());
        }

        public final Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        public final Value getValues(int i) {
            if (this.valuesBuilder_ == null) {
                return this.values_.get(i);
            }
            return (Value) this.valuesBuilder_.getMessage(i);
        }

        public final ValueOrBuilder getValuesOrBuilder(int i) {
            if (this.valuesBuilder_ == null) {
                return this.values_.get(i);
            }
            return (ValueOrBuilder) this.valuesBuilder_.getMessageOrBuilder(i);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }

        public final Builder removeValues(int i) {
            if (this.valuesBuilder_ == null) {
                ensureValuesIsMutable();
                this.values_.remove(i);
                onChanged();
            } else {
                this.valuesBuilder_.remove(i);
            }
            return this;
        }

        public final Builder addValues(Value.Builder builder) {
            if (this.valuesBuilder_ == null) {
                ensureValuesIsMutable();
                this.values_.add(builder.build());
                onChanged();
            } else {
                this.valuesBuilder_.addMessage(builder.build());
            }
            return this;
        }

        public final Builder mergeFrom(ListValue listValue) {
            if (listValue == ListValue.getDefaultInstance()) {
                return this;
            }
            if (this.valuesBuilder_ == null) {
                if (!listValue.values_.isEmpty()) {
                    if (this.values_.isEmpty()) {
                        this.values_ = listValue.values_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureValuesIsMutable();
                        this.values_.addAll(listValue.values_);
                    }
                    onChanged();
                }
            } else if (!listValue.values_.isEmpty()) {
                if (this.valuesBuilder_.isEmpty()) {
                    this.valuesBuilder_.dispose();
                    RepeatedFieldBuilderV3<Value, Value.Builder, ValueOrBuilder> repeatedFieldBuilderV3 = null;
                    this.valuesBuilder_ = null;
                    this.values_ = listValue.values_;
                    this.bitField0_ &= -2;
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        repeatedFieldBuilderV3 = getValuesFieldBuilder();
                    }
                    this.valuesBuilder_ = repeatedFieldBuilderV3;
                } else {
                    this.valuesBuilder_.addAllMessages(listValue.values_);
                }
            }
            mergeUnknownFields(listValue.unknownFields);
            onChanged();
            return this;
        }

        public final Builder addValues(Value value) {
            if (this.valuesBuilder_ != null) {
                this.valuesBuilder_.addMessage(value);
            } else if (value != null) {
                ensureValuesIsMutable();
                this.values_.add(value);
                onChanged();
            } else {
                throw new NullPointerException();
            }
            return this;
        }

        public final Builder mergeFrom(Message message) {
            if (message instanceof ListValue) {
                return mergeFrom((ListValue) message);
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

        public final Builder addValues(int i, Value.Builder builder) {
            if (this.valuesBuilder_ == null) {
                ensureValuesIsMutable();
                this.values_.add(i, builder.build());
                onChanged();
            } else {
                this.valuesBuilder_.addMessage(i, builder.build());
            }
            return this;
        }

        public final Builder setValues(int i, Value.Builder builder) {
            if (this.valuesBuilder_ == null) {
                ensureValuesIsMutable();
                this.values_.set(i, builder.build());
                onChanged();
            } else {
                this.valuesBuilder_.setMessage(i, builder.build());
            }
            return this;
        }

        public final Builder addValues(int i, Value value) {
            if (this.valuesBuilder_ != null) {
                this.valuesBuilder_.addMessage(i, value);
            } else if (value != null) {
                ensureValuesIsMutable();
                this.values_.add(i, value);
                onChanged();
            } else {
                throw new NullPointerException();
            }
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.google.protobuf.ListValue.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser<com.google.protobuf.ListValue> r1 = com.google.protobuf.ListValue.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                com.google.protobuf.ListValue r3 = (com.google.protobuf.ListValue) r3     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                if (r3 == 0) goto L_0x000e
                r2.mergeFrom((com.google.protobuf.ListValue) r3)
            L_0x000e:
                return r2
            L_0x000f:
                r3 = move-exception
                goto L_0x001f
            L_0x0011:
                r3 = move-exception
                com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x000f }
                com.google.protobuf.ListValue r4 = (com.google.protobuf.ListValue) r4     // Catch:{ all -> 0x000f }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001d }
                throw r3     // Catch:{ all -> 0x001d }
            L_0x001d:
                r3 = move-exception
                r0 = r4
            L_0x001f:
                if (r0 == 0) goto L_0x0024
                r2.mergeFrom((com.google.protobuf.ListValue) r0)
            L_0x0024:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ListValue.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.ListValue$Builder");
        }

        public final Builder setValues(int i, Value value) {
            if (this.valuesBuilder_ != null) {
                this.valuesBuilder_.setMessage(i, value);
            } else if (value != null) {
                ensureValuesIsMutable();
                this.values_.set(i, value);
                onChanged();
            } else {
                throw new NullPointerException();
            }
            return this;
        }

        public final Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
        }
    }

    public static ListValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return StructProto.internal_static_google_protobuf_ListValue_descriptor;
    }

    public static Parser<ListValue> parser() {
        return PARSER;
    }

    public final ListValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public final Parser<ListValue> getParserForType() {
        return PARSER;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    public final List<Value> getValuesList() {
        return this.values_;
    }

    public final List<? extends ValueOrBuilder> getValuesOrBuilderList() {
        return this.values_;
    }

    public static ListValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ListValue) PARSER.parseFrom(bArr);
    }

    public static ListValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListValue) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public final int getValuesCount() {
        return this.values_.size();
    }

    public final Builder newBuilderForType() {
        return newBuilder();
    }

    private ListValue() {
        this.memoizedIsInitialized = -1;
        this.values_ = Collections.emptyList();
    }

    /* access modifiers changed from: protected */
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return StructProto.internal_static_google_protobuf_ListValue_fieldAccessorTable.ensureFieldAccessorsInitialized(ListValue.class, Builder.class);
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
        for (int i3 = 0; i3 < this.values_.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, this.values_.get(i3));
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public final int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = getDescriptor().hashCode() + 779;
        if (getValuesCount() > 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + getValuesList().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    private ListValue(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    public static Builder newBuilder(ListValue listValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(listValue);
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListValue) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ListValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListValue) PARSER.parseFrom(byteString);
    }

    public final Value getValues(int i) {
        return this.values_.get(i);
    }

    public final ValueOrBuilder getValuesOrBuilder(int i) {
        return this.values_.get(i);
    }

    /* access modifiers changed from: protected */
    public final Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.values_.size(); i++) {
            codedOutputStream.writeMessage(1, this.values_.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static ListValue parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListValue) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListValue)) {
            return super.equals(obj);
        }
        ListValue listValue = (ListValue) obj;
        if (!getValuesList().equals(listValue.getValuesList()) || !this.unknownFields.equals(listValue.unknownFields)) {
            z = false;
        }
        return z;
    }

    public static ListValue parseFrom(InputStream inputStream) throws IOException {
        return (ListValue) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListValue) PARSER.parseFrom(byteBuffer);
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListValue) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ListValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListValue) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static ListValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListValue) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    private ListValue(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            if (!z2 || !true) {
                                this.values_ = new ArrayList();
                                z2 |= true;
                            }
                            this.values_.add(codedInputStream.readMessage(Value.parser(), extensionRegistryLite));
                        } else if (!parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.values_ = Collections.unmodifiableList(this.values_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.values_ = Collections.unmodifiableList(this.values_);
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
            return;
        }
        throw new NullPointerException();
    }

    public static ListValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListValue) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListValue) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }
}
