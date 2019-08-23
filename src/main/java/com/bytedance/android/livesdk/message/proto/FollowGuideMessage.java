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

public final class FollowGuideMessage extends Message<FollowGuideMessage, Builder> {
    public static final ProtoAdapter<FollowGuideMessage> ADAPTER = new ProtoAdapter_FollowGuideMessage();
    public static final Boolean DEFAULT_VISIBLE_TO_SENDER = Boolean.FALSE;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.ImageStruct#ADAPTER", tag = 2)
    public final ImageStruct avatarUrl;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String content;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public final long duration;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final long giftId;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String hourRankInfo;

    public static final class Builder extends Message.Builder<FollowGuideMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public ImageStruct avatarUrl;
        public Common common;
        public String content;
        public long duration;
        public long giftId;
        public String hourRankInfo;

        public final FollowGuideMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11434, new Class[0], FollowGuideMessage.class)) {
                return (FollowGuideMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11434, new Class[0], FollowGuideMessage.class);
            }
            FollowGuideMessage followGuideMessage = new FollowGuideMessage(this.common, this.avatarUrl, this.content, this.hourRankInfo, this.giftId, super.buildUnknownFields(), this.duration);
            return followGuideMessage;
        }

        public final Builder avatar(ImageStruct imageStruct) {
            this.avatarUrl = imageStruct;
            return this;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder duration(long j) {
            this.duration = j;
            return this;
        }

        public final Builder giftId(long j) {
            this.giftId = j;
            return this;
        }

        public final Builder hourRankInfo(String str) {
            this.hourRankInfo = str;
            return this;
        }
    }

    static final class ProtoAdapter_FollowGuideMessage extends ProtoAdapter<FollowGuideMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_FollowGuideMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, FollowGuideMessage.class);
        }

        public final FollowGuideMessage redact(FollowGuideMessage followGuideMessage) {
            if (PatchProxy.isSupport(new Object[]{followGuideMessage}, this, changeQuickRedirect, false, 11438, new Class[]{FollowGuideMessage.class}, FollowGuideMessage.class)) {
                return (FollowGuideMessage) PatchProxy.accessDispatch(new Object[]{followGuideMessage}, this, changeQuickRedirect, false, 11438, new Class[]{FollowGuideMessage.class}, FollowGuideMessage.class);
            }
            Builder newBuilder = followGuideMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.avatarUrl != null) {
                newBuilder.avatarUrl = (ImageStruct) ImageStruct.ADAPTER.redact(newBuilder.avatarUrl);
            }
            newBuilder.giftId = ((Long) INT64.redact(Long.valueOf(newBuilder.giftId))).longValue();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final FollowGuideMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11437, new Class[]{ProtoReader.class}, FollowGuideMessage.class)) {
                return (FollowGuideMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11437, new Class[]{ProtoReader.class}, FollowGuideMessage.class);
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
                            builder.avatar((ImageStruct) ImageStruct.ADAPTER.decode(protoReader2));
                            break;
                        case 3:
                            builder.content((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 4:
                            builder.hourRankInfo((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 5:
                            builder.giftId(((Long) ProtoAdapter.INT64.decode(protoReader2)).longValue());
                            break;
                        case 6:
                            builder.duration(((Long) ProtoAdapter.INT64.decode(protoReader2)).longValue());
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

        public final int encodedSize(FollowGuideMessage followGuideMessage) {
            int i;
            int i2;
            int i3;
            FollowGuideMessage followGuideMessage2 = followGuideMessage;
            int i4 = 0;
            if (PatchProxy.isSupport(new Object[]{followGuideMessage2}, this, changeQuickRedirect, false, 11435, new Class[]{FollowGuideMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{followGuideMessage2}, this, changeQuickRedirect, false, 11435, new Class[]{FollowGuideMessage.class}, Integer.TYPE)).intValue();
            }
            if (followGuideMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, followGuideMessage2.common);
            } else {
                i = 0;
            }
            if (followGuideMessage2.avatarUrl != null) {
                i2 = ImageStruct.ADAPTER.encodedSizeWithTag(2, followGuideMessage2.avatarUrl);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (followGuideMessage2.content != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, followGuideMessage2.content);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (followGuideMessage2.hourRankInfo != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, followGuideMessage2.hourRankInfo);
            }
            return i6 + i4 + ProtoAdapter.INT64.encodedSizeWithTag(5, Long.valueOf(followGuideMessage2.giftId)) + ProtoAdapter.INT64.encodedSizeWithTag(6, Long.valueOf(followGuideMessage2.duration)) + followGuideMessage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, FollowGuideMessage followGuideMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            FollowGuideMessage followGuideMessage2 = followGuideMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, followGuideMessage2}, this, changeQuickRedirect, false, 11436, new Class[]{ProtoWriter.class, FollowGuideMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, followGuideMessage2}, this, changeQuickRedirect, false, 11436, new Class[]{ProtoWriter.class, FollowGuideMessage.class}, Void.TYPE);
                return;
            }
            if (followGuideMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, followGuideMessage2.common);
            }
            if (followGuideMessage2.avatarUrl != null) {
                ImageStruct.ADAPTER.encodeWithTag(protoWriter2, 2, followGuideMessage2.avatarUrl);
            }
            if (followGuideMessage2.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, followGuideMessage2.content);
            }
            if (followGuideMessage2.hourRankInfo != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, followGuideMessage2.hourRankInfo);
            }
            ProtoAdapter.INT64.encodeWithTag(protoWriter2, 5, Long.valueOf(followGuideMessage2.giftId));
            ProtoAdapter.INT64.encodeWithTag(protoWriter2, 6, Long.valueOf(followGuideMessage2.duration));
            protoWriter2.writeBytes(followGuideMessage.unknownFields());
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11432, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11432, new Class[0], Integer.TYPE)).intValue();
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
            if (this.avatarUrl != null) {
                i2 = this.avatarUrl.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 37;
            if (this.content != null) {
                i3 = this.content.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 37;
            if (this.hourRankInfo != null) {
                i4 = this.hourRankInfo.hashCode();
            }
            i5 = (int) (((long) ((i8 + i4) * 37)) + this.giftId);
            this.hashCode = i5;
        }
        return i5;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11430, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11430, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.avatarUrl = this.avatarUrl;
        builder.content = this.content;
        builder.hourRankInfo = this.hourRankInfo;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11433, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11433, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.avatarUrl != null) {
            sb.append(", user=");
            sb.append(this.avatarUrl);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.hourRankInfo != null) {
            sb.append(", visible_to_sender=");
            sb.append(this.hourRankInfo);
        }
        sb.append(", background_image=");
        sb.append(this.giftId);
        StringBuilder replace = sb.replace(0, 2, "ChatMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11431, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11431, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof FollowGuideMessage)) {
                return false;
            }
            FollowGuideMessage followGuideMessage = (FollowGuideMessage) obj;
            if (!unknownFields().equals(followGuideMessage.unknownFields()) || !Internal.equals(this.common, followGuideMessage.common) || !Internal.equals(this.avatarUrl, followGuideMessage.avatarUrl) || !Internal.equals(this.content, followGuideMessage.content) || !Internal.equals(this.hourRankInfo, followGuideMessage.hourRankInfo) || !Internal.equals(Long.valueOf(this.giftId), Long.valueOf(followGuideMessage.giftId))) {
                return false;
            }
            return true;
        }
    }

    public FollowGuideMessage(Common common2, ImageStruct imageStruct, String str, String str2, long j, long j2) {
        this(common2, imageStruct, str, str2, j, ByteString.EMPTY, j2);
    }

    public FollowGuideMessage(Common common2, ImageStruct imageStruct, String str, String str2, long j, ByteString byteString, long j2) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.avatarUrl = imageStruct;
        this.content = str;
        this.hourRankInfo = str2;
        this.giftId = j;
        this.duration = j2;
    }
}
