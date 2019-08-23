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
import okio.ByteString;

public final class DiggIcon extends Message<DiggIcon, Builder> {
    public static final ProtoAdapter<DiggIcon> ADAPTER = new ProtoAdapter_DiggIcon();
    public static final Long DEFAULT_ID = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long id;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 2)
    public final Image normal_icon_url;

    public static final class Builder extends Message.Builder<DiggIcon, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Long id;
        public Image normal_icon_url;

        public final DiggIcon build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11324, new Class[0], DiggIcon.class)) {
                return new DiggIcon(this.id, this.normal_icon_url, super.buildUnknownFields());
            }
            return (DiggIcon) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11324, new Class[0], DiggIcon.class);
        }

        public final Builder id(Long l) {
            this.id = l;
            return this;
        }

        public final Builder normal_icon_url(Image image) {
            this.normal_icon_url = image;
            return this;
        }
    }

    static final class ProtoAdapter_DiggIcon extends ProtoAdapter<DiggIcon> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_DiggIcon() {
            super(FieldEncoding.LENGTH_DELIMITED, DiggIcon.class);
        }

        public final int encodedSize(DiggIcon diggIcon) {
            int i;
            DiggIcon diggIcon2 = diggIcon;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{diggIcon2}, this, changeQuickRedirect, false, 11325, new Class[]{DiggIcon.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{diggIcon2}, this, changeQuickRedirect, false, 11325, new Class[]{DiggIcon.class}, Integer.TYPE)).intValue();
            }
            if (diggIcon2.id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, diggIcon2.id);
            } else {
                i = 0;
            }
            if (diggIcon2.normal_icon_url != null) {
                i2 = Image.ADAPTER.encodedSizeWithTag(2, diggIcon2.normal_icon_url);
            }
            return i + i2 + diggIcon.unknownFields().size();
        }

        public final DiggIcon redact(DiggIcon diggIcon) {
            if (PatchProxy.isSupport(new Object[]{diggIcon}, this, changeQuickRedirect, false, 11328, new Class[]{DiggIcon.class}, DiggIcon.class)) {
                return (DiggIcon) PatchProxy.accessDispatch(new Object[]{diggIcon}, this, changeQuickRedirect, false, 11328, new Class[]{DiggIcon.class}, DiggIcon.class);
            }
            Builder newBuilder = diggIcon.newBuilder();
            if (newBuilder.normal_icon_url != null) {
                newBuilder.normal_icon_url = (Image) Image.ADAPTER.redact(newBuilder.normal_icon_url);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final DiggIcon decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11327, new Class[]{ProtoReader.class}, DiggIcon.class)) {
                return (DiggIcon) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11327, new Class[]{ProtoReader.class}, DiggIcon.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 2:
                            builder.normal_icon_url((Image) Image.ADAPTER.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, DiggIcon diggIcon) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            DiggIcon diggIcon2 = diggIcon;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, diggIcon2}, this, changeQuickRedirect, false, 11326, new Class[]{ProtoWriter.class, DiggIcon.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, diggIcon2}, this, changeQuickRedirect, false, 11326, new Class[]{ProtoWriter.class, DiggIcon.class}, Void.TYPE);
                return;
            }
            if (diggIcon2.id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, diggIcon2.id);
            }
            if (diggIcon2.normal_icon_url != null) {
                Image.ADAPTER.encodeWithTag(protoWriter2, 2, diggIcon2.normal_icon_url);
            }
            protoWriter2.writeBytes(diggIcon.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11320, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11320, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.id = this.id;
        builder.normal_icon_url = this.normal_icon_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11322, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11322, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.id != null) {
                i = this.id.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.normal_icon_url != null) {
                i2 = this.normal_icon_url.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11323, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11323, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.normal_icon_url != null) {
            sb.append(", normal_icon_url=");
            sb.append(this.normal_icon_url);
        }
        StringBuilder replace = sb.replace(0, 2, "DiggIcon{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11321, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11321, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof DiggIcon)) {
                return false;
            }
            DiggIcon diggIcon = (DiggIcon) obj;
            if (!unknownFields().equals(diggIcon.unknownFields()) || !Internal.equals(this.id, diggIcon.id) || !Internal.equals(this.normal_icon_url, diggIcon.normal_icon_url)) {
                return false;
            }
            return true;
        }
    }

    public DiggIcon(Long l, Image image) {
        this(l, image, ByteString.EMPTY);
    }

    public DiggIcon(Long l, Image image, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = l;
        this.normal_icon_url = image;
    }
}
