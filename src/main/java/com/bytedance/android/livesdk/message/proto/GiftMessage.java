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

public final class GiftMessage extends Message<GiftMessage, Builder> {
    public static final ProtoAdapter<GiftMessage> ADAPTER = new ProtoAdapter_GiftMessage();
    public static final Long DEFAULT_COMBO_COUNT = 0L;
    public static final Long DEFAULT_FAN_TICKET_COUNT = 0L;
    public static final Long DEFAULT_GIFT_ID = 0L;
    public static final Long DEFAULT_GROUP_COUNT = 0L;
    public static final Long DEFAULT_GROUP_ID = 0L;
    public static final Long DEFAULT_INCOME_TASKGIFTS = 0L;
    public static final Long DEFAULT_REPEAT_COUNT = 0L;
    public static final Integer DEFAULT_REPEAT_END = 0;
    public static final Long DEFAULT_ROOM_FAN_TICKET_COUNT = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public final Long combo_count;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long fan_ticket_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long gift_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long group_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 11)
    public final Long group_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 12)
    public final Long income_taskgifts;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long repeat_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 9)
    public final Integer repeat_end;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 13)
    public final Long room_fan_ticket_count;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.GiftMessage$TextEffect#ADAPTER", tag = 10)
    public final TextEffect text_effect;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 8)
    public final User to_user;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 7)
    public final User user;

    public static final class TextEffect extends Message<TextEffect, Builder> {
        public static final ProtoAdapter<TextEffect> ADAPTER = new ProtoAdapter_TextEffect();
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.GiftMessage$TextEffect$Detail#ADAPTER", tag = 2)
        public final Detail landscape;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.GiftMessage$TextEffect$Detail#ADAPTER", tag = 1)
        public final Detail portrait;

        public static final class Detail extends Message<Detail, Builder> {
            public static final ProtoAdapter<Detail> ADAPTER = new ProtoAdapter_Detail();
            public static final Integer DEFAULT_DURATION = 0;
            public static final Integer DEFAULT_HEIGHT = 0;
            public static final Integer DEFAULT_SHADOW_DX = 0;
            public static final Integer DEFAULT_SHADOW_DY = 0;
            public static final Integer DEFAULT_SHADOW_RADIUS = 0;
            public static final Integer DEFAULT_START = 0;
            public static final Integer DEFAULT_STROKE_WIDTH = 0;
            public static final Integer DEFAULT_TEXT_FONT_SIZE = 0;
            public static final Integer DEFAULT_WIDTH = 0;
            public static final Integer DEFAULT_X = 0;
            public static final Integer DEFAULT_Y = 0;
            public static ChangeQuickRedirect changeQuickRedirect;
            private static final long serialVersionUID = 0;
            @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 3)
            public final Image background;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
            public final Integer duration;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 9)
            public final Integer height;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 13)
            public final String shadow_color;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 10)
            public final Integer shadow_dx;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 11)
            public final Integer shadow_dy;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 12)
            public final Integer shadow_radius;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
            public final Integer start;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 14)
            public final String stroke_color;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 15)
            public final Integer stroke_width;
            @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Text#ADAPTER", tag = 1)
            public final Text text;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
            public final Integer text_font_size;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 8)
            public final Integer width;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
            public final Integer x;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
            public final Integer y;

            public static final class Builder extends Message.Builder<Detail, Builder> {
                public static ChangeQuickRedirect changeQuickRedirect;
                public Image background;
                public Integer duration;
                public Integer height;
                public String shadow_color;
                public Integer shadow_dx;
                public Integer shadow_dy;
                public Integer shadow_radius;
                public Integer start;
                public String stroke_color;
                public Integer stroke_width;
                public Text text;
                public Integer text_font_size;
                public Integer width;
                public Integer x;
                public Integer y;

                public final Detail build() {
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11520, new Class[0], Detail.class)) {
                        return (Detail) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11520, new Class[0], Detail.class);
                    }
                    Detail detail = new Detail(this.text, this.text_font_size, this.background, this.start, this.duration, this.x, this.y, this.width, this.height, this.shadow_dx, this.shadow_dy, this.shadow_radius, this.shadow_color, this.stroke_color, this.stroke_width, super.buildUnknownFields());
                    return detail;
                }

                public final Builder background(Image image) {
                    this.background = image;
                    return this;
                }

                public final Builder duration(Integer num) {
                    this.duration = num;
                    return this;
                }

                public final Builder height(Integer num) {
                    this.height = num;
                    return this;
                }

                public final Builder shadow_color(String str) {
                    this.shadow_color = str;
                    return this;
                }

                public final Builder shadow_dx(Integer num) {
                    this.shadow_dx = num;
                    return this;
                }

                public final Builder shadow_dy(Integer num) {
                    this.shadow_dy = num;
                    return this;
                }

                public final Builder shadow_radius(Integer num) {
                    this.shadow_radius = num;
                    return this;
                }

                public final Builder start(Integer num) {
                    this.start = num;
                    return this;
                }

                public final Builder stroke_color(String str) {
                    this.stroke_color = str;
                    return this;
                }

                public final Builder stroke_width(Integer num) {
                    this.stroke_width = num;
                    return this;
                }

                public final Builder text(Text text2) {
                    this.text = text2;
                    return this;
                }

                public final Builder text_font_size(Integer num) {
                    this.text_font_size = num;
                    return this;
                }

                public final Builder width(Integer num) {
                    this.width = num;
                    return this;
                }

                public final Builder x(Integer num) {
                    this.x = num;
                    return this;
                }

                public final Builder y(Integer num) {
                    this.y = num;
                    return this;
                }
            }

            static final class ProtoAdapter_Detail extends ProtoAdapter<Detail> {
                public static ChangeQuickRedirect changeQuickRedirect;

                ProtoAdapter_Detail() {
                    super(FieldEncoding.LENGTH_DELIMITED, Detail.class);
                }

                public final Detail redact(Detail detail) {
                    if (PatchProxy.isSupport(new Object[]{detail}, this, changeQuickRedirect, false, 11524, new Class[]{Detail.class}, Detail.class)) {
                        return (Detail) PatchProxy.accessDispatch(new Object[]{detail}, this, changeQuickRedirect, false, 11524, new Class[]{Detail.class}, Detail.class);
                    }
                    Builder newBuilder = detail.newBuilder();
                    if (newBuilder.text != null) {
                        newBuilder.text = (Text) Text.ADAPTER.redact(newBuilder.text);
                    }
                    if (newBuilder.background != null) {
                        newBuilder.background = (Image) Image.ADAPTER.redact(newBuilder.background);
                    }
                    newBuilder.clearUnknownFields();
                    return newBuilder.build();
                }

                public final Detail decode(ProtoReader protoReader) throws IOException {
                    ProtoReader protoReader2 = protoReader;
                    if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11523, new Class[]{ProtoReader.class}, Detail.class)) {
                        return (Detail) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11523, new Class[]{ProtoReader.class}, Detail.class);
                    }
                    Builder builder = new Builder();
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag != -1) {
                            switch (nextTag) {
                                case 1:
                                    builder.text((Text) Text.ADAPTER.decode(protoReader2));
                                    break;
                                case 2:
                                    builder.text_font_size((Integer) ProtoAdapter.INT32.decode(protoReader2));
                                    break;
                                case 3:
                                    builder.background((Image) Image.ADAPTER.decode(protoReader2));
                                    break;
                                case 4:
                                    builder.start((Integer) ProtoAdapter.INT32.decode(protoReader2));
                                    break;
                                case 5:
                                    builder.duration((Integer) ProtoAdapter.INT32.decode(protoReader2));
                                    break;
                                case 6:
                                    builder.x((Integer) ProtoAdapter.INT32.decode(protoReader2));
                                    break;
                                case e.l /*7*/:
                                    builder.y((Integer) ProtoAdapter.INT32.decode(protoReader2));
                                    break;
                                case 8:
                                    builder.width((Integer) ProtoAdapter.INT32.decode(protoReader2));
                                    break;
                                case 9:
                                    builder.height((Integer) ProtoAdapter.INT32.decode(protoReader2));
                                    break;
                                case 10:
                                    builder.shadow_dx((Integer) ProtoAdapter.INT32.decode(protoReader2));
                                    break;
                                case 11:
                                    builder.shadow_dy((Integer) ProtoAdapter.INT32.decode(protoReader2));
                                    break;
                                case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                                    builder.shadow_radius((Integer) ProtoAdapter.INT32.decode(protoReader2));
                                    break;
                                case 13:
                                    builder.shadow_color((String) ProtoAdapter.STRING.decode(protoReader2));
                                    break;
                                case 14:
                                    builder.stroke_color((String) ProtoAdapter.STRING.decode(protoReader2));
                                    break;
                                case 15:
                                    builder.stroke_width((Integer) ProtoAdapter.INT32.decode(protoReader2));
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

                public final int encodedSize(Detail detail) {
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
                    Detail detail2 = detail;
                    int i15 = 0;
                    if (PatchProxy.isSupport(new Object[]{detail2}, this, changeQuickRedirect, false, 11521, new Class[]{Detail.class}, Integer.TYPE)) {
                        return ((Integer) PatchProxy.accessDispatch(new Object[]{detail2}, this, changeQuickRedirect, false, 11521, new Class[]{Detail.class}, Integer.TYPE)).intValue();
                    }
                    if (detail2.text != null) {
                        i = Text.ADAPTER.encodedSizeWithTag(1, detail2.text);
                    } else {
                        i = 0;
                    }
                    if (detail2.text_font_size != null) {
                        i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, detail2.text_font_size);
                    } else {
                        i2 = 0;
                    }
                    int i16 = i + i2;
                    if (detail2.background != null) {
                        i3 = Image.ADAPTER.encodedSizeWithTag(3, detail2.background);
                    } else {
                        i3 = 0;
                    }
                    int i17 = i16 + i3;
                    if (detail2.start != null) {
                        i4 = ProtoAdapter.INT32.encodedSizeWithTag(4, detail2.start);
                    } else {
                        i4 = 0;
                    }
                    int i18 = i17 + i4;
                    if (detail2.duration != null) {
                        i5 = ProtoAdapter.INT32.encodedSizeWithTag(5, detail2.duration);
                    } else {
                        i5 = 0;
                    }
                    int i19 = i18 + i5;
                    if (detail2.x != null) {
                        i6 = ProtoAdapter.INT32.encodedSizeWithTag(6, detail2.x);
                    } else {
                        i6 = 0;
                    }
                    int i20 = i19 + i6;
                    if (detail2.y != null) {
                        i7 = ProtoAdapter.INT32.encodedSizeWithTag(7, detail2.y);
                    } else {
                        i7 = 0;
                    }
                    int i21 = i20 + i7;
                    if (detail2.width != null) {
                        i8 = ProtoAdapter.INT32.encodedSizeWithTag(8, detail2.width);
                    } else {
                        i8 = 0;
                    }
                    int i22 = i21 + i8;
                    if (detail2.height != null) {
                        i9 = ProtoAdapter.INT32.encodedSizeWithTag(9, detail2.height);
                    } else {
                        i9 = 0;
                    }
                    int i23 = i22 + i9;
                    if (detail2.shadow_dx != null) {
                        i10 = ProtoAdapter.INT32.encodedSizeWithTag(10, detail2.shadow_dx);
                    } else {
                        i10 = 0;
                    }
                    int i24 = i23 + i10;
                    if (detail2.shadow_dy != null) {
                        i11 = ProtoAdapter.INT32.encodedSizeWithTag(11, detail2.shadow_dy);
                    } else {
                        i11 = 0;
                    }
                    int i25 = i24 + i11;
                    if (detail2.shadow_radius != null) {
                        i12 = ProtoAdapter.INT32.encodedSizeWithTag(12, detail2.shadow_radius);
                    } else {
                        i12 = 0;
                    }
                    int i26 = i25 + i12;
                    if (detail2.shadow_color != null) {
                        i13 = ProtoAdapter.STRING.encodedSizeWithTag(13, detail2.shadow_color);
                    } else {
                        i13 = 0;
                    }
                    int i27 = i26 + i13;
                    if (detail2.stroke_color != null) {
                        i14 = ProtoAdapter.STRING.encodedSizeWithTag(14, detail2.stroke_color);
                    } else {
                        i14 = 0;
                    }
                    int i28 = i27 + i14;
                    if (detail2.stroke_width != null) {
                        i15 = ProtoAdapter.INT32.encodedSizeWithTag(15, detail2.stroke_width);
                    }
                    return i28 + i15 + detail.unknownFields().size();
                }

                public final void encode(ProtoWriter protoWriter, Detail detail) throws IOException {
                    ProtoWriter protoWriter2 = protoWriter;
                    Detail detail2 = detail;
                    if (PatchProxy.isSupport(new Object[]{protoWriter2, detail2}, this, changeQuickRedirect, false, 11522, new Class[]{ProtoWriter.class, Detail.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{protoWriter2, detail2}, this, changeQuickRedirect, false, 11522, new Class[]{ProtoWriter.class, Detail.class}, Void.TYPE);
                        return;
                    }
                    if (detail2.text != null) {
                        Text.ADAPTER.encodeWithTag(protoWriter2, 1, detail2.text);
                    }
                    if (detail2.text_font_size != null) {
                        ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, detail2.text_font_size);
                    }
                    if (detail2.background != null) {
                        Image.ADAPTER.encodeWithTag(protoWriter2, 3, detail2.background);
                    }
                    if (detail2.start != null) {
                        ProtoAdapter.INT32.encodeWithTag(protoWriter2, 4, detail2.start);
                    }
                    if (detail2.duration != null) {
                        ProtoAdapter.INT32.encodeWithTag(protoWriter2, 5, detail2.duration);
                    }
                    if (detail2.x != null) {
                        ProtoAdapter.INT32.encodeWithTag(protoWriter2, 6, detail2.x);
                    }
                    if (detail2.y != null) {
                        ProtoAdapter.INT32.encodeWithTag(protoWriter2, 7, detail2.y);
                    }
                    if (detail2.width != null) {
                        ProtoAdapter.INT32.encodeWithTag(protoWriter2, 8, detail2.width);
                    }
                    if (detail2.height != null) {
                        ProtoAdapter.INT32.encodeWithTag(protoWriter2, 9, detail2.height);
                    }
                    if (detail2.shadow_dx != null) {
                        ProtoAdapter.INT32.encodeWithTag(protoWriter2, 10, detail2.shadow_dx);
                    }
                    if (detail2.shadow_dy != null) {
                        ProtoAdapter.INT32.encodeWithTag(protoWriter2, 11, detail2.shadow_dy);
                    }
                    if (detail2.shadow_radius != null) {
                        ProtoAdapter.INT32.encodeWithTag(protoWriter2, 12, detail2.shadow_radius);
                    }
                    if (detail2.shadow_color != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter2, 13, detail2.shadow_color);
                    }
                    if (detail2.stroke_color != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter2, 14, detail2.stroke_color);
                    }
                    if (detail2.stroke_width != null) {
                        ProtoAdapter.INT32.encodeWithTag(protoWriter2, 15, detail2.stroke_width);
                    }
                    protoWriter2.writeBytes(detail.unknownFields());
                }
            }

            public final Builder newBuilder() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11516, new Class[0], Builder.class)) {
                    return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11516, new Class[0], Builder.class);
                }
                Builder builder = new Builder();
                builder.text = this.text;
                builder.text_font_size = this.text_font_size;
                builder.background = this.background;
                builder.start = this.start;
                builder.duration = this.duration;
                builder.x = this.x;
                builder.y = this.y;
                builder.width = this.width;
                builder.height = this.height;
                builder.shadow_dx = this.shadow_dx;
                builder.shadow_dy = this.shadow_dy;
                builder.shadow_radius = this.shadow_radius;
                builder.shadow_color = this.shadow_color;
                builder.stroke_color = this.stroke_color;
                builder.stroke_width = this.stroke_width;
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
                int i15 = 0;
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11518, new Class[0], Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11518, new Class[0], Integer.TYPE)).intValue();
                }
                int i16 = this.hashCode;
                if (i16 == 0) {
                    int hashCode = unknownFields().hashCode() * 37;
                    if (this.text != null) {
                        i = this.text.hashCode();
                    } else {
                        i = 0;
                    }
                    int i17 = (hashCode + i) * 37;
                    if (this.text_font_size != null) {
                        i2 = this.text_font_size.hashCode();
                    } else {
                        i2 = 0;
                    }
                    int i18 = (i17 + i2) * 37;
                    if (this.background != null) {
                        i3 = this.background.hashCode();
                    } else {
                        i3 = 0;
                    }
                    int i19 = (i18 + i3) * 37;
                    if (this.start != null) {
                        i4 = this.start.hashCode();
                    } else {
                        i4 = 0;
                    }
                    int i20 = (i19 + i4) * 37;
                    if (this.duration != null) {
                        i5 = this.duration.hashCode();
                    } else {
                        i5 = 0;
                    }
                    int i21 = (i20 + i5) * 37;
                    if (this.x != null) {
                        i6 = this.x.hashCode();
                    } else {
                        i6 = 0;
                    }
                    int i22 = (i21 + i6) * 37;
                    if (this.y != null) {
                        i7 = this.y.hashCode();
                    } else {
                        i7 = 0;
                    }
                    int i23 = (i22 + i7) * 37;
                    if (this.width != null) {
                        i8 = this.width.hashCode();
                    } else {
                        i8 = 0;
                    }
                    int i24 = (i23 + i8) * 37;
                    if (this.height != null) {
                        i9 = this.height.hashCode();
                    } else {
                        i9 = 0;
                    }
                    int i25 = (i24 + i9) * 37;
                    if (this.shadow_dx != null) {
                        i10 = this.shadow_dx.hashCode();
                    } else {
                        i10 = 0;
                    }
                    int i26 = (i25 + i10) * 37;
                    if (this.shadow_dy != null) {
                        i11 = this.shadow_dy.hashCode();
                    } else {
                        i11 = 0;
                    }
                    int i27 = (i26 + i11) * 37;
                    if (this.shadow_radius != null) {
                        i12 = this.shadow_radius.hashCode();
                    } else {
                        i12 = 0;
                    }
                    int i28 = (i27 + i12) * 37;
                    if (this.shadow_color != null) {
                        i13 = this.shadow_color.hashCode();
                    } else {
                        i13 = 0;
                    }
                    int i29 = (i28 + i13) * 37;
                    if (this.stroke_color != null) {
                        i14 = this.stroke_color.hashCode();
                    } else {
                        i14 = 0;
                    }
                    int i30 = (i29 + i14) * 37;
                    if (this.stroke_width != null) {
                        i15 = this.stroke_width.hashCode();
                    }
                    i16 = i30 + i15;
                    this.hashCode = i16;
                }
                return i16;
            }

            public final String toString() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11519, new Class[0], String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11519, new Class[0], String.class);
                }
                StringBuilder sb = new StringBuilder();
                if (this.text != null) {
                    sb.append(", text=");
                    sb.append(this.text);
                }
                if (this.text_font_size != null) {
                    sb.append(", text_font_size=");
                    sb.append(this.text_font_size);
                }
                if (this.background != null) {
                    sb.append(", background=");
                    sb.append(this.background);
                }
                if (this.start != null) {
                    sb.append(", start=");
                    sb.append(this.start);
                }
                if (this.duration != null) {
                    sb.append(", duration=");
                    sb.append(this.duration);
                }
                if (this.x != null) {
                    sb.append(", x=");
                    sb.append(this.x);
                }
                if (this.y != null) {
                    sb.append(", y=");
                    sb.append(this.y);
                }
                if (this.width != null) {
                    sb.append(", width=");
                    sb.append(this.width);
                }
                if (this.height != null) {
                    sb.append(", height=");
                    sb.append(this.height);
                }
                if (this.shadow_dx != null) {
                    sb.append(", shadow_dx=");
                    sb.append(this.shadow_dx);
                }
                if (this.shadow_dy != null) {
                    sb.append(", shadow_dy=");
                    sb.append(this.shadow_dy);
                }
                if (this.shadow_radius != null) {
                    sb.append(", shadow_radius=");
                    sb.append(this.shadow_radius);
                }
                if (this.shadow_color != null) {
                    sb.append(", shadow_color=");
                    sb.append(this.shadow_color);
                }
                if (this.stroke_color != null) {
                    sb.append(", stroke_color=");
                    sb.append(this.stroke_color);
                }
                if (this.stroke_width != null) {
                    sb.append(", stroke_width=");
                    sb.append(this.stroke_width);
                }
                StringBuilder replace = sb.replace(0, 2, "Detail{");
                replace.append('}');
                return replace.toString();
            }

            public final boolean equals(Object obj) {
                if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11517, new Class[]{Object.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11517, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
                } else if (obj == this) {
                    return true;
                } else {
                    if (!(obj instanceof Detail)) {
                        return false;
                    }
                    Detail detail = (Detail) obj;
                    if (!unknownFields().equals(detail.unknownFields()) || !Internal.equals(this.text, detail.text) || !Internal.equals(this.text_font_size, detail.text_font_size) || !Internal.equals(this.background, detail.background) || !Internal.equals(this.start, detail.start) || !Internal.equals(this.duration, detail.duration) || !Internal.equals(this.x, detail.x) || !Internal.equals(this.y, detail.y) || !Internal.equals(this.width, detail.width) || !Internal.equals(this.height, detail.height) || !Internal.equals(this.shadow_dx, detail.shadow_dx) || !Internal.equals(this.shadow_dy, detail.shadow_dy) || !Internal.equals(this.shadow_radius, detail.shadow_radius) || !Internal.equals(this.shadow_color, detail.shadow_color) || !Internal.equals(this.stroke_color, detail.stroke_color) || !Internal.equals(this.stroke_width, detail.stroke_width)) {
                        return false;
                    }
                    return true;
                }
            }

            public Detail(Text text2, Integer num, Image image, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, String str, String str2, Integer num11) {
                this(text2, num, image, num2, num3, num4, num5, num6, num7, num8, num9, num10, str, str2, num11, ByteString.EMPTY);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Detail(Text text2, Integer num, Image image, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, String str, String str2, Integer num11, ByteString byteString) {
                super(ADAPTER, byteString);
                this.text = text2;
                this.text_font_size = num;
                this.background = image;
                this.start = num2;
                this.duration = num3;
                this.x = num4;
                this.y = num5;
                this.width = num6;
                this.height = num7;
                this.shadow_dx = num8;
                this.shadow_dy = num9;
                this.shadow_radius = num10;
                this.shadow_color = str;
                this.stroke_color = str2;
                this.stroke_width = num11;
            }
        }

        public static final class Builder extends Message.Builder<TextEffect, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public Detail landscape;
            public Detail portrait;

            public final TextEffect build() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11515, new Class[0], TextEffect.class)) {
                    return new TextEffect(this.portrait, this.landscape, super.buildUnknownFields());
                }
                return (TextEffect) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11515, new Class[0], TextEffect.class);
            }

            public final Builder landscape(Detail detail) {
                this.landscape = detail;
                return this;
            }

            public final Builder portrait(Detail detail) {
                this.portrait = detail;
                return this;
            }
        }

        static final class ProtoAdapter_TextEffect extends ProtoAdapter<TextEffect> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_TextEffect() {
                super(FieldEncoding.LENGTH_DELIMITED, TextEffect.class);
            }

            public final int encodedSize(TextEffect textEffect) {
                int i;
                TextEffect textEffect2 = textEffect;
                int i2 = 0;
                if (PatchProxy.isSupport(new Object[]{textEffect2}, this, changeQuickRedirect, false, 11525, new Class[]{TextEffect.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{textEffect2}, this, changeQuickRedirect, false, 11525, new Class[]{TextEffect.class}, Integer.TYPE)).intValue();
                }
                if (textEffect2.portrait != null) {
                    i = Detail.ADAPTER.encodedSizeWithTag(1, textEffect2.portrait);
                } else {
                    i = 0;
                }
                if (textEffect2.landscape != null) {
                    i2 = Detail.ADAPTER.encodedSizeWithTag(2, textEffect2.landscape);
                }
                return i + i2 + textEffect.unknownFields().size();
            }

            public final TextEffect redact(TextEffect textEffect) {
                if (PatchProxy.isSupport(new Object[]{textEffect}, this, changeQuickRedirect, false, 11528, new Class[]{TextEffect.class}, TextEffect.class)) {
                    return (TextEffect) PatchProxy.accessDispatch(new Object[]{textEffect}, this, changeQuickRedirect, false, 11528, new Class[]{TextEffect.class}, TextEffect.class);
                }
                Builder newBuilder = textEffect.newBuilder();
                if (newBuilder.portrait != null) {
                    newBuilder.portrait = (Detail) Detail.ADAPTER.redact(newBuilder.portrait);
                }
                if (newBuilder.landscape != null) {
                    newBuilder.landscape = (Detail) Detail.ADAPTER.redact(newBuilder.landscape);
                }
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final TextEffect decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11527, new Class[]{ProtoReader.class}, TextEffect.class)) {
                    return (TextEffect) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11527, new Class[]{ProtoReader.class}, TextEffect.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.portrait((Detail) Detail.ADAPTER.decode(protoReader2));
                                break;
                            case 2:
                                builder.landscape((Detail) Detail.ADAPTER.decode(protoReader2));
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

            public final void encode(ProtoWriter protoWriter, TextEffect textEffect) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                TextEffect textEffect2 = textEffect;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, textEffect2}, this, changeQuickRedirect, false, 11526, new Class[]{ProtoWriter.class, TextEffect.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, textEffect2}, this, changeQuickRedirect, false, 11526, new Class[]{ProtoWriter.class, TextEffect.class}, Void.TYPE);
                    return;
                }
                if (textEffect2.portrait != null) {
                    Detail.ADAPTER.encodeWithTag(protoWriter2, 1, textEffect2.portrait);
                }
                if (textEffect2.landscape != null) {
                    Detail.ADAPTER.encodeWithTag(protoWriter2, 2, textEffect2.landscape);
                }
                protoWriter2.writeBytes(textEffect.unknownFields());
            }
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11511, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11511, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.portrait = this.portrait;
            builder.landscape = this.landscape;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final int hashCode() {
            int i;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11513, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11513, new Class[0], Integer.TYPE)).intValue();
            }
            int i3 = this.hashCode;
            if (i3 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.portrait != null) {
                    i = this.portrait.hashCode();
                } else {
                    i = 0;
                }
                int i4 = (hashCode + i) * 37;
                if (this.landscape != null) {
                    i2 = this.landscape.hashCode();
                }
                i3 = i4 + i2;
                this.hashCode = i3;
            }
            return i3;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11514, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11514, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.portrait != null) {
                sb.append(", portrait=");
                sb.append(this.portrait);
            }
            if (this.landscape != null) {
                sb.append(", landscape=");
                sb.append(this.landscape);
            }
            StringBuilder replace = sb.replace(0, 2, "TextEffect{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11512, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11512, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof TextEffect)) {
                    return false;
                }
                TextEffect textEffect = (TextEffect) obj;
                if (!unknownFields().equals(textEffect.unknownFields()) || !Internal.equals(this.portrait, textEffect.portrait) || !Internal.equals(this.landscape, textEffect.landscape)) {
                    return false;
                }
                return true;
            }
        }

        public TextEffect(Detail detail, Detail detail2) {
            this(detail, detail2, ByteString.EMPTY);
        }

        public TextEffect(Detail detail, Detail detail2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.portrait = detail;
            this.landscape = detail2;
        }
    }

    public static final class Builder extends Message.Builder<GiftMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Long combo_count;
        public Common common;
        public Long fan_ticket_count;
        public Long gift_id;
        public Long group_count;
        public Long group_id;
        public Long income_taskgifts;
        public Long repeat_count;
        public Integer repeat_end;
        public Long room_fan_ticket_count;
        public TextEffect text_effect;
        public User to_user;
        public User user;

        public final GiftMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11506, new Class[0], GiftMessage.class)) {
                return (GiftMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11506, new Class[0], GiftMessage.class);
            }
            Common common2 = this.common;
            Long l = this.gift_id;
            Long l2 = this.fan_ticket_count;
            Long l3 = this.group_count;
            Long l4 = this.repeat_count;
            Long l5 = this.combo_count;
            User user2 = this.user;
            User user3 = this.to_user;
            Integer num = this.repeat_end;
            TextEffect textEffect = this.text_effect;
            Long l6 = this.group_id;
            Long l7 = this.income_taskgifts;
            GiftMessage giftMessage = new GiftMessage(common2, l, l2, l3, l4, l5, user2, user3, num, textEffect, l6, l7, this.room_fan_ticket_count, super.buildUnknownFields());
            return giftMessage;
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

        public final Builder gift_id(Long l) {
            this.gift_id = l;
            return this;
        }

        public final Builder group_count(Long l) {
            this.group_count = l;
            return this;
        }

        public final Builder group_id(Long l) {
            this.group_id = l;
            return this;
        }

        public final Builder income_taskgifts(Long l) {
            this.income_taskgifts = l;
            return this;
        }

        public final Builder repeat_count(Long l) {
            this.repeat_count = l;
            return this;
        }

        public final Builder repeat_end(Integer num) {
            this.repeat_end = num;
            return this;
        }

        public final Builder room_fan_ticket_count(Long l) {
            this.room_fan_ticket_count = l;
            return this;
        }

        public final Builder text_effect(TextEffect textEffect) {
            this.text_effect = textEffect;
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

    static final class ProtoAdapter_GiftMessage extends ProtoAdapter<GiftMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_GiftMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, GiftMessage.class);
        }

        public final GiftMessage redact(GiftMessage giftMessage) {
            if (PatchProxy.isSupport(new Object[]{giftMessage}, this, changeQuickRedirect, false, 11510, new Class[]{GiftMessage.class}, GiftMessage.class)) {
                return (GiftMessage) PatchProxy.accessDispatch(new Object[]{giftMessage}, this, changeQuickRedirect, false, 11510, new Class[]{GiftMessage.class}, GiftMessage.class);
            }
            Builder newBuilder = giftMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.user != null) {
                newBuilder.user = (User) User.ADAPTER.redact(newBuilder.user);
            }
            if (newBuilder.to_user != null) {
                newBuilder.to_user = (User) User.ADAPTER.redact(newBuilder.to_user);
            }
            if (newBuilder.text_effect != null) {
                newBuilder.text_effect = (TextEffect) TextEffect.ADAPTER.redact(newBuilder.text_effect);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final GiftMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11509, new Class[]{ProtoReader.class}, GiftMessage.class)) {
                return (GiftMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11509, new Class[]{ProtoReader.class}, GiftMessage.class);
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
                            builder.repeat_end((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 10:
                            builder.text_effect((TextEffect) TextEffect.ADAPTER.decode(protoReader2));
                            break;
                        case 11:
                            builder.group_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                            builder.income_taskgifts((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 13:
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

        public final int encodedSize(GiftMessage giftMessage) {
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
            GiftMessage giftMessage2 = giftMessage;
            int i13 = 0;
            if (PatchProxy.isSupport(new Object[]{giftMessage2}, this, changeQuickRedirect, false, 11507, new Class[]{GiftMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{giftMessage2}, this, changeQuickRedirect, false, 11507, new Class[]{GiftMessage.class}, Integer.TYPE)).intValue();
            }
            if (giftMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, giftMessage2.common);
            } else {
                i = 0;
            }
            if (giftMessage2.gift_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, giftMessage2.gift_id);
            } else {
                i2 = 0;
            }
            int i14 = i + i2;
            if (giftMessage2.fan_ticket_count != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, giftMessage2.fan_ticket_count);
            } else {
                i3 = 0;
            }
            int i15 = i14 + i3;
            if (giftMessage2.group_count != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, giftMessage2.group_count);
            } else {
                i4 = 0;
            }
            int i16 = i15 + i4;
            if (giftMessage2.repeat_count != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, giftMessage2.repeat_count);
            } else {
                i5 = 0;
            }
            int i17 = i16 + i5;
            if (giftMessage2.combo_count != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, giftMessage2.combo_count);
            } else {
                i6 = 0;
            }
            int i18 = i17 + i6;
            if (giftMessage2.user != null) {
                i7 = User.ADAPTER.encodedSizeWithTag(7, giftMessage2.user);
            } else {
                i7 = 0;
            }
            int i19 = i18 + i7;
            if (giftMessage2.to_user != null) {
                i8 = User.ADAPTER.encodedSizeWithTag(8, giftMessage2.to_user);
            } else {
                i8 = 0;
            }
            int i20 = i19 + i8;
            if (giftMessage2.repeat_end != null) {
                i9 = ProtoAdapter.INT32.encodedSizeWithTag(9, giftMessage2.repeat_end);
            } else {
                i9 = 0;
            }
            int i21 = i20 + i9;
            if (giftMessage2.text_effect != null) {
                i10 = TextEffect.ADAPTER.encodedSizeWithTag(10, giftMessage2.text_effect);
            } else {
                i10 = 0;
            }
            int i22 = i21 + i10;
            if (giftMessage2.group_id != null) {
                i11 = ProtoAdapter.INT64.encodedSizeWithTag(11, giftMessage2.group_id);
            } else {
                i11 = 0;
            }
            int i23 = i22 + i11;
            if (giftMessage2.income_taskgifts != null) {
                i12 = ProtoAdapter.INT64.encodedSizeWithTag(12, giftMessage2.income_taskgifts);
            } else {
                i12 = 0;
            }
            int i24 = i23 + i12;
            if (giftMessage2.room_fan_ticket_count != null) {
                i13 = ProtoAdapter.INT64.encodedSizeWithTag(13, giftMessage2.room_fan_ticket_count);
            }
            return i24 + i13 + giftMessage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, GiftMessage giftMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            GiftMessage giftMessage2 = giftMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, giftMessage2}, this, changeQuickRedirect, false, 11508, new Class[]{ProtoWriter.class, GiftMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, giftMessage2}, this, changeQuickRedirect, false, 11508, new Class[]{ProtoWriter.class, GiftMessage.class}, Void.TYPE);
                return;
            }
            if (giftMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, giftMessage2.common);
            }
            if (giftMessage2.gift_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, giftMessage2.gift_id);
            }
            if (giftMessage2.fan_ticket_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, giftMessage2.fan_ticket_count);
            }
            if (giftMessage2.group_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, giftMessage2.group_count);
            }
            if (giftMessage2.repeat_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 5, giftMessage2.repeat_count);
            }
            if (giftMessage2.combo_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 6, giftMessage2.combo_count);
            }
            if (giftMessage2.user != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 7, giftMessage2.user);
            }
            if (giftMessage2.to_user != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 8, giftMessage2.to_user);
            }
            if (giftMessage2.repeat_end != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 9, giftMessage2.repeat_end);
            }
            if (giftMessage2.text_effect != null) {
                TextEffect.ADAPTER.encodeWithTag(protoWriter2, 10, giftMessage2.text_effect);
            }
            if (giftMessage2.group_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 11, giftMessage2.group_id);
            }
            if (giftMessage2.income_taskgifts != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 12, giftMessage2.income_taskgifts);
            }
            if (giftMessage2.room_fan_ticket_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 13, giftMessage2.room_fan_ticket_count);
            }
            protoWriter2.writeBytes(giftMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11502, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11502, new Class[0], Builder.class);
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
        builder.repeat_end = this.repeat_end;
        builder.text_effect = this.text_effect;
        builder.group_id = this.group_id;
        builder.income_taskgifts = this.income_taskgifts;
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
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11504, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11504, new Class[0], Integer.TYPE)).intValue();
        }
        int i14 = this.hashCode;
        if (i14 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i15 = (hashCode + i) * 37;
            if (this.gift_id != null) {
                i2 = this.gift_id.hashCode();
            } else {
                i2 = 0;
            }
            int i16 = (i15 + i2) * 37;
            if (this.fan_ticket_count != null) {
                i3 = this.fan_ticket_count.hashCode();
            } else {
                i3 = 0;
            }
            int i17 = (i16 + i3) * 37;
            if (this.group_count != null) {
                i4 = this.group_count.hashCode();
            } else {
                i4 = 0;
            }
            int i18 = (i17 + i4) * 37;
            if (this.repeat_count != null) {
                i5 = this.repeat_count.hashCode();
            } else {
                i5 = 0;
            }
            int i19 = (i18 + i5) * 37;
            if (this.combo_count != null) {
                i6 = this.combo_count.hashCode();
            } else {
                i6 = 0;
            }
            int i20 = (i19 + i6) * 37;
            if (this.user != null) {
                i7 = this.user.hashCode();
            } else {
                i7 = 0;
            }
            int i21 = (i20 + i7) * 37;
            if (this.to_user != null) {
                i8 = this.to_user.hashCode();
            } else {
                i8 = 0;
            }
            int i22 = (i21 + i8) * 37;
            if (this.repeat_end != null) {
                i9 = this.repeat_end.hashCode();
            } else {
                i9 = 0;
            }
            int i23 = (i22 + i9) * 37;
            if (this.text_effect != null) {
                i10 = this.text_effect.hashCode();
            } else {
                i10 = 0;
            }
            int i24 = (i23 + i10) * 37;
            if (this.group_id != null) {
                i11 = this.group_id.hashCode();
            } else {
                i11 = 0;
            }
            int i25 = (i24 + i11) * 37;
            if (this.income_taskgifts != null) {
                i12 = this.income_taskgifts.hashCode();
            } else {
                i12 = 0;
            }
            int i26 = (i25 + i12) * 37;
            if (this.room_fan_ticket_count != null) {
                i13 = this.room_fan_ticket_count.hashCode();
            }
            i14 = i26 + i13;
            this.hashCode = i14;
        }
        return i14;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11505, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11505, new Class[0], String.class);
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
        if (this.repeat_end != null) {
            sb.append(", repeat_end=");
            sb.append(this.repeat_end);
        }
        if (this.text_effect != null) {
            sb.append(", text_effect=");
            sb.append(this.text_effect);
        }
        if (this.group_id != null) {
            sb.append(", group_id=");
            sb.append(this.group_id);
        }
        if (this.income_taskgifts != null) {
            sb.append(", income_taskgifts=");
            sb.append(this.income_taskgifts);
        }
        if (this.room_fan_ticket_count != null) {
            sb.append(", room_fan_ticket_count=");
            sb.append(this.room_fan_ticket_count);
        }
        StringBuilder replace = sb.replace(0, 2, "GiftMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11503, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11503, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof GiftMessage)) {
                return false;
            }
            GiftMessage giftMessage = (GiftMessage) obj;
            if (!unknownFields().equals(giftMessage.unknownFields()) || !Internal.equals(this.common, giftMessage.common) || !Internal.equals(this.gift_id, giftMessage.gift_id) || !Internal.equals(this.fan_ticket_count, giftMessage.fan_ticket_count) || !Internal.equals(this.group_count, giftMessage.group_count) || !Internal.equals(this.repeat_count, giftMessage.repeat_count) || !Internal.equals(this.combo_count, giftMessage.combo_count) || !Internal.equals(this.user, giftMessage.user) || !Internal.equals(this.to_user, giftMessage.to_user) || !Internal.equals(this.repeat_end, giftMessage.repeat_end) || !Internal.equals(this.text_effect, giftMessage.text_effect) || !Internal.equals(this.group_id, giftMessage.group_id) || !Internal.equals(this.income_taskgifts, giftMessage.income_taskgifts) || !Internal.equals(this.room_fan_ticket_count, giftMessage.room_fan_ticket_count)) {
                return false;
            }
            return true;
        }
    }

    public GiftMessage(Common common2, Long l, Long l2, Long l3, Long l4, Long l5, User user2, User user3, Integer num, TextEffect textEffect, Long l6, Long l7, Long l8) {
        this(common2, l, l2, l3, l4, l5, user2, user3, num, textEffect, l6, l7, l8, ByteString.EMPTY);
    }

    public GiftMessage(Common common2, Long l, Long l2, Long l3, Long l4, Long l5, User user2, User user3, Integer num, TextEffect textEffect, Long l6, Long l7, Long l8, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.gift_id = l;
        this.fan_ticket_count = l2;
        this.group_count = l3;
        this.repeat_count = l4;
        this.combo_count = l5;
        this.user = user2;
        this.to_user = user3;
        this.repeat_end = num;
        this.text_effect = textEffect;
        this.group_id = l6;
        this.income_taskgifts = l7;
        this.room_fan_ticket_count = l8;
    }
}
