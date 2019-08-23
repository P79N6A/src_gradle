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

public final class TextFormat extends Message<TextFormat, Builder> {
    public static final ProtoAdapter<TextFormat> ADAPTER = new ProtoAdapter_TextFormat();
    public static final Boolean DEFAULT_BOLD = Boolean.FALSE;
    public static final Boolean DEFAULT_ITALIC = Boolean.FALSE;
    public static final Integer DEFAULT_ITALIC_ANGLE = 0;
    public static final Integer DEFAULT_WEIGHT = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean bold;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String color;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public final Boolean italic;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public final Integer italic_angle;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer weight;

    public static final class Builder extends Message.Builder<TextFormat, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Boolean bold;
        public String color;
        public Boolean italic;
        public Integer italic_angle;
        public Integer weight;

        public final TextFormat build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12215, new Class[0], TextFormat.class)) {
                return (TextFormat) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12215, new Class[0], TextFormat.class);
            }
            TextFormat textFormat = new TextFormat(this.color, this.bold, this.italic, this.weight, this.italic_angle, super.buildUnknownFields());
            return textFormat;
        }

        public final Builder bold(Boolean bool) {
            this.bold = bool;
            return this;
        }

        public final Builder color(String str) {
            this.color = str;
            return this;
        }

        public final Builder italic(Boolean bool) {
            this.italic = bool;
            return this;
        }

        public final Builder italic_angle(Integer num) {
            this.italic_angle = num;
            return this;
        }

        public final Builder weight(Integer num) {
            this.weight = num;
            return this;
        }
    }

    static final class ProtoAdapter_TextFormat extends ProtoAdapter<TextFormat> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_TextFormat() {
            super(FieldEncoding.LENGTH_DELIMITED, TextFormat.class);
        }

        public final TextFormat redact(TextFormat textFormat) {
            if (PatchProxy.isSupport(new Object[]{textFormat}, this, changeQuickRedirect, false, 12219, new Class[]{TextFormat.class}, TextFormat.class)) {
                return (TextFormat) PatchProxy.accessDispatch(new Object[]{textFormat}, this, changeQuickRedirect, false, 12219, new Class[]{TextFormat.class}, TextFormat.class);
            }
            Builder newBuilder = textFormat.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final TextFormat decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12218, new Class[]{ProtoReader.class}, TextFormat.class)) {
                return (TextFormat) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12218, new Class[]{ProtoReader.class}, TextFormat.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.color((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            builder.bold((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 3:
                            builder.italic((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 4:
                            builder.weight((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 5:
                            builder.italic_angle((Integer) ProtoAdapter.INT32.decode(protoReader2));
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

        public final int encodedSize(TextFormat textFormat) {
            int i;
            int i2;
            int i3;
            int i4;
            TextFormat textFormat2 = textFormat;
            int i5 = 0;
            if (PatchProxy.isSupport(new Object[]{textFormat2}, this, changeQuickRedirect, false, 12216, new Class[]{TextFormat.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{textFormat2}, this, changeQuickRedirect, false, 12216, new Class[]{TextFormat.class}, Integer.TYPE)).intValue();
            }
            if (textFormat2.color != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, textFormat2.color);
            } else {
                i = 0;
            }
            if (textFormat2.bold != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, textFormat2.bold);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (textFormat2.italic != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, textFormat2.italic);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (textFormat2.weight != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(4, textFormat2.weight);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (textFormat2.italic_angle != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(5, textFormat2.italic_angle);
            }
            return i8 + i5 + textFormat.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, TextFormat textFormat) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            TextFormat textFormat2 = textFormat;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, textFormat2}, this, changeQuickRedirect, false, 12217, new Class[]{ProtoWriter.class, TextFormat.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, textFormat2}, this, changeQuickRedirect, false, 12217, new Class[]{ProtoWriter.class, TextFormat.class}, Void.TYPE);
                return;
            }
            if (textFormat2.color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, textFormat2.color);
            }
            if (textFormat2.bold != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 2, textFormat2.bold);
            }
            if (textFormat2.italic != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 3, textFormat2.italic);
            }
            if (textFormat2.weight != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 4, textFormat2.weight);
            }
            if (textFormat2.italic_angle != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 5, textFormat2.italic_angle);
            }
            protoWriter2.writeBytes(textFormat.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12211, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12211, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.color = this.color;
        builder.bold = this.bold;
        builder.italic = this.italic;
        builder.weight = this.weight;
        builder.italic_angle = this.italic_angle;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12213, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12213, new Class[0], Integer.TYPE)).intValue();
        }
        int i6 = this.hashCode;
        if (i6 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.color != null) {
                i = this.color.hashCode();
            } else {
                i = 0;
            }
            int i7 = (hashCode + i) * 37;
            if (this.bold != null) {
                i2 = this.bold.hashCode();
            } else {
                i2 = 0;
            }
            int i8 = (i7 + i2) * 37;
            if (this.italic != null) {
                i3 = this.italic.hashCode();
            } else {
                i3 = 0;
            }
            int i9 = (i8 + i3) * 37;
            if (this.weight != null) {
                i4 = this.weight.hashCode();
            } else {
                i4 = 0;
            }
            int i10 = (i9 + i4) * 37;
            if (this.italic_angle != null) {
                i5 = this.italic_angle.hashCode();
            }
            i6 = i10 + i5;
            this.hashCode = i6;
        }
        return i6;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12214, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12214, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.color != null) {
            sb.append(", color=");
            sb.append(this.color);
        }
        if (this.bold != null) {
            sb.append(", bold=");
            sb.append(this.bold);
        }
        if (this.italic != null) {
            sb.append(", italic=");
            sb.append(this.italic);
        }
        if (this.weight != null) {
            sb.append(", weight=");
            sb.append(this.weight);
        }
        if (this.italic_angle != null) {
            sb.append(", italic_angle=");
            sb.append(this.italic_angle);
        }
        StringBuilder replace = sb.replace(0, 2, "TextFormat{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12212, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12212, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof TextFormat)) {
                return false;
            }
            TextFormat textFormat = (TextFormat) obj;
            if (!unknownFields().equals(textFormat.unknownFields()) || !Internal.equals(this.color, textFormat.color) || !Internal.equals(this.bold, textFormat.bold) || !Internal.equals(this.italic, textFormat.italic) || !Internal.equals(this.weight, textFormat.weight) || !Internal.equals(this.italic_angle, textFormat.italic_angle)) {
                return false;
            }
            return true;
        }
    }

    public TextFormat(String str, Boolean bool, Boolean bool2, Integer num, Integer num2) {
        this(str, bool, bool2, num, num2, ByteString.EMPTY);
    }

    public TextFormat(String str, Boolean bool, Boolean bool2, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.color = str;
        this.bold = bool;
        this.italic = bool2;
        this.weight = num;
        this.italic_angle = num2;
    }
}
