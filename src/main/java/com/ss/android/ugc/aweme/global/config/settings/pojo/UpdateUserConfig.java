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

public final class UpdateUserConfig extends Message<UpdateUserConfig, Builder> {
    public static final DefaultValueProtoAdapter<UpdateUserConfig> ADAPTER = new ProtoAdapter_UpdateUserConfig();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String wx_toast_content;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public final Boolean wx_toast_enable;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer wx_toast_frequence;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer wx_toast_position;

    public static final class Builder extends Message.Builder<UpdateUserConfig, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String wx_toast_content;
        public Boolean wx_toast_enable;
        public Integer wx_toast_frequence;
        public Integer wx_toast_position;

        public final UpdateUserConfig build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49338, new Class[0], UpdateUserConfig.class)) {
                return (UpdateUserConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49338, new Class[0], UpdateUserConfig.class);
            }
            UpdateUserConfig updateUserConfig = new UpdateUserConfig(this.wx_toast_position, this.wx_toast_content, this.wx_toast_enable, this.wx_toast_frequence, super.buildUnknownFields());
            return updateUserConfig;
        }

        public final Builder wx_toast_content(String str) {
            this.wx_toast_content = str;
            return this;
        }

        public final Builder wx_toast_enable(Boolean bool) {
            this.wx_toast_enable = bool;
            return this;
        }

        public final Builder wx_toast_frequence(Integer num) {
            this.wx_toast_frequence = num;
            return this;
        }

        public final Builder wx_toast_position(Integer num) {
            this.wx_toast_position = num;
            return this;
        }
    }

    static final class ProtoAdapter_UpdateUserConfig extends DefaultValueProtoAdapter<UpdateUserConfig> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final UpdateUserConfig redact(UpdateUserConfig updateUserConfig) {
            return updateUserConfig;
        }

        public ProtoAdapter_UpdateUserConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateUserConfig.class);
        }

        public final UpdateUserConfig decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49341, new Class[]{ProtoReader.class}, UpdateUserConfig.class)) {
                return decode(protoReader2, (UpdateUserConfig) null);
            }
            return (UpdateUserConfig) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49341, new Class[]{ProtoReader.class}, UpdateUserConfig.class);
        }

        public final int encodedSize(UpdateUserConfig updateUserConfig) {
            UpdateUserConfig updateUserConfig2 = updateUserConfig;
            if (!PatchProxy.isSupport(new Object[]{updateUserConfig2}, this, changeQuickRedirect, false, 49339, new Class[]{UpdateUserConfig.class}, Integer.TYPE)) {
                return ProtoAdapter.INT32.encodedSizeWithTag(1, updateUserConfig2.wx_toast_position) + ProtoAdapter.STRING.encodedSizeWithTag(2, updateUserConfig2.wx_toast_content) + ProtoAdapter.BOOL.encodedSizeWithTag(3, updateUserConfig2.wx_toast_enable) + ProtoAdapter.INT32.encodedSizeWithTag(4, updateUserConfig2.wx_toast_frequence) + updateUserConfig.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{updateUserConfig2}, this, changeQuickRedirect, false, 49339, new Class[]{UpdateUserConfig.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, UpdateUserConfig updateUserConfig) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            UpdateUserConfig updateUserConfig2 = updateUserConfig;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, updateUserConfig2}, this, changeQuickRedirect, false, 49340, new Class[]{ProtoWriter.class, UpdateUserConfig.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, updateUserConfig2}, this, changeQuickRedirect, false, 49340, new Class[]{ProtoWriter.class, UpdateUserConfig.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1, updateUserConfig2.wx_toast_position);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, updateUserConfig2.wx_toast_content);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 3, updateUserConfig2.wx_toast_enable);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 4, updateUserConfig2.wx_toast_frequence);
            protoWriter2.writeBytes(updateUserConfig.unknownFields());
        }

        public final UpdateUserConfig decode(ProtoReader protoReader, UpdateUserConfig updateUserConfig) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            UpdateUserConfig updateUserConfig2 = updateUserConfig;
            if (PatchProxy.isSupport(new Object[]{protoReader2, updateUserConfig2}, this, changeQuickRedirect, false, 49342, new Class[]{ProtoReader.class, UpdateUserConfig.class}, UpdateUserConfig.class)) {
                return (UpdateUserConfig) PatchProxy.accessDispatch(new Object[]{protoReader2, updateUserConfig2}, this, changeQuickRedirect, false, 49342, new Class[]{ProtoReader.class, UpdateUserConfig.class}, UpdateUserConfig.class);
            }
            UpdateUserConfig updateUserConfig3 = (UpdateUserConfig) a.a().a(UpdateUserConfig.class, updateUserConfig2);
            if (updateUserConfig3 != null) {
                builder = updateUserConfig3.newBuilder();
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
                            builder2.wx_toast_position((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 2:
                            builder2.wx_toast_content((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder2.wx_toast_enable((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 4:
                            builder2.wx_toast_frequence((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (updateUserConfig3 != null) {
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
    public final String getWxToastContent() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49331, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49331, new Class[0], String.class);
        } else if (this.wx_toast_content != null) {
            return this.wx_toast_content;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Boolean getWxToastEnable() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49332, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49332, new Class[0], Boolean.class);
        } else if (this.wx_toast_enable != null) {
            return this.wx_toast_enable;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getWxToastFrequence() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49333, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49333, new Class[0], Integer.class);
        } else if (this.wx_toast_frequence != null) {
            return this.wx_toast_frequence;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getWxToastPosition() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49330, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49330, new Class[0], Integer.class);
        } else if (this.wx_toast_position != null) {
            return this.wx_toast_position;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49336, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49336, new Class[0], Integer.TYPE)).intValue();
        }
        int i5 = this.hashCode;
        if (i5 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.wx_toast_position != null) {
                i = this.wx_toast_position.hashCode();
            } else {
                i = 0;
            }
            int i6 = (hashCode + i) * 37;
            if (this.wx_toast_content != null) {
                i2 = this.wx_toast_content.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 37;
            if (this.wx_toast_enable != null) {
                i3 = this.wx_toast_enable.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 37;
            if (this.wx_toast_frequence != null) {
                i4 = this.wx_toast_frequence.hashCode();
            }
            i5 = i8 + i4;
            this.hashCode = i5;
        }
        return i5;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49334, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49334, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.wx_toast_position = this.wx_toast_position;
        builder.wx_toast_content = this.wx_toast_content;
        builder.wx_toast_enable = this.wx_toast_enable;
        builder.wx_toast_frequence = this.wx_toast_frequence;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49337, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49337, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.wx_toast_position != null) {
            sb.append(", wx_toast_position=");
            sb.append(this.wx_toast_position);
        }
        if (this.wx_toast_content != null) {
            sb.append(", wx_toast_content=");
            sb.append(this.wx_toast_content);
        }
        if (this.wx_toast_enable != null) {
            sb.append(", wx_toast_enable=");
            sb.append(this.wx_toast_enable);
        }
        if (this.wx_toast_frequence != null) {
            sb.append(", wx_toast_frequence=");
            sb.append(this.wx_toast_frequence);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateUserConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49335, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49335, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof UpdateUserConfig)) {
                return false;
            }
            UpdateUserConfig updateUserConfig = (UpdateUserConfig) obj;
            if (!unknownFields().equals(updateUserConfig.unknownFields()) || !Internal.equals(this.wx_toast_position, updateUserConfig.wx_toast_position) || !Internal.equals(this.wx_toast_content, updateUserConfig.wx_toast_content) || !Internal.equals(this.wx_toast_enable, updateUserConfig.wx_toast_enable) || !Internal.equals(this.wx_toast_frequence, updateUserConfig.wx_toast_frequence)) {
                return false;
            }
            return true;
        }
    }

    public UpdateUserConfig(Integer num, String str, Boolean bool, Integer num2) {
        this(num, str, bool, num2, ByteString.EMPTY);
    }

    public UpdateUserConfig(Integer num, String str, Boolean bool, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.wx_toast_position = num;
        this.wx_toast_content = str;
        this.wx_toast_enable = bool;
        this.wx_toast_frequence = num2;
    }
}
