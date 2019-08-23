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

public final class FansclubStatisticsMessage extends Message<FansclubStatisticsMessage, Builder> {
    public static final ProtoAdapter<FansclubStatisticsMessage> ADAPTER = new ProtoAdapter_FansclubStatisticsMessage();
    public static final Long DEFAULT_FANS_COUNT = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long fans_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String name;

    public static final class Builder extends Message.Builder<FansclubStatisticsMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public Long fans_count;
        public String name;

        public final FansclubStatisticsMessage build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11414, new Class[0], FansclubStatisticsMessage.class)) {
                return new FansclubStatisticsMessage(this.common, this.name, this.fans_count, super.buildUnknownFields());
            }
            return (FansclubStatisticsMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11414, new Class[0], FansclubStatisticsMessage.class);
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder fans_count(Long l) {
            this.fans_count = l;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }
    }

    static final class ProtoAdapter_FansclubStatisticsMessage extends ProtoAdapter<FansclubStatisticsMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_FansclubStatisticsMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, FansclubStatisticsMessage.class);
        }

        public final int encodedSize(FansclubStatisticsMessage fansclubStatisticsMessage) {
            int i;
            int i2;
            FansclubStatisticsMessage fansclubStatisticsMessage2 = fansclubStatisticsMessage;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[]{fansclubStatisticsMessage2}, this, changeQuickRedirect, false, 11415, new Class[]{FansclubStatisticsMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{fansclubStatisticsMessage2}, this, changeQuickRedirect, false, 11415, new Class[]{FansclubStatisticsMessage.class}, Integer.TYPE)).intValue();
            }
            if (fansclubStatisticsMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, fansclubStatisticsMessage2.common);
            } else {
                i = 0;
            }
            if (fansclubStatisticsMessage2.name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, fansclubStatisticsMessage2.name);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (fansclubStatisticsMessage2.fans_count != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, fansclubStatisticsMessage2.fans_count);
            }
            return i4 + i3 + fansclubStatisticsMessage.unknownFields().size();
        }

        public final FansclubStatisticsMessage redact(FansclubStatisticsMessage fansclubStatisticsMessage) {
            if (PatchProxy.isSupport(new Object[]{fansclubStatisticsMessage}, this, changeQuickRedirect, false, 11418, new Class[]{FansclubStatisticsMessage.class}, FansclubStatisticsMessage.class)) {
                return (FansclubStatisticsMessage) PatchProxy.accessDispatch(new Object[]{fansclubStatisticsMessage}, this, changeQuickRedirect, false, 11418, new Class[]{FansclubStatisticsMessage.class}, FansclubStatisticsMessage.class);
            }
            Builder newBuilder = fansclubStatisticsMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final FansclubStatisticsMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11417, new Class[]{ProtoReader.class}, FansclubStatisticsMessage.class)) {
                return (FansclubStatisticsMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11417, new Class[]{ProtoReader.class}, FansclubStatisticsMessage.class);
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
                            builder.name((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder.fans_count((Long) ProtoAdapter.INT64.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, FansclubStatisticsMessage fansclubStatisticsMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            FansclubStatisticsMessage fansclubStatisticsMessage2 = fansclubStatisticsMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, fansclubStatisticsMessage2}, this, changeQuickRedirect, false, 11416, new Class[]{ProtoWriter.class, FansclubStatisticsMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, fansclubStatisticsMessage2}, this, changeQuickRedirect, false, 11416, new Class[]{ProtoWriter.class, FansclubStatisticsMessage.class}, Void.TYPE);
                return;
            }
            if (fansclubStatisticsMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, fansclubStatisticsMessage2.common);
            }
            if (fansclubStatisticsMessage2.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, fansclubStatisticsMessage2.name);
            }
            if (fansclubStatisticsMessage2.fans_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, fansclubStatisticsMessage2.fans_count);
            }
            protoWriter2.writeBytes(fansclubStatisticsMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11410, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11410, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.name = this.name;
        builder.fans_count = this.fans_count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11412, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11412, new Class[0], Integer.TYPE)).intValue();
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
            if (this.name != null) {
                i2 = this.name.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            if (this.fans_count != null) {
                i3 = this.fans_count.hashCode();
            }
            i4 = i6 + i3;
            this.hashCode = i4;
        }
        return i4;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11413, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11413, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.fans_count != null) {
            sb.append(", fans_count=");
            sb.append(this.fans_count);
        }
        StringBuilder replace = sb.replace(0, 2, "FansclubStatisticsMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11411, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11411, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof FansclubStatisticsMessage)) {
                return false;
            }
            FansclubStatisticsMessage fansclubStatisticsMessage = (FansclubStatisticsMessage) obj;
            if (!unknownFields().equals(fansclubStatisticsMessage.unknownFields()) || !Internal.equals(this.common, fansclubStatisticsMessage.common) || !Internal.equals(this.name, fansclubStatisticsMessage.name) || !Internal.equals(this.fans_count, fansclubStatisticsMessage.fans_count)) {
                return false;
            }
            return true;
        }
    }

    public FansclubStatisticsMessage(Common common2, String str, Long l) {
        this(common2, str, l, ByteString.EMPTY);
    }

    public FansclubStatisticsMessage(Common common2, String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.name = str;
        this.fans_count = l;
    }
}
