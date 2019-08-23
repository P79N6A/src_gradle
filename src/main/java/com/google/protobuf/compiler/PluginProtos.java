package com.google.protobuf.compiler;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class PluginProtos {
    public static Descriptors.FileDescriptor descriptor;
    public static final Descriptors.Descriptor internal_static_google_protobuf_compiler_CodeGeneratorRequest_descriptor = getDescriptor().getMessageTypes().get(1);
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_compiler_CodeGeneratorRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_google_protobuf_compiler_CodeGeneratorRequest_descriptor, new String[]{"FileToGenerate", "Parameter", "ProtoFile", "CompilerVersion"});
    public static final Descriptors.Descriptor internal_static_google_protobuf_compiler_CodeGeneratorResponse_File_descriptor = internal_static_google_protobuf_compiler_CodeGeneratorResponse_descriptor.getNestedTypes().get(0);
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_compiler_CodeGeneratorResponse_File_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_google_protobuf_compiler_CodeGeneratorResponse_File_descriptor, new String[]{"Name", "InsertionPoint", "Content"});
    public static final Descriptors.Descriptor internal_static_google_protobuf_compiler_CodeGeneratorResponse_descriptor = getDescriptor().getMessageTypes().get(2);
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_compiler_CodeGeneratorResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_google_protobuf_compiler_CodeGeneratorResponse_descriptor, new String[]{"Error", "File"});
    public static final Descriptors.Descriptor internal_static_google_protobuf_compiler_Version_descriptor = getDescriptor().getMessageTypes().get(0);
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_compiler_Version_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_google_protobuf_compiler_Version_descriptor, new String[]{"Major", "Minor", "Patch", "Suffix"});

    public static final class CodeGeneratorRequest extends GeneratedMessageV3 implements CodeGeneratorRequestOrBuilder {
        private static final CodeGeneratorRequest DEFAULT_INSTANCE = new CodeGeneratorRequest();
        @Deprecated
        public static final Parser<CodeGeneratorRequest> PARSER = new AbstractParser<CodeGeneratorRequest>() {
            public final CodeGeneratorRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CodeGeneratorRequest(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        public int bitField0_;
        public Version compilerVersion_;
        public LazyStringList fileToGenerate_;
        private byte memoizedIsInitialized;
        public volatile Object parameter_;
        public List<DescriptorProtos.FileDescriptorProto> protoFile_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CodeGeneratorRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Version, Version.Builder, VersionOrBuilder> compilerVersionBuilder_;
            private Version compilerVersion_;
            private LazyStringList fileToGenerate_;
            private Object parameter_;
            private RepeatedFieldBuilderV3<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.Builder, DescriptorProtos.FileDescriptorProtoOrBuilder> protoFileBuilder_;
            private List<DescriptorProtos.FileDescriptorProto> protoFile_;

            public static final Descriptors.Descriptor getDescriptor() {
                return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorRequest_descriptor;
            }

            public final Descriptors.Descriptor getDescriptorForType() {
                return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorRequest_descriptor;
            }

            public final int getFileToGenerateCount() {
                return this.fileToGenerate_.size();
            }

            public final ProtocolStringList getFileToGenerateList() {
                return this.fileToGenerate_.getUnmodifiableView();
            }

            private void maybeForceBuilderInitialization() {
                if (CodeGeneratorRequest.alwaysUseFieldBuilders) {
                    getProtoFileFieldBuilder();
                    getCompilerVersionFieldBuilder();
                }
            }

            public final DescriptorProtos.FileDescriptorProto.Builder addProtoFileBuilder() {
                return (DescriptorProtos.FileDescriptorProto.Builder) getProtoFileFieldBuilder().addBuilder(DescriptorProtos.FileDescriptorProto.getDefaultInstance());
            }

            public final Builder clearFileToGenerate() {
                this.fileToGenerate_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public final List<DescriptorProtos.FileDescriptorProto.Builder> getProtoFileBuilderList() {
                return getProtoFileFieldBuilder().getBuilderList();
            }

            public final boolean hasCompilerVersion() {
                if ((this.bitField0_ & 8) == 8) {
                    return true;
                }
                return false;
            }

            public final boolean hasParameter() {
                if ((this.bitField0_ & 2) == 2) {
                    return true;
                }
                return false;
            }

            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CodeGeneratorRequest.class, Builder.class);
            }

            private Builder() {
                this.fileToGenerate_ = LazyStringArrayList.EMPTY;
                this.parameter_ = "";
                this.protoFile_ = Collections.emptyList();
                this.compilerVersion_ = null;
                maybeForceBuilderInitialization();
            }

            private void ensureFileToGenerateIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.fileToGenerate_ = new LazyStringArrayList(this.fileToGenerate_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureProtoFileIsMutable() {
                if ((this.bitField0_ & 4) != 4) {
                    this.protoFile_ = new ArrayList(this.protoFile_);
                    this.bitField0_ |= 4;
                }
            }

            private SingleFieldBuilderV3<Version, Version.Builder, VersionOrBuilder> getCompilerVersionFieldBuilder() {
                if (this.compilerVersionBuilder_ == null) {
                    this.compilerVersionBuilder_ = new SingleFieldBuilderV3<>(getCompilerVersion(), getParentForChildren(), isClean());
                    this.compilerVersion_ = null;
                }
                return this.compilerVersionBuilder_;
            }

            public final CodeGeneratorRequest build() {
                CodeGeneratorRequest buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final Builder clearCompilerVersion() {
                if (this.compilerVersionBuilder_ == null) {
                    this.compilerVersion_ = null;
                    onChanged();
                } else {
                    this.compilerVersionBuilder_.clear();
                }
                this.bitField0_ &= -9;
                return this;
            }

            public final Builder clearParameter() {
                this.bitField0_ &= -3;
                this.parameter_ = CodeGeneratorRequest.getDefaultInstance().getParameter();
                onChanged();
                return this;
            }

            public final Builder clearProtoFile() {
                if (this.protoFileBuilder_ == null) {
                    this.protoFile_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                    onChanged();
                } else {
                    this.protoFileBuilder_.clear();
                }
                return this;
            }

            public final Version getCompilerVersion() {
                if (this.compilerVersionBuilder_ != null) {
                    return (Version) this.compilerVersionBuilder_.getMessage();
                }
                if (this.compilerVersion_ == null) {
                    return Version.getDefaultInstance();
                }
                return this.compilerVersion_;
            }

            public final Version.Builder getCompilerVersionBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (Version.Builder) getCompilerVersionFieldBuilder().getBuilder();
            }

            public final VersionOrBuilder getCompilerVersionOrBuilder() {
                if (this.compilerVersionBuilder_ != null) {
                    return (VersionOrBuilder) this.compilerVersionBuilder_.getMessageOrBuilder();
                }
                if (this.compilerVersion_ == null) {
                    return Version.getDefaultInstance();
                }
                return this.compilerVersion_;
            }

            public final CodeGeneratorRequest getDefaultInstanceForType() {
                return CodeGeneratorRequest.getDefaultInstance();
            }

            public final String getParameter() {
                Object obj = this.parameter_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.parameter_ = stringUtf8;
                }
                return stringUtf8;
            }

            public final ByteString getParameterBytes() {
                Object obj = this.parameter_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.parameter_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final int getProtoFileCount() {
                if (this.protoFileBuilder_ == null) {
                    return this.protoFile_.size();
                }
                return this.protoFileBuilder_.getCount();
            }

            public final List<DescriptorProtos.FileDescriptorProto> getProtoFileList() {
                if (this.protoFileBuilder_ == null) {
                    return Collections.unmodifiableList(this.protoFile_);
                }
                return this.protoFileBuilder_.getMessageList();
            }

            public final List<? extends DescriptorProtos.FileDescriptorProtoOrBuilder> getProtoFileOrBuilderList() {
                if (this.protoFileBuilder_ != null) {
                    return this.protoFileBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.protoFile_);
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getProtoFileCount(); i++) {
                    if (!getProtoFile(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            private RepeatedFieldBuilderV3<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.Builder, DescriptorProtos.FileDescriptorProtoOrBuilder> getProtoFileFieldBuilder() {
                boolean z;
                if (this.protoFileBuilder_ == null) {
                    List<DescriptorProtos.FileDescriptorProto> list = this.protoFile_;
                    if ((this.bitField0_ & 4) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.protoFileBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.protoFile_ = null;
                }
                return this.protoFileBuilder_;
            }

            public final CodeGeneratorRequest buildPartial() {
                CodeGeneratorRequest codeGeneratorRequest = new CodeGeneratorRequest((GeneratedMessageV3.Builder) this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((this.bitField0_ & 1) == 1) {
                    this.fileToGenerate_ = this.fileToGenerate_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                codeGeneratorRequest.fileToGenerate_ = this.fileToGenerate_;
                if ((i & 2) != 2) {
                    i2 = 0;
                }
                codeGeneratorRequest.parameter_ = this.parameter_;
                if (this.protoFileBuilder_ == null) {
                    if ((this.bitField0_ & 4) == 4) {
                        this.protoFile_ = Collections.unmodifiableList(this.protoFile_);
                        this.bitField0_ &= -5;
                    }
                    codeGeneratorRequest.protoFile_ = this.protoFile_;
                } else {
                    codeGeneratorRequest.protoFile_ = this.protoFileBuilder_.build();
                }
                if ((i & 8) == 8) {
                    i2 |= 2;
                }
                if (this.compilerVersionBuilder_ == null) {
                    codeGeneratorRequest.compilerVersion_ = this.compilerVersion_;
                } else {
                    codeGeneratorRequest.compilerVersion_ = (Version) this.compilerVersionBuilder_.build();
                }
                codeGeneratorRequest.bitField0_ = i2;
                onBuilt();
                return codeGeneratorRequest;
            }

            public final Builder clear() {
                super.clear();
                this.fileToGenerate_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                this.parameter_ = "";
                this.bitField0_ &= -3;
                if (this.protoFileBuilder_ == null) {
                    this.protoFile_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                } else {
                    this.protoFileBuilder_.clear();
                }
                if (this.compilerVersionBuilder_ == null) {
                    this.compilerVersion_ = null;
                } else {
                    this.compilerVersionBuilder_.clear();
                }
                this.bitField0_ &= -9;
                return this;
            }

            public final Builder clone() {
                return (Builder) super.clone();
            }

            public final ByteString getFileToGenerateBytes(int i) {
                return this.fileToGenerate_.getByteString(i);
            }

            public final Builder addAllFileToGenerate(Iterable<String> iterable) {
                ensureFileToGenerateIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, (List<? super T>) this.fileToGenerate_);
                onChanged();
                return this;
            }

            public final String getFileToGenerate(int i) {
                return (String) this.fileToGenerate_.get(i);
            }

            public final DescriptorProtos.FileDescriptorProto.Builder getProtoFileBuilder(int i) {
                return (DescriptorProtos.FileDescriptorProto.Builder) getProtoFileFieldBuilder().getBuilder(i);
            }

            public final Builder addAllProtoFile(Iterable<? extends DescriptorProtos.FileDescriptorProto> iterable) {
                if (this.protoFileBuilder_ == null) {
                    ensureProtoFileIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.protoFile_);
                    onChanged();
                } else {
                    this.protoFileBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final Builder addFileToGenerate(String str) {
                if (str != null) {
                    ensureFileToGenerateIsMutable();
                    this.fileToGenerate_.add(str);
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            public final Builder addFileToGenerateBytes(ByteString byteString) {
                if (byteString != null) {
                    ensureFileToGenerateIsMutable();
                    this.fileToGenerate_.add(byteString);
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            public final DescriptorProtos.FileDescriptorProto.Builder addProtoFileBuilder(int i) {
                return (DescriptorProtos.FileDescriptorProto.Builder) getProtoFileFieldBuilder().addBuilder(i, DescriptorProtos.FileDescriptorProto.getDefaultInstance());
            }

            public final Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public final DescriptorProtos.FileDescriptorProto getProtoFile(int i) {
                if (this.protoFileBuilder_ == null) {
                    return this.protoFile_.get(i);
                }
                return (DescriptorProtos.FileDescriptorProto) this.protoFileBuilder_.getMessage(i);
            }

            public final DescriptorProtos.FileDescriptorProtoOrBuilder getProtoFileOrBuilder(int i) {
                if (this.protoFileBuilder_ == null) {
                    return this.protoFile_.get(i);
                }
                return (DescriptorProtos.FileDescriptorProtoOrBuilder) this.protoFileBuilder_.getMessageOrBuilder(i);
            }

            public final Builder removeProtoFile(int i) {
                if (this.protoFileBuilder_ == null) {
                    ensureProtoFileIsMutable();
                    this.protoFile_.remove(i);
                    onChanged();
                } else {
                    this.protoFileBuilder_.remove(i);
                }
                return this;
            }

            public final Builder setCompilerVersion(Version.Builder builder) {
                if (this.compilerVersionBuilder_ == null) {
                    this.compilerVersion_ = builder.build();
                    onChanged();
                } else {
                    this.compilerVersionBuilder_.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                return this;
            }

            public final Builder setParameter(String str) {
                if (str != null) {
                    this.bitField0_ |= 2;
                    this.parameter_ = str;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            public final Builder setParameterBytes(ByteString byteString) {
                if (byteString != null) {
                    this.bitField0_ |= 2;
                    this.parameter_ = byteString;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.fileToGenerate_ = LazyStringArrayList.EMPTY;
                this.parameter_ = "";
                this.protoFile_ = Collections.emptyList();
                this.compilerVersion_ = null;
                maybeForceBuilderInitialization();
            }

            public final Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public final Builder mergeCompilerVersion(Version version) {
                if (this.compilerVersionBuilder_ == null) {
                    if ((this.bitField0_ & 8) != 8 || this.compilerVersion_ == null || this.compilerVersion_ == Version.getDefaultInstance()) {
                        this.compilerVersion_ = version;
                    } else {
                        this.compilerVersion_ = Version.newBuilder(this.compilerVersion_).mergeFrom(version).buildPartial();
                    }
                    onChanged();
                } else {
                    this.compilerVersionBuilder_.mergeFrom(version);
                }
                this.bitField0_ |= 8;
                return this;
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public final Builder setCompilerVersion(Version version) {
                if (this.compilerVersionBuilder_ != null) {
                    this.compilerVersionBuilder_.setMessage(version);
                } else if (version != null) {
                    this.compilerVersion_ = version;
                    onChanged();
                } else {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public final Builder addProtoFile(DescriptorProtos.FileDescriptorProto.Builder builder) {
                if (this.protoFileBuilder_ == null) {
                    ensureProtoFileIsMutable();
                    this.protoFile_.add(builder.build());
                    onChanged();
                } else {
                    this.protoFileBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addProtoFile(DescriptorProtos.FileDescriptorProto fileDescriptorProto) {
                if (this.protoFileBuilder_ != null) {
                    this.protoFileBuilder_.addMessage(fileDescriptorProto);
                } else if (fileDescriptorProto != null) {
                    ensureProtoFileIsMutable();
                    this.protoFile_.add(fileDescriptorProto);
                    onChanged();
                } else {
                    throw new NullPointerException();
                }
                return this;
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof CodeGeneratorRequest) {
                    return mergeFrom((CodeGeneratorRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder mergeFrom(CodeGeneratorRequest codeGeneratorRequest) {
                if (codeGeneratorRequest == CodeGeneratorRequest.getDefaultInstance()) {
                    return this;
                }
                if (!codeGeneratorRequest.fileToGenerate_.isEmpty()) {
                    if (this.fileToGenerate_.isEmpty()) {
                        this.fileToGenerate_ = codeGeneratorRequest.fileToGenerate_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureFileToGenerateIsMutable();
                        this.fileToGenerate_.addAll(codeGeneratorRequest.fileToGenerate_);
                    }
                    onChanged();
                }
                if (codeGeneratorRequest.hasParameter()) {
                    this.bitField0_ |= 2;
                    this.parameter_ = codeGeneratorRequest.parameter_;
                    onChanged();
                }
                if (this.protoFileBuilder_ == null) {
                    if (!codeGeneratorRequest.protoFile_.isEmpty()) {
                        if (this.protoFile_.isEmpty()) {
                            this.protoFile_ = codeGeneratorRequest.protoFile_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureProtoFileIsMutable();
                            this.protoFile_.addAll(codeGeneratorRequest.protoFile_);
                        }
                        onChanged();
                    }
                } else if (!codeGeneratorRequest.protoFile_.isEmpty()) {
                    if (this.protoFileBuilder_.isEmpty()) {
                        this.protoFileBuilder_.dispose();
                        RepeatedFieldBuilderV3<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.Builder, DescriptorProtos.FileDescriptorProtoOrBuilder> repeatedFieldBuilderV3 = null;
                        this.protoFileBuilder_ = null;
                        this.protoFile_ = codeGeneratorRequest.protoFile_;
                        this.bitField0_ &= -5;
                        if (CodeGeneratorRequest.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getProtoFileFieldBuilder();
                        }
                        this.protoFileBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.protoFileBuilder_.addAllMessages(codeGeneratorRequest.protoFile_);
                    }
                }
                if (codeGeneratorRequest.hasCompilerVersion()) {
                    mergeCompilerVersion(codeGeneratorRequest.getCompilerVersion());
                }
                mergeUnknownFields(codeGeneratorRequest.unknownFields);
                onChanged();
                return this;
            }

            public final Builder addProtoFile(int i, DescriptorProtos.FileDescriptorProto.Builder builder) {
                if (this.protoFileBuilder_ == null) {
                    ensureProtoFileIsMutable();
                    this.protoFile_.add(i, builder.build());
                    onChanged();
                } else {
                    this.protoFileBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public final Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public final Builder setFileToGenerate(int i, String str) {
                if (str != null) {
                    ensureFileToGenerateIsMutable();
                    this.fileToGenerate_.set(i, str);
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            public final Builder setProtoFile(int i, DescriptorProtos.FileDescriptorProto.Builder builder) {
                if (this.protoFileBuilder_ == null) {
                    ensureProtoFileIsMutable();
                    this.protoFile_.set(i, builder.build());
                    onChanged();
                } else {
                    this.protoFileBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addProtoFile(int i, DescriptorProtos.FileDescriptorProto fileDescriptorProto) {
                if (this.protoFileBuilder_ != null) {
                    this.protoFileBuilder_.addMessage(i, fileDescriptorProto);
                } else if (fileDescriptorProto != null) {
                    ensureProtoFileIsMutable();
                    this.protoFile_.add(i, fileDescriptorProto);
                    onChanged();
                } else {
                    throw new NullPointerException();
                }
                return this;
            }

            public final Builder setProtoFile(int i, DescriptorProtos.FileDescriptorProto fileDescriptorProto) {
                if (this.protoFileBuilder_ != null) {
                    this.protoFileBuilder_.setMessage(i, fileDescriptorProto);
                } else if (fileDescriptorProto != null) {
                    ensureProtoFileIsMutable();
                    this.protoFile_.set(i, fileDescriptorProto);
                    onChanged();
                } else {
                    throw new NullPointerException();
                }
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.google.protobuf.compiler.PluginProtos$CodeGeneratorRequest> r1 = com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    com.google.protobuf.compiler.PluginProtos$CodeGeneratorRequest r3 = (com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest) r3     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    if (r3 == 0) goto L_0x000e
                    r2.mergeFrom((com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest) r3)
                L_0x000e:
                    return r2
                L_0x000f:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0011:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x000f }
                    com.google.protobuf.compiler.PluginProtos$CodeGeneratorRequest r4 = (com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest) r4     // Catch:{ all -> 0x000f }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.compiler.PluginProtos$CodeGeneratorRequest$Builder");
            }

            public final Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }
        }

        public static CodeGeneratorRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorRequest_descriptor;
        }

        public static Parser<CodeGeneratorRequest> parser() {
            return PARSER;
        }

        public final CodeGeneratorRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public final ProtocolStringList getFileToGenerateList() {
            return this.fileToGenerate_;
        }

        public final Parser<CodeGeneratorRequest> getParserForType() {
            return PARSER;
        }

        public final List<DescriptorProtos.FileDescriptorProto> getProtoFileList() {
            return this.protoFile_;
        }

        public final List<? extends DescriptorProtos.FileDescriptorProtoOrBuilder> getProtoFileOrBuilderList() {
            return this.protoFile_;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        public static CodeGeneratorRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CodeGeneratorRequest) PARSER.parseFrom(bArr);
        }

        public static CodeGeneratorRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CodeGeneratorRequest) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public final int getFileToGenerateCount() {
            return this.fileToGenerate_.size();
        }

        public final int getProtoFileCount() {
            return this.protoFile_.size();
        }

        public final Version getCompilerVersion() {
            if (this.compilerVersion_ == null) {
                return Version.getDefaultInstance();
            }
            return this.compilerVersion_;
        }

        public final VersionOrBuilder getCompilerVersionOrBuilder() {
            if (this.compilerVersion_ == null) {
                return Version.getDefaultInstance();
            }
            return this.compilerVersion_;
        }

        public final boolean hasCompilerVersion() {
            if ((this.bitField0_ & 2) == 2) {
                return true;
            }
            return false;
        }

        public final boolean hasParameter() {
            if ((this.bitField0_ & 1) == 1) {
                return true;
            }
            return false;
        }

        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CodeGeneratorRequest.class, Builder.class);
        }

        private CodeGeneratorRequest() {
            this.memoizedIsInitialized = -1;
            this.fileToGenerate_ = LazyStringArrayList.EMPTY;
            this.parameter_ = "";
            this.protoFile_ = Collections.emptyList();
        }

        public final String getParameter() {
            Object obj = this.parameter_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.parameter_ = stringUtf8;
            }
            return stringUtf8;
        }

        public final ByteString getParameterBytes() {
            Object obj = this.parameter_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.parameter_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < getProtoFileCount(); i++) {
                if (!getProtoFile(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
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
            for (int i3 = 0; i3 < this.fileToGenerate_.size(); i3++) {
                i2 += computeStringSizeNoTag(this.fileToGenerate_.getRaw(i3));
            }
            int size = i2 + 0 + (getFileToGenerateList().size() * 1);
            if ((this.bitField0_ & 1) == 1) {
                size += GeneratedMessageV3.computeStringSize(2, this.parameter_);
            }
            if ((this.bitField0_ & 2) == 2) {
                size += CodedOutputStream.computeMessageSize(3, getCompilerVersion());
            }
            for (int i4 = 0; i4 < this.protoFile_.size(); i4++) {
                size += CodedOutputStream.computeMessageSize(15, this.protoFile_.get(i4));
            }
            int serializedSize = size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public final int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = getDescriptor().hashCode() + 779;
            if (getFileToGenerateCount() > 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + getFileToGenerateList().hashCode();
            }
            if (hasParameter()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getParameter().hashCode();
            }
            if (getProtoFileCount() > 0) {
                hashCode = (((hashCode * 37) + 15) * 53) + getProtoFileList().hashCode();
            }
            if (hasCompilerVersion()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getCompilerVersion().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        private CodeGeneratorRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        public final ByteString getFileToGenerateBytes(int i) {
            return this.fileToGenerate_.getByteString(i);
        }

        public static Builder newBuilder(CodeGeneratorRequest codeGeneratorRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(codeGeneratorRequest);
        }

        public static CodeGeneratorRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CodeGeneratorRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CodeGeneratorRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CodeGeneratorRequest) PARSER.parseFrom(byteString);
        }

        public final String getFileToGenerate(int i) {
            return (String) this.fileToGenerate_.get(i);
        }

        public final DescriptorProtos.FileDescriptorProto getProtoFile(int i) {
            return this.protoFile_.get(i);
        }

        public final DescriptorProtos.FileDescriptorProtoOrBuilder getProtoFileOrBuilder(int i) {
            return this.protoFile_.get(i);
        }

        public static CodeGeneratorRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CodeGeneratorRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        /* access modifiers changed from: protected */
        public final Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.fileToGenerate_.size(); i++) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.fileToGenerate_.getRaw(i));
            }
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.parameter_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeMessage(3, getCompilerVersion());
            }
            for (int i2 = 0; i2 < this.protoFile_.size(); i2++) {
                codedOutputStream.writeMessage(15, this.protoFile_.get(i2));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static CodeGeneratorRequest parseFrom(InputStream inputStream) throws IOException {
            return (CodeGeneratorRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public final boolean equals(Object obj) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4 = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CodeGeneratorRequest)) {
                return super.equals(obj);
            }
            CodeGeneratorRequest codeGeneratorRequest = (CodeGeneratorRequest) obj;
            if (!getFileToGenerateList().equals(codeGeneratorRequest.getFileToGenerateList()) || hasParameter() != codeGeneratorRequest.hasParameter()) {
                z = false;
            } else {
                z = true;
            }
            if (hasParameter()) {
                if (!z || !getParameter().equals(codeGeneratorRequest.getParameter())) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (!z || !getProtoFileList().equals(codeGeneratorRequest.getProtoFileList())) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2 || hasCompilerVersion() != codeGeneratorRequest.hasCompilerVersion()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (hasCompilerVersion()) {
                if (!z3 || !getCompilerVersion().equals(codeGeneratorRequest.getCompilerVersion())) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            }
            if (!z3 || !this.unknownFields.equals(codeGeneratorRequest.unknownFields)) {
                z4 = false;
            }
            return z4;
        }

        public static CodeGeneratorRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CodeGeneratorRequest) PARSER.parseFrom(byteBuffer);
        }

        public static CodeGeneratorRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CodeGeneratorRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CodeGeneratorRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CodeGeneratorRequest) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CodeGeneratorRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CodeGeneratorRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private CodeGeneratorRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                ByteString readBytes = codedInputStream.readBytes();
                                if (!z2 || !true) {
                                    this.fileToGenerate_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.fileToGenerate_.add(readBytes);
                            } else if (readTag == 18) {
                                ByteString readBytes2 = codedInputStream.readBytes();
                                this.bitField0_ |= 1;
                                this.parameter_ = readBytes2;
                            } else if (readTag == 26) {
                                Version.Builder builder = null;
                                builder = (this.bitField0_ & 2) == 2 ? this.compilerVersion_.toBuilder() : builder;
                                this.compilerVersion_ = (Version) codedInputStream.readMessage(Version.PARSER, extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.compilerVersion_);
                                    this.compilerVersion_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 2;
                            } else if (readTag == 122) {
                                if (!(z2 & true)) {
                                    this.protoFile_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.protoFile_.add(codedInputStream.readMessage(DescriptorProtos.FileDescriptorProto.PARSER, extensionRegistryLite));
                            } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        if (z2 && true) {
                            this.fileToGenerate_ = this.fileToGenerate_.getUnmodifiableView();
                        }
                        if (z2 & true) {
                            this.protoFile_ = Collections.unmodifiableList(this.protoFile_);
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 && true) {
                    this.fileToGenerate_ = this.fileToGenerate_.getUnmodifiableView();
                }
                if (z2 & true) {
                    this.protoFile_ = Collections.unmodifiableList(this.protoFile_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw new NullPointerException();
        }

        public static CodeGeneratorRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CodeGeneratorRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CodeGeneratorRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CodeGeneratorRequest) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }
    }

    public interface CodeGeneratorRequestOrBuilder extends MessageOrBuilder {
        Version getCompilerVersion();

        VersionOrBuilder getCompilerVersionOrBuilder();

        String getFileToGenerate(int i);

        ByteString getFileToGenerateBytes(int i);

        int getFileToGenerateCount();

        List<String> getFileToGenerateList();

        String getParameter();

        ByteString getParameterBytes();

        DescriptorProtos.FileDescriptorProto getProtoFile(int i);

        int getProtoFileCount();

        List<DescriptorProtos.FileDescriptorProto> getProtoFileList();

        DescriptorProtos.FileDescriptorProtoOrBuilder getProtoFileOrBuilder(int i);

        List<? extends DescriptorProtos.FileDescriptorProtoOrBuilder> getProtoFileOrBuilderList();

        boolean hasCompilerVersion();

        boolean hasParameter();
    }

    public static final class CodeGeneratorResponse extends GeneratedMessageV3 implements CodeGeneratorResponseOrBuilder {
        private static final CodeGeneratorResponse DEFAULT_INSTANCE = new CodeGeneratorResponse();
        @Deprecated
        public static final Parser<CodeGeneratorResponse> PARSER = new AbstractParser<CodeGeneratorResponse>() {
            public final CodeGeneratorResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CodeGeneratorResponse(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        public int bitField0_;
        public volatile Object error_;
        public List<File> file_;
        private byte memoizedIsInitialized;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CodeGeneratorResponseOrBuilder {
            private int bitField0_;
            private Object error_;
            private RepeatedFieldBuilderV3<File, File.Builder, FileOrBuilder> fileBuilder_;
            private List<File> file_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_descriptor;
            }

            public final Descriptors.Descriptor getDescriptorForType() {
                return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (CodeGeneratorResponse.alwaysUseFieldBuilders) {
                    getFileFieldBuilder();
                }
            }

            public final File.Builder addFileBuilder() {
                return (File.Builder) getFileFieldBuilder().addBuilder(File.getDefaultInstance());
            }

            public final List<File.Builder> getFileBuilderList() {
                return getFileFieldBuilder().getBuilderList();
            }

            public final boolean hasError() {
                if ((this.bitField0_ & 1) == 1) {
                    return true;
                }
                return false;
            }

            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CodeGeneratorResponse.class, Builder.class);
            }

            private Builder() {
                this.error_ = "";
                this.file_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void ensureFileIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.file_ = new ArrayList(this.file_);
                    this.bitField0_ |= 2;
                }
            }

            public final CodeGeneratorResponse build() {
                CodeGeneratorResponse buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final Builder clearError() {
                this.bitField0_ &= -2;
                this.error_ = CodeGeneratorResponse.getDefaultInstance().getError();
                onChanged();
                return this;
            }

            public final Builder clearFile() {
                if (this.fileBuilder_ == null) {
                    this.file_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    this.fileBuilder_.clear();
                }
                return this;
            }

            public final CodeGeneratorResponse getDefaultInstanceForType() {
                return CodeGeneratorResponse.getDefaultInstance();
            }

            public final String getError() {
                Object obj = this.error_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.error_ = stringUtf8;
                }
                return stringUtf8;
            }

            public final ByteString getErrorBytes() {
                Object obj = this.error_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.error_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final int getFileCount() {
                if (this.fileBuilder_ == null) {
                    return this.file_.size();
                }
                return this.fileBuilder_.getCount();
            }

            public final List<File> getFileList() {
                if (this.fileBuilder_ == null) {
                    return Collections.unmodifiableList(this.file_);
                }
                return this.fileBuilder_.getMessageList();
            }

            public final List<? extends FileOrBuilder> getFileOrBuilderList() {
                if (this.fileBuilder_ != null) {
                    return this.fileBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.file_);
            }

            private RepeatedFieldBuilderV3<File, File.Builder, FileOrBuilder> getFileFieldBuilder() {
                boolean z;
                if (this.fileBuilder_ == null) {
                    List<File> list = this.file_;
                    if ((this.bitField0_ & 2) == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.fileBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.file_ = null;
                }
                return this.fileBuilder_;
            }

            public final CodeGeneratorResponse buildPartial() {
                CodeGeneratorResponse codeGeneratorResponse = new CodeGeneratorResponse((GeneratedMessageV3.Builder) this);
                int i = 1;
                if ((this.bitField0_ & 1) != 1) {
                    i = 0;
                }
                codeGeneratorResponse.error_ = this.error_;
                if (this.fileBuilder_ == null) {
                    if ((this.bitField0_ & 2) == 2) {
                        this.file_ = Collections.unmodifiableList(this.file_);
                        this.bitField0_ &= -3;
                    }
                    codeGeneratorResponse.file_ = this.file_;
                } else {
                    codeGeneratorResponse.file_ = this.fileBuilder_.build();
                }
                codeGeneratorResponse.bitField0_ = i;
                onBuilt();
                return codeGeneratorResponse;
            }

            public final Builder clear() {
                super.clear();
                this.error_ = "";
                this.bitField0_ &= -2;
                if (this.fileBuilder_ == null) {
                    this.file_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    this.fileBuilder_.clear();
                }
                return this;
            }

            public final Builder clone() {
                return (Builder) super.clone();
            }

            public final File.Builder getFileBuilder(int i) {
                return (File.Builder) getFileFieldBuilder().getBuilder(i);
            }

            public final Builder addAllFile(Iterable<? extends File> iterable) {
                if (this.fileBuilder_ == null) {
                    ensureFileIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.file_);
                    onChanged();
                } else {
                    this.fileBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final File.Builder addFileBuilder(int i) {
                return (File.Builder) getFileFieldBuilder().addBuilder(i, File.getDefaultInstance());
            }

            public final Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public final File getFile(int i) {
                if (this.fileBuilder_ == null) {
                    return this.file_.get(i);
                }
                return (File) this.fileBuilder_.getMessage(i);
            }

            public final FileOrBuilder getFileOrBuilder(int i) {
                if (this.fileBuilder_ == null) {
                    return this.file_.get(i);
                }
                return (FileOrBuilder) this.fileBuilder_.getMessageOrBuilder(i);
            }

            public final Builder removeFile(int i) {
                if (this.fileBuilder_ == null) {
                    ensureFileIsMutable();
                    this.file_.remove(i);
                    onChanged();
                } else {
                    this.fileBuilder_.remove(i);
                }
                return this;
            }

            public final Builder setError(String str) {
                if (str != null) {
                    this.bitField0_ |= 1;
                    this.error_ = str;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            public final Builder setErrorBytes(ByteString byteString) {
                if (byteString != null) {
                    this.bitField0_ |= 1;
                    this.error_ = byteString;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.error_ = "";
                this.file_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public final Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public final Builder addFile(File.Builder builder) {
                if (this.fileBuilder_ == null) {
                    ensureFileIsMutable();
                    this.file_.add(builder.build());
                    onChanged();
                } else {
                    this.fileBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addFile(File file) {
                if (this.fileBuilder_ != null) {
                    this.fileBuilder_.addMessage(file);
                } else if (file != null) {
                    ensureFileIsMutable();
                    this.file_.add(file);
                    onChanged();
                } else {
                    throw new NullPointerException();
                }
                return this;
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof CodeGeneratorResponse) {
                    return mergeFrom((CodeGeneratorResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder mergeFrom(CodeGeneratorResponse codeGeneratorResponse) {
                if (codeGeneratorResponse == CodeGeneratorResponse.getDefaultInstance()) {
                    return this;
                }
                if (codeGeneratorResponse.hasError()) {
                    this.bitField0_ |= 1;
                    this.error_ = codeGeneratorResponse.error_;
                    onChanged();
                }
                if (this.fileBuilder_ == null) {
                    if (!codeGeneratorResponse.file_.isEmpty()) {
                        if (this.file_.isEmpty()) {
                            this.file_ = codeGeneratorResponse.file_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureFileIsMutable();
                            this.file_.addAll(codeGeneratorResponse.file_);
                        }
                        onChanged();
                    }
                } else if (!codeGeneratorResponse.file_.isEmpty()) {
                    if (this.fileBuilder_.isEmpty()) {
                        this.fileBuilder_.dispose();
                        RepeatedFieldBuilderV3<File, File.Builder, FileOrBuilder> repeatedFieldBuilderV3 = null;
                        this.fileBuilder_ = null;
                        this.file_ = codeGeneratorResponse.file_;
                        this.bitField0_ &= -3;
                        if (CodeGeneratorResponse.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getFileFieldBuilder();
                        }
                        this.fileBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.fileBuilder_.addAllMessages(codeGeneratorResponse.file_);
                    }
                }
                mergeUnknownFields(codeGeneratorResponse.unknownFields);
                onChanged();
                return this;
            }

            public final Builder addFile(int i, File.Builder builder) {
                if (this.fileBuilder_ == null) {
                    ensureFileIsMutable();
                    this.file_.add(i, builder.build());
                    onChanged();
                } else {
                    this.fileBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public final Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public final Builder setFile(int i, File.Builder builder) {
                if (this.fileBuilder_ == null) {
                    ensureFileIsMutable();
                    this.file_.set(i, builder.build());
                    onChanged();
                } else {
                    this.fileBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addFile(int i, File file) {
                if (this.fileBuilder_ != null) {
                    this.fileBuilder_.addMessage(i, file);
                } else if (file != null) {
                    ensureFileIsMutable();
                    this.file_.add(i, file);
                    onChanged();
                } else {
                    throw new NullPointerException();
                }
                return this;
            }

            public final Builder setFile(int i, File file) {
                if (this.fileBuilder_ != null) {
                    this.fileBuilder_.setMessage(i, file);
                } else if (file != null) {
                    ensureFileIsMutable();
                    this.file_.set(i, file);
                    onChanged();
                } else {
                    throw new NullPointerException();
                }
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.google.protobuf.compiler.PluginProtos$CodeGeneratorResponse> r1 = com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    com.google.protobuf.compiler.PluginProtos$CodeGeneratorResponse r3 = (com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse) r3     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    if (r3 == 0) goto L_0x000e
                    r2.mergeFrom((com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse) r3)
                L_0x000e:
                    return r2
                L_0x000f:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0011:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x000f }
                    com.google.protobuf.compiler.PluginProtos$CodeGeneratorResponse r4 = (com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse) r4     // Catch:{ all -> 0x000f }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.compiler.PluginProtos$CodeGeneratorResponse$Builder");
            }

            public final Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }
        }

        public static final class File extends GeneratedMessageV3 implements FileOrBuilder {
            private static final File DEFAULT_INSTANCE = new File();
            @Deprecated
            public static final Parser<File> PARSER = new AbstractParser<File>() {
                public final File parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new File(codedInputStream, extensionRegistryLite);
                }
            };
            private static final long serialVersionUID = 0;
            public int bitField0_;
            public volatile Object content_;
            public volatile Object insertionPoint_;
            private byte memoizedIsInitialized;
            public volatile Object name_;

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FileOrBuilder {
                private int bitField0_;
                private Object content_;
                private Object insertionPoint_;
                private Object name_;

                private void maybeForceBuilderInitialization() {
                }

                public final boolean isInitialized() {
                    return true;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_File_descriptor;
                }

                public final Descriptors.Descriptor getDescriptorForType() {
                    return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_File_descriptor;
                }

                public final boolean hasContent() {
                    if ((this.bitField0_ & 4) == 4) {
                        return true;
                    }
                    return false;
                }

                public final boolean hasInsertionPoint() {
                    if ((this.bitField0_ & 2) == 2) {
                        return true;
                    }
                    return false;
                }

                public final boolean hasName() {
                    if ((this.bitField0_ & 1) == 1) {
                        return true;
                    }
                    return false;
                }

                public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_File_fieldAccessorTable.ensureFieldAccessorsInitialized(File.class, Builder.class);
                }

                private Builder() {
                    this.name_ = "";
                    this.insertionPoint_ = "";
                    this.content_ = "";
                    maybeForceBuilderInitialization();
                }

                public final File build() {
                    File buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial);
                }

                public final Builder clearContent() {
                    this.bitField0_ &= -5;
                    this.content_ = File.getDefaultInstance().getContent();
                    onChanged();
                    return this;
                }

                public final Builder clearInsertionPoint() {
                    this.bitField0_ &= -3;
                    this.insertionPoint_ = File.getDefaultInstance().getInsertionPoint();
                    onChanged();
                    return this;
                }

                public final Builder clearName() {
                    this.bitField0_ &= -2;
                    this.name_ = File.getDefaultInstance().getName();
                    onChanged();
                    return this;
                }

                public final String getContent() {
                    Object obj = this.content_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.content_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                public final ByteString getContentBytes() {
                    Object obj = this.content_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.content_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public final File getDefaultInstanceForType() {
                    return File.getDefaultInstance();
                }

                public final String getInsertionPoint() {
                    Object obj = this.insertionPoint_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.insertionPoint_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                public final ByteString getInsertionPointBytes() {
                    Object obj = this.insertionPoint_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.insertionPoint_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public final String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.name_ = stringUtf8;
                    }
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

                public final File buildPartial() {
                    File file = new File((GeneratedMessageV3.Builder) this);
                    int i = this.bitField0_;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    file.name_ = this.name_;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    file.insertionPoint_ = this.insertionPoint_;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    file.content_ = this.content_;
                    file.bitField0_ = i2;
                    onBuilt();
                    return file;
                }

                public final Builder clear() {
                    super.clear();
                    this.name_ = "";
                    this.bitField0_ &= -2;
                    this.insertionPoint_ = "";
                    this.bitField0_ &= -3;
                    this.content_ = "";
                    this.bitField0_ &= -5;
                    return this;
                }

                public final Builder clone() {
                    return (Builder) super.clone();
                }

                public final Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                public final Builder setContent(String str) {
                    if (str != null) {
                        this.bitField0_ |= 4;
                        this.content_ = str;
                        onChanged();
                        return this;
                    }
                    throw new NullPointerException();
                }

                public final Builder setContentBytes(ByteString byteString) {
                    if (byteString != null) {
                        this.bitField0_ |= 4;
                        this.content_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw new NullPointerException();
                }

                public final Builder setInsertionPoint(String str) {
                    if (str != null) {
                        this.bitField0_ |= 2;
                        this.insertionPoint_ = str;
                        onChanged();
                        return this;
                    }
                    throw new NullPointerException();
                }

                public final Builder setInsertionPointBytes(ByteString byteString) {
                    if (byteString != null) {
                        this.bitField0_ |= 2;
                        this.insertionPoint_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw new NullPointerException();
                }

                public final Builder setName(String str) {
                    if (str != null) {
                        this.bitField0_ |= 1;
                        this.name_ = str;
                        onChanged();
                        return this;
                    }
                    throw new NullPointerException();
                }

                public final Builder setNameBytes(ByteString byteString) {
                    if (byteString != null) {
                        this.bitField0_ |= 1;
                        this.name_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw new NullPointerException();
                }

                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.name_ = "";
                    this.insertionPoint_ = "";
                    this.content_ = "";
                    maybeForceBuilderInitialization();
                }

                public final Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (Builder) super.clearOneof(oneofDescriptor);
                }

                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.mergeUnknownFields(unknownFieldSet);
                }

                public final Builder mergeFrom(Message message) {
                    if (message instanceof File) {
                        return mergeFrom((File) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public final Builder mergeFrom(File file) {
                    if (file == File.getDefaultInstance()) {
                        return this;
                    }
                    if (file.hasName()) {
                        this.bitField0_ |= 1;
                        this.name_ = file.name_;
                        onChanged();
                    }
                    if (file.hasInsertionPoint()) {
                        this.bitField0_ |= 2;
                        this.insertionPoint_ = file.insertionPoint_;
                        onChanged();
                    }
                    if (file.hasContent()) {
                        this.bitField0_ |= 4;
                        this.content_ = file.content_;
                        onChanged();
                    }
                    mergeUnknownFields(file.unknownFields);
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
                public final com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.Parser<com.google.protobuf.compiler.PluginProtos$CodeGeneratorResponse$File> r1 = com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                        java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                        com.google.protobuf.compiler.PluginProtos$CodeGeneratorResponse$File r3 = (com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File) r3     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                        if (r3 == 0) goto L_0x000e
                        r2.mergeFrom((com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File) r3)
                    L_0x000e:
                        return r2
                    L_0x000f:
                        r3 = move-exception
                        goto L_0x001f
                    L_0x0011:
                        r3 = move-exception
                        com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x000f }
                        com.google.protobuf.compiler.PluginProtos$CodeGeneratorResponse$File r4 = (com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File) r4     // Catch:{ all -> 0x000f }
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001d }
                        throw r3     // Catch:{ all -> 0x001d }
                    L_0x001d:
                        r3 = move-exception
                        r0 = r4
                    L_0x001f:
                        if (r0 == 0) goto L_0x0024
                        r2.mergeFrom((com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File) r0)
                    L_0x0024:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.compiler.PluginProtos$CodeGeneratorResponse$File$Builder");
                }

                public final Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                    return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
                }
            }

            public static File getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_File_descriptor;
            }

            public static Parser<File> parser() {
                return PARSER;
            }

            public final File getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public final Parser<File> getParserForType() {
                return PARSER;
            }

            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            public static File parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (File) PARSER.parseFrom(bArr);
            }

            public static File parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (File) PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public final boolean hasContent() {
                if ((this.bitField0_ & 4) == 4) {
                    return true;
                }
                return false;
            }

            public final boolean hasInsertionPoint() {
                if ((this.bitField0_ & 2) == 2) {
                    return true;
                }
                return false;
            }

            public final boolean hasName() {
                if ((this.bitField0_ & 1) == 1) {
                    return true;
                }
                return false;
            }

            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_File_fieldAccessorTable.ensureFieldAccessorsInitialized(File.class, Builder.class);
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

            private File() {
                this.memoizedIsInitialized = -1;
                this.name_ = "";
                this.insertionPoint_ = "";
                this.content_ = "";
            }

            public final String getContent() {
                Object obj = this.content_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.content_ = stringUtf8;
                }
                return stringUtf8;
            }

            public final ByteString getContentBytes() {
                Object obj = this.content_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.content_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final String getInsertionPoint() {
                Object obj = this.insertionPoint_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.insertionPoint_ = stringUtf8;
                }
                return stringUtf8;
            }

            public final ByteString getInsertionPointBytes() {
                Object obj = this.insertionPoint_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.insertionPoint_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.name_ = stringUtf8;
                }
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
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                if ((this.bitField0_ & 1) == 1) {
                    i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.name_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    i2 += GeneratedMessageV3.computeStringSize(2, this.insertionPoint_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    i2 += GeneratedMessageV3.computeStringSize(15, this.content_);
                }
                int serializedSize = i2 + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public final Builder newBuilderForType() {
                return newBuilder();
            }

            public final int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hashCode = getDescriptor().hashCode() + 779;
                if (hasName()) {
                    hashCode = (((hashCode * 37) + 1) * 53) + getName().hashCode();
                }
                if (hasInsertionPoint()) {
                    hashCode = (((hashCode * 37) + 2) * 53) + getInsertionPoint().hashCode();
                }
                if (hasContent()) {
                    hashCode = (((hashCode * 37) + 15) * 53) + getContent().hashCode();
                }
                int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            private File(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }

            public static Builder newBuilder(File file) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(file);
            }

            public static File parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (File) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static File parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (File) PARSER.parseFrom(byteString);
            }

            public static File parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (File) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if ((this.bitField0_ & 1) == 1) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    GeneratedMessageV3.writeString(codedOutputStream, 2, this.insertionPoint_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    GeneratedMessageV3.writeString(codedOutputStream, 15, this.content_);
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            /* access modifiers changed from: protected */
            public final Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static File parseFrom(InputStream inputStream) throws IOException {
                return (File) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public final boolean equals(Object obj) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4 = true;
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof File)) {
                    return super.equals(obj);
                }
                File file = (File) obj;
                if (hasName() == file.hasName()) {
                    z = true;
                } else {
                    z = false;
                }
                if (hasName()) {
                    if (!z || !getName().equals(file.getName())) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (!z || hasInsertionPoint() != file.hasInsertionPoint()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (hasInsertionPoint()) {
                    if (!z2 || !getInsertionPoint().equals(file.getInsertionPoint())) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                }
                if (!z2 || hasContent() != file.hasContent()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (hasContent()) {
                    if (!z3 || !getContent().equals(file.getContent())) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                }
                if (!z3 || !this.unknownFields.equals(file.unknownFields)) {
                    z4 = false;
                }
                return z4;
            }

            public static File parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (File) PARSER.parseFrom(byteBuffer);
            }

            public static File parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (File) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static File parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (File) PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            private File(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this();
                if (extensionRegistryLite != null) {
                    UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                    boolean z = false;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    ByteString readBytes = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                    this.name_ = readBytes;
                                } else if (readTag == 18) {
                                    ByteString readBytes2 = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                    this.insertionPoint_ = readBytes2;
                                } else if (readTag == 122) {
                                    ByteString readBytes3 = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                    this.content_ = readBytes3;
                                } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
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

            public static File parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (File) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            public static File parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (File) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static File parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (File) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }
        }

        public interface FileOrBuilder extends MessageOrBuilder {
            String getContent();

            ByteString getContentBytes();

            String getInsertionPoint();

            ByteString getInsertionPointBytes();

            String getName();

            ByteString getNameBytes();

            boolean hasContent();

            boolean hasInsertionPoint();

            boolean hasName();
        }

        public static CodeGeneratorResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_descriptor;
        }

        public static Parser<CodeGeneratorResponse> parser() {
            return PARSER;
        }

        public final CodeGeneratorResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public final List<File> getFileList() {
            return this.file_;
        }

        public final List<? extends FileOrBuilder> getFileOrBuilderList() {
            return this.file_;
        }

        public final Parser<CodeGeneratorResponse> getParserForType() {
            return PARSER;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        public static CodeGeneratorResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CodeGeneratorResponse) PARSER.parseFrom(bArr);
        }

        public static CodeGeneratorResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CodeGeneratorResponse) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public final int getFileCount() {
            return this.file_.size();
        }

        public final boolean hasError() {
            if ((this.bitField0_ & 1) == 1) {
                return true;
            }
            return false;
        }

        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PluginProtos.internal_static_google_protobuf_compiler_CodeGeneratorResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CodeGeneratorResponse.class, Builder.class);
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

        private CodeGeneratorResponse() {
            this.memoizedIsInitialized = -1;
            this.error_ = "";
            this.file_ = Collections.emptyList();
        }

        public final String getError() {
            Object obj = this.error_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.error_ = stringUtf8;
            }
            return stringUtf8;
        }

        public final ByteString getErrorBytes() {
            Object obj = this.error_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.error_ = copyFromUtf8;
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
            if ((this.bitField0_ & 1) == 1) {
                i = GeneratedMessageV3.computeStringSize(1, this.error_) + 0;
            } else {
                i = 0;
            }
            for (int i3 = 0; i3 < this.file_.size(); i3++) {
                i += CodedOutputStream.computeMessageSize(15, this.file_.get(i3));
            }
            int serializedSize = i + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public final int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = getDescriptor().hashCode() + 779;
            if (hasError()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getError().hashCode();
            }
            if (getFileCount() > 0) {
                hashCode = (((hashCode * 37) + 15) * 53) + getFileList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        private CodeGeneratorResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        public static Builder newBuilder(CodeGeneratorResponse codeGeneratorResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(codeGeneratorResponse);
        }

        public static CodeGeneratorResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CodeGeneratorResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CodeGeneratorResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CodeGeneratorResponse) PARSER.parseFrom(byteString);
        }

        public final File getFile(int i) {
            return this.file_.get(i);
        }

        public final FileOrBuilder getFileOrBuilder(int i) {
            return this.file_.get(i);
        }

        public static CodeGeneratorResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CodeGeneratorResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.error_);
            }
            for (int i = 0; i < this.file_.size(); i++) {
                codedOutputStream.writeMessage(15, this.file_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public final boolean equals(Object obj) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CodeGeneratorResponse)) {
                return super.equals(obj);
            }
            CodeGeneratorResponse codeGeneratorResponse = (CodeGeneratorResponse) obj;
            if (hasError() == codeGeneratorResponse.hasError()) {
                z = true;
            } else {
                z = false;
            }
            if (hasError()) {
                if (!z || !getError().equals(codeGeneratorResponse.getError())) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (!z || !getFileList().equals(codeGeneratorResponse.getFileList())) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2 || !this.unknownFields.equals(codeGeneratorResponse.unknownFields)) {
                z3 = false;
            }
            return z3;
        }

        /* access modifiers changed from: protected */
        public final Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static CodeGeneratorResponse parseFrom(InputStream inputStream) throws IOException {
            return (CodeGeneratorResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CodeGeneratorResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CodeGeneratorResponse) PARSER.parseFrom(byteBuffer);
        }

        public static CodeGeneratorResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CodeGeneratorResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CodeGeneratorResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CodeGeneratorResponse) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CodeGeneratorResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CodeGeneratorResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private CodeGeneratorResponse(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                ByteString readBytes = codedInputStream.readBytes();
                                this.bitField0_ |= 1;
                                this.error_ = readBytes;
                            } else if (readTag == 122) {
                                if (!(z2 & true)) {
                                    this.file_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.file_.add(codedInputStream.readMessage(File.PARSER, extensionRegistryLite));
                            } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        if (z2 & true) {
                            this.file_ = Collections.unmodifiableList(this.file_);
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 & true) {
                    this.file_ = Collections.unmodifiableList(this.file_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw new NullPointerException();
        }

        public static CodeGeneratorResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CodeGeneratorResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CodeGeneratorResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CodeGeneratorResponse) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }
    }

    public interface CodeGeneratorResponseOrBuilder extends MessageOrBuilder {
        String getError();

        ByteString getErrorBytes();

        CodeGeneratorResponse.File getFile(int i);

        int getFileCount();

        List<CodeGeneratorResponse.File> getFileList();

        CodeGeneratorResponse.FileOrBuilder getFileOrBuilder(int i);

        List<? extends CodeGeneratorResponse.FileOrBuilder> getFileOrBuilderList();

        boolean hasError();
    }

    public static final class Version extends GeneratedMessageV3 implements VersionOrBuilder {
        private static final Version DEFAULT_INSTANCE = new Version();
        @Deprecated
        public static final Parser<Version> PARSER = new AbstractParser<Version>() {
            public final Version parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Version(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        public int bitField0_;
        public int major_;
        private byte memoizedIsInitialized;
        public int minor_;
        public int patch_;
        public volatile Object suffix_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements VersionOrBuilder {
            private int bitField0_;
            private int major_;
            private int minor_;
            private int patch_;
            private Object suffix_;

            private void maybeForceBuilderInitialization() {
            }

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return PluginProtos.internal_static_google_protobuf_compiler_Version_descriptor;
            }

            public final Descriptors.Descriptor getDescriptorForType() {
                return PluginProtos.internal_static_google_protobuf_compiler_Version_descriptor;
            }

            public final int getMajor() {
                return this.major_;
            }

            public final int getMinor() {
                return this.minor_;
            }

            public final int getPatch() {
                return this.patch_;
            }

            private Builder() {
                this.suffix_ = "";
                maybeForceBuilderInitialization();
            }

            public final Builder clearMajor() {
                this.bitField0_ &= -2;
                this.major_ = 0;
                onChanged();
                return this;
            }

            public final Builder clearMinor() {
                this.bitField0_ &= -3;
                this.minor_ = 0;
                onChanged();
                return this;
            }

            public final Builder clearPatch() {
                this.bitField0_ &= -5;
                this.patch_ = 0;
                onChanged();
                return this;
            }

            public final boolean hasMajor() {
                if ((this.bitField0_ & 1) == 1) {
                    return true;
                }
                return false;
            }

            public final boolean hasMinor() {
                if ((this.bitField0_ & 2) == 2) {
                    return true;
                }
                return false;
            }

            public final boolean hasPatch() {
                if ((this.bitField0_ & 4) == 4) {
                    return true;
                }
                return false;
            }

            public final boolean hasSuffix() {
                if ((this.bitField0_ & 8) == 8) {
                    return true;
                }
                return false;
            }

            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return PluginProtos.internal_static_google_protobuf_compiler_Version_fieldAccessorTable.ensureFieldAccessorsInitialized(Version.class, Builder.class);
            }

            public final Version build() {
                Version buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final Builder clearSuffix() {
                this.bitField0_ &= -9;
                this.suffix_ = Version.getDefaultInstance().getSuffix();
                onChanged();
                return this;
            }

            public final Version getDefaultInstanceForType() {
                return Version.getDefaultInstance();
            }

            public final String getSuffix() {
                Object obj = this.suffix_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.suffix_ = stringUtf8;
                }
                return stringUtf8;
            }

            public final ByteString getSuffixBytes() {
                Object obj = this.suffix_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.suffix_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Version buildPartial() {
                Version version = new Version((GeneratedMessageV3.Builder) this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                version.major_ = this.major_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                version.minor_ = this.minor_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                version.patch_ = this.patch_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                version.suffix_ = this.suffix_;
                version.bitField0_ = i2;
                onBuilt();
                return version;
            }

            public final Builder clear() {
                super.clear();
                this.major_ = 0;
                this.bitField0_ &= -2;
                this.minor_ = 0;
                this.bitField0_ &= -3;
                this.patch_ = 0;
                this.bitField0_ &= -5;
                this.suffix_ = "";
                this.bitField0_ &= -9;
                return this;
            }

            public final Builder clone() {
                return (Builder) super.clone();
            }

            public final Builder setMajor(int i) {
                this.bitField0_ |= 1;
                this.major_ = i;
                onChanged();
                return this;
            }

            public final Builder setMinor(int i) {
                this.bitField0_ |= 2;
                this.minor_ = i;
                onChanged();
                return this;
            }

            public final Builder setPatch(int i) {
                this.bitField0_ |= 4;
                this.patch_ = i;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.suffix_ = "";
                maybeForceBuilderInitialization();
            }

            public final Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public final Builder setSuffix(String str) {
                if (str != null) {
                    this.bitField0_ |= 8;
                    this.suffix_ = str;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            public final Builder setSuffixBytes(ByteString byteString) {
                if (byteString != null) {
                    this.bitField0_ |= 8;
                    this.suffix_ = byteString;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public final Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof Version) {
                    return mergeFrom((Version) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder mergeFrom(Version version) {
                if (version == Version.getDefaultInstance()) {
                    return this;
                }
                if (version.hasMajor()) {
                    setMajor(version.getMajor());
                }
                if (version.hasMinor()) {
                    setMinor(version.getMinor());
                }
                if (version.hasPatch()) {
                    setPatch(version.getPatch());
                }
                if (version.hasSuffix()) {
                    this.bitField0_ |= 8;
                    this.suffix_ = version.suffix_;
                    onChanged();
                }
                mergeUnknownFields(version.unknownFields);
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
            public final com.google.protobuf.compiler.PluginProtos.Version.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.google.protobuf.compiler.PluginProtos$Version> r1 = com.google.protobuf.compiler.PluginProtos.Version.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    com.google.protobuf.compiler.PluginProtos$Version r3 = (com.google.protobuf.compiler.PluginProtos.Version) r3     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    if (r3 == 0) goto L_0x000e
                    r2.mergeFrom((com.google.protobuf.compiler.PluginProtos.Version) r3)
                L_0x000e:
                    return r2
                L_0x000f:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0011:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x000f }
                    com.google.protobuf.compiler.PluginProtos$Version r4 = (com.google.protobuf.compiler.PluginProtos.Version) r4     // Catch:{ all -> 0x000f }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.google.protobuf.compiler.PluginProtos.Version) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.compiler.PluginProtos.Version.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.google.protobuf.compiler.PluginProtos$Version$Builder");
            }

            public final Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }
        }

        public static Version getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return PluginProtos.internal_static_google_protobuf_compiler_Version_descriptor;
        }

        public static Parser<Version> parser() {
            return PARSER;
        }

        public final Version getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public final int getMajor() {
            return this.major_;
        }

        public final int getMinor() {
            return this.minor_;
        }

        public final Parser<Version> getParserForType() {
            return PARSER;
        }

        public final int getPatch() {
            return this.patch_;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        public static Version parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Version) PARSER.parseFrom(bArr);
        }

        public static Version parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Version) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        private Version() {
            this.memoizedIsInitialized = -1;
            this.suffix_ = "";
        }

        public final boolean hasMajor() {
            if ((this.bitField0_ & 1) == 1) {
                return true;
            }
            return false;
        }

        public final boolean hasMinor() {
            if ((this.bitField0_ & 2) == 2) {
                return true;
            }
            return false;
        }

        public final boolean hasPatch() {
            if ((this.bitField0_ & 4) == 4) {
                return true;
            }
            return false;
        }

        public final boolean hasSuffix() {
            if ((this.bitField0_ & 8) == 8) {
                return true;
            }
            return false;
        }

        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PluginProtos.internal_static_google_protobuf_compiler_Version_fieldAccessorTable.ensureFieldAccessorsInitialized(Version.class, Builder.class);
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

        public final String getSuffix() {
            Object obj = this.suffix_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.suffix_ = stringUtf8;
            }
            return stringUtf8;
        }

        public final ByteString getSuffixBytes() {
            Object obj = this.suffix_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.suffix_ = copyFromUtf8;
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
            if ((this.bitField0_ & 1) == 1) {
                i2 = 0 + CodedOutputStream.computeInt32Size(1, this.major_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.computeInt32Size(2, this.minor_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i2 += CodedOutputStream.computeInt32Size(3, this.patch_);
            }
            if ((this.bitField0_ & 8) == 8) {
                i2 += GeneratedMessageV3.computeStringSize(4, this.suffix_);
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
            if (hasMajor()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getMajor();
            }
            if (hasMinor()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getMinor();
            }
            if (hasPatch()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getPatch();
            }
            if (hasSuffix()) {
                hashCode = (((hashCode * 37) + 4) * 53) + getSuffix().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        private Version(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        public static Builder newBuilder(Version version) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(version);
        }

        public static Version parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Version) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Version parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Version) PARSER.parseFrom(byteString);
        }

        public static Version parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Version) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.major_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.minor_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeInt32(3, this.patch_);
            }
            if ((this.bitField0_ & 8) == 8) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.suffix_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* access modifiers changed from: protected */
        public final Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Version parseFrom(InputStream inputStream) throws IOException {
            return (Version) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
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
            if (!(obj instanceof Version)) {
                return super.equals(obj);
            }
            Version version = (Version) obj;
            if (hasMajor() == version.hasMajor()) {
                z = true;
            } else {
                z = false;
            }
            if (hasMajor()) {
                if (!z || getMajor() != version.getMajor()) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (!z || hasMinor() != version.hasMinor()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (hasMinor()) {
                if (!z2 || getMinor() != version.getMinor()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
            if (!z2 || hasPatch() != version.hasPatch()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (hasPatch()) {
                if (!z3 || getPatch() != version.getPatch()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            }
            if (!z3 || hasSuffix() != version.hasSuffix()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (hasSuffix()) {
                if (!z4 || !getSuffix().equals(version.getSuffix())) {
                    z4 = false;
                } else {
                    z4 = true;
                }
            }
            if (!z4 || !this.unknownFields.equals(version.unknownFields)) {
                z5 = false;
            }
            return z5;
        }

        public static Version parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Version) PARSER.parseFrom(byteBuffer);
        }

        public static Version parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Version) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Version parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Version) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Version parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Version) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private Version(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.bitField0_ |= 1;
                                this.major_ = codedInputStream.readInt32();
                            } else if (readTag == 16) {
                                this.bitField0_ |= 2;
                                this.minor_ = codedInputStream.readInt32();
                            } else if (readTag == 24) {
                                this.bitField0_ |= 4;
                                this.patch_ = codedInputStream.readInt32();
                            } else if (readTag == 34) {
                                ByteString readBytes = codedInputStream.readBytes();
                                this.bitField0_ = 8 | this.bitField0_;
                                this.suffix_ = readBytes;
                            } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
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

        public static Version parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Version) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Version parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Version) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }
    }

    public interface VersionOrBuilder extends MessageOrBuilder {
        int getMajor();

        int getMinor();

        int getPatch();

        String getSuffix();

        ByteString getSuffixBytes();

        boolean hasMajor();

        boolean hasMinor();

        boolean hasPatch();

        boolean hasSuffix();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private PluginProtos() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AnonymousClass1 r2 = new Descriptors.FileDescriptor.InternalDescriptorAssigner() {
            public final ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                PluginProtos.descriptor = fileDescriptor;
                return null;
            }
        };
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n%google/protobuf/compiler/plugin.proto\u0012\u0018google.protobuf.compiler\u001a google/protobuf/descriptor.proto\"F\n\u0007Version\u0012\r\n\u0005major\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005minor\u0018\u0002 \u0001(\u0005\u0012\r\n\u0005patch\u0018\u0003 \u0001(\u0005\u0012\u000e\n\u0006suffix\u0018\u0004 \u0001(\t\"º\u0001\n\u0014CodeGeneratorRequest\u0012\u0018\n\u0010file_to_generate\u0018\u0001 \u0003(\t\u0012\u0011\n\tparameter\u0018\u0002 \u0001(\t\u00128\n\nproto_file\u0018\u000f \u0003(\u000b2$.google.protobuf.FileDescriptorProto\u0012;\n\u0010compiler_version\u0018\u0003 \u0001(\u000b2!.google.protobuf.compiler.Version\"ª\u0001\n\u0015CodeGeneratorResponse\u0012\r\n\u0005error\u0018\u0001 \u0001(\t\u0012B\n\u0004file\u0018\u000f \u0003(\u000b24.google.protobuf.compiler.CodeGeneratorResponse.File\u001a>\n\u0004File\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0017\n\u000finsertion_point\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007content\u0018\u000f \u0001(\tBg\n\u001ccom.google.protobuf.compilerB\fPluginProtosZ9github.com/golang/protobuf/protoc-gen-go/plugin;plugin_go"}, new Descriptors.FileDescriptor[]{DescriptorProtos.getDescriptor()}, r2);
        DescriptorProtos.getDescriptor();
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
