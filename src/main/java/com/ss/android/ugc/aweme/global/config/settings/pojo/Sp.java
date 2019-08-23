package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.KtNullable;
import com.bytedance.ies.c.a;
import com.bytedance.ies.c.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class Sp extends Message<Sp, Builder> {
    public static final DefaultValueProtoAdapter<Sp> ADAPTER = new ProtoAdapter_Sp();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String estr;

    public static final class Builder extends Message.Builder<Sp, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String estr;

        public final Sp build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49140, new Class[0], Sp.class)) {
                return new Sp(this.estr, super.buildUnknownFields());
            }
            return (Sp) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49140, new Class[0], Sp.class);
        }

        public final Builder estr(String str) {
            this.estr = str;
            return this;
        }
    }

    static final class ProtoAdapter_Sp extends DefaultValueProtoAdapter<Sp> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final Sp redact(Sp sp) {
            return sp;
        }

        public ProtoAdapter_Sp() {
            super(FieldEncoding.LENGTH_DELIMITED, Sp.class);
        }

        public final Sp decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49143, new Class[]{ProtoReader.class}, Sp.class)) {
                return decode(protoReader2, (Sp) null);
            }
            return (Sp) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49143, new Class[]{ProtoReader.class}, Sp.class);
        }

        public final int encodedSize(Sp sp) {
            Sp sp2 = sp;
            if (!PatchProxy.isSupport(new Object[]{sp2}, this, changeQuickRedirect, false, 49141, new Class[]{Sp.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, sp2.estr) + sp.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{sp2}, this, changeQuickRedirect, false, 49141, new Class[]{Sp.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, Sp sp) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            Sp sp2 = sp;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, sp2}, this, changeQuickRedirect, false, 49142, new Class[]{ProtoWriter.class, Sp.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, sp2}, this, changeQuickRedirect, false, 49142, new Class[]{ProtoWriter.class, Sp.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, sp2.estr);
            protoWriter2.writeBytes(sp.unknownFields());
        }

        public final Sp decode(ProtoReader protoReader, Sp sp) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            Sp sp2 = sp;
            if (PatchProxy.isSupport(new Object[]{protoReader2, sp2}, this, changeQuickRedirect, false, 49144, new Class[]{ProtoReader.class, Sp.class}, Sp.class)) {
                return (Sp) PatchProxy.accessDispatch(new Object[]{protoReader2, sp2}, this, changeQuickRedirect, false, 49144, new Class[]{ProtoReader.class, Sp.class}, Sp.class);
            }
            Sp sp3 = (Sp) a.a().a(Sp.class, sp2);
            if (sp3 != null) {
                builder = sp3.newBuilder();
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
                        if (sp3 == null) {
                            throw e2;
                        }
                    }
                } else {
                    builder2.estr((String) ProtoAdapter.STRING.decode(protoReader2));
                }
            }
        }
    }

    @KtNullable
    public final String getEstr() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49135, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49135, new Class[0], String.class);
        } else if (this.estr != null) {
            return this.estr;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49136, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49136, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.estr = this.estr;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49138, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49138, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.estr != null) {
                i = this.estr.hashCode();
            }
            i2 = hashCode + i;
            this.hashCode = i2;
        }
        return i2;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49139, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49139, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.estr != null) {
            sb.append(", estr=");
            sb.append(this.estr);
        }
        StringBuilder replace = sb.replace(0, 2, "Sp{");
        replace.append('}');
        return replace.toString();
    }

    public Sp(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49137, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49137, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof Sp)) {
                return false;
            }
            Sp sp = (Sp) obj;
            if (!unknownFields().equals(sp.unknownFields()) || !Internal.equals(this.estr, sp.estr)) {
                return false;
            }
            return true;
        }
    }

    public Sp(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.estr = str;
    }
}
