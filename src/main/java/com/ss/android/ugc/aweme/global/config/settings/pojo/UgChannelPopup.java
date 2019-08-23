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
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.io.IOException;
import okio.ByteString;

public final class UgChannelPopup extends Message<UgChannelPopup, Builder> {
    public static final DefaultValueProtoAdapter<UgChannelPopup> ADAPTER = new ProtoAdapter_UgChannelPopup();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String button_text;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String campaign_name;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String content;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String h5_link;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String link_schema;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel#ADAPTER", tag = 1)
    public final UrlModel resource_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String title;

    public static final class Builder extends Message.Builder<UgChannelPopup, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String button_text;
        public String campaign_name;
        public String content;
        public String h5_link;
        public String link_schema;
        public UrlModel resource_url;
        public String title;

        public final UgChannelPopup build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49259, new Class[0], UgChannelPopup.class)) {
                return (UgChannelPopup) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49259, new Class[0], UgChannelPopup.class);
            }
            UgChannelPopup ugChannelPopup = new UgChannelPopup(this.resource_url, this.title, this.content, this.button_text, this.h5_link, this.link_schema, this.campaign_name, super.buildUnknownFields());
            return ugChannelPopup;
        }

        public final Builder button_text(String str) {
            this.button_text = str;
            return this;
        }

        public final Builder campaign_name(String str) {
            this.campaign_name = str;
            return this;
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder h5_link(String str) {
            this.h5_link = str;
            return this;
        }

        public final Builder link_schema(String str) {
            this.link_schema = str;
            return this;
        }

        public final Builder resource_url(UrlModel urlModel) {
            this.resource_url = urlModel;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }
    }

    static final class ProtoAdapter_UgChannelPopup extends DefaultValueProtoAdapter<UgChannelPopup> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final UgChannelPopup redact(UgChannelPopup ugChannelPopup) {
            return ugChannelPopup;
        }

        public ProtoAdapter_UgChannelPopup() {
            super(FieldEncoding.LENGTH_DELIMITED, UgChannelPopup.class);
        }

        public final UgChannelPopup decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49262, new Class[]{ProtoReader.class}, UgChannelPopup.class)) {
                return decode(protoReader2, (UgChannelPopup) null);
            }
            return (UgChannelPopup) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49262, new Class[]{ProtoReader.class}, UgChannelPopup.class);
        }

        public final int encodedSize(UgChannelPopup ugChannelPopup) {
            UgChannelPopup ugChannelPopup2 = ugChannelPopup;
            if (!PatchProxy.isSupport(new Object[]{ugChannelPopup2}, this, changeQuickRedirect, false, 49260, new Class[]{UgChannelPopup.class}, Integer.TYPE)) {
                return UrlModel.ADAPTER.encodedSizeWithTag(1, ugChannelPopup2.resource_url) + ProtoAdapter.STRING.encodedSizeWithTag(2, ugChannelPopup2.title) + ProtoAdapter.STRING.encodedSizeWithTag(3, ugChannelPopup2.content) + ProtoAdapter.STRING.encodedSizeWithTag(4, ugChannelPopup2.button_text) + ProtoAdapter.STRING.encodedSizeWithTag(5, ugChannelPopup2.h5_link) + ProtoAdapter.STRING.encodedSizeWithTag(7, ugChannelPopup2.link_schema) + ProtoAdapter.STRING.encodedSizeWithTag(8, ugChannelPopup2.campaign_name) + ugChannelPopup.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{ugChannelPopup2}, this, changeQuickRedirect, false, 49260, new Class[]{UgChannelPopup.class}, Integer.TYPE)).intValue();
        }

        public final UgChannelPopup decode(ProtoReader protoReader, UgChannelPopup ugChannelPopup) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            UgChannelPopup ugChannelPopup2 = ugChannelPopup;
            if (PatchProxy.isSupport(new Object[]{protoReader2, ugChannelPopup2}, this, changeQuickRedirect, false, 49263, new Class[]{ProtoReader.class, UgChannelPopup.class}, UgChannelPopup.class)) {
                return (UgChannelPopup) PatchProxy.accessDispatch(new Object[]{protoReader2, ugChannelPopup2}, this, changeQuickRedirect, false, 49263, new Class[]{ProtoReader.class, UgChannelPopup.class}, UgChannelPopup.class);
            }
            UgChannelPopup ugChannelPopup3 = (UgChannelPopup) a.a().a(UgChannelPopup.class, ugChannelPopup2);
            if (ugChannelPopup3 != null) {
                builder = ugChannelPopup3.newBuilder();
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
                            builder2.title((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder2.content((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 4:
                            builder2.button_text((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 5:
                            builder2.h5_link((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case e.l:
                            builder2.link_schema((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 8:
                            builder2.campaign_name((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (ugChannelPopup3 != null) {
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

        public final void encode(ProtoWriter protoWriter, UgChannelPopup ugChannelPopup) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            UgChannelPopup ugChannelPopup2 = ugChannelPopup;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, ugChannelPopup2}, this, changeQuickRedirect, false, 49261, new Class[]{ProtoWriter.class, UgChannelPopup.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, ugChannelPopup2}, this, changeQuickRedirect, false, 49261, new Class[]{ProtoWriter.class, UgChannelPopup.class}, Void.TYPE);
                return;
            }
            UrlModel.ADAPTER.encodeWithTag(protoWriter2, 1, ugChannelPopup2.resource_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, ugChannelPopup2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, ugChannelPopup2.content);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, ugChannelPopup2.button_text);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 5, ugChannelPopup2.h5_link);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 7, ugChannelPopup2.link_schema);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 8, ugChannelPopup2.campaign_name);
            protoWriter2.writeBytes(ugChannelPopup.unknownFields());
        }
    }

    @KtNullable
    public final String getButtonText() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49251, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49251, new Class[0], String.class);
        } else if (this.button_text != null) {
            return this.button_text;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getCampaignName() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49254, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49254, new Class[0], String.class);
        } else if (this.campaign_name != null) {
            return this.campaign_name;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getContent() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49250, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49250, new Class[0], String.class);
        } else if (this.content != null) {
            return this.content;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getH5Link() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49252, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49252, new Class[0], String.class);
        } else if (this.h5_link != null) {
            return this.h5_link;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getLinkSchema() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49253, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49253, new Class[0], String.class);
        } else if (this.link_schema != null) {
            return this.link_schema;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final UrlModel getResourceUrl() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49248, new Class[0], UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49248, new Class[0], UrlModel.class);
        } else if (this.resource_url != null) {
            return this.resource_url;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getTitle() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49249, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49249, new Class[0], String.class);
        } else if (this.title != null) {
            return this.title;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49255, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49255, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.resource_url = this.resource_url;
        builder.title = this.title;
        builder.content = this.content;
        builder.button_text = this.button_text;
        builder.h5_link = this.h5_link;
        builder.link_schema = this.link_schema;
        builder.campaign_name = this.campaign_name;
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
        int i7 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49257, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49257, new Class[0], Integer.TYPE)).intValue();
        }
        int i8 = this.hashCode;
        if (i8 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.resource_url != null) {
                i = this.resource_url.hashCode();
            } else {
                i = 0;
            }
            int i9 = (hashCode + i) * 37;
            if (this.title != null) {
                i2 = this.title.hashCode();
            } else {
                i2 = 0;
            }
            int i10 = (i9 + i2) * 37;
            if (this.content != null) {
                i3 = this.content.hashCode();
            } else {
                i3 = 0;
            }
            int i11 = (i10 + i3) * 37;
            if (this.button_text != null) {
                i4 = this.button_text.hashCode();
            } else {
                i4 = 0;
            }
            int i12 = (i11 + i4) * 37;
            if (this.h5_link != null) {
                i5 = this.h5_link.hashCode();
            } else {
                i5 = 0;
            }
            int i13 = (i12 + i5) * 37;
            if (this.link_schema != null) {
                i6 = this.link_schema.hashCode();
            } else {
                i6 = 0;
            }
            int i14 = (i13 + i6) * 37;
            if (this.campaign_name != null) {
                i7 = this.campaign_name.hashCode();
            }
            i8 = i14 + i7;
            this.hashCode = i8;
        }
        return i8;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49258, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49258, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.resource_url != null) {
            sb.append(", resource_url=");
            sb.append(this.resource_url);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.button_text != null) {
            sb.append(", button_text=");
            sb.append(this.button_text);
        }
        if (this.h5_link != null) {
            sb.append(", h5_link=");
            sb.append(this.h5_link);
        }
        if (this.link_schema != null) {
            sb.append(", link_schema=");
            sb.append(this.link_schema);
        }
        if (this.campaign_name != null) {
            sb.append(", campaign_name=");
            sb.append(this.campaign_name);
        }
        StringBuilder replace = sb.replace(0, 2, "UgChannelPopup{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49256, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49256, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof UgChannelPopup)) {
                return false;
            }
            UgChannelPopup ugChannelPopup = (UgChannelPopup) obj;
            if (!unknownFields().equals(ugChannelPopup.unknownFields()) || !Internal.equals(this.resource_url, ugChannelPopup.resource_url) || !Internal.equals(this.title, ugChannelPopup.title) || !Internal.equals(this.content, ugChannelPopup.content) || !Internal.equals(this.button_text, ugChannelPopup.button_text) || !Internal.equals(this.h5_link, ugChannelPopup.h5_link) || !Internal.equals(this.link_schema, ugChannelPopup.link_schema) || !Internal.equals(this.campaign_name, ugChannelPopup.campaign_name)) {
                return false;
            }
            return true;
        }
    }

    public UgChannelPopup(UrlModel urlModel, String str, String str2, String str3, String str4, String str5, String str6) {
        this(urlModel, str, str2, str3, str4, str5, str6, ByteString.EMPTY);
    }

    public UgChannelPopup(UrlModel urlModel, String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource_url = urlModel;
        this.title = str;
        this.content = str2;
        this.button_text = str3;
        this.h5_link = str4;
        this.link_schema = str5;
        this.campaign_name = str6;
    }
}
