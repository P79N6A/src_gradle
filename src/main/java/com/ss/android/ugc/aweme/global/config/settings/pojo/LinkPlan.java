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

public final class LinkPlan extends Message<LinkPlan, Builder> {
    public static final DefaultValueProtoAdapter<LinkPlan> ADAPTER = new ProtoAdapter_LinkPlan();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String publish;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String settings;

    public static final class Builder extends Message.Builder<LinkPlan, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String publish;
        public String settings;

        public final LinkPlan build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48889, new Class[0], LinkPlan.class)) {
                return new LinkPlan(this.publish, this.settings, super.buildUnknownFields());
            }
            return (LinkPlan) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48889, new Class[0], LinkPlan.class);
        }

        public final Builder publish(String str) {
            this.publish = str;
            return this;
        }

        public final Builder settings(String str) {
            this.settings = str;
            return this;
        }
    }

    static final class ProtoAdapter_LinkPlan extends DefaultValueProtoAdapter<LinkPlan> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final LinkPlan redact(LinkPlan linkPlan) {
            return linkPlan;
        }

        public ProtoAdapter_LinkPlan() {
            super(FieldEncoding.LENGTH_DELIMITED, LinkPlan.class);
        }

        public final LinkPlan decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48892, new Class[]{ProtoReader.class}, LinkPlan.class)) {
                return decode(protoReader2, (LinkPlan) null);
            }
            return (LinkPlan) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48892, new Class[]{ProtoReader.class}, LinkPlan.class);
        }

        public final int encodedSize(LinkPlan linkPlan) {
            LinkPlan linkPlan2 = linkPlan;
            if (!PatchProxy.isSupport(new Object[]{linkPlan2}, this, changeQuickRedirect, false, 48890, new Class[]{LinkPlan.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, linkPlan2.publish) + ProtoAdapter.STRING.encodedSizeWithTag(2, linkPlan2.settings) + linkPlan.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{linkPlan2}, this, changeQuickRedirect, false, 48890, new Class[]{LinkPlan.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, LinkPlan linkPlan) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            LinkPlan linkPlan2 = linkPlan;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, linkPlan2}, this, changeQuickRedirect, false, 48891, new Class[]{ProtoWriter.class, LinkPlan.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, linkPlan2}, this, changeQuickRedirect, false, 48891, new Class[]{ProtoWriter.class, LinkPlan.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, linkPlan2.publish);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, linkPlan2.settings);
            protoWriter2.writeBytes(linkPlan.unknownFields());
        }

        public final LinkPlan decode(ProtoReader protoReader, LinkPlan linkPlan) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            LinkPlan linkPlan2 = linkPlan;
            if (PatchProxy.isSupport(new Object[]{protoReader2, linkPlan2}, this, changeQuickRedirect, false, 48893, new Class[]{ProtoReader.class, LinkPlan.class}, LinkPlan.class)) {
                return (LinkPlan) PatchProxy.accessDispatch(new Object[]{protoReader2, linkPlan2}, this, changeQuickRedirect, false, 48893, new Class[]{ProtoReader.class, LinkPlan.class}, LinkPlan.class);
            }
            LinkPlan linkPlan3 = (LinkPlan) a.a().a(LinkPlan.class, linkPlan2);
            if (linkPlan3 != null) {
                builder = linkPlan3.newBuilder();
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
                            builder2.publish((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            builder2.settings((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (linkPlan3 != null) {
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
    public final String getPublish() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48883, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48883, new Class[0], String.class);
        } else if (this.publish != null) {
            return this.publish;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getSettings() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48884, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48884, new Class[0], String.class);
        } else if (this.settings != null) {
            return this.settings;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48885, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48885, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.publish = this.publish;
        builder.settings = this.settings;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48887, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48887, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.publish != null) {
                i = this.publish.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.settings != null) {
                i2 = this.settings.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48888, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48888, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.publish != null) {
            sb.append(", publish=");
            sb.append(this.publish);
        }
        if (this.settings != null) {
            sb.append(", settings=");
            sb.append(this.settings);
        }
        StringBuilder replace = sb.replace(0, 2, "LinkPlan{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 48886, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 48886, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof LinkPlan)) {
                return false;
            }
            LinkPlan linkPlan = (LinkPlan) obj;
            if (!unknownFields().equals(linkPlan.unknownFields()) || !Internal.equals(this.publish, linkPlan.publish) || !Internal.equals(this.settings, linkPlan.settings)) {
                return false;
            }
            return true;
        }
    }

    public LinkPlan(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public LinkPlan(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.publish = str;
        this.settings = str2;
    }
}
