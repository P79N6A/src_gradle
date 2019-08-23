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

public final class LuckyMoneyMessage extends Message<LuckyMoneyMessage, Builder> {
    public static final ProtoAdapter<LuckyMoneyMessage> ADAPTER = new ProtoAdapter_LuckyMoneyMessage();
    public static final Long DEFAULT_DIAMOND_COUNT = 0L;
    public static final Long DEFAULT_LUCKYMONEY_ID = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long diamond_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long luckymoney_id;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 2)
    public final User user;

    public static final class Builder extends Message.Builder<LuckyMoneyMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public Long diamond_count;
        public Long luckymoney_id;
        public User user;

        public final LuckyMoneyMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11853, new Class[0], LuckyMoneyMessage.class)) {
                return (LuckyMoneyMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11853, new Class[0], LuckyMoneyMessage.class);
            }
            LuckyMoneyMessage luckyMoneyMessage = new LuckyMoneyMessage(this.common, this.user, this.luckymoney_id, this.diamond_count, super.buildUnknownFields());
            return luckyMoneyMessage;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder diamond_count(Long l) {
            this.diamond_count = l;
            return this;
        }

        public final Builder luckymoney_id(Long l) {
            this.luckymoney_id = l;
            return this;
        }

        public final Builder user(User user2) {
            this.user = user2;
            return this;
        }
    }

    static final class ProtoAdapter_LuckyMoneyMessage extends ProtoAdapter<LuckyMoneyMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_LuckyMoneyMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, LuckyMoneyMessage.class);
        }

        public final LuckyMoneyMessage redact(LuckyMoneyMessage luckyMoneyMessage) {
            if (PatchProxy.isSupport(new Object[]{luckyMoneyMessage}, this, changeQuickRedirect, false, 11857, new Class[]{LuckyMoneyMessage.class}, LuckyMoneyMessage.class)) {
                return (LuckyMoneyMessage) PatchProxy.accessDispatch(new Object[]{luckyMoneyMessage}, this, changeQuickRedirect, false, 11857, new Class[]{LuckyMoneyMessage.class}, LuckyMoneyMessage.class);
            }
            Builder newBuilder = luckyMoneyMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.user != null) {
                newBuilder.user = (User) User.ADAPTER.redact(newBuilder.user);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final LuckyMoneyMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11856, new Class[]{ProtoReader.class}, LuckyMoneyMessage.class)) {
                return (LuckyMoneyMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11856, new Class[]{ProtoReader.class}, LuckyMoneyMessage.class);
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
                            builder.luckymoney_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.diamond_count((Long) ProtoAdapter.INT64.decode(protoReader2));
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

        public final int encodedSize(LuckyMoneyMessage luckyMoneyMessage) {
            int i;
            int i2;
            int i3;
            LuckyMoneyMessage luckyMoneyMessage2 = luckyMoneyMessage;
            int i4 = 0;
            if (PatchProxy.isSupport(new Object[]{luckyMoneyMessage2}, this, changeQuickRedirect, false, 11854, new Class[]{LuckyMoneyMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{luckyMoneyMessage2}, this, changeQuickRedirect, false, 11854, new Class[]{LuckyMoneyMessage.class}, Integer.TYPE)).intValue();
            }
            if (luckyMoneyMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, luckyMoneyMessage2.common);
            } else {
                i = 0;
            }
            if (luckyMoneyMessage2.user != null) {
                i2 = User.ADAPTER.encodedSizeWithTag(2, luckyMoneyMessage2.user);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (luckyMoneyMessage2.luckymoney_id != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, luckyMoneyMessage2.luckymoney_id);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (luckyMoneyMessage2.diamond_count != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, luckyMoneyMessage2.diamond_count);
            }
            return i6 + i4 + luckyMoneyMessage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, LuckyMoneyMessage luckyMoneyMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            LuckyMoneyMessage luckyMoneyMessage2 = luckyMoneyMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, luckyMoneyMessage2}, this, changeQuickRedirect, false, 11855, new Class[]{ProtoWriter.class, LuckyMoneyMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, luckyMoneyMessage2}, this, changeQuickRedirect, false, 11855, new Class[]{ProtoWriter.class, LuckyMoneyMessage.class}, Void.TYPE);
                return;
            }
            if (luckyMoneyMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, luckyMoneyMessage2.common);
            }
            if (luckyMoneyMessage2.user != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 2, luckyMoneyMessage2.user);
            }
            if (luckyMoneyMessage2.luckymoney_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, luckyMoneyMessage2.luckymoney_id);
            }
            if (luckyMoneyMessage2.diamond_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, luckyMoneyMessage2.diamond_count);
            }
            protoWriter2.writeBytes(luckyMoneyMessage.unknownFields());
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11851, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11851, new Class[0], Integer.TYPE)).intValue();
        }
        int i5 = this.hashCode;
        if (i5 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i6 = (hashCode + i) * 37;
            if (this.user != null) {
                i2 = this.user.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 37;
            if (this.luckymoney_id != null) {
                i3 = this.luckymoney_id.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 37;
            if (this.diamond_count != null) {
                i4 = this.diamond_count.hashCode();
            }
            i5 = i8 + i4;
            this.hashCode = i5;
        }
        return i5;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11849, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11849, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.user = this.user;
        builder.luckymoney_id = this.luckymoney_id;
        builder.diamond_count = this.diamond_count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11852, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11852, new Class[0], String.class);
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
        if (this.luckymoney_id != null) {
            sb.append(", luckymoney_id=");
            sb.append(this.luckymoney_id);
        }
        if (this.diamond_count != null) {
            sb.append(", diamond_count=");
            sb.append(this.diamond_count);
        }
        StringBuilder replace = sb.replace(0, 2, "LuckyMoneyMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11850, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11850, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof LuckyMoneyMessage)) {
                return false;
            }
            LuckyMoneyMessage luckyMoneyMessage = (LuckyMoneyMessage) obj;
            if (!unknownFields().equals(luckyMoneyMessage.unknownFields()) || !Internal.equals(this.common, luckyMoneyMessage.common) || !Internal.equals(this.user, luckyMoneyMessage.user) || !Internal.equals(this.luckymoney_id, luckyMoneyMessage.luckymoney_id) || !Internal.equals(this.diamond_count, luckyMoneyMessage.diamond_count)) {
                return false;
            }
            return true;
        }
    }

    public LuckyMoneyMessage(Common common2, User user2, Long l, Long l2) {
        this(common2, user2, l, l2, ByteString.EMPTY);
    }

    public LuckyMoneyMessage(Common common2, User user2, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.user = user2;
        this.luckymoney_id = l;
        this.diamond_count = l2;
    }
}
