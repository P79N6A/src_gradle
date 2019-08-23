package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Descriptors;
import com.google.protobuf.EnumValue;
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

public final class Enum extends GeneratedMessageV3 implements EnumOrBuilder {
    private static final Enum DEFAULT_INSTANCE = new Enum();
    public static final Parser<Enum> PARSER = new AbstractParser<Enum>() {
        public final Enum parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Enum(codedInputStream, extensionRegistryLite);
        }
    };
    private static final long serialVersionUID = 0;
    public int bitField0_;
    public List<EnumValue> enumvalue_;
    private byte memoizedIsInitialized;
    public volatile Object name_;
    public List<Option> options_;
    public SourceContext sourceContext_;
    public int syntax_;

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EnumOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilderV3<EnumValue, EnumValue.Builder, EnumValueOrBuilder> enumvalueBuilder_;
        private List<EnumValue> enumvalue_;
        private Object name_;
        private RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> optionsBuilder_;
        private List<Option> options_;
        private SingleFieldBuilderV3<SourceContext, SourceContext.Builder, SourceContextOrBuilder> sourceContextBuilder_;
        private SourceContext sourceContext_;
        private int syntax_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return TypeProto.internal_static_google_protobuf_Enum_descriptor;
        }

        public final Descriptors.Descriptor getDescriptorForType() {
            return TypeProto.internal_static_google_protobuf_Enum_descriptor;
        }

        public final int getSyntaxValue() {
            return this.syntax_;
        }

        public final Builder clearSyntax() {
            this.syntax_ = 0;
            onChanged();
            return this;
        }

        public final Enum getDefaultInstanceForType() {
            return Enum.getDefaultInstance();
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                getEnumvalueFieldBuilder();
                getOptionsFieldBuilder();
            }
        }

        public final EnumValue.Builder addEnumvalueBuilder() {
            return (EnumValue.Builder) getEnumvalueFieldBuilder().addBuilder(EnumValue.getDefaultInstance());
        }

        public final Option.Builder addOptionsBuilder() {
            return (Option.Builder) getOptionsFieldBuilder().addBuilder(Option.getDefaultInstance());
        }

        public final Enum build() {
            Enum buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public final Builder clearName() {
            this.name_ = Enum.getDefaultInstance().getName();
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

        public final List<EnumValue.Builder> getEnumvalueBuilderList() {
            return getEnumvalueFieldBuilder().getBuilderList();
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
            return TypeProto.internal_static_google_protobuf_Enum_fieldAccessorTable.ensureFieldAccessorsInitialized(Enum.class, Builder.class);
        }

        private Builder() {
            this.name_ = "";
            this.enumvalue_ = Collections.emptyList();
            this.options_ = Collections.emptyList();
            this.sourceContext_ = null;
            this.syntax_ = 0;
            maybeForceBuilderInitialization();
        }

        private void ensureEnumvalueIsMutable() {
            if ((this.bitField0_ & 2) != 2) {
                this.enumvalue_ = new ArrayList(this.enumvalue_);
                this.bitField0_ |= 2;
            }
        }

        private void ensureOptionsIsMutable() {
            if ((this.bitField0_ & 4) != 4) {
                this.options_ = new ArrayList(this.options_);
                this.bitField0_ |= 4;
            }
        }

        private SingleFieldBuilderV3<SourceContext, SourceContext.Builder, SourceContextOrBuilder> getSourceContextFieldBuilder() {
            if (this.sourceContextBuilder_ == null) {
                this.sourceContextBuilder_ = new SingleFieldBuilderV3<>(getSourceContext(), getParentForChildren(), isClean());
                this.sourceContext_ = null;
            }
            return this.sourceContextBuilder_;
        }

        public final Builder clearEnumvalue() {
            if (this.enumvalueBuilder_ == null) {
                this.enumvalue_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
            } else {
                this.enumvalueBuilder_.clear();
            }
            return this;
        }

        public final Builder clearOptions() {
            if (this.optionsBuilder_ == null) {
                this.options_ = Collections.emptyList();
                this.bitField0_ &= -5;
                onChanged();
            } else {
                this.optionsBuilder_.clear();
            }
            return this;
        }

        public final Builder clone() {
            return (Builder) super.clone();
        }

        public final int getEnumvalueCount() {
            if (this.enumvalueBuilder_ == null) {
                return this.enumvalue_.size();
            }
            return this.enumvalueBuilder_.getCount();
        }

        public final List<EnumValue> getEnumvalueList() {
            if (this.enumvalueBuilder_ == null) {
                return Collections.unmodifiableList(this.enumvalue_);
            }
            return this.enumvalueBuilder_.getMessageList();
        }

        public final List<? extends EnumValueOrBuilder> getEnumvalueOrBuilderList() {
            if (this.enumvalueBuilder_ != null) {
                return this.enumvalueBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.enumvalue_);
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

        private RepeatedFieldBuilderV3<EnumValue, EnumValue.Builder, EnumValueOrBuilder> getEnumvalueFieldBuilder() {
            boolean z;
            if (this.enumvalueBuilder_ == null) {
                List<EnumValue> list = this.enumvalue_;
                if ((this.bitField0_ & 2) == 2) {
                    z = true;
                } else {
                    z = false;
                }
                this.enumvalueBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                this.enumvalue_ = null;
            }
            return this.enumvalueBuilder_;
        }

        private RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> getOptionsFieldBuilder() {
            boolean z;
            if (this.optionsBuilder_ == null) {
                List<Option> list = this.options_;
                if ((this.bitField0_ & 4) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                this.optionsBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        public final Enum buildPartial() {
            Enum enumR = new Enum((GeneratedMessageV3.Builder) this);
            enumR.name_ = this.name_;
            if (this.enumvalueBuilder_ == null) {
                if ((this.bitField0_ & 2) == 2) {
                    this.enumvalue_ = Collections.unmodifiableList(this.enumvalue_);
                    this.bitField0_ &= -3;
                }
                enumR.enumvalue_ = this.enumvalue_;
            } else {
                enumR.enumvalue_ = this.enumvalueBuilder_.build();
            }
            if (this.optionsBuilder_ == null) {
                if ((this.bitField0_ & 4) == 4) {
                    this.options_ = Collections.unmodifiableList(this.options_);
                    this.bitField0_ &= -5;
                }
                enumR.options_ = this.options_;
            } else {
                enumR.options_ = this.optionsBuilder_.build();
            }
            if (this.sourceContextBuilder_ == null) {
                enumR.sourceContext_ = this.sourceContext_;
            } else {
                enumR.sourceContext_ = (SourceContext) this.sourceContextBuilder_.build();
            }
            enumR.syntax_ = this.syntax_;
            enumR.bitField0_ = 0;
            onBuilt();
            return enumR;
        }

        public final Builder clear() {
            super.clear();
            this.name_ = "";
            if (this.enumvalueBuilder_ == null) {
                this.enumvalue_ = Collections.emptyList();
                this.bitField0_ &= -3;
            } else {
                this.enumvalueBuilder_.clear();
            }
            if (this.optionsBuilder_ == null) {
                this.options_ = Collections.emptyList();
                this.bitField0_ &= -5;
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

        public final Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public final Builder setSyntaxValue(int i) {
            this.syntax_ = i;
            onChanged();
            return this;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
        }

        public final Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        public final EnumValue.Builder getEnumvalueBuilder(int i) {
            return (EnumValue.Builder) getEnumvalueFieldBuilder().getBuilder(i);
        }

        public final Option.Builder getOptionsBuilder(int i) {
            return (Option.Builder) getOptionsFieldBuilder().getBuilder(i);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }

        public final Builder setName(String str) {
            if (str != null) {
                this.name_ = str;
                onChanged();
                return this;
            }
            throw new NullPointerException();
        }

        public final Builder addAllEnumvalue(Iterable<? extends EnumValue> iterable) {
            if (this.enumvalueBuilder_ == null) {
                ensureEnumvalueIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.enumvalue_);
                onChanged();
            } else {
                this.enumvalueBuilder_.addAllMessages(iterable);
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

        public final EnumValue.Builder addEnumvalueBuilder(int i) {
            return (EnumValue.Builder) getEnumvalueFieldBuilder().addBuilder(i, EnumValue.getDefaultInstance());
        }

        public final Option.Builder addOptionsBuilder(int i) {
            return (Option.Builder) getOptionsFieldBuilder().addBuilder(i, Option.getDefaultInstance());
        }

        public final EnumValue getEnumvalue(int i) {
            if (this.enumvalueBuilder_ == null) {
                return this.enumvalue_.get(i);
            }
            return (EnumValue) this.enumvalueBuilder_.getMessage(i);
        }

        public final EnumValueOrBuilder getEnumvalueOrBuilder(int i) {
            if (this.enumvalueBuilder_ == null) {
                return this.enumvalue_.get(i);
            }
            return (EnumValueOrBuilder) this.enumvalueBuilder_.getMessageOrBuilder(i);
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

        public final Builder removeEnumvalue(int i) {
            if (this.enumvalueBuilder_ == null) {
                ensureEnumvalueIsMutable();
                this.enumvalue_.remove(i);
                onChanged();
            } else {
                this.enumvalueBuilder_.remove(i);
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

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.name_ = "";
            this.enumvalue_ = Collections.emptyList();
            this.options_ = Collections.emptyList();
            this.sourceContext_ = null;
            this.syntax_ = 0;
            maybeForceBuilderInitialization();
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

        public final Builder addEnumvalue(EnumValue.Builder builder) {
            if (this.enumvalueBuilder_ == null) {
                ensureEnumvalueIsMutable();
                this.enumvalue_.add(builder.build());
                onChanged();
            } else {
                this.enumvalueBuilder_.addMessage(builder.build());
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

        public final Builder mergeFrom(Message message) {
            if (message instanceof Enum) {
                return mergeFrom((Enum) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public final Builder addEnumvalue(EnumValue enumValue) {
            if (this.enumvalueBuilder_ != null) {
                this.enumvalueBuilder_.addMessage(enumValue);
            } else if (enumValue != null) {
                ensureEnumvalueIsMutable();
                this.enumvalue_.add(enumValue);
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

        public final Builder mergeFrom(Enum enumR) {
            RepeatedFieldBuilderV3<EnumValue, EnumValue.Builder, EnumValueOrBuilder> repeatedFieldBuilderV3;
            if (enumR == Enum.getDefaultInstance()) {
                return this;
            }
            if (!enumR.getName().isEmpty()) {
                this.name_ = enumR.name_;
                onChanged();
            }
            RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilderV32 = null;
            if (this.enumvalueBuilder_ == null) {
                if (!enumR.enumvalue_.isEmpty()) {
                    if (this.enumvalue_.isEmpty()) {
                        this.enumvalue_ = enumR.enumvalue_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureEnumvalueIsMutable();
                        this.enumvalue_.addAll(enumR.enumvalue_);
                    }
                    onChanged();
                }
            } else if (!enumR.enumvalue_.isEmpty()) {
                if (this.enumvalueBuilder_.isEmpty()) {
                    this.enumvalueBuilder_.dispose();
                    this.enumvalueBuilder_ = null;
                    this.enumvalue_ = enumR.enumvalue_;
                    this.bitField0_ &= -3;
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        repeatedFieldBuilderV3 = getEnumvalueFieldBuilder();
                    } else {
                        repeatedFieldBuilderV3 = null;
                    }
                    this.enumvalueBuilder_ = repeatedFieldBuilderV3;
                } else {
                    this.enumvalueBuilder_.addAllMessages(enumR.enumvalue_);
                }
            }
            if (this.optionsBuilder_ == null) {
                if (!enumR.options_.isEmpty()) {
                    if (this.options_.isEmpty()) {
                        this.options_ = enumR.options_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureOptionsIsMutable();
                        this.options_.addAll(enumR.options_);
                    }
                    onChanged();
                }
            } else if (!enumR.options_.isEmpty()) {
                if (this.optionsBuilder_.isEmpty()) {
                    this.optionsBuilder_.dispose();
                    this.optionsBuilder_ = null;
                    this.options_ = enumR.options_;
                    this.bitField0_ &= -5;
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        repeatedFieldBuilderV32 = getOptionsFieldBuilder();
                    }
                    this.optionsBuilder_ = repeatedFieldBuilderV32;
                } else {
                    this.optionsBuilder_.addAllMessages(enumR.options_);
                }
            }
            if (enumR.hasSourceContext()) {
                mergeSourceContext(enumR.getSourceContext());
            }
            if (enumR.syntax_ != 0) {
                setSyntaxValue(enumR.getSyntaxValue());
            }
            mergeUnknownFields(enumR.unknownFields);
            onChanged();
            return this;
        }

        public final Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        public final Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        public final Builder addEnumvalue(int i, EnumValue.Builder builder) {
            if (this.enumvalueBuilder_ == null) {
                ensureEnumvalueIsMutable();
                this.enumvalue_.add(i, builder.build());
                onChanged();
            } else {
                this.enumvalueBuilder_.addMessage(i, builder.build());
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

        public final Builder setEnumvalue(int i, EnumValue.Builder builder) {
            if (this.enumvalueBuilder_ == null) {
                ensureEnumvalueIsMutable();
                this.enumvalue_.set(i, builder.build());
                onChanged();
            } else {
                this.enumvalueBuilder_.setMessage(i, builder.build());
            }
            return this;
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

        public final Builder addEnumvalue(int i, EnumValue enumValue) {
            if (this.enumvalueBuilder_ != null) {
                this.enumvalueBuilder_.addMessage(i, enumValue);
            } else if (enumValue != null) {
                ensureEnumvalueIsMutable();
                this.enumvalue_.add(i, enumValue);
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

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.google.protobuf.Enum.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser<com.google.protobuf.Enum> r1 = com.google.protobuf.Enum.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                com.google.protobuf.Enum r3 = (com.google.protobuf.Enum) r3     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                if (r3 == 0) goto L_0x000e
                r2.mergeFrom((com.google.protobuf.Enum) r3)
            L_0x000e:
                return r2
            L_0x000f:
                r3 = move-exception
                goto L_0x001f
            L_0x0011:
                r3 = move-exception
                com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x000f }
                com.google.protobuf.Enum r4 = (com.google.protobuf.Enum) r4     // Catch:{ all -> 0x000f }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001d }
                throw r3     // Catch:{ all -> 0x001d }
            L_0x001d:
                r3 = move-exception
                r0 = r4
            L_0x001f:
                if (r0 == 0) goto L_0x0024
                r2.mergeFrom((com.google.protobuf.Enum) r0)
            L_0x0024:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Enum.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.Enum$Builder");
        }

        public final Builder setEnumvalue(int i, EnumValue enumValue) {
            if (this.enumvalueBuilder_ != null) {
                this.enumvalueBuilder_.setMessage(i, enumValue);
            } else if (enumValue != null) {
                ensureEnumvalueIsMutable();
                this.enumvalue_.set(i, enumValue);
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

        public final Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
        }
    }

    public static Enum getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return TypeProto.internal_static_google_protobuf_Enum_descriptor;
    }

    public static Parser<Enum> parser() {
        return PARSER;
    }

    public final Enum getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public final List<EnumValue> getEnumvalueList() {
        return this.enumvalue_;
    }

    public final List<? extends EnumValueOrBuilder> getEnumvalueOrBuilderList() {
        return this.enumvalue_;
    }

    public final List<Option> getOptionsList() {
        return this.options_;
    }

    public final List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    public final Parser<Enum> getParserForType() {
        return PARSER;
    }

    public final int getSyntaxValue() {
        return this.syntax_;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    public static Enum parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Enum) PARSER.parseFrom(bArr);
    }

    public static Enum parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Enum) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public final int getEnumvalueCount() {
        return this.enumvalue_.size();
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

    public final Builder newBuilderForType() {
        return newBuilder();
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
        return TypeProto.internal_static_google_protobuf_Enum_fieldAccessorTable.ensureFieldAccessorsInitialized(Enum.class, Builder.class);
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

    private Enum() {
        this.memoizedIsInitialized = -1;
        this.name_ = "";
        this.enumvalue_ = Collections.emptyList();
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
        for (int i4 = 0; i4 < this.enumvalue_.size(); i4++) {
            i3 += CodedOutputStream.computeMessageSize(2, this.enumvalue_.get(i4));
        }
        for (int i5 = 0; i5 < this.options_.size(); i5++) {
            i3 += CodedOutputStream.computeMessageSize(3, this.options_.get(i5));
        }
        if (this.sourceContext_ != null) {
            i3 += CodedOutputStream.computeMessageSize(4, getSourceContext());
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            i3 += CodedOutputStream.computeEnumSize(5, this.syntax_);
        }
        int serializedSize = i3 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public final int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53) + getName().hashCode();
        if (getEnumvalueCount() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + getEnumvalueList().hashCode();
        }
        if (getOptionsCount() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + getOptionsList().hashCode();
        }
        if (hasSourceContext()) {
            hashCode = (((hashCode * 37) + 4) * 53) + getSourceContext().hashCode();
        }
        int hashCode2 = (((((hashCode * 37) + 5) * 53) + this.syntax_) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    private Enum(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    public static Builder newBuilder(Enum enumR) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(enumR);
    }

    public static Enum parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Enum) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Enum parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Enum) PARSER.parseFrom(byteString);
    }

    public final EnumValue getEnumvalue(int i) {
        return this.enumvalue_.get(i);
    }

    public final EnumValueOrBuilder getEnumvalueOrBuilder(int i) {
        return this.enumvalue_.get(i);
    }

    public final Option getOptions(int i) {
        return this.options_.get(i);
    }

    public final OptionOrBuilder getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    /* access modifiers changed from: protected */
    public final Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static Enum parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Enum) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
        }
        for (int i = 0; i < this.enumvalue_.size(); i++) {
            codedOutputStream.writeMessage(2, this.enumvalue_.get(i));
        }
        for (int i2 = 0; i2 < this.options_.size(); i2++) {
            codedOutputStream.writeMessage(3, this.options_.get(i2));
        }
        if (this.sourceContext_ != null) {
            codedOutputStream.writeMessage(4, getSourceContext());
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            codedOutputStream.writeEnum(5, this.syntax_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static Enum parseFrom(InputStream inputStream) throws IOException {
        return (Enum) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Enum)) {
            return super.equals(obj);
        }
        Enum enumR = (Enum) obj;
        if (!getName().equals(enumR.getName()) || !getEnumvalueList().equals(enumR.getEnumvalueList())) {
            z = false;
        } else {
            z = true;
        }
        if (!z || !getOptionsList().equals(enumR.getOptionsList())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 || hasSourceContext() != enumR.hasSourceContext()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (hasSourceContext()) {
            if (!z3 || !getSourceContext().equals(enumR.getSourceContext())) {
                z3 = false;
            } else {
                z3 = true;
            }
        }
        if (!z3 || this.syntax_ != enumR.syntax_) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z4 || !this.unknownFields.equals(enumR.unknownFields)) {
            z5 = false;
        }
        return z5;
    }

    public static Enum parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Enum) PARSER.parseFrom(byteBuffer);
    }

    public static Enum parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Enum) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Enum parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Enum) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Enum parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Enum) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    private Enum(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.enumvalue_ = new ArrayList();
                                z2 |= true;
                            }
                            this.enumvalue_.add(codedInputStream.readMessage(EnumValue.parser(), extensionRegistryLite));
                        } else if (readTag == 26) {
                            if (!(z2 & true)) {
                                this.options_ = new ArrayList();
                                z2 |= true;
                            }
                            this.options_.add(codedInputStream.readMessage(Option.parser(), extensionRegistryLite));
                        } else if (readTag == 34) {
                            SourceContext.Builder builder = null;
                            builder = this.sourceContext_ != null ? this.sourceContext_.toBuilder() : builder;
                            this.sourceContext_ = (SourceContext) codedInputStream.readMessage(SourceContext.parser(), extensionRegistryLite);
                            if (builder != null) {
                                builder.mergeFrom(this.sourceContext_);
                                this.sourceContext_ = builder.buildPartial();
                            }
                        } else if (readTag == 40) {
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
                        this.enumvalue_ = Collections.unmodifiableList(this.enumvalue_);
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
                this.enumvalue_ = Collections.unmodifiableList(this.enumvalue_);
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

    public static Enum parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Enum) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Enum) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }
}
