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

public final class RoomStartMessage extends Message<RoomStartMessage, Builder> {
    public static final ProtoAdapter<RoomStartMessage> ADAPTER = new ProtoAdapter_RoomStartMessage();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String content;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String image_url;

    public static final class Builder extends Message.Builder<RoomStartMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public String content;
        public String image_url;

        public final RoomStartMessage build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12094, new Class[0], RoomStartMessage.class)) {
                return new RoomStartMessage(this.common, this.content, this.image_url, super.buildUnknownFields());
            }
            return (RoomStartMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12094, new Class[0], RoomStartMessage.class);
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder image_url(String str) {
            this.image_url = str;
            return this;
        }
    }

    static final class ProtoAdapter_RoomStartMessage extends ProtoAdapter<RoomStartMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_RoomStartMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, RoomStartMessage.class);
        }

        public final int encodedSize(RoomStartMessage roomStartMessage) {
            int i;
            int i2;
            RoomStartMessage roomStartMessage2 = roomStartMessage;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[]{roomStartMessage2}, this, changeQuickRedirect, false, 12095, new Class[]{RoomStartMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{roomStartMessage2}, this, changeQuickRedirect, false, 12095, new Class[]{RoomStartMessage.class}, Integer.TYPE)).intValue();
            }
            if (roomStartMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, roomStartMessage2.common);
            } else {
                i = 0;
            }
            if (roomStartMessage2.content != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, roomStartMessage2.content);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (roomStartMessage2.image_url != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, roomStartMessage2.image_url);
            }
            return i4 + i3 + roomStartMessage.unknownFields().size();
        }

        public final RoomStartMessage redact(RoomStartMessage roomStartMessage) {
            if (PatchProxy.isSupport(new Object[]{roomStartMessage}, this, changeQuickRedirect, false, 12098, new Class[]{RoomStartMessage.class}, RoomStartMessage.class)) {
                return (RoomStartMessage) PatchProxy.accessDispatch(new Object[]{roomStartMessage}, this, changeQuickRedirect, false, 12098, new Class[]{RoomStartMessage.class}, RoomStartMessage.class);
            }
            Builder newBuilder = roomStartMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final RoomStartMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12097, new Class[]{ProtoReader.class}, RoomStartMessage.class)) {
                return (RoomStartMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12097, new Class[]{ProtoReader.class}, RoomStartMessage.class);
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
                            builder.content((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder.image_url((String) ProtoAdapter.STRING.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, RoomStartMessage roomStartMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            RoomStartMessage roomStartMessage2 = roomStartMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, roomStartMessage2}, this, changeQuickRedirect, false, 12096, new Class[]{ProtoWriter.class, RoomStartMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, roomStartMessage2}, this, changeQuickRedirect, false, 12096, new Class[]{ProtoWriter.class, RoomStartMessage.class}, Void.TYPE);
                return;
            }
            if (roomStartMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, roomStartMessage2.common);
            }
            if (roomStartMessage2.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, roomStartMessage2.content);
            }
            if (roomStartMessage2.image_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, roomStartMessage2.image_url);
            }
            protoWriter2.writeBytes(roomStartMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12090, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12090, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.content = this.content;
        builder.image_url = this.image_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12092, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12092, new Class[0], Integer.TYPE)).intValue();
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
            if (this.content != null) {
                i2 = this.content.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            if (this.image_url != null) {
                i3 = this.image_url.hashCode();
            }
            i4 = i6 + i3;
            this.hashCode = i4;
        }
        return i4;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12093, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12093, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.image_url != null) {
            sb.append(", image_url=");
            sb.append(this.image_url);
        }
        StringBuilder replace = sb.replace(0, 2, "RoomStartMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12091, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12091, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof RoomStartMessage)) {
                return false;
            }
            RoomStartMessage roomStartMessage = (RoomStartMessage) obj;
            if (!unknownFields().equals(roomStartMessage.unknownFields()) || !Internal.equals(this.common, roomStartMessage.common) || !Internal.equals(this.content, roomStartMessage.content) || !Internal.equals(this.image_url, roomStartMessage.image_url)) {
                return false;
            }
            return true;
        }
    }

    public RoomStartMessage(Common common2, String str, String str2) {
        this(common2, str, str2, ByteString.EMPTY);
    }

    public RoomStartMessage(Common common2, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.content = str;
        this.image_url = str2;
    }
}
