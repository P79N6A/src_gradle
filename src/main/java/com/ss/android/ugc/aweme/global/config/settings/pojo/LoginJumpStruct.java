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

public final class LoginJumpStruct extends Message<LoginJumpStruct, Builder> {
    public static final DefaultValueProtoAdapter<LoginJumpStruct> ADAPTER = new ProtoAdapter_LoginJumpStruct();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer jump_type;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String jump_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer login_platform;

    public static final class Builder extends Message.Builder<LoginJumpStruct, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer jump_type;
        public String jump_url;
        public Integer login_platform;

        public final LoginJumpStruct build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48933, new Class[0], LoginJumpStruct.class)) {
                return new LoginJumpStruct(this.login_platform, this.jump_type, this.jump_url, super.buildUnknownFields());
            }
            return (LoginJumpStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48933, new Class[0], LoginJumpStruct.class);
        }

        public final Builder jump_type(Integer num) {
            this.jump_type = num;
            return this;
        }

        public final Builder jump_url(String str) {
            this.jump_url = str;
            return this;
        }

        public final Builder login_platform(Integer num) {
            this.login_platform = num;
            return this;
        }
    }

    static final class ProtoAdapter_LoginJumpStruct extends DefaultValueProtoAdapter<LoginJumpStruct> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final LoginJumpStruct redact(LoginJumpStruct loginJumpStruct) {
            return loginJumpStruct;
        }

        public ProtoAdapter_LoginJumpStruct() {
            super(FieldEncoding.LENGTH_DELIMITED, LoginJumpStruct.class);
        }

        public final LoginJumpStruct decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48936, new Class[]{ProtoReader.class}, LoginJumpStruct.class)) {
                return decode(protoReader2, (LoginJumpStruct) null);
            }
            return (LoginJumpStruct) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 48936, new Class[]{ProtoReader.class}, LoginJumpStruct.class);
        }

        public final int encodedSize(LoginJumpStruct loginJumpStruct) {
            LoginJumpStruct loginJumpStruct2 = loginJumpStruct;
            if (!PatchProxy.isSupport(new Object[]{loginJumpStruct2}, this, changeQuickRedirect, false, 48934, new Class[]{LoginJumpStruct.class}, Integer.TYPE)) {
                return ProtoAdapter.INT32.encodedSizeWithTag(1, loginJumpStruct2.login_platform) + ProtoAdapter.INT32.encodedSizeWithTag(2, loginJumpStruct2.jump_type) + ProtoAdapter.STRING.encodedSizeWithTag(3, loginJumpStruct2.jump_url) + loginJumpStruct.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{loginJumpStruct2}, this, changeQuickRedirect, false, 48934, new Class[]{LoginJumpStruct.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, LoginJumpStruct loginJumpStruct) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            LoginJumpStruct loginJumpStruct2 = loginJumpStruct;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, loginJumpStruct2}, this, changeQuickRedirect, false, 48935, new Class[]{ProtoWriter.class, LoginJumpStruct.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, loginJumpStruct2}, this, changeQuickRedirect, false, 48935, new Class[]{ProtoWriter.class, LoginJumpStruct.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1, loginJumpStruct2.login_platform);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, loginJumpStruct2.jump_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, loginJumpStruct2.jump_url);
            protoWriter2.writeBytes(loginJumpStruct.unknownFields());
        }

        public final LoginJumpStruct decode(ProtoReader protoReader, LoginJumpStruct loginJumpStruct) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            LoginJumpStruct loginJumpStruct2 = loginJumpStruct;
            if (PatchProxy.isSupport(new Object[]{protoReader2, loginJumpStruct2}, this, changeQuickRedirect, false, 48937, new Class[]{ProtoReader.class, LoginJumpStruct.class}, LoginJumpStruct.class)) {
                return (LoginJumpStruct) PatchProxy.accessDispatch(new Object[]{protoReader2, loginJumpStruct2}, this, changeQuickRedirect, false, 48937, new Class[]{ProtoReader.class, LoginJumpStruct.class}, LoginJumpStruct.class);
            }
            LoginJumpStruct loginJumpStruct3 = (LoginJumpStruct) a.a().a(LoginJumpStruct.class, loginJumpStruct2);
            if (loginJumpStruct3 != null) {
                builder = loginJumpStruct3.newBuilder();
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
                            builder2.login_platform((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 2:
                            builder2.jump_type((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 3:
                            builder2.jump_url((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (loginJumpStruct3 != null) {
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
    public final Integer getJumpType() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48927, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48927, new Class[0], Integer.class);
        } else if (this.jump_type != null) {
            return this.jump_type;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final String getJumpUrl() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48928, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48928, new Class[0], String.class);
        } else if (this.jump_url != null) {
            return this.jump_url;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getLoginPlatform() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48926, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48926, new Class[0], Integer.class);
        } else if (this.login_platform != null) {
            return this.login_platform;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48931, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48931, new Class[0], Integer.TYPE)).intValue();
        }
        int i4 = this.hashCode;
        if (i4 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.login_platform != null) {
                i = this.login_platform.hashCode();
            } else {
                i = 0;
            }
            int i5 = (hashCode + i) * 37;
            if (this.jump_type != null) {
                i2 = this.jump_type.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            if (this.jump_url != null) {
                i3 = this.jump_url.hashCode();
            }
            i4 = i6 + i3;
            this.hashCode = i4;
        }
        return i4;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48929, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48929, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.login_platform = this.login_platform;
        builder.jump_type = this.jump_type;
        builder.jump_url = this.jump_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48932, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48932, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.login_platform != null) {
            sb.append(", login_platform=");
            sb.append(this.login_platform);
        }
        if (this.jump_type != null) {
            sb.append(", jump_type=");
            sb.append(this.jump_type);
        }
        if (this.jump_url != null) {
            sb.append(", jump_url=");
            sb.append(this.jump_url);
        }
        StringBuilder replace = sb.replace(0, 2, "LoginJumpStruct{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 48930, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 48930, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof LoginJumpStruct)) {
                return false;
            }
            LoginJumpStruct loginJumpStruct = (LoginJumpStruct) obj;
            if (!unknownFields().equals(loginJumpStruct.unknownFields()) || !Internal.equals(this.login_platform, loginJumpStruct.login_platform) || !Internal.equals(this.jump_type, loginJumpStruct.jump_type) || !Internal.equals(this.jump_url, loginJumpStruct.jump_url)) {
                return false;
            }
            return true;
        }
    }

    public LoginJumpStruct(Integer num, Integer num2, String str) {
        this(num, num2, str, ByteString.EMPTY);
    }

    public LoginJumpStruct(Integer num, Integer num2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.login_platform = num;
        this.jump_type = num2;
        this.jump_url = str;
    }
}
