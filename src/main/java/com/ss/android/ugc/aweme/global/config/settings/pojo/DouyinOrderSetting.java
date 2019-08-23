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

public final class DouyinOrderSetting extends Message<DouyinOrderSetting, Builder> {
    public static final DefaultValueProtoAdapter<DouyinOrderSetting> ADAPTER = new ProtoAdapter_DouyinOrderSetting();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String schema;

    public static final class Builder extends Message.Builder<DouyinOrderSetting, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String schema;

        public final DouyinOrderSetting build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47823, new Class[0], DouyinOrderSetting.class)) {
                return new DouyinOrderSetting(this.schema, super.buildUnknownFields());
            }
            return (DouyinOrderSetting) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47823, new Class[0], DouyinOrderSetting.class);
        }

        public final Builder schema(String str) {
            this.schema = str;
            return this;
        }
    }

    static final class ProtoAdapter_DouyinOrderSetting extends DefaultValueProtoAdapter<DouyinOrderSetting> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final DouyinOrderSetting redact(DouyinOrderSetting douyinOrderSetting) {
            return douyinOrderSetting;
        }

        public ProtoAdapter_DouyinOrderSetting() {
            super(FieldEncoding.LENGTH_DELIMITED, DouyinOrderSetting.class);
        }

        public final DouyinOrderSetting decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47826, new Class[]{ProtoReader.class}, DouyinOrderSetting.class)) {
                return decode(protoReader2, (DouyinOrderSetting) null);
            }
            return (DouyinOrderSetting) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47826, new Class[]{ProtoReader.class}, DouyinOrderSetting.class);
        }

        public final int encodedSize(DouyinOrderSetting douyinOrderSetting) {
            DouyinOrderSetting douyinOrderSetting2 = douyinOrderSetting;
            if (!PatchProxy.isSupport(new Object[]{douyinOrderSetting2}, this, changeQuickRedirect, false, 47824, new Class[]{DouyinOrderSetting.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, douyinOrderSetting2.schema) + douyinOrderSetting.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{douyinOrderSetting2}, this, changeQuickRedirect, false, 47824, new Class[]{DouyinOrderSetting.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, DouyinOrderSetting douyinOrderSetting) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            DouyinOrderSetting douyinOrderSetting2 = douyinOrderSetting;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, douyinOrderSetting2}, this, changeQuickRedirect, false, 47825, new Class[]{ProtoWriter.class, DouyinOrderSetting.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, douyinOrderSetting2}, this, changeQuickRedirect, false, 47825, new Class[]{ProtoWriter.class, DouyinOrderSetting.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, douyinOrderSetting2.schema);
            protoWriter2.writeBytes(douyinOrderSetting.unknownFields());
        }

        public final DouyinOrderSetting decode(ProtoReader protoReader, DouyinOrderSetting douyinOrderSetting) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            DouyinOrderSetting douyinOrderSetting2 = douyinOrderSetting;
            if (PatchProxy.isSupport(new Object[]{protoReader2, douyinOrderSetting2}, this, changeQuickRedirect, false, 47827, new Class[]{ProtoReader.class, DouyinOrderSetting.class}, DouyinOrderSetting.class)) {
                return (DouyinOrderSetting) PatchProxy.accessDispatch(new Object[]{protoReader2, douyinOrderSetting2}, this, changeQuickRedirect, false, 47827, new Class[]{ProtoReader.class, DouyinOrderSetting.class}, DouyinOrderSetting.class);
            }
            DouyinOrderSetting douyinOrderSetting3 = (DouyinOrderSetting) a.a().a(DouyinOrderSetting.class, douyinOrderSetting2);
            if (douyinOrderSetting3 != null) {
                builder = douyinOrderSetting3.newBuilder();
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
                        if (douyinOrderSetting3 == null) {
                            throw e2;
                        }
                    }
                } else {
                    builder2.schema((String) ProtoAdapter.STRING.decode(protoReader2));
                }
            }
        }
    }

    @KtNullable
    public final String getSchema() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47818, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47818, new Class[0], String.class);
        } else if (this.schema != null) {
            return this.schema;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47819, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47819, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.schema = this.schema;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47821, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47821, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.schema != null) {
                i = this.schema.hashCode();
            }
            i2 = hashCode + i;
            this.hashCode = i2;
        }
        return i2;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47822, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47822, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.schema != null) {
            sb.append(", schema=");
            sb.append(this.schema);
        }
        StringBuilder replace = sb.replace(0, 2, "DouyinOrderSetting{");
        replace.append('}');
        return replace.toString();
    }

    public DouyinOrderSetting(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47820, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47820, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof DouyinOrderSetting)) {
                return false;
            }
            DouyinOrderSetting douyinOrderSetting = (DouyinOrderSetting) obj;
            if (!unknownFields().equals(douyinOrderSetting.unknownFields()) || !Internal.equals(this.schema, douyinOrderSetting.schema)) {
                return false;
            }
            return true;
        }
    }

    public DouyinOrderSetting(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.schema = str;
    }
}
