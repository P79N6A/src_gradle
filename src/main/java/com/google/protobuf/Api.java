package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Method;
import com.google.protobuf.Mixin;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Api extends GeneratedMessageV3 implements ApiOrBuilder {
    private static final Api DEFAULT_INSTANCE = new Api();
    public static final Parser<Api> PARSER = new AbstractParser<Api>() {
        public final Api parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Api(codedInputStream, extensionRegistryLite);
        }
    };
    private static final long serialVersionUID = 0;
    public int bitField0_;
    private byte memoizedIsInitialized;
    public List<Method> methods_;
    public List<Mixin> mixins_;
    public volatile Object name_;
    public List<Option> options_;
    public SourceContext sourceContext_;
    public int syntax_;
    public volatile Object version_;

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ApiOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilderV3<Method, Method.Builder, MethodOrBuilder> methodsBuilder_;
        private List<Method> methods_;
        private RepeatedFieldBuilderV3<Mixin, Mixin.Builder, MixinOrBuilder> mixinsBuilder_;
        private List<Mixin> mixins_;
        private Object name_;
        private RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> optionsBuilder_;
        private List<Option> options_;
        private SingleFieldBuilderV3<SourceContext, SourceContext.Builder, SourceContextOrBuilder> sourceContextBuilder_;
        private SourceContext sourceContext_;
        private int syntax_;
        private Object version_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ApiProto.internal_static_google_protobuf_Api_descriptor;
        }

        public final Descriptors.Descriptor getDescriptorForType() {
            return ApiProto.internal_static_google_protobuf_Api_descriptor;
        }

        public final int getSyntaxValue() {
            return this.syntax_;
        }

        public final Builder clearSyntax() {
            this.syntax_ = 0;
            onChanged();
            return this;
        }

        public final Api getDefaultInstanceForType() {
            return Api.getDefaultInstance();
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                getMethodsFieldBuilder();
                getOptionsFieldBuilder();
                getMixinsFieldBuilder();
            }
        }

        public final Method.Builder addMethodsBuilder() {
            return (Method.Builder) getMethodsFieldBuilder().addBuilder(Method.getDefaultInstance());
        }

        public final Mixin.Builder addMixinsBuilder() {
            return (Mixin.Builder) getMixinsFieldBuilder().addBuilder(Mixin.getDefaultInstance());
        }

        public final Option.Builder addOptionsBuilder() {
            return (Option.Builder) getOptionsFieldBuilder().addBuilder(Option.getDefaultInstance());
        }

        public final Api build() {
            Api buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public final Builder clearName() {
            this.name_ = Api.getDefaultInstance().getName();
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

        public final Builder clearVersion() {
            this.version_ = Api.getDefaultInstance().getVersion();
            onChanged();
            return this;
        }

        public final List<Method.Builder> getMethodsBuilderList() {
            return getMethodsFieldBuilder().getBuilderList();
        }

        public final List<Mixin.Builder> getMixinsBuilderList() {
            return getMixinsFieldBuilder().getBuilderList();
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
            return ApiProto.internal_static_google_protobuf_Api_fieldAccessorTable.ensureFieldAccessorsInitialized(Api.class, Builder.class);
        }

        private void ensureMethodsIsMutable() {
            if ((this.bitField0_ & 2) != 2) {
                this.methods_ = new ArrayList(this.methods_);
                this.bitField0_ |= 2;
            }
        }

        private void ensureMixinsIsMutable() {
            if ((this.bitField0_ & 32) != 32) {
                this.mixins_ = new ArrayList(this.mixins_);
                this.bitField0_ |= 32;
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

        public final Builder clearMethods() {
            if (this.methodsBuilder_ == null) {
                this.methods_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
            } else {
                this.methodsBuilder_.clear();
            }
            return this;
        }

        public final Builder clearMixins() {
            if (this.mixinsBuilder_ == null) {
                this.mixins_ = Collections.emptyList();
                this.bitField0_ &= -33;
                onChanged();
            } else {
                this.mixinsBuilder_.clear();
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

        public final int getMethodsCount() {
            if (this.methodsBuilder_ == null) {
                return this.methods_.size();
            }
            return this.methodsBuilder_.getCount();
        }

        public final List<Method> getMethodsList() {
            if (this.methodsBuilder_ == null) {
                return Collections.unmodifiableList(this.methods_);
            }
            return this.methodsBuilder_.getMessageList();
        }

        public final List<? extends MethodOrBuilder> getMethodsOrBuilderList() {
            if (this.methodsBuilder_ != null) {
                return this.methodsBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.methods_);
        }

        public final int getMixinsCount() {
            if (this.mixinsBuilder_ == null) {
                return this.mixins_.size();
            }
            return this.mixinsBuilder_.getCount();
        }

        public final List<Mixin> getMixinsList() {
            if (this.mixinsBuilder_ == null) {
                return Collections.unmodifiableList(this.mixins_);
            }
            return this.mixinsBuilder_.getMessageList();
        }

        public final List<? extends MixinOrBuilder> getMixinsOrBuilderList() {
            if (this.mixinsBuilder_ != null) {
                return this.mixinsBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.mixins_);
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

        public final String getVersion() {
            Object obj = this.version_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.version_ = stringUtf8;
            return stringUtf8;
        }

        public final ByteString getVersionBytes() {
            Object obj = this.version_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.version_ = copyFromUtf8;
            return copyFromUtf8;
        }

        private Builder() {
            this.name_ = "";
            this.methods_ = Collections.emptyList();
            this.options_ = Collections.emptyList();
            this.version_ = "";
            this.sourceContext_ = null;
            this.mixins_ = Collections.emptyList();
            this.syntax_ = 0;
            maybeForceBuilderInitialization();
        }

        private RepeatedFieldBuilderV3<Method, Method.Builder, MethodOrBuilder> getMethodsFieldBuilder() {
            boolean z;
            if (this.methodsBuilder_ == null) {
                List<Method> list = this.methods_;
                if ((this.bitField0_ & 2) == 2) {
                    z = true;
                } else {
                    z = false;
                }
                this.methodsBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                this.methods_ = null;
            }
            return this.methodsBuilder_;
        }

        private RepeatedFieldBuilderV3<Mixin, Mixin.Builder, MixinOrBuilder> getMixinsFieldBuilder() {
            boolean z;
            if (this.mixinsBuilder_ == null) {
                List<Mixin> list = this.mixins_;
                if ((this.bitField0_ & 32) == 32) {
                    z = true;
                } else {
                    z = false;
                }
                this.mixinsBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                this.mixins_ = null;
            }
            return this.mixinsBuilder_;
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

        public final Builder clear() {
            super.clear();
            this.name_ = "";
            if (this.methodsBuilder_ == null) {
                this.methods_ = Collections.emptyList();
                this.bitField0_ &= -3;
            } else {
                this.methodsBuilder_.clear();
            }
            if (this.optionsBuilder_ == null) {
                this.options_ = Collections.emptyList();
                this.bitField0_ &= -5;
            } else {
                this.optionsBuilder_.clear();
            }
            this.version_ = "";
            if (this.sourceContextBuilder_ == null) {
                this.sourceContext_ = null;
            } else {
                this.sourceContext_ = null;
                this.sourceContextBuilder_ = null;
            }
            if (this.mixinsBuilder_ == null) {
                this.mixins_ = Collections.emptyList();
                this.bitField0_ &= -33;
            } else {
                this.mixinsBuilder_.clear();
            }
            this.syntax_ = 0;
            return this;
        }

        public final Api buildPartial() {
            Api api = new Api((GeneratedMessageV3.Builder) this);
            api.name_ = this.name_;
            if (this.methodsBuilder_ == null) {
                if ((this.bitField0_ & 2) == 2) {
                    this.methods_ = Collections.unmodifiableList(this.methods_);
                    this.bitField0_ &= -3;
                }
                api.methods_ = this.methods_;
            } else {
                api.methods_ = this.methodsBuilder_.build();
            }
            if (this.optionsBuilder_ == null) {
                if ((this.bitField0_ & 4) == 4) {
                    this.options_ = Collections.unmodifiableList(this.options_);
                    this.bitField0_ &= -5;
                }
                api.options_ = this.options_;
            } else {
                api.options_ = this.optionsBuilder_.build();
            }
            api.version_ = this.version_;
            if (this.sourceContextBuilder_ == null) {
                api.sourceContext_ = this.sourceContext_;
            } else {
                api.sourceContext_ = (SourceContext) this.sourceContextBuilder_.build();
            }
            if (this.mixinsBuilder_ == null) {
                if ((this.bitField0_ & 32) == 32) {
                    this.mixins_ = Collections.unmodifiableList(this.mixins_);
                    this.bitField0_ &= -33;
                }
                api.mixins_ = this.mixins_;
            } else {
                api.mixins_ = this.mixinsBuilder_.build();
            }
            api.syntax_ = this.syntax_;
            api.bitField0_ = 0;
            onBuilt();
            return api;
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

        public final Method.Builder getMethodsBuilder(int i) {
            return (Method.Builder) getMethodsFieldBuilder().getBuilder(i);
        }

        public final Mixin.Builder getMixinsBuilder(int i) {
            return (Mixin.Builder) getMixinsFieldBuilder().getBuilder(i);
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

        public final Builder setVersion(String str) {
            if (str != null) {
                this.version_ = str;
                onChanged();
                return this;
            }
            throw new NullPointerException();
        }

        public final Builder addAllMethods(Iterable<? extends Method> iterable) {
            if (this.methodsBuilder_ == null) {
                ensureMethodsIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.methods_);
                onChanged();
            } else {
                this.methodsBuilder_.addAllMessages(iterable);
            }
            return this;
        }

        public final Builder addAllMixins(Iterable<? extends Mixin> iterable) {
            if (this.mixinsBuilder_ == null) {
                ensureMixinsIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.mixins_);
                onChanged();
            } else {
                this.mixinsBuilder_.addAllMessages(iterable);
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

        public final Method.Builder addMethodsBuilder(int i) {
            return (Method.Builder) getMethodsFieldBuilder().addBuilder(i, Method.getDefaultInstance());
        }

        public final Mixin.Builder addMixinsBuilder(int i) {
            return (Mixin.Builder) getMixinsFieldBuilder().addBuilder(i, Mixin.getDefaultInstance());
        }

        public final Option.Builder addOptionsBuilder(int i) {
            return (Option.Builder) getOptionsFieldBuilder().addBuilder(i, Option.getDefaultInstance());
        }

        public final Method getMethods(int i) {
            if (this.methodsBuilder_ == null) {
                return this.methods_.get(i);
            }
            return (Method) this.methodsBuilder_.getMessage(i);
        }

        public final MethodOrBuilder getMethodsOrBuilder(int i) {
            if (this.methodsBuilder_ == null) {
                return this.methods_.get(i);
            }
            return (MethodOrBuilder) this.methodsBuilder_.getMessageOrBuilder(i);
        }

        public final Mixin getMixins(int i) {
            if (this.mixinsBuilder_ == null) {
                return this.mixins_.get(i);
            }
            return (Mixin) this.mixinsBuilder_.getMessage(i);
        }

        public final MixinOrBuilder getMixinsOrBuilder(int i) {
            if (this.mixinsBuilder_ == null) {
                return this.mixins_.get(i);
            }
            return (MixinOrBuilder) this.mixinsBuilder_.getMessageOrBuilder(i);
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

        public final Builder removeMethods(int i) {
            if (this.methodsBuilder_ == null) {
                ensureMethodsIsMutable();
                this.methods_.remove(i);
                onChanged();
            } else {
                this.methodsBuilder_.remove(i);
            }
            return this;
        }

        public final Builder removeMixins(int i) {
            if (this.mixinsBuilder_ == null) {
                ensureMixinsIsMutable();
                this.mixins_.remove(i);
                onChanged();
            } else {
                this.mixinsBuilder_.remove(i);
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

        public final Builder setVersionBytes(ByteString byteString) {
            if (byteString != null) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.version_ = byteString;
                onChanged();
                return this;
            }
            throw new NullPointerException();
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

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.name_ = "";
            this.methods_ = Collections.emptyList();
            this.options_ = Collections.emptyList();
            this.version_ = "";
            this.sourceContext_ = null;
            this.mixins_ = Collections.emptyList();
            this.syntax_ = 0;
            maybeForceBuilderInitialization();
        }

        public final Builder addMethods(Method.Builder builder) {
            if (this.methodsBuilder_ == null) {
                ensureMethodsIsMutable();
                this.methods_.add(builder.build());
                onChanged();
            } else {
                this.methodsBuilder_.addMessage(builder.build());
            }
            return this;
        }

        public final Builder addMixins(Mixin.Builder builder) {
            if (this.mixinsBuilder_ == null) {
                ensureMixinsIsMutable();
                this.mixins_.add(builder.build());
                onChanged();
            } else {
                this.mixinsBuilder_.addMessage(builder.build());
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
            if (message instanceof Api) {
                return mergeFrom((Api) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public final Builder addMethods(Method method) {
            if (this.methodsBuilder_ != null) {
                this.methodsBuilder_.addMessage(method);
            } else if (method != null) {
                ensureMethodsIsMutable();
                this.methods_.add(method);
                onChanged();
            } else {
                throw new NullPointerException();
            }
            return this;
        }

        public final Builder addMixins(Mixin mixin) {
            if (this.mixinsBuilder_ != null) {
                this.mixinsBuilder_.addMessage(mixin);
            } else if (mixin != null) {
                ensureMixinsIsMutable();
                this.mixins_.add(mixin);
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

        public final Builder mergeFrom(Api api) {
            RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilderV3;
            RepeatedFieldBuilderV3<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilderV32;
            if (api == Api.getDefaultInstance()) {
                return this;
            }
            if (!api.getName().isEmpty()) {
                this.name_ = api.name_;
                onChanged();
            }
            RepeatedFieldBuilderV3<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilderV33 = null;
            if (this.methodsBuilder_ == null) {
                if (!api.methods_.isEmpty()) {
                    if (this.methods_.isEmpty()) {
                        this.methods_ = api.methods_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureMethodsIsMutable();
                        this.methods_.addAll(api.methods_);
                    }
                    onChanged();
                }
            } else if (!api.methods_.isEmpty()) {
                if (this.methodsBuilder_.isEmpty()) {
                    this.methodsBuilder_.dispose();
                    this.methodsBuilder_ = null;
                    this.methods_ = api.methods_;
                    this.bitField0_ &= -3;
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        repeatedFieldBuilderV32 = getMethodsFieldBuilder();
                    } else {
                        repeatedFieldBuilderV32 = null;
                    }
                    this.methodsBuilder_ = repeatedFieldBuilderV32;
                } else {
                    this.methodsBuilder_.addAllMessages(api.methods_);
                }
            }
            if (this.optionsBuilder_ == null) {
                if (!api.options_.isEmpty()) {
                    if (this.options_.isEmpty()) {
                        this.options_ = api.options_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureOptionsIsMutable();
                        this.options_.addAll(api.options_);
                    }
                    onChanged();
                }
            } else if (!api.options_.isEmpty()) {
                if (this.optionsBuilder_.isEmpty()) {
                    this.optionsBuilder_.dispose();
                    this.optionsBuilder_ = null;
                    this.options_ = api.options_;
                    this.bitField0_ &= -5;
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        repeatedFieldBuilderV3 = getOptionsFieldBuilder();
                    } else {
                        repeatedFieldBuilderV3 = null;
                    }
                    this.optionsBuilder_ = repeatedFieldBuilderV3;
                } else {
                    this.optionsBuilder_.addAllMessages(api.options_);
                }
            }
            if (!api.getVersion().isEmpty()) {
                this.version_ = api.version_;
                onChanged();
            }
            if (api.hasSourceContext()) {
                mergeSourceContext(api.getSourceContext());
            }
            if (this.mixinsBuilder_ == null) {
                if (!api.mixins_.isEmpty()) {
                    if (this.mixins_.isEmpty()) {
                        this.mixins_ = api.mixins_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureMixinsIsMutable();
                        this.mixins_.addAll(api.mixins_);
                    }
                    onChanged();
                }
            } else if (!api.mixins_.isEmpty()) {
                if (this.mixinsBuilder_.isEmpty()) {
                    this.mixinsBuilder_.dispose();
                    this.mixinsBuilder_ = null;
                    this.mixins_ = api.mixins_;
                    this.bitField0_ &= -33;
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        repeatedFieldBuilderV33 = getMixinsFieldBuilder();
                    }
                    this.mixinsBuilder_ = repeatedFieldBuilderV33;
                } else {
                    this.mixinsBuilder_.addAllMessages(api.mixins_);
                }
            }
            if (api.syntax_ != 0) {
                setSyntaxValue(api.getSyntaxValue());
            }
            mergeUnknownFields(api.unknownFields);
            onChanged();
            return this;
        }

        public final Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        public final Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        public final Builder addMethods(int i, Method.Builder builder) {
            if (this.methodsBuilder_ == null) {
                ensureMethodsIsMutable();
                this.methods_.add(i, builder.build());
                onChanged();
            } else {
                this.methodsBuilder_.addMessage(i, builder.build());
            }
            return this;
        }

        public final Builder addMixins(int i, Mixin.Builder builder) {
            if (this.mixinsBuilder_ == null) {
                ensureMixinsIsMutable();
                this.mixins_.add(i, builder.build());
                onChanged();
            } else {
                this.mixinsBuilder_.addMessage(i, builder.build());
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

        public final Builder setMethods(int i, Method.Builder builder) {
            if (this.methodsBuilder_ == null) {
                ensureMethodsIsMutable();
                this.methods_.set(i, builder.build());
                onChanged();
            } else {
                this.methodsBuilder_.setMessage(i, builder.build());
            }
            return this;
        }

        public final Builder setMixins(int i, Mixin.Builder builder) {
            if (this.mixinsBuilder_ == null) {
                ensureMixinsIsMutable();
                this.mixins_.set(i, builder.build());
                onChanged();
            } else {
                this.mixinsBuilder_.setMessage(i, builder.build());
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

        public final Builder addMethods(int i, Method method) {
            if (this.methodsBuilder_ != null) {
                this.methodsBuilder_.addMessage(i, method);
            } else if (method != null) {
                ensureMethodsIsMutable();
                this.methods_.add(i, method);
                onChanged();
            } else {
                throw new NullPointerException();
            }
            return this;
        }

        public final Builder addMixins(int i, Mixin mixin) {
            if (this.mixinsBuilder_ != null) {
                this.mixinsBuilder_.addMessage(i, mixin);
            } else if (mixin != null) {
                ensureMixinsIsMutable();
                this.mixins_.add(i, mixin);
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
        public final com.google.protobuf.Api.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser<com.google.protobuf.Api> r1 = com.google.protobuf.Api.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                com.google.protobuf.Api r3 = (com.google.protobuf.Api) r3     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                if (r3 == 0) goto L_0x000e
                r2.mergeFrom((com.google.protobuf.Api) r3)
            L_0x000e:
                return r2
            L_0x000f:
                r3 = move-exception
                goto L_0x001f
            L_0x0011:
                r3 = move-exception
                com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x000f }
                com.google.protobuf.Api r4 = (com.google.protobuf.Api) r4     // Catch:{ all -> 0x000f }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001d }
                throw r3     // Catch:{ all -> 0x001d }
            L_0x001d:
                r3 = move-exception
                r0 = r4
            L_0x001f:
                if (r0 == 0) goto L_0x0024
                r2.mergeFrom((com.google.protobuf.Api) r0)
            L_0x0024:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Api.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.Api$Builder");
        }

        public final Builder setMethods(int i, Method method) {
            if (this.methodsBuilder_ != null) {
                this.methodsBuilder_.setMessage(i, method);
            } else if (method != null) {
                ensureMethodsIsMutable();
                this.methods_.set(i, method);
                onChanged();
            } else {
                throw new NullPointerException();
            }
            return this;
        }

        public final Builder setMixins(int i, Mixin mixin) {
            if (this.mixinsBuilder_ != null) {
                this.mixinsBuilder_.setMessage(i, mixin);
            } else if (mixin != null) {
                ensureMixinsIsMutable();
                this.mixins_.set(i, mixin);
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

    public static Api getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ApiProto.internal_static_google_protobuf_Api_descriptor;
    }

    public static Parser<Api> parser() {
        return PARSER;
    }

    public final Api getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public final List<Method> getMethodsList() {
        return this.methods_;
    }

    public final List<? extends MethodOrBuilder> getMethodsOrBuilderList() {
        return this.methods_;
    }

    public final List<Mixin> getMixinsList() {
        return this.mixins_;
    }

    public final List<? extends MixinOrBuilder> getMixinsOrBuilderList() {
        return this.mixins_;
    }

    public final List<Option> getOptionsList() {
        return this.options_;
    }

    public final List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    public final Parser<Api> getParserForType() {
        return PARSER;
    }

    public final int getSyntaxValue() {
        return this.syntax_;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    public static Api parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Api) PARSER.parseFrom(bArr);
    }

    public static Api parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Api) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public final int getMethodsCount() {
        return this.methods_.size();
    }

    public final int getMixinsCount() {
        return this.mixins_.size();
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
        return ApiProto.internal_static_google_protobuf_Api_fieldAccessorTable.ensureFieldAccessorsInitialized(Api.class, Builder.class);
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

    public final String getVersion() {
        Object obj = this.version_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.version_ = stringUtf8;
        return stringUtf8;
    }

    public final ByteString getVersionBytes() {
        Object obj = this.version_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.version_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public final Builder toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new Builder();
        }
        return new Builder().mergeFrom(this);
    }

    private Api() {
        this.memoizedIsInitialized = -1;
        this.name_ = "";
        this.methods_ = Collections.emptyList();
        this.options_ = Collections.emptyList();
        this.version_ = "";
        this.mixins_ = Collections.emptyList();
        this.syntax_ = 0;
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
        for (int i4 = 0; i4 < this.methods_.size(); i4++) {
            i3 += CodedOutputStream.computeMessageSize(2, this.methods_.get(i4));
        }
        for (int i5 = 0; i5 < this.options_.size(); i5++) {
            i3 += CodedOutputStream.computeMessageSize(3, this.options_.get(i5));
        }
        if (!getVersionBytes().isEmpty()) {
            i3 += GeneratedMessageV3.computeStringSize(4, this.version_);
        }
        if (this.sourceContext_ != null) {
            i3 += CodedOutputStream.computeMessageSize(5, getSourceContext());
        }
        for (int i6 = 0; i6 < this.mixins_.size(); i6++) {
            i3 += CodedOutputStream.computeMessageSize(6, this.mixins_.get(i6));
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            i3 += CodedOutputStream.computeEnumSize(7, this.syntax_);
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
        if (getMethodsCount() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + getMethodsList().hashCode();
        }
        if (getOptionsCount() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + getOptionsList().hashCode();
        }
        int hashCode2 = (((hashCode * 37) + 4) * 53) + getVersion().hashCode();
        if (hasSourceContext()) {
            hashCode2 = (((hashCode2 * 37) + 5) * 53) + getSourceContext().hashCode();
        }
        if (getMixinsCount() > 0) {
            hashCode2 = (((hashCode2 * 37) + 6) * 53) + getMixinsList().hashCode();
        }
        int hashCode3 = (((((hashCode2 * 37) + 7) * 53) + this.syntax_) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode3;
        return hashCode3;
    }

    private Api(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    public static Builder newBuilder(Api api) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(api);
    }

    public static Api parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Api) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Api parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Api) PARSER.parseFrom(byteString);
    }

    public final Method getMethods(int i) {
        return this.methods_.get(i);
    }

    public final MethodOrBuilder getMethodsOrBuilder(int i) {
        return this.methods_.get(i);
    }

    public final Mixin getMixins(int i) {
        return this.mixins_.get(i);
    }

    public final MixinOrBuilder getMixinsOrBuilder(int i) {
        return this.mixins_.get(i);
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

    public static Api parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Api) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Api parseFrom(InputStream inputStream) throws IOException {
        return (Api) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Api)) {
            return super.equals(obj);
        }
        Api api = (Api) obj;
        if (!getName().equals(api.getName()) || !getMethodsList().equals(api.getMethodsList())) {
            z = false;
        } else {
            z = true;
        }
        if (!z || !getOptionsList().equals(api.getOptionsList())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 || !getVersion().equals(api.getVersion())) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3 || hasSourceContext() != api.hasSourceContext()) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (hasSourceContext()) {
            if (!z4 || !getSourceContext().equals(api.getSourceContext())) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        if (!z4 || !getMixinsList().equals(api.getMixinsList())) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z5 || this.syntax_ != api.syntax_) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (!z6 || !this.unknownFields.equals(api.unknownFields)) {
            z7 = false;
        }
        return z7;
    }

    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
        }
        for (int i = 0; i < this.methods_.size(); i++) {
            codedOutputStream.writeMessage(2, this.methods_.get(i));
        }
        for (int i2 = 0; i2 < this.options_.size(); i2++) {
            codedOutputStream.writeMessage(3, this.options_.get(i2));
        }
        if (!getVersionBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.version_);
        }
        if (this.sourceContext_ != null) {
            codedOutputStream.writeMessage(5, getSourceContext());
        }
        for (int i3 = 0; i3 < this.mixins_.size(); i3++) {
            codedOutputStream.writeMessage(6, this.mixins_.get(i3));
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            codedOutputStream.writeEnum(7, this.syntax_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static Api parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Api) PARSER.parseFrom(byteBuffer);
    }

    public static Api parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Api) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Api parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Api) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Api parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Api) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    private Api(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.methods_ = new ArrayList();
                                z2 |= true;
                            }
                            this.methods_.add(codedInputStream.readMessage(Method.parser(), extensionRegistryLite));
                        } else if (readTag == 26) {
                            if (!(z2 & true)) {
                                this.options_ = new ArrayList();
                                z2 |= true;
                            }
                            this.options_.add(codedInputStream.readMessage(Option.parser(), extensionRegistryLite));
                        } else if (readTag == 34) {
                            this.version_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 42) {
                            SourceContext.Builder builder = null;
                            builder = this.sourceContext_ != null ? this.sourceContext_.toBuilder() : builder;
                            this.sourceContext_ = (SourceContext) codedInputStream.readMessage(SourceContext.parser(), extensionRegistryLite);
                            if (builder != null) {
                                builder.mergeFrom(this.sourceContext_);
                                this.sourceContext_ = builder.buildPartial();
                            }
                        } else if (readTag == 50) {
                            if (!(z2 & true)) {
                                this.mixins_ = new ArrayList();
                                z2 |= true;
                            }
                            this.mixins_.add(codedInputStream.readMessage(Mixin.parser(), extensionRegistryLite));
                        } else if (readTag == 56) {
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
                        this.methods_ = Collections.unmodifiableList(this.methods_);
                    }
                    if (z2 & true) {
                        this.options_ = Collections.unmodifiableList(this.options_);
                    }
                    if (z2 & true) {
                        this.mixins_ = Collections.unmodifiableList(this.mixins_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.methods_ = Collections.unmodifiableList(this.methods_);
            }
            if (z2 & true) {
                this.options_ = Collections.unmodifiableList(this.options_);
            }
            if (z2 & true) {
                this.mixins_ = Collections.unmodifiableList(this.mixins_);
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
            return;
        }
        throw new NullPointerException();
    }

    public static Api parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Api) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Api parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Api) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }
}
