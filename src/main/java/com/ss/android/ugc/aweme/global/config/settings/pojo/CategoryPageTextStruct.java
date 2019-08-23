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

public final class CategoryPageTextStruct extends Message<CategoryPageTextStruct, Builder> {
    public static final DefaultValueProtoAdapter<CategoryPageTextStruct> ADAPTER = new ProtoAdapter_CategoryPageTextStruct();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String description;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String title;

    public static final class Builder extends Message.Builder<CategoryPageTextStruct, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String description;
        public String title;

        public final CategoryPageTextStruct build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47743, new Class[0], CategoryPageTextStruct.class)) {
                return new CategoryPageTextStruct(this.title, this.description, super.buildUnknownFields());
            }
            return (CategoryPageTextStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47743, new Class[0], CategoryPageTextStruct.class);
        }

        public final Builder description(String str) {
            this.description = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }
    }

    static final class ProtoAdapter_CategoryPageTextStruct extends DefaultValueProtoAdapter<CategoryPageTextStruct> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final CategoryPageTextStruct redact(CategoryPageTextStruct categoryPageTextStruct) {
            return categoryPageTextStruct;
        }

        public ProtoAdapter_CategoryPageTextStruct() {
            super(FieldEncoding.LENGTH_DELIMITED, CategoryPageTextStruct.class);
        }

        public final CategoryPageTextStruct decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47746, new Class[]{ProtoReader.class}, CategoryPageTextStruct.class)) {
                return decode(protoReader2, (CategoryPageTextStruct) null);
            }
            return (CategoryPageTextStruct) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47746, new Class[]{ProtoReader.class}, CategoryPageTextStruct.class);
        }

        public final int encodedSize(CategoryPageTextStruct categoryPageTextStruct) {
            CategoryPageTextStruct categoryPageTextStruct2 = categoryPageTextStruct;
            if (!PatchProxy.isSupport(new Object[]{categoryPageTextStruct2}, this, changeQuickRedirect, false, 47744, new Class[]{CategoryPageTextStruct.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, categoryPageTextStruct2.title) + ProtoAdapter.STRING.encodedSizeWithTag(2, categoryPageTextStruct2.description) + categoryPageTextStruct.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{categoryPageTextStruct2}, this, changeQuickRedirect, false, 47744, new Class[]{CategoryPageTextStruct.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, CategoryPageTextStruct categoryPageTextStruct) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            CategoryPageTextStruct categoryPageTextStruct2 = categoryPageTextStruct;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, categoryPageTextStruct2}, this, changeQuickRedirect, false, 47745, new Class[]{ProtoWriter.class, CategoryPageTextStruct.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, categoryPageTextStruct2}, this, changeQuickRedirect, false, 47745, new Class[]{ProtoWriter.class, CategoryPageTextStruct.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, categoryPageTextStruct2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, categoryPageTextStruct2.description);
            protoWriter2.writeBytes(categoryPageTextStruct.unknownFields());
        }

        public final CategoryPageTextStruct decode(ProtoReader protoReader, CategoryPageTextStruct categoryPageTextStruct) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            CategoryPageTextStruct categoryPageTextStruct2 = categoryPageTextStruct;
            if (PatchProxy.isSupport(new Object[]{protoReader2, categoryPageTextStruct2}, this, changeQuickRedirect, false, 47747, new Class[]{ProtoReader.class, CategoryPageTextStruct.class}, CategoryPageTextStruct.class)) {
                return (CategoryPageTextStruct) PatchProxy.accessDispatch(new Object[]{protoReader2, categoryPageTextStruct2}, this, changeQuickRedirect, false, 47747, new Class[]{ProtoReader.class, CategoryPageTextStruct.class}, CategoryPageTextStruct.class);
            }
            CategoryPageTextStruct categoryPageTextStruct3 = (CategoryPageTextStruct) a.a().a(CategoryPageTextStruct.class, categoryPageTextStruct2);
            if (categoryPageTextStruct3 != null) {
                builder = categoryPageTextStruct3.newBuilder();
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
                            builder2.title((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            builder2.description((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (categoryPageTextStruct3 != null) {
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
    public final String getDescription() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47738, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47738, new Class[0], String.class);
        } else if (this.description != null) {
            return this.description;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getTitle() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47737, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47737, new Class[0], String.class);
        } else if (this.title != null) {
            return this.title;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47739, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47739, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.title = this.title;
        builder.description = this.description;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47741, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47741, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.title != null) {
                i = this.title.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.description != null) {
                i2 = this.description.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47742, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47742, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        StringBuilder replace = sb.replace(0, 2, "CategoryPageTextStruct{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47740, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47740, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof CategoryPageTextStruct)) {
                return false;
            }
            CategoryPageTextStruct categoryPageTextStruct = (CategoryPageTextStruct) obj;
            if (!unknownFields().equals(categoryPageTextStruct.unknownFields()) || !Internal.equals(this.title, categoryPageTextStruct.title) || !Internal.equals(this.description, categoryPageTextStruct.description)) {
                return false;
            }
            return true;
        }
    }

    public CategoryPageTextStruct(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public CategoryPageTextStruct(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = str;
        this.description = str2;
    }
}
