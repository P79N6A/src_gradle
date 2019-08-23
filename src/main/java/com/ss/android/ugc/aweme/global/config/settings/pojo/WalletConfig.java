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

public final class WalletConfig extends Message<WalletConfig, Builder> {
    public static final DefaultValueProtoAdapter<WalletConfig> ADAPTER = new ProtoAdapter_WalletConfig();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String page_charge_schema;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String page_index_schema;

    public static final class Builder extends Message.Builder<WalletConfig, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String page_charge_schema;
        public String page_index_schema;

        public final WalletConfig build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49388, new Class[0], WalletConfig.class)) {
                return new WalletConfig(this.page_charge_schema, this.page_index_schema, super.buildUnknownFields());
            }
            return (WalletConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49388, new Class[0], WalletConfig.class);
        }

        public final Builder page_charge_schema(String str) {
            this.page_charge_schema = str;
            return this;
        }

        public final Builder page_index_schema(String str) {
            this.page_index_schema = str;
            return this;
        }
    }

    static final class ProtoAdapter_WalletConfig extends DefaultValueProtoAdapter<WalletConfig> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final WalletConfig redact(WalletConfig walletConfig) {
            return walletConfig;
        }

        public ProtoAdapter_WalletConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, WalletConfig.class);
        }

        public final WalletConfig decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49391, new Class[]{ProtoReader.class}, WalletConfig.class)) {
                return decode(protoReader2, (WalletConfig) null);
            }
            return (WalletConfig) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49391, new Class[]{ProtoReader.class}, WalletConfig.class);
        }

        public final int encodedSize(WalletConfig walletConfig) {
            WalletConfig walletConfig2 = walletConfig;
            if (!PatchProxy.isSupport(new Object[]{walletConfig2}, this, changeQuickRedirect, false, 49389, new Class[]{WalletConfig.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, walletConfig2.page_charge_schema) + ProtoAdapter.STRING.encodedSizeWithTag(2, walletConfig2.page_index_schema) + walletConfig.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{walletConfig2}, this, changeQuickRedirect, false, 49389, new Class[]{WalletConfig.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, WalletConfig walletConfig) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            WalletConfig walletConfig2 = walletConfig;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, walletConfig2}, this, changeQuickRedirect, false, 49390, new Class[]{ProtoWriter.class, WalletConfig.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, walletConfig2}, this, changeQuickRedirect, false, 49390, new Class[]{ProtoWriter.class, WalletConfig.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, walletConfig2.page_charge_schema);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, walletConfig2.page_index_schema);
            protoWriter2.writeBytes(walletConfig.unknownFields());
        }

        public final WalletConfig decode(ProtoReader protoReader, WalletConfig walletConfig) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            WalletConfig walletConfig2 = walletConfig;
            if (PatchProxy.isSupport(new Object[]{protoReader2, walletConfig2}, this, changeQuickRedirect, false, 49392, new Class[]{ProtoReader.class, WalletConfig.class}, WalletConfig.class)) {
                return (WalletConfig) PatchProxy.accessDispatch(new Object[]{protoReader2, walletConfig2}, this, changeQuickRedirect, false, 49392, new Class[]{ProtoReader.class, WalletConfig.class}, WalletConfig.class);
            }
            WalletConfig walletConfig3 = (WalletConfig) a.a().a(WalletConfig.class, walletConfig2);
            if (walletConfig3 != null) {
                builder = walletConfig3.newBuilder();
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
                            builder2.page_charge_schema((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            builder2.page_index_schema((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (walletConfig3 != null) {
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
    public final String getPageChargeSchema() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49382, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49382, new Class[0], String.class);
        } else if (this.page_charge_schema != null) {
            return this.page_charge_schema;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getPageIndexSchema() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49383, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49383, new Class[0], String.class);
        } else if (this.page_index_schema != null) {
            return this.page_index_schema;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49384, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49384, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.page_charge_schema = this.page_charge_schema;
        builder.page_index_schema = this.page_index_schema;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49386, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49386, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.page_charge_schema != null) {
                i = this.page_charge_schema.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.page_index_schema != null) {
                i2 = this.page_index_schema.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49387, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49387, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.page_charge_schema != null) {
            sb.append(", page_charge_schema=");
            sb.append(this.page_charge_schema);
        }
        if (this.page_index_schema != null) {
            sb.append(", page_index_schema=");
            sb.append(this.page_index_schema);
        }
        StringBuilder replace = sb.replace(0, 2, "WalletConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49385, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49385, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof WalletConfig)) {
                return false;
            }
            WalletConfig walletConfig = (WalletConfig) obj;
            if (!unknownFields().equals(walletConfig.unknownFields()) || !Internal.equals(this.page_charge_schema, walletConfig.page_charge_schema) || !Internal.equals(this.page_index_schema, walletConfig.page_index_schema)) {
                return false;
            }
            return true;
        }
    }

    public WalletConfig(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public WalletConfig(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.page_charge_schema = str;
        this.page_index_schema = str2;
    }
}
