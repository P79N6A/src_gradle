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

public final class FreeCellData extends Message<FreeCellData, Builder> {
    public static final ProtoAdapter<FreeCellData> ADAPTER = new ProtoAdapter_FreeCellData();
    public static final Long DEFAULT_CONTRIBUTE_MOST_COINS = 0L;
    public static final Long DEFAULT_DISTANCE_FROM_PREVIOUS_ONE = 0L;
    public static final Long DEFAULT_FREE_CELL_LENGTH = 0L;
    public static final Long DEFAULT_GIFT_ID = 0L;
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
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 13)
    public final Long gift_id;
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
        public Long gift_id;
        public Long index_in_day_ranklist;
        public Boolean is_double;
        public Boolean is_freeze;
        public Long time_double_end_ms;
        public Long time_end_ms;
        public Long time_freeze_end_ms;
        public Long time_now_ms;
        public Long time_start_ms;

        public final FreeCellData build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11443, new Class[0], FreeCellData.class)) {
                return (FreeCellData) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11443, new Class[0], FreeCellData.class);
            }
            Long l = this.time_now_ms;
            Long l2 = this.time_start_ms;
            Long l3 = this.time_freeze_end_ms;
            Long l4 = this.time_double_end_ms;
            Long l5 = this.time_end_ms;
            Long l6 = this.free_cell_length;
            Boolean bool = this.is_freeze;
            Boolean bool2 = this.is_double;
            User user = this.contribute_most_user;
            Long l7 = this.contribute_most_coins;
            Long l8 = this.distance_from_previous_one;
            Long l9 = this.index_in_day_ranklist;
            FreeCellData freeCellData = new FreeCellData(l, l2, l3, l4, l5, l6, bool, bool2, user, l7, l8, l9, this.gift_id, super.buildUnknownFields());
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

        public final Builder gift_id(Long l) {
            this.gift_id = l;
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
            if (PatchProxy.isSupport(new Object[]{freeCellData}, this, changeQuickRedirect, false, 11447, new Class[]{FreeCellData.class}, FreeCellData.class)) {
                return (FreeCellData) PatchProxy.accessDispatch(new Object[]{freeCellData}, this, changeQuickRedirect, false, 11447, new Class[]{FreeCellData.class}, FreeCellData.class);
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
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11446, new Class[]{ProtoReader.class}, FreeCellData.class)) {
                return (FreeCellData) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11446, new Class[]{ProtoReader.class}, FreeCellData.class);
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
                        case 13:
                            builder.gift_id((Long) ProtoAdapter.INT64.decode(protoReader2));
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
            int i12;
            FreeCellData freeCellData2 = freeCellData;
            int i13 = 0;
            if (PatchProxy.isSupport(new Object[]{freeCellData2}, this, changeQuickRedirect, false, 11444, new Class[]{FreeCellData.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{freeCellData2}, this, changeQuickRedirect, false, 11444, new Class[]{FreeCellData.class}, Integer.TYPE)).intValue();
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
            int i14 = i + i2;
            if (freeCellData2.time_freeze_end_ms != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, freeCellData2.time_freeze_end_ms);
            } else {
                i3 = 0;
            }
            int i15 = i14 + i3;
            if (freeCellData2.time_double_end_ms != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, freeCellData2.time_double_end_ms);
            } else {
                i4 = 0;
            }
            int i16 = i15 + i4;
            if (freeCellData2.time_end_ms != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, freeCellData2.time_end_ms);
            } else {
                i5 = 0;
            }
            int i17 = i16 + i5;
            if (freeCellData2.free_cell_length != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, freeCellData2.free_cell_length);
            } else {
                i6 = 0;
            }
            int i18 = i17 + i6;
            if (freeCellData2.is_freeze != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(7, freeCellData2.is_freeze);
            } else {
                i7 = 0;
            }
            int i19 = i18 + i7;
            if (freeCellData2.is_double != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(8, freeCellData2.is_double);
            } else {
                i8 = 0;
            }
            int i20 = i19 + i8;
            if (freeCellData2.contribute_most_user != null) {
                i9 = User.ADAPTER.encodedSizeWithTag(9, freeCellData2.contribute_most_user);
            } else {
                i9 = 0;
            }
            int i21 = i20 + i9;
            if (freeCellData2.contribute_most_coins != null) {
                i10 = ProtoAdapter.INT64.encodedSizeWithTag(10, freeCellData2.contribute_most_coins);
            } else {
                i10 = 0;
            }
            int i22 = i21 + i10;
            if (freeCellData2.distance_from_previous_one != null) {
                i11 = ProtoAdapter.INT64.encodedSizeWithTag(11, freeCellData2.distance_from_previous_one);
            } else {
                i11 = 0;
            }
            int i23 = i22 + i11;
            if (freeCellData2.index_in_day_ranklist != null) {
                i12 = ProtoAdapter.INT64.encodedSizeWithTag(12, freeCellData2.index_in_day_ranklist);
            } else {
                i12 = 0;
            }
            int i24 = i23 + i12;
            if (freeCellData2.gift_id != null) {
                i13 = ProtoAdapter.INT64.encodedSizeWithTag(13, freeCellData2.gift_id);
            }
            return i24 + i13 + freeCellData.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, FreeCellData freeCellData) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            FreeCellData freeCellData2 = freeCellData;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, freeCellData2}, this, changeQuickRedirect, false, 11445, new Class[]{ProtoWriter.class, FreeCellData.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, freeCellData2}, this, changeQuickRedirect, false, 11445, new Class[]{ProtoWriter.class, FreeCellData.class}, Void.TYPE);
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
            if (freeCellData2.gift_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 13, freeCellData2.gift_id);
            }
            protoWriter2.writeBytes(freeCellData.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11439, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11439, new Class[0], Builder.class);
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
        builder.gift_id = this.gift_id;
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
        int i13 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11441, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11441, new Class[0], Integer.TYPE)).intValue();
        }
        int i14 = this.hashCode;
        if (i14 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.time_now_ms != null) {
                i = this.time_now_ms.hashCode();
            } else {
                i = 0;
            }
            int i15 = (hashCode + i) * 37;
            if (this.time_start_ms != null) {
                i2 = this.time_start_ms.hashCode();
            } else {
                i2 = 0;
            }
            int i16 = (i15 + i2) * 37;
            if (this.time_freeze_end_ms != null) {
                i3 = this.time_freeze_end_ms.hashCode();
            } else {
                i3 = 0;
            }
            int i17 = (i16 + i3) * 37;
            if (this.time_double_end_ms != null) {
                i4 = this.time_double_end_ms.hashCode();
            } else {
                i4 = 0;
            }
            int i18 = (i17 + i4) * 37;
            if (this.time_end_ms != null) {
                i5 = this.time_end_ms.hashCode();
            } else {
                i5 = 0;
            }
            int i19 = (i18 + i5) * 37;
            if (this.free_cell_length != null) {
                i6 = this.free_cell_length.hashCode();
            } else {
                i6 = 0;
            }
            int i20 = (i19 + i6) * 37;
            if (this.is_freeze != null) {
                i7 = this.is_freeze.hashCode();
            } else {
                i7 = 0;
            }
            int i21 = (i20 + i7) * 37;
            if (this.is_double != null) {
                i8 = this.is_double.hashCode();
            } else {
                i8 = 0;
            }
            int i22 = (i21 + i8) * 37;
            if (this.contribute_most_user != null) {
                i9 = this.contribute_most_user.hashCode();
            } else {
                i9 = 0;
            }
            int i23 = (i22 + i9) * 37;
            if (this.contribute_most_coins != null) {
                i10 = this.contribute_most_coins.hashCode();
            } else {
                i10 = 0;
            }
            int i24 = (i23 + i10) * 37;
            if (this.distance_from_previous_one != null) {
                i11 = this.distance_from_previous_one.hashCode();
            } else {
                i11 = 0;
            }
            int i25 = (i24 + i11) * 37;
            if (this.index_in_day_ranklist != null) {
                i12 = this.index_in_day_ranklist.hashCode();
            } else {
                i12 = 0;
            }
            int i26 = (i25 + i12) * 37;
            if (this.gift_id != null) {
                i13 = this.gift_id.hashCode();
            }
            i14 = i26 + i13;
            this.hashCode = i14;
        }
        return i14;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11442, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11442, new Class[0], String.class);
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
        if (this.gift_id != null) {
            sb.append(", gift_id=");
            sb.append(this.gift_id);
        }
        StringBuilder replace = sb.replace(0, 2, "FreeCellData{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11440, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11440, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof FreeCellData)) {
                return false;
            }
            FreeCellData freeCellData = (FreeCellData) obj;
            if (!unknownFields().equals(freeCellData.unknownFields()) || !Internal.equals(this.time_now_ms, freeCellData.time_now_ms) || !Internal.equals(this.time_start_ms, freeCellData.time_start_ms) || !Internal.equals(this.time_freeze_end_ms, freeCellData.time_freeze_end_ms) || !Internal.equals(this.time_double_end_ms, freeCellData.time_double_end_ms) || !Internal.equals(this.time_end_ms, freeCellData.time_end_ms) || !Internal.equals(this.free_cell_length, freeCellData.free_cell_length) || !Internal.equals(this.is_freeze, freeCellData.is_freeze) || !Internal.equals(this.is_double, freeCellData.is_double) || !Internal.equals(this.contribute_most_user, freeCellData.contribute_most_user) || !Internal.equals(this.contribute_most_coins, freeCellData.contribute_most_coins) || !Internal.equals(this.distance_from_previous_one, freeCellData.distance_from_previous_one) || !Internal.equals(this.index_in_day_ranklist, freeCellData.index_in_day_ranklist) || !Internal.equals(this.gift_id, freeCellData.gift_id)) {
                return false;
            }
            return true;
        }
    }

    public FreeCellData(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Boolean bool, Boolean bool2, User user, Long l7, Long l8, Long l9, Long l10) {
        this(l, l2, l3, l4, l5, l6, bool, bool2, user, l7, l8, l9, l10, ByteString.EMPTY);
    }

    public FreeCellData(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Boolean bool, Boolean bool2, User user, Long l7, Long l8, Long l9, Long l10, ByteString byteString) {
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
        this.gift_id = l10;
    }
}
