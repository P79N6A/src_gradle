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
import java.util.List;
import okio.ByteString;

public final class Text extends Message<Text, Builder> {
    public static final ProtoAdapter<Text> ADAPTER = new ProtoAdapter_Text();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.TextFormat#ADAPTER", tag = 3)
    public final TextFormat default_format;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String default_pattern;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String key;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.TextPiece#ADAPTER", label = WireField.Label.REPEATED, tag = 4)
    public final List<TextPiece> pieces;

    public static final class Builder extends Message.Builder<Text, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public TextFormat default_format;
        public String default_pattern;
        public String key;
        public List<TextPiece> pieces = Internal.newMutableList();

        public final Text build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12206, new Class[0], Text.class)) {
                return (Text) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12206, new Class[0], Text.class);
            }
            Text text = new Text(this.key, this.default_pattern, this.default_format, this.pieces, super.buildUnknownFields());
            return text;
        }

        public final Builder default_format(TextFormat textFormat) {
            this.default_format = textFormat;
            return this;
        }

        public final Builder default_pattern(String str) {
            this.default_pattern = str;
            return this;
        }

        public final Builder key(String str) {
            this.key = str;
            return this;
        }

        public final Builder pieces(List<TextPiece> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 12205, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 12205, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.pieces = list;
            return this;
        }
    }

    static final class ProtoAdapter_Text extends ProtoAdapter<Text> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_Text() {
            super(FieldEncoding.LENGTH_DELIMITED, Text.class);
        }

        public final int encodedSize(Text text) {
            int i;
            int i2;
            Text text2 = text;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[]{text2}, this, changeQuickRedirect, false, 12207, new Class[]{Text.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{text2}, this, changeQuickRedirect, false, 12207, new Class[]{Text.class}, Integer.TYPE)).intValue();
            }
            if (text2.key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, text2.key);
            } else {
                i = 0;
            }
            if (text2.default_pattern != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, text2.default_pattern);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (text2.default_format != null) {
                i3 = TextFormat.ADAPTER.encodedSizeWithTag(3, text2.default_format);
            }
            return i4 + i3 + TextPiece.ADAPTER.asRepeated().encodedSizeWithTag(4, text2.pieces) + text.unknownFields().size();
        }

        public final Text redact(Text text) {
            if (PatchProxy.isSupport(new Object[]{text}, this, changeQuickRedirect, false, 12210, new Class[]{Text.class}, Text.class)) {
                return (Text) PatchProxy.accessDispatch(new Object[]{text}, this, changeQuickRedirect, false, 12210, new Class[]{Text.class}, Text.class);
            }
            Builder newBuilder = text.newBuilder();
            if (newBuilder.default_format != null) {
                newBuilder.default_format = (TextFormat) TextFormat.ADAPTER.redact(newBuilder.default_format);
            }
            Internal.redactElements(newBuilder.pieces, TextPiece.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final Text decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12209, new Class[]{ProtoReader.class}, Text.class)) {
                return (Text) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12209, new Class[]{ProtoReader.class}, Text.class);
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
                        case 3:
                            builder.default_format((TextFormat) TextFormat.ADAPTER.decode(protoReader2));
                            break;
                        case 4:
                            builder.pieces.add(TextPiece.ADAPTER.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, Text text) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            Text text2 = text;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, text2}, this, changeQuickRedirect, false, 12208, new Class[]{ProtoWriter.class, Text.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, text2}, this, changeQuickRedirect, false, 12208, new Class[]{ProtoWriter.class, Text.class}, Void.TYPE);
                return;
            }
            if (text2.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, text2.key);
            }
            if (text2.default_pattern != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, text2.default_pattern);
            }
            if (text2.default_format != null) {
                TextFormat.ADAPTER.encodeWithTag(protoWriter2, 3, text2.default_format);
            }
            TextPiece.ADAPTER.asRepeated().encodeWithTag(protoWriter2, 4, text2.pieces);
            protoWriter2.writeBytes(text.unknownFields());
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12203, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12203, new Class[0], Integer.TYPE)).intValue();
        }
        int i4 = this.hashCode;
        if (i4 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.key != null) {
                i = this.key.hashCode();
            } else {
                i = 0;
            }
            int i5 = (hashCode + i) * 37;
            if (this.default_pattern != null) {
                i2 = this.default_pattern.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            if (this.default_format != null) {
                i3 = this.default_format.hashCode();
            }
            i4 = ((i6 + i3) * 37) + this.pieces.hashCode();
            this.hashCode = i4;
        }
        return i4;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12201, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12201, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.key = this.key;
        builder.default_pattern = this.default_pattern;
        builder.default_format = this.default_format;
        builder.pieces = Internal.copyOf("pieces", this.pieces);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12204, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12204, new Class[0], String.class);
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
        if (this.default_format != null) {
            sb.append(", default_format=");
            sb.append(this.default_format);
        }
        if (!this.pieces.isEmpty()) {
            sb.append(", pieces=");
            sb.append(this.pieces);
        }
        StringBuilder replace = sb.replace(0, 2, "Text{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12202, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12202, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof Text)) {
                return false;
            }
            Text text = (Text) obj;
            if (!unknownFields().equals(text.unknownFields()) || !Internal.equals(this.key, text.key) || !Internal.equals(this.default_pattern, text.default_pattern) || !Internal.equals(this.default_format, text.default_format) || !this.pieces.equals(text.pieces)) {
                return false;
            }
            return true;
        }
    }

    public Text(String str, String str2, TextFormat textFormat, List<TextPiece> list) {
        this(str, str2, textFormat, list, ByteString.EMPTY);
    }

    public Text(String str, String str2, TextFormat textFormat, List<TextPiece> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.default_pattern = str2;
        this.default_format = textFormat;
        this.pieces = Internal.immutableCopyOf("pieces", list);
    }
}
