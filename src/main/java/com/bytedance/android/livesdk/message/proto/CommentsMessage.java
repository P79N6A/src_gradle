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
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.io.IOException;
import okio.ByteString;

public final class CommentsMessage extends Message<CommentsMessage, Builder> {
    public static final ProtoAdapter<CommentsMessage> ADAPTER = new ProtoAdapter_CommentsMessage();
    public static final Long DEFAULT_ACTION_TYPE = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String action_content;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public final Long action_type;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 5)
    public final Image back_ground;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String color;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String content;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 2)
    public final User user;

    public static final class Builder extends Message.Builder<CommentsMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String action_content;
        public Long action_type;
        public Image back_ground;
        public String color;
        public Common common;
        public String content;
        public User user;

        public final CommentsMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11232, new Class[0], CommentsMessage.class)) {
                return (CommentsMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11232, new Class[0], CommentsMessage.class);
            }
            CommentsMessage commentsMessage = new CommentsMessage(this.common, this.user, this.content, this.color, this.back_ground, this.action_type, this.action_content, super.buildUnknownFields());
            return commentsMessage;
        }

        public final Builder action_content(String str) {
            this.action_content = str;
            return this;
        }

        public final Builder action_type(Long l) {
            this.action_type = l;
            return this;
        }

        public final Builder back_ground(Image image) {
            this.back_ground = image;
            return this;
        }

        public final Builder color(String str) {
            this.color = str;
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

        public final Builder user(User user2) {
            this.user = user2;
            return this;
        }
    }

    static final class ProtoAdapter_CommentsMessage extends ProtoAdapter<CommentsMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_CommentsMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, CommentsMessage.class);
        }

        public final CommentsMessage redact(CommentsMessage commentsMessage) {
            if (PatchProxy.isSupport(new Object[]{commentsMessage}, this, changeQuickRedirect, false, 11236, new Class[]{CommentsMessage.class}, CommentsMessage.class)) {
                return (CommentsMessage) PatchProxy.accessDispatch(new Object[]{commentsMessage}, this, changeQuickRedirect, false, 11236, new Class[]{CommentsMessage.class}, CommentsMessage.class);
            }
            Builder newBuilder = commentsMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.user != null) {
                newBuilder.user = (User) User.ADAPTER.redact(newBuilder.user);
            }
            if (newBuilder.back_ground != null) {
                newBuilder.back_ground = (Image) Image.ADAPTER.redact(newBuilder.back_ground);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final CommentsMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11235, new Class[]{ProtoReader.class}, CommentsMessage.class)) {
                return (CommentsMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11235, new Class[]{ProtoReader.class}, CommentsMessage.class);
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
                            builder.content((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 4:
                            builder.color((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 5:
                            builder.back_ground((Image) Image.ADAPTER.decode(protoReader2));
                            break;
                        case 6:
                            builder.action_type((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case e.l /*7*/:
                            builder.action_content((String) ProtoAdapter.STRING.decode(protoReader2));
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

        public final int encodedSize(CommentsMessage commentsMessage) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            CommentsMessage commentsMessage2 = commentsMessage;
            int i7 = 0;
            if (PatchProxy.isSupport(new Object[]{commentsMessage2}, this, changeQuickRedirect, false, 11233, new Class[]{CommentsMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{commentsMessage2}, this, changeQuickRedirect, false, 11233, new Class[]{CommentsMessage.class}, Integer.TYPE)).intValue();
            }
            if (commentsMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, commentsMessage2.common);
            } else {
                i = 0;
            }
            if (commentsMessage2.user != null) {
                i2 = User.ADAPTER.encodedSizeWithTag(2, commentsMessage2.user);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (commentsMessage2.content != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, commentsMessage2.content);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (commentsMessage2.color != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, commentsMessage2.color);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (commentsMessage2.back_ground != null) {
                i5 = Image.ADAPTER.encodedSizeWithTag(5, commentsMessage2.back_ground);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (commentsMessage2.action_type != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, commentsMessage2.action_type);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (commentsMessage2.action_content != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, commentsMessage2.action_content);
            }
            return i12 + i7 + commentsMessage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, CommentsMessage commentsMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            CommentsMessage commentsMessage2 = commentsMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, commentsMessage2}, this, changeQuickRedirect, false, 11234, new Class[]{ProtoWriter.class, CommentsMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, commentsMessage2}, this, changeQuickRedirect, false, 11234, new Class[]{ProtoWriter.class, CommentsMessage.class}, Void.TYPE);
                return;
            }
            if (commentsMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, commentsMessage2.common);
            }
            if (commentsMessage2.user != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 2, commentsMessage2.user);
            }
            if (commentsMessage2.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, commentsMessage2.content);
            }
            if (commentsMessage2.color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, commentsMessage2.color);
            }
            if (commentsMessage2.back_ground != null) {
                Image.ADAPTER.encodeWithTag(protoWriter2, 5, commentsMessage2.back_ground);
            }
            if (commentsMessage2.action_type != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 6, commentsMessage2.action_type);
            }
            if (commentsMessage2.action_content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 7, commentsMessage2.action_content);
            }
            protoWriter2.writeBytes(commentsMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11228, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11228, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.user = this.user;
        builder.content = this.content;
        builder.color = this.color;
        builder.back_ground = this.back_ground;
        builder.action_type = this.action_type;
        builder.action_content = this.action_content;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11230, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11230, new Class[0], Integer.TYPE)).intValue();
        }
        int i8 = this.hashCode;
        if (i8 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i9 = (hashCode + i) * 37;
            if (this.user != null) {
                i2 = this.user.hashCode();
            } else {
                i2 = 0;
            }
            int i10 = (i9 + i2) * 37;
            if (this.content != null) {
                i3 = this.content.hashCode();
            } else {
                i3 = 0;
            }
            int i11 = (i10 + i3) * 37;
            if (this.color != null) {
                i4 = this.color.hashCode();
            } else {
                i4 = 0;
            }
            int i12 = (i11 + i4) * 37;
            if (this.back_ground != null) {
                i5 = this.back_ground.hashCode();
            } else {
                i5 = 0;
            }
            int i13 = (i12 + i5) * 37;
            if (this.action_type != null) {
                i6 = this.action_type.hashCode();
            } else {
                i6 = 0;
            }
            int i14 = (i13 + i6) * 37;
            if (this.action_content != null) {
                i7 = this.action_content.hashCode();
            }
            i8 = i14 + i7;
            this.hashCode = i8;
        }
        return i8;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11231, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11231, new Class[0], String.class);
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
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.color != null) {
            sb.append(", color=");
            sb.append(this.color);
        }
        if (this.back_ground != null) {
            sb.append(", back_ground=");
            sb.append(this.back_ground);
        }
        if (this.action_type != null) {
            sb.append(", action_type=");
            sb.append(this.action_type);
        }
        if (this.action_content != null) {
            sb.append(", action_content=");
            sb.append(this.action_content);
        }
        StringBuilder replace = sb.replace(0, 2, "CommentsMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11229, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11229, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof CommentsMessage)) {
                return false;
            }
            CommentsMessage commentsMessage = (CommentsMessage) obj;
            if (!unknownFields().equals(commentsMessage.unknownFields()) || !Internal.equals(this.common, commentsMessage.common) || !Internal.equals(this.user, commentsMessage.user) || !Internal.equals(this.content, commentsMessage.content) || !Internal.equals(this.color, commentsMessage.color) || !Internal.equals(this.back_ground, commentsMessage.back_ground) || !Internal.equals(this.action_type, commentsMessage.action_type) || !Internal.equals(this.action_content, commentsMessage.action_content)) {
                return false;
            }
            return true;
        }
    }

    public CommentsMessage(Common common2, User user2, String str, String str2, Image image, Long l, String str3) {
        this(common2, user2, str, str2, image, l, str3, ByteString.EMPTY);
    }

    public CommentsMessage(Common common2, User user2, String str, String str2, Image image, Long l, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.user = user2;
        this.content = str;
        this.color = str2;
        this.back_ground = image;
        this.action_type = l;
        this.action_content = str3;
    }
}
