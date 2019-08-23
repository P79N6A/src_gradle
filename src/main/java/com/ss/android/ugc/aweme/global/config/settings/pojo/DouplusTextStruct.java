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

public final class DouplusTextStruct extends Message<DouplusTextStruct, Builder> {
    public static final DefaultValueProtoAdapter<DouplusTextStruct> ADAPTER = new ProtoAdapter_DouplusTextStruct();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String title;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer type;

    public static final class Builder extends Message.Builder<DouplusTextStruct, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String title;
        public Integer type;

        public final DouplusTextStruct build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47813, new Class[0], DouplusTextStruct.class)) {
                return new DouplusTextStruct(this.type, this.title, super.buildUnknownFields());
            }
            return (DouplusTextStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47813, new Class[0], DouplusTextStruct.class);
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }
    }

    static final class ProtoAdapter_DouplusTextStruct extends DefaultValueProtoAdapter<DouplusTextStruct> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final DouplusTextStruct redact(DouplusTextStruct douplusTextStruct) {
            return douplusTextStruct;
        }

        public ProtoAdapter_DouplusTextStruct() {
            super(FieldEncoding.LENGTH_DELIMITED, DouplusTextStruct.class);
        }

        public final DouplusTextStruct decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47816, new Class[]{ProtoReader.class}, DouplusTextStruct.class)) {
                return decode(protoReader2, (DouplusTextStruct) null);
            }
            return (DouplusTextStruct) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47816, new Class[]{ProtoReader.class}, DouplusTextStruct.class);
        }

        public final int encodedSize(DouplusTextStruct douplusTextStruct) {
            DouplusTextStruct douplusTextStruct2 = douplusTextStruct;
            if (!PatchProxy.isSupport(new Object[]{douplusTextStruct2}, this, changeQuickRedirect, false, 47814, new Class[]{DouplusTextStruct.class}, Integer.TYPE)) {
                return ProtoAdapter.INT32.encodedSizeWithTag(1, douplusTextStruct2.type) + ProtoAdapter.STRING.encodedSizeWithTag(2, douplusTextStruct2.title) + douplusTextStruct.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{douplusTextStruct2}, this, changeQuickRedirect, false, 47814, new Class[]{DouplusTextStruct.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, DouplusTextStruct douplusTextStruct) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            DouplusTextStruct douplusTextStruct2 = douplusTextStruct;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, douplusTextStruct2}, this, changeQuickRedirect, false, 47815, new Class[]{ProtoWriter.class, DouplusTextStruct.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, douplusTextStruct2}, this, changeQuickRedirect, false, 47815, new Class[]{ProtoWriter.class, DouplusTextStruct.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1, douplusTextStruct2.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, douplusTextStruct2.title);
            protoWriter2.writeBytes(douplusTextStruct.unknownFields());
        }

        public final DouplusTextStruct decode(ProtoReader protoReader, DouplusTextStruct douplusTextStruct) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            DouplusTextStruct douplusTextStruct2 = douplusTextStruct;
            if (PatchProxy.isSupport(new Object[]{protoReader2, douplusTextStruct2}, this, changeQuickRedirect, false, 47817, new Class[]{ProtoReader.class, DouplusTextStruct.class}, DouplusTextStruct.class)) {
                return (DouplusTextStruct) PatchProxy.accessDispatch(new Object[]{protoReader2, douplusTextStruct2}, this, changeQuickRedirect, false, 47817, new Class[]{ProtoReader.class, DouplusTextStruct.class}, DouplusTextStruct.class);
            }
            DouplusTextStruct douplusTextStruct3 = (DouplusTextStruct) a.a().a(DouplusTextStruct.class, douplusTextStruct2);
            if (douplusTextStruct3 != null) {
                builder = douplusTextStruct3.newBuilder();
            } else {
                builder = new Builder();
            }
            Builder builder2 = builder;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder2.type((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 2:
                            builder2.title((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (douplusTextStruct3 != null) {
                                    break;
                                } else {
                                    throw e2;
                                }
                            }
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    return builder2.build();
                }
            }
        }
    }

    @KtNullable
    public final String getTitle() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47808, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47808, new Class[0], String.class);
        } else if (this.title != null) {
            return this.title;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getType() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47807, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47807, new Class[0], Integer.class);
        } else if (this.type != null) {
            return this.type;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47809, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47809, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.type = this.type;
        builder.title = this.title;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47811, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47811, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.type != null) {
                i = this.type.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.title != null) {
                i2 = this.title.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47812, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47812, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        StringBuilder replace = sb.replace(0, 2, "DouplusTextStruct{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47810, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47810, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof DouplusTextStruct)) {
                return false;
            }
            DouplusTextStruct douplusTextStruct = (DouplusTextStruct) obj;
            if (!unknownFields().equals(douplusTextStruct.unknownFields()) || !Internal.equals(this.type, douplusTextStruct.type) || !Internal.equals(this.title, douplusTextStruct.title)) {
                return false;
            }
            return true;
        }
    }

    public DouplusTextStruct(Integer num, String str) {
        this(num, str, ByteString.EMPTY);
    }

    public DouplusTextStruct(Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = num;
        this.title = str;
    }
}
