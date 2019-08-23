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
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.io.IOException;
import okio.ByteString;

public final class MemberMessage extends Message<MemberMessage, Builder> {
    public static final ProtoAdapter<MemberMessage> ADAPTER = new ProtoAdapter_MemberMessage();
    public static final Long DEFAULT_ACTION = 0L;
    public static final Long DEFAULT_ENTER_TYPE = 0L;
    public static final Boolean DEFAULT_IS_SET_TO_ADMIN = Boolean.FALSE;
    public static final Boolean DEFAULT_IS_TOP_USER = Boolean.FALSE;
    public static final Long DEFAULT_MEMBER_COUNT = 0L;
    public static final Long DEFAULT_RANK_SCORE = 0L;
    public static final Long DEFAULT_TOP_USER_NO = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 10)
    public final Long action;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 11)
    public final String action_description;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.MemberMessage$EffectConfig#ADAPTER", tag = 13)
    public final EffectConfig effect_config;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 9)
    public final Long enter_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 5)
    public final Boolean is_set_to_admin;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 6)
    public final Boolean is_top_user;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long member_count;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 4)
    public final User operator;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 14)
    public final String pop_str;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 7)
    public final Long rank_score;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 8)
    public final Long top_user_no;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", tag = 2)
    public final User user;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 12)
    public final Long user_id;

    public static final class EffectConfig extends Message<EffectConfig, Builder> {
        public static final ProtoAdapter<EffectConfig> ADAPTER = new ProtoAdapter_EffectConfig();
        public static final Long DEFAULT_AVATAR_POS = 0L;
        public static final Integer DEFAULT_STAY_TIME = 0;
        public static final Long DEFAULT_TYPE = 0L;
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
        public final Long avatar_pos;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 2)
        public final Image icon;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
        public final Integer stay_time;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Text#ADAPTER", tag = 4)
        public final Text text;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 5)
        public final Image text_icon;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
        public final Long type;

        public static final class Builder extends Message.Builder<EffectConfig, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public Long avatar_pos;
            public Image icon;
            public Integer stay_time;
            public Text text;
            public Image text_icon;
            public Long type;

            public final EffectConfig build() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11895, new Class[0], EffectConfig.class)) {
                    return (EffectConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11895, new Class[0], EffectConfig.class);
                }
                EffectConfig effectConfig = new EffectConfig(this.type, this.icon, this.avatar_pos, this.text, this.text_icon, this.stay_time, super.buildUnknownFields());
                return effectConfig;
            }

            public final Builder avatar_pos(Long l) {
                this.avatar_pos = l;
                return this;
            }

            public final Builder icon(Image image) {
                this.icon = image;
                return this;
            }

            public final Builder stay_time(Integer num) {
                this.stay_time = num;
                return this;
            }

            public final Builder text(Text text2) {
                this.text = text2;
                return this;
            }

            public final Builder text_icon(Image image) {
                this.text_icon = image;
                return this;
            }

            public final Builder type(Long l) {
                this.type = l;
                return this;
            }
        }

        static final class ProtoAdapter_EffectConfig extends ProtoAdapter<EffectConfig> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_EffectConfig() {
                super(FieldEncoding.LENGTH_DELIMITED, EffectConfig.class);
            }

            public final EffectConfig redact(EffectConfig effectConfig) {
                if (PatchProxy.isSupport(new Object[]{effectConfig}, this, changeQuickRedirect, false, 11899, new Class[]{EffectConfig.class}, EffectConfig.class)) {
                    return (EffectConfig) PatchProxy.accessDispatch(new Object[]{effectConfig}, this, changeQuickRedirect, false, 11899, new Class[]{EffectConfig.class}, EffectConfig.class);
                }
                Builder newBuilder = effectConfig.newBuilder();
                if (newBuilder.icon != null) {
                    newBuilder.icon = (Image) Image.ADAPTER.redact(newBuilder.icon);
                }
                if (newBuilder.text != null) {
                    newBuilder.text = (Text) Text.ADAPTER.redact(newBuilder.text);
                }
                if (newBuilder.text_icon != null) {
                    newBuilder.text_icon = (Image) Image.ADAPTER.redact(newBuilder.text_icon);
                }
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final EffectConfig decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11898, new Class[]{ProtoReader.class}, EffectConfig.class)) {
                    return (EffectConfig) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11898, new Class[]{ProtoReader.class}, EffectConfig.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.type((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 2:
                                builder.icon((Image) Image.ADAPTER.decode(protoReader2));
                                break;
                            case 3:
                                builder.avatar_pos((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 4:
                                builder.text((Text) Text.ADAPTER.decode(protoReader2));
                                break;
                            case 5:
                                builder.text_icon((Image) Image.ADAPTER.decode(protoReader2));
                                break;
                            case 6:
                                builder.stay_time((Integer) ProtoAdapter.INT32.decode(protoReader2));
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

            public final int encodedSize(EffectConfig effectConfig) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                EffectConfig effectConfig2 = effectConfig;
                int i6 = 0;
                if (PatchProxy.isSupport(new Object[]{effectConfig2}, this, changeQuickRedirect, false, 11896, new Class[]{EffectConfig.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{effectConfig2}, this, changeQuickRedirect, false, 11896, new Class[]{EffectConfig.class}, Integer.TYPE)).intValue();
                }
                if (effectConfig2.type != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, effectConfig2.type);
                } else {
                    i = 0;
                }
                if (effectConfig2.icon != null) {
                    i2 = Image.ADAPTER.encodedSizeWithTag(2, effectConfig2.icon);
                } else {
                    i2 = 0;
                }
                int i7 = i + i2;
                if (effectConfig2.avatar_pos != null) {
                    i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, effectConfig2.avatar_pos);
                } else {
                    i3 = 0;
                }
                int i8 = i7 + i3;
                if (effectConfig2.text != null) {
                    i4 = Text.ADAPTER.encodedSizeWithTag(4, effectConfig2.text);
                } else {
                    i4 = 0;
                }
                int i9 = i8 + i4;
                if (effectConfig2.text_icon != null) {
                    i5 = Image.ADAPTER.encodedSizeWithTag(5, effectConfig2.text_icon);
                } else {
                    i5 = 0;
                }
                int i10 = i9 + i5;
                if (effectConfig2.stay_time != null) {
                    i6 = ProtoAdapter.INT32.encodedSizeWithTag(6, effectConfig2.stay_time);
                }
                return i10 + i6 + effectConfig.unknownFields().size();
            }

            public final void encode(ProtoWriter protoWriter, EffectConfig effectConfig) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                EffectConfig effectConfig2 = effectConfig;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, effectConfig2}, this, changeQuickRedirect, false, 11897, new Class[]{ProtoWriter.class, EffectConfig.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, effectConfig2}, this, changeQuickRedirect, false, 11897, new Class[]{ProtoWriter.class, EffectConfig.class}, Void.TYPE);
                    return;
                }
                if (effectConfig2.type != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, effectConfig2.type);
                }
                if (effectConfig2.icon != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter2, 2, effectConfig2.icon);
                }
                if (effectConfig2.avatar_pos != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, effectConfig2.avatar_pos);
                }
                if (effectConfig2.text != null) {
                    Text.ADAPTER.encodeWithTag(protoWriter2, 4, effectConfig2.text);
                }
                if (effectConfig2.text_icon != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter2, 5, effectConfig2.text_icon);
                }
                if (effectConfig2.stay_time != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter2, 6, effectConfig2.stay_time);
                }
                protoWriter2.writeBytes(effectConfig.unknownFields());
            }
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11891, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11891, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.type = this.type;
            builder.icon = this.icon;
            builder.avatar_pos = this.avatar_pos;
            builder.text = this.text;
            builder.text_icon = this.text_icon;
            builder.stay_time = this.stay_time;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11893, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11893, new Class[0], Integer.TYPE)).intValue();
            }
            int i7 = this.hashCode;
            if (i7 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.type != null) {
                    i = this.type.hashCode();
                } else {
                    i = 0;
                }
                int i8 = (hashCode + i) * 37;
                if (this.icon != null) {
                    i2 = this.icon.hashCode();
                } else {
                    i2 = 0;
                }
                int i9 = (i8 + i2) * 37;
                if (this.avatar_pos != null) {
                    i3 = this.avatar_pos.hashCode();
                } else {
                    i3 = 0;
                }
                int i10 = (i9 + i3) * 37;
                if (this.text != null) {
                    i4 = this.text.hashCode();
                } else {
                    i4 = 0;
                }
                int i11 = (i10 + i4) * 37;
                if (this.text_icon != null) {
                    i5 = this.text_icon.hashCode();
                } else {
                    i5 = 0;
                }
                int i12 = (i11 + i5) * 37;
                if (this.stay_time != null) {
                    i6 = this.stay_time.hashCode();
                }
                i7 = i12 + i6;
                this.hashCode = i7;
            }
            return i7;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11894, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11894, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.type != null) {
                sb.append(", type=");
                sb.append(this.type);
            }
            if (this.icon != null) {
                sb.append(", icon=");
                sb.append(this.icon);
            }
            if (this.avatar_pos != null) {
                sb.append(", avatar_pos=");
                sb.append(this.avatar_pos);
            }
            if (this.text != null) {
                sb.append(", text=");
                sb.append(this.text);
            }
            if (this.text_icon != null) {
                sb.append(", text_icon=");
                sb.append(this.text_icon);
            }
            if (this.stay_time != null) {
                sb.append(", stay_time=");
                sb.append(this.stay_time);
            }
            StringBuilder replace = sb.replace(0, 2, "EffectConfig{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11892, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11892, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof EffectConfig)) {
                    return false;
                }
                EffectConfig effectConfig = (EffectConfig) obj;
                if (!unknownFields().equals(effectConfig.unknownFields()) || !Internal.equals(this.type, effectConfig.type) || !Internal.equals(this.icon, effectConfig.icon) || !Internal.equals(this.avatar_pos, effectConfig.avatar_pos) || !Internal.equals(this.text, effectConfig.text) || !Internal.equals(this.text_icon, effectConfig.text_icon) || !Internal.equals(this.stay_time, effectConfig.stay_time)) {
                    return false;
                }
                return true;
            }
        }

        public EffectConfig(Long l, Image image, Long l2, Text text2, Image image2, Integer num) {
            this(l, image, l2, text2, image2, num, ByteString.EMPTY);
        }

        public EffectConfig(Long l, Image image, Long l2, Text text2, Image image2, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = l;
            this.icon = image;
            this.avatar_pos = l2;
            this.text = text2;
            this.text_icon = image2;
            this.stay_time = num;
        }
    }

    public static final class Builder extends Message.Builder<MemberMessage, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Long action;
        public String action_description;
        public Common common;
        public EffectConfig effect_config;
        public Long enter_type;
        public Boolean is_set_to_admin;
        public Boolean is_top_user;
        public Long member_count;
        public User operator;
        public String pop_str;
        public Long rank_score;
        public Long top_user_no;
        public User user;
        public Long user_id;

        public final MemberMessage build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11890, new Class[0], MemberMessage.class)) {
                return (MemberMessage) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11890, new Class[0], MemberMessage.class);
            }
            Common common2 = this.common;
            User user2 = this.user;
            Long l = this.member_count;
            User user3 = this.operator;
            Boolean bool = this.is_set_to_admin;
            Boolean bool2 = this.is_top_user;
            Long l2 = this.rank_score;
            Long l3 = this.top_user_no;
            Long l4 = this.enter_type;
            Long l5 = this.action;
            String str = this.action_description;
            Long l6 = this.user_id;
            EffectConfig effectConfig = this.effect_config;
            Long l7 = l3;
            Long l8 = l4;
            Long l9 = l5;
            String str2 = str;
            Long l10 = l6;
            EffectConfig effectConfig2 = effectConfig;
            MemberMessage memberMessage = new MemberMessage(common2, user2, l, user3, bool, bool2, l2, l7, l8, l9, str2, l10, effectConfig2, this.pop_str, super.buildUnknownFields());
            return memberMessage;
        }

        public final Builder action(Long l) {
            this.action = l;
            return this;
        }

        public final Builder action_description(String str) {
            this.action_description = str;
            return this;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder effect_config(EffectConfig effectConfig) {
            this.effect_config = effectConfig;
            return this;
        }

        public final Builder enter_type(Long l) {
            this.enter_type = l;
            return this;
        }

        public final Builder is_set_to_admin(Boolean bool) {
            this.is_set_to_admin = bool;
            return this;
        }

        public final Builder is_top_user(Boolean bool) {
            this.is_top_user = bool;
            return this;
        }

        public final Builder member_count(Long l) {
            this.member_count = l;
            return this;
        }

        public final Builder operator(User user2) {
            this.operator = user2;
            return this;
        }

        public final Builder pop_str(String str) {
            this.pop_str = str;
            return this;
        }

        public final Builder rank_score(Long l) {
            this.rank_score = l;
            return this;
        }

        public final Builder top_user_no(Long l) {
            this.top_user_no = l;
            return this;
        }

        public final Builder user(User user2) {
            this.user = user2;
            return this;
        }

        public final Builder user_id(Long l) {
            this.user_id = l;
            return this;
        }
    }

    static final class ProtoAdapter_MemberMessage extends ProtoAdapter<MemberMessage> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_MemberMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, MemberMessage.class);
        }

        public final MemberMessage redact(MemberMessage memberMessage) {
            if (PatchProxy.isSupport(new Object[]{memberMessage}, this, changeQuickRedirect, false, 11903, new Class[]{MemberMessage.class}, MemberMessage.class)) {
                return (MemberMessage) PatchProxy.accessDispatch(new Object[]{memberMessage}, this, changeQuickRedirect, false, 11903, new Class[]{MemberMessage.class}, MemberMessage.class);
            }
            Builder newBuilder = memberMessage.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.user != null) {
                newBuilder.user = (User) User.ADAPTER.redact(newBuilder.user);
            }
            if (newBuilder.operator != null) {
                newBuilder.operator = (User) User.ADAPTER.redact(newBuilder.operator);
            }
            if (newBuilder.effect_config != null) {
                newBuilder.effect_config = (EffectConfig) EffectConfig.ADAPTER.redact(newBuilder.effect_config);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final MemberMessage decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11902, new Class[]{ProtoReader.class}, MemberMessage.class)) {
                return (MemberMessage) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11902, new Class[]{ProtoReader.class}, MemberMessage.class);
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
                            builder.user((User) User.ADAPTER.decode(protoReader2));
                            break;
                        case 3:
                            builder.member_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 4:
                            builder.operator((User) User.ADAPTER.decode(protoReader2));
                            break;
                        case 5:
                            builder.is_set_to_admin((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 6:
                            builder.is_top_user((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case e.l /*7*/:
                            builder.rank_score((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 8:
                            builder.top_user_no((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 9:
                            builder.enter_type((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 10:
                            builder.action((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 11:
                            builder.action_description((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                            builder.user_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 13:
                            builder.effect_config((EffectConfig) EffectConfig.ADAPTER.decode(protoReader2));
                            break;
                        case 14:
                            builder.pop_str((String) ProtoAdapter.STRING.decode(protoReader2));
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

        public final int encodedSize(MemberMessage memberMessage) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            MemberMessage memberMessage2 = memberMessage;
            int i14 = 0;
            if (PatchProxy.isSupport(new Object[]{memberMessage2}, this, changeQuickRedirect, false, 11900, new Class[]{MemberMessage.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{memberMessage2}, this, changeQuickRedirect, false, 11900, new Class[]{MemberMessage.class}, Integer.TYPE)).intValue();
            }
            if (memberMessage2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, memberMessage2.common);
            } else {
                i = 0;
            }
            if (memberMessage2.user != null) {
                i2 = User.ADAPTER.encodedSizeWithTag(2, memberMessage2.user);
            } else {
                i2 = 0;
            }
            int i15 = i + i2;
            if (memberMessage2.member_count != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, memberMessage2.member_count);
            } else {
                i3 = 0;
            }
            int i16 = i15 + i3;
            if (memberMessage2.operator != null) {
                i4 = User.ADAPTER.encodedSizeWithTag(4, memberMessage2.operator);
            } else {
                i4 = 0;
            }
            int i17 = i16 + i4;
            if (memberMessage2.is_set_to_admin != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, memberMessage2.is_set_to_admin);
            } else {
                i5 = 0;
            }
            int i18 = i17 + i5;
            if (memberMessage2.is_top_user != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, memberMessage2.is_top_user);
            } else {
                i6 = 0;
            }
            int i19 = i18 + i6;
            if (memberMessage2.rank_score != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, memberMessage2.rank_score);
            } else {
                i7 = 0;
            }
            int i20 = i19 + i7;
            if (memberMessage2.top_user_no != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(8, memberMessage2.top_user_no);
            } else {
                i8 = 0;
            }
            int i21 = i20 + i8;
            if (memberMessage2.enter_type != null) {
                i9 = ProtoAdapter.INT64.encodedSizeWithTag(9, memberMessage2.enter_type);
            } else {
                i9 = 0;
            }
            int i22 = i21 + i9;
            if (memberMessage2.action != null) {
                i10 = ProtoAdapter.INT64.encodedSizeWithTag(10, memberMessage2.action);
            } else {
                i10 = 0;
            }
            int i23 = i22 + i10;
            if (memberMessage2.action_description != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(11, memberMessage2.action_description);
            } else {
                i11 = 0;
            }
            int i24 = i23 + i11;
            if (memberMessage2.user_id != null) {
                i12 = ProtoAdapter.INT64.encodedSizeWithTag(12, memberMessage2.user_id);
            } else {
                i12 = 0;
            }
            int i25 = i24 + i12;
            if (memberMessage2.effect_config != null) {
                i13 = EffectConfig.ADAPTER.encodedSizeWithTag(13, memberMessage2.effect_config);
            } else {
                i13 = 0;
            }
            int i26 = i25 + i13;
            if (memberMessage2.pop_str != null) {
                i14 = ProtoAdapter.STRING.encodedSizeWithTag(14, memberMessage2.pop_str);
            }
            return i26 + i14 + memberMessage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, MemberMessage memberMessage) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            MemberMessage memberMessage2 = memberMessage;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, memberMessage2}, this, changeQuickRedirect, false, 11901, new Class[]{ProtoWriter.class, MemberMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, memberMessage2}, this, changeQuickRedirect, false, 11901, new Class[]{ProtoWriter.class, MemberMessage.class}, Void.TYPE);
                return;
            }
            if (memberMessage2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, memberMessage2.common);
            }
            if (memberMessage2.user != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 2, memberMessage2.user);
            }
            if (memberMessage2.member_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, memberMessage2.member_count);
            }
            if (memberMessage2.operator != null) {
                User.ADAPTER.encodeWithTag(protoWriter2, 4, memberMessage2.operator);
            }
            if (memberMessage2.is_set_to_admin != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 5, memberMessage2.is_set_to_admin);
            }
            if (memberMessage2.is_top_user != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 6, memberMessage2.is_top_user);
            }
            if (memberMessage2.rank_score != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 7, memberMessage2.rank_score);
            }
            if (memberMessage2.top_user_no != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 8, memberMessage2.top_user_no);
            }
            if (memberMessage2.enter_type != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 9, memberMessage2.enter_type);
            }
            if (memberMessage2.action != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 10, memberMessage2.action);
            }
            if (memberMessage2.action_description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 11, memberMessage2.action_description);
            }
            if (memberMessage2.user_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 12, memberMessage2.user_id);
            }
            if (memberMessage2.effect_config != null) {
                EffectConfig.ADAPTER.encodeWithTag(protoWriter2, 13, memberMessage2.effect_config);
            }
            if (memberMessage2.pop_str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 14, memberMessage2.pop_str);
            }
            protoWriter2.writeBytes(memberMessage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11886, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11886, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.user = this.user;
        builder.member_count = this.member_count;
        builder.operator = this.operator;
        builder.is_set_to_admin = this.is_set_to_admin;
        builder.is_top_user = this.is_top_user;
        builder.rank_score = this.rank_score;
        builder.top_user_no = this.top_user_no;
        builder.enter_type = this.enter_type;
        builder.action = this.action;
        builder.action_description = this.action_description;
        builder.user_id = this.user_id;
        builder.effect_config = this.effect_config;
        builder.pop_str = this.pop_str;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11889, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11889, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        if (this.member_count != null) {
            sb.append(", member_count=");
            sb.append(this.member_count);
        }
        if (this.operator != null) {
            sb.append(", operator=");
            sb.append(this.operator);
        }
        if (this.is_set_to_admin != null) {
            sb.append(", is_set_to_admin=");
            sb.append(this.is_set_to_admin);
        }
        if (this.is_top_user != null) {
            sb.append(", is_top_user=");
            sb.append(this.is_top_user);
        }
        if (this.rank_score != null) {
            sb.append(", rank_score=");
            sb.append(this.rank_score);
        }
        if (this.top_user_no != null) {
            sb.append(", top_user_no=");
            sb.append(this.top_user_no);
        }
        if (this.enter_type != null) {
            sb.append(", enter_type=");
            sb.append(this.enter_type);
        }
        if (this.action != null) {
            sb.append(", action=");
            sb.append(this.action);
        }
        if (this.action_description != null) {
            sb.append(", action_description=");
            sb.append(this.action_description);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.effect_config != null) {
            sb.append(", effect_config=");
            sb.append(this.effect_config);
        }
        if (this.pop_str != null) {
            sb.append(", pop_str=");
            sb.append(this.pop_str);
        }
        StringBuilder replace = sb.replace(0, 2, "MemberMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11888, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11888, new Class[0], Integer.TYPE)).intValue();
        }
        int i15 = this.hashCode;
        if (i15 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i16 = (hashCode + i) * 37;
            if (this.user != null) {
                i2 = this.user.hashCode();
            } else {
                i2 = 0;
            }
            int i17 = (i16 + i2) * 37;
            if (this.member_count != null) {
                i3 = this.member_count.hashCode();
            } else {
                i3 = 0;
            }
            int i18 = (i17 + i3) * 37;
            if (this.operator != null) {
                i4 = this.operator.hashCode();
            } else {
                i4 = 0;
            }
            int i19 = (i18 + i4) * 37;
            if (this.is_set_to_admin != null) {
                i5 = this.is_set_to_admin.hashCode();
            } else {
                i5 = 0;
            }
            int i20 = (i19 + i5) * 37;
            if (this.is_top_user != null) {
                i6 = this.is_top_user.hashCode();
            } else {
                i6 = 0;
            }
            int i21 = (i20 + i6) * 37;
            if (this.rank_score != null) {
                i7 = this.rank_score.hashCode();
            } else {
                i7 = 0;
            }
            int i22 = (i21 + i7) * 37;
            if (this.top_user_no != null) {
                i8 = this.top_user_no.hashCode();
            } else {
                i8 = 0;
            }
            int i23 = (i22 + i8) * 37;
            if (this.enter_type != null) {
                i9 = this.enter_type.hashCode();
            } else {
                i9 = 0;
            }
            int i24 = (i23 + i9) * 37;
            if (this.action != null) {
                i10 = this.action.hashCode();
            } else {
                i10 = 0;
            }
            int i25 = (i24 + i10) * 37;
            if (this.action_description != null) {
                i11 = this.action_description.hashCode();
            } else {
                i11 = 0;
            }
            int i26 = (i25 + i11) * 37;
            if (this.user_id != null) {
                i12 = this.user_id.hashCode();
            } else {
                i12 = 0;
            }
            int i27 = (i26 + i12) * 37;
            if (this.effect_config != null) {
                i13 = this.effect_config.hashCode();
            } else {
                i13 = 0;
            }
            int i28 = (i27 + i13) * 37;
            if (this.pop_str != null) {
                i14 = this.pop_str.hashCode();
            }
            i15 = i28 + i14;
            this.hashCode = i15;
        }
        return i15;
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11887, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11887, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof MemberMessage)) {
                return false;
            }
            MemberMessage memberMessage = (MemberMessage) obj;
            if (!unknownFields().equals(memberMessage.unknownFields()) || !Internal.equals(this.common, memberMessage.common) || !Internal.equals(this.user, memberMessage.user) || !Internal.equals(this.member_count, memberMessage.member_count) || !Internal.equals(this.operator, memberMessage.operator) || !Internal.equals(this.is_set_to_admin, memberMessage.is_set_to_admin) || !Internal.equals(this.is_top_user, memberMessage.is_top_user) || !Internal.equals(this.rank_score, memberMessage.rank_score) || !Internal.equals(this.top_user_no, memberMessage.top_user_no) || !Internal.equals(this.enter_type, memberMessage.enter_type) || !Internal.equals(this.action, memberMessage.action) || !Internal.equals(this.action_description, memberMessage.action_description) || !Internal.equals(this.user_id, memberMessage.user_id) || !Internal.equals(this.effect_config, memberMessage.effect_config) || !Internal.equals(this.pop_str, memberMessage.pop_str)) {
                return false;
            }
            return true;
        }
    }

    public MemberMessage(Common common2, User user2, Long l, User user3, Boolean bool, Boolean bool2, Long l2, Long l3, Long l4, Long l5, String str, Long l6, EffectConfig effectConfig, String str2) {
        this(common2, user2, l, user3, bool, bool2, l2, l3, l4, l5, str, l6, effectConfig, str2, ByteString.EMPTY);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberMessage(Common common2, User user2, Long l, User user3, Boolean bool, Boolean bool2, Long l2, Long l3, Long l4, Long l5, String str, Long l6, EffectConfig effectConfig, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.user = user2;
        this.member_count = l;
        this.operator = user3;
        this.is_set_to_admin = bool;
        this.is_top_user = bool2;
        this.rank_score = l2;
        this.top_user_no = l3;
        this.enter_type = l4;
        this.action = l5;
        this.action_description = str;
        this.user_id = l6;
        this.effect_config = effectConfig;
        this.pop_str = str2;
    }
}
