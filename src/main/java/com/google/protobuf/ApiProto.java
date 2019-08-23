package com.google.protobuf;

import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessageV3;

public final class ApiProto {
    public static Descriptors.FileDescriptor descriptor;
    static final Descriptors.Descriptor internal_static_google_protobuf_Api_descriptor = getDescriptor().getMessageTypes().get(0);
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_Api_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_google_protobuf_Api_descriptor, new String[]{"Name", "Methods", "Options", "Version", "SourceContext", "Mixins", "Syntax"});
    static final Descriptors.Descriptor internal_static_google_protobuf_Method_descriptor = getDescriptor().getMessageTypes().get(1);
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_Method_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_google_protobuf_Method_descriptor, new String[]{"Name", "RequestTypeUrl", "RequestStreaming", "ResponseTypeUrl", "ResponseStreaming", "Options", "Syntax"});
    static final Descriptors.Descriptor internal_static_google_protobuf_Mixin_descriptor = getDescriptor().getMessageTypes().get(2);
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_protobuf_Mixin_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_google_protobuf_Mixin_descriptor, new String[]{"Name", "Root"});

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private ApiProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AnonymousClass1 r2 = new Descriptors.FileDescriptor.InternalDescriptorAssigner() {
            public final ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                ApiProto.descriptor = fileDescriptor;
                return null;
            }
        };
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0019google/protobuf/api.proto\u0012\u000fgoogle.protobuf\u001a$google/protobuf/source_context.proto\u001a\u001agoogle/protobuf/type.proto\"\u0002\n\u0003Api\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012(\n\u0007methods\u0018\u0002 \u0003(\u000b2\u0017.google.protobuf.Method\u0012(\n\u0007options\u0018\u0003 \u0003(\u000b2\u0017.google.protobuf.Option\u0012\u000f\n\u0007version\u0018\u0004 \u0001(\t\u00126\n\u000esource_context\u0018\u0005 \u0001(\u000b2\u001e.google.protobuf.SourceContext\u0012&\n\u0006mixins\u0018\u0006 \u0003(\u000b2\u0016.google.protobuf.Mixin\u0012'\n\u0006syntax\u0018\u0007 \u0001(\u000e2\u0017.google.protobuf.Syntax\"Õ\u0001\n\u0006Method\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0018\n\u0010request_type_url\u0018\u0002 \u0001(\t\u0012\u0019\n\u0011request_streaming\u0018\u0003 \u0001(\b\u0012\u0019\n\u0011response_type_url\u0018\u0004 \u0001(\t\u0012\u001a\n\u0012response_streaming\u0018\u0005 \u0001(\b\u0012(\n\u0007options\u0018\u0006 \u0003(\u000b2\u0017.google.protobuf.Option\u0012'\n\u0006syntax\u0018\u0007 \u0001(\u000e2\u0017.google.protobuf.Syntax\"#\n\u0005Mixin\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\f\n\u0004root\u0018\u0002 \u0001(\tBu\n\u0013com.google.protobufB\bApiProtoP\u0001Z+google.golang.org/genproto/protobuf/api;api¢\u0002\u0003GPBª\u0002\u001eGoogle.Protobuf.WellKnownTypesb\u0006proto3"}, new Descriptors.FileDescriptor[]{SourceContextProto.getDescriptor(), TypeProto.getDescriptor()}, r2);
        SourceContextProto.getDescriptor();
        TypeProto.getDescriptor();
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}