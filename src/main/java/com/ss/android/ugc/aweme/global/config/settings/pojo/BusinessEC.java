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

public final class BusinessEC extends Message<BusinessEC, Builder> {
    public static final DefaultValueProtoAdapter<BusinessEC> ADAPTER = new ProtoAdapter_BusinessEC();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String page_eshop_toolbox;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String page_home;

    public static final class Builder extends Message.Builder<BusinessEC, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String page_eshop_toolbox;
        public String page_home;

        public final BusinessEC build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47732, new Class[0], BusinessEC.class)) {
                return new BusinessEC(this.page_home, this.page_eshop_toolbox, super.buildUnknownFields());
            }
            return (BusinessEC) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47732, new Class[0], BusinessEC.class);
        }

        public final Builder page_eshop_toolbox(String str) {
            this.page_eshop_toolbox = str;
            return this;
        }

        public final Builder page_home(String str) {
            this.page_home = str;
            return this;
        }
    }

    static final class ProtoAdapter_BusinessEC extends DefaultValueProtoAdapter<BusinessEC> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final BusinessEC redact(BusinessEC businessEC) {
            return businessEC;
        }

        public ProtoAdapter_BusinessEC() {
            super(FieldEncoding.LENGTH_DELIMITED, BusinessEC.class);
        }

        public final BusinessEC decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47735, new Class[]{ProtoReader.class}, BusinessEC.class)) {
                return decode(protoReader2, (BusinessEC) null);
            }
            return (BusinessEC) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47735, new Class[]{ProtoReader.class}, BusinessEC.class);
        }

        public final int encodedSize(BusinessEC businessEC) {
            BusinessEC businessEC2 = businessEC;
            if (!PatchProxy.isSupport(new Object[]{businessEC2}, this, changeQuickRedirect, false, 47733, new Class[]{BusinessEC.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, businessEC2.page_home) + ProtoAdapter.STRING.encodedSizeWithTag(3, businessEC2.page_eshop_toolbox) + businessEC.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{businessEC2}, this, changeQuickRedirect, false, 47733, new Class[]{BusinessEC.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, BusinessEC businessEC) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            BusinessEC businessEC2 = businessEC;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, businessEC2}, this, changeQuickRedirect, false, 47734, new Class[]{ProtoWriter.class, BusinessEC.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, businessEC2}, this, changeQuickRedirect, false, 47734, new Class[]{ProtoWriter.class, BusinessEC.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, businessEC2.page_home);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, businessEC2.page_eshop_toolbox);
            protoWriter2.writeBytes(businessEC.unknownFields());
        }

        public final BusinessEC decode(ProtoReader protoReader, BusinessEC businessEC) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            BusinessEC businessEC2 = businessEC;
            if (PatchProxy.isSupport(new Object[]{protoReader2, businessEC2}, this, changeQuickRedirect, false, 47736, new Class[]{ProtoReader.class, BusinessEC.class}, BusinessEC.class)) {
                return (BusinessEC) PatchProxy.accessDispatch(new Object[]{protoReader2, businessEC2}, this, changeQuickRedirect, false, 47736, new Class[]{ProtoReader.class, BusinessEC.class}, BusinessEC.class);
            }
            BusinessEC businessEC3 = (BusinessEC) a.a().a(BusinessEC.class, businessEC2);
            if (businessEC3 != null) {
                builder = businessEC3.newBuilder();
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
                } else if (nextTag == 1) {
                    builder2.page_home((String) ProtoAdapter.STRING.decode(protoReader2));
                } else if (nextTag != 3) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                    } catch (b e2) {
                        if (businessEC3 == null) {
                            throw e2;
                        }
                    }
                } else {
                    builder2.page_eshop_toolbox((String) ProtoAdapter.STRING.decode(protoReader2));
                }
            }
        }
    }

    @KtNullable
    public final String getPageEshopToolbox() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47727, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47727, new Class[0], String.class);
        } else if (this.page_eshop_toolbox != null) {
            return this.page_eshop_toolbox;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getPageHome() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47726, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47726, new Class[0], String.class);
        } else if (this.page_home != null) {
            return this.page_home;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47728, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47728, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.page_home = this.page_home;
        builder.page_eshop_toolbox = this.page_eshop_toolbox;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47730, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47730, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.page_home != null) {
                i = this.page_home.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.page_eshop_toolbox != null) {
                i2 = this.page_eshop_toolbox.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47731, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47731, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.page_home != null) {
            sb.append(", page_home=");
            sb.append(this.page_home);
        }
        if (this.page_eshop_toolbox != null) {
            sb.append(", page_eshop_toolbox=");
            sb.append(this.page_eshop_toolbox);
        }
        StringBuilder replace = sb.replace(0, 2, "BusinessEC{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47729, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47729, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof BusinessEC)) {
                return false;
            }
            BusinessEC businessEC = (BusinessEC) obj;
            if (!unknownFields().equals(businessEC.unknownFields()) || !Internal.equals(this.page_home, businessEC.page_home) || !Internal.equals(this.page_eshop_toolbox, businessEC.page_eshop_toolbox)) {
                return false;
            }
            return true;
        }
    }

    public BusinessEC(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public BusinessEC(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.page_home = str;
        this.page_eshop_toolbox = str2;
    }
}
