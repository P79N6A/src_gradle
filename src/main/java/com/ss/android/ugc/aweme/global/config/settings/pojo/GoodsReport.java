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

public final class GoodsReport extends Message<GoodsReport, Builder> {
    public static final DefaultValueProtoAdapter<GoodsReport> ADAPTER = new ProtoAdapter_GoodsReport();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String publish;

    public static final class Builder extends Message.Builder<GoodsReport, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String publish;

        public final GoodsReport build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47991, new Class[0], GoodsReport.class)) {
                return new GoodsReport(this.publish, super.buildUnknownFields());
            }
            return (GoodsReport) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47991, new Class[0], GoodsReport.class);
        }

        public final Builder publish(String str) {
            this.publish = str;
            return this;
        }
    }

    static final class ProtoAdapter_GoodsReport extends DefaultValueProtoAdapter<GoodsReport> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final GoodsReport redact(GoodsReport goodsReport) {
            return goodsReport;
        }

        public ProtoAdapter_GoodsReport() {
            super(FieldEncoding.LENGTH_DELIMITED, GoodsReport.class);
        }

        public final GoodsReport decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47994, new Class[]{ProtoReader.class}, GoodsReport.class)) {
                return decode(protoReader2, (GoodsReport) null);
            }
            return (GoodsReport) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47994, new Class[]{ProtoReader.class}, GoodsReport.class);
        }

        public final int encodedSize(GoodsReport goodsReport) {
            GoodsReport goodsReport2 = goodsReport;
            if (!PatchProxy.isSupport(new Object[]{goodsReport2}, this, changeQuickRedirect, false, 47992, new Class[]{GoodsReport.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, goodsReport2.publish) + goodsReport.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{goodsReport2}, this, changeQuickRedirect, false, 47992, new Class[]{GoodsReport.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, GoodsReport goodsReport) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            GoodsReport goodsReport2 = goodsReport;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, goodsReport2}, this, changeQuickRedirect, false, 47993, new Class[]{ProtoWriter.class, GoodsReport.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, goodsReport2}, this, changeQuickRedirect, false, 47993, new Class[]{ProtoWriter.class, GoodsReport.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, goodsReport2.publish);
            protoWriter2.writeBytes(goodsReport.unknownFields());
        }

        public final GoodsReport decode(ProtoReader protoReader, GoodsReport goodsReport) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            GoodsReport goodsReport2 = goodsReport;
            if (PatchProxy.isSupport(new Object[]{protoReader2, goodsReport2}, this, changeQuickRedirect, false, 47995, new Class[]{ProtoReader.class, GoodsReport.class}, GoodsReport.class)) {
                return (GoodsReport) PatchProxy.accessDispatch(new Object[]{protoReader2, goodsReport2}, this, changeQuickRedirect, false, 47995, new Class[]{ProtoReader.class, GoodsReport.class}, GoodsReport.class);
            }
            GoodsReport goodsReport3 = (GoodsReport) a.a().a(GoodsReport.class, goodsReport2);
            if (goodsReport3 != null) {
                builder = goodsReport3.newBuilder();
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
                        if (goodsReport3 == null) {
                            throw e2;
                        }
                    }
                } else {
                    builder2.publish((String) ProtoAdapter.STRING.decode(protoReader2));
                }
            }
        }
    }

    @KtNullable
    public final String getPublish() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47986, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47986, new Class[0], String.class);
        } else if (this.publish != null) {
            return this.publish;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47987, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47987, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.publish = this.publish;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47989, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47989, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.publish != null) {
                i = this.publish.hashCode();
            }
            i2 = hashCode + i;
            this.hashCode = i2;
        }
        return i2;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47990, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47990, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.publish != null) {
            sb.append(", publish=");
            sb.append(this.publish);
        }
        StringBuilder replace = sb.replace(0, 2, "GoodsReport{");
        replace.append('}');
        return replace.toString();
    }

    public GoodsReport(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47988, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47988, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof GoodsReport)) {
                return false;
            }
            GoodsReport goodsReport = (GoodsReport) obj;
            if (!unknownFields().equals(goodsReport.unknownFields()) || !Internal.equals(this.publish, goodsReport.publish)) {
                return false;
            }
            return true;
        }
    }

    public GoodsReport(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.publish = str;
    }
}
