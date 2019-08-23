package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.c.a;
import com.bytedance.ies.c.b;
import com.bytedance.ies.c.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.io.IOException;
import okio.ByteString;

public final class UlikeParams extends Message<UlikeParams, Builder> {
    public static final DefaultValueProtoAdapter<UlikeParams> ADAPTER = new ProtoAdapter_UlikeParams();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = 0, tag = 10)
    public final Boolean enable_beauty_makeup;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = 0, tag = 11)
    public final Boolean enable_beauty_sharpen;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = 0, tag = 9)
    public final Float ulike_blusher_default_value;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = 0, tag = 6)
    public final Float ulike_eyes_default_value;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = 0, tag = 7)
    public final Float ulike_eyes_max_value;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = 0, tag = 8)
    public final Float ulike_lip_default_value;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = 0, tag = 4)
    public final Float ulike_shape_default_value;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = 0, tag = 5)
    public final Float ulike_shape_max_value;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = 0, tag = 1)
    public final Float ulike_sharpen_default_value;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = 0, tag = 2)
    public final Float ulike_smooth_default_value;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = 0, tag = 3)
    public final Float ulike_smooth_max_value;

    public static final class Builder extends Message.Builder<UlikeParams, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Boolean enable_beauty_makeup;
        public Boolean enable_beauty_sharpen;
        public Float ulike_blusher_default_value;
        public Float ulike_eyes_default_value;
        public Float ulike_eyes_max_value;
        public Float ulike_lip_default_value;
        public Float ulike_shape_default_value;
        public Float ulike_shape_max_value;
        public Float ulike_sharpen_default_value;
        public Float ulike_smooth_default_value;
        public Float ulike_smooth_max_value;

        public final UlikeParams build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49325, new Class[0], UlikeParams.class)) {
                return (UlikeParams) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49325, new Class[0], UlikeParams.class);
            } else if (this.ulike_sharpen_default_value == null || this.ulike_smooth_default_value == null || this.ulike_smooth_max_value == null || this.ulike_shape_default_value == null || this.ulike_shape_max_value == null || this.ulike_eyes_default_value == null || this.ulike_eyes_max_value == null || this.ulike_lip_default_value == null || this.ulike_blusher_default_value == null || this.enable_beauty_makeup == null || this.enable_beauty_sharpen == null) {
                throw c.a(this.ulike_sharpen_default_value, "ulike_sharpen_default_value", this.ulike_smooth_default_value, "ulike_smooth_default_value", this.ulike_smooth_max_value, "ulike_smooth_max_value", this.ulike_shape_default_value, "ulike_shape_default_value", this.ulike_shape_max_value, "ulike_shape_max_value", this.ulike_eyes_default_value, "ulike_eyes_default_value", this.ulike_eyes_max_value, "ulike_eyes_max_value", this.ulike_lip_default_value, "ulike_lip_default_value", this.ulike_blusher_default_value, "ulike_blusher_default_value", this.enable_beauty_makeup, "enable_beauty_makeup", this.enable_beauty_sharpen, "enable_beauty_sharpen");
            } else {
                UlikeParams ulikeParams = new UlikeParams(this.ulike_sharpen_default_value, this.ulike_smooth_default_value, this.ulike_smooth_max_value, this.ulike_shape_default_value, this.ulike_shape_max_value, this.ulike_eyes_default_value, this.ulike_eyes_max_value, this.ulike_lip_default_value, this.ulike_blusher_default_value, this.enable_beauty_makeup, this.enable_beauty_sharpen, super.buildUnknownFields());
                return ulikeParams;
            }
        }

        public final Builder enable_beauty_makeup(Boolean bool) {
            this.enable_beauty_makeup = bool;
            return this;
        }

        public final Builder enable_beauty_sharpen(Boolean bool) {
            this.enable_beauty_sharpen = bool;
            return this;
        }

        public final Builder ulike_blusher_default_value(Float f2) {
            this.ulike_blusher_default_value = f2;
            return this;
        }

        public final Builder ulike_eyes_default_value(Float f2) {
            this.ulike_eyes_default_value = f2;
            return this;
        }

        public final Builder ulike_eyes_max_value(Float f2) {
            this.ulike_eyes_max_value = f2;
            return this;
        }

        public final Builder ulike_lip_default_value(Float f2) {
            this.ulike_lip_default_value = f2;
            return this;
        }

        public final Builder ulike_shape_default_value(Float f2) {
            this.ulike_shape_default_value = f2;
            return this;
        }

        public final Builder ulike_shape_max_value(Float f2) {
            this.ulike_shape_max_value = f2;
            return this;
        }

        public final Builder ulike_sharpen_default_value(Float f2) {
            this.ulike_sharpen_default_value = f2;
            return this;
        }

        public final Builder ulike_smooth_default_value(Float f2) {
            this.ulike_smooth_default_value = f2;
            return this;
        }

        public final Builder ulike_smooth_max_value(Float f2) {
            this.ulike_smooth_max_value = f2;
            return this;
        }
    }

    static final class ProtoAdapter_UlikeParams extends DefaultValueProtoAdapter<UlikeParams> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final UlikeParams redact(UlikeParams ulikeParams) {
            return ulikeParams;
        }

        public ProtoAdapter_UlikeParams() {
            super(FieldEncoding.LENGTH_DELIMITED, UlikeParams.class);
        }

        public final UlikeParams decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49328, new Class[]{ProtoReader.class}, UlikeParams.class)) {
                return decode(protoReader2, (UlikeParams) null);
            }
            return (UlikeParams) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49328, new Class[]{ProtoReader.class}, UlikeParams.class);
        }

        public final int encodedSize(UlikeParams ulikeParams) {
            UlikeParams ulikeParams2 = ulikeParams;
            if (!PatchProxy.isSupport(new Object[]{ulikeParams2}, this, changeQuickRedirect, false, 49326, new Class[]{UlikeParams.class}, Integer.TYPE)) {
                return ProtoAdapter.FLOAT.encodedSizeWithTag(1, ulikeParams2.ulike_sharpen_default_value) + ProtoAdapter.FLOAT.encodedSizeWithTag(2, ulikeParams2.ulike_smooth_default_value) + ProtoAdapter.FLOAT.encodedSizeWithTag(3, ulikeParams2.ulike_smooth_max_value) + ProtoAdapter.FLOAT.encodedSizeWithTag(4, ulikeParams2.ulike_shape_default_value) + ProtoAdapter.FLOAT.encodedSizeWithTag(5, ulikeParams2.ulike_shape_max_value) + ProtoAdapter.FLOAT.encodedSizeWithTag(6, ulikeParams2.ulike_eyes_default_value) + ProtoAdapter.FLOAT.encodedSizeWithTag(7, ulikeParams2.ulike_eyes_max_value) + ProtoAdapter.FLOAT.encodedSizeWithTag(8, ulikeParams2.ulike_lip_default_value) + ProtoAdapter.FLOAT.encodedSizeWithTag(9, ulikeParams2.ulike_blusher_default_value) + ProtoAdapter.BOOL.encodedSizeWithTag(10, ulikeParams2.enable_beauty_makeup) + ProtoAdapter.BOOL.encodedSizeWithTag(11, ulikeParams2.enable_beauty_sharpen) + ulikeParams.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{ulikeParams2}, this, changeQuickRedirect, false, 49326, new Class[]{UlikeParams.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, UlikeParams ulikeParams) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            UlikeParams ulikeParams2 = ulikeParams;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, ulikeParams2}, this, changeQuickRedirect, false, 49327, new Class[]{ProtoWriter.class, UlikeParams.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, ulikeParams2}, this, changeQuickRedirect, false, 49327, new Class[]{ProtoWriter.class, UlikeParams.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter2, 1, ulikeParams2.ulike_sharpen_default_value);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter2, 2, ulikeParams2.ulike_smooth_default_value);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter2, 3, ulikeParams2.ulike_smooth_max_value);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter2, 4, ulikeParams2.ulike_shape_default_value);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter2, 5, ulikeParams2.ulike_shape_max_value);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter2, 6, ulikeParams2.ulike_eyes_default_value);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter2, 7, ulikeParams2.ulike_eyes_max_value);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter2, 8, ulikeParams2.ulike_lip_default_value);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter2, 9, ulikeParams2.ulike_blusher_default_value);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 10, ulikeParams2.enable_beauty_makeup);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 11, ulikeParams2.enable_beauty_sharpen);
            protoWriter2.writeBytes(ulikeParams.unknownFields());
        }

        public final UlikeParams decode(ProtoReader protoReader, UlikeParams ulikeParams) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            UlikeParams ulikeParams2 = ulikeParams;
            if (PatchProxy.isSupport(new Object[]{protoReader2, ulikeParams2}, this, changeQuickRedirect, false, 49329, new Class[]{ProtoReader.class, UlikeParams.class}, UlikeParams.class)) {
                return (UlikeParams) PatchProxy.accessDispatch(new Object[]{protoReader2, ulikeParams2}, this, changeQuickRedirect, false, 49329, new Class[]{ProtoReader.class, UlikeParams.class}, UlikeParams.class);
            }
            UlikeParams ulikeParams3 = (UlikeParams) a.a().a(UlikeParams.class, ulikeParams2);
            if (ulikeParams3 != null) {
                builder = ulikeParams3.newBuilder();
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
                            builder2.ulike_sharpen_default_value((Float) ProtoAdapter.FLOAT.decode(protoReader2));
                            break;
                        case 2:
                            builder2.ulike_smooth_default_value((Float) ProtoAdapter.FLOAT.decode(protoReader2));
                            break;
                        case 3:
                            builder2.ulike_smooth_max_value((Float) ProtoAdapter.FLOAT.decode(protoReader2));
                            break;
                        case 4:
                            builder2.ulike_shape_default_value((Float) ProtoAdapter.FLOAT.decode(protoReader2));
                            break;
                        case 5:
                            builder2.ulike_shape_max_value((Float) ProtoAdapter.FLOAT.decode(protoReader2));
                            break;
                        case 6:
                            builder2.ulike_eyes_default_value((Float) ProtoAdapter.FLOAT.decode(protoReader2));
                            break;
                        case e.l:
                            builder2.ulike_eyes_max_value((Float) ProtoAdapter.FLOAT.decode(protoReader2));
                            break;
                        case 8:
                            builder2.ulike_lip_default_value((Float) ProtoAdapter.FLOAT.decode(protoReader2));
                            break;
                        case 9:
                            builder2.ulike_blusher_default_value((Float) ProtoAdapter.FLOAT.decode(protoReader2));
                            break;
                        case 10:
                            builder2.enable_beauty_makeup((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 11:
                            builder2.enable_beauty_sharpen((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (ulikeParams3 != null) {
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

    public final Boolean getEnableBeautyMakeup() {
        return this.enable_beauty_makeup;
    }

    public final Boolean getEnableBeautySharpen() {
        return this.enable_beauty_sharpen;
    }

    public final Float getUlikeBlusherDefaultValue() {
        return this.ulike_blusher_default_value;
    }

    public final Float getUlikeEyesDefaultValue() {
        return this.ulike_eyes_default_value;
    }

    public final Float getUlikeEyesMaxValue() {
        return this.ulike_eyes_max_value;
    }

    public final Float getUlikeLipDefaultValue() {
        return this.ulike_lip_default_value;
    }

    public final Float getUlikeShapeDefaultValue() {
        return this.ulike_shape_default_value;
    }

    public final Float getUlikeShapeMaxValue() {
        return this.ulike_shape_max_value;
    }

    public final Float getUlikeSharpenDefaultValue() {
        return this.ulike_sharpen_default_value;
    }

    public final Float getUlikeSmoothDefaultValue() {
        return this.ulike_smooth_default_value;
    }

    public final Float getUlikeSmoothMaxValue() {
        return this.ulike_smooth_max_value;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49321, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49321, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.ulike_sharpen_default_value = this.ulike_sharpen_default_value;
        builder.ulike_smooth_default_value = this.ulike_smooth_default_value;
        builder.ulike_smooth_max_value = this.ulike_smooth_max_value;
        builder.ulike_shape_default_value = this.ulike_shape_default_value;
        builder.ulike_shape_max_value = this.ulike_shape_max_value;
        builder.ulike_eyes_default_value = this.ulike_eyes_default_value;
        builder.ulike_eyes_max_value = this.ulike_eyes_max_value;
        builder.ulike_lip_default_value = this.ulike_lip_default_value;
        builder.ulike_blusher_default_value = this.ulike_blusher_default_value;
        builder.enable_beauty_makeup = this.enable_beauty_makeup;
        builder.enable_beauty_sharpen = this.enable_beauty_sharpen;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49323, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49323, new Class[0], Integer.TYPE)).intValue();
        }
        int i = this.hashCode;
        if (i == 0) {
            i = (((((((((((((((((((((unknownFields().hashCode() * 37) + this.ulike_sharpen_default_value.hashCode()) * 37) + this.ulike_smooth_default_value.hashCode()) * 37) + this.ulike_smooth_max_value.hashCode()) * 37) + this.ulike_shape_default_value.hashCode()) * 37) + this.ulike_shape_max_value.hashCode()) * 37) + this.ulike_eyes_default_value.hashCode()) * 37) + this.ulike_eyes_max_value.hashCode()) * 37) + this.ulike_lip_default_value.hashCode()) * 37) + this.ulike_blusher_default_value.hashCode()) * 37) + this.enable_beauty_makeup.hashCode()) * 37) + this.enable_beauty_sharpen.hashCode();
            this.hashCode = i;
        }
        return i;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49324, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49324, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(", ulike_sharpen_default_value=");
        sb.append(this.ulike_sharpen_default_value);
        sb.append(", ulike_smooth_default_value=");
        sb.append(this.ulike_smooth_default_value);
        sb.append(", ulike_smooth_max_value=");
        sb.append(this.ulike_smooth_max_value);
        sb.append(", ulike_shape_default_value=");
        sb.append(this.ulike_shape_default_value);
        sb.append(", ulike_shape_max_value=");
        sb.append(this.ulike_shape_max_value);
        sb.append(", ulike_eyes_default_value=");
        sb.append(this.ulike_eyes_default_value);
        sb.append(", ulike_eyes_max_value=");
        sb.append(this.ulike_eyes_max_value);
        sb.append(", ulike_lip_default_value=");
        sb.append(this.ulike_lip_default_value);
        sb.append(", ulike_blusher_default_value=");
        sb.append(this.ulike_blusher_default_value);
        sb.append(", enable_beauty_makeup=");
        sb.append(this.enable_beauty_makeup);
        sb.append(", enable_beauty_sharpen=");
        sb.append(this.enable_beauty_sharpen);
        StringBuilder replace = sb.replace(0, 2, "UlikeParams{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49322, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49322, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof UlikeParams)) {
                return false;
            }
            UlikeParams ulikeParams = (UlikeParams) obj;
            if (!unknownFields().equals(ulikeParams.unknownFields()) || !this.ulike_sharpen_default_value.equals(ulikeParams.ulike_sharpen_default_value) || !this.ulike_smooth_default_value.equals(ulikeParams.ulike_smooth_default_value) || !this.ulike_smooth_max_value.equals(ulikeParams.ulike_smooth_max_value) || !this.ulike_shape_default_value.equals(ulikeParams.ulike_shape_default_value) || !this.ulike_shape_max_value.equals(ulikeParams.ulike_shape_max_value) || !this.ulike_eyes_default_value.equals(ulikeParams.ulike_eyes_default_value) || !this.ulike_eyes_max_value.equals(ulikeParams.ulike_eyes_max_value) || !this.ulike_lip_default_value.equals(ulikeParams.ulike_lip_default_value) || !this.ulike_blusher_default_value.equals(ulikeParams.ulike_blusher_default_value) || !this.enable_beauty_makeup.equals(ulikeParams.enable_beauty_makeup) || !this.enable_beauty_sharpen.equals(ulikeParams.enable_beauty_sharpen)) {
                return false;
            }
            return true;
        }
    }

    public UlikeParams(Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Float f9, Float f10, Boolean bool, Boolean bool2) {
        this(f2, f3, f4, f5, f6, f7, f8, f9, f10, bool, bool2, ByteString.EMPTY);
    }

    public UlikeParams(Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Float f9, Float f10, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ulike_sharpen_default_value = f2;
        this.ulike_smooth_default_value = f3;
        this.ulike_smooth_max_value = f4;
        this.ulike_shape_default_value = f5;
        this.ulike_shape_max_value = f6;
        this.ulike_eyes_default_value = f7;
        this.ulike_eyes_max_value = f8;
        this.ulike_lip_default_value = f9;
        this.ulike_blusher_default_value = f10;
        this.enable_beauty_makeup = bool;
        this.enable_beauty_sharpen = bool2;
    }
}
