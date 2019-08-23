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

public final class RoomImgMessage extends Message<RoomImgMessage, Builder> {
    public static final ProtoAdapter<RoomImgMessage> ADAPTER = new ProtoAdapter_RoomImgMessage();
    public static final Long DEFAULT_ACTION = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long action;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String bg_img_url;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String content;

    public static final class Builder extends Message.Builder<RoomImgMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Long action;
        public String bg_img_url;
        public Common common;
        public String content;

        public final RoomImgMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12067, new Class[0], RoomImgMessage.class)) {
                return (RoomImgMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12067, new Class[0], RoomImgMessage.class);
            }
            RoomImgMessage roomImgMessage = new RoomImgMessage(this.common, this.content, this.action, this.bg_img_url, super.buildUnknownFields());
            return roomImgMessage;
        }

        public final Builder action(Long l) {
            this.action = l;
            return this;
        }

        public final Builder bg_img_url(String str) {
            this.bg_img_url = str;
            return this;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }
    }

    static final class ProtoAdapter_RoomImgMessage extends ProtoAdapter<RoomImgMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_RoomImgMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, RoomImgMessage.class);
        }

        public final RoomImgMessage redact(RoomImgMessage roomImgMessage) {
            if (PatchProxy.isSupport(new Object[]{roomImgMessage}, this, changeQuickRedirect, false, 12071, new Class[]{RoomImgMessage.class}, RoomImgMessage.class)) {
                return (RoomImgMessage) PatchProxy.accessDispatch(new Object[]{roomImgMessage}, this, changeQuickRedirect, false, 12071, new Class[]{RoomImgMessage.class}, RoomImgMessage.class);
            }
            Builder newBuilder = roomImgMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final RoomImgMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12070, new Class[]{ProtoReader.class}, RoomImgMessage.class)) {
                return (RoomImgMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12070, new Class[]{ProtoReader.class}, RoomImgMessage.class);
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
                            builder.action((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.bg_img_url((String) ProtoAdapter.STRING.decode(protoReader2));
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

        public final int encodedSize(RoomImgMessage roomImgMessage) {
            int i;
            int i2;
            int i3;
            RoomImgMessage roomImgMessage2 = roomImgMessage;
            int i4 = 0;
            if (PatchProxy.isSupport(new Object[]{roomImgMessage2}, this, changeQuickRedirect, false, 12068, new Class[]{RoomImgMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{roomImgMessage2}, this, changeQuickRedirect, false, 12068, new Class[]{RoomImgMessage.class}, Integer.TYPE)).intValue();
            }
            if (roomImgMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, roomImgMessage2.common);
            } else {
                i = 0;
            }
            if (roomImgMessage2.content != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, roomImgMessage2.content);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (roomImgMessage2.action != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, roomImgMessage2.action);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (roomImgMessage2.bg_img_url != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, roomImgMessage2.bg_img_url);
            }
            return i6 + i4 + roomImgMessage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, RoomImgMessage roomImgMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            RoomImgMessage roomImgMessage2 = roomImgMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, roomImgMessage2}, this, changeQuickRedirect, false, 12069, new Class[]{ProtoWriter.class, RoomImgMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, roomImgMessage2}, this, changeQuickRedirect, false, 12069, new Class[]{ProtoWriter.class, RoomImgMessage.class}, Void.TYPE);
                return;
            }
            if (roomImgMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, roomImgMessage2.common);
            }
            if (roomImgMessage2.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, roomImgMessage2.content);
            }
            if (roomImgMessage2.action != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, roomImgMessage2.action);
            }
            if (roomImgMessage2.bg_img_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, roomImgMessage2.bg_img_url);
            }
            protoWriter2.writeBytes(roomImgMessage.unknownFields());
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12065, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12065, new Class[0], Integer.TYPE)).intValue();
        }
        int i5 = this.hashCode;
        if (i5 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i6 = (hashCode + i) * 37;
            if (this.content != null) {
                i2 = this.content.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 37;
            if (this.action != null) {
                i3 = this.action.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 37;
            if (this.bg_img_url != null) {
                i4 = this.bg_img_url.hashCode();
            }
            i5 = i8 + i4;
            this.hashCode = i5;
        }
        return i5;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12063, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12063, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.content = this.content;
        builder.action = this.action;
        builder.bg_img_url = this.bg_img_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12066, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12066, new Class[0], String.class);
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
        if (this.action != null) {
            sb.append(", action=");
            sb.append(this.action);
        }
        if (this.bg_img_url != null) {
            sb.append(", bg_img_url=");
            sb.append(this.bg_img_url);
        }
        StringBuilder replace = sb.replace(0, 2, "RoomImgMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12064, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12064, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof RoomImgMessage)) {
                return false;
            }
            RoomImgMessage roomImgMessage = (RoomImgMessage) obj;
            if (!unknownFields().equals(roomImgMessage.unknownFields()) || !Internal.equals(this.common, roomImgMessage.common) || !Internal.equals(this.content, roomImgMessage.content) || !Internal.equals(this.action, roomImgMessage.action) || !Internal.equals(this.bg_img_url, roomImgMessage.bg_img_url)) {
                return false;
            }
            return true;
        }
    }

    public RoomImgMessage(Common common2, String str, Long l, String str2) {
        this(common2, str, l, str2, ByteString.EMPTY);
    }

    public RoomImgMessage(Common common2, String str, Long l, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.content = str;
        this.action = l;
        this.bg_img_url = str2;
    }
}
