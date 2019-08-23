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
import java.util.Map;
import okio.ByteString;

public final class GiftStruct extends Message<GiftStruct, Builder> {
    public static final ProtoAdapter<GiftStruct> ADAPTER = new ProtoAdapter_GiftStruct();
    public static final Integer DEFAULT_ACTION_TYPE = 0;
    public static final Boolean DEFAULT_COMBO = Boolean.FALSE;
    public static final Integer DEFAULT_DIAMOND_COUNT = 0;
    public static final Boolean DEFAULT_DOODLE = Boolean.FALSE;
    public static final Long DEFAULT_DURATION = 0L;
    public static final Boolean DEFAULT_FOR_CUSTOM = Boolean.FALSE;
    public static final Boolean DEFAULT_FOR_FANSCLUB = Boolean.FALSE;
    public static final Boolean DEFAULT_FOR_LINKMIC = Boolean.FALSE;
    public static final Long DEFAULT_ID = 0L;
    public static final Boolean DEFAULT_IS_DISPLAYED_ON_PANEL = Boolean.FALSE;
    public static final Boolean DEFAULT_NOTIFY = Boolean.FALSE;
    public static final Long DEFAULT_PRIMARY_EFFECT_ID = 0L;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_WATERMELON_SEEDS = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 22)
    public final Integer action_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 10)
    public final Boolean combo;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String describe;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 12)
    public final Integer diamond_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 8)
    public final Boolean doodle;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long duration;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.GiftStruct$GiftStructFansClubInfo#ADAPTER", tag = 6)
    public final GiftStructFansClubInfo fansclub_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 19)
    public final Boolean for_custom;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 9)
    public final Boolean for_fansclub;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 7)
    public final Boolean for_linkmic;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 15)
    public final Image gift_label_icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 24)
    public final String gold_effect;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 21)
    public final Image icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long id;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 1)
    public final Image image;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 13)
    public final Boolean is_displayed_on_panel;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 18)
    public final String manual;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 16)
    public final String name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public final Boolean notify;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 14)
    public final Long primary_effect_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 17)
    public final String region;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 20)
    public final Map<String, Long> special_effects;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.LuckyMoneyGiftMeta#ADAPTER", label = WireField.Label.REPEATED, tag = 25)
    public final List<LuckyMoneyGiftMeta> subs;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 11)
    public final Integer type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 23)
    public final Integer watermelon_seeds;

    public static final class GiftStructFansClubInfo extends Message<GiftStructFansClubInfo, Builder> {
        public static final ProtoAdapter<GiftStructFansClubInfo> ADAPTER = new ProtoAdapter_GiftStructFansClubInfo();
        public static final Integer DEFAULT_INSERT_POS = 0;
        public static final Integer DEFAULT_MIN_LEVEL = 0;
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
        public final Integer insert_pos;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
        public final Integer min_level;

        public static final class Builder extends Message.Builder<GiftStructFansClubInfo, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public Integer insert_pos;
            public Integer min_level;

            public final GiftStructFansClubInfo build() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11540, new Class[0], GiftStructFansClubInfo.class)) {
                    return new GiftStructFansClubInfo(this.min_level, this.insert_pos, super.buildUnknownFields());
                }
                return (GiftStructFansClubInfo) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11540, new Class[0], GiftStructFansClubInfo.class);
            }

            public final Builder insert_pos(Integer num) {
                this.insert_pos = num;
                return this;
            }

            public final Builder min_level(Integer num) {
                this.min_level = num;
                return this;
            }
        }

        static final class ProtoAdapter_GiftStructFansClubInfo extends ProtoAdapter<GiftStructFansClubInfo> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_GiftStructFansClubInfo() {
                super(FieldEncoding.LENGTH_DELIMITED, GiftStructFansClubInfo.class);
            }

            public final int encodedSize(GiftStructFansClubInfo giftStructFansClubInfo) {
                int i;
                GiftStructFansClubInfo giftStructFansClubInfo2 = giftStructFansClubInfo;
                int i2 = 0;
                if (PatchProxy.isSupport(new Object[]{giftStructFansClubInfo2}, this, changeQuickRedirect, false, 11541, new Class[]{GiftStructFansClubInfo.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{giftStructFansClubInfo2}, this, changeQuickRedirect, false, 11541, new Class[]{GiftStructFansClubInfo.class}, Integer.TYPE)).intValue();
                }
                if (giftStructFansClubInfo2.min_level != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(1, giftStructFansClubInfo2.min_level);
                } else {
                    i = 0;
                }
                if (giftStructFansClubInfo2.insert_pos != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, giftStructFansClubInfo2.insert_pos);
                }
                return i + i2 + giftStructFansClubInfo.unknownFields().size();
            }

            public final GiftStructFansClubInfo redact(GiftStructFansClubInfo giftStructFansClubInfo) {
                if (PatchProxy.isSupport(new Object[]{giftStructFansClubInfo}, this, changeQuickRedirect, false, 11544, new Class[]{GiftStructFansClubInfo.class}, GiftStructFansClubInfo.class)) {
                    return (GiftStructFansClubInfo) PatchProxy.accessDispatch(new Object[]{giftStructFansClubInfo}, this, changeQuickRedirect, false, 11544, new Class[]{GiftStructFansClubInfo.class}, GiftStructFansClubInfo.class);
                }
                Builder newBuilder = giftStructFansClubInfo.newBuilder();
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final GiftStructFansClubInfo decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11543, new Class[]{ProtoReader.class}, GiftStructFansClubInfo.class)) {
                    return (GiftStructFansClubInfo) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11543, new Class[]{ProtoReader.class}, GiftStructFansClubInfo.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.min_level((Integer) ProtoAdapter.INT32.decode(protoReader2));
                                break;
                            case 2:
                                builder.insert_pos((Integer) ProtoAdapter.INT32.decode(protoReader2));
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

            public final void encode(ProtoWriter protoWriter, GiftStructFansClubInfo giftStructFansClubInfo) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                GiftStructFansClubInfo giftStructFansClubInfo2 = giftStructFansClubInfo;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, giftStructFansClubInfo2}, this, changeQuickRedirect, false, 11542, new Class[]{ProtoWriter.class, GiftStructFansClubInfo.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, giftStructFansClubInfo2}, this, changeQuickRedirect, false, 11542, new Class[]{ProtoWriter.class, GiftStructFansClubInfo.class}, Void.TYPE);
                    return;
                }
                if (giftStructFansClubInfo2.min_level != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1, giftStructFansClubInfo2.min_level);
                }
                if (giftStructFansClubInfo2.insert_pos != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, giftStructFansClubInfo2.insert_pos);
                }
                protoWriter2.writeBytes(giftStructFansClubInfo.unknownFields());
            }
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11536, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11536, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.min_level = this.min_level;
            builder.insert_pos = this.insert_pos;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final int hashCode() {
            int i;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11538, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11538, new Class[0], Integer.TYPE)).intValue();
            }
            int i3 = this.hashCode;
            if (i3 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.min_level != null) {
                    i = this.min_level.hashCode();
                } else {
                    i = 0;
                }
                int i4 = (hashCode + i) * 37;
                if (this.insert_pos != null) {
                    i2 = this.insert_pos.hashCode();
                }
                i3 = i4 + i2;
                this.hashCode = i3;
            }
            return i3;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11539, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11539, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.min_level != null) {
                sb.append(", min_level=");
                sb.append(this.min_level);
            }
            if (this.insert_pos != null) {
                sb.append(", insert_pos=");
                sb.append(this.insert_pos);
            }
            StringBuilder replace = sb.replace(0, 2, "GiftStructFansClubInfo{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11537, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11537, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof GiftStructFansClubInfo)) {
                    return false;
                }
                GiftStructFansClubInfo giftStructFansClubInfo = (GiftStructFansClubInfo) obj;
                if (!unknownFields().equals(giftStructFansClubInfo.unknownFields()) || !Internal.equals(this.min_level, giftStructFansClubInfo.min_level) || !Internal.equals(this.insert_pos, giftStructFansClubInfo.insert_pos)) {
                    return false;
                }
                return true;
            }
        }

        public GiftStructFansClubInfo(Integer num, Integer num2) {
            this(num, num2, ByteString.EMPTY);
        }

        public GiftStructFansClubInfo(Integer num, Integer num2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.min_level = num;
            this.insert_pos = num2;
        }
    }

    public static final class Builder extends Message.Builder<GiftStruct, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer action_type;
        public Boolean combo;
        public String describe;
        public Integer diamond_count;
        public Boolean doodle;
        public Long duration;
        public GiftStructFansClubInfo fansclub_info;
        public Boolean for_custom;
        public Boolean for_fansclub;
        public Boolean for_linkmic;
        public Image gift_label_icon;
        public String gold_effect;
        public Image icon;
        public Long id;
        public Image image;
        public Boolean is_displayed_on_panel;
        public String manual;
        public String name;
        public Boolean notify;
        public Long primary_effect_id;
        public String region;
        public Map<String, Long> special_effects = Internal.newMutableMap();
        public List<LuckyMoneyGiftMeta> subs = Internal.newMutableList();
        public Integer type;
        public Integer watermelon_seeds;

        public final GiftStruct build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11535, new Class[0], GiftStruct.class)) {
                return (GiftStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11535, new Class[0], GiftStruct.class);
            }
            GiftStruct giftStruct = new GiftStruct(this.image, this.describe, this.notify, this.duration, this.id, this.fansclub_info, this.for_linkmic, this.doodle, this.for_fansclub, this.combo, this.type, this.diamond_count, this.is_displayed_on_panel, this.primary_effect_id, this.gift_label_icon, this.name, this.region, this.manual, this.for_custom, this.special_effects, this.icon, this.action_type, this.watermelon_seeds, this.gold_effect, this.subs, super.buildUnknownFields());
            return giftStruct;
        }

        public final Builder action_type(Integer num) {
            this.action_type = num;
            return this;
        }

        public final Builder combo(Boolean bool) {
            this.combo = bool;
            return this;
        }

        public final Builder describe(String str) {
            this.describe = str;
            return this;
        }

        public final Builder diamond_count(Integer num) {
            this.diamond_count = num;
            return this;
        }

        public final Builder doodle(Boolean bool) {
            this.doodle = bool;
            return this;
        }

        public final Builder duration(Long l) {
            this.duration = l;
            return this;
        }

        public final Builder fansclub_info(GiftStructFansClubInfo giftStructFansClubInfo) {
            this.fansclub_info = giftStructFansClubInfo;
            return this;
        }

        public final Builder for_custom(Boolean bool) {
            this.for_custom = bool;
            return this;
        }

        public final Builder for_fansclub(Boolean bool) {
            this.for_fansclub = bool;
            return this;
        }

        public final Builder for_linkmic(Boolean bool) {
            this.for_linkmic = bool;
            return this;
        }

        public final Builder gift_label_icon(Image image2) {
            this.gift_label_icon = image2;
            return this;
        }

        public final Builder gold_effect(String str) {
            this.gold_effect = str;
            return this;
        }

        public final Builder icon(Image image2) {
            this.icon = image2;
            return this;
        }

        public final Builder id(Long l) {
            this.id = l;
            return this;
        }

        public final Builder image(Image image2) {
            this.image = image2;
            return this;
        }

        public final Builder is_displayed_on_panel(Boolean bool) {
            this.is_displayed_on_panel = bool;
            return this;
        }

        public final Builder manual(String str) {
            this.manual = str;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder notify(Boolean bool) {
            this.notify = bool;
            return this;
        }

        public final Builder primary_effect_id(Long l) {
            this.primary_effect_id = l;
            return this;
        }

        public final Builder region(String str) {
            this.region = str;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }

        public final Builder watermelon_seeds(Integer num) {
            this.watermelon_seeds = num;
            return this;
        }

        public final Builder special_effects(Map<String, Long> map) {
            if (PatchProxy.isSupport(new Object[]{map}, this, changeQuickRedirect, false, 11533, new Class[]{Map.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{map}, this, changeQuickRedirect, false, 11533, new Class[]{Map.class}, Builder.class);
            }
            Internal.checkElementsNotNull(map);
            this.special_effects = map;
            return this;
        }

        public final Builder subs(List<LuckyMoneyGiftMeta> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 11534, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 11534, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.subs = list;
            return this;
        }
    }

    static final class ProtoAdapter_GiftStruct extends ProtoAdapter<GiftStruct> {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final ProtoAdapter<Map<String, Long>> special_effects = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.INT64);

        ProtoAdapter_GiftStruct() {
            super(FieldEncoding.LENGTH_DELIMITED, GiftStruct.class);
        }

        public final GiftStruct redact(GiftStruct giftStruct) {
            if (PatchProxy.isSupport(new Object[]{giftStruct}, this, changeQuickRedirect, false, 11548, new Class[]{GiftStruct.class}, GiftStruct.class)) {
                return (GiftStruct) PatchProxy.accessDispatch(new Object[]{giftStruct}, this, changeQuickRedirect, false, 11548, new Class[]{GiftStruct.class}, GiftStruct.class);
            }
            Builder newBuilder = giftStruct.newBuilder();
            if (newBuilder.image != null) {
                newBuilder.image = (Image) Image.ADAPTER.redact(newBuilder.image);
            }
            if (newBuilder.fansclub_info != null) {
                newBuilder.fansclub_info = (GiftStructFansClubInfo) GiftStructFansClubInfo.ADAPTER.redact(newBuilder.fansclub_info);
            }
            if (newBuilder.gift_label_icon != null) {
                newBuilder.gift_label_icon = (Image) Image.ADAPTER.redact(newBuilder.gift_label_icon);
            }
            if (newBuilder.icon != null) {
                newBuilder.icon = (Image) Image.ADAPTER.redact(newBuilder.icon);
            }
            Internal.redactElements(newBuilder.subs, LuckyMoneyGiftMeta.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(GiftStruct giftStruct) {
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
            int i19;
            int i20;
            int i21;
            int i22;
            GiftStruct giftStruct2 = giftStruct;
            int i23 = 0;
            if (PatchProxy.isSupport(new Object[]{giftStruct2}, this, changeQuickRedirect, false, 11545, new Class[]{GiftStruct.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{giftStruct2}, this, changeQuickRedirect, false, 11545, new Class[]{GiftStruct.class}, Integer.TYPE)).intValue();
            }
            if (giftStruct2.image != null) {
                i = Image.ADAPTER.encodedSizeWithTag(1, giftStruct2.image);
            } else {
                i = 0;
            }
            if (giftStruct2.describe != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, giftStruct2.describe);
            } else {
                i2 = 0;
            }
            int i24 = i + i2;
            if (giftStruct2.notify != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, giftStruct2.notify);
            } else {
                i3 = 0;
            }
            int i25 = i24 + i3;
            if (giftStruct2.duration != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, giftStruct2.duration);
            } else {
                i4 = 0;
            }
            int i26 = i25 + i4;
            if (giftStruct2.id != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, giftStruct2.id);
            } else {
                i5 = 0;
            }
            int i27 = i26 + i5;
            if (giftStruct2.fansclub_info != null) {
                i6 = GiftStructFansClubInfo.ADAPTER.encodedSizeWithTag(6, giftStruct2.fansclub_info);
            } else {
                i6 = 0;
            }
            int i28 = i27 + i6;
            if (giftStruct2.for_linkmic != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(7, giftStruct2.for_linkmic);
            } else {
                i7 = 0;
            }
            int i29 = i28 + i7;
            if (giftStruct2.doodle != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(8, giftStruct2.doodle);
            } else {
                i8 = 0;
            }
            int i30 = i29 + i8;
            if (giftStruct2.for_fansclub != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(9, giftStruct2.for_fansclub);
            } else {
                i9 = 0;
            }
            int i31 = i30 + i9;
            if (giftStruct2.combo != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(10, giftStruct2.combo);
            } else {
                i10 = 0;
            }
            int i32 = i31 + i10;
            if (giftStruct2.type != null) {
                i11 = ProtoAdapter.INT32.encodedSizeWithTag(11, giftStruct2.type);
            } else {
                i11 = 0;
            }
            int i33 = i32 + i11;
            if (giftStruct2.diamond_count != null) {
                i12 = ProtoAdapter.INT32.encodedSizeWithTag(12, giftStruct2.diamond_count);
            } else {
                i12 = 0;
            }
            int i34 = i33 + i12;
            if (giftStruct2.is_displayed_on_panel != null) {
                i13 = ProtoAdapter.BOOL.encodedSizeWithTag(13, giftStruct2.is_displayed_on_panel);
            } else {
                i13 = 0;
            }
            int i35 = i34 + i13;
            if (giftStruct2.primary_effect_id != null) {
                i14 = ProtoAdapter.INT64.encodedSizeWithTag(14, giftStruct2.primary_effect_id);
            } else {
                i14 = 0;
            }
            int i36 = i35 + i14;
            if (giftStruct2.gift_label_icon != null) {
                i15 = Image.ADAPTER.encodedSizeWithTag(15, giftStruct2.gift_label_icon);
            } else {
                i15 = 0;
            }
            int i37 = i36 + i15;
            if (giftStruct2.name != null) {
                i16 = ProtoAdapter.STRING.encodedSizeWithTag(16, giftStruct2.name);
            } else {
                i16 = 0;
            }
            int i38 = i37 + i16;
            if (giftStruct2.region != null) {
                i17 = ProtoAdapter.STRING.encodedSizeWithTag(17, giftStruct2.region);
            } else {
                i17 = 0;
            }
            int i39 = i38 + i17;
            if (giftStruct2.manual != null) {
                i18 = ProtoAdapter.STRING.encodedSizeWithTag(18, giftStruct2.manual);
            } else {
                i18 = 0;
            }
            int i40 = i39 + i18;
            if (giftStruct2.for_custom != null) {
                i19 = ProtoAdapter.BOOL.encodedSizeWithTag(19, giftStruct2.for_custom);
            } else {
                i19 = 0;
            }
            int encodedSizeWithTag = i40 + i19 + this.special_effects.encodedSizeWithTag(20, giftStruct2.special_effects);
            if (giftStruct2.icon != null) {
                i20 = Image.ADAPTER.encodedSizeWithTag(21, giftStruct2.icon);
            } else {
                i20 = 0;
            }
            int i41 = encodedSizeWithTag + i20;
            if (giftStruct2.action_type != null) {
                i21 = ProtoAdapter.INT32.encodedSizeWithTag(22, giftStruct2.action_type);
            } else {
                i21 = 0;
            }
            int i42 = i41 + i21;
            if (giftStruct2.watermelon_seeds != null) {
                i22 = ProtoAdapter.INT32.encodedSizeWithTag(23, giftStruct2.watermelon_seeds);
            } else {
                i22 = 0;
            }
            int i43 = i42 + i22;
            if (giftStruct2.gold_effect != null) {
                i23 = ProtoAdapter.STRING.encodedSizeWithTag(24, giftStruct2.gold_effect);
            }
            return i43 + i23 + LuckyMoneyGiftMeta.ADAPTER.asRepeated().encodedSizeWithTag(25, giftStruct2.subs) + giftStruct.unknownFields().size();
        }

        public final GiftStruct decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11547, new Class[]{ProtoReader.class}, GiftStruct.class)) {
                return (GiftStruct) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11547, new Class[]{ProtoReader.class}, GiftStruct.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.image((Image) Image.ADAPTER.decode(protoReader2));
                            break;
                        case 2:
                            builder.describe((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder.notify((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 4:
                            builder.duration((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 5:
                            builder.id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 6:
                            builder.fansclub_info((GiftStructFansClubInfo) GiftStructFansClubInfo.ADAPTER.decode(protoReader2));
                            break;
                        case e.l /*7*/:
                            builder.for_linkmic((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 8:
                            builder.doodle((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 9:
                            builder.for_fansclub((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 10:
                            builder.combo((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 11:
                            builder.type((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                            builder.diamond_count((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 13:
                            builder.is_displayed_on_panel((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 14:
                            builder.primary_effect_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 15:
                            builder.gift_label_icon((Image) Image.ADAPTER.decode(protoReader2));
                            break;
                        case SearchJediMixFeedAdapter.f42514c /*?: ONE_ARG  (16 int)*/:
                            builder.name((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 17:
                            builder.region((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 18:
                            builder.manual((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 19:
                            builder.for_custom((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 20:
                            builder.special_effects.putAll((Map) this.special_effects.decode(protoReader2));
                            break;
                        case 21:
                            builder.icon((Image) Image.ADAPTER.decode(protoReader2));
                            break;
                        case 22:
                            builder.action_type((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 23:
                            builder.watermelon_seeds((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 24:
                            builder.gold_effect((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 25:
                            builder.subs.add(LuckyMoneyGiftMeta.ADAPTER.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, GiftStruct giftStruct) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            GiftStruct giftStruct2 = giftStruct;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, giftStruct2}, this, changeQuickRedirect, false, 11546, new Class[]{ProtoWriter.class, GiftStruct.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, giftStruct2}, this, changeQuickRedirect, false, 11546, new Class[]{ProtoWriter.class, GiftStruct.class}, Void.TYPE);
                return;
            }
            if (giftStruct2.image != null) {
                Image.ADAPTER.encodeWithTag(protoWriter2, 1, giftStruct2.image);
            }
            if (giftStruct2.describe != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, giftStruct2.describe);
            }
            if (giftStruct2.notify != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 3, giftStruct2.notify);
            }
            if (giftStruct2.duration != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, giftStruct2.duration);
            }
            if (giftStruct2.id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 5, giftStruct2.id);
            }
            if (giftStruct2.fansclub_info != null) {
                GiftStructFansClubInfo.ADAPTER.encodeWithTag(protoWriter2, 6, giftStruct2.fansclub_info);
            }
            if (giftStruct2.for_linkmic != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 7, giftStruct2.for_linkmic);
            }
            if (giftStruct2.doodle != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 8, giftStruct2.doodle);
            }
            if (giftStruct2.for_fansclub != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 9, giftStruct2.for_fansclub);
            }
            if (giftStruct2.combo != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 10, giftStruct2.combo);
            }
            if (giftStruct2.type != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 11, giftStruct2.type);
            }
            if (giftStruct2.diamond_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 12, giftStruct2.diamond_count);
            }
            if (giftStruct2.is_displayed_on_panel != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 13, giftStruct2.is_displayed_on_panel);
            }
            if (giftStruct2.primary_effect_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 14, giftStruct2.primary_effect_id);
            }
            if (giftStruct2.gift_label_icon != null) {
                Image.ADAPTER.encodeWithTag(protoWriter2, 15, giftStruct2.gift_label_icon);
            }
            if (giftStruct2.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 16, giftStruct2.name);
            }
            if (giftStruct2.region != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 17, giftStruct2.region);
            }
            if (giftStruct2.manual != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 18, giftStruct2.manual);
            }
            if (giftStruct2.for_custom != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 19, giftStruct2.for_custom);
            }
            this.special_effects.encodeWithTag(protoWriter2, 20, giftStruct2.special_effects);
            if (giftStruct2.icon != null) {
                Image.ADAPTER.encodeWithTag(protoWriter2, 21, giftStruct2.icon);
            }
            if (giftStruct2.action_type != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 22, giftStruct2.action_type);
            }
            if (giftStruct2.watermelon_seeds != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 23, giftStruct2.watermelon_seeds);
            }
            if (giftStruct2.gold_effect != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 24, giftStruct2.gold_effect);
            }
            LuckyMoneyGiftMeta.ADAPTER.asRepeated().encodeWithTag(protoWriter2, 25, giftStruct2.subs);
            protoWriter2.writeBytes(giftStruct.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11529, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11529, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.image = this.image;
        builder.describe = this.describe;
        builder.notify = this.notify;
        builder.duration = this.duration;
        builder.id = this.id;
        builder.fansclub_info = this.fansclub_info;
        builder.for_linkmic = this.for_linkmic;
        builder.doodle = this.doodle;
        builder.for_fansclub = this.for_fansclub;
        builder.combo = this.combo;
        builder.type = this.type;
        builder.diamond_count = this.diamond_count;
        builder.is_displayed_on_panel = this.is_displayed_on_panel;
        builder.primary_effect_id = this.primary_effect_id;
        builder.gift_label_icon = this.gift_label_icon;
        builder.name = this.name;
        builder.region = this.region;
        builder.manual = this.manual;
        builder.for_custom = this.for_custom;
        builder.special_effects = Internal.copyOf("special_effects", this.special_effects);
        builder.icon = this.icon;
        builder.action_type = this.action_type;
        builder.watermelon_seeds = this.watermelon_seeds;
        builder.gold_effect = this.gold_effect;
        builder.subs = Internal.copyOf("subs", this.subs);
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
        int i19;
        int i20;
        int i21;
        int i22;
        int i23 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11531, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11531, new Class[0], Integer.TYPE)).intValue();
        }
        int i24 = this.hashCode;
        if (i24 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.image != null) {
                i = this.image.hashCode();
            } else {
                i = 0;
            }
            int i25 = (hashCode + i) * 37;
            if (this.describe != null) {
                i2 = this.describe.hashCode();
            } else {
                i2 = 0;
            }
            int i26 = (i25 + i2) * 37;
            if (this.notify != null) {
                i3 = this.notify.hashCode();
            } else {
                i3 = 0;
            }
            int i27 = (i26 + i3) * 37;
            if (this.duration != null) {
                i4 = this.duration.hashCode();
            } else {
                i4 = 0;
            }
            int i28 = (i27 + i4) * 37;
            if (this.id != null) {
                i5 = this.id.hashCode();
            } else {
                i5 = 0;
            }
            int i29 = (i28 + i5) * 37;
            if (this.fansclub_info != null) {
                i6 = this.fansclub_info.hashCode();
            } else {
                i6 = 0;
            }
            int i30 = (i29 + i6) * 37;
            if (this.for_linkmic != null) {
                i7 = this.for_linkmic.hashCode();
            } else {
                i7 = 0;
            }
            int i31 = (i30 + i7) * 37;
            if (this.doodle != null) {
                i8 = this.doodle.hashCode();
            } else {
                i8 = 0;
            }
            int i32 = (i31 + i8) * 37;
            if (this.for_fansclub != null) {
                i9 = this.for_fansclub.hashCode();
            } else {
                i9 = 0;
            }
            int i33 = (i32 + i9) * 37;
            if (this.combo != null) {
                i10 = this.combo.hashCode();
            } else {
                i10 = 0;
            }
            int i34 = (i33 + i10) * 37;
            if (this.type != null) {
                i11 = this.type.hashCode();
            } else {
                i11 = 0;
            }
            int i35 = (i34 + i11) * 37;
            if (this.diamond_count != null) {
                i12 = this.diamond_count.hashCode();
            } else {
                i12 = 0;
            }
            int i36 = (i35 + i12) * 37;
            if (this.is_displayed_on_panel != null) {
                i13 = this.is_displayed_on_panel.hashCode();
            } else {
                i13 = 0;
            }
            int i37 = (i36 + i13) * 37;
            if (this.primary_effect_id != null) {
                i14 = this.primary_effect_id.hashCode();
            } else {
                i14 = 0;
            }
            int i38 = (i37 + i14) * 37;
            if (this.gift_label_icon != null) {
                i15 = this.gift_label_icon.hashCode();
            } else {
                i15 = 0;
            }
            int i39 = (i38 + i15) * 37;
            if (this.name != null) {
                i16 = this.name.hashCode();
            } else {
                i16 = 0;
            }
            int i40 = (i39 + i16) * 37;
            if (this.region != null) {
                i17 = this.region.hashCode();
            } else {
                i17 = 0;
            }
            int i41 = (i40 + i17) * 37;
            if (this.manual != null) {
                i18 = this.manual.hashCode();
            } else {
                i18 = 0;
            }
            int i42 = (i41 + i18) * 37;
            if (this.for_custom != null) {
                i19 = this.for_custom.hashCode();
            } else {
                i19 = 0;
            }
            int hashCode2 = (((i42 + i19) * 37) + this.special_effects.hashCode()) * 37;
            if (this.icon != null) {
                i20 = this.icon.hashCode();
            } else {
                i20 = 0;
            }
            int i43 = (hashCode2 + i20) * 37;
            if (this.action_type != null) {
                i21 = this.action_type.hashCode();
            } else {
                i21 = 0;
            }
            int i44 = (i43 + i21) * 37;
            if (this.watermelon_seeds != null) {
                i22 = this.watermelon_seeds.hashCode();
            } else {
                i22 = 0;
            }
            int i45 = (i44 + i22) * 37;
            if (this.gold_effect != null) {
                i23 = this.gold_effect.hashCode();
            }
            i24 = ((i45 + i23) * 37) + this.subs.hashCode();
            this.hashCode = i24;
        }
        return i24;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11532, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11532, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        if (this.describe != null) {
            sb.append(", describe=");
            sb.append(this.describe);
        }
        if (this.notify != null) {
            sb.append(", notify=");
            sb.append(this.notify);
        }
        if (this.duration != null) {
            sb.append(", duration=");
            sb.append(this.duration);
        }
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.fansclub_info != null) {
            sb.append(", fansclub_info=");
            sb.append(this.fansclub_info);
        }
        if (this.for_linkmic != null) {
            sb.append(", for_linkmic=");
            sb.append(this.for_linkmic);
        }
        if (this.doodle != null) {
            sb.append(", doodle=");
            sb.append(this.doodle);
        }
        if (this.for_fansclub != null) {
            sb.append(", for_fansclub=");
            sb.append(this.for_fansclub);
        }
        if (this.combo != null) {
            sb.append(", combo=");
            sb.append(this.combo);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.diamond_count != null) {
            sb.append(", diamond_count=");
            sb.append(this.diamond_count);
        }
        if (this.is_displayed_on_panel != null) {
            sb.append(", is_displayed_on_panel=");
            sb.append(this.is_displayed_on_panel);
        }
        if (this.primary_effect_id != null) {
            sb.append(", primary_effect_id=");
            sb.append(this.primary_effect_id);
        }
        if (this.gift_label_icon != null) {
            sb.append(", gift_label_icon=");
            sb.append(this.gift_label_icon);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.region != null) {
            sb.append(", region=");
            sb.append(this.region);
        }
        if (this.manual != null) {
            sb.append(", manual=");
            sb.append(this.manual);
        }
        if (this.for_custom != null) {
            sb.append(", for_custom=");
            sb.append(this.for_custom);
        }
        if (!this.special_effects.isEmpty()) {
            sb.append(", special_effects=");
            sb.append(this.special_effects);
        }
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        if (this.action_type != null) {
            sb.append(", action_type=");
            sb.append(this.action_type);
        }
        if (this.watermelon_seeds != null) {
            sb.append(", watermelon_seeds=");
            sb.append(this.watermelon_seeds);
        }
        if (this.gold_effect != null) {
            sb.append(", gold_effect=");
            sb.append(this.gold_effect);
        }
        if (!this.subs.isEmpty()) {
            sb.append(", subs=");
            sb.append(this.subs);
        }
        StringBuilder replace = sb.replace(0, 2, "GiftStruct{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11530, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11530, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof GiftStruct)) {
                return false;
            }
            GiftStruct giftStruct = (GiftStruct) obj;
            if (!unknownFields().equals(giftStruct.unknownFields()) || !Internal.equals(this.image, giftStruct.image) || !Internal.equals(this.describe, giftStruct.describe) || !Internal.equals(this.notify, giftStruct.notify) || !Internal.equals(this.duration, giftStruct.duration) || !Internal.equals(this.id, giftStruct.id) || !Internal.equals(this.fansclub_info, giftStruct.fansclub_info) || !Internal.equals(this.for_linkmic, giftStruct.for_linkmic) || !Internal.equals(this.doodle, giftStruct.doodle) || !Internal.equals(this.for_fansclub, giftStruct.for_fansclub) || !Internal.equals(this.combo, giftStruct.combo) || !Internal.equals(this.type, giftStruct.type) || !Internal.equals(this.diamond_count, giftStruct.diamond_count) || !Internal.equals(this.is_displayed_on_panel, giftStruct.is_displayed_on_panel) || !Internal.equals(this.primary_effect_id, giftStruct.primary_effect_id) || !Internal.equals(this.gift_label_icon, giftStruct.gift_label_icon) || !Internal.equals(this.name, giftStruct.name) || !Internal.equals(this.region, giftStruct.region) || !Internal.equals(this.manual, giftStruct.manual) || !Internal.equals(this.for_custom, giftStruct.for_custom) || !this.special_effects.equals(giftStruct.special_effects) || !Internal.equals(this.icon, giftStruct.icon) || !Internal.equals(this.action_type, giftStruct.action_type) || !Internal.equals(this.watermelon_seeds, giftStruct.watermelon_seeds) || !Internal.equals(this.gold_effect, giftStruct.gold_effect) || !this.subs.equals(giftStruct.subs)) {
                return false;
            }
            return true;
        }
    }

    public GiftStruct(Image image2, String str, Boolean bool, Long l, Long l2, GiftStructFansClubInfo giftStructFansClubInfo, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num, Integer num2, Boolean bool6, Long l3, Image image3, String str2, String str3, String str4, Boolean bool7, Map<String, Long> map, Image image4, Integer num3, Integer num4, String str5, List<LuckyMoneyGiftMeta> list) {
        this(image2, str, bool, l, l2, giftStructFansClubInfo, bool2, bool3, bool4, bool5, num, num2, bool6, l3, image3, str2, str3, str4, bool7, map, image4, num3, num4, str5, list, ByteString.EMPTY);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GiftStruct(Image image2, String str, Boolean bool, Long l, Long l2, GiftStructFansClubInfo giftStructFansClubInfo, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num, Integer num2, Boolean bool6, Long l3, Image image3, String str2, String str3, String str4, Boolean bool7, Map<String, Long> map, Image image4, Integer num3, Integer num4, String str5, List<LuckyMoneyGiftMeta> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.image = image2;
        this.describe = str;
        this.notify = bool;
        this.duration = l;
        this.id = l2;
        this.fansclub_info = giftStructFansClubInfo;
        this.for_linkmic = bool2;
        this.doodle = bool3;
        this.for_fansclub = bool4;
        this.combo = bool5;
        this.type = num;
        this.diamond_count = num2;
        this.is_displayed_on_panel = bool6;
        this.primary_effect_id = l3;
        this.gift_label_icon = image3;
        this.name = str2;
        this.region = str3;
        this.manual = str4;
        this.for_custom = bool7;
        this.special_effects = Internal.immutableCopyOf("special_effects", map);
        this.icon = image4;
        this.action_type = num3;
        this.watermelon_seeds = num4;
        this.gold_effect = str5;
        this.subs = Internal.immutableCopyOf("subs", list);
    }
}
