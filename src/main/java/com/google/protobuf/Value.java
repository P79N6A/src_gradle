package com.google.protobuf;

import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.ListValue;
import com.google.protobuf.Struct;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Value extends GeneratedMessageV3 implements ValueOrBuilder {
    private static final Value DEFAULT_INSTANCE = new Value();
    public static final Parser<Value> PARSER = new AbstractParser<Value>() {
        public final Value parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Value(codedInputStream, extensionRegistryLite);
        }
    };
    private static final long serialVersionUID = 0;
    public int kindCase_;
    public Object kind_;
    private byte memoizedIsInitialized;

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ValueOrBuilder {
        private int kindCase_;
        private Object kind_;
        private SingleFieldBuilderV3<ListValue, ListValue.Builder, ListValueOrBuilder> listValueBuilder_;
        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> structValueBuilder_;

        private void maybeForceBuilderInitialization() {
        }

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return StructProto.internal_static_google_protobuf_Value_descriptor;
        }

        public final Descriptors.Descriptor getDescriptorForType() {
            return StructProto.internal_static_google_protobuf_Value_descriptor;
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        public final KindCase getKindCase() {
            return KindCase.forNumber(this.kindCase_);
        }

        public final Builder clearBoolValue() {
            if (this.kindCase_ == 4) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public final Builder clearKind() {
            this.kindCase_ = 0;
            this.kind_ = null;
            onChanged();
            return this;
        }

        public final Builder clearNullValue() {
            if (this.kindCase_ == 1) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public final Builder clearNumberValue() {
            if (this.kindCase_ == 2) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public final Builder clearStringValue() {
            if (this.kindCase_ == 3) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public final boolean getBoolValue() {
            if (this.kindCase_ == 4) {
                return ((Boolean) this.kind_).booleanValue();
            }
            return false;
        }

        public final ListValue.Builder getListValueBuilder() {
            return (ListValue.Builder) getListValueFieldBuilder().getBuilder();
        }

        public final int getNullValueValue() {
            if (this.kindCase_ == 1) {
                return ((Integer) this.kind_).intValue();
            }
            return 0;
        }

        public final Struct.Builder getStructValueBuilder() {
            return (Struct.Builder) getStructValueFieldBuilder().getBuilder();
        }

        public final boolean hasListValue() {
            if (this.kindCase_ == 6) {
                return true;
            }
            return false;
        }

        public final boolean hasStructValue() {
            if (this.kindCase_ == 5) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StructProto.internal_static_google_protobuf_Value_fieldAccessorTable.ensureFieldAccessorsInitialized(Value.class, Builder.class);
        }

        public final Value build() {
            Value buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public final Value getDefaultInstanceForType() {
            return Value.getDefaultInstance();
        }

        public final ListValueOrBuilder getListValueOrBuilder() {
            if (this.kindCase_ == 6 && this.listValueBuilder_ != null) {
                return (ListValueOrBuilder) this.listValueBuilder_.getMessageOrBuilder();
            }
            if (this.kindCase_ == 6) {
                return (ListValue) this.kind_;
            }
            return ListValue.getDefaultInstance();
        }

        public final NullValue getNullValue() {
            if (this.kindCase_ != 1) {
                return NullValue.NULL_VALUE;
            }
            NullValue valueOf = NullValue.valueOf(((Integer) this.kind_).intValue());
            if (valueOf == null) {
                valueOf = NullValue.UNRECOGNIZED;
            }
            return valueOf;
        }

        public final double getNumberValue() {
            if (this.kindCase_ == 2) {
                return ((Double) this.kind_).doubleValue();
            }
            return 0.0d;
        }

        public final String getStringValue() {
            Object obj = "";
            if (this.kindCase_ == 3) {
                obj = this.kind_;
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            if (this.kindCase_ == 3) {
                this.kind_ = stringUtf8;
            }
            return stringUtf8;
        }

        public final ByteString getStringValueBytes() {
            Object obj = "";
            if (this.kindCase_ == 3) {
                obj = this.kind_;
            }
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            if (this.kindCase_ == 3) {
                this.kind_ = copyFromUtf8;
            }
            return copyFromUtf8;
        }

        public final StructOrBuilder getStructValueOrBuilder() {
            if (this.kindCase_ == 5 && this.structValueBuilder_ != null) {
                return (StructOrBuilder) this.structValueBuilder_.getMessageOrBuilder();
            }
            if (this.kindCase_ == 5) {
                return (Struct) this.kind_;
            }
            return Struct.getDefaultInstance();
        }

        private SingleFieldBuilderV3<ListValue, ListValue.Builder, ListValueOrBuilder> getListValueFieldBuilder() {
            if (this.listValueBuilder_ == null) {
                if (this.kindCase_ != 6) {
                    this.kind_ = ListValue.getDefaultInstance();
                }
                this.listValueBuilder_ = new SingleFieldBuilderV3<>((ListValue) this.kind_, getParentForChildren(), isClean());
                this.kind_ = null;
            }
            this.kindCase_ = 6;
            onChanged();
            return this.listValueBuilder_;
        }

        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getStructValueFieldBuilder() {
            if (this.structValueBuilder_ == null) {
                if (this.kindCase_ != 5) {
                    this.kind_ = Struct.getDefaultInstance();
                }
                this.structValueBuilder_ = new SingleFieldBuilderV3<>((Struct) this.kind_, getParentForChildren(), isClean());
                this.kind_ = null;
            }
            this.kindCase_ = 5;
            onChanged();
            return this.structValueBuilder_;
        }

        public final Builder clearListValue() {
            if (this.listValueBuilder_ != null) {
                if (this.kindCase_ == 6) {
                    this.kindCase_ = 0;
                    this.kind_ = null;
                }
                this.listValueBuilder_.clear();
            } else if (this.kindCase_ == 6) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public final Builder clearStructValue() {
            if (this.structValueBuilder_ != null) {
                if (this.kindCase_ == 5) {
                    this.kindCase_ = 0;
                    this.kind_ = null;
                }
                this.structValueBuilder_.clear();
            } else if (this.kindCase_ == 5) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public final ListValue getListValue() {
            if (this.listValueBuilder_ == null) {
                if (this.kindCase_ == 6) {
                    return (ListValue) this.kind_;
                }
                return ListValue.getDefaultInstance();
            } else if (this.kindCase_ == 6) {
                return (ListValue) this.listValueBuilder_.getMessage();
            } else {
                return ListValue.getDefaultInstance();
            }
        }

        public final Struct getStructValue() {
            if (this.structValueBuilder_ == null) {
                if (this.kindCase_ == 5) {
                    return (Struct) this.kind_;
                }
                return Struct.getDefaultInstance();
            } else if (this.kindCase_ == 5) {
                return (Struct) this.structValueBuilder_.getMessage();
            } else {
                return Struct.getDefaultInstance();
            }
        }

        public final Value buildPartial() {
            Value value = new Value((GeneratedMessageV3.Builder) this);
            if (this.kindCase_ == 1) {
                value.kind_ = this.kind_;
            }
            if (this.kindCase_ == 2) {
                value.kind_ = this.kind_;
            }
            if (this.kindCase_ == 3) {
                value.kind_ = this.kind_;
            }
            if (this.kindCase_ == 4) {
                value.kind_ = this.kind_;
            }
            if (this.kindCase_ == 5) {
                if (this.structValueBuilder_ == null) {
                    value.kind_ = this.kind_;
                } else {
                    value.kind_ = this.structValueBuilder_.build();
                }
            }
            if (this.kindCase_ == 6) {
                if (this.listValueBuilder_ == null) {
                    value.kind_ = this.kind_;
                } else {
                    value.kind_ = this.listValueBuilder_.build();
                }
            }
            value.kindCase_ = this.kindCase_;
            onBuilt();
            return value;
        }

        public final Builder clear() {
            super.clear();
            this.kindCase_ = 0;
            this.kind_ = null;
            return this;
        }

        public final Builder clone() {
            return (Builder) super.clone();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            maybeForceBuilderInitialization();
        }

        public final Builder setBoolValue(boolean z) {
            this.kindCase_ = 4;
            this.kind_ = Boolean.valueOf(z);
            onChanged();
            return this;
        }

        public final Builder setNullValueValue(int i) {
            this.kindCase_ = 1;
            this.kind_ = Integer.valueOf(i);
            onChanged();
            return this;
        }

        public final Builder setNumberValue(double d2) {
            this.kindCase_ = 2;
            this.kind_ = Double.valueOf(d2);
            onChanged();
            return this;
        }

        public final Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public final Builder setListValue(ListValue.Builder builder) {
            if (this.listValueBuilder_ == null) {
                this.kind_ = builder.build();
                onChanged();
            } else {
                this.listValueBuilder_.setMessage(builder.build());
            }
            this.kindCase_ = 6;
            return this;
        }

        public final Builder setNullValue(NullValue nullValue) {
            if (nullValue != null) {
                this.kindCase_ = 1;
                this.kind_ = Integer.valueOf(nullValue.getNumber());
                onChanged();
                return this;
            }
            throw new NullPointerException();
        }

        public final Builder setStringValue(String str) {
            if (str != null) {
                this.kindCase_ = 3;
                this.kind_ = str;
                onChanged();
                return this;
            }
            throw new NullPointerException();
        }

        public final Builder setStringValueBytes(ByteString byteString) {
            if (byteString != null) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.kindCase_ = 3;
                this.kind_ = byteString;
                onChanged();
                return this;
            }
            throw new NullPointerException();
        }

        public final Builder setStructValue(Struct.Builder builder) {
            if (this.structValueBuilder_ == null) {
                this.kind_ = builder.build();
                onChanged();
            } else {
                this.structValueBuilder_.setMessage(builder.build());
            }
            this.kindCase_ = 5;
            return this;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
        }

        public final Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        public final Builder mergeListValue(ListValue listValue) {
            if (this.listValueBuilder_ == null) {
                if (this.kindCase_ != 6 || this.kind_ == ListValue.getDefaultInstance()) {
                    this.kind_ = listValue;
                } else {
                    this.kind_ = ListValue.newBuilder((ListValue) this.kind_).mergeFrom(listValue).buildPartial();
                }
                onChanged();
            } else {
                if (this.kindCase_ == 6) {
                    this.listValueBuilder_.mergeFrom(listValue);
                }
                this.listValueBuilder_.setMessage(listValue);
            }
            this.kindCase_ = 6;
            return this;
        }

        public final Builder mergeStructValue(Struct struct) {
            if (this.structValueBuilder_ == null) {
                if (this.kindCase_ != 5 || this.kind_ == Struct.getDefaultInstance()) {
                    this.kind_ = struct;
                } else {
                    this.kind_ = Struct.newBuilder((Struct) this.kind_).mergeFrom(struct).buildPartial();
                }
                onChanged();
            } else {
                if (this.kindCase_ == 5) {
                    this.structValueBuilder_.mergeFrom(struct);
                }
                this.structValueBuilder_.setMessage(struct);
            }
            this.kindCase_ = 5;
            return this;
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }

        public final Builder setListValue(ListValue listValue) {
            if (this.listValueBuilder_ != null) {
                this.listValueBuilder_.setMessage(listValue);
            } else if (listValue != null) {
                this.kind_ = listValue;
                onChanged();
            } else {
                throw new NullPointerException();
            }
            this.kindCase_ = 6;
            return this;
        }

        public final Builder setStructValue(Struct struct) {
            if (this.structValueBuilder_ != null) {
                this.structValueBuilder_.setMessage(struct);
            } else if (struct != null) {
                this.kind_ = struct;
                onChanged();
            } else {
                throw new NullPointerException();
            }
            this.kindCase_ = 5;
            return this;
        }

        public final Builder mergeFrom(Message message) {
            if (message instanceof Value) {
                return mergeFrom((Value) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public final Builder mergeFrom(Value value) {
            if (value == Value.getDefaultInstance()) {
                return this;
            }
            switch (value.getKindCase()) {
                case NULL_VALUE:
                    setNullValueValue(value.getNullValueValue());
                    break;
                case NUMBER_VALUE:
                    setNumberValue(value.getNumberValue());
                    break;
                case STRING_VALUE:
                    this.kindCase_ = 3;
                    this.kind_ = value.kind_;
                    onChanged();
                    break;
                case BOOL_VALUE:
                    setBoolValue(value.getBoolValue());
                    break;
                case STRUCT_VALUE:
                    mergeStructValue(value.getStructValue());
                    break;
                case LIST_VALUE:
                    mergeListValue(value.getListValue());
                    break;
            }
            mergeUnknownFields(value.unknownFields);
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
        public final com.google.protobuf.Value.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser<com.google.protobuf.Value> r1 = com.google.protobuf.Value.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                com.google.protobuf.Value r3 = (com.google.protobuf.Value) r3     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                if (r3 == 0) goto L_0x000e
                r2.mergeFrom((com.google.protobuf.Value) r3)
            L_0x000e:
                return r2
            L_0x000f:
                r3 = move-exception
                goto L_0x001f
            L_0x0011:
                r3 = move-exception
                com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x000f }
                com.google.protobuf.Value r4 = (com.google.protobuf.Value) r4     // Catch:{ all -> 0x000f }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001d }
                throw r3     // Catch:{ all -> 0x001d }
            L_0x001d:
                r3 = move-exception
                r0 = r4
            L_0x001f:
                if (r0 == 0) goto L_0x0024
                r2.mergeFrom((com.google.protobuf.Value) r0)
            L_0x0024:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Value.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.Value$Builder");
        }

        public final Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
        }
    }

    public enum KindCase implements Internal.EnumLite {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);
        
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static KindCase valueOf(int i) {
            return forNumber(i);
        }

        public static KindCase forNumber(int i) {
            switch (i) {
                case 0:
                    return KIND_NOT_SET;
                case 1:
                    return NULL_VALUE;
                case 2:
                    return NUMBER_VALUE;
                case 3:
                    return STRING_VALUE;
                case 4:
                    return BOOL_VALUE;
                case 5:
                    return STRUCT_VALUE;
                case 6:
                    return LIST_VALUE;
                default:
                    return null;
            }
        }

        private KindCase(int i) {
            this.value = i;
        }
    }

    public static Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return StructProto.internal_static_google_protobuf_Value_descriptor;
    }

    public static Parser<Value> parser() {
        return PARSER;
    }

    public final Value getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public final Parser<Value> getParserForType() {
        return PARSER;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    public static Value parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Value) PARSER.parseFrom(bArr);
    }

    public static Value parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Value) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    private Value() {
        this.memoizedIsInitialized = -1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public final KindCase getKindCase() {
        return KindCase.forNumber(this.kindCase_);
    }

    public final boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    public final ListValue getListValue() {
        if (this.kindCase_ == 6) {
            return (ListValue) this.kind_;
        }
        return ListValue.getDefaultInstance();
    }

    public final ListValueOrBuilder getListValueOrBuilder() {
        if (this.kindCase_ == 6) {
            return (ListValue) this.kind_;
        }
        return ListValue.getDefaultInstance();
    }

    public final int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    public final Struct getStructValue() {
        if (this.kindCase_ == 5) {
            return (Struct) this.kind_;
        }
        return Struct.getDefaultInstance();
    }

    public final StructOrBuilder getStructValueOrBuilder() {
        if (this.kindCase_ == 5) {
            return (Struct) this.kind_;
        }
        return Struct.getDefaultInstance();
    }

    public final boolean hasListValue() {
        if (this.kindCase_ == 6) {
            return true;
        }
        return false;
    }

    public final boolean hasStructValue() {
        if (this.kindCase_ == 5) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return StructProto.internal_static_google_protobuf_Value_fieldAccessorTable.ensureFieldAccessorsInitialized(Value.class, Builder.class);
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

    public final NullValue getNullValue() {
        if (this.kindCase_ != 1) {
            return NullValue.NULL_VALUE;
        }
        NullValue valueOf = NullValue.valueOf(((Integer) this.kind_).intValue());
        if (valueOf == null) {
            valueOf = NullValue.UNRECOGNIZED;
        }
        return valueOf;
    }

    public final double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    public final String getStringValue() {
        Object obj = "";
        if (this.kindCase_ == 3) {
            obj = this.kind_;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        if (this.kindCase_ == 3) {
            this.kind_ = stringUtf8;
        }
        return stringUtf8;
    }

    public final ByteString getStringValueBytes() {
        Object obj = "";
        if (this.kindCase_ == 3) {
            obj = this.kind_;
        }
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        if (this.kindCase_ == 3) {
            this.kind_ = copyFromUtf8;
        }
        return copyFromUtf8;
    }

    public final Builder toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new Builder();
        }
        return new Builder().mergeFrom(this);
    }

    public final Builder newBuilderForType() {
        return newBuilder();
    }

    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.kindCase_ == 1) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, ((Integer) this.kind_).intValue());
        }
        if (this.kindCase_ == 2) {
            i2 += CodedOutputStream.computeDoubleSize(2, ((Double) this.kind_).doubleValue());
        }
        if (this.kindCase_ == 3) {
            i2 += GeneratedMessageV3.computeStringSize(3, this.kind_);
        }
        if (this.kindCase_ == 4) {
            i2 += CodedOutputStream.computeBoolSize(4, ((Boolean) this.kind_).booleanValue());
        }
        if (this.kindCase_ == 5) {
            i2 += CodedOutputStream.computeMessageSize(5, (Struct) this.kind_);
        }
        if (this.kindCase_ == 6) {
            i2 += CodedOutputStream.computeMessageSize(6, (ListValue) this.kind_);
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
        switch (this.kindCase_) {
            case 1:
                hashCode = (((hashCode * 37) + 1) * 53) + getNullValueValue();
                break;
            case 2:
                hashCode = (((hashCode * 37) + 2) * 53) + Internal.hashLong(Double.doubleToLongBits(getNumberValue()));
                break;
            case 3:
                hashCode = (((hashCode * 37) + 3) * 53) + getStringValue().hashCode();
                break;
            case 4:
                hashCode = (((hashCode * 37) + 4) * 53) + Internal.hashBoolean(getBoolValue());
                break;
            case 5:
                hashCode = (((hashCode * 37) + 5) * 53) + getStructValue().hashCode();
                break;
            case 6:
                hashCode = (((hashCode * 37) + 6) * 53) + getListValue().hashCode();
                break;
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    private Value(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    public static Builder newBuilder(Value value) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(value);
    }

    public static Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Value) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Value parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Value) PARSER.parseFrom(byteString);
    }

    public static Value parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Value) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    /* access modifiers changed from: protected */
    public final Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.kindCase_ == 1) {
            codedOutputStream.writeEnum(1, ((Integer) this.kind_).intValue());
        }
        if (this.kindCase_ == 2) {
            codedOutputStream.writeDouble(2, ((Double) this.kind_).doubleValue());
        }
        if (this.kindCase_ == 3) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.kind_);
        }
        if (this.kindCase_ == 4) {
            codedOutputStream.writeBool(4, ((Boolean) this.kind_).booleanValue());
        }
        if (this.kindCase_ == 5) {
            codedOutputStream.writeMessage(5, (Struct) this.kind_);
        }
        if (this.kindCase_ == 6) {
            codedOutputStream.writeMessage(6, (ListValue) this.kind_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static Value parseFrom(InputStream inputStream) throws IOException {
        return (Value) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (getBoolValue() == r8.getBoolValue()) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        if (java.lang.Double.doubleToLongBits(getNumberValue()) == java.lang.Double.doubleToLongBits(r8.getNumberValue())) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        if (getNullValueValue() == r8.getNullValueValue()) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        if (r1 == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0084, code lost:
        if (r7.unknownFields.equals(r8.unknownFields) == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0087, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0088, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.protobuf.Value
            if (r1 != 0) goto L_0x000d
            boolean r8 = super.equals(r8)
            return r8
        L_0x000d:
            com.google.protobuf.Value r8 = (com.google.protobuf.Value) r8
            com.google.protobuf.Value$KindCase r1 = r7.getKindCase()
            com.google.protobuf.Value$KindCase r2 = r8.getKindCase()
            boolean r1 = r1.equals(r2)
            r2 = 0
            if (r1 != 0) goto L_0x001f
            return r2
        L_0x001f:
            int r3 = r7.kindCase_
            switch(r3) {
                case 1: goto L_0x006f;
                case 2: goto L_0x005a;
                case 3: goto L_0x004d;
                case 4: goto L_0x003f;
                case 5: goto L_0x0032;
                case 6: goto L_0x0025;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x007a
        L_0x0025:
            com.google.protobuf.ListValue r1 = r7.getListValue()
            com.google.protobuf.ListValue r3 = r8.getListValue()
            boolean r1 = r1.equals(r3)
            goto L_0x007a
        L_0x0032:
            com.google.protobuf.Struct r1 = r7.getStructValue()
            com.google.protobuf.Struct r3 = r8.getStructValue()
            boolean r1 = r1.equals(r3)
            goto L_0x007a
        L_0x003f:
            boolean r1 = r7.getBoolValue()
            boolean r3 = r8.getBoolValue()
            if (r1 != r3) goto L_0x004b
        L_0x0049:
            r1 = 1
            goto L_0x007a
        L_0x004b:
            r1 = 0
            goto L_0x007a
        L_0x004d:
            java.lang.String r1 = r7.getStringValue()
            java.lang.String r3 = r8.getStringValue()
            boolean r1 = r1.equals(r3)
            goto L_0x007a
        L_0x005a:
            double r3 = r7.getNumberValue()
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = r8.getNumberValue()
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x004b
            goto L_0x0049
        L_0x006f:
            int r1 = r7.getNullValueValue()
            int r3 = r8.getNullValueValue()
            if (r1 != r3) goto L_0x004b
            goto L_0x0049
        L_0x007a:
            if (r1 == 0) goto L_0x0087
            com.google.protobuf.UnknownFieldSet r1 = r7.unknownFields
            com.google.protobuf.UnknownFieldSet r8 = r8.unknownFields
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0087
            goto L_0x0088
        L_0x0087:
            r0 = 0
        L_0x0088:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Value.equals(java.lang.Object):boolean");
    }

    public static Value parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Value) PARSER.parseFrom(byteBuffer);
    }

    public static Value parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Value) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Value parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Value) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Value parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Value) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.google.protobuf.Struct$Builder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.google.protobuf.ListValue$Builder} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private Value(com.google.protobuf.CodedInputStream r7, com.google.protobuf.ExtensionRegistryLite r8) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            r6 = this;
            r6.<init>()
            if (r8 == 0) goto L_0x00e7
            com.google.protobuf.UnknownFieldSet$Builder r0 = com.google.protobuf.UnknownFieldSet.newBuilder()
            r1 = 0
            r2 = 1
        L_0x000b:
            if (r1 != 0) goto L_0x00dd
            int r3 = r7.readTag()     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            if (r3 == 0) goto L_0x00bd
            r4 = 8
            if (r3 == r4) goto L_0x00af
            r4 = 17
            if (r3 == r4) goto L_0x00a0
            r4 = 26
            if (r3 == r4) goto L_0x0095
            r4 = 32
            if (r3 == r4) goto L_0x0086
            r4 = 42
            r5 = 0
            if (r3 == r4) goto L_0x005d
            r4 = 50
            if (r3 == r4) goto L_0x0034
            boolean r3 = r6.parseUnknownFieldProto3(r7, r0, r8, r3)     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            if (r3 != 0) goto L_0x000b
            goto L_0x00bd
        L_0x0034:
            int r3 = r6.kindCase_     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            r4 = 6
            if (r3 != r4) goto L_0x0041
            java.lang.Object r3 = r6.kind_     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            com.google.protobuf.ListValue r3 = (com.google.protobuf.ListValue) r3     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            com.google.protobuf.ListValue$Builder r5 = r3.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
        L_0x0041:
            com.google.protobuf.Parser r3 = com.google.protobuf.ListValue.parser()     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            com.google.protobuf.MessageLite r3 = r7.readMessage((com.google.protobuf.Parser<T>) r3, (com.google.protobuf.ExtensionRegistryLite) r8)     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            r6.kind_ = r3     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            if (r5 == 0) goto L_0x005a
            java.lang.Object r3 = r6.kind_     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            com.google.protobuf.ListValue r3 = (com.google.protobuf.ListValue) r3     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            r5.mergeFrom((com.google.protobuf.ListValue) r3)     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            com.google.protobuf.ListValue r3 = r5.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            r6.kind_ = r3     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
        L_0x005a:
            r6.kindCase_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            goto L_0x000b
        L_0x005d:
            int r3 = r6.kindCase_     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            r4 = 5
            if (r3 != r4) goto L_0x006a
            java.lang.Object r3 = r6.kind_     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            com.google.protobuf.Struct r3 = (com.google.protobuf.Struct) r3     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            com.google.protobuf.Struct$Builder r5 = r3.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
        L_0x006a:
            com.google.protobuf.Parser r3 = com.google.protobuf.Struct.parser()     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            com.google.protobuf.MessageLite r3 = r7.readMessage((com.google.protobuf.Parser<T>) r3, (com.google.protobuf.ExtensionRegistryLite) r8)     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            r6.kind_ = r3     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            if (r5 == 0) goto L_0x0083
            java.lang.Object r3 = r6.kind_     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            com.google.protobuf.Struct r3 = (com.google.protobuf.Struct) r3     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            r5.mergeFrom((com.google.protobuf.Struct) r3)     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            com.google.protobuf.Struct r3 = r5.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            r6.kind_ = r3     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
        L_0x0083:
            r6.kindCase_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            goto L_0x000b
        L_0x0086:
            r3 = 4
            r6.kindCase_ = r3     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            boolean r3 = r7.readBool()     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            r6.kind_ = r3     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            goto L_0x000b
        L_0x0095:
            java.lang.String r3 = r7.readStringRequireUtf8()     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            r4 = 3
            r6.kindCase_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            r6.kind_ = r3     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            goto L_0x000b
        L_0x00a0:
            r3 = 2
            r6.kindCase_ = r3     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            double r3 = r7.readDouble()     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            r6.kind_ = r3     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            goto L_0x000b
        L_0x00af:
            int r3 = r7.readEnum()     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            r6.kindCase_ = r2     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            r6.kind_ = r3     // Catch:{ InvalidProtocolBufferException -> 0x00cd, IOException -> 0x00c2 }
            goto L_0x000b
        L_0x00bd:
            r1 = 1
            goto L_0x000b
        L_0x00c0:
            r7 = move-exception
            goto L_0x00d3
        L_0x00c2:
            r7 = move-exception
            com.google.protobuf.InvalidProtocolBufferException r8 = new com.google.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x00c0 }
            r8.<init>((java.io.IOException) r7)     // Catch:{ all -> 0x00c0 }
            com.google.protobuf.InvalidProtocolBufferException r7 = r8.setUnfinishedMessage(r6)     // Catch:{ all -> 0x00c0 }
            throw r7     // Catch:{ all -> 0x00c0 }
        L_0x00cd:
            r7 = move-exception
            com.google.protobuf.InvalidProtocolBufferException r7 = r7.setUnfinishedMessage(r6)     // Catch:{ all -> 0x00c0 }
            throw r7     // Catch:{ all -> 0x00c0 }
        L_0x00d3:
            com.google.protobuf.UnknownFieldSet r8 = r0.build()
            r6.unknownFields = r8
            r6.makeExtensionsImmutable()
            throw r7
        L_0x00dd:
            com.google.protobuf.UnknownFieldSet r7 = r0.build()
            r6.unknownFields = r7
            r6.makeExtensionsImmutable()
            return
        L_0x00e7:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Value.<init>(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):void");
    }

    public static Value parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Value) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Value parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Value) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }
}
