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
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.io.IOException;
import okio.ByteString;

public final class ProfilePerfection extends Message<ProfilePerfection, Builder> {
    public static final DefaultValueProtoAdapter<ProfilePerfection> ADAPTER = new ProtoAdapter_ProfilePerfection();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 1)
    public final Float avatar;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 5)
    public final Float birthday;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 4)
    public final Float gender;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 8)
    public final Float location;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 2)
    public final Float nickname;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 6)
    public final Float school;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 3)
    public final Float short_id;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 7)
    public final Float signature;

    public static final class Builder extends Message.Builder<ProfilePerfection, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Float avatar;
        public Float birthday;
        public Float gender;
        public Float location;
        public Float nickname;
        public Float school;
        public Float short_id;
        public Float signature;

        public final ProfilePerfection build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49007, new Class[0], ProfilePerfection.class)) {
                return (ProfilePerfection) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49007, new Class[0], ProfilePerfection.class);
            }
            ProfilePerfection profilePerfection = new ProfilePerfection(this.avatar, this.nickname, this.short_id, this.gender, this.birthday, this.school, this.signature, this.location, super.buildUnknownFields());
            return profilePerfection;
        }

        public final Builder avatar(Float f2) {
            this.avatar = f2;
            return this;
        }

        public final Builder birthday(Float f2) {
            this.birthday = f2;
            return this;
        }

        public final Builder gender(Float f2) {
            this.gender = f2;
            return this;
        }

        public final Builder location(Float f2) {
            this.location = f2;
            return this;
        }

        public final Builder nickname(Float f2) {
            this.nickname = f2;
            return this;
        }

        public final Builder school(Float f2) {
            this.school = f2;
            return this;
        }

        public final Builder short_id(Float f2) {
            this.short_id = f2;
            return this;
        }

        public final Builder signature(Float f2) {
            this.signature = f2;
            return this;
        }
    }

    static final class ProtoAdapter_ProfilePerfection extends DefaultValueProtoAdapter<ProfilePerfection> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final ProfilePerfection redact(ProfilePerfection profilePerfection) {
            return profilePerfection;
        }

        public ProtoAdapter_ProfilePerfection() {
            super(FieldEncoding.LENGTH_DELIMITED, ProfilePerfection.class);
        }

        public final ProfilePerfection decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49010, new Class[]{ProtoReader.class}, ProfilePerfection.class)) {
                return decode(protoReader2, (ProfilePerfection) null);
            }
            return (ProfilePerfection) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49010, new Class[]{ProtoReader.class}, ProfilePerfection.class);
        }

        public final int encodedSize(ProfilePerfection profilePerfection) {
            ProfilePerfection profilePerfection2 = profilePerfection;
            if (!PatchProxy.isSupport(new Object[]{profilePerfection2}, this, changeQuickRedirect, false, 49008, new Class[]{ProfilePerfection.class}, Integer.TYPE)) {
                return ProtoAdapter.FLOAT.encodedSizeWithTag(1, profilePerfection2.avatar) + ProtoAdapter.FLOAT.encodedSizeWithTag(2, profilePerfection2.nickname) + ProtoAdapter.FLOAT.encodedSizeWithTag(3, profilePerfection2.short_id) + ProtoAdapter.FLOAT.encodedSizeWithTag(4, profilePerfection2.gender) + ProtoAdapter.FLOAT.encodedSizeWithTag(5, profilePerfection2.birthday) + ProtoAdapter.FLOAT.encodedSizeWithTag(6, profilePerfection2.school) + ProtoAdapter.FLOAT.encodedSizeWithTag(7, profilePerfection2.signature) + ProtoAdapter.FLOAT.encodedSizeWithTag(8, profilePerfection2.location) + profilePerfection.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{profilePerfection2}, this, changeQuickRedirect, false, 49008, new Class[]{ProfilePerfection.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, ProfilePerfection profilePerfection) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            ProfilePerfection profilePerfection2 = profilePerfection;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, profilePerfection2}, this, changeQuickRedirect, false, 49009, new Class[]{ProtoWriter.class, ProfilePerfection.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, profilePerfection2}, this, changeQuickRedirect, false, 49009, new Class[]{ProtoWriter.class, ProfilePerfection.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter2, 1, profilePerfection2.avatar);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter2, 2, profilePerfection2.nickname);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter2, 3, profilePerfection2.short_id);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter2, 4, profilePerfection2.gender);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter2, 5, profilePerfection2.birthday);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter2, 6, profilePerfection2.school);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter2, 7, profilePerfection2.signature);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter2, 8, profilePerfection2.location);
            protoWriter2.writeBytes(profilePerfection.unknownFields());
        }

        public final ProfilePerfection decode(ProtoReader protoReader, ProfilePerfection profilePerfection) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            ProfilePerfection profilePerfection2 = profilePerfection;
            if (PatchProxy.isSupport(new Object[]{protoReader2, profilePerfection2}, this, changeQuickRedirect, false, 49011, new Class[]{ProtoReader.class, ProfilePerfection.class}, ProfilePerfection.class)) {
                return (ProfilePerfection) PatchProxy.accessDispatch(new Object[]{protoReader2, profilePerfection2}, this, changeQuickRedirect, false, 49011, new Class[]{ProtoReader.class, ProfilePerfection.class}, ProfilePerfection.class);
            }
            ProfilePerfection profilePerfection3 = (ProfilePerfection) a.a().a(ProfilePerfection.class, profilePerfection2);
            if (profilePerfection3 != null) {
                builder = profilePerfection3.newBuilder();
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
                            builder2.avatar((Float) ProtoAdapter.FLOAT.decode(protoReader2));
                            break;
                        case 2:
                            builder2.nickname((Float) ProtoAdapter.FLOAT.decode(protoReader2));
                            break;
                        case 3:
                            builder2.short_id((Float) ProtoAdapter.FLOAT.decode(protoReader2));
                            break;
                        case 4:
                            builder2.gender((Float) ProtoAdapter.FLOAT.decode(protoReader2));
                            break;
                        case 5:
                            builder2.birthday((Float) ProtoAdapter.FLOAT.decode(protoReader2));
                            break;
                        case 6:
                            builder2.school((Float) ProtoAdapter.FLOAT.decode(protoReader2));
                            break;
                        case e.l:
                            builder2.signature((Float) ProtoAdapter.FLOAT.decode(protoReader2));
                            break;
                        case 8:
                            builder2.location((Float) ProtoAdapter.FLOAT.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (profilePerfection3 != null) {
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
    public final Float getAvatar() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48995, new Class[0], Float.class)) {
            return (Float) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48995, new Class[0], Float.class);
        } else if (this.avatar != null) {
            return this.avatar;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Float getBirthday() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48999, new Class[0], Float.class)) {
            return (Float) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48999, new Class[0], Float.class);
        } else if (this.birthday != null) {
            return this.birthday;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Float getGender() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48998, new Class[0], Float.class)) {
            return (Float) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48998, new Class[0], Float.class);
        } else if (this.gender != null) {
            return this.gender;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Float getLocation() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49002, new Class[0], Float.class)) {
            return (Float) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49002, new Class[0], Float.class);
        } else if (this.location != null) {
            return this.location;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Float getNickname() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48996, new Class[0], Float.class)) {
            return (Float) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48996, new Class[0], Float.class);
        } else if (this.nickname != null) {
            return this.nickname;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Float getSchool() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49000, new Class[0], Float.class)) {
            return (Float) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49000, new Class[0], Float.class);
        } else if (this.school != null) {
            return this.school;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Float getShortId() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 48997, new Class[0], Float.class)) {
            return (Float) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 48997, new Class[0], Float.class);
        } else if (this.short_id != null) {
            return this.short_id;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Float getSignature() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49001, new Class[0], Float.class)) {
            return (Float) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49001, new Class[0], Float.class);
        } else if (this.signature != null) {
            return this.signature;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49003, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49003, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.avatar = this.avatar;
        builder.nickname = this.nickname;
        builder.short_id = this.short_id;
        builder.gender = this.gender;
        builder.birthday = this.birthday;
        builder.school = this.school;
        builder.signature = this.signature;
        builder.location = this.location;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49005, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49005, new Class[0], Integer.TYPE)).intValue();
        }
        int i9 = this.hashCode;
        if (i9 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.avatar != null) {
                i = this.avatar.hashCode();
            } else {
                i = 0;
            }
            int i10 = (hashCode + i) * 37;
            if (this.nickname != null) {
                i2 = this.nickname.hashCode();
            } else {
                i2 = 0;
            }
            int i11 = (i10 + i2) * 37;
            if (this.short_id != null) {
                i3 = this.short_id.hashCode();
            } else {
                i3 = 0;
            }
            int i12 = (i11 + i3) * 37;
            if (this.gender != null) {
                i4 = this.gender.hashCode();
            } else {
                i4 = 0;
            }
            int i13 = (i12 + i4) * 37;
            if (this.birthday != null) {
                i5 = this.birthday.hashCode();
            } else {
                i5 = 0;
            }
            int i14 = (i13 + i5) * 37;
            if (this.school != null) {
                i6 = this.school.hashCode();
            } else {
                i6 = 0;
            }
            int i15 = (i14 + i6) * 37;
            if (this.signature != null) {
                i7 = this.signature.hashCode();
            } else {
                i7 = 0;
            }
            int i16 = (i15 + i7) * 37;
            if (this.location != null) {
                i8 = this.location.hashCode();
            }
            i9 = i16 + i8;
            this.hashCode = i9;
        }
        return i9;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49006, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49006, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.avatar != null) {
            sb.append(", avatar=");
            sb.append(this.avatar);
        }
        if (this.nickname != null) {
            sb.append(", nickname=");
            sb.append(this.nickname);
        }
        if (this.short_id != null) {
            sb.append(", short_id=");
            sb.append(this.short_id);
        }
        if (this.gender != null) {
            sb.append(", gender=");
            sb.append(this.gender);
        }
        if (this.birthday != null) {
            sb.append(", birthday=");
            sb.append(this.birthday);
        }
        if (this.school != null) {
            sb.append(", school=");
            sb.append(this.school);
        }
        if (this.signature != null) {
            sb.append(", signature=");
            sb.append(this.signature);
        }
        if (this.location != null) {
            sb.append(", location=");
            sb.append(this.location);
        }
        StringBuilder replace = sb.replace(0, 2, "ProfilePerfection{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49004, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49004, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof ProfilePerfection)) {
                return false;
            }
            ProfilePerfection profilePerfection = (ProfilePerfection) obj;
            if (!unknownFields().equals(profilePerfection.unknownFields()) || !Internal.equals(this.avatar, profilePerfection.avatar) || !Internal.equals(this.nickname, profilePerfection.nickname) || !Internal.equals(this.short_id, profilePerfection.short_id) || !Internal.equals(this.gender, profilePerfection.gender) || !Internal.equals(this.birthday, profilePerfection.birthday) || !Internal.equals(this.school, profilePerfection.school) || !Internal.equals(this.signature, profilePerfection.signature) || !Internal.equals(this.location, profilePerfection.location)) {
                return false;
            }
            return true;
        }
    }

    public ProfilePerfection(Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Float f9) {
        this(f2, f3, f4, f5, f6, f7, f8, f9, ByteString.EMPTY);
    }

    public ProfilePerfection(Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Float f9, ByteString byteString) {
        super(ADAPTER, byteString);
        this.avatar = f2;
        this.nickname = f3;
        this.short_id = f4;
        this.gender = f5;
        this.birthday = f6;
        this.school = f7;
        this.signature = f8;
        this.location = f9;
    }
}
