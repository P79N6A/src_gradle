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

public final class ShareChannelSettings extends Message<ShareChannelSettings, Builder> {
    public static final DefaultValueProtoAdapter<ShareChannelSettings> ADAPTER = new ProtoAdapter_ShareChannelSettings();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String id;

    public static final class Builder extends Message.Builder<ShareChannelSettings, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String id;

        public final ShareChannelSettings build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49062, new Class[0], ShareChannelSettings.class)) {
                return new ShareChannelSettings(this.id, super.buildUnknownFields());
            }
            return (ShareChannelSettings) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49062, new Class[0], ShareChannelSettings.class);
        }

        public final Builder id(String str) {
            this.id = str;
            return this;
        }
    }

    static final class ProtoAdapter_ShareChannelSettings extends DefaultValueProtoAdapter<ShareChannelSettings> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final ShareChannelSettings redact(ShareChannelSettings shareChannelSettings) {
            return shareChannelSettings;
        }

        public ProtoAdapter_ShareChannelSettings() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareChannelSettings.class);
        }

        public final ShareChannelSettings decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49065, new Class[]{ProtoReader.class}, ShareChannelSettings.class)) {
                return decode(protoReader2, (ShareChannelSettings) null);
            }
            return (ShareChannelSettings) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49065, new Class[]{ProtoReader.class}, ShareChannelSettings.class);
        }

        public final int encodedSize(ShareChannelSettings shareChannelSettings) {
            ShareChannelSettings shareChannelSettings2 = shareChannelSettings;
            if (!PatchProxy.isSupport(new Object[]{shareChannelSettings2}, this, changeQuickRedirect, false, 49063, new Class[]{ShareChannelSettings.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, shareChannelSettings2.id) + shareChannelSettings.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{shareChannelSettings2}, this, changeQuickRedirect, false, 49063, new Class[]{ShareChannelSettings.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, ShareChannelSettings shareChannelSettings) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            ShareChannelSettings shareChannelSettings2 = shareChannelSettings;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, shareChannelSettings2}, this, changeQuickRedirect, false, 49064, new Class[]{ProtoWriter.class, ShareChannelSettings.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, shareChannelSettings2}, this, changeQuickRedirect, false, 49064, new Class[]{ProtoWriter.class, ShareChannelSettings.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, shareChannelSettings2.id);
            protoWriter2.writeBytes(shareChannelSettings.unknownFields());
        }

        public final ShareChannelSettings decode(ProtoReader protoReader, ShareChannelSettings shareChannelSettings) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            ShareChannelSettings shareChannelSettings2 = shareChannelSettings;
            if (PatchProxy.isSupport(new Object[]{protoReader2, shareChannelSettings2}, this, changeQuickRedirect, false, 49066, new Class[]{ProtoReader.class, ShareChannelSettings.class}, ShareChannelSettings.class)) {
                return (ShareChannelSettings) PatchProxy.accessDispatch(new Object[]{protoReader2, shareChannelSettings2}, this, changeQuickRedirect, false, 49066, new Class[]{ProtoReader.class, ShareChannelSettings.class}, ShareChannelSettings.class);
            }
            ShareChannelSettings shareChannelSettings3 = (ShareChannelSettings) a.a().a(ShareChannelSettings.class, shareChannelSettings2);
            if (shareChannelSettings3 != null) {
                builder = shareChannelSettings3.newBuilder();
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
                        if (shareChannelSettings3 == null) {
                            throw e2;
                        }
                    }
                } else {
                    builder2.id((String) ProtoAdapter.STRING.decode(protoReader2));
                }
            }
        }
    }

    @KtNullable
    public final String getId() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49057, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49057, new Class[0], String.class);
        } else if (this.id != null) {
            return this.id;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49058, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49058, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.id = this.id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49060, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49060, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.id != null) {
                i = this.id.hashCode();
            }
            i2 = hashCode + i;
            this.hashCode = i2;
        }
        return i2;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49061, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49061, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareChannelSettings{");
        replace.append('}');
        return replace.toString();
    }

    public ShareChannelSettings(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49059, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49059, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof ShareChannelSettings)) {
                return false;
            }
            ShareChannelSettings shareChannelSettings = (ShareChannelSettings) obj;
            if (!unknownFields().equals(shareChannelSettings.unknownFields()) || !Internal.equals(this.id, shareChannelSettings.id)) {
                return false;
            }
            return true;
        }
    }

    public ShareChannelSettings(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
    }
}
