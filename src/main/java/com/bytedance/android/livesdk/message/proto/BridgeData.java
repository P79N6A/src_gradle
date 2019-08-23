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

public final class BridgeData extends Message<BridgeData, Builder> {
    public static final ProtoAdapter<BridgeData> ADAPTER = new ProtoAdapter_BridgeData();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String bridge_message_json;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;

    public static final class Builder extends Message.Builder<BridgeData, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String bridge_message_json;
        public Common common;

        public final BridgeData build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11196, new Class[0], BridgeData.class)) {
                return new BridgeData(this.common, this.bridge_message_json, super.buildUnknownFields());
            }
            return (BridgeData) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11196, new Class[0], BridgeData.class);
        }

        public final Builder bridge_message_json(String str) {
            this.bridge_message_json = str;
            return this;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }
    }

    static final class ProtoAdapter_BridgeData extends ProtoAdapter<BridgeData> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_BridgeData() {
            super(FieldEncoding.LENGTH_DELIMITED, BridgeData.class);
        }

        public final int encodedSize(BridgeData bridgeData) {
            int i;
            BridgeData bridgeData2 = bridgeData;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{bridgeData2}, this, changeQuickRedirect, false, 11197, new Class[]{BridgeData.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{bridgeData2}, this, changeQuickRedirect, false, 11197, new Class[]{BridgeData.class}, Integer.TYPE)).intValue();
            }
            if (bridgeData2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, bridgeData2.common);
            } else {
                i = 0;
            }
            if (bridgeData2.bridge_message_json != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, bridgeData2.bridge_message_json);
            }
            return i + i2 + bridgeData.unknownFields().size();
        }

        public final BridgeData redact(BridgeData bridgeData) {
            if (PatchProxy.isSupport(new Object[]{bridgeData}, this, changeQuickRedirect, false, 11200, new Class[]{BridgeData.class}, BridgeData.class)) {
                return (BridgeData) PatchProxy.accessDispatch(new Object[]{bridgeData}, this, changeQuickRedirect, false, 11200, new Class[]{BridgeData.class}, BridgeData.class);
            }
            Builder newBuilder = bridgeData.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final BridgeData decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11199, new Class[]{ProtoReader.class}, BridgeData.class)) {
                return (BridgeData) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11199, new Class[]{ProtoReader.class}, BridgeData.class);
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
                            builder.bridge_message_json((String) ProtoAdapter.STRING.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, BridgeData bridgeData) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            BridgeData bridgeData2 = bridgeData;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, bridgeData2}, this, changeQuickRedirect, false, 11198, new Class[]{ProtoWriter.class, BridgeData.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, bridgeData2}, this, changeQuickRedirect, false, 11198, new Class[]{ProtoWriter.class, BridgeData.class}, Void.TYPE);
                return;
            }
            if (bridgeData2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, bridgeData2.common);
            }
            if (bridgeData2.bridge_message_json != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, bridgeData2.bridge_message_json);
            }
            protoWriter2.writeBytes(bridgeData.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11192, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11192, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.bridge_message_json = this.bridge_message_json;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11194, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11194, new Class[0], Integer.TYPE)).intValue();
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
            if (this.bridge_message_json != null) {
                i2 = this.bridge_message_json.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11195, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11195, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.bridge_message_json != null) {
            sb.append(", bridge_message_json=");
            sb.append(this.bridge_message_json);
        }
        StringBuilder replace = sb.replace(0, 2, "BridgeData{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11193, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11193, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof BridgeData)) {
                return false;
            }
            BridgeData bridgeData = (BridgeData) obj;
            if (!unknownFields().equals(bridgeData.unknownFields()) || !Internal.equals(this.common, bridgeData.common) || !Internal.equals(this.bridge_message_json, bridgeData.bridge_message_json)) {
                return false;
            }
            return true;
        }
    }

    public BridgeData(Common common2, String str) {
        this(common2, str, ByteString.EMPTY);
    }

    public BridgeData(Common common2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.bridge_message_json = str;
    }
}
