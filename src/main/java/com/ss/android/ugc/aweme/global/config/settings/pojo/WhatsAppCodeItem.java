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

public final class WhatsAppCodeItem extends Message<WhatsAppCodeItem, Builder> {
    public static final DefaultValueProtoAdapter<WhatsAppCodeItem> ADAPTER = new ProtoAdapter_WhatsAppCodeItem();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String calling_code;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean whatsapp_first;

    public static final class Builder extends Message.Builder<WhatsAppCodeItem, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String calling_code;
        public Boolean whatsapp_first;

        public final WhatsAppCodeItem build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49426, new Class[0], WhatsAppCodeItem.class)) {
                return new WhatsAppCodeItem(this.calling_code, this.whatsapp_first, super.buildUnknownFields());
            }
            return (WhatsAppCodeItem) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49426, new Class[0], WhatsAppCodeItem.class);
        }

        public final Builder calling_code(String str) {
            this.calling_code = str;
            return this;
        }

        public final Builder whatsapp_first(Boolean bool) {
            this.whatsapp_first = bool;
            return this;
        }
    }

    static final class ProtoAdapter_WhatsAppCodeItem extends DefaultValueProtoAdapter<WhatsAppCodeItem> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final WhatsAppCodeItem redact(WhatsAppCodeItem whatsAppCodeItem) {
            return whatsAppCodeItem;
        }

        public ProtoAdapter_WhatsAppCodeItem() {
            super(FieldEncoding.LENGTH_DELIMITED, WhatsAppCodeItem.class);
        }

        public final WhatsAppCodeItem decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49429, new Class[]{ProtoReader.class}, WhatsAppCodeItem.class)) {
                return decode(protoReader2, (WhatsAppCodeItem) null);
            }
            return (WhatsAppCodeItem) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49429, new Class[]{ProtoReader.class}, WhatsAppCodeItem.class);
        }

        public final int encodedSize(WhatsAppCodeItem whatsAppCodeItem) {
            WhatsAppCodeItem whatsAppCodeItem2 = whatsAppCodeItem;
            if (!PatchProxy.isSupport(new Object[]{whatsAppCodeItem2}, this, changeQuickRedirect, false, 49427, new Class[]{WhatsAppCodeItem.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, whatsAppCodeItem2.calling_code) + ProtoAdapter.BOOL.encodedSizeWithTag(2, whatsAppCodeItem2.whatsapp_first) + whatsAppCodeItem.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{whatsAppCodeItem2}, this, changeQuickRedirect, false, 49427, new Class[]{WhatsAppCodeItem.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, WhatsAppCodeItem whatsAppCodeItem) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            WhatsAppCodeItem whatsAppCodeItem2 = whatsAppCodeItem;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, whatsAppCodeItem2}, this, changeQuickRedirect, false, 49428, new Class[]{ProtoWriter.class, WhatsAppCodeItem.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, whatsAppCodeItem2}, this, changeQuickRedirect, false, 49428, new Class[]{ProtoWriter.class, WhatsAppCodeItem.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, whatsAppCodeItem2.calling_code);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 2, whatsAppCodeItem2.whatsapp_first);
            protoWriter2.writeBytes(whatsAppCodeItem.unknownFields());
        }

        public final WhatsAppCodeItem decode(ProtoReader protoReader, WhatsAppCodeItem whatsAppCodeItem) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            WhatsAppCodeItem whatsAppCodeItem2 = whatsAppCodeItem;
            if (PatchProxy.isSupport(new Object[]{protoReader2, whatsAppCodeItem2}, this, changeQuickRedirect, false, 49430, new Class[]{ProtoReader.class, WhatsAppCodeItem.class}, WhatsAppCodeItem.class)) {
                return (WhatsAppCodeItem) PatchProxy.accessDispatch(new Object[]{protoReader2, whatsAppCodeItem2}, this, changeQuickRedirect, false, 49430, new Class[]{ProtoReader.class, WhatsAppCodeItem.class}, WhatsAppCodeItem.class);
            }
            WhatsAppCodeItem whatsAppCodeItem3 = (WhatsAppCodeItem) a.a().a(WhatsAppCodeItem.class, whatsAppCodeItem2);
            if (whatsAppCodeItem3 != null) {
                builder = whatsAppCodeItem3.newBuilder();
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
                            builder2.calling_code((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            builder2.whatsapp_first((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (whatsAppCodeItem3 != null) {
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
    public final String getCallingCode() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49420, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49420, new Class[0], String.class);
        } else if (this.calling_code != null) {
            return this.calling_code;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean getWhatsappFirst() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49421, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49421, new Class[0], Boolean.class);
        } else if (this.whatsapp_first != null) {
            return this.whatsapp_first;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49422, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49422, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.calling_code = this.calling_code;
        builder.whatsapp_first = this.whatsapp_first;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49424, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49424, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.calling_code != null) {
                i = this.calling_code.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.whatsapp_first != null) {
                i2 = this.whatsapp_first.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49425, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49425, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.calling_code != null) {
            sb.append(", calling_code=");
            sb.append(this.calling_code);
        }
        if (this.whatsapp_first != null) {
            sb.append(", whatsapp_first=");
            sb.append(this.whatsapp_first);
        }
        StringBuilder replace = sb.replace(0, 2, "WhatsAppCodeItem{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49423, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49423, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof WhatsAppCodeItem)) {
                return false;
            }
            WhatsAppCodeItem whatsAppCodeItem = (WhatsAppCodeItem) obj;
            if (!unknownFields().equals(whatsAppCodeItem.unknownFields()) || !Internal.equals(this.calling_code, whatsAppCodeItem.calling_code) || !Internal.equals(this.whatsapp_first, whatsAppCodeItem.whatsapp_first)) {
                return false;
            }
            return true;
        }
    }

    public WhatsAppCodeItem(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public WhatsAppCodeItem(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calling_code = str;
        this.whatsapp_first = bool;
    }
}
