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

public final class RoomVerifyMessage extends Message<RoomVerifyMessage, Builder> {
    public static final ProtoAdapter<RoomVerifyMessage> ADAPTER = new ProtoAdapter_RoomVerifyMessage();
    public static final Integer DEFAULT_ACTION = 0;
    public static final Boolean DEFAULT_CLOSE_ROOM = Boolean.FALSE;
    public static final Long DEFAULT_NOTICE_TYPE = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer action;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 5)
    public final Boolean close_room;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String content;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long notice_type;

    public static final class Builder extends Message.Builder<RoomVerifyMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer action;
        public Boolean close_room;
        public Common common;
        public String content;
        public Long notice_type;

        public final RoomVerifyMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12123, new Class[0], RoomVerifyMessage.class)) {
                return (RoomVerifyMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12123, new Class[0], RoomVerifyMessage.class);
            }
            RoomVerifyMessage roomVerifyMessage = new RoomVerifyMessage(this.common, this.action, this.content, this.notice_type, this.close_room, super.buildUnknownFields());
            return roomVerifyMessage;
        }

        public final Builder action(Integer num) {
            this.action = num;
            return this;
        }

        public final Builder close_room(Boolean bool) {
            this.close_room = bool;
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

        public final Builder notice_type(Long l) {
            this.notice_type = l;
            return this;
        }
    }

    static final class ProtoAdapter_RoomVerifyMessage extends ProtoAdapter<RoomVerifyMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_RoomVerifyMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, RoomVerifyMessage.class);
        }

        public final RoomVerifyMessage redact(RoomVerifyMessage roomVerifyMessage) {
            if (PatchProxy.isSupport(new Object[]{roomVerifyMessage}, this, changeQuickRedirect, false, 12127, new Class[]{RoomVerifyMessage.class}, RoomVerifyMessage.class)) {
                return (RoomVerifyMessage) PatchProxy.accessDispatch(new Object[]{roomVerifyMessage}, this, changeQuickRedirect, false, 12127, new Class[]{RoomVerifyMessage.class}, RoomVerifyMessage.class);
            }
            Builder newBuilder = roomVerifyMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final RoomVerifyMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12126, new Class[]{ProtoReader.class}, RoomVerifyMessage.class)) {
                return (RoomVerifyMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12126, new Class[]{ProtoReader.class}, RoomVerifyMessage.class);
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
                            builder.action((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 3:
                            builder.content((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 4:
                            builder.notice_type((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 5:
                            builder.close_room((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
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

        public final int encodedSize(RoomVerifyMessage roomVerifyMessage) {
            int i;
            int i2;
            int i3;
            int i4;
            RoomVerifyMessage roomVerifyMessage2 = roomVerifyMessage;
            int i5 = 0;
            if (PatchProxy.isSupport(new Object[]{roomVerifyMessage2}, this, changeQuickRedirect, false, 12124, new Class[]{RoomVerifyMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{roomVerifyMessage2}, this, changeQuickRedirect, false, 12124, new Class[]{RoomVerifyMessage.class}, Integer.TYPE)).intValue();
            }
            if (roomVerifyMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, roomVerifyMessage2.common);
            } else {
                i = 0;
            }
            if (roomVerifyMessage2.action != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, roomVerifyMessage2.action);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (roomVerifyMessage2.content != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, roomVerifyMessage2.content);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (roomVerifyMessage2.notice_type != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, roomVerifyMessage2.notice_type);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (roomVerifyMessage2.close_room != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, roomVerifyMessage2.close_room);
            }
            return i8 + i5 + roomVerifyMessage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, RoomVerifyMessage roomVerifyMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            RoomVerifyMessage roomVerifyMessage2 = roomVerifyMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, roomVerifyMessage2}, this, changeQuickRedirect, false, 12125, new Class[]{ProtoWriter.class, RoomVerifyMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, roomVerifyMessage2}, this, changeQuickRedirect, false, 12125, new Class[]{ProtoWriter.class, RoomVerifyMessage.class}, Void.TYPE);
                return;
            }
            if (roomVerifyMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, roomVerifyMessage2.common);
            }
            if (roomVerifyMessage2.action != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, roomVerifyMessage2.action);
            }
            if (roomVerifyMessage2.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, roomVerifyMessage2.content);
            }
            if (roomVerifyMessage2.notice_type != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, roomVerifyMessage2.notice_type);
            }
            if (roomVerifyMessage2.close_room != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 5, roomVerifyMessage2.close_room);
            }
            protoWriter2.writeBytes(roomVerifyMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12119, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12119, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.action = this.action;
        builder.content = this.content;
        builder.notice_type = this.notice_type;
        builder.close_room = this.close_room;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12121, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12121, new Class[0], Integer.TYPE)).intValue();
        }
        int i6 = this.hashCode;
        if (i6 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i7 = (hashCode + i) * 37;
            if (this.action != null) {
                i2 = this.action.hashCode();
            } else {
                i2 = 0;
            }
            int i8 = (i7 + i2) * 37;
            if (this.content != null) {
                i3 = this.content.hashCode();
            } else {
                i3 = 0;
            }
            int i9 = (i8 + i3) * 37;
            if (this.notice_type != null) {
                i4 = this.notice_type.hashCode();
            } else {
                i4 = 0;
            }
            int i10 = (i9 + i4) * 37;
            if (this.close_room != null) {
                i5 = this.close_room.hashCode();
            }
            i6 = i10 + i5;
            this.hashCode = i6;
        }
        return i6;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12122, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12122, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.action != null) {
            sb.append(", action=");
            sb.append(this.action);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.notice_type != null) {
            sb.append(", notice_type=");
            sb.append(this.notice_type);
        }
        if (this.close_room != null) {
            sb.append(", close_room=");
            sb.append(this.close_room);
        }
        StringBuilder replace = sb.replace(0, 2, "RoomVerifyMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12120, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12120, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof RoomVerifyMessage)) {
                return false;
            }
            RoomVerifyMessage roomVerifyMessage = (RoomVerifyMessage) obj;
            if (!unknownFields().equals(roomVerifyMessage.unknownFields()) || !Internal.equals(this.common, roomVerifyMessage.common) || !Internal.equals(this.action, roomVerifyMessage.action) || !Internal.equals(this.content, roomVerifyMessage.content) || !Internal.equals(this.notice_type, roomVerifyMessage.notice_type) || !Internal.equals(this.close_room, roomVerifyMessage.close_room)) {
                return false;
            }
            return true;
        }
    }

    public RoomVerifyMessage(Common common2, Integer num, String str, Long l, Boolean bool) {
        this(common2, num, str, l, bool, ByteString.EMPTY);
    }

    public RoomVerifyMessage(Common common2, Integer num, String str, Long l, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.action = num;
        this.content = str;
        this.notice_type = l;
        this.close_room = bool;
    }
}
