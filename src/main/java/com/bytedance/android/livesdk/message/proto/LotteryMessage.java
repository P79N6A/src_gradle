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

public final class LotteryMessage extends Message<LotteryMessage, Builder> {
    public static final ProtoAdapter<LotteryMessage> ADAPTER = new ProtoAdapter_LotteryMessage();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;

    public static final class Builder extends Message.Builder<LotteryMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;

        public final LotteryMessage build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11798, new Class[0], LotteryMessage.class)) {
                return new LotteryMessage(this.common, super.buildUnknownFields());
            }
            return (LotteryMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11798, new Class[0], LotteryMessage.class);
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }
    }

    static final class ProtoAdapter_LotteryMessage extends ProtoAdapter<LotteryMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_LotteryMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, LotteryMessage.class);
        }

        public final LotteryMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11801, new Class[]{ProtoReader.class}, LotteryMessage.class)) {
                return (LotteryMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11801, new Class[]{ProtoReader.class}, LotteryMessage.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader2.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                } else {
                    builder.common((Common) Common.ADAPTER.decode(protoReader2));
                }
            }
        }

        public final int encodedSize(LotteryMessage lotteryMessage) {
            LotteryMessage lotteryMessage2 = lotteryMessage;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{lotteryMessage2}, this, changeQuickRedirect, false, 11799, new Class[]{LotteryMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{lotteryMessage2}, this, changeQuickRedirect, false, 11799, new Class[]{LotteryMessage.class}, Integer.TYPE)).intValue();
            }
            if (lotteryMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, lotteryMessage2.common);
            }
            return i + lotteryMessage.unknownFields().size();
        }

        public final LotteryMessage redact(LotteryMessage lotteryMessage) {
            if (PatchProxy.isSupport(new Object[]{lotteryMessage}, this, changeQuickRedirect, false, 11802, new Class[]{LotteryMessage.class}, LotteryMessage.class)) {
                return (LotteryMessage) PatchProxy.accessDispatch(new Object[]{lotteryMessage}, this, changeQuickRedirect, false, 11802, new Class[]{LotteryMessage.class}, LotteryMessage.class);
            }
            Builder newBuilder = lotteryMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final void encode(ProtoWriter protoWriter, LotteryMessage lotteryMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            LotteryMessage lotteryMessage2 = lotteryMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, lotteryMessage2}, this, changeQuickRedirect, false, 11800, new Class[]{ProtoWriter.class, LotteryMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, lotteryMessage2}, this, changeQuickRedirect, false, 11800, new Class[]{ProtoWriter.class, LotteryMessage.class}, Void.TYPE);
                return;
            }
            if (lotteryMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, lotteryMessage2.common);
            }
            protoWriter2.writeBytes(lotteryMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11794, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11794, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11796, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11796, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            }
            i2 = hashCode + i;
            this.hashCode = i2;
        }
        return i2;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11797, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11797, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        StringBuilder replace = sb.replace(0, 2, "LotteryMessage{");
        replace.append('}');
        return replace.toString();
    }

    public LotteryMessage(Common common2) {
        this(common2, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11795, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11795, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof LotteryMessage)) {
                return false;
            }
            LotteryMessage lotteryMessage = (LotteryMessage) obj;
            if (!unknownFields().equals(lotteryMessage.unknownFields()) || !Internal.equals(this.common, lotteryMessage.common)) {
                return false;
            }
            return true;
        }
    }

    public LotteryMessage(Common common2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
    }
}
