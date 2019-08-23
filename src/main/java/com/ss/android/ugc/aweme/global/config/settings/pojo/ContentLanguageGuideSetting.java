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

public final class ContentLanguageGuideSetting extends Message<ContentLanguageGuideSetting, Builder> {
    public static final DefaultValueProtoAdapter<ContentLanguageGuideSetting> ADAPTER = new ProtoAdapter_ContentLanguageGuideSetting();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String code;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String en_name;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String highlight_color;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String icon;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String local_name;

    public static final class Builder extends Message.Builder<ContentLanguageGuideSetting, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String code;
        public String en_name;
        public String highlight_color;
        public String icon;
        public String local_name;

        public final ContentLanguageGuideSetting build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47790, new Class[0], ContentLanguageGuideSetting.class)) {
                return (ContentLanguageGuideSetting) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47790, new Class[0], ContentLanguageGuideSetting.class);
            }
            ContentLanguageGuideSetting contentLanguageGuideSetting = new ContentLanguageGuideSetting(this.en_name, this.code, this.local_name, this.icon, this.highlight_color, super.buildUnknownFields());
            return contentLanguageGuideSetting;
        }

        public final Builder code(String str) {
            this.code = str;
            return this;
        }

        public final Builder en_name(String str) {
            this.en_name = str;
            return this;
        }

        public final Builder highlight_color(String str) {
            this.highlight_color = str;
            return this;
        }

        public final Builder icon(String str) {
            this.icon = str;
            return this;
        }

        public final Builder local_name(String str) {
            this.local_name = str;
            return this;
        }
    }

    static final class ProtoAdapter_ContentLanguageGuideSetting extends DefaultValueProtoAdapter<ContentLanguageGuideSetting> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final ContentLanguageGuideSetting redact(ContentLanguageGuideSetting contentLanguageGuideSetting) {
            return contentLanguageGuideSetting;
        }

        public ProtoAdapter_ContentLanguageGuideSetting() {
            super(FieldEncoding.LENGTH_DELIMITED, ContentLanguageGuideSetting.class);
        }

        public final ContentLanguageGuideSetting decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47793, new Class[]{ProtoReader.class}, ContentLanguageGuideSetting.class)) {
                return decode(protoReader2, (ContentLanguageGuideSetting) null);
            }
            return (ContentLanguageGuideSetting) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47793, new Class[]{ProtoReader.class}, ContentLanguageGuideSetting.class);
        }

        public final int encodedSize(ContentLanguageGuideSetting contentLanguageGuideSetting) {
            ContentLanguageGuideSetting contentLanguageGuideSetting2 = contentLanguageGuideSetting;
            if (!PatchProxy.isSupport(new Object[]{contentLanguageGuideSetting2}, this, changeQuickRedirect, false, 47791, new Class[]{ContentLanguageGuideSetting.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, contentLanguageGuideSetting2.en_name) + ProtoAdapter.STRING.encodedSizeWithTag(2, contentLanguageGuideSetting2.code) + ProtoAdapter.STRING.encodedSizeWithTag(3, contentLanguageGuideSetting2.local_name) + ProtoAdapter.STRING.encodedSizeWithTag(4, contentLanguageGuideSetting2.icon) + ProtoAdapter.STRING.encodedSizeWithTag(5, contentLanguageGuideSetting2.highlight_color) + contentLanguageGuideSetting.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{contentLanguageGuideSetting2}, this, changeQuickRedirect, false, 47791, new Class[]{ContentLanguageGuideSetting.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, ContentLanguageGuideSetting contentLanguageGuideSetting) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            ContentLanguageGuideSetting contentLanguageGuideSetting2 = contentLanguageGuideSetting;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, contentLanguageGuideSetting2}, this, changeQuickRedirect, false, 47792, new Class[]{ProtoWriter.class, ContentLanguageGuideSetting.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, contentLanguageGuideSetting2}, this, changeQuickRedirect, false, 47792, new Class[]{ProtoWriter.class, ContentLanguageGuideSetting.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, contentLanguageGuideSetting2.en_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, contentLanguageGuideSetting2.code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, contentLanguageGuideSetting2.local_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, contentLanguageGuideSetting2.icon);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 5, contentLanguageGuideSetting2.highlight_color);
            protoWriter2.writeBytes(contentLanguageGuideSetting.unknownFields());
        }

        public final ContentLanguageGuideSetting decode(ProtoReader protoReader, ContentLanguageGuideSetting contentLanguageGuideSetting) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            ContentLanguageGuideSetting contentLanguageGuideSetting2 = contentLanguageGuideSetting;
            if (PatchProxy.isSupport(new Object[]{protoReader2, contentLanguageGuideSetting2}, this, changeQuickRedirect, false, 47794, new Class[]{ProtoReader.class, ContentLanguageGuideSetting.class}, ContentLanguageGuideSetting.class)) {
                return (ContentLanguageGuideSetting) PatchProxy.accessDispatch(new Object[]{protoReader2, contentLanguageGuideSetting2}, this, changeQuickRedirect, false, 47794, new Class[]{ProtoReader.class, ContentLanguageGuideSetting.class}, ContentLanguageGuideSetting.class);
            }
            ContentLanguageGuideSetting contentLanguageGuideSetting3 = (ContentLanguageGuideSetting) a.a().a(ContentLanguageGuideSetting.class, contentLanguageGuideSetting2);
            if (contentLanguageGuideSetting3 != null) {
                builder = contentLanguageGuideSetting3.newBuilder();
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
                            builder2.en_name((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            builder2.code((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder2.local_name((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 4:
                            builder2.icon((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 5:
                            builder2.highlight_color((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (contentLanguageGuideSetting3 != null) {
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
    public final String getCode() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47782, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47782, new Class[0], String.class);
        } else if (this.code != null) {
            return this.code;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getEnName() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47781, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47781, new Class[0], String.class);
        } else if (this.en_name != null) {
            return this.en_name;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getHighlightColor() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47785, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47785, new Class[0], String.class);
        } else if (this.highlight_color != null) {
            return this.highlight_color;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getIcon() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47784, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47784, new Class[0], String.class);
        } else if (this.icon != null) {
            return this.icon;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getLocalName() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47783, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47783, new Class[0], String.class);
        } else if (this.local_name != null) {
            return this.local_name;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47786, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47786, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.en_name = this.en_name;
        builder.code = this.code;
        builder.local_name = this.local_name;
        builder.icon = this.icon;
        builder.highlight_color = this.highlight_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47788, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47788, new Class[0], Integer.TYPE)).intValue();
        }
        int i6 = this.hashCode;
        if (i6 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.en_name != null) {
                i = this.en_name.hashCode();
            } else {
                i = 0;
            }
            int i7 = (hashCode + i) * 37;
            if (this.code != null) {
                i2 = this.code.hashCode();
            } else {
                i2 = 0;
            }
            int i8 = (i7 + i2) * 37;
            if (this.local_name != null) {
                i3 = this.local_name.hashCode();
            } else {
                i3 = 0;
            }
            int i9 = (i8 + i3) * 37;
            if (this.icon != null) {
                i4 = this.icon.hashCode();
            } else {
                i4 = 0;
            }
            int i10 = (i9 + i4) * 37;
            if (this.highlight_color != null) {
                i5 = this.highlight_color.hashCode();
            }
            i6 = i10 + i5;
            this.hashCode = i6;
        }
        return i6;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47789, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47789, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.en_name != null) {
            sb.append(", en_name=");
            sb.append(this.en_name);
        }
        if (this.code != null) {
            sb.append(", code=");
            sb.append(this.code);
        }
        if (this.local_name != null) {
            sb.append(", local_name=");
            sb.append(this.local_name);
        }
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        if (this.highlight_color != null) {
            sb.append(", highlight_color=");
            sb.append(this.highlight_color);
        }
        StringBuilder replace = sb.replace(0, 2, "ContentLanguageGuideSetting{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47787, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47787, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof ContentLanguageGuideSetting)) {
                return false;
            }
            ContentLanguageGuideSetting contentLanguageGuideSetting = (ContentLanguageGuideSetting) obj;
            if (!unknownFields().equals(contentLanguageGuideSetting.unknownFields()) || !Internal.equals(this.en_name, contentLanguageGuideSetting.en_name) || !Internal.equals(this.code, contentLanguageGuideSetting.code) || !Internal.equals(this.local_name, contentLanguageGuideSetting.local_name) || !Internal.equals(this.icon, contentLanguageGuideSetting.icon) || !Internal.equals(this.highlight_color, contentLanguageGuideSetting.highlight_color)) {
                return false;
            }
            return true;
        }
    }

    public ContentLanguageGuideSetting(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, ByteString.EMPTY);
    }

    public ContentLanguageGuideSetting(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.en_name = str;
        this.code = str2;
        this.local_name = str3;
        this.icon = str4;
        this.highlight_color = str5;
    }
}
