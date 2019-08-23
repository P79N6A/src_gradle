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

public final class LuckyMoneyGiftMeta extends Message<LuckyMoneyGiftMeta, Builder> {
    public static final ProtoAdapter<LuckyMoneyGiftMeta> ADAPTER = new ProtoAdapter_LuckyMoneyGiftMeta();
    public static final Integer DEFAULT_DIAMOND_COUNT = 0;
    public static final Long DEFAULT_ID = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String describe;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer diamond_count;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 5)
    public final Image icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long id;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 1)
    public final Image image;

    public static final class Builder extends Message.Builder<LuckyMoneyGiftMeta, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String describe;
        public Integer diamond_count;
        public Image icon;
        public Long id;
        public Image image;

        public final LuckyMoneyGiftMeta build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11844, new Class[0], LuckyMoneyGiftMeta.class)) {
                return (LuckyMoneyGiftMeta) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11844, new Class[0], LuckyMoneyGiftMeta.class);
            }
            LuckyMoneyGiftMeta luckyMoneyGiftMeta = new LuckyMoneyGiftMeta(this.image, this.describe, this.id, this.diamond_count, this.icon, super.buildUnknownFields());
            return luckyMoneyGiftMeta;
        }

        public final Builder describe(String str) {
            this.describe = str;
            return this;
        }

        public final Builder diamond_count(Integer num) {
            this.diamond_count = num;
            return this;
        }

        public final Builder icon(Image image2) {
            this.icon = image2;
            return this;
        }

        public final Builder id(Long l) {
            this.id = l;
            return this;
        }

        public final Builder image(Image image2) {
            this.image = image2;
            return this;
        }
    }

    static final class ProtoAdapter_LuckyMoneyGiftMeta extends ProtoAdapter<LuckyMoneyGiftMeta> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_LuckyMoneyGiftMeta() {
            super(FieldEncoding.LENGTH_DELIMITED, LuckyMoneyGiftMeta.class);
        }

        public final LuckyMoneyGiftMeta redact(LuckyMoneyGiftMeta luckyMoneyGiftMeta) {
            if (PatchProxy.isSupport(new Object[]{luckyMoneyGiftMeta}, this, changeQuickRedirect, false, 11848, new Class[]{LuckyMoneyGiftMeta.class}, LuckyMoneyGiftMeta.class)) {
                return (LuckyMoneyGiftMeta) PatchProxy.accessDispatch(new Object[]{luckyMoneyGiftMeta}, this, changeQuickRedirect, false, 11848, new Class[]{LuckyMoneyGiftMeta.class}, LuckyMoneyGiftMeta.class);
            }
            Builder newBuilder = luckyMoneyGiftMeta.newBuilder();
            if (newBuilder.image != null) {
                newBuilder.image = (Image) Image.ADAPTER.redact(newBuilder.image);
            }
            if (newBuilder.icon != null) {
                newBuilder.icon = (Image) Image.ADAPTER.redact(newBuilder.icon);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final LuckyMoneyGiftMeta decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11847, new Class[]{ProtoReader.class}, LuckyMoneyGiftMeta.class)) {
                return (LuckyMoneyGiftMeta) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11847, new Class[]{ProtoReader.class}, LuckyMoneyGiftMeta.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.image((Image) Image.ADAPTER.decode(protoReader2));
                            break;
                        case 2:
                            builder.describe((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder.id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.diamond_count((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 5:
                            builder.icon((Image) Image.ADAPTER.decode(protoReader2));
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

        public final int encodedSize(LuckyMoneyGiftMeta luckyMoneyGiftMeta) {
            int i;
            int i2;
            int i3;
            int i4;
            LuckyMoneyGiftMeta luckyMoneyGiftMeta2 = luckyMoneyGiftMeta;
            int i5 = 0;
            if (PatchProxy.isSupport(new Object[]{luckyMoneyGiftMeta2}, this, changeQuickRedirect, false, 11845, new Class[]{LuckyMoneyGiftMeta.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{luckyMoneyGiftMeta2}, this, changeQuickRedirect, false, 11845, new Class[]{LuckyMoneyGiftMeta.class}, Integer.TYPE)).intValue();
            }
            if (luckyMoneyGiftMeta2.image != null) {
                i = Image.ADAPTER.encodedSizeWithTag(1, luckyMoneyGiftMeta2.image);
            } else {
                i = 0;
            }
            if (luckyMoneyGiftMeta2.describe != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, luckyMoneyGiftMeta2.describe);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (luckyMoneyGiftMeta2.id != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, luckyMoneyGiftMeta2.id);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (luckyMoneyGiftMeta2.diamond_count != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(4, luckyMoneyGiftMeta2.diamond_count);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (luckyMoneyGiftMeta2.icon != null) {
                i5 = Image.ADAPTER.encodedSizeWithTag(5, luckyMoneyGiftMeta2.icon);
            }
            return i8 + i5 + luckyMoneyGiftMeta.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, LuckyMoneyGiftMeta luckyMoneyGiftMeta) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            LuckyMoneyGiftMeta luckyMoneyGiftMeta2 = luckyMoneyGiftMeta;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, luckyMoneyGiftMeta2}, this, changeQuickRedirect, false, 11846, new Class[]{ProtoWriter.class, LuckyMoneyGiftMeta.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, luckyMoneyGiftMeta2}, this, changeQuickRedirect, false, 11846, new Class[]{ProtoWriter.class, LuckyMoneyGiftMeta.class}, Void.TYPE);
                return;
            }
            if (luckyMoneyGiftMeta2.image != null) {
                Image.ADAPTER.encodeWithTag(protoWriter2, 1, luckyMoneyGiftMeta2.image);
            }
            if (luckyMoneyGiftMeta2.describe != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, luckyMoneyGiftMeta2.describe);
            }
            if (luckyMoneyGiftMeta2.id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, luckyMoneyGiftMeta2.id);
            }
            if (luckyMoneyGiftMeta2.diamond_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 4, luckyMoneyGiftMeta2.diamond_count);
            }
            if (luckyMoneyGiftMeta2.icon != null) {
                Image.ADAPTER.encodeWithTag(protoWriter2, 5, luckyMoneyGiftMeta2.icon);
            }
            protoWriter2.writeBytes(luckyMoneyGiftMeta.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11840, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11840, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.image = this.image;
        builder.describe = this.describe;
        builder.id = this.id;
        builder.diamond_count = this.diamond_count;
        builder.icon = this.icon;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11842, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11842, new Class[0], Integer.TYPE)).intValue();
        }
        int i6 = this.hashCode;
        if (i6 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.image != null) {
                i = this.image.hashCode();
            } else {
                i = 0;
            }
            int i7 = (hashCode + i) * 37;
            if (this.describe != null) {
                i2 = this.describe.hashCode();
            } else {
                i2 = 0;
            }
            int i8 = (i7 + i2) * 37;
            if (this.id != null) {
                i3 = this.id.hashCode();
            } else {
                i3 = 0;
            }
            int i9 = (i8 + i3) * 37;
            if (this.diamond_count != null) {
                i4 = this.diamond_count.hashCode();
            } else {
                i4 = 0;
            }
            int i10 = (i9 + i4) * 37;
            if (this.icon != null) {
                i5 = this.icon.hashCode();
            }
            i6 = i10 + i5;
            this.hashCode = i6;
        }
        return i6;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11843, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11843, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        if (this.describe != null) {
            sb.append(", describe=");
            sb.append(this.describe);
        }
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.diamond_count != null) {
            sb.append(", diamond_count=");
            sb.append(this.diamond_count);
        }
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        StringBuilder replace = sb.replace(0, 2, "LuckyMoneyGiftMeta{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11841, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11841, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof LuckyMoneyGiftMeta)) {
                return false;
            }
            LuckyMoneyGiftMeta luckyMoneyGiftMeta = (LuckyMoneyGiftMeta) obj;
            if (!unknownFields().equals(luckyMoneyGiftMeta.unknownFields()) || !Internal.equals(this.image, luckyMoneyGiftMeta.image) || !Internal.equals(this.describe, luckyMoneyGiftMeta.describe) || !Internal.equals(this.id, luckyMoneyGiftMeta.id) || !Internal.equals(this.diamond_count, luckyMoneyGiftMeta.diamond_count) || !Internal.equals(this.icon, luckyMoneyGiftMeta.icon)) {
                return false;
            }
            return true;
        }
    }

    public LuckyMoneyGiftMeta(Image image2, String str, Long l, Integer num, Image image3) {
        this(image2, str, l, num, image3, ByteString.EMPTY);
    }

    public LuckyMoneyGiftMeta(Image image2, String str, Long l, Integer num, Image image3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.image = image2;
        this.describe = str;
        this.id = l;
        this.diamond_count = num;
        this.icon = image3;
    }
}
