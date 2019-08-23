package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.KtNullable;
import com.bytedance.ies.c.a;
import com.bytedance.ies.c.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class AdCouponConfig extends Message<AdCouponConfig, Builder> {
    public static final DefaultValueProtoAdapter<AdCouponConfig> ADAPTER = new ProtoAdapter_AdCouponConfig();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer show;

    public static final class Builder extends Message.Builder<AdCouponConfig, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer show;

        public final AdCouponConfig build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47634, new Class[0], AdCouponConfig.class)) {
                return new AdCouponConfig(this.show, super.buildUnknownFields());
            }
            return (AdCouponConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47634, new Class[0], AdCouponConfig.class);
        }

        public final Builder show(Integer num) {
            this.show = num;
            return this;
        }
    }

    static final class ProtoAdapter_AdCouponConfig extends DefaultValueProtoAdapter<AdCouponConfig> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final AdCouponConfig redact(AdCouponConfig adCouponConfig) {
            return adCouponConfig;
        }

        public ProtoAdapter_AdCouponConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, AdCouponConfig.class);
        }

        public final AdCouponConfig decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47637, new Class[]{ProtoReader.class}, AdCouponConfig.class)) {
                return decode(protoReader2, (AdCouponConfig) null);
            }
            return (AdCouponConfig) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47637, new Class[]{ProtoReader.class}, AdCouponConfig.class);
        }

        public final int encodedSize(AdCouponConfig adCouponConfig) {
            AdCouponConfig adCouponConfig2 = adCouponConfig;
            if (!PatchProxy.isSupport(new Object[]{adCouponConfig2}, this, changeQuickRedirect, false, 47635, new Class[]{AdCouponConfig.class}, Integer.TYPE)) {
                return ProtoAdapter.INT32.encodedSizeWithTag(1, adCouponConfig2.show) + adCouponConfig.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{adCouponConfig2}, this, changeQuickRedirect, false, 47635, new Class[]{AdCouponConfig.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, AdCouponConfig adCouponConfig) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            AdCouponConfig adCouponConfig2 = adCouponConfig;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, adCouponConfig2}, this, changeQuickRedirect, false, 47636, new Class[]{ProtoWriter.class, AdCouponConfig.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, adCouponConfig2}, this, changeQuickRedirect, false, 47636, new Class[]{ProtoWriter.class, AdCouponConfig.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1, adCouponConfig2.show);
            protoWriter2.writeBytes(adCouponConfig.unknownFields());
        }

        public final AdCouponConfig decode(ProtoReader protoReader, AdCouponConfig adCouponConfig) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            AdCouponConfig adCouponConfig2 = adCouponConfig;
            if (PatchProxy.isSupport(new Object[]{protoReader2, adCouponConfig2}, this, changeQuickRedirect, false, 47638, new Class[]{ProtoReader.class, AdCouponConfig.class}, AdCouponConfig.class)) {
                return (AdCouponConfig) PatchProxy.accessDispatch(new Object[]{protoReader2, adCouponConfig2}, this, changeQuickRedirect, false, 47638, new Class[]{ProtoReader.class, AdCouponConfig.class}, AdCouponConfig.class);
            }
            AdCouponConfig adCouponConfig3 = (AdCouponConfig) a.a().a(AdCouponConfig.class, adCouponConfig2);
            if (adCouponConfig3 != null) {
                builder = adCouponConfig3.newBuilder();
            } else {
                builder = new Builder();
            }
            Builder builder2 = builder;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader2.endMessage(beginMessage);
                    return builder2.build();
                } else if (nextTag != 1) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                    } catch (b e2) {
                        if (adCouponConfig3 == null) {
                            throw e2;
                        }
                    }
                } else {
                    builder2.show((Integer) ProtoAdapter.INT32.decode(protoReader2));
                }
            }
        }
    }

    @KtNullable
    public final Integer getShow() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47629, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47629, new Class[0], Integer.class);
        } else if (this.show != null) {
            return this.show;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47630, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47630, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.show = this.show;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47632, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47632, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.show != null) {
                i = this.show.hashCode();
            }
            i2 = hashCode + i;
            this.hashCode = i2;
        }
        return i2;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47633, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47633, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.show != null) {
            sb.append(", show=");
            sb.append(this.show);
        }
        StringBuilder replace = sb.replace(0, 2, "AdCouponConfig{");
        replace.append('}');
        return replace.toString();
    }

    public AdCouponConfig(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47631, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47631, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof AdCouponConfig)) {
                return false;
            }
            AdCouponConfig adCouponConfig = (AdCouponConfig) obj;
            if (!unknownFields().equals(adCouponConfig.unknownFields()) || !Internal.equals(this.show, adCouponConfig.show)) {
                return false;
            }
            return true;
        }
    }

    public AdCouponConfig(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.show = num;
    }
}
