package com.bytedance.android.livesdk.message.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class BridgeMessage extends Message<BridgeMessage, Builder> {
    public static final ProtoAdapter<BridgeMessage> ADAPTER = new ProtoAdapter_BridgeMessage();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.BridgeData#ADAPTER", tag = 2)
    public final BridgeData bridge;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;

    public static final class Builder extends Message.Builder<BridgeMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public BridgeData bridge;
        public Common common;

        public final BridgeMessage build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11205, new Class[0], BridgeMessage.class)) {
                return new BridgeMessage(this.common, this.bridge, super.buildUnknownFields());
            }
            return (BridgeMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11205, new Class[0], BridgeMessage.class);
        }

        public final Builder bridge(BridgeData bridgeData) {
            this.bridge = bridgeData;
            return this;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }
    }

    static final class ProtoAdapter_BridgeMessage extends ProtoAdapter<BridgeMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_BridgeMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, BridgeMessage.class);
        }

        public final int encodedSize(BridgeMessage bridgeMessage) {
            int i;
            BridgeMessage bridgeMessage2 = bridgeMessage;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{bridgeMessage2}, this, changeQuickRedirect, false, 11206, new Class[]{BridgeMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{bridgeMessage2}, this, changeQuickRedirect, false, 11206, new Class[]{BridgeMessage.class}, Integer.TYPE)).intValue();
            }
            if (bridgeMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, bridgeMessage2.common);
            } else {
                i = 0;
            }
            if (bridgeMessage2.bridge != null) {
                i2 = BridgeData.ADAPTER.encodedSizeWithTag(2, bridgeMessage2.bridge);
            }
            return i + i2 + bridgeMessage.unknownFields().size();
        }

        public final BridgeMessage redact(BridgeMessage bridgeMessage) {
            if (PatchProxy.isSupport(new Object[]{bridgeMessage}, this, changeQuickRedirect, false, 11209, new Class[]{BridgeMessage.class}, BridgeMessage.class)) {
                return (BridgeMessage) PatchProxy.accessDispatch(new Object[]{bridgeMessage}, this, changeQuickRedirect, false, 11209, new Class[]{BridgeMessage.class}, BridgeMessage.class);
            }
            Builder newBuilder = bridgeMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.bridge != null) {
                newBuilder.bridge = (BridgeData) BridgeData.ADAPTER.redact(newBuilder.bridge);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final BridgeMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11208, new Class[]{ProtoReader.class}, BridgeMessage.class)) {
                return (BridgeMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11208, new Class[]{ProtoReader.class}, BridgeMessage.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.common((Common) Common.ADAPTER.decode(protoReader2));
                            break;
                        case 2:
                            builder.bridge((BridgeData) BridgeData.ADAPTER.decode(protoReader2));
                            break;
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

        public final void encode(ProtoWriter protoWriter, BridgeMessage bridgeMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            BridgeMessage bridgeMessage2 = bridgeMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, bridgeMessage2}, this, changeQuickRedirect, false, 11207, new Class[]{ProtoWriter.class, BridgeMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, bridgeMessage2}, this, changeQuickRedirect, false, 11207, new Class[]{ProtoWriter.class, BridgeMessage.class}, Void.TYPE);
                return;
            }
            if (bridgeMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, bridgeMessage2.common);
            }
            if (bridgeMessage2.bridge != null) {
                BridgeData.ADAPTER.encodeWithTag(protoWriter2, 2, bridgeMessage2.bridge);
            }
            protoWriter2.writeBytes(bridgeMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11201, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11201, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.bridge = this.bridge;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11203, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11203, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.bridge != null) {
                i2 = this.bridge.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11204, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11204, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.bridge != null) {
            sb.append(", bridge=");
            sb.append(this.bridge);
        }
        StringBuilder replace = sb.replace(0, 2, "BridgeMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11202, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11202, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof BridgeMessage)) {
                return false;
            }
            BridgeMessage bridgeMessage = (BridgeMessage) obj;
            if (!unknownFields().equals(bridgeMessage.unknownFields()) || !Internal.equals(this.common, bridgeMessage.common) || !Internal.equals(this.bridge, bridgeMessage.bridge)) {
                return false;
            }
            return true;
        }
    }

    public BridgeMessage(Common common2, BridgeData bridgeData) {
        this(common2, bridgeData, ByteString.EMPTY);
    }

    public BridgeMessage(Common common2, BridgeData bridgeData, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.bridge = bridgeData;
    }
}
