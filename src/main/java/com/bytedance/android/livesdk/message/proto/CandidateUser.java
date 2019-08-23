package com.bytedance.android.livesdk.message.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CandidateUser extends Message<CandidateUser, Builder> {
    public static final ProtoAdapter<CandidateUser> ADAPTER = new ProtoAdapter_CandidateUser();
    public static final Long DEFAULT_USER_ID = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String avatar_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long user_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String user_name;

    public static final class Builder extends Message.Builder<CandidateUser, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String avatar_url;
        public Long user_id;
        public String user_name;

        public final CandidateUser build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11214, new Class[0], CandidateUser.class)) {
                return new CandidateUser(this.user_id, this.user_name, this.avatar_url, super.buildUnknownFields());
            }
            return (CandidateUser) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11214, new Class[0], CandidateUser.class);
        }

        public final Builder avatar_url(String str) {
            this.avatar_url = str;
            return this;
        }

        public final Builder user_id(Long l) {
            this.user_id = l;
            return this;
        }

        public final Builder user_name(String str) {
            this.user_name = str;
            return this;
        }
    }

    static final class ProtoAdapter_CandidateUser extends ProtoAdapter<CandidateUser> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_CandidateUser() {
            super(FieldEncoding.LENGTH_DELIMITED, CandidateUser.class);
        }

        public final int encodedSize(CandidateUser candidateUser) {
            int i;
            int i2;
            CandidateUser candidateUser2 = candidateUser;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[]{candidateUser2}, this, changeQuickRedirect, false, 11215, new Class[]{CandidateUser.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{candidateUser2}, this, changeQuickRedirect, false, 11215, new Class[]{CandidateUser.class}, Integer.TYPE)).intValue();
            }
            if (candidateUser2.user_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, candidateUser2.user_id);
            } else {
                i = 0;
            }
            if (candidateUser2.user_name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, candidateUser2.user_name);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (candidateUser2.avatar_url != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, candidateUser2.avatar_url);
            }
            return i4 + i3 + candidateUser.unknownFields().size();
        }

        public final CandidateUser redact(CandidateUser candidateUser) {
            if (PatchProxy.isSupport(new Object[]{candidateUser}, this, changeQuickRedirect, false, 11218, new Class[]{CandidateUser.class}, CandidateUser.class)) {
                return (CandidateUser) PatchProxy.accessDispatch(new Object[]{candidateUser}, this, changeQuickRedirect, false, 11218, new Class[]{CandidateUser.class}, CandidateUser.class);
            }
            Builder newBuilder = candidateUser.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final CandidateUser decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11217, new Class[]{ProtoReader.class}, CandidateUser.class)) {
                return (CandidateUser) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11217, new Class[]{ProtoReader.class}, CandidateUser.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.user_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 2:
                            builder.user_name((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder.avatar_url((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                            break;
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, CandidateUser candidateUser) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            CandidateUser candidateUser2 = candidateUser;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, candidateUser2}, this, changeQuickRedirect, false, 11216, new Class[]{ProtoWriter.class, CandidateUser.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, candidateUser2}, this, changeQuickRedirect, false, 11216, new Class[]{ProtoWriter.class, CandidateUser.class}, Void.TYPE);
                return;
            }
            if (candidateUser2.user_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, candidateUser2.user_id);
            }
            if (candidateUser2.user_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, candidateUser2.user_name);
            }
            if (candidateUser2.avatar_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, candidateUser2.avatar_url);
            }
            protoWriter2.writeBytes(candidateUser.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11210, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11210, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.user_id = this.user_id;
        builder.user_name = this.user_name;
        builder.avatar_url = this.avatar_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11212, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11212, new Class[0], Integer.TYPE)).intValue();
        }
        int i4 = this.hashCode;
        if (i4 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.user_id != null) {
                i = this.user_id.hashCode();
            } else {
                i = 0;
            }
            int i5 = (hashCode + i) * 37;
            if (this.user_name != null) {
                i2 = this.user_name.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            if (this.avatar_url != null) {
                i3 = this.avatar_url.hashCode();
            }
            i4 = i6 + i3;
            this.hashCode = i4;
        }
        return i4;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11213, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11213, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.user_name != null) {
            sb.append(", user_name=");
            sb.append(this.user_name);
        }
        if (this.avatar_url != null) {
            sb.append(", avatar_url=");
            sb.append(this.avatar_url);
        }
        StringBuilder replace = sb.replace(0, 2, "CandidateUser{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11211, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11211, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof CandidateUser)) {
                return false;
            }
            CandidateUser candidateUser = (CandidateUser) obj;
            if (!unknownFields().equals(candidateUser.unknownFields()) || !Internal.equals(this.user_id, candidateUser.user_id) || !Internal.equals(this.user_name, candidateUser.user_name) || !Internal.equals(this.avatar_url, candidateUser.avatar_url)) {
                return false;
            }
            return true;
        }
    }

    public CandidateUser(Long l, String str, String str2) {
        this(l, str, str2, ByteString.EMPTY);
    }

    public CandidateUser(Long l, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = l;
        this.user_name = str;
        this.avatar_url = str2;
    }
}
