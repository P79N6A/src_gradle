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

public final class LotteryDefaultConfig extends Message<LotteryDefaultConfig, Builder> {
    public static final ProtoAdapter<LotteryDefaultConfig> ADAPTER = new ProtoAdapter_LotteryDefaultConfig();
    public static final Long DEFAULT_COUNT_DOWN = 0L;
    public static final Long DEFAULT_PRIZE_COUNT = 0L;
    public static final Long DEFAULT_USER_NUM = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long count_down;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long prize_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long user_num;

    public static final class Builder extends Message.Builder<LotteryDefaultConfig, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Long count_down;
        public Long prize_count;
        public Long user_num;

        public final LotteryDefaultConfig build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11769, new Class[0], LotteryDefaultConfig.class)) {
                return new LotteryDefaultConfig(this.count_down, this.user_num, this.prize_count, super.buildUnknownFields());
            }
            return (LotteryDefaultConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11769, new Class[0], LotteryDefaultConfig.class);
        }

        public final Builder count_down(Long l) {
            this.count_down = l;
            return this;
        }

        public final Builder prize_count(Long l) {
            this.prize_count = l;
            return this;
        }

        public final Builder user_num(Long l) {
            this.user_num = l;
            return this;
        }
    }

    static final class ProtoAdapter_LotteryDefaultConfig extends ProtoAdapter<LotteryDefaultConfig> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_LotteryDefaultConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, LotteryDefaultConfig.class);
        }

        public final int encodedSize(LotteryDefaultConfig lotteryDefaultConfig) {
            int i;
            int i2;
            LotteryDefaultConfig lotteryDefaultConfig2 = lotteryDefaultConfig;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[]{lotteryDefaultConfig2}, this, changeQuickRedirect, false, 11770, new Class[]{LotteryDefaultConfig.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{lotteryDefaultConfig2}, this, changeQuickRedirect, false, 11770, new Class[]{LotteryDefaultConfig.class}, Integer.TYPE)).intValue();
            }
            if (lotteryDefaultConfig2.count_down != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, lotteryDefaultConfig2.count_down);
            } else {
                i = 0;
            }
            if (lotteryDefaultConfig2.user_num != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, lotteryDefaultConfig2.user_num);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (lotteryDefaultConfig2.prize_count != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, lotteryDefaultConfig2.prize_count);
            }
            return i4 + i3 + lotteryDefaultConfig.unknownFields().size();
        }

        public final LotteryDefaultConfig redact(LotteryDefaultConfig lotteryDefaultConfig) {
            if (PatchProxy.isSupport(new Object[]{lotteryDefaultConfig}, this, changeQuickRedirect, false, 11773, new Class[]{LotteryDefaultConfig.class}, LotteryDefaultConfig.class)) {
                return (LotteryDefaultConfig) PatchProxy.accessDispatch(new Object[]{lotteryDefaultConfig}, this, changeQuickRedirect, false, 11773, new Class[]{LotteryDefaultConfig.class}, LotteryDefaultConfig.class);
            }
            Builder newBuilder = lotteryDefaultConfig.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final LotteryDefaultConfig decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11772, new Class[]{ProtoReader.class}, LotteryDefaultConfig.class)) {
                return (LotteryDefaultConfig) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11772, new Class[]{ProtoReader.class}, LotteryDefaultConfig.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.count_down((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 2:
                            builder.user_num((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 3:
                            builder.prize_count((Long) ProtoAdapter.INT64.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, LotteryDefaultConfig lotteryDefaultConfig) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            LotteryDefaultConfig lotteryDefaultConfig2 = lotteryDefaultConfig;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, lotteryDefaultConfig2}, this, changeQuickRedirect, false, 11771, new Class[]{ProtoWriter.class, LotteryDefaultConfig.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, lotteryDefaultConfig2}, this, changeQuickRedirect, false, 11771, new Class[]{ProtoWriter.class, LotteryDefaultConfig.class}, Void.TYPE);
                return;
            }
            if (lotteryDefaultConfig2.count_down != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, lotteryDefaultConfig2.count_down);
            }
            if (lotteryDefaultConfig2.user_num != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, lotteryDefaultConfig2.user_num);
            }
            if (lotteryDefaultConfig2.prize_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, lotteryDefaultConfig2.prize_count);
            }
            protoWriter2.writeBytes(lotteryDefaultConfig.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11765, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11765, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.count_down = this.count_down;
        builder.user_num = this.user_num;
        builder.prize_count = this.prize_count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11767, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11767, new Class[0], Integer.TYPE)).intValue();
        }
        int i4 = this.hashCode;
        if (i4 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.count_down != null) {
                i = this.count_down.hashCode();
            } else {
                i = 0;
            }
            int i5 = (hashCode + i) * 37;
            if (this.user_num != null) {
                i2 = this.user_num.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            if (this.prize_count != null) {
                i3 = this.prize_count.hashCode();
            }
            i4 = i6 + i3;
            this.hashCode = i4;
        }
        return i4;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11768, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11768, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.count_down != null) {
            sb.append(", count_down=");
            sb.append(this.count_down);
        }
        if (this.user_num != null) {
            sb.append(", user_num=");
            sb.append(this.user_num);
        }
        if (this.prize_count != null) {
            sb.append(", prize_count=");
            sb.append(this.prize_count);
        }
        StringBuilder replace = sb.replace(0, 2, "LotteryDefaultConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11766, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11766, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof LotteryDefaultConfig)) {
                return false;
            }
            LotteryDefaultConfig lotteryDefaultConfig = (LotteryDefaultConfig) obj;
            if (!unknownFields().equals(lotteryDefaultConfig.unknownFields()) || !Internal.equals(this.count_down, lotteryDefaultConfig.count_down) || !Internal.equals(this.user_num, lotteryDefaultConfig.user_num) || !Internal.equals(this.prize_count, lotteryDefaultConfig.prize_count)) {
                return false;
            }
            return true;
        }
    }

    public LotteryDefaultConfig(Long l, Long l2, Long l3) {
        this(l, l2, l3, ByteString.EMPTY);
    }

    public LotteryDefaultConfig(Long l, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.count_down = l;
        this.user_num = l2;
        this.prize_count = l3;
    }
}
