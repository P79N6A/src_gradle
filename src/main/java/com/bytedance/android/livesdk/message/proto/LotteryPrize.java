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

public final class LotteryPrize extends Message<LotteryPrize, Builder> {
    public static final ProtoAdapter<LotteryPrize> ADAPTER = new ProtoAdapter_LotteryPrize();
    public static final Long DEFAULT_PRIZE_ID = 0L;
    public static final Integer DEFAULT_TYPE = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String image;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long prize_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer type;

    public static final class Builder extends Message.Builder<LotteryPrize, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String image;
        public String name;
        public Long prize_id;
        public Integer type;

        public final LotteryPrize build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11807, new Class[0], LotteryPrize.class)) {
                return (LotteryPrize) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11807, new Class[0], LotteryPrize.class);
            }
            LotteryPrize lotteryPrize = new LotteryPrize(this.prize_id, this.type, this.name, this.image, super.buildUnknownFields());
            return lotteryPrize;
        }

        public final Builder image(String str) {
            this.image = str;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder prize_id(Long l) {
            this.prize_id = l;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }
    }

    static final class ProtoAdapter_LotteryPrize extends ProtoAdapter<LotteryPrize> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_LotteryPrize() {
            super(FieldEncoding.LENGTH_DELIMITED, LotteryPrize.class);
        }

        public final LotteryPrize redact(LotteryPrize lotteryPrize) {
            if (PatchProxy.isSupport(new Object[]{lotteryPrize}, this, changeQuickRedirect, false, 11811, new Class[]{LotteryPrize.class}, LotteryPrize.class)) {
                return (LotteryPrize) PatchProxy.accessDispatch(new Object[]{lotteryPrize}, this, changeQuickRedirect, false, 11811, new Class[]{LotteryPrize.class}, LotteryPrize.class);
            }
            Builder newBuilder = lotteryPrize.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final LotteryPrize decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11810, new Class[]{ProtoReader.class}, LotteryPrize.class)) {
                return (LotteryPrize) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11810, new Class[]{ProtoReader.class}, LotteryPrize.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.prize_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 2:
                            builder.type((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 3:
                            builder.name((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 4:
                            builder.image((String) ProtoAdapter.STRING.decode(protoReader2));
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

        public final int encodedSize(LotteryPrize lotteryPrize) {
            int i;
            int i2;
            int i3;
            LotteryPrize lotteryPrize2 = lotteryPrize;
            int i4 = 0;
            if (PatchProxy.isSupport(new Object[]{lotteryPrize2}, this, changeQuickRedirect, false, 11808, new Class[]{LotteryPrize.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{lotteryPrize2}, this, changeQuickRedirect, false, 11808, new Class[]{LotteryPrize.class}, Integer.TYPE)).intValue();
            }
            if (lotteryPrize2.prize_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, lotteryPrize2.prize_id);
            } else {
                i = 0;
            }
            if (lotteryPrize2.type != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, lotteryPrize2.type);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (lotteryPrize2.name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, lotteryPrize2.name);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (lotteryPrize2.image != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, lotteryPrize2.image);
            }
            return i6 + i4 + lotteryPrize.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, LotteryPrize lotteryPrize) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            LotteryPrize lotteryPrize2 = lotteryPrize;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, lotteryPrize2}, this, changeQuickRedirect, false, 11809, new Class[]{ProtoWriter.class, LotteryPrize.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, lotteryPrize2}, this, changeQuickRedirect, false, 11809, new Class[]{ProtoWriter.class, LotteryPrize.class}, Void.TYPE);
                return;
            }
            if (lotteryPrize2.prize_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, lotteryPrize2.prize_id);
            }
            if (lotteryPrize2.type != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, lotteryPrize2.type);
            }
            if (lotteryPrize2.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, lotteryPrize2.name);
            }
            if (lotteryPrize2.image != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, lotteryPrize2.image);
            }
            protoWriter2.writeBytes(lotteryPrize.unknownFields());
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11805, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11805, new Class[0], Integer.TYPE)).intValue();
        }
        int i5 = this.hashCode;
        if (i5 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.prize_id != null) {
                i = this.prize_id.hashCode();
            } else {
                i = 0;
            }
            int i6 = (hashCode + i) * 37;
            if (this.type != null) {
                i2 = this.type.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 37;
            if (this.name != null) {
                i3 = this.name.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 37;
            if (this.image != null) {
                i4 = this.image.hashCode();
            }
            i5 = i8 + i4;
            this.hashCode = i5;
        }
        return i5;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11803, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11803, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.prize_id = this.prize_id;
        builder.type = this.type;
        builder.name = this.name;
        builder.image = this.image;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11806, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11806, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.prize_id != null) {
            sb.append(", prize_id=");
            sb.append(this.prize_id);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        StringBuilder replace = sb.replace(0, 2, "LotteryPrize{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11804, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11804, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof LotteryPrize)) {
                return false;
            }
            LotteryPrize lotteryPrize = (LotteryPrize) obj;
            if (!unknownFields().equals(lotteryPrize.unknownFields()) || !Internal.equals(this.prize_id, lotteryPrize.prize_id) || !Internal.equals(this.type, lotteryPrize.type) || !Internal.equals(this.name, lotteryPrize.name) || !Internal.equals(this.image, lotteryPrize.image)) {
                return false;
            }
            return true;
        }
    }

    public LotteryPrize(Long l, Integer num, String str, String str2) {
        this(l, num, str, str2, ByteString.EMPTY);
    }

    public LotteryPrize(Long l, Integer num, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.prize_id = l;
        this.type = num;
        this.name = str;
        this.image = str2;
    }
}
