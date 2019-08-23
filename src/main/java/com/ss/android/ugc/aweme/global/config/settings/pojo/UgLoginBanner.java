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

public final class UgLoginBanner extends Message<UgLoginBanner, Builder> {
    public static final DefaultValueProtoAdapter<UgLoginBanner> ADAPTER = new ProtoAdapter_UgLoginBanner();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel#ADAPTER", tag = 1)
    public final UrlModel resource_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String text;

    public static final class Builder extends Message.Builder<UgLoginBanner, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public UrlModel resource_url;
        public String text;

        public final UgLoginBanner build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49270, new Class[0], UgLoginBanner.class)) {
                return new UgLoginBanner(this.resource_url, this.text, super.buildUnknownFields());
            }
            return (UgLoginBanner) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49270, new Class[0], UgLoginBanner.class);
        }

        public final Builder resource_url(UrlModel urlModel) {
            this.resource_url = urlModel;
            return this;
        }

        public final Builder text(String str) {
            this.text = str;
            return this;
        }
    }

    static final class ProtoAdapter_UgLoginBanner extends DefaultValueProtoAdapter<UgLoginBanner> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final UgLoginBanner redact(UgLoginBanner ugLoginBanner) {
            return ugLoginBanner;
        }

        public ProtoAdapter_UgLoginBanner() {
            super(FieldEncoding.LENGTH_DELIMITED, UgLoginBanner.class);
        }

        public final UgLoginBanner decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49273, new Class[]{ProtoReader.class}, UgLoginBanner.class)) {
                return decode(protoReader2, (UgLoginBanner) null);
            }
            return (UgLoginBanner) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49273, new Class[]{ProtoReader.class}, UgLoginBanner.class);
        }

        public final int encodedSize(UgLoginBanner ugLoginBanner) {
            UgLoginBanner ugLoginBanner2 = ugLoginBanner;
            if (!PatchProxy.isSupport(new Object[]{ugLoginBanner2}, this, changeQuickRedirect, false, 49271, new Class[]{UgLoginBanner.class}, Integer.TYPE)) {
                return UrlModel.ADAPTER.encodedSizeWithTag(1, ugLoginBanner2.resource_url) + ProtoAdapter.STRING.encodedSizeWithTag(2, ugLoginBanner2.text) + ugLoginBanner.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{ugLoginBanner2}, this, changeQuickRedirect, false, 49271, new Class[]{UgLoginBanner.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, UgLoginBanner ugLoginBanner) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            UgLoginBanner ugLoginBanner2 = ugLoginBanner;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, ugLoginBanner2}, this, changeQuickRedirect, false, 49272, new Class[]{ProtoWriter.class, UgLoginBanner.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, ugLoginBanner2}, this, changeQuickRedirect, false, 49272, new Class[]{ProtoWriter.class, UgLoginBanner.class}, Void.TYPE);
                return;
            }
            UrlModel.ADAPTER.encodeWithTag(protoWriter2, 1, ugLoginBanner2.resource_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, ugLoginBanner2.text);
            protoWriter2.writeBytes(ugLoginBanner.unknownFields());
        }

        public final UgLoginBanner decode(ProtoReader protoReader, UgLoginBanner ugLoginBanner) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            UgLoginBanner ugLoginBanner2 = ugLoginBanner;
            if (PatchProxy.isSupport(new Object[]{protoReader2, ugLoginBanner2}, this, changeQuickRedirect, false, 49274, new Class[]{ProtoReader.class, UgLoginBanner.class}, UgLoginBanner.class)) {
                return (UgLoginBanner) PatchProxy.accessDispatch(new Object[]{protoReader2, ugLoginBanner2}, this, changeQuickRedirect, false, 49274, new Class[]{ProtoReader.class, UgLoginBanner.class}, UgLoginBanner.class);
            }
            UgLoginBanner ugLoginBanner3 = (UgLoginBanner) a.a().a(UgLoginBanner.class, ugLoginBanner2);
            if (ugLoginBanner3 != null) {
                builder = ugLoginBanner3.newBuilder();
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
                            builder2.text((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (ugLoginBanner3 != null) {
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
    public final UrlModel getResourceUrl() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49264, new Class[0], UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49264, new Class[0], UrlModel.class);
        } else if (this.resource_url != null) {
            return this.resource_url;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getText() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49265, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49265, new Class[0], String.class);
        } else if (this.text != null) {
            return this.text;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49266, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49266, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.resource_url = this.resource_url;
        builder.text = this.text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49268, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49268, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.resource_url != null) {
                i = this.resource_url.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.text != null) {
                i2 = this.text.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49269, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49269, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.resource_url != null) {
            sb.append(", resource_url=");
            sb.append(this.resource_url);
        }
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        StringBuilder replace = sb.replace(0, 2, "UgLoginBanner{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49267, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49267, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof UgLoginBanner)) {
                return false;
            }
            UgLoginBanner ugLoginBanner = (UgLoginBanner) obj;
            if (!unknownFields().equals(ugLoginBanner.unknownFields()) || !Internal.equals(this.resource_url, ugLoginBanner.resource_url) || !Internal.equals(this.text, ugLoginBanner.text)) {
                return false;
            }
            return true;
        }
    }

    public UgLoginBanner(UrlModel urlModel, String str) {
        this(urlModel, str, ByteString.EMPTY);
    }

    public UgLoginBanner(UrlModel urlModel, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource_url = urlModel;
        this.text = str;
    }
}
