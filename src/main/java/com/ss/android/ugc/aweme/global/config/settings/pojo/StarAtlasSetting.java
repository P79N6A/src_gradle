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

public final class StarAtlasSetting extends Message<StarAtlasSetting, Builder> {
    public static final DefaultValueProtoAdapter<StarAtlasSetting> ADAPTER = new ProtoAdapter_StarAtlasSetting();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean star_atlas_enable;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String star_atlas_redirect_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String star_atlas_url;

    public static final class Builder extends Message.Builder<StarAtlasSetting, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Boolean star_atlas_enable;
        public String star_atlas_redirect_url;
        public String star_atlas_url;

        public final StarAtlasSetting build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49162, new Class[0], StarAtlasSetting.class)) {
                return new StarAtlasSetting(this.star_atlas_enable, this.star_atlas_url, this.star_atlas_redirect_url, super.buildUnknownFields());
            }
            return (StarAtlasSetting) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49162, new Class[0], StarAtlasSetting.class);
        }

        public final Builder star_atlas_enable(Boolean bool) {
            this.star_atlas_enable = bool;
            return this;
        }

        public final Builder star_atlas_redirect_url(String str) {
            this.star_atlas_redirect_url = str;
            return this;
        }

        public final Builder star_atlas_url(String str) {
            this.star_atlas_url = str;
            return this;
        }
    }

    static final class ProtoAdapter_StarAtlasSetting extends DefaultValueProtoAdapter<StarAtlasSetting> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final StarAtlasSetting redact(StarAtlasSetting starAtlasSetting) {
            return starAtlasSetting;
        }

        public ProtoAdapter_StarAtlasSetting() {
            super(FieldEncoding.LENGTH_DELIMITED, StarAtlasSetting.class);
        }

        public final StarAtlasSetting decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49165, new Class[]{ProtoReader.class}, StarAtlasSetting.class)) {
                return decode(protoReader2, (StarAtlasSetting) null);
            }
            return (StarAtlasSetting) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49165, new Class[]{ProtoReader.class}, StarAtlasSetting.class);
        }

        public final int encodedSize(StarAtlasSetting starAtlasSetting) {
            StarAtlasSetting starAtlasSetting2 = starAtlasSetting;
            if (!PatchProxy.isSupport(new Object[]{starAtlasSetting2}, this, changeQuickRedirect, false, 49163, new Class[]{StarAtlasSetting.class}, Integer.TYPE)) {
                return ProtoAdapter.BOOL.encodedSizeWithTag(1, starAtlasSetting2.star_atlas_enable) + ProtoAdapter.STRING.encodedSizeWithTag(2, starAtlasSetting2.star_atlas_url) + ProtoAdapter.STRING.encodedSizeWithTag(3, starAtlasSetting2.star_atlas_redirect_url) + starAtlasSetting.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{starAtlasSetting2}, this, changeQuickRedirect, false, 49163, new Class[]{StarAtlasSetting.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, StarAtlasSetting starAtlasSetting) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            StarAtlasSetting starAtlasSetting2 = starAtlasSetting;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, starAtlasSetting2}, this, changeQuickRedirect, false, 49164, new Class[]{ProtoWriter.class, StarAtlasSetting.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, starAtlasSetting2}, this, changeQuickRedirect, false, 49164, new Class[]{ProtoWriter.class, StarAtlasSetting.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1, starAtlasSetting2.star_atlas_enable);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, starAtlasSetting2.star_atlas_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, starAtlasSetting2.star_atlas_redirect_url);
            protoWriter2.writeBytes(starAtlasSetting.unknownFields());
        }

        public final StarAtlasSetting decode(ProtoReader protoReader, StarAtlasSetting starAtlasSetting) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            StarAtlasSetting starAtlasSetting2 = starAtlasSetting;
            if (PatchProxy.isSupport(new Object[]{protoReader2, starAtlasSetting2}, this, changeQuickRedirect, false, 49166, new Class[]{ProtoReader.class, StarAtlasSetting.class}, StarAtlasSetting.class)) {
                return (StarAtlasSetting) PatchProxy.accessDispatch(new Object[]{protoReader2, starAtlasSetting2}, this, changeQuickRedirect, false, 49166, new Class[]{ProtoReader.class, StarAtlasSetting.class}, StarAtlasSetting.class);
            }
            StarAtlasSetting starAtlasSetting3 = (StarAtlasSetting) a.a().a(StarAtlasSetting.class, starAtlasSetting2);
            if (starAtlasSetting3 != null) {
                builder = starAtlasSetting3.newBuilder();
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
                            builder2.star_atlas_enable((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 2:
                            builder2.star_atlas_url((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder2.star_atlas_redirect_url((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (starAtlasSetting3 != null) {
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
    public final Boolean getStarAtlasEnable() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49155, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49155, new Class[0], Boolean.class);
        } else if (this.star_atlas_enable != null) {
            return this.star_atlas_enable;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getStarAtlasRedirectUrl() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49157, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49157, new Class[0], String.class);
        } else if (this.star_atlas_redirect_url != null) {
            return this.star_atlas_redirect_url;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getStarAtlasUrl() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49156, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49156, new Class[0], String.class);
        } else if (this.star_atlas_url != null) {
            return this.star_atlas_url;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49160, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49160, new Class[0], Integer.TYPE)).intValue();
        }
        int i4 = this.hashCode;
        if (i4 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.star_atlas_enable != null) {
                i = this.star_atlas_enable.hashCode();
            } else {
                i = 0;
            }
            int i5 = (hashCode + i) * 37;
            if (this.star_atlas_url != null) {
                i2 = this.star_atlas_url.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            if (this.star_atlas_redirect_url != null) {
                i3 = this.star_atlas_redirect_url.hashCode();
            }
            i4 = i6 + i3;
            this.hashCode = i4;
        }
        return i4;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49158, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49158, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.star_atlas_enable = this.star_atlas_enable;
        builder.star_atlas_url = this.star_atlas_url;
        builder.star_atlas_redirect_url = this.star_atlas_redirect_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49161, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49161, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.star_atlas_enable != null) {
            sb.append(", star_atlas_enable=");
            sb.append(this.star_atlas_enable);
        }
        if (this.star_atlas_url != null) {
            sb.append(", star_atlas_url=");
            sb.append(this.star_atlas_url);
        }
        if (this.star_atlas_redirect_url != null) {
            sb.append(", star_atlas_redirect_url=");
            sb.append(this.star_atlas_redirect_url);
        }
        StringBuilder replace = sb.replace(0, 2, "StarAtlasSetting{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49159, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49159, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof StarAtlasSetting)) {
                return false;
            }
            StarAtlasSetting starAtlasSetting = (StarAtlasSetting) obj;
            if (!unknownFields().equals(starAtlasSetting.unknownFields()) || !Internal.equals(this.star_atlas_enable, starAtlasSetting.star_atlas_enable) || !Internal.equals(this.star_atlas_url, starAtlasSetting.star_atlas_url) || !Internal.equals(this.star_atlas_redirect_url, starAtlasSetting.star_atlas_redirect_url)) {
                return false;
            }
            return true;
        }
    }

    public StarAtlasSetting(Boolean bool, String str, String str2) {
        this(bool, str, str2, ByteString.EMPTY);
    }

    public StarAtlasSetting(Boolean bool, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.star_atlas_enable = bool;
        this.star_atlas_url = str;
        this.star_atlas_redirect_url = str2;
    }
}
