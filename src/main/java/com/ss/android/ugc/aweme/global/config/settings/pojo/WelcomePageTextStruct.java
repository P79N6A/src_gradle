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

public final class WelcomePageTextStruct extends Message<WelcomePageTextStruct, Builder> {
    public static final DefaultValueProtoAdapter<WelcomePageTextStruct> ADAPTER = new ProtoAdapter_WelcomePageTextStruct();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String description;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String image_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer page_num;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String title;

    public static final class Builder extends Message.Builder<WelcomePageTextStruct, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String description;
        public String image_url;
        public Integer page_num;
        public String title;

        public final WelcomePageTextStruct build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49415, new Class[0], WelcomePageTextStruct.class)) {
                return (WelcomePageTextStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49415, new Class[0], WelcomePageTextStruct.class);
            }
            WelcomePageTextStruct welcomePageTextStruct = new WelcomePageTextStruct(this.page_num, this.title, this.description, this.image_url, super.buildUnknownFields());
            return welcomePageTextStruct;
        }

        public final Builder description(String str) {
            this.description = str;
            return this;
        }

        public final Builder image_url(String str) {
            this.image_url = str;
            return this;
        }

        public final Builder page_num(Integer num) {
            this.page_num = num;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }
    }

    static final class ProtoAdapter_WelcomePageTextStruct extends DefaultValueProtoAdapter<WelcomePageTextStruct> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final WelcomePageTextStruct redact(WelcomePageTextStruct welcomePageTextStruct) {
            return welcomePageTextStruct;
        }

        public ProtoAdapter_WelcomePageTextStruct() {
            super(FieldEncoding.LENGTH_DELIMITED, WelcomePageTextStruct.class);
        }

        public final WelcomePageTextStruct decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49418, new Class[]{ProtoReader.class}, WelcomePageTextStruct.class)) {
                return decode(protoReader2, (WelcomePageTextStruct) null);
            }
            return (WelcomePageTextStruct) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49418, new Class[]{ProtoReader.class}, WelcomePageTextStruct.class);
        }

        public final int encodedSize(WelcomePageTextStruct welcomePageTextStruct) {
            WelcomePageTextStruct welcomePageTextStruct2 = welcomePageTextStruct;
            if (!PatchProxy.isSupport(new Object[]{welcomePageTextStruct2}, this, changeQuickRedirect, false, 49416, new Class[]{WelcomePageTextStruct.class}, Integer.TYPE)) {
                return ProtoAdapter.INT32.encodedSizeWithTag(1, welcomePageTextStruct2.page_num) + ProtoAdapter.STRING.encodedSizeWithTag(2, welcomePageTextStruct2.title) + ProtoAdapter.STRING.encodedSizeWithTag(3, welcomePageTextStruct2.description) + ProtoAdapter.STRING.encodedSizeWithTag(4, welcomePageTextStruct2.image_url) + welcomePageTextStruct.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{welcomePageTextStruct2}, this, changeQuickRedirect, false, 49416, new Class[]{WelcomePageTextStruct.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, WelcomePageTextStruct welcomePageTextStruct) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            WelcomePageTextStruct welcomePageTextStruct2 = welcomePageTextStruct;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, welcomePageTextStruct2}, this, changeQuickRedirect, false, 49417, new Class[]{ProtoWriter.class, WelcomePageTextStruct.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, welcomePageTextStruct2}, this, changeQuickRedirect, false, 49417, new Class[]{ProtoWriter.class, WelcomePageTextStruct.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1, welcomePageTextStruct2.page_num);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, welcomePageTextStruct2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, welcomePageTextStruct2.description);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, welcomePageTextStruct2.image_url);
            protoWriter2.writeBytes(welcomePageTextStruct.unknownFields());
        }

        public final WelcomePageTextStruct decode(ProtoReader protoReader, WelcomePageTextStruct welcomePageTextStruct) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            WelcomePageTextStruct welcomePageTextStruct2 = welcomePageTextStruct;
            if (PatchProxy.isSupport(new Object[]{protoReader2, welcomePageTextStruct2}, this, changeQuickRedirect, false, 49419, new Class[]{ProtoReader.class, WelcomePageTextStruct.class}, WelcomePageTextStruct.class)) {
                return (WelcomePageTextStruct) PatchProxy.accessDispatch(new Object[]{protoReader2, welcomePageTextStruct2}, this, changeQuickRedirect, false, 49419, new Class[]{ProtoReader.class, WelcomePageTextStruct.class}, WelcomePageTextStruct.class);
            }
            WelcomePageTextStruct welcomePageTextStruct3 = (WelcomePageTextStruct) a.a().a(WelcomePageTextStruct.class, welcomePageTextStruct2);
            if (welcomePageTextStruct3 != null) {
                builder = welcomePageTextStruct3.newBuilder();
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
                            builder2.page_num((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 2:
                            builder2.title((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder2.description((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 4:
                            builder2.image_url((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (welcomePageTextStruct3 != null) {
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49409, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49409, new Class[0], String.class);
        } else if (this.description != null) {
            return this.description;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getImageUrl() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49410, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49410, new Class[0], String.class);
        } else if (this.image_url != null) {
            return this.image_url;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getPageNum() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49407, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49407, new Class[0], Integer.class);
        } else if (this.page_num != null) {
            return this.page_num;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getTitle() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49408, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49408, new Class[0], String.class);
        } else if (this.title != null) {
            return this.title;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49413, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49413, new Class[0], Integer.TYPE)).intValue();
        }
        int i5 = this.hashCode;
        if (i5 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.page_num != null) {
                i = this.page_num.hashCode();
            } else {
                i = 0;
            }
            int i6 = (hashCode + i) * 37;
            if (this.title != null) {
                i2 = this.title.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 37;
            if (this.description != null) {
                i3 = this.description.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 37;
            if (this.image_url != null) {
                i4 = this.image_url.hashCode();
            }
            i5 = i8 + i4;
            this.hashCode = i5;
        }
        return i5;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49411, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49411, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.page_num = this.page_num;
        builder.title = this.title;
        builder.description = this.description;
        builder.image_url = this.image_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49414, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49414, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.page_num != null) {
            sb.append(", page_num=");
            sb.append(this.page_num);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.image_url != null) {
            sb.append(", image_url=");
            sb.append(this.image_url);
        }
        StringBuilder replace = sb.replace(0, 2, "WelcomePageTextStruct{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49412, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49412, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof WelcomePageTextStruct)) {
                return false;
            }
            WelcomePageTextStruct welcomePageTextStruct = (WelcomePageTextStruct) obj;
            if (!unknownFields().equals(welcomePageTextStruct.unknownFields()) || !Internal.equals(this.page_num, welcomePageTextStruct.page_num) || !Internal.equals(this.title, welcomePageTextStruct.title) || !Internal.equals(this.description, welcomePageTextStruct.description) || !Internal.equals(this.image_url, welcomePageTextStruct.image_url)) {
                return false;
            }
            return true;
        }
    }

    public WelcomePageTextStruct(Integer num, String str, String str2, String str3) {
        this(num, str, str2, str3, ByteString.EMPTY);
    }

    public WelcomePageTextStruct(Integer num, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.page_num = num;
        this.title = str;
        this.description = str2;
        this.image_url = str3;
    }
}
