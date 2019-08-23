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

public final class TextPiecePatternRef extends Message<TextPiecePatternRef, Builder> {
    public static final ProtoAdapter<TextPiecePatternRef> ADAPTER = new ProtoAdapter_TextPiecePatternRef();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String default_pattern;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String key;

    public static final class Builder extends Message.Builder<TextPiecePatternRef, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String default_pattern;
        public String key;

        public final TextPiecePatternRef build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12251, new Class[0], TextPiecePatternRef.class)) {
                return new TextPiecePatternRef(this.key, this.default_pattern, super.buildUnknownFields());
            }
            return (TextPiecePatternRef) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12251, new Class[0], TextPiecePatternRef.class);
        }

        public final Builder default_pattern(String str) {
            this.default_pattern = str;
            return this;
        }

        public final Builder key(String str) {
            this.key = str;
            return this;
        }
    }

    static final class ProtoAdapter_TextPiecePatternRef extends ProtoAdapter<TextPiecePatternRef> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_TextPiecePatternRef() {
            super(FieldEncoding.LENGTH_DELIMITED, TextPiecePatternRef.class);
        }

        public final int encodedSize(TextPiecePatternRef textPiecePatternRef) {
            int i;
            TextPiecePatternRef textPiecePatternRef2 = textPiecePatternRef;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{textPiecePatternRef2}, this, changeQuickRedirect, false, 12252, new Class[]{TextPiecePatternRef.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{textPiecePatternRef2}, this, changeQuickRedirect, false, 12252, new Class[]{TextPiecePatternRef.class}, Integer.TYPE)).intValue();
            }
            if (textPiecePatternRef2.key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, textPiecePatternRef2.key);
            } else {
                i = 0;
            }
            if (textPiecePatternRef2.default_pattern != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, textPiecePatternRef2.default_pattern);
            }
            return i + i2 + textPiecePatternRef.unknownFields().size();
        }

        public final TextPiecePatternRef redact(TextPiecePatternRef textPiecePatternRef) {
            if (PatchProxy.isSupport(new Object[]{textPiecePatternRef}, this, changeQuickRedirect, false, 12255, new Class[]{TextPiecePatternRef.class}, TextPiecePatternRef.class)) {
                return (TextPiecePatternRef) PatchProxy.accessDispatch(new Object[]{textPiecePatternRef}, this, changeQuickRedirect, false, 12255, new Class[]{TextPiecePatternRef.class}, TextPiecePatternRef.class);
            }
            Builder newBuilder = textPiecePatternRef.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final TextPiecePatternRef decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12254, new Class[]{ProtoReader.class}, TextPiecePatternRef.class)) {
                return (TextPiecePatternRef) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12254, new Class[]{ProtoReader.class}, TextPiecePatternRef.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.key((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            builder.default_pattern((String) ProtoAdapter.STRING.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, TextPiecePatternRef textPiecePatternRef) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            TextPiecePatternRef textPiecePatternRef2 = textPiecePatternRef;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, textPiecePatternRef2}, this, changeQuickRedirect, false, 12253, new Class[]{ProtoWriter.class, TextPiecePatternRef.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, textPiecePatternRef2}, this, changeQuickRedirect, false, 12253, new Class[]{ProtoWriter.class, TextPiecePatternRef.class}, Void.TYPE);
                return;
            }
            if (textPiecePatternRef2.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, textPiecePatternRef2.key);
            }
            if (textPiecePatternRef2.default_pattern != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, textPiecePatternRef2.default_pattern);
            }
            protoWriter2.writeBytes(textPiecePatternRef.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12247, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12247, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.key = this.key;
        builder.default_pattern = this.default_pattern;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12249, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12249, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.key != null) {
                i = this.key.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.default_pattern != null) {
                i2 = this.default_pattern.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12250, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12250, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.default_pattern != null) {
            sb.append(", default_pattern=");
            sb.append(this.default_pattern);
        }
        StringBuilder replace = sb.replace(0, 2, "TextPiecePatternRef{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12248, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12248, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof TextPiecePatternRef)) {
                return false;
            }
            TextPiecePatternRef textPiecePatternRef = (TextPiecePatternRef) obj;
            if (!unknownFields().equals(textPiecePatternRef.unknownFields()) || !Internal.equals(this.key, textPiecePatternRef.key) || !Internal.equals(this.default_pattern, textPiecePatternRef.default_pattern)) {
                return false;
            }
            return true;
        }
    }

    public TextPiecePatternRef(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public TextPiecePatternRef(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.default_pattern = str2;
    }
}
