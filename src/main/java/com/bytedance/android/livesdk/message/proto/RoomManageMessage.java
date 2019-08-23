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
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.io.IOException;
import okio.ByteString;

public final class RoomManageMessage extends Message<RoomManageMessage, Builder> {
    public static final ProtoAdapter<RoomManageMessage> ADAPTER = new ProtoAdapter_RoomManageMessage();
    public static final Long DEFAULT_ACTION = 0L;
    public static final Long DEFAULT_DEVICE_ID = 0L;
    public static final Long DEFAULT_MEMBER_COUNT = 0L;
    public static final Long DEFAULT_POPULARITY = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long action;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String content;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 7)
    public final Long device_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long member_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long popularity;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String popularity_str;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 2)
    public final User user;

    public static final class Builder extends Message.Builder<RoomManageMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Long action;
        public Common common;
        public String content;
        public Long device_id;
        public Long member_count;
        public Long popularity;
        public String popularity_str;
        public User user;

        public final RoomManageMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12076, new Class[0], RoomManageMessage.class)) {
                return (RoomManageMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12076, new Class[0], RoomManageMessage.class);
            }
            RoomManageMessage roomManageMessage = new RoomManageMessage(this.common, this.user, this.action, this.member_count, this.popularity, this.popularity_str, this.device_id, this.content, super.buildUnknownFields());
            return roomManageMessage;
        }

        public final Builder action(Long l) {
            this.action = l;
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

        public final Builder device_id(Long l) {
            this.device_id = l;
            return this;
        }

        public final Builder member_count(Long l) {
            this.member_count = l;
            return this;
        }

        public final Builder popularity(Long l) {
            this.popularity = l;
            return this;
        }

        public final Builder popularity_str(String str) {
            this.popularity_str = str;
            return this;
        }

        public final Builder user(User user2) {
            this.user = user2;
            return this;
        }
    }

    static final class ProtoAdapter_RoomManageMessage extends ProtoAdapter<RoomManageMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_RoomManageMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, RoomManageMessage.class);
        }

        public final RoomManageMessage redact(RoomManageMessage roomManageMessage) {
            if (PatchProxy.isSupport(new Object[]{roomManageMessage}, this, changeQuickRedirect, false, 12080, new Class[]{RoomManageMessage.class}, RoomManageMessage.class)) {
                return (RoomManageMessage) PatchProxy.accessDispatch(new Object[]{roomManageMessage}, this, changeQuickRedirect, false, 12080, new Class[]{RoomManageMessage.class}, RoomManageMessage.class);
            }
            Builder newBuilder = roomManageMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.user != null) {
                newBuilder.user = (User) User.ADAPTER.redact(newBuilder.user);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final RoomManageMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12079, new Class[]{ProtoReader.class}, RoomManageMessage.class)) {
                return (RoomManageMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12079, new Class[]{ProtoReader.class}, RoomManageMessage.class);
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
                            builder.user((User) User.ADAPTER.decode(protoReader2));
                            break;
                        case 3:
                            builder.action((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.member_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 5:
                            builder.popularity((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 6:
                            builder.popularity_str((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case e.l /*7*/:
                            builder.device_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 8:
                            builder.content((String) ProtoAdapter.STRING.decode(protoReader2));
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

        public final int encodedSize(RoomManageMessage roomManageMessage) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            RoomManageMessage roomManageMessage2 = roomManageMessage;
            int i8 = 0;
            if (PatchProxy.isSupport(new Object[]{roomManageMessage2}, this, changeQuickRedirect, false, 12077, new Class[]{RoomManageMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{roomManageMessage2}, this, changeQuickRedirect, false, 12077, new Class[]{RoomManageMessage.class}, Integer.TYPE)).intValue();
            }
            if (roomManageMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, roomManageMessage2.common);
            } else {
                i = 0;
            }
            if (roomManageMessage2.user != null) {
                i2 = User.ADAPTER.encodedSizeWithTag(2, roomManageMessage2.user);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (roomManageMessage2.action != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, roomManageMessage2.action);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (roomManageMessage2.member_count != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, roomManageMessage2.member_count);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (roomManageMessage2.popularity != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, roomManageMessage2.popularity);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (roomManageMessage2.popularity_str != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, roomManageMessage2.popularity_str);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (roomManageMessage2.device_id != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, roomManageMessage2.device_id);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (roomManageMessage2.content != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(8, roomManageMessage2.content);
            }
            return i14 + i8 + roomManageMessage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, RoomManageMessage roomManageMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            RoomManageMessage roomManageMessage2 = roomManageMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, roomManageMessage2}, this, changeQuickRedirect, false, 12078, new Class[]{ProtoWriter.class, RoomManageMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, roomManageMessage2}, this, changeQuickRedirect, false, 12078, new Class[]{ProtoWriter.class, RoomManageMessage.class}, Void.TYPE);
                return;
            }
            if (roomManageMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, roomManageMessage2.common);
            }
            if (roomManageMessage2.user != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 2, roomManageMessage2.user);
            }
            if (roomManageMessage2.action != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, roomManageMessage2.action);
            }
            if (roomManageMessage2.member_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, roomManageMessage2.member_count);
            }
            if (roomManageMessage2.popularity != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 5, roomManageMessage2.popularity);
            }
            if (roomManageMessage2.popularity_str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 6, roomManageMessage2.popularity_str);
            }
            if (roomManageMessage2.device_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 7, roomManageMessage2.device_id);
            }
            if (roomManageMessage2.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 8, roomManageMessage2.content);
            }
            protoWriter2.writeBytes(roomManageMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12072, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12072, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.user = this.user;
        builder.action = this.action;
        builder.member_count = this.member_count;
        builder.popularity = this.popularity;
        builder.popularity_str = this.popularity_str;
        builder.device_id = this.device_id;
        builder.content = this.content;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12074, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12074, new Class[0], Integer.TYPE)).intValue();
        }
        int i9 = this.hashCode;
        if (i9 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i10 = (hashCode + i) * 37;
            if (this.user != null) {
                i2 = this.user.hashCode();
            } else {
                i2 = 0;
            }
            int i11 = (i10 + i2) * 37;
            if (this.action != null) {
                i3 = this.action.hashCode();
            } else {
                i3 = 0;
            }
            int i12 = (i11 + i3) * 37;
            if (this.member_count != null) {
                i4 = this.member_count.hashCode();
            } else {
                i4 = 0;
            }
            int i13 = (i12 + i4) * 37;
            if (this.popularity != null) {
                i5 = this.popularity.hashCode();
            } else {
                i5 = 0;
            }
            int i14 = (i13 + i5) * 37;
            if (this.popularity_str != null) {
                i6 = this.popularity_str.hashCode();
            } else {
                i6 = 0;
            }
            int i15 = (i14 + i6) * 37;
            if (this.device_id != null) {
                i7 = this.device_id.hashCode();
            } else {
                i7 = 0;
            }
            int i16 = (i15 + i7) * 37;
            if (this.content != null) {
                i8 = this.content.hashCode();
            }
            i9 = i16 + i8;
            this.hashCode = i9;
        }
        return i9;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12075, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12075, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        if (this.action != null) {
            sb.append(", action=");
            sb.append(this.action);
        }
        if (this.member_count != null) {
            sb.append(", member_count=");
            sb.append(this.member_count);
        }
        if (this.popularity != null) {
            sb.append(", popularity=");
            sb.append(this.popularity);
        }
        if (this.popularity_str != null) {
            sb.append(", popularity_str=");
            sb.append(this.popularity_str);
        }
        if (this.device_id != null) {
            sb.append(", device_id=");
            sb.append(this.device_id);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        StringBuilder replace = sb.replace(0, 2, "RoomManageMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12073, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12073, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof RoomManageMessage)) {
                return false;
            }
            RoomManageMessage roomManageMessage = (RoomManageMessage) obj;
            if (!unknownFields().equals(roomManageMessage.unknownFields()) || !Internal.equals(this.common, roomManageMessage.common) || !Internal.equals(this.user, roomManageMessage.user) || !Internal.equals(this.action, roomManageMessage.action) || !Internal.equals(this.member_count, roomManageMessage.member_count) || !Internal.equals(this.popularity, roomManageMessage.popularity) || !Internal.equals(this.popularity_str, roomManageMessage.popularity_str) || !Internal.equals(this.device_id, roomManageMessage.device_id) || !Internal.equals(this.content, roomManageMessage.content)) {
                return false;
            }
            return true;
        }
    }

    public RoomManageMessage(Common common2, User user2, Long l, Long l2, Long l3, String str, Long l4, String str2) {
        this(common2, user2, l, l2, l3, str, l4, str2, ByteString.EMPTY);
    }

    public RoomManageMessage(Common common2, User user2, Long l, Long l2, Long l3, String str, Long l4, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.user = user2;
        this.action = l;
        this.member_count = l2;
        this.popularity = l3;
        this.popularity_str = str;
        this.device_id = l4;
        this.content = str2;
    }
}
