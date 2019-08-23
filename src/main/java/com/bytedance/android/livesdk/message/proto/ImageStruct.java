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
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ImageStruct extends Message<ImageStruct, Builder> {
    public static final ProtoAdapter<ImageStruct> ADAPTER = new ProtoAdapter_ImageStruct();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String uri;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 1)
    public final List<String> url_list;

    public static final class Builder extends Message.Builder<ImageStruct, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String uri;
        public List<String> url_list = Internal.newMutableList();

        public final ImageStruct build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11582, new Class[0], ImageStruct.class)) {
                return new ImageStruct(this.url_list, this.uri, super.buildUnknownFields());
            }
            return (ImageStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11582, new Class[0], ImageStruct.class);
        }

        public final Builder uri(String str) {
            this.uri = str;
            return this;
        }

        public final Builder url_list(List<String> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 11581, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 11581, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.url_list = list;
            return this;
        }
    }

    static final class ProtoAdapter_ImageStruct extends ProtoAdapter<ImageStruct> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_ImageStruct() {
            super(FieldEncoding.LENGTH_DELIMITED, ImageStruct.class);
        }

        public final int encodedSize(ImageStruct imageStruct) {
            ImageStruct imageStruct2 = imageStruct;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{imageStruct2}, this, changeQuickRedirect, false, 11583, new Class[]{ImageStruct.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{imageStruct2}, this, changeQuickRedirect, false, 11583, new Class[]{ImageStruct.class}, Integer.TYPE)).intValue();
            }
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, imageStruct2.url_list);
            if (imageStruct2.uri != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, imageStruct2.uri);
            }
            return encodedSizeWithTag + i + imageStruct.unknownFields().size();
        }

        public final ImageStruct redact(ImageStruct imageStruct) {
            if (PatchProxy.isSupport(new Object[]{imageStruct}, this, changeQuickRedirect, false, 11586, new Class[]{ImageStruct.class}, ImageStruct.class)) {
                return (ImageStruct) PatchProxy.accessDispatch(new Object[]{imageStruct}, this, changeQuickRedirect, false, 11586, new Class[]{ImageStruct.class}, ImageStruct.class);
            }
            Builder newBuilder = imageStruct.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final ImageStruct decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11585, new Class[]{ProtoReader.class}, ImageStruct.class)) {
                return (ImageStruct) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11585, new Class[]{ProtoReader.class}, ImageStruct.class);
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

        public final void encode(ProtoWriter protoWriter, ImageStruct imageStruct) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            ImageStruct imageStruct2 = imageStruct;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, imageStruct2}, this, changeQuickRedirect, false, 11584, new Class[]{ProtoWriter.class, ImageStruct.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, imageStruct2}, this, changeQuickRedirect, false, 11584, new Class[]{ProtoWriter.class, ImageStruct.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter2, 1, imageStruct2.url_list);
            if (imageStruct2.uri != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, imageStruct2.uri);
            }
            protoWriter2.writeBytes(imageStruct.unknownFields());
        }
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11579, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11579, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = ((unknownFields().hashCode() * 37) + this.url_list.hashCode()) * 37;
            if (this.uri != null) {
                i = this.uri.hashCode();
            }
            i2 = hashCode + i;
            this.hashCode = i2;
        }
        return i2;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11577, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11577, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.url_list = Internal.copyOf("url_list", this.url_list);
        builder.uri = this.uri;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11580, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11580, new Class[0], String.class);
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
        StringBuilder replace = sb.replace(0, 2, "ImageStruct{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11578, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11578, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof ImageStruct)) {
                return false;
            }
            ImageStruct imageStruct = (ImageStruct) obj;
            if (!unknownFields().equals(imageStruct.unknownFields()) || !this.url_list.equals(imageStruct.url_list) || !Internal.equals(this.uri, imageStruct.uri)) {
                return false;
            }
            return true;
        }
    }

    public ImageStruct(List<String> list, String str) {
        this(list, str, ByteString.EMPTY);
    }

    public ImageStruct(List<String> list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.url_list = Internal.immutableCopyOf("url_list", list);
        this.uri = str;
    }
}
