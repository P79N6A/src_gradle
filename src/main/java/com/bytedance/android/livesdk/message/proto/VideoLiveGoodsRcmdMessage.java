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

public final class VideoLiveGoodsRcmdMessage extends Message<VideoLiveGoodsRcmdMessage, Builder> {
    public static final ProtoAdapter<VideoLiveGoodsRcmdMessage> ADAPTER = new ProtoAdapter_VideoLiveGoodsRcmdMessage();
    public static final Long DEFAULT_RCMD_GOODS_ID = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long rcmd_goods_id;

    public static final class Builder extends Message.Builder<VideoLiveGoodsRcmdMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public Long rcmd_goods_id;

        public final VideoLiveGoodsRcmdMessage build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12485, new Class[0], VideoLiveGoodsRcmdMessage.class)) {
                return new VideoLiveGoodsRcmdMessage(this.common, this.rcmd_goods_id, super.buildUnknownFields());
            }
            return (VideoLiveGoodsRcmdMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12485, new Class[0], VideoLiveGoodsRcmdMessage.class);
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder rcmd_goods_id(Long l) {
            this.rcmd_goods_id = l;
            return this;
        }
    }

    static final class ProtoAdapter_VideoLiveGoodsRcmdMessage extends ProtoAdapter<VideoLiveGoodsRcmdMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_VideoLiveGoodsRcmdMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoLiveGoodsRcmdMessage.class);
        }

        public final int encodedSize(VideoLiveGoodsRcmdMessage videoLiveGoodsRcmdMessage) {
            int i;
            VideoLiveGoodsRcmdMessage videoLiveGoodsRcmdMessage2 = videoLiveGoodsRcmdMessage;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{videoLiveGoodsRcmdMessage2}, this, changeQuickRedirect, false, 12486, new Class[]{VideoLiveGoodsRcmdMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{videoLiveGoodsRcmdMessage2}, this, changeQuickRedirect, false, 12486, new Class[]{VideoLiveGoodsRcmdMessage.class}, Integer.TYPE)).intValue();
            }
            if (videoLiveGoodsRcmdMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, videoLiveGoodsRcmdMessage2.common);
            } else {
                i = 0;
            }
            if (videoLiveGoodsRcmdMessage2.rcmd_goods_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, videoLiveGoodsRcmdMessage2.rcmd_goods_id);
            }
            return i + i2 + videoLiveGoodsRcmdMessage.unknownFields().size();
        }

        public final VideoLiveGoodsRcmdMessage redact(VideoLiveGoodsRcmdMessage videoLiveGoodsRcmdMessage) {
            if (PatchProxy.isSupport(new Object[]{videoLiveGoodsRcmdMessage}, this, changeQuickRedirect, false, 12489, new Class[]{VideoLiveGoodsRcmdMessage.class}, VideoLiveGoodsRcmdMessage.class)) {
                return (VideoLiveGoodsRcmdMessage) PatchProxy.accessDispatch(new Object[]{videoLiveGoodsRcmdMessage}, this, changeQuickRedirect, false, 12489, new Class[]{VideoLiveGoodsRcmdMessage.class}, VideoLiveGoodsRcmdMessage.class);
            }
            Builder newBuilder = videoLiveGoodsRcmdMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final VideoLiveGoodsRcmdMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12488, new Class[]{ProtoReader.class}, VideoLiveGoodsRcmdMessage.class)) {
                return (VideoLiveGoodsRcmdMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12488, new Class[]{ProtoReader.class}, VideoLiveGoodsRcmdMessage.class);
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
                            builder.rcmd_goods_id((Long) ProtoAdapter.INT64.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, VideoLiveGoodsRcmdMessage videoLiveGoodsRcmdMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            VideoLiveGoodsRcmdMessage videoLiveGoodsRcmdMessage2 = videoLiveGoodsRcmdMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, videoLiveGoodsRcmdMessage2}, this, changeQuickRedirect, false, 12487, new Class[]{ProtoWriter.class, VideoLiveGoodsRcmdMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, videoLiveGoodsRcmdMessage2}, this, changeQuickRedirect, false, 12487, new Class[]{ProtoWriter.class, VideoLiveGoodsRcmdMessage.class}, Void.TYPE);
                return;
            }
            if (videoLiveGoodsRcmdMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, videoLiveGoodsRcmdMessage2.common);
            }
            if (videoLiveGoodsRcmdMessage2.rcmd_goods_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, videoLiveGoodsRcmdMessage2.rcmd_goods_id);
            }
            protoWriter2.writeBytes(videoLiveGoodsRcmdMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12481, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12481, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.rcmd_goods_id = this.rcmd_goods_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12483, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12483, new Class[0], Integer.TYPE)).intValue();
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
            if (this.rcmd_goods_id != null) {
                i2 = this.rcmd_goods_id.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12484, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12484, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.rcmd_goods_id != null) {
            sb.append(", rcmd_goods_id=");
            sb.append(this.rcmd_goods_id);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoLiveGoodsRcmdMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12482, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12482, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof VideoLiveGoodsRcmdMessage)) {
                return false;
            }
            VideoLiveGoodsRcmdMessage videoLiveGoodsRcmdMessage = (VideoLiveGoodsRcmdMessage) obj;
            if (!unknownFields().equals(videoLiveGoodsRcmdMessage.unknownFields()) || !Internal.equals(this.common, videoLiveGoodsRcmdMessage.common) || !Internal.equals(this.rcmd_goods_id, videoLiveGoodsRcmdMessage.rcmd_goods_id)) {
                return false;
            }
            return true;
        }
    }

    public VideoLiveGoodsRcmdMessage(Common common2, Long l) {
        this(common2, l, ByteString.EMPTY);
    }

    public VideoLiveGoodsRcmdMessage(Common common2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.rcmd_goods_id = l;
    }
}
