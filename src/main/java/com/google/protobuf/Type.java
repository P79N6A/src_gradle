package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Field;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Type extends GeneratedMessageV3 implements TypeOrBuilder {
    private static final Type DEFAULT_INSTANCE = new Type();
    public static final Parser<Type> PARSER = new AbstractParser<Type>() {
        public final Type parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Type(codedInputStream, extensionRegistryLite);
        }
    };
    private static final long serialVersionUID = 0;
    public int bitField0_;
    public List<Field> fields_;
    private byte memoizedIsInitialized;
    public volatile Object name_;
    public LazyStringList oneofs_;
    public List<Option> options_;
    public SourceContext sourceContext_;
    public int syntax_;

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TypeOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilderV3<Field, Field.Builder, FieldOrBuilder> fieldsBuilder_;
        private List<Field> fields_;
        private Object name_;
        private LazyStringList oneofs_;
        private RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> optionsBuilder_;
        private List<Option> options_;
        private SingleFieldBuilderV3<SourceContext, SourceContext.Builder, SourceContextOrBuilder> sourceContextBuilder_;
        private SourceContext sourceContext_;
        private int syntax_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return TypeProto.internal_static_google_protobuf_Type_descriptor;
        }

        public final Descriptors.Descriptor getDescriptorForType() {
            return TypeProto.internal_static_google_protobuf_Type_descriptor;
        }

        public final int getSyntaxValue() {
            return this.syntax_;
        }

        public final Builder clearSyntax() {
            this.syntax_ = 0;
            onChanged();
            return this;
        }

        public final int getOneofsCount() {
            return this.oneofs_.size();
        }

        public final ProtocolStringList getOneofsList() {
            return this.oneofs_.getUnmodifiableView();
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                getFieldsFieldBuilder();
                getOptionsFieldBuilder();
            }
        }

        public final Field.Builder addFieldsBuilder() {
            return (Field.Builder) getFieldsFieldBuilder().addBuilder(Field.getDefaultInstance());
        }

        public final Option.Builder addOptionsBuilder() {
            return (Option.Builder) getOptionsFieldBuilder().addBuilder(Option.getDefaultInstance());
        }

        public final Builder clearName() {
            this.name_ = Type.getDefaultInstance().getName();
            onChanged();
            return this;
        }

        public final Builder clearOneofs() {
            this.oneofs_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public final Builder clearSourceContext() {
            if (this.sourceContextBuilder_ == null) {
                this.sourceContext_ = null;
                onChanged();
            } else {
                this.sourceContext_ = null;
                this.sourceContextBuilder_ = null;
            }
            return this;
        }

        public final List<Field.Builder> getFieldsBuilderList() {
            return getFieldsFieldBuilder().getBuilderList();
        }

        public final List<Option.Builder> getOptionsBuilderList() {
            return getOptionsFieldBuilder().getBuilderList();
        }

        public final SourceContext.Builder getSourceContextBuilder() {
            onChanged();
            return (SourceContext.Builder) getSourceContextFieldBuilder().getBuilder();
        }

        public final Syntax getSyntax() {
            Syntax valueOf = Syntax.valueOf(this.syntax_);
            if (valueOf == null) {
                return Syntax.UNRECOGNIZED;
            }
            return valueOf;
        }

        public final boolean hasSourceContext() {
            if (this.sourceContextBuilder_ == null && this.sourceContext_ == null) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: protected */
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TypeProto.internal_static_google_protobuf_Type_fieldAccessorTable.ensureFieldAccessorsInitialized(Type.class, Builder.class);
        }

        private void ensureFieldsIsMutable() {
            if ((this.bitField0_ & 2) != 2) {
                this.fields_ = new ArrayList(this.fields_);
                this.bitField0_ |= 2;
            }
        }

        private void ensureOneofsIsMutable() {
            if ((this.bitField0_ & 4) != 4) {
                this.oneofs_ = new LazyStringArrayList(this.oneofs_);
                this.bitField0_ |= 4;
            }
        }

        private void ensureOptionsIsMutable() {
            if ((this.bitField0_ & 8) != 8) {
                this.options_ = new ArrayList(this.options_);
                this.bitField0_ |= 8;
            }
        }

        private SingleFieldBuilderV3<SourceContext, SourceContext.Builder, SourceContextOrBuilder> getSourceContextFieldBuilder() {
            if (this.sourceContextBuilder_ == null) {
                this.sourceContextBuilder_ = new SingleFieldBuilderV3<>(getSourceContext(), getParentForChildren(), isClean());
                this.sourceContext_ = null;
            }
            return this.sourceContextBuilder_;
        }

        public final Type build() {
            Type buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public final Builder clearFields() {
            if (this.fieldsBuilder_ == null) {
                this.fields_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
            } else {
                this.fieldsBuilder_.clear();
            }
            return this;
        }

        public final Builder clearOptions() {
            if (this.optionsBuilder_ == null) {
                this.options_ = Collections.emptyList();
                this.bitField0_ &= -9;
                onChanged();
            } else {
                this.optionsBuilder_.clear();
            }
            return this;
        }

        public final Type getDefaultInstanceForType() {
            return Type.getDefaultInstance();
        }

        public final int getFieldsCount() {
            if (this.fieldsBuilder_ == null) {
                return this.fields_.size();
            }
            return this.fieldsBuilder_.getCount();
        }

        public final List<Field> getFieldsList() {
            if (this.fieldsBuilder_ == null) {
                return Collections.unmodifiableList(this.fields_);
            }
            return this.fieldsBuilder_.getMessageList();
        }

        public final List<? extends FieldOrBuilder> getFieldsOrBuilderList() {
            if (this.fieldsBuilder_ != null) {
                return this.fieldsBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.fields_);
        }

        public final String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        public final ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final int getOptionsCount() {
            if (this.optionsBuilder_ == null) {
                return this.options_.size();
            }
            return this.optionsBuilder_.getCount();
        }

        public final List<Option> getOptionsList() {
            if (this.optionsBuilder_ == null) {
                return Collections.unmodifiableList(this.options_);
            }
            return this.optionsBuilder_.getMessageList();
        }

        public final List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
            if (this.optionsBuilder_ != null) {
                return this.optionsBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.options_);
        }

        public final SourceContext getSourceContext() {
            if (this.sourceContextBuilder_ != null) {
                return (SourceContext) this.sourceContextBuilder_.getMessage();
            }
            if (this.sourceContext_ == null) {
                return SourceContext.getDefaultInstance();
            }
            return this.sourceContext_;
        }

        public final SourceContextOrBuilder getSourceContextOrBuilder() {
            if (this.sourceContextBuilder_ != null) {
                return (SourceContextOrBuilder) this.sourceContextBuilder_.getMessageOrBuilder();
            }
            if (this.sourceContext_ == null) {
                return SourceContext.getDefaultInstance();
            }
            return this.sourceContext_;
        }

        private Builder() {
            this.name_ = "";
            this.fields_ = Collections.emptyList();
            this.oneofs_ = LazyStringArrayList.EMPTY;
            this.options_ = Collections.emptyList();
            this.sourceContext_ = null;
            this.syntax_ = 0;
            maybeForceBuilderInitialization();
        }

        private RepeatedFieldBuilderV3<Field, Field.Builder, FieldOrBuilder> getFieldsFieldBuilder() {
            boolean z;
            if (this.fieldsBuilder_ == null) {
                List<Field> list = this.fields_;
                if ((this.bitField0_ & 2) == 2) {
                    z = true;
                } else {
                    z = false;
                }
                this.fieldsBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                this.fields_ = null;
            }
            return this.fieldsBuilder_;
        }

        private RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> getOptionsFieldBuilder() {
            boolean z;
            if (this.optionsBuilder_ == null) {
                List<Option> list = this.options_;
                if ((this.bitField0_ & 8) == 8) {
                    z = true;
                } else {
                    z = false;
                }
                this.optionsBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        public final Builder clear() {
            super.clear();
            this.name_ = "";
            if (this.fieldsBuilder_ == null) {
                this.fields_ = Collections.emptyList();
                this.bitField0_ &= -3;
            } else {
                this.fieldsBuilder_.clear();
            }
            this.oneofs_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -5;
            if (this.optionsBuilder_ == null) {
                this.options_ = Collections.emptyList();
                this.bitField0_ &= -9;
            } else {
                this.optionsBuilder_.clear();
            }
            if (this.sourceContextBuilder_ == null) {
                this.sourceContext_ = null;
            } else {
                this.sourceContext_ = null;
                this.sourceContextBuilder_ = null;
            }
            this.syntax_ = 0;
            return this;
        }

        public final Type buildPartial() {
            Type type = new Type((GeneratedMessageV3.Builder) this);
            type.name_ = this.name_;
            if (this.fieldsBuilder_ == null) {
                if ((this.bitField0_ & 2) == 2) {
                    this.fields_ = Collections.unmodifiableList(this.fields_);
                    this.bitField0_ &= -3;
                }
                type.fields_ = this.fields_;
            } else {
                type.fields_ = this.fieldsBuilder_.build();
            }
            if ((this.bitField0_ & 4) == 4) {
                this.oneofs_ = this.oneofs_.getUnmodifiableView();
                this.bitField0_ &= -5;
            }
            type.oneofs_ = this.oneofs_;
            if (this.optionsBuilder_ == null) {
                if ((this.bitField0_ & 8) == 8) {
                    this.options_ = Collections.unmodifiableList(this.options_);
                    this.bitField0_ &= -9;
                }
                type.options_ = this.options_;
            } else {
                type.options_ = this.optionsBuilder_.build();
            }
            if (this.sourceContextBuilder_ == null) {
                type.sourceContext_ = this.sourceContext_;
            } else {
                type.sourceContext_ = (SourceContext) this.sourceContextBuilder_.build();
            }
            type.syntax_ = this.syntax_;
            type.bitField0_ = 0;
            onBuilt();
            return type;
        }

        public final Builder clone() {
            return (Builder) super.clone();
        }

        public final ByteString getOneofsBytes(int i) {
            return this.oneofs_.getByteString(i);
        }

        public final Builder setSyntaxValue(int i) {
            this.syntax_ = i;
            onChanged();
            return this;
        }

        public final Builder addAllOneofs(Iterable<String> iterable) {
            ensureOneofsIsMutable();
            AbstractMessageLite.Builder.addAll(iterable, (List<? super T>) this.oneofs_);
            onChanged();
            return this;
        }

        public final Field.Builder getFieldsBuilder(int i) {
            return (Field.Builder) getFieldsFieldBuilder().getBuilder(i);
        }

        public final String getOneofs(int i) {
            return (String) this.oneofs_.get(i);
        }

        public final Option.Builder getOptionsBuilder(int i) {
            return (Option.Builder) getOptionsFieldBuilder().getBuilder(i);
        }

        public final Builder setName(String str) {
            if (str != null) {
                this.name_ = str;
                onChanged();
                return this;
            }
            throw new NullPointerException();
        }

        public final Builder addAllFields(Iterable<? extends Field> iterable) {
            if (this.fieldsBuilder_ == null) {
                ensureFieldsIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.fields_);
                onChanged();
            } else {
                this.fieldsBuilder_.addAllMessages(iterable);
            }
            return this;
        }

        public final Builder addAllOptions(Iterable<? extends Option> iterable) {
            if (this.optionsBuilder_ == null) {
                ensureOptionsIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.options_);
                onChanged();
            } else {
                this.optionsBuilder_.addAllMessages(iterable);
            }
            return this;
        }

        public final Field.Builder addFieldsBuilder(int i) {
            return (Field.Builder) getFieldsFieldBuilder().addBuilder(i, Field.getDefaultInstance());
        }

        public final Builder addOneofs(String str) {
            if (str != null) {
                ensureOneofsIsMutable();
                this.oneofs_.add(str);
                onChanged();
                return this;
            }
            throw new NullPointerException();
        }

        public final Builder addOneofsBytes(ByteString byteString) {
            if (byteString != null) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                ensureOneofsIsMutable();
                this.oneofs_.add(byteString);
                onChanged();
                return this;
            }
            throw new NullPointerException();
        }

        public final Option.Builder addOptionsBuilder(int i) {
            return (Option.Builder) getOptionsFieldBuilder().addBuilder(i, Option.getDefaultInstance());
        }

        public final Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public final Field getFields(int i) {
            if (this.fieldsBuilder_ == null) {
                return this.fields_.get(i);
            }
            return (Field) this.fieldsBuilder_.getMessage(i);
        }

        public final FieldOrBuilder getFieldsOrBuilder(int i) {
            if (this.fieldsBuilder_ == null) {
                return this.fields_.get(i);
            }
            return (FieldOrBuilder) this.fieldsBuilder_.getMessageOrBuilder(i);
        }

        public final Option getOptions(int i) {
            if (this.optionsBuilder_ == null) {
                return this.options_.get(i);
            }
            return (Option) this.optionsBuilder_.getMessage(i);
        }

        public final OptionOrBuilder getOptionsOrBuilder(int i) {
            if (this.optionsBuilder_ == null) {
                return this.options_.get(i);
            }
            return (OptionOrBuilder) this.optionsBuilder_.getMessageOrBuilder(i);
        }

        public final Builder removeFields(int i) {
            if (this.fieldsBuilder_ == null) {
                ensureFieldsIsMutable();
                this.fields_.remove(i);
                onChanged();
            } else {
                this.fieldsBuilder_.remove(i);
            }
            return this;
        }

        public final Builder removeOptions(int i) {
            if (this.optionsBuilder_ == null) {
                ensureOptionsIsMutable();
                this.options_.remove(i);
                onChanged();
            } else {
                this.optionsBuilder_.remove(i);
            }
            return this;
        }

        public final Builder setNameBytes(ByteString byteString) {
            if (byteString != null) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.name_ = byteString;
                onChanged();
                return this;
            }
            throw new NullPointerException();
        }

        public final Builder setSourceContext(SourceContext.Builder builder) {
            if (this.sourceContextBuilder_ == null) {
                this.sourceContext_ = builder.build();
                onChanged();
            } else {
                this.sourceContextBuilder_.setMessage(builder.build());
            }
            return this;
        }

        public final Builder setSyntax(Syntax syntax) {
            if (syntax != null) {
                this.syntax_ = syntax.getNumber();
                onChanged();
                return this;
            }
            throw new NullPointerException();
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
        }

        public final Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        public final Builder mergeSourceContext(SourceContext sourceContext) {
            if (this.sourceContextBuilder_ == null) {
                if (this.sourceContext_ != null) {
                    this.sourceContext_ = SourceContext.newBuilder(this.sourceContext_).mergeFrom(sourceContext).buildPartial();
                } else {
                    this.sourceContext_ = sourceContext;
                }
                onChanged();
            } else {
                this.sourceContextBuilder_.mergeFrom(sourceContext);
            }
            return this;
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }

        public final Builder setSourceContext(SourceContext sourceContext) {
            if (this.sourceContextBuilder_ != null) {
                this.sourceContextBuilder_.setMessage(sourceContext);
            } else if (sourceContext != null) {
                this.sourceContext_ = sourceContext;
                onChanged();
            } else {
                throw new NullPointerException();
            }
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.name_ = "";
            this.fields_ = Collections.emptyList();
            this.oneofs_ = LazyStringArrayList.EMPTY;
            this.options_ = Collections.emptyList();
            this.sourceContext_ = null;
            this.syntax_ = 0;
            maybeForceBuilderInitialization();
        }

        public final Builder addFields(Field.Builder builder) {
            if (this.fieldsBuilder_ == null) {
                ensureFieldsIsMutable();
                this.fields_.add(builder.build());
                onChanged();
            } else {
                this.fieldsBuilder_.addMessage(builder.build());
            }
            return this;
        }

        public final Builder addOptions(Option.Builder builder) {
            if (this.optionsBuilder_ == null) {
                ensureOptionsIsMutable();
                this.options_.add(builder.build());
                onChanged();
            } else {
                this.optionsBuilder_.addMessage(builder.build());
            }
            return this;
        }

        public final Builder addFields(Field field) {
            if (this.fieldsBuilder_ != null) {
                this.fieldsBuilder_.addMessage(field);
            } else if (field != null) {
                ensureFieldsIsMutable();
                this.fields_.add(field);
                onChanged();
            } else {
                throw new NullPointerException();
            }
            return this;
        }

        public final Builder addOptions(Option option) {
            if (this.optionsBuilder_ != null) {
                this.optionsBuilder_.addMessage(option);
            } else if (option != null) {
                ensureOptionsIsMutable();
                this.options_.add(option);
                onChanged();
            } else {
                throw new NullPointerException();
            }
            return this;
        }

        public final Builder mergeFrom(Message message) {
            if (message instanceof Type) {
                return mergeFrom((Type) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public final Builder mergeFrom(Type type) {
            RepeatedFieldBuilderV3<Field, Field.Builder, FieldOrBuilder> repeatedFieldBuilderV3;
            if (type == Type.getDefaultInstance()) {
                return this;
            }
            if (!type.getName().isEmpty()) {
                this.name_ = type.name_;
                onChanged();
            }
            RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilderV32 = null;
            if (this.fieldsBuilder_ == null) {
                if (!type.fields_.isEmpty()) {
                    if (this.fields_.isEmpty()) {
                        this.fields_ = type.fields_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureFieldsIsMutable();
                        this.fields_.addAll(type.fields_);
                    }
                    onChanged();
                }
            } else if (!type.fields_.isEmpty()) {
                if (this.fieldsBuilder_.isEmpty()) {
                    this.fieldsBuilder_.dispose();
                    this.fieldsBuilder_ = null;
                    this.fields_ = type.fields_;
                    this.bitField0_ &= -3;
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        repeatedFieldBuilderV3 = getFieldsFieldBuilder();
                    } else {
                        repeatedFieldBuilderV3 = null;
                    }
                    this.fieldsBuilder_ = repeatedFieldBuilderV3;
                } else {
                    this.fieldsBuilder_.addAllMessages(type.fields_);
                }
            }
            if (!type.oneofs_.isEmpty()) {
                if (this.oneofs_.isEmpty()) {
                    this.oneofs_ = type.oneofs_;
                    this.bitField0_ &= -5;
                } else {
                    ensureOneofsIsMutable();
                    this.oneofs_.addAll(type.oneofs_);
                }
                onChanged();
            }
            if (this.optionsBuilder_ == null) {
                if (!type.options_.isEmpty()) {
                    if (this.options_.isEmpty()) {
                        this.options_ = type.options_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureOptionsIsMutable();
                        this.options_.addAll(type.options_);
                    }
                    onChanged();
                }
            } else if (!type.options_.isEmpty()) {
                if (this.optionsBuilder_.isEmpty()) {
                    this.optionsBuilder_.dispose();
                    this.optionsBuilder_ = null;
                    this.options_ = type.options_;
                    this.bitField0_ &= -9;
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        repeatedFieldBuilderV32 = getOptionsFieldBuilder();
                    }
                    this.optionsBuilder_ = repeatedFieldBuilderV32;
                } else {
                    this.optionsBuilder_.addAllMessages(type.options_);
                }
            }
            if (type.hasSourceContext()) {
                mergeSourceContext(type.getSourceContext());
            }
            if (type.syntax_ != 0) {
                setSyntaxValue(type.getSyntaxValue());
            }
            mergeUnknownFields(type.unknownFields);
            onChanged();
            return this;
        }

        public final Builder addFields(int i, Field.Builder builder) {
            if (this.fieldsBuilder_ == null) {
                ensureFieldsIsMutable();
                this.fields_.add(i, builder.build());
                onChanged();
            } else {
                this.fieldsBuilder_.addMessage(i, builder.build());
            }
            return this;
        }

        public final Builder addOptions(int i, Option.Builder builder) {
            if (this.optionsBuilder_ == null) {
                ensureOptionsIsMutable();
                this.options_.add(i, builder.build());
                onChanged();
            } else {
                this.optionsBuilder_.addMessage(i, builder.build());
            }
            return this;
        }

        public final Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        public final Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        public final Builder setFields(int i, Field.Builder builder) {
            if (this.fieldsBuilder_ == null) {
                ensureFieldsIsMutable();
                this.fields_.set(i, builder.build());
                onChanged();
            } else {
                this.fieldsBuilder_.setMessage(i, builder.build());
            }
            return this;
        }

        public final Builder setOneofs(int i, String str) {
            if (str != null) {
                ensureOneofsIsMutable();
                this.oneofs_.set(i, str);
                onChanged();
                return this;
            }
            throw new NullPointerException();
        }

        public final Builder setOptions(int i, Option.Builder builder) {
            if (this.optionsBuilder_ == null) {
                ensureOptionsIsMutable();
                this.options_.set(i, builder.build());
                onChanged();
            } else {
                this.optionsBuilder_.setMessage(i, builder.build());
            }
            return this;
        }

        public final Builder addFields(int i, Field field) {
            if (this.fieldsBuilder_ != null) {
                this.fieldsBuilder_.addMessage(i, field);
            } else if (field != null) {
                ensureFieldsIsMutable();
                this.fields_.add(i, field);
                onChanged();
            } else {
                throw new NullPointerException();
            }
            return this;
        }

        public final Builder addOptions(int i, Option option) {
            if (this.optionsBuilder_ != null) {
                this.optionsBuilder_.addMessage(i, option);
            } else if (option != null) {
                ensureOptionsIsMutable();
                this.options_.add(i, option);
                onChanged();
            } else {
                throw new NullPointerException();
            }
            return this;
        }

        public final Builder setFields(int i, Field field) {
            if (this.fieldsBuilder_ != null) {
                this.fieldsBuilder_.setMessage(i, field);
            } else if (field != null) {
                ensureFieldsIsMutable();
                this.fields_.set(i, field);
                onChanged();
            } else {
                throw new NullPointerException();
            }
            return this;
        }

        public final Builder setOptions(int i, Option option) {
            if (this.optionsBuilder_ != null) {
                this.optionsBuilder_.setMessage(i, option);
            } else if (option != null) {
                ensureOptionsIsMutable();
                this.options_.set(i, option);
                onChanged();
            } else {
                throw new NullPointerException();
            }
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.google.protobuf.Type.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser<com.google.protobuf.Type> r1 = com.google.protobuf.Type.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                com.google.protobuf.Type r3 = (com.google.protobuf.Type) r3     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                if (r3 == 0) goto L_0x000e
                r2.mergeFrom((com.google.protobuf.Type) r3)
            L_0x000e:
                return r2
            L_0x000f:
                r3 = move-exception
                goto L_0x001f
            L_0x0011:
                r3 = move-exception
                com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x000f }
                com.google.protobuf.Type r4 = (com.google.protobuf.Type) r4     // Catch:{ all -> 0x000f }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001d }
                throw r3     // Catch:{ all -> 0x001d }
            L_0x001d:
                r3 = move-exception
                r0 = r4
            L_0x001f:
                if (r0 == 0) goto L_0x0024
                r2.mergeFrom((com.google.protobuf.Type) r0)
            L_0x0024:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Type.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.Type$Builder");
        }

        public final Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
        }
    }

    public static Type getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return TypeProto.internal_static_google_protobuf_Type_descriptor;
    }

    public static Parser<Type> parser() {
        return PARSER;
    }

    public final Type getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public final List<Field> getFieldsList() {
        return this.fields_;
    }

    public final List<? extends FieldOrBuilder> getFieldsOrBuilderList() {
        return this.fields_;
    }

    public final ProtocolStringList getOneofsList() {
        return this.oneofs_;
    }

    public final List<Option> getOptionsList() {
        return this.options_;
    }

    public final List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    public final Parser<Type> getParserForType() {
        return PARSER;
    }

    public final int getSyntaxValue() {
        return this.syntax_;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    public static Type parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Type) PARSER.parseFrom(bArr);
    }

    public static Type parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Type) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public final int getFieldsCount() {
        return this.fields_.size();
    }

    public final int getOneofsCount() {
        return this.oneofs_.size();
    }

    public final int getOptionsCount() {
        return this.options_.size();
    }

    public final SourceContextOrBuilder getSourceContextOrBuilder() {
        return getSourceContext();
    }

    public final boolean hasSourceContext() {
        if (this.sourceContext_ != null) {
            return true;
        }
        return false;
    }

    public final SourceContext getSourceContext() {
        if (this.sourceContext_ == null) {
            return SourceContext.getDefaultInstance();
        }
        return this.sourceContext_;
    }

    public final Syntax getSyntax() {
        Syntax valueOf = Syntax.valueOf(this.syntax_);
        if (valueOf == null) {
            return Syntax.UNRECOGNIZED;
        }
        return valueOf;
    }

    /* access modifiers changed from: protected */
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return TypeProto.internal_static_google_protobuf_Type_fieldAccessorTable.ensureFieldAccessorsInitialized(Type.class, Builder.class);
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

    private Type() {
        this.memoizedIsInitialized = -1;
        this.name_ = "";
        this.fields_ = Collections.emptyList();
        this.oneofs_ = LazyStringArrayList.EMPTY;
        this.options_ = Collections.emptyList();
        this.syntax_ = 0;
    }

    public final String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    public final ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = copyFromUtf8;
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
        int i;
        int i2 = this.memoizedSize;
        if (i2 != -1) {
            return i2;
        }
        if (!getNameBytes().isEmpty()) {
            i = GeneratedMessageV3.computeStringSize(1, this.name_) + 0;
        } else {
            i = 0;
        }
        int i3 = i;
        for (int i4 = 0; i4 < this.fields_.size(); i4++) {
            i3 += CodedOutputStream.computeMessageSize(2, this.fields_.get(i4));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.oneofs_.size(); i6++) {
            i5 += computeStringSizeNoTag(this.oneofs_.getRaw(i6));
        }
        int size = i3 + i5 + (getOneofsList().size() * 1);
        for (int i7 = 0; i7 < this.options_.size(); i7++) {
            size += CodedOutputStream.computeMessageSize(4, this.options_.get(i7));
        }
        if (this.sourceContext_ != null) {
            size += CodedOutputStream.computeMessageSize(5, getSourceContext());
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            size += CodedOutputStream.computeEnumSize(6, this.syntax_);
        }
        int serializedSize = size + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public final int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53) + getName().hashCode();
        if (getFieldsCount() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + getFieldsList().hashCode();
        }
        if (getOneofsCount() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + getOneofsList().hashCode();
        }
        if (getOptionsCount() > 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + getOptionsList().hashCode();
        }
        if (hasSourceContext()) {
            hashCode = (((hashCode * 37) + 5) * 53) + getSourceContext().hashCode();
        }
        int hashCode2 = (((((hashCode * 37) + 6) * 53) + this.syntax_) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    private Type(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    public final ByteString getOneofsBytes(int i) {
        return this.oneofs_.getByteString(i);
    }

    public static Builder newBuilder(Type type) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(type);
    }

    public static Type parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Type) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Type parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Type) PARSER.parseFrom(byteString);
    }

    public final Field getFields(int i) {
        return this.fields_.get(i);
    }

    public final FieldOrBuilder getFieldsOrBuilder(int i) {
        return this.fields_.get(i);
    }

    public final String getOneofs(int i) {
        return (String) this.oneofs_.get(i);
    }

    public final Option getOptions(int i) {
        return this.options_.get(i);
    }

    public final OptionOrBuilder getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    public static Type parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Type) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    /* access modifiers changed from: protected */
    public final Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
        }
        for (int i = 0; i < this.fields_.size(); i++) {
            codedOutputStream.writeMessage(2, this.fields_.get(i));
        }
        for (int i2 = 0; i2 < this.oneofs_.size(); i2++) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.oneofs_.getRaw(i2));
        }
        for (int i3 = 0; i3 < this.options_.size(); i3++) {
            codedOutputStream.writeMessage(4, this.options_.get(i3));
        }
        if (this.sourceContext_ != null) {
            codedOutputStream.writeMessage(5, getSourceContext());
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            codedOutputStream.writeEnum(6, this.syntax_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static Type parseFrom(InputStream inputStream) throws IOException {
        return (Type) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Type)) {
            return super.equals(obj);
        }
        Type type = (Type) obj;
        if (!getName().equals(type.getName()) || !getFieldsList().equals(type.getFieldsList())) {
            z = false;
        } else {
            z = true;
        }
        if (!z || !getOneofsList().equals(type.getOneofsList())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 || !getOptionsList().equals(type.getOptionsList())) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3 || hasSourceContext() != type.hasSourceContext()) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (hasSourceContext()) {
            if (!z4 || !getSourceContext().equals(type.getSourceContext())) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        if (!z4 || this.syntax_ != type.syntax_) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z5 || !this.unknownFields.equals(type.unknownFields)) {
            z6 = false;
        }
        return z6;
    }

    public static Type parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Type) PARSER.parseFrom(byteBuffer);
    }

    public static Type parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Type) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Type parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Type) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Type parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Type) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    private Type(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            this.name_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 18) {
                            if (!(z2 & true)) {
                                this.fields_ = new ArrayList();
                                z2 |= true;
                            }
                            this.fields_.add(codedInputStream.readMessage(Field.parser(), extensionRegistryLite));
                        } else if (readTag == 26) {
                            String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                            if (!(z2 & true)) {
                                this.oneofs_ = new LazyStringArrayList();
                                z2 |= true;
                            }
                            this.oneofs_.add(readStringRequireUtf8);
                        } else if (readTag == 34) {
                            if (!(z2 & true)) {
                                this.options_ = new ArrayList();
                                z2 |= true;
                            }
                            this.options_.add(codedInputStream.readMessage(Option.parser(), extensionRegistryLite));
                        } else if (readTag == 42) {
                            SourceContext.Builder builder = null;
                            builder = this.sourceContext_ != null ? this.sourceContext_.toBuilder() : builder;
                            this.sourceContext_ = (SourceContext) codedInputStream.readMessage(SourceContext.parser(), extensionRegistryLite);
                            if (builder != null) {
                                builder.mergeFrom(this.sourceContext_);
                                this.sourceContext_ = builder.buildPartial();
                            }
                        } else if (readTag == 48) {
                            this.syntax_ = codedInputStream.readEnum();
                        } else if (!parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.fields_ = Collections.unmodifiableList(this.fields_);
                    }
                    if (z2 & true) {
                        this.oneofs_ = this.oneofs_.getUnmodifiableView();
                    }
                    if (z2 & true) {
                        this.options_ = Collections.unmodifiableList(this.options_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.fields_ = Collections.unmodifiableList(this.fields_);
            }
            if (z2 & true) {
                this.oneofs_ = this.oneofs_.getUnmodifiableView();
            }
            if (z2 & true) {
                this.options_ = Collections.unmodifiableList(this.options_);
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
            return;
        }
        throw new NullPointerException();
    }

    public static Type parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Type) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Type parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Type) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }
}
