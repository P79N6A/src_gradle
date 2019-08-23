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

public final class CommonToastMessage extends Message<CommonToastMessage, Builder> {
    public static final ProtoAdapter<CommonToastMessage> ADAPTER = new ProtoAdapter_CommonToastMessage();
    public static final Boolean DEFAULT_DISCARDABLE = Boolean.FALSE;
    public static final Long DEFAULT_DURATION = 0L;
    public static final Boolean DEFAULT_IMMEDIATE = Boolean.FALSE;
    public static final Long DEFAULT_POSITION = 0L;
    public static final Boolean DEFAULT_SHOW_MONGOLIA_LAYER = Boolean.FALSE;
    public static final Long DEFAULT_TOP_IMG_HEIGHT = 0L;
    public static final Long DEFAULT_TOP_IMG_WIDTH = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String background_color_end;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String background_color_start;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean discardable;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long duration;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public final Boolean immediate;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 8)
    public final Long position;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 12)
    public final Boolean show_mongolia_layer;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String text_color;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 9)
    public final Image top_img;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 11)
    public final Long top_img_height;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 10)
    public final Long top_img_width;

    public static final class Builder extends Message.Builder<CommonToastMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String background_color_end;
        public String background_color_start;
        public Common common;
        public Boolean discardable;
        public Long duration;
        public Boolean immediate;
        public Long position;
        public Boolean show_mongolia_layer;
        public String text_color;
        public Image top_img;
        public Long top_img_height;
        public Long top_img_width;

        public final CommonToastMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11278, new Class[0], CommonToastMessage.class)) {
                return (CommonToastMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11278, new Class[0], CommonToastMessage.class);
            }
            CommonToastMessage commonToastMessage = new CommonToastMessage(this.common, this.discardable, this.immediate, this.duration, this.text_color, this.background_color_start, this.background_color_end, this.position, this.top_img, this.top_img_width, this.top_img_height, this.show_mongolia_layer, super.buildUnknownFields());
            return commonToastMessage;
        }

        public final Builder background_color_end(String str) {
            this.background_color_end = str;
            return this;
        }

        public final Builder background_color_start(String str) {
            this.background_color_start = str;
            return this;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder discardable(Boolean bool) {
            this.discardable = bool;
            return this;
        }

        public final Builder duration(Long l) {
            this.duration = l;
            return this;
        }

        public final Builder immediate(Boolean bool) {
            this.immediate = bool;
            return this;
        }

        public final Builder position(Long l) {
            this.position = l;
            return this;
        }

        public final Builder show_mongolia_layer(Boolean bool) {
            this.show_mongolia_layer = bool;
            return this;
        }

        public final Builder text_color(String str) {
            this.text_color = str;
            return this;
        }

        public final Builder top_img(Image image) {
            this.top_img = image;
            return this;
        }

        public final Builder top_img_height(Long l) {
            this.top_img_height = l;
            return this;
        }

        public final Builder top_img_width(Long l) {
            this.top_img_width = l;
            return this;
        }
    }

    static final class ProtoAdapter_CommonToastMessage extends ProtoAdapter<CommonToastMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_CommonToastMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, CommonToastMessage.class);
        }

        public final CommonToastMessage redact(CommonToastMessage commonToastMessage) {
            if (PatchProxy.isSupport(new Object[]{commonToastMessage}, this, changeQuickRedirect, false, 11282, new Class[]{CommonToastMessage.class}, CommonToastMessage.class)) {
                return (CommonToastMessage) PatchProxy.accessDispatch(new Object[]{commonToastMessage}, this, changeQuickRedirect, false, 11282, new Class[]{CommonToastMessage.class}, CommonToastMessage.class);
            }
            Builder newBuilder = commonToastMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.top_img != null) {
                newBuilder.top_img = (Image) Image.ADAPTER.redact(newBuilder.top_img);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final CommonToastMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11281, new Class[]{ProtoReader.class}, CommonToastMessage.class)) {
                return (CommonToastMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11281, new Class[]{ProtoReader.class}, CommonToastMessage.class);
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
                            builder.discardable((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 3:
                            builder.immediate((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 4:
                            builder.duration((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 5:
                            builder.text_color((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 6:
                            builder.background_color_start((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case e.l /*7*/:
                            builder.background_color_end((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 8:
                            builder.position((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 9:
                            builder.top_img((Image) Image.ADAPTER.decode(protoReader2));
                            break;
                        case 10:
                            builder.top_img_width((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 11:
                            builder.top_img_height((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                            builder.show_mongolia_layer((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
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

        public final int encodedSize(CommonToastMessage commonToastMessage) {
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
            CommonToastMessage commonToastMessage2 = commonToastMessage;
            int i12 = 0;
            if (PatchProxy.isSupport(new Object[]{commonToastMessage2}, this, changeQuickRedirect, false, 11279, new Class[]{CommonToastMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{commonToastMessage2}, this, changeQuickRedirect, false, 11279, new Class[]{CommonToastMessage.class}, Integer.TYPE)).intValue();
            }
            if (commonToastMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, commonToastMessage2.common);
            } else {
                i = 0;
            }
            if (commonToastMessage2.discardable != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, commonToastMessage2.discardable);
            } else {
                i2 = 0;
            }
            int i13 = i + i2;
            if (commonToastMessage2.immediate != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, commonToastMessage2.immediate);
            } else {
                i3 = 0;
            }
            int i14 = i13 + i3;
            if (commonToastMessage2.duration != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, commonToastMessage2.duration);
            } else {
                i4 = 0;
            }
            int i15 = i14 + i4;
            if (commonToastMessage2.text_color != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, commonToastMessage2.text_color);
            } else {
                i5 = 0;
            }
            int i16 = i15 + i5;
            if (commonToastMessage2.background_color_start != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, commonToastMessage2.background_color_start);
            } else {
                i6 = 0;
            }
            int i17 = i16 + i6;
            if (commonToastMessage2.background_color_end != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, commonToastMessage2.background_color_end);
            } else {
                i7 = 0;
            }
            int i18 = i17 + i7;
            if (commonToastMessage2.position != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(8, commonToastMessage2.position);
            } else {
                i8 = 0;
            }
            int i19 = i18 + i8;
            if (commonToastMessage2.top_img != null) {
                i9 = Image.ADAPTER.encodedSizeWithTag(9, commonToastMessage2.top_img);
            } else {
                i9 = 0;
            }
            int i20 = i19 + i9;
            if (commonToastMessage2.top_img_width != null) {
                i10 = ProtoAdapter.INT64.encodedSizeWithTag(10, commonToastMessage2.top_img_width);
            } else {
                i10 = 0;
            }
            int i21 = i20 + i10;
            if (commonToastMessage2.top_img_height != null) {
                i11 = ProtoAdapter.INT64.encodedSizeWithTag(11, commonToastMessage2.top_img_height);
            } else {
                i11 = 0;
            }
            int i22 = i21 + i11;
            if (commonToastMessage2.show_mongolia_layer != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(12, commonToastMessage2.show_mongolia_layer);
            }
            return i22 + i12 + commonToastMessage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, CommonToastMessage commonToastMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            CommonToastMessage commonToastMessage2 = commonToastMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, commonToastMessage2}, this, changeQuickRedirect, false, 11280, new Class[]{ProtoWriter.class, CommonToastMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, commonToastMessage2}, this, changeQuickRedirect, false, 11280, new Class[]{ProtoWriter.class, CommonToastMessage.class}, Void.TYPE);
                return;
            }
            if (commonToastMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, commonToastMessage2.common);
            }
            if (commonToastMessage2.discardable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 2, commonToastMessage2.discardable);
            }
            if (commonToastMessage2.immediate != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 3, commonToastMessage2.immediate);
            }
            if (commonToastMessage2.duration != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, commonToastMessage2.duration);
            }
            if (commonToastMessage2.text_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 5, commonToastMessage2.text_color);
            }
            if (commonToastMessage2.background_color_start != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 6, commonToastMessage2.background_color_start);
            }
            if (commonToastMessage2.background_color_end != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 7, commonToastMessage2.background_color_end);
            }
            if (commonToastMessage2.position != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 8, commonToastMessage2.position);
            }
            if (commonToastMessage2.top_img != null) {
                Image.ADAPTER.encodeWithTag(protoWriter2, 9, commonToastMessage2.top_img);
            }
            if (commonToastMessage2.top_img_width != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 10, commonToastMessage2.top_img_width);
            }
            if (commonToastMessage2.top_img_height != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 11, commonToastMessage2.top_img_height);
            }
            if (commonToastMessage2.show_mongolia_layer != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 12, commonToastMessage2.show_mongolia_layer);
            }
            protoWriter2.writeBytes(commonToastMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11274, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11274, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.discardable = this.discardable;
        builder.immediate = this.immediate;
        builder.duration = this.duration;
        builder.text_color = this.text_color;
        builder.background_color_start = this.background_color_start;
        builder.background_color_end = this.background_color_end;
        builder.position = this.position;
        builder.top_img = this.top_img;
        builder.top_img_width = this.top_img_width;
        builder.top_img_height = this.top_img_height;
        builder.show_mongolia_layer = this.show_mongolia_layer;
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11276, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11276, new Class[0], Integer.TYPE)).intValue();
        }
        int i13 = this.hashCode;
        if (i13 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i14 = (hashCode + i) * 37;
            if (this.discardable != null) {
                i2 = this.discardable.hashCode();
            } else {
                i2 = 0;
            }
            int i15 = (i14 + i2) * 37;
            if (this.immediate != null) {
                i3 = this.immediate.hashCode();
            } else {
                i3 = 0;
            }
            int i16 = (i15 + i3) * 37;
            if (this.duration != null) {
                i4 = this.duration.hashCode();
            } else {
                i4 = 0;
            }
            int i17 = (i16 + i4) * 37;
            if (this.text_color != null) {
                i5 = this.text_color.hashCode();
            } else {
                i5 = 0;
            }
            int i18 = (i17 + i5) * 37;
            if (this.background_color_start != null) {
                i6 = this.background_color_start.hashCode();
            } else {
                i6 = 0;
            }
            int i19 = (i18 + i6) * 37;
            if (this.background_color_end != null) {
                i7 = this.background_color_end.hashCode();
            } else {
                i7 = 0;
            }
            int i20 = (i19 + i7) * 37;
            if (this.position != null) {
                i8 = this.position.hashCode();
            } else {
                i8 = 0;
            }
            int i21 = (i20 + i8) * 37;
            if (this.top_img != null) {
                i9 = this.top_img.hashCode();
            } else {
                i9 = 0;
            }
            int i22 = (i21 + i9) * 37;
            if (this.top_img_width != null) {
                i10 = this.top_img_width.hashCode();
            } else {
                i10 = 0;
            }
            int i23 = (i22 + i10) * 37;
            if (this.top_img_height != null) {
                i11 = this.top_img_height.hashCode();
            } else {
                i11 = 0;
            }
            int i24 = (i23 + i11) * 37;
            if (this.show_mongolia_layer != null) {
                i12 = this.show_mongolia_layer.hashCode();
            }
            i13 = i24 + i12;
            this.hashCode = i13;
        }
        return i13;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11277, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11277, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.discardable != null) {
            sb.append(", discardable=");
            sb.append(this.discardable);
        }
        if (this.immediate != null) {
            sb.append(", immediate=");
            sb.append(this.immediate);
        }
        if (this.duration != null) {
            sb.append(", duration=");
            sb.append(this.duration);
        }
        if (this.text_color != null) {
            sb.append(", text_color=");
            sb.append(this.text_color);
        }
        if (this.background_color_start != null) {
            sb.append(", background_color_start=");
            sb.append(this.background_color_start);
        }
        if (this.background_color_end != null) {
            sb.append(", background_color_end=");
            sb.append(this.background_color_end);
        }
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        if (this.top_img != null) {
            sb.append(", top_img=");
            sb.append(this.top_img);
        }
        if (this.top_img_width != null) {
            sb.append(", top_img_width=");
            sb.append(this.top_img_width);
        }
        if (this.top_img_height != null) {
            sb.append(", top_img_height=");
            sb.append(this.top_img_height);
        }
        if (this.show_mongolia_layer != null) {
            sb.append(", show_mongolia_layer=");
            sb.append(this.show_mongolia_layer);
        }
        StringBuilder replace = sb.replace(0, 2, "CommonToastMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11275, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11275, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof CommonToastMessage)) {
                return false;
            }
            CommonToastMessage commonToastMessage = (CommonToastMessage) obj;
            if (!unknownFields().equals(commonToastMessage.unknownFields()) || !Internal.equals(this.common, commonToastMessage.common) || !Internal.equals(this.discardable, commonToastMessage.discardable) || !Internal.equals(this.immediate, commonToastMessage.immediate) || !Internal.equals(this.duration, commonToastMessage.duration) || !Internal.equals(this.text_color, commonToastMessage.text_color) || !Internal.equals(this.background_color_start, commonToastMessage.background_color_start) || !Internal.equals(this.background_color_end, commonToastMessage.background_color_end) || !Internal.equals(this.position, commonToastMessage.position) || !Internal.equals(this.top_img, commonToastMessage.top_img) || !Internal.equals(this.top_img_width, commonToastMessage.top_img_width) || !Internal.equals(this.top_img_height, commonToastMessage.top_img_height) || !Internal.equals(this.show_mongolia_layer, commonToastMessage.show_mongolia_layer)) {
                return false;
            }
            return true;
        }
    }

    public CommonToastMessage(Common common2, Boolean bool, Boolean bool2, Long l, String str, String str2, String str3, Long l2, Image image, Long l3, Long l4, Boolean bool3) {
        this(common2, bool, bool2, l, str, str2, str3, l2, image, l3, l4, bool3, ByteString.EMPTY);
    }

    public CommonToastMessage(Common common2, Boolean bool, Boolean bool2, Long l, String str, String str2, String str3, Long l2, Image image, Long l3, Long l4, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.discardable = bool;
        this.immediate = bool2;
        this.duration = l;
        this.text_color = str;
        this.background_color_start = str2;
        this.background_color_end = str3;
        this.position = l2;
        this.top_img = image;
        this.top_img_width = l3;
        this.top_img_height = l4;
        this.show_mongolia_layer = bool3;
    }
}
