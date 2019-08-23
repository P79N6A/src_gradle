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
import java.util.List;
import okio.ByteString;

public final class CreateRedPacketMessage extends Message<CreateRedPacketMessage, Builder> {
    public static final ProtoAdapter<CreateRedPacketMessage> ADAPTER = new ProtoAdapter_CreateRedPacketMessage();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.RedPacket#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<RedPacket> red_packets;

    public static final class Builder extends Message.Builder<CreateRedPacketMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public List<RedPacket> red_packets = Internal.newMutableList();

        public final CreateRedPacketMessage build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11306, new Class[0], CreateRedPacketMessage.class)) {
                return new CreateRedPacketMessage(this.common, this.red_packets, super.buildUnknownFields());
            }
            return (CreateRedPacketMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11306, new Class[0], CreateRedPacketMessage.class);
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder red_packets(List<RedPacket> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 11305, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 11305, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.red_packets = list;
            return this;
        }
    }

    static final class ProtoAdapter_CreateRedPacketMessage extends ProtoAdapter<CreateRedPacketMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_CreateRedPacketMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateRedPacketMessage.class);
        }

        public final int encodedSize(CreateRedPacketMessage createRedPacketMessage) {
            CreateRedPacketMessage createRedPacketMessage2 = createRedPacketMessage;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{createRedPacketMessage2}, this, changeQuickRedirect, false, 11307, new Class[]{CreateRedPacketMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{createRedPacketMessage2}, this, changeQuickRedirect, false, 11307, new Class[]{CreateRedPacketMessage.class}, Integer.TYPE)).intValue();
            }
            if (createRedPacketMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, createRedPacketMessage2.common);
            }
            return i + RedPacket.ADAPTER.asRepeated().encodedSizeWithTag(2, createRedPacketMessage2.red_packets) + createRedPacketMessage.unknownFields().size();
        }

        public final CreateRedPacketMessage redact(CreateRedPacketMessage createRedPacketMessage) {
            if (PatchProxy.isSupport(new Object[]{createRedPacketMessage}, this, changeQuickRedirect, false, 11310, new Class[]{CreateRedPacketMessage.class}, CreateRedPacketMessage.class)) {
                return (CreateRedPacketMessage) PatchProxy.accessDispatch(new Object[]{createRedPacketMessage}, this, changeQuickRedirect, false, 11310, new Class[]{CreateRedPacketMessage.class}, CreateRedPacketMessage.class);
            }
            Builder newBuilder = createRedPacketMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            Internal.redactElements(newBuilder.red_packets, RedPacket.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final CreateRedPacketMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11309, new Class[]{ProtoReader.class}, CreateRedPacketMessage.class)) {
                return (CreateRedPacketMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11309, new Class[]{ProtoReader.class}, CreateRedPacketMessage.class);
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
                            builder.red_packets.add(RedPacket.ADAPTER.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, CreateRedPacketMessage createRedPacketMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            CreateRedPacketMessage createRedPacketMessage2 = createRedPacketMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, createRedPacketMessage2}, this, changeQuickRedirect, false, 11308, new Class[]{ProtoWriter.class, CreateRedPacketMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, createRedPacketMessage2}, this, changeQuickRedirect, false, 11308, new Class[]{ProtoWriter.class, CreateRedPacketMessage.class}, Void.TYPE);
                return;
            }
            if (createRedPacketMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, createRedPacketMessage2.common);
            }
            RedPacket.ADAPTER.asRepeated().encodeWithTag(protoWriter2, 2, createRedPacketMessage2.red_packets);
            protoWriter2.writeBytes(createRedPacketMessage.unknownFields());
        }
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11303, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11303, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            }
            i2 = ((hashCode + i) * 37) + this.red_packets.hashCode();
            this.hashCode = i2;
        }
        return i2;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11301, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11301, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.red_packets = Internal.copyOf("red_packets", this.red_packets);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11304, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11304, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (!this.red_packets.isEmpty()) {
            sb.append(", red_packets=");
            sb.append(this.red_packets);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateRedPacketMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11302, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11302, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof CreateRedPacketMessage)) {
                return false;
            }
            CreateRedPacketMessage createRedPacketMessage = (CreateRedPacketMessage) obj;
            if (!unknownFields().equals(createRedPacketMessage.unknownFields()) || !Internal.equals(this.common, createRedPacketMessage.common) || !this.red_packets.equals(createRedPacketMessage.red_packets)) {
                return false;
            }
            return true;
        }
    }

    public CreateRedPacketMessage(Common common2, List<RedPacket> list) {
        this(common2, list, ByteString.EMPTY);
    }

    public CreateRedPacketMessage(Common common2, List<RedPacket> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.red_packets = Internal.immutableCopyOf("red_packets", list);
    }
}
