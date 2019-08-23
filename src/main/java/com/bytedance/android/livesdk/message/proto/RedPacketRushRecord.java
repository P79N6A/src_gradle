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

public final class RedPacketRushRecord extends Message<RedPacketRushRecord, Builder> {
    public static final ProtoAdapter<RedPacketRushRecord> ADAPTER = new ProtoAdapter_RedPacketRushRecord();
    public static final Long DEFAULT_BONUS_COUNT = 0L;
    public static final Long DEFAULT_BONUS_TYPE = 0L;
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Long DEFAULT_RED_PACKET_GROUP_ID = 0L;
    public static final Long DEFAULT_ROOM_ID = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long bonus_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long bonus_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 8)
    public final Long create_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String im_text;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long red_packet_group_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public final Long room_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long user_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String user_name;

    public static final class Builder extends Message.Builder<RedPacketRushRecord, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Long bonus_count;
        public Long bonus_type;
        public Long create_time;
        public String im_text;
        public Long red_packet_group_id;
        public Long room_id;
        public Long user_id;
        public String user_name;

        public final RedPacketRushRecord build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12048, new Class[0], RedPacketRushRecord.class)) {
                return (RedPacketRushRecord) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12048, new Class[0], RedPacketRushRecord.class);
            }
            RedPacketRushRecord redPacketRushRecord = new RedPacketRushRecord(this.red_packet_group_id, this.user_id, this.user_name, this.bonus_count, this.bonus_type, this.room_id, this.im_text, this.create_time, super.buildUnknownFields());
            return redPacketRushRecord;
        }

        public final Builder bonus_count(Long l) {
            this.bonus_count = l;
            return this;
        }

        public final Builder bonus_type(Long l) {
            this.bonus_type = l;
            return this;
        }

        public final Builder create_time(Long l) {
            this.create_time = l;
            return this;
        }

        public final Builder im_text(String str) {
            this.im_text = str;
            return this;
        }

        public final Builder red_packet_group_id(Long l) {
            this.red_packet_group_id = l;
            return this;
        }

        public final Builder room_id(Long l) {
            this.room_id = l;
            return this;
        }

        public final Builder user_id(Long l) {
            this.user_id = l;
            return this;
        }

        public final Builder user_name(String str) {
            this.user_name = str;
            return this;
        }
    }

    static final class ProtoAdapter_RedPacketRushRecord extends ProtoAdapter<RedPacketRushRecord> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_RedPacketRushRecord() {
            super(FieldEncoding.LENGTH_DELIMITED, RedPacketRushRecord.class);
        }

        public final RedPacketRushRecord redact(RedPacketRushRecord redPacketRushRecord) {
            if (PatchProxy.isSupport(new Object[]{redPacketRushRecord}, this, changeQuickRedirect, false, 12052, new Class[]{RedPacketRushRecord.class}, RedPacketRushRecord.class)) {
                return (RedPacketRushRecord) PatchProxy.accessDispatch(new Object[]{redPacketRushRecord}, this, changeQuickRedirect, false, 12052, new Class[]{RedPacketRushRecord.class}, RedPacketRushRecord.class);
            }
            Builder newBuilder = redPacketRushRecord.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final RedPacketRushRecord decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12051, new Class[]{ProtoReader.class}, RedPacketRushRecord.class)) {
                return (RedPacketRushRecord) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12051, new Class[]{ProtoReader.class}, RedPacketRushRecord.class);
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
                            builder.user_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 3:
                            builder.user_name((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 4:
                            builder.bonus_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 5:
                            builder.bonus_type((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 6:
                            builder.room_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case e.l /*7*/:
                            builder.im_text((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 8:
                            builder.create_time((Long) ProtoAdapter.INT64.decode(protoReader2));
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

        public final int encodedSize(RedPacketRushRecord redPacketRushRecord) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            RedPacketRushRecord redPacketRushRecord2 = redPacketRushRecord;
            int i8 = 0;
            if (PatchProxy.isSupport(new Object[]{redPacketRushRecord2}, this, changeQuickRedirect, false, 12049, new Class[]{RedPacketRushRecord.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{redPacketRushRecord2}, this, changeQuickRedirect, false, 12049, new Class[]{RedPacketRushRecord.class}, Integer.TYPE)).intValue();
            }
            if (redPacketRushRecord2.red_packet_group_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, redPacketRushRecord2.red_packet_group_id);
            } else {
                i = 0;
            }
            if (redPacketRushRecord2.user_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, redPacketRushRecord2.user_id);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (redPacketRushRecord2.user_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, redPacketRushRecord2.user_name);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (redPacketRushRecord2.bonus_count != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, redPacketRushRecord2.bonus_count);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (redPacketRushRecord2.bonus_type != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, redPacketRushRecord2.bonus_type);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (redPacketRushRecord2.room_id != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, redPacketRushRecord2.room_id);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (redPacketRushRecord2.im_text != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, redPacketRushRecord2.im_text);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (redPacketRushRecord2.create_time != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(8, redPacketRushRecord2.create_time);
            }
            return i14 + i8 + redPacketRushRecord.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, RedPacketRushRecord redPacketRushRecord) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            RedPacketRushRecord redPacketRushRecord2 = redPacketRushRecord;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, redPacketRushRecord2}, this, changeQuickRedirect, false, 12050, new Class[]{ProtoWriter.class, RedPacketRushRecord.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, redPacketRushRecord2}, this, changeQuickRedirect, false, 12050, new Class[]{ProtoWriter.class, RedPacketRushRecord.class}, Void.TYPE);
                return;
            }
            if (redPacketRushRecord2.red_packet_group_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, redPacketRushRecord2.red_packet_group_id);
            }
            if (redPacketRushRecord2.user_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, redPacketRushRecord2.user_id);
            }
            if (redPacketRushRecord2.user_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, redPacketRushRecord2.user_name);
            }
            if (redPacketRushRecord2.bonus_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, redPacketRushRecord2.bonus_count);
            }
            if (redPacketRushRecord2.bonus_type != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 5, redPacketRushRecord2.bonus_type);
            }
            if (redPacketRushRecord2.room_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 6, redPacketRushRecord2.room_id);
            }
            if (redPacketRushRecord2.im_text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 7, redPacketRushRecord2.im_text);
            }
            if (redPacketRushRecord2.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 8, redPacketRushRecord2.create_time);
            }
            protoWriter2.writeBytes(redPacketRushRecord.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12044, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12044, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.red_packet_group_id = this.red_packet_group_id;
        builder.user_id = this.user_id;
        builder.user_name = this.user_name;
        builder.bonus_count = this.bonus_count;
        builder.bonus_type = this.bonus_type;
        builder.room_id = this.room_id;
        builder.im_text = this.im_text;
        builder.create_time = this.create_time;
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12046, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12046, new Class[0], Integer.TYPE)).intValue();
        }
        int i9 = this.hashCode;
        if (i9 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.red_packet_group_id != null) {
                i = this.red_packet_group_id.hashCode();
            } else {
                i = 0;
            }
            int i10 = (hashCode + i) * 37;
            if (this.user_id != null) {
                i2 = this.user_id.hashCode();
            } else {
                i2 = 0;
            }
            int i11 = (i10 + i2) * 37;
            if (this.user_name != null) {
                i3 = this.user_name.hashCode();
            } else {
                i3 = 0;
            }
            int i12 = (i11 + i3) * 37;
            if (this.bonus_count != null) {
                i4 = this.bonus_count.hashCode();
            } else {
                i4 = 0;
            }
            int i13 = (i12 + i4) * 37;
            if (this.bonus_type != null) {
                i5 = this.bonus_type.hashCode();
            } else {
                i5 = 0;
            }
            int i14 = (i13 + i5) * 37;
            if (this.room_id != null) {
                i6 = this.room_id.hashCode();
            } else {
                i6 = 0;
            }
            int i15 = (i14 + i6) * 37;
            if (this.im_text != null) {
                i7 = this.im_text.hashCode();
            } else {
                i7 = 0;
            }
            int i16 = (i15 + i7) * 37;
            if (this.create_time != null) {
                i8 = this.create_time.hashCode();
            }
            i9 = i16 + i8;
            this.hashCode = i9;
        }
        return i9;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12047, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12047, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.red_packet_group_id != null) {
            sb.append(", red_packet_group_id=");
            sb.append(this.red_packet_group_id);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.user_name != null) {
            sb.append(", user_name=");
            sb.append(this.user_name);
        }
        if (this.bonus_count != null) {
            sb.append(", bonus_count=");
            sb.append(this.bonus_count);
        }
        if (this.bonus_type != null) {
            sb.append(", bonus_type=");
            sb.append(this.bonus_type);
        }
        if (this.room_id != null) {
            sb.append(", room_id=");
            sb.append(this.room_id);
        }
        if (this.im_text != null) {
            sb.append(", im_text=");
            sb.append(this.im_text);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        StringBuilder replace = sb.replace(0, 2, "RedPacketRushRecord{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12045, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12045, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof RedPacketRushRecord)) {
                return false;
            }
            RedPacketRushRecord redPacketRushRecord = (RedPacketRushRecord) obj;
            if (!unknownFields().equals(redPacketRushRecord.unknownFields()) || !Internal.equals(this.red_packet_group_id, redPacketRushRecord.red_packet_group_id) || !Internal.equals(this.user_id, redPacketRushRecord.user_id) || !Internal.equals(this.user_name, redPacketRushRecord.user_name) || !Internal.equals(this.bonus_count, redPacketRushRecord.bonus_count) || !Internal.equals(this.bonus_type, redPacketRushRecord.bonus_type) || !Internal.equals(this.room_id, redPacketRushRecord.room_id) || !Internal.equals(this.im_text, redPacketRushRecord.im_text) || !Internal.equals(this.create_time, redPacketRushRecord.create_time)) {
                return false;
            }
            return true;
        }
    }

    public RedPacketRushRecord(Long l, Long l2, String str, Long l3, Long l4, Long l5, String str2, Long l6) {
        this(l, l2, str, l3, l4, l5, str2, l6, ByteString.EMPTY);
    }

    public RedPacketRushRecord(Long l, Long l2, String str, Long l3, Long l4, Long l5, String str2, Long l6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.red_packet_group_id = l;
        this.user_id = l2;
        this.user_name = str;
        this.bonus_count = l3;
        this.bonus_type = l4;
        this.room_id = l5;
        this.im_text = str2;
        this.create_time = l6;
    }
}
