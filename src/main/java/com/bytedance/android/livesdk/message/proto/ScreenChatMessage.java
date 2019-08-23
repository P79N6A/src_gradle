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

public final class ScreenChatMessage extends Message<ScreenChatMessage, Builder> {
    public static final ProtoAdapter<ScreenChatMessage> ADAPTER = new ProtoAdapter_ScreenChatMessage();
    public static final Long DEFAULT_PRIORITY = 0L;
    public static final Long DEFAULT_SCREEN_CHAT_TYPE = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 7)
    public final Image background_image;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String content;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.ScreenChatMessage$Effect#ADAPTER", tag = 6)
    public final Effect effect;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long priority;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long screen_chat_type;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 2)
    public final User user;

    public static final class Effect extends Message<Effect, Builder> {
        public static final ProtoAdapter<Effect> ADAPTER = new ProtoAdapter_Effect();
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 2)
        public final Image avatar_icon;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.FlexImageStruct#ADAPTER", tag = 1)
        public final FlexImageStruct icon;

        public static final class Builder extends Message.Builder<Effect, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public Image avatar_icon;
            public FlexImageStruct icon;

            public final Effect build() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12147, new Class[0], Effect.class)) {
                    return new Effect(this.icon, this.avatar_icon, super.buildUnknownFields());
                }
                return (Effect) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12147, new Class[0], Effect.class);
            }

            public final Builder avatar_icon(Image image) {
                this.avatar_icon = image;
                return this;
            }

            public final Builder icon(FlexImageStruct flexImageStruct) {
                this.icon = flexImageStruct;
                return this;
            }
        }

        static final class ProtoAdapter_Effect extends ProtoAdapter<Effect> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_Effect() {
                super(FieldEncoding.LENGTH_DELIMITED, Effect.class);
            }

            public final int encodedSize(Effect effect) {
                int i;
                Effect effect2 = effect;
                int i2 = 0;
                if (PatchProxy.isSupport(new Object[]{effect2}, this, changeQuickRedirect, false, 12148, new Class[]{Effect.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{effect2}, this, changeQuickRedirect, false, 12148, new Class[]{Effect.class}, Integer.TYPE)).intValue();
                }
                if (effect2.icon != null) {
                    i = FlexImageStruct.ADAPTER.encodedSizeWithTag(1, effect2.icon);
                } else {
                    i = 0;
                }
                if (effect2.avatar_icon != null) {
                    i2 = Image.ADAPTER.encodedSizeWithTag(2, effect2.avatar_icon);
                }
                return i + i2 + effect.unknownFields().size();
            }

            public final Effect redact(Effect effect) {
                if (PatchProxy.isSupport(new Object[]{effect}, this, changeQuickRedirect, false, 12151, new Class[]{Effect.class}, Effect.class)) {
                    return (Effect) PatchProxy.accessDispatch(new Object[]{effect}, this, changeQuickRedirect, false, 12151, new Class[]{Effect.class}, Effect.class);
                }
                Builder newBuilder = effect.newBuilder();
                if (newBuilder.icon != null) {
                    newBuilder.icon = (FlexImageStruct) FlexImageStruct.ADAPTER.redact(newBuilder.icon);
                }
                if (newBuilder.avatar_icon != null) {
                    newBuilder.avatar_icon = (Image) Image.ADAPTER.redact(newBuilder.avatar_icon);
                }
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final Effect decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12150, new Class[]{ProtoReader.class}, Effect.class)) {
                    return (Effect) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12150, new Class[]{ProtoReader.class}, Effect.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.icon((FlexImageStruct) FlexImageStruct.ADAPTER.decode(protoReader2));
                                break;
                            case 2:
                                builder.avatar_icon((Image) Image.ADAPTER.decode(protoReader2));
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

            public final void encode(ProtoWriter protoWriter, Effect effect) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                Effect effect2 = effect;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, effect2}, this, changeQuickRedirect, false, 12149, new Class[]{ProtoWriter.class, Effect.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, effect2}, this, changeQuickRedirect, false, 12149, new Class[]{ProtoWriter.class, Effect.class}, Void.TYPE);
                    return;
                }
                if (effect2.icon != null) {
                    FlexImageStruct.ADAPTER.encodeWithTag(protoWriter2, 1, effect2.icon);
                }
                if (effect2.avatar_icon != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter2, 2, effect2.avatar_icon);
                }
                protoWriter2.writeBytes(effect.unknownFields());
            }
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12143, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12143, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.icon = this.icon;
            builder.avatar_icon = this.avatar_icon;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final int hashCode() {
            int i;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12145, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12145, new Class[0], Integer.TYPE)).intValue();
            }
            int i3 = this.hashCode;
            if (i3 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.icon != null) {
                    i = this.icon.hashCode();
                } else {
                    i = 0;
                }
                int i4 = (hashCode + i) * 37;
                if (this.avatar_icon != null) {
                    i2 = this.avatar_icon.hashCode();
                }
                i3 = i4 + i2;
                this.hashCode = i3;
            }
            return i3;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12146, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12146, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.icon != null) {
                sb.append(", icon=");
                sb.append(this.icon);
            }
            if (this.avatar_icon != null) {
                sb.append(", avatar_icon=");
                sb.append(this.avatar_icon);
            }
            StringBuilder replace = sb.replace(0, 2, "Effect{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12144, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12144, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof Effect)) {
                    return false;
                }
                Effect effect = (Effect) obj;
                if (!unknownFields().equals(effect.unknownFields()) || !Internal.equals(this.icon, effect.icon) || !Internal.equals(this.avatar_icon, effect.avatar_icon)) {
                    return false;
                }
                return true;
            }
        }

        public Effect(FlexImageStruct flexImageStruct, Image image) {
            this(flexImageStruct, image, ByteString.EMPTY);
        }

        public Effect(FlexImageStruct flexImageStruct, Image image, ByteString byteString) {
            super(ADAPTER, byteString);
            this.icon = flexImageStruct;
            this.avatar_icon = image;
        }
    }

    public static final class Builder extends Message.Builder<ScreenChatMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Image background_image;
        public Common common;
        public String content;
        public Effect effect;
        public Long priority;
        public Long screen_chat_type;
        public User user;

        public final ScreenChatMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12142, new Class[0], ScreenChatMessage.class)) {
                return (ScreenChatMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12142, new Class[0], ScreenChatMessage.class);
            }
            ScreenChatMessage screenChatMessage = new ScreenChatMessage(this.common, this.user, this.screen_chat_type, this.content, this.priority, this.effect, this.background_image, super.buildUnknownFields());
            return screenChatMessage;
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

        public final Builder effect(Effect effect2) {
            this.effect = effect2;
            return this;
        }

        public final Builder priority(Long l) {
            this.priority = l;
            return this;
        }

        public final Builder screen_chat_type(Long l) {
            this.screen_chat_type = l;
            return this;
        }

        public final Builder user(User user2) {
            this.user = user2;
            return this;
        }
    }

    static final class ProtoAdapter_ScreenChatMessage extends ProtoAdapter<ScreenChatMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_ScreenChatMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, ScreenChatMessage.class);
        }

        public final ScreenChatMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12154, new Class[]{ProtoReader.class}, ScreenChatMessage.class)) {
                return (ScreenChatMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12154, new Class[]{ProtoReader.class}, ScreenChatMessage.class);
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
                            builder.screen_chat_type((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.content((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 5:
                            builder.priority((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 6:
                            builder.effect((Effect) Effect.ADAPTER.decode(protoReader2));
                            break;
                        case e.l /*7*/:
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

        public final int encodedSize(ScreenChatMessage screenChatMessage) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            ScreenChatMessage screenChatMessage2 = screenChatMessage;
            int i7 = 0;
            if (PatchProxy.isSupport(new Object[]{screenChatMessage2}, this, changeQuickRedirect, false, 12152, new Class[]{ScreenChatMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{screenChatMessage2}, this, changeQuickRedirect, false, 12152, new Class[]{ScreenChatMessage.class}, Integer.TYPE)).intValue();
            }
            if (screenChatMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, screenChatMessage2.common);
            } else {
                i = 0;
            }
            if (screenChatMessage2.user != null) {
                i2 = User.ADAPTER.encodedSizeWithTag(2, screenChatMessage2.user);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (screenChatMessage2.screen_chat_type != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, screenChatMessage2.screen_chat_type);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (screenChatMessage2.content != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, screenChatMessage2.content);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (screenChatMessage2.priority != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, screenChatMessage2.priority);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (screenChatMessage2.effect != null) {
                i6 = Effect.ADAPTER.encodedSizeWithTag(6, screenChatMessage2.effect);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (screenChatMessage2.background_image != null) {
                i7 = Image.ADAPTER.encodedSizeWithTag(7, screenChatMessage2.background_image);
            }
            return i12 + i7 + screenChatMessage.unknownFields().size();
        }

        public final ScreenChatMessage redact(ScreenChatMessage screenChatMessage) {
            if (PatchProxy.isSupport(new Object[]{screenChatMessage}, this, changeQuickRedirect, false, 12155, new Class[]{ScreenChatMessage.class}, ScreenChatMessage.class)) {
                return (ScreenChatMessage) PatchProxy.accessDispatch(new Object[]{screenChatMessage}, this, changeQuickRedirect, false, 12155, new Class[]{ScreenChatMessage.class}, ScreenChatMessage.class);
            }
            Builder newBuilder = screenChatMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.user != null) {
                newBuilder.user = (User) User.ADAPTER.redact(newBuilder.user);
            }
            if (newBuilder.effect != null) {
                newBuilder.effect = (Effect) Effect.ADAPTER.redact(newBuilder.effect);
            }
            if (newBuilder.background_image != null) {
                newBuilder.background_image = (Image) Image.ADAPTER.redact(newBuilder.background_image);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final void encode(ProtoWriter protoWriter, ScreenChatMessage screenChatMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            ScreenChatMessage screenChatMessage2 = screenChatMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, screenChatMessage2}, this, changeQuickRedirect, false, 12153, new Class[]{ProtoWriter.class, ScreenChatMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, screenChatMessage2}, this, changeQuickRedirect, false, 12153, new Class[]{ProtoWriter.class, ScreenChatMessage.class}, Void.TYPE);
                return;
            }
            if (screenChatMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, screenChatMessage2.common);
            }
            if (screenChatMessage2.user != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 2, screenChatMessage2.user);
            }
            if (screenChatMessage2.screen_chat_type != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, screenChatMessage2.screen_chat_type);
            }
            if (screenChatMessage2.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, screenChatMessage2.content);
            }
            if (screenChatMessage2.priority != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 5, screenChatMessage2.priority);
            }
            if (screenChatMessage2.effect != null) {
                Effect.ADAPTER.encodeWithTag(protoWriter2, 6, screenChatMessage2.effect);
            }
            if (screenChatMessage2.background_image != null) {
                Image.ADAPTER.encodeWithTag(protoWriter2, 7, screenChatMessage2.background_image);
            }
            protoWriter2.writeBytes(screenChatMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12138, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12138, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.user = this.user;
        builder.screen_chat_type = this.screen_chat_type;
        builder.content = this.content;
        builder.priority = this.priority;
        builder.effect = this.effect;
        builder.background_image = this.background_image;
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12140, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12140, new Class[0], Integer.TYPE)).intValue();
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
            if (this.screen_chat_type != null) {
                i3 = this.screen_chat_type.hashCode();
            } else {
                i3 = 0;
            }
            int i11 = (i10 + i3) * 37;
            if (this.content != null) {
                i4 = this.content.hashCode();
            } else {
                i4 = 0;
            }
            int i12 = (i11 + i4) * 37;
            if (this.priority != null) {
                i5 = this.priority.hashCode();
            } else {
                i5 = 0;
            }
            int i13 = (i12 + i5) * 37;
            if (this.effect != null) {
                i6 = this.effect.hashCode();
            } else {
                i6 = 0;
            }
            int i14 = (i13 + i6) * 37;
            if (this.background_image != null) {
                i7 = this.background_image.hashCode();
            }
            i8 = i14 + i7;
            this.hashCode = i8;
        }
        return i8;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12141, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12141, new Class[0], String.class);
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
        if (this.screen_chat_type != null) {
            sb.append(", screen_chat_type=");
            sb.append(this.screen_chat_type);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.priority != null) {
            sb.append(", priority=");
            sb.append(this.priority);
        }
        if (this.effect != null) {
            sb.append(", effect=");
            sb.append(this.effect);
        }
        if (this.background_image != null) {
            sb.append(", background_image=");
            sb.append(this.background_image);
        }
        StringBuilder replace = sb.replace(0, 2, "ScreenChatMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12139, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12139, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof ScreenChatMessage)) {
                return false;
            }
            ScreenChatMessage screenChatMessage = (ScreenChatMessage) obj;
            if (!unknownFields().equals(screenChatMessage.unknownFields()) || !Internal.equals(this.common, screenChatMessage.common) || !Internal.equals(this.user, screenChatMessage.user) || !Internal.equals(this.screen_chat_type, screenChatMessage.screen_chat_type) || !Internal.equals(this.content, screenChatMessage.content) || !Internal.equals(this.priority, screenChatMessage.priority) || !Internal.equals(this.effect, screenChatMessage.effect) || !Internal.equals(this.background_image, screenChatMessage.background_image)) {
                return false;
            }
            return true;
        }
    }

    public ScreenChatMessage(Common common2, User user2, Long l, String str, Long l2, Effect effect2, Image image) {
        this(common2, user2, l, str, l2, effect2, image, ByteString.EMPTY);
    }

    public ScreenChatMessage(Common common2, User user2, Long l, String str, Long l2, Effect effect2, Image image, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.user = user2;
        this.screen_chat_type = l;
        this.content = str;
        this.priority = l2;
        this.effect = effect2;
        this.background_image = image;
    }
}
