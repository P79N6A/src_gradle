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

public final class SocialMessage extends Message<SocialMessage, Builder> {
    public static final ProtoAdapter<SocialMessage> ADAPTER = new ProtoAdapter_SocialMessage();
    public static final Long DEFAULT_ACTION = 0L;
    public static final Long DEFAULT_FOLLOW_COUNT = 0L;
    public static final Long DEFAULT_SHARE_TYPE = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long action;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public final Long follow_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String share_target;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long share_type;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 2)
    public final User user;

    public static final class Builder extends Message.Builder<SocialMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Long action;
        public Common common;
        public Long follow_count;
        public String share_target;
        public Long share_type;
        public User user;

        public final SocialMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12160, new Class[0], SocialMessage.class)) {
                return (SocialMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12160, new Class[0], SocialMessage.class);
            }
            SocialMessage socialMessage = new SocialMessage(this.common, this.user, this.share_type, this.action, this.share_target, this.follow_count, super.buildUnknownFields());
            return socialMessage;
        }

        public final Builder action(Long l) {
            this.action = l;
            return this;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder follow_count(Long l) {
            this.follow_count = l;
            return this;
        }

        public final Builder share_target(String str) {
            this.share_target = str;
            return this;
        }

        public final Builder share_type(Long l) {
            this.share_type = l;
            return this;
        }

        public final Builder user(User user2) {
            this.user = user2;
            return this;
        }
    }

    static final class ProtoAdapter_SocialMessage extends ProtoAdapter<SocialMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_SocialMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, SocialMessage.class);
        }

        public final SocialMessage redact(SocialMessage socialMessage) {
            if (PatchProxy.isSupport(new Object[]{socialMessage}, this, changeQuickRedirect, false, 12164, new Class[]{SocialMessage.class}, SocialMessage.class)) {
                return (SocialMessage) PatchProxy.accessDispatch(new Object[]{socialMessage}, this, changeQuickRedirect, false, 12164, new Class[]{SocialMessage.class}, SocialMessage.class);
            }
            Builder newBuilder = socialMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.user != null) {
                newBuilder.user = (User) User.ADAPTER.redact(newBuilder.user);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final SocialMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12163, new Class[]{ProtoReader.class}, SocialMessage.class)) {
                return (SocialMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12163, new Class[]{ProtoReader.class}, SocialMessage.class);
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
                            builder.user((User) User.ADAPTER.decode(protoReader2));
                            break;
                        case 3:
                            builder.share_type((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.action((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 5:
                            builder.share_target((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 6:
                            builder.follow_count((Long) ProtoAdapter.INT64.decode(protoReader2));
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

        public final int encodedSize(SocialMessage socialMessage) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            SocialMessage socialMessage2 = socialMessage;
            int i6 = 0;
            if (PatchProxy.isSupport(new Object[]{socialMessage2}, this, changeQuickRedirect, false, 12161, new Class[]{SocialMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{socialMessage2}, this, changeQuickRedirect, false, 12161, new Class[]{SocialMessage.class}, Integer.TYPE)).intValue();
            }
            if (socialMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, socialMessage2.common);
            } else {
                i = 0;
            }
            if (socialMessage2.user != null) {
                i2 = User.ADAPTER.encodedSizeWithTag(2, socialMessage2.user);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (socialMessage2.share_type != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, socialMessage2.share_type);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (socialMessage2.action != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, socialMessage2.action);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (socialMessage2.share_target != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, socialMessage2.share_target);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (socialMessage2.follow_count != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, socialMessage2.follow_count);
            }
            return i10 + i6 + socialMessage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, SocialMessage socialMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            SocialMessage socialMessage2 = socialMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, socialMessage2}, this, changeQuickRedirect, false, 12162, new Class[]{ProtoWriter.class, SocialMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, socialMessage2}, this, changeQuickRedirect, false, 12162, new Class[]{ProtoWriter.class, SocialMessage.class}, Void.TYPE);
                return;
            }
            if (socialMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, socialMessage2.common);
            }
            if (socialMessage2.user != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 2, socialMessage2.user);
            }
            if (socialMessage2.share_type != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, socialMessage2.share_type);
            }
            if (socialMessage2.action != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, socialMessage2.action);
            }
            if (socialMessage2.share_target != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 5, socialMessage2.share_target);
            }
            if (socialMessage2.follow_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 6, socialMessage2.follow_count);
            }
            protoWriter2.writeBytes(socialMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12156, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12156, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.user = this.user;
        builder.share_type = this.share_type;
        builder.action = this.action;
        builder.share_target = this.share_target;
        builder.follow_count = this.follow_count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12158, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12158, new Class[0], Integer.TYPE)).intValue();
        }
        int i7 = this.hashCode;
        if (i7 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i8 = (hashCode + i) * 37;
            if (this.user != null) {
                i2 = this.user.hashCode();
            } else {
                i2 = 0;
            }
            int i9 = (i8 + i2) * 37;
            if (this.share_type != null) {
                i3 = this.share_type.hashCode();
            } else {
                i3 = 0;
            }
            int i10 = (i9 + i3) * 37;
            if (this.action != null) {
                i4 = this.action.hashCode();
            } else {
                i4 = 0;
            }
            int i11 = (i10 + i4) * 37;
            if (this.share_target != null) {
                i5 = this.share_target.hashCode();
            } else {
                i5 = 0;
            }
            int i12 = (i11 + i5) * 37;
            if (this.follow_count != null) {
                i6 = this.follow_count.hashCode();
            }
            i7 = i12 + i6;
            this.hashCode = i7;
        }
        return i7;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12159, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12159, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        if (this.share_type != null) {
            sb.append(", share_type=");
            sb.append(this.share_type);
        }
        if (this.action != null) {
            sb.append(", action=");
            sb.append(this.action);
        }
        if (this.share_target != null) {
            sb.append(", share_target=");
            sb.append(this.share_target);
        }
        if (this.follow_count != null) {
            sb.append(", follow_count=");
            sb.append(this.follow_count);
        }
        StringBuilder replace = sb.replace(0, 2, "SocialMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12157, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12157, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof SocialMessage)) {
                return false;
            }
            SocialMessage socialMessage = (SocialMessage) obj;
            if (!unknownFields().equals(socialMessage.unknownFields()) || !Internal.equals(this.common, socialMessage.common) || !Internal.equals(this.user, socialMessage.user) || !Internal.equals(this.share_type, socialMessage.share_type) || !Internal.equals(this.action, socialMessage.action) || !Internal.equals(this.share_target, socialMessage.share_target) || !Internal.equals(this.follow_count, socialMessage.follow_count)) {
                return false;
            }
            return true;
        }
    }

    public SocialMessage(Common common2, User user2, Long l, Long l2, String str, Long l3) {
        this(common2, user2, l, l2, str, l3, ByteString.EMPTY);
    }

    public SocialMessage(Common common2, User user2, Long l, Long l2, String str, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.user = user2;
        this.share_type = l;
        this.action = l2;
        this.share_target = str;
        this.follow_count = l3;
    }
}
