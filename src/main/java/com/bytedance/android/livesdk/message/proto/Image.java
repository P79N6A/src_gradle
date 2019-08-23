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
import java.util.List;
import okio.ByteString;

public final class Image extends Message<Image, Builder> {
    public static final ProtoAdapter<Image> ADAPTER = new ProtoAdapter_Image();
    public static final Long DEFAULT_HEIGHT = 0L;
    public static final Integer DEFAULT_IMAGE_TYPE = 0;
    public static final Long DEFAULT_WIDTH = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String avg_color;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long height;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public final Integer image_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String open_web_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String uri;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 1)
    public final List<String> url_list;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long width;

    public static final class Builder extends Message.Builder<Image, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String avg_color;
        public Long height;
        public Integer image_type;
        public String open_web_url;
        public String uri;
        public List<String> url_list = Internal.newMutableList();
        public Long width;

        public final Image build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11572, new Class[0], Image.class)) {
                return (Image) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11572, new Class[0], Image.class);
            }
            Image image = new Image(this.url_list, this.uri, this.height, this.width, this.avg_color, this.image_type, this.open_web_url, super.buildUnknownFields());
            return image;
        }

        public final Builder avg_color(String str) {
            this.avg_color = str;
            return this;
        }

        public final Builder height(Long l) {
            this.height = l;
            return this;
        }

        public final Builder image_type(Integer num) {
            this.image_type = num;
            return this;
        }

        public final Builder open_web_url(String str) {
            this.open_web_url = str;
            return this;
        }

        public final Builder uri(String str) {
            this.uri = str;
            return this;
        }

        public final Builder width(Long l) {
            this.width = l;
            return this;
        }

        public final Builder url_list(List<String> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 11571, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 11571, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.url_list = list;
            return this;
        }
    }

    static final class ProtoAdapter_Image extends ProtoAdapter<Image> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_Image() {
            super(FieldEncoding.LENGTH_DELIMITED, Image.class);
        }

        public final Image redact(Image image) {
            if (PatchProxy.isSupport(new Object[]{image}, this, changeQuickRedirect, false, 11576, new Class[]{Image.class}, Image.class)) {
                return (Image) PatchProxy.accessDispatch(new Object[]{image}, this, changeQuickRedirect, false, 11576, new Class[]{Image.class}, Image.class);
            }
            Builder newBuilder = image.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final Image decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11575, new Class[]{ProtoReader.class}, Image.class)) {
                return (Image) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11575, new Class[]{ProtoReader.class}, Image.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.url_list.add(ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            builder.uri((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder.height((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.width((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 5:
                            builder.avg_color((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 6:
                            builder.image_type((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case e.l /*7*/:
                            builder.open_web_url((String) ProtoAdapter.STRING.decode(protoReader2));
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

        public final int encodedSize(Image image) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            Image image2 = image;
            int i6 = 0;
            if (PatchProxy.isSupport(new Object[]{image2}, this, changeQuickRedirect, false, 11573, new Class[]{Image.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{image2}, this, changeQuickRedirect, false, 11573, new Class[]{Image.class}, Integer.TYPE)).intValue();
            }
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, image2.url_list);
            if (image2.uri != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, image2.uri);
            } else {
                i = 0;
            }
            int i7 = encodedSizeWithTag + i;
            if (image2.height != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, image2.height);
            } else {
                i2 = 0;
            }
            int i8 = i7 + i2;
            if (image2.width != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(4, image2.width);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (image2.avg_color != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, image2.avg_color);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (image2.image_type != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(6, image2.image_type);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (image2.open_web_url != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, image2.open_web_url);
            }
            return i11 + i6 + image.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, Image image) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            Image image2 = image;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, image2}, this, changeQuickRedirect, false, 11574, new Class[]{ProtoWriter.class, Image.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, image2}, this, changeQuickRedirect, false, 11574, new Class[]{ProtoWriter.class, Image.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter2, 1, image2.url_list);
            if (image2.uri != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, image2.uri);
            }
            if (image2.height != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, image2.height);
            }
            if (image2.width != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, image2.width);
            }
            if (image2.avg_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 5, image2.avg_color);
            }
            if (image2.image_type != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 6, image2.image_type);
            }
            if (image2.open_web_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 7, image2.open_web_url);
            }
            protoWriter2.writeBytes(image.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11567, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11567, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.url_list = Internal.copyOf("url_list", this.url_list);
        builder.uri = this.uri;
        builder.height = this.height;
        builder.width = this.width;
        builder.avg_color = this.avg_color;
        builder.image_type = this.image_type;
        builder.open_web_url = this.open_web_url;
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11569, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11569, new Class[0], Integer.TYPE)).intValue();
        }
        int i7 = this.hashCode;
        if (i7 == 0) {
            int hashCode = ((unknownFields().hashCode() * 37) + this.url_list.hashCode()) * 37;
            if (this.uri != null) {
                i = this.uri.hashCode();
            } else {
                i = 0;
            }
            int i8 = (hashCode + i) * 37;
            if (this.height != null) {
                i2 = this.height.hashCode();
            } else {
                i2 = 0;
            }
            int i9 = (i8 + i2) * 37;
            if (this.width != null) {
                i3 = this.width.hashCode();
            } else {
                i3 = 0;
            }
            int i10 = (i9 + i3) * 37;
            if (this.avg_color != null) {
                i4 = this.avg_color.hashCode();
            } else {
                i4 = 0;
            }
            int i11 = (i10 + i4) * 37;
            if (this.image_type != null) {
                i5 = this.image_type.hashCode();
            } else {
                i5 = 0;
            }
            int i12 = (i11 + i5) * 37;
            if (this.open_web_url != null) {
                i6 = this.open_web_url.hashCode();
            }
            i7 = i12 + i6;
            this.hashCode = i7;
        }
        return i7;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11570, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11570, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (!this.url_list.isEmpty()) {
            sb.append(", url_list=");
            sb.append(this.url_list);
        }
        if (this.uri != null) {
            sb.append(", uri=");
            sb.append(this.uri);
        }
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.avg_color != null) {
            sb.append(", avg_color=");
            sb.append(this.avg_color);
        }
        if (this.image_type != null) {
            sb.append(", image_type=");
            sb.append(this.image_type);
        }
        if (this.open_web_url != null) {
            sb.append(", open_web_url=");
            sb.append(this.open_web_url);
        }
        StringBuilder replace = sb.replace(0, 2, "Image{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11568, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11568, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof Image)) {
                return false;
            }
            Image image = (Image) obj;
            if (!unknownFields().equals(image.unknownFields()) || !this.url_list.equals(image.url_list) || !Internal.equals(this.uri, image.uri) || !Internal.equals(this.height, image.height) || !Internal.equals(this.width, image.width) || !Internal.equals(this.avg_color, image.avg_color) || !Internal.equals(this.image_type, image.image_type) || !Internal.equals(this.open_web_url, image.open_web_url)) {
                return false;
            }
            return true;
        }
    }

    public Image(List<String> list, String str, Long l, Long l2, String str2, Integer num, String str3) {
        this(list, str, l, l2, str2, num, str3, ByteString.EMPTY);
    }

    public Image(List<String> list, String str, Long l, Long l2, String str2, Integer num, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.url_list = Internal.immutableCopyOf("url_list", list);
        this.uri = str;
        this.height = l;
        this.width = l2;
        this.avg_color = str2;
        this.image_type = num;
        this.open_web_url = str3;
    }
}
