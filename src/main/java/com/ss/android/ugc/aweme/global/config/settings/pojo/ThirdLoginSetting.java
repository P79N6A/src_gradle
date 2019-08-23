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

public final class ThirdLoginSetting extends Message<ThirdLoginSetting, Builder> {
    public static final DefaultValueProtoAdapter<ThirdLoginSetting> ADAPTER = new ProtoAdapter_ThirdLoginSetting();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String order;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer show_num;

    public static final class Builder extends Message.Builder<ThirdLoginSetting, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String order;
        public Integer show_num;

        public final ThirdLoginSetting build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49188, new Class[0], ThirdLoginSetting.class)) {
                return new ThirdLoginSetting(this.show_num, this.order, super.buildUnknownFields());
            }
            return (ThirdLoginSetting) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49188, new Class[0], ThirdLoginSetting.class);
        }

        public final Builder order(String str) {
            this.order = str;
            return this;
        }

        public final Builder show_num(Integer num) {
            this.show_num = num;
            return this;
        }
    }

    static final class ProtoAdapter_ThirdLoginSetting extends DefaultValueProtoAdapter<ThirdLoginSetting> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final ThirdLoginSetting redact(ThirdLoginSetting thirdLoginSetting) {
            return thirdLoginSetting;
        }

        public ProtoAdapter_ThirdLoginSetting() {
            super(FieldEncoding.LENGTH_DELIMITED, ThirdLoginSetting.class);
        }

        public final ThirdLoginSetting decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49191, new Class[]{ProtoReader.class}, ThirdLoginSetting.class)) {
                return decode(protoReader2, (ThirdLoginSetting) null);
            }
            return (ThirdLoginSetting) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49191, new Class[]{ProtoReader.class}, ThirdLoginSetting.class);
        }

        public final int encodedSize(ThirdLoginSetting thirdLoginSetting) {
            ThirdLoginSetting thirdLoginSetting2 = thirdLoginSetting;
            if (!PatchProxy.isSupport(new Object[]{thirdLoginSetting2}, this, changeQuickRedirect, false, 49189, new Class[]{ThirdLoginSetting.class}, Integer.TYPE)) {
                return ProtoAdapter.INT32.encodedSizeWithTag(1, thirdLoginSetting2.show_num) + ProtoAdapter.STRING.encodedSizeWithTag(2, thirdLoginSetting2.order) + thirdLoginSetting.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{thirdLoginSetting2}, this, changeQuickRedirect, false, 49189, new Class[]{ThirdLoginSetting.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, ThirdLoginSetting thirdLoginSetting) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            ThirdLoginSetting thirdLoginSetting2 = thirdLoginSetting;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, thirdLoginSetting2}, this, changeQuickRedirect, false, 49190, new Class[]{ProtoWriter.class, ThirdLoginSetting.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, thirdLoginSetting2}, this, changeQuickRedirect, false, 49190, new Class[]{ProtoWriter.class, ThirdLoginSetting.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1, thirdLoginSetting2.show_num);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, thirdLoginSetting2.order);
            protoWriter2.writeBytes(thirdLoginSetting.unknownFields());
        }

        public final ThirdLoginSetting decode(ProtoReader protoReader, ThirdLoginSetting thirdLoginSetting) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            ThirdLoginSetting thirdLoginSetting2 = thirdLoginSetting;
            if (PatchProxy.isSupport(new Object[]{protoReader2, thirdLoginSetting2}, this, changeQuickRedirect, false, 49192, new Class[]{ProtoReader.class, ThirdLoginSetting.class}, ThirdLoginSetting.class)) {
                return (ThirdLoginSetting) PatchProxy.accessDispatch(new Object[]{protoReader2, thirdLoginSetting2}, this, changeQuickRedirect, false, 49192, new Class[]{ProtoReader.class, ThirdLoginSetting.class}, ThirdLoginSetting.class);
            }
            ThirdLoginSetting thirdLoginSetting3 = (ThirdLoginSetting) a.a().a(ThirdLoginSetting.class, thirdLoginSetting2);
            if (thirdLoginSetting3 != null) {
                builder = thirdLoginSetting3.newBuilder();
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
                            builder2.show_num((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 2:
                            builder2.order((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (thirdLoginSetting3 != null) {
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
    public final String getOrder() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49183, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49183, new Class[0], String.class);
        } else if (this.order != null) {
            return this.order;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getShowNum() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49182, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49182, new Class[0], Integer.class);
        } else if (this.show_num != null) {
            return this.show_num;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49184, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49184, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.show_num = this.show_num;
        builder.order = this.order;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49186, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49186, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.show_num != null) {
                i = this.show_num.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.order != null) {
                i2 = this.order.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49187, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49187, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.show_num != null) {
            sb.append(", show_num=");
            sb.append(this.show_num);
        }
        if (this.order != null) {
            sb.append(", order=");
            sb.append(this.order);
        }
        StringBuilder replace = sb.replace(0, 2, "ThirdLoginSetting{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49185, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49185, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof ThirdLoginSetting)) {
                return false;
            }
            ThirdLoginSetting thirdLoginSetting = (ThirdLoginSetting) obj;
            if (!unknownFields().equals(thirdLoginSetting.unknownFields()) || !Internal.equals(this.show_num, thirdLoginSetting.show_num) || !Internal.equals(this.order, thirdLoginSetting.order)) {
                return false;
            }
            return true;
        }
    }

    public ThirdLoginSetting(Integer num, String str) {
        this(num, str, ByteString.EMPTY);
    }

    public ThirdLoginSetting(Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.show_num = num;
        this.order = str;
    }
}
