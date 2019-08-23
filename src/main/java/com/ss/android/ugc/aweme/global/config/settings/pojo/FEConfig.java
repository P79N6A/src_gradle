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

public final class FEConfig extends Message<FEConfig, Builder> {
    public static final DefaultValueProtoAdapter<FEConfig> ADAPTER = new ProtoAdapter_FEConfig();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String fallback_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String schema;

    public static final class Builder extends Message.Builder<FEConfig, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String fallback_url;
        public String schema;

        public final FEConfig build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47869, new Class[0], FEConfig.class)) {
                return new FEConfig(this.fallback_url, this.schema, super.buildUnknownFields());
            }
            return (FEConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47869, new Class[0], FEConfig.class);
        }

        public final Builder fallback_url(String str) {
            this.fallback_url = str;
            return this;
        }

        public final Builder schema(String str) {
            this.schema = str;
            return this;
        }
    }

    static final class ProtoAdapter_FEConfig extends DefaultValueProtoAdapter<FEConfig> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final FEConfig redact(FEConfig fEConfig) {
            return fEConfig;
        }

        public ProtoAdapter_FEConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, FEConfig.class);
        }

        public final FEConfig decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47872, new Class[]{ProtoReader.class}, FEConfig.class)) {
                return decode(protoReader2, (FEConfig) null);
            }
            return (FEConfig) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47872, new Class[]{ProtoReader.class}, FEConfig.class);
        }

        public final int encodedSize(FEConfig fEConfig) {
            FEConfig fEConfig2 = fEConfig;
            if (!PatchProxy.isSupport(new Object[]{fEConfig2}, this, changeQuickRedirect, false, 47870, new Class[]{FEConfig.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, fEConfig2.fallback_url) + ProtoAdapter.STRING.encodedSizeWithTag(2, fEConfig2.schema) + fEConfig.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{fEConfig2}, this, changeQuickRedirect, false, 47870, new Class[]{FEConfig.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, FEConfig fEConfig) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            FEConfig fEConfig2 = fEConfig;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, fEConfig2}, this, changeQuickRedirect, false, 47871, new Class[]{ProtoWriter.class, FEConfig.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, fEConfig2}, this, changeQuickRedirect, false, 47871, new Class[]{ProtoWriter.class, FEConfig.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, fEConfig2.fallback_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, fEConfig2.schema);
            protoWriter2.writeBytes(fEConfig.unknownFields());
        }

        public final FEConfig decode(ProtoReader protoReader, FEConfig fEConfig) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            FEConfig fEConfig2 = fEConfig;
            if (PatchProxy.isSupport(new Object[]{protoReader2, fEConfig2}, this, changeQuickRedirect, false, 47873, new Class[]{ProtoReader.class, FEConfig.class}, FEConfig.class)) {
                return (FEConfig) PatchProxy.accessDispatch(new Object[]{protoReader2, fEConfig2}, this, changeQuickRedirect, false, 47873, new Class[]{ProtoReader.class, FEConfig.class}, FEConfig.class);
            }
            FEConfig fEConfig3 = (FEConfig) a.a().a(FEConfig.class, fEConfig2);
            if (fEConfig3 != null) {
                builder = fEConfig3.newBuilder();
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
                            builder2.fallback_url((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            builder2.schema((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (fEConfig3 != null) {
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
    public final String getFallbackUrl() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47863, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47863, new Class[0], String.class);
        } else if (this.fallback_url != null) {
            return this.fallback_url;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getSchema() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47864, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47864, new Class[0], String.class);
        } else if (this.schema != null) {
            return this.schema;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47865, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47865, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.fallback_url = this.fallback_url;
        builder.schema = this.schema;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47867, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47867, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.fallback_url != null) {
                i = this.fallback_url.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.schema != null) {
                i2 = this.schema.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47868, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47868, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.fallback_url != null) {
            sb.append(", fallback_url=");
            sb.append(this.fallback_url);
        }
        if (this.schema != null) {
            sb.append(", schema=");
            sb.append(this.schema);
        }
        StringBuilder replace = sb.replace(0, 2, "FEConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47866, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47866, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof FEConfig)) {
                return false;
            }
            FEConfig fEConfig = (FEConfig) obj;
            if (!unknownFields().equals(fEConfig.unknownFields()) || !Internal.equals(this.fallback_url, fEConfig.fallback_url) || !Internal.equals(this.schema, fEConfig.schema)) {
                return false;
            }
            return true;
        }
    }

    public FEConfig(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public FEConfig(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.fallback_url = str;
        this.schema = str2;
    }
}
