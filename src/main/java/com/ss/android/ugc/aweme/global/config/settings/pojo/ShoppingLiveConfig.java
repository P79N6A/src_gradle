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

public final class ShoppingLiveConfig extends Message<ShoppingLiveConfig, Builder> {
    public static final DefaultValueProtoAdapter<ShoppingLiveConfig> ADAPTER = new ProtoAdapter_ShoppingLiveConfig();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean compatible_with_old_version;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer disable_taobao;

    public static final class Builder extends Message.Builder<ShoppingLiveConfig, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Boolean compatible_with_old_version;
        public Integer disable_taobao;

        public final ShoppingLiveConfig build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49102, new Class[0], ShoppingLiveConfig.class)) {
                return new ShoppingLiveConfig(this.compatible_with_old_version, this.disable_taobao, super.buildUnknownFields());
            }
            return (ShoppingLiveConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49102, new Class[0], ShoppingLiveConfig.class);
        }

        public final Builder compatible_with_old_version(Boolean bool) {
            this.compatible_with_old_version = bool;
            return this;
        }

        public final Builder disable_taobao(Integer num) {
            this.disable_taobao = num;
            return this;
        }
    }

    static final class ProtoAdapter_ShoppingLiveConfig extends DefaultValueProtoAdapter<ShoppingLiveConfig> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final ShoppingLiveConfig redact(ShoppingLiveConfig shoppingLiveConfig) {
            return shoppingLiveConfig;
        }

        public ProtoAdapter_ShoppingLiveConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, ShoppingLiveConfig.class);
        }

        public final ShoppingLiveConfig decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49105, new Class[]{ProtoReader.class}, ShoppingLiveConfig.class)) {
                return decode(protoReader2, (ShoppingLiveConfig) null);
            }
            return (ShoppingLiveConfig) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49105, new Class[]{ProtoReader.class}, ShoppingLiveConfig.class);
        }

        public final int encodedSize(ShoppingLiveConfig shoppingLiveConfig) {
            ShoppingLiveConfig shoppingLiveConfig2 = shoppingLiveConfig;
            if (!PatchProxy.isSupport(new Object[]{shoppingLiveConfig2}, this, changeQuickRedirect, false, 49103, new Class[]{ShoppingLiveConfig.class}, Integer.TYPE)) {
                return ProtoAdapter.BOOL.encodedSizeWithTag(1, shoppingLiveConfig2.compatible_with_old_version) + ProtoAdapter.INT32.encodedSizeWithTag(2, shoppingLiveConfig2.disable_taobao) + shoppingLiveConfig.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{shoppingLiveConfig2}, this, changeQuickRedirect, false, 49103, new Class[]{ShoppingLiveConfig.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, ShoppingLiveConfig shoppingLiveConfig) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            ShoppingLiveConfig shoppingLiveConfig2 = shoppingLiveConfig;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, shoppingLiveConfig2}, this, changeQuickRedirect, false, 49104, new Class[]{ProtoWriter.class, ShoppingLiveConfig.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, shoppingLiveConfig2}, this, changeQuickRedirect, false, 49104, new Class[]{ProtoWriter.class, ShoppingLiveConfig.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1, shoppingLiveConfig2.compatible_with_old_version);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, shoppingLiveConfig2.disable_taobao);
            protoWriter2.writeBytes(shoppingLiveConfig.unknownFields());
        }

        public final ShoppingLiveConfig decode(ProtoReader protoReader, ShoppingLiveConfig shoppingLiveConfig) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            ShoppingLiveConfig shoppingLiveConfig2 = shoppingLiveConfig;
            if (PatchProxy.isSupport(new Object[]{protoReader2, shoppingLiveConfig2}, this, changeQuickRedirect, false, 49106, new Class[]{ProtoReader.class, ShoppingLiveConfig.class}, ShoppingLiveConfig.class)) {
                return (ShoppingLiveConfig) PatchProxy.accessDispatch(new Object[]{protoReader2, shoppingLiveConfig2}, this, changeQuickRedirect, false, 49106, new Class[]{ProtoReader.class, ShoppingLiveConfig.class}, ShoppingLiveConfig.class);
            }
            ShoppingLiveConfig shoppingLiveConfig3 = (ShoppingLiveConfig) a.a().a(ShoppingLiveConfig.class, shoppingLiveConfig2);
            if (shoppingLiveConfig3 != null) {
                builder = shoppingLiveConfig3.newBuilder();
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
                            builder2.compatible_with_old_version((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 2:
                            builder2.disable_taobao((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (shoppingLiveConfig3 != null) {
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
    public final Boolean getCompatibleWithOldVersion() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49096, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49096, new Class[0], Boolean.class);
        } else if (this.compatible_with_old_version != null) {
            return this.compatible_with_old_version;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getDisableTaobao() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49097, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49097, new Class[0], Integer.class);
        } else if (this.disable_taobao != null) {
            return this.disable_taobao;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49098, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49098, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.compatible_with_old_version = this.compatible_with_old_version;
        builder.disable_taobao = this.disable_taobao;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49100, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49100, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.compatible_with_old_version != null) {
                i = this.compatible_with_old_version.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.disable_taobao != null) {
                i2 = this.disable_taobao.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49101, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49101, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.compatible_with_old_version != null) {
            sb.append(", compatible_with_old_version=");
            sb.append(this.compatible_with_old_version);
        }
        if (this.disable_taobao != null) {
            sb.append(", disable_taobao=");
            sb.append(this.disable_taobao);
        }
        StringBuilder replace = sb.replace(0, 2, "ShoppingLiveConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49099, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49099, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof ShoppingLiveConfig)) {
                return false;
            }
            ShoppingLiveConfig shoppingLiveConfig = (ShoppingLiveConfig) obj;
            if (!unknownFields().equals(shoppingLiveConfig.unknownFields()) || !Internal.equals(this.compatible_with_old_version, shoppingLiveConfig.compatible_with_old_version) || !Internal.equals(this.disable_taobao, shoppingLiveConfig.disable_taobao)) {
                return false;
            }
            return true;
        }
    }

    public ShoppingLiveConfig(Boolean bool, Integer num) {
        this(bool, num, ByteString.EMPTY);
    }

    public ShoppingLiveConfig(Boolean bool, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.compatible_with_old_version = bool;
        this.disable_taobao = num;
    }
}
