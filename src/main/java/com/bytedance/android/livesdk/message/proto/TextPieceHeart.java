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

public final class TextPieceHeart extends Message<TextPieceHeart, Builder> {
    public static final ProtoAdapter<TextPieceHeart> ADAPTER = new ProtoAdapter_TextPieceHeart();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String color;

    public static final class Builder extends Message.Builder<TextPieceHeart, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String color;

        public final TextPieceHeart build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12242, new Class[0], TextPieceHeart.class)) {
                return new TextPieceHeart(this.color, super.buildUnknownFields());
            }
            return (TextPieceHeart) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12242, new Class[0], TextPieceHeart.class);
        }

        public final Builder color(String str) {
            this.color = str;
            return this;
        }
    }

    static final class ProtoAdapter_TextPieceHeart extends ProtoAdapter<TextPieceHeart> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_TextPieceHeart() {
            super(FieldEncoding.LENGTH_DELIMITED, TextPieceHeart.class);
        }

        public final TextPieceHeart decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12245, new Class[]{ProtoReader.class}, TextPieceHeart.class)) {
                return (TextPieceHeart) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12245, new Class[]{ProtoReader.class}, TextPieceHeart.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader2.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                } else {
                    builder.color((String) ProtoAdapter.STRING.decode(protoReader2));
                }
            }
        }

        public final int encodedSize(TextPieceHeart textPieceHeart) {
            TextPieceHeart textPieceHeart2 = textPieceHeart;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{textPieceHeart2}, this, changeQuickRedirect, false, 12243, new Class[]{TextPieceHeart.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{textPieceHeart2}, this, changeQuickRedirect, false, 12243, new Class[]{TextPieceHeart.class}, Integer.TYPE)).intValue();
            }
            if (textPieceHeart2.color != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, textPieceHeart2.color);
            }
            return i + textPieceHeart.unknownFields().size();
        }

        public final TextPieceHeart redact(TextPieceHeart textPieceHeart) {
            if (PatchProxy.isSupport(new Object[]{textPieceHeart}, this, changeQuickRedirect, false, 12246, new Class[]{TextPieceHeart.class}, TextPieceHeart.class)) {
                return (TextPieceHeart) PatchProxy.accessDispatch(new Object[]{textPieceHeart}, this, changeQuickRedirect, false, 12246, new Class[]{TextPieceHeart.class}, TextPieceHeart.class);
            }
            Builder newBuilder = textPieceHeart.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final void encode(ProtoWriter protoWriter, TextPieceHeart textPieceHeart) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            TextPieceHeart textPieceHeart2 = textPieceHeart;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, textPieceHeart2}, this, changeQuickRedirect, false, 12244, new Class[]{ProtoWriter.class, TextPieceHeart.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, textPieceHeart2}, this, changeQuickRedirect, false, 12244, new Class[]{ProtoWriter.class, TextPieceHeart.class}, Void.TYPE);
                return;
            }
            if (textPieceHeart2.color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, textPieceHeart2.color);
            }
            protoWriter2.writeBytes(textPieceHeart.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12238, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12238, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.color = this.color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12240, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12240, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.color != null) {
                i = this.color.hashCode();
            }
            i2 = hashCode + i;
            this.hashCode = i2;
        }
        return i2;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12241, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12241, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.color != null) {
            sb.append(", color=");
            sb.append(this.color);
        }
        StringBuilder replace = sb.replace(0, 2, "TextPieceHeart{");
        replace.append('}');
        return replace.toString();
    }

    public TextPieceHeart(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12239, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12239, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof TextPieceHeart)) {
                return false;
            }
            TextPieceHeart textPieceHeart = (TextPieceHeart) obj;
            if (!unknownFields().equals(textPieceHeart.unknownFields()) || !Internal.equals(this.color, textPieceHeart.color)) {
                return false;
            }
            return true;
        }
    }

    public TextPieceHeart(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.color = str;
    }
}
