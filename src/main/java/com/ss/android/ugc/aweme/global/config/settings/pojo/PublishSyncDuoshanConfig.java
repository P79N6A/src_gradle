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

public final class PublishSyncDuoshanConfig extends Message<PublishSyncDuoshanConfig, Builder> {
    public static final DefaultValueProtoAdapter<PublishSyncDuoshanConfig> ADAPTER = new ProtoAdapter_PublishSyncDuoshanConfig();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String content;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String h5_str;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String h5_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String title;

    public static final class Builder extends Message.Builder<PublishSyncDuoshanConfig, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String content;
        public String h5_str;
        public String h5_url;
        public String title;

        public final PublishSyncDuoshanConfig build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49031, new Class[0], PublishSyncDuoshanConfig.class)) {
                return (PublishSyncDuoshanConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49031, new Class[0], PublishSyncDuoshanConfig.class);
            }
            PublishSyncDuoshanConfig publishSyncDuoshanConfig = new PublishSyncDuoshanConfig(this.title, this.content, this.h5_str, this.h5_url, super.buildUnknownFields());
            return publishSyncDuoshanConfig;
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder h5_str(String str) {
            this.h5_str = str;
            return this;
        }

        public final Builder h5_url(String str) {
            this.h5_url = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }
    }

    static final class ProtoAdapter_PublishSyncDuoshanConfig extends DefaultValueProtoAdapter<PublishSyncDuoshanConfig> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final PublishSyncDuoshanConfig redact(PublishSyncDuoshanConfig publishSyncDuoshanConfig) {
            return publishSyncDuoshanConfig;
        }

        public ProtoAdapter_PublishSyncDuoshanConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, PublishSyncDuoshanConfig.class);
        }

        public final PublishSyncDuoshanConfig decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49034, new Class[]{ProtoReader.class}, PublishSyncDuoshanConfig.class)) {
                return decode(protoReader2, (PublishSyncDuoshanConfig) null);
            }
            return (PublishSyncDuoshanConfig) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49034, new Class[]{ProtoReader.class}, PublishSyncDuoshanConfig.class);
        }

        public final int encodedSize(PublishSyncDuoshanConfig publishSyncDuoshanConfig) {
            PublishSyncDuoshanConfig publishSyncDuoshanConfig2 = publishSyncDuoshanConfig;
            if (!PatchProxy.isSupport(new Object[]{publishSyncDuoshanConfig2}, this, changeQuickRedirect, false, 49032, new Class[]{PublishSyncDuoshanConfig.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, publishSyncDuoshanConfig2.title) + ProtoAdapter.STRING.encodedSizeWithTag(2, publishSyncDuoshanConfig2.content) + ProtoAdapter.STRING.encodedSizeWithTag(3, publishSyncDuoshanConfig2.h5_str) + ProtoAdapter.STRING.encodedSizeWithTag(4, publishSyncDuoshanConfig2.h5_url) + publishSyncDuoshanConfig.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{publishSyncDuoshanConfig2}, this, changeQuickRedirect, false, 49032, new Class[]{PublishSyncDuoshanConfig.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, PublishSyncDuoshanConfig publishSyncDuoshanConfig) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            PublishSyncDuoshanConfig publishSyncDuoshanConfig2 = publishSyncDuoshanConfig;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, publishSyncDuoshanConfig2}, this, changeQuickRedirect, false, 49033, new Class[]{ProtoWriter.class, PublishSyncDuoshanConfig.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, publishSyncDuoshanConfig2}, this, changeQuickRedirect, false, 49033, new Class[]{ProtoWriter.class, PublishSyncDuoshanConfig.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, publishSyncDuoshanConfig2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, publishSyncDuoshanConfig2.content);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, publishSyncDuoshanConfig2.h5_str);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, publishSyncDuoshanConfig2.h5_url);
            protoWriter2.writeBytes(publishSyncDuoshanConfig.unknownFields());
        }

        public final PublishSyncDuoshanConfig decode(ProtoReader protoReader, PublishSyncDuoshanConfig publishSyncDuoshanConfig) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            PublishSyncDuoshanConfig publishSyncDuoshanConfig2 = publishSyncDuoshanConfig;
            if (PatchProxy.isSupport(new Object[]{protoReader2, publishSyncDuoshanConfig2}, this, changeQuickRedirect, false, 49035, new Class[]{ProtoReader.class, PublishSyncDuoshanConfig.class}, PublishSyncDuoshanConfig.class)) {
                return (PublishSyncDuoshanConfig) PatchProxy.accessDispatch(new Object[]{protoReader2, publishSyncDuoshanConfig2}, this, changeQuickRedirect, false, 49035, new Class[]{ProtoReader.class, PublishSyncDuoshanConfig.class}, PublishSyncDuoshanConfig.class);
            }
            PublishSyncDuoshanConfig publishSyncDuoshanConfig3 = (PublishSyncDuoshanConfig) a.a().a(PublishSyncDuoshanConfig.class, publishSyncDuoshanConfig2);
            if (publishSyncDuoshanConfig3 != null) {
                builder = publishSyncDuoshanConfig3.newBuilder();
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
                            builder2.title((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            builder2.content((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder2.h5_str((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 4:
                            builder2.h5_url((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (publishSyncDuoshanConfig3 != null) {
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
    public final String getContent() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49024, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49024, new Class[0], String.class);
        } else if (this.content != null) {
            return this.content;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getH5Str() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49025, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49025, new Class[0], String.class);
        } else if (this.h5_str != null) {
            return this.h5_str;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getH5Url() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49026, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49026, new Class[0], String.class);
        } else if (this.h5_url != null) {
            return this.h5_url;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getTitle() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49023, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49023, new Class[0], String.class);
        } else if (this.title != null) {
            return this.title;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49029, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49029, new Class[0], Integer.TYPE)).intValue();
        }
        int i5 = this.hashCode;
        if (i5 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.title != null) {
                i = this.title.hashCode();
            } else {
                i = 0;
            }
            int i6 = (hashCode + i) * 37;
            if (this.content != null) {
                i2 = this.content.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 37;
            if (this.h5_str != null) {
                i3 = this.h5_str.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 37;
            if (this.h5_url != null) {
                i4 = this.h5_url.hashCode();
            }
            i5 = i8 + i4;
            this.hashCode = i5;
        }
        return i5;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49027, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49027, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.title = this.title;
        builder.content = this.content;
        builder.h5_str = this.h5_str;
        builder.h5_url = this.h5_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49030, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49030, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.h5_str != null) {
            sb.append(", h5_str=");
            sb.append(this.h5_str);
        }
        if (this.h5_url != null) {
            sb.append(", h5_url=");
            sb.append(this.h5_url);
        }
        StringBuilder replace = sb.replace(0, 2, "PublishSyncDuoshanConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49028, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49028, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof PublishSyncDuoshanConfig)) {
                return false;
            }
            PublishSyncDuoshanConfig publishSyncDuoshanConfig = (PublishSyncDuoshanConfig) obj;
            if (!unknownFields().equals(publishSyncDuoshanConfig.unknownFields()) || !Internal.equals(this.title, publishSyncDuoshanConfig.title) || !Internal.equals(this.content, publishSyncDuoshanConfig.content) || !Internal.equals(this.h5_str, publishSyncDuoshanConfig.h5_str) || !Internal.equals(this.h5_url, publishSyncDuoshanConfig.h5_url)) {
                return false;
            }
            return true;
        }
    }

    public PublishSyncDuoshanConfig(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, ByteString.EMPTY);
    }

    public PublishSyncDuoshanConfig(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = str;
        this.content = str2;
        this.h5_str = str3;
        this.h5_url = str4;
    }
}
