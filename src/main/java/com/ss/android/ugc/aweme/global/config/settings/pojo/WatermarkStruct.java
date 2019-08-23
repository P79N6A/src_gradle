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

public final class WatermarkStruct extends Message<WatermarkStruct, Builder> {
    public static final DefaultValueProtoAdapter<WatermarkStruct> ADAPTER = new ProtoAdapter_WatermarkStruct();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String end_watermark_string;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String end_watermark_substring;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String fps;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String md5;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel#ADAPTER", tag = 1)
    public final UrlModel resource_url;

    public static final class Builder extends Message.Builder<WatermarkStruct, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String end_watermark_string;
        public String end_watermark_substring;
        public String fps;
        public String md5;
        public UrlModel resource_url;

        public final WatermarkStruct build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49402, new Class[0], WatermarkStruct.class)) {
                return (WatermarkStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49402, new Class[0], WatermarkStruct.class);
            }
            WatermarkStruct watermarkStruct = new WatermarkStruct(this.resource_url, this.md5, this.fps, this.end_watermark_string, this.end_watermark_substring, super.buildUnknownFields());
            return watermarkStruct;
        }

        public final Builder end_watermark_string(String str) {
            this.end_watermark_string = str;
            return this;
        }

        public final Builder end_watermark_substring(String str) {
            this.end_watermark_substring = str;
            return this;
        }

        public final Builder fps(String str) {
            this.fps = str;
            return this;
        }

        public final Builder md5(String str) {
            this.md5 = str;
            return this;
        }

        public final Builder resource_url(UrlModel urlModel) {
            this.resource_url = urlModel;
            return this;
        }
    }

    static final class ProtoAdapter_WatermarkStruct extends DefaultValueProtoAdapter<WatermarkStruct> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final WatermarkStruct redact(WatermarkStruct watermarkStruct) {
            return watermarkStruct;
        }

        public ProtoAdapter_WatermarkStruct() {
            super(FieldEncoding.LENGTH_DELIMITED, WatermarkStruct.class);
        }

        public final WatermarkStruct decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49405, new Class[]{ProtoReader.class}, WatermarkStruct.class)) {
                return decode(protoReader2, (WatermarkStruct) null);
            }
            return (WatermarkStruct) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49405, new Class[]{ProtoReader.class}, WatermarkStruct.class);
        }

        public final int encodedSize(WatermarkStruct watermarkStruct) {
            WatermarkStruct watermarkStruct2 = watermarkStruct;
            if (!PatchProxy.isSupport(new Object[]{watermarkStruct2}, this, changeQuickRedirect, false, 49403, new Class[]{WatermarkStruct.class}, Integer.TYPE)) {
                return UrlModel.ADAPTER.encodedSizeWithTag(1, watermarkStruct2.resource_url) + ProtoAdapter.STRING.encodedSizeWithTag(2, watermarkStruct2.md5) + ProtoAdapter.STRING.encodedSizeWithTag(3, watermarkStruct2.fps) + ProtoAdapter.STRING.encodedSizeWithTag(4, watermarkStruct2.end_watermark_string) + ProtoAdapter.STRING.encodedSizeWithTag(5, watermarkStruct2.end_watermark_substring) + watermarkStruct.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{watermarkStruct2}, this, changeQuickRedirect, false, 49403, new Class[]{WatermarkStruct.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, WatermarkStruct watermarkStruct) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            WatermarkStruct watermarkStruct2 = watermarkStruct;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, watermarkStruct2}, this, changeQuickRedirect, false, 49404, new Class[]{ProtoWriter.class, WatermarkStruct.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, watermarkStruct2}, this, changeQuickRedirect, false, 49404, new Class[]{ProtoWriter.class, WatermarkStruct.class}, Void.TYPE);
                return;
            }
            UrlModel.ADAPTER.encodeWithTag(protoWriter2, 1, watermarkStruct2.resource_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, watermarkStruct2.md5);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, watermarkStruct2.fps);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, watermarkStruct2.end_watermark_string);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 5, watermarkStruct2.end_watermark_substring);
            protoWriter2.writeBytes(watermarkStruct.unknownFields());
        }

        public final WatermarkStruct decode(ProtoReader protoReader, WatermarkStruct watermarkStruct) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            WatermarkStruct watermarkStruct2 = watermarkStruct;
            if (PatchProxy.isSupport(new Object[]{protoReader2, watermarkStruct2}, this, changeQuickRedirect, false, 49406, new Class[]{ProtoReader.class, WatermarkStruct.class}, WatermarkStruct.class)) {
                return (WatermarkStruct) PatchProxy.accessDispatch(new Object[]{protoReader2, watermarkStruct2}, this, changeQuickRedirect, false, 49406, new Class[]{ProtoReader.class, WatermarkStruct.class}, WatermarkStruct.class);
            }
            WatermarkStruct watermarkStruct3 = (WatermarkStruct) a.a().a(WatermarkStruct.class, watermarkStruct2);
            if (watermarkStruct3 != null) {
                builder = watermarkStruct3.newBuilder();
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
                            builder2.resource_url((UrlModel) UrlModel.ADAPTER.decode(protoReader2, builder2.resource_url));
                            break;
                        case 2:
                            builder2.md5((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder2.fps((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 4:
                            builder2.end_watermark_string((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 5:
                            builder2.end_watermark_substring((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (watermarkStruct3 != null) {
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
    public final String getEndWatermarkString() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49396, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49396, new Class[0], String.class);
        } else if (this.end_watermark_string != null) {
            return this.end_watermark_string;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getEndWatermarkSubstring() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49397, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49397, new Class[0], String.class);
        } else if (this.end_watermark_substring != null) {
            return this.end_watermark_substring;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getFps() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49395, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49395, new Class[0], String.class);
        } else if (this.fps != null) {
            return this.fps;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getMd5() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49394, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49394, new Class[0], String.class);
        } else if (this.md5 != null) {
            return this.md5;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final UrlModel getResourceUrl() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49393, new Class[0], UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49393, new Class[0], UrlModel.class);
        } else if (this.resource_url != null) {
            return this.resource_url;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49398, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49398, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.resource_url = this.resource_url;
        builder.md5 = this.md5;
        builder.fps = this.fps;
        builder.end_watermark_string = this.end_watermark_string;
        builder.end_watermark_substring = this.end_watermark_substring;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49400, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49400, new Class[0], Integer.TYPE)).intValue();
        }
        int i6 = this.hashCode;
        if (i6 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.resource_url != null) {
                i = this.resource_url.hashCode();
            } else {
                i = 0;
            }
            int i7 = (hashCode + i) * 37;
            if (this.md5 != null) {
                i2 = this.md5.hashCode();
            } else {
                i2 = 0;
            }
            int i8 = (i7 + i2) * 37;
            if (this.fps != null) {
                i3 = this.fps.hashCode();
            } else {
                i3 = 0;
            }
            int i9 = (i8 + i3) * 37;
            if (this.end_watermark_string != null) {
                i4 = this.end_watermark_string.hashCode();
            } else {
                i4 = 0;
            }
            int i10 = (i9 + i4) * 37;
            if (this.end_watermark_substring != null) {
                i5 = this.end_watermark_substring.hashCode();
            }
            i6 = i10 + i5;
            this.hashCode = i6;
        }
        return i6;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49401, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49401, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.resource_url != null) {
            sb.append(", resource_url=");
            sb.append(this.resource_url);
        }
        if (this.md5 != null) {
            sb.append(", md5=");
            sb.append(this.md5);
        }
        if (this.fps != null) {
            sb.append(", fps=");
            sb.append(this.fps);
        }
        if (this.end_watermark_string != null) {
            sb.append(", end_watermark_string=");
            sb.append(this.end_watermark_string);
        }
        if (this.end_watermark_substring != null) {
            sb.append(", end_watermark_substring=");
            sb.append(this.end_watermark_substring);
        }
        StringBuilder replace = sb.replace(0, 2, "WatermarkStruct{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49399, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49399, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof WatermarkStruct)) {
                return false;
            }
            WatermarkStruct watermarkStruct = (WatermarkStruct) obj;
            if (!unknownFields().equals(watermarkStruct.unknownFields()) || !Internal.equals(this.resource_url, watermarkStruct.resource_url) || !Internal.equals(this.md5, watermarkStruct.md5) || !Internal.equals(this.fps, watermarkStruct.fps) || !Internal.equals(this.end_watermark_string, watermarkStruct.end_watermark_string) || !Internal.equals(this.end_watermark_substring, watermarkStruct.end_watermark_substring)) {
                return false;
            }
            return true;
        }
    }

    public WatermarkStruct(UrlModel urlModel, String str, String str2, String str3, String str4) {
        this(urlModel, str, str2, str3, str4, ByteString.EMPTY);
    }

    public WatermarkStruct(UrlModel urlModel, String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource_url = urlModel;
        this.md5 = str;
        this.fps = str2;
        this.end_watermark_string = str3;
        this.end_watermark_substring = str4;
    }
}
