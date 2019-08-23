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

public final class TextPiece extends Message<TextPiece, Builder> {
    public static final ProtoAdapter<TextPiece> ADAPTER = new ProtoAdapter_TextPiece();
    public static final Integer DEFAULT_TYPE = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.TextFormat#ADAPTER", tag = 2)
    public final TextFormat format;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.TextPieceGift#ADAPTER", tag = 22)
    public final TextPieceGift gift_value;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.TextPieceHeart#ADAPTER", tag = 23)
    public final TextPieceHeart heart_value;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.TextPiecePatternRef#ADAPTER", tag = 24)
    public final TextPiecePatternRef pattern_ref_value;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 11)
    public final String string_value;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer type;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.TextPieceUser#ADAPTER", tag = 21)
    public final TextPieceUser user_value;

    public static final class Builder extends Message.Builder<TextPiece, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public TextFormat format;
        public TextPieceGift gift_value;
        public TextPieceHeart heart_value;
        public TextPiecePatternRef pattern_ref_value;
        public String string_value;
        public Integer type;
        public TextPieceUser user_value;

        public final TextPiece build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12224, new Class[0], TextPiece.class)) {
                return (TextPiece) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12224, new Class[0], TextPiece.class);
            }
            TextPiece textPiece = new TextPiece(this.type, this.format, this.string_value, this.user_value, this.gift_value, this.heart_value, this.pattern_ref_value, super.buildUnknownFields());
            return textPiece;
        }

        public final Builder format(TextFormat textFormat) {
            this.format = textFormat;
            return this;
        }

        public final Builder gift_value(TextPieceGift textPieceGift) {
            this.gift_value = textPieceGift;
            return this;
        }

        public final Builder heart_value(TextPieceHeart textPieceHeart) {
            this.heart_value = textPieceHeart;
            return this;
        }

        public final Builder pattern_ref_value(TextPiecePatternRef textPiecePatternRef) {
            this.pattern_ref_value = textPiecePatternRef;
            return this;
        }

        public final Builder string_value(String str) {
            this.string_value = str;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }

        public final Builder user_value(TextPieceUser textPieceUser) {
            this.user_value = textPieceUser;
            return this;
        }
    }

    static final class ProtoAdapter_TextPiece extends ProtoAdapter<TextPiece> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_TextPiece() {
            super(FieldEncoding.LENGTH_DELIMITED, TextPiece.class);
        }

        public final TextPiece decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12227, new Class[]{ProtoReader.class}, TextPiece.class)) {
                return (TextPiece) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12227, new Class[]{ProtoReader.class}, TextPiece.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader2.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 11) {
                    switch (nextTag) {
                        case 1:
                            builder.type((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 2:
                            builder.format((TextFormat) TextFormat.ADAPTER.decode(protoReader2));
                            break;
                        default:
                            switch (nextTag) {
                                case 21:
                                    builder.user_value((TextPieceUser) TextPieceUser.ADAPTER.decode(protoReader2));
                                    break;
                                case 22:
                                    builder.gift_value((TextPieceGift) TextPieceGift.ADAPTER.decode(protoReader2));
                                    break;
                                case 23:
                                    builder.heart_value((TextPieceHeart) TextPieceHeart.ADAPTER.decode(protoReader2));
                                    break;
                                case 24:
                                    builder.pattern_ref_value((TextPiecePatternRef) TextPiecePatternRef.ADAPTER.decode(protoReader2));
                                    break;
                                default:
                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                    break;
                            }
                    }
                } else {
                    builder.string_value((String) ProtoAdapter.STRING.decode(protoReader2));
                }
            }
        }

        public final int encodedSize(TextPiece textPiece) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            TextPiece textPiece2 = textPiece;
            int i7 = 0;
            if (PatchProxy.isSupport(new Object[]{textPiece2}, this, changeQuickRedirect, false, 12225, new Class[]{TextPiece.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{textPiece2}, this, changeQuickRedirect, false, 12225, new Class[]{TextPiece.class}, Integer.TYPE)).intValue();
            }
            if (textPiece2.type != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, textPiece2.type);
            } else {
                i = 0;
            }
            if (textPiece2.format != null) {
                i2 = TextFormat.ADAPTER.encodedSizeWithTag(2, textPiece2.format);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (textPiece2.string_value != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(11, textPiece2.string_value);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (textPiece2.user_value != null) {
                i4 = TextPieceUser.ADAPTER.encodedSizeWithTag(21, textPiece2.user_value);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (textPiece2.gift_value != null) {
                i5 = TextPieceGift.ADAPTER.encodedSizeWithTag(22, textPiece2.gift_value);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (textPiece2.heart_value != null) {
                i6 = TextPieceHeart.ADAPTER.encodedSizeWithTag(23, textPiece2.heart_value);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (textPiece2.pattern_ref_value != null) {
                i7 = TextPiecePatternRef.ADAPTER.encodedSizeWithTag(24, textPiece2.pattern_ref_value);
            }
            return i12 + i7 + textPiece.unknownFields().size();
        }

        public final TextPiece redact(TextPiece textPiece) {
            if (PatchProxy.isSupport(new Object[]{textPiece}, this, changeQuickRedirect, false, 12228, new Class[]{TextPiece.class}, TextPiece.class)) {
                return (TextPiece) PatchProxy.accessDispatch(new Object[]{textPiece}, this, changeQuickRedirect, false, 12228, new Class[]{TextPiece.class}, TextPiece.class);
            }
            Builder newBuilder = textPiece.newBuilder();
            if (newBuilder.format != null) {
                newBuilder.format = (TextFormat) TextFormat.ADAPTER.redact(newBuilder.format);
            }
            if (newBuilder.user_value != null) {
                newBuilder.user_value = (TextPieceUser) TextPieceUser.ADAPTER.redact(newBuilder.user_value);
            }
            if (newBuilder.gift_value != null) {
                newBuilder.gift_value = (TextPieceGift) TextPieceGift.ADAPTER.redact(newBuilder.gift_value);
            }
            if (newBuilder.heart_value != null) {
                newBuilder.heart_value = (TextPieceHeart) TextPieceHeart.ADAPTER.redact(newBuilder.heart_value);
            }
            if (newBuilder.pattern_ref_value != null) {
                newBuilder.pattern_ref_value = (TextPiecePatternRef) TextPiecePatternRef.ADAPTER.redact(newBuilder.pattern_ref_value);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final void encode(ProtoWriter protoWriter, TextPiece textPiece) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            TextPiece textPiece2 = textPiece;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, textPiece2}, this, changeQuickRedirect, false, 12226, new Class[]{ProtoWriter.class, TextPiece.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, textPiece2}, this, changeQuickRedirect, false, 12226, new Class[]{ProtoWriter.class, TextPiece.class}, Void.TYPE);
                return;
            }
            if (textPiece2.type != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1, textPiece2.type);
            }
            if (textPiece2.format != null) {
                TextFormat.ADAPTER.encodeWithTag(protoWriter2, 2, textPiece2.format);
            }
            if (textPiece2.string_value != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 11, textPiece2.string_value);
            }
            if (textPiece2.user_value != null) {
                TextPieceUser.ADAPTER.encodeWithTag(protoWriter2, 21, textPiece2.user_value);
            }
            if (textPiece2.gift_value != null) {
                TextPieceGift.ADAPTER.encodeWithTag(protoWriter2, 22, textPiece2.gift_value);
            }
            if (textPiece2.heart_value != null) {
                TextPieceHeart.ADAPTER.encodeWithTag(protoWriter2, 23, textPiece2.heart_value);
            }
            if (textPiece2.pattern_ref_value != null) {
                TextPiecePatternRef.ADAPTER.encodeWithTag(protoWriter2, 24, textPiece2.pattern_ref_value);
            }
            protoWriter2.writeBytes(textPiece.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12220, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12220, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.type = this.type;
        builder.format = this.format;
        builder.string_value = this.string_value;
        builder.user_value = this.user_value;
        builder.gift_value = this.gift_value;
        builder.heart_value = this.heart_value;
        builder.pattern_ref_value = this.pattern_ref_value;
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12222, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12222, new Class[0], Integer.TYPE)).intValue();
        }
        int i8 = this.hashCode;
        if (i8 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.type != null) {
                i = this.type.hashCode();
            } else {
                i = 0;
            }
            int i9 = (hashCode + i) * 37;
            if (this.format != null) {
                i2 = this.format.hashCode();
            } else {
                i2 = 0;
            }
            int i10 = (i9 + i2) * 37;
            if (this.string_value != null) {
                i3 = this.string_value.hashCode();
            } else {
                i3 = 0;
            }
            int i11 = (i10 + i3) * 37;
            if (this.user_value != null) {
                i4 = this.user_value.hashCode();
            } else {
                i4 = 0;
            }
            int i12 = (i11 + i4) * 37;
            if (this.gift_value != null) {
                i5 = this.gift_value.hashCode();
            } else {
                i5 = 0;
            }
            int i13 = (i12 + i5) * 37;
            if (this.heart_value != null) {
                i6 = this.heart_value.hashCode();
            } else {
                i6 = 0;
            }
            int i14 = (i13 + i6) * 37;
            if (this.pattern_ref_value != null) {
                i7 = this.pattern_ref_value.hashCode();
            }
            i8 = i14 + i7;
            this.hashCode = i8;
        }
        return i8;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12223, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12223, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.format != null) {
            sb.append(", format=");
            sb.append(this.format);
        }
        if (this.string_value != null) {
            sb.append(", string_value=");
            sb.append(this.string_value);
        }
        if (this.user_value != null) {
            sb.append(", user_value=");
            sb.append(this.user_value);
        }
        if (this.gift_value != null) {
            sb.append(", gift_value=");
            sb.append(this.gift_value);
        }
        if (this.heart_value != null) {
            sb.append(", heart_value=");
            sb.append(this.heart_value);
        }
        if (this.pattern_ref_value != null) {
            sb.append(", pattern_ref_value=");
            sb.append(this.pattern_ref_value);
        }
        StringBuilder replace = sb.replace(0, 2, "TextPiece{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12221, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12221, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof TextPiece)) {
                return false;
            }
            TextPiece textPiece = (TextPiece) obj;
            if (!unknownFields().equals(textPiece.unknownFields()) || !Internal.equals(this.type, textPiece.type) || !Internal.equals(this.format, textPiece.format) || !Internal.equals(this.string_value, textPiece.string_value) || !Internal.equals(this.user_value, textPiece.user_value) || !Internal.equals(this.gift_value, textPiece.gift_value) || !Internal.equals(this.heart_value, textPiece.heart_value) || !Internal.equals(this.pattern_ref_value, textPiece.pattern_ref_value)) {
                return false;
            }
            return true;
        }
    }

    public TextPiece(Integer num, TextFormat textFormat, String str, TextPieceUser textPieceUser, TextPieceGift textPieceGift, TextPieceHeart textPieceHeart, TextPiecePatternRef textPiecePatternRef) {
        this(num, textFormat, str, textPieceUser, textPieceGift, textPieceHeart, textPiecePatternRef, ByteString.EMPTY);
    }

    public TextPiece(Integer num, TextFormat textFormat, String str, TextPieceUser textPieceUser, TextPieceGift textPieceGift, TextPieceHeart textPieceHeart, TextPiecePatternRef textPiecePatternRef, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = num;
        this.format = textFormat;
        this.string_value = str;
        this.user_value = textPieceUser;
        this.gift_value = textPieceGift;
        this.heart_value = textPieceHeart;
        this.pattern_ref_value = textPiecePatternRef;
    }
}
