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

public final class ChatMessage extends Message<ChatMessage, Builder> {
    public static final ProtoAdapter<ChatMessage> ADAPTER = new ProtoAdapter_ChatMessage();
    public static final Boolean DEFAULT_VISIBLE_TO_SENDER = Boolean.FALSE;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 5)
    public final Image background_image;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String content;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 2)
    public final User user;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public final Boolean visible_to_sender;

    public static final class Builder extends Message.Builder<ChatMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Image background_image;
        public Common common;
        public String content;
        public User user;
        public Boolean visible_to_sender;

        public final ChatMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11223, new Class[0], ChatMessage.class)) {
                return (ChatMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11223, new Class[0], ChatMessage.class);
            }
            ChatMessage chatMessage = new ChatMessage(this.common, this.user, this.content, this.visible_to_sender, this.background_image, super.buildUnknownFields());
            return chatMessage;
        }

        public final Builder background_image(Image image) {
            this.background_image = image;
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

        public final Builder visible_to_sender(Boolean bool) {
            this.visible_to_sender = bool;
            return this;
        }
    }

    static final class ProtoAdapter_ChatMessage extends ProtoAdapter<ChatMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_ChatMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatMessage.class);
        }

        public final ChatMessage redact(ChatMessage chatMessage) {
            if (PatchProxy.isSupport(new Object[]{chatMessage}, this, changeQuickRedirect, false, 11227, new Class[]{ChatMessage.class}, ChatMessage.class)) {
                return (ChatMessage) PatchProxy.accessDispatch(new Object[]{chatMessage}, this, changeQuickRedirect, false, 11227, new Class[]{ChatMessage.class}, ChatMessage.class);
            }
            Builder newBuilder = chatMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.user != null) {
                newBuilder.user = (User) User.ADAPTER.redact(newBuilder.user);
            }
            if (newBuilder.background_image != null) {
                newBuilder.background_image = (Image) Image.ADAPTER.redact(newBuilder.background_image);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final ChatMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11226, new Class[]{ProtoReader.class}, ChatMessage.class)) {
                return (ChatMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11226, new Class[]{ProtoReader.class}, ChatMessage.class);
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
                            builder.visible_to_sender((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 5:
                            builder.background_image((Image) Image.ADAPTER.decode(protoReader2));
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

        public final int encodedSize(ChatMessage chatMessage) {
            int i;
            int i2;
            int i3;
            int i4;
            ChatMessage chatMessage2 = chatMessage;
            int i5 = 0;
            if (PatchProxy.isSupport(new Object[]{chatMessage2}, this, changeQuickRedirect, false, 11224, new Class[]{ChatMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{chatMessage2}, this, changeQuickRedirect, false, 11224, new Class[]{ChatMessage.class}, Integer.TYPE)).intValue();
            }
            if (chatMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, chatMessage2.common);
            } else {
                i = 0;
            }
            if (chatMessage2.user != null) {
                i2 = User.ADAPTER.encodedSizeWithTag(2, chatMessage2.user);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (chatMessage2.content != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, chatMessage2.content);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (chatMessage2.visible_to_sender != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, chatMessage2.visible_to_sender);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (chatMessage2.background_image != null) {
                i5 = Image.ADAPTER.encodedSizeWithTag(5, chatMessage2.background_image);
            }
            return i8 + i5 + chatMessage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, ChatMessage chatMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            ChatMessage chatMessage2 = chatMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, chatMessage2}, this, changeQuickRedirect, false, 11225, new Class[]{ProtoWriter.class, ChatMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, chatMessage2}, this, changeQuickRedirect, false, 11225, new Class[]{ProtoWriter.class, ChatMessage.class}, Void.TYPE);
                return;
            }
            if (chatMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, chatMessage2.common);
            }
            if (chatMessage2.user != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 2, chatMessage2.user);
            }
            if (chatMessage2.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, chatMessage2.content);
            }
            if (chatMessage2.visible_to_sender != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 4, chatMessage2.visible_to_sender);
            }
            if (chatMessage2.background_image != null) {
                Image.ADAPTER.encodeWithTag(protoWriter2, 5, chatMessage2.background_image);
            }
            protoWriter2.writeBytes(chatMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11219, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11219, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.user = this.user;
        builder.content = this.content;
        builder.visible_to_sender = this.visible_to_sender;
        builder.background_image = this.background_image;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11221, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11221, new Class[0], Integer.TYPE)).intValue();
        }
        int i6 = this.hashCode;
        if (i6 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i7 = (hashCode + i) * 37;
            if (this.user != null) {
                i2 = this.user.hashCode();
            } else {
                i2 = 0;
            }
            int i8 = (i7 + i2) * 37;
            if (this.content != null) {
                i3 = this.content.hashCode();
            } else {
                i3 = 0;
            }
            int i9 = (i8 + i3) * 37;
            if (this.visible_to_sender != null) {
                i4 = this.visible_to_sender.hashCode();
            } else {
                i4 = 0;
            }
            int i10 = (i9 + i4) * 37;
            if (this.background_image != null) {
                i5 = this.background_image.hashCode();
            }
            i6 = i10 + i5;
            this.hashCode = i6;
        }
        return i6;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11222, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11222, new Class[0], String.class);
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
        if (this.visible_to_sender != null) {
            sb.append(", visible_to_sender=");
            sb.append(this.visible_to_sender);
        }
        if (this.background_image != null) {
            sb.append(", background_image=");
            sb.append(this.background_image);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11220, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11220, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof ChatMessage)) {
                return false;
            }
            ChatMessage chatMessage = (ChatMessage) obj;
            if (!unknownFields().equals(chatMessage.unknownFields()) || !Internal.equals(this.common, chatMessage.common) || !Internal.equals(this.user, chatMessage.user) || !Internal.equals(this.content, chatMessage.content) || !Internal.equals(this.visible_to_sender, chatMessage.visible_to_sender) || !Internal.equals(this.background_image, chatMessage.background_image)) {
                return false;
            }
            return true;
        }
    }

    public ChatMessage(Common common2, User user2, String str, Boolean bool, Image image) {
        this(common2, user2, str, bool, image, ByteString.EMPTY);
    }

    public ChatMessage(Common common2, User user2, String str, Boolean bool, Image image, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.user = user2;
        this.content = str;
        this.visible_to_sender = bool;
        this.background_image = image;
    }
}
