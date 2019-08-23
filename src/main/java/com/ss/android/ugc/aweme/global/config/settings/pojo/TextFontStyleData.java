package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.KtNullable;
import com.bytedance.ies.c.a;
import com.bytedance.ies.c.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class TextFontStyleData extends Message<TextFontStyleData, Builder> {
    public static final DefaultValueProtoAdapter<TextFontStyleData> ADAPTER = new ProtoAdapter_TextFontStyleData();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public final Integer enable_bg_color;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public final Integer enable_maskblur_light_color;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer extra_type;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String font_name;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String title;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String url;

    public static final class Builder extends Message.Builder<TextFontStyleData, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer enable_bg_color;
        public Integer enable_maskblur_light_color;
        public Integer extra_type;
        public String font_name;
        public String title;
        public String url;

        public final TextFontStyleData build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49177, new Class[0], TextFontStyleData.class)) {
                return (TextFontStyleData) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49177, new Class[0], TextFontStyleData.class);
            }
            TextFontStyleData textFontStyleData = new TextFontStyleData(this.font_name, this.extra_type, this.url, this.title, this.enable_bg_color, this.enable_maskblur_light_color, super.buildUnknownFields());
            return textFontStyleData;
        }

        public final Builder enable_bg_color(Integer num) {
            this.enable_bg_color = num;
            return this;
        }

        public final Builder enable_maskblur_light_color(Integer num) {
            this.enable_maskblur_light_color = num;
            return this;
        }

        public final Builder extra_type(Integer num) {
            this.extra_type = num;
            return this;
        }

        public final Builder font_name(String str) {
            this.font_name = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final Builder url(String str) {
            this.url = str;
            return this;
        }
    }

    static final class ProtoAdapter_TextFontStyleData extends DefaultValueProtoAdapter<TextFontStyleData> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final TextFontStyleData redact(TextFontStyleData textFontStyleData) {
            return textFontStyleData;
        }

        public ProtoAdapter_TextFontStyleData() {
            super(FieldEncoding.LENGTH_DELIMITED, TextFontStyleData.class);
        }

        public final TextFontStyleData decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49180, new Class[]{ProtoReader.class}, TextFontStyleData.class)) {
                return decode(protoReader2, (TextFontStyleData) null);
            }
            return (TextFontStyleData) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49180, new Class[]{ProtoReader.class}, TextFontStyleData.class);
        }

        public final int encodedSize(TextFontStyleData textFontStyleData) {
            TextFontStyleData textFontStyleData2 = textFontStyleData;
            if (!PatchProxy.isSupport(new Object[]{textFontStyleData2}, this, changeQuickRedirect, false, 49178, new Class[]{TextFontStyleData.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, textFontStyleData2.font_name) + ProtoAdapter.INT32.encodedSizeWithTag(2, textFontStyleData2.extra_type) + ProtoAdapter.STRING.encodedSizeWithTag(3, textFontStyleData2.url) + ProtoAdapter.STRING.encodedSizeWithTag(4, textFontStyleData2.title) + ProtoAdapter.INT32.encodedSizeWithTag(5, textFontStyleData2.enable_bg_color) + ProtoAdapter.INT32.encodedSizeWithTag(6, textFontStyleData2.enable_maskblur_light_color) + textFontStyleData.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{textFontStyleData2}, this, changeQuickRedirect, false, 49178, new Class[]{TextFontStyleData.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, TextFontStyleData textFontStyleData) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            TextFontStyleData textFontStyleData2 = textFontStyleData;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, textFontStyleData2}, this, changeQuickRedirect, false, 49179, new Class[]{ProtoWriter.class, TextFontStyleData.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, textFontStyleData2}, this, changeQuickRedirect, false, 49179, new Class[]{ProtoWriter.class, TextFontStyleData.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, textFontStyleData2.font_name);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, textFontStyleData2.extra_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, textFontStyleData2.url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, textFontStyleData2.title);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 5, textFontStyleData2.enable_bg_color);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 6, textFontStyleData2.enable_maskblur_light_color);
            protoWriter2.writeBytes(textFontStyleData.unknownFields());
        }

        public final TextFontStyleData decode(ProtoReader protoReader, TextFontStyleData textFontStyleData) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            TextFontStyleData textFontStyleData2 = textFontStyleData;
            if (PatchProxy.isSupport(new Object[]{protoReader2, textFontStyleData2}, this, changeQuickRedirect, false, 49181, new Class[]{ProtoReader.class, TextFontStyleData.class}, TextFontStyleData.class)) {
                return (TextFontStyleData) PatchProxy.accessDispatch(new Object[]{protoReader2, textFontStyleData2}, this, changeQuickRedirect, false, 49181, new Class[]{ProtoReader.class, TextFontStyleData.class}, TextFontStyleData.class);
            }
            TextFontStyleData textFontStyleData3 = (TextFontStyleData) a.a().a(TextFontStyleData.class, textFontStyleData2);
            if (textFontStyleData3 != null) {
                builder = textFontStyleData3.newBuilder();
            } else {
                builder = new Builder();
            }
            Builder builder2 = builder;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder2.font_name((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            builder2.extra_type((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 3:
                            builder2.url((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 4:
                            builder2.title((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 5:
                            builder2.enable_bg_color((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 6:
                            builder2.enable_maskblur_light_color((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (textFontStyleData3 != null) {
                                    break;
                                } else {
                                    throw e2;
                                }
                            }
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    return builder2.build();
                }
            }
        }
    }

    @KtNullable
    public final Integer getEnableBgColor() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49171, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49171, new Class[0], Integer.class);
        } else if (this.enable_bg_color != null) {
            return this.enable_bg_color;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getEnableMaskblurLightColor() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49172, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49172, new Class[0], Integer.class);
        } else if (this.enable_maskblur_light_color != null) {
            return this.enable_maskblur_light_color;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getExtraType() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49168, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49168, new Class[0], Integer.class);
        } else if (this.extra_type != null) {
            return this.extra_type;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getFontName() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49167, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49167, new Class[0], String.class);
        } else if (this.font_name != null) {
            return this.font_name;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getTitle() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49170, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49170, new Class[0], String.class);
        } else if (this.title != null) {
            return this.title;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getUrl() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49169, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49169, new Class[0], String.class);
        } else if (this.url != null) {
            return this.url;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49173, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49173, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.font_name = this.font_name;
        builder.extra_type = this.extra_type;
        builder.url = this.url;
        builder.title = this.title;
        builder.enable_bg_color = this.enable_bg_color;
        builder.enable_maskblur_light_color = this.enable_maskblur_light_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49175, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49175, new Class[0], Integer.TYPE)).intValue();
        }
        int i7 = this.hashCode;
        if (i7 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.font_name != null) {
                i = this.font_name.hashCode();
            } else {
                i = 0;
            }
            int i8 = (hashCode + i) * 37;
            if (this.extra_type != null) {
                i2 = this.extra_type.hashCode();
            } else {
                i2 = 0;
            }
            int i9 = (i8 + i2) * 37;
            if (this.url != null) {
                i3 = this.url.hashCode();
            } else {
                i3 = 0;
            }
            int i10 = (i9 + i3) * 37;
            if (this.title != null) {
                i4 = this.title.hashCode();
            } else {
                i4 = 0;
            }
            int i11 = (i10 + i4) * 37;
            if (this.enable_bg_color != null) {
                i5 = this.enable_bg_color.hashCode();
            } else {
                i5 = 0;
            }
            int i12 = (i11 + i5) * 37;
            if (this.enable_maskblur_light_color != null) {
                i6 = this.enable_maskblur_light_color.hashCode();
            }
            i7 = i12 + i6;
            this.hashCode = i7;
        }
        return i7;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49176, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49176, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.font_name != null) {
            sb.append(", font_name=");
            sb.append(this.font_name);
        }
        if (this.extra_type != null) {
            sb.append(", extra_type=");
            sb.append(this.extra_type);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.enable_bg_color != null) {
            sb.append(", enable_bg_color=");
            sb.append(this.enable_bg_color);
        }
        if (this.enable_maskblur_light_color != null) {
            sb.append(", enable_maskblur_light_color=");
            sb.append(this.enable_maskblur_light_color);
        }
        StringBuilder replace = sb.replace(0, 2, "TextFontStyleData{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49174, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49174, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof TextFontStyleData)) {
                return false;
            }
            TextFontStyleData textFontStyleData = (TextFontStyleData) obj;
            if (!unknownFields().equals(textFontStyleData.unknownFields()) || !Internal.equals(this.font_name, textFontStyleData.font_name) || !Internal.equals(this.extra_type, textFontStyleData.extra_type) || !Internal.equals(this.url, textFontStyleData.url) || !Internal.equals(this.title, textFontStyleData.title) || !Internal.equals(this.enable_bg_color, textFontStyleData.enable_bg_color) || !Internal.equals(this.enable_maskblur_light_color, textFontStyleData.enable_maskblur_light_color)) {
                return false;
            }
            return true;
        }
    }

    public TextFontStyleData(String str, Integer num, String str2, String str3, Integer num2, Integer num3) {
        this(str, num, str2, str3, num2, num3, ByteString.EMPTY);
    }

    public TextFontStyleData(String str, Integer num, String str2, String str3, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.font_name = str;
        this.extra_type = num;
        this.url = str2;
        this.title = str3;
        this.enable_bg_color = num2;
        this.enable_maskblur_light_color = num3;
    }
}
