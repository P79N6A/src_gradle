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

public final class InRoomBannerMessage extends Message<InRoomBannerMessage, Builder> {
    public static final ProtoAdapter<InRoomBannerMessage> ADAPTER = new ProtoAdapter_InRoomBannerMessage();
    public static final PositionType DEFAULT_POSITION = PositionType.Undefined;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String extra;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.InRoomBannerMessage$PositionType#ADAPTER", tag = 3)
    public final PositionType position;

    public static final class Builder extends Message.Builder<InRoomBannerMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public String extra;
        public PositionType position;

        public final InRoomBannerMessage build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11591, new Class[0], InRoomBannerMessage.class)) {
                return new InRoomBannerMessage(this.common, this.extra, this.position, super.buildUnknownFields());
            }
            return (InRoomBannerMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11591, new Class[0], InRoomBannerMessage.class);
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder extra(String str) {
            this.extra = str;
            return this;
        }

        public final Builder position(PositionType positionType) {
            this.position = positionType;
            return this;
        }
    }

    public enum PositionType implements WireEnum {
        Undefined(0),
        BOTTOM_RIGHT(1),
        TOP_RIGHT(2),
        TOP_LEFT(3),
        BOTTOM_LEFT(4);
        
        public static final ProtoAdapter<PositionType> ADAPTER = null;
        public static ChangeQuickRedirect changeQuickRedirect;
        private final int value;

        public final int getValue() {
            return this.value;
        }

        static {
            ADAPTER = ProtoAdapter.newEnumAdapter(PositionType.class);
        }

        public static PositionType fromValue(int i) {
            switch (i) {
                case 0:
                    return Undefined;
                case 1:
                    return BOTTOM_RIGHT;
                case 2:
                    return TOP_RIGHT;
                case 3:
                    return TOP_LEFT;
                case 4:
                    return BOTTOM_LEFT;
                default:
                    return null;
            }
        }

        private PositionType(int i) {
            this.value = i;
        }
    }

    static final class ProtoAdapter_InRoomBannerMessage extends ProtoAdapter<InRoomBannerMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_InRoomBannerMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, InRoomBannerMessage.class);
        }

        public final int encodedSize(InRoomBannerMessage inRoomBannerMessage) {
            int i;
            int i2;
            InRoomBannerMessage inRoomBannerMessage2 = inRoomBannerMessage;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[]{inRoomBannerMessage2}, this, changeQuickRedirect, false, 11594, new Class[]{InRoomBannerMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{inRoomBannerMessage2}, this, changeQuickRedirect, false, 11594, new Class[]{InRoomBannerMessage.class}, Integer.TYPE)).intValue();
            }
            if (inRoomBannerMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, inRoomBannerMessage2.common);
            } else {
                i = 0;
            }
            if (inRoomBannerMessage2.extra != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, inRoomBannerMessage2.extra);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (inRoomBannerMessage2.position != null) {
                i3 = PositionType.ADAPTER.encodedSizeWithTag(3, inRoomBannerMessage2.position);
            }
            return i4 + i3 + inRoomBannerMessage.unknownFields().size();
        }

        public final InRoomBannerMessage redact(InRoomBannerMessage inRoomBannerMessage) {
            if (PatchProxy.isSupport(new Object[]{inRoomBannerMessage}, this, changeQuickRedirect, false, 11597, new Class[]{InRoomBannerMessage.class}, InRoomBannerMessage.class)) {
                return (InRoomBannerMessage) PatchProxy.accessDispatch(new Object[]{inRoomBannerMessage}, this, changeQuickRedirect, false, 11597, new Class[]{InRoomBannerMessage.class}, InRoomBannerMessage.class);
            }
            Builder newBuilder = inRoomBannerMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final InRoomBannerMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11596, new Class[]{ProtoReader.class}, InRoomBannerMessage.class)) {
                return (InRoomBannerMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11596, new Class[]{ProtoReader.class}, InRoomBannerMessage.class);
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
                            builder.extra((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            try {
                                builder.position((PositionType) PositionType.ADAPTER.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, InRoomBannerMessage inRoomBannerMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            InRoomBannerMessage inRoomBannerMessage2 = inRoomBannerMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, inRoomBannerMessage2}, this, changeQuickRedirect, false, 11595, new Class[]{ProtoWriter.class, InRoomBannerMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, inRoomBannerMessage2}, this, changeQuickRedirect, false, 11595, new Class[]{ProtoWriter.class, InRoomBannerMessage.class}, Void.TYPE);
                return;
            }
            if (inRoomBannerMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, inRoomBannerMessage2.common);
            }
            if (inRoomBannerMessage2.extra != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, inRoomBannerMessage2.extra);
            }
            if (inRoomBannerMessage2.position != null) {
                PositionType.ADAPTER.encodeWithTag(protoWriter2, 3, inRoomBannerMessage2.position);
            }
            protoWriter2.writeBytes(inRoomBannerMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11587, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11587, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.extra = this.extra;
        builder.position = this.position;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11589, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11589, new Class[0], Integer.TYPE)).intValue();
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
            if (this.extra != null) {
                i2 = this.extra.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            if (this.position != null) {
                i3 = this.position.hashCode();
            }
            i4 = i6 + i3;
            this.hashCode = i4;
        }
        return i4;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11590, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11590, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        StringBuilder replace = sb.replace(0, 2, "InRoomBannerMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11588, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11588, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof InRoomBannerMessage)) {
                return false;
            }
            InRoomBannerMessage inRoomBannerMessage = (InRoomBannerMessage) obj;
            if (!unknownFields().equals(inRoomBannerMessage.unknownFields()) || !Internal.equals(this.common, inRoomBannerMessage.common) || !Internal.equals(this.extra, inRoomBannerMessage.extra) || !Internal.equals(this.position, inRoomBannerMessage.position)) {
                return false;
            }
            return true;
        }
    }

    public InRoomBannerMessage(Common common2, String str, PositionType positionType) {
        this(common2, str, positionType, ByteString.EMPTY);
    }

    public InRoomBannerMessage(Common common2, String str, PositionType positionType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.extra = str;
        this.position = positionType;
    }
}
