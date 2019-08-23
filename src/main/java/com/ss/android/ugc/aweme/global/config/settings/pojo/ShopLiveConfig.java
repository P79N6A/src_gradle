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

public final class ShopLiveConfig extends Message<ShopLiveConfig, Builder> {
    public static final DefaultValueProtoAdapter<ShopLiveConfig> ADAPTER = new ProtoAdapter_ShopLiveConfig();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String merch_picker_url;

    public static final class Builder extends Message.Builder<ShopLiveConfig, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String merch_picker_url;

        public final ShopLiveConfig build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49072, new Class[0], ShopLiveConfig.class)) {
                return new ShopLiveConfig(this.merch_picker_url, super.buildUnknownFields());
            }
            return (ShopLiveConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49072, new Class[0], ShopLiveConfig.class);
        }

        public final Builder merch_picker_url(String str) {
            this.merch_picker_url = str;
            return this;
        }
    }

    static final class ProtoAdapter_ShopLiveConfig extends DefaultValueProtoAdapter<ShopLiveConfig> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final ShopLiveConfig redact(ShopLiveConfig shopLiveConfig) {
            return shopLiveConfig;
        }

        public ProtoAdapter_ShopLiveConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, ShopLiveConfig.class);
        }

        public final ShopLiveConfig decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49075, new Class[]{ProtoReader.class}, ShopLiveConfig.class)) {
                return decode(protoReader2, (ShopLiveConfig) null);
            }
            return (ShopLiveConfig) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49075, new Class[]{ProtoReader.class}, ShopLiveConfig.class);
        }

        public final int encodedSize(ShopLiveConfig shopLiveConfig) {
            ShopLiveConfig shopLiveConfig2 = shopLiveConfig;
            if (!PatchProxy.isSupport(new Object[]{shopLiveConfig2}, this, changeQuickRedirect, false, 49073, new Class[]{ShopLiveConfig.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, shopLiveConfig2.merch_picker_url) + shopLiveConfig.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{shopLiveConfig2}, this, changeQuickRedirect, false, 49073, new Class[]{ShopLiveConfig.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, ShopLiveConfig shopLiveConfig) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            ShopLiveConfig shopLiveConfig2 = shopLiveConfig;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, shopLiveConfig2}, this, changeQuickRedirect, false, 49074, new Class[]{ProtoWriter.class, ShopLiveConfig.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, shopLiveConfig2}, this, changeQuickRedirect, false, 49074, new Class[]{ProtoWriter.class, ShopLiveConfig.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, shopLiveConfig2.merch_picker_url);
            protoWriter2.writeBytes(shopLiveConfig.unknownFields());
        }

        public final ShopLiveConfig decode(ProtoReader protoReader, ShopLiveConfig shopLiveConfig) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            ShopLiveConfig shopLiveConfig2 = shopLiveConfig;
            if (PatchProxy.isSupport(new Object[]{protoReader2, shopLiveConfig2}, this, changeQuickRedirect, false, 49076, new Class[]{ProtoReader.class, ShopLiveConfig.class}, ShopLiveConfig.class)) {
                return (ShopLiveConfig) PatchProxy.accessDispatch(new Object[]{protoReader2, shopLiveConfig2}, this, changeQuickRedirect, false, 49076, new Class[]{ProtoReader.class, ShopLiveConfig.class}, ShopLiveConfig.class);
            }
            ShopLiveConfig shopLiveConfig3 = (ShopLiveConfig) a.a().a(ShopLiveConfig.class, shopLiveConfig2);
            if (shopLiveConfig3 != null) {
                builder = shopLiveConfig3.newBuilder();
            } else {
                builder = new Builder();
            }
            Builder builder2 = builder;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader2.endMessage(beginMessage);
                    return builder2.build();
                } else if (nextTag != 1) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                    } catch (b e2) {
                        if (shopLiveConfig3 == null) {
                            throw e2;
                        }
                    }
                } else {
                    builder2.merch_picker_url((String) ProtoAdapter.STRING.decode(protoReader2));
                }
            }
        }
    }

    @KtNullable
    public final String getMerchPickerUrl() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49067, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49067, new Class[0], String.class);
        } else if (this.merch_picker_url != null) {
            return this.merch_picker_url;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49068, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49068, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.merch_picker_url = this.merch_picker_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49070, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49070, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.merch_picker_url != null) {
                i = this.merch_picker_url.hashCode();
            }
            i2 = hashCode + i;
            this.hashCode = i2;
        }
        return i2;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49071, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49071, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.merch_picker_url != null) {
            sb.append(", merch_picker_url=");
            sb.append(this.merch_picker_url);
        }
        StringBuilder replace = sb.replace(0, 2, "ShopLiveConfig{");
        replace.append('}');
        return replace.toString();
    }

    public ShopLiveConfig(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49069, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49069, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof ShopLiveConfig)) {
                return false;
            }
            ShopLiveConfig shopLiveConfig = (ShopLiveConfig) obj;
            if (!unknownFields().equals(shopLiveConfig.unknownFields()) || !Internal.equals(this.merch_picker_url, shopLiveConfig.merch_picker_url)) {
                return false;
            }
            return true;
        }
    }

    public ShopLiveConfig(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.merch_picker_url = str;
    }
}
