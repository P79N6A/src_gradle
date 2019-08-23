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

public final class DecorationModifyMessage extends Message<DecorationModifyMessage, Builder> {
    public static final ProtoAdapter<DecorationModifyMessage> ADAPTER = new ProtoAdapter_DecorationModifyMessage();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String extra;

    public static final class Builder extends Message.Builder<DecorationModifyMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public String extra;

        public final DecorationModifyMessage build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11315, new Class[0], DecorationModifyMessage.class)) {
                return new DecorationModifyMessage(this.common, this.extra, super.buildUnknownFields());
            }
            return (DecorationModifyMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11315, new Class[0], DecorationModifyMessage.class);
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder extra(String str) {
            this.extra = str;
            return this;
        }
    }

    static final class ProtoAdapter_DecorationModifyMessage extends ProtoAdapter<DecorationModifyMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_DecorationModifyMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, DecorationModifyMessage.class);
        }

        public final int encodedSize(DecorationModifyMessage decorationModifyMessage) {
            int i;
            DecorationModifyMessage decorationModifyMessage2 = decorationModifyMessage;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{decorationModifyMessage2}, this, changeQuickRedirect, false, 11316, new Class[]{DecorationModifyMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{decorationModifyMessage2}, this, changeQuickRedirect, false, 11316, new Class[]{DecorationModifyMessage.class}, Integer.TYPE)).intValue();
            }
            if (decorationModifyMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, decorationModifyMessage2.common);
            } else {
                i = 0;
            }
            if (decorationModifyMessage2.extra != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, decorationModifyMessage2.extra);
            }
            return i + i2 + decorationModifyMessage.unknownFields().size();
        }

        public final DecorationModifyMessage redact(DecorationModifyMessage decorationModifyMessage) {
            if (PatchProxy.isSupport(new Object[]{decorationModifyMessage}, this, changeQuickRedirect, false, 11319, new Class[]{DecorationModifyMessage.class}, DecorationModifyMessage.class)) {
                return (DecorationModifyMessage) PatchProxy.accessDispatch(new Object[]{decorationModifyMessage}, this, changeQuickRedirect, false, 11319, new Class[]{DecorationModifyMessage.class}, DecorationModifyMessage.class);
            }
            Builder newBuilder = decorationModifyMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final DecorationModifyMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11318, new Class[]{ProtoReader.class}, DecorationModifyMessage.class)) {
                return (DecorationModifyMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11318, new Class[]{ProtoReader.class}, DecorationModifyMessage.class);
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
                            builder.extra((String) ProtoAdapter.STRING.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, DecorationModifyMessage decorationModifyMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            DecorationModifyMessage decorationModifyMessage2 = decorationModifyMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, decorationModifyMessage2}, this, changeQuickRedirect, false, 11317, new Class[]{ProtoWriter.class, DecorationModifyMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, decorationModifyMessage2}, this, changeQuickRedirect, false, 11317, new Class[]{ProtoWriter.class, DecorationModifyMessage.class}, Void.TYPE);
                return;
            }
            if (decorationModifyMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, decorationModifyMessage2.common);
            }
            if (decorationModifyMessage2.extra != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, decorationModifyMessage2.extra);
            }
            protoWriter2.writeBytes(decorationModifyMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11311, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11311, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.extra = this.extra;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11313, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11313, new Class[0], Integer.TYPE)).intValue();
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
            if (this.extra != null) {
                i2 = this.extra.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11314, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11314, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        StringBuilder replace = sb.replace(0, 2, "DecorationModifyMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11312, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11312, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof DecorationModifyMessage)) {
                return false;
            }
            DecorationModifyMessage decorationModifyMessage = (DecorationModifyMessage) obj;
            if (!unknownFields().equals(decorationModifyMessage.unknownFields()) || !Internal.equals(this.common, decorationModifyMessage.common) || !Internal.equals(this.extra, decorationModifyMessage.extra)) {
                return false;
            }
            return true;
        }
    }

    public DecorationModifyMessage(Common common2, String str) {
        this(common2, str, ByteString.EMPTY);
    }

    public DecorationModifyMessage(Common common2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.extra = str;
    }
}
