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

public final class UserPreferSettings extends Message<UserPreferSettings, Builder> {
    public static final DefaultValueProtoAdapter<UserPreferSettings> ADAPTER = new ProtoAdapter_UserPreferSettings();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer display_time;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer n;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer t;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer v;

    public static final class Builder extends Message.Builder<UserPreferSettings, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer display_time;
        public Integer n;
        public Integer t;
        public Integer v;

        public final UserPreferSettings build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49377, new Class[0], UserPreferSettings.class)) {
                return (UserPreferSettings) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49377, new Class[0], UserPreferSettings.class);
            }
            UserPreferSettings userPreferSettings = new UserPreferSettings(this.n, this.t, this.v, this.display_time, super.buildUnknownFields());
            return userPreferSettings;
        }

        public final Builder display_time(Integer num) {
            this.display_time = num;
            return this;
        }

        public final Builder n(Integer num) {
            this.n = num;
            return this;
        }

        public final Builder t(Integer num) {
            this.t = num;
            return this;
        }

        public final Builder v(Integer num) {
            this.v = num;
            return this;
        }
    }

    static final class ProtoAdapter_UserPreferSettings extends DefaultValueProtoAdapter<UserPreferSettings> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final UserPreferSettings redact(UserPreferSettings userPreferSettings) {
            return userPreferSettings;
        }

        public ProtoAdapter_UserPreferSettings() {
            super(FieldEncoding.LENGTH_DELIMITED, UserPreferSettings.class);
        }

        public final UserPreferSettings decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49380, new Class[]{ProtoReader.class}, UserPreferSettings.class)) {
                return decode(protoReader2, (UserPreferSettings) null);
            }
            return (UserPreferSettings) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49380, new Class[]{ProtoReader.class}, UserPreferSettings.class);
        }

        public final int encodedSize(UserPreferSettings userPreferSettings) {
            UserPreferSettings userPreferSettings2 = userPreferSettings;
            if (!PatchProxy.isSupport(new Object[]{userPreferSettings2}, this, changeQuickRedirect, false, 49378, new Class[]{UserPreferSettings.class}, Integer.TYPE)) {
                return ProtoAdapter.INT32.encodedSizeWithTag(1, userPreferSettings2.n) + ProtoAdapter.INT32.encodedSizeWithTag(2, userPreferSettings2.t) + ProtoAdapter.INT32.encodedSizeWithTag(3, userPreferSettings2.v) + ProtoAdapter.INT32.encodedSizeWithTag(4, userPreferSettings2.display_time) + userPreferSettings.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{userPreferSettings2}, this, changeQuickRedirect, false, 49378, new Class[]{UserPreferSettings.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, UserPreferSettings userPreferSettings) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            UserPreferSettings userPreferSettings2 = userPreferSettings;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, userPreferSettings2}, this, changeQuickRedirect, false, 49379, new Class[]{ProtoWriter.class, UserPreferSettings.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, userPreferSettings2}, this, changeQuickRedirect, false, 49379, new Class[]{ProtoWriter.class, UserPreferSettings.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1, userPreferSettings2.n);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, userPreferSettings2.t);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 3, userPreferSettings2.v);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 4, userPreferSettings2.display_time);
            protoWriter2.writeBytes(userPreferSettings.unknownFields());
        }

        public final UserPreferSettings decode(ProtoReader protoReader, UserPreferSettings userPreferSettings) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            UserPreferSettings userPreferSettings2 = userPreferSettings;
            if (PatchProxy.isSupport(new Object[]{protoReader2, userPreferSettings2}, this, changeQuickRedirect, false, 49381, new Class[]{ProtoReader.class, UserPreferSettings.class}, UserPreferSettings.class)) {
                return (UserPreferSettings) PatchProxy.accessDispatch(new Object[]{protoReader2, userPreferSettings2}, this, changeQuickRedirect, false, 49381, new Class[]{ProtoReader.class, UserPreferSettings.class}, UserPreferSettings.class);
            }
            UserPreferSettings userPreferSettings3 = (UserPreferSettings) a.a().a(UserPreferSettings.class, userPreferSettings2);
            if (userPreferSettings3 != null) {
                builder = userPreferSettings3.newBuilder();
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
                            builder2.n((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 2:
                            builder2.t((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 3:
                            builder2.v((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 4:
                            builder2.display_time((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (userPreferSettings3 != null) {
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
    public final Integer getDisplayTime() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49372, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49372, new Class[0], Integer.class);
        } else if (this.display_time != null) {
            return this.display_time;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getN() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49369, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49369, new Class[0], Integer.class);
        } else if (this.n != null) {
            return this.n;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getT() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49370, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49370, new Class[0], Integer.class);
        } else if (this.t != null) {
            return this.t;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getV() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49371, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49371, new Class[0], Integer.class);
        } else if (this.v != null) {
            return this.v;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49375, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49375, new Class[0], Integer.TYPE)).intValue();
        }
        int i5 = this.hashCode;
        if (i5 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.n != null) {
                i = this.n.hashCode();
            } else {
                i = 0;
            }
            int i6 = (hashCode + i) * 37;
            if (this.t != null) {
                i2 = this.t.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 37;
            if (this.v != null) {
                i3 = this.v.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 37;
            if (this.display_time != null) {
                i4 = this.display_time.hashCode();
            }
            i5 = i8 + i4;
            this.hashCode = i5;
        }
        return i5;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49373, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49373, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.n = this.n;
        builder.t = this.t;
        builder.v = this.v;
        builder.display_time = this.display_time;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49376, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49376, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.n != null) {
            sb.append(", n=");
            sb.append(this.n);
        }
        if (this.t != null) {
            sb.append(", t=");
            sb.append(this.t);
        }
        if (this.v != null) {
            sb.append(", v=");
            sb.append(this.v);
        }
        if (this.display_time != null) {
            sb.append(", display_time=");
            sb.append(this.display_time);
        }
        StringBuilder replace = sb.replace(0, 2, "UserPreferSettings{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49374, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49374, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof UserPreferSettings)) {
                return false;
            }
            UserPreferSettings userPreferSettings = (UserPreferSettings) obj;
            if (!unknownFields().equals(userPreferSettings.unknownFields()) || !Internal.equals(this.n, userPreferSettings.n) || !Internal.equals(this.t, userPreferSettings.t) || !Internal.equals(this.v, userPreferSettings.v) || !Internal.equals(this.display_time, userPreferSettings.display_time)) {
                return false;
            }
            return true;
        }
    }

    public UserPreferSettings(Integer num, Integer num2, Integer num3, Integer num4) {
        this(num, num2, num3, num4, ByteString.EMPTY);
    }

    public UserPreferSettings(Integer num, Integer num2, Integer num3, Integer num4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.n = num;
        this.t = num2;
        this.v = num3;
        this.display_time = num4;
    }
}
