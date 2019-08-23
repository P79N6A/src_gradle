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

public final class FansclubReviewMessage extends Message<FansclubReviewMessage, Builder> {
    public static final ProtoAdapter<FansclubReviewMessage> ADAPTER = new ProtoAdapter_FansclubReviewMessage();
    public static final Integer DEFAULT_ACTION = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer action;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String content;

    public static final class Builder extends Message.Builder<FansclubReviewMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer action;
        public Common common;
        public String content;

        public final FansclubReviewMessage build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11405, new Class[0], FansclubReviewMessage.class)) {
                return new FansclubReviewMessage(this.common, this.action, this.content, super.buildUnknownFields());
            }
            return (FansclubReviewMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11405, new Class[0], FansclubReviewMessage.class);
        }

        public final Builder action(Integer num) {
            this.action = num;
            return this;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }
    }

    static final class ProtoAdapter_FansclubReviewMessage extends ProtoAdapter<FansclubReviewMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_FansclubReviewMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, FansclubReviewMessage.class);
        }

        public final int encodedSize(FansclubReviewMessage fansclubReviewMessage) {
            int i;
            int i2;
            FansclubReviewMessage fansclubReviewMessage2 = fansclubReviewMessage;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[]{fansclubReviewMessage2}, this, changeQuickRedirect, false, 11406, new Class[]{FansclubReviewMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{fansclubReviewMessage2}, this, changeQuickRedirect, false, 11406, new Class[]{FansclubReviewMessage.class}, Integer.TYPE)).intValue();
            }
            if (fansclubReviewMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, fansclubReviewMessage2.common);
            } else {
                i = 0;
            }
            if (fansclubReviewMessage2.action != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, fansclubReviewMessage2.action);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (fansclubReviewMessage2.content != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, fansclubReviewMessage2.content);
            }
            return i4 + i3 + fansclubReviewMessage.unknownFields().size();
        }

        public final FansclubReviewMessage redact(FansclubReviewMessage fansclubReviewMessage) {
            if (PatchProxy.isSupport(new Object[]{fansclubReviewMessage}, this, changeQuickRedirect, false, 11409, new Class[]{FansclubReviewMessage.class}, FansclubReviewMessage.class)) {
                return (FansclubReviewMessage) PatchProxy.accessDispatch(new Object[]{fansclubReviewMessage}, this, changeQuickRedirect, false, 11409, new Class[]{FansclubReviewMessage.class}, FansclubReviewMessage.class);
            }
            Builder newBuilder = fansclubReviewMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final FansclubReviewMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11408, new Class[]{ProtoReader.class}, FansclubReviewMessage.class)) {
                return (FansclubReviewMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11408, new Class[]{ProtoReader.class}, FansclubReviewMessage.class);
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
                            builder.action((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 3:
                            builder.content((String) ProtoAdapter.STRING.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, FansclubReviewMessage fansclubReviewMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            FansclubReviewMessage fansclubReviewMessage2 = fansclubReviewMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, fansclubReviewMessage2}, this, changeQuickRedirect, false, 11407, new Class[]{ProtoWriter.class, FansclubReviewMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, fansclubReviewMessage2}, this, changeQuickRedirect, false, 11407, new Class[]{ProtoWriter.class, FansclubReviewMessage.class}, Void.TYPE);
                return;
            }
            if (fansclubReviewMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, fansclubReviewMessage2.common);
            }
            if (fansclubReviewMessage2.action != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, fansclubReviewMessage2.action);
            }
            if (fansclubReviewMessage2.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, fansclubReviewMessage2.content);
            }
            protoWriter2.writeBytes(fansclubReviewMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11401, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11401, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.action = this.action;
        builder.content = this.content;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11403, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11403, new Class[0], Integer.TYPE)).intValue();
        }
        int i4 = this.hashCode;
        if (i4 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i5 = (hashCode + i) * 37;
            if (this.action != null) {
                i2 = this.action.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            if (this.content != null) {
                i3 = this.content.hashCode();
            }
            i4 = i6 + i3;
            this.hashCode = i4;
        }
        return i4;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11404, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11404, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.action != null) {
            sb.append(", action=");
            sb.append(this.action);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        StringBuilder replace = sb.replace(0, 2, "FansclubReviewMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11402, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11402, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof FansclubReviewMessage)) {
                return false;
            }
            FansclubReviewMessage fansclubReviewMessage = (FansclubReviewMessage) obj;
            if (!unknownFields().equals(fansclubReviewMessage.unknownFields()) || !Internal.equals(this.common, fansclubReviewMessage.common) || !Internal.equals(this.action, fansclubReviewMessage.action) || !Internal.equals(this.content, fansclubReviewMessage.content)) {
                return false;
            }
            return true;
        }
    }

    public FansclubReviewMessage(Common common2, Integer num, String str) {
        this(common2, num, str, ByteString.EMPTY);
    }

    public FansclubReviewMessage(Common common2, Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.action = num;
        this.content = str;
    }
}
