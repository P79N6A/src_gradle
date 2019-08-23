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
import okio.ByteString;

public final class LiveShoppingMessage extends Message<LiveShoppingMessage, Builder> {
    public static final ProtoAdapter<LiveShoppingMessage> ADAPTER = new ProtoAdapter_LiveShoppingMessage();
    public static final MsgType DEFAULT_MSG_TYPE = MsgType.HAS_PROMOTIONS;
    public static final Long DEFAULT_PROMOTION_ID = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.LiveShoppingMessage$MsgType#ADAPTER", tag = 2)
    public final MsgType msg_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long promotion_id;

    public static final class Builder extends Message.Builder<LiveShoppingMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public MsgType msg_type;
        public Long promotion_id;

        public final LiveShoppingMessage build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11737, new Class[0], LiveShoppingMessage.class)) {
                return new LiveShoppingMessage(this.common, this.msg_type, this.promotion_id, super.buildUnknownFields());
            }
            return (LiveShoppingMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11737, new Class[0], LiveShoppingMessage.class);
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder msg_type(MsgType msgType) {
            this.msg_type = msgType;
            return this;
        }

        public final Builder promotion_id(Long l) {
            this.promotion_id = l;
            return this;
        }
    }

    public enum MsgType implements WireEnum {
        HAS_PROMOTIONS(0),
        NO_PROMOTIONS(1),
        SET_CURRENT_PROMOTION(2),
        CANCEL_CURRENT_PROMOTION(3);
        
        public static final ProtoAdapter<MsgType> ADAPTER = null;
        public static ChangeQuickRedirect changeQuickRedirect;
        private final int value;

        public final int getValue() {
            return this.value;
        }

        static {
            ADAPTER = ProtoAdapter.newEnumAdapter(MsgType.class);
        }

        public static MsgType fromValue(int i) {
            switch (i) {
                case 0:
                    return HAS_PROMOTIONS;
                case 1:
                    return NO_PROMOTIONS;
                case 2:
                    return SET_CURRENT_PROMOTION;
                case 3:
                    return CANCEL_CURRENT_PROMOTION;
                default:
                    return null;
            }
        }

        private MsgType(int i) {
            this.value = i;
        }
    }

    static final class ProtoAdapter_LiveShoppingMessage extends ProtoAdapter<LiveShoppingMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_LiveShoppingMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, LiveShoppingMessage.class);
        }

        public final int encodedSize(LiveShoppingMessage liveShoppingMessage) {
            int i;
            int i2;
            LiveShoppingMessage liveShoppingMessage2 = liveShoppingMessage;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[]{liveShoppingMessage2}, this, changeQuickRedirect, false, 11740, new Class[]{LiveShoppingMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{liveShoppingMessage2}, this, changeQuickRedirect, false, 11740, new Class[]{LiveShoppingMessage.class}, Integer.TYPE)).intValue();
            }
            if (liveShoppingMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, liveShoppingMessage2.common);
            } else {
                i = 0;
            }
            if (liveShoppingMessage2.msg_type != null) {
                i2 = MsgType.ADAPTER.encodedSizeWithTag(2, liveShoppingMessage2.msg_type);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (liveShoppingMessage2.promotion_id != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, liveShoppingMessage2.promotion_id);
            }
            return i4 + i3 + liveShoppingMessage.unknownFields().size();
        }

        public final LiveShoppingMessage redact(LiveShoppingMessage liveShoppingMessage) {
            if (PatchProxy.isSupport(new Object[]{liveShoppingMessage}, this, changeQuickRedirect, false, 11743, new Class[]{LiveShoppingMessage.class}, LiveShoppingMessage.class)) {
                return (LiveShoppingMessage) PatchProxy.accessDispatch(new Object[]{liveShoppingMessage}, this, changeQuickRedirect, false, 11743, new Class[]{LiveShoppingMessage.class}, LiveShoppingMessage.class);
            }
            Builder newBuilder = liveShoppingMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final LiveShoppingMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11742, new Class[]{ProtoReader.class}, LiveShoppingMessage.class)) {
                return (LiveShoppingMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11742, new Class[]{ProtoReader.class}, LiveShoppingMessage.class);
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
                            try {
                                builder.msg_type((MsgType) MsgType.ADAPTER.decode(protoReader2));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 3:
                            builder.promotion_id((Long) ProtoAdapter.INT64.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, LiveShoppingMessage liveShoppingMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            LiveShoppingMessage liveShoppingMessage2 = liveShoppingMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, liveShoppingMessage2}, this, changeQuickRedirect, false, 11741, new Class[]{ProtoWriter.class, LiveShoppingMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, liveShoppingMessage2}, this, changeQuickRedirect, false, 11741, new Class[]{ProtoWriter.class, LiveShoppingMessage.class}, Void.TYPE);
                return;
            }
            if (liveShoppingMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, liveShoppingMessage2.common);
            }
            if (liveShoppingMessage2.msg_type != null) {
                MsgType.ADAPTER.encodeWithTag(protoWriter2, 2, liveShoppingMessage2.msg_type);
            }
            if (liveShoppingMessage2.promotion_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, liveShoppingMessage2.promotion_id);
            }
            protoWriter2.writeBytes(liveShoppingMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11733, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11733, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.msg_type = this.msg_type;
        builder.promotion_id = this.promotion_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11735, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11735, new Class[0], Integer.TYPE)).intValue();
        }
        int i4 = this.hashCode;
        if (i4 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i5 = (hashCode + i) * 37;
            if (this.msg_type != null) {
                i2 = this.msg_type.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            if (this.promotion_id != null) {
                i3 = this.promotion_id.hashCode();
            }
            i4 = i6 + i3;
            this.hashCode = i4;
        }
        return i4;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11736, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11736, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.msg_type != null) {
            sb.append(", msg_type=");
            sb.append(this.msg_type);
        }
        if (this.promotion_id != null) {
            sb.append(", promotion_id=");
            sb.append(this.promotion_id);
        }
        StringBuilder replace = sb.replace(0, 2, "LiveShoppingMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11734, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11734, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof LiveShoppingMessage)) {
                return false;
            }
            LiveShoppingMessage liveShoppingMessage = (LiveShoppingMessage) obj;
            if (!unknownFields().equals(liveShoppingMessage.unknownFields()) || !Internal.equals(this.common, liveShoppingMessage.common) || !Internal.equals(this.msg_type, liveShoppingMessage.msg_type) || !Internal.equals(this.promotion_id, liveShoppingMessage.promotion_id)) {
                return false;
            }
            return true;
        }
    }

    public LiveShoppingMessage(Common common2, MsgType msgType, Long l) {
        this(common2, msgType, l, ByteString.EMPTY);
    }

    public LiveShoppingMessage(Common common2, MsgType msgType, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.msg_type = msgType;
        this.promotion_id = l;
    }
}
