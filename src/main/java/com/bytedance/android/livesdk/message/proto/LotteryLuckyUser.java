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

public final class LotteryLuckyUser extends Message<LotteryLuckyUser, Builder> {
    public static final ProtoAdapter<LotteryLuckyUser> ADAPTER = new ProtoAdapter_LotteryLuckyUser();
    public static final Long DEFAULT_GRANT_COUNT = 0L;
    public static final Long DEFAULT_LOTTERY_ID = 0L;
    public static final Long DEFAULT_LUCKY_ID = 0L;
    public static final Long DEFAULT_ROOM_ID = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String avatar_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 7)
    public final Long grant_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long lottery_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long lucky_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long room_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long user_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String user_name;

    public static final class Builder extends Message.Builder<LotteryLuckyUser, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String avatar_url;
        public Long grant_count;
        public Long lottery_id;
        public Long lucky_id;
        public Long room_id;
        public Long user_id;
        public String user_name;

        public final LotteryLuckyUser build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11789, new Class[0], LotteryLuckyUser.class)) {
                return (LotteryLuckyUser) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11789, new Class[0], LotteryLuckyUser.class);
            }
            LotteryLuckyUser lotteryLuckyUser = new LotteryLuckyUser(this.lucky_id, this.lottery_id, this.room_id, this.user_id, this.user_name, this.avatar_url, this.grant_count, super.buildUnknownFields());
            return lotteryLuckyUser;
        }

        public final Builder avatar_url(String str) {
            this.avatar_url = str;
            return this;
        }

        public final Builder grant_count(Long l) {
            this.grant_count = l;
            return this;
        }

        public final Builder lottery_id(Long l) {
            this.lottery_id = l;
            return this;
        }

        public final Builder lucky_id(Long l) {
            this.lucky_id = l;
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

    static final class ProtoAdapter_LotteryLuckyUser extends ProtoAdapter<LotteryLuckyUser> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_LotteryLuckyUser() {
            super(FieldEncoding.LENGTH_DELIMITED, LotteryLuckyUser.class);
        }

        public final LotteryLuckyUser redact(LotteryLuckyUser lotteryLuckyUser) {
            if (PatchProxy.isSupport(new Object[]{lotteryLuckyUser}, this, changeQuickRedirect, false, 11793, new Class[]{LotteryLuckyUser.class}, LotteryLuckyUser.class)) {
                return (LotteryLuckyUser) PatchProxy.accessDispatch(new Object[]{lotteryLuckyUser}, this, changeQuickRedirect, false, 11793, new Class[]{LotteryLuckyUser.class}, LotteryLuckyUser.class);
            }
            Builder newBuilder = lotteryLuckyUser.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final LotteryLuckyUser decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11792, new Class[]{ProtoReader.class}, LotteryLuckyUser.class)) {
                return (LotteryLuckyUser) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11792, new Class[]{ProtoReader.class}, LotteryLuckyUser.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.lucky_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 2:
                            builder.lottery_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 3:
                            builder.room_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.user_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 5:
                            builder.user_name((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 6:
                            builder.avatar_url((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case e.l /*7*/:
                            builder.grant_count((Long) ProtoAdapter.INT64.decode(protoReader2));
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

        public final int encodedSize(LotteryLuckyUser lotteryLuckyUser) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            LotteryLuckyUser lotteryLuckyUser2 = lotteryLuckyUser;
            int i7 = 0;
            if (PatchProxy.isSupport(new Object[]{lotteryLuckyUser2}, this, changeQuickRedirect, false, 11790, new Class[]{LotteryLuckyUser.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{lotteryLuckyUser2}, this, changeQuickRedirect, false, 11790, new Class[]{LotteryLuckyUser.class}, Integer.TYPE)).intValue();
            }
            if (lotteryLuckyUser2.lucky_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, lotteryLuckyUser2.lucky_id);
            } else {
                i = 0;
            }
            if (lotteryLuckyUser2.lottery_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, lotteryLuckyUser2.lottery_id);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (lotteryLuckyUser2.room_id != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, lotteryLuckyUser2.room_id);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (lotteryLuckyUser2.user_id != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, lotteryLuckyUser2.user_id);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (lotteryLuckyUser2.user_name != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, lotteryLuckyUser2.user_name);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (lotteryLuckyUser2.avatar_url != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, lotteryLuckyUser2.avatar_url);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (lotteryLuckyUser2.grant_count != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, lotteryLuckyUser2.grant_count);
            }
            return i12 + i7 + lotteryLuckyUser.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, LotteryLuckyUser lotteryLuckyUser) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            LotteryLuckyUser lotteryLuckyUser2 = lotteryLuckyUser;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, lotteryLuckyUser2}, this, changeQuickRedirect, false, 11791, new Class[]{ProtoWriter.class, LotteryLuckyUser.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, lotteryLuckyUser2}, this, changeQuickRedirect, false, 11791, new Class[]{ProtoWriter.class, LotteryLuckyUser.class}, Void.TYPE);
                return;
            }
            if (lotteryLuckyUser2.lucky_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, lotteryLuckyUser2.lucky_id);
            }
            if (lotteryLuckyUser2.lottery_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, lotteryLuckyUser2.lottery_id);
            }
            if (lotteryLuckyUser2.room_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, lotteryLuckyUser2.room_id);
            }
            if (lotteryLuckyUser2.user_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, lotteryLuckyUser2.user_id);
            }
            if (lotteryLuckyUser2.user_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 5, lotteryLuckyUser2.user_name);
            }
            if (lotteryLuckyUser2.avatar_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 6, lotteryLuckyUser2.avatar_url);
            }
            if (lotteryLuckyUser2.grant_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 7, lotteryLuckyUser2.grant_count);
            }
            protoWriter2.writeBytes(lotteryLuckyUser.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11785, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11785, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.lucky_id = this.lucky_id;
        builder.lottery_id = this.lottery_id;
        builder.room_id = this.room_id;
        builder.user_id = this.user_id;
        builder.user_name = this.user_name;
        builder.avatar_url = this.avatar_url;
        builder.grant_count = this.grant_count;
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11787, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11787, new Class[0], Integer.TYPE)).intValue();
        }
        int i8 = this.hashCode;
        if (i8 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.lucky_id != null) {
                i = this.lucky_id.hashCode();
            } else {
                i = 0;
            }
            int i9 = (hashCode + i) * 37;
            if (this.lottery_id != null) {
                i2 = this.lottery_id.hashCode();
            } else {
                i2 = 0;
            }
            int i10 = (i9 + i2) * 37;
            if (this.room_id != null) {
                i3 = this.room_id.hashCode();
            } else {
                i3 = 0;
            }
            int i11 = (i10 + i3) * 37;
            if (this.user_id != null) {
                i4 = this.user_id.hashCode();
            } else {
                i4 = 0;
            }
            int i12 = (i11 + i4) * 37;
            if (this.user_name != null) {
                i5 = this.user_name.hashCode();
            } else {
                i5 = 0;
            }
            int i13 = (i12 + i5) * 37;
            if (this.avatar_url != null) {
                i6 = this.avatar_url.hashCode();
            } else {
                i6 = 0;
            }
            int i14 = (i13 + i6) * 37;
            if (this.grant_count != null) {
                i7 = this.grant_count.hashCode();
            }
            i8 = i14 + i7;
            this.hashCode = i8;
        }
        return i8;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11788, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11788, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.lucky_id != null) {
            sb.append(", lucky_id=");
            sb.append(this.lucky_id);
        }
        if (this.lottery_id != null) {
            sb.append(", lottery_id=");
            sb.append(this.lottery_id);
        }
        if (this.room_id != null) {
            sb.append(", room_id=");
            sb.append(this.room_id);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.user_name != null) {
            sb.append(", user_name=");
            sb.append(this.user_name);
        }
        if (this.avatar_url != null) {
            sb.append(", avatar_url=");
            sb.append(this.avatar_url);
        }
        if (this.grant_count != null) {
            sb.append(", grant_count=");
            sb.append(this.grant_count);
        }
        StringBuilder replace = sb.replace(0, 2, "LotteryLuckyUser{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11786, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11786, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof LotteryLuckyUser)) {
                return false;
            }
            LotteryLuckyUser lotteryLuckyUser = (LotteryLuckyUser) obj;
            if (!unknownFields().equals(lotteryLuckyUser.unknownFields()) || !Internal.equals(this.lucky_id, lotteryLuckyUser.lucky_id) || !Internal.equals(this.lottery_id, lotteryLuckyUser.lottery_id) || !Internal.equals(this.room_id, lotteryLuckyUser.room_id) || !Internal.equals(this.user_id, lotteryLuckyUser.user_id) || !Internal.equals(this.user_name, lotteryLuckyUser.user_name) || !Internal.equals(this.avatar_url, lotteryLuckyUser.avatar_url) || !Internal.equals(this.grant_count, lotteryLuckyUser.grant_count)) {
                return false;
            }
            return true;
        }
    }

    public LotteryLuckyUser(Long l, Long l2, Long l3, Long l4, String str, String str2, Long l5) {
        this(l, l2, l3, l4, str, str2, l5, ByteString.EMPTY);
    }

    public LotteryLuckyUser(Long l, Long l2, Long l3, Long l4, String str, String str2, Long l5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.lucky_id = l;
        this.lottery_id = l2;
        this.room_id = l3;
        this.user_id = l4;
        this.user_name = str;
        this.avatar_url = str2;
        this.grant_count = l5;
    }
}
