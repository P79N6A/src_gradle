package com.bytedance.android.livesdk.message.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CommerceSaleMessage extends Message<CommerceSaleMessage, Builder> {
    public static final ProtoAdapter<CommerceSaleMessage> ADAPTER = new ProtoAdapter_CommerceSaleMessage();
    public static final Boolean DEFAULT_HAS_COMMERCE_SALE = Boolean.FALSE;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean has_commerce_sale;

    public static final class Builder extends Message.Builder<CommerceSaleMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public Boolean has_commerce_sale;

        public final CommerceSaleMessage build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11241, new Class[0], CommerceSaleMessage.class)) {
                return new CommerceSaleMessage(this.common, this.has_commerce_sale, super.buildUnknownFields());
            }
            return (CommerceSaleMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11241, new Class[0], CommerceSaleMessage.class);
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder has_commerce_sale(Boolean bool) {
            this.has_commerce_sale = bool;
            return this;
        }
    }

    static final class ProtoAdapter_CommerceSaleMessage extends ProtoAdapter<CommerceSaleMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_CommerceSaleMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, CommerceSaleMessage.class);
        }

        public final int encodedSize(CommerceSaleMessage commerceSaleMessage) {
            int i;
            CommerceSaleMessage commerceSaleMessage2 = commerceSaleMessage;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{commerceSaleMessage2}, this, changeQuickRedirect, false, 11242, new Class[]{CommerceSaleMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{commerceSaleMessage2}, this, changeQuickRedirect, false, 11242, new Class[]{CommerceSaleMessage.class}, Integer.TYPE)).intValue();
            }
            if (commerceSaleMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, commerceSaleMessage2.common);
            } else {
                i = 0;
            }
            if (commerceSaleMessage2.has_commerce_sale != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, commerceSaleMessage2.has_commerce_sale);
            }
            return i + i2 + commerceSaleMessage.unknownFields().size();
        }

        public final CommerceSaleMessage redact(CommerceSaleMessage commerceSaleMessage) {
            if (PatchProxy.isSupport(new Object[]{commerceSaleMessage}, this, changeQuickRedirect, false, 11245, new Class[]{CommerceSaleMessage.class}, CommerceSaleMessage.class)) {
                return (CommerceSaleMessage) PatchProxy.accessDispatch(new Object[]{commerceSaleMessage}, this, changeQuickRedirect, false, 11245, new Class[]{CommerceSaleMessage.class}, CommerceSaleMessage.class);
            }
            Builder newBuilder = commerceSaleMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final CommerceSaleMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11244, new Class[]{ProtoReader.class}, CommerceSaleMessage.class)) {
                return (CommerceSaleMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11244, new Class[]{ProtoReader.class}, CommerceSaleMessage.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.common((Common) Common.ADAPTER.decode(protoReader2));
                            break;
                        case 2:
                            builder.has_commerce_sale((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                            break;
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, CommerceSaleMessage commerceSaleMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            CommerceSaleMessage commerceSaleMessage2 = commerceSaleMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, commerceSaleMessage2}, this, changeQuickRedirect, false, 11243, new Class[]{ProtoWriter.class, CommerceSaleMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, commerceSaleMessage2}, this, changeQuickRedirect, false, 11243, new Class[]{ProtoWriter.class, CommerceSaleMessage.class}, Void.TYPE);
                return;
            }
            if (commerceSaleMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, commerceSaleMessage2.common);
            }
            if (commerceSaleMessage2.has_commerce_sale != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 2, commerceSaleMessage2.has_commerce_sale);
            }
            protoWriter2.writeBytes(commerceSaleMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11237, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11237, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.has_commerce_sale = this.has_commerce_sale;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11239, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11239, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.has_commerce_sale != null) {
                i2 = this.has_commerce_sale.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11240, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11240, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.has_commerce_sale != null) {
            sb.append(", has_commerce_sale=");
            sb.append(this.has_commerce_sale);
        }
        StringBuilder replace = sb.replace(0, 2, "CommerceSaleMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11238, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11238, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof CommerceSaleMessage)) {
                return false;
            }
            CommerceSaleMessage commerceSaleMessage = (CommerceSaleMessage) obj;
            if (!unknownFields().equals(commerceSaleMessage.unknownFields()) || !Internal.equals(this.common, commerceSaleMessage.common) || !Internal.equals(this.has_commerce_sale, commerceSaleMessage.has_commerce_sale)) {
                return false;
            }
            return true;
        }
    }

    public CommerceSaleMessage(Common common2, Boolean bool) {
        this(common2, bool, ByteString.EMPTY);
    }

    public CommerceSaleMessage(Common common2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.has_commerce_sale = bool;
    }
}
