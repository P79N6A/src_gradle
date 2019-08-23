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

public final class Seeding extends Message<Seeding, Builder> {
    public static final DefaultValueProtoAdapter<Seeding> ADAPTER = new ProtoAdapter_Seeding();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String shop_wish_list_url;

    public static final class Builder extends Message.Builder<Seeding, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String shop_wish_list_url;

        public final Seeding build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49052, new Class[0], Seeding.class)) {
                return new Seeding(this.shop_wish_list_url, super.buildUnknownFields());
            }
            return (Seeding) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49052, new Class[0], Seeding.class);
        }

        public final Builder shop_wish_list_url(String str) {
            this.shop_wish_list_url = str;
            return this;
        }
    }

    static final class ProtoAdapter_Seeding extends DefaultValueProtoAdapter<Seeding> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final Seeding redact(Seeding seeding) {
            return seeding;
        }

        public ProtoAdapter_Seeding() {
            super(FieldEncoding.LENGTH_DELIMITED, Seeding.class);
        }

        public final Seeding decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49055, new Class[]{ProtoReader.class}, Seeding.class)) {
                return decode(protoReader2, (Seeding) null);
            }
            return (Seeding) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49055, new Class[]{ProtoReader.class}, Seeding.class);
        }

        public final int encodedSize(Seeding seeding) {
            Seeding seeding2 = seeding;
            if (!PatchProxy.isSupport(new Object[]{seeding2}, this, changeQuickRedirect, false, 49053, new Class[]{Seeding.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, seeding2.shop_wish_list_url) + seeding.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{seeding2}, this, changeQuickRedirect, false, 49053, new Class[]{Seeding.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, Seeding seeding) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            Seeding seeding2 = seeding;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, seeding2}, this, changeQuickRedirect, false, 49054, new Class[]{ProtoWriter.class, Seeding.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, seeding2}, this, changeQuickRedirect, false, 49054, new Class[]{ProtoWriter.class, Seeding.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, seeding2.shop_wish_list_url);
            protoWriter2.writeBytes(seeding.unknownFields());
        }

        public final Seeding decode(ProtoReader protoReader, Seeding seeding) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            Seeding seeding2 = seeding;
            if (PatchProxy.isSupport(new Object[]{protoReader2, seeding2}, this, changeQuickRedirect, false, 49056, new Class[]{ProtoReader.class, Seeding.class}, Seeding.class)) {
                return (Seeding) PatchProxy.accessDispatch(new Object[]{protoReader2, seeding2}, this, changeQuickRedirect, false, 49056, new Class[]{ProtoReader.class, Seeding.class}, Seeding.class);
            }
            Seeding seeding3 = (Seeding) a.a().a(Seeding.class, seeding2);
            if (seeding3 != null) {
                builder = seeding3.newBuilder();
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
                        if (seeding3 == null) {
                            throw e2;
                        }
                    }
                } else {
                    builder2.shop_wish_list_url((String) ProtoAdapter.STRING.decode(protoReader2));
                }
            }
        }
    }

    @KtNullable
    public final String getShopWishListUrl() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49047, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49047, new Class[0], String.class);
        } else if (this.shop_wish_list_url != null) {
            return this.shop_wish_list_url;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49048, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49048, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.shop_wish_list_url = this.shop_wish_list_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49050, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49050, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.shop_wish_list_url != null) {
                i = this.shop_wish_list_url.hashCode();
            }
            i2 = hashCode + i;
            this.hashCode = i2;
        }
        return i2;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49051, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49051, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.shop_wish_list_url != null) {
            sb.append(", shop_wish_list_url=");
            sb.append(this.shop_wish_list_url);
        }
        StringBuilder replace = sb.replace(0, 2, "Seeding{");
        replace.append('}');
        return replace.toString();
    }

    public Seeding(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49049, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49049, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof Seeding)) {
                return false;
            }
            Seeding seeding = (Seeding) obj;
            if (!unknownFields().equals(seeding.unknownFields()) || !Internal.equals(this.shop_wish_list_url, seeding.shop_wish_list_url)) {
                return false;
            }
            return true;
        }
    }

    public Seeding(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.shop_wish_list_url = str;
    }
}
