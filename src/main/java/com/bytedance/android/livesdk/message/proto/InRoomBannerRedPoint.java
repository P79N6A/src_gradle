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

public final class InRoomBannerRedPoint extends Message<InRoomBannerRedPoint, Builder> {
    public static final ProtoAdapter<InRoomBannerRedPoint> ADAPTER = new ProtoAdapter_InRoomBannerRedPoint();
    public static final Long DEFAULT_BANNER_ID = 0L;
    public static final Long DEFAULT_COUNT = 0L;
    public static final Long DEFAULT_SHOW_TYPE = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long banner_id;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long show_type;

    public static final class Builder extends Message.Builder<InRoomBannerRedPoint, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Long banner_id;
        public Common common;
        public Long count;
        public Long show_type;

        public final InRoomBannerRedPoint build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11602, new Class[0], InRoomBannerRedPoint.class)) {
                return (InRoomBannerRedPoint) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11602, new Class[0], InRoomBannerRedPoint.class);
            }
            InRoomBannerRedPoint inRoomBannerRedPoint = new InRoomBannerRedPoint(this.common, this.count, this.banner_id, this.show_type, super.buildUnknownFields());
            return inRoomBannerRedPoint;
        }

        public final Builder banner_id(Long l) {
            this.banner_id = l;
            return this;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder count(Long l) {
            this.count = l;
            return this;
        }

        public final Builder show_type(Long l) {
            this.show_type = l;
            return this;
        }
    }

    static final class ProtoAdapter_InRoomBannerRedPoint extends ProtoAdapter<InRoomBannerRedPoint> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_InRoomBannerRedPoint() {
            super(FieldEncoding.LENGTH_DELIMITED, InRoomBannerRedPoint.class);
        }

        public final InRoomBannerRedPoint redact(InRoomBannerRedPoint inRoomBannerRedPoint) {
            if (PatchProxy.isSupport(new Object[]{inRoomBannerRedPoint}, this, changeQuickRedirect, false, 11606, new Class[]{InRoomBannerRedPoint.class}, InRoomBannerRedPoint.class)) {
                return (InRoomBannerRedPoint) PatchProxy.accessDispatch(new Object[]{inRoomBannerRedPoint}, this, changeQuickRedirect, false, 11606, new Class[]{InRoomBannerRedPoint.class}, InRoomBannerRedPoint.class);
            }
            Builder newBuilder = inRoomBannerRedPoint.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final InRoomBannerRedPoint decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11605, new Class[]{ProtoReader.class}, InRoomBannerRedPoint.class)) {
                return (InRoomBannerRedPoint) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11605, new Class[]{ProtoReader.class}, InRoomBannerRedPoint.class);
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
                            builder.count((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 3:
                            builder.banner_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.show_type((Long) ProtoAdapter.INT64.decode(protoReader2));
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

        public final int encodedSize(InRoomBannerRedPoint inRoomBannerRedPoint) {
            int i;
            int i2;
            int i3;
            InRoomBannerRedPoint inRoomBannerRedPoint2 = inRoomBannerRedPoint;
            int i4 = 0;
            if (PatchProxy.isSupport(new Object[]{inRoomBannerRedPoint2}, this, changeQuickRedirect, false, 11603, new Class[]{InRoomBannerRedPoint.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{inRoomBannerRedPoint2}, this, changeQuickRedirect, false, 11603, new Class[]{InRoomBannerRedPoint.class}, Integer.TYPE)).intValue();
            }
            if (inRoomBannerRedPoint2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, inRoomBannerRedPoint2.common);
            } else {
                i = 0;
            }
            if (inRoomBannerRedPoint2.count != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, inRoomBannerRedPoint2.count);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (inRoomBannerRedPoint2.banner_id != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, inRoomBannerRedPoint2.banner_id);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (inRoomBannerRedPoint2.show_type != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, inRoomBannerRedPoint2.show_type);
            }
            return i6 + i4 + inRoomBannerRedPoint.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, InRoomBannerRedPoint inRoomBannerRedPoint) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            InRoomBannerRedPoint inRoomBannerRedPoint2 = inRoomBannerRedPoint;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, inRoomBannerRedPoint2}, this, changeQuickRedirect, false, 11604, new Class[]{ProtoWriter.class, InRoomBannerRedPoint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, inRoomBannerRedPoint2}, this, changeQuickRedirect, false, 11604, new Class[]{ProtoWriter.class, InRoomBannerRedPoint.class}, Void.TYPE);
                return;
            }
            if (inRoomBannerRedPoint2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, inRoomBannerRedPoint2.common);
            }
            if (inRoomBannerRedPoint2.count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, inRoomBannerRedPoint2.count);
            }
            if (inRoomBannerRedPoint2.banner_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, inRoomBannerRedPoint2.banner_id);
            }
            if (inRoomBannerRedPoint2.show_type != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, inRoomBannerRedPoint2.show_type);
            }
            protoWriter2.writeBytes(inRoomBannerRedPoint.unknownFields());
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11600, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11600, new Class[0], Integer.TYPE)).intValue();
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
            if (this.count != null) {
                i2 = this.count.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 37;
            if (this.banner_id != null) {
                i3 = this.banner_id.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 37;
            if (this.show_type != null) {
                i4 = this.show_type.hashCode();
            }
            i5 = i8 + i4;
            this.hashCode = i5;
        }
        return i5;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11598, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11598, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.count = this.count;
        builder.banner_id = this.banner_id;
        builder.show_type = this.show_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11601, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11601, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.banner_id != null) {
            sb.append(", banner_id=");
            sb.append(this.banner_id);
        }
        if (this.show_type != null) {
            sb.append(", show_type=");
            sb.append(this.show_type);
        }
        StringBuilder replace = sb.replace(0, 2, "InRoomBannerRedPoint{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11599, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11599, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof InRoomBannerRedPoint)) {
                return false;
            }
            InRoomBannerRedPoint inRoomBannerRedPoint = (InRoomBannerRedPoint) obj;
            if (!unknownFields().equals(inRoomBannerRedPoint.unknownFields()) || !Internal.equals(this.common, inRoomBannerRedPoint.common) || !Internal.equals(this.count, inRoomBannerRedPoint.count) || !Internal.equals(this.banner_id, inRoomBannerRedPoint.banner_id) || !Internal.equals(this.show_type, inRoomBannerRedPoint.show_type)) {
                return false;
            }
            return true;
        }
    }

    public InRoomBannerRedPoint(Common common2, Long l, Long l2, Long l3) {
        this(common2, l, l2, l3, ByteString.EMPTY);
    }

    public InRoomBannerRedPoint(Common common2, Long l, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.count = l;
        this.banner_id = l2;
        this.show_type = l3;
    }
}
