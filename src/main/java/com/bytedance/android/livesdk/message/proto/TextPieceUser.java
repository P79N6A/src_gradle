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

public final class TextPieceUser extends Message<TextPieceUser, Builder> {
    public static final ProtoAdapter<TextPieceUser> ADAPTER = new ProtoAdapter_TextPieceUser();
    public static final Boolean DEFAULT_WITH_COLON = Boolean.FALSE;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 1)
    public final User user;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean with_colon;

    public static final class Builder extends Message.Builder<TextPieceUser, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public User user;
        public Boolean with_colon;

        public final TextPieceUser build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12260, new Class[0], TextPieceUser.class)) {
                return new TextPieceUser(this.user, this.with_colon, super.buildUnknownFields());
            }
            return (TextPieceUser) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12260, new Class[0], TextPieceUser.class);
        }

        public final Builder user(User user2) {
            this.user = user2;
            return this;
        }

        public final Builder with_colon(Boolean bool) {
            this.with_colon = bool;
            return this;
        }
    }

    static final class ProtoAdapter_TextPieceUser extends ProtoAdapter<TextPieceUser> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_TextPieceUser() {
            super(FieldEncoding.LENGTH_DELIMITED, TextPieceUser.class);
        }

        public final int encodedSize(TextPieceUser textPieceUser) {
            int i;
            TextPieceUser textPieceUser2 = textPieceUser;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{textPieceUser2}, this, changeQuickRedirect, false, 12261, new Class[]{TextPieceUser.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{textPieceUser2}, this, changeQuickRedirect, false, 12261, new Class[]{TextPieceUser.class}, Integer.TYPE)).intValue();
            }
            if (textPieceUser2.user != null) {
                i = User.ADAPTER.encodedSizeWithTag(1, textPieceUser2.user);
            } else {
                i = 0;
            }
            if (textPieceUser2.with_colon != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, textPieceUser2.with_colon);
            }
            return i + i2 + textPieceUser.unknownFields().size();
        }

        public final TextPieceUser redact(TextPieceUser textPieceUser) {
            if (PatchProxy.isSupport(new Object[]{textPieceUser}, this, changeQuickRedirect, false, 12264, new Class[]{TextPieceUser.class}, TextPieceUser.class)) {
                return (TextPieceUser) PatchProxy.accessDispatch(new Object[]{textPieceUser}, this, changeQuickRedirect, false, 12264, new Class[]{TextPieceUser.class}, TextPieceUser.class);
            }
            Builder newBuilder = textPieceUser.newBuilder();
            if (newBuilder.user != null) {
                newBuilder.user = (User) User.ADAPTER.redact(newBuilder.user);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final TextPieceUser decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12263, new Class[]{ProtoReader.class}, TextPieceUser.class)) {
                return (TextPieceUser) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12263, new Class[]{ProtoReader.class}, TextPieceUser.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.user((User) User.ADAPTER.decode(protoReader2));
                            break;
                        case 2:
                            builder.with_colon((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, TextPieceUser textPieceUser) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            TextPieceUser textPieceUser2 = textPieceUser;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, textPieceUser2}, this, changeQuickRedirect, false, 12262, new Class[]{ProtoWriter.class, TextPieceUser.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, textPieceUser2}, this, changeQuickRedirect, false, 12262, new Class[]{ProtoWriter.class, TextPieceUser.class}, Void.TYPE);
                return;
            }
            if (textPieceUser2.user != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 1, textPieceUser2.user);
            }
            if (textPieceUser2.with_colon != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 2, textPieceUser2.with_colon);
            }
            protoWriter2.writeBytes(textPieceUser.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12256, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12256, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.user = this.user;
        builder.with_colon = this.with_colon;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12258, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12258, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.user != null) {
                i = this.user.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.with_colon != null) {
                i2 = this.with_colon.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12259, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12259, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        if (this.with_colon != null) {
            sb.append(", with_colon=");
            sb.append(this.with_colon);
        }
        StringBuilder replace = sb.replace(0, 2, "TextPieceUser{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12257, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12257, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof TextPieceUser)) {
                return false;
            }
            TextPieceUser textPieceUser = (TextPieceUser) obj;
            if (!unknownFields().equals(textPieceUser.unknownFields()) || !Internal.equals(this.user, textPieceUser.user) || !Internal.equals(this.with_colon, textPieceUser.with_colon)) {
                return false;
            }
            return true;
        }
    }

    public TextPieceUser(User user2, Boolean bool) {
        this(user2, bool, ByteString.EMPTY);
    }

    public TextPieceUser(User user2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user = user2;
        this.with_colon = bool;
    }
}
