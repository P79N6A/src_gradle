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

public final class VideoLiveCouponRcmdMessage extends Message<VideoLiveCouponRcmdMessage, Builder> {
    public static final ProtoAdapter<VideoLiveCouponRcmdMessage> ADAPTER = new ProtoAdapter_VideoLiveCouponRcmdMessage();
    public static final Long DEFAULT_RCMD_COUPON_ID = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long rcmd_coupon_id;

    public static final class Builder extends Message.Builder<VideoLiveCouponRcmdMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public Long rcmd_coupon_id;

        public final VideoLiveCouponRcmdMessage build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12458, new Class[0], VideoLiveCouponRcmdMessage.class)) {
                return new VideoLiveCouponRcmdMessage(this.common, this.rcmd_coupon_id, super.buildUnknownFields());
            }
            return (VideoLiveCouponRcmdMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12458, new Class[0], VideoLiveCouponRcmdMessage.class);
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder rcmd_coupon_id(Long l) {
            this.rcmd_coupon_id = l;
            return this;
        }
    }

    static final class ProtoAdapter_VideoLiveCouponRcmdMessage extends ProtoAdapter<VideoLiveCouponRcmdMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_VideoLiveCouponRcmdMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoLiveCouponRcmdMessage.class);
        }

        public final int encodedSize(VideoLiveCouponRcmdMessage videoLiveCouponRcmdMessage) {
            int i;
            VideoLiveCouponRcmdMessage videoLiveCouponRcmdMessage2 = videoLiveCouponRcmdMessage;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{videoLiveCouponRcmdMessage2}, this, changeQuickRedirect, false, 12459, new Class[]{VideoLiveCouponRcmdMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{videoLiveCouponRcmdMessage2}, this, changeQuickRedirect, false, 12459, new Class[]{VideoLiveCouponRcmdMessage.class}, Integer.TYPE)).intValue();
            }
            if (videoLiveCouponRcmdMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, videoLiveCouponRcmdMessage2.common);
            } else {
                i = 0;
            }
            if (videoLiveCouponRcmdMessage2.rcmd_coupon_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, videoLiveCouponRcmdMessage2.rcmd_coupon_id);
            }
            return i + i2 + videoLiveCouponRcmdMessage.unknownFields().size();
        }

        public final VideoLiveCouponRcmdMessage redact(VideoLiveCouponRcmdMessage videoLiveCouponRcmdMessage) {
            if (PatchProxy.isSupport(new Object[]{videoLiveCouponRcmdMessage}, this, changeQuickRedirect, false, 12462, new Class[]{VideoLiveCouponRcmdMessage.class}, VideoLiveCouponRcmdMessage.class)) {
                return (VideoLiveCouponRcmdMessage) PatchProxy.accessDispatch(new Object[]{videoLiveCouponRcmdMessage}, this, changeQuickRedirect, false, 12462, new Class[]{VideoLiveCouponRcmdMessage.class}, VideoLiveCouponRcmdMessage.class);
            }
            Builder newBuilder = videoLiveCouponRcmdMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final VideoLiveCouponRcmdMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12461, new Class[]{ProtoReader.class}, VideoLiveCouponRcmdMessage.class)) {
                return (VideoLiveCouponRcmdMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12461, new Class[]{ProtoReader.class}, VideoLiveCouponRcmdMessage.class);
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
                            builder.rcmd_coupon_id((Long) ProtoAdapter.INT64.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, VideoLiveCouponRcmdMessage videoLiveCouponRcmdMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            VideoLiveCouponRcmdMessage videoLiveCouponRcmdMessage2 = videoLiveCouponRcmdMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, videoLiveCouponRcmdMessage2}, this, changeQuickRedirect, false, 12460, new Class[]{ProtoWriter.class, VideoLiveCouponRcmdMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, videoLiveCouponRcmdMessage2}, this, changeQuickRedirect, false, 12460, new Class[]{ProtoWriter.class, VideoLiveCouponRcmdMessage.class}, Void.TYPE);
                return;
            }
            if (videoLiveCouponRcmdMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, videoLiveCouponRcmdMessage2.common);
            }
            if (videoLiveCouponRcmdMessage2.rcmd_coupon_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, videoLiveCouponRcmdMessage2.rcmd_coupon_id);
            }
            protoWriter2.writeBytes(videoLiveCouponRcmdMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12454, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12454, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.rcmd_coupon_id = this.rcmd_coupon_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12456, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12456, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.rcmd_coupon_id != null) {
                i2 = this.rcmd_coupon_id.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12457, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12457, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.rcmd_coupon_id != null) {
            sb.append(", rcmd_coupon_id=");
            sb.append(this.rcmd_coupon_id);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoLiveCouponRcmdMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12455, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12455, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof VideoLiveCouponRcmdMessage)) {
                return false;
            }
            VideoLiveCouponRcmdMessage videoLiveCouponRcmdMessage = (VideoLiveCouponRcmdMessage) obj;
            if (!unknownFields().equals(videoLiveCouponRcmdMessage.unknownFields()) || !Internal.equals(this.common, videoLiveCouponRcmdMessage.common) || !Internal.equals(this.rcmd_coupon_id, videoLiveCouponRcmdMessage.rcmd_coupon_id)) {
                return false;
            }
            return true;
        }
    }

    public VideoLiveCouponRcmdMessage(Common common2, Long l) {
        this(common2, l, ByteString.EMPTY);
    }

    public VideoLiveCouponRcmdMessage(Common common2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.rcmd_coupon_id = l;
    }
}
