package com.bytedance.android.livesdk.message.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class PayloadInIm extends Message<PayloadInIm, Builder> {
    public static final ProtoAdapter<PayloadInIm> ADAPTER = new ProtoAdapter_PayloadInIm();
    public static final CompressTypeEnum DEFAULT_COMPRESSTYPE = CompressTypeEnum.NONE;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.PayloadInIm$CompressTypeEnum#ADAPTER", tag = 2)
    public final CompressTypeEnum CompressType;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final Map<String, ByteString> Payloads;

    public static final class Builder extends Message.Builder<PayloadInIm, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public CompressTypeEnum CompressType;
        public Map<String, ByteString> Payloads = Internal.newMutableMap();

        public final PayloadInIm build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11992, new Class[0], PayloadInIm.class)) {
                return new PayloadInIm(this.Payloads, this.CompressType, super.buildUnknownFields());
            }
            return (PayloadInIm) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11992, new Class[0], PayloadInIm.class);
        }

        public final Builder CompressType(CompressTypeEnum compressTypeEnum) {
            this.CompressType = compressTypeEnum;
            return this;
        }

        public final Builder Payloads(Map<String, ByteString> map) {
            if (PatchProxy.isSupport(new Object[]{map}, this, changeQuickRedirect, false, 11991, new Class[]{Map.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{map}, this, changeQuickRedirect, false, 11991, new Class[]{Map.class}, Builder.class);
            }
            Internal.checkElementsNotNull(map);
            this.Payloads = map;
            return this;
        }
    }

    public enum CompressTypeEnum implements WireEnum {
        NONE(0),
        ZLIB(1);
        
        public static final ProtoAdapter<CompressTypeEnum> ADAPTER = null;
        public static ChangeQuickRedirect changeQuickRedirect;
        private final int value;

        public final int getValue() {
            return this.value;
        }

        static {
            ADAPTER = ProtoAdapter.newEnumAdapter(CompressTypeEnum.class);
        }

        public static CompressTypeEnum fromValue(int i) {
            switch (i) {
                case 0:
                    return NONE;
                case 1:
                    return ZLIB;
                default:
                    return null;
            }
        }

        private CompressTypeEnum(int i) {
            this.value = i;
        }
    }

    static final class ProtoAdapter_PayloadInIm extends ProtoAdapter<PayloadInIm> {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final ProtoAdapter<Map<String, ByteString>> Payloads = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.BYTES);

        ProtoAdapter_PayloadInIm() {
            super(FieldEncoding.LENGTH_DELIMITED, PayloadInIm.class);
        }

        public final int encodedSize(PayloadInIm payloadInIm) {
            PayloadInIm payloadInIm2 = payloadInIm;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{payloadInIm2}, this, changeQuickRedirect, false, 11995, new Class[]{PayloadInIm.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{payloadInIm2}, this, changeQuickRedirect, false, 11995, new Class[]{PayloadInIm.class}, Integer.TYPE)).intValue();
            }
            int encodedSizeWithTag = this.Payloads.encodedSizeWithTag(1, payloadInIm2.Payloads);
            if (payloadInIm2.CompressType != null) {
                i = CompressTypeEnum.ADAPTER.encodedSizeWithTag(2, payloadInIm2.CompressType);
            }
            return encodedSizeWithTag + i + payloadInIm.unknownFields().size();
        }

        public final PayloadInIm redact(PayloadInIm payloadInIm) {
            if (PatchProxy.isSupport(new Object[]{payloadInIm}, this, changeQuickRedirect, false, 11998, new Class[]{PayloadInIm.class}, PayloadInIm.class)) {
                return (PayloadInIm) PatchProxy.accessDispatch(new Object[]{payloadInIm}, this, changeQuickRedirect, false, 11998, new Class[]{PayloadInIm.class}, PayloadInIm.class);
            }
            Builder newBuilder = payloadInIm.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final PayloadInIm decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11997, new Class[]{ProtoReader.class}, PayloadInIm.class)) {
                return (PayloadInIm) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11997, new Class[]{ProtoReader.class}, PayloadInIm.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.Payloads.putAll((Map) this.Payloads.decode(protoReader2));
                            break;
                        case 2:
                            try {
                                builder.CompressType((CompressTypeEnum) CompressTypeEnum.ADAPTER.decode(protoReader2));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                            break;
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, PayloadInIm payloadInIm) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            PayloadInIm payloadInIm2 = payloadInIm;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, payloadInIm2}, this, changeQuickRedirect, false, 11996, new Class[]{ProtoWriter.class, PayloadInIm.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, payloadInIm2}, this, changeQuickRedirect, false, 11996, new Class[]{ProtoWriter.class, PayloadInIm.class}, Void.TYPE);
                return;
            }
            this.Payloads.encodeWithTag(protoWriter2, 1, payloadInIm2.Payloads);
            if (payloadInIm2.CompressType != null) {
                CompressTypeEnum.ADAPTER.encodeWithTag(protoWriter2, 2, payloadInIm2.CompressType);
            }
            protoWriter2.writeBytes(payloadInIm.unknownFields());
        }
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11989, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11989, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = ((unknownFields().hashCode() * 37) + this.Payloads.hashCode()) * 37;
            if (this.CompressType != null) {
                i = this.CompressType.hashCode();
            }
            i2 = hashCode + i;
            this.hashCode = i2;
        }
        return i2;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11987, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11987, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.Payloads = Internal.copyOf("Payloads", this.Payloads);
        builder.CompressType = this.CompressType;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11990, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11990, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (!this.Payloads.isEmpty()) {
            sb.append(", Payloads=");
            sb.append(this.Payloads);
        }
        if (this.CompressType != null) {
            sb.append(", CompressType=");
            sb.append(this.CompressType);
        }
        StringBuilder replace = sb.replace(0, 2, "PayloadInIm{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11988, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11988, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof PayloadInIm)) {
                return false;
            }
            PayloadInIm payloadInIm = (PayloadInIm) obj;
            if (!unknownFields().equals(payloadInIm.unknownFields()) || !this.Payloads.equals(payloadInIm.Payloads) || !Internal.equals(this.CompressType, payloadInIm.CompressType)) {
                return false;
            }
            return true;
        }
    }

    public PayloadInIm(Map<String, ByteString> map, CompressTypeEnum compressTypeEnum) {
        this(map, compressTypeEnum, ByteString.EMPTY);
    }

    public PayloadInIm(Map<String, ByteString> map, CompressTypeEnum compressTypeEnum, ByteString byteString) {
        super(ADAPTER, byteString);
        this.Payloads = Internal.immutableCopyOf("Payloads", map);
        this.CompressType = compressTypeEnum;
    }
}
