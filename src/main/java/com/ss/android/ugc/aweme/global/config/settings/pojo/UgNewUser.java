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

public final class UgNewUser extends Message<UgNewUser, Builder> {
    public static final DefaultValueProtoAdapter<UgNewUser> ADAPTER = new ProtoAdapter_UgNewUser();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer active_time_limit;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer download_time_limit;

    public static final class Builder extends Message.Builder<UgNewUser, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer active_time_limit;
        public Integer download_time_limit;

        public final UgNewUser build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49295, new Class[0], UgNewUser.class)) {
                return new UgNewUser(this.download_time_limit, this.active_time_limit, super.buildUnknownFields());
            }
            return (UgNewUser) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49295, new Class[0], UgNewUser.class);
        }

        public final Builder active_time_limit(Integer num) {
            this.active_time_limit = num;
            return this;
        }

        public final Builder download_time_limit(Integer num) {
            this.download_time_limit = num;
            return this;
        }
    }

    static final class ProtoAdapter_UgNewUser extends DefaultValueProtoAdapter<UgNewUser> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final UgNewUser redact(UgNewUser ugNewUser) {
            return ugNewUser;
        }

        public ProtoAdapter_UgNewUser() {
            super(FieldEncoding.LENGTH_DELIMITED, UgNewUser.class);
        }

        public final UgNewUser decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49298, new Class[]{ProtoReader.class}, UgNewUser.class)) {
                return decode(protoReader2, (UgNewUser) null);
            }
            return (UgNewUser) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49298, new Class[]{ProtoReader.class}, UgNewUser.class);
        }

        public final int encodedSize(UgNewUser ugNewUser) {
            UgNewUser ugNewUser2 = ugNewUser;
            if (!PatchProxy.isSupport(new Object[]{ugNewUser2}, this, changeQuickRedirect, false, 49296, new Class[]{UgNewUser.class}, Integer.TYPE)) {
                return ProtoAdapter.INT32.encodedSizeWithTag(1, ugNewUser2.download_time_limit) + ProtoAdapter.INT32.encodedSizeWithTag(2, ugNewUser2.active_time_limit) + ugNewUser.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{ugNewUser2}, this, changeQuickRedirect, false, 49296, new Class[]{UgNewUser.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, UgNewUser ugNewUser) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            UgNewUser ugNewUser2 = ugNewUser;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, ugNewUser2}, this, changeQuickRedirect, false, 49297, new Class[]{ProtoWriter.class, UgNewUser.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, ugNewUser2}, this, changeQuickRedirect, false, 49297, new Class[]{ProtoWriter.class, UgNewUser.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1, ugNewUser2.download_time_limit);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, ugNewUser2.active_time_limit);
            protoWriter2.writeBytes(ugNewUser.unknownFields());
        }

        public final UgNewUser decode(ProtoReader protoReader, UgNewUser ugNewUser) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            UgNewUser ugNewUser2 = ugNewUser;
            if (PatchProxy.isSupport(new Object[]{protoReader2, ugNewUser2}, this, changeQuickRedirect, false, 49299, new Class[]{ProtoReader.class, UgNewUser.class}, UgNewUser.class)) {
                return (UgNewUser) PatchProxy.accessDispatch(new Object[]{protoReader2, ugNewUser2}, this, changeQuickRedirect, false, 49299, new Class[]{ProtoReader.class, UgNewUser.class}, UgNewUser.class);
            }
            UgNewUser ugNewUser3 = (UgNewUser) a.a().a(UgNewUser.class, ugNewUser2);
            if (ugNewUser3 != null) {
                builder = ugNewUser3.newBuilder();
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
                            builder2.download_time_limit((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 2:
                            builder2.active_time_limit((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (ugNewUser3 != null) {
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
    public final Integer getActiveTimeLimit() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49290, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49290, new Class[0], Integer.class);
        } else if (this.active_time_limit != null) {
            return this.active_time_limit;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getDownloadTimeLimit() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49289, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49289, new Class[0], Integer.class);
        } else if (this.download_time_limit != null) {
            return this.download_time_limit;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49291, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49291, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.download_time_limit = this.download_time_limit;
        builder.active_time_limit = this.active_time_limit;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49293, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49293, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.download_time_limit != null) {
                i = this.download_time_limit.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            if (this.active_time_limit != null) {
                i2 = this.active_time_limit.hashCode();
            }
            i3 = i4 + i2;
            this.hashCode = i3;
        }
        return i3;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49294, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49294, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.download_time_limit != null) {
            sb.append(", download_time_limit=");
            sb.append(this.download_time_limit);
        }
        if (this.active_time_limit != null) {
            sb.append(", active_time_limit=");
            sb.append(this.active_time_limit);
        }
        StringBuilder replace = sb.replace(0, 2, "UgNewUser{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49292, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49292, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof UgNewUser)) {
                return false;
            }
            UgNewUser ugNewUser = (UgNewUser) obj;
            if (!unknownFields().equals(ugNewUser.unknownFields()) || !Internal.equals(this.download_time_limit, ugNewUser.download_time_limit) || !Internal.equals(this.active_time_limit, ugNewUser.active_time_limit)) {
                return false;
            }
            return true;
        }
    }

    public UgNewUser(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public UgNewUser(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.download_time_limit = num;
        this.active_time_limit = num2;
    }
}
