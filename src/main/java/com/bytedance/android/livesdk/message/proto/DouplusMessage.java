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

public final class DouplusMessage extends Message<DouplusMessage, Builder> {
    public static final ProtoAdapter<DouplusMessage> ADAPTER = new ProtoAdapter_DouplusMessage();
    public static final Long DEFAULT_PROMOTION_DURATION = 0L;
    public static final Long DEFAULT_PROMOTION_START_TIME = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long promotion;

    public static final class Builder extends Message.Builder<DouplusMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public Long promotion;

        public final DouplusMessage build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11351, new Class[0], DouplusMessage.class)) {
                return new DouplusMessage(this.common, this.promotion, super.buildUnknownFields());
            }
            return (DouplusMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11351, new Class[0], DouplusMessage.class);
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder promotion(Long l) {
            this.promotion = l;
            return this;
        }
    }

    static final class ProtoAdapter_DouplusMessage extends ProtoAdapter<DouplusMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_DouplusMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, DouplusMessage.class);
        }

        public final int encodedSize(DouplusMessage douplusMessage) {
            int i;
            DouplusMessage douplusMessage2 = douplusMessage;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{douplusMessage2}, this, changeQuickRedirect, false, 11352, new Class[]{DouplusMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{douplusMessage2}, this, changeQuickRedirect, false, 11352, new Class[]{DouplusMessage.class}, Integer.TYPE)).intValue();
            }
            if (douplusMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, douplusMessage2.common);
            } else {
                i = 0;
            }
            if (douplusMessage2.promotion != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, douplusMessage2.promotion);
            }
            return i + i2 + douplusMessage.unknownFields().size();
        }

        public final DouplusMessage redact(DouplusMessage douplusMessage) {
            if (PatchProxy.isSupport(new Object[]{douplusMessage}, this, changeQuickRedirect, false, 11355, new Class[]{DouplusMessage.class}, DouplusMessage.class)) {
                return (DouplusMessage) PatchProxy.accessDispatch(new Object[]{douplusMessage}, this, changeQuickRedirect, false, 11355, new Class[]{DouplusMessage.class}, DouplusMessage.class);
            }
            Builder newBuilder = douplusMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final DouplusMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11354, new Class[]{ProtoReader.class}, DouplusMessage.class)) {
                return (DouplusMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11354, new Class[]{ProtoReader.class}, DouplusMessage.class);
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
                            builder.promotion((Long) ProtoAdapter.INT64.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, DouplusMessage douplusMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            DouplusMessage douplusMessage2 = douplusMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, douplusMessage2}, this, changeQuickRedirect, false, 11353, new Class[]{ProtoWriter.class, DouplusMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, douplusMessage2}, this, changeQuickRedirect, false, 11353, new Class[]{ProtoWriter.class, DouplusMessage.class}, Void.TYPE);
                return;
            }
            if (douplusMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, douplusMessage2.common);
            }
            if (douplusMessage2.promotion != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, douplusMessage2.promotion);
            }
            protoWriter2.writeBytes(douplusMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11347, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11347, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.promotion = this.promotion;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11349, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11349, new Class[0], Integer.TYPE)).intValue();
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
            if (this.promotion != null) {
                i2 = this.promotion.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11350, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11350, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.promotion != null) {
            sb.append(", promotion=");
            sb.append(this.promotion);
        }
        StringBuilder replace = sb.replace(0, 2, "DouplusMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11348, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11348, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof DouplusMessage)) {
                return false;
            }
            DouplusMessage douplusMessage = (DouplusMessage) obj;
            if (!unknownFields().equals(douplusMessage.unknownFields()) || !Internal.equals(this.common, douplusMessage.common) || !Internal.equals(this.promotion, douplusMessage.promotion)) {
                return false;
            }
            return true;
        }
    }

    public DouplusMessage(Common common2, Long l) {
        this(common2, l, ByteString.EMPTY);
    }

    public DouplusMessage(Common common2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.promotion = l;
    }
}
