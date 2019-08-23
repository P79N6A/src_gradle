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

public final class XGLotteryMessage extends Message<XGLotteryMessage, Builder> {
    public static final ProtoAdapter<XGLotteryMessage> ADAPTER = new ProtoAdapter_XGLotteryMessage();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.LotteryInfo#ADAPTER", tag = 2)
    public final LotteryInfo lottery_info;

    public static final class Builder extends Message.Builder<XGLotteryMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public LotteryInfo lottery_info;

        public final XGLotteryMessage build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12494, new Class[0], XGLotteryMessage.class)) {
                return new XGLotteryMessage(this.common, this.lottery_info, super.buildUnknownFields());
            }
            return (XGLotteryMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12494, new Class[0], XGLotteryMessage.class);
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder lottery_info(LotteryInfo lotteryInfo) {
            this.lottery_info = lotteryInfo;
            return this;
        }
    }

    static final class ProtoAdapter_XGLotteryMessage extends ProtoAdapter<XGLotteryMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_XGLotteryMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, XGLotteryMessage.class);
        }

        public final int encodedSize(XGLotteryMessage xGLotteryMessage) {
            int i;
            XGLotteryMessage xGLotteryMessage2 = xGLotteryMessage;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{xGLotteryMessage2}, this, changeQuickRedirect, false, 12495, new Class[]{XGLotteryMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{xGLotteryMessage2}, this, changeQuickRedirect, false, 12495, new Class[]{XGLotteryMessage.class}, Integer.TYPE)).intValue();
            }
            if (xGLotteryMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, xGLotteryMessage2.common);
            } else {
                i = 0;
            }
            if (xGLotteryMessage2.lottery_info != null) {
                i2 = LotteryInfo.ADAPTER.encodedSizeWithTag(2, xGLotteryMessage2.lottery_info);
            }
            return i + i2 + xGLotteryMessage.unknownFields().size();
        }

        public final XGLotteryMessage redact(XGLotteryMessage xGLotteryMessage) {
            if (PatchProxy.isSupport(new Object[]{xGLotteryMessage}, this, changeQuickRedirect, false, 12498, new Class[]{XGLotteryMessage.class}, XGLotteryMessage.class)) {
                return (XGLotteryMessage) PatchProxy.accessDispatch(new Object[]{xGLotteryMessage}, this, changeQuickRedirect, false, 12498, new Class[]{XGLotteryMessage.class}, XGLotteryMessage.class);
            }
            Builder newBuilder = xGLotteryMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.lottery_info != null) {
                newBuilder.lottery_info = (LotteryInfo) LotteryInfo.ADAPTER.redact(newBuilder.lottery_info);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final XGLotteryMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12497, new Class[]{ProtoReader.class}, XGLotteryMessage.class)) {
                return (XGLotteryMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12497, new Class[]{ProtoReader.class}, XGLotteryMessage.class);
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
                            builder.lottery_info((LotteryInfo) LotteryInfo.ADAPTER.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, XGLotteryMessage xGLotteryMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            XGLotteryMessage xGLotteryMessage2 = xGLotteryMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, xGLotteryMessage2}, this, changeQuickRedirect, false, 12496, new Class[]{ProtoWriter.class, XGLotteryMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, xGLotteryMessage2}, this, changeQuickRedirect, false, 12496, new Class[]{ProtoWriter.class, XGLotteryMessage.class}, Void.TYPE);
                return;
            }
            if (xGLotteryMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, xGLotteryMessage2.common);
            }
            if (xGLotteryMessage2.lottery_info != null) {
                LotteryInfo.ADAPTER.encodeWithTag(protoWriter2, 2, xGLotteryMessage2.lottery_info);
            }
            protoWriter2.writeBytes(xGLotteryMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12490, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12490, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.lottery_info = this.lottery_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12492, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12492, new Class[0], Integer.TYPE)).intValue();
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
            if (this.lottery_info != null) {
                i2 = this.lottery_info.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12493, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12493, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.lottery_info != null) {
            sb.append(", lottery_info=");
            sb.append(this.lottery_info);
        }
        StringBuilder replace = sb.replace(0, 2, "XGLotteryMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12491, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12491, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof XGLotteryMessage)) {
                return false;
            }
            XGLotteryMessage xGLotteryMessage = (XGLotteryMessage) obj;
            if (!unknownFields().equals(xGLotteryMessage.unknownFields()) || !Internal.equals(this.common, xGLotteryMessage.common) || !Internal.equals(this.lottery_info, xGLotteryMessage.lottery_info)) {
                return false;
            }
            return true;
        }
    }

    public XGLotteryMessage(Common common2, LotteryInfo lotteryInfo) {
        this(common2, lotteryInfo, ByteString.EMPTY);
    }

    public XGLotteryMessage(Common common2, LotteryInfo lotteryInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.lottery_info = lotteryInfo;
    }
}
