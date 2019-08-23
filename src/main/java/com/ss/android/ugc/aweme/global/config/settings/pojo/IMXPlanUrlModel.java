package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.KtNullable;
import com.bytedance.ies.c.a;
import com.bytedance.ies.c.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class IMXPlanUrlModel extends Message<IMXPlanUrlModel, Builder> {
    public static final DefaultValueProtoAdapter<IMXPlanUrlModel> ADAPTER = new ProtoAdapter_IMXPlanUrlModel();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel#ADAPTER", tag = 2)
    public final UrlModel high;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel#ADAPTER", tag = 1)
    public final UrlModel normal;

    public static final class Builder extends Message.Builder<IMXPlanUrlModel, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public UrlModel high;
        public UrlModel normal;

        public final IMXPlanUrlModel build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48857, new Class[0], IMXPlanUrlModel.class)) {
                return new IMXPlanUrlModel(this.normal, this.high, super.buildUnknownFields());
            }
            return (IMXPlanUrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48857, new Class[0], IMXPlanUrlModel.class);
        }

        public final Builder high(UrlModel urlModel) {
            this.high = urlModel;
            return this;
        }

        public final Builder normal(UrlModel urlModel) {
            this.normal = urlModel;
            return this;
        }
    }

    static final class ProtoAdapter_IMXPlanUrlModel extends DefaultValueProtoAdapter<IMXPlanUrlModel> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final IMXPlanUrlModel redact(IMXPlanUrlModel iMXPlanUrlModel) {
            return iMXPlanUrlModel;
        }

        public ProtoAdapter_IMXPlanUrlModel() {
            super(FieldEncoding.LENGTH_DELIMITED, IMXPlanUrlModel.class);
        }

        public final IMXPlanUrlModel decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48860, new Class[]{ProtoReader.class}, IMXPlanUrlModel.class)) {
                return decode(protoReader2, (IMXPlanUrlModel) null);
            }
            return (IMXPlanUrlModel) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48860, new Class[]{ProtoReader.class}, IMXPlanUrlModel.class);
        }

        public final int encodedSize(IMXPlanUrlModel iMXPlanUrlModel) {
            IMXPlanUrlModel iMXPlanUrlModel2 = iMXPlanUrlModel;
            if (!PatchProxy.isSupport(new Object[]{iMXPlanUrlModel2}, this, changeQuickRedirect, false, 48858, new Class[]{IMXPlanUrlModel.class}, Integer.TYPE)) {
                return UrlModel.ADAPTER.encodedSizeWithTag(1, iMXPlanUrlModel2.normal) + UrlModel.ADAPTER.encodedSizeWithTag(2, iMXPlanUrlModel2.high) + iMXPlanUrlModel.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{iMXPlanUrlModel2}, this, changeQuickRedirect, false, 48858, new Class[]{IMXPlanUrlModel.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, IMXPlanUrlModel iMXPlanUrlModel) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            IMXPlanUrlModel iMXPlanUrlModel2 = iMXPlanUrlModel;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, iMXPlanUrlModel2}, this, changeQuickRedirect, false, 48859, new Class[]{ProtoWriter.class, IMXPlanUrlModel.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, iMXPlanUrlModel2}, this, changeQuickRedirect, false, 48859, new Class[]{ProtoWriter.class, IMXPlanUrlModel.class}, Void.TYPE);
                return;
            }
            UrlModel.ADAPTER.encodeWithTag(protoWriter2, 1, iMXPlanUrlModel2.normal);
            UrlModel.ADAPTER.encodeWithTag(protoWriter2, 2, iMXPlanUrlModel2.high);
            protoWriter2.writeBytes(iMXPlanUrlModel.unknownFields());
        }

        public final IMXPlanUrlModel decode(ProtoReader protoReader, IMXPlanUrlModel iMXPlanUrlModel) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            IMXPlanUrlModel iMXPlanUrlModel2 = iMXPlanUrlModel;
            if (PatchProxy.isSupport(new Object[]{protoReader2, iMXPlanUrlModel2}, this, changeQuickRedirect, false, 48861, new Class[]{ProtoReader.class, IMXPlanUrlModel.class}, IMXPlanUrlModel.class)) {
                return (IMXPlanUrlModel) PatchProxy.accessDispatch(new Object[]{protoReader2, iMXPlanUrlModel2}, this, changeQuickRedirect, false, 48861, new Class[]{ProtoReader.class, IMXPlanUrlModel.class}, IMXPlanUrlModel.class);
            }
            IMXPlanUrlModel iMXPlanUrlModel3 = (IMXPlanUrlModel) a.a().a(IMXPlanUrlModel.class, iMXPlanUrlModel2);
            if (iMXPlanUrlModel3 != null) {
                builder = iMXPlanUrlModel3.newBuilder();
            } else {
                builder = new Builder();
            }
            Builder builder2 = builder;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder2.normal((UrlModel) UrlModel.ADAPTER.decode(protoReader2, builder2.normal));
                            break;
                        case 2:
                            builder2.high((UrlModel) UrlModel.ADAPTER.decode(protoReader2, builder2.high));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (iMXPlanUrlModel3 != null) {
                                    break;
                                } else {
                                    throw e2;
                                }
                            }
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    return builder2.build();
                }
            }
        }
    }

    @KtNullable
    public final UrlModel getHigh() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48852, new Class[0], UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48852, new Class[0], UrlModel.class);
        } else if (this.high != null) {
            return this.high;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final UrlModel getNormal() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48851, new Class[0], UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48851, new Class[0], UrlModel.class);
        } else if (this.normal != null) {
            return this.normal;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48853, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48853, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.normal = this.normal;
        builder.high = this.high;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48855, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48855, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.normal != null) {
                i = this.normal.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.high != null) {
                i2 = this.high.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48856, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48856, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.normal != null) {
            sb.append(", normal=");
            sb.append(this.normal);
        }
        if (this.high != null) {
            sb.append(", high=");
            sb.append(this.high);
        }
        StringBuilder replace = sb.replace(0, 2, "IMXPlanUrlModel{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 48854, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 48854, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof IMXPlanUrlModel)) {
                return false;
            }
            IMXPlanUrlModel iMXPlanUrlModel = (IMXPlanUrlModel) obj;
            if (!unknownFields().equals(iMXPlanUrlModel.unknownFields()) || !Internal.equals(this.normal, iMXPlanUrlModel.normal) || !Internal.equals(this.high, iMXPlanUrlModel.high)) {
                return false;
            }
            return true;
        }
    }

    public IMXPlanUrlModel(UrlModel urlModel, UrlModel urlModel2) {
        this(urlModel, urlModel2, ByteString.EMPTY);
    }

    public IMXPlanUrlModel(UrlModel urlModel, UrlModel urlModel2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.normal = urlModel;
        this.high = urlModel2;
    }
}
