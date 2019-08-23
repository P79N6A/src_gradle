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

public final class CategoryStruct extends Message<CategoryStruct, Builder> {
    public static final DefaultValueProtoAdapter<CategoryStruct> ADAPTER = new ProtoAdapter_CategoryStruct();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String category_name;

    public static final class Builder extends Message.Builder<CategoryStruct, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String category_name;

        public final CategoryStruct build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47753, new Class[0], CategoryStruct.class)) {
                return new CategoryStruct(this.category_name, super.buildUnknownFields());
            }
            return (CategoryStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47753, new Class[0], CategoryStruct.class);
        }

        public final Builder category_name(String str) {
            this.category_name = str;
            return this;
        }
    }

    static final class ProtoAdapter_CategoryStruct extends DefaultValueProtoAdapter<CategoryStruct> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final CategoryStruct redact(CategoryStruct categoryStruct) {
            return categoryStruct;
        }

        public ProtoAdapter_CategoryStruct() {
            super(FieldEncoding.LENGTH_DELIMITED, CategoryStruct.class);
        }

        public final CategoryStruct decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47756, new Class[]{ProtoReader.class}, CategoryStruct.class)) {
                return decode(protoReader2, (CategoryStruct) null);
            }
            return (CategoryStruct) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47756, new Class[]{ProtoReader.class}, CategoryStruct.class);
        }

        public final int encodedSize(CategoryStruct categoryStruct) {
            CategoryStruct categoryStruct2 = categoryStruct;
            if (!PatchProxy.isSupport(new Object[]{categoryStruct2}, this, changeQuickRedirect, false, 47754, new Class[]{CategoryStruct.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, categoryStruct2.category_name) + categoryStruct.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{categoryStruct2}, this, changeQuickRedirect, false, 47754, new Class[]{CategoryStruct.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, CategoryStruct categoryStruct) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            CategoryStruct categoryStruct2 = categoryStruct;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, categoryStruct2}, this, changeQuickRedirect, false, 47755, new Class[]{ProtoWriter.class, CategoryStruct.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, categoryStruct2}, this, changeQuickRedirect, false, 47755, new Class[]{ProtoWriter.class, CategoryStruct.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, categoryStruct2.category_name);
            protoWriter2.writeBytes(categoryStruct.unknownFields());
        }

        public final CategoryStruct decode(ProtoReader protoReader, CategoryStruct categoryStruct) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            CategoryStruct categoryStruct2 = categoryStruct;
            if (PatchProxy.isSupport(new Object[]{protoReader2, categoryStruct2}, this, changeQuickRedirect, false, 47757, new Class[]{ProtoReader.class, CategoryStruct.class}, CategoryStruct.class)) {
                return (CategoryStruct) PatchProxy.accessDispatch(new Object[]{protoReader2, categoryStruct2}, this, changeQuickRedirect, false, 47757, new Class[]{ProtoReader.class, CategoryStruct.class}, CategoryStruct.class);
            }
            CategoryStruct categoryStruct3 = (CategoryStruct) a.a().a(CategoryStruct.class, categoryStruct2);
            if (categoryStruct3 != null) {
                builder = categoryStruct3.newBuilder();
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
                        if (categoryStruct3 == null) {
                            throw e2;
                        }
                    }
                } else {
                    builder2.category_name((String) ProtoAdapter.STRING.decode(protoReader2));
                }
            }
        }
    }

    @KtNullable
    public final String getCategoryName() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47748, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47748, new Class[0], String.class);
        } else if (this.category_name != null) {
            return this.category_name;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47749, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47749, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.category_name = this.category_name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47751, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47751, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.category_name != null) {
                i = this.category_name.hashCode();
            }
            i2 = hashCode + i;
            this.hashCode = i2;
        }
        return i2;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47752, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47752, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.category_name != null) {
            sb.append(", category_name=");
            sb.append(this.category_name);
        }
        StringBuilder replace = sb.replace(0, 2, "CategoryStruct{");
        replace.append('}');
        return replace.toString();
    }

    public CategoryStruct(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47750, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47750, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof CategoryStruct)) {
                return false;
            }
            CategoryStruct categoryStruct = (CategoryStruct) obj;
            if (!unknownFields().equals(categoryStruct.unknownFields()) || !Internal.equals(this.category_name, categoryStruct.category_name)) {
                return false;
            }
            return true;
        }
    }

    public CategoryStruct(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.category_name = str;
    }
}
