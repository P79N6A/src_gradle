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

public final class RushRedPacketMessage extends Message<RushRedPacketMessage, Builder> {
    public static final ProtoAdapter<RushRedPacketMessage> ADAPTER = new ProtoAdapter_RushRedPacketMessage();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.RedPacketRushRecord#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<RedPacketRushRecord> red_packet_rush_records;

    public static final class Builder extends Message.Builder<RushRedPacketMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public List<RedPacketRushRecord> red_packet_rush_records = Internal.newMutableList();

        public final RushRedPacketMessage build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12133, new Class[0], RushRedPacketMessage.class)) {
                return new RushRedPacketMessage(this.common, this.red_packet_rush_records, super.buildUnknownFields());
            }
            return (RushRedPacketMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12133, new Class[0], RushRedPacketMessage.class);
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder red_packet_rush_records(List<RedPacketRushRecord> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 12132, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 12132, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.red_packet_rush_records = list;
            return this;
        }
    }

    static final class ProtoAdapter_RushRedPacketMessage extends ProtoAdapter<RushRedPacketMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_RushRedPacketMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, RushRedPacketMessage.class);
        }

        public final int encodedSize(RushRedPacketMessage rushRedPacketMessage) {
            RushRedPacketMessage rushRedPacketMessage2 = rushRedPacketMessage;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{rushRedPacketMessage2}, this, changeQuickRedirect, false, 12134, new Class[]{RushRedPacketMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{rushRedPacketMessage2}, this, changeQuickRedirect, false, 12134, new Class[]{RushRedPacketMessage.class}, Integer.TYPE)).intValue();
            }
            if (rushRedPacketMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, rushRedPacketMessage2.common);
            }
            return i + RedPacketRushRecord.ADAPTER.asRepeated().encodedSizeWithTag(2, rushRedPacketMessage2.red_packet_rush_records) + rushRedPacketMessage.unknownFields().size();
        }

        public final RushRedPacketMessage redact(RushRedPacketMessage rushRedPacketMessage) {
            if (PatchProxy.isSupport(new Object[]{rushRedPacketMessage}, this, changeQuickRedirect, false, 12137, new Class[]{RushRedPacketMessage.class}, RushRedPacketMessage.class)) {
                return (RushRedPacketMessage) PatchProxy.accessDispatch(new Object[]{rushRedPacketMessage}, this, changeQuickRedirect, false, 12137, new Class[]{RushRedPacketMessage.class}, RushRedPacketMessage.class);
            }
            Builder newBuilder = rushRedPacketMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            Internal.redactElements(newBuilder.red_packet_rush_records, RedPacketRushRecord.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final RushRedPacketMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12136, new Class[]{ProtoReader.class}, RushRedPacketMessage.class)) {
                return (RushRedPacketMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12136, new Class[]{ProtoReader.class}, RushRedPacketMessage.class);
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
                            builder.red_packet_rush_records.add(RedPacketRushRecord.ADAPTER.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, RushRedPacketMessage rushRedPacketMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            RushRedPacketMessage rushRedPacketMessage2 = rushRedPacketMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, rushRedPacketMessage2}, this, changeQuickRedirect, false, 12135, new Class[]{ProtoWriter.class, RushRedPacketMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, rushRedPacketMessage2}, this, changeQuickRedirect, false, 12135, new Class[]{ProtoWriter.class, RushRedPacketMessage.class}, Void.TYPE);
                return;
            }
            if (rushRedPacketMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, rushRedPacketMessage2.common);
            }
            RedPacketRushRecord.ADAPTER.asRepeated().encodeWithTag(protoWriter2, 2, rushRedPacketMessage2.red_packet_rush_records);
            protoWriter2.writeBytes(rushRedPacketMessage.unknownFields());
        }
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12130, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12130, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            }
            i2 = ((hashCode + i) * 37) + this.red_packet_rush_records.hashCode();
            this.hashCode = i2;
        }
        return i2;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12128, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12128, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.red_packet_rush_records = Internal.copyOf("red_packet_rush_records", this.red_packet_rush_records);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12131, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12131, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (!this.red_packet_rush_records.isEmpty()) {
            sb.append(", red_packet_rush_records=");
            sb.append(this.red_packet_rush_records);
        }
        StringBuilder replace = sb.replace(0, 2, "RushRedPacketMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12129, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12129, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof RushRedPacketMessage)) {
                return false;
            }
            RushRedPacketMessage rushRedPacketMessage = (RushRedPacketMessage) obj;
            if (!unknownFields().equals(rushRedPacketMessage.unknownFields()) || !Internal.equals(this.common, rushRedPacketMessage.common) || !this.red_packet_rush_records.equals(rushRedPacketMessage.red_packet_rush_records)) {
                return false;
            }
            return true;
        }
    }

    public RushRedPacketMessage(Common common2, List<RedPacketRushRecord> list) {
        this(common2, list, ByteString.EMPTY);
    }

    public RushRedPacketMessage(Common common2, List<RedPacketRushRecord> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.red_packet_rush_records = Internal.immutableCopyOf("red_packet_rush_records", list);
    }
}
