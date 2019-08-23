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

public final class DoodleGiftMessage extends Message<DoodleGiftMessage, Builder> {
    public static final ProtoAdapter<DoodleGiftMessage> ADAPTER = new ProtoAdapter_DoodleGiftMessage();
    public static final Long DEFAULT_FAN_TICKET_COUNT = 0L;
    public static final Long DEFAULT_GIFT_ID = 0L;
    public static final Long DEFAULT_ROOM_FAN_TICKET_COUNT = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String compose;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long fan_ticket_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long gift_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 7)
    public final Long room_fan_ticket_count;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 5)
    public final User to_user;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 4)
    public final User user;

    public static final class Builder extends Message.Builder<DoodleGiftMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public String compose;
        public Long fan_ticket_count;
        public Long gift_id;
        public Long room_fan_ticket_count;
        public User to_user;
        public User user;

        public final DoodleGiftMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11342, new Class[0], DoodleGiftMessage.class)) {
                return (DoodleGiftMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11342, new Class[0], DoodleGiftMessage.class);
            }
            DoodleGiftMessage doodleGiftMessage = new DoodleGiftMessage(this.common, this.gift_id, this.fan_ticket_count, this.user, this.to_user, this.compose, this.room_fan_ticket_count, super.buildUnknownFields());
            return doodleGiftMessage;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder compose(String str) {
            this.compose = str;
            return this;
        }

        public final Builder fan_ticket_count(Long l) {
            this.fan_ticket_count = l;
            return this;
        }

        public final Builder gift_id(Long l) {
            this.gift_id = l;
            return this;
        }

        public final Builder room_fan_ticket_count(Long l) {
            this.room_fan_ticket_count = l;
            return this;
        }

        public final Builder to_user(User user2) {
            this.to_user = user2;
            return this;
        }

        public final Builder user(User user2) {
            this.user = user2;
            return this;
        }
    }

    static final class ProtoAdapter_DoodleGiftMessage extends ProtoAdapter<DoodleGiftMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_DoodleGiftMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, DoodleGiftMessage.class);
        }

        public final DoodleGiftMessage redact(DoodleGiftMessage doodleGiftMessage) {
            if (PatchProxy.isSupport(new Object[]{doodleGiftMessage}, this, changeQuickRedirect, false, 11346, new Class[]{DoodleGiftMessage.class}, DoodleGiftMessage.class)) {
                return (DoodleGiftMessage) PatchProxy.accessDispatch(new Object[]{doodleGiftMessage}, this, changeQuickRedirect, false, 11346, new Class[]{DoodleGiftMessage.class}, DoodleGiftMessage.class);
            }
            Builder newBuilder = doodleGiftMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.user != null) {
                newBuilder.user = (User) User.ADAPTER.redact(newBuilder.user);
            }
            if (newBuilder.to_user != null) {
                newBuilder.to_user = (User) User.ADAPTER.redact(newBuilder.to_user);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final DoodleGiftMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11345, new Class[]{ProtoReader.class}, DoodleGiftMessage.class)) {
                return (DoodleGiftMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11345, new Class[]{ProtoReader.class}, DoodleGiftMessage.class);
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
                            builder.gift_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 3:
                            builder.fan_ticket_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.user((User) User.ADAPTER.decode(protoReader2));
                            break;
                        case 5:
                            builder.to_user((User) User.ADAPTER.decode(protoReader2));
                            break;
                        case 6:
                            builder.compose((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case e.l /*7*/:
                            builder.room_fan_ticket_count((Long) ProtoAdapter.INT64.decode(protoReader2));
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

        public final int encodedSize(DoodleGiftMessage doodleGiftMessage) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            DoodleGiftMessage doodleGiftMessage2 = doodleGiftMessage;
            int i7 = 0;
            if (PatchProxy.isSupport(new Object[]{doodleGiftMessage2}, this, changeQuickRedirect, false, 11343, new Class[]{DoodleGiftMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{doodleGiftMessage2}, this, changeQuickRedirect, false, 11343, new Class[]{DoodleGiftMessage.class}, Integer.TYPE)).intValue();
            }
            if (doodleGiftMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, doodleGiftMessage2.common);
            } else {
                i = 0;
            }
            if (doodleGiftMessage2.gift_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, doodleGiftMessage2.gift_id);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (doodleGiftMessage2.fan_ticket_count != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, doodleGiftMessage2.fan_ticket_count);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (doodleGiftMessage2.user != null) {
                i4 = User.ADAPTER.encodedSizeWithTag(4, doodleGiftMessage2.user);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (doodleGiftMessage2.to_user != null) {
                i5 = User.ADAPTER.encodedSizeWithTag(5, doodleGiftMessage2.to_user);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (doodleGiftMessage2.compose != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, doodleGiftMessage2.compose);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (doodleGiftMessage2.room_fan_ticket_count != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, doodleGiftMessage2.room_fan_ticket_count);
            }
            return i12 + i7 + doodleGiftMessage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, DoodleGiftMessage doodleGiftMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            DoodleGiftMessage doodleGiftMessage2 = doodleGiftMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, doodleGiftMessage2}, this, changeQuickRedirect, false, 11344, new Class[]{ProtoWriter.class, DoodleGiftMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, doodleGiftMessage2}, this, changeQuickRedirect, false, 11344, new Class[]{ProtoWriter.class, DoodleGiftMessage.class}, Void.TYPE);
                return;
            }
            if (doodleGiftMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, doodleGiftMessage2.common);
            }
            if (doodleGiftMessage2.gift_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, doodleGiftMessage2.gift_id);
            }
            if (doodleGiftMessage2.fan_ticket_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, doodleGiftMessage2.fan_ticket_count);
            }
            if (doodleGiftMessage2.user != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 4, doodleGiftMessage2.user);
            }
            if (doodleGiftMessage2.to_user != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 5, doodleGiftMessage2.to_user);
            }
            if (doodleGiftMessage2.compose != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 6, doodleGiftMessage2.compose);
            }
            if (doodleGiftMessage2.room_fan_ticket_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 7, doodleGiftMessage2.room_fan_ticket_count);
            }
            protoWriter2.writeBytes(doodleGiftMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11338, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11338, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.gift_id = this.gift_id;
        builder.fan_ticket_count = this.fan_ticket_count;
        builder.user = this.user;
        builder.to_user = this.to_user;
        builder.compose = this.compose;
        builder.room_fan_ticket_count = this.room_fan_ticket_count;
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
        int i7 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11340, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11340, new Class[0], Integer.TYPE)).intValue();
        }
        int i8 = this.hashCode;
        if (i8 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i9 = (hashCode + i) * 37;
            if (this.gift_id != null) {
                i2 = this.gift_id.hashCode();
            } else {
                i2 = 0;
            }
            int i10 = (i9 + i2) * 37;
            if (this.fan_ticket_count != null) {
                i3 = this.fan_ticket_count.hashCode();
            } else {
                i3 = 0;
            }
            int i11 = (i10 + i3) * 37;
            if (this.user != null) {
                i4 = this.user.hashCode();
            } else {
                i4 = 0;
            }
            int i12 = (i11 + i4) * 37;
            if (this.to_user != null) {
                i5 = this.to_user.hashCode();
            } else {
                i5 = 0;
            }
            int i13 = (i12 + i5) * 37;
            if (this.compose != null) {
                i6 = this.compose.hashCode();
            } else {
                i6 = 0;
            }
            int i14 = (i13 + i6) * 37;
            if (this.room_fan_ticket_count != null) {
                i7 = this.room_fan_ticket_count.hashCode();
            }
            i8 = i14 + i7;
            this.hashCode = i8;
        }
        return i8;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11341, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11341, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.gift_id != null) {
            sb.append(", gift_id=");
            sb.append(this.gift_id);
        }
        if (this.fan_ticket_count != null) {
            sb.append(", fan_ticket_count=");
            sb.append(this.fan_ticket_count);
        }
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        if (this.to_user != null) {
            sb.append(", to_user=");
            sb.append(this.to_user);
        }
        if (this.compose != null) {
            sb.append(", compose=");
            sb.append(this.compose);
        }
        if (this.room_fan_ticket_count != null) {
            sb.append(", room_fan_ticket_count=");
            sb.append(this.room_fan_ticket_count);
        }
        StringBuilder replace = sb.replace(0, 2, "DoodleGiftMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11339, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11339, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof DoodleGiftMessage)) {
                return false;
            }
            DoodleGiftMessage doodleGiftMessage = (DoodleGiftMessage) obj;
            if (!unknownFields().equals(doodleGiftMessage.unknownFields()) || !Internal.equals(this.common, doodleGiftMessage.common) || !Internal.equals(this.gift_id, doodleGiftMessage.gift_id) || !Internal.equals(this.fan_ticket_count, doodleGiftMessage.fan_ticket_count) || !Internal.equals(this.user, doodleGiftMessage.user) || !Internal.equals(this.to_user, doodleGiftMessage.to_user) || !Internal.equals(this.compose, doodleGiftMessage.compose) || !Internal.equals(this.room_fan_ticket_count, doodleGiftMessage.room_fan_ticket_count)) {
                return false;
            }
            return true;
        }
    }

    public DoodleGiftMessage(Common common2, Long l, Long l2, User user2, User user3, String str, Long l3) {
        this(common2, l, l2, user2, user3, str, l3, ByteString.EMPTY);
    }

    public DoodleGiftMessage(Common common2, Long l, Long l2, User user2, User user3, String str, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.gift_id = l;
        this.fan_ticket_count = l2;
        this.user = user2;
        this.to_user = user3;
        this.compose = str;
        this.room_fan_ticket_count = l3;
    }
}
