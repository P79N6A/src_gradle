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

public final class MediaLiveReplayVidMessage extends Message<MediaLiveReplayVidMessage, Builder> {
    public static final ProtoAdapter<MediaLiveReplayVidMessage> ADAPTER = new ProtoAdapter_MediaLiveReplayVidMessage();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String vid;

    public static final class Builder extends Message.Builder<MediaLiveReplayVidMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public String vid;

        public final MediaLiveReplayVidMessage build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11881, new Class[0], MediaLiveReplayVidMessage.class)) {
                return new MediaLiveReplayVidMessage(this.common, this.vid, super.buildUnknownFields());
            }
            return (MediaLiveReplayVidMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11881, new Class[0], MediaLiveReplayVidMessage.class);
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder vid(String str) {
            this.vid = str;
            return this;
        }
    }

    static final class ProtoAdapter_MediaLiveReplayVidMessage extends ProtoAdapter<MediaLiveReplayVidMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_MediaLiveReplayVidMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, MediaLiveReplayVidMessage.class);
        }

        public final int encodedSize(MediaLiveReplayVidMessage mediaLiveReplayVidMessage) {
            int i;
            MediaLiveReplayVidMessage mediaLiveReplayVidMessage2 = mediaLiveReplayVidMessage;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{mediaLiveReplayVidMessage2}, this, changeQuickRedirect, false, 11882, new Class[]{MediaLiveReplayVidMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{mediaLiveReplayVidMessage2}, this, changeQuickRedirect, false, 11882, new Class[]{MediaLiveReplayVidMessage.class}, Integer.TYPE)).intValue();
            }
            if (mediaLiveReplayVidMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, mediaLiveReplayVidMessage2.common);
            } else {
                i = 0;
            }
            if (mediaLiveReplayVidMessage2.vid != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mediaLiveReplayVidMessage2.vid);
            }
            return i + i2 + mediaLiveReplayVidMessage.unknownFields().size();
        }

        public final MediaLiveReplayVidMessage redact(MediaLiveReplayVidMessage mediaLiveReplayVidMessage) {
            if (PatchProxy.isSupport(new Object[]{mediaLiveReplayVidMessage}, this, changeQuickRedirect, false, 11885, new Class[]{MediaLiveReplayVidMessage.class}, MediaLiveReplayVidMessage.class)) {
                return (MediaLiveReplayVidMessage) PatchProxy.accessDispatch(new Object[]{mediaLiveReplayVidMessage}, this, changeQuickRedirect, false, 11885, new Class[]{MediaLiveReplayVidMessage.class}, MediaLiveReplayVidMessage.class);
            }
            Builder newBuilder = mediaLiveReplayVidMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final MediaLiveReplayVidMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11884, new Class[]{ProtoReader.class}, MediaLiveReplayVidMessage.class)) {
                return (MediaLiveReplayVidMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11884, new Class[]{ProtoReader.class}, MediaLiveReplayVidMessage.class);
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
                            builder.vid((String) ProtoAdapter.STRING.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, MediaLiveReplayVidMessage mediaLiveReplayVidMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            MediaLiveReplayVidMessage mediaLiveReplayVidMessage2 = mediaLiveReplayVidMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, mediaLiveReplayVidMessage2}, this, changeQuickRedirect, false, 11883, new Class[]{ProtoWriter.class, MediaLiveReplayVidMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, mediaLiveReplayVidMessage2}, this, changeQuickRedirect, false, 11883, new Class[]{ProtoWriter.class, MediaLiveReplayVidMessage.class}, Void.TYPE);
                return;
            }
            if (mediaLiveReplayVidMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, mediaLiveReplayVidMessage2.common);
            }
            if (mediaLiveReplayVidMessage2.vid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, mediaLiveReplayVidMessage2.vid);
            }
            protoWriter2.writeBytes(mediaLiveReplayVidMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11877, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11877, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.vid = this.vid;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11879, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11879, new Class[0], Integer.TYPE)).intValue();
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
            if (this.vid != null) {
                i2 = this.vid.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11880, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11880, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.vid != null) {
            sb.append(", vid=");
            sb.append(this.vid);
        }
        StringBuilder replace = sb.replace(0, 2, "MediaLiveReplayVidMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11878, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11878, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof MediaLiveReplayVidMessage)) {
                return false;
            }
            MediaLiveReplayVidMessage mediaLiveReplayVidMessage = (MediaLiveReplayVidMessage) obj;
            if (!unknownFields().equals(mediaLiveReplayVidMessage.unknownFields()) || !Internal.equals(this.common, mediaLiveReplayVidMessage.common) || !Internal.equals(this.vid, mediaLiveReplayVidMessage.vid)) {
                return false;
            }
            return true;
        }
    }

    public MediaLiveReplayVidMessage(Common common2, String str) {
        this(common2, str, ByteString.EMPTY);
    }

    public MediaLiveReplayVidMessage(Common common2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.vid = str;
    }
}
