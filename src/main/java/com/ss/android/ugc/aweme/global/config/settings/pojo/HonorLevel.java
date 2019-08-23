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

public final class HonorLevel extends Message<HonorLevel, Builder> {
    public static final DefaultValueProtoAdapter<HonorLevel> ADAPTER = new ProtoAdapter_HonorLevel();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String schema;

    public static final class Builder extends Message.Builder<HonorLevel, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String schema;

        public final HonorLevel build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48001, new Class[0], HonorLevel.class)) {
                return new HonorLevel(this.schema, super.buildUnknownFields());
            }
            return (HonorLevel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48001, new Class[0], HonorLevel.class);
        }

        public final Builder schema(String str) {
            this.schema = str;
            return this;
        }
    }

    static final class ProtoAdapter_HonorLevel extends DefaultValueProtoAdapter<HonorLevel> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final HonorLevel redact(HonorLevel honorLevel) {
            return honorLevel;
        }

        public ProtoAdapter_HonorLevel() {
            super(FieldEncoding.LENGTH_DELIMITED, HonorLevel.class);
        }

        public final HonorLevel decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48004, new Class[]{ProtoReader.class}, HonorLevel.class)) {
                return decode(protoReader2, (HonorLevel) null);
            }
            return (HonorLevel) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48004, new Class[]{ProtoReader.class}, HonorLevel.class);
        }

        public final int encodedSize(HonorLevel honorLevel) {
            HonorLevel honorLevel2 = honorLevel;
            if (!PatchProxy.isSupport(new Object[]{honorLevel2}, this, changeQuickRedirect, false, 48002, new Class[]{HonorLevel.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, honorLevel2.schema) + honorLevel.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{honorLevel2}, this, changeQuickRedirect, false, 48002, new Class[]{HonorLevel.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, HonorLevel honorLevel) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            HonorLevel honorLevel2 = honorLevel;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, honorLevel2}, this, changeQuickRedirect, false, 48003, new Class[]{ProtoWriter.class, HonorLevel.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, honorLevel2}, this, changeQuickRedirect, false, 48003, new Class[]{ProtoWriter.class, HonorLevel.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, honorLevel2.schema);
            protoWriter2.writeBytes(honorLevel.unknownFields());
        }

        public final HonorLevel decode(ProtoReader protoReader, HonorLevel honorLevel) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            HonorLevel honorLevel2 = honorLevel;
            if (PatchProxy.isSupport(new Object[]{protoReader2, honorLevel2}, this, changeQuickRedirect, false, 48005, new Class[]{ProtoReader.class, HonorLevel.class}, HonorLevel.class)) {
                return (HonorLevel) PatchProxy.accessDispatch(new Object[]{protoReader2, honorLevel2}, this, changeQuickRedirect, false, 48005, new Class[]{ProtoReader.class, HonorLevel.class}, HonorLevel.class);
            }
            HonorLevel honorLevel3 = (HonorLevel) a.a().a(HonorLevel.class, honorLevel2);
            if (honorLevel3 != null) {
                builder = honorLevel3.newBuilder();
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
                        if (honorLevel3 == null) {
                            throw e2;
                        }
                    }
                } else {
                    builder2.schema((String) ProtoAdapter.STRING.decode(protoReader2));
                }
            }
        }
    }

    @KtNullable
    public final String getSchema() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47996, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47996, new Class[0], String.class);
        } else if (this.schema != null) {
            return this.schema;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47997, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47997, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.schema = this.schema;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47999, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47999, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.schema != null) {
                i = this.schema.hashCode();
            }
            i2 = hashCode + i;
            this.hashCode = i2;
        }
        return i2;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48000, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48000, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.schema != null) {
            sb.append(", schema=");
            sb.append(this.schema);
        }
        StringBuilder replace = sb.replace(0, 2, "HonorLevel{");
        replace.append('}');
        return replace.toString();
    }

    public HonorLevel(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47998, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47998, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof HonorLevel)) {
                return false;
            }
            HonorLevel honorLevel = (HonorLevel) obj;
            if (!unknownFields().equals(honorLevel.unknownFields()) || !Internal.equals(this.schema, honorLevel.schema)) {
                return false;
            }
            return true;
        }
    }

    public HonorLevel(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.schema = str;
    }
}
