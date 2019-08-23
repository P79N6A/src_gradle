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

public final class LinkMicSignalingMethod extends Message<LinkMicSignalingMethod, Builder> {
    public static final ProtoAdapter<LinkMicSignalingMethod> ADAPTER = new ProtoAdapter_LinkMicSignalingMethod();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String content;

    public static final class Builder extends Message.Builder<LinkMicSignalingMethod, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public String content;

        public final LinkMicSignalingMethod build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11724, new Class[0], LinkMicSignalingMethod.class)) {
                return new LinkMicSignalingMethod(this.common, this.content, super.buildUnknownFields());
            }
            return (LinkMicSignalingMethod) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11724, new Class[0], LinkMicSignalingMethod.class);
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }
    }

    static final class ProtoAdapter_LinkMicSignalingMethod extends ProtoAdapter<LinkMicSignalingMethod> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_LinkMicSignalingMethod() {
            super(FieldEncoding.LENGTH_DELIMITED, LinkMicSignalingMethod.class);
        }

        public final int encodedSize(LinkMicSignalingMethod linkMicSignalingMethod) {
            int i;
            LinkMicSignalingMethod linkMicSignalingMethod2 = linkMicSignalingMethod;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{linkMicSignalingMethod2}, this, changeQuickRedirect, false, 11725, new Class[]{LinkMicSignalingMethod.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{linkMicSignalingMethod2}, this, changeQuickRedirect, false, 11725, new Class[]{LinkMicSignalingMethod.class}, Integer.TYPE)).intValue();
            }
            if (linkMicSignalingMethod2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, linkMicSignalingMethod2.common);
            } else {
                i = 0;
            }
            if (linkMicSignalingMethod2.content != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, linkMicSignalingMethod2.content);
            }
            return i + i2 + linkMicSignalingMethod.unknownFields().size();
        }

        public final LinkMicSignalingMethod redact(LinkMicSignalingMethod linkMicSignalingMethod) {
            if (PatchProxy.isSupport(new Object[]{linkMicSignalingMethod}, this, changeQuickRedirect, false, 11728, new Class[]{LinkMicSignalingMethod.class}, LinkMicSignalingMethod.class)) {
                return (LinkMicSignalingMethod) PatchProxy.accessDispatch(new Object[]{linkMicSignalingMethod}, this, changeQuickRedirect, false, 11728, new Class[]{LinkMicSignalingMethod.class}, LinkMicSignalingMethod.class);
            }
            Builder newBuilder = linkMicSignalingMethod.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final LinkMicSignalingMethod decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11727, new Class[]{ProtoReader.class}, LinkMicSignalingMethod.class)) {
                return (LinkMicSignalingMethod) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11727, new Class[]{ProtoReader.class}, LinkMicSignalingMethod.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.common((Common) Common.ADAPTER.decode(protoReader2));
                            break;
                        case 2:
                            builder.content((String) ProtoAdapter.STRING.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, LinkMicSignalingMethod linkMicSignalingMethod) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            LinkMicSignalingMethod linkMicSignalingMethod2 = linkMicSignalingMethod;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, linkMicSignalingMethod2}, this, changeQuickRedirect, false, 11726, new Class[]{ProtoWriter.class, LinkMicSignalingMethod.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, linkMicSignalingMethod2}, this, changeQuickRedirect, false, 11726, new Class[]{ProtoWriter.class, LinkMicSignalingMethod.class}, Void.TYPE);
                return;
            }
            if (linkMicSignalingMethod2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, linkMicSignalingMethod2.common);
            }
            if (linkMicSignalingMethod2.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, linkMicSignalingMethod2.content);
            }
            protoWriter2.writeBytes(linkMicSignalingMethod.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11720, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11720, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.content = this.content;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11722, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11722, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.content != null) {
                i2 = this.content.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11723, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11723, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        StringBuilder replace = sb.replace(0, 2, "LinkMicSignalingMethod{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11721, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11721, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof LinkMicSignalingMethod)) {
                return false;
            }
            LinkMicSignalingMethod linkMicSignalingMethod = (LinkMicSignalingMethod) obj;
            if (!unknownFields().equals(linkMicSignalingMethod.unknownFields()) || !Internal.equals(this.common, linkMicSignalingMethod.common) || !Internal.equals(this.content, linkMicSignalingMethod.content)) {
                return false;
            }
            return true;
        }
    }

    public LinkMicSignalingMethod(Common common2, String str) {
        this(common2, str, ByteString.EMPTY);
    }

    public LinkMicSignalingMethod(Common common2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.content = str;
    }
}
