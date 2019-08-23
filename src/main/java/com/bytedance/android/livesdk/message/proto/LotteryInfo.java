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
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class LotteryInfo extends Message<LotteryInfo, Builder> {
    public static final ProtoAdapter<LotteryInfo> ADAPTER = new ProtoAdapter_LotteryInfo();
    public static final Long DEFAULT_ANCHOR_ID = 0L;
    public static final Long DEFAULT_CANDIDATE_NUM = 0L;
    public static final Long DEFAULT_COUNT_DOWN = 0L;
    public static final Long DEFAULT_CURRENT_TIME = 0L;
    public static final Long DEFAULT_DRAW_TIME = 0L;
    public static final Long DEFAULT_LOTTERY_ID = 0L;
    public static final Long DEFAULT_LUCKY_COUNT = 0L;
    public static final Integer DEFAULT_OWNER_TYPE = 0;
    public static final Long DEFAULT_OWNER_USER_ID = 0L;
    public static final Long DEFAULT_PRIZE_COUNT = 0L;
    public static final Long DEFAULT_REAL_DRAW_TIME = 0L;
    public static final Long DEFAULT_REAL_LUCKY_COUNT = 0L;
    public static final Long DEFAULT_ROOM_ID = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_TOTAL_GRANT_COUNT = 0L;
    public static final Long DEFAULT_WITHDRAW_COUNT = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long anchor_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 21)
    public final Long candidate_num;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.LotteryCondition#ADAPTER", label = WireField.Label.REPEATED, tag = 8)
    public final List<LotteryCondition> conditions;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 11)
    public final Long count_down;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 20)
    public final Long current_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 13)
    public final Long draw_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 14)
    public final String extra;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long lottery_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 10)
    public final Long lucky_count;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.LotteryLuckyUser#ADAPTER", label = WireField.Label.REPEATED, tag = 19)
    public final List<LotteryLuckyUser> lucky_users;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer owner_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long owner_user_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 9)
    public final Long prize_count;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.LotteryPrize#ADAPTER", tag = 7)
    public final LotteryPrize prize_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 18)
    public final Long real_draw_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 15)
    public final Long real_lucky_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long room_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 12)
    public final Long start_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public final Integer status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 16)
    public final Long total_grant_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 17)
    public final Long withdraw_count;

    public static final class Builder extends Message.Builder<LotteryInfo, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Long anchor_id;
        public Long candidate_num;
        public List<LotteryCondition> conditions = Internal.newMutableList();
        public Long count_down;
        public Long current_time;
        public Long draw_time;
        public String extra;
        public Long lottery_id;
        public Long lucky_count;
        public List<LotteryLuckyUser> lucky_users = Internal.newMutableList();
        public Integer owner_type;
        public Long owner_user_id;
        public Long prize_count;
        public LotteryPrize prize_info;
        public Long real_draw_time;
        public Long real_lucky_count;
        public Long room_id;
        public Long start_time;
        public Integer status;
        public Long total_grant_count;
        public Long withdraw_count;

        public final LotteryInfo build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11780, new Class[0], LotteryInfo.class)) {
                return (LotteryInfo) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11780, new Class[0], LotteryInfo.class);
            }
            LotteryInfo lotteryInfo = new LotteryInfo(this.lottery_id, this.owner_user_id, this.anchor_id, this.owner_type, this.room_id, this.status, this.prize_info, this.conditions, this.prize_count, this.lucky_count, this.count_down, this.start_time, this.draw_time, this.extra, this.real_lucky_count, this.total_grant_count, this.withdraw_count, this.real_draw_time, this.lucky_users, this.current_time, this.candidate_num, super.buildUnknownFields());
            return lotteryInfo;
        }

        public final Builder anchor_id(Long l) {
            this.anchor_id = l;
            return this;
        }

        public final Builder candidate_num(Long l) {
            this.candidate_num = l;
            return this;
        }

        public final Builder count_down(Long l) {
            this.count_down = l;
            return this;
        }

        public final Builder current_time(Long l) {
            this.current_time = l;
            return this;
        }

        public final Builder draw_time(Long l) {
            this.draw_time = l;
            return this;
        }

        public final Builder extra(String str) {
            this.extra = str;
            return this;
        }

        public final Builder lottery_id(Long l) {
            this.lottery_id = l;
            return this;
        }

        public final Builder lucky_count(Long l) {
            this.lucky_count = l;
            return this;
        }

        public final Builder owner_type(Integer num) {
            this.owner_type = num;
            return this;
        }

        public final Builder owner_user_id(Long l) {
            this.owner_user_id = l;
            return this;
        }

        public final Builder prize_count(Long l) {
            this.prize_count = l;
            return this;
        }

        public final Builder prize_info(LotteryPrize lotteryPrize) {
            this.prize_info = lotteryPrize;
            return this;
        }

        public final Builder real_draw_time(Long l) {
            this.real_draw_time = l;
            return this;
        }

        public final Builder real_lucky_count(Long l) {
            this.real_lucky_count = l;
            return this;
        }

        public final Builder room_id(Long l) {
            this.room_id = l;
            return this;
        }

        public final Builder start_time(Long l) {
            this.start_time = l;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }

        public final Builder total_grant_count(Long l) {
            this.total_grant_count = l;
            return this;
        }

        public final Builder withdraw_count(Long l) {
            this.withdraw_count = l;
            return this;
        }

        public final Builder conditions(List<LotteryCondition> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 11778, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 11778, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.conditions = list;
            return this;
        }

        public final Builder lucky_users(List<LotteryLuckyUser> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 11779, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 11779, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.lucky_users = list;
            return this;
        }
    }

    static final class ProtoAdapter_LotteryInfo extends ProtoAdapter<LotteryInfo> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_LotteryInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, LotteryInfo.class);
        }

        public final LotteryInfo redact(LotteryInfo lotteryInfo) {
            if (PatchProxy.isSupport(new Object[]{lotteryInfo}, this, changeQuickRedirect, false, 11784, new Class[]{LotteryInfo.class}, LotteryInfo.class)) {
                return (LotteryInfo) PatchProxy.accessDispatch(new Object[]{lotteryInfo}, this, changeQuickRedirect, false, 11784, new Class[]{LotteryInfo.class}, LotteryInfo.class);
            }
            Builder newBuilder = lotteryInfo.newBuilder();
            if (newBuilder.prize_info != null) {
                newBuilder.prize_info = (LotteryPrize) LotteryPrize.ADAPTER.redact(newBuilder.prize_info);
            }
            Internal.redactElements(newBuilder.conditions, LotteryCondition.ADAPTER);
            Internal.redactElements(newBuilder.lucky_users, LotteryLuckyUser.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final LotteryInfo decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11783, new Class[]{ProtoReader.class}, LotteryInfo.class)) {
                return (LotteryInfo) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11783, new Class[]{ProtoReader.class}, LotteryInfo.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.lottery_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 2:
                            builder.owner_user_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 3:
                            builder.anchor_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.owner_type((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 5:
                            builder.room_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 6:
                            builder.status((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case e.l /*7*/:
                            builder.prize_info((LotteryPrize) LotteryPrize.ADAPTER.decode(protoReader2));
                            break;
                        case 8:
                            builder.conditions.add(LotteryCondition.ADAPTER.decode(protoReader2));
                            break;
                        case 9:
                            builder.prize_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 10:
                            builder.lucky_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 11:
                            builder.count_down((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                            builder.start_time((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 13:
                            builder.draw_time((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 14:
                            builder.extra((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 15:
                            builder.real_lucky_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case SearchJediMixFeedAdapter.f42514c /*?: ONE_ARG  (16 int)*/:
                            builder.total_grant_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 17:
                            builder.withdraw_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 18:
                            builder.real_draw_time((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 19:
                            builder.lucky_users.add(LotteryLuckyUser.ADAPTER.decode(protoReader2));
                            break;
                        case 20:
                            builder.current_time((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 21:
                            builder.candidate_num((Long) ProtoAdapter.INT64.decode(protoReader2));
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

        public final int encodedSize(LotteryInfo lotteryInfo) {
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
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            LotteryInfo lotteryInfo2 = lotteryInfo;
            int i19 = 0;
            if (PatchProxy.isSupport(new Object[]{lotteryInfo2}, this, changeQuickRedirect, false, 11781, new Class[]{LotteryInfo.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{lotteryInfo2}, this, changeQuickRedirect, false, 11781, new Class[]{LotteryInfo.class}, Integer.TYPE)).intValue();
            }
            if (lotteryInfo2.lottery_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, lotteryInfo2.lottery_id);
            } else {
                i = 0;
            }
            if (lotteryInfo2.owner_user_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, lotteryInfo2.owner_user_id);
            } else {
                i2 = 0;
            }
            int i20 = i + i2;
            if (lotteryInfo2.anchor_id != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, lotteryInfo2.anchor_id);
            } else {
                i3 = 0;
            }
            int i21 = i20 + i3;
            if (lotteryInfo2.owner_type != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(4, lotteryInfo2.owner_type);
            } else {
                i4 = 0;
            }
            int i22 = i21 + i4;
            if (lotteryInfo2.room_id != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, lotteryInfo2.room_id);
            } else {
                i5 = 0;
            }
            int i23 = i22 + i5;
            if (lotteryInfo2.status != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(6, lotteryInfo2.status);
            } else {
                i6 = 0;
            }
            int i24 = i23 + i6;
            if (lotteryInfo2.prize_info != null) {
                i7 = LotteryPrize.ADAPTER.encodedSizeWithTag(7, lotteryInfo2.prize_info);
            } else {
                i7 = 0;
            }
            int encodedSizeWithTag = i24 + i7 + LotteryCondition.ADAPTER.asRepeated().encodedSizeWithTag(8, lotteryInfo2.conditions);
            if (lotteryInfo2.prize_count != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(9, lotteryInfo2.prize_count);
            } else {
                i8 = 0;
            }
            int i25 = encodedSizeWithTag + i8;
            if (lotteryInfo2.lucky_count != null) {
                i9 = ProtoAdapter.INT64.encodedSizeWithTag(10, lotteryInfo2.lucky_count);
            } else {
                i9 = 0;
            }
            int i26 = i25 + i9;
            if (lotteryInfo2.count_down != null) {
                i10 = ProtoAdapter.INT64.encodedSizeWithTag(11, lotteryInfo2.count_down);
            } else {
                i10 = 0;
            }
            int i27 = i26 + i10;
            if (lotteryInfo2.start_time != null) {
                i11 = ProtoAdapter.INT64.encodedSizeWithTag(12, lotteryInfo2.start_time);
            } else {
                i11 = 0;
            }
            int i28 = i27 + i11;
            if (lotteryInfo2.draw_time != null) {
                i12 = ProtoAdapter.INT64.encodedSizeWithTag(13, lotteryInfo2.draw_time);
            } else {
                i12 = 0;
            }
            int i29 = i28 + i12;
            if (lotteryInfo2.extra != null) {
                i13 = ProtoAdapter.STRING.encodedSizeWithTag(14, lotteryInfo2.extra);
            } else {
                i13 = 0;
            }
            int i30 = i29 + i13;
            if (lotteryInfo2.real_lucky_count != null) {
                i14 = ProtoAdapter.INT64.encodedSizeWithTag(15, lotteryInfo2.real_lucky_count);
            } else {
                i14 = 0;
            }
            int i31 = i30 + i14;
            if (lotteryInfo2.total_grant_count != null) {
                i15 = ProtoAdapter.INT64.encodedSizeWithTag(16, lotteryInfo2.total_grant_count);
            } else {
                i15 = 0;
            }
            int i32 = i31 + i15;
            if (lotteryInfo2.withdraw_count != null) {
                i16 = ProtoAdapter.INT64.encodedSizeWithTag(17, lotteryInfo2.withdraw_count);
            } else {
                i16 = 0;
            }
            int i33 = i32 + i16;
            if (lotteryInfo2.real_draw_time != null) {
                i17 = ProtoAdapter.INT64.encodedSizeWithTag(18, lotteryInfo2.real_draw_time);
            } else {
                i17 = 0;
            }
            int encodedSizeWithTag2 = i33 + i17 + LotteryLuckyUser.ADAPTER.asRepeated().encodedSizeWithTag(19, lotteryInfo2.lucky_users);
            if (lotteryInfo2.current_time != null) {
                i18 = ProtoAdapter.INT64.encodedSizeWithTag(20, lotteryInfo2.current_time);
            } else {
                i18 = 0;
            }
            int i34 = encodedSizeWithTag2 + i18;
            if (lotteryInfo2.candidate_num != null) {
                i19 = ProtoAdapter.INT64.encodedSizeWithTag(21, lotteryInfo2.candidate_num);
            }
            return i34 + i19 + lotteryInfo.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, LotteryInfo lotteryInfo) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            LotteryInfo lotteryInfo2 = lotteryInfo;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, lotteryInfo2}, this, changeQuickRedirect, false, 11782, new Class[]{ProtoWriter.class, LotteryInfo.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, lotteryInfo2}, this, changeQuickRedirect, false, 11782, new Class[]{ProtoWriter.class, LotteryInfo.class}, Void.TYPE);
                return;
            }
            if (lotteryInfo2.lottery_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, lotteryInfo2.lottery_id);
            }
            if (lotteryInfo2.owner_user_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, lotteryInfo2.owner_user_id);
            }
            if (lotteryInfo2.anchor_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, lotteryInfo2.anchor_id);
            }
            if (lotteryInfo2.owner_type != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 4, lotteryInfo2.owner_type);
            }
            if (lotteryInfo2.room_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 5, lotteryInfo2.room_id);
            }
            if (lotteryInfo2.status != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 6, lotteryInfo2.status);
            }
            if (lotteryInfo2.prize_info != null) {
                LotteryPrize.ADAPTER.encodeWithTag(protoWriter2, 7, lotteryInfo2.prize_info);
            }
            LotteryCondition.ADAPTER.asRepeated().encodeWithTag(protoWriter2, 8, lotteryInfo2.conditions);
            if (lotteryInfo2.prize_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 9, lotteryInfo2.prize_count);
            }
            if (lotteryInfo2.lucky_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 10, lotteryInfo2.lucky_count);
            }
            if (lotteryInfo2.count_down != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 11, lotteryInfo2.count_down);
            }
            if (lotteryInfo2.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 12, lotteryInfo2.start_time);
            }
            if (lotteryInfo2.draw_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 13, lotteryInfo2.draw_time);
            }
            if (lotteryInfo2.extra != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 14, lotteryInfo2.extra);
            }
            if (lotteryInfo2.real_lucky_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 15, lotteryInfo2.real_lucky_count);
            }
            if (lotteryInfo2.total_grant_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 16, lotteryInfo2.total_grant_count);
            }
            if (lotteryInfo2.withdraw_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 17, lotteryInfo2.withdraw_count);
            }
            if (lotteryInfo2.real_draw_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 18, lotteryInfo2.real_draw_time);
            }
            LotteryLuckyUser.ADAPTER.asRepeated().encodeWithTag(protoWriter2, 19, lotteryInfo2.lucky_users);
            if (lotteryInfo2.current_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 20, lotteryInfo2.current_time);
            }
            if (lotteryInfo2.candidate_num != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 21, lotteryInfo2.candidate_num);
            }
            protoWriter2.writeBytes(lotteryInfo.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11774, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11774, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.lottery_id = this.lottery_id;
        builder.owner_user_id = this.owner_user_id;
        builder.anchor_id = this.anchor_id;
        builder.owner_type = this.owner_type;
        builder.room_id = this.room_id;
        builder.status = this.status;
        builder.prize_info = this.prize_info;
        builder.conditions = Internal.copyOf("conditions", this.conditions);
        builder.prize_count = this.prize_count;
        builder.lucky_count = this.lucky_count;
        builder.count_down = this.count_down;
        builder.start_time = this.start_time;
        builder.draw_time = this.draw_time;
        builder.extra = this.extra;
        builder.real_lucky_count = this.real_lucky_count;
        builder.total_grant_count = this.total_grant_count;
        builder.withdraw_count = this.withdraw_count;
        builder.real_draw_time = this.real_draw_time;
        builder.lucky_users = Internal.copyOf("lucky_users", this.lucky_users);
        builder.current_time = this.current_time;
        builder.candidate_num = this.candidate_num;
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
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11776, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11776, new Class[0], Integer.TYPE)).intValue();
        }
        int i20 = this.hashCode;
        if (i20 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.lottery_id != null) {
                i = this.lottery_id.hashCode();
            } else {
                i = 0;
            }
            int i21 = (hashCode + i) * 37;
            if (this.owner_user_id != null) {
                i2 = this.owner_user_id.hashCode();
            } else {
                i2 = 0;
            }
            int i22 = (i21 + i2) * 37;
            if (this.anchor_id != null) {
                i3 = this.anchor_id.hashCode();
            } else {
                i3 = 0;
            }
            int i23 = (i22 + i3) * 37;
            if (this.owner_type != null) {
                i4 = this.owner_type.hashCode();
            } else {
                i4 = 0;
            }
            int i24 = (i23 + i4) * 37;
            if (this.room_id != null) {
                i5 = this.room_id.hashCode();
            } else {
                i5 = 0;
            }
            int i25 = (i24 + i5) * 37;
            if (this.status != null) {
                i6 = this.status.hashCode();
            } else {
                i6 = 0;
            }
            int i26 = (i25 + i6) * 37;
            if (this.prize_info != null) {
                i7 = this.prize_info.hashCode();
            } else {
                i7 = 0;
            }
            int hashCode2 = (((i26 + i7) * 37) + this.conditions.hashCode()) * 37;
            if (this.prize_count != null) {
                i8 = this.prize_count.hashCode();
            } else {
                i8 = 0;
            }
            int i27 = (hashCode2 + i8) * 37;
            if (this.lucky_count != null) {
                i9 = this.lucky_count.hashCode();
            } else {
                i9 = 0;
            }
            int i28 = (i27 + i9) * 37;
            if (this.count_down != null) {
                i10 = this.count_down.hashCode();
            } else {
                i10 = 0;
            }
            int i29 = (i28 + i10) * 37;
            if (this.start_time != null) {
                i11 = this.start_time.hashCode();
            } else {
                i11 = 0;
            }
            int i30 = (i29 + i11) * 37;
            if (this.draw_time != null) {
                i12 = this.draw_time.hashCode();
            } else {
                i12 = 0;
            }
            int i31 = (i30 + i12) * 37;
            if (this.extra != null) {
                i13 = this.extra.hashCode();
            } else {
                i13 = 0;
            }
            int i32 = (i31 + i13) * 37;
            if (this.real_lucky_count != null) {
                i14 = this.real_lucky_count.hashCode();
            } else {
                i14 = 0;
            }
            int i33 = (i32 + i14) * 37;
            if (this.total_grant_count != null) {
                i15 = this.total_grant_count.hashCode();
            } else {
                i15 = 0;
            }
            int i34 = (i33 + i15) * 37;
            if (this.withdraw_count != null) {
                i16 = this.withdraw_count.hashCode();
            } else {
                i16 = 0;
            }
            int i35 = (i34 + i16) * 37;
            if (this.real_draw_time != null) {
                i17 = this.real_draw_time.hashCode();
            } else {
                i17 = 0;
            }
            int hashCode3 = (((i35 + i17) * 37) + this.lucky_users.hashCode()) * 37;
            if (this.current_time != null) {
                i18 = this.current_time.hashCode();
            } else {
                i18 = 0;
            }
            int i36 = (hashCode3 + i18) * 37;
            if (this.candidate_num != null) {
                i19 = this.candidate_num.hashCode();
            }
            i20 = i36 + i19;
            this.hashCode = i20;
        }
        return i20;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11777, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11777, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.lottery_id != null) {
            sb.append(", lottery_id=");
            sb.append(this.lottery_id);
        }
        if (this.owner_user_id != null) {
            sb.append(", owner_user_id=");
            sb.append(this.owner_user_id);
        }
        if (this.anchor_id != null) {
            sb.append(", anchor_id=");
            sb.append(this.anchor_id);
        }
        if (this.owner_type != null) {
            sb.append(", owner_type=");
            sb.append(this.owner_type);
        }
        if (this.room_id != null) {
            sb.append(", room_id=");
            sb.append(this.room_id);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.prize_info != null) {
            sb.append(", prize_info=");
            sb.append(this.prize_info);
        }
        if (!this.conditions.isEmpty()) {
            sb.append(", conditions=");
            sb.append(this.conditions);
        }
        if (this.prize_count != null) {
            sb.append(", prize_count=");
            sb.append(this.prize_count);
        }
        if (this.lucky_count != null) {
            sb.append(", lucky_count=");
            sb.append(this.lucky_count);
        }
        if (this.count_down != null) {
            sb.append(", count_down=");
            sb.append(this.count_down);
        }
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.draw_time != null) {
            sb.append(", draw_time=");
            sb.append(this.draw_time);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (this.real_lucky_count != null) {
            sb.append(", real_lucky_count=");
            sb.append(this.real_lucky_count);
        }
        if (this.total_grant_count != null) {
            sb.append(", total_grant_count=");
            sb.append(this.total_grant_count);
        }
        if (this.withdraw_count != null) {
            sb.append(", withdraw_count=");
            sb.append(this.withdraw_count);
        }
        if (this.real_draw_time != null) {
            sb.append(", real_draw_time=");
            sb.append(this.real_draw_time);
        }
        if (!this.lucky_users.isEmpty()) {
            sb.append(", lucky_users=");
            sb.append(this.lucky_users);
        }
        if (this.current_time != null) {
            sb.append(", current_time=");
            sb.append(this.current_time);
        }
        if (this.candidate_num != null) {
            sb.append(", candidate_num=");
            sb.append(this.candidate_num);
        }
        StringBuilder replace = sb.replace(0, 2, "LotteryInfo{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11775, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11775, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof LotteryInfo)) {
                return false;
            }
            LotteryInfo lotteryInfo = (LotteryInfo) obj;
            if (!unknownFields().equals(lotteryInfo.unknownFields()) || !Internal.equals(this.lottery_id, lotteryInfo.lottery_id) || !Internal.equals(this.owner_user_id, lotteryInfo.owner_user_id) || !Internal.equals(this.anchor_id, lotteryInfo.anchor_id) || !Internal.equals(this.owner_type, lotteryInfo.owner_type) || !Internal.equals(this.room_id, lotteryInfo.room_id) || !Internal.equals(this.status, lotteryInfo.status) || !Internal.equals(this.prize_info, lotteryInfo.prize_info) || !this.conditions.equals(lotteryInfo.conditions) || !Internal.equals(this.prize_count, lotteryInfo.prize_count) || !Internal.equals(this.lucky_count, lotteryInfo.lucky_count) || !Internal.equals(this.count_down, lotteryInfo.count_down) || !Internal.equals(this.start_time, lotteryInfo.start_time) || !Internal.equals(this.draw_time, lotteryInfo.draw_time) || !Internal.equals(this.extra, lotteryInfo.extra) || !Internal.equals(this.real_lucky_count, lotteryInfo.real_lucky_count) || !Internal.equals(this.total_grant_count, lotteryInfo.total_grant_count) || !Internal.equals(this.withdraw_count, lotteryInfo.withdraw_count) || !Internal.equals(this.real_draw_time, lotteryInfo.real_draw_time) || !this.lucky_users.equals(lotteryInfo.lucky_users) || !Internal.equals(this.current_time, lotteryInfo.current_time) || !Internal.equals(this.candidate_num, lotteryInfo.candidate_num)) {
                return false;
            }
            return true;
        }
    }

    public LotteryInfo(Long l, Long l2, Long l3, Integer num, Long l4, Integer num2, LotteryPrize lotteryPrize, List<LotteryCondition> list, Long l5, Long l6, Long l7, Long l8, Long l9, String str, Long l10, Long l11, Long l12, Long l13, List<LotteryLuckyUser> list2, Long l14, Long l15) {
        this(l, l2, l3, num, l4, num2, lotteryPrize, list, l5, l6, l7, l8, l9, str, l10, l11, l12, l13, list2, l14, l15, ByteString.EMPTY);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LotteryInfo(Long l, Long l2, Long l3, Integer num, Long l4, Integer num2, LotteryPrize lotteryPrize, List<LotteryCondition> list, Long l5, Long l6, Long l7, Long l8, Long l9, String str, Long l10, Long l11, Long l12, Long l13, List<LotteryLuckyUser> list2, Long l14, Long l15, ByteString byteString) {
        super(ADAPTER, byteString);
        this.lottery_id = l;
        this.owner_user_id = l2;
        this.anchor_id = l3;
        this.owner_type = num;
        this.room_id = l4;
        this.status = num2;
        this.prize_info = lotteryPrize;
        List<LotteryCondition> list3 = list;
        this.conditions = Internal.immutableCopyOf("conditions", list);
        this.prize_count = l5;
        this.lucky_count = l6;
        this.count_down = l7;
        this.start_time = l8;
        this.draw_time = l9;
        this.extra = str;
        this.real_lucky_count = l10;
        this.total_grant_count = l11;
        this.withdraw_count = l12;
        this.real_draw_time = l13;
        this.lucky_users = Internal.immutableCopyOf("lucky_users", list2);
        this.current_time = l14;
        this.candidate_num = l15;
    }
}
