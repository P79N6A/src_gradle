package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.KtNullable;
import com.bytedance.ies.c.a;
import com.bytedance.ies.c.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UgProfileTabGuide extends Message<UgProfileTabGuide, Builder> {
    public static final DefaultValueProtoAdapter<UgProfileTabGuide> ADAPTER = new ProtoAdapter_UgProfileTabGuide();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UgBubble#ADAPTER", tag = 1)
    public final UgBubble bubble;

    public static final class Builder extends Message.Builder<UgProfileTabGuide, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public UgBubble bubble;

        public final UgProfileTabGuide build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49305, new Class[0], UgProfileTabGuide.class)) {
                return new UgProfileTabGuide(this.bubble, super.buildUnknownFields());
            }
            return (UgProfileTabGuide) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49305, new Class[0], UgProfileTabGuide.class);
        }

        public final Builder bubble(UgBubble ugBubble) {
            this.bubble = ugBubble;
            return this;
        }
    }

    static final class ProtoAdapter_UgProfileTabGuide extends DefaultValueProtoAdapter<UgProfileTabGuide> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final UgProfileTabGuide redact(UgProfileTabGuide ugProfileTabGuide) {
            return ugProfileTabGuide;
        }

        public ProtoAdapter_UgProfileTabGuide() {
            super(FieldEncoding.LENGTH_DELIMITED, UgProfileTabGuide.class);
        }

        public final UgProfileTabGuide decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49308, new Class[]{ProtoReader.class}, UgProfileTabGuide.class)) {
                return decode(protoReader2, (UgProfileTabGuide) null);
            }
            return (UgProfileTabGuide) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49308, new Class[]{ProtoReader.class}, UgProfileTabGuide.class);
        }

        public final int encodedSize(UgProfileTabGuide ugProfileTabGuide) {
            UgProfileTabGuide ugProfileTabGuide2 = ugProfileTabGuide;
            if (!PatchProxy.isSupport(new Object[]{ugProfileTabGuide2}, this, changeQuickRedirect, false, 49306, new Class[]{UgProfileTabGuide.class}, Integer.TYPE)) {
                return UgBubble.ADAPTER.encodedSizeWithTag(1, ugProfileTabGuide2.bubble) + ugProfileTabGuide.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{ugProfileTabGuide2}, this, changeQuickRedirect, false, 49306, new Class[]{UgProfileTabGuide.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, UgProfileTabGuide ugProfileTabGuide) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            UgProfileTabGuide ugProfileTabGuide2 = ugProfileTabGuide;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, ugProfileTabGuide2}, this, changeQuickRedirect, false, 49307, new Class[]{ProtoWriter.class, UgProfileTabGuide.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, ugProfileTabGuide2}, this, changeQuickRedirect, false, 49307, new Class[]{ProtoWriter.class, UgProfileTabGuide.class}, Void.TYPE);
                return;
            }
            UgBubble.ADAPTER.encodeWithTag(protoWriter2, 1, ugProfileTabGuide2.bubble);
            protoWriter2.writeBytes(ugProfileTabGuide.unknownFields());
        }

        public final UgProfileTabGuide decode(ProtoReader protoReader, UgProfileTabGuide ugProfileTabGuide) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            UgProfileTabGuide ugProfileTabGuide2 = ugProfileTabGuide;
            if (PatchProxy.isSupport(new Object[]{protoReader2, ugProfileTabGuide2}, this, changeQuickRedirect, false, 49309, new Class[]{ProtoReader.class, UgProfileTabGuide.class}, UgProfileTabGuide.class)) {
                return (UgProfileTabGuide) PatchProxy.accessDispatch(new Object[]{protoReader2, ugProfileTabGuide2}, this, changeQuickRedirect, false, 49309, new Class[]{ProtoReader.class, UgProfileTabGuide.class}, UgProfileTabGuide.class);
            }
            UgProfileTabGuide ugProfileTabGuide3 = (UgProfileTabGuide) a.a().a(UgProfileTabGuide.class, ugProfileTabGuide2);
            if (ugProfileTabGuide3 != null) {
                builder = ugProfileTabGuide3.newBuilder();
            } else {
                builder = new Builder();
            }
            Builder builder2 = builder;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader2.endMessage(beginMessage);
                    return builder2.build();
                } else if (nextTag != 1) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                    } catch (b e2) {
                        if (ugProfileTabGuide3 == null) {
                            throw e2;
                        }
                    }
                } else {
                    builder2.bubble((UgBubble) UgBubble.ADAPTER.decode(protoReader2, builder2.bubble));
                }
            }
        }
    }

    @KtNullable
    public final UgBubble getBubble() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49300, new Class[0], UgBubble.class)) {
            return (UgBubble) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49300, new Class[0], UgBubble.class);
        } else if (this.bubble != null) {
            return this.bubble;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49301, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49301, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.bubble = this.bubble;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49303, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49303, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.bubble != null) {
                i = this.bubble.hashCode();
            }
            i2 = hashCode + i;
            this.hashCode = i2;
        }
        return i2;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49304, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49304, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.bubble != null) {
            sb.append(", bubble=");
            sb.append(this.bubble);
        }
        StringBuilder replace = sb.replace(0, 2, "UgProfileTabGuide{");
        replace.append('}');
        return replace.toString();
    }

    public UgProfileTabGuide(UgBubble ugBubble) {
        this(ugBubble, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49302, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49302, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof UgProfileTabGuide)) {
                return false;
            }
            UgProfileTabGuide ugProfileTabGuide = (UgProfileTabGuide) obj;
            if (!unknownFields().equals(ugProfileTabGuide.unknownFields()) || !Internal.equals(this.bubble, ugProfileTabGuide.bubble)) {
                return false;
            }
            return true;
        }
    }

    public UgProfileTabGuide(UgBubble ugBubble, ByteString byteString) {
        super(ADAPTER, byteString);
        this.bubble = ugBubble;
    }
}
