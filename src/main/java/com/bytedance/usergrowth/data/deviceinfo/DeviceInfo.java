package com.bytedance.usergrowth.data.deviceinfo;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class DeviceInfo {

    /* renamed from: a  reason: collision with root package name */
    public static final Descriptors.Descriptor f22843a = ((Descriptors.Descriptor) a().getMessageTypes().get(0));

    /* renamed from: b  reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f22844b = new GeneratedMessageV3.FieldAccessorTable(f22843a, new String[]{"Name", "Type"});

    /* renamed from: c  reason: collision with root package name */
    public static final Descriptors.Descriptor f22845c = ((Descriptors.Descriptor) a().getMessageTypes().get(1));

    /* renamed from: d  reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f22846d = new GeneratedMessageV3.FieldAccessorTable(f22845c, new String[]{"SimSerialNumber"});

    /* renamed from: e  reason: collision with root package name */
    public static final Descriptors.Descriptor f22847e = ((Descriptors.Descriptor) a().getMessageTypes().get(2));

    /* renamed from: f  reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f22848f = new GeneratedMessageV3.FieldAccessorTable(f22847e, new String[]{"Name", "Macid", "Status", "Alias"});
    public static final Descriptors.Descriptor g = ((Descriptors.Descriptor) a().getMessageTypes().get(3));
    public static final GeneratedMessageV3.FieldAccessorTable h = new GeneratedMessageV3.FieldAccessorTable(g, new String[]{"PackageName", "FirstInstallTime", "LastUpdateTime"});
    public static final Descriptors.Descriptor i = ((Descriptors.Descriptor) a().getMessageTypes().get(4));
    public static final GeneratedMessageV3.FieldAccessorTable j = new GeneratedMessageV3.FieldAccessorTable(i, new String[]{"SimSerial", "SystemAccounts", "LocalBtInfo", "BondedBtList", "AppList"});
    public static final Descriptors.Descriptor k = ((Descriptors.Descriptor) a().getMessageTypes().get(5));
    public static final GeneratedMessageV3.FieldAccessorTable l = new GeneratedMessageV3.FieldAccessorTable(k, new String[]{"DiskSize", "DiskUsageSize", "MemorySize", "MemoryUsageSize", "CpuType"});
    public static final Descriptors.Descriptor m = ((Descriptors.Descriptor) a().getMessageTypes().get(6));
    public static final GeneratedMessageV3.FieldAccessorTable n = new GeneratedMessageV3.FieldAccessorTable(m, new String[]{"X", "Y", "Z"});
    public static final Descriptors.Descriptor o = ((Descriptors.Descriptor) a().getMessageTypes().get(7));
    public static final GeneratedMessageV3.FieldAccessorTable p = new GeneratedMessageV3.FieldAccessorTable(o, new String[]{"X", "Y", "Z"});
    public static final Descriptors.Descriptor q = ((Descriptors.Descriptor) a().getMessageTypes().get(8));
    public static final GeneratedMessageV3.FieldAccessorTable r = new GeneratedMessageV3.FieldAccessorTable(q, new String[]{"DeviceParameter", "Gyro", "Acceleration"});
    public static Descriptors.FileDescriptor s;

    public static final class Acceleration extends GeneratedMessageV3 implements AccelerationOrBuilder {
        private static final Acceleration DEFAULT_INSTANCE = new Acceleration();
        public static final Parser<Acceleration> PARSER = new AbstractParser<Acceleration>() {
            public final Acceleration parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Acceleration(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        public float x_;
        public float y_;
        public float z_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AccelerationOrBuilder {
            private float x_;
            private float y_;
            private float z_;

            private void maybeForceBuilderInitialization() {
            }

            public final boolean isInitialized() {
                return true;
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DeviceInfo.o;
            }

            public final Descriptors.Descriptor getDescriptorForType() {
                return DeviceInfo.o;
            }

            public final float getX() {
                return this.x_;
            }

            public final float getY() {
                return this.y_;
            }

            public final float getZ() {
                return this.z_;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public final Builder clearX() {
                this.x_ = 0.0f;
                onChanged();
                return this;
            }

            public final Builder clearY() {
                this.y_ = 0.0f;
                onChanged();
                return this;
            }

            public final Builder clearZ() {
                this.z_ = 0.0f;
                onChanged();
                return this;
            }

            public final Builder clone() {
                return (Builder) super.clone();
            }

            public final Acceleration getDefaultInstanceForType() {
                return Acceleration.getDefaultInstance();
            }

            public final Acceleration build() {
                Acceleration buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final Builder clear() {
                super.clear();
                this.x_ = 0.0f;
                this.y_ = 0.0f;
                this.z_ = 0.0f;
                return this;
            }

            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DeviceInfo.p.ensureFieldAccessorsInitialized(Acceleration.class, Builder.class);
            }

            public final Acceleration buildPartial() {
                Acceleration acceleration = new Acceleration((GeneratedMessageV3.Builder) this);
                acceleration.x_ = this.x_;
                acceleration.y_ = this.y_;
                acceleration.z_ = this.z_;
                onBuilt();
                return acceleration;
            }

            public final Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public final Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public final Builder setX(float f2) {
                this.x_ = f2;
                onChanged();
                return this;
            }

            public final Builder setY(float f2) {
                this.y_ = f2;
                onChanged();
                return this;
            }

            public final Builder setZ(float f2) {
                this.z_ = f2;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof Acceleration) {
                    return mergeFrom((Acceleration) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder mergeFrom(Acceleration acceleration) {
                if (acceleration == Acceleration.getDefaultInstance()) {
                    return this;
                }
                if (acceleration.getX() != 0.0f) {
                    setX(acceleration.getX());
                }
                if (acceleration.getY() != 0.0f) {
                    setY(acceleration.getY());
                }
                if (acceleration.getZ() != 0.0f) {
                    setZ(acceleration.getZ());
                }
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
            public final com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.Acceleration.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$Acceleration> r1 = com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.Acceleration.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$Acceleration r3 = (com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.Acceleration) r3     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    if (r3 == 0) goto L_0x000e
                    r2.mergeFrom((com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.Acceleration) r3)
                L_0x000e:
                    return r2
                L_0x000f:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0011:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x000f }
                    com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$Acceleration r4 = (com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.Acceleration) r4     // Catch:{ all -> 0x000f }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.Acceleration) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.Acceleration.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$Acceleration$Builder");
            }

            public final Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }
        }

        public static Acceleration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeviceInfo.o;
        }

        public static Parser<Acceleration> parser() {
            return PARSER;
        }

        public final Acceleration getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public final Parser<Acceleration> getParserForType() {
            return PARSER;
        }

        public final float getX() {
            return this.x_;
        }

        public final float getY() {
            return this.y_;
        }

        public final float getZ() {
            return this.z_;
        }

        private Acceleration() {
            this.memoizedIsInitialized = -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeviceInfo.p.ensureFieldAccessorsInitialized(Acceleration.class, Builder.class);
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
            if (this.x_ != 0.0f) {
                i2 = 0 + CodedOutputStream.computeFloatSize(1, this.x_);
            }
            if (this.y_ != 0.0f) {
                i2 += CodedOutputStream.computeFloatSize(2, this.y_);
            }
            if (this.z_ != 0.0f) {
                i2 += CodedOutputStream.computeFloatSize(3, this.z_);
            }
            this.memoizedSize = i2;
            return i2;
        }

        public final int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((getDescriptorForType().hashCode() + 779) * 37) + 1) * 53) + Float.floatToIntBits(getX())) * 37) + 2) * 53) + Float.floatToIntBits(getY())) * 37) + 3) * 53) + Float.floatToIntBits(getZ())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        private Acceleration(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        public static Builder newBuilder(Acceleration acceleration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(acceleration);
        }

        public static Acceleration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Acceleration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Acceleration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Acceleration) PARSER.parseFrom(byteString);
        }

        /* access modifiers changed from: protected */
        public final Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Acceleration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Acceleration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.x_ != 0.0f) {
                codedOutputStream.writeFloat(1, this.x_);
            }
            if (this.y_ != 0.0f) {
                codedOutputStream.writeFloat(2, this.y_);
            }
            if (this.z_ != 0.0f) {
                codedOutputStream.writeFloat(3, this.z_);
            }
        }

        public final boolean equals(Object obj) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Acceleration)) {
                return super.equals(obj);
            }
            Acceleration acceleration = (Acceleration) obj;
            if (Float.floatToIntBits(getX()) == Float.floatToIntBits(acceleration.getX())) {
                z = true;
            } else {
                z = false;
            }
            if (!z || Float.floatToIntBits(getY()) != Float.floatToIntBits(acceleration.getY())) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2 || Float.floatToIntBits(getZ()) != Float.floatToIntBits(acceleration.getZ())) {
                z3 = false;
            }
            return z3;
        }

        public static Acceleration parseFrom(InputStream inputStream) throws IOException {
            return (Acceleration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Acceleration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Acceleration) PARSER.parseFrom(bArr);
        }

        public static Acceleration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Acceleration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Acceleration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Acceleration) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private Acceleration(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 13) {
                            this.x_ = codedInputStream.readFloat();
                        } else if (readTag == 21) {
                            this.y_ = codedInputStream.readFloat();
                        } else if (readTag == 29) {
                            this.z_ = codedInputStream.readFloat();
                        } else if (!codedInputStream.skipField(readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            makeExtensionsImmutable();
        }

        public static Acceleration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Acceleration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static Acceleration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Acceleration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Acceleration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Acceleration) PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface AccelerationOrBuilder extends MessageOrBuilder {
        float getX();

        float getY();

        float getZ();
    }

    public static final class BluetoothInfo extends GeneratedMessageV3 implements BluetoothInfoOrBuilder {
        private static final BluetoothInfo DEFAULT_INSTANCE = new BluetoothInfo();
        public static final Parser<BluetoothInfo> PARSER = new AbstractParser<BluetoothInfo>() {
            public final BluetoothInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new BluetoothInfo(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        public volatile Object alias_;
        public volatile Object macid_;
        private byte memoizedIsInitialized;
        public volatile Object name_;
        public int status_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BluetoothInfoOrBuilder {
            private Object alias_;
            private Object macid_;
            private Object name_;
            private int status_;

            private void maybeForceBuilderInitialization() {
            }

            public final boolean isInitialized() {
                return true;
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DeviceInfo.f22847e;
            }

            public final Descriptors.Descriptor getDescriptorForType() {
                return DeviceInfo.f22847e;
            }

            public final int getStatus() {
                return this.status_;
            }

            public final Builder clearStatus() {
                this.status_ = 0;
                onChanged();
                return this;
            }

            public final Builder clone() {
                return (Builder) super.clone();
            }

            public final BluetoothInfo getDefaultInstanceForType() {
                return BluetoothInfo.getDefaultInstance();
            }

            public final BluetoothInfo build() {
                BluetoothInfo buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final Builder clearAlias() {
                this.alias_ = BluetoothInfo.getDefaultInstance().getAlias();
                onChanged();
                return this;
            }

            public final Builder clearMacid() {
                this.macid_ = BluetoothInfo.getDefaultInstance().getMacid();
                onChanged();
                return this;
            }

            public final Builder clearName() {
                this.name_ = BluetoothInfo.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DeviceInfo.f22848f.ensureFieldAccessorsInitialized(BluetoothInfo.class, Builder.class);
            }

            private Builder() {
                this.name_ = "";
                this.macid_ = "";
                this.alias_ = "";
                maybeForceBuilderInitialization();
            }

            public final BluetoothInfo buildPartial() {
                BluetoothInfo bluetoothInfo = new BluetoothInfo((GeneratedMessageV3.Builder) this);
                bluetoothInfo.name_ = this.name_;
                bluetoothInfo.macid_ = this.macid_;
                bluetoothInfo.status_ = this.status_;
                bluetoothInfo.alias_ = this.alias_;
                onBuilt();
                return bluetoothInfo;
            }

            public final Builder clear() {
                super.clear();
                this.name_ = "";
                this.macid_ = "";
                this.status_ = 0;
                this.alias_ = "";
                return this;
            }

            public final String getAlias() {
                Object obj = this.alias_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.alias_ = stringUtf8;
                return stringUtf8;
            }

            public final ByteString getAliasBytes() {
                Object obj = this.alias_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.alias_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final String getMacid() {
                Object obj = this.macid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.macid_ = stringUtf8;
                return stringUtf8;
            }

            public final ByteString getMacidBytes() {
                Object obj = this.macid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.macid_ = copyFromUtf8;
                return copyFromUtf8;
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

            public final Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public final Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public final Builder setStatus(int i) {
                this.status_ = i;
                onChanged();
                return this;
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof BluetoothInfo) {
                    return mergeFrom((BluetoothInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder setAlias(String str) {
                if (str != null) {
                    this.alias_ = str;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            public final Builder setMacid(String str) {
                if (str != null) {
                    this.macid_ = str;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            public final Builder setName(String str) {
                if (str != null) {
                    this.name_ = str;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            public final Builder setAliasBytes(ByteString byteString) {
                if (byteString != null) {
                    BluetoothInfo.checkByteStringIsUtf8(byteString);
                    this.alias_ = byteString;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            public final Builder setMacidBytes(ByteString byteString) {
                if (byteString != null) {
                    BluetoothInfo.checkByteStringIsUtf8(byteString);
                    this.macid_ = byteString;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            public final Builder setNameBytes(ByteString byteString) {
                if (byteString != null) {
                    BluetoothInfo.checkByteStringIsUtf8(byteString);
                    this.name_ = byteString;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
                this.macid_ = "";
                this.alias_ = "";
                maybeForceBuilderInitialization();
            }

            public final Builder mergeFrom(BluetoothInfo bluetoothInfo) {
                if (bluetoothInfo == BluetoothInfo.getDefaultInstance()) {
                    return this;
                }
                if (!bluetoothInfo.getName().isEmpty()) {
                    this.name_ = bluetoothInfo.name_;
                    onChanged();
                }
                if (!bluetoothInfo.getMacid().isEmpty()) {
                    this.macid_ = bluetoothInfo.macid_;
                    onChanged();
                }
                if (bluetoothInfo.getStatus() != 0) {
                    setStatus(bluetoothInfo.getStatus());
                }
                if (!bluetoothInfo.getAlias().isEmpty()) {
                    this.alias_ = bluetoothInfo.alias_;
                    onChanged();
                }
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
            public final com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.BluetoothInfo.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$BluetoothInfo> r1 = com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.BluetoothInfo.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$BluetoothInfo r3 = (com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.BluetoothInfo) r3     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    if (r3 == 0) goto L_0x000e
                    r2.mergeFrom((com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.BluetoothInfo) r3)
                L_0x000e:
                    return r2
                L_0x000f:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0011:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x000f }
                    com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$BluetoothInfo r4 = (com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.BluetoothInfo) r4     // Catch:{ all -> 0x000f }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.BluetoothInfo) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.BluetoothInfo.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$BluetoothInfo$Builder");
            }

            public final Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }
        }

        public static BluetoothInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeviceInfo.f22847e;
        }

        public static Parser<BluetoothInfo> parser() {
            return PARSER;
        }

        public final BluetoothInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public final Parser<BluetoothInfo> getParserForType() {
            return PARSER;
        }

        public final int getStatus() {
            return this.status_;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeviceInfo.f22848f.ensureFieldAccessorsInitialized(BluetoothInfo.class, Builder.class);
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

        private BluetoothInfo() {
            this.memoizedIsInitialized = -1;
            this.name_ = "";
            this.macid_ = "";
            this.alias_ = "";
        }

        public final String getAlias() {
            Object obj = this.alias_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.alias_ = stringUtf8;
            return stringUtf8;
        }

        public final ByteString getAliasBytes() {
            Object obj = this.alias_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.alias_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final String getMacid() {
            Object obj = this.macid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.macid_ = stringUtf8;
            return stringUtf8;
        }

        public final ByteString getMacidBytes() {
            Object obj = this.macid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.macid_ = copyFromUtf8;
            return copyFromUtf8;
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
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getNameBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.name_);
            }
            if (!getMacidBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.macid_);
            }
            if (this.status_ != 0) {
                i2 += CodedOutputStream.computeInt32Size(3, this.status_);
            }
            if (!getAliasBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(4, this.alias_);
            }
            this.memoizedSize = i2;
            return i2;
        }

        public final int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((((((getDescriptorForType().hashCode() + 779) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getMacid().hashCode()) * 37) + 3) * 53) + getStatus()) * 37) + 4) * 53) + getAlias().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        private BluetoothInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        public static Builder newBuilder(BluetoothInfo bluetoothInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(bluetoothInfo);
        }

        public static BluetoothInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BluetoothInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static BluetoothInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BluetoothInfo) PARSER.parseFrom(byteString);
        }

        /* access modifiers changed from: protected */
        public final Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static BluetoothInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (BluetoothInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            if (!getMacidBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.macid_);
            }
            if (this.status_ != 0) {
                codedOutputStream.writeInt32(3, this.status_);
            }
            if (!getAliasBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.alias_);
            }
        }

        public final boolean equals(Object obj) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BluetoothInfo)) {
                return super.equals(obj);
            }
            BluetoothInfo bluetoothInfo = (BluetoothInfo) obj;
            if (!getName().equals(bluetoothInfo.getName()) || !getMacid().equals(bluetoothInfo.getMacid())) {
                z = false;
            } else {
                z = true;
            }
            if (!z || getStatus() != bluetoothInfo.getStatus()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2 || !getAlias().equals(bluetoothInfo.getAlias())) {
                z3 = false;
            }
            return z3;
        }

        public static BluetoothInfo parseFrom(InputStream inputStream) throws IOException {
            return (BluetoothInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static BluetoothInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BluetoothInfo) PARSER.parseFrom(bArr);
        }

        public static BluetoothInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BluetoothInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BluetoothInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BluetoothInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private BluetoothInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            this.name_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 18) {
                            this.macid_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 24) {
                            this.status_ = codedInputStream.readInt32();
                        } else if (readTag == 34) {
                            this.alias_ = codedInputStream.readStringRequireUtf8();
                        } else if (!codedInputStream.skipField(readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            makeExtensionsImmutable();
        }

        public static BluetoothInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BluetoothInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static BluetoothInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BluetoothInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BluetoothInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BluetoothInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface BluetoothInfoOrBuilder extends MessageOrBuilder {
        String getAlias();

        ByteString getAliasBytes();

        String getMacid();

        ByteString getMacidBytes();

        String getName();

        ByteString getNameBytes();

        int getStatus();
    }

    public static final class CronUploadInfo extends GeneratedMessageV3 implements CronUploadInfoOrBuilder {
        private static final CronUploadInfo DEFAULT_INSTANCE = new CronUploadInfo();
        public static final Parser<CronUploadInfo> PARSER = new AbstractParser<CronUploadInfo>() {
            public final CronUploadInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CronUploadInfo(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        public Acceleration acceleration_;
        public DeviceParameter deviceParameter_;
        public Gyro gyro_;
        private byte memoizedIsInitialized;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CronUploadInfoOrBuilder {
            private SingleFieldBuilderV3<Acceleration, Acceleration.Builder, AccelerationOrBuilder> accelerationBuilder_;
            private Acceleration acceleration_;
            private SingleFieldBuilderV3<DeviceParameter, DeviceParameter.Builder, DeviceParameterOrBuilder> deviceParameterBuilder_;
            private DeviceParameter deviceParameter_;
            private SingleFieldBuilderV3<Gyro, Gyro.Builder, GyroOrBuilder> gyroBuilder_;
            private Gyro gyro_;

            private void maybeForceBuilderInitialization() {
            }

            public final boolean isInitialized() {
                return true;
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DeviceInfo.q;
            }

            public final Descriptors.Descriptor getDescriptorForType() {
                return DeviceInfo.q;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public final Builder clone() {
                return (Builder) super.clone();
            }

            public final CronUploadInfo getDefaultInstanceForType() {
                return CronUploadInfo.getDefaultInstance();
            }

            public final CronUploadInfo build() {
                CronUploadInfo buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final Builder clearAcceleration() {
                if (this.accelerationBuilder_ == null) {
                    this.acceleration_ = null;
                    onChanged();
                } else {
                    this.acceleration_ = null;
                    this.accelerationBuilder_ = null;
                }
                return this;
            }

            public final Builder clearDeviceParameter() {
                if (this.deviceParameterBuilder_ == null) {
                    this.deviceParameter_ = null;
                    onChanged();
                } else {
                    this.deviceParameter_ = null;
                    this.deviceParameterBuilder_ = null;
                }
                return this;
            }

            public final Builder clearGyro() {
                if (this.gyroBuilder_ == null) {
                    this.gyro_ = null;
                    onChanged();
                } else {
                    this.gyro_ = null;
                    this.gyroBuilder_ = null;
                }
                return this;
            }

            public final Acceleration.Builder getAccelerationBuilder() {
                onChanged();
                return (Acceleration.Builder) getAccelerationFieldBuilder().getBuilder();
            }

            public final DeviceParameter.Builder getDeviceParameterBuilder() {
                onChanged();
                return (DeviceParameter.Builder) getDeviceParameterFieldBuilder().getBuilder();
            }

            public final Gyro.Builder getGyroBuilder() {
                onChanged();
                return (Gyro.Builder) getGyroFieldBuilder().getBuilder();
            }

            public final boolean hasAcceleration() {
                if (this.accelerationBuilder_ == null && this.acceleration_ == null) {
                    return false;
                }
                return true;
            }

            public final boolean hasDeviceParameter() {
                if (this.deviceParameterBuilder_ == null && this.deviceParameter_ == null) {
                    return false;
                }
                return true;
            }

            public final boolean hasGyro() {
                if (this.gyroBuilder_ == null && this.gyro_ == null) {
                    return false;
                }
                return true;
            }

            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DeviceInfo.r.ensureFieldAccessorsInitialized(CronUploadInfo.class, Builder.class);
            }

            private SingleFieldBuilderV3<Acceleration, Acceleration.Builder, AccelerationOrBuilder> getAccelerationFieldBuilder() {
                if (this.accelerationBuilder_ == null) {
                    this.accelerationBuilder_ = new SingleFieldBuilderV3<>(getAcceleration(), getParentForChildren(), isClean());
                    this.acceleration_ = null;
                }
                return this.accelerationBuilder_;
            }

            private SingleFieldBuilderV3<DeviceParameter, DeviceParameter.Builder, DeviceParameterOrBuilder> getDeviceParameterFieldBuilder() {
                if (this.deviceParameterBuilder_ == null) {
                    this.deviceParameterBuilder_ = new SingleFieldBuilderV3<>(getDeviceParameter(), getParentForChildren(), isClean());
                    this.deviceParameter_ = null;
                }
                return this.deviceParameterBuilder_;
            }

            private SingleFieldBuilderV3<Gyro, Gyro.Builder, GyroOrBuilder> getGyroFieldBuilder() {
                if (this.gyroBuilder_ == null) {
                    this.gyroBuilder_ = new SingleFieldBuilderV3<>(getGyro(), getParentForChildren(), isClean());
                    this.gyro_ = null;
                }
                return this.gyroBuilder_;
            }

            public final Acceleration getAcceleration() {
                if (this.accelerationBuilder_ != null) {
                    return (Acceleration) this.accelerationBuilder_.getMessage();
                }
                if (this.acceleration_ == null) {
                    return Acceleration.getDefaultInstance();
                }
                return this.acceleration_;
            }

            public final AccelerationOrBuilder getAccelerationOrBuilder() {
                if (this.accelerationBuilder_ != null) {
                    return (AccelerationOrBuilder) this.accelerationBuilder_.getMessageOrBuilder();
                }
                if (this.acceleration_ == null) {
                    return Acceleration.getDefaultInstance();
                }
                return this.acceleration_;
            }

            public final DeviceParameter getDeviceParameter() {
                if (this.deviceParameterBuilder_ != null) {
                    return (DeviceParameter) this.deviceParameterBuilder_.getMessage();
                }
                if (this.deviceParameter_ == null) {
                    return DeviceParameter.getDefaultInstance();
                }
                return this.deviceParameter_;
            }

            public final DeviceParameterOrBuilder getDeviceParameterOrBuilder() {
                if (this.deviceParameterBuilder_ != null) {
                    return (DeviceParameterOrBuilder) this.deviceParameterBuilder_.getMessageOrBuilder();
                }
                if (this.deviceParameter_ == null) {
                    return DeviceParameter.getDefaultInstance();
                }
                return this.deviceParameter_;
            }

            public final Gyro getGyro() {
                if (this.gyroBuilder_ != null) {
                    return (Gyro) this.gyroBuilder_.getMessage();
                }
                if (this.gyro_ == null) {
                    return Gyro.getDefaultInstance();
                }
                return this.gyro_;
            }

            public final GyroOrBuilder getGyroOrBuilder() {
                if (this.gyroBuilder_ != null) {
                    return (GyroOrBuilder) this.gyroBuilder_.getMessageOrBuilder();
                }
                if (this.gyro_ == null) {
                    return Gyro.getDefaultInstance();
                }
                return this.gyro_;
            }

            public final Builder clear() {
                super.clear();
                if (this.deviceParameterBuilder_ == null) {
                    this.deviceParameter_ = null;
                } else {
                    this.deviceParameter_ = null;
                    this.deviceParameterBuilder_ = null;
                }
                if (this.gyroBuilder_ == null) {
                    this.gyro_ = null;
                } else {
                    this.gyro_ = null;
                    this.gyroBuilder_ = null;
                }
                if (this.accelerationBuilder_ == null) {
                    this.acceleration_ = null;
                } else {
                    this.acceleration_ = null;
                    this.accelerationBuilder_ = null;
                }
                return this;
            }

            public final CronUploadInfo buildPartial() {
                CronUploadInfo cronUploadInfo = new CronUploadInfo((GeneratedMessageV3.Builder) this);
                if (this.deviceParameterBuilder_ == null) {
                    cronUploadInfo.deviceParameter_ = this.deviceParameter_;
                } else {
                    cronUploadInfo.deviceParameter_ = (DeviceParameter) this.deviceParameterBuilder_.build();
                }
                if (this.gyroBuilder_ == null) {
                    cronUploadInfo.gyro_ = this.gyro_;
                } else {
                    cronUploadInfo.gyro_ = (Gyro) this.gyroBuilder_.build();
                }
                if (this.accelerationBuilder_ == null) {
                    cronUploadInfo.acceleration_ = this.acceleration_;
                } else {
                    cronUploadInfo.acceleration_ = (Acceleration) this.accelerationBuilder_.build();
                }
                onBuilt();
                return cronUploadInfo;
            }

            public final Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public final Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof CronUploadInfo) {
                    return mergeFrom((CronUploadInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder setAcceleration(Acceleration.Builder builder) {
                if (this.accelerationBuilder_ == null) {
                    this.acceleration_ = builder.build();
                    onChanged();
                } else {
                    this.accelerationBuilder_.setMessage(builder.build());
                }
                return this;
            }

            public final Builder setDeviceParameter(DeviceParameter.Builder builder) {
                if (this.deviceParameterBuilder_ == null) {
                    this.deviceParameter_ = builder.build();
                    onChanged();
                } else {
                    this.deviceParameterBuilder_.setMessage(builder.build());
                }
                return this;
            }

            public final Builder setGyro(Gyro.Builder builder) {
                if (this.gyroBuilder_ == null) {
                    this.gyro_ = builder.build();
                    onChanged();
                } else {
                    this.gyroBuilder_.setMessage(builder.build());
                }
                return this;
            }

            public final Builder mergeAcceleration(Acceleration acceleration) {
                if (this.accelerationBuilder_ == null) {
                    if (this.acceleration_ != null) {
                        this.acceleration_ = Acceleration.newBuilder(this.acceleration_).mergeFrom(acceleration).buildPartial();
                    } else {
                        this.acceleration_ = acceleration;
                    }
                    onChanged();
                } else {
                    this.accelerationBuilder_.mergeFrom(acceleration);
                }
                return this;
            }

            public final Builder mergeDeviceParameter(DeviceParameter deviceParameter) {
                if (this.deviceParameterBuilder_ == null) {
                    if (this.deviceParameter_ != null) {
                        this.deviceParameter_ = DeviceParameter.newBuilder(this.deviceParameter_).mergeFrom(deviceParameter).buildPartial();
                    } else {
                        this.deviceParameter_ = deviceParameter;
                    }
                    onChanged();
                } else {
                    this.deviceParameterBuilder_.mergeFrom(deviceParameter);
                }
                return this;
            }

            public final Builder mergeFrom(CronUploadInfo cronUploadInfo) {
                if (cronUploadInfo == CronUploadInfo.getDefaultInstance()) {
                    return this;
                }
                if (cronUploadInfo.hasDeviceParameter()) {
                    mergeDeviceParameter(cronUploadInfo.getDeviceParameter());
                }
                if (cronUploadInfo.hasGyro()) {
                    mergeGyro(cronUploadInfo.getGyro());
                }
                if (cronUploadInfo.hasAcceleration()) {
                    mergeAcceleration(cronUploadInfo.getAcceleration());
                }
                onChanged();
                return this;
            }

            public final Builder mergeGyro(Gyro gyro) {
                if (this.gyroBuilder_ == null) {
                    if (this.gyro_ != null) {
                        this.gyro_ = Gyro.newBuilder(this.gyro_).mergeFrom(gyro).buildPartial();
                    } else {
                        this.gyro_ = gyro;
                    }
                    onChanged();
                } else {
                    this.gyroBuilder_.mergeFrom(gyro);
                }
                return this;
            }

            public final Builder setAcceleration(Acceleration acceleration) {
                if (this.accelerationBuilder_ != null) {
                    this.accelerationBuilder_.setMessage(acceleration);
                } else if (acceleration != null) {
                    this.acceleration_ = acceleration;
                    onChanged();
                } else {
                    throw new NullPointerException();
                }
                return this;
            }

            public final Builder setDeviceParameter(DeviceParameter deviceParameter) {
                if (this.deviceParameterBuilder_ != null) {
                    this.deviceParameterBuilder_.setMessage(deviceParameter);
                } else if (deviceParameter != null) {
                    this.deviceParameter_ = deviceParameter;
                    onChanged();
                } else {
                    throw new NullPointerException();
                }
                return this;
            }

            public final Builder setGyro(Gyro gyro) {
                if (this.gyroBuilder_ != null) {
                    this.gyroBuilder_.setMessage(gyro);
                } else if (gyro != null) {
                    this.gyro_ = gyro;
                    onChanged();
                } else {
                    throw new NullPointerException();
                }
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
            public final com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.CronUploadInfo.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$CronUploadInfo> r1 = com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.CronUploadInfo.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$CronUploadInfo r3 = (com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.CronUploadInfo) r3     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    if (r3 == 0) goto L_0x000e
                    r2.mergeFrom((com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.CronUploadInfo) r3)
                L_0x000e:
                    return r2
                L_0x000f:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0011:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x000f }
                    com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$CronUploadInfo r4 = (com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.CronUploadInfo) r4     // Catch:{ all -> 0x000f }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.CronUploadInfo) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.CronUploadInfo.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$CronUploadInfo$Builder");
            }

            public final Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }
        }

        public static CronUploadInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeviceInfo.q;
        }

        public static Parser<CronUploadInfo> parser() {
            return PARSER;
        }

        public final CronUploadInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public final Parser<CronUploadInfo> getParserForType() {
            return PARSER;
        }

        private CronUploadInfo() {
            this.memoizedIsInitialized = -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public final AccelerationOrBuilder getAccelerationOrBuilder() {
            return getAcceleration();
        }

        public final DeviceParameterOrBuilder getDeviceParameterOrBuilder() {
            return getDeviceParameter();
        }

        public final GyroOrBuilder getGyroOrBuilder() {
            return getGyro();
        }

        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        public final boolean hasAcceleration() {
            if (this.acceleration_ != null) {
                return true;
            }
            return false;
        }

        public final boolean hasDeviceParameter() {
            if (this.deviceParameter_ != null) {
                return true;
            }
            return false;
        }

        public final boolean hasGyro() {
            if (this.gyro_ != null) {
                return true;
            }
            return false;
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public final Acceleration getAcceleration() {
            if (this.acceleration_ == null) {
                return Acceleration.getDefaultInstance();
            }
            return this.acceleration_;
        }

        public final DeviceParameter getDeviceParameter() {
            if (this.deviceParameter_ == null) {
                return DeviceParameter.getDefaultInstance();
            }
            return this.deviceParameter_;
        }

        public final Gyro getGyro() {
            if (this.gyro_ == null) {
                return Gyro.getDefaultInstance();
            }
            return this.gyro_;
        }

        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeviceInfo.r.ensureFieldAccessorsInitialized(CronUploadInfo.class, Builder.class);
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
            if (this.deviceParameter_ != null) {
                i2 = 0 + CodedOutputStream.computeMessageSize(1, getDeviceParameter());
            }
            if (this.gyro_ != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getGyro());
            }
            if (this.acceleration_ != null) {
                i2 += CodedOutputStream.computeMessageSize(3, getAcceleration());
            }
            this.memoizedSize = i2;
            return i2;
        }

        public final int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = getDescriptorForType().hashCode() + 779;
            if (hasDeviceParameter()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getDeviceParameter().hashCode();
            }
            if (hasGyro()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getGyro().hashCode();
            }
            if (hasAcceleration()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getAcceleration().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        private CronUploadInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        public static Builder newBuilder(CronUploadInfo cronUploadInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cronUploadInfo);
        }

        public static CronUploadInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CronUploadInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CronUploadInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CronUploadInfo) PARSER.parseFrom(byteString);
        }

        /* access modifiers changed from: protected */
        public final Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static CronUploadInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CronUploadInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.deviceParameter_ != null) {
                codedOutputStream.writeMessage(1, getDeviceParameter());
            }
            if (this.gyro_ != null) {
                codedOutputStream.writeMessage(2, getGyro());
            }
            if (this.acceleration_ != null) {
                codedOutputStream.writeMessage(3, getAcceleration());
            }
        }

        public static CronUploadInfo parseFrom(InputStream inputStream) throws IOException {
            return (CronUploadInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public final boolean equals(Object obj) {
            boolean z;
            boolean z2;
            boolean z3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CronUploadInfo)) {
                return super.equals(obj);
            }
            CronUploadInfo cronUploadInfo = (CronUploadInfo) obj;
            if (hasDeviceParameter() == cronUploadInfo.hasDeviceParameter()) {
                z = true;
            } else {
                z = false;
            }
            if (hasDeviceParameter()) {
                if (!z || !getDeviceParameter().equals(cronUploadInfo.getDeviceParameter())) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (!z || hasGyro() != cronUploadInfo.hasGyro()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (hasGyro()) {
                if (!z2 || !getGyro().equals(cronUploadInfo.getGyro())) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
            if (!z2 || hasAcceleration() != cronUploadInfo.hasAcceleration()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (hasAcceleration()) {
                if (!z3 || !getAcceleration().equals(cronUploadInfo.getAcceleration())) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            }
            return z3;
        }

        public static CronUploadInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CronUploadInfo) PARSER.parseFrom(bArr);
        }

        public static CronUploadInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CronUploadInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CronUploadInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CronUploadInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CronUploadInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CronUploadInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$DeviceParameter$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$Gyro$Builder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$Acceleration$Builder} */
        /* JADX WARNING: type inference failed for: r4v0 */
        /* JADX WARNING: type inference failed for: r4v7 */
        /* JADX WARNING: type inference failed for: r4v8 */
        /* JADX WARNING: type inference failed for: r4v9 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private CronUploadInfo(com.google.protobuf.CodedInputStream r6, com.google.protobuf.ExtensionRegistryLite r7) throws com.google.protobuf.InvalidProtocolBufferException {
            /*
                r5 = this;
                r5.<init>()
                r0 = 0
                r1 = 1
            L_0x0005:
                if (r0 != 0) goto L_0x00a8
                int r2 = r6.readTag()     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                if (r2 == 0) goto L_0x008e
                r3 = 10
                r4 = 0
                if (r2 == r3) goto L_0x0069
                r3 = 18
                if (r2 == r3) goto L_0x0045
                r3 = 26
                if (r2 == r3) goto L_0x0021
                boolean r2 = r6.skipField(r2)     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                if (r2 != 0) goto L_0x0005
                goto L_0x008e
            L_0x0021:
                com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$Acceleration r2 = r5.acceleration_     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                if (r2 == 0) goto L_0x002b
                com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$Acceleration r2 = r5.acceleration_     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$Acceleration$Builder r4 = r2.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
            L_0x002b:
                com.google.protobuf.Parser r2 = com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.Acceleration.parser()     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                com.google.protobuf.MessageLite r2 = r6.readMessage((com.google.protobuf.Parser<T>) r2, (com.google.protobuf.ExtensionRegistryLite) r7)     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$Acceleration r2 = (com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.Acceleration) r2     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                r5.acceleration_ = r2     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                if (r4 == 0) goto L_0x0005
                com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$Acceleration r2 = r5.acceleration_     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                r4.mergeFrom((com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.Acceleration) r2)     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$Acceleration r2 = r4.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                r5.acceleration_ = r2     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                goto L_0x0005
            L_0x0045:
                com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$Gyro r2 = r5.gyro_     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                if (r2 == 0) goto L_0x004f
                com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$Gyro r2 = r5.gyro_     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$Gyro$Builder r4 = r2.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
            L_0x004f:
                com.google.protobuf.Parser r2 = com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.Gyro.parser()     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                com.google.protobuf.MessageLite r2 = r6.readMessage((com.google.protobuf.Parser<T>) r2, (com.google.protobuf.ExtensionRegistryLite) r7)     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$Gyro r2 = (com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.Gyro) r2     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                r5.gyro_ = r2     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                if (r4 == 0) goto L_0x0005
                com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$Gyro r2 = r5.gyro_     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                r4.mergeFrom((com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.Gyro) r2)     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$Gyro r2 = r4.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                r5.gyro_ = r2     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                goto L_0x0005
            L_0x0069:
                com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$DeviceParameter r2 = r5.deviceParameter_     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                if (r2 == 0) goto L_0x0073
                com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$DeviceParameter r2 = r5.deviceParameter_     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$DeviceParameter$Builder r4 = r2.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
            L_0x0073:
                com.google.protobuf.Parser r2 = com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.DeviceParameter.parser()     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                com.google.protobuf.MessageLite r2 = r6.readMessage((com.google.protobuf.Parser<T>) r2, (com.google.protobuf.ExtensionRegistryLite) r7)     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$DeviceParameter r2 = (com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.DeviceParameter) r2     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                r5.deviceParameter_ = r2     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                if (r4 == 0) goto L_0x0005
                com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$DeviceParameter r2 = r5.deviceParameter_     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                r4.mergeFrom((com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.DeviceParameter) r2)     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$DeviceParameter r2 = r4.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                r5.deviceParameter_ = r2     // Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x0093 }
                goto L_0x0005
            L_0x008e:
                r0 = 1
                goto L_0x0005
            L_0x0091:
                r6 = move-exception
                goto L_0x00a4
            L_0x0093:
                r6 = move-exception
                com.google.protobuf.InvalidProtocolBufferException r7 = new com.google.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0091 }
                r7.<init>((java.io.IOException) r6)     // Catch:{ all -> 0x0091 }
                com.google.protobuf.InvalidProtocolBufferException r6 = r7.setUnfinishedMessage(r5)     // Catch:{ all -> 0x0091 }
                throw r6     // Catch:{ all -> 0x0091 }
            L_0x009e:
                r6 = move-exception
                com.google.protobuf.InvalidProtocolBufferException r6 = r6.setUnfinishedMessage(r5)     // Catch:{ all -> 0x0091 }
                throw r6     // Catch:{ all -> 0x0091 }
            L_0x00a4:
                r5.makeExtensionsImmutable()
                throw r6
            L_0x00a8:
                r5.makeExtensionsImmutable()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.CronUploadInfo.<init>(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):void");
        }

        public static CronUploadInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CronUploadInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CronUploadInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CronUploadInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface CronUploadInfoOrBuilder extends MessageOrBuilder {
        Acceleration getAcceleration();

        AccelerationOrBuilder getAccelerationOrBuilder();

        DeviceParameter getDeviceParameter();

        DeviceParameterOrBuilder getDeviceParameterOrBuilder();

        Gyro getGyro();

        GyroOrBuilder getGyroOrBuilder();

        boolean hasAcceleration();

        boolean hasDeviceParameter();

        boolean hasGyro();
    }

    public static final class DeviceParameter extends GeneratedMessageV3 implements DeviceParameterOrBuilder {
        private static final DeviceParameter DEFAULT_INSTANCE = new DeviceParameter();
        public static final Parser<DeviceParameter> PARSER = new AbstractParser<DeviceParameter>() {
            public final DeviceParameter parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new DeviceParameter(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        public volatile Object cpuType_;
        public long diskSize_;
        public long diskUsageSize_;
        private byte memoizedIsInitialized;
        public long memorySize_;
        public long memoryUsageSize_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeviceParameterOrBuilder {
            private Object cpuType_;
            private long diskSize_;
            private long diskUsageSize_;
            private long memorySize_;
            private long memoryUsageSize_;

            private void maybeForceBuilderInitialization() {
            }

            public final boolean isInitialized() {
                return true;
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DeviceInfo.k;
            }

            public final Descriptors.Descriptor getDescriptorForType() {
                return DeviceInfo.k;
            }

            public final long getDiskSize() {
                return this.diskSize_;
            }

            public final long getDiskUsageSize() {
                return this.diskUsageSize_;
            }

            public final long getMemorySize() {
                return this.memorySize_;
            }

            public final long getMemoryUsageSize() {
                return this.memoryUsageSize_;
            }

            public final Builder clearDiskSize() {
                this.diskSize_ = 0;
                onChanged();
                return this;
            }

            public final Builder clearDiskUsageSize() {
                this.diskUsageSize_ = 0;
                onChanged();
                return this;
            }

            public final Builder clearMemorySize() {
                this.memorySize_ = 0;
                onChanged();
                return this;
            }

            public final Builder clearMemoryUsageSize() {
                this.memoryUsageSize_ = 0;
                onChanged();
                return this;
            }

            public final Builder clone() {
                return (Builder) super.clone();
            }

            public final DeviceParameter getDefaultInstanceForType() {
                return DeviceParameter.getDefaultInstance();
            }

            private Builder() {
                this.cpuType_ = "";
                maybeForceBuilderInitialization();
            }

            public final DeviceParameter build() {
                DeviceParameter buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final Builder clearCpuType() {
                this.cpuType_ = DeviceParameter.getDefaultInstance().getCpuType();
                onChanged();
                return this;
            }

            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DeviceInfo.l.ensureFieldAccessorsInitialized(DeviceParameter.class, Builder.class);
            }

            public final DeviceParameter buildPartial() {
                DeviceParameter deviceParameter = new DeviceParameter((GeneratedMessageV3.Builder) this);
                deviceParameter.diskSize_ = this.diskSize_;
                deviceParameter.diskUsageSize_ = this.diskUsageSize_;
                deviceParameter.memorySize_ = this.memorySize_;
                deviceParameter.memoryUsageSize_ = this.memoryUsageSize_;
                deviceParameter.cpuType_ = this.cpuType_;
                onBuilt();
                return deviceParameter;
            }

            public final Builder clear() {
                super.clear();
                this.diskSize_ = 0;
                this.diskUsageSize_ = 0;
                this.memorySize_ = 0;
                this.memoryUsageSize_ = 0;
                this.cpuType_ = "";
                return this;
            }

            public final String getCpuType() {
                Object obj = this.cpuType_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.cpuType_ = stringUtf8;
                return stringUtf8;
            }

            public final ByteString getCpuTypeBytes() {
                Object obj = this.cpuType_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.cpuType_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public final Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public final Builder setDiskSize(long j) {
                this.diskSize_ = j;
                onChanged();
                return this;
            }

            public final Builder setDiskUsageSize(long j) {
                this.diskUsageSize_ = j;
                onChanged();
                return this;
            }

            public final Builder setMemorySize(long j) {
                this.memorySize_ = j;
                onChanged();
                return this;
            }

            public final Builder setMemoryUsageSize(long j) {
                this.memoryUsageSize_ = j;
                onChanged();
                return this;
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof DeviceParameter) {
                    return mergeFrom((DeviceParameter) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder setCpuType(String str) {
                if (str != null) {
                    this.cpuType_ = str;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.cpuType_ = "";
                maybeForceBuilderInitialization();
            }

            public final Builder setCpuTypeBytes(ByteString byteString) {
                if (byteString != null) {
                    DeviceParameter.checkByteStringIsUtf8(byteString);
                    this.cpuType_ = byteString;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            public final Builder mergeFrom(DeviceParameter deviceParameter) {
                if (deviceParameter == DeviceParameter.getDefaultInstance()) {
                    return this;
                }
                if (deviceParameter.getDiskSize() != 0) {
                    setDiskSize(deviceParameter.getDiskSize());
                }
                if (deviceParameter.getDiskUsageSize() != 0) {
                    setDiskUsageSize(deviceParameter.getDiskUsageSize());
                }
                if (deviceParameter.getMemorySize() != 0) {
                    setMemorySize(deviceParameter.getMemorySize());
                }
                if (deviceParameter.getMemoryUsageSize() != 0) {
                    setMemoryUsageSize(deviceParameter.getMemoryUsageSize());
                }
                if (!deviceParameter.getCpuType().isEmpty()) {
                    this.cpuType_ = deviceParameter.cpuType_;
                    onChanged();
                }
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
            public final com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.DeviceParameter.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$DeviceParameter> r1 = com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.DeviceParameter.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$DeviceParameter r3 = (com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.DeviceParameter) r3     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    if (r3 == 0) goto L_0x000e
                    r2.mergeFrom((com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.DeviceParameter) r3)
                L_0x000e:
                    return r2
                L_0x000f:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0011:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x000f }
                    com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$DeviceParameter r4 = (com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.DeviceParameter) r4     // Catch:{ all -> 0x000f }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.DeviceParameter) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.DeviceParameter.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$DeviceParameter$Builder");
            }

            public final Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }
        }

        public static DeviceParameter getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeviceInfo.k;
        }

        public static Parser<DeviceParameter> parser() {
            return PARSER;
        }

        public final DeviceParameter getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public final long getDiskSize() {
            return this.diskSize_;
        }

        public final long getDiskUsageSize() {
            return this.diskUsageSize_;
        }

        public final long getMemorySize() {
            return this.memorySize_;
        }

        public final long getMemoryUsageSize() {
            return this.memoryUsageSize_;
        }

        public final Parser<DeviceParameter> getParserForType() {
            return PARSER;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        private DeviceParameter() {
            this.memoizedIsInitialized = -1;
            this.cpuType_ = "";
        }

        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeviceInfo.l.ensureFieldAccessorsInitialized(DeviceParameter.class, Builder.class);
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

        public final String getCpuType() {
            Object obj = this.cpuType_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.cpuType_ = stringUtf8;
            return stringUtf8;
        }

        public final ByteString getCpuTypeBytes() {
            Object obj = this.cpuType_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.cpuType_ = copyFromUtf8;
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
            if (this.diskSize_ != 0) {
                i2 = 0 + CodedOutputStream.computeInt64Size(1, this.diskSize_);
            }
            if (this.diskUsageSize_ != 0) {
                i2 += CodedOutputStream.computeInt64Size(2, this.diskUsageSize_);
            }
            if (this.memorySize_ != 0) {
                i2 += CodedOutputStream.computeInt64Size(3, this.memorySize_);
            }
            if (this.memoryUsageSize_ != 0) {
                i2 += CodedOutputStream.computeInt64Size(4, this.memoryUsageSize_);
            }
            if (!getCpuTypeBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(5, this.cpuType_);
            }
            this.memoizedSize = i2;
            return i2;
        }

        public final int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((((((((((getDescriptorForType().hashCode() + 779) * 37) + 1) * 53) + Internal.hashLong(getDiskSize())) * 37) + 2) * 53) + Internal.hashLong(getDiskUsageSize())) * 37) + 3) * 53) + Internal.hashLong(getMemorySize())) * 37) + 4) * 53) + Internal.hashLong(getMemoryUsageSize())) * 37) + 5) * 53) + getCpuType().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        private DeviceParameter(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        public static Builder newBuilder(DeviceParameter deviceParameter) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deviceParameter);
        }

        public static DeviceParameter parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeviceParameter) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeviceParameter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DeviceParameter) PARSER.parseFrom(byteString);
        }

        /* access modifiers changed from: protected */
        public final Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static DeviceParameter parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DeviceParameter) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
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
            if (!(obj instanceof DeviceParameter)) {
                return super.equals(obj);
            }
            DeviceParameter deviceParameter = (DeviceParameter) obj;
            if (getDiskSize() == deviceParameter.getDiskSize()) {
                z = true;
            } else {
                z = false;
            }
            if (!z || getDiskUsageSize() != deviceParameter.getDiskUsageSize()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2 || getMemorySize() != deviceParameter.getMemorySize()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3 || getMemoryUsageSize() != deviceParameter.getMemoryUsageSize()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z4 || !getCpuType().equals(deviceParameter.getCpuType())) {
                z5 = false;
            }
            return z5;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.diskSize_ != 0) {
                codedOutputStream.writeInt64(1, this.diskSize_);
            }
            if (this.diskUsageSize_ != 0) {
                codedOutputStream.writeInt64(2, this.diskUsageSize_);
            }
            if (this.memorySize_ != 0) {
                codedOutputStream.writeInt64(3, this.memorySize_);
            }
            if (this.memoryUsageSize_ != 0) {
                codedOutputStream.writeInt64(4, this.memoryUsageSize_);
            }
            if (!getCpuTypeBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.cpuType_);
            }
        }

        public static DeviceParameter parseFrom(InputStream inputStream) throws IOException {
            return (DeviceParameter) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DeviceParameter parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DeviceParameter) PARSER.parseFrom(bArr);
        }

        public static DeviceParameter parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceParameter) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceParameter parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeviceParameter) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private DeviceParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.diskSize_ = codedInputStream.readInt64();
                        } else if (readTag == 16) {
                            this.diskUsageSize_ = codedInputStream.readInt64();
                        } else if (readTag == 24) {
                            this.memorySize_ = codedInputStream.readInt64();
                        } else if (readTag == 32) {
                            this.memoryUsageSize_ = codedInputStream.readInt64();
                        } else if (readTag == 42) {
                            this.cpuType_ = codedInputStream.readStringRequireUtf8();
                        } else if (!codedInputStream.skipField(readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            makeExtensionsImmutable();
        }

        public static DeviceParameter parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceParameter) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static DeviceParameter parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceParameter) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceParameter parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeviceParameter) PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface DeviceParameterOrBuilder extends MessageOrBuilder {
        String getCpuType();

        ByteString getCpuTypeBytes();

        long getDiskSize();

        long getDiskUsageSize();

        long getMemorySize();

        long getMemoryUsageSize();
    }

    public static final class Gyro extends GeneratedMessageV3 implements GyroOrBuilder {
        private static final Gyro DEFAULT_INSTANCE = new Gyro();
        public static final Parser<Gyro> PARSER = new AbstractParser<Gyro>() {
            public final Gyro parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Gyro(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        public float x_;
        public float y_;
        public float z_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GyroOrBuilder {
            private float x_;
            private float y_;
            private float z_;

            private void maybeForceBuilderInitialization() {
            }

            public final boolean isInitialized() {
                return true;
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DeviceInfo.m;
            }

            public final Descriptors.Descriptor getDescriptorForType() {
                return DeviceInfo.m;
            }

            public final float getX() {
                return this.x_;
            }

            public final float getY() {
                return this.y_;
            }

            public final float getZ() {
                return this.z_;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public final Builder clearX() {
                this.x_ = 0.0f;
                onChanged();
                return this;
            }

            public final Builder clearY() {
                this.y_ = 0.0f;
                onChanged();
                return this;
            }

            public final Builder clearZ() {
                this.z_ = 0.0f;
                onChanged();
                return this;
            }

            public final Builder clone() {
                return (Builder) super.clone();
            }

            public final Gyro getDefaultInstanceForType() {
                return Gyro.getDefaultInstance();
            }

            public final Gyro build() {
                Gyro buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final Builder clear() {
                super.clear();
                this.x_ = 0.0f;
                this.y_ = 0.0f;
                this.z_ = 0.0f;
                return this;
            }

            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DeviceInfo.n.ensureFieldAccessorsInitialized(Gyro.class, Builder.class);
            }

            public final Gyro buildPartial() {
                Gyro gyro = new Gyro((GeneratedMessageV3.Builder) this);
                gyro.x_ = this.x_;
                gyro.y_ = this.y_;
                gyro.z_ = this.z_;
                onBuilt();
                return gyro;
            }

            public final Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public final Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public final Builder setX(float f2) {
                this.x_ = f2;
                onChanged();
                return this;
            }

            public final Builder setY(float f2) {
                this.y_ = f2;
                onChanged();
                return this;
            }

            public final Builder setZ(float f2) {
                this.z_ = f2;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof Gyro) {
                    return mergeFrom((Gyro) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder mergeFrom(Gyro gyro) {
                if (gyro == Gyro.getDefaultInstance()) {
                    return this;
                }
                if (gyro.getX() != 0.0f) {
                    setX(gyro.getX());
                }
                if (gyro.getY() != 0.0f) {
                    setY(gyro.getY());
                }
                if (gyro.getZ() != 0.0f) {
                    setZ(gyro.getZ());
                }
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
            public final com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.Gyro.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$Gyro> r1 = com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.Gyro.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$Gyro r3 = (com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.Gyro) r3     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    if (r3 == 0) goto L_0x000e
                    r2.mergeFrom((com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.Gyro) r3)
                L_0x000e:
                    return r2
                L_0x000f:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0011:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x000f }
                    com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$Gyro r4 = (com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.Gyro) r4     // Catch:{ all -> 0x000f }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.Gyro) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.Gyro.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$Gyro$Builder");
            }

            public final Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }
        }

        public static Gyro getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeviceInfo.m;
        }

        public static Parser<Gyro> parser() {
            return PARSER;
        }

        public final Gyro getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public final Parser<Gyro> getParserForType() {
            return PARSER;
        }

        public final float getX() {
            return this.x_;
        }

        public final float getY() {
            return this.y_;
        }

        public final float getZ() {
            return this.z_;
        }

        private Gyro() {
            this.memoizedIsInitialized = -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeviceInfo.n.ensureFieldAccessorsInitialized(Gyro.class, Builder.class);
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
            if (this.x_ != 0.0f) {
                i2 = 0 + CodedOutputStream.computeFloatSize(1, this.x_);
            }
            if (this.y_ != 0.0f) {
                i2 += CodedOutputStream.computeFloatSize(2, this.y_);
            }
            if (this.z_ != 0.0f) {
                i2 += CodedOutputStream.computeFloatSize(3, this.z_);
            }
            this.memoizedSize = i2;
            return i2;
        }

        public final int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((getDescriptorForType().hashCode() + 779) * 37) + 1) * 53) + Float.floatToIntBits(getX())) * 37) + 2) * 53) + Float.floatToIntBits(getY())) * 37) + 3) * 53) + Float.floatToIntBits(getZ())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        private Gyro(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        public static Builder newBuilder(Gyro gyro) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(gyro);
        }

        public static Gyro parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Gyro) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Gyro parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Gyro) PARSER.parseFrom(byteString);
        }

        /* access modifiers changed from: protected */
        public final Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Gyro parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Gyro) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.x_ != 0.0f) {
                codedOutputStream.writeFloat(1, this.x_);
            }
            if (this.y_ != 0.0f) {
                codedOutputStream.writeFloat(2, this.y_);
            }
            if (this.z_ != 0.0f) {
                codedOutputStream.writeFloat(3, this.z_);
            }
        }

        public final boolean equals(Object obj) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Gyro)) {
                return super.equals(obj);
            }
            Gyro gyro = (Gyro) obj;
            if (Float.floatToIntBits(getX()) == Float.floatToIntBits(gyro.getX())) {
                z = true;
            } else {
                z = false;
            }
            if (!z || Float.floatToIntBits(getY()) != Float.floatToIntBits(gyro.getY())) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2 || Float.floatToIntBits(getZ()) != Float.floatToIntBits(gyro.getZ())) {
                z3 = false;
            }
            return z3;
        }

        public static Gyro parseFrom(InputStream inputStream) throws IOException {
            return (Gyro) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Gyro parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Gyro) PARSER.parseFrom(bArr);
        }

        public static Gyro parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Gyro) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Gyro parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Gyro) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private Gyro(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 13) {
                            this.x_ = codedInputStream.readFloat();
                        } else if (readTag == 21) {
                            this.y_ = codedInputStream.readFloat();
                        } else if (readTag == 29) {
                            this.z_ = codedInputStream.readFloat();
                        } else if (!codedInputStream.skipField(readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            makeExtensionsImmutable();
        }

        public static Gyro parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Gyro) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static Gyro parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Gyro) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Gyro parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Gyro) PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface GyroOrBuilder extends MessageOrBuilder {
        float getX();

        float getY();

        float getZ();
    }

    public static final class InstallApp extends GeneratedMessageV3 implements InstallAppOrBuilder {
        private static final InstallApp DEFAULT_INSTANCE = new InstallApp();
        public static final Parser<InstallApp> PARSER = new AbstractParser<InstallApp>() {
            public final InstallApp parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new InstallApp(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        public long firstInstallTime_;
        public long lastUpdateTime_;
        private byte memoizedIsInitialized;
        public volatile Object packageName_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InstallAppOrBuilder {
            private long firstInstallTime_;
            private long lastUpdateTime_;
            private Object packageName_;

            private void maybeForceBuilderInitialization() {
            }

            public final boolean isInitialized() {
                return true;
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DeviceInfo.g;
            }

            public final Descriptors.Descriptor getDescriptorForType() {
                return DeviceInfo.g;
            }

            public final long getFirstInstallTime() {
                return this.firstInstallTime_;
            }

            public final long getLastUpdateTime() {
                return this.lastUpdateTime_;
            }

            public final Builder clearFirstInstallTime() {
                this.firstInstallTime_ = 0;
                onChanged();
                return this;
            }

            public final Builder clearLastUpdateTime() {
                this.lastUpdateTime_ = 0;
                onChanged();
                return this;
            }

            public final Builder clone() {
                return (Builder) super.clone();
            }

            public final InstallApp getDefaultInstanceForType() {
                return InstallApp.getDefaultInstance();
            }

            private Builder() {
                this.packageName_ = "";
                maybeForceBuilderInitialization();
            }

            public final InstallApp build() {
                InstallApp buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final Builder clear() {
                super.clear();
                this.packageName_ = "";
                this.firstInstallTime_ = 0;
                this.lastUpdateTime_ = 0;
                return this;
            }

            public final Builder clearPackageName() {
                this.packageName_ = InstallApp.getDefaultInstance().getPackageName();
                onChanged();
                return this;
            }

            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DeviceInfo.h.ensureFieldAccessorsInitialized(InstallApp.class, Builder.class);
            }

            public final InstallApp buildPartial() {
                InstallApp installApp = new InstallApp((GeneratedMessageV3.Builder) this);
                installApp.packageName_ = this.packageName_;
                installApp.firstInstallTime_ = this.firstInstallTime_;
                installApp.lastUpdateTime_ = this.lastUpdateTime_;
                onBuilt();
                return installApp;
            }

            public final String getPackageName() {
                Object obj = this.packageName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.packageName_ = stringUtf8;
                return stringUtf8;
            }

            public final ByteString getPackageNameBytes() {
                Object obj = this.packageName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.packageName_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public final Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public final Builder setFirstInstallTime(long j) {
                this.firstInstallTime_ = j;
                onChanged();
                return this;
            }

            public final Builder setLastUpdateTime(long j) {
                this.lastUpdateTime_ = j;
                onChanged();
                return this;
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof InstallApp) {
                    return mergeFrom((InstallApp) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder setPackageName(String str) {
                if (str != null) {
                    this.packageName_ = str;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.packageName_ = "";
                maybeForceBuilderInitialization();
            }

            public final Builder setPackageNameBytes(ByteString byteString) {
                if (byteString != null) {
                    InstallApp.checkByteStringIsUtf8(byteString);
                    this.packageName_ = byteString;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            public final Builder mergeFrom(InstallApp installApp) {
                if (installApp == InstallApp.getDefaultInstance()) {
                    return this;
                }
                if (!installApp.getPackageName().isEmpty()) {
                    this.packageName_ = installApp.packageName_;
                    onChanged();
                }
                if (installApp.getFirstInstallTime() != 0) {
                    setFirstInstallTime(installApp.getFirstInstallTime());
                }
                if (installApp.getLastUpdateTime() != 0) {
                    setLastUpdateTime(installApp.getLastUpdateTime());
                }
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
            public final com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.InstallApp.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$InstallApp> r1 = com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.InstallApp.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$InstallApp r3 = (com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.InstallApp) r3     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    if (r3 == 0) goto L_0x000e
                    r2.mergeFrom((com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.InstallApp) r3)
                L_0x000e:
                    return r2
                L_0x000f:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0011:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x000f }
                    com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$InstallApp r4 = (com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.InstallApp) r4     // Catch:{ all -> 0x000f }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.InstallApp) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.InstallApp.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$InstallApp$Builder");
            }

            public final Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }
        }

        public static InstallApp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeviceInfo.g;
        }

        public static Parser<InstallApp> parser() {
            return PARSER;
        }

        public final InstallApp getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public final long getFirstInstallTime() {
            return this.firstInstallTime_;
        }

        public final long getLastUpdateTime() {
            return this.lastUpdateTime_;
        }

        public final Parser<InstallApp> getParserForType() {
            return PARSER;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        private InstallApp() {
            this.memoizedIsInitialized = -1;
            this.packageName_ = "";
        }

        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeviceInfo.h.ensureFieldAccessorsInitialized(InstallApp.class, Builder.class);
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

        public final String getPackageName() {
            Object obj = this.packageName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.packageName_ = stringUtf8;
            return stringUtf8;
        }

        public final ByteString getPackageNameBytes() {
            Object obj = this.packageName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.packageName_ = copyFromUtf8;
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
            if (!getPackageNameBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.packageName_);
            }
            if (this.firstInstallTime_ != 0) {
                i2 += CodedOutputStream.computeInt64Size(2, this.firstInstallTime_);
            }
            if (this.lastUpdateTime_ != 0) {
                i2 += CodedOutputStream.computeInt64Size(3, this.lastUpdateTime_);
            }
            this.memoizedSize = i2;
            return i2;
        }

        public final int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((getDescriptorForType().hashCode() + 779) * 37) + 1) * 53) + getPackageName().hashCode()) * 37) + 2) * 53) + Internal.hashLong(getFirstInstallTime())) * 37) + 3) * 53) + Internal.hashLong(getLastUpdateTime())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        private InstallApp(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        public static Builder newBuilder(InstallApp installApp) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(installApp);
        }

        public static InstallApp parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (InstallApp) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static InstallApp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (InstallApp) PARSER.parseFrom(byteString);
        }

        /* access modifiers changed from: protected */
        public final Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static InstallApp parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (InstallApp) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public final boolean equals(Object obj) {
            boolean z;
            boolean z2 = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InstallApp)) {
                return super.equals(obj);
            }
            InstallApp installApp = (InstallApp) obj;
            if (!getPackageName().equals(installApp.getPackageName()) || getFirstInstallTime() != installApp.getFirstInstallTime()) {
                z = false;
            } else {
                z = true;
            }
            if (!z || getLastUpdateTime() != installApp.getLastUpdateTime()) {
                z2 = false;
            }
            return z2;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getPackageNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.packageName_);
            }
            if (this.firstInstallTime_ != 0) {
                codedOutputStream.writeInt64(2, this.firstInstallTime_);
            }
            if (this.lastUpdateTime_ != 0) {
                codedOutputStream.writeInt64(3, this.lastUpdateTime_);
            }
        }

        public static InstallApp parseFrom(InputStream inputStream) throws IOException {
            return (InstallApp) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static InstallApp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (InstallApp) PARSER.parseFrom(bArr);
        }

        public static InstallApp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InstallApp) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InstallApp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InstallApp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private InstallApp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            this.packageName_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 16) {
                            this.firstInstallTime_ = codedInputStream.readInt64();
                        } else if (readTag == 24) {
                            this.lastUpdateTime_ = codedInputStream.readInt64();
                        } else if (!codedInputStream.skipField(readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            makeExtensionsImmutable();
        }

        public static InstallApp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InstallApp) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static InstallApp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InstallApp) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InstallApp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InstallApp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface InstallAppOrBuilder extends MessageOrBuilder {
        long getFirstInstallTime();

        long getLastUpdateTime();

        String getPackageName();

        ByteString getPackageNameBytes();
    }

    public static final class RestartUploadInfo extends GeneratedMessageV3 implements RestartUploadInfoOrBuilder {
        private static final RestartUploadInfo DEFAULT_INSTANCE = new RestartUploadInfo();
        public static final Parser<RestartUploadInfo> PARSER = new AbstractParser<RestartUploadInfo>() {
            public final RestartUploadInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new RestartUploadInfo(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        public List<InstallApp> appList_;
        public int bitField0_;
        public List<BluetoothInfo> bondedBtList_;
        public BluetoothInfo localBtInfo_;
        private byte memoizedIsInitialized;
        public List<SimSerial> simSerial_;
        public List<SystemAccount> systemAccounts_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RestartUploadInfoOrBuilder {
            private RepeatedFieldBuilderV3<InstallApp, InstallApp.Builder, InstallAppOrBuilder> appListBuilder_;
            private List<InstallApp> appList_;
            private int bitField0_;
            private RepeatedFieldBuilderV3<BluetoothInfo, BluetoothInfo.Builder, BluetoothInfoOrBuilder> bondedBtListBuilder_;
            private List<BluetoothInfo> bondedBtList_;
            private SingleFieldBuilderV3<BluetoothInfo, BluetoothInfo.Builder, BluetoothInfoOrBuilder> localBtInfoBuilder_;
            private BluetoothInfo localBtInfo_;
            private RepeatedFieldBuilderV3<SimSerial, SimSerial.Builder, SimSerialOrBuilder> simSerialBuilder_;
            private List<SimSerial> simSerial_;
            private RepeatedFieldBuilderV3<SystemAccount, SystemAccount.Builder, SystemAccountOrBuilder> systemAccountsBuilder_;
            private List<SystemAccount> systemAccounts_;

            public final boolean isInitialized() {
                return true;
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DeviceInfo.i;
            }

            public final Descriptors.Descriptor getDescriptorForType() {
                return DeviceInfo.i;
            }

            public final Builder clone() {
                return (Builder) super.clone();
            }

            public final RestartUploadInfo getDefaultInstanceForType() {
                return RestartUploadInfo.getDefaultInstance();
            }

            public final InstallApp.Builder addAppListBuilder() {
                return (InstallApp.Builder) getAppListFieldBuilder().addBuilder(InstallApp.getDefaultInstance());
            }

            public final BluetoothInfo.Builder addBondedBtListBuilder() {
                return (BluetoothInfo.Builder) getBondedBtListFieldBuilder().addBuilder(BluetoothInfo.getDefaultInstance());
            }

            public final SimSerial.Builder addSimSerialBuilder() {
                return (SimSerial.Builder) getSimSerialFieldBuilder().addBuilder(SimSerial.getDefaultInstance());
            }

            public final SystemAccount.Builder addSystemAccountsBuilder() {
                return (SystemAccount.Builder) getSystemAccountsFieldBuilder().addBuilder(SystemAccount.getDefaultInstance());
            }

            public final RestartUploadInfo build() {
                RestartUploadInfo buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final Builder clearLocalBtInfo() {
                if (this.localBtInfoBuilder_ == null) {
                    this.localBtInfo_ = null;
                    onChanged();
                } else {
                    this.localBtInfo_ = null;
                    this.localBtInfoBuilder_ = null;
                }
                return this;
            }

            public final List<InstallApp.Builder> getAppListBuilderList() {
                return getAppListFieldBuilder().getBuilderList();
            }

            public final List<BluetoothInfo.Builder> getBondedBtListBuilderList() {
                return getBondedBtListFieldBuilder().getBuilderList();
            }

            public final BluetoothInfo.Builder getLocalBtInfoBuilder() {
                onChanged();
                return (BluetoothInfo.Builder) getLocalBtInfoFieldBuilder().getBuilder();
            }

            public final List<SimSerial.Builder> getSimSerialBuilderList() {
                return getSimSerialFieldBuilder().getBuilderList();
            }

            public final List<SystemAccount.Builder> getSystemAccountsBuilderList() {
                return getSystemAccountsFieldBuilder().getBuilderList();
            }

            public final boolean hasLocalBtInfo() {
                if (this.localBtInfoBuilder_ == null && this.localBtInfo_ == null) {
                    return false;
                }
                return true;
            }

            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DeviceInfo.j.ensureFieldAccessorsInitialized(RestartUploadInfo.class, Builder.class);
            }

            private void ensureAppListIsMutable() {
                if ((this.bitField0_ & 16) != 16) {
                    this.appList_ = new ArrayList(this.appList_);
                    this.bitField0_ |= 16;
                }
            }

            private void ensureBondedBtListIsMutable() {
                if ((this.bitField0_ & 8) != 8) {
                    this.bondedBtList_ = new ArrayList(this.bondedBtList_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensureSimSerialIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.simSerial_ = new ArrayList(this.simSerial_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureSystemAccountsIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.systemAccounts_ = new ArrayList(this.systemAccounts_);
                    this.bitField0_ |= 2;
                }
            }

            private SingleFieldBuilderV3<BluetoothInfo, BluetoothInfo.Builder, BluetoothInfoOrBuilder> getLocalBtInfoFieldBuilder() {
                if (this.localBtInfoBuilder_ == null) {
                    this.localBtInfoBuilder_ = new SingleFieldBuilderV3<>(getLocalBtInfo(), getParentForChildren(), isClean());
                    this.localBtInfo_ = null;
                }
                return this.localBtInfoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (RestartUploadInfo.alwaysUseFieldBuilders) {
                    getSimSerialFieldBuilder();
                    getSystemAccountsFieldBuilder();
                    getBondedBtListFieldBuilder();
                    getAppListFieldBuilder();
                }
            }

            public final Builder clearAppList() {
                if (this.appListBuilder_ == null) {
                    this.appList_ = Collections.emptyList();
                    this.bitField0_ &= -17;
                    onChanged();
                } else {
                    this.appListBuilder_.clear();
                }
                return this;
            }

            public final Builder clearBondedBtList() {
                if (this.bondedBtListBuilder_ == null) {
                    this.bondedBtList_ = Collections.emptyList();
                    this.bitField0_ &= -9;
                    onChanged();
                } else {
                    this.bondedBtListBuilder_.clear();
                }
                return this;
            }

            public final Builder clearSimSerial() {
                if (this.simSerialBuilder_ == null) {
                    this.simSerial_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    this.simSerialBuilder_.clear();
                }
                return this;
            }

            public final Builder clearSystemAccounts() {
                if (this.systemAccountsBuilder_ == null) {
                    this.systemAccounts_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    this.systemAccountsBuilder_.clear();
                }
                return this;
            }

            public final int getAppListCount() {
                if (this.appListBuilder_ == null) {
                    return this.appList_.size();
                }
                return this.appListBuilder_.getCount();
            }

            public final List<InstallApp> getAppListList() {
                if (this.appListBuilder_ == null) {
                    return Collections.unmodifiableList(this.appList_);
                }
                return this.appListBuilder_.getMessageList();
            }

            public final List<? extends InstallAppOrBuilder> getAppListOrBuilderList() {
                if (this.appListBuilder_ != null) {
                    return this.appListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.appList_);
            }

            public final int getBondedBtListCount() {
                if (this.bondedBtListBuilder_ == null) {
                    return this.bondedBtList_.size();
                }
                return this.bondedBtListBuilder_.getCount();
            }

            public final List<BluetoothInfo> getBondedBtListList() {
                if (this.bondedBtListBuilder_ == null) {
                    return Collections.unmodifiableList(this.bondedBtList_);
                }
                return this.bondedBtListBuilder_.getMessageList();
            }

            public final List<? extends BluetoothInfoOrBuilder> getBondedBtListOrBuilderList() {
                if (this.bondedBtListBuilder_ != null) {
                    return this.bondedBtListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.bondedBtList_);
            }

            public final BluetoothInfo getLocalBtInfo() {
                if (this.localBtInfoBuilder_ != null) {
                    return (BluetoothInfo) this.localBtInfoBuilder_.getMessage();
                }
                if (this.localBtInfo_ == null) {
                    return BluetoothInfo.getDefaultInstance();
                }
                return this.localBtInfo_;
            }

            public final BluetoothInfoOrBuilder getLocalBtInfoOrBuilder() {
                if (this.localBtInfoBuilder_ != null) {
                    return (BluetoothInfoOrBuilder) this.localBtInfoBuilder_.getMessageOrBuilder();
                }
                if (this.localBtInfo_ == null) {
                    return BluetoothInfo.getDefaultInstance();
                }
                return this.localBtInfo_;
            }

            public final int getSimSerialCount() {
                if (this.simSerialBuilder_ == null) {
                    return this.simSerial_.size();
                }
                return this.simSerialBuilder_.getCount();
            }

            public final List<SimSerial> getSimSerialList() {
                if (this.simSerialBuilder_ == null) {
                    return Collections.unmodifiableList(this.simSerial_);
                }
                return this.simSerialBuilder_.getMessageList();
            }

            public final List<? extends SimSerialOrBuilder> getSimSerialOrBuilderList() {
                if (this.simSerialBuilder_ != null) {
                    return this.simSerialBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.simSerial_);
            }

            public final int getSystemAccountsCount() {
                if (this.systemAccountsBuilder_ == null) {
                    return this.systemAccounts_.size();
                }
                return this.systemAccountsBuilder_.getCount();
            }

            public final List<SystemAccount> getSystemAccountsList() {
                if (this.systemAccountsBuilder_ == null) {
                    return Collections.unmodifiableList(this.systemAccounts_);
                }
                return this.systemAccountsBuilder_.getMessageList();
            }

            public final List<? extends SystemAccountOrBuilder> getSystemAccountsOrBuilderList() {
                if (this.systemAccountsBuilder_ != null) {
                    return this.systemAccountsBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.systemAccounts_);
            }

            private Builder() {
                this.simSerial_ = Collections.emptyList();
                this.systemAccounts_ = Collections.emptyList();
                this.localBtInfo_ = null;
                this.bondedBtList_ = Collections.emptyList();
                this.appList_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private RepeatedFieldBuilderV3<InstallApp, InstallApp.Builder, InstallAppOrBuilder> getAppListFieldBuilder() {
                boolean z;
                if (this.appListBuilder_ == null) {
                    List<InstallApp> list = this.appList_;
                    if ((this.bitField0_ & 16) == 16) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.appListBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.appList_ = null;
                }
                return this.appListBuilder_;
            }

            private RepeatedFieldBuilderV3<BluetoothInfo, BluetoothInfo.Builder, BluetoothInfoOrBuilder> getBondedBtListFieldBuilder() {
                boolean z;
                if (this.bondedBtListBuilder_ == null) {
                    List<BluetoothInfo> list = this.bondedBtList_;
                    if ((this.bitField0_ & 8) == 8) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.bondedBtListBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.bondedBtList_ = null;
                }
                return this.bondedBtListBuilder_;
            }

            private RepeatedFieldBuilderV3<SimSerial, SimSerial.Builder, SimSerialOrBuilder> getSimSerialFieldBuilder() {
                if (this.simSerialBuilder_ == null) {
                    List<SimSerial> list = this.simSerial_;
                    boolean z = true;
                    if ((this.bitField0_ & 1) != 1) {
                        z = false;
                    }
                    this.simSerialBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.simSerial_ = null;
                }
                return this.simSerialBuilder_;
            }

            private RepeatedFieldBuilderV3<SystemAccount, SystemAccount.Builder, SystemAccountOrBuilder> getSystemAccountsFieldBuilder() {
                boolean z;
                if (this.systemAccountsBuilder_ == null) {
                    List<SystemAccount> list = this.systemAccounts_;
                    if ((this.bitField0_ & 2) == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.systemAccountsBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.systemAccounts_ = null;
                }
                return this.systemAccountsBuilder_;
            }

            public final Builder clear() {
                super.clear();
                if (this.simSerialBuilder_ == null) {
                    this.simSerial_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    this.simSerialBuilder_.clear();
                }
                if (this.systemAccountsBuilder_ == null) {
                    this.systemAccounts_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    this.systemAccountsBuilder_.clear();
                }
                if (this.localBtInfoBuilder_ == null) {
                    this.localBtInfo_ = null;
                } else {
                    this.localBtInfo_ = null;
                    this.localBtInfoBuilder_ = null;
                }
                if (this.bondedBtListBuilder_ == null) {
                    this.bondedBtList_ = Collections.emptyList();
                    this.bitField0_ &= -9;
                } else {
                    this.bondedBtListBuilder_.clear();
                }
                if (this.appListBuilder_ == null) {
                    this.appList_ = Collections.emptyList();
                    this.bitField0_ &= -17;
                } else {
                    this.appListBuilder_.clear();
                }
                return this;
            }

            public final RestartUploadInfo buildPartial() {
                RestartUploadInfo restartUploadInfo = new RestartUploadInfo((GeneratedMessageV3.Builder) this);
                if (this.simSerialBuilder_ == null) {
                    if ((this.bitField0_ & 1) == 1) {
                        this.simSerial_ = Collections.unmodifiableList(this.simSerial_);
                        this.bitField0_ &= -2;
                    }
                    restartUploadInfo.simSerial_ = this.simSerial_;
                } else {
                    restartUploadInfo.simSerial_ = this.simSerialBuilder_.build();
                }
                if (this.systemAccountsBuilder_ == null) {
                    if ((this.bitField0_ & 2) == 2) {
                        this.systemAccounts_ = Collections.unmodifiableList(this.systemAccounts_);
                        this.bitField0_ &= -3;
                    }
                    restartUploadInfo.systemAccounts_ = this.systemAccounts_;
                } else {
                    restartUploadInfo.systemAccounts_ = this.systemAccountsBuilder_.build();
                }
                if (this.localBtInfoBuilder_ == null) {
                    restartUploadInfo.localBtInfo_ = this.localBtInfo_;
                } else {
                    restartUploadInfo.localBtInfo_ = (BluetoothInfo) this.localBtInfoBuilder_.build();
                }
                if (this.bondedBtListBuilder_ == null) {
                    if ((this.bitField0_ & 8) == 8) {
                        this.bondedBtList_ = Collections.unmodifiableList(this.bondedBtList_);
                        this.bitField0_ &= -9;
                    }
                    restartUploadInfo.bondedBtList_ = this.bondedBtList_;
                } else {
                    restartUploadInfo.bondedBtList_ = this.bondedBtListBuilder_.build();
                }
                if (this.appListBuilder_ == null) {
                    if ((this.bitField0_ & 16) == 16) {
                        this.appList_ = Collections.unmodifiableList(this.appList_);
                        this.bitField0_ &= -17;
                    }
                    restartUploadInfo.appList_ = this.appList_;
                } else {
                    restartUploadInfo.appList_ = this.appListBuilder_.build();
                }
                restartUploadInfo.bitField0_ = 0;
                onBuilt();
                return restartUploadInfo;
            }

            public final Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public final Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public final InstallApp.Builder getAppListBuilder(int i) {
                return (InstallApp.Builder) getAppListFieldBuilder().getBuilder(i);
            }

            public final BluetoothInfo.Builder getBondedBtListBuilder(int i) {
                return (BluetoothInfo.Builder) getBondedBtListFieldBuilder().getBuilder(i);
            }

            public final SimSerial.Builder getSimSerialBuilder(int i) {
                return (SimSerial.Builder) getSimSerialFieldBuilder().getBuilder(i);
            }

            public final SystemAccount.Builder getSystemAccountsBuilder(int i) {
                return (SystemAccount.Builder) getSystemAccountsFieldBuilder().getBuilder(i);
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof RestartUploadInfo) {
                    return mergeFrom((RestartUploadInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder addAllAppList(Iterable<? extends InstallApp> iterable) {
                if (this.appListBuilder_ == null) {
                    ensureAppListIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.appList_);
                    onChanged();
                } else {
                    this.appListBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final Builder addAllBondedBtList(Iterable<? extends BluetoothInfo> iterable) {
                if (this.bondedBtListBuilder_ == null) {
                    ensureBondedBtListIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.bondedBtList_);
                    onChanged();
                } else {
                    this.bondedBtListBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final Builder addAllSimSerial(Iterable<? extends SimSerial> iterable) {
                if (this.simSerialBuilder_ == null) {
                    ensureSimSerialIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.simSerial_);
                    onChanged();
                } else {
                    this.simSerialBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final Builder addAllSystemAccounts(Iterable<? extends SystemAccount> iterable) {
                if (this.systemAccountsBuilder_ == null) {
                    ensureSystemAccountsIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.systemAccounts_);
                    onChanged();
                } else {
                    this.systemAccountsBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public final InstallApp.Builder addAppListBuilder(int i) {
                return (InstallApp.Builder) getAppListFieldBuilder().addBuilder(i, InstallApp.getDefaultInstance());
            }

            public final BluetoothInfo.Builder addBondedBtListBuilder(int i) {
                return (BluetoothInfo.Builder) getBondedBtListFieldBuilder().addBuilder(i, BluetoothInfo.getDefaultInstance());
            }

            public final SimSerial.Builder addSimSerialBuilder(int i) {
                return (SimSerial.Builder) getSimSerialFieldBuilder().addBuilder(i, SimSerial.getDefaultInstance());
            }

            public final SystemAccount.Builder addSystemAccountsBuilder(int i) {
                return (SystemAccount.Builder) getSystemAccountsFieldBuilder().addBuilder(i, SystemAccount.getDefaultInstance());
            }

            public final InstallApp getAppList(int i) {
                if (this.appListBuilder_ == null) {
                    return this.appList_.get(i);
                }
                return (InstallApp) this.appListBuilder_.getMessage(i);
            }

            public final InstallAppOrBuilder getAppListOrBuilder(int i) {
                if (this.appListBuilder_ == null) {
                    return this.appList_.get(i);
                }
                return (InstallAppOrBuilder) this.appListBuilder_.getMessageOrBuilder(i);
            }

            public final BluetoothInfo getBondedBtList(int i) {
                if (this.bondedBtListBuilder_ == null) {
                    return this.bondedBtList_.get(i);
                }
                return (BluetoothInfo) this.bondedBtListBuilder_.getMessage(i);
            }

            public final BluetoothInfoOrBuilder getBondedBtListOrBuilder(int i) {
                if (this.bondedBtListBuilder_ == null) {
                    return this.bondedBtList_.get(i);
                }
                return (BluetoothInfoOrBuilder) this.bondedBtListBuilder_.getMessageOrBuilder(i);
            }

            public final SimSerial getSimSerial(int i) {
                if (this.simSerialBuilder_ == null) {
                    return this.simSerial_.get(i);
                }
                return (SimSerial) this.simSerialBuilder_.getMessage(i);
            }

            public final SimSerialOrBuilder getSimSerialOrBuilder(int i) {
                if (this.simSerialBuilder_ == null) {
                    return this.simSerial_.get(i);
                }
                return (SimSerialOrBuilder) this.simSerialBuilder_.getMessageOrBuilder(i);
            }

            public final SystemAccount getSystemAccounts(int i) {
                if (this.systemAccountsBuilder_ == null) {
                    return this.systemAccounts_.get(i);
                }
                return (SystemAccount) this.systemAccountsBuilder_.getMessage(i);
            }

            public final SystemAccountOrBuilder getSystemAccountsOrBuilder(int i) {
                if (this.systemAccountsBuilder_ == null) {
                    return this.systemAccounts_.get(i);
                }
                return (SystemAccountOrBuilder) this.systemAccountsBuilder_.getMessageOrBuilder(i);
            }

            public final Builder removeAppList(int i) {
                if (this.appListBuilder_ == null) {
                    ensureAppListIsMutable();
                    this.appList_.remove(i);
                    onChanged();
                } else {
                    this.appListBuilder_.remove(i);
                }
                return this;
            }

            public final Builder removeBondedBtList(int i) {
                if (this.bondedBtListBuilder_ == null) {
                    ensureBondedBtListIsMutable();
                    this.bondedBtList_.remove(i);
                    onChanged();
                } else {
                    this.bondedBtListBuilder_.remove(i);
                }
                return this;
            }

            public final Builder removeSimSerial(int i) {
                if (this.simSerialBuilder_ == null) {
                    ensureSimSerialIsMutable();
                    this.simSerial_.remove(i);
                    onChanged();
                } else {
                    this.simSerialBuilder_.remove(i);
                }
                return this;
            }

            public final Builder removeSystemAccounts(int i) {
                if (this.systemAccountsBuilder_ == null) {
                    ensureSystemAccountsIsMutable();
                    this.systemAccounts_.remove(i);
                    onChanged();
                } else {
                    this.systemAccountsBuilder_.remove(i);
                }
                return this;
            }

            public final Builder setLocalBtInfo(BluetoothInfo.Builder builder) {
                if (this.localBtInfoBuilder_ == null) {
                    this.localBtInfo_ = builder.build();
                    onChanged();
                } else {
                    this.localBtInfoBuilder_.setMessage(builder.build());
                }
                return this;
            }

            public final Builder mergeLocalBtInfo(BluetoothInfo bluetoothInfo) {
                if (this.localBtInfoBuilder_ == null) {
                    if (this.localBtInfo_ != null) {
                        this.localBtInfo_ = BluetoothInfo.newBuilder(this.localBtInfo_).mergeFrom(bluetoothInfo).buildPartial();
                    } else {
                        this.localBtInfo_ = bluetoothInfo;
                    }
                    onChanged();
                } else {
                    this.localBtInfoBuilder_.mergeFrom(bluetoothInfo);
                }
                return this;
            }

            public final Builder setLocalBtInfo(BluetoothInfo bluetoothInfo) {
                if (this.localBtInfoBuilder_ != null) {
                    this.localBtInfoBuilder_.setMessage(bluetoothInfo);
                } else if (bluetoothInfo != null) {
                    this.localBtInfo_ = bluetoothInfo;
                    onChanged();
                } else {
                    throw new NullPointerException();
                }
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.simSerial_ = Collections.emptyList();
                this.systemAccounts_ = Collections.emptyList();
                this.localBtInfo_ = null;
                this.bondedBtList_ = Collections.emptyList();
                this.appList_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public final Builder addAppList(InstallApp.Builder builder) {
                if (this.appListBuilder_ == null) {
                    ensureAppListIsMutable();
                    this.appList_.add(builder.build());
                    onChanged();
                } else {
                    this.appListBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addBondedBtList(BluetoothInfo.Builder builder) {
                if (this.bondedBtListBuilder_ == null) {
                    ensureBondedBtListIsMutable();
                    this.bondedBtList_.add(builder.build());
                    onChanged();
                } else {
                    this.bondedBtListBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addSimSerial(SimSerial.Builder builder) {
                if (this.simSerialBuilder_ == null) {
                    ensureSimSerialIsMutable();
                    this.simSerial_.add(builder.build());
                    onChanged();
                } else {
                    this.simSerialBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addSystemAccounts(SystemAccount.Builder builder) {
                if (this.systemAccountsBuilder_ == null) {
                    ensureSystemAccountsIsMutable();
                    this.systemAccounts_.add(builder.build());
                    onChanged();
                } else {
                    this.systemAccountsBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public final Builder addAppList(InstallApp installApp) {
                if (this.appListBuilder_ != null) {
                    this.appListBuilder_.addMessage(installApp);
                } else if (installApp != null) {
                    ensureAppListIsMutable();
                    this.appList_.add(installApp);
                    onChanged();
                } else {
                    throw new NullPointerException();
                }
                return this;
            }

            public final Builder addBondedBtList(BluetoothInfo bluetoothInfo) {
                if (this.bondedBtListBuilder_ != null) {
                    this.bondedBtListBuilder_.addMessage(bluetoothInfo);
                } else if (bluetoothInfo != null) {
                    ensureBondedBtListIsMutable();
                    this.bondedBtList_.add(bluetoothInfo);
                    onChanged();
                } else {
                    throw new NullPointerException();
                }
                return this;
            }

            public final Builder addSimSerial(SimSerial simSerial) {
                if (this.simSerialBuilder_ != null) {
                    this.simSerialBuilder_.addMessage(simSerial);
                } else if (simSerial != null) {
                    ensureSimSerialIsMutable();
                    this.simSerial_.add(simSerial);
                    onChanged();
                } else {
                    throw new NullPointerException();
                }
                return this;
            }

            public final Builder addSystemAccounts(SystemAccount systemAccount) {
                if (this.systemAccountsBuilder_ != null) {
                    this.systemAccountsBuilder_.addMessage(systemAccount);
                } else if (systemAccount != null) {
                    ensureSystemAccountsIsMutable();
                    this.systemAccounts_.add(systemAccount);
                    onChanged();
                } else {
                    throw new NullPointerException();
                }
                return this;
            }

            public final Builder mergeFrom(RestartUploadInfo restartUploadInfo) {
                RepeatedFieldBuilderV3<BluetoothInfo, BluetoothInfo.Builder, BluetoothInfoOrBuilder> repeatedFieldBuilderV3;
                RepeatedFieldBuilderV3<SystemAccount, SystemAccount.Builder, SystemAccountOrBuilder> repeatedFieldBuilderV32;
                RepeatedFieldBuilderV3<SimSerial, SimSerial.Builder, SimSerialOrBuilder> repeatedFieldBuilderV33;
                if (restartUploadInfo == RestartUploadInfo.getDefaultInstance()) {
                    return this;
                }
                RepeatedFieldBuilderV3<InstallApp, InstallApp.Builder, InstallAppOrBuilder> repeatedFieldBuilderV34 = null;
                if (this.simSerialBuilder_ == null) {
                    if (!restartUploadInfo.simSerial_.isEmpty()) {
                        if (this.simSerial_.isEmpty()) {
                            this.simSerial_ = restartUploadInfo.simSerial_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureSimSerialIsMutable();
                            this.simSerial_.addAll(restartUploadInfo.simSerial_);
                        }
                        onChanged();
                    }
                } else if (!restartUploadInfo.simSerial_.isEmpty()) {
                    if (this.simSerialBuilder_.isEmpty()) {
                        this.simSerialBuilder_.dispose();
                        this.simSerialBuilder_ = null;
                        this.simSerial_ = restartUploadInfo.simSerial_;
                        this.bitField0_ &= -2;
                        if (RestartUploadInfo.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV33 = getSimSerialFieldBuilder();
                        } else {
                            repeatedFieldBuilderV33 = null;
                        }
                        this.simSerialBuilder_ = repeatedFieldBuilderV33;
                    } else {
                        this.simSerialBuilder_.addAllMessages(restartUploadInfo.simSerial_);
                    }
                }
                if (this.systemAccountsBuilder_ == null) {
                    if (!restartUploadInfo.systemAccounts_.isEmpty()) {
                        if (this.systemAccounts_.isEmpty()) {
                            this.systemAccounts_ = restartUploadInfo.systemAccounts_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureSystemAccountsIsMutable();
                            this.systemAccounts_.addAll(restartUploadInfo.systemAccounts_);
                        }
                        onChanged();
                    }
                } else if (!restartUploadInfo.systemAccounts_.isEmpty()) {
                    if (this.systemAccountsBuilder_.isEmpty()) {
                        this.systemAccountsBuilder_.dispose();
                        this.systemAccountsBuilder_ = null;
                        this.systemAccounts_ = restartUploadInfo.systemAccounts_;
                        this.bitField0_ &= -3;
                        if (RestartUploadInfo.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV32 = getSystemAccountsFieldBuilder();
                        } else {
                            repeatedFieldBuilderV32 = null;
                        }
                        this.systemAccountsBuilder_ = repeatedFieldBuilderV32;
                    } else {
                        this.systemAccountsBuilder_.addAllMessages(restartUploadInfo.systemAccounts_);
                    }
                }
                if (restartUploadInfo.hasLocalBtInfo()) {
                    mergeLocalBtInfo(restartUploadInfo.getLocalBtInfo());
                }
                if (this.bondedBtListBuilder_ == null) {
                    if (!restartUploadInfo.bondedBtList_.isEmpty()) {
                        if (this.bondedBtList_.isEmpty()) {
                            this.bondedBtList_ = restartUploadInfo.bondedBtList_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureBondedBtListIsMutable();
                            this.bondedBtList_.addAll(restartUploadInfo.bondedBtList_);
                        }
                        onChanged();
                    }
                } else if (!restartUploadInfo.bondedBtList_.isEmpty()) {
                    if (this.bondedBtListBuilder_.isEmpty()) {
                        this.bondedBtListBuilder_.dispose();
                        this.bondedBtListBuilder_ = null;
                        this.bondedBtList_ = restartUploadInfo.bondedBtList_;
                        this.bitField0_ &= -9;
                        if (RestartUploadInfo.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getBondedBtListFieldBuilder();
                        } else {
                            repeatedFieldBuilderV3 = null;
                        }
                        this.bondedBtListBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.bondedBtListBuilder_.addAllMessages(restartUploadInfo.bondedBtList_);
                    }
                }
                if (this.appListBuilder_ == null) {
                    if (!restartUploadInfo.appList_.isEmpty()) {
                        if (this.appList_.isEmpty()) {
                            this.appList_ = restartUploadInfo.appList_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureAppListIsMutable();
                            this.appList_.addAll(restartUploadInfo.appList_);
                        }
                        onChanged();
                    }
                } else if (!restartUploadInfo.appList_.isEmpty()) {
                    if (this.appListBuilder_.isEmpty()) {
                        this.appListBuilder_.dispose();
                        this.appListBuilder_ = null;
                        this.appList_ = restartUploadInfo.appList_;
                        this.bitField0_ &= -17;
                        if (RestartUploadInfo.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV34 = getAppListFieldBuilder();
                        }
                        this.appListBuilder_ = repeatedFieldBuilderV34;
                    } else {
                        this.appListBuilder_.addAllMessages(restartUploadInfo.appList_);
                    }
                }
                onChanged();
                return this;
            }

            public final Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public final Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public final Builder addAppList(int i, InstallApp.Builder builder) {
                if (this.appListBuilder_ == null) {
                    ensureAppListIsMutable();
                    this.appList_.add(i, builder.build());
                    onChanged();
                } else {
                    this.appListBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addBondedBtList(int i, BluetoothInfo.Builder builder) {
                if (this.bondedBtListBuilder_ == null) {
                    ensureBondedBtListIsMutable();
                    this.bondedBtList_.add(i, builder.build());
                    onChanged();
                } else {
                    this.bondedBtListBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addSimSerial(int i, SimSerial.Builder builder) {
                if (this.simSerialBuilder_ == null) {
                    ensureSimSerialIsMutable();
                    this.simSerial_.add(i, builder.build());
                    onChanged();
                } else {
                    this.simSerialBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addSystemAccounts(int i, SystemAccount.Builder builder) {
                if (this.systemAccountsBuilder_ == null) {
                    ensureSystemAccountsIsMutable();
                    this.systemAccounts_.add(i, builder.build());
                    onChanged();
                } else {
                    this.systemAccountsBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public final Builder setAppList(int i, InstallApp.Builder builder) {
                if (this.appListBuilder_ == null) {
                    ensureAppListIsMutable();
                    this.appList_.set(i, builder.build());
                    onChanged();
                } else {
                    this.appListBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder setBondedBtList(int i, BluetoothInfo.Builder builder) {
                if (this.bondedBtListBuilder_ == null) {
                    ensureBondedBtListIsMutable();
                    this.bondedBtList_.set(i, builder.build());
                    onChanged();
                } else {
                    this.bondedBtListBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder setSimSerial(int i, SimSerial.Builder builder) {
                if (this.simSerialBuilder_ == null) {
                    ensureSimSerialIsMutable();
                    this.simSerial_.set(i, builder.build());
                    onChanged();
                } else {
                    this.simSerialBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder setSystemAccounts(int i, SystemAccount.Builder builder) {
                if (this.systemAccountsBuilder_ == null) {
                    ensureSystemAccountsIsMutable();
                    this.systemAccounts_.set(i, builder.build());
                    onChanged();
                } else {
                    this.systemAccountsBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public final Builder addAppList(int i, InstallApp installApp) {
                if (this.appListBuilder_ != null) {
                    this.appListBuilder_.addMessage(i, installApp);
                } else if (installApp != null) {
                    ensureAppListIsMutable();
                    this.appList_.add(i, installApp);
                    onChanged();
                } else {
                    throw new NullPointerException();
                }
                return this;
            }

            public final Builder addBondedBtList(int i, BluetoothInfo bluetoothInfo) {
                if (this.bondedBtListBuilder_ != null) {
                    this.bondedBtListBuilder_.addMessage(i, bluetoothInfo);
                } else if (bluetoothInfo != null) {
                    ensureBondedBtListIsMutable();
                    this.bondedBtList_.add(i, bluetoothInfo);
                    onChanged();
                } else {
                    throw new NullPointerException();
                }
                return this;
            }

            public final Builder addSimSerial(int i, SimSerial simSerial) {
                if (this.simSerialBuilder_ != null) {
                    this.simSerialBuilder_.addMessage(i, simSerial);
                } else if (simSerial != null) {
                    ensureSimSerialIsMutable();
                    this.simSerial_.add(i, simSerial);
                    onChanged();
                } else {
                    throw new NullPointerException();
                }
                return this;
            }

            public final Builder addSystemAccounts(int i, SystemAccount systemAccount) {
                if (this.systemAccountsBuilder_ != null) {
                    this.systemAccountsBuilder_.addMessage(i, systemAccount);
                } else if (systemAccount != null) {
                    ensureSystemAccountsIsMutable();
                    this.systemAccounts_.add(i, systemAccount);
                    onChanged();
                } else {
                    throw new NullPointerException();
                }
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.RestartUploadInfo.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$RestartUploadInfo> r1 = com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.RestartUploadInfo.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$RestartUploadInfo r3 = (com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.RestartUploadInfo) r3     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    if (r3 == 0) goto L_0x000e
                    r2.mergeFrom((com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.RestartUploadInfo) r3)
                L_0x000e:
                    return r2
                L_0x000f:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0011:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x000f }
                    com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$RestartUploadInfo r4 = (com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.RestartUploadInfo) r4     // Catch:{ all -> 0x000f }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.RestartUploadInfo) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.RestartUploadInfo.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$RestartUploadInfo$Builder");
            }

            public final Builder setAppList(int i, InstallApp installApp) {
                if (this.appListBuilder_ != null) {
                    this.appListBuilder_.setMessage(i, installApp);
                } else if (installApp != null) {
                    ensureAppListIsMutable();
                    this.appList_.set(i, installApp);
                    onChanged();
                } else {
                    throw new NullPointerException();
                }
                return this;
            }

            public final Builder setBondedBtList(int i, BluetoothInfo bluetoothInfo) {
                if (this.bondedBtListBuilder_ != null) {
                    this.bondedBtListBuilder_.setMessage(i, bluetoothInfo);
                } else if (bluetoothInfo != null) {
                    ensureBondedBtListIsMutable();
                    this.bondedBtList_.set(i, bluetoothInfo);
                    onChanged();
                } else {
                    throw new NullPointerException();
                }
                return this;
            }

            public final Builder setSimSerial(int i, SimSerial simSerial) {
                if (this.simSerialBuilder_ != null) {
                    this.simSerialBuilder_.setMessage(i, simSerial);
                } else if (simSerial != null) {
                    ensureSimSerialIsMutable();
                    this.simSerial_.set(i, simSerial);
                    onChanged();
                } else {
                    throw new NullPointerException();
                }
                return this;
            }

            public final Builder setSystemAccounts(int i, SystemAccount systemAccount) {
                if (this.systemAccountsBuilder_ != null) {
                    this.systemAccountsBuilder_.setMessage(i, systemAccount);
                } else if (systemAccount != null) {
                    ensureSystemAccountsIsMutable();
                    this.systemAccounts_.set(i, systemAccount);
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

        public static RestartUploadInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeviceInfo.i;
        }

        public static Parser<RestartUploadInfo> parser() {
            return PARSER;
        }

        public final List<InstallApp> getAppListList() {
            return this.appList_;
        }

        public final List<? extends InstallAppOrBuilder> getAppListOrBuilderList() {
            return this.appList_;
        }

        public final List<BluetoothInfo> getBondedBtListList() {
            return this.bondedBtList_;
        }

        public final List<? extends BluetoothInfoOrBuilder> getBondedBtListOrBuilderList() {
            return this.bondedBtList_;
        }

        public final RestartUploadInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public final Parser<RestartUploadInfo> getParserForType() {
            return PARSER;
        }

        public final List<SimSerial> getSimSerialList() {
            return this.simSerial_;
        }

        public final List<? extends SimSerialOrBuilder> getSimSerialOrBuilderList() {
            return this.simSerial_;
        }

        public final List<SystemAccount> getSystemAccountsList() {
            return this.systemAccounts_;
        }

        public final List<? extends SystemAccountOrBuilder> getSystemAccountsOrBuilderList() {
            return this.systemAccounts_;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public final int getAppListCount() {
            return this.appList_.size();
        }

        public final int getBondedBtListCount() {
            return this.bondedBtList_.size();
        }

        public final BluetoothInfoOrBuilder getLocalBtInfoOrBuilder() {
            return getLocalBtInfo();
        }

        public final int getSimSerialCount() {
            return this.simSerial_.size();
        }

        public final int getSystemAccountsCount() {
            return this.systemAccounts_.size();
        }

        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        public final boolean hasLocalBtInfo() {
            if (this.localBtInfo_ != null) {
                return true;
            }
            return false;
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        public final BluetoothInfo getLocalBtInfo() {
            if (this.localBtInfo_ == null) {
                return BluetoothInfo.getDefaultInstance();
            }
            return this.localBtInfo_;
        }

        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeviceInfo.j.ensureFieldAccessorsInitialized(RestartUploadInfo.class, Builder.class);
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

        private RestartUploadInfo() {
            this.memoizedIsInitialized = -1;
            this.simSerial_ = Collections.emptyList();
            this.systemAccounts_ = Collections.emptyList();
            this.bondedBtList_ = Collections.emptyList();
            this.appList_ = Collections.emptyList();
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
            for (int i3 = 0; i3 < this.simSerial_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.simSerial_.get(i3));
            }
            for (int i4 = 0; i4 < this.systemAccounts_.size(); i4++) {
                i2 += CodedOutputStream.computeMessageSize(2, this.systemAccounts_.get(i4));
            }
            if (this.localBtInfo_ != null) {
                i2 += CodedOutputStream.computeMessageSize(3, getLocalBtInfo());
            }
            for (int i5 = 0; i5 < this.bondedBtList_.size(); i5++) {
                i2 += CodedOutputStream.computeMessageSize(4, this.bondedBtList_.get(i5));
            }
            for (int i6 = 0; i6 < this.appList_.size(); i6++) {
                i2 += CodedOutputStream.computeMessageSize(5, this.appList_.get(i6));
            }
            this.memoizedSize = i2;
            return i2;
        }

        public final int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = getDescriptorForType().hashCode() + 779;
            if (getSimSerialCount() > 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + getSimSerialList().hashCode();
            }
            if (getSystemAccountsCount() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + getSystemAccountsList().hashCode();
            }
            if (hasLocalBtInfo()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getLocalBtInfo().hashCode();
            }
            if (getBondedBtListCount() > 0) {
                hashCode = (((hashCode * 37) + 4) * 53) + getBondedBtListList().hashCode();
            }
            if (getAppListCount() > 0) {
                hashCode = (((hashCode * 37) + 5) * 53) + getAppListList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        private RestartUploadInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        public static Builder newBuilder(RestartUploadInfo restartUploadInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(restartUploadInfo);
        }

        public static RestartUploadInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RestartUploadInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RestartUploadInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RestartUploadInfo) PARSER.parseFrom(byteString);
        }

        public final InstallApp getAppList(int i) {
            return this.appList_.get(i);
        }

        public final InstallAppOrBuilder getAppListOrBuilder(int i) {
            return this.appList_.get(i);
        }

        public final BluetoothInfo getBondedBtList(int i) {
            return this.bondedBtList_.get(i);
        }

        public final BluetoothInfoOrBuilder getBondedBtListOrBuilder(int i) {
            return this.bondedBtList_.get(i);
        }

        public final SimSerial getSimSerial(int i) {
            return this.simSerial_.get(i);
        }

        public final SimSerialOrBuilder getSimSerialOrBuilder(int i) {
            return this.simSerial_.get(i);
        }

        public final SystemAccount getSystemAccounts(int i) {
            return this.systemAccounts_.get(i);
        }

        public final SystemAccountOrBuilder getSystemAccountsOrBuilder(int i) {
            return this.systemAccounts_.get(i);
        }

        /* access modifiers changed from: protected */
        public final Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static RestartUploadInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RestartUploadInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public final boolean equals(Object obj) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4 = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RestartUploadInfo)) {
                return super.equals(obj);
            }
            RestartUploadInfo restartUploadInfo = (RestartUploadInfo) obj;
            if (!getSimSerialList().equals(restartUploadInfo.getSimSerialList()) || !getSystemAccountsList().equals(restartUploadInfo.getSystemAccountsList())) {
                z = false;
            } else {
                z = true;
            }
            if (!z || hasLocalBtInfo() != restartUploadInfo.hasLocalBtInfo()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (hasLocalBtInfo()) {
                if (!z2 || !getLocalBtInfo().equals(restartUploadInfo.getLocalBtInfo())) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
            if (!z2 || !getBondedBtListList().equals(restartUploadInfo.getBondedBtListList())) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3 || !getAppListList().equals(restartUploadInfo.getAppListList())) {
                z4 = false;
            }
            return z4;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.simSerial_.size(); i++) {
                codedOutputStream.writeMessage(1, this.simSerial_.get(i));
            }
            for (int i2 = 0; i2 < this.systemAccounts_.size(); i2++) {
                codedOutputStream.writeMessage(2, this.systemAccounts_.get(i2));
            }
            if (this.localBtInfo_ != null) {
                codedOutputStream.writeMessage(3, getLocalBtInfo());
            }
            for (int i3 = 0; i3 < this.bondedBtList_.size(); i3++) {
                codedOutputStream.writeMessage(4, this.bondedBtList_.get(i3));
            }
            for (int i4 = 0; i4 < this.appList_.size(); i4++) {
                codedOutputStream.writeMessage(5, this.appList_.get(i4));
            }
        }

        public static RestartUploadInfo parseFrom(InputStream inputStream) throws IOException {
            return (RestartUploadInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static RestartUploadInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RestartUploadInfo) PARSER.parseFrom(bArr);
        }

        public static RestartUploadInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RestartUploadInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RestartUploadInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RestartUploadInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RestartUploadInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RestartUploadInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private RestartUploadInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            if (!z2 || !true) {
                                this.simSerial_ = new ArrayList();
                                z2 |= true;
                            }
                            this.simSerial_.add(codedInputStream.readMessage(SimSerial.parser(), extensionRegistryLite));
                        } else if (readTag == 18) {
                            if (!(z2 & true)) {
                                this.systemAccounts_ = new ArrayList();
                                z2 |= true;
                            }
                            this.systemAccounts_.add(codedInputStream.readMessage(SystemAccount.parser(), extensionRegistryLite));
                        } else if (readTag == 26) {
                            BluetoothInfo.Builder builder = null;
                            builder = this.localBtInfo_ != null ? this.localBtInfo_.toBuilder() : builder;
                            this.localBtInfo_ = (BluetoothInfo) codedInputStream.readMessage(BluetoothInfo.parser(), extensionRegistryLite);
                            if (builder != null) {
                                builder.mergeFrom(this.localBtInfo_);
                                this.localBtInfo_ = builder.buildPartial();
                            }
                        } else if (readTag == 34) {
                            if (!(z2 & true)) {
                                this.bondedBtList_ = new ArrayList();
                                z2 |= true;
                            }
                            this.bondedBtList_.add(codedInputStream.readMessage(BluetoothInfo.parser(), extensionRegistryLite));
                        } else if (readTag == 42) {
                            if (!(z2 & true)) {
                                this.appList_ = new ArrayList();
                                z2 |= true;
                            }
                            this.appList_.add(codedInputStream.readMessage(InstallApp.parser(), extensionRegistryLite));
                        } else if (!codedInputStream.skipField(readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.simSerial_ = Collections.unmodifiableList(this.simSerial_);
                    }
                    if (z2 & true) {
                        this.systemAccounts_ = Collections.unmodifiableList(this.systemAccounts_);
                    }
                    if (z2 & true) {
                        this.bondedBtList_ = Collections.unmodifiableList(this.bondedBtList_);
                    }
                    if (z2 & true) {
                        this.appList_ = Collections.unmodifiableList(this.appList_);
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.simSerial_ = Collections.unmodifiableList(this.simSerial_);
            }
            if (z2 & true) {
                this.systemAccounts_ = Collections.unmodifiableList(this.systemAccounts_);
            }
            if (z2 & true) {
                this.bondedBtList_ = Collections.unmodifiableList(this.bondedBtList_);
            }
            if (z2 & true) {
                this.appList_ = Collections.unmodifiableList(this.appList_);
            }
            makeExtensionsImmutable();
        }

        public static RestartUploadInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RestartUploadInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RestartUploadInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RestartUploadInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface RestartUploadInfoOrBuilder extends MessageOrBuilder {
        InstallApp getAppList(int i);

        int getAppListCount();

        List<InstallApp> getAppListList();

        InstallAppOrBuilder getAppListOrBuilder(int i);

        List<? extends InstallAppOrBuilder> getAppListOrBuilderList();

        BluetoothInfo getBondedBtList(int i);

        int getBondedBtListCount();

        List<BluetoothInfo> getBondedBtListList();

        BluetoothInfoOrBuilder getBondedBtListOrBuilder(int i);

        List<? extends BluetoothInfoOrBuilder> getBondedBtListOrBuilderList();

        BluetoothInfo getLocalBtInfo();

        BluetoothInfoOrBuilder getLocalBtInfoOrBuilder();

        SimSerial getSimSerial(int i);

        int getSimSerialCount();

        List<SimSerial> getSimSerialList();

        SimSerialOrBuilder getSimSerialOrBuilder(int i);

        List<? extends SimSerialOrBuilder> getSimSerialOrBuilderList();

        SystemAccount getSystemAccounts(int i);

        int getSystemAccountsCount();

        List<SystemAccount> getSystemAccountsList();

        SystemAccountOrBuilder getSystemAccountsOrBuilder(int i);

        List<? extends SystemAccountOrBuilder> getSystemAccountsOrBuilderList();

        boolean hasLocalBtInfo();
    }

    public static final class SimSerial extends GeneratedMessageV3 implements SimSerialOrBuilder {
        private static final SimSerial DEFAULT_INSTANCE = new SimSerial();
        public static final Parser<SimSerial> PARSER = new AbstractParser<SimSerial>() {
            public final SimSerial parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new SimSerial(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        public volatile Object simSerialNumber_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SimSerialOrBuilder {
            private Object simSerialNumber_;

            private void maybeForceBuilderInitialization() {
            }

            public final boolean isInitialized() {
                return true;
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DeviceInfo.f22845c;
            }

            public final Descriptors.Descriptor getDescriptorForType() {
                return DeviceInfo.f22845c;
            }

            public final Builder clear() {
                super.clear();
                this.simSerialNumber_ = "";
                return this;
            }

            public final Builder clone() {
                return (Builder) super.clone();
            }

            public final SimSerial getDefaultInstanceForType() {
                return SimSerial.getDefaultInstance();
            }

            private Builder() {
                this.simSerialNumber_ = "";
                maybeForceBuilderInitialization();
            }

            public final SimSerial build() {
                SimSerial buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final SimSerial buildPartial() {
                SimSerial simSerial = new SimSerial((GeneratedMessageV3.Builder) this);
                simSerial.simSerialNumber_ = this.simSerialNumber_;
                onBuilt();
                return simSerial;
            }

            public final Builder clearSimSerialNumber() {
                this.simSerialNumber_ = SimSerial.getDefaultInstance().getSimSerialNumber();
                onChanged();
                return this;
            }

            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DeviceInfo.f22846d.ensureFieldAccessorsInitialized(SimSerial.class, Builder.class);
            }

            public final String getSimSerialNumber() {
                Object obj = this.simSerialNumber_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.simSerialNumber_ = stringUtf8;
                return stringUtf8;
            }

            public final ByteString getSimSerialNumberBytes() {
                Object obj = this.simSerialNumber_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.simSerialNumber_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public final Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof SimSerial) {
                    return mergeFrom((SimSerial) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder setSimSerialNumber(String str) {
                if (str != null) {
                    this.simSerialNumber_ = str;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.simSerialNumber_ = "";
                maybeForceBuilderInitialization();
            }

            public final Builder mergeFrom(SimSerial simSerial) {
                if (simSerial == SimSerial.getDefaultInstance()) {
                    return this;
                }
                if (!simSerial.getSimSerialNumber().isEmpty()) {
                    this.simSerialNumber_ = simSerial.simSerialNumber_;
                    onChanged();
                }
                onChanged();
                return this;
            }

            public final Builder setSimSerialNumberBytes(ByteString byteString) {
                if (byteString != null) {
                    SimSerial.checkByteStringIsUtf8(byteString);
                    this.simSerialNumber_ = byteString;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            public final Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public final Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.SimSerial.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$SimSerial> r1 = com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.SimSerial.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$SimSerial r3 = (com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.SimSerial) r3     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    if (r3 == 0) goto L_0x000e
                    r2.mergeFrom((com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.SimSerial) r3)
                L_0x000e:
                    return r2
                L_0x000f:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0011:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x000f }
                    com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$SimSerial r4 = (com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.SimSerial) r4     // Catch:{ all -> 0x000f }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.SimSerial) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.SimSerial.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$SimSerial$Builder");
            }

            public final Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }
        }

        public static SimSerial getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeviceInfo.f22845c;
        }

        public static Parser<SimSerial> parser() {
            return PARSER;
        }

        public final SimSerial getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public final Parser<SimSerial> getParserForType() {
            return PARSER;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        private SimSerial() {
            this.memoizedIsInitialized = -1;
            this.simSerialNumber_ = "";
        }

        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeviceInfo.f22846d.ensureFieldAccessorsInitialized(SimSerial.class, Builder.class);
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

        public final int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getSimSerialNumberBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.simSerialNumber_);
            }
            this.memoizedSize = i2;
            return i2;
        }

        public final String getSimSerialNumber() {
            Object obj = this.simSerialNumber_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.simSerialNumber_ = stringUtf8;
            return stringUtf8;
        }

        public final ByteString getSimSerialNumberBytes() {
            Object obj = this.simSerialNumber_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.simSerialNumber_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        public final int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((getDescriptorForType().hashCode() + 779) * 37) + 1) * 53) + getSimSerialNumber().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        private SimSerial(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        public static Builder newBuilder(SimSerial simSerial) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(simSerial);
        }

        public static SimSerial parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SimSerial) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SimSerial parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SimSerial) PARSER.parseFrom(byteString);
        }

        /* access modifiers changed from: protected */
        public final Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SimSerial)) {
                return super.equals(obj);
            }
            return getSimSerialNumber().equals(((SimSerial) obj).getSimSerialNumber());
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getSimSerialNumberBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.simSerialNumber_);
            }
        }

        public static SimSerial parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SimSerial) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SimSerial parseFrom(InputStream inputStream) throws IOException {
            return (SimSerial) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SimSerial parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SimSerial) PARSER.parseFrom(bArr);
        }

        public static SimSerial parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SimSerial) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SimSerial parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SimSerial) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private SimSerial(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            this.simSerialNumber_ = codedInputStream.readStringRequireUtf8();
                        } else if (!codedInputStream.skipField(readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            makeExtensionsImmutable();
        }

        public static SimSerial parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SimSerial) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static SimSerial parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SimSerial) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SimSerial parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SimSerial) PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface SimSerialOrBuilder extends MessageOrBuilder {
        String getSimSerialNumber();

        ByteString getSimSerialNumberBytes();
    }

    public static final class SystemAccount extends GeneratedMessageV3 implements SystemAccountOrBuilder {
        private static final SystemAccount DEFAULT_INSTANCE = new SystemAccount();
        public static final Parser<SystemAccount> PARSER = new AbstractParser<SystemAccount>() {
            public final SystemAccount parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new SystemAccount(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        public volatile Object name_;
        public volatile Object type_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SystemAccountOrBuilder {
            private Object name_;
            private Object type_;

            private void maybeForceBuilderInitialization() {
            }

            public final boolean isInitialized() {
                return true;
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DeviceInfo.f22843a;
            }

            public final Descriptors.Descriptor getDescriptorForType() {
                return DeviceInfo.f22843a;
            }

            public final Builder clone() {
                return (Builder) super.clone();
            }

            public final SystemAccount getDefaultInstanceForType() {
                return SystemAccount.getDefaultInstance();
            }

            private Builder() {
                this.name_ = "";
                this.type_ = "";
                maybeForceBuilderInitialization();
            }

            public final SystemAccount build() {
                SystemAccount buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public final Builder clear() {
                super.clear();
                this.name_ = "";
                this.type_ = "";
                return this;
            }

            public final Builder clearName() {
                this.name_ = SystemAccount.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public final Builder clearType() {
                this.type_ = SystemAccount.getDefaultInstance().getType();
                onChanged();
                return this;
            }

            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DeviceInfo.f22844b.ensureFieldAccessorsInitialized(SystemAccount.class, Builder.class);
            }

            public final SystemAccount buildPartial() {
                SystemAccount systemAccount = new SystemAccount((GeneratedMessageV3.Builder) this);
                systemAccount.name_ = this.name_;
                systemAccount.type_ = this.type_;
                onBuilt();
                return systemAccount;
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

            public final String getType() {
                Object obj = this.type_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.type_ = stringUtf8;
                return stringUtf8;
            }

            public final ByteString getTypeBytes() {
                Object obj = this.type_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.type_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public final Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public final Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public final Builder mergeFrom(Message message) {
                if (message instanceof SystemAccount) {
                    return mergeFrom((SystemAccount) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public final Builder setName(String str) {
                if (str != null) {
                    this.name_ = str;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            public final Builder setType(String str) {
                if (str != null) {
                    this.type_ = str;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
                this.type_ = "";
                maybeForceBuilderInitialization();
            }

            public final Builder setNameBytes(ByteString byteString) {
                if (byteString != null) {
                    SystemAccount.checkByteStringIsUtf8(byteString);
                    this.name_ = byteString;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            public final Builder setTypeBytes(ByteString byteString) {
                if (byteString != null) {
                    SystemAccount.checkByteStringIsUtf8(byteString);
                    this.type_ = byteString;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            public final Builder mergeFrom(SystemAccount systemAccount) {
                if (systemAccount == SystemAccount.getDefaultInstance()) {
                    return this;
                }
                if (!systemAccount.getName().isEmpty()) {
                    this.name_ = systemAccount.name_;
                    onChanged();
                }
                if (!systemAccount.getType().isEmpty()) {
                    this.type_ = systemAccount.type_;
                    onChanged();
                }
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
            public final com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.SystemAccount.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$SystemAccount> r1 = com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.SystemAccount.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$SystemAccount r3 = (com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.SystemAccount) r3     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
                    if (r3 == 0) goto L_0x000e
                    r2.mergeFrom((com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.SystemAccount) r3)
                L_0x000e:
                    return r2
                L_0x000f:
                    r3 = move-exception
                    goto L_0x001f
                L_0x0011:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x000f }
                    com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$SystemAccount r4 = (com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.SystemAccount) r4     // Catch:{ all -> 0x000f }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001d }
                    throw r3     // Catch:{ all -> 0x001d }
                L_0x001d:
                    r3 = move-exception
                    r0 = r4
                L_0x001f:
                    if (r0 == 0) goto L_0x0024
                    r2.mergeFrom((com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.SystemAccount) r0)
                L_0x0024:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.usergrowth.data.deviceinfo.DeviceInfo.SystemAccount.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.bytedance.usergrowth.data.deviceinfo.DeviceInfo$SystemAccount$Builder");
            }

            public final Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }
        }

        public static SystemAccount getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeviceInfo.f22843a;
        }

        public static Parser<SystemAccount> parser() {
            return PARSER;
        }

        public final SystemAccount getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public final Parser<SystemAccount> getParserForType() {
            return PARSER;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        public final Builder newBuilderForType() {
            return newBuilder();
        }

        private SystemAccount() {
            this.memoizedIsInitialized = -1;
            this.name_ = "";
            this.type_ = "";
        }

        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeviceInfo.f22844b.ensureFieldAccessorsInitialized(SystemAccount.class, Builder.class);
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

        public final String getType() {
            Object obj = this.type_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.type_ = stringUtf8;
            return stringUtf8;
        }

        public final ByteString getTypeBytes() {
            Object obj = this.type_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.type_ = copyFromUtf8;
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
            if (!getNameBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.name_);
            }
            if (!getTypeBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.type_);
            }
            this.memoizedSize = i2;
            return i2;
        }

        public final int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((getDescriptorForType().hashCode() + 779) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getType().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        private SystemAccount(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        public static Builder newBuilder(SystemAccount systemAccount) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(systemAccount);
        }

        public static SystemAccount parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SystemAccount) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SystemAccount parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SystemAccount) PARSER.parseFrom(byteString);
        }

        /* access modifiers changed from: protected */
        public final Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SystemAccount parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SystemAccount) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public final boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SystemAccount)) {
                return super.equals(obj);
            }
            SystemAccount systemAccount = (SystemAccount) obj;
            if (!getName().equals(systemAccount.getName()) || !getType().equals(systemAccount.getType())) {
                z = false;
            }
            return z;
        }

        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            if (!getTypeBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.type_);
            }
        }

        public static SystemAccount parseFrom(InputStream inputStream) throws IOException {
            return (SystemAccount) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SystemAccount parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SystemAccount) PARSER.parseFrom(bArr);
        }

        public static SystemAccount parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SystemAccount) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SystemAccount parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SystemAccount) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private SystemAccount(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            this.name_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 18) {
                            this.type_ = codedInputStream.readStringRequireUtf8();
                        } else if (!codedInputStream.skipField(readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            makeExtensionsImmutable();
        }

        public static SystemAccount parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SystemAccount) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static SystemAccount parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SystemAccount) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SystemAccount parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SystemAccount) PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface SystemAccountOrBuilder extends MessageOrBuilder {
        String getName();

        ByteString getNameBytes();

        String getType();

        ByteString getTypeBytes();
    }

    private static Descriptors.FileDescriptor a() {
        return s;
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0010DeviceInfo.proto\u0012\ndeviceinfo\"+\n\rSystemAccount\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\f\n\u0004type\u0018\u0002 \u0001(\t\"$\n\tSimSerial\u0012\u0017\n\u000fsimSerialNumber\u0018\u0001 \u0001(\t\"K\n\rBluetoothInfo\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\r\n\u0005macid\u0018\u0002 \u0001(\t\u0012\u000e\n\u0006status\u0018\u0003 \u0001(\u0005\u0012\r\n\u0005alias\u0018\u0004 \u0001(\t\"S\n\nInstallApp\u0012\u0013\n\u000bpackageName\u0018\u0001 \u0001(\t\u0012\u0018\n\u0010firstInstallTime\u0018\u0002 \u0001(\u0003\u0012\u0016\n\u000elastUpdateTime\u0018\u0003 \u0001(\u0003\"ú\u0001\n\u0011RestartUploadInfo\u0012(\n\tsimSerial\u0018\u0001 \u0003(\u000b2\u0015.deviceinfo.SimSerial\u00121\n\u000esystemAccounts\u0018\u0002 \u0003(\u000b2\u0019.deviceinfo.SystemAccount\u0012.\n\u000blocalB", "tInfo\u0018\u0003 \u0001(\u000b2\u0019.deviceinfo.BluetoothInfo\u0012/\n\fbondedBtList\u0018\u0004 \u0003(\u000b2\u0019.deviceinfo.BluetoothInfo\u0012'\n\u0007appList\u0018\u0005 \u0003(\u000b2\u0016.deviceinfo.InstallApp\"x\n\u000fDeviceParameter\u0012\u0010\n\bdiskSize\u0018\u0001 \u0001(\u0003\u0012\u0015\n\rdiskUsageSize\u0018\u0002 \u0001(\u0003\u0012\u0012\n\nmemorySize\u0018\u0003 \u0001(\u0003\u0012\u0017\n\u000fmemoryUsageSize\u0018\u0004 \u0001(\u0003\u0012\u000f\n\u0007cpuType\u0018\u0005 \u0001(\t\"'\n\u0004Gyro\u0012\t\n\u0001x\u0018\u0001 \u0001(\u0002\u0012\t\n\u0001y\u0018\u0002 \u0001(\u0002\u0012\t\n\u0001z\u0018\u0003 \u0001(\u0002\"/\n\fAcceleration\u0012\t\n\u0001x\u0018\u0001 \u0001(\u0002\u0012\t\n\u0001y\u0018\u0002 \u0001(\u0002\u0012\t\n\u0001z\u0018\u0003 \u0001(\u0002\"\u0001\n\u000eCronUploadInfo\u00124\n\u000fdeviceParameter\u0018\u0001 \u0001(\u000b2\u001b.deviceinfo.De", "viceParameter\u0012\u001e\n\u0004gyro\u0018\u0002 \u0001(\u000b2\u0010.deviceinfo.Gyro\u0012.\n\facceleration\u0018\u0003 \u0001(\u000b2\u0018.deviceinfo.AccelerationB6\n(com.bytedance.usergrowth.data.deviceinfoB\nDeviceInfob\u0006proto3"}, new Descriptors.FileDescriptor[0], new Descriptors.FileDescriptor.InternalDescriptorAssigner() {
            public final ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                DeviceInfo.s = fileDescriptor;
                return null;
            }
        });
    }
}
