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

public final class FreeCellGiftMessage extends Message<FreeCellGiftMessage, Builder> {
    public static final ProtoAdapter<FreeCellGiftMessage> ADAPTER = new ProtoAdapter_FreeCellGiftMessage();
    public static final Long DEFAULT_COMBO_COUNT = 0L;
    public static final Long DEFAULT_FAN_TICKET_COUNT = 0L;
    public static final Long DEFAULT_GIFT_ID = 0L;
    public static final Long DEFAULT_GROUP_COUNT = 0L;
    public static final Long DEFAULT_REPEAT_COUNT = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public final Long combo_count;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long fan_ticket_count;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.FreeCellGiftMessage$FreeCellData#ADAPTER", tag = 9)
    public final FreeCellData free_cell;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long gift_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long group_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long repeat_count;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 8)
    public final User to_user;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 7)
    public final User user;

    public static final class FreeCellData extends Message<FreeCellData, Builder> {
        public static final ProtoAdapter<FreeCellData> ADAPTER = new ProtoAdapter_FreeCellData();
        public static final Long DEFAULT_CONTRIBUTE_MOST_COINS = 0L;
        public static final Long DEFAULT_DISTANCE_FROM_PREVIOUS_ONE = 0L;
        public static final Long DEFAULT_FREE_CELL_LENGTH = 0L;
        public static final Long DEFAULT_INDEX_IN_DAY_RANKLIST = 0L;
        public static final Boolean DEFAULT_IS_DOUBLE = Boolean.FALSE;
        public static final Boolean DEFAULT_IS_FREEZE = Boolean.FALSE;
        public static final Long DEFAULT_TIME_DOUBLE_END_MS = 0L;
        public static final Long DEFAULT_TIME_END_MS = 0L;
        public static final Long DEFAULT_TIME_FREEZE_END_MS = 0L;
        public static final Long DEFAULT_TIME_NOW_MS = 0L;
        public static final Long DEFAULT_TIME_START_MS = 0L;
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 10)
        public final Long contribute_most_coins;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 9)
        public final User contribute_most_user;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 11)
        public final Long distance_from_previous_one;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
        public final Long free_cell_length;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 12)
        public final Long index_in_day_ranklist;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 8)
        public final Boolean is_double;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 7)
        public final Boolean is_freeze;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
        public final Long time_double_end_ms;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
        public final Long time_end_ms;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
        public final Long time_freeze_end_ms;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
        public final Long time_now_ms;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
        public final Long time_start_ms;

        public static final class Builder extends Message.Builder<FreeCellData, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public Long contribute_most_coins;
            public User contribute_most_user;
            public Long distance_from_previous_one;
            public Long free_cell_length;
            public Long index_in_day_ranklist;
            public Boolean is_double;
            public Boolean is_freeze;
            public Long time_double_end_ms;
            public Long time_end_ms;
            public Long time_freeze_end_ms;
            public Long time_now_ms;
            public Long time_start_ms;

            public final FreeCellData build() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11457, new Class[0], FreeCellData.class)) {
                    return (FreeCellData) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11457, new Class[0], FreeCellData.class);
                }
                FreeCellData freeCellData = new FreeCellData(this.time_now_ms, this.time_start_ms, this.time_freeze_end_ms, this.time_double_end_ms, this.time_end_ms, this.free_cell_length, this.is_freeze, this.is_double, this.contribute_most_user, this.contribute_most_coins, this.distance_from_previous_one, this.index_in_day_ranklist, super.buildUnknownFields());
                return freeCellData;
            }

            public final Builder contribute_most_coins(Long l) {
                this.contribute_most_coins = l;
                return this;
            }

            public final Builder contribute_most_user(User user) {
                this.contribute_most_user = user;
                return this;
            }

            public final Builder distance_from_previous_one(Long l) {
                this.distance_from_previous_one = l;
                return this;
            }

            public final Builder free_cell_length(Long l) {
                this.free_cell_length = l;
                return this;
            }

            public final Builder index_in_day_ranklist(Long l) {
                this.index_in_day_ranklist = l;
                return this;
            }

            public final Builder is_double(Boolean bool) {
                this.is_double = bool;
                return this;
            }

            public final Builder is_freeze(Boolean bool) {
                this.is_freeze = bool;
                return this;
            }

            public final Builder time_double_end_ms(Long l) {
                this.time_double_end_ms = l;
                return this;
            }

            public final Builder time_end_ms(Long l) {
                this.time_end_ms = l;
                return this;
            }

            public final Builder time_freeze_end_ms(Long l) {
                this.time_freeze_end_ms = l;
                return this;
            }

            public final Builder time_now_ms(Long l) {
                this.time_now_ms = l;
                return this;
            }

            public final Builder time_start_ms(Long l) {
                this.time_start_ms = l;
                return this;
            }
        }

        static final class ProtoAdapter_FreeCellData extends ProtoAdapter<FreeCellData> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_FreeCellData() {
                super(FieldEncoding.LENGTH_DELIMITED, FreeCellData.class);
            }

            public final FreeCellData redact(FreeCellData freeCellData) {
                if (PatchProxy.isSupport(new Object[]{freeCellData}, this, changeQuickRedirect, false, 11461, new Class[]{FreeCellData.class}, FreeCellData.class)) {
                    return (FreeCellData) PatchProxy.accessDispatch(new Object[]{freeCellData}, this, changeQuickRedirect, false, 11461, new Class[]{FreeCellData.class}, FreeCellData.class);
                }
                Builder newBuilder = freeCellData.newBuilder();
                if (newBuilder.contribute_most_user != null) {
                    newBuilder.contribute_most_user = (User) User.ADAPTER.redact(newBuilder.contribute_most_user);
                }
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final FreeCellData decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11460, new Class[]{ProtoReader.class}, FreeCellData.class)) {
                    return (FreeCellData) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11460, new Class[]{ProtoReader.class}, FreeCellData.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.time_now_ms((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 2:
                                builder.time_start_ms((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 3:
                                builder.time_freeze_end_ms((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 4:
                                builder.time_double_end_ms((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 5:
                                builder.time_end_ms((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 6:
                                builder.free_cell_length((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case e.l /*7*/:
                                builder.is_freeze((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                break;
                            case 8:
                                builder.is_double((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                break;
                            case 9:
                                builder.contribute_most_user((User) User.ADAPTER.decode(protoReader2));
                                break;
                            case 10:
                                builder.contribute_most_coins((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 11:
                                builder.distance_from_previous_one((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                                builder.index_in_day_ranklist((Long) ProtoAdapter.INT64.decode(protoReader2));
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

            public final int encodedSize(FreeCellData freeCellData) {
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
                FreeCellData freeCellData2 = freeCellData;
                int i12 = 0;
                if (PatchProxy.isSupport(new Object[]{freeCellData2}, this, changeQuickRedirect, false, 11458, new Class[]{FreeCellData.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{freeCellData2}, this, changeQuickRedirect, false, 11458, new Class[]{FreeCellData.class}, Integer.TYPE)).intValue();
                }
                if (freeCellData2.time_now_ms != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, freeCellData2.time_now_ms);
                } else {
                    i = 0;
                }
                if (freeCellData2.time_start_ms != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, freeCellData2.time_start_ms);
                } else {
                    i2 = 0;
                }
                int i13 = i + i2;
                if (freeCellData2.time_freeze_end_ms != null) {
                    i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, freeCellData2.time_freeze_end_ms);
                } else {
                    i3 = 0;
                }
                int i14 = i13 + i3;
                if (freeCellData2.time_double_end_ms != null) {
                    i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, freeCellData2.time_double_end_ms);
                } else {
                    i4 = 0;
                }
                int i15 = i14 + i4;
                if (freeCellData2.time_end_ms != null) {
                    i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, freeCellData2.time_end_ms);
                } else {
                    i5 = 0;
                }
                int i16 = i15 + i5;
                if (freeCellData2.free_cell_length != null) {
                    i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, freeCellData2.free_cell_length);
                } else {
                    i6 = 0;
                }
                int i17 = i16 + i6;
                if (freeCellData2.is_freeze != null) {
                    i7 = ProtoAdapter.BOOL.encodedSizeWithTag(7, freeCellData2.is_freeze);
                } else {
                    i7 = 0;
                }
                int i18 = i17 + i7;
                if (freeCellData2.is_double != null) {
                    i8 = ProtoAdapter.BOOL.encodedSizeWithTag(8, freeCellData2.is_double);
                } else {
                    i8 = 0;
                }
                int i19 = i18 + i8;
                if (freeCellData2.contribute_most_user != null) {
                    i9 = User.ADAPTER.encodedSizeWithTag(9, freeCellData2.contribute_most_user);
                } else {
                    i9 = 0;
                }
                int i20 = i19 + i9;
                if (freeCellData2.contribute_most_coins != null) {
                    i10 = ProtoAdapter.INT64.encodedSizeWithTag(10, freeCellData2.contribute_most_coins);
                } else {
                    i10 = 0;
                }
                int i21 = i20 + i10;
                if (freeCellData2.distance_from_previous_one != null) {
                    i11 = ProtoAdapter.INT64.encodedSizeWithTag(11, freeCellData2.distance_from_previous_one);
                } else {
                    i11 = 0;
                }
                int i22 = i21 + i11;
                if (freeCellData2.index_in_day_ranklist != null) {
                    i12 = ProtoAdapter.INT64.encodedSizeWithTag(12, freeCellData2.index_in_day_ranklist);
                }
                return i22 + i12 + freeCellData.unknownFields().size();
            }

            public final void encode(ProtoWriter protoWriter, FreeCellData freeCellData) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                FreeCellData freeCellData2 = freeCellData;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, freeCellData2}, this, changeQuickRedirect, false, 11459, new Class[]{ProtoWriter.class, FreeCellData.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, freeCellData2}, this, changeQuickRedirect, false, 11459, new Class[]{ProtoWriter.class, FreeCellData.class}, Void.TYPE);
                    return;
                }
                if (freeCellData2.time_now_ms != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, freeCellData2.time_now_ms);
                }
                if (freeCellData2.time_start_ms != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, freeCellData2.time_start_ms);
                }
                if (freeCellData2.time_freeze_end_ms != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, freeCellData2.time_freeze_end_ms);
                }
                if (freeCellData2.time_double_end_ms != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, freeCellData2.time_double_end_ms);
                }
                if (freeCellData2.time_end_ms != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 5, freeCellData2.time_end_ms);
                }
                if (freeCellData2.free_cell_length != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 6, freeCellData2.free_cell_length);
                }
                if (freeCellData2.is_freeze != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 7, freeCellData2.is_freeze);
                }
                if (freeCellData2.is_double != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 8, freeCellData2.is_double);
                }
                if (freeCellData2.contribute_most_user != null) {
                    User.ADAPTER.encodeWithTag(protoWriter2, 9, freeCellData2.contribute_most_user);
                }
                if (freeCellData2.contribute_most_coins != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 10, freeCellData2.contribute_most_coins);
                }
                if (freeCellData2.distance_from_previous_one != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 11, freeCellData2.distance_from_previous_one);
                }
                if (freeCellData2.index_in_day_ranklist != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 12, freeCellData2.index_in_day_ranklist);
                }
                protoWriter2.writeBytes(freeCellData.unknownFields());
            }
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11453, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11453, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.time_now_ms = this.time_now_ms;
            builder.time_start_ms = this.time_start_ms;
            builder.time_freeze_end_ms = this.time_freeze_end_ms;
            builder.time_double_end_ms = this.time_double_end_ms;
            builder.time_end_ms = this.time_end_ms;
            builder.free_cell_length = this.free_cell_length;
            builder.is_freeze = this.is_freeze;
            builder.is_double = this.is_double;
            builder.contribute_most_user = this.contribute_most_user;
            builder.contribute_most_coins = this.contribute_most_coins;
            builder.distance_from_previous_one = this.distance_from_previous_one;
            builder.index_in_day_ranklist = this.index_in_day_ranklist;
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
            int i12 = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11455, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11455, new Class[0], Integer.TYPE)).intValue();
            }
            int i13 = this.hashCode;
            if (i13 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.time_now_ms != null) {
                    i = this.time_now_ms.hashCode();
                } else {
                    i = 0;
                }
                int i14 = (hashCode + i) * 37;
                if (this.time_start_ms != null) {
                    i2 = this.time_start_ms.hashCode();
                } else {
                    i2 = 0;
                }
                int i15 = (i14 + i2) * 37;
                if (this.time_freeze_end_ms != null) {
                    i3 = this.time_freeze_end_ms.hashCode();
                } else {
                    i3 = 0;
                }
                int i16 = (i15 + i3) * 37;
                if (this.time_double_end_ms != null) {
                    i4 = this.time_double_end_ms.hashCode();
                } else {
                    i4 = 0;
                }
                int i17 = (i16 + i4) * 37;
                if (this.time_end_ms != null) {
                    i5 = this.time_end_ms.hashCode();
                } else {
                    i5 = 0;
                }
                int i18 = (i17 + i5) * 37;
                if (this.free_cell_length != null) {
                    i6 = this.free_cell_length.hashCode();
                } else {
                    i6 = 0;
                }
                int i19 = (i18 + i6) * 37;
                if (this.is_freeze != null) {
                    i7 = this.is_freeze.hashCode();
                } else {
                    i7 = 0;
                }
                int i20 = (i19 + i7) * 37;
                if (this.is_double != null) {
                    i8 = this.is_double.hashCode();
                } else {
                    i8 = 0;
                }
                int i21 = (i20 + i8) * 37;
                if (this.contribute_most_user != null) {
                    i9 = this.contribute_most_user.hashCode();
                } else {
                    i9 = 0;
                }
                int i22 = (i21 + i9) * 37;
                if (this.contribute_most_coins != null) {
                    i10 = this.contribute_most_coins.hashCode();
                } else {
                    i10 = 0;
                }
                int i23 = (i22 + i10) * 37;
                if (this.distance_from_previous_one != null) {
                    i11 = this.distance_from_previous_one.hashCode();
                } else {
                    i11 = 0;
                }
                int i24 = (i23 + i11) * 37;
                if (this.index_in_day_ranklist != null) {
                    i12 = this.index_in_day_ranklist.hashCode();
                }
                i13 = i24 + i12;
                this.hashCode = i13;
            }
            return i13;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11456, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11456, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.time_now_ms != null) {
                sb.append(", time_now_ms=");
                sb.append(this.time_now_ms);
            }
            if (this.time_start_ms != null) {
                sb.append(", time_start_ms=");
                sb.append(this.time_start_ms);
            }
            if (this.time_freeze_end_ms != null) {
                sb.append(", time_freeze_end_ms=");
                sb.append(this.time_freeze_end_ms);
            }
            if (this.time_double_end_ms != null) {
                sb.append(", time_double_end_ms=");
                sb.append(this.time_double_end_ms);
            }
            if (this.time_end_ms != null) {
                sb.append(", time_end_ms=");
                sb.append(this.time_end_ms);
            }
            if (this.free_cell_length != null) {
                sb.append(", free_cell_length=");
                sb.append(this.free_cell_length);
            }
            if (this.is_freeze != null) {
                sb.append(", is_freeze=");
                sb.append(this.is_freeze);
            }
            if (this.is_double != null) {
                sb.append(", is_double=");
                sb.append(this.is_double);
            }
            if (this.contribute_most_user != null) {
                sb.append(", contribute_most_user=");
                sb.append(this.contribute_most_user);
            }
            if (this.contribute_most_coins != null) {
                sb.append(", contribute_most_coins=");
                sb.append(this.contribute_most_coins);
            }
            if (this.distance_from_previous_one != null) {
                sb.append(", distance_from_previous_one=");
                sb.append(this.distance_from_previous_one);
            }
            if (this.index_in_day_ranklist != null) {
                sb.append(", index_in_day_ranklist=");
                sb.append(this.index_in_day_ranklist);
            }
            StringBuilder replace = sb.replace(0, 2, "FreeCellData{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11454, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11454, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof FreeCellData)) {
                    return false;
                }
                FreeCellData freeCellData = (FreeCellData) obj;
                if (!unknownFields().equals(freeCellData.unknownFields()) || !Internal.equals(this.time_now_ms, freeCellData.time_now_ms) || !Internal.equals(this.time_start_ms, freeCellData.time_start_ms) || !Internal.equals(this.time_freeze_end_ms, freeCellData.time_freeze_end_ms) || !Internal.equals(this.time_double_end_ms, freeCellData.time_double_end_ms) || !Internal.equals(this.time_end_ms, freeCellData.time_end_ms) || !Internal.equals(this.free_cell_length, freeCellData.free_cell_length) || !Internal.equals(this.is_freeze, freeCellData.is_freeze) || !Internal.equals(this.is_double, freeCellData.is_double) || !Internal.equals(this.contribute_most_user, freeCellData.contribute_most_user) || !Internal.equals(this.contribute_most_coins, freeCellData.contribute_most_coins) || !Internal.equals(this.distance_from_previous_one, freeCellData.distance_from_previous_one) || !Internal.equals(this.index_in_day_ranklist, freeCellData.index_in_day_ranklist)) {
                    return false;
                }
                return true;
            }
        }

        public FreeCellData(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Boolean bool, Boolean bool2, User user, Long l7, Long l8, Long l9) {
            this(l, l2, l3, l4, l5, l6, bool, bool2, user, l7, l8, l9, ByteString.EMPTY);
        }

        public FreeCellData(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Boolean bool, Boolean bool2, User user, Long l7, Long l8, Long l9, ByteString byteString) {
            super(ADAPTER, byteString);
            this.time_now_ms = l;
            this.time_start_ms = l2;
            this.time_freeze_end_ms = l3;
            this.time_double_end_ms = l4;
            this.time_end_ms = l5;
            this.free_cell_length = l6;
            this.is_freeze = bool;
            this.is_double = bool2;
            this.contribute_most_user = user;
            this.contribute_most_coins = l7;
            this.distance_from_previous_one = l8;
            this.index_in_day_ranklist = l9;
        }
    }

    public static final class Builder extends Message.Builder<FreeCellGiftMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Long combo_count;
        public Common common;
        public Long fan_ticket_count;
        public FreeCellData free_cell;
        public Long gift_id;
        public Long group_count;
        public Long repeat_count;
        public User to_user;
        public User user;

        public final FreeCellGiftMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11452, new Class[0], FreeCellGiftMessage.class)) {
                return (FreeCellGiftMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11452, new Class[0], FreeCellGiftMessage.class);
            }
            FreeCellGiftMessage freeCellGiftMessage = new FreeCellGiftMessage(this.common, this.gift_id, this.fan_ticket_count, this.group_count, this.repeat_count, this.combo_count, this.user, this.to_user, this.free_cell, super.buildUnknownFields());
            return freeCellGiftMessage;
        }

        public final Builder combo_count(Long l) {
            this.combo_count = l;
            return this;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder fan_ticket_count(Long l) {
            this.fan_ticket_count = l;
            return this;
        }

        public final Builder free_cell(FreeCellData freeCellData) {
            this.free_cell = freeCellData;
            return this;
        }

        public final Builder gift_id(Long l) {
            this.gift_id = l;
            return this;
        }

        public final Builder group_count(Long l) {
            this.group_count = l;
            return this;
        }

        public final Builder repeat_count(Long l) {
            this.repeat_count = l;
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

    static final class ProtoAdapter_FreeCellGiftMessage extends ProtoAdapter<FreeCellGiftMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_FreeCellGiftMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, FreeCellGiftMessage.class);
        }

        public final FreeCellGiftMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11464, new Class[]{ProtoReader.class}, FreeCellGiftMessage.class)) {
                return (FreeCellGiftMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11464, new Class[]{ProtoReader.class}, FreeCellGiftMessage.class);
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
                            builder.group_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 5:
                            builder.repeat_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 6:
                            builder.combo_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case e.l /*7*/:
                            builder.user((User) User.ADAPTER.decode(protoReader2));
                            break;
                        case 8:
                            builder.to_user((User) User.ADAPTER.decode(protoReader2));
                            break;
                        case 9:
                            builder.free_cell((FreeCellData) FreeCellData.ADAPTER.decode(protoReader2));
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

        public final int encodedSize(FreeCellGiftMessage freeCellGiftMessage) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            FreeCellGiftMessage freeCellGiftMessage2 = freeCellGiftMessage;
            int i9 = 0;
            if (PatchProxy.isSupport(new Object[]{freeCellGiftMessage2}, this, changeQuickRedirect, false, 11462, new Class[]{FreeCellGiftMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{freeCellGiftMessage2}, this, changeQuickRedirect, false, 11462, new Class[]{FreeCellGiftMessage.class}, Integer.TYPE)).intValue();
            }
            if (freeCellGiftMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, freeCellGiftMessage2.common);
            } else {
                i = 0;
            }
            if (freeCellGiftMessage2.gift_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, freeCellGiftMessage2.gift_id);
            } else {
                i2 = 0;
            }
            int i10 = i + i2;
            if (freeCellGiftMessage2.fan_ticket_count != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, freeCellGiftMessage2.fan_ticket_count);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (freeCellGiftMessage2.group_count != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, freeCellGiftMessage2.group_count);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (freeCellGiftMessage2.repeat_count != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, freeCellGiftMessage2.repeat_count);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (freeCellGiftMessage2.combo_count != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, freeCellGiftMessage2.combo_count);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (freeCellGiftMessage2.user != null) {
                i7 = User.ADAPTER.encodedSizeWithTag(7, freeCellGiftMessage2.user);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (freeCellGiftMessage2.to_user != null) {
                i8 = User.ADAPTER.encodedSizeWithTag(8, freeCellGiftMessage2.to_user);
            } else {
                i8 = 0;
            }
            int i16 = i15 + i8;
            if (freeCellGiftMessage2.free_cell != null) {
                i9 = FreeCellData.ADAPTER.encodedSizeWithTag(9, freeCellGiftMessage2.free_cell);
            }
            return i16 + i9 + freeCellGiftMessage.unknownFields().size();
        }

        public final FreeCellGiftMessage redact(FreeCellGiftMessage freeCellGiftMessage) {
            if (PatchProxy.isSupport(new Object[]{freeCellGiftMessage}, this, changeQuickRedirect, false, 11465, new Class[]{FreeCellGiftMessage.class}, FreeCellGiftMessage.class)) {
                return (FreeCellGiftMessage) PatchProxy.accessDispatch(new Object[]{freeCellGiftMessage}, this, changeQuickRedirect, false, 11465, new Class[]{FreeCellGiftMessage.class}, FreeCellGiftMessage.class);
            }
            Builder newBuilder = freeCellGiftMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.user != null) {
                newBuilder.user = (User) User.ADAPTER.redact(newBuilder.user);
            }
            if (newBuilder.to_user != null) {
                newBuilder.to_user = (User) User.ADAPTER.redact(newBuilder.to_user);
            }
            if (newBuilder.free_cell != null) {
                newBuilder.free_cell = (FreeCellData) FreeCellData.ADAPTER.redact(newBuilder.free_cell);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final void encode(ProtoWriter protoWriter, FreeCellGiftMessage freeCellGiftMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            FreeCellGiftMessage freeCellGiftMessage2 = freeCellGiftMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, freeCellGiftMessage2}, this, changeQuickRedirect, false, 11463, new Class[]{ProtoWriter.class, FreeCellGiftMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, freeCellGiftMessage2}, this, changeQuickRedirect, false, 11463, new Class[]{ProtoWriter.class, FreeCellGiftMessage.class}, Void.TYPE);
                return;
            }
            if (freeCellGiftMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, freeCellGiftMessage2.common);
            }
            if (freeCellGiftMessage2.gift_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, freeCellGiftMessage2.gift_id);
            }
            if (freeCellGiftMessage2.fan_ticket_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, freeCellGiftMessage2.fan_ticket_count);
            }
            if (freeCellGiftMessage2.group_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, freeCellGiftMessage2.group_count);
            }
            if (freeCellGiftMessage2.repeat_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 5, freeCellGiftMessage2.repeat_count);
            }
            if (freeCellGiftMessage2.combo_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 6, freeCellGiftMessage2.combo_count);
            }
            if (freeCellGiftMessage2.user != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 7, freeCellGiftMessage2.user);
            }
            if (freeCellGiftMessage2.to_user != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 8, freeCellGiftMessage2.to_user);
            }
            if (freeCellGiftMessage2.free_cell != null) {
                FreeCellData.ADAPTER.encodeWithTag(protoWriter2, 9, freeCellGiftMessage2.free_cell);
            }
            protoWriter2.writeBytes(freeCellGiftMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11448, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11448, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.gift_id = this.gift_id;
        builder.fan_ticket_count = this.fan_ticket_count;
        builder.group_count = this.group_count;
        builder.repeat_count = this.repeat_count;
        builder.combo_count = this.combo_count;
        builder.user = this.user;
        builder.to_user = this.to_user;
        builder.free_cell = this.free_cell;
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11450, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11450, new Class[0], Integer.TYPE)).intValue();
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
            if (this.gift_id != null) {
                i2 = this.gift_id.hashCode();
            } else {
                i2 = 0;
            }
            int i12 = (i11 + i2) * 37;
            if (this.fan_ticket_count != null) {
                i3 = this.fan_ticket_count.hashCode();
            } else {
                i3 = 0;
            }
            int i13 = (i12 + i3) * 37;
            if (this.group_count != null) {
                i4 = this.group_count.hashCode();
            } else {
                i4 = 0;
            }
            int i14 = (i13 + i4) * 37;
            if (this.repeat_count != null) {
                i5 = this.repeat_count.hashCode();
            } else {
                i5 = 0;
            }
            int i15 = (i14 + i5) * 37;
            if (this.combo_count != null) {
                i6 = this.combo_count.hashCode();
            } else {
                i6 = 0;
            }
            int i16 = (i15 + i6) * 37;
            if (this.user != null) {
                i7 = this.user.hashCode();
            } else {
                i7 = 0;
            }
            int i17 = (i16 + i7) * 37;
            if (this.to_user != null) {
                i8 = this.to_user.hashCode();
            } else {
                i8 = 0;
            }
            int i18 = (i17 + i8) * 37;
            if (this.free_cell != null) {
                i9 = this.free_cell.hashCode();
            }
            i10 = i18 + i9;
            this.hashCode = i10;
        }
        return i10;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11451, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11451, new Class[0], String.class);
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
        if (this.group_count != null) {
            sb.append(", group_count=");
            sb.append(this.group_count);
        }
        if (this.repeat_count != null) {
            sb.append(", repeat_count=");
            sb.append(this.repeat_count);
        }
        if (this.combo_count != null) {
            sb.append(", combo_count=");
            sb.append(this.combo_count);
        }
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        if (this.to_user != null) {
            sb.append(", to_user=");
            sb.append(this.to_user);
        }
        if (this.free_cell != null) {
            sb.append(", free_cell=");
            sb.append(this.free_cell);
        }
        StringBuilder replace = sb.replace(0, 2, "FreeCellGiftMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11449, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11449, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof FreeCellGiftMessage)) {
                return false;
            }
            FreeCellGiftMessage freeCellGiftMessage = (FreeCellGiftMessage) obj;
            if (!unknownFields().equals(freeCellGiftMessage.unknownFields()) || !Internal.equals(this.common, freeCellGiftMessage.common) || !Internal.equals(this.gift_id, freeCellGiftMessage.gift_id) || !Internal.equals(this.fan_ticket_count, freeCellGiftMessage.fan_ticket_count) || !Internal.equals(this.group_count, freeCellGiftMessage.group_count) || !Internal.equals(this.repeat_count, freeCellGiftMessage.repeat_count) || !Internal.equals(this.combo_count, freeCellGiftMessage.combo_count) || !Internal.equals(this.user, freeCellGiftMessage.user) || !Internal.equals(this.to_user, freeCellGiftMessage.to_user) || !Internal.equals(this.free_cell, freeCellGiftMessage.free_cell)) {
                return false;
            }
            return true;
        }
    }

    public FreeCellGiftMessage(Common common2, Long l, Long l2, Long l3, Long l4, Long l5, User user2, User user3, FreeCellData freeCellData) {
        this(common2, l, l2, l3, l4, l5, user2, user3, freeCellData, ByteString.EMPTY);
    }

    public FreeCellGiftMessage(Common common2, Long l, Long l2, Long l3, Long l4, Long l5, User user2, User user3, FreeCellData freeCellData, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.gift_id = l;
        this.fan_ticket_count = l2;
        this.group_count = l3;
        this.repeat_count = l4;
        this.combo_count = l5;
        this.user = user2;
        this.to_user = user3;
        this.free_cell = freeCellData;
    }
}
