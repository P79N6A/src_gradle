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

public final class TextPieceGift extends Message<TextPieceGift, Builder> {
    public static final ProtoAdapter<TextPieceGift> ADAPTER = new ProtoAdapter_TextPieceGift();
    public static final Long DEFAULT_GIFT_ID = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long gift_id;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.PatternRef#ADAPTER", tag = 2)
    public final PatternRef name_ref;

    public static final class Builder extends Message.Builder<TextPieceGift, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Long gift_id;
        public PatternRef name_ref;

        public final TextPieceGift build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12233, new Class[0], TextPieceGift.class)) {
                return new TextPieceGift(this.gift_id, this.name_ref, super.buildUnknownFields());
            }
            return (TextPieceGift) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12233, new Class[0], TextPieceGift.class);
        }

        public final Builder gift_id(Long l) {
            this.gift_id = l;
            return this;
        }

        public final Builder name_ref(PatternRef patternRef) {
            this.name_ref = patternRef;
            return this;
        }
    }

    static final class ProtoAdapter_TextPieceGift extends ProtoAdapter<TextPieceGift> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_TextPieceGift() {
            super(FieldEncoding.LENGTH_DELIMITED, TextPieceGift.class);
        }

        public final int encodedSize(TextPieceGift textPieceGift) {
            int i;
            TextPieceGift textPieceGift2 = textPieceGift;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{textPieceGift2}, this, changeQuickRedirect, false, 12234, new Class[]{TextPieceGift.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{textPieceGift2}, this, changeQuickRedirect, false, 12234, new Class[]{TextPieceGift.class}, Integer.TYPE)).intValue();
            }
            if (textPieceGift2.gift_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, textPieceGift2.gift_id);
            } else {
                i = 0;
            }
            if (textPieceGift2.name_ref != null) {
                i2 = PatternRef.ADAPTER.encodedSizeWithTag(2, textPieceGift2.name_ref);
            }
            return i + i2 + textPieceGift.unknownFields().size();
        }

        public final TextPieceGift redact(TextPieceGift textPieceGift) {
            if (PatchProxy.isSupport(new Object[]{textPieceGift}, this, changeQuickRedirect, false, 12237, new Class[]{TextPieceGift.class}, TextPieceGift.class)) {
                return (TextPieceGift) PatchProxy.accessDispatch(new Object[]{textPieceGift}, this, changeQuickRedirect, false, 12237, new Class[]{TextPieceGift.class}, TextPieceGift.class);
            }
            Builder newBuilder = textPieceGift.newBuilder();
            if (newBuilder.name_ref != null) {
                newBuilder.name_ref = (PatternRef) PatternRef.ADAPTER.redact(newBuilder.name_ref);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final TextPieceGift decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12236, new Class[]{ProtoReader.class}, TextPieceGift.class)) {
                return (TextPieceGift) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12236, new Class[]{ProtoReader.class}, TextPieceGift.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.gift_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 2:
                            builder.name_ref((PatternRef) PatternRef.ADAPTER.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, TextPieceGift textPieceGift) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            TextPieceGift textPieceGift2 = textPieceGift;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, textPieceGift2}, this, changeQuickRedirect, false, 12235, new Class[]{ProtoWriter.class, TextPieceGift.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, textPieceGift2}, this, changeQuickRedirect, false, 12235, new Class[]{ProtoWriter.class, TextPieceGift.class}, Void.TYPE);
                return;
            }
            if (textPieceGift2.gift_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, textPieceGift2.gift_id);
            }
            if (textPieceGift2.name_ref != null) {
                PatternRef.ADAPTER.encodeWithTag(protoWriter2, 2, textPieceGift2.name_ref);
            }
            protoWriter2.writeBytes(textPieceGift.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12229, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12229, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.gift_id = this.gift_id;
        builder.name_ref = this.name_ref;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12231, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12231, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.gift_id != null) {
                i = this.gift_id.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.name_ref != null) {
                i2 = this.name_ref.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12232, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12232, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.gift_id != null) {
            sb.append(", gift_id=");
            sb.append(this.gift_id);
        }
        if (this.name_ref != null) {
            sb.append(", name_ref=");
            sb.append(this.name_ref);
        }
        StringBuilder replace = sb.replace(0, 2, "TextPieceGift{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12230, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12230, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof TextPieceGift)) {
                return false;
            }
            TextPieceGift textPieceGift = (TextPieceGift) obj;
            if (!unknownFields().equals(textPieceGift.unknownFields()) || !Internal.equals(this.gift_id, textPieceGift.gift_id) || !Internal.equals(this.name_ref, textPieceGift.name_ref)) {
                return false;
            }
            return true;
        }
    }

    public TextPieceGift(Long l, PatternRef patternRef) {
        this(l, patternRef, ByteString.EMPTY);
    }

    public TextPieceGift(Long l, PatternRef patternRef, ByteString byteString) {
        super(ADAPTER, byteString);
        this.gift_id = l;
        this.name_ref = patternRef;
    }
}
