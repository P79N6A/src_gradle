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
import java.util.List;
import okio.ByteString;

public final class UrlModel extends Message<UrlModel, Builder> {
    public static final DefaultValueProtoAdapter<UrlModel> ADAPTER = new ProtoAdapter_UrlModel();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer height;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String uri;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String url_key;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 2)
    public final List<String> url_list;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer width;

    public static final class Builder extends Message.Builder<UrlModel, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer height;
        public String uri;
        public String url_key;
        public List<String> url_list = Internal.newMutableList();
        public Integer width;

        public final UrlModel build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49352, new Class[0], UrlModel.class)) {
                return (UrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49352, new Class[0], UrlModel.class);
            }
            UrlModel urlModel = new UrlModel(this.uri, this.url_list, this.width, this.height, this.url_key, super.buildUnknownFields());
            return urlModel;
        }

        public final Builder height(Integer num) {
            this.height = num;
            return this;
        }

        public final Builder uri(String str) {
            this.uri = str;
            return this;
        }

        public final Builder url_key(String str) {
            this.url_key = str;
            return this;
        }

        public final Builder width(Integer num) {
            this.width = num;
            return this;
        }

        public final Builder url_list(List<String> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 49351, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 49351, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.url_list = list;
            return this;
        }
    }

    static final class ProtoAdapter_UrlModel extends DefaultValueProtoAdapter<UrlModel> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final UrlModel redact(UrlModel urlModel) {
            return urlModel;
        }

        public ProtoAdapter_UrlModel() {
            super(FieldEncoding.LENGTH_DELIMITED, UrlModel.class);
        }

        public final UrlModel decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49355, new Class[]{ProtoReader.class}, UrlModel.class)) {
                return decode(protoReader2, (UrlModel) null);
            }
            return (UrlModel) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49355, new Class[]{ProtoReader.class}, UrlModel.class);
        }

        public final int encodedSize(UrlModel urlModel) {
            UrlModel urlModel2 = urlModel;
            if (!PatchProxy.isSupport(new Object[]{urlModel2}, this, changeQuickRedirect, false, 49353, new Class[]{UrlModel.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, urlModel2.uri) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, urlModel2.url_list) + ProtoAdapter.INT32.encodedSizeWithTag(3, urlModel2.width) + ProtoAdapter.INT32.encodedSizeWithTag(4, urlModel2.height) + ProtoAdapter.STRING.encodedSizeWithTag(5, urlModel2.url_key) + urlModel.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{urlModel2}, this, changeQuickRedirect, false, 49353, new Class[]{UrlModel.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, UrlModel urlModel) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            UrlModel urlModel2 = urlModel;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, urlModel2}, this, changeQuickRedirect, false, 49354, new Class[]{ProtoWriter.class, UrlModel.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, urlModel2}, this, changeQuickRedirect, false, 49354, new Class[]{ProtoWriter.class, UrlModel.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, urlModel2.uri);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter2, 2, urlModel2.url_list);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 3, urlModel2.width);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 4, urlModel2.height);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 5, urlModel2.url_key);
            protoWriter2.writeBytes(urlModel.unknownFields());
        }

        public final UrlModel decode(ProtoReader protoReader, UrlModel urlModel) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            UrlModel urlModel2 = urlModel;
            if (PatchProxy.isSupport(new Object[]{protoReader2, urlModel2}, this, changeQuickRedirect, false, 49356, new Class[]{ProtoReader.class, UrlModel.class}, UrlModel.class)) {
                return (UrlModel) PatchProxy.accessDispatch(new Object[]{protoReader2, urlModel2}, this, changeQuickRedirect, false, 49356, new Class[]{ProtoReader.class, UrlModel.class}, UrlModel.class);
            }
            UrlModel urlModel3 = (UrlModel) a.a().a(UrlModel.class, urlModel2);
            if (urlModel3 != null) {
                builder = urlModel3.newBuilder();
            } else {
                builder = new Builder();
            }
            Builder builder2 = builder;
            List<String> newMutableList = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder2.uri((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            newMutableList.add(ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder2.width((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 4:
                            builder2.height((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 5:
                            builder2.url_key((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (urlModel3 != null) {
                                    break;
                                } else {
                                    throw e2;
                                }
                            }
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder2.url_list = newMutableList;
                    }
                    return builder2.build();
                }
            }
        }
    }

    public final List<String> getUrlList() {
        return this.url_list;
    }

    @KtNullable
    public final Integer getHeight() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49345, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49345, new Class[0], Integer.class);
        } else if (this.height != null) {
            return this.height;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getUri() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49343, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49343, new Class[0], String.class);
        } else if (this.uri != null) {
            return this.uri;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getUrlKey() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49346, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49346, new Class[0], String.class);
        } else if (this.url_key != null) {
            return this.url_key;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getWidth() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49344, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49344, new Class[0], Integer.class);
        } else if (this.width != null) {
            return this.width;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49349, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49349, new Class[0], Integer.TYPE)).intValue();
        }
        int i5 = this.hashCode;
        if (i5 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.uri != null) {
                i = this.uri.hashCode();
            } else {
                i = 0;
            }
            int hashCode2 = (((hashCode + i) * 37) + this.url_list.hashCode()) * 37;
            if (this.width != null) {
                i2 = this.width.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (hashCode2 + i2) * 37;
            if (this.height != null) {
                i3 = this.height.hashCode();
            } else {
                i3 = 0;
            }
            int i7 = (i6 + i3) * 37;
            if (this.url_key != null) {
                i4 = this.url_key.hashCode();
            }
            i5 = i7 + i4;
            this.hashCode = i5;
        }
        return i5;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49347, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49347, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.uri = this.uri;
        builder.url_list = Internal.copyOf("url_list", this.url_list);
        builder.width = this.width;
        builder.height = this.height;
        builder.url_key = this.url_key;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49350, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49350, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.uri != null) {
            sb.append(", uri=");
            sb.append(this.uri);
        }
        if (!this.url_list.isEmpty()) {
            sb.append(", url_list=");
            sb.append(this.url_list);
        }
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        if (this.url_key != null) {
            sb.append(", url_key=");
            sb.append(this.url_key);
        }
        StringBuilder replace = sb.replace(0, 2, "UrlModel{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49348, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49348, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof UrlModel)) {
                return false;
            }
            UrlModel urlModel = (UrlModel) obj;
            if (!unknownFields().equals(urlModel.unknownFields()) || !Internal.equals(this.uri, urlModel.uri) || !this.url_list.equals(urlModel.url_list) || !Internal.equals(this.width, urlModel.width) || !Internal.equals(this.height, urlModel.height) || !Internal.equals(this.url_key, urlModel.url_key)) {
                return false;
            }
            return true;
        }
    }

    public UrlModel(String str, List<String> list, Integer num, Integer num2, String str2) {
        this(str, list, num, num2, str2, ByteString.EMPTY);
    }

    public UrlModel(String str, List<String> list, Integer num, Integer num2, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uri = str;
        this.url_list = Internal.immutableCopyOf("url_list", list);
        this.width = num;
        this.height = num2;
        this.url_key = str2;
    }
}
