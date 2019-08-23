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

public final class SunDailyRankMessage extends Message<SunDailyRankMessage, Builder> {
    public static final ProtoAdapter<SunDailyRankMessage> ADAPTER = new ProtoAdapter_SunDailyRankMessage();
    public static final Long DEFAULT_DURATION = 0L;
    public static final Long DEFAULT_MESSAGE_TYPE = 0L;
    public static final Long DEFAULT_RANK = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String after_content;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Text#ADAPTER", tag = 9)
    public final Text after_display_text;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String content;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long duration;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String extra;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long message_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 10)
    public final Long rank;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String schema;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String style;

    public static final class Builder extends Message.Builder<SunDailyRankMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String after_content;
        public Text after_display_text;
        public Common common;
        public String content;
        public Long duration;
        public String extra;
        public Long message_type;
        public Long rank;
        public String schema;
        public String style;

        public final SunDailyRankMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12178, new Class[0], SunDailyRankMessage.class)) {
                return (SunDailyRankMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12178, new Class[0], SunDailyRankMessage.class);
            }
            SunDailyRankMessage sunDailyRankMessage = new SunDailyRankMessage(this.common, this.content, this.duration, this.after_content, this.message_type, this.schema, this.extra, this.style, this.after_display_text, this.rank, super.buildUnknownFields());
            return sunDailyRankMessage;
        }

        public final Builder after_content(String str) {
            this.after_content = str;
            return this;
        }

        public final Builder after_display_text(Text text) {
            this.after_display_text = text;
            return this;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder duration(Long l) {
            this.duration = l;
            return this;
        }

        public final Builder extra(String str) {
            this.extra = str;
            return this;
        }

        public final Builder message_type(Long l) {
            this.message_type = l;
            return this;
        }

        public final Builder rank(Long l) {
            this.rank = l;
            return this;
        }

        public final Builder schema(String str) {
            this.schema = str;
            return this;
        }

        public final Builder style(String str) {
            this.style = str;
            return this;
        }
    }

    static final class ProtoAdapter_SunDailyRankMessage extends ProtoAdapter<SunDailyRankMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_SunDailyRankMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, SunDailyRankMessage.class);
        }

        public final SunDailyRankMessage redact(SunDailyRankMessage sunDailyRankMessage) {
            if (PatchProxy.isSupport(new Object[]{sunDailyRankMessage}, this, changeQuickRedirect, false, 12182, new Class[]{SunDailyRankMessage.class}, SunDailyRankMessage.class)) {
                return (SunDailyRankMessage) PatchProxy.accessDispatch(new Object[]{sunDailyRankMessage}, this, changeQuickRedirect, false, 12182, new Class[]{SunDailyRankMessage.class}, SunDailyRankMessage.class);
            }
            Builder newBuilder = sunDailyRankMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.after_display_text != null) {
                newBuilder.after_display_text = (Text) Text.ADAPTER.redact(newBuilder.after_display_text);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final SunDailyRankMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12181, new Class[]{ProtoReader.class}, SunDailyRankMessage.class)) {
                return (SunDailyRankMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12181, new Class[]{ProtoReader.class}, SunDailyRankMessage.class);
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
                            builder.content((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder.duration((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.after_content((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 5:
                            builder.message_type((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 6:
                            builder.schema((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case e.l /*7*/:
                            builder.extra((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 8:
                            builder.style((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 9:
                            builder.after_display_text((Text) Text.ADAPTER.decode(protoReader2));
                            break;
                        case 10:
                            builder.rank((Long) ProtoAdapter.INT64.decode(protoReader2));
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

        public final int encodedSize(SunDailyRankMessage sunDailyRankMessage) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            SunDailyRankMessage sunDailyRankMessage2 = sunDailyRankMessage;
            int i10 = 0;
            if (PatchProxy.isSupport(new Object[]{sunDailyRankMessage2}, this, changeQuickRedirect, false, 12179, new Class[]{SunDailyRankMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{sunDailyRankMessage2}, this, changeQuickRedirect, false, 12179, new Class[]{SunDailyRankMessage.class}, Integer.TYPE)).intValue();
            }
            if (sunDailyRankMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, sunDailyRankMessage2.common);
            } else {
                i = 0;
            }
            if (sunDailyRankMessage2.content != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, sunDailyRankMessage2.content);
            } else {
                i2 = 0;
            }
            int i11 = i + i2;
            if (sunDailyRankMessage2.duration != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, sunDailyRankMessage2.duration);
            } else {
                i3 = 0;
            }
            int i12 = i11 + i3;
            if (sunDailyRankMessage2.after_content != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, sunDailyRankMessage2.after_content);
            } else {
                i4 = 0;
            }
            int i13 = i12 + i4;
            if (sunDailyRankMessage2.message_type != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, sunDailyRankMessage2.message_type);
            } else {
                i5 = 0;
            }
            int i14 = i13 + i5;
            if (sunDailyRankMessage2.schema != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, sunDailyRankMessage2.schema);
            } else {
                i6 = 0;
            }
            int i15 = i14 + i6;
            if (sunDailyRankMessage2.extra != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, sunDailyRankMessage2.extra);
            } else {
                i7 = 0;
            }
            int i16 = i15 + i7;
            if (sunDailyRankMessage2.style != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(8, sunDailyRankMessage2.style);
            } else {
                i8 = 0;
            }
            int i17 = i16 + i8;
            if (sunDailyRankMessage2.after_display_text != null) {
                i9 = Text.ADAPTER.encodedSizeWithTag(9, sunDailyRankMessage2.after_display_text);
            } else {
                i9 = 0;
            }
            int i18 = i17 + i9;
            if (sunDailyRankMessage2.rank != null) {
                i10 = ProtoAdapter.INT64.encodedSizeWithTag(10, sunDailyRankMessage2.rank);
            }
            return i18 + i10 + sunDailyRankMessage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, SunDailyRankMessage sunDailyRankMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            SunDailyRankMessage sunDailyRankMessage2 = sunDailyRankMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, sunDailyRankMessage2}, this, changeQuickRedirect, false, 12180, new Class[]{ProtoWriter.class, SunDailyRankMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, sunDailyRankMessage2}, this, changeQuickRedirect, false, 12180, new Class[]{ProtoWriter.class, SunDailyRankMessage.class}, Void.TYPE);
                return;
            }
            if (sunDailyRankMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, sunDailyRankMessage2.common);
            }
            if (sunDailyRankMessage2.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, sunDailyRankMessage2.content);
            }
            if (sunDailyRankMessage2.duration != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, sunDailyRankMessage2.duration);
            }
            if (sunDailyRankMessage2.after_content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, sunDailyRankMessage2.after_content);
            }
            if (sunDailyRankMessage2.message_type != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 5, sunDailyRankMessage2.message_type);
            }
            if (sunDailyRankMessage2.schema != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 6, sunDailyRankMessage2.schema);
            }
            if (sunDailyRankMessage2.extra != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 7, sunDailyRankMessage2.extra);
            }
            if (sunDailyRankMessage2.style != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 8, sunDailyRankMessage2.style);
            }
            if (sunDailyRankMessage2.after_display_text != null) {
                Text.ADAPTER.encodeWithTag(protoWriter2, 9, sunDailyRankMessage2.after_display_text);
            }
            if (sunDailyRankMessage2.rank != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 10, sunDailyRankMessage2.rank);
            }
            protoWriter2.writeBytes(sunDailyRankMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12174, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12174, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.content = this.content;
        builder.duration = this.duration;
        builder.after_content = this.after_content;
        builder.message_type = this.message_type;
        builder.schema = this.schema;
        builder.extra = this.extra;
        builder.style = this.style;
        builder.after_display_text = this.after_display_text;
        builder.rank = this.rank;
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
        int i10 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12176, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12176, new Class[0], Integer.TYPE)).intValue();
        }
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i12 = (hashCode + i) * 37;
            if (this.content != null) {
                i2 = this.content.hashCode();
            } else {
                i2 = 0;
            }
            int i13 = (i12 + i2) * 37;
            if (this.duration != null) {
                i3 = this.duration.hashCode();
            } else {
                i3 = 0;
            }
            int i14 = (i13 + i3) * 37;
            if (this.after_content != null) {
                i4 = this.after_content.hashCode();
            } else {
                i4 = 0;
            }
            int i15 = (i14 + i4) * 37;
            if (this.message_type != null) {
                i5 = this.message_type.hashCode();
            } else {
                i5 = 0;
            }
            int i16 = (i15 + i5) * 37;
            if (this.schema != null) {
                i6 = this.schema.hashCode();
            } else {
                i6 = 0;
            }
            int i17 = (i16 + i6) * 37;
            if (this.extra != null) {
                i7 = this.extra.hashCode();
            } else {
                i7 = 0;
            }
            int i18 = (i17 + i7) * 37;
            if (this.style != null) {
                i8 = this.style.hashCode();
            } else {
                i8 = 0;
            }
            int i19 = (i18 + i8) * 37;
            if (this.after_display_text != null) {
                i9 = this.after_display_text.hashCode();
            } else {
                i9 = 0;
            }
            int i20 = (i19 + i9) * 37;
            if (this.rank != null) {
                i10 = this.rank.hashCode();
            }
            i11 = i20 + i10;
            this.hashCode = i11;
        }
        return i11;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12177, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12177, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.duration != null) {
            sb.append(", duration=");
            sb.append(this.duration);
        }
        if (this.after_content != null) {
            sb.append(", after_content=");
            sb.append(this.after_content);
        }
        if (this.message_type != null) {
            sb.append(", message_type=");
            sb.append(this.message_type);
        }
        if (this.schema != null) {
            sb.append(", schema=");
            sb.append(this.schema);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (this.style != null) {
            sb.append(", style=");
            sb.append(this.style);
        }
        if (this.after_display_text != null) {
            sb.append(", after_display_text=");
            sb.append(this.after_display_text);
        }
        if (this.rank != null) {
            sb.append(", rank=");
            sb.append(this.rank);
        }
        StringBuilder replace = sb.replace(0, 2, "SunDailyRankMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12175, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12175, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof SunDailyRankMessage)) {
                return false;
            }
            SunDailyRankMessage sunDailyRankMessage = (SunDailyRankMessage) obj;
            if (!unknownFields().equals(sunDailyRankMessage.unknownFields()) || !Internal.equals(this.common, sunDailyRankMessage.common) || !Internal.equals(this.content, sunDailyRankMessage.content) || !Internal.equals(this.duration, sunDailyRankMessage.duration) || !Internal.equals(this.after_content, sunDailyRankMessage.after_content) || !Internal.equals(this.message_type, sunDailyRankMessage.message_type) || !Internal.equals(this.schema, sunDailyRankMessage.schema) || !Internal.equals(this.extra, sunDailyRankMessage.extra) || !Internal.equals(this.style, sunDailyRankMessage.style) || !Internal.equals(this.after_display_text, sunDailyRankMessage.after_display_text) || !Internal.equals(this.rank, sunDailyRankMessage.rank)) {
                return false;
            }
            return true;
        }
    }

    public SunDailyRankMessage(Common common2, String str, Long l, String str2, Long l2, String str3, String str4, String str5, Text text, Long l3) {
        this(common2, str, l, str2, l2, str3, str4, str5, text, l3, ByteString.EMPTY);
    }

    public SunDailyRankMessage(Common common2, String str, Long l, String str2, Long l2, String str3, String str4, String str5, Text text, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.content = str;
        this.duration = l;
        this.after_content = str2;
        this.message_type = l2;
        this.schema = str3;
        this.extra = str4;
        this.style = str5;
        this.after_display_text = text;
        this.rank = l3;
    }
}
