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

public final class FreeGiftMessage extends Message<FreeGiftMessage, Builder> {
    public static final ProtoAdapter<FreeGiftMessage> ADAPTER = new ProtoAdapter_FreeGiftMessage();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.FreeGift#ADAPTER", tag = 3)
    public final FreeGift free_gift;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 2)
    public final User user;

    public static final class Builder extends Message.Builder<FreeGiftMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public FreeGift free_gift;
        public User user;

        public final FreeGiftMessage build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11479, new Class[0], FreeGiftMessage.class)) {
                return new FreeGiftMessage(this.common, this.user, this.free_gift, super.buildUnknownFields());
            }
            return (FreeGiftMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11479, new Class[0], FreeGiftMessage.class);
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder free_gift(FreeGift freeGift) {
            this.free_gift = freeGift;
            return this;
        }

        public final Builder user(User user2) {
            this.user = user2;
            return this;
        }
    }

    static final class ProtoAdapter_FreeGiftMessage extends ProtoAdapter<FreeGiftMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_FreeGiftMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, FreeGiftMessage.class);
        }

        public final int encodedSize(FreeGiftMessage freeGiftMessage) {
            int i;
            int i2;
            FreeGiftMessage freeGiftMessage2 = freeGiftMessage;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[]{freeGiftMessage2}, this, changeQuickRedirect, false, 11480, new Class[]{FreeGiftMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{freeGiftMessage2}, this, changeQuickRedirect, false, 11480, new Class[]{FreeGiftMessage.class}, Integer.TYPE)).intValue();
            }
            if (freeGiftMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, freeGiftMessage2.common);
            } else {
                i = 0;
            }
            if (freeGiftMessage2.user != null) {
                i2 = User.ADAPTER.encodedSizeWithTag(2, freeGiftMessage2.user);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (freeGiftMessage2.free_gift != null) {
                i3 = FreeGift.ADAPTER.encodedSizeWithTag(3, freeGiftMessage2.free_gift);
            }
            return i4 + i3 + freeGiftMessage.unknownFields().size();
        }

        public final FreeGiftMessage redact(FreeGiftMessage freeGiftMessage) {
            if (PatchProxy.isSupport(new Object[]{freeGiftMessage}, this, changeQuickRedirect, false, 11483, new Class[]{FreeGiftMessage.class}, FreeGiftMessage.class)) {
                return (FreeGiftMessage) PatchProxy.accessDispatch(new Object[]{freeGiftMessage}, this, changeQuickRedirect, false, 11483, new Class[]{FreeGiftMessage.class}, FreeGiftMessage.class);
            }
            Builder newBuilder = freeGiftMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.user != null) {
                newBuilder.user = (User) User.ADAPTER.redact(newBuilder.user);
            }
            if (newBuilder.free_gift != null) {
                newBuilder.free_gift = (FreeGift) FreeGift.ADAPTER.redact(newBuilder.free_gift);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final FreeGiftMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11482, new Class[]{ProtoReader.class}, FreeGiftMessage.class)) {
                return (FreeGiftMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11482, new Class[]{ProtoReader.class}, FreeGiftMessage.class);
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
                            builder.user((User) User.ADAPTER.decode(protoReader2));
                            break;
                        case 3:
                            builder.free_gift((FreeGift) FreeGift.ADAPTER.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, FreeGiftMessage freeGiftMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            FreeGiftMessage freeGiftMessage2 = freeGiftMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, freeGiftMessage2}, this, changeQuickRedirect, false, 11481, new Class[]{ProtoWriter.class, FreeGiftMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, freeGiftMessage2}, this, changeQuickRedirect, false, 11481, new Class[]{ProtoWriter.class, FreeGiftMessage.class}, Void.TYPE);
                return;
            }
            if (freeGiftMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, freeGiftMessage2.common);
            }
            if (freeGiftMessage2.user != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 2, freeGiftMessage2.user);
            }
            if (freeGiftMessage2.free_gift != null) {
                FreeGift.ADAPTER.encodeWithTag(protoWriter2, 3, freeGiftMessage2.free_gift);
            }
            protoWriter2.writeBytes(freeGiftMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11475, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11475, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.user = this.user;
        builder.free_gift = this.free_gift;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11477, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11477, new Class[0], Integer.TYPE)).intValue();
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
            if (this.user != null) {
                i2 = this.user.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            if (this.free_gift != null) {
                i3 = this.free_gift.hashCode();
            }
            i4 = i6 + i3;
            this.hashCode = i4;
        }
        return i4;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11478, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11478, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        if (this.free_gift != null) {
            sb.append(", free_gift=");
            sb.append(this.free_gift);
        }
        StringBuilder replace = sb.replace(0, 2, "FreeGiftMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11476, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11476, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof FreeGiftMessage)) {
                return false;
            }
            FreeGiftMessage freeGiftMessage = (FreeGiftMessage) obj;
            if (!unknownFields().equals(freeGiftMessage.unknownFields()) || !Internal.equals(this.common, freeGiftMessage.common) || !Internal.equals(this.user, freeGiftMessage.user) || !Internal.equals(this.free_gift, freeGiftMessage.free_gift)) {
                return false;
            }
            return true;
        }
    }

    public FreeGiftMessage(Common common2, User user2, FreeGift freeGift) {
        this(common2, user2, freeGift, ByteString.EMPTY);
    }

    public FreeGiftMessage(Common common2, User user2, FreeGift freeGift, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.user = user2;
        this.free_gift = freeGift;
    }
}
