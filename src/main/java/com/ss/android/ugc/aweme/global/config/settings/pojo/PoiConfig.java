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

public final class PoiConfig extends Message<PoiConfig, Builder> {
    public static final DefaultValueProtoAdapter<PoiConfig> ADAPTER = new ProtoAdapter_PoiConfig();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String poi_detail;

    public static final class Builder extends Message.Builder<PoiConfig, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String poi_detail;

        public final PoiConfig build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48962, new Class[0], PoiConfig.class)) {
                return new PoiConfig(this.poi_detail, super.buildUnknownFields());
            }
            return (PoiConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48962, new Class[0], PoiConfig.class);
        }

        public final Builder poi_detail(String str) {
            this.poi_detail = str;
            return this;
        }
    }

    static final class ProtoAdapter_PoiConfig extends DefaultValueProtoAdapter<PoiConfig> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final PoiConfig redact(PoiConfig poiConfig) {
            return poiConfig;
        }

        public ProtoAdapter_PoiConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, PoiConfig.class);
        }

        public final PoiConfig decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48965, new Class[]{ProtoReader.class}, PoiConfig.class)) {
                return decode(protoReader2, (PoiConfig) null);
            }
            return (PoiConfig) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48965, new Class[]{ProtoReader.class}, PoiConfig.class);
        }

        public final int encodedSize(PoiConfig poiConfig) {
            PoiConfig poiConfig2 = poiConfig;
            if (!PatchProxy.isSupport(new Object[]{poiConfig2}, this, changeQuickRedirect, false, 48963, new Class[]{PoiConfig.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, poiConfig2.poi_detail) + poiConfig.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{poiConfig2}, this, changeQuickRedirect, false, 48963, new Class[]{PoiConfig.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, PoiConfig poiConfig) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            PoiConfig poiConfig2 = poiConfig;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, poiConfig2}, this, changeQuickRedirect, false, 48964, new Class[]{ProtoWriter.class, PoiConfig.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, poiConfig2}, this, changeQuickRedirect, false, 48964, new Class[]{ProtoWriter.class, PoiConfig.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, poiConfig2.poi_detail);
            protoWriter2.writeBytes(poiConfig.unknownFields());
        }

        public final PoiConfig decode(ProtoReader protoReader, PoiConfig poiConfig) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            PoiConfig poiConfig2 = poiConfig;
            if (PatchProxy.isSupport(new Object[]{protoReader2, poiConfig2}, this, changeQuickRedirect, false, 48966, new Class[]{ProtoReader.class, PoiConfig.class}, PoiConfig.class)) {
                return (PoiConfig) PatchProxy.accessDispatch(new Object[]{protoReader2, poiConfig2}, this, changeQuickRedirect, false, 48966, new Class[]{ProtoReader.class, PoiConfig.class}, PoiConfig.class);
            }
            PoiConfig poiConfig3 = (PoiConfig) a.a().a(PoiConfig.class, poiConfig2);
            if (poiConfig3 != null) {
                builder = poiConfig3.newBuilder();
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
                        if (poiConfig3 == null) {
                            throw e2;
                        }
                    }
                } else {
                    builder2.poi_detail((String) ProtoAdapter.STRING.decode(protoReader2));
                }
            }
        }
    }

    @KtNullable
    public final String getPoiDetail() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48957, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48957, new Class[0], String.class);
        } else if (this.poi_detail != null) {
            return this.poi_detail;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48958, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48958, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.poi_detail = this.poi_detail;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48960, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48960, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.poi_detail != null) {
                i = this.poi_detail.hashCode();
            }
            i2 = hashCode + i;
            this.hashCode = i2;
        }
        return i2;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48961, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48961, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.poi_detail != null) {
            sb.append(", poi_detail=");
            sb.append(this.poi_detail);
        }
        StringBuilder replace = sb.replace(0, 2, "PoiConfig{");
        replace.append('}');
        return replace.toString();
    }

    public PoiConfig(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 48959, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 48959, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof PoiConfig)) {
                return false;
            }
            PoiConfig poiConfig = (PoiConfig) obj;
            if (!unknownFields().equals(poiConfig.unknownFields()) || !Internal.equals(this.poi_detail, poiConfig.poi_detail)) {
                return false;
            }
            return true;
        }
    }

    public PoiConfig(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.poi_detail = str;
    }
}
