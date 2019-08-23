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

public final class UgBubble extends Message<UgBubble, Builder> {
    public static final DefaultValueProtoAdapter<UgBubble> ADAPTER = new ProtoAdapter_UgBubble();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel#ADAPTER", tag = 3)
    public final UrlModel resource_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer seconds;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String text;

    public static final class Builder extends Message.Builder<UgBubble, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public UrlModel resource_url;
        public Integer seconds;
        public String text;

        public final UgBubble build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49243, new Class[0], UgBubble.class)) {
                return new UgBubble(this.text, this.resource_url, this.seconds, super.buildUnknownFields());
            }
            return (UgBubble) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49243, new Class[0], UgBubble.class);
        }

        public final Builder resource_url(UrlModel urlModel) {
            this.resource_url = urlModel;
            return this;
        }

        public final Builder seconds(Integer num) {
            this.seconds = num;
            return this;
        }

        public final Builder text(String str) {
            this.text = str;
            return this;
        }
    }

    static final class ProtoAdapter_UgBubble extends DefaultValueProtoAdapter<UgBubble> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final UgBubble redact(UgBubble ugBubble) {
            return ugBubble;
        }

        public ProtoAdapter_UgBubble() {
            super(FieldEncoding.LENGTH_DELIMITED, UgBubble.class);
        }

        public final UgBubble decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49246, new Class[]{ProtoReader.class}, UgBubble.class)) {
                return decode(protoReader2, (UgBubble) null);
            }
            return (UgBubble) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49246, new Class[]{ProtoReader.class}, UgBubble.class);
        }

        public final int encodedSize(UgBubble ugBubble) {
            UgBubble ugBubble2 = ugBubble;
            if (!PatchProxy.isSupport(new Object[]{ugBubble2}, this, changeQuickRedirect, false, 49244, new Class[]{UgBubble.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(2, ugBubble2.text) + UrlModel.ADAPTER.encodedSizeWithTag(3, ugBubble2.resource_url) + ProtoAdapter.INT32.encodedSizeWithTag(4, ugBubble2.seconds) + ugBubble.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{ugBubble2}, this, changeQuickRedirect, false, 49244, new Class[]{UgBubble.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, UgBubble ugBubble) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            UgBubble ugBubble2 = ugBubble;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, ugBubble2}, this, changeQuickRedirect, false, 49245, new Class[]{ProtoWriter.class, UgBubble.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, ugBubble2}, this, changeQuickRedirect, false, 49245, new Class[]{ProtoWriter.class, UgBubble.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, ugBubble2.text);
            UrlModel.ADAPTER.encodeWithTag(protoWriter2, 3, ugBubble2.resource_url);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 4, ugBubble2.seconds);
            protoWriter2.writeBytes(ugBubble.unknownFields());
        }

        public final UgBubble decode(ProtoReader protoReader, UgBubble ugBubble) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            UgBubble ugBubble2 = ugBubble;
            if (PatchProxy.isSupport(new Object[]{protoReader2, ugBubble2}, this, changeQuickRedirect, false, 49247, new Class[]{ProtoReader.class, UgBubble.class}, UgBubble.class)) {
                return (UgBubble) PatchProxy.accessDispatch(new Object[]{protoReader2, ugBubble2}, this, changeQuickRedirect, false, 49247, new Class[]{ProtoReader.class, UgBubble.class}, UgBubble.class);
            }
            UgBubble ugBubble3 = (UgBubble) a.a().a(UgBubble.class, ugBubble2);
            if (ugBubble3 != null) {
                builder = ugBubble3.newBuilder();
            } else {
                builder = new Builder();
            }
            Builder builder2 = builder;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 2:
                            builder2.text((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder2.resource_url((UrlModel) UrlModel.ADAPTER.decode(protoReader2, builder2.resource_url));
                            break;
                        case 4:
                            builder2.seconds((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (ugBubble3 != null) {
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
    public final UrlModel getResourceUrl() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49237, new Class[0], UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49237, new Class[0], UrlModel.class);
        } else if (this.resource_url != null) {
            return this.resource_url;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getSeconds() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49238, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49238, new Class[0], Integer.class);
        } else if (this.seconds != null) {
            return this.seconds;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getText() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49236, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49236, new Class[0], String.class);
        } else if (this.text != null) {
            return this.text;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49241, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49241, new Class[0], Integer.TYPE)).intValue();
        }
        int i4 = this.hashCode;
        if (i4 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.text != null) {
                i = this.text.hashCode();
            } else {
                i = 0;
            }
            int i5 = (hashCode + i) * 37;
            if (this.resource_url != null) {
                i2 = this.resource_url.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            if (this.seconds != null) {
                i3 = this.seconds.hashCode();
            }
            i4 = i6 + i3;
            this.hashCode = i4;
        }
        return i4;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49239, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49239, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.text = this.text;
        builder.resource_url = this.resource_url;
        builder.seconds = this.seconds;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49242, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49242, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.resource_url != null) {
            sb.append(", resource_url=");
            sb.append(this.resource_url);
        }
        if (this.seconds != null) {
            sb.append(", seconds=");
            sb.append(this.seconds);
        }
        StringBuilder replace = sb.replace(0, 2, "UgBubble{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49240, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49240, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof UgBubble)) {
                return false;
            }
            UgBubble ugBubble = (UgBubble) obj;
            if (!unknownFields().equals(ugBubble.unknownFields()) || !Internal.equals(this.text, ugBubble.text) || !Internal.equals(this.resource_url, ugBubble.resource_url) || !Internal.equals(this.seconds, ugBubble.seconds)) {
                return false;
            }
            return true;
        }
    }

    public UgBubble(String str, UrlModel urlModel, Integer num) {
        this(str, urlModel, num, ByteString.EMPTY);
    }

    public UgBubble(String str, UrlModel urlModel, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text = str;
        this.resource_url = urlModel;
        this.seconds = num;
    }
}
