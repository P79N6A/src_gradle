package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.KtNullable;
import com.bytedance.ies.c.a;
import com.bytedance.ies.c.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class DeviceInfo extends Message<DeviceInfo, Builder> {
    public static final DefaultValueProtoAdapter<DeviceInfo> ADAPTER = new ProtoAdapter_DeviceInfo();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String brand;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String device;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String model;

    public static final class Builder extends Message.Builder<DeviceInfo, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String brand;
        public String device;
        public String model;

        public final DeviceInfo build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47802, new Class[0], DeviceInfo.class)) {
                return new DeviceInfo(this.brand, this.device, this.model, super.buildUnknownFields());
            }
            return (DeviceInfo) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47802, new Class[0], DeviceInfo.class);
        }

        public final Builder brand(String str) {
            this.brand = str;
            return this;
        }

        public final Builder device(String str) {
            this.device = str;
            return this;
        }

        public final Builder model(String str) {
            this.model = str;
            return this;
        }
    }

    static final class ProtoAdapter_DeviceInfo extends DefaultValueProtoAdapter<DeviceInfo> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final DeviceInfo redact(DeviceInfo deviceInfo) {
            return deviceInfo;
        }

        public ProtoAdapter_DeviceInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, DeviceInfo.class);
        }

        public final DeviceInfo decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47805, new Class[]{ProtoReader.class}, DeviceInfo.class)) {
                return decode(protoReader2, (DeviceInfo) null);
            }
            return (DeviceInfo) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47805, new Class[]{ProtoReader.class}, DeviceInfo.class);
        }

        public final int encodedSize(DeviceInfo deviceInfo) {
            DeviceInfo deviceInfo2 = deviceInfo;
            if (!PatchProxy.isSupport(new Object[]{deviceInfo2}, this, changeQuickRedirect, false, 47803, new Class[]{DeviceInfo.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, deviceInfo2.brand) + ProtoAdapter.STRING.encodedSizeWithTag(2, deviceInfo2.device) + ProtoAdapter.STRING.encodedSizeWithTag(3, deviceInfo2.model) + deviceInfo.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{deviceInfo2}, this, changeQuickRedirect, false, 47803, new Class[]{DeviceInfo.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, DeviceInfo deviceInfo) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            DeviceInfo deviceInfo2 = deviceInfo;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, deviceInfo2}, this, changeQuickRedirect, false, 47804, new Class[]{ProtoWriter.class, DeviceInfo.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, deviceInfo2}, this, changeQuickRedirect, false, 47804, new Class[]{ProtoWriter.class, DeviceInfo.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, deviceInfo2.brand);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, deviceInfo2.device);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, deviceInfo2.model);
            protoWriter2.writeBytes(deviceInfo.unknownFields());
        }

        public final DeviceInfo decode(ProtoReader protoReader, DeviceInfo deviceInfo) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            DeviceInfo deviceInfo2 = deviceInfo;
            if (PatchProxy.isSupport(new Object[]{protoReader2, deviceInfo2}, this, changeQuickRedirect, false, 47806, new Class[]{ProtoReader.class, DeviceInfo.class}, DeviceInfo.class)) {
                return (DeviceInfo) PatchProxy.accessDispatch(new Object[]{protoReader2, deviceInfo2}, this, changeQuickRedirect, false, 47806, new Class[]{ProtoReader.class, DeviceInfo.class}, DeviceInfo.class);
            }
            DeviceInfo deviceInfo3 = (DeviceInfo) a.a().a(DeviceInfo.class, deviceInfo2);
            if (deviceInfo3 != null) {
                builder = deviceInfo3.newBuilder();
            } else {
                builder = new Builder();
            }
            Builder builder2 = builder;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder2.brand((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            builder2.device((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder2.model((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (deviceInfo3 != null) {
                                    break;
                                } else {
                                    throw e2;
                                }
                            }
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    return builder2.build();
                }
            }
        }
    }

    @KtNullable
    public final String getBrand() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47795, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47795, new Class[0], String.class);
        } else if (this.brand != null) {
            return this.brand;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getDevice() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47796, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47796, new Class[0], String.class);
        } else if (this.device != null) {
            return this.device;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getModel() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47797, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47797, new Class[0], String.class);
        } else if (this.model != null) {
            return this.model;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47800, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47800, new Class[0], Integer.TYPE)).intValue();
        }
        int i4 = this.hashCode;
        if (i4 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.brand != null) {
                i = this.brand.hashCode();
            } else {
                i = 0;
            }
            int i5 = (hashCode + i) * 37;
            if (this.device != null) {
                i2 = this.device.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            if (this.model != null) {
                i3 = this.model.hashCode();
            }
            i4 = i6 + i3;
            this.hashCode = i4;
        }
        return i4;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47798, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47798, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.brand = this.brand;
        builder.device = this.device;
        builder.model = this.model;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47801, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47801, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.brand != null) {
            sb.append(", brand=");
            sb.append(this.brand);
        }
        if (this.device != null) {
            sb.append(", device=");
            sb.append(this.device);
        }
        if (this.model != null) {
            sb.append(", model=");
            sb.append(this.model);
        }
        StringBuilder replace = sb.replace(0, 2, "DeviceInfo{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47799, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47799, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof DeviceInfo)) {
                return false;
            }
            DeviceInfo deviceInfo = (DeviceInfo) obj;
            if (!unknownFields().equals(deviceInfo.unknownFields()) || !Internal.equals(this.brand, deviceInfo.brand) || !Internal.equals(this.device, deviceInfo.device) || !Internal.equals(this.model, deviceInfo.model)) {
                return false;
            }
            return true;
        }
    }

    public DeviceInfo(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public DeviceInfo(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.brand = str;
        this.device = str2;
        this.model = str3;
    }
}
