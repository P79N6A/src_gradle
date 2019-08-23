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

public final class ShoppingNewbieHelp extends Message<ShoppingNewbieHelp, Builder> {
    public static final DefaultValueProtoAdapter<ShoppingNewbieHelp> ADAPTER = new ProtoAdapter_ShoppingNewbieHelp();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String shop_url;

    public static final class Builder extends Message.Builder<ShoppingNewbieHelp, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String shop_url;

        public final ShoppingNewbieHelp build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49112, new Class[0], ShoppingNewbieHelp.class)) {
                return new ShoppingNewbieHelp(this.shop_url, super.buildUnknownFields());
            }
            return (ShoppingNewbieHelp) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49112, new Class[0], ShoppingNewbieHelp.class);
        }

        public final Builder shop_url(String str) {
            this.shop_url = str;
            return this;
        }
    }

    static final class ProtoAdapter_ShoppingNewbieHelp extends DefaultValueProtoAdapter<ShoppingNewbieHelp> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final ShoppingNewbieHelp redact(ShoppingNewbieHelp shoppingNewbieHelp) {
            return shoppingNewbieHelp;
        }

        public ProtoAdapter_ShoppingNewbieHelp() {
            super(FieldEncoding.LENGTH_DELIMITED, ShoppingNewbieHelp.class);
        }

        public final ShoppingNewbieHelp decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49115, new Class[]{ProtoReader.class}, ShoppingNewbieHelp.class)) {
                return decode(protoReader2, (ShoppingNewbieHelp) null);
            }
            return (ShoppingNewbieHelp) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49115, new Class[]{ProtoReader.class}, ShoppingNewbieHelp.class);
        }

        public final int encodedSize(ShoppingNewbieHelp shoppingNewbieHelp) {
            ShoppingNewbieHelp shoppingNewbieHelp2 = shoppingNewbieHelp;
            if (!PatchProxy.isSupport(new Object[]{shoppingNewbieHelp2}, this, changeQuickRedirect, false, 49113, new Class[]{ShoppingNewbieHelp.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, shoppingNewbieHelp2.shop_url) + shoppingNewbieHelp.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{shoppingNewbieHelp2}, this, changeQuickRedirect, false, 49113, new Class[]{ShoppingNewbieHelp.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, ShoppingNewbieHelp shoppingNewbieHelp) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            ShoppingNewbieHelp shoppingNewbieHelp2 = shoppingNewbieHelp;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, shoppingNewbieHelp2}, this, changeQuickRedirect, false, 49114, new Class[]{ProtoWriter.class, ShoppingNewbieHelp.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, shoppingNewbieHelp2}, this, changeQuickRedirect, false, 49114, new Class[]{ProtoWriter.class, ShoppingNewbieHelp.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, shoppingNewbieHelp2.shop_url);
            protoWriter2.writeBytes(shoppingNewbieHelp.unknownFields());
        }

        public final ShoppingNewbieHelp decode(ProtoReader protoReader, ShoppingNewbieHelp shoppingNewbieHelp) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            ShoppingNewbieHelp shoppingNewbieHelp2 = shoppingNewbieHelp;
            if (PatchProxy.isSupport(new Object[]{protoReader2, shoppingNewbieHelp2}, this, changeQuickRedirect, false, 49116, new Class[]{ProtoReader.class, ShoppingNewbieHelp.class}, ShoppingNewbieHelp.class)) {
                return (ShoppingNewbieHelp) PatchProxy.accessDispatch(new Object[]{protoReader2, shoppingNewbieHelp2}, this, changeQuickRedirect, false, 49116, new Class[]{ProtoReader.class, ShoppingNewbieHelp.class}, ShoppingNewbieHelp.class);
            }
            ShoppingNewbieHelp shoppingNewbieHelp3 = (ShoppingNewbieHelp) a.a().a(ShoppingNewbieHelp.class, shoppingNewbieHelp2);
            if (shoppingNewbieHelp3 != null) {
                builder = shoppingNewbieHelp3.newBuilder();
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
                        if (shoppingNewbieHelp3 == null) {
                            throw e2;
                        }
                    }
                } else {
                    builder2.shop_url((String) ProtoAdapter.STRING.decode(protoReader2));
                }
            }
        }
    }

    @KtNullable
    public final String getShopUrl() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49107, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49107, new Class[0], String.class);
        } else if (this.shop_url != null) {
            return this.shop_url;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49108, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49108, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.shop_url = this.shop_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49110, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49110, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.shop_url != null) {
                i = this.shop_url.hashCode();
            }
            i2 = hashCode + i;
            this.hashCode = i2;
        }
        return i2;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49111, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49111, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.shop_url != null) {
            sb.append(", shop_url=");
            sb.append(this.shop_url);
        }
        StringBuilder replace = sb.replace(0, 2, "ShoppingNewbieHelp{");
        replace.append('}');
        return replace.toString();
    }

    public ShoppingNewbieHelp(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49109, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49109, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof ShoppingNewbieHelp)) {
                return false;
            }
            ShoppingNewbieHelp shoppingNewbieHelp = (ShoppingNewbieHelp) obj;
            if (!unknownFields().equals(shoppingNewbieHelp.unknownFields()) || !Internal.equals(this.shop_url, shoppingNewbieHelp.shop_url)) {
                return false;
            }
            return true;
        }
    }

    public ShoppingNewbieHelp(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.shop_url = str;
    }
}
