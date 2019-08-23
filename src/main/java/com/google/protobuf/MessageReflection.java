package com.google.protobuf;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MessageReflection {

    static class BuilderAdapter implements MergeTarget {
        private final Message.Builder builder;

        public MergeTarget.ContainerType getContainerType() {
            return MergeTarget.ContainerType.MESSAGE;
        }

        public Object finish() {
            return this.builder.buildPartial();
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return this.builder.getDescriptorForType();
        }

        public BuilderAdapter(Message.Builder builder2) {
            this.builder = builder2;
        }

        public MergeTarget clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            this.builder.clearField(fieldDescriptor);
            return this;
        }

        public MergeTarget clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            this.builder.clearOneof(oneofDescriptor);
            return this;
        }

        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            return this.builder.getField(fieldDescriptor);
        }

        public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
            return this.builder.getOneofFieldDescriptor(oneofDescriptor);
        }

        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            return this.builder.hasField(fieldDescriptor);
        }

        public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return this.builder.hasOneof(oneofDescriptor);
        }

        public WireFormat.Utf8Validation getUtf8Validation(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.needsUtf8Check()) {
                return WireFormat.Utf8Validation.STRICT;
            }
            if (fieldDescriptor.isRepeated() || !(this.builder instanceof GeneratedMessage.Builder)) {
                return WireFormat.Utf8Validation.LOOSE;
            }
            return WireFormat.Utf8Validation.LAZY;
        }

        public MergeTarget addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            this.builder.addRepeatedField(fieldDescriptor, obj);
            return this;
        }

        public ExtensionRegistry.ExtensionInfo findExtensionByName(ExtensionRegistry extensionRegistry, String str) {
            return extensionRegistry.findImmutableExtensionByName(str);
        }

        public MergeTarget setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            this.builder.setField(fieldDescriptor, obj);
            return this;
        }

        public MergeTarget newMergeTargetForField(Descriptors.FieldDescriptor fieldDescriptor, Message message) {
            if (message != null) {
                return new BuilderAdapter(message.newBuilderForType());
            }
            return new BuilderAdapter(this.builder.newBuilderForField(fieldDescriptor));
        }

        public ExtensionRegistry.ExtensionInfo findExtensionByNumber(ExtensionRegistry extensionRegistry, Descriptors.Descriptor descriptor, int i) {
            return extensionRegistry.findImmutableExtensionByNumber(descriptor, i);
        }

        public MergeTarget setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            this.builder.setRepeatedField(fieldDescriptor, i, obj);
            return this;
        }

        public Object parseGroup(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, Descriptors.FieldDescriptor fieldDescriptor, Message message) throws IOException {
            Message.Builder builder2;
            if (message != null) {
                builder2 = message.newBuilderForType();
            } else {
                builder2 = this.builder.newBuilderForField(fieldDescriptor);
            }
            if (!fieldDescriptor.isRepeated()) {
                Message message2 = (Message) getField(fieldDescriptor);
                if (message2 != null) {
                    builder2.mergeFrom(message2);
                }
            }
            codedInputStream.readGroup(fieldDescriptor.getNumber(), (MessageLite.Builder) builder2, extensionRegistryLite);
            return builder2.buildPartial();
        }

        public Object parseMessage(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, Descriptors.FieldDescriptor fieldDescriptor, Message message) throws IOException {
            Message.Builder builder2;
            if (message != null) {
                builder2 = message.newBuilderForType();
            } else {
                builder2 = this.builder.newBuilderForField(fieldDescriptor);
            }
            if (!fieldDescriptor.isRepeated()) {
                Message message2 = (Message) getField(fieldDescriptor);
                if (message2 != null) {
                    builder2.mergeFrom(message2);
                }
            }
            codedInputStream.readMessage((MessageLite.Builder) builder2, extensionRegistryLite);
            return builder2.buildPartial();
        }

        public Object parseMessageFromBytes(ByteString byteString, ExtensionRegistryLite extensionRegistryLite, Descriptors.FieldDescriptor fieldDescriptor, Message message) throws IOException {
            Message.Builder builder2;
            if (message != null) {
                builder2 = message.newBuilderForType();
            } else {
                builder2 = this.builder.newBuilderForField(fieldDescriptor);
            }
            if (!fieldDescriptor.isRepeated()) {
                Message message2 = (Message) getField(fieldDescriptor);
                if (message2 != null) {
                    builder2.mergeFrom(message2);
                }
            }
            builder2.mergeFrom(byteString, extensionRegistryLite);
            return builder2.buildPartial();
        }
    }

    static class ExtensionAdapter implements MergeTarget {
        private final FieldSet<Descriptors.FieldDescriptor> extensions;

        public MergeTarget clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return this;
        }

        public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
            return null;
        }

        public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return false;
        }

        public MergeTarget.ContainerType getContainerType() {
            return MergeTarget.ContainerType.EXTENSION_SET;
        }

        public Object finish() {
            throw new UnsupportedOperationException("finish() called on FieldSet object");
        }

        public Descriptors.Descriptor getDescriptorForType() {
            throw new UnsupportedOperationException("getDescriptorForType() called on FieldSet object");
        }

        ExtensionAdapter(FieldSet<Descriptors.FieldDescriptor> fieldSet) {
            this.extensions = fieldSet;
        }

        public MergeTarget clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            this.extensions.clearField(fieldDescriptor);
            return this;
        }

        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            return this.extensions.getField(fieldDescriptor);
        }

        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            return this.extensions.hasField(fieldDescriptor);
        }

        public WireFormat.Utf8Validation getUtf8Validation(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.needsUtf8Check()) {
                return WireFormat.Utf8Validation.STRICT;
            }
            return WireFormat.Utf8Validation.LOOSE;
        }

        public MergeTarget addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            this.extensions.addRepeatedField(fieldDescriptor, obj);
            return this;
        }

        public ExtensionRegistry.ExtensionInfo findExtensionByName(ExtensionRegistry extensionRegistry, String str) {
            return extensionRegistry.findImmutableExtensionByName(str);
        }

        public MergeTarget newMergeTargetForField(Descriptors.FieldDescriptor fieldDescriptor, Message message) {
            throw new UnsupportedOperationException("newMergeTargetForField() called on FieldSet object");
        }

        public MergeTarget setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            this.extensions.setField(fieldDescriptor, obj);
            return this;
        }

        public ExtensionRegistry.ExtensionInfo findExtensionByNumber(ExtensionRegistry extensionRegistry, Descriptors.Descriptor descriptor, int i) {
            return extensionRegistry.findImmutableExtensionByNumber(descriptor, i);
        }

        public MergeTarget setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            this.extensions.setRepeatedField(fieldDescriptor, i, obj);
            return this;
        }

        public Object parseMessage(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, Descriptors.FieldDescriptor fieldDescriptor, Message message) throws IOException {
            Message.Builder newBuilderForType = message.newBuilderForType();
            if (!fieldDescriptor.isRepeated()) {
                Message message2 = (Message) getField(fieldDescriptor);
                if (message2 != null) {
                    newBuilderForType.mergeFrom(message2);
                }
            }
            codedInputStream.readMessage((MessageLite.Builder) newBuilderForType, extensionRegistryLite);
            return newBuilderForType.buildPartial();
        }

        public Object parseMessageFromBytes(ByteString byteString, ExtensionRegistryLite extensionRegistryLite, Descriptors.FieldDescriptor fieldDescriptor, Message message) throws IOException {
            Message.Builder newBuilderForType = message.newBuilderForType();
            if (!fieldDescriptor.isRepeated()) {
                Message message2 = (Message) getField(fieldDescriptor);
                if (message2 != null) {
                    newBuilderForType.mergeFrom(message2);
                }
            }
            newBuilderForType.mergeFrom(byteString, extensionRegistryLite);
            return newBuilderForType.buildPartial();
        }

        public Object parseGroup(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, Descriptors.FieldDescriptor fieldDescriptor, Message message) throws IOException {
            Message.Builder newBuilderForType = message.newBuilderForType();
            if (!fieldDescriptor.isRepeated()) {
                Message message2 = (Message) getField(fieldDescriptor);
                if (message2 != null) {
                    newBuilderForType.mergeFrom(message2);
                }
            }
            codedInputStream.readGroup(fieldDescriptor.getNumber(), (MessageLite.Builder) newBuilderForType, extensionRegistryLite);
            return newBuilderForType.buildPartial();
        }
    }

    interface MergeTarget {

        public enum ContainerType {
            MESSAGE,
            EXTENSION_SET
        }

        MergeTarget addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj);

        MergeTarget clearField(Descriptors.FieldDescriptor fieldDescriptor);

        MergeTarget clearOneof(Descriptors.OneofDescriptor oneofDescriptor);

        ExtensionRegistry.ExtensionInfo findExtensionByName(ExtensionRegistry extensionRegistry, String str);

        ExtensionRegistry.ExtensionInfo findExtensionByNumber(ExtensionRegistry extensionRegistry, Descriptors.Descriptor descriptor, int i);

        Object finish();

        ContainerType getContainerType();

        Descriptors.Descriptor getDescriptorForType();

        Object getField(Descriptors.FieldDescriptor fieldDescriptor);

        Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor);

        WireFormat.Utf8Validation getUtf8Validation(Descriptors.FieldDescriptor fieldDescriptor);

        boolean hasField(Descriptors.FieldDescriptor fieldDescriptor);

        boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor);

        MergeTarget newMergeTargetForField(Descriptors.FieldDescriptor fieldDescriptor, Message message);

        Object parseGroup(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, Descriptors.FieldDescriptor fieldDescriptor, Message message) throws IOException;

        Object parseMessage(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, Descriptors.FieldDescriptor fieldDescriptor, Message message) throws IOException;

        Object parseMessageFromBytes(ByteString byteString, ExtensionRegistryLite extensionRegistryLite, Descriptors.FieldDescriptor fieldDescriptor, Message message) throws IOException;

        MergeTarget setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj);

        MergeTarget setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj);
    }

    MessageReflection() {
    }

    static List<String> findMissingFields(MessageOrBuilder messageOrBuilder) {
        ArrayList arrayList = new ArrayList();
        findMissingFields(messageOrBuilder, "", arrayList);
        return arrayList;
    }

    static String delimitWithCommas(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String next : list) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(next);
        }
        return sb.toString();
    }

    static boolean isInitialized(MessageOrBuilder messageOrBuilder) {
        for (Descriptors.FieldDescriptor next : messageOrBuilder.getDescriptorForType().getFields()) {
            if (next.isRequired() && !messageOrBuilder.hasField(next)) {
                return false;
            }
        }
        for (Map.Entry next2 : messageOrBuilder.getAllFields().entrySet()) {
            Descriptors.FieldDescriptor fieldDescriptor = (Descriptors.FieldDescriptor) next2.getKey();
            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                if (fieldDescriptor.isRepeated()) {
                    for (Message isInitialized : (List) next2.getValue()) {
                        if (!isInitialized.isInitialized()) {
                            return false;
                        }
                    }
                    continue;
                } else if (!((Message) next2.getValue()).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    static int getSerializedSize(Message message, Map<Descriptors.FieldDescriptor, Object> map) {
        boolean messageSetWireFormat = message.getDescriptorForType().getOptions().getMessageSetWireFormat();
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            Descriptors.FieldDescriptor fieldDescriptor = (Descriptors.FieldDescriptor) next.getKey();
            Object value = next.getValue();
            if (!messageSetWireFormat || !fieldDescriptor.isExtension() || fieldDescriptor.getType() != Descriptors.FieldDescriptor.Type.MESSAGE || fieldDescriptor.isRepeated()) {
                i += FieldSet.computeFieldSize(fieldDescriptor, value);
            } else {
                i += CodedOutputStream.computeMessageSetExtensionSize(fieldDescriptor.getNumber(), (Message) value);
            }
        }
        UnknownFieldSet unknownFields = message.getUnknownFields();
        if (messageSetWireFormat) {
            return i + unknownFields.getSerializedSizeAsMessageSet();
        }
        return i + unknownFields.getSerializedSize();
    }

    private static String subMessagePrefix(String str, Descriptors.FieldDescriptor fieldDescriptor, int i) {
        StringBuilder sb = new StringBuilder(str);
        if (fieldDescriptor.isExtension()) {
            sb.append('(');
            sb.append(fieldDescriptor.getFullName());
            sb.append(')');
        } else {
            sb.append(fieldDescriptor.getName());
        }
        if (i != -1) {
            sb.append('[');
            sb.append(i);
            sb.append(']');
        }
        sb.append('.');
        return sb.toString();
    }

    private static void findMissingFields(MessageOrBuilder messageOrBuilder, String str, List<String> list) {
        for (Descriptors.FieldDescriptor next : messageOrBuilder.getDescriptorForType().getFields()) {
            if (next.isRequired() && !messageOrBuilder.hasField(next)) {
                list.add(str + next.getName());
            }
        }
        for (Map.Entry next2 : messageOrBuilder.getAllFields().entrySet()) {
            Descriptors.FieldDescriptor fieldDescriptor = (Descriptors.FieldDescriptor) next2.getKey();
            Object value = next2.getValue();
            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                if (fieldDescriptor.isRepeated()) {
                    int i = 0;
                    for (MessageOrBuilder findMissingFields : (List) value) {
                        findMissingFields(findMissingFields, subMessagePrefix(str, fieldDescriptor, i), list);
                        i++;
                    }
                } else if (messageOrBuilder.hasField(fieldDescriptor)) {
                    findMissingFields((MessageOrBuilder) value, subMessagePrefix(str, fieldDescriptor, -1), list);
                }
            }
        }
    }

    private static void eagerlyMergeMessageSetExtension(CodedInputStream codedInputStream, ExtensionRegistry.ExtensionInfo extensionInfo, ExtensionRegistryLite extensionRegistryLite, MergeTarget mergeTarget) throws IOException {
        Descriptors.FieldDescriptor fieldDescriptor = extensionInfo.descriptor;
        mergeTarget.setField(fieldDescriptor, mergeTarget.parseMessage(codedInputStream, extensionRegistryLite, fieldDescriptor, extensionInfo.defaultInstance));
    }

    private static void mergeMessageSetExtensionFromBytes(ByteString byteString, ExtensionRegistry.ExtensionInfo extensionInfo, ExtensionRegistryLite extensionRegistryLite, MergeTarget mergeTarget) throws IOException {
        Descriptors.FieldDescriptor fieldDescriptor = extensionInfo.descriptor;
        if (mergeTarget.hasField(fieldDescriptor) || ExtensionRegistryLite.isEagerlyParseMessageSets()) {
            mergeTarget.setField(fieldDescriptor, mergeTarget.parseMessageFromBytes(byteString, extensionRegistryLite, fieldDescriptor, extensionInfo.defaultInstance));
        } else {
            mergeTarget.setField(fieldDescriptor, new LazyField(extensionInfo.defaultInstance, extensionRegistryLite, byteString));
        }
    }

    static void writeMessageTo(Message message, Map<Descriptors.FieldDescriptor, Object> map, CodedOutputStream codedOutputStream, boolean z) throws IOException {
        boolean messageSetWireFormat = message.getDescriptorForType().getOptions().getMessageSetWireFormat();
        if (z) {
            TreeMap treeMap = new TreeMap(map);
            for (Descriptors.FieldDescriptor next : message.getDescriptorForType().getFields()) {
                if (next.isRequired() && !treeMap.containsKey(next)) {
                    treeMap.put(next, message.getField(next));
                }
            }
            map = treeMap;
        }
        for (Map.Entry next2 : map.entrySet()) {
            Descriptors.FieldDescriptor fieldDescriptor = (Descriptors.FieldDescriptor) next2.getKey();
            Object value = next2.getValue();
            if (!messageSetWireFormat || !fieldDescriptor.isExtension() || fieldDescriptor.getType() != Descriptors.FieldDescriptor.Type.MESSAGE || fieldDescriptor.isRepeated()) {
                FieldSet.writeField(fieldDescriptor, value, codedOutputStream);
            } else {
                codedOutputStream.writeMessageSetExtension(fieldDescriptor.getNumber(), (Message) value);
            }
        }
        UnknownFieldSet unknownFields = message.getUnknownFields();
        if (messageSetWireFormat) {
            unknownFields.writeAsMessageSetTo(codedOutputStream);
        } else {
            unknownFields.writeTo(codedOutputStream);
        }
    }

    private static void mergeMessageSetExtensionFromCodedStream(CodedInputStream codedInputStream, UnknownFieldSet.Builder builder, ExtensionRegistryLite extensionRegistryLite, Descriptors.Descriptor descriptor, MergeTarget mergeTarget) throws IOException {
        int i = 0;
        ByteString byteString = null;
        ExtensionRegistry.ExtensionInfo extensionInfo = null;
        while (true) {
            int readTag = codedInputStream.readTag();
            if (readTag != 0) {
                if (readTag != WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                    if (readTag != WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                        if (!codedInputStream.skipField(readTag)) {
                            break;
                        }
                    } else if (i == 0 || extensionInfo == null || !ExtensionRegistryLite.isEagerlyParseMessageSets()) {
                        byteString = codedInputStream.readBytes();
                    } else {
                        eagerlyMergeMessageSetExtension(codedInputStream, extensionInfo, extensionRegistryLite, mergeTarget);
                        byteString = null;
                    }
                } else {
                    i = codedInputStream.readUInt32();
                    if (i != 0 && (extensionRegistryLite instanceof ExtensionRegistry)) {
                        extensionInfo = mergeTarget.findExtensionByNumber((ExtensionRegistry) extensionRegistryLite, descriptor, i);
                    }
                }
            } else {
                break;
            }
        }
        codedInputStream.checkLastTagWas(WireFormat.MESSAGE_SET_ITEM_END_TAG);
        if (!(byteString == null || i == 0)) {
            if (extensionInfo != null) {
                mergeMessageSetExtensionFromBytes(byteString, extensionInfo, extensionRegistryLite, mergeTarget);
            } else if (!(byteString == null || builder == null)) {
                builder.mergeField(i, UnknownFieldSet.Field.newBuilder().addLengthDelimited(byteString).build());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean mergeFieldFrom(com.google.protobuf.CodedInputStream r7, com.google.protobuf.UnknownFieldSet.Builder r8, com.google.protobuf.ExtensionRegistryLite r9, com.google.protobuf.Descriptors.Descriptor r10, com.google.protobuf.MessageReflection.MergeTarget r11, int r12) throws java.io.IOException {
        /*
            com.google.protobuf.DescriptorProtos$MessageOptions r0 = r10.getOptions()
            boolean r0 = r0.getMessageSetWireFormat()
            r1 = 1
            if (r0 == 0) goto L_0x0013
            int r0 = com.google.protobuf.WireFormat.MESSAGE_SET_ITEM_TAG
            if (r12 != r0) goto L_0x0013
            mergeMessageSetExtensionFromCodedStream(r7, r8, r9, r10, r11)
            return r1
        L_0x0013:
            int r0 = com.google.protobuf.WireFormat.getTagWireType(r12)
            int r2 = com.google.protobuf.WireFormat.getTagFieldNumber(r12)
            boolean r3 = r10.isExtensionNumber(r2)
            r4 = 0
            if (r3 == 0) goto L_0x0059
            boolean r3 = r9 instanceof com.google.protobuf.ExtensionRegistry
            if (r3 == 0) goto L_0x0057
            r3 = r9
            com.google.protobuf.ExtensionRegistry r3 = (com.google.protobuf.ExtensionRegistry) r3
            com.google.protobuf.ExtensionRegistry$ExtensionInfo r10 = r11.findExtensionByNumber(r3, r10, r2)
            if (r10 != 0) goto L_0x0030
            goto L_0x0057
        L_0x0030:
            com.google.protobuf.Descriptors$FieldDescriptor r4 = r10.descriptor
            com.google.protobuf.Message r10 = r10.defaultInstance
            if (r10 != 0) goto L_0x0068
            com.google.protobuf.Descriptors$FieldDescriptor$JavaType r3 = r4.getJavaType()
            com.google.protobuf.Descriptors$FieldDescriptor$JavaType r5 = com.google.protobuf.Descriptors.FieldDescriptor.JavaType.MESSAGE
            if (r3 == r5) goto L_0x003f
            goto L_0x0068
        L_0x003f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Message-typed extension lacked default instance: "
            r8.<init>(r9)
            java.lang.String r9 = r4.getFullName()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x0057:
            r10 = r4
            goto L_0x0068
        L_0x0059:
            com.google.protobuf.MessageReflection$MergeTarget$ContainerType r3 = r11.getContainerType()
            com.google.protobuf.MessageReflection$MergeTarget$ContainerType r5 = com.google.protobuf.MessageReflection.MergeTarget.ContainerType.MESSAGE
            if (r3 != r5) goto L_0x0057
            com.google.protobuf.Descriptors$FieldDescriptor r10 = r10.findFieldByNumber(r2)
            r6 = r4
            r4 = r10
            r10 = r6
        L_0x0068:
            r3 = 0
            if (r4 == 0) goto L_0x0089
            com.google.protobuf.WireFormat$FieldType r5 = r4.getLiteType()
            int r5 = com.google.protobuf.FieldSet.getWireFormatForFieldType(r5, r3)
            if (r0 != r5) goto L_0x0077
            r0 = 0
            goto L_0x008b
        L_0x0077:
            boolean r5 = r4.isPackable()
            if (r5 == 0) goto L_0x0089
            com.google.protobuf.WireFormat$FieldType r5 = r4.getLiteType()
            int r5 = com.google.protobuf.FieldSet.getWireFormatForFieldType(r5, r1)
            if (r0 != r5) goto L_0x0089
            r0 = 1
            goto L_0x008b
        L_0x0089:
            r0 = 0
            r3 = 1
        L_0x008b:
            if (r3 == 0) goto L_0x0099
            if (r8 == 0) goto L_0x0094
            boolean r7 = r8.mergeFieldFrom(r12, r7)
            return r7
        L_0x0094:
            boolean r7 = r7.skipField(r12)
            return r7
        L_0x0099:
            if (r0 == 0) goto L_0x00f4
            int r8 = r7.readRawVarint32()
            int r8 = r7.pushLimit(r8)
            com.google.protobuf.WireFormat$FieldType r9 = r4.getLiteType()
            com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.ENUM
            if (r9 != r10) goto L_0x00da
        L_0x00ab:
            int r9 = r7.getBytesUntilLimit()
            if (r9 <= 0) goto L_0x00f0
            int r9 = r7.readEnum()
            com.google.protobuf.Descriptors$FileDescriptor r10 = r4.getFile()
            boolean r10 = r10.supportsUnknownEnumValue()
            if (r10 == 0) goto L_0x00cb
            com.google.protobuf.Descriptors$EnumDescriptor r10 = r4.getEnumType()
            com.google.protobuf.Descriptors$EnumValueDescriptor r9 = r10.findValueByNumberCreatingIfUnknown(r9)
            r11.addRepeatedField(r4, r9)
            goto L_0x00ab
        L_0x00cb:
            com.google.protobuf.Descriptors$EnumDescriptor r10 = r4.getEnumType()
            com.google.protobuf.Descriptors$EnumValueDescriptor r9 = r10.findValueByNumber((int) r9)
            if (r9 != 0) goto L_0x00d6
            return r1
        L_0x00d6:
            r11.addRepeatedField(r4, r9)
            goto L_0x00ab
        L_0x00da:
            int r9 = r7.getBytesUntilLimit()
            if (r9 <= 0) goto L_0x00f0
            com.google.protobuf.WireFormat$FieldType r9 = r4.getLiteType()
            com.google.protobuf.WireFormat$Utf8Validation r10 = r11.getUtf8Validation(r4)
            java.lang.Object r9 = com.google.protobuf.WireFormat.readPrimitiveField(r7, r9, r10)
            r11.addRepeatedField(r4, r9)
            goto L_0x00da
        L_0x00f0:
            r7.popLimit(r8)
            goto L_0x014f
        L_0x00f4:
            int[] r12 = com.google.protobuf.MessageReflection.AnonymousClass1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type
            com.google.protobuf.Descriptors$FieldDescriptor$Type r0 = r4.getType()
            int r0 = r0.ordinal()
            r12 = r12[r0]
            switch(r12) {
                case 1: goto L_0x013e;
                case 2: goto L_0x0139;
                case 3: goto L_0x0110;
                default: goto L_0x0103;
            }
        L_0x0103:
            com.google.protobuf.WireFormat$FieldType r8 = r4.getLiteType()
            com.google.protobuf.WireFormat$Utf8Validation r9 = r11.getUtf8Validation(r4)
            java.lang.Object r7 = com.google.protobuf.WireFormat.readPrimitiveField(r7, r8, r9)
            goto L_0x0142
        L_0x0110:
            int r7 = r7.readEnum()
            com.google.protobuf.Descriptors$FileDescriptor r9 = r4.getFile()
            boolean r9 = r9.supportsUnknownEnumValue()
            if (r9 == 0) goto L_0x0127
            com.google.protobuf.Descriptors$EnumDescriptor r8 = r4.getEnumType()
            com.google.protobuf.Descriptors$EnumValueDescriptor r7 = r8.findValueByNumberCreatingIfUnknown(r7)
            goto L_0x0142
        L_0x0127:
            com.google.protobuf.Descriptors$EnumDescriptor r9 = r4.getEnumType()
            com.google.protobuf.Descriptors$EnumValueDescriptor r9 = r9.findValueByNumber((int) r7)
            if (r9 != 0) goto L_0x0137
            if (r8 == 0) goto L_0x0136
            r8.mergeVarintField(r2, r7)
        L_0x0136:
            return r1
        L_0x0137:
            r7 = r9
            goto L_0x0142
        L_0x0139:
            java.lang.Object r7 = r11.parseMessage(r7, r9, r4, r10)
            goto L_0x0142
        L_0x013e:
            java.lang.Object r7 = r11.parseGroup(r7, r9, r4, r10)
        L_0x0142:
            boolean r8 = r4.isRepeated()
            if (r8 == 0) goto L_0x014c
            r11.addRepeatedField(r4, r7)
            goto L_0x014f
        L_0x014c:
            r11.setField(r4, r7)
        L_0x014f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageReflection.mergeFieldFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.UnknownFieldSet$Builder, com.google.protobuf.ExtensionRegistryLite, com.google.protobuf.Descriptors$Descriptor, com.google.protobuf.MessageReflection$MergeTarget, int):boolean");
    }
}
