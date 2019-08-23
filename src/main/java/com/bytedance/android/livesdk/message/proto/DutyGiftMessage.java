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
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.io.IOException;
import okio.ByteString;

public final class DutyGiftMessage extends Message<DutyGiftMessage, Builder> {
    public static final ProtoAdapter<DutyGiftMessage> ADAPTER = new ProtoAdapter_DutyGiftMessage();
    public static final Integer DEFAULT_CONTRIBUTE_MOST_SCORE = 0;
    public static final Long DEFAULT_DUTY_ID = 0L;
    public static final Integer DEFAULT_SCORE = 0;
    public static final Integer DEFAULT_SPEEDY_GIFT_ID = 0;
    public static final Integer DEFAULT_STAGE_COUNT = 0;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Integer DEFAULT_TARGET_SCORE = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 10)
    public final User contribute_most;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 11)
    public final Integer contribute_most_score;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 12)
    public final Long duty_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 9)
    public final Integer score;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public final Integer speedy_gift_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public final Integer stage_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 8)
    public final Integer status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public final Integer target_score;

    public static final class Builder extends Message.Builder<DutyGiftMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public User contribute_most;
        public Integer contribute_most_score;
        public Long duty_id;
        public Integer score;
        public Integer speedy_gift_id;
        public Integer stage_count;
        public Integer status;
        public Integer target_score;

        public final DutyGiftMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11360, new Class[0], DutyGiftMessage.class)) {
                return (DutyGiftMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11360, new Class[0], DutyGiftMessage.class);
            }
            DutyGiftMessage dutyGiftMessage = new DutyGiftMessage(this.common, this.speedy_gift_id, this.target_score, this.stage_count, this.status, this.score, this.contribute_most, this.contribute_most_score, this.duty_id, super.buildUnknownFields());
            return dutyGiftMessage;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder contribute_most(User user) {
            this.contribute_most = user;
            return this;
        }

        public final Builder contribute_most_score(Integer num) {
            this.contribute_most_score = num;
            return this;
        }

        public final Builder duty_id(Long l) {
            this.duty_id = l;
            return this;
        }

        public final Builder score(Integer num) {
            this.score = num;
            return this;
        }

        public final Builder speedy_gift_id(Integer num) {
            this.speedy_gift_id = num;
            return this;
        }

        public final Builder stage_count(Integer num) {
            this.stage_count = num;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }

        public final Builder target_score(Integer num) {
            this.target_score = num;
            return this;
        }
    }

    static final class ProtoAdapter_DutyGiftMessage extends ProtoAdapter<DutyGiftMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_DutyGiftMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, DutyGiftMessage.class);
        }

        public final DutyGiftMessage redact(DutyGiftMessage dutyGiftMessage) {
            if (PatchProxy.isSupport(new Object[]{dutyGiftMessage}, this, changeQuickRedirect, false, 11364, new Class[]{DutyGiftMessage.class}, DutyGiftMessage.class)) {
                return (DutyGiftMessage) PatchProxy.accessDispatch(new Object[]{dutyGiftMessage}, this, changeQuickRedirect, false, 11364, new Class[]{DutyGiftMessage.class}, DutyGiftMessage.class);
            }
            Builder newBuilder = dutyGiftMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.contribute_most != null) {
                newBuilder.contribute_most = (User) User.ADAPTER.redact(newBuilder.contribute_most);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final DutyGiftMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11363, new Class[]{ProtoReader.class}, DutyGiftMessage.class)) {
                return (DutyGiftMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11363, new Class[]{ProtoReader.class}, DutyGiftMessage.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader2.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    switch (nextTag) {
                        case 5:
                            builder.speedy_gift_id((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 6:
                            builder.target_score((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case e.l /*7*/:
                            builder.stage_count((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 8:
                            builder.status((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 9:
                            builder.score((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 10:
                            builder.contribute_most((User) User.ADAPTER.decode(protoReader2));
                            break;
                        case 11:
                            builder.contribute_most_score((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                            builder.duty_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                            break;
                    }
                } else {
                    builder.common((Common) Common.ADAPTER.decode(protoReader2));
                }
            }
        }

        public final int encodedSize(DutyGiftMessage dutyGiftMessage) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            DutyGiftMessage dutyGiftMessage2 = dutyGiftMessage;
            int i9 = 0;
            if (PatchProxy.isSupport(new Object[]{dutyGiftMessage2}, this, changeQuickRedirect, false, 11361, new Class[]{DutyGiftMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{dutyGiftMessage2}, this, changeQuickRedirect, false, 11361, new Class[]{DutyGiftMessage.class}, Integer.TYPE)).intValue();
            }
            if (dutyGiftMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, dutyGiftMessage2.common);
            } else {
                i = 0;
            }
            if (dutyGiftMessage2.speedy_gift_id != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(5, dutyGiftMessage2.speedy_gift_id);
            } else {
                i2 = 0;
            }
            int i10 = i + i2;
            if (dutyGiftMessage2.target_score != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(6, dutyGiftMessage2.target_score);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (dutyGiftMessage2.stage_count != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(7, dutyGiftMessage2.stage_count);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (dutyGiftMessage2.status != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(8, dutyGiftMessage2.status);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (dutyGiftMessage2.score != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(9, dutyGiftMessage2.score);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (dutyGiftMessage2.contribute_most != null) {
                i7 = User.ADAPTER.encodedSizeWithTag(10, dutyGiftMessage2.contribute_most);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (dutyGiftMessage2.contribute_most_score != null) {
                i8 = ProtoAdapter.INT32.encodedSizeWithTag(11, dutyGiftMessage2.contribute_most_score);
            } else {
                i8 = 0;
            }
            int i16 = i15 + i8;
            if (dutyGiftMessage2.duty_id != null) {
                i9 = ProtoAdapter.INT64.encodedSizeWithTag(12, dutyGiftMessage2.duty_id);
            }
            return i16 + i9 + dutyGiftMessage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, DutyGiftMessage dutyGiftMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            DutyGiftMessage dutyGiftMessage2 = dutyGiftMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, dutyGiftMessage2}, this, changeQuickRedirect, false, 11362, new Class[]{ProtoWriter.class, DutyGiftMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, dutyGiftMessage2}, this, changeQuickRedirect, false, 11362, new Class[]{ProtoWriter.class, DutyGiftMessage.class}, Void.TYPE);
                return;
            }
            if (dutyGiftMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, dutyGiftMessage2.common);
            }
            if (dutyGiftMessage2.speedy_gift_id != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 5, dutyGiftMessage2.speedy_gift_id);
            }
            if (dutyGiftMessage2.target_score != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 6, dutyGiftMessage2.target_score);
            }
            if (dutyGiftMessage2.stage_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 7, dutyGiftMessage2.stage_count);
            }
            if (dutyGiftMessage2.status != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 8, dutyGiftMessage2.status);
            }
            if (dutyGiftMessage2.score != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 9, dutyGiftMessage2.score);
            }
            if (dutyGiftMessage2.contribute_most != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 10, dutyGiftMessage2.contribute_most);
            }
            if (dutyGiftMessage2.contribute_most_score != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 11, dutyGiftMessage2.contribute_most_score);
            }
            if (dutyGiftMessage2.duty_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 12, dutyGiftMessage2.duty_id);
            }
            protoWriter2.writeBytes(dutyGiftMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11356, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11356, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.speedy_gift_id = this.speedy_gift_id;
        builder.target_score = this.target_score;
        builder.stage_count = this.stage_count;
        builder.status = this.status;
        builder.score = this.score;
        builder.contribute_most = this.contribute_most;
        builder.contribute_most_score = this.contribute_most_score;
        builder.duty_id = this.duty_id;
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
        int i9 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11358, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11358, new Class[0], Integer.TYPE)).intValue();
        }
        int i10 = this.hashCode;
        if (i10 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i11 = (hashCode + i) * 37;
            if (this.speedy_gift_id != null) {
                i2 = this.speedy_gift_id.hashCode();
            } else {
                i2 = 0;
            }
            int i12 = (i11 + i2) * 37;
            if (this.target_score != null) {
                i3 = this.target_score.hashCode();
            } else {
                i3 = 0;
            }
            int i13 = (i12 + i3) * 37;
            if (this.stage_count != null) {
                i4 = this.stage_count.hashCode();
            } else {
                i4 = 0;
            }
            int i14 = (i13 + i4) * 37;
            if (this.status != null) {
                i5 = this.status.hashCode();
            } else {
                i5 = 0;
            }
            int i15 = (i14 + i5) * 37;
            if (this.score != null) {
                i6 = this.score.hashCode();
            } else {
                i6 = 0;
            }
            int i16 = (i15 + i6) * 37;
            if (this.contribute_most != null) {
                i7 = this.contribute_most.hashCode();
            } else {
                i7 = 0;
            }
            int i17 = (i16 + i7) * 37;
            if (this.contribute_most_score != null) {
                i8 = this.contribute_most_score.hashCode();
            } else {
                i8 = 0;
            }
            int i18 = (i17 + i8) * 37;
            if (this.duty_id != null) {
                i9 = this.duty_id.hashCode();
            }
            i10 = i18 + i9;
            this.hashCode = i10;
        }
        return i10;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11359, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11359, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.speedy_gift_id != null) {
            sb.append(", speedy_gift_id=");
            sb.append(this.speedy_gift_id);
        }
        if (this.target_score != null) {
            sb.append(", target_score=");
            sb.append(this.target_score);
        }
        if (this.stage_count != null) {
            sb.append(", stage_count=");
            sb.append(this.stage_count);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.score != null) {
            sb.append(", score=");
            sb.append(this.score);
        }
        if (this.contribute_most != null) {
            sb.append(", contribute_most=");
            sb.append(this.contribute_most);
        }
        if (this.contribute_most_score != null) {
            sb.append(", contribute_most_score=");
            sb.append(this.contribute_most_score);
        }
        if (this.duty_id != null) {
            sb.append(", duty_id=");
            sb.append(this.duty_id);
        }
        StringBuilder replace = sb.replace(0, 2, "DutyGiftMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11357, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11357, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof DutyGiftMessage)) {
                return false;
            }
            DutyGiftMessage dutyGiftMessage = (DutyGiftMessage) obj;
            if (!unknownFields().equals(dutyGiftMessage.unknownFields()) || !Internal.equals(this.common, dutyGiftMessage.common) || !Internal.equals(this.speedy_gift_id, dutyGiftMessage.speedy_gift_id) || !Internal.equals(this.target_score, dutyGiftMessage.target_score) || !Internal.equals(this.stage_count, dutyGiftMessage.stage_count) || !Internal.equals(this.status, dutyGiftMessage.status) || !Internal.equals(this.score, dutyGiftMessage.score) || !Internal.equals(this.contribute_most, dutyGiftMessage.contribute_most) || !Internal.equals(this.contribute_most_score, dutyGiftMessage.contribute_most_score) || !Internal.equals(this.duty_id, dutyGiftMessage.duty_id)) {
                return false;
            }
            return true;
        }
    }

    public DutyGiftMessage(Common common2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, User user, Integer num6, Long l) {
        this(common2, num, num2, num3, num4, num5, user, num6, l, ByteString.EMPTY);
    }

    public DutyGiftMessage(Common common2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, User user, Integer num6, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.speedy_gift_id = num;
        this.target_score = num2;
        this.stage_count = num3;
        this.status = num4;
        this.score = num5;
        this.contribute_most = user;
        this.contribute_most_score = num6;
        this.duty_id = l;
    }
}
