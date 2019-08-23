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

public final class RedPacket extends Message<RedPacket, Builder> {
    public static final ProtoAdapter<RedPacket> ADAPTER = new ProtoAdapter_RedPacket();
    public static final Long DEFAULT_BONUS_COUNT = 0L;
    public static final Long DEFAULT_BONUS_TYPE = 0L;
    public static final Long DEFAULT_COMBO_COUNT = 0L;
    public static final Long DEFAULT_COUNT_DOWN = 0L;
    public static final Long DEFAULT_DISAPPEAR_TIME = 0L;
    public static final Long DEFAULT_RED_PACKET_GROUP_ID = 0L;
    public static final Long DEFAULT_RUSH_TIME = 0L;
    public static final Long DEFAULT_TOTAL_COUNT_DOWN = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long bonus_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long bonus_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long combo_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long count_down;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 8)
    public final Long disappear_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String icon_url;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 9)
    public final User owner;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long red_packet_group_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 11)
    public final String red_packet_source;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public final Long rush_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 10)
    public final Long total_count_down;

    public static final class Builder extends Message.Builder<RedPacket, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Long bonus_count;
        public Long bonus_type;
        public Long combo_count;
        public Long count_down;
        public Long disappear_time;
        public String icon_url;
        public User owner;
        public Long red_packet_group_id;
        public String red_packet_source;
        public Long rush_time;
        public Long total_count_down;

        public final RedPacket build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12039, new Class[0], RedPacket.class)) {
                return (RedPacket) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12039, new Class[0], RedPacket.class);
            }
            RedPacket redPacket = new RedPacket(this.red_packet_group_id, this.bonus_type, this.combo_count, this.bonus_count, this.count_down, this.rush_time, this.icon_url, this.disappear_time, this.owner, this.total_count_down, this.red_packet_source, super.buildUnknownFields());
            return redPacket;
        }

        public final Builder bonus_count(Long l) {
            this.bonus_count = l;
            return this;
        }

        public final Builder bonus_type(Long l) {
            this.bonus_type = l;
            return this;
        }

        public final Builder combo_count(Long l) {
            this.combo_count = l;
            return this;
        }

        public final Builder count_down(Long l) {
            this.count_down = l;
            return this;
        }

        public final Builder disappear_time(Long l) {
            this.disappear_time = l;
            return this;
        }

        public final Builder icon_url(String str) {
            this.icon_url = str;
            return this;
        }

        public final Builder owner(User user) {
            this.owner = user;
            return this;
        }

        public final Builder red_packet_group_id(Long l) {
            this.red_packet_group_id = l;
            return this;
        }

        public final Builder red_packet_source(String str) {
            this.red_packet_source = str;
            return this;
        }

        public final Builder rush_time(Long l) {
            this.rush_time = l;
            return this;
        }

        public final Builder total_count_down(Long l) {
            this.total_count_down = l;
            return this;
        }
    }

    static final class ProtoAdapter_RedPacket extends ProtoAdapter<RedPacket> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_RedPacket() {
            super(FieldEncoding.LENGTH_DELIMITED, RedPacket.class);
        }

        public final RedPacket redact(RedPacket redPacket) {
            if (PatchProxy.isSupport(new Object[]{redPacket}, this, changeQuickRedirect, false, 12043, new Class[]{RedPacket.class}, RedPacket.class)) {
                return (RedPacket) PatchProxy.accessDispatch(new Object[]{redPacket}, this, changeQuickRedirect, false, 12043, new Class[]{RedPacket.class}, RedPacket.class);
            }
            Builder newBuilder = redPacket.newBuilder();
            if (newBuilder.owner != null) {
                newBuilder.owner = (User) User.ADAPTER.redact(newBuilder.owner);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(RedPacket redPacket) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            RedPacket redPacket2 = redPacket;
            int i11 = 0;
            if (PatchProxy.isSupport(new Object[]{redPacket2}, this, changeQuickRedirect, false, 12040, new Class[]{RedPacket.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{redPacket2}, this, changeQuickRedirect, false, 12040, new Class[]{RedPacket.class}, Integer.TYPE)).intValue();
            }
            if (redPacket2.red_packet_group_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, redPacket2.red_packet_group_id);
            } else {
                i = 0;
            }
            if (redPacket2.bonus_type != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, redPacket2.bonus_type);
            } else {
                i2 = 0;
            }
            int i12 = i + i2;
            if (redPacket2.combo_count != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, redPacket2.combo_count);
            } else {
                i3 = 0;
            }
            int i13 = i12 + i3;
            if (redPacket2.bonus_count != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, redPacket2.bonus_count);
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            if (redPacket2.count_down != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, redPacket2.count_down);
            } else {
                i5 = 0;
            }
            int i15 = i14 + i5;
            if (redPacket2.rush_time != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, redPacket2.rush_time);
            } else {
                i6 = 0;
            }
            int i16 = i15 + i6;
            if (redPacket2.icon_url != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, redPacket2.icon_url);
            } else {
                i7 = 0;
            }
            int i17 = i16 + i7;
            if (redPacket2.disappear_time != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(8, redPacket2.disappear_time);
            } else {
                i8 = 0;
            }
            int i18 = i17 + i8;
            if (redPacket2.owner != null) {
                i9 = User.ADAPTER.encodedSizeWithTag(9, redPacket2.owner);
            } else {
                i9 = 0;
            }
            int i19 = i18 + i9;
            if (redPacket2.total_count_down != null) {
                i10 = ProtoAdapter.INT64.encodedSizeWithTag(10, redPacket2.total_count_down);
            } else {
                i10 = 0;
            }
            int i20 = i19 + i10;
            if (redPacket2.red_packet_source != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(11, redPacket2.red_packet_source);
            }
            return i20 + i11 + redPacket.unknownFields().size();
        }

        public final RedPacket decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12042, new Class[]{ProtoReader.class}, RedPacket.class)) {
                return (RedPacket) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12042, new Class[]{ProtoReader.class}, RedPacket.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.red_packet_group_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 2:
                            builder.bonus_type((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 3:
                            builder.combo_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.bonus_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 5:
                            builder.count_down((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 6:
                            builder.rush_time((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case e.l /*7*/:
                            builder.icon_url((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 8:
                            builder.disappear_time((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 9:
                            builder.owner((User) User.ADAPTER.decode(protoReader2));
                            break;
                        case 10:
                            builder.total_count_down((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 11:
                            builder.red_packet_source((String) ProtoAdapter.STRING.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, RedPacket redPacket) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            RedPacket redPacket2 = redPacket;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, redPacket2}, this, changeQuickRedirect, false, 12041, new Class[]{ProtoWriter.class, RedPacket.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, redPacket2}, this, changeQuickRedirect, false, 12041, new Class[]{ProtoWriter.class, RedPacket.class}, Void.TYPE);
                return;
            }
            if (redPacket2.red_packet_group_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, redPacket2.red_packet_group_id);
            }
            if (redPacket2.bonus_type != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, redPacket2.bonus_type);
            }
            if (redPacket2.combo_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, redPacket2.combo_count);
            }
            if (redPacket2.bonus_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, redPacket2.bonus_count);
            }
            if (redPacket2.count_down != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 5, redPacket2.count_down);
            }
            if (redPacket2.rush_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 6, redPacket2.rush_time);
            }
            if (redPacket2.icon_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 7, redPacket2.icon_url);
            }
            if (redPacket2.disappear_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 8, redPacket2.disappear_time);
            }
            if (redPacket2.owner != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 9, redPacket2.owner);
            }
            if (redPacket2.total_count_down != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 10, redPacket2.total_count_down);
            }
            if (redPacket2.red_packet_source != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 11, redPacket2.red_packet_source);
            }
            protoWriter2.writeBytes(redPacket.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12035, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12035, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.red_packet_group_id = this.red_packet_group_id;
        builder.bonus_type = this.bonus_type;
        builder.combo_count = this.combo_count;
        builder.bonus_count = this.bonus_count;
        builder.count_down = this.count_down;
        builder.rush_time = this.rush_time;
        builder.icon_url = this.icon_url;
        builder.disappear_time = this.disappear_time;
        builder.owner = this.owner;
        builder.total_count_down = this.total_count_down;
        builder.red_packet_source = this.red_packet_source;
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
        int i8;
        int i9;
        int i10;
        int i11 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12037, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12037, new Class[0], Integer.TYPE)).intValue();
        }
        int i12 = this.hashCode;
        if (i12 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.red_packet_group_id != null) {
                i = this.red_packet_group_id.hashCode();
            } else {
                i = 0;
            }
            int i13 = (hashCode + i) * 37;
            if (this.bonus_type != null) {
                i2 = this.bonus_type.hashCode();
            } else {
                i2 = 0;
            }
            int i14 = (i13 + i2) * 37;
            if (this.combo_count != null) {
                i3 = this.combo_count.hashCode();
            } else {
                i3 = 0;
            }
            int i15 = (i14 + i3) * 37;
            if (this.bonus_count != null) {
                i4 = this.bonus_count.hashCode();
            } else {
                i4 = 0;
            }
            int i16 = (i15 + i4) * 37;
            if (this.count_down != null) {
                i5 = this.count_down.hashCode();
            } else {
                i5 = 0;
            }
            int i17 = (i16 + i5) * 37;
            if (this.rush_time != null) {
                i6 = this.rush_time.hashCode();
            } else {
                i6 = 0;
            }
            int i18 = (i17 + i6) * 37;
            if (this.icon_url != null) {
                i7 = this.icon_url.hashCode();
            } else {
                i7 = 0;
            }
            int i19 = (i18 + i7) * 37;
            if (this.disappear_time != null) {
                i8 = this.disappear_time.hashCode();
            } else {
                i8 = 0;
            }
            int i20 = (i19 + i8) * 37;
            if (this.owner != null) {
                i9 = this.owner.hashCode();
            } else {
                i9 = 0;
            }
            int i21 = (i20 + i9) * 37;
            if (this.total_count_down != null) {
                i10 = this.total_count_down.hashCode();
            } else {
                i10 = 0;
            }
            int i22 = (i21 + i10) * 37;
            if (this.red_packet_source != null) {
                i11 = this.red_packet_source.hashCode();
            }
            i12 = i22 + i11;
            this.hashCode = i12;
        }
        return i12;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12038, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12038, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.red_packet_group_id != null) {
            sb.append(", red_packet_group_id=");
            sb.append(this.red_packet_group_id);
        }
        if (this.bonus_type != null) {
            sb.append(", bonus_type=");
            sb.append(this.bonus_type);
        }
        if (this.combo_count != null) {
            sb.append(", combo_count=");
            sb.append(this.combo_count);
        }
        if (this.bonus_count != null) {
            sb.append(", bonus_count=");
            sb.append(this.bonus_count);
        }
        if (this.count_down != null) {
            sb.append(", count_down=");
            sb.append(this.count_down);
        }
        if (this.rush_time != null) {
            sb.append(", rush_time=");
            sb.append(this.rush_time);
        }
        if (this.icon_url != null) {
            sb.append(", icon_url=");
            sb.append(this.icon_url);
        }
        if (this.disappear_time != null) {
            sb.append(", disappear_time=");
            sb.append(this.disappear_time);
        }
        if (this.owner != null) {
            sb.append(", owner=");
            sb.append(this.owner);
        }
        if (this.total_count_down != null) {
            sb.append(", total_count_down=");
            sb.append(this.total_count_down);
        }
        if (this.red_packet_source != null) {
            sb.append(", red_packet_source=");
            sb.append(this.red_packet_source);
        }
        StringBuilder replace = sb.replace(0, 2, "RedPacket{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12036, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12036, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof RedPacket)) {
                return false;
            }
            RedPacket redPacket = (RedPacket) obj;
            if (!unknownFields().equals(redPacket.unknownFields()) || !Internal.equals(this.red_packet_group_id, redPacket.red_packet_group_id) || !Internal.equals(this.bonus_type, redPacket.bonus_type) || !Internal.equals(this.combo_count, redPacket.combo_count) || !Internal.equals(this.bonus_count, redPacket.bonus_count) || !Internal.equals(this.count_down, redPacket.count_down) || !Internal.equals(this.rush_time, redPacket.rush_time) || !Internal.equals(this.icon_url, redPacket.icon_url) || !Internal.equals(this.disappear_time, redPacket.disappear_time) || !Internal.equals(this.owner, redPacket.owner) || !Internal.equals(this.total_count_down, redPacket.total_count_down) || !Internal.equals(this.red_packet_source, redPacket.red_packet_source)) {
                return false;
            }
            return true;
        }
    }

    public RedPacket(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str, Long l7, User user, Long l8, String str2) {
        this(l, l2, l3, l4, l5, l6, str, l7, user, l8, str2, ByteString.EMPTY);
    }

    public RedPacket(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str, Long l7, User user, Long l8, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.red_packet_group_id = l;
        this.bonus_type = l2;
        this.combo_count = l3;
        this.bonus_count = l4;
        this.count_down = l5;
        this.rush_time = l6;
        this.icon_url = str;
        this.disappear_time = l7;
        this.owner = user;
        this.total_count_down = l8;
        this.red_packet_source = str2;
    }
}
