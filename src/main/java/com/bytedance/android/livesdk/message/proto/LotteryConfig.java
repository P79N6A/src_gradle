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
import java.util.List;
import okio.ByteString;

public final class LotteryConfig extends Message<LotteryConfig, Builder> {
    public static final ProtoAdapter<LotteryConfig> ADAPTER = new ProtoAdapter_LotteryConfig();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REPEATED, tag = 3)
    public final List<Long> count_downs;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.LotteryDefaultConfig#ADAPTER", tag = 4)
    public final LotteryDefaultConfig default_config;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REPEATED, tag = 2)
    public final List<Long> prize_counts;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REPEATED, tag = 1)
    public final List<Long> user_nums;

    public static final class Builder extends Message.Builder<LotteryConfig, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public List<Long> count_downs = Internal.newMutableList();
        public LotteryDefaultConfig default_config;
        public List<Long> prize_counts = Internal.newMutableList();
        public List<Long> user_nums = Internal.newMutableList();

        public final LotteryConfig build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11760, new Class[0], LotteryConfig.class)) {
                return (LotteryConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11760, new Class[0], LotteryConfig.class);
            }
            LotteryConfig lotteryConfig = new LotteryConfig(this.count_downs, this.user_nums, this.prize_counts, this.default_config, super.buildUnknownFields());
            return lotteryConfig;
        }

        public final Builder default_config(LotteryDefaultConfig lotteryDefaultConfig) {
            this.default_config = lotteryDefaultConfig;
            return this;
        }

        public final Builder count_downs(List<Long> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 11757, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 11757, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.count_downs = list;
            return this;
        }

        public final Builder prize_counts(List<Long> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 11759, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 11759, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.prize_counts = list;
            return this;
        }

        public final Builder user_nums(List<Long> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 11758, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 11758, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.user_nums = list;
            return this;
        }
    }

    static final class ProtoAdapter_LotteryConfig extends ProtoAdapter<LotteryConfig> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_LotteryConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, LotteryConfig.class);
        }

        public final int encodedSize(LotteryConfig lotteryConfig) {
            LotteryConfig lotteryConfig2 = lotteryConfig;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{lotteryConfig2}, this, changeQuickRedirect, false, 11761, new Class[]{LotteryConfig.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{lotteryConfig2}, this, changeQuickRedirect, false, 11761, new Class[]{LotteryConfig.class}, Integer.TYPE)).intValue();
            }
            int encodedSizeWithTag = ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(3, lotteryConfig2.count_downs) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, lotteryConfig2.user_nums) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(2, lotteryConfig2.prize_counts);
            if (lotteryConfig2.default_config != null) {
                i = LotteryDefaultConfig.ADAPTER.encodedSizeWithTag(4, lotteryConfig2.default_config);
            }
            return encodedSizeWithTag + i + lotteryConfig.unknownFields().size();
        }

        public final LotteryConfig redact(LotteryConfig lotteryConfig) {
            if (PatchProxy.isSupport(new Object[]{lotteryConfig}, this, changeQuickRedirect, false, 11764, new Class[]{LotteryConfig.class}, LotteryConfig.class)) {
                return (LotteryConfig) PatchProxy.accessDispatch(new Object[]{lotteryConfig}, this, changeQuickRedirect, false, 11764, new Class[]{LotteryConfig.class}, LotteryConfig.class);
            }
            Builder newBuilder = lotteryConfig.newBuilder();
            if (newBuilder.default_config != null) {
                newBuilder.default_config = (LotteryDefaultConfig) LotteryDefaultConfig.ADAPTER.redact(newBuilder.default_config);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final LotteryConfig decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11763, new Class[]{ProtoReader.class}, LotteryConfig.class)) {
                return (LotteryConfig) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11763, new Class[]{ProtoReader.class}, LotteryConfig.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.user_nums.add(ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 2:
                            builder.prize_counts.add(ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 3:
                            builder.count_downs.add(ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.default_config((LotteryDefaultConfig) LotteryDefaultConfig.ADAPTER.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, LotteryConfig lotteryConfig) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            LotteryConfig lotteryConfig2 = lotteryConfig;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, lotteryConfig2}, this, changeQuickRedirect, false, 11762, new Class[]{ProtoWriter.class, LotteryConfig.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, lotteryConfig2}, this, changeQuickRedirect, false, 11762, new Class[]{ProtoWriter.class, LotteryConfig.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter2, 3, lotteryConfig2.count_downs);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter2, 1, lotteryConfig2.user_nums);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter2, 2, lotteryConfig2.prize_counts);
            if (lotteryConfig2.default_config != null) {
                LotteryDefaultConfig.ADAPTER.encodeWithTag(protoWriter2, 4, lotteryConfig2.default_config);
            }
            protoWriter2.writeBytes(lotteryConfig.unknownFields());
        }
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11755, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11755, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = ((((((unknownFields().hashCode() * 37) + this.count_downs.hashCode()) * 37) + this.user_nums.hashCode()) * 37) + this.prize_counts.hashCode()) * 37;
            if (this.default_config != null) {
                i = this.default_config.hashCode();
            }
            i2 = hashCode + i;
            this.hashCode = i2;
        }
        return i2;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11753, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11753, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.count_downs = Internal.copyOf("count_downs", this.count_downs);
        builder.user_nums = Internal.copyOf("user_nums", this.user_nums);
        builder.prize_counts = Internal.copyOf("prize_counts", this.prize_counts);
        builder.default_config = this.default_config;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11756, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11756, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (!this.count_downs.isEmpty()) {
            sb.append(", count_downs=");
            sb.append(this.count_downs);
        }
        if (!this.user_nums.isEmpty()) {
            sb.append(", user_nums=");
            sb.append(this.user_nums);
        }
        if (!this.prize_counts.isEmpty()) {
            sb.append(", prize_counts=");
            sb.append(this.prize_counts);
        }
        if (this.default_config != null) {
            sb.append(", default_config=");
            sb.append(this.default_config);
        }
        StringBuilder replace = sb.replace(0, 2, "LotteryConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11754, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11754, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof LotteryConfig)) {
                return false;
            }
            LotteryConfig lotteryConfig = (LotteryConfig) obj;
            if (!unknownFields().equals(lotteryConfig.unknownFields()) || !this.count_downs.equals(lotteryConfig.count_downs) || !this.user_nums.equals(lotteryConfig.user_nums) || !this.prize_counts.equals(lotteryConfig.prize_counts) || !Internal.equals(this.default_config, lotteryConfig.default_config)) {
                return false;
            }
            return true;
        }
    }

    public LotteryConfig(List<Long> list, List<Long> list2, List<Long> list3, LotteryDefaultConfig lotteryDefaultConfig) {
        this(list, list2, list3, lotteryDefaultConfig, ByteString.EMPTY);
    }

    public LotteryConfig(List<Long> list, List<Long> list2, List<Long> list3, LotteryDefaultConfig lotteryDefaultConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.count_downs = Internal.immutableCopyOf("count_downs", list);
        this.user_nums = Internal.immutableCopyOf("user_nums", list2);
        this.prize_counts = Internal.immutableCopyOf("prize_counts", list3);
        this.default_config = lotteryDefaultConfig;
    }
}
