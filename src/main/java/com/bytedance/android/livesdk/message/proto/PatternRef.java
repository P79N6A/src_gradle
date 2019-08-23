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

public final class PatternRef extends Message<PatternRef, Builder> {
    public static final ProtoAdapter<PatternRef> ADAPTER = new ProtoAdapter_PatternRef();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String default_pattern;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String key;

    public static final class Builder extends Message.Builder<PatternRef, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String default_pattern;
        public String key;

        public final PatternRef build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11982, new Class[0], PatternRef.class)) {
                return new PatternRef(this.key, this.default_pattern, super.buildUnknownFields());
            }
            return (PatternRef) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11982, new Class[0], PatternRef.class);
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

    static final class ProtoAdapter_PatternRef extends ProtoAdapter<PatternRef> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_PatternRef() {
            super(FieldEncoding.LENGTH_DELIMITED, PatternRef.class);
        }

        public final int encodedSize(PatternRef patternRef) {
            int i;
            PatternRef patternRef2 = patternRef;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{patternRef2}, this, changeQuickRedirect, false, 11983, new Class[]{PatternRef.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{patternRef2}, this, changeQuickRedirect, false, 11983, new Class[]{PatternRef.class}, Integer.TYPE)).intValue();
            }
            if (patternRef2.key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, patternRef2.key);
            } else {
                i = 0;
            }
            if (patternRef2.default_pattern != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, patternRef2.default_pattern);
            }
            return i + i2 + patternRef.unknownFields().size();
        }

        public final PatternRef redact(PatternRef patternRef) {
            if (PatchProxy.isSupport(new Object[]{patternRef}, this, changeQuickRedirect, false, 11986, new Class[]{PatternRef.class}, PatternRef.class)) {
                return (PatternRef) PatchProxy.accessDispatch(new Object[]{patternRef}, this, changeQuickRedirect, false, 11986, new Class[]{PatternRef.class}, PatternRef.class);
            }
            Builder newBuilder = patternRef.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final PatternRef decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11985, new Class[]{ProtoReader.class}, PatternRef.class)) {
                return (PatternRef) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11985, new Class[]{ProtoReader.class}, PatternRef.class);
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

        public final void encode(ProtoWriter protoWriter, PatternRef patternRef) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            PatternRef patternRef2 = patternRef;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, patternRef2}, this, changeQuickRedirect, false, 11984, new Class[]{ProtoWriter.class, PatternRef.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, patternRef2}, this, changeQuickRedirect, false, 11984, new Class[]{ProtoWriter.class, PatternRef.class}, Void.TYPE);
                return;
            }
            if (patternRef2.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, patternRef2.key);
            }
            if (patternRef2.default_pattern != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, patternRef2.default_pattern);
            }
            protoWriter2.writeBytes(patternRef.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11978, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11978, new Class[0], Builder.class);
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11980, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11980, new Class[0], Integer.TYPE)).intValue();
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11981, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11981, new Class[0], String.class);
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
        StringBuilder replace = sb.replace(0, 2, "PatternRef{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11979, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11979, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof PatternRef)) {
                return false;
            }
            PatternRef patternRef = (PatternRef) obj;
            if (!unknownFields().equals(patternRef.unknownFields()) || !Internal.equals(this.key, patternRef.key) || !Internal.equals(this.default_pattern, patternRef.default_pattern)) {
                return false;
            }
            return true;
        }
    }

    public PatternRef(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public PatternRef(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.default_pattern = str2;
    }
}
