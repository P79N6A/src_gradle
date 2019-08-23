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
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class LinkMicArmies extends Message<LinkMicArmies, Builder> {
    public static final ProtoAdapter<LinkMicArmies> ADAPTER = new ProtoAdapter_LinkMicArmies();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.LinkMicArmies$UserArmies#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Map<Long, UserArmies> user_armies_map;

    public static final class UserArmies extends Message<UserArmies, Builder> {
        public static final ProtoAdapter<UserArmies> ADAPTER = new ProtoAdapter_UserArmies();
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.LinkMicArmies$UserArmies$UserArmy#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
        public final List<UserArmy> user_armies;

        public static final class UserArmy extends Message<UserArmy, Builder> {
            public static final ProtoAdapter<UserArmy> ADAPTER = new ProtoAdapter_UserArmy();
            public static final Long DEFAULT_SCORE = 0L;
            public static final Long DEFAULT_USER_ID = 0L;
            public static ChangeQuickRedirect changeQuickRedirect;
            private static final long serialVersionUID = 0;
            @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 4)
            public final Image avatar_thumb;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
            public final String nickname;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
            public final Long score;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
            public final Long user_id;

            public static final class Builder extends Message.Builder<UserArmy, Builder> {
                public static ChangeQuickRedirect changeQuickRedirect;
                public Image avatar_thumb;
                public String nickname;
                public Long score;
                public Long user_id;

                public final UserArmy build() {
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11649, new Class[0], UserArmy.class)) {
                        return (UserArmy) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11649, new Class[0], UserArmy.class);
                    }
                    UserArmy userArmy = new UserArmy(this.user_id, this.score, this.nickname, this.avatar_thumb, super.buildUnknownFields());
                    return userArmy;
                }

                public final Builder avatar_thumb(Image image) {
                    this.avatar_thumb = image;
                    return this;
                }

                public final Builder nickname(String str) {
                    this.nickname = str;
                    return this;
                }

                public final Builder score(Long l) {
                    this.score = l;
                    return this;
                }

                public final Builder user_id(Long l) {
                    this.user_id = l;
                    return this;
                }
            }

            static final class ProtoAdapter_UserArmy extends ProtoAdapter<UserArmy> {
                public static ChangeQuickRedirect changeQuickRedirect;

                ProtoAdapter_UserArmy() {
                    super(FieldEncoding.LENGTH_DELIMITED, UserArmy.class);
                }

                public final UserArmy redact(UserArmy userArmy) {
                    if (PatchProxy.isSupport(new Object[]{userArmy}, this, changeQuickRedirect, false, 11653, new Class[]{UserArmy.class}, UserArmy.class)) {
                        return (UserArmy) PatchProxy.accessDispatch(new Object[]{userArmy}, this, changeQuickRedirect, false, 11653, new Class[]{UserArmy.class}, UserArmy.class);
                    }
                    Builder newBuilder = userArmy.newBuilder();
                    if (newBuilder.avatar_thumb != null) {
                        newBuilder.avatar_thumb = (Image) Image.ADAPTER.redact(newBuilder.avatar_thumb);
                    }
                    newBuilder.clearUnknownFields();
                    return newBuilder.build();
                }

                public final UserArmy decode(ProtoReader protoReader) throws IOException {
                    ProtoReader protoReader2 = protoReader;
                    if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11652, new Class[]{ProtoReader.class}, UserArmy.class)) {
                        return (UserArmy) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11652, new Class[]{ProtoReader.class}, UserArmy.class);
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
                                    builder.score((Long) ProtoAdapter.INT64.decode(protoReader2));
                                    break;
                                case 3:
                                    builder.nickname((String) ProtoAdapter.STRING.decode(protoReader2));
                                    break;
                                case 4:
                                    builder.avatar_thumb((Image) Image.ADAPTER.decode(protoReader2));
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

                public final int encodedSize(UserArmy userArmy) {
                    int i;
                    int i2;
                    int i3;
                    UserArmy userArmy2 = userArmy;
                    int i4 = 0;
                    if (PatchProxy.isSupport(new Object[]{userArmy2}, this, changeQuickRedirect, false, 11650, new Class[]{UserArmy.class}, Integer.TYPE)) {
                        return ((Integer) PatchProxy.accessDispatch(new Object[]{userArmy2}, this, changeQuickRedirect, false, 11650, new Class[]{UserArmy.class}, Integer.TYPE)).intValue();
                    }
                    if (userArmy2.user_id != null) {
                        i = ProtoAdapter.INT64.encodedSizeWithTag(1, userArmy2.user_id);
                    } else {
                        i = 0;
                    }
                    if (userArmy2.score != null) {
                        i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, userArmy2.score);
                    } else {
                        i2 = 0;
                    }
                    int i5 = i + i2;
                    if (userArmy2.nickname != null) {
                        i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, userArmy2.nickname);
                    } else {
                        i3 = 0;
                    }
                    int i6 = i5 + i3;
                    if (userArmy2.avatar_thumb != null) {
                        i4 = Image.ADAPTER.encodedSizeWithTag(4, userArmy2.avatar_thumb);
                    }
                    return i6 + i4 + userArmy.unknownFields().size();
                }

                public final void encode(ProtoWriter protoWriter, UserArmy userArmy) throws IOException {
                    ProtoWriter protoWriter2 = protoWriter;
                    UserArmy userArmy2 = userArmy;
                    if (PatchProxy.isSupport(new Object[]{protoWriter2, userArmy2}, this, changeQuickRedirect, false, 11651, new Class[]{ProtoWriter.class, UserArmy.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{protoWriter2, userArmy2}, this, changeQuickRedirect, false, 11651, new Class[]{ProtoWriter.class, UserArmy.class}, Void.TYPE);
                        return;
                    }
                    if (userArmy2.user_id != null) {
                        ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, userArmy2.user_id);
                    }
                    if (userArmy2.score != null) {
                        ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, userArmy2.score);
                    }
                    if (userArmy2.nickname != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, userArmy2.nickname);
                    }
                    if (userArmy2.avatar_thumb != null) {
                        Image.ADAPTER.encodeWithTag(protoWriter2, 4, userArmy2.avatar_thumb);
                    }
                    protoWriter2.writeBytes(userArmy.unknownFields());
                }
            }

            public final int hashCode() {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11647, new Class[0], Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11647, new Class[0], Integer.TYPE)).intValue();
                }
                int i5 = this.hashCode;
                if (i5 == 0) {
                    int hashCode = unknownFields().hashCode() * 37;
                    if (this.user_id != null) {
                        i = this.user_id.hashCode();
                    } else {
                        i = 0;
                    }
                    int i6 = (hashCode + i) * 37;
                    if (this.score != null) {
                        i2 = this.score.hashCode();
                    } else {
                        i2 = 0;
                    }
                    int i7 = (i6 + i2) * 37;
                    if (this.nickname != null) {
                        i3 = this.nickname.hashCode();
                    } else {
                        i3 = 0;
                    }
                    int i8 = (i7 + i3) * 37;
                    if (this.avatar_thumb != null) {
                        i4 = this.avatar_thumb.hashCode();
                    }
                    i5 = i8 + i4;
                    this.hashCode = i5;
                }
                return i5;
            }

            public final Builder newBuilder() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11645, new Class[0], Builder.class)) {
                    return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11645, new Class[0], Builder.class);
                }
                Builder builder = new Builder();
                builder.user_id = this.user_id;
                builder.score = this.score;
                builder.nickname = this.nickname;
                builder.avatar_thumb = this.avatar_thumb;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11648, new Class[0], String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11648, new Class[0], String.class);
                }
                StringBuilder sb = new StringBuilder();
                if (this.user_id != null) {
                    sb.append(", user_id=");
                    sb.append(this.user_id);
                }
                if (this.score != null) {
                    sb.append(", score=");
                    sb.append(this.score);
                }
                if (this.nickname != null) {
                    sb.append(", nickname=");
                    sb.append(this.nickname);
                }
                if (this.avatar_thumb != null) {
                    sb.append(", avatar_thumb=");
                    sb.append(this.avatar_thumb);
                }
                StringBuilder replace = sb.replace(0, 2, "UserArmy{");
                replace.append('}');
                return replace.toString();
            }

            public final boolean equals(Object obj) {
                if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11646, new Class[]{Object.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11646, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
                } else if (obj == this) {
                    return true;
                } else {
                    if (!(obj instanceof UserArmy)) {
                        return false;
                    }
                    UserArmy userArmy = (UserArmy) obj;
                    if (!unknownFields().equals(userArmy.unknownFields()) || !Internal.equals(this.user_id, userArmy.user_id) || !Internal.equals(this.score, userArmy.score) || !Internal.equals(this.nickname, userArmy.nickname) || !Internal.equals(this.avatar_thumb, userArmy.avatar_thumb)) {
                        return false;
                    }
                    return true;
                }
            }

            public UserArmy(Long l, Long l2, String str, Image image) {
                this(l, l2, str, image, ByteString.EMPTY);
            }

            public UserArmy(Long l, Long l2, String str, Image image, ByteString byteString) {
                super(ADAPTER, byteString);
                this.user_id = l;
                this.score = l2;
                this.nickname = str;
                this.avatar_thumb = image;
            }
        }

        public static final class Builder extends Message.Builder<UserArmies, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public List<UserArmy> user_armies = Internal.newMutableList();

            public final UserArmies build() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11640, new Class[0], UserArmies.class)) {
                    return new UserArmies(this.user_armies, super.buildUnknownFields());
                }
                return (UserArmies) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11640, new Class[0], UserArmies.class);
            }

            public final Builder user_armies(List<UserArmy> list) {
                if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 11639, new Class[]{List.class}, Builder.class)) {
                    return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 11639, new Class[]{List.class}, Builder.class);
                }
                Internal.checkElementsNotNull(list);
                this.user_armies = list;
                return this;
            }
        }

        static final class ProtoAdapter_UserArmies extends ProtoAdapter<UserArmies> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_UserArmies() {
                super(FieldEncoding.LENGTH_DELIMITED, UserArmies.class);
            }

            public final UserArmies decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11643, new Class[]{ProtoReader.class}, UserArmies.class)) {
                    return (UserArmies) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11643, new Class[]{ProtoReader.class}, UserArmies.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader2.endMessage(beginMessage);
                        return builder.build();
                    } else if (nextTag != 1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                    } else {
                        builder.user_armies.add(UserArmy.ADAPTER.decode(protoReader2));
                    }
                }
            }

            public final int encodedSize(UserArmies userArmies) {
                UserArmies userArmies2 = userArmies;
                if (!PatchProxy.isSupport(new Object[]{userArmies2}, this, changeQuickRedirect, false, 11641, new Class[]{UserArmies.class}, Integer.TYPE)) {
                    return UserArmy.ADAPTER.asRepeated().encodedSizeWithTag(1, userArmies2.user_armies) + userArmies.unknownFields().size();
                }
                return ((Integer) PatchProxy.accessDispatch(new Object[]{userArmies2}, this, changeQuickRedirect, false, 11641, new Class[]{UserArmies.class}, Integer.TYPE)).intValue();
            }

            public final UserArmies redact(UserArmies userArmies) {
                if (PatchProxy.isSupport(new Object[]{userArmies}, this, changeQuickRedirect, false, 11644, new Class[]{UserArmies.class}, UserArmies.class)) {
                    return (UserArmies) PatchProxy.accessDispatch(new Object[]{userArmies}, this, changeQuickRedirect, false, 11644, new Class[]{UserArmies.class}, UserArmies.class);
                }
                Builder newBuilder = userArmies.newBuilder();
                Internal.redactElements(newBuilder.user_armies, UserArmy.ADAPTER);
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final void encode(ProtoWriter protoWriter, UserArmies userArmies) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                UserArmies userArmies2 = userArmies;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, userArmies2}, this, changeQuickRedirect, false, 11642, new Class[]{ProtoWriter.class, UserArmies.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, userArmies2}, this, changeQuickRedirect, false, 11642, new Class[]{ProtoWriter.class, UserArmies.class}, Void.TYPE);
                    return;
                }
                UserArmy.ADAPTER.asRepeated().encodeWithTag(protoWriter2, 1, userArmies2.user_armies);
                protoWriter2.writeBytes(userArmies.unknownFields());
            }
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11635, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11635, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.user_armies = Internal.copyOf("user_armies", this.user_armies);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final int hashCode() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11637, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11637, new Class[0], Integer.TYPE)).intValue();
            }
            int i = this.hashCode;
            if (i == 0) {
                i = (unknownFields().hashCode() * 37) + this.user_armies.hashCode();
                this.hashCode = i;
            }
            return i;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11638, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11638, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (!this.user_armies.isEmpty()) {
                sb.append(", user_armies=");
                sb.append(this.user_armies);
            }
            StringBuilder replace = sb.replace(0, 2, "UserArmies{");
            replace.append('}');
            return replace.toString();
        }

        public UserArmies(List<UserArmy> list) {
            this(list, ByteString.EMPTY);
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11636, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11636, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof UserArmies)) {
                    return false;
                }
                UserArmies userArmies = (UserArmies) obj;
                if (!unknownFields().equals(userArmies.unknownFields()) || !this.user_armies.equals(userArmies.user_armies)) {
                    return false;
                }
                return true;
            }
        }

        public UserArmies(List<UserArmy> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.user_armies = Internal.immutableCopyOf("user_armies", list);
        }
    }

    public static final class Builder extends Message.Builder<LinkMicArmies, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public Map<Long, UserArmies> user_armies_map = Internal.newMutableMap();

        public final LinkMicArmies build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11630, new Class[0], LinkMicArmies.class)) {
                return new LinkMicArmies(this.common, this.user_armies_map, super.buildUnknownFields());
            }
            return (LinkMicArmies) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11630, new Class[0], LinkMicArmies.class);
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder user_armies_map(Map<Long, UserArmies> map) {
            if (PatchProxy.isSupport(new Object[]{map}, this, changeQuickRedirect, false, 11629, new Class[]{Map.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{map}, this, changeQuickRedirect, false, 11629, new Class[]{Map.class}, Builder.class);
            }
            Internal.checkElementsNotNull(map);
            this.user_armies_map = map;
            return this;
        }
    }

    static final class ProtoAdapter_LinkMicArmies extends ProtoAdapter<LinkMicArmies> {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final ProtoAdapter<Map<Long, UserArmies>> user_armies_map = ProtoAdapter.newMapAdapter(ProtoAdapter.INT64, UserArmies.ADAPTER);

        ProtoAdapter_LinkMicArmies() {
            super(FieldEncoding.LENGTH_DELIMITED, LinkMicArmies.class);
        }

        public final int encodedSize(LinkMicArmies linkMicArmies) {
            LinkMicArmies linkMicArmies2 = linkMicArmies;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{linkMicArmies2}, this, changeQuickRedirect, false, 11631, new Class[]{LinkMicArmies.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{linkMicArmies2}, this, changeQuickRedirect, false, 11631, new Class[]{LinkMicArmies.class}, Integer.TYPE)).intValue();
            }
            if (linkMicArmies2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, linkMicArmies2.common);
            }
            return i + this.user_armies_map.encodedSizeWithTag(2, linkMicArmies2.user_armies_map) + linkMicArmies.unknownFields().size();
        }

        public final LinkMicArmies redact(LinkMicArmies linkMicArmies) {
            if (PatchProxy.isSupport(new Object[]{linkMicArmies}, this, changeQuickRedirect, false, 11634, new Class[]{LinkMicArmies.class}, LinkMicArmies.class)) {
                return (LinkMicArmies) PatchProxy.accessDispatch(new Object[]{linkMicArmies}, this, changeQuickRedirect, false, 11634, new Class[]{LinkMicArmies.class}, LinkMicArmies.class);
            }
            Builder newBuilder = linkMicArmies.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            Internal.redactElements(newBuilder.user_armies_map, UserArmies.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final LinkMicArmies decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11633, new Class[]{ProtoReader.class}, LinkMicArmies.class)) {
                return (LinkMicArmies) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11633, new Class[]{ProtoReader.class}, LinkMicArmies.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.common((Common) Common.ADAPTER.decode(protoReader2));
                            break;
                        case 2:
                            builder.user_armies_map.putAll((Map) this.user_armies_map.decode(protoReader2));
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

        public final void encode(ProtoWriter protoWriter, LinkMicArmies linkMicArmies) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            LinkMicArmies linkMicArmies2 = linkMicArmies;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, linkMicArmies2}, this, changeQuickRedirect, false, 11632, new Class[]{ProtoWriter.class, LinkMicArmies.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, linkMicArmies2}, this, changeQuickRedirect, false, 11632, new Class[]{ProtoWriter.class, LinkMicArmies.class}, Void.TYPE);
                return;
            }
            if (linkMicArmies2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, linkMicArmies2.common);
            }
            this.user_armies_map.encodeWithTag(protoWriter2, 2, linkMicArmies2.user_armies_map);
            protoWriter2.writeBytes(linkMicArmies.unknownFields());
        }
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11627, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11627, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            }
            i2 = ((hashCode + i) * 37) + this.user_armies_map.hashCode();
            this.hashCode = i2;
        }
        return i2;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11625, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11625, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.user_armies_map = Internal.copyOf("user_armies_map", this.user_armies_map);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11628, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11628, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (!this.user_armies_map.isEmpty()) {
            sb.append(", user_armies_map=");
            sb.append(this.user_armies_map);
        }
        StringBuilder replace = sb.replace(0, 2, "LinkMicArmies{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11626, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11626, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof LinkMicArmies)) {
                return false;
            }
            LinkMicArmies linkMicArmies = (LinkMicArmies) obj;
            if (!unknownFields().equals(linkMicArmies.unknownFields()) || !Internal.equals(this.common, linkMicArmies.common) || !this.user_armies_map.equals(linkMicArmies.user_armies_map)) {
                return false;
            }
            return true;
        }
    }

    public LinkMicArmies(Common common2, Map<Long, UserArmies> map) {
        this(common2, map, ByteString.EMPTY);
    }

    public LinkMicArmies(Common common2, Map<Long, UserArmies> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.user_armies_map = Internal.immutableCopyOf("user_armies_map", map);
    }
}
