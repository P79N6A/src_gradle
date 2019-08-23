package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.KtNullable;
import com.bytedance.ies.c.a;
import com.bytedance.ies.c.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PublishSyncDuoshanAllConfig extends Message<PublishSyncDuoshanAllConfig, Builder> {
    public static final DefaultValueProtoAdapter<PublishSyncDuoshanAllConfig> ADAPTER = new ProtoAdapter_PublishSyncDuoshanAllConfig();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.PublishSyncDuoshanConfig#ADAPTER", tag = 1)
    public final PublishSyncDuoshanConfig register_duoshan;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.PublishSyncDuoshanConfig#ADAPTER", tag = 2)
    public final PublishSyncDuoshanConfig ungister_duoshan;

    public static final class Builder extends Message.Builder<PublishSyncDuoshanAllConfig, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public PublishSyncDuoshanConfig register_duoshan;
        public PublishSyncDuoshanConfig ungister_duoshan;

        public final PublishSyncDuoshanAllConfig build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49018, new Class[0], PublishSyncDuoshanAllConfig.class)) {
                return new PublishSyncDuoshanAllConfig(this.register_duoshan, this.ungister_duoshan, super.buildUnknownFields());
            }
            return (PublishSyncDuoshanAllConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49018, new Class[0], PublishSyncDuoshanAllConfig.class);
        }

        public final Builder register_duoshan(PublishSyncDuoshanConfig publishSyncDuoshanConfig) {
            this.register_duoshan = publishSyncDuoshanConfig;
            return this;
        }

        public final Builder ungister_duoshan(PublishSyncDuoshanConfig publishSyncDuoshanConfig) {
            this.ungister_duoshan = publishSyncDuoshanConfig;
            return this;
        }
    }

    static final class ProtoAdapter_PublishSyncDuoshanAllConfig extends DefaultValueProtoAdapter<PublishSyncDuoshanAllConfig> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final PublishSyncDuoshanAllConfig redact(PublishSyncDuoshanAllConfig publishSyncDuoshanAllConfig) {
            return publishSyncDuoshanAllConfig;
        }

        public ProtoAdapter_PublishSyncDuoshanAllConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, PublishSyncDuoshanAllConfig.class);
        }

        public final PublishSyncDuoshanAllConfig decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49021, new Class[]{ProtoReader.class}, PublishSyncDuoshanAllConfig.class)) {
                return decode(protoReader2, (PublishSyncDuoshanAllConfig) null);
            }
            return (PublishSyncDuoshanAllConfig) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49021, new Class[]{ProtoReader.class}, PublishSyncDuoshanAllConfig.class);
        }

        public final int encodedSize(PublishSyncDuoshanAllConfig publishSyncDuoshanAllConfig) {
            PublishSyncDuoshanAllConfig publishSyncDuoshanAllConfig2 = publishSyncDuoshanAllConfig;
            if (!PatchProxy.isSupport(new Object[]{publishSyncDuoshanAllConfig2}, this, changeQuickRedirect, false, 49019, new Class[]{PublishSyncDuoshanAllConfig.class}, Integer.TYPE)) {
                return PublishSyncDuoshanConfig.ADAPTER.encodedSizeWithTag(1, publishSyncDuoshanAllConfig2.register_duoshan) + PublishSyncDuoshanConfig.ADAPTER.encodedSizeWithTag(2, publishSyncDuoshanAllConfig2.ungister_duoshan) + publishSyncDuoshanAllConfig.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{publishSyncDuoshanAllConfig2}, this, changeQuickRedirect, false, 49019, new Class[]{PublishSyncDuoshanAllConfig.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, PublishSyncDuoshanAllConfig publishSyncDuoshanAllConfig) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            PublishSyncDuoshanAllConfig publishSyncDuoshanAllConfig2 = publishSyncDuoshanAllConfig;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, publishSyncDuoshanAllConfig2}, this, changeQuickRedirect, false, 49020, new Class[]{ProtoWriter.class, PublishSyncDuoshanAllConfig.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, publishSyncDuoshanAllConfig2}, this, changeQuickRedirect, false, 49020, new Class[]{ProtoWriter.class, PublishSyncDuoshanAllConfig.class}, Void.TYPE);
                return;
            }
            PublishSyncDuoshanConfig.ADAPTER.encodeWithTag(protoWriter2, 1, publishSyncDuoshanAllConfig2.register_duoshan);
            PublishSyncDuoshanConfig.ADAPTER.encodeWithTag(protoWriter2, 2, publishSyncDuoshanAllConfig2.ungister_duoshan);
            protoWriter2.writeBytes(publishSyncDuoshanAllConfig.unknownFields());
        }

        public final PublishSyncDuoshanAllConfig decode(ProtoReader protoReader, PublishSyncDuoshanAllConfig publishSyncDuoshanAllConfig) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            PublishSyncDuoshanAllConfig publishSyncDuoshanAllConfig2 = publishSyncDuoshanAllConfig;
            if (PatchProxy.isSupport(new Object[]{protoReader2, publishSyncDuoshanAllConfig2}, this, changeQuickRedirect, false, 49022, new Class[]{ProtoReader.class, PublishSyncDuoshanAllConfig.class}, PublishSyncDuoshanAllConfig.class)) {
                return (PublishSyncDuoshanAllConfig) PatchProxy.accessDispatch(new Object[]{protoReader2, publishSyncDuoshanAllConfig2}, this, changeQuickRedirect, false, 49022, new Class[]{ProtoReader.class, PublishSyncDuoshanAllConfig.class}, PublishSyncDuoshanAllConfig.class);
            }
            PublishSyncDuoshanAllConfig publishSyncDuoshanAllConfig3 = (PublishSyncDuoshanAllConfig) a.a().a(PublishSyncDuoshanAllConfig.class, publishSyncDuoshanAllConfig2);
            if (publishSyncDuoshanAllConfig3 != null) {
                builder = publishSyncDuoshanAllConfig3.newBuilder();
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
                            builder2.register_duoshan((PublishSyncDuoshanConfig) PublishSyncDuoshanConfig.ADAPTER.decode(protoReader2, builder2.register_duoshan));
                            break;
                        case 2:
                            builder2.ungister_duoshan((PublishSyncDuoshanConfig) PublishSyncDuoshanConfig.ADAPTER.decode(protoReader2, builder2.ungister_duoshan));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (publishSyncDuoshanAllConfig3 != null) {
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
    public final PublishSyncDuoshanConfig getRegisterDuoshan() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49012, new Class[0], PublishSyncDuoshanConfig.class)) {
            return (PublishSyncDuoshanConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49012, new Class[0], PublishSyncDuoshanConfig.class);
        } else if (this.register_duoshan != null) {
            return this.register_duoshan;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final PublishSyncDuoshanConfig getUngisterDuoshan() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49013, new Class[0], PublishSyncDuoshanConfig.class)) {
            return (PublishSyncDuoshanConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49013, new Class[0], PublishSyncDuoshanConfig.class);
        } else if (this.ungister_duoshan != null) {
            return this.ungister_duoshan;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49014, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49014, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.register_duoshan = this.register_duoshan;
        builder.ungister_duoshan = this.ungister_duoshan;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49016, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49016, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.register_duoshan != null) {
                i = this.register_duoshan.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.ungister_duoshan != null) {
                i2 = this.ungister_duoshan.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49017, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49017, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.register_duoshan != null) {
            sb.append(", register_duoshan=");
            sb.append(this.register_duoshan);
        }
        if (this.ungister_duoshan != null) {
            sb.append(", ungister_duoshan=");
            sb.append(this.ungister_duoshan);
        }
        StringBuilder replace = sb.replace(0, 2, "PublishSyncDuoshanAllConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49015, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49015, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof PublishSyncDuoshanAllConfig)) {
                return false;
            }
            PublishSyncDuoshanAllConfig publishSyncDuoshanAllConfig = (PublishSyncDuoshanAllConfig) obj;
            if (!unknownFields().equals(publishSyncDuoshanAllConfig.unknownFields()) || !Internal.equals(this.register_duoshan, publishSyncDuoshanAllConfig.register_duoshan) || !Internal.equals(this.ungister_duoshan, publishSyncDuoshanAllConfig.ungister_duoshan)) {
                return false;
            }
            return true;
        }
    }

    public PublishSyncDuoshanAllConfig(PublishSyncDuoshanConfig publishSyncDuoshanConfig, PublishSyncDuoshanConfig publishSyncDuoshanConfig2) {
        this(publishSyncDuoshanConfig, publishSyncDuoshanConfig2, ByteString.EMPTY);
    }

    public PublishSyncDuoshanAllConfig(PublishSyncDuoshanConfig publishSyncDuoshanConfig, PublishSyncDuoshanConfig publishSyncDuoshanConfig2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.register_duoshan = publishSyncDuoshanConfig;
        this.ungister_duoshan = publishSyncDuoshanConfig2;
    }
}
