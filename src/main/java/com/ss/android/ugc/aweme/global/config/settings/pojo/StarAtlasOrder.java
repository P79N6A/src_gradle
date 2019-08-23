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

public final class StarAtlasOrder extends Message<StarAtlasOrder, Builder> {
    public static final DefaultValueProtoAdapter<StarAtlasOrder> ADAPTER = new ProtoAdapter_StarAtlasOrder();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String publish;

    public static final class Builder extends Message.Builder<StarAtlasOrder, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String publish;

        public final StarAtlasOrder build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49150, new Class[0], StarAtlasOrder.class)) {
                return new StarAtlasOrder(this.publish, super.buildUnknownFields());
            }
            return (StarAtlasOrder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49150, new Class[0], StarAtlasOrder.class);
        }

        public final Builder publish(String str) {
            this.publish = str;
            return this;
        }
    }

    static final class ProtoAdapter_StarAtlasOrder extends DefaultValueProtoAdapter<StarAtlasOrder> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final StarAtlasOrder redact(StarAtlasOrder starAtlasOrder) {
            return starAtlasOrder;
        }

        public ProtoAdapter_StarAtlasOrder() {
            super(FieldEncoding.LENGTH_DELIMITED, StarAtlasOrder.class);
        }

        public final StarAtlasOrder decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49153, new Class[]{ProtoReader.class}, StarAtlasOrder.class)) {
                return decode(protoReader2, (StarAtlasOrder) null);
            }
            return (StarAtlasOrder) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49153, new Class[]{ProtoReader.class}, StarAtlasOrder.class);
        }

        public final int encodedSize(StarAtlasOrder starAtlasOrder) {
            StarAtlasOrder starAtlasOrder2 = starAtlasOrder;
            if (!PatchProxy.isSupport(new Object[]{starAtlasOrder2}, this, changeQuickRedirect, false, 49151, new Class[]{StarAtlasOrder.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, starAtlasOrder2.publish) + starAtlasOrder.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{starAtlasOrder2}, this, changeQuickRedirect, false, 49151, new Class[]{StarAtlasOrder.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, StarAtlasOrder starAtlasOrder) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            StarAtlasOrder starAtlasOrder2 = starAtlasOrder;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, starAtlasOrder2}, this, changeQuickRedirect, false, 49152, new Class[]{ProtoWriter.class, StarAtlasOrder.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, starAtlasOrder2}, this, changeQuickRedirect, false, 49152, new Class[]{ProtoWriter.class, StarAtlasOrder.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, starAtlasOrder2.publish);
            protoWriter2.writeBytes(starAtlasOrder.unknownFields());
        }

        public final StarAtlasOrder decode(ProtoReader protoReader, StarAtlasOrder starAtlasOrder) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            StarAtlasOrder starAtlasOrder2 = starAtlasOrder;
            if (PatchProxy.isSupport(new Object[]{protoReader2, starAtlasOrder2}, this, changeQuickRedirect, false, 49154, new Class[]{ProtoReader.class, StarAtlasOrder.class}, StarAtlasOrder.class)) {
                return (StarAtlasOrder) PatchProxy.accessDispatch(new Object[]{protoReader2, starAtlasOrder2}, this, changeQuickRedirect, false, 49154, new Class[]{ProtoReader.class, StarAtlasOrder.class}, StarAtlasOrder.class);
            }
            StarAtlasOrder starAtlasOrder3 = (StarAtlasOrder) a.a().a(StarAtlasOrder.class, starAtlasOrder2);
            if (starAtlasOrder3 != null) {
                builder = starAtlasOrder3.newBuilder();
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
                        if (starAtlasOrder3 == null) {
                            throw e2;
                        }
                    }
                } else {
                    builder2.publish((String) ProtoAdapter.STRING.decode(protoReader2));
                }
            }
        }
    }

    @KtNullable
    public final String getPublish() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49145, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49145, new Class[0], String.class);
        } else if (this.publish != null) {
            return this.publish;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49146, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49146, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.publish = this.publish;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49148, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49148, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.publish != null) {
                i = this.publish.hashCode();
            }
            i2 = hashCode + i;
            this.hashCode = i2;
        }
        return i2;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49149, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49149, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.publish != null) {
            sb.append(", publish=");
            sb.append(this.publish);
        }
        StringBuilder replace = sb.replace(0, 2, "StarAtlasOrder{");
        replace.append('}');
        return replace.toString();
    }

    public StarAtlasOrder(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49147, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49147, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof StarAtlasOrder)) {
                return false;
            }
            StarAtlasOrder starAtlasOrder = (StarAtlasOrder) obj;
            if (!unknownFields().equals(starAtlasOrder.unknownFields()) || !Internal.equals(this.publish, starAtlasOrder.publish)) {
                return false;
            }
            return true;
        }
    }

    public StarAtlasOrder(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.publish = str;
    }
}
