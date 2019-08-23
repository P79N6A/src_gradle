package com.bytedance.android.livesdk.message.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.c;
import com.tencent.bugly.CrashModule;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class User extends Message<User, Builder> {
    public static final ProtoAdapter<User> ADAPTER = new ProtoAdapter_User();
    public static final Boolean DEFAULT_ALLOW_BE_LOCATED = Boolean.FALSE;
    public static final Boolean DEFAULT_ALLOW_FIND_BY_CONTACTS = Boolean.FALSE;
    public static final Boolean DEFAULT_ALLOW_OTHERS_DOWNLOAD_VIDEO = Boolean.FALSE;
    public static final Boolean DEFAULT_ALLOW_OTHERS_DOWNLOAD_WHEN_SHARING_VIDEO = Boolean.FALSE;
    public static final Boolean DEFAULT_ALLOW_SHARE_SHOW_PROFILE = Boolean.FALSE;
    public static final Boolean DEFAULT_ALLOW_SHOW_IN_GOSSIP = Boolean.FALSE;
    public static final Boolean DEFAULT_ALLOW_SHOW_MY_ACTION = Boolean.FALSE;
    public static final Boolean DEFAULT_ALLOW_STRANGE_COMMENT = Boolean.FALSE;
    public static final Boolean DEFAULT_ALLOW_UNFOLLOWER_COMMENT = Boolean.FALSE;
    public static final Boolean DEFAULT_ALLOW_USE_LINKMIC = Boolean.FALSE;
    public static final Long DEFAULT_BIRTHDAY = 0L;
    public static final Boolean DEFAULT_BIRTHDAY_VALID = Boolean.FALSE;
    public static final Integer DEFAULT_BLOCK_STATUS = 0;
    public static final Integer DEFAULT_COMMENT_RESTRICT = 0;
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Integer DEFAULT_DISABLE_ICHAT = 0;
    public static final Long DEFAULT_ENABLE_ICHAT_IMG = 0L;
    public static final Integer DEFAULT_EXP = 0;
    public static final Integer DEFAULT_EXPERIENCE = 0;
    public static final Long DEFAULT_FAN_TICKET_COUNT = 0L;
    public static final Boolean DEFAULT_FOLD_STRANGER_CHAT = Boolean.FALSE;
    public static final Long DEFAULT_FOLLOW_STATUS = 0L;
    public static final Integer DEFAULT_GENDER = 0;
    public static final Boolean DEFAULT_HOTSOON_VERIFIED = Boolean.FALSE;
    public static final Integer DEFAULT_ICHAT_RESTRICT_TYPE = 0;
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_INCOME_SHARE_PERCENT = 0;
    public static final Boolean DEFAULT_IS_FOLLOWER = Boolean.FALSE;
    public static final Boolean DEFAULT_IS_FOLLOWING = Boolean.FALSE;
    public static final Integer DEFAULT_LEVEL = 0;
    public static final LinkmicStatus DEFAULT_LINK_MIC_STATS = LinkmicStatus.DISABLE;
    public static final Long DEFAULT_MODIFY_TIME = 0L;
    public static final Boolean DEFAULT_NEED_PROFILE_GUIDE = Boolean.FALSE;
    public static final Long DEFAULT_PAY_SCORE = 0L;
    public static final Long DEFAULT_PAY_SCORES = 0L;
    public static final Boolean DEFAULT_PUSH_COMMENT_STATUS = Boolean.FALSE;
    public static final Boolean DEFAULT_PUSH_DIGG = Boolean.FALSE;
    public static final Boolean DEFAULT_PUSH_FOLLOW = Boolean.FALSE;
    public static final Boolean DEFAULT_PUSH_FRIEND_ACTION = Boolean.FALSE;
    public static final Boolean DEFAULT_PUSH_ICHAT = Boolean.FALSE;
    public static final Boolean DEFAULT_PUSH_STATUS = Boolean.FALSE;
    public static final Boolean DEFAULT_PUSH_VIDEO_POST = Boolean.FALSE;
    public static final Boolean DEFAULT_PUSH_VIDEO_RECOMMEND = Boolean.FALSE;
    public static final Integer DEFAULT_SECRET = 0;
    public static final Long DEFAULT_SHORT_ID = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_TICKET_COUNT = 0L;
    public static final Long DEFAULT_TOP_VIP_NO = 0L;
    public static final Long DEFAULT_TOTAL_RECHARGE_DIAMOND_COUNT = 0L;
    public static final Integer DEFAULT_USER_ROLE = 0;
    public static final Boolean DEFAULT_VERIFIED = Boolean.FALSE;
    public static final Boolean DEFAULT_VERIFIED_MOBILE = Boolean.FALSE;
    public static final Boolean DEFAULT_WITH_COMMERCE_PERMISSION = Boolean.FALSE;
    public static final Boolean DEFAULT_WITH_FUSION_SHOP_ENTRY = Boolean.FALSE;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1001)
    public final Boolean allow_be_located;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1002)
    public final Boolean allow_find_by_contacts;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1003)
    public final Boolean allow_others_download_video;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1004)
    public final Boolean allow_others_download_when_sharing_video;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1005)
    public final Boolean allow_share_show_profile;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1006)
    public final Boolean allow_show_in_gossip;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1007)
    public final Boolean allow_show_my_action;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1008)
    public final Boolean allow_strange_comment;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1009)
    public final Boolean allow_unfollower_comment;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1010)
    public final Boolean allow_use_linkmic;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User$AnchorInfo#ADAPTER", tag = 36)
    public final AnchorInfo anchor_info;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User$AnchorLevel#ADAPTER", tag = 1011)
    public final AnchorLevel anchor_level;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User$AuthorStats#ADAPTER", tag = 44)
    public final AuthorStats author_stats;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 27)
    public final Image avatar_border;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 1012)
    public final Image avatar_jpg;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 11)
    public final Image avatar_large;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 10)
    public final Image avatar_medium;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 9)
    public final Image avatar_thumb;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", label = WireField.Label.REPEATED, tag = 21)
    public final List<Image> badge_image_list;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1013)
    public final String bg_img_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 7)
    public final Long birthday;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1014)
    public final String birthday_description;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1015)
    public final Boolean birthday_valid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1016)
    public final Integer block_status;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User$Border#ADAPTER", tag = 25)
    public final Border border;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 14)
    public final String city;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1017)
    public final Integer comment_restrict;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1018)
    public final String constellation;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 16)
    public final Long create_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1019)
    public final Integer disable_ichat;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 38)
    public final String display_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1020)
    public final Long enable_ichat_img;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1021)
    public final Integer exp;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 13)
    public final Integer experience;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1022)
    public final Long fan_ticket_count;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User$FansClub#ADAPTER", tag = 24)
    public final FansClub fans_club;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1023)
    public final Boolean fold_stranger_chat;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User$FollowInfo#ADAPTER", tag = 22)
    public final FollowInfo follow_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1024)
    public final Long follow_status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer gender;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1025)
    public final Boolean hotsoon_verified;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1026)
    public final String hotsoon_verified_reason;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1027)
    public final Integer ichat_restrict_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1028)
    public final String id_str;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 20)
    public final Integer income_share_percent;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1029)
    public final Boolean is_follower;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1030)
    public final Boolean is_following;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public final Integer level;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.LinkmicStatus#ADAPTER", tag = 37)
    public final LinkmicStatus link_mic_stats;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 28)
    public final Image medal;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 17)
    public final Long modify_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1031)
    public final Boolean need_profile_guide;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", label = WireField.Label.REPEATED, tag = 30)
    public final List<Image> new_real_time_icons;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String nickname;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User$OwnRoom#ADAPTER", tag = 33)
    public final OwnRoom own_room;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User$PayGrade#ADAPTER", tag = 23)
    public final PayGrade pay_grade;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 34)
    public final Long pay_score;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1032)
    public final Long pay_scores;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1033)
    public final Boolean push_comment_status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1034)
    public final Boolean push_digg;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1035)
    public final Boolean push_follow;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1036)
    public final Boolean push_friend_action;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1037)
    public final Boolean push_ichat;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1038)
    public final Boolean push_status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1039)
    public final Boolean push_video_post;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1040)
    public final Boolean push_video_recommend;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", label = WireField.Label.REPEATED, tag = 29)
    public final List<Image> real_time_icons;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 46)
    public final String sec_uid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 18)
    public final Integer secret;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 19)
    public final String share_qrcode_uri;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long short_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String signature;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 26)
    public final String special_id;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User$UserStats#ADAPTER", tag = 1041)
    public final UserStats stats;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 15)
    public final Integer status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String telephone;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 35)
    public final Long ticket_count;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User#ADAPTER", label = WireField.Label.REPEATED, tag = 45)
    public final List<User> top_fans;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 31)
    public final Long top_vip_no;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 41)
    public final Long total_recharge_diamond_count;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User$UserAttr#ADAPTER", tag = 32)
    public final UserAttr user_attr;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 47)
    public final Integer user_role;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 12)
    public final Boolean verified;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 43)
    public final String verified_content;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1042)
    public final Boolean verified_mobile;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1043)
    public final String verified_reason;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User$AnchorLevel#ADAPTER", tag = 42)
    public final AnchorLevel webcast_anchor_level;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 39)
    public final Boolean with_commerce_permission;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 40)
    public final Boolean with_fusion_shop_entry;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User$XiguaParams#ADAPTER", tag = 48)
    public final XiguaParams xigua_info;

    public static final class AnchorInfo extends Message<AnchorInfo, Builder> {
        public static final ProtoAdapter<AnchorInfo> ADAPTER = new ProtoAdapter_AnchorInfo();
        public static final Long DEFAULT_LEVEL = 0L;
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
        public final Long level;

        public static final class Builder extends Message.Builder<AnchorInfo, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public Long level;

            public final AnchorInfo build() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12282, new Class[0], AnchorInfo.class)) {
                    return new AnchorInfo(this.level, super.buildUnknownFields());
                }
                return (AnchorInfo) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12282, new Class[0], AnchorInfo.class);
            }

            public final Builder level(Long l) {
                this.level = l;
                return this;
            }
        }

        static final class ProtoAdapter_AnchorInfo extends ProtoAdapter<AnchorInfo> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_AnchorInfo() {
                super(FieldEncoding.LENGTH_DELIMITED, AnchorInfo.class);
            }

            public final AnchorInfo decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12285, new Class[]{ProtoReader.class}, AnchorInfo.class)) {
                    return (AnchorInfo) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12285, new Class[]{ProtoReader.class}, AnchorInfo.class);
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
                        builder.level((Long) ProtoAdapter.INT64.decode(protoReader2));
                    }
                }
            }

            public final int encodedSize(AnchorInfo anchorInfo) {
                AnchorInfo anchorInfo2 = anchorInfo;
                int i = 0;
                if (PatchProxy.isSupport(new Object[]{anchorInfo2}, this, changeQuickRedirect, false, 12283, new Class[]{AnchorInfo.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{anchorInfo2}, this, changeQuickRedirect, false, 12283, new Class[]{AnchorInfo.class}, Integer.TYPE)).intValue();
                }
                if (anchorInfo2.level != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, anchorInfo2.level);
                }
                return i + anchorInfo.unknownFields().size();
            }

            public final AnchorInfo redact(AnchorInfo anchorInfo) {
                if (PatchProxy.isSupport(new Object[]{anchorInfo}, this, changeQuickRedirect, false, 12286, new Class[]{AnchorInfo.class}, AnchorInfo.class)) {
                    return (AnchorInfo) PatchProxy.accessDispatch(new Object[]{anchorInfo}, this, changeQuickRedirect, false, 12286, new Class[]{AnchorInfo.class}, AnchorInfo.class);
                }
                Builder newBuilder = anchorInfo.newBuilder();
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final void encode(ProtoWriter protoWriter, AnchorInfo anchorInfo) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                AnchorInfo anchorInfo2 = anchorInfo;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, anchorInfo2}, this, changeQuickRedirect, false, 12284, new Class[]{ProtoWriter.class, AnchorInfo.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, anchorInfo2}, this, changeQuickRedirect, false, 12284, new Class[]{ProtoWriter.class, AnchorInfo.class}, Void.TYPE);
                    return;
                }
                if (anchorInfo2.level != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, anchorInfo2.level);
                }
                protoWriter2.writeBytes(anchorInfo.unknownFields());
            }
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12278, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12278, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.level = this.level;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final int hashCode() {
            int i = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12280, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12280, new Class[0], Integer.TYPE)).intValue();
            }
            int i2 = this.hashCode;
            if (i2 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.level != null) {
                    i = this.level.hashCode();
                }
                i2 = hashCode + i;
                this.hashCode = i2;
            }
            return i2;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12281, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12281, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.level != null) {
                sb.append(", level=");
                sb.append(this.level);
            }
            StringBuilder replace = sb.replace(0, 2, "AnchorInfo{");
            replace.append('}');
            return replace.toString();
        }

        public AnchorInfo(Long l) {
            this(l, ByteString.EMPTY);
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12279, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12279, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof AnchorInfo)) {
                    return false;
                }
                AnchorInfo anchorInfo = (AnchorInfo) obj;
                if (!unknownFields().equals(anchorInfo.unknownFields()) || !Internal.equals(this.level, anchorInfo.level)) {
                    return false;
                }
                return true;
            }
        }

        public AnchorInfo(Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            this.level = l;
        }
    }

    public static final class AnchorLevel extends Message<AnchorLevel, Builder> {
        public static final ProtoAdapter<AnchorLevel> ADAPTER = new ProtoAdapter_AnchorLevel();
        public static final Long DEFAULT_EXPERIENCE = 0L;
        public static final Long DEFAULT_HIGHEST_EXPERIENCE_THIS_LEVEL = 0L;
        public static final Long DEFAULT_LEVEL = 0L;
        public static final Long DEFAULT_LOWEST_EXPERIENCE_THIS_LEVEL = 0L;
        public static final Long DEFAULT_TASK_DECREASE_EXPERIENCE = 0L;
        public static final Long DEFAULT_TASK_END_TIME = 0L;
        public static final Long DEFAULT_TASK_START_EXPERIENCE = 0L;
        public static final Long DEFAULT_TASK_START_TIME = 0L;
        public static final Long DEFAULT_TASK_TARGET_EXPERIENCE = 0L;
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
        public final Long experience;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
        public final Long highest_experience_this_level;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
        public final Long level;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
        public final Long lowest_experience_this_level;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 10)
        public final Image profile_dialog_bg;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 11)
        public final Image profile_dialog_bg_back;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 13)
        public final Image small_icon;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 12)
        public final Image stage_level;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 7)
        public final Long task_decrease_experience;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 9)
        public final Long task_end_time;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
        public final Long task_start_experience;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
        public final Long task_start_time;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 8)
        public final Long task_target_experience;

        public static final class Builder extends Message.Builder<AnchorLevel, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public Long experience;
            public Long highest_experience_this_level;
            public Long level;
            public Long lowest_experience_this_level;
            public Image profile_dialog_bg;
            public Image profile_dialog_bg_back;
            public Image small_icon;
            public Image stage_level;
            public Long task_decrease_experience;
            public Long task_end_time;
            public Long task_start_experience;
            public Long task_start_time;
            public Long task_target_experience;

            public final AnchorLevel build() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12291, new Class[0], AnchorLevel.class)) {
                    return (AnchorLevel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12291, new Class[0], AnchorLevel.class);
                }
                Long l = this.level;
                Long l2 = this.experience;
                Long l3 = this.lowest_experience_this_level;
                Long l4 = this.highest_experience_this_level;
                Long l5 = this.task_start_experience;
                Long l6 = this.task_start_time;
                Long l7 = this.task_decrease_experience;
                Long l8 = this.task_target_experience;
                Long l9 = this.task_end_time;
                Image image = this.profile_dialog_bg;
                Image image2 = this.profile_dialog_bg_back;
                Image image3 = this.stage_level;
                AnchorLevel anchorLevel = new AnchorLevel(l, l2, l3, l4, l5, l6, l7, l8, l9, image, image2, image3, this.small_icon, super.buildUnknownFields());
                return anchorLevel;
            }

            public final Builder experience(Long l) {
                this.experience = l;
                return this;
            }

            public final Builder highest_experience_this_level(Long l) {
                this.highest_experience_this_level = l;
                return this;
            }

            public final Builder level(Long l) {
                this.level = l;
                return this;
            }

            public final Builder lowest_experience_this_level(Long l) {
                this.lowest_experience_this_level = l;
                return this;
            }

            public final Builder profile_dialog_bg(Image image) {
                this.profile_dialog_bg = image;
                return this;
            }

            public final Builder profile_dialog_bg_back(Image image) {
                this.profile_dialog_bg_back = image;
                return this;
            }

            public final Builder small_icon(Image image) {
                this.small_icon = image;
                return this;
            }

            public final Builder stage_level(Image image) {
                this.stage_level = image;
                return this;
            }

            public final Builder task_decrease_experience(Long l) {
                this.task_decrease_experience = l;
                return this;
            }

            public final Builder task_end_time(Long l) {
                this.task_end_time = l;
                return this;
            }

            public final Builder task_start_experience(Long l) {
                this.task_start_experience = l;
                return this;
            }

            public final Builder task_start_time(Long l) {
                this.task_start_time = l;
                return this;
            }

            public final Builder task_target_experience(Long l) {
                this.task_target_experience = l;
                return this;
            }
        }

        static final class ProtoAdapter_AnchorLevel extends ProtoAdapter<AnchorLevel> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_AnchorLevel() {
                super(FieldEncoding.LENGTH_DELIMITED, AnchorLevel.class);
            }

            public final AnchorLevel redact(AnchorLevel anchorLevel) {
                if (PatchProxy.isSupport(new Object[]{anchorLevel}, this, changeQuickRedirect, false, 12295, new Class[]{AnchorLevel.class}, AnchorLevel.class)) {
                    return (AnchorLevel) PatchProxy.accessDispatch(new Object[]{anchorLevel}, this, changeQuickRedirect, false, 12295, new Class[]{AnchorLevel.class}, AnchorLevel.class);
                }
                Builder newBuilder = anchorLevel.newBuilder();
                if (newBuilder.profile_dialog_bg != null) {
                    newBuilder.profile_dialog_bg = (Image) Image.ADAPTER.redact(newBuilder.profile_dialog_bg);
                }
                if (newBuilder.profile_dialog_bg_back != null) {
                    newBuilder.profile_dialog_bg_back = (Image) Image.ADAPTER.redact(newBuilder.profile_dialog_bg_back);
                }
                if (newBuilder.stage_level != null) {
                    newBuilder.stage_level = (Image) Image.ADAPTER.redact(newBuilder.stage_level);
                }
                if (newBuilder.small_icon != null) {
                    newBuilder.small_icon = (Image) Image.ADAPTER.redact(newBuilder.small_icon);
                }
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final AnchorLevel decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12294, new Class[]{ProtoReader.class}, AnchorLevel.class)) {
                    return (AnchorLevel) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12294, new Class[]{ProtoReader.class}, AnchorLevel.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.level((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 2:
                                builder.experience((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 3:
                                builder.lowest_experience_this_level((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 4:
                                builder.highest_experience_this_level((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 5:
                                builder.task_start_experience((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 6:
                                builder.task_start_time((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case e.l /*7*/:
                                builder.task_decrease_experience((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 8:
                                builder.task_target_experience((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 9:
                                builder.task_end_time((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 10:
                                builder.profile_dialog_bg((Image) Image.ADAPTER.decode(protoReader2));
                                break;
                            case 11:
                                builder.profile_dialog_bg_back((Image) Image.ADAPTER.decode(protoReader2));
                                break;
                            case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                                builder.stage_level((Image) Image.ADAPTER.decode(protoReader2));
                                break;
                            case 13:
                                builder.small_icon((Image) Image.ADAPTER.decode(protoReader2));
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

            public final int encodedSize(AnchorLevel anchorLevel) {
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
                AnchorLevel anchorLevel2 = anchorLevel;
                int i13 = 0;
                if (PatchProxy.isSupport(new Object[]{anchorLevel2}, this, changeQuickRedirect, false, 12292, new Class[]{AnchorLevel.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{anchorLevel2}, this, changeQuickRedirect, false, 12292, new Class[]{AnchorLevel.class}, Integer.TYPE)).intValue();
                }
                if (anchorLevel2.level != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, anchorLevel2.level);
                } else {
                    i = 0;
                }
                if (anchorLevel2.experience != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, anchorLevel2.experience);
                } else {
                    i2 = 0;
                }
                int i14 = i + i2;
                if (anchorLevel2.lowest_experience_this_level != null) {
                    i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, anchorLevel2.lowest_experience_this_level);
                } else {
                    i3 = 0;
                }
                int i15 = i14 + i3;
                if (anchorLevel2.highest_experience_this_level != null) {
                    i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, anchorLevel2.highest_experience_this_level);
                } else {
                    i4 = 0;
                }
                int i16 = i15 + i4;
                if (anchorLevel2.task_start_experience != null) {
                    i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, anchorLevel2.task_start_experience);
                } else {
                    i5 = 0;
                }
                int i17 = i16 + i5;
                if (anchorLevel2.task_start_time != null) {
                    i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, anchorLevel2.task_start_time);
                } else {
                    i6 = 0;
                }
                int i18 = i17 + i6;
                if (anchorLevel2.task_decrease_experience != null) {
                    i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, anchorLevel2.task_decrease_experience);
                } else {
                    i7 = 0;
                }
                int i19 = i18 + i7;
                if (anchorLevel2.task_target_experience != null) {
                    i8 = ProtoAdapter.INT64.encodedSizeWithTag(8, anchorLevel2.task_target_experience);
                } else {
                    i8 = 0;
                }
                int i20 = i19 + i8;
                if (anchorLevel2.task_end_time != null) {
                    i9 = ProtoAdapter.INT64.encodedSizeWithTag(9, anchorLevel2.task_end_time);
                } else {
                    i9 = 0;
                }
                int i21 = i20 + i9;
                if (anchorLevel2.profile_dialog_bg != null) {
                    i10 = Image.ADAPTER.encodedSizeWithTag(10, anchorLevel2.profile_dialog_bg);
                } else {
                    i10 = 0;
                }
                int i22 = i21 + i10;
                if (anchorLevel2.profile_dialog_bg_back != null) {
                    i11 = Image.ADAPTER.encodedSizeWithTag(11, anchorLevel2.profile_dialog_bg_back);
                } else {
                    i11 = 0;
                }
                int i23 = i22 + i11;
                if (anchorLevel2.stage_level != null) {
                    i12 = Image.ADAPTER.encodedSizeWithTag(12, anchorLevel2.stage_level);
                } else {
                    i12 = 0;
                }
                int i24 = i23 + i12;
                if (anchorLevel2.small_icon != null) {
                    i13 = Image.ADAPTER.encodedSizeWithTag(13, anchorLevel2.small_icon);
                }
                return i24 + i13 + anchorLevel.unknownFields().size();
            }

            public final void encode(ProtoWriter protoWriter, AnchorLevel anchorLevel) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                AnchorLevel anchorLevel2 = anchorLevel;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, anchorLevel2}, this, changeQuickRedirect, false, 12293, new Class[]{ProtoWriter.class, AnchorLevel.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, anchorLevel2}, this, changeQuickRedirect, false, 12293, new Class[]{ProtoWriter.class, AnchorLevel.class}, Void.TYPE);
                    return;
                }
                if (anchorLevel2.level != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, anchorLevel2.level);
                }
                if (anchorLevel2.experience != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, anchorLevel2.experience);
                }
                if (anchorLevel2.lowest_experience_this_level != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, anchorLevel2.lowest_experience_this_level);
                }
                if (anchorLevel2.highest_experience_this_level != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, anchorLevel2.highest_experience_this_level);
                }
                if (anchorLevel2.task_start_experience != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 5, anchorLevel2.task_start_experience);
                }
                if (anchorLevel2.task_start_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 6, anchorLevel2.task_start_time);
                }
                if (anchorLevel2.task_decrease_experience != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 7, anchorLevel2.task_decrease_experience);
                }
                if (anchorLevel2.task_target_experience != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 8, anchorLevel2.task_target_experience);
                }
                if (anchorLevel2.task_end_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 9, anchorLevel2.task_end_time);
                }
                if (anchorLevel2.profile_dialog_bg != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter2, 10, anchorLevel2.profile_dialog_bg);
                }
                if (anchorLevel2.profile_dialog_bg_back != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter2, 11, anchorLevel2.profile_dialog_bg_back);
                }
                if (anchorLevel2.stage_level != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter2, 12, anchorLevel2.stage_level);
                }
                if (anchorLevel2.small_icon != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter2, 13, anchorLevel2.small_icon);
                }
                protoWriter2.writeBytes(anchorLevel.unknownFields());
            }
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12287, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12287, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.level = this.level;
            builder.experience = this.experience;
            builder.lowest_experience_this_level = this.lowest_experience_this_level;
            builder.highest_experience_this_level = this.highest_experience_this_level;
            builder.task_start_experience = this.task_start_experience;
            builder.task_start_time = this.task_start_time;
            builder.task_decrease_experience = this.task_decrease_experience;
            builder.task_target_experience = this.task_target_experience;
            builder.task_end_time = this.task_end_time;
            builder.profile_dialog_bg = this.profile_dialog_bg;
            builder.profile_dialog_bg_back = this.profile_dialog_bg_back;
            builder.stage_level = this.stage_level;
            builder.small_icon = this.small_icon;
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
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13 = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12289, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12289, new Class[0], Integer.TYPE)).intValue();
            }
            int i14 = this.hashCode;
            if (i14 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.level != null) {
                    i = this.level.hashCode();
                } else {
                    i = 0;
                }
                int i15 = (hashCode + i) * 37;
                if (this.experience != null) {
                    i2 = this.experience.hashCode();
                } else {
                    i2 = 0;
                }
                int i16 = (i15 + i2) * 37;
                if (this.lowest_experience_this_level != null) {
                    i3 = this.lowest_experience_this_level.hashCode();
                } else {
                    i3 = 0;
                }
                int i17 = (i16 + i3) * 37;
                if (this.highest_experience_this_level != null) {
                    i4 = this.highest_experience_this_level.hashCode();
                } else {
                    i4 = 0;
                }
                int i18 = (i17 + i4) * 37;
                if (this.task_start_experience != null) {
                    i5 = this.task_start_experience.hashCode();
                } else {
                    i5 = 0;
                }
                int i19 = (i18 + i5) * 37;
                if (this.task_start_time != null) {
                    i6 = this.task_start_time.hashCode();
                } else {
                    i6 = 0;
                }
                int i20 = (i19 + i6) * 37;
                if (this.task_decrease_experience != null) {
                    i7 = this.task_decrease_experience.hashCode();
                } else {
                    i7 = 0;
                }
                int i21 = (i20 + i7) * 37;
                if (this.task_target_experience != null) {
                    i8 = this.task_target_experience.hashCode();
                } else {
                    i8 = 0;
                }
                int i22 = (i21 + i8) * 37;
                if (this.task_end_time != null) {
                    i9 = this.task_end_time.hashCode();
                } else {
                    i9 = 0;
                }
                int i23 = (i22 + i9) * 37;
                if (this.profile_dialog_bg != null) {
                    i10 = this.profile_dialog_bg.hashCode();
                } else {
                    i10 = 0;
                }
                int i24 = (i23 + i10) * 37;
                if (this.profile_dialog_bg_back != null) {
                    i11 = this.profile_dialog_bg_back.hashCode();
                } else {
                    i11 = 0;
                }
                int i25 = (i24 + i11) * 37;
                if (this.stage_level != null) {
                    i12 = this.stage_level.hashCode();
                } else {
                    i12 = 0;
                }
                int i26 = (i25 + i12) * 37;
                if (this.small_icon != null) {
                    i13 = this.small_icon.hashCode();
                }
                i14 = i26 + i13;
                this.hashCode = i14;
            }
            return i14;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12290, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12290, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.level != null) {
                sb.append(", level=");
                sb.append(this.level);
            }
            if (this.experience != null) {
                sb.append(", experience=");
                sb.append(this.experience);
            }
            if (this.lowest_experience_this_level != null) {
                sb.append(", lowest_experience_this_level=");
                sb.append(this.lowest_experience_this_level);
            }
            if (this.highest_experience_this_level != null) {
                sb.append(", highest_experience_this_level=");
                sb.append(this.highest_experience_this_level);
            }
            if (this.task_start_experience != null) {
                sb.append(", task_start_experience=");
                sb.append(this.task_start_experience);
            }
            if (this.task_start_time != null) {
                sb.append(", task_start_time=");
                sb.append(this.task_start_time);
            }
            if (this.task_decrease_experience != null) {
                sb.append(", task_decrease_experience=");
                sb.append(this.task_decrease_experience);
            }
            if (this.task_target_experience != null) {
                sb.append(", task_target_experience=");
                sb.append(this.task_target_experience);
            }
            if (this.task_end_time != null) {
                sb.append(", task_end_time=");
                sb.append(this.task_end_time);
            }
            if (this.profile_dialog_bg != null) {
                sb.append(", profile_dialog_bg=");
                sb.append(this.profile_dialog_bg);
            }
            if (this.profile_dialog_bg_back != null) {
                sb.append(", profile_dialog_bg_back=");
                sb.append(this.profile_dialog_bg_back);
            }
            if (this.stage_level != null) {
                sb.append(", stage_level=");
                sb.append(this.stage_level);
            }
            if (this.small_icon != null) {
                sb.append(", small_icon=");
                sb.append(this.small_icon);
            }
            StringBuilder replace = sb.replace(0, 2, "AnchorLevel{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12288, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12288, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof AnchorLevel)) {
                    return false;
                }
                AnchorLevel anchorLevel = (AnchorLevel) obj;
                if (!unknownFields().equals(anchorLevel.unknownFields()) || !Internal.equals(this.level, anchorLevel.level) || !Internal.equals(this.experience, anchorLevel.experience) || !Internal.equals(this.lowest_experience_this_level, anchorLevel.lowest_experience_this_level) || !Internal.equals(this.highest_experience_this_level, anchorLevel.highest_experience_this_level) || !Internal.equals(this.task_start_experience, anchorLevel.task_start_experience) || !Internal.equals(this.task_start_time, anchorLevel.task_start_time) || !Internal.equals(this.task_decrease_experience, anchorLevel.task_decrease_experience) || !Internal.equals(this.task_target_experience, anchorLevel.task_target_experience) || !Internal.equals(this.task_end_time, anchorLevel.task_end_time) || !Internal.equals(this.profile_dialog_bg, anchorLevel.profile_dialog_bg) || !Internal.equals(this.profile_dialog_bg_back, anchorLevel.profile_dialog_bg_back) || !Internal.equals(this.stage_level, anchorLevel.stage_level) || !Internal.equals(this.small_icon, anchorLevel.small_icon)) {
                    return false;
                }
                return true;
            }
        }

        public AnchorLevel(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Image image, Image image2, Image image3, Image image4) {
            this(l, l2, l3, l4, l5, l6, l7, l8, l9, image, image2, image3, image4, ByteString.EMPTY);
        }

        public AnchorLevel(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Image image, Image image2, Image image3, Image image4, ByteString byteString) {
            super(ADAPTER, byteString);
            this.level = l;
            this.experience = l2;
            this.lowest_experience_this_level = l3;
            this.highest_experience_this_level = l4;
            this.task_start_experience = l5;
            this.task_start_time = l6;
            this.task_decrease_experience = l7;
            this.task_target_experience = l8;
            this.task_end_time = l9;
            this.profile_dialog_bg = image;
            this.profile_dialog_bg_back = image2;
            this.stage_level = image3;
            this.small_icon = image4;
        }
    }

    public static final class AuthorStats extends Message<AuthorStats, Builder> {
        public static final ProtoAdapter<AuthorStats> ADAPTER = new ProtoAdapter_AuthorStats();
        public static final Long DEFAULT_VARIETY_SHOW_PLAY_COUNT = 0L;
        public static final Long DEFAULT_VIDEO_TOTAL_COUNT = 0L;
        public static final Long DEFAULT_VIDEO_TOTAL_FAVORITE_COUNT = 0L;
        public static final Long DEFAULT_VIDEO_TOTAL_PLAY_COUNT = 0L;
        public static final Long DEFAULT_VIDEO_TOTAL_SERIES_COUNT = 0L;
        public static final Long DEFAULT_VIDEO_TOTAL_SHARE_COUNT = 0L;
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
        public final Long variety_show_play_count;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
        public final Long video_total_count;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
        public final Long video_total_favorite_count;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
        public final Long video_total_play_count;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
        public final Long video_total_series_count;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
        public final Long video_total_share_count;

        public static final class Builder extends Message.Builder<AuthorStats, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public Long variety_show_play_count;
            public Long video_total_count;
            public Long video_total_favorite_count;
            public Long video_total_play_count;
            public Long video_total_series_count;
            public Long video_total_share_count;

            public final AuthorStats build() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12300, new Class[0], AuthorStats.class)) {
                    return (AuthorStats) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12300, new Class[0], AuthorStats.class);
                }
                AuthorStats authorStats = new AuthorStats(this.video_total_count, this.video_total_play_count, this.video_total_share_count, this.video_total_series_count, this.variety_show_play_count, this.video_total_favorite_count, super.buildUnknownFields());
                return authorStats;
            }

            public final Builder variety_show_play_count(Long l) {
                this.variety_show_play_count = l;
                return this;
            }

            public final Builder video_total_count(Long l) {
                this.video_total_count = l;
                return this;
            }

            public final Builder video_total_favorite_count(Long l) {
                this.video_total_favorite_count = l;
                return this;
            }

            public final Builder video_total_play_count(Long l) {
                this.video_total_play_count = l;
                return this;
            }

            public final Builder video_total_series_count(Long l) {
                this.video_total_series_count = l;
                return this;
            }

            public final Builder video_total_share_count(Long l) {
                this.video_total_share_count = l;
                return this;
            }
        }

        static final class ProtoAdapter_AuthorStats extends ProtoAdapter<AuthorStats> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_AuthorStats() {
                super(FieldEncoding.LENGTH_DELIMITED, AuthorStats.class);
            }

            public final AuthorStats redact(AuthorStats authorStats) {
                if (PatchProxy.isSupport(new Object[]{authorStats}, this, changeQuickRedirect, false, 12304, new Class[]{AuthorStats.class}, AuthorStats.class)) {
                    return (AuthorStats) PatchProxy.accessDispatch(new Object[]{authorStats}, this, changeQuickRedirect, false, 12304, new Class[]{AuthorStats.class}, AuthorStats.class);
                }
                Builder newBuilder = authorStats.newBuilder();
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final AuthorStats decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12303, new Class[]{ProtoReader.class}, AuthorStats.class)) {
                    return (AuthorStats) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12303, new Class[]{ProtoReader.class}, AuthorStats.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.video_total_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 2:
                                builder.video_total_play_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 3:
                                builder.video_total_share_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 4:
                                builder.video_total_series_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 5:
                                builder.variety_show_play_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 6:
                                builder.video_total_favorite_count((Long) ProtoAdapter.INT64.decode(protoReader2));
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

            public final int encodedSize(AuthorStats authorStats) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                AuthorStats authorStats2 = authorStats;
                int i6 = 0;
                if (PatchProxy.isSupport(new Object[]{authorStats2}, this, changeQuickRedirect, false, 12301, new Class[]{AuthorStats.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{authorStats2}, this, changeQuickRedirect, false, 12301, new Class[]{AuthorStats.class}, Integer.TYPE)).intValue();
                }
                if (authorStats2.video_total_count != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, authorStats2.video_total_count);
                } else {
                    i = 0;
                }
                if (authorStats2.video_total_play_count != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, authorStats2.video_total_play_count);
                } else {
                    i2 = 0;
                }
                int i7 = i + i2;
                if (authorStats2.video_total_share_count != null) {
                    i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, authorStats2.video_total_share_count);
                } else {
                    i3 = 0;
                }
                int i8 = i7 + i3;
                if (authorStats2.video_total_series_count != null) {
                    i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, authorStats2.video_total_series_count);
                } else {
                    i4 = 0;
                }
                int i9 = i8 + i4;
                if (authorStats2.variety_show_play_count != null) {
                    i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, authorStats2.variety_show_play_count);
                } else {
                    i5 = 0;
                }
                int i10 = i9 + i5;
                if (authorStats2.video_total_favorite_count != null) {
                    i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, authorStats2.video_total_favorite_count);
                }
                return i10 + i6 + authorStats.unknownFields().size();
            }

            public final void encode(ProtoWriter protoWriter, AuthorStats authorStats) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                AuthorStats authorStats2 = authorStats;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, authorStats2}, this, changeQuickRedirect, false, 12302, new Class[]{ProtoWriter.class, AuthorStats.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, authorStats2}, this, changeQuickRedirect, false, 12302, new Class[]{ProtoWriter.class, AuthorStats.class}, Void.TYPE);
                    return;
                }
                if (authorStats2.video_total_count != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, authorStats2.video_total_count);
                }
                if (authorStats2.video_total_play_count != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, authorStats2.video_total_play_count);
                }
                if (authorStats2.video_total_share_count != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, authorStats2.video_total_share_count);
                }
                if (authorStats2.video_total_series_count != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, authorStats2.video_total_series_count);
                }
                if (authorStats2.variety_show_play_count != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 5, authorStats2.variety_show_play_count);
                }
                if (authorStats2.video_total_favorite_count != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 6, authorStats2.video_total_favorite_count);
                }
                protoWriter2.writeBytes(authorStats.unknownFields());
            }
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12296, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12296, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.video_total_count = this.video_total_count;
            builder.video_total_play_count = this.video_total_play_count;
            builder.video_total_share_count = this.video_total_share_count;
            builder.video_total_series_count = this.video_total_series_count;
            builder.variety_show_play_count = this.variety_show_play_count;
            builder.video_total_favorite_count = this.video_total_favorite_count;
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
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12298, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12298, new Class[0], Integer.TYPE)).intValue();
            }
            int i7 = this.hashCode;
            if (i7 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.video_total_count != null) {
                    i = this.video_total_count.hashCode();
                } else {
                    i = 0;
                }
                int i8 = (hashCode + i) * 37;
                if (this.video_total_play_count != null) {
                    i2 = this.video_total_play_count.hashCode();
                } else {
                    i2 = 0;
                }
                int i9 = (i8 + i2) * 37;
                if (this.video_total_share_count != null) {
                    i3 = this.video_total_share_count.hashCode();
                } else {
                    i3 = 0;
                }
                int i10 = (i9 + i3) * 37;
                if (this.video_total_series_count != null) {
                    i4 = this.video_total_series_count.hashCode();
                } else {
                    i4 = 0;
                }
                int i11 = (i10 + i4) * 37;
                if (this.variety_show_play_count != null) {
                    i5 = this.variety_show_play_count.hashCode();
                } else {
                    i5 = 0;
                }
                int i12 = (i11 + i5) * 37;
                if (this.video_total_favorite_count != null) {
                    i6 = this.video_total_favorite_count.hashCode();
                }
                i7 = i12 + i6;
                this.hashCode = i7;
            }
            return i7;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12299, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12299, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.video_total_count != null) {
                sb.append(", video_total_count=");
                sb.append(this.video_total_count);
            }
            if (this.video_total_play_count != null) {
                sb.append(", video_total_play_count=");
                sb.append(this.video_total_play_count);
            }
            if (this.video_total_share_count != null) {
                sb.append(", video_total_share_count=");
                sb.append(this.video_total_share_count);
            }
            if (this.video_total_series_count != null) {
                sb.append(", video_total_series_count=");
                sb.append(this.video_total_series_count);
            }
            if (this.variety_show_play_count != null) {
                sb.append(", variety_show_play_count=");
                sb.append(this.variety_show_play_count);
            }
            if (this.video_total_favorite_count != null) {
                sb.append(", video_total_favorite_count=");
                sb.append(this.video_total_favorite_count);
            }
            StringBuilder replace = sb.replace(0, 2, "AuthorStats{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12297, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12297, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof AuthorStats)) {
                    return false;
                }
                AuthorStats authorStats = (AuthorStats) obj;
                if (!unknownFields().equals(authorStats.unknownFields()) || !Internal.equals(this.video_total_count, authorStats.video_total_count) || !Internal.equals(this.video_total_play_count, authorStats.video_total_play_count) || !Internal.equals(this.video_total_share_count, authorStats.video_total_share_count) || !Internal.equals(this.video_total_series_count, authorStats.video_total_series_count) || !Internal.equals(this.variety_show_play_count, authorStats.variety_show_play_count) || !Internal.equals(this.video_total_favorite_count, authorStats.video_total_favorite_count)) {
                    return false;
                }
                return true;
            }
        }

        public AuthorStats(Long l, Long l2, Long l3, Long l4, Long l5, Long l6) {
            this(l, l2, l3, l4, l5, l6, ByteString.EMPTY);
        }

        public AuthorStats(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, ByteString byteString) {
            super(ADAPTER, byteString);
            this.video_total_count = l;
            this.video_total_play_count = l2;
            this.video_total_share_count = l3;
            this.video_total_series_count = l4;
            this.variety_show_play_count = l5;
            this.video_total_favorite_count = l6;
        }
    }

    public static final class Border extends Message<Border, Builder> {
        public static final ProtoAdapter<Border> ADAPTER = new ProtoAdapter_Border();
        public static final Long DEFAULT_LEVEL = 0L;
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 1)
        public final Image icon;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
        public final Long level;

        public static final class Builder extends Message.Builder<Border, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public Image icon;
            public Long level;

            public final Border build() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12309, new Class[0], Border.class)) {
                    return new Border(this.icon, this.level, super.buildUnknownFields());
                }
                return (Border) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12309, new Class[0], Border.class);
            }

            public final Builder icon(Image image) {
                this.icon = image;
                return this;
            }

            public final Builder level(Long l) {
                this.level = l;
                return this;
            }
        }

        static final class ProtoAdapter_Border extends ProtoAdapter<Border> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_Border() {
                super(FieldEncoding.LENGTH_DELIMITED, Border.class);
            }

            public final int encodedSize(Border border) {
                int i;
                Border border2 = border;
                int i2 = 0;
                if (PatchProxy.isSupport(new Object[]{border2}, this, changeQuickRedirect, false, 12310, new Class[]{Border.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{border2}, this, changeQuickRedirect, false, 12310, new Class[]{Border.class}, Integer.TYPE)).intValue();
                }
                if (border2.icon != null) {
                    i = Image.ADAPTER.encodedSizeWithTag(1, border2.icon);
                } else {
                    i = 0;
                }
                if (border2.level != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, border2.level);
                }
                return i + i2 + border.unknownFields().size();
            }

            public final Border redact(Border border) {
                if (PatchProxy.isSupport(new Object[]{border}, this, changeQuickRedirect, false, 12313, new Class[]{Border.class}, Border.class)) {
                    return (Border) PatchProxy.accessDispatch(new Object[]{border}, this, changeQuickRedirect, false, 12313, new Class[]{Border.class}, Border.class);
                }
                Builder newBuilder = border.newBuilder();
                if (newBuilder.icon != null) {
                    newBuilder.icon = (Image) Image.ADAPTER.redact(newBuilder.icon);
                }
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final Border decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12312, new Class[]{ProtoReader.class}, Border.class)) {
                    return (Border) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12312, new Class[]{ProtoReader.class}, Border.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.icon((Image) Image.ADAPTER.decode(protoReader2));
                                break;
                            case 2:
                                builder.level((Long) ProtoAdapter.INT64.decode(protoReader2));
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

            public final void encode(ProtoWriter protoWriter, Border border) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                Border border2 = border;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, border2}, this, changeQuickRedirect, false, 12311, new Class[]{ProtoWriter.class, Border.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, border2}, this, changeQuickRedirect, false, 12311, new Class[]{ProtoWriter.class, Border.class}, Void.TYPE);
                    return;
                }
                if (border2.icon != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter2, 1, border2.icon);
                }
                if (border2.level != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, border2.level);
                }
                protoWriter2.writeBytes(border.unknownFields());
            }
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12305, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12305, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.icon = this.icon;
            builder.level = this.level;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final int hashCode() {
            int i;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12307, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12307, new Class[0], Integer.TYPE)).intValue();
            }
            int i3 = this.hashCode;
            if (i3 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.icon != null) {
                    i = this.icon.hashCode();
                } else {
                    i = 0;
                }
                int i4 = (hashCode + i) * 37;
                if (this.level != null) {
                    i2 = this.level.hashCode();
                }
                i3 = i4 + i2;
                this.hashCode = i3;
            }
            return i3;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12308, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12308, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.icon != null) {
                sb.append(", icon=");
                sb.append(this.icon);
            }
            if (this.level != null) {
                sb.append(", level=");
                sb.append(this.level);
            }
            StringBuilder replace = sb.replace(0, 2, "Border{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12306, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12306, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof Border)) {
                    return false;
                }
                Border border = (Border) obj;
                if (!unknownFields().equals(border.unknownFields()) || !Internal.equals(this.icon, border.icon) || !Internal.equals(this.level, border.level)) {
                    return false;
                }
                return true;
            }
        }

        public Border(Image image, Long l) {
            this(image, l, ByteString.EMPTY);
        }

        public Border(Image image, Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            this.icon = image;
            this.level = l;
        }
    }

    public static final class FansClub extends Message<FansClub, Builder> {
        public static final ProtoAdapter<FansClub> ADAPTER = new ProtoAdapter_FansClub();
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User$FansClub$FansClubData#ADAPTER", tag = 1)
        public final FansClubData data;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User$FansClub$FansClubData#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
        public final Map<Integer, FansClubData> prefer_data;

        public static final class FansClubData extends Message<FansClubData, Builder> {
            public static final ProtoAdapter<FansClubData> ADAPTER = new ProtoAdapter_FansClubData();
            public static final Long DEFAULT_ANCHOR_ID = 0L;
            public static final Integer DEFAULT_LEVEL = 0;
            public static final UserFansClubStatus DEFAULT_USER_FANS_CLUB_STATUS = UserFansClubStatus.NotJoined;
            public static ChangeQuickRedirect changeQuickRedirect;
            private static final long serialVersionUID = 0;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
            public final Long anchor_id;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REPEATED, tag = 5)
            public final List<Long> available_gift_ids;
            @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User$FansClub$FansClubData$UserBadge#ADAPTER", tag = 4)
            public final UserBadge badge;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
            public final String club_name;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
            public final Integer level;
            @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User$FansClub$FansClubData$UserFansClubStatus#ADAPTER", tag = 3)
            public final UserFansClubStatus user_fans_club_status;

            public static final class UserBadge extends Message<UserBadge, Builder> {
                public static final ProtoAdapter<UserBadge> ADAPTER = new ProtoAdapter_UserBadge();
                public static ChangeQuickRedirect changeQuickRedirect;
                private static final long serialVersionUID = 0;
                @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
                public final Map<Integer, Image> icons;
                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
                public final String title;

                public static final class Builder extends Message.Builder<UserBadge, Builder> {
                    public static ChangeQuickRedirect changeQuickRedirect;
                    public Map<Integer, Image> icons = Internal.newMutableMap();
                    public String title;

                    public final UserBadge build() {
                        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12342, new Class[0], UserBadge.class)) {
                            return new UserBadge(this.icons, this.title, super.buildUnknownFields());
                        }
                        return (UserBadge) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12342, new Class[0], UserBadge.class);
                    }

                    public final Builder title(String str) {
                        this.title = str;
                        return this;
                    }

                    public final Builder icons(Map<Integer, Image> map) {
                        if (PatchProxy.isSupport(new Object[]{map}, this, changeQuickRedirect, false, 12341, new Class[]{Map.class}, Builder.class)) {
                            return (Builder) PatchProxy.accessDispatch(new Object[]{map}, this, changeQuickRedirect, false, 12341, new Class[]{Map.class}, Builder.class);
                        }
                        Internal.checkElementsNotNull(map);
                        this.icons = map;
                        return this;
                    }
                }

                static final class ProtoAdapter_UserBadge extends ProtoAdapter<UserBadge> {
                    public static ChangeQuickRedirect changeQuickRedirect;
                    private final ProtoAdapter<Map<Integer, Image>> icons = ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, Image.ADAPTER);

                    ProtoAdapter_UserBadge() {
                        super(FieldEncoding.LENGTH_DELIMITED, UserBadge.class);
                    }

                    public final int encodedSize(UserBadge userBadge) {
                        UserBadge userBadge2 = userBadge;
                        int i = 0;
                        if (PatchProxy.isSupport(new Object[]{userBadge2}, this, changeQuickRedirect, false, 12343, new Class[]{UserBadge.class}, Integer.TYPE)) {
                            return ((Integer) PatchProxy.accessDispatch(new Object[]{userBadge2}, this, changeQuickRedirect, false, 12343, new Class[]{UserBadge.class}, Integer.TYPE)).intValue();
                        }
                        int encodedSizeWithTag = this.icons.encodedSizeWithTag(1, userBadge2.icons);
                        if (userBadge2.title != null) {
                            i = ProtoAdapter.STRING.encodedSizeWithTag(2, userBadge2.title);
                        }
                        return encodedSizeWithTag + i + userBadge.unknownFields().size();
                    }

                    public final UserBadge redact(UserBadge userBadge) {
                        if (PatchProxy.isSupport(new Object[]{userBadge}, this, changeQuickRedirect, false, 12346, new Class[]{UserBadge.class}, UserBadge.class)) {
                            return (UserBadge) PatchProxy.accessDispatch(new Object[]{userBadge}, this, changeQuickRedirect, false, 12346, new Class[]{UserBadge.class}, UserBadge.class);
                        }
                        Builder newBuilder = userBadge.newBuilder();
                        Internal.redactElements(newBuilder.icons, Image.ADAPTER);
                        newBuilder.clearUnknownFields();
                        return newBuilder.build();
                    }

                    public final UserBadge decode(ProtoReader protoReader) throws IOException {
                        ProtoReader protoReader2 = protoReader;
                        if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12345, new Class[]{ProtoReader.class}, UserBadge.class)) {
                            return (UserBadge) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12345, new Class[]{ProtoReader.class}, UserBadge.class);
                        }
                        Builder builder = new Builder();
                        long beginMessage = protoReader.beginMessage();
                        while (true) {
                            int nextTag = protoReader.nextTag();
                            if (nextTag != -1) {
                                switch (nextTag) {
                                    case 1:
                                        builder.icons.putAll((Map) this.icons.decode(protoReader2));
                                        break;
                                    case 2:
                                        builder.title((String) ProtoAdapter.STRING.decode(protoReader2));
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

                    public final void encode(ProtoWriter protoWriter, UserBadge userBadge) throws IOException {
                        ProtoWriter protoWriter2 = protoWriter;
                        UserBadge userBadge2 = userBadge;
                        if (PatchProxy.isSupport(new Object[]{protoWriter2, userBadge2}, this, changeQuickRedirect, false, 12344, new Class[]{ProtoWriter.class, UserBadge.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{protoWriter2, userBadge2}, this, changeQuickRedirect, false, 12344, new Class[]{ProtoWriter.class, UserBadge.class}, Void.TYPE);
                            return;
                        }
                        this.icons.encodeWithTag(protoWriter2, 1, userBadge2.icons);
                        if (userBadge2.title != null) {
                            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, userBadge2.title);
                        }
                        protoWriter2.writeBytes(userBadge.unknownFields());
                    }
                }

                public final int hashCode() {
                    int i = 0;
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12339, new Class[0], Integer.TYPE)) {
                        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12339, new Class[0], Integer.TYPE)).intValue();
                    }
                    int i2 = this.hashCode;
                    if (i2 == 0) {
                        int hashCode = ((unknownFields().hashCode() * 37) + this.icons.hashCode()) * 37;
                        if (this.title != null) {
                            i = this.title.hashCode();
                        }
                        i2 = hashCode + i;
                        this.hashCode = i2;
                    }
                    return i2;
                }

                public final Builder newBuilder() {
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12337, new Class[0], Builder.class)) {
                        return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12337, new Class[0], Builder.class);
                    }
                    Builder builder = new Builder();
                    builder.icons = Internal.copyOf("icons", this.icons);
                    builder.title = this.title;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12340, new Class[0], String.class)) {
                        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12340, new Class[0], String.class);
                    }
                    StringBuilder sb = new StringBuilder();
                    if (!this.icons.isEmpty()) {
                        sb.append(", icons=");
                        sb.append(this.icons);
                    }
                    if (this.title != null) {
                        sb.append(", title=");
                        sb.append(this.title);
                    }
                    StringBuilder replace = sb.replace(0, 2, "UserBadge{");
                    replace.append('}');
                    return replace.toString();
                }

                public final boolean equals(Object obj) {
                    if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12338, new Class[]{Object.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12338, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
                    } else if (obj == this) {
                        return true;
                    } else {
                        if (!(obj instanceof UserBadge)) {
                            return false;
                        }
                        UserBadge userBadge = (UserBadge) obj;
                        if (!unknownFields().equals(userBadge.unknownFields()) || !this.icons.equals(userBadge.icons) || !Internal.equals(this.title, userBadge.title)) {
                            return false;
                        }
                        return true;
                    }
                }

                public UserBadge(Map<Integer, Image> map, String str) {
                    this(map, str, ByteString.EMPTY);
                }

                public UserBadge(Map<Integer, Image> map, String str, ByteString byteString) {
                    super(ADAPTER, byteString);
                    this.icons = Internal.immutableCopyOf("icons", map);
                    this.title = str;
                }
            }

            public enum BadgeIcon implements WireEnum {
                Unknown(0),
                Icon(1),
                SmallIcon(2);
                
                public static final ProtoAdapter<BadgeIcon> ADAPTER = null;
                public static ChangeQuickRedirect changeQuickRedirect;
                private final int value;

                public final int getValue() {
                    return this.value;
                }

                static {
                    ADAPTER = ProtoAdapter.newEnumAdapter(BadgeIcon.class);
                }

                public static BadgeIcon fromValue(int i) {
                    switch (i) {
                        case 0:
                            return Unknown;
                        case 1:
                            return Icon;
                        case 2:
                            return SmallIcon;
                        default:
                            return null;
                    }
                }

                private BadgeIcon(int i) {
                    this.value = i;
                }
            }

            public static final class Builder extends Message.Builder<FansClubData, Builder> {
                public static ChangeQuickRedirect changeQuickRedirect;
                public Long anchor_id;
                public List<Long> available_gift_ids = Internal.newMutableList();
                public UserBadge badge;
                public String club_name;
                public Integer level;
                public UserFansClubStatus user_fans_club_status;

                public final FansClubData build() {
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12332, new Class[0], FansClubData.class)) {
                        return (FansClubData) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12332, new Class[0], FansClubData.class);
                    }
                    FansClubData fansClubData = new FansClubData(this.club_name, this.level, this.user_fans_club_status, this.badge, this.available_gift_ids, this.anchor_id, super.buildUnknownFields());
                    return fansClubData;
                }

                public final Builder anchor_id(Long l) {
                    this.anchor_id = l;
                    return this;
                }

                public final Builder badge(UserBadge userBadge) {
                    this.badge = userBadge;
                    return this;
                }

                public final Builder club_name(String str) {
                    this.club_name = str;
                    return this;
                }

                public final Builder level(Integer num) {
                    this.level = num;
                    return this;
                }

                public final Builder user_fans_club_status(UserFansClubStatus userFansClubStatus) {
                    this.user_fans_club_status = userFansClubStatus;
                    return this;
                }

                public final Builder available_gift_ids(List<Long> list) {
                    if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 12331, new Class[]{List.class}, Builder.class)) {
                        return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 12331, new Class[]{List.class}, Builder.class);
                    }
                    Internal.checkElementsNotNull(list);
                    this.available_gift_ids = list;
                    return this;
                }
            }

            static final class ProtoAdapter_FansClubData extends ProtoAdapter<FansClubData> {
                public static ChangeQuickRedirect changeQuickRedirect;

                ProtoAdapter_FansClubData() {
                    super(FieldEncoding.LENGTH_DELIMITED, FansClubData.class);
                }

                public final FansClubData redact(FansClubData fansClubData) {
                    if (PatchProxy.isSupport(new Object[]{fansClubData}, this, changeQuickRedirect, false, 12336, new Class[]{FansClubData.class}, FansClubData.class)) {
                        return (FansClubData) PatchProxy.accessDispatch(new Object[]{fansClubData}, this, changeQuickRedirect, false, 12336, new Class[]{FansClubData.class}, FansClubData.class);
                    }
                    Builder newBuilder = fansClubData.newBuilder();
                    if (newBuilder.badge != null) {
                        newBuilder.badge = (UserBadge) UserBadge.ADAPTER.redact(newBuilder.badge);
                    }
                    newBuilder.clearUnknownFields();
                    return newBuilder.build();
                }

                public final FansClubData decode(ProtoReader protoReader) throws IOException {
                    ProtoReader protoReader2 = protoReader;
                    if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12335, new Class[]{ProtoReader.class}, FansClubData.class)) {
                        return (FansClubData) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12335, new Class[]{ProtoReader.class}, FansClubData.class);
                    }
                    Builder builder = new Builder();
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag != -1) {
                            switch (nextTag) {
                                case 1:
                                    builder.club_name((String) ProtoAdapter.STRING.decode(protoReader2));
                                    break;
                                case 2:
                                    builder.level((Integer) ProtoAdapter.INT32.decode(protoReader2));
                                    break;
                                case 3:
                                    try {
                                        builder.user_fans_club_status((UserFansClubStatus) UserFansClubStatus.ADAPTER.decode(protoReader2));
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                        break;
                                    }
                                case 4:
                                    builder.badge((UserBadge) UserBadge.ADAPTER.decode(protoReader2));
                                    break;
                                case 5:
                                    builder.available_gift_ids.add(ProtoAdapter.INT64.decode(protoReader2));
                                    break;
                                case 6:
                                    builder.anchor_id((Long) ProtoAdapter.INT64.decode(protoReader2));
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

                public final int encodedSize(FansClubData fansClubData) {
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    FansClubData fansClubData2 = fansClubData;
                    int i5 = 0;
                    if (PatchProxy.isSupport(new Object[]{fansClubData2}, this, changeQuickRedirect, false, 12333, new Class[]{FansClubData.class}, Integer.TYPE)) {
                        return ((Integer) PatchProxy.accessDispatch(new Object[]{fansClubData2}, this, changeQuickRedirect, false, 12333, new Class[]{FansClubData.class}, Integer.TYPE)).intValue();
                    }
                    if (fansClubData2.club_name != null) {
                        i = ProtoAdapter.STRING.encodedSizeWithTag(1, fansClubData2.club_name);
                    } else {
                        i = 0;
                    }
                    if (fansClubData2.level != null) {
                        i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, fansClubData2.level);
                    } else {
                        i2 = 0;
                    }
                    int i6 = i + i2;
                    if (fansClubData2.user_fans_club_status != null) {
                        i3 = UserFansClubStatus.ADAPTER.encodedSizeWithTag(3, fansClubData2.user_fans_club_status);
                    } else {
                        i3 = 0;
                    }
                    int i7 = i6 + i3;
                    if (fansClubData2.badge != null) {
                        i4 = UserBadge.ADAPTER.encodedSizeWithTag(4, fansClubData2.badge);
                    } else {
                        i4 = 0;
                    }
                    int encodedSizeWithTag = i7 + i4 + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(5, fansClubData2.available_gift_ids);
                    if (fansClubData2.anchor_id != null) {
                        i5 = ProtoAdapter.INT64.encodedSizeWithTag(6, fansClubData2.anchor_id);
                    }
                    return encodedSizeWithTag + i5 + fansClubData.unknownFields().size();
                }

                public final void encode(ProtoWriter protoWriter, FansClubData fansClubData) throws IOException {
                    ProtoWriter protoWriter2 = protoWriter;
                    FansClubData fansClubData2 = fansClubData;
                    if (PatchProxy.isSupport(new Object[]{protoWriter2, fansClubData2}, this, changeQuickRedirect, false, 12334, new Class[]{ProtoWriter.class, FansClubData.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{protoWriter2, fansClubData2}, this, changeQuickRedirect, false, 12334, new Class[]{ProtoWriter.class, FansClubData.class}, Void.TYPE);
                        return;
                    }
                    if (fansClubData2.club_name != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, fansClubData2.club_name);
                    }
                    if (fansClubData2.level != null) {
                        ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, fansClubData2.level);
                    }
                    if (fansClubData2.user_fans_club_status != null) {
                        UserFansClubStatus.ADAPTER.encodeWithTag(protoWriter2, 3, fansClubData2.user_fans_club_status);
                    }
                    if (fansClubData2.badge != null) {
                        UserBadge.ADAPTER.encodeWithTag(protoWriter2, 4, fansClubData2.badge);
                    }
                    ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter2, 5, fansClubData2.available_gift_ids);
                    if (fansClubData2.anchor_id != null) {
                        ProtoAdapter.INT64.encodeWithTag(protoWriter2, 6, fansClubData2.anchor_id);
                    }
                    protoWriter2.writeBytes(fansClubData.unknownFields());
                }
            }

            public enum UserFansClubStatus implements WireEnum {
                NotJoined(0),
                Active(1),
                Inactive(2);
                
                public static final ProtoAdapter<UserFansClubStatus> ADAPTER = null;
                public static ChangeQuickRedirect changeQuickRedirect;
                private final int value;

                public final int getValue() {
                    return this.value;
                }

                static {
                    ADAPTER = ProtoAdapter.newEnumAdapter(UserFansClubStatus.class);
                }

                public static UserFansClubStatus fromValue(int i) {
                    switch (i) {
                        case 0:
                            return NotJoined;
                        case 1:
                            return Active;
                        case 2:
                            return Inactive;
                        default:
                            return null;
                    }
                }

                private UserFansClubStatus(int i) {
                    this.value = i;
                }
            }

            public final Builder newBuilder() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12325, new Class[0], Builder.class)) {
                    return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12325, new Class[0], Builder.class);
                }
                Builder builder = new Builder();
                builder.club_name = this.club_name;
                builder.level = this.level;
                builder.user_fans_club_status = this.user_fans_club_status;
                builder.badge = this.badge;
                builder.available_gift_ids = Internal.copyOf("available_gift_ids", this.available_gift_ids);
                builder.anchor_id = this.anchor_id;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final int hashCode() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 0;
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12327, new Class[0], Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12327, new Class[0], Integer.TYPE)).intValue();
                }
                int i6 = this.hashCode;
                if (i6 == 0) {
                    int hashCode = unknownFields().hashCode() * 37;
                    if (this.club_name != null) {
                        i = this.club_name.hashCode();
                    } else {
                        i = 0;
                    }
                    int i7 = (hashCode + i) * 37;
                    if (this.level != null) {
                        i2 = this.level.hashCode();
                    } else {
                        i2 = 0;
                    }
                    int i8 = (i7 + i2) * 37;
                    if (this.user_fans_club_status != null) {
                        i3 = this.user_fans_club_status.hashCode();
                    } else {
                        i3 = 0;
                    }
                    int i9 = (i8 + i3) * 37;
                    if (this.badge != null) {
                        i4 = this.badge.hashCode();
                    } else {
                        i4 = 0;
                    }
                    int hashCode2 = (((i9 + i4) * 37) + this.available_gift_ids.hashCode()) * 37;
                    if (this.anchor_id != null) {
                        i5 = this.anchor_id.hashCode();
                    }
                    i6 = hashCode2 + i5;
                    this.hashCode = i6;
                }
                return i6;
            }

            public final String toString() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12328, new Class[0], String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12328, new Class[0], String.class);
                }
                StringBuilder sb = new StringBuilder();
                if (this.club_name != null) {
                    sb.append(", club_name=");
                    sb.append(this.club_name);
                }
                if (this.level != null) {
                    sb.append(", level=");
                    sb.append(this.level);
                }
                if (this.user_fans_club_status != null) {
                    sb.append(", user_fans_club_status=");
                    sb.append(this.user_fans_club_status);
                }
                if (this.badge != null) {
                    sb.append(", badge=");
                    sb.append(this.badge);
                }
                if (!this.available_gift_ids.isEmpty()) {
                    sb.append(", available_gift_ids=");
                    sb.append(this.available_gift_ids);
                }
                if (this.anchor_id != null) {
                    sb.append(", anchor_id=");
                    sb.append(this.anchor_id);
                }
                StringBuilder replace = sb.replace(0, 2, "FansClubData{");
                replace.append('}');
                return replace.toString();
            }

            public final boolean equals(Object obj) {
                if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12326, new Class[]{Object.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12326, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
                } else if (obj == this) {
                    return true;
                } else {
                    if (!(obj instanceof FansClubData)) {
                        return false;
                    }
                    FansClubData fansClubData = (FansClubData) obj;
                    if (!unknownFields().equals(fansClubData.unknownFields()) || !Internal.equals(this.club_name, fansClubData.club_name) || !Internal.equals(this.level, fansClubData.level) || !Internal.equals(this.user_fans_club_status, fansClubData.user_fans_club_status) || !Internal.equals(this.badge, fansClubData.badge) || !this.available_gift_ids.equals(fansClubData.available_gift_ids) || !Internal.equals(this.anchor_id, fansClubData.anchor_id)) {
                        return false;
                    }
                    return true;
                }
            }

            public FansClubData(String str, Integer num, UserFansClubStatus userFansClubStatus, UserBadge userBadge, List<Long> list, Long l) {
                this(str, num, userFansClubStatus, userBadge, list, l, ByteString.EMPTY);
            }

            public FansClubData(String str, Integer num, UserFansClubStatus userFansClubStatus, UserBadge userBadge, List<Long> list, Long l, ByteString byteString) {
                super(ADAPTER, byteString);
                this.club_name = str;
                this.level = num;
                this.user_fans_club_status = userFansClubStatus;
                this.badge = userBadge;
                this.available_gift_ids = Internal.immutableCopyOf("available_gift_ids", list);
                this.anchor_id = l;
            }
        }

        public static final class Builder extends Message.Builder<FansClub, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public FansClubData data;
            public Map<Integer, FansClubData> prefer_data = Internal.newMutableMap();

            public final FansClub build() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12324, new Class[0], FansClub.class)) {
                    return new FansClub(this.data, this.prefer_data, super.buildUnknownFields());
                }
                return (FansClub) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12324, new Class[0], FansClub.class);
            }

            public final Builder data(FansClubData fansClubData) {
                this.data = fansClubData;
                return this;
            }

            public final Builder prefer_data(Map<Integer, FansClubData> map) {
                if (PatchProxy.isSupport(new Object[]{map}, this, changeQuickRedirect, false, 12323, new Class[]{Map.class}, Builder.class)) {
                    return (Builder) PatchProxy.accessDispatch(new Object[]{map}, this, changeQuickRedirect, false, 12323, new Class[]{Map.class}, Builder.class);
                }
                Internal.checkElementsNotNull(map);
                this.prefer_data = map;
                return this;
            }
        }

        public enum PreferntialType implements WireEnum {
            PresonalProfile(0),
            OtherRoom(1);
            
            public static final ProtoAdapter<PreferntialType> ADAPTER = null;
            public static ChangeQuickRedirect changeQuickRedirect;
            private final int value;

            public final int getValue() {
                return this.value;
            }

            static {
                ADAPTER = ProtoAdapter.newEnumAdapter(PreferntialType.class);
            }

            public static PreferntialType fromValue(int i) {
                switch (i) {
                    case 0:
                        return PresonalProfile;
                    case 1:
                        return OtherRoom;
                    default:
                        return null;
                }
            }

            private PreferntialType(int i) {
                this.value = i;
            }
        }

        static final class ProtoAdapter_FansClub extends ProtoAdapter<FansClub> {
            public static ChangeQuickRedirect changeQuickRedirect;
            private final ProtoAdapter<Map<Integer, FansClubData>> prefer_data = ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, FansClubData.ADAPTER);

            ProtoAdapter_FansClub() {
                super(FieldEncoding.LENGTH_DELIMITED, FansClub.class);
            }

            public final int encodedSize(FansClub fansClub) {
                FansClub fansClub2 = fansClub;
                int i = 0;
                if (PatchProxy.isSupport(new Object[]{fansClub2}, this, changeQuickRedirect, false, 12351, new Class[]{FansClub.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{fansClub2}, this, changeQuickRedirect, false, 12351, new Class[]{FansClub.class}, Integer.TYPE)).intValue();
                }
                if (fansClub2.data != null) {
                    i = FansClubData.ADAPTER.encodedSizeWithTag(1, fansClub2.data);
                }
                return i + this.prefer_data.encodedSizeWithTag(2, fansClub2.prefer_data) + fansClub.unknownFields().size();
            }

            public final FansClub redact(FansClub fansClub) {
                if (PatchProxy.isSupport(new Object[]{fansClub}, this, changeQuickRedirect, false, 12354, new Class[]{FansClub.class}, FansClub.class)) {
                    return (FansClub) PatchProxy.accessDispatch(new Object[]{fansClub}, this, changeQuickRedirect, false, 12354, new Class[]{FansClub.class}, FansClub.class);
                }
                Builder newBuilder = fansClub.newBuilder();
                if (newBuilder.data != null) {
                    newBuilder.data = (FansClubData) FansClubData.ADAPTER.redact(newBuilder.data);
                }
                Internal.redactElements(newBuilder.prefer_data, FansClubData.ADAPTER);
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final FansClub decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12353, new Class[]{ProtoReader.class}, FansClub.class)) {
                    return (FansClub) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12353, new Class[]{ProtoReader.class}, FansClub.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.data((FansClubData) FansClubData.ADAPTER.decode(protoReader2));
                                break;
                            case 2:
                                builder.prefer_data.putAll((Map) this.prefer_data.decode(protoReader2));
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

            public final void encode(ProtoWriter protoWriter, FansClub fansClub) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                FansClub fansClub2 = fansClub;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, fansClub2}, this, changeQuickRedirect, false, 12352, new Class[]{ProtoWriter.class, FansClub.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, fansClub2}, this, changeQuickRedirect, false, 12352, new Class[]{ProtoWriter.class, FansClub.class}, Void.TYPE);
                    return;
                }
                if (fansClub2.data != null) {
                    FansClubData.ADAPTER.encodeWithTag(protoWriter2, 1, fansClub2.data);
                }
                this.prefer_data.encodeWithTag(protoWriter2, 2, fansClub2.prefer_data);
                protoWriter2.writeBytes(fansClub.unknownFields());
            }
        }

        public final int hashCode() {
            int i = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12321, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12321, new Class[0], Integer.TYPE)).intValue();
            }
            int i2 = this.hashCode;
            if (i2 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.data != null) {
                    i = this.data.hashCode();
                }
                i2 = ((hashCode + i) * 37) + this.prefer_data.hashCode();
                this.hashCode = i2;
            }
            return i2;
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12319, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12319, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.data = this.data;
            builder.prefer_data = Internal.copyOf("prefer_data", this.prefer_data);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12322, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12322, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.data != null) {
                sb.append(", data=");
                sb.append(this.data);
            }
            if (!this.prefer_data.isEmpty()) {
                sb.append(", prefer_data=");
                sb.append(this.prefer_data);
            }
            StringBuilder replace = sb.replace(0, 2, "FansClub{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12320, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12320, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof FansClub)) {
                    return false;
                }
                FansClub fansClub = (FansClub) obj;
                if (!unknownFields().equals(fansClub.unknownFields()) || !Internal.equals(this.data, fansClub.data) || !this.prefer_data.equals(fansClub.prefer_data)) {
                    return false;
                }
                return true;
            }
        }

        public FansClub(FansClubData fansClubData, Map<Integer, FansClubData> map) {
            this(fansClubData, map, ByteString.EMPTY);
        }

        public FansClub(FansClubData fansClubData, Map<Integer, FansClubData> map, ByteString byteString) {
            super(ADAPTER, byteString);
            this.data = fansClubData;
            this.prefer_data = Internal.immutableCopyOf("prefer_data", map);
        }
    }

    public static final class FollowInfo extends Message<FollowInfo, Builder> {
        public static final ProtoAdapter<FollowInfo> ADAPTER = new ProtoAdapter_FollowInfo();
        public static final Long DEFAULT_FOLLOWER_COUNT = 0L;
        public static final Long DEFAULT_FOLLOWING_COUNT = 0L;
        public static final Long DEFAULT_FOLLOW_STATUS = 0L;
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
        public final Long follow_status;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
        public final Long follower_count;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
        public final Long following_count;

        public static final class Builder extends Message.Builder<FollowInfo, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public Long follow_status;
            public Long follower_count;
            public Long following_count;

            public final FollowInfo build() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12359, new Class[0], FollowInfo.class)) {
                    return new FollowInfo(this.following_count, this.follower_count, this.follow_status, super.buildUnknownFields());
                }
                return (FollowInfo) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12359, new Class[0], FollowInfo.class);
            }

            public final Builder follow_status(Long l) {
                this.follow_status = l;
                return this;
            }

            public final Builder follower_count(Long l) {
                this.follower_count = l;
                return this;
            }

            public final Builder following_count(Long l) {
                this.following_count = l;
                return this;
            }
        }

        static final class ProtoAdapter_FollowInfo extends ProtoAdapter<FollowInfo> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_FollowInfo() {
                super(FieldEncoding.LENGTH_DELIMITED, FollowInfo.class);
            }

            public final int encodedSize(FollowInfo followInfo) {
                int i;
                int i2;
                FollowInfo followInfo2 = followInfo;
                int i3 = 0;
                if (PatchProxy.isSupport(new Object[]{followInfo2}, this, changeQuickRedirect, false, 12360, new Class[]{FollowInfo.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{followInfo2}, this, changeQuickRedirect, false, 12360, new Class[]{FollowInfo.class}, Integer.TYPE)).intValue();
                }
                if (followInfo2.following_count != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, followInfo2.following_count);
                } else {
                    i = 0;
                }
                if (followInfo2.follower_count != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, followInfo2.follower_count);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (followInfo2.follow_status != null) {
                    i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, followInfo2.follow_status);
                }
                return i4 + i3 + followInfo.unknownFields().size();
            }

            public final FollowInfo redact(FollowInfo followInfo) {
                if (PatchProxy.isSupport(new Object[]{followInfo}, this, changeQuickRedirect, false, 12363, new Class[]{FollowInfo.class}, FollowInfo.class)) {
                    return (FollowInfo) PatchProxy.accessDispatch(new Object[]{followInfo}, this, changeQuickRedirect, false, 12363, new Class[]{FollowInfo.class}, FollowInfo.class);
                }
                Builder newBuilder = followInfo.newBuilder();
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final FollowInfo decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12362, new Class[]{ProtoReader.class}, FollowInfo.class)) {
                    return (FollowInfo) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12362, new Class[]{ProtoReader.class}, FollowInfo.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.following_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 2:
                                builder.follower_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 3:
                                builder.follow_status((Long) ProtoAdapter.INT64.decode(protoReader2));
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

            public final void encode(ProtoWriter protoWriter, FollowInfo followInfo) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                FollowInfo followInfo2 = followInfo;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, followInfo2}, this, changeQuickRedirect, false, 12361, new Class[]{ProtoWriter.class, FollowInfo.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, followInfo2}, this, changeQuickRedirect, false, 12361, new Class[]{ProtoWriter.class, FollowInfo.class}, Void.TYPE);
                    return;
                }
                if (followInfo2.following_count != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, followInfo2.following_count);
                }
                if (followInfo2.follower_count != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, followInfo2.follower_count);
                }
                if (followInfo2.follow_status != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, followInfo2.follow_status);
                }
                protoWriter2.writeBytes(followInfo.unknownFields());
            }
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12355, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12355, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.following_count = this.following_count;
            builder.follower_count = this.follower_count;
            builder.follow_status = this.follow_status;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12357, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12357, new Class[0], Integer.TYPE)).intValue();
            }
            int i4 = this.hashCode;
            if (i4 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.following_count != null) {
                    i = this.following_count.hashCode();
                } else {
                    i = 0;
                }
                int i5 = (hashCode + i) * 37;
                if (this.follower_count != null) {
                    i2 = this.follower_count.hashCode();
                } else {
                    i2 = 0;
                }
                int i6 = (i5 + i2) * 37;
                if (this.follow_status != null) {
                    i3 = this.follow_status.hashCode();
                }
                i4 = i6 + i3;
                this.hashCode = i4;
            }
            return i4;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12358, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12358, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.following_count != null) {
                sb.append(", following_count=");
                sb.append(this.following_count);
            }
            if (this.follower_count != null) {
                sb.append(", follower_count=");
                sb.append(this.follower_count);
            }
            if (this.follow_status != null) {
                sb.append(", follow_status=");
                sb.append(this.follow_status);
            }
            StringBuilder replace = sb.replace(0, 2, "FollowInfo{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12356, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12356, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof FollowInfo)) {
                    return false;
                }
                FollowInfo followInfo = (FollowInfo) obj;
                if (!unknownFields().equals(followInfo.unknownFields()) || !Internal.equals(this.following_count, followInfo.following_count) || !Internal.equals(this.follower_count, followInfo.follower_count) || !Internal.equals(this.follow_status, followInfo.follow_status)) {
                    return false;
                }
                return true;
            }
        }

        public FollowInfo(Long l, Long l2, Long l3) {
            this(l, l2, l3, ByteString.EMPTY);
        }

        public FollowInfo(Long l, Long l2, Long l3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.following_count = l;
            this.follower_count = l2;
            this.follow_status = l3;
        }
    }

    public static final class OwnRoom extends Message<OwnRoom, Builder> {
        public static final ProtoAdapter<OwnRoom> ADAPTER = new ProtoAdapter_OwnRoom();
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REPEATED, tag = 1)
        public final List<Long> room_ids;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 2)
        public final List<String> room_ids_str;

        public static final class Builder extends Message.Builder<OwnRoom, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public List<Long> room_ids = Internal.newMutableList();
            public List<String> room_ids_str = Internal.newMutableList();

            public final OwnRoom build() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12370, new Class[0], OwnRoom.class)) {
                    return new OwnRoom(this.room_ids, this.room_ids_str, super.buildUnknownFields());
                }
                return (OwnRoom) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12370, new Class[0], OwnRoom.class);
            }

            public final Builder room_ids(List<Long> list) {
                if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 12368, new Class[]{List.class}, Builder.class)) {
                    return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 12368, new Class[]{List.class}, Builder.class);
                }
                Internal.checkElementsNotNull(list);
                this.room_ids = list;
                return this;
            }

            public final Builder room_ids_str(List<String> list) {
                if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 12369, new Class[]{List.class}, Builder.class)) {
                    return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 12369, new Class[]{List.class}, Builder.class);
                }
                Internal.checkElementsNotNull(list);
                this.room_ids_str = list;
                return this;
            }
        }

        static final class ProtoAdapter_OwnRoom extends ProtoAdapter<OwnRoom> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_OwnRoom() {
                super(FieldEncoding.LENGTH_DELIMITED, OwnRoom.class);
            }

            public final int encodedSize(OwnRoom ownRoom) {
                OwnRoom ownRoom2 = ownRoom;
                if (!PatchProxy.isSupport(new Object[]{ownRoom2}, this, changeQuickRedirect, false, 12371, new Class[]{OwnRoom.class}, Integer.TYPE)) {
                    return ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, ownRoom2.room_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, ownRoom2.room_ids_str) + ownRoom.unknownFields().size();
                }
                return ((Integer) PatchProxy.accessDispatch(new Object[]{ownRoom2}, this, changeQuickRedirect, false, 12371, new Class[]{OwnRoom.class}, Integer.TYPE)).intValue();
            }

            public final OwnRoom redact(OwnRoom ownRoom) {
                if (PatchProxy.isSupport(new Object[]{ownRoom}, this, changeQuickRedirect, false, 12374, new Class[]{OwnRoom.class}, OwnRoom.class)) {
                    return (OwnRoom) PatchProxy.accessDispatch(new Object[]{ownRoom}, this, changeQuickRedirect, false, 12374, new Class[]{OwnRoom.class}, OwnRoom.class);
                }
                Builder newBuilder = ownRoom.newBuilder();
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final OwnRoom decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12373, new Class[]{ProtoReader.class}, OwnRoom.class)) {
                    return (OwnRoom) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12373, new Class[]{ProtoReader.class}, OwnRoom.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.room_ids.add(ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 2:
                                builder.room_ids_str.add(ProtoAdapter.STRING.decode(protoReader2));
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

            public final void encode(ProtoWriter protoWriter, OwnRoom ownRoom) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                OwnRoom ownRoom2 = ownRoom;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, ownRoom2}, this, changeQuickRedirect, false, 12372, new Class[]{ProtoWriter.class, OwnRoom.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, ownRoom2}, this, changeQuickRedirect, false, 12372, new Class[]{ProtoWriter.class, OwnRoom.class}, Void.TYPE);
                    return;
                }
                ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter2, 1, ownRoom2.room_ids);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter2, 2, ownRoom2.room_ids_str);
                protoWriter2.writeBytes(ownRoom.unknownFields());
            }
        }

        public final int hashCode() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12366, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12366, new Class[0], Integer.TYPE)).intValue();
            }
            int i = this.hashCode;
            if (i == 0) {
                i = (((unknownFields().hashCode() * 37) + this.room_ids.hashCode()) * 37) + this.room_ids_str.hashCode();
                this.hashCode = i;
            }
            return i;
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12364, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12364, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.room_ids = Internal.copyOf("room_ids", this.room_ids);
            builder.room_ids_str = Internal.copyOf("room_ids_str", this.room_ids_str);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12367, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12367, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (!this.room_ids.isEmpty()) {
                sb.append(", room_ids=");
                sb.append(this.room_ids);
            }
            if (!this.room_ids_str.isEmpty()) {
                sb.append(", room_ids_str=");
                sb.append(this.room_ids_str);
            }
            StringBuilder replace = sb.replace(0, 2, "OwnRoom{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12365, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12365, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof OwnRoom)) {
                    return false;
                }
                OwnRoom ownRoom = (OwnRoom) obj;
                if (!unknownFields().equals(ownRoom.unknownFields()) || !this.room_ids.equals(ownRoom.room_ids) || !this.room_ids_str.equals(ownRoom.room_ids_str)) {
                    return false;
                }
                return true;
            }
        }

        public OwnRoom(List<Long> list, List<String> list2) {
            this(list, list2, ByteString.EMPTY);
        }

        public OwnRoom(List<Long> list, List<String> list2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.room_ids = Internal.immutableCopyOf("room_ids", list);
            this.room_ids_str = Internal.immutableCopyOf("room_ids_str", list2);
        }
    }

    public static final class PayGrade extends Message<PayGrade, Builder> {
        public static final ProtoAdapter<PayGrade> ADAPTER = new ProtoAdapter_PayGrade();
        public static final Long DEFAULT_LEVEL = 0L;
        public static final Long DEFAULT_NEXT_DIAMOND = 0L;
        public static final Long DEFAULT_NOW_DIAMOND = 0L;
        public static final Long DEFAULT_PAY_DIAMOND_BAK = 0L;
        public static final Long DEFAULT_SCORE = 0L;
        public static final Long DEFAULT_SCREEN_CHAT_TYPE = 0L;
        public static final Long DEFAULT_THIS_GRADE_MAX_DIAMOND = 0L;
        public static final Long DEFAULT_THIS_GRADE_MIN_DIAMOND = 0L;
        public static final Long DEFAULT_TOTAL_DIAMOND_COUNT = 0L;
        public static final Long DEFAULT_UPGRADE_NEED_CONSUME = 0L;
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 23)
        public final Image background;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 24)
        public final Image background_back;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 2)
        public final Image diamond_icon;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1001)
        public final String grade_banner;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 13)
        public final String grade_describe;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User$PayGrade$GradeIcon#ADAPTER", label = WireField.Label.REPEATED, tag = 14)
        public final List<GradeIcon> grade_icon_list;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 4)
        public final Image icon;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 16)
        public final Image im_icon;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 17)
        public final Image im_icon_with_level;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
        public final Long level;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 18)
        public final Image live_icon;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
        public final String name;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 19)
        public final Image new_im_icon_with_level;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 20)
        public final Image new_live_icon;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 8)
        public final Long next_diamond;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 7)
        public final Image next_icon;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
        public final String next_name;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 22)
        public final String next_privileges;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 9)
        public final Long now_diamond;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 12)
        public final Long pay_diamond_bak;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 1002)
        public final Image profile_dialog_bg;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 1003)
        public final Image profile_dialog_bg_back;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 25)
        public final Long score;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 15)
        public final Long screen_chat_type;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 11)
        public final Long this_grade_max_diamond;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 10)
        public final Long this_grade_min_diamond;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
        public final Long total_diamond_count;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 21)
        public final Long upgrade_need_consume;

        public static final class GradeIcon extends Message<GradeIcon, Builder> {
            public static final ProtoAdapter<GradeIcon> ADAPTER = new ProtoAdapter_GradeIcon();
            public static final Long DEFAULT_ICON_DIAMOND = 0L;
            public static final Long DEFAULT_LEVEL = 0L;
            public static ChangeQuickRedirect changeQuickRedirect;
            private static final long serialVersionUID = 0;
            @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Image#ADAPTER", tag = 1)
            public final Image icon;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
            public final Long icon_diamond;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
            public final Long level;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
            public final String level_str;

            public static final class Builder extends Message.Builder<GradeIcon, Builder> {
                public static ChangeQuickRedirect changeQuickRedirect;
                public Image icon;
                public Long icon_diamond;
                public Long level;
                public String level_str;

                public final GradeIcon build() {
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12385, new Class[0], GradeIcon.class)) {
                        return (GradeIcon) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12385, new Class[0], GradeIcon.class);
                    }
                    GradeIcon gradeIcon = new GradeIcon(this.icon, this.icon_diamond, this.level, this.level_str, super.buildUnknownFields());
                    return gradeIcon;
                }

                public final Builder icon(Image image) {
                    this.icon = image;
                    return this;
                }

                public final Builder icon_diamond(Long l) {
                    this.icon_diamond = l;
                    return this;
                }

                public final Builder level(Long l) {
                    this.level = l;
                    return this;
                }

                public final Builder level_str(String str) {
                    this.level_str = str;
                    return this;
                }
            }

            static final class ProtoAdapter_GradeIcon extends ProtoAdapter<GradeIcon> {
                public static ChangeQuickRedirect changeQuickRedirect;

                ProtoAdapter_GradeIcon() {
                    super(FieldEncoding.LENGTH_DELIMITED, GradeIcon.class);
                }

                public final GradeIcon redact(GradeIcon gradeIcon) {
                    if (PatchProxy.isSupport(new Object[]{gradeIcon}, this, changeQuickRedirect, false, 12389, new Class[]{GradeIcon.class}, GradeIcon.class)) {
                        return (GradeIcon) PatchProxy.accessDispatch(new Object[]{gradeIcon}, this, changeQuickRedirect, false, 12389, new Class[]{GradeIcon.class}, GradeIcon.class);
                    }
                    Builder newBuilder = gradeIcon.newBuilder();
                    if (newBuilder.icon != null) {
                        newBuilder.icon = (Image) Image.ADAPTER.redact(newBuilder.icon);
                    }
                    newBuilder.clearUnknownFields();
                    return newBuilder.build();
                }

                public final GradeIcon decode(ProtoReader protoReader) throws IOException {
                    ProtoReader protoReader2 = protoReader;
                    if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12388, new Class[]{ProtoReader.class}, GradeIcon.class)) {
                        return (GradeIcon) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12388, new Class[]{ProtoReader.class}, GradeIcon.class);
                    }
                    Builder builder = new Builder();
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag != -1) {
                            switch (nextTag) {
                                case 1:
                                    builder.icon((Image) Image.ADAPTER.decode(protoReader2));
                                    break;
                                case 2:
                                    builder.icon_diamond((Long) ProtoAdapter.INT64.decode(protoReader2));
                                    break;
                                case 3:
                                    builder.level((Long) ProtoAdapter.INT64.decode(protoReader2));
                                    break;
                                case 4:
                                    builder.level_str((String) ProtoAdapter.STRING.decode(protoReader2));
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

                public final int encodedSize(GradeIcon gradeIcon) {
                    int i;
                    int i2;
                    int i3;
                    GradeIcon gradeIcon2 = gradeIcon;
                    int i4 = 0;
                    if (PatchProxy.isSupport(new Object[]{gradeIcon2}, this, changeQuickRedirect, false, 12386, new Class[]{GradeIcon.class}, Integer.TYPE)) {
                        return ((Integer) PatchProxy.accessDispatch(new Object[]{gradeIcon2}, this, changeQuickRedirect, false, 12386, new Class[]{GradeIcon.class}, Integer.TYPE)).intValue();
                    }
                    if (gradeIcon2.icon != null) {
                        i = Image.ADAPTER.encodedSizeWithTag(1, gradeIcon2.icon);
                    } else {
                        i = 0;
                    }
                    if (gradeIcon2.icon_diamond != null) {
                        i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, gradeIcon2.icon_diamond);
                    } else {
                        i2 = 0;
                    }
                    int i5 = i + i2;
                    if (gradeIcon2.level != null) {
                        i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, gradeIcon2.level);
                    } else {
                        i3 = 0;
                    }
                    int i6 = i5 + i3;
                    if (gradeIcon2.level_str != null) {
                        i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, gradeIcon2.level_str);
                    }
                    return i6 + i4 + gradeIcon.unknownFields().size();
                }

                public final void encode(ProtoWriter protoWriter, GradeIcon gradeIcon) throws IOException {
                    ProtoWriter protoWriter2 = protoWriter;
                    GradeIcon gradeIcon2 = gradeIcon;
                    if (PatchProxy.isSupport(new Object[]{protoWriter2, gradeIcon2}, this, changeQuickRedirect, false, 12387, new Class[]{ProtoWriter.class, GradeIcon.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{protoWriter2, gradeIcon2}, this, changeQuickRedirect, false, 12387, new Class[]{ProtoWriter.class, GradeIcon.class}, Void.TYPE);
                        return;
                    }
                    if (gradeIcon2.icon != null) {
                        Image.ADAPTER.encodeWithTag(protoWriter2, 1, gradeIcon2.icon);
                    }
                    if (gradeIcon2.icon_diamond != null) {
                        ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, gradeIcon2.icon_diamond);
                    }
                    if (gradeIcon2.level != null) {
                        ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, gradeIcon2.level);
                    }
                    if (gradeIcon2.level_str != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, gradeIcon2.level_str);
                    }
                    protoWriter2.writeBytes(gradeIcon.unknownFields());
                }
            }

            public final int hashCode() {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12383, new Class[0], Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12383, new Class[0], Integer.TYPE)).intValue();
                }
                int i5 = this.hashCode;
                if (i5 == 0) {
                    int hashCode = unknownFields().hashCode() * 37;
                    if (this.icon != null) {
                        i = this.icon.hashCode();
                    } else {
                        i = 0;
                    }
                    int i6 = (hashCode + i) * 37;
                    if (this.icon_diamond != null) {
                        i2 = this.icon_diamond.hashCode();
                    } else {
                        i2 = 0;
                    }
                    int i7 = (i6 + i2) * 37;
                    if (this.level != null) {
                        i3 = this.level.hashCode();
                    } else {
                        i3 = 0;
                    }
                    int i8 = (i7 + i3) * 37;
                    if (this.level_str != null) {
                        i4 = this.level_str.hashCode();
                    }
                    i5 = i8 + i4;
                    this.hashCode = i5;
                }
                return i5;
            }

            public final Builder newBuilder() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12381, new Class[0], Builder.class)) {
                    return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12381, new Class[0], Builder.class);
                }
                Builder builder = new Builder();
                builder.icon = this.icon;
                builder.icon_diamond = this.icon_diamond;
                builder.level = this.level;
                builder.level_str = this.level_str;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12384, new Class[0], String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12384, new Class[0], String.class);
                }
                StringBuilder sb = new StringBuilder();
                if (this.icon != null) {
                    sb.append(", icon=");
                    sb.append(this.icon);
                }
                if (this.icon_diamond != null) {
                    sb.append(", icon_diamond=");
                    sb.append(this.icon_diamond);
                }
                if (this.level != null) {
                    sb.append(", level=");
                    sb.append(this.level);
                }
                if (this.level_str != null) {
                    sb.append(", level_str=");
                    sb.append(this.level_str);
                }
                StringBuilder replace = sb.replace(0, 2, "GradeIcon{");
                replace.append('}');
                return replace.toString();
            }

            public final boolean equals(Object obj) {
                if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12382, new Class[]{Object.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12382, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
                } else if (obj == this) {
                    return true;
                } else {
                    if (!(obj instanceof GradeIcon)) {
                        return false;
                    }
                    GradeIcon gradeIcon = (GradeIcon) obj;
                    if (!unknownFields().equals(gradeIcon.unknownFields()) || !Internal.equals(this.icon, gradeIcon.icon) || !Internal.equals(this.icon_diamond, gradeIcon.icon_diamond) || !Internal.equals(this.level, gradeIcon.level) || !Internal.equals(this.level_str, gradeIcon.level_str)) {
                        return false;
                    }
                    return true;
                }
            }

            public GradeIcon(Image image, Long l, Long l2, String str) {
                this(image, l, l2, str, ByteString.EMPTY);
            }

            public GradeIcon(Image image, Long l, Long l2, String str, ByteString byteString) {
                super(ADAPTER, byteString);
                this.icon = image;
                this.icon_diamond = l;
                this.level = l2;
                this.level_str = str;
            }
        }

        public static final class Builder extends Message.Builder<PayGrade, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public Image background;
            public Image background_back;
            public Image diamond_icon;
            public String grade_banner;
            public String grade_describe;
            public List<GradeIcon> grade_icon_list = Internal.newMutableList();
            public Image icon;
            public Image im_icon;
            public Image im_icon_with_level;
            public Long level;
            public Image live_icon;
            public String name;
            public Image new_im_icon_with_level;
            public Image new_live_icon;
            public Long next_diamond;
            public Image next_icon;
            public String next_name;
            public String next_privileges;
            public Long now_diamond;
            public Long pay_diamond_bak;
            public Image profile_dialog_bg;
            public Image profile_dialog_bg_back;
            public Long score;
            public Long screen_chat_type;
            public Long this_grade_max_diamond;
            public Long this_grade_min_diamond;
            public Long total_diamond_count;
            public Long upgrade_need_consume;

            public final PayGrade build() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12380, new Class[0], PayGrade.class)) {
                    return (PayGrade) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12380, new Class[0], PayGrade.class);
                }
                PayGrade payGrade = new PayGrade(this.total_diamond_count, this.diamond_icon, this.name, this.icon, this.next_name, this.level, this.next_icon, this.next_diamond, this.now_diamond, this.this_grade_min_diamond, this.this_grade_max_diamond, this.pay_diamond_bak, this.grade_describe, this.grade_icon_list, this.screen_chat_type, this.im_icon, this.im_icon_with_level, this.live_icon, this.new_im_icon_with_level, this.new_live_icon, this.upgrade_need_consume, this.next_privileges, this.background, this.background_back, this.score, this.grade_banner, this.profile_dialog_bg, this.profile_dialog_bg_back, super.buildUnknownFields());
                return payGrade;
            }

            public final Builder background(Image image) {
                this.background = image;
                return this;
            }

            public final Builder background_back(Image image) {
                this.background_back = image;
                return this;
            }

            public final Builder diamond_icon(Image image) {
                this.diamond_icon = image;
                return this;
            }

            public final Builder grade_banner(String str) {
                this.grade_banner = str;
                return this;
            }

            public final Builder grade_describe(String str) {
                this.grade_describe = str;
                return this;
            }

            public final Builder icon(Image image) {
                this.icon = image;
                return this;
            }

            public final Builder im_icon(Image image) {
                this.im_icon = image;
                return this;
            }

            public final Builder im_icon_with_level(Image image) {
                this.im_icon_with_level = image;
                return this;
            }

            public final Builder level(Long l) {
                this.level = l;
                return this;
            }

            public final Builder live_icon(Image image) {
                this.live_icon = image;
                return this;
            }

            public final Builder name(String str) {
                this.name = str;
                return this;
            }

            public final Builder new_im_icon_with_level(Image image) {
                this.new_im_icon_with_level = image;
                return this;
            }

            public final Builder new_live_icon(Image image) {
                this.new_live_icon = image;
                return this;
            }

            public final Builder next_diamond(Long l) {
                this.next_diamond = l;
                return this;
            }

            public final Builder next_icon(Image image) {
                this.next_icon = image;
                return this;
            }

            public final Builder next_name(String str) {
                this.next_name = str;
                return this;
            }

            public final Builder next_privileges(String str) {
                this.next_privileges = str;
                return this;
            }

            public final Builder now_diamond(Long l) {
                this.now_diamond = l;
                return this;
            }

            public final Builder pay_diamond_bak(Long l) {
                this.pay_diamond_bak = l;
                return this;
            }

            public final Builder profile_dialog_bg(Image image) {
                this.profile_dialog_bg = image;
                return this;
            }

            public final Builder profile_dialog_bg_back(Image image) {
                this.profile_dialog_bg_back = image;
                return this;
            }

            public final Builder score(Long l) {
                this.score = l;
                return this;
            }

            public final Builder screen_chat_type(Long l) {
                this.screen_chat_type = l;
                return this;
            }

            public final Builder this_grade_max_diamond(Long l) {
                this.this_grade_max_diamond = l;
                return this;
            }

            public final Builder this_grade_min_diamond(Long l) {
                this.this_grade_min_diamond = l;
                return this;
            }

            public final Builder total_diamond_count(Long l) {
                this.total_diamond_count = l;
                return this;
            }

            public final Builder upgrade_need_consume(Long l) {
                this.upgrade_need_consume = l;
                return this;
            }

            public final Builder grade_icon_list(List<GradeIcon> list) {
                if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 12379, new Class[]{List.class}, Builder.class)) {
                    return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 12379, new Class[]{List.class}, Builder.class);
                }
                Internal.checkElementsNotNull(list);
                this.grade_icon_list = list;
                return this;
            }
        }

        static final class ProtoAdapter_PayGrade extends ProtoAdapter<PayGrade> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_PayGrade() {
                super(FieldEncoding.LENGTH_DELIMITED, PayGrade.class);
            }

            public final PayGrade redact(PayGrade payGrade) {
                if (PatchProxy.isSupport(new Object[]{payGrade}, this, changeQuickRedirect, false, 12393, new Class[]{PayGrade.class}, PayGrade.class)) {
                    return (PayGrade) PatchProxy.accessDispatch(new Object[]{payGrade}, this, changeQuickRedirect, false, 12393, new Class[]{PayGrade.class}, PayGrade.class);
                }
                Builder newBuilder = payGrade.newBuilder();
                if (newBuilder.diamond_icon != null) {
                    newBuilder.diamond_icon = (Image) Image.ADAPTER.redact(newBuilder.diamond_icon);
                }
                if (newBuilder.icon != null) {
                    newBuilder.icon = (Image) Image.ADAPTER.redact(newBuilder.icon);
                }
                if (newBuilder.next_icon != null) {
                    newBuilder.next_icon = (Image) Image.ADAPTER.redact(newBuilder.next_icon);
                }
                Internal.redactElements(newBuilder.grade_icon_list, GradeIcon.ADAPTER);
                if (newBuilder.im_icon != null) {
                    newBuilder.im_icon = (Image) Image.ADAPTER.redact(newBuilder.im_icon);
                }
                if (newBuilder.im_icon_with_level != null) {
                    newBuilder.im_icon_with_level = (Image) Image.ADAPTER.redact(newBuilder.im_icon_with_level);
                }
                if (newBuilder.live_icon != null) {
                    newBuilder.live_icon = (Image) Image.ADAPTER.redact(newBuilder.live_icon);
                }
                if (newBuilder.new_im_icon_with_level != null) {
                    newBuilder.new_im_icon_with_level = (Image) Image.ADAPTER.redact(newBuilder.new_im_icon_with_level);
                }
                if (newBuilder.new_live_icon != null) {
                    newBuilder.new_live_icon = (Image) Image.ADAPTER.redact(newBuilder.new_live_icon);
                }
                if (newBuilder.background != null) {
                    newBuilder.background = (Image) Image.ADAPTER.redact(newBuilder.background);
                }
                if (newBuilder.background_back != null) {
                    newBuilder.background_back = (Image) Image.ADAPTER.redact(newBuilder.background_back);
                }
                if (newBuilder.profile_dialog_bg != null) {
                    newBuilder.profile_dialog_bg = (Image) Image.ADAPTER.redact(newBuilder.profile_dialog_bg);
                }
                if (newBuilder.profile_dialog_bg_back != null) {
                    newBuilder.profile_dialog_bg_back = (Image) Image.ADAPTER.redact(newBuilder.profile_dialog_bg_back);
                }
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final PayGrade decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12392, new Class[]{ProtoReader.class}, PayGrade.class)) {
                    return (PayGrade) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12392, new Class[]{ProtoReader.class}, PayGrade.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.total_diamond_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 2:
                                builder.diamond_icon((Image) Image.ADAPTER.decode(protoReader2));
                                break;
                            case 3:
                                builder.name((String) ProtoAdapter.STRING.decode(protoReader2));
                                break;
                            case 4:
                                builder.icon((Image) Image.ADAPTER.decode(protoReader2));
                                break;
                            case 5:
                                builder.next_name((String) ProtoAdapter.STRING.decode(protoReader2));
                                break;
                            case 6:
                                builder.level((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case e.l /*7*/:
                                builder.next_icon((Image) Image.ADAPTER.decode(protoReader2));
                                break;
                            case 8:
                                builder.next_diamond((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 9:
                                builder.now_diamond((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 10:
                                builder.this_grade_min_diamond((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 11:
                                builder.this_grade_max_diamond((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                                builder.pay_diamond_bak((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 13:
                                builder.grade_describe((String) ProtoAdapter.STRING.decode(protoReader2));
                                break;
                            case 14:
                                builder.grade_icon_list.add(GradeIcon.ADAPTER.decode(protoReader2));
                                break;
                            case 15:
                                builder.screen_chat_type((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case SearchJediMixFeedAdapter.f42514c /*?: ONE_ARG  (16 int)*/:
                                builder.im_icon((Image) Image.ADAPTER.decode(protoReader2));
                                break;
                            case 17:
                                builder.im_icon_with_level((Image) Image.ADAPTER.decode(protoReader2));
                                break;
                            case 18:
                                builder.live_icon((Image) Image.ADAPTER.decode(protoReader2));
                                break;
                            case 19:
                                builder.new_im_icon_with_level((Image) Image.ADAPTER.decode(protoReader2));
                                break;
                            case 20:
                                builder.new_live_icon((Image) Image.ADAPTER.decode(protoReader2));
                                break;
                            case 21:
                                builder.upgrade_need_consume((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 22:
                                builder.next_privileges((String) ProtoAdapter.STRING.decode(protoReader2));
                                break;
                            case 23:
                                builder.background((Image) Image.ADAPTER.decode(protoReader2));
                                break;
                            case 24:
                                builder.background_back((Image) Image.ADAPTER.decode(protoReader2));
                                break;
                            case 25:
                                builder.score((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            default:
                                switch (nextTag) {
                                    case PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST /*1001*/:
                                        builder.grade_banner((String) ProtoAdapter.STRING.decode(protoReader2));
                                        break;
                                    case PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR /*1002*/:
                                        builder.profile_dialog_bg((Image) Image.ADAPTER.decode(protoReader2));
                                        break;
                                    case 1003:
                                        builder.profile_dialog_bg_back((Image) Image.ADAPTER.decode(protoReader2));
                                        break;
                                    default:
                                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                        break;
                                }
                        }
                    } else {
                        protoReader2.endMessage(beginMessage);
                        return builder.build();
                    }
                }
            }

            public final int encodedSize(PayGrade payGrade) {
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
                int i14;
                int i15;
                int i16;
                int i17;
                int i18;
                int i19;
                int i20;
                int i21;
                int i22;
                int i23;
                int i24;
                int i25;
                int i26;
                PayGrade payGrade2 = payGrade;
                int i27 = 0;
                if (PatchProxy.isSupport(new Object[]{payGrade2}, this, changeQuickRedirect, false, 12390, new Class[]{PayGrade.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{payGrade2}, this, changeQuickRedirect, false, 12390, new Class[]{PayGrade.class}, Integer.TYPE)).intValue();
                }
                if (payGrade2.total_diamond_count != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, payGrade2.total_diamond_count);
                } else {
                    i = 0;
                }
                if (payGrade2.diamond_icon != null) {
                    i2 = Image.ADAPTER.encodedSizeWithTag(2, payGrade2.diamond_icon);
                } else {
                    i2 = 0;
                }
                int i28 = i + i2;
                if (payGrade2.name != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, payGrade2.name);
                } else {
                    i3 = 0;
                }
                int i29 = i28 + i3;
                if (payGrade2.icon != null) {
                    i4 = Image.ADAPTER.encodedSizeWithTag(4, payGrade2.icon);
                } else {
                    i4 = 0;
                }
                int i30 = i29 + i4;
                if (payGrade2.next_name != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, payGrade2.next_name);
                } else {
                    i5 = 0;
                }
                int i31 = i30 + i5;
                if (payGrade2.level != null) {
                    i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, payGrade2.level);
                } else {
                    i6 = 0;
                }
                int i32 = i31 + i6;
                if (payGrade2.next_icon != null) {
                    i7 = Image.ADAPTER.encodedSizeWithTag(7, payGrade2.next_icon);
                } else {
                    i7 = 0;
                }
                int i33 = i32 + i7;
                if (payGrade2.next_diamond != null) {
                    i8 = ProtoAdapter.INT64.encodedSizeWithTag(8, payGrade2.next_diamond);
                } else {
                    i8 = 0;
                }
                int i34 = i33 + i8;
                if (payGrade2.now_diamond != null) {
                    i9 = ProtoAdapter.INT64.encodedSizeWithTag(9, payGrade2.now_diamond);
                } else {
                    i9 = 0;
                }
                int i35 = i34 + i9;
                if (payGrade2.this_grade_min_diamond != null) {
                    i10 = ProtoAdapter.INT64.encodedSizeWithTag(10, payGrade2.this_grade_min_diamond);
                } else {
                    i10 = 0;
                }
                int i36 = i35 + i10;
                if (payGrade2.this_grade_max_diamond != null) {
                    i11 = ProtoAdapter.INT64.encodedSizeWithTag(11, payGrade2.this_grade_max_diamond);
                } else {
                    i11 = 0;
                }
                int i37 = i36 + i11;
                if (payGrade2.pay_diamond_bak != null) {
                    i12 = ProtoAdapter.INT64.encodedSizeWithTag(12, payGrade2.pay_diamond_bak);
                } else {
                    i12 = 0;
                }
                int i38 = i37 + i12;
                if (payGrade2.grade_describe != null) {
                    i13 = ProtoAdapter.STRING.encodedSizeWithTag(13, payGrade2.grade_describe);
                } else {
                    i13 = 0;
                }
                int encodedSizeWithTag = i38 + i13 + GradeIcon.ADAPTER.asRepeated().encodedSizeWithTag(14, payGrade2.grade_icon_list);
                if (payGrade2.screen_chat_type != null) {
                    i14 = ProtoAdapter.INT64.encodedSizeWithTag(15, payGrade2.screen_chat_type);
                } else {
                    i14 = 0;
                }
                int i39 = encodedSizeWithTag + i14;
                if (payGrade2.im_icon != null) {
                    i15 = Image.ADAPTER.encodedSizeWithTag(16, payGrade2.im_icon);
                } else {
                    i15 = 0;
                }
                int i40 = i39 + i15;
                if (payGrade2.im_icon_with_level != null) {
                    i16 = Image.ADAPTER.encodedSizeWithTag(17, payGrade2.im_icon_with_level);
                } else {
                    i16 = 0;
                }
                int i41 = i40 + i16;
                if (payGrade2.live_icon != null) {
                    i17 = Image.ADAPTER.encodedSizeWithTag(18, payGrade2.live_icon);
                } else {
                    i17 = 0;
                }
                int i42 = i41 + i17;
                if (payGrade2.new_im_icon_with_level != null) {
                    i18 = Image.ADAPTER.encodedSizeWithTag(19, payGrade2.new_im_icon_with_level);
                } else {
                    i18 = 0;
                }
                int i43 = i42 + i18;
                if (payGrade2.new_live_icon != null) {
                    i19 = Image.ADAPTER.encodedSizeWithTag(20, payGrade2.new_live_icon);
                } else {
                    i19 = 0;
                }
                int i44 = i43 + i19;
                if (payGrade2.upgrade_need_consume != null) {
                    i20 = ProtoAdapter.INT64.encodedSizeWithTag(21, payGrade2.upgrade_need_consume);
                } else {
                    i20 = 0;
                }
                int i45 = i44 + i20;
                if (payGrade2.next_privileges != null) {
                    i21 = ProtoAdapter.STRING.encodedSizeWithTag(22, payGrade2.next_privileges);
                } else {
                    i21 = 0;
                }
                int i46 = i45 + i21;
                if (payGrade2.background != null) {
                    i22 = Image.ADAPTER.encodedSizeWithTag(23, payGrade2.background);
                } else {
                    i22 = 0;
                }
                int i47 = i46 + i22;
                if (payGrade2.background_back != null) {
                    i23 = Image.ADAPTER.encodedSizeWithTag(24, payGrade2.background_back);
                } else {
                    i23 = 0;
                }
                int i48 = i47 + i23;
                if (payGrade2.score != null) {
                    i24 = ProtoAdapter.INT64.encodedSizeWithTag(25, payGrade2.score);
                } else {
                    i24 = 0;
                }
                int i49 = i48 + i24;
                if (payGrade2.grade_banner != null) {
                    i25 = ProtoAdapter.STRING.encodedSizeWithTag(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST, payGrade2.grade_banner);
                } else {
                    i25 = 0;
                }
                int i50 = i49 + i25;
                if (payGrade2.profile_dialog_bg != null) {
                    i26 = Image.ADAPTER.encodedSizeWithTag(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR, payGrade2.profile_dialog_bg);
                } else {
                    i26 = 0;
                }
                int i51 = i50 + i26;
                if (payGrade2.profile_dialog_bg_back != null) {
                    i27 = Image.ADAPTER.encodedSizeWithTag(1003, payGrade2.profile_dialog_bg_back);
                }
                return i51 + i27 + payGrade.unknownFields().size();
            }

            public final void encode(ProtoWriter protoWriter, PayGrade payGrade) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                PayGrade payGrade2 = payGrade;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, payGrade2}, this, changeQuickRedirect, false, 12391, new Class[]{ProtoWriter.class, PayGrade.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, payGrade2}, this, changeQuickRedirect, false, 12391, new Class[]{ProtoWriter.class, PayGrade.class}, Void.TYPE);
                    return;
                }
                if (payGrade2.total_diamond_count != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, payGrade2.total_diamond_count);
                }
                if (payGrade2.diamond_icon != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter2, 2, payGrade2.diamond_icon);
                }
                if (payGrade2.name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, payGrade2.name);
                }
                if (payGrade2.icon != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter2, 4, payGrade2.icon);
                }
                if (payGrade2.next_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter2, 5, payGrade2.next_name);
                }
                if (payGrade2.level != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 6, payGrade2.level);
                }
                if (payGrade2.next_icon != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter2, 7, payGrade2.next_icon);
                }
                if (payGrade2.next_diamond != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 8, payGrade2.next_diamond);
                }
                if (payGrade2.now_diamond != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 9, payGrade2.now_diamond);
                }
                if (payGrade2.this_grade_min_diamond != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 10, payGrade2.this_grade_min_diamond);
                }
                if (payGrade2.this_grade_max_diamond != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 11, payGrade2.this_grade_max_diamond);
                }
                if (payGrade2.pay_diamond_bak != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 12, payGrade2.pay_diamond_bak);
                }
                if (payGrade2.grade_describe != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter2, 13, payGrade2.grade_describe);
                }
                GradeIcon.ADAPTER.asRepeated().encodeWithTag(protoWriter2, 14, payGrade2.grade_icon_list);
                if (payGrade2.screen_chat_type != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 15, payGrade2.screen_chat_type);
                }
                if (payGrade2.im_icon != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter2, 16, payGrade2.im_icon);
                }
                if (payGrade2.im_icon_with_level != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter2, 17, payGrade2.im_icon_with_level);
                }
                if (payGrade2.live_icon != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter2, 18, payGrade2.live_icon);
                }
                if (payGrade2.new_im_icon_with_level != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter2, 19, payGrade2.new_im_icon_with_level);
                }
                if (payGrade2.new_live_icon != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter2, 20, payGrade2.new_live_icon);
                }
                if (payGrade2.upgrade_need_consume != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 21, payGrade2.upgrade_need_consume);
                }
                if (payGrade2.next_privileges != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter2, 22, payGrade2.next_privileges);
                }
                if (payGrade2.background != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter2, 23, payGrade2.background);
                }
                if (payGrade2.background_back != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter2, 24, payGrade2.background_back);
                }
                if (payGrade2.score != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 25, payGrade2.score);
                }
                if (payGrade2.grade_banner != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter2, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST, payGrade2.grade_banner);
                }
                if (payGrade2.profile_dialog_bg != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter2, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR, payGrade2.profile_dialog_bg);
                }
                if (payGrade2.profile_dialog_bg_back != null) {
                    Image.ADAPTER.encodeWithTag(protoWriter2, 1003, payGrade2.profile_dialog_bg_back);
                }
                protoWriter2.writeBytes(payGrade.unknownFields());
            }
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12375, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12375, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.total_diamond_count = this.total_diamond_count;
            builder.diamond_icon = this.diamond_icon;
            builder.name = this.name;
            builder.icon = this.icon;
            builder.next_name = this.next_name;
            builder.level = this.level;
            builder.next_icon = this.next_icon;
            builder.next_diamond = this.next_diamond;
            builder.now_diamond = this.now_diamond;
            builder.this_grade_min_diamond = this.this_grade_min_diamond;
            builder.this_grade_max_diamond = this.this_grade_max_diamond;
            builder.pay_diamond_bak = this.pay_diamond_bak;
            builder.grade_describe = this.grade_describe;
            builder.grade_icon_list = Internal.copyOf("grade_icon_list", this.grade_icon_list);
            builder.screen_chat_type = this.screen_chat_type;
            builder.im_icon = this.im_icon;
            builder.im_icon_with_level = this.im_icon_with_level;
            builder.live_icon = this.live_icon;
            builder.new_im_icon_with_level = this.new_im_icon_with_level;
            builder.new_live_icon = this.new_live_icon;
            builder.upgrade_need_consume = this.upgrade_need_consume;
            builder.next_privileges = this.next_privileges;
            builder.background = this.background;
            builder.background_back = this.background_back;
            builder.score = this.score;
            builder.grade_banner = this.grade_banner;
            builder.profile_dialog_bg = this.profile_dialog_bg;
            builder.profile_dialog_bg_back = this.profile_dialog_bg_back;
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
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27 = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12377, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12377, new Class[0], Integer.TYPE)).intValue();
            }
            int i28 = this.hashCode;
            if (i28 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.total_diamond_count != null) {
                    i = this.total_diamond_count.hashCode();
                } else {
                    i = 0;
                }
                int i29 = (hashCode + i) * 37;
                if (this.diamond_icon != null) {
                    i2 = this.diamond_icon.hashCode();
                } else {
                    i2 = 0;
                }
                int i30 = (i29 + i2) * 37;
                if (this.name != null) {
                    i3 = this.name.hashCode();
                } else {
                    i3 = 0;
                }
                int i31 = (i30 + i3) * 37;
                if (this.icon != null) {
                    i4 = this.icon.hashCode();
                } else {
                    i4 = 0;
                }
                int i32 = (i31 + i4) * 37;
                if (this.next_name != null) {
                    i5 = this.next_name.hashCode();
                } else {
                    i5 = 0;
                }
                int i33 = (i32 + i5) * 37;
                if (this.level != null) {
                    i6 = this.level.hashCode();
                } else {
                    i6 = 0;
                }
                int i34 = (i33 + i6) * 37;
                if (this.next_icon != null) {
                    i7 = this.next_icon.hashCode();
                } else {
                    i7 = 0;
                }
                int i35 = (i34 + i7) * 37;
                if (this.next_diamond != null) {
                    i8 = this.next_diamond.hashCode();
                } else {
                    i8 = 0;
                }
                int i36 = (i35 + i8) * 37;
                if (this.now_diamond != null) {
                    i9 = this.now_diamond.hashCode();
                } else {
                    i9 = 0;
                }
                int i37 = (i36 + i9) * 37;
                if (this.this_grade_min_diamond != null) {
                    i10 = this.this_grade_min_diamond.hashCode();
                } else {
                    i10 = 0;
                }
                int i38 = (i37 + i10) * 37;
                if (this.this_grade_max_diamond != null) {
                    i11 = this.this_grade_max_diamond.hashCode();
                } else {
                    i11 = 0;
                }
                int i39 = (i38 + i11) * 37;
                if (this.pay_diamond_bak != null) {
                    i12 = this.pay_diamond_bak.hashCode();
                } else {
                    i12 = 0;
                }
                int i40 = (i39 + i12) * 37;
                if (this.grade_describe != null) {
                    i13 = this.grade_describe.hashCode();
                } else {
                    i13 = 0;
                }
                int hashCode2 = (((i40 + i13) * 37) + this.grade_icon_list.hashCode()) * 37;
                if (this.screen_chat_type != null) {
                    i14 = this.screen_chat_type.hashCode();
                } else {
                    i14 = 0;
                }
                int i41 = (hashCode2 + i14) * 37;
                if (this.im_icon != null) {
                    i15 = this.im_icon.hashCode();
                } else {
                    i15 = 0;
                }
                int i42 = (i41 + i15) * 37;
                if (this.im_icon_with_level != null) {
                    i16 = this.im_icon_with_level.hashCode();
                } else {
                    i16 = 0;
                }
                int i43 = (i42 + i16) * 37;
                if (this.live_icon != null) {
                    i17 = this.live_icon.hashCode();
                } else {
                    i17 = 0;
                }
                int i44 = (i43 + i17) * 37;
                if (this.new_im_icon_with_level != null) {
                    i18 = this.new_im_icon_with_level.hashCode();
                } else {
                    i18 = 0;
                }
                int i45 = (i44 + i18) * 37;
                if (this.new_live_icon != null) {
                    i19 = this.new_live_icon.hashCode();
                } else {
                    i19 = 0;
                }
                int i46 = (i45 + i19) * 37;
                if (this.upgrade_need_consume != null) {
                    i20 = this.upgrade_need_consume.hashCode();
                } else {
                    i20 = 0;
                }
                int i47 = (i46 + i20) * 37;
                if (this.next_privileges != null) {
                    i21 = this.next_privileges.hashCode();
                } else {
                    i21 = 0;
                }
                int i48 = (i47 + i21) * 37;
                if (this.background != null) {
                    i22 = this.background.hashCode();
                } else {
                    i22 = 0;
                }
                int i49 = (i48 + i22) * 37;
                if (this.background_back != null) {
                    i23 = this.background_back.hashCode();
                } else {
                    i23 = 0;
                }
                int i50 = (i49 + i23) * 37;
                if (this.score != null) {
                    i24 = this.score.hashCode();
                } else {
                    i24 = 0;
                }
                int i51 = (i50 + i24) * 37;
                if (this.grade_banner != null) {
                    i25 = this.grade_banner.hashCode();
                } else {
                    i25 = 0;
                }
                int i52 = (i51 + i25) * 37;
                if (this.profile_dialog_bg != null) {
                    i26 = this.profile_dialog_bg.hashCode();
                } else {
                    i26 = 0;
                }
                int i53 = (i52 + i26) * 37;
                if (this.profile_dialog_bg_back != null) {
                    i27 = this.profile_dialog_bg_back.hashCode();
                }
                i28 = i53 + i27;
                this.hashCode = i28;
            }
            return i28;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12378, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12378, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.total_diamond_count != null) {
                sb.append(", total_diamond_count=");
                sb.append(this.total_diamond_count);
            }
            if (this.diamond_icon != null) {
                sb.append(", diamond_icon=");
                sb.append(this.diamond_icon);
            }
            if (this.name != null) {
                sb.append(", name=");
                sb.append(this.name);
            }
            if (this.icon != null) {
                sb.append(", icon=");
                sb.append(this.icon);
            }
            if (this.next_name != null) {
                sb.append(", next_name=");
                sb.append(this.next_name);
            }
            if (this.level != null) {
                sb.append(", level=");
                sb.append(this.level);
            }
            if (this.next_icon != null) {
                sb.append(", next_icon=");
                sb.append(this.next_icon);
            }
            if (this.next_diamond != null) {
                sb.append(", next_diamond=");
                sb.append(this.next_diamond);
            }
            if (this.now_diamond != null) {
                sb.append(", now_diamond=");
                sb.append(this.now_diamond);
            }
            if (this.this_grade_min_diamond != null) {
                sb.append(", this_grade_min_diamond=");
                sb.append(this.this_grade_min_diamond);
            }
            if (this.this_grade_max_diamond != null) {
                sb.append(", this_grade_max_diamond=");
                sb.append(this.this_grade_max_diamond);
            }
            if (this.pay_diamond_bak != null) {
                sb.append(", pay_diamond_bak=");
                sb.append(this.pay_diamond_bak);
            }
            if (this.grade_describe != null) {
                sb.append(", grade_describe=");
                sb.append(this.grade_describe);
            }
            if (!this.grade_icon_list.isEmpty()) {
                sb.append(", grade_icon_list=");
                sb.append(this.grade_icon_list);
            }
            if (this.screen_chat_type != null) {
                sb.append(", screen_chat_type=");
                sb.append(this.screen_chat_type);
            }
            if (this.im_icon != null) {
                sb.append(", im_icon=");
                sb.append(this.im_icon);
            }
            if (this.im_icon_with_level != null) {
                sb.append(", im_icon_with_level=");
                sb.append(this.im_icon_with_level);
            }
            if (this.live_icon != null) {
                sb.append(", live_icon=");
                sb.append(this.live_icon);
            }
            if (this.new_im_icon_with_level != null) {
                sb.append(", new_im_icon_with_level=");
                sb.append(this.new_im_icon_with_level);
            }
            if (this.new_live_icon != null) {
                sb.append(", new_live_icon=");
                sb.append(this.new_live_icon);
            }
            if (this.upgrade_need_consume != null) {
                sb.append(", upgrade_need_consume=");
                sb.append(this.upgrade_need_consume);
            }
            if (this.next_privileges != null) {
                sb.append(", next_privileges=");
                sb.append(this.next_privileges);
            }
            if (this.background != null) {
                sb.append(", background=");
                sb.append(this.background);
            }
            if (this.background_back != null) {
                sb.append(", background_back=");
                sb.append(this.background_back);
            }
            if (this.score != null) {
                sb.append(", score=");
                sb.append(this.score);
            }
            if (this.grade_banner != null) {
                sb.append(", grade_banner=");
                sb.append(this.grade_banner);
            }
            if (this.profile_dialog_bg != null) {
                sb.append(", profile_dialog_bg=");
                sb.append(this.profile_dialog_bg);
            }
            if (this.profile_dialog_bg_back != null) {
                sb.append(", profile_dialog_bg_back=");
                sb.append(this.profile_dialog_bg_back);
            }
            StringBuilder replace = sb.replace(0, 2, "PayGrade{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12376, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12376, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof PayGrade)) {
                    return false;
                }
                PayGrade payGrade = (PayGrade) obj;
                if (!unknownFields().equals(payGrade.unknownFields()) || !Internal.equals(this.total_diamond_count, payGrade.total_diamond_count) || !Internal.equals(this.diamond_icon, payGrade.diamond_icon) || !Internal.equals(this.name, payGrade.name) || !Internal.equals(this.icon, payGrade.icon) || !Internal.equals(this.next_name, payGrade.next_name) || !Internal.equals(this.level, payGrade.level) || !Internal.equals(this.next_icon, payGrade.next_icon) || !Internal.equals(this.next_diamond, payGrade.next_diamond) || !Internal.equals(this.now_diamond, payGrade.now_diamond) || !Internal.equals(this.this_grade_min_diamond, payGrade.this_grade_min_diamond) || !Internal.equals(this.this_grade_max_diamond, payGrade.this_grade_max_diamond) || !Internal.equals(this.pay_diamond_bak, payGrade.pay_diamond_bak) || !Internal.equals(this.grade_describe, payGrade.grade_describe) || !this.grade_icon_list.equals(payGrade.grade_icon_list) || !Internal.equals(this.screen_chat_type, payGrade.screen_chat_type) || !Internal.equals(this.im_icon, payGrade.im_icon) || !Internal.equals(this.im_icon_with_level, payGrade.im_icon_with_level) || !Internal.equals(this.live_icon, payGrade.live_icon) || !Internal.equals(this.new_im_icon_with_level, payGrade.new_im_icon_with_level) || !Internal.equals(this.new_live_icon, payGrade.new_live_icon) || !Internal.equals(this.upgrade_need_consume, payGrade.upgrade_need_consume) || !Internal.equals(this.next_privileges, payGrade.next_privileges) || !Internal.equals(this.background, payGrade.background) || !Internal.equals(this.background_back, payGrade.background_back) || !Internal.equals(this.score, payGrade.score) || !Internal.equals(this.grade_banner, payGrade.grade_banner) || !Internal.equals(this.profile_dialog_bg, payGrade.profile_dialog_bg) || !Internal.equals(this.profile_dialog_bg_back, payGrade.profile_dialog_bg_back)) {
                    return false;
                }
                return true;
            }
        }

        public PayGrade(Long l, Image image, String str, Image image2, String str2, Long l2, Image image3, Long l3, Long l4, Long l5, Long l6, Long l7, String str3, List<GradeIcon> list, Long l8, Image image4, Image image5, Image image6, Image image7, Image image8, Long l9, String str4, Image image9, Image image10, Long l10, String str5, Image image11, Image image12) {
            this(l, image, str, image2, str2, l2, image3, l3, l4, l5, l6, l7, str3, list, l8, image4, image5, image6, image7, image8, l9, str4, image9, image10, l10, str5, image11, image12, ByteString.EMPTY);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PayGrade(Long l, Image image, String str, Image image2, String str2, Long l2, Image image3, Long l3, Long l4, Long l5, Long l6, Long l7, String str3, List<GradeIcon> list, Long l8, Image image4, Image image5, Image image6, Image image7, Image image8, Long l9, String str4, Image image9, Image image10, Long l10, String str5, Image image11, Image image12, ByteString byteString) {
            super(ADAPTER, byteString);
            this.total_diamond_count = l;
            this.diamond_icon = image;
            this.name = str;
            this.icon = image2;
            this.next_name = str2;
            this.level = l2;
            this.next_icon = image3;
            this.next_diamond = l3;
            this.now_diamond = l4;
            this.this_grade_min_diamond = l5;
            this.this_grade_max_diamond = l6;
            this.pay_diamond_bak = l7;
            this.grade_describe = str3;
            this.grade_icon_list = Internal.immutableCopyOf("grade_icon_list", list);
            this.screen_chat_type = l8;
            this.im_icon = image4;
            this.im_icon_with_level = image5;
            this.live_icon = image6;
            this.new_im_icon_with_level = image7;
            this.new_live_icon = image8;
            this.upgrade_need_consume = l9;
            this.next_privileges = str4;
            this.background = image9;
            this.background_back = image10;
            this.score = l10;
            this.grade_banner = str5;
            this.profile_dialog_bg = image11;
            this.profile_dialog_bg_back = image12;
        }
    }

    public static final class UserAttr extends Message<UserAttr, Builder> {
        public static final ProtoAdapter<UserAttr> ADAPTER = new ProtoAdapter_UserAttr();
        public static final Boolean DEFAULT_IS_ADMIN = Boolean.FALSE;
        public static final Boolean DEFAULT_IS_MUTED = Boolean.FALSE;
        public static final Boolean DEFAULT_IS_SUPER_ADMIN = Boolean.FALSE;
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
        public final Boolean is_admin;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
        public final Boolean is_muted;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
        public final Boolean is_super_admin;

        public static final class Builder extends Message.Builder<UserAttr, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public Boolean is_admin;
            public Boolean is_muted;
            public Boolean is_super_admin;

            public final UserAttr build() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12402, new Class[0], UserAttr.class)) {
                    return new UserAttr(this.is_muted, this.is_admin, this.is_super_admin, super.buildUnknownFields());
                }
                return (UserAttr) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12402, new Class[0], UserAttr.class);
            }

            public final Builder is_admin(Boolean bool) {
                this.is_admin = bool;
                return this;
            }

            public final Builder is_muted(Boolean bool) {
                this.is_muted = bool;
                return this;
            }

            public final Builder is_super_admin(Boolean bool) {
                this.is_super_admin = bool;
                return this;
            }
        }

        static final class ProtoAdapter_UserAttr extends ProtoAdapter<UserAttr> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_UserAttr() {
                super(FieldEncoding.LENGTH_DELIMITED, UserAttr.class);
            }

            public final int encodedSize(UserAttr userAttr) {
                int i;
                int i2;
                UserAttr userAttr2 = userAttr;
                int i3 = 0;
                if (PatchProxy.isSupport(new Object[]{userAttr2}, this, changeQuickRedirect, false, 12403, new Class[]{UserAttr.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{userAttr2}, this, changeQuickRedirect, false, 12403, new Class[]{UserAttr.class}, Integer.TYPE)).intValue();
                }
                if (userAttr2.is_muted != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, userAttr2.is_muted);
                } else {
                    i = 0;
                }
                if (userAttr2.is_admin != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, userAttr2.is_admin);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (userAttr2.is_super_admin != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, userAttr2.is_super_admin);
                }
                return i4 + i3 + userAttr.unknownFields().size();
            }

            public final UserAttr redact(UserAttr userAttr) {
                if (PatchProxy.isSupport(new Object[]{userAttr}, this, changeQuickRedirect, false, 12406, new Class[]{UserAttr.class}, UserAttr.class)) {
                    return (UserAttr) PatchProxy.accessDispatch(new Object[]{userAttr}, this, changeQuickRedirect, false, 12406, new Class[]{UserAttr.class}, UserAttr.class);
                }
                Builder newBuilder = userAttr.newBuilder();
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final UserAttr decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12405, new Class[]{ProtoReader.class}, UserAttr.class)) {
                    return (UserAttr) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12405, new Class[]{ProtoReader.class}, UserAttr.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.is_muted((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                break;
                            case 2:
                                builder.is_admin((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                break;
                            case 3:
                                builder.is_super_admin((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
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

            public final void encode(ProtoWriter protoWriter, UserAttr userAttr) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                UserAttr userAttr2 = userAttr;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, userAttr2}, this, changeQuickRedirect, false, 12404, new Class[]{ProtoWriter.class, UserAttr.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, userAttr2}, this, changeQuickRedirect, false, 12404, new Class[]{ProtoWriter.class, UserAttr.class}, Void.TYPE);
                    return;
                }
                if (userAttr2.is_muted != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1, userAttr2.is_muted);
                }
                if (userAttr2.is_admin != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 2, userAttr2.is_admin);
                }
                if (userAttr2.is_super_admin != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 3, userAttr2.is_super_admin);
                }
                protoWriter2.writeBytes(userAttr.unknownFields());
            }
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12398, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12398, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.is_muted = this.is_muted;
            builder.is_admin = this.is_admin;
            builder.is_super_admin = this.is_super_admin;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12400, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12400, new Class[0], Integer.TYPE)).intValue();
            }
            int i4 = this.hashCode;
            if (i4 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.is_muted != null) {
                    i = this.is_muted.hashCode();
                } else {
                    i = 0;
                }
                int i5 = (hashCode + i) * 37;
                if (this.is_admin != null) {
                    i2 = this.is_admin.hashCode();
                } else {
                    i2 = 0;
                }
                int i6 = (i5 + i2) * 37;
                if (this.is_super_admin != null) {
                    i3 = this.is_super_admin.hashCode();
                }
                i4 = i6 + i3;
                this.hashCode = i4;
            }
            return i4;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12401, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12401, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.is_muted != null) {
                sb.append(", is_muted=");
                sb.append(this.is_muted);
            }
            if (this.is_admin != null) {
                sb.append(", is_admin=");
                sb.append(this.is_admin);
            }
            if (this.is_super_admin != null) {
                sb.append(", is_super_admin=");
                sb.append(this.is_super_admin);
            }
            StringBuilder replace = sb.replace(0, 2, "UserAttr{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12399, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12399, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof UserAttr)) {
                    return false;
                }
                UserAttr userAttr = (UserAttr) obj;
                if (!unknownFields().equals(userAttr.unknownFields()) || !Internal.equals(this.is_muted, userAttr.is_muted) || !Internal.equals(this.is_admin, userAttr.is_admin) || !Internal.equals(this.is_super_admin, userAttr.is_super_admin)) {
                    return false;
                }
                return true;
            }
        }

        public UserAttr(Boolean bool, Boolean bool2, Boolean bool3) {
            this(bool, bool2, bool3, ByteString.EMPTY);
        }

        public UserAttr(Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.is_muted = bool;
            this.is_admin = bool2;
            this.is_super_admin = bool3;
        }
    }

    public static final class UserStats extends Message<UserStats, Builder> {
        public static final ProtoAdapter<UserStats> ADAPTER = new ProtoAdapter_UserStats();
        public static final Long DEFAULT_DAILY_FAN_TICKET_COUNT = 0L;
        public static final Long DEFAULT_DAILY_INCOME = 0L;
        public static final Long DEFAULT_DIAMOND_CONSUMED_COUNT = 0L;
        public static final Long DEFAULT_DIAMOND_COUNT = 0L;
        public static final Long DEFAULT_FAVORITE_ITEM_COUNT = 0L;
        public static final Long DEFAULT_FOLLOWER_COUNT = 0L;
        public static final Long DEFAULT_FOLLOWING_COUNT = 0L;
        public static final Long DEFAULT_ID = 0L;
        public static final Long DEFAULT_ITEM_COUNT = 0L;
        public static final Long DEFAULT_RECORD_COUNT = 0L;
        public static final Long DEFAULT_TOTAL_DURATION = 0L;
        public static final Long DEFAULT_TUWEN_ITEM_COUNT = 0L;
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 7)
        public final Long daily_fan_ticket_count;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 8)
        public final Long daily_income;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 12)
        public final Long diamond_consumed_count;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 11)
        public final Long diamond_count;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 10)
        public final Long favorite_item_count;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
        public final Long follower_count;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
        public final Long following_count;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
        public final Long id;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
        public final String id_str;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 9)
        public final Long item_count;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
        public final Long record_count;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
        public final Long total_duration;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 13)
        public final Long tuwen_item_count;

        public static final class Builder extends Message.Builder<UserStats, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public Long daily_fan_ticket_count;
            public Long daily_income;
            public Long diamond_consumed_count;
            public Long diamond_count;
            public Long favorite_item_count;
            public Long follower_count;
            public Long following_count;
            public Long id;
            public String id_str;
            public Long item_count;
            public Long record_count;
            public Long total_duration;
            public Long tuwen_item_count;

            public final UserStats build() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12411, new Class[0], UserStats.class)) {
                    return (UserStats) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12411, new Class[0], UserStats.class);
                }
                Long l = this.id;
                String str = this.id_str;
                Long l2 = this.following_count;
                Long l3 = this.follower_count;
                Long l4 = this.record_count;
                Long l5 = this.total_duration;
                Long l6 = this.daily_fan_ticket_count;
                Long l7 = this.daily_income;
                Long l8 = this.item_count;
                Long l9 = this.favorite_item_count;
                Long l10 = this.diamond_count;
                Long l11 = this.diamond_consumed_count;
                UserStats userStats = new UserStats(l, str, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, this.tuwen_item_count, super.buildUnknownFields());
                return userStats;
            }

            public final Builder daily_fan_ticket_count(Long l) {
                this.daily_fan_ticket_count = l;
                return this;
            }

            public final Builder daily_income(Long l) {
                this.daily_income = l;
                return this;
            }

            public final Builder diamond_consumed_count(Long l) {
                this.diamond_consumed_count = l;
                return this;
            }

            public final Builder diamond_count(Long l) {
                this.diamond_count = l;
                return this;
            }

            public final Builder favorite_item_count(Long l) {
                this.favorite_item_count = l;
                return this;
            }

            public final Builder follower_count(Long l) {
                this.follower_count = l;
                return this;
            }

            public final Builder following_count(Long l) {
                this.following_count = l;
                return this;
            }

            public final Builder id(Long l) {
                this.id = l;
                return this;
            }

            public final Builder id_str(String str) {
                this.id_str = str;
                return this;
            }

            public final Builder item_count(Long l) {
                this.item_count = l;
                return this;
            }

            public final Builder record_count(Long l) {
                this.record_count = l;
                return this;
            }

            public final Builder total_duration(Long l) {
                this.total_duration = l;
                return this;
            }

            public final Builder tuwen_item_count(Long l) {
                this.tuwen_item_count = l;
                return this;
            }
        }

        static final class ProtoAdapter_UserStats extends ProtoAdapter<UserStats> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_UserStats() {
                super(FieldEncoding.LENGTH_DELIMITED, UserStats.class);
            }

            public final UserStats redact(UserStats userStats) {
                if (PatchProxy.isSupport(new Object[]{userStats}, this, changeQuickRedirect, false, 12415, new Class[]{UserStats.class}, UserStats.class)) {
                    return (UserStats) PatchProxy.accessDispatch(new Object[]{userStats}, this, changeQuickRedirect, false, 12415, new Class[]{UserStats.class}, UserStats.class);
                }
                Builder newBuilder = userStats.newBuilder();
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final UserStats decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12414, new Class[]{ProtoReader.class}, UserStats.class)) {
                    return (UserStats) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12414, new Class[]{ProtoReader.class}, UserStats.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.id((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 2:
                                builder.id_str((String) ProtoAdapter.STRING.decode(protoReader2));
                                break;
                            case 3:
                                builder.following_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 4:
                                builder.follower_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 5:
                                builder.record_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 6:
                                builder.total_duration((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case e.l /*7*/:
                                builder.daily_fan_ticket_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 8:
                                builder.daily_income((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 9:
                                builder.item_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 10:
                                builder.favorite_item_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 11:
                                builder.diamond_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                                builder.diamond_consumed_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 13:
                                builder.tuwen_item_count((Long) ProtoAdapter.INT64.decode(protoReader2));
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

            public final int encodedSize(UserStats userStats) {
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
                UserStats userStats2 = userStats;
                int i13 = 0;
                if (PatchProxy.isSupport(new Object[]{userStats2}, this, changeQuickRedirect, false, 12412, new Class[]{UserStats.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{userStats2}, this, changeQuickRedirect, false, 12412, new Class[]{UserStats.class}, Integer.TYPE)).intValue();
                }
                if (userStats2.id != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, userStats2.id);
                } else {
                    i = 0;
                }
                if (userStats2.id_str != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, userStats2.id_str);
                } else {
                    i2 = 0;
                }
                int i14 = i + i2;
                if (userStats2.following_count != null) {
                    i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, userStats2.following_count);
                } else {
                    i3 = 0;
                }
                int i15 = i14 + i3;
                if (userStats2.follower_count != null) {
                    i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, userStats2.follower_count);
                } else {
                    i4 = 0;
                }
                int i16 = i15 + i4;
                if (userStats2.record_count != null) {
                    i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, userStats2.record_count);
                } else {
                    i5 = 0;
                }
                int i17 = i16 + i5;
                if (userStats2.total_duration != null) {
                    i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, userStats2.total_duration);
                } else {
                    i6 = 0;
                }
                int i18 = i17 + i6;
                if (userStats2.daily_fan_ticket_count != null) {
                    i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, userStats2.daily_fan_ticket_count);
                } else {
                    i7 = 0;
                }
                int i19 = i18 + i7;
                if (userStats2.daily_income != null) {
                    i8 = ProtoAdapter.INT64.encodedSizeWithTag(8, userStats2.daily_income);
                } else {
                    i8 = 0;
                }
                int i20 = i19 + i8;
                if (userStats2.item_count != null) {
                    i9 = ProtoAdapter.INT64.encodedSizeWithTag(9, userStats2.item_count);
                } else {
                    i9 = 0;
                }
                int i21 = i20 + i9;
                if (userStats2.favorite_item_count != null) {
                    i10 = ProtoAdapter.INT64.encodedSizeWithTag(10, userStats2.favorite_item_count);
                } else {
                    i10 = 0;
                }
                int i22 = i21 + i10;
                if (userStats2.diamond_count != null) {
                    i11 = ProtoAdapter.INT64.encodedSizeWithTag(11, userStats2.diamond_count);
                } else {
                    i11 = 0;
                }
                int i23 = i22 + i11;
                if (userStats2.diamond_consumed_count != null) {
                    i12 = ProtoAdapter.INT64.encodedSizeWithTag(12, userStats2.diamond_consumed_count);
                } else {
                    i12 = 0;
                }
                int i24 = i23 + i12;
                if (userStats2.tuwen_item_count != null) {
                    i13 = ProtoAdapter.INT64.encodedSizeWithTag(13, userStats2.tuwen_item_count);
                }
                return i24 + i13 + userStats.unknownFields().size();
            }

            public final void encode(ProtoWriter protoWriter, UserStats userStats) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                UserStats userStats2 = userStats;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, userStats2}, this, changeQuickRedirect, false, 12413, new Class[]{ProtoWriter.class, UserStats.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, userStats2}, this, changeQuickRedirect, false, 12413, new Class[]{ProtoWriter.class, UserStats.class}, Void.TYPE);
                    return;
                }
                if (userStats2.id != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, userStats2.id);
                }
                if (userStats2.id_str != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, userStats2.id_str);
                }
                if (userStats2.following_count != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, userStats2.following_count);
                }
                if (userStats2.follower_count != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, userStats2.follower_count);
                }
                if (userStats2.record_count != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 5, userStats2.record_count);
                }
                if (userStats2.total_duration != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 6, userStats2.total_duration);
                }
                if (userStats2.daily_fan_ticket_count != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 7, userStats2.daily_fan_ticket_count);
                }
                if (userStats2.daily_income != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 8, userStats2.daily_income);
                }
                if (userStats2.item_count != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 9, userStats2.item_count);
                }
                if (userStats2.favorite_item_count != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 10, userStats2.favorite_item_count);
                }
                if (userStats2.diamond_count != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 11, userStats2.diamond_count);
                }
                if (userStats2.diamond_consumed_count != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 12, userStats2.diamond_consumed_count);
                }
                if (userStats2.tuwen_item_count != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 13, userStats2.tuwen_item_count);
                }
                protoWriter2.writeBytes(userStats.unknownFields());
            }
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12407, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12407, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.id = this.id;
            builder.id_str = this.id_str;
            builder.following_count = this.following_count;
            builder.follower_count = this.follower_count;
            builder.record_count = this.record_count;
            builder.total_duration = this.total_duration;
            builder.daily_fan_ticket_count = this.daily_fan_ticket_count;
            builder.daily_income = this.daily_income;
            builder.item_count = this.item_count;
            builder.favorite_item_count = this.favorite_item_count;
            builder.diamond_count = this.diamond_count;
            builder.diamond_consumed_count = this.diamond_consumed_count;
            builder.tuwen_item_count = this.tuwen_item_count;
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
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13 = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12409, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12409, new Class[0], Integer.TYPE)).intValue();
            }
            int i14 = this.hashCode;
            if (i14 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.id != null) {
                    i = this.id.hashCode();
                } else {
                    i = 0;
                }
                int i15 = (hashCode + i) * 37;
                if (this.id_str != null) {
                    i2 = this.id_str.hashCode();
                } else {
                    i2 = 0;
                }
                int i16 = (i15 + i2) * 37;
                if (this.following_count != null) {
                    i3 = this.following_count.hashCode();
                } else {
                    i3 = 0;
                }
                int i17 = (i16 + i3) * 37;
                if (this.follower_count != null) {
                    i4 = this.follower_count.hashCode();
                } else {
                    i4 = 0;
                }
                int i18 = (i17 + i4) * 37;
                if (this.record_count != null) {
                    i5 = this.record_count.hashCode();
                } else {
                    i5 = 0;
                }
                int i19 = (i18 + i5) * 37;
                if (this.total_duration != null) {
                    i6 = this.total_duration.hashCode();
                } else {
                    i6 = 0;
                }
                int i20 = (i19 + i6) * 37;
                if (this.daily_fan_ticket_count != null) {
                    i7 = this.daily_fan_ticket_count.hashCode();
                } else {
                    i7 = 0;
                }
                int i21 = (i20 + i7) * 37;
                if (this.daily_income != null) {
                    i8 = this.daily_income.hashCode();
                } else {
                    i8 = 0;
                }
                int i22 = (i21 + i8) * 37;
                if (this.item_count != null) {
                    i9 = this.item_count.hashCode();
                } else {
                    i9 = 0;
                }
                int i23 = (i22 + i9) * 37;
                if (this.favorite_item_count != null) {
                    i10 = this.favorite_item_count.hashCode();
                } else {
                    i10 = 0;
                }
                int i24 = (i23 + i10) * 37;
                if (this.diamond_count != null) {
                    i11 = this.diamond_count.hashCode();
                } else {
                    i11 = 0;
                }
                int i25 = (i24 + i11) * 37;
                if (this.diamond_consumed_count != null) {
                    i12 = this.diamond_consumed_count.hashCode();
                } else {
                    i12 = 0;
                }
                int i26 = (i25 + i12) * 37;
                if (this.tuwen_item_count != null) {
                    i13 = this.tuwen_item_count.hashCode();
                }
                i14 = i26 + i13;
                this.hashCode = i14;
            }
            return i14;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12410, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12410, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.id != null) {
                sb.append(", id=");
                sb.append(this.id);
            }
            if (this.id_str != null) {
                sb.append(", id_str=");
                sb.append(this.id_str);
            }
            if (this.following_count != null) {
                sb.append(", following_count=");
                sb.append(this.following_count);
            }
            if (this.follower_count != null) {
                sb.append(", follower_count=");
                sb.append(this.follower_count);
            }
            if (this.record_count != null) {
                sb.append(", record_count=");
                sb.append(this.record_count);
            }
            if (this.total_duration != null) {
                sb.append(", total_duration=");
                sb.append(this.total_duration);
            }
            if (this.daily_fan_ticket_count != null) {
                sb.append(", daily_fan_ticket_count=");
                sb.append(this.daily_fan_ticket_count);
            }
            if (this.daily_income != null) {
                sb.append(", daily_income=");
                sb.append(this.daily_income);
            }
            if (this.item_count != null) {
                sb.append(", item_count=");
                sb.append(this.item_count);
            }
            if (this.favorite_item_count != null) {
                sb.append(", favorite_item_count=");
                sb.append(this.favorite_item_count);
            }
            if (this.diamond_count != null) {
                sb.append(", diamond_count=");
                sb.append(this.diamond_count);
            }
            if (this.diamond_consumed_count != null) {
                sb.append(", diamond_consumed_count=");
                sb.append(this.diamond_consumed_count);
            }
            if (this.tuwen_item_count != null) {
                sb.append(", tuwen_item_count=");
                sb.append(this.tuwen_item_count);
            }
            StringBuilder replace = sb.replace(0, 2, "UserStats{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12408, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12408, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof UserStats)) {
                    return false;
                }
                UserStats userStats = (UserStats) obj;
                if (!unknownFields().equals(userStats.unknownFields()) || !Internal.equals(this.id, userStats.id) || !Internal.equals(this.id_str, userStats.id_str) || !Internal.equals(this.following_count, userStats.following_count) || !Internal.equals(this.follower_count, userStats.follower_count) || !Internal.equals(this.record_count, userStats.record_count) || !Internal.equals(this.total_duration, userStats.total_duration) || !Internal.equals(this.daily_fan_ticket_count, userStats.daily_fan_ticket_count) || !Internal.equals(this.daily_income, userStats.daily_income) || !Internal.equals(this.item_count, userStats.item_count) || !Internal.equals(this.favorite_item_count, userStats.favorite_item_count) || !Internal.equals(this.diamond_count, userStats.diamond_count) || !Internal.equals(this.diamond_consumed_count, userStats.diamond_consumed_count) || !Internal.equals(this.tuwen_item_count, userStats.tuwen_item_count)) {
                    return false;
                }
                return true;
            }
        }

        public UserStats(Long l, String str, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Long l12) {
            this(l, str, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, ByteString.EMPTY);
        }

        public UserStats(Long l, String str, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Long l12, ByteString byteString) {
            super(ADAPTER, byteString);
            this.id = l;
            this.id_str = str;
            this.following_count = l2;
            this.follower_count = l3;
            this.record_count = l4;
            this.total_duration = l5;
            this.daily_fan_ticket_count = l6;
            this.daily_income = l7;
            this.item_count = l8;
            this.favorite_item_count = l9;
            this.diamond_count = l10;
            this.diamond_consumed_count = l11;
            this.tuwen_item_count = l12;
        }
    }

    public static final class XiguaParams extends Message<XiguaParams, Builder> {
        public static final ProtoAdapter<XiguaParams> ADAPTER = new ProtoAdapter_XiguaParams();
        public static final Long DEFAULT_MEDIA_ID = 0L;
        public static final Long DEFAULT_UGC_PUBLISH_MEDIA_ID = 0L;
        public static final Boolean DEFAULT_USER_VERIFIED = Boolean.FALSE;
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
        public final String author_desc;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
        public final String description;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
        public final Long media_id;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
        public final Long ugc_publish_media_id;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
        public final String user_auth_info;
        @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User$XiguaParams$UserExtendInfo#ADAPTER", tag = 7)
        public final UserExtendInfo user_extend_info;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 6)
        public final Boolean user_verified;

        public static final class UserExtendInfo extends Message<UserExtendInfo, Builder> {
            public static final ProtoAdapter<UserExtendInfo> ADAPTER = new ProtoAdapter_UserExtendInfo();
            public static ChangeQuickRedirect changeQuickRedirect;
            private static final long serialVersionUID = 0;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
            public final String r_schema_url;
            @WireField(adapter = "com.bytedance.android.livesdk.message.proto.User$XiguaParams$UserExtendInfo$RocketSchema#ADAPTER", tag = 3)
            public final RocketSchema rocket_schema_info;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
            public final String share_url;

            public static final class RocketSchema extends Message<RocketSchema, Builder> {
                public static final ProtoAdapter<RocketSchema> ADAPTER = new ProtoAdapter_RocketSchema();
                public static ChangeQuickRedirect changeQuickRedirect;
                private static final long serialVersionUID = 0;
                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
                public final String download_url;
                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
                public final String r_schema;
                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
                public final String r_token;

                public static final class Builder extends Message.Builder<RocketSchema, Builder> {
                    public static ChangeQuickRedirect changeQuickRedirect;
                    public String download_url;
                    public String r_schema;
                    public String r_token;

                    public final RocketSchema build() {
                        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12438, new Class[0], RocketSchema.class)) {
                            return new RocketSchema(this.r_schema, this.r_token, this.download_url, super.buildUnknownFields());
                        }
                        return (RocketSchema) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12438, new Class[0], RocketSchema.class);
                    }

                    public final Builder download_url(String str) {
                        this.download_url = str;
                        return this;
                    }

                    public final Builder r_schema(String str) {
                        this.r_schema = str;
                        return this;
                    }

                    public final Builder r_token(String str) {
                        this.r_token = str;
                        return this;
                    }
                }

                static final class ProtoAdapter_RocketSchema extends ProtoAdapter<RocketSchema> {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    ProtoAdapter_RocketSchema() {
                        super(FieldEncoding.LENGTH_DELIMITED, RocketSchema.class);
                    }

                    public final int encodedSize(RocketSchema rocketSchema) {
                        int i;
                        int i2;
                        RocketSchema rocketSchema2 = rocketSchema;
                        int i3 = 0;
                        if (PatchProxy.isSupport(new Object[]{rocketSchema2}, this, changeQuickRedirect, false, 12439, new Class[]{RocketSchema.class}, Integer.TYPE)) {
                            return ((Integer) PatchProxy.accessDispatch(new Object[]{rocketSchema2}, this, changeQuickRedirect, false, 12439, new Class[]{RocketSchema.class}, Integer.TYPE)).intValue();
                        }
                        if (rocketSchema2.r_schema != null) {
                            i = ProtoAdapter.STRING.encodedSizeWithTag(1, rocketSchema2.r_schema);
                        } else {
                            i = 0;
                        }
                        if (rocketSchema2.r_token != null) {
                            i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, rocketSchema2.r_token);
                        } else {
                            i2 = 0;
                        }
                        int i4 = i + i2;
                        if (rocketSchema2.download_url != null) {
                            i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, rocketSchema2.download_url);
                        }
                        return i4 + i3 + rocketSchema.unknownFields().size();
                    }

                    public final RocketSchema redact(RocketSchema rocketSchema) {
                        if (PatchProxy.isSupport(new Object[]{rocketSchema}, this, changeQuickRedirect, false, 12442, new Class[]{RocketSchema.class}, RocketSchema.class)) {
                            return (RocketSchema) PatchProxy.accessDispatch(new Object[]{rocketSchema}, this, changeQuickRedirect, false, 12442, new Class[]{RocketSchema.class}, RocketSchema.class);
                        }
                        Builder newBuilder = rocketSchema.newBuilder();
                        newBuilder.clearUnknownFields();
                        return newBuilder.build();
                    }

                    public final RocketSchema decode(ProtoReader protoReader) throws IOException {
                        ProtoReader protoReader2 = protoReader;
                        if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12441, new Class[]{ProtoReader.class}, RocketSchema.class)) {
                            return (RocketSchema) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12441, new Class[]{ProtoReader.class}, RocketSchema.class);
                        }
                        Builder builder = new Builder();
                        long beginMessage = protoReader.beginMessage();
                        while (true) {
                            int nextTag = protoReader.nextTag();
                            if (nextTag != -1) {
                                switch (nextTag) {
                                    case 1:
                                        builder.r_schema((String) ProtoAdapter.STRING.decode(protoReader2));
                                        break;
                                    case 2:
                                        builder.r_token((String) ProtoAdapter.STRING.decode(protoReader2));
                                        break;
                                    case 3:
                                        builder.download_url((String) ProtoAdapter.STRING.decode(protoReader2));
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

                    public final void encode(ProtoWriter protoWriter, RocketSchema rocketSchema) throws IOException {
                        ProtoWriter protoWriter2 = protoWriter;
                        RocketSchema rocketSchema2 = rocketSchema;
                        if (PatchProxy.isSupport(new Object[]{protoWriter2, rocketSchema2}, this, changeQuickRedirect, false, 12440, new Class[]{ProtoWriter.class, RocketSchema.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{protoWriter2, rocketSchema2}, this, changeQuickRedirect, false, 12440, new Class[]{ProtoWriter.class, RocketSchema.class}, Void.TYPE);
                            return;
                        }
                        if (rocketSchema2.r_schema != null) {
                            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, rocketSchema2.r_schema);
                        }
                        if (rocketSchema2.r_token != null) {
                            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, rocketSchema2.r_token);
                        }
                        if (rocketSchema2.download_url != null) {
                            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, rocketSchema2.download_url);
                        }
                        protoWriter2.writeBytes(rocketSchema.unknownFields());
                    }
                }

                public final Builder newBuilder() {
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12434, new Class[0], Builder.class)) {
                        return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12434, new Class[0], Builder.class);
                    }
                    Builder builder = new Builder();
                    builder.r_schema = this.r_schema;
                    builder.r_token = this.r_token;
                    builder.download_url = this.download_url;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final int hashCode() {
                    int i;
                    int i2;
                    int i3 = 0;
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12436, new Class[0], Integer.TYPE)) {
                        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12436, new Class[0], Integer.TYPE)).intValue();
                    }
                    int i4 = this.hashCode;
                    if (i4 == 0) {
                        int hashCode = unknownFields().hashCode() * 37;
                        if (this.r_schema != null) {
                            i = this.r_schema.hashCode();
                        } else {
                            i = 0;
                        }
                        int i5 = (hashCode + i) * 37;
                        if (this.r_token != null) {
                            i2 = this.r_token.hashCode();
                        } else {
                            i2 = 0;
                        }
                        int i6 = (i5 + i2) * 37;
                        if (this.download_url != null) {
                            i3 = this.download_url.hashCode();
                        }
                        i4 = i6 + i3;
                        this.hashCode = i4;
                    }
                    return i4;
                }

                public final String toString() {
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12437, new Class[0], String.class)) {
                        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12437, new Class[0], String.class);
                    }
                    StringBuilder sb = new StringBuilder();
                    if (this.r_schema != null) {
                        sb.append(", r_schema=");
                        sb.append(this.r_schema);
                    }
                    if (this.r_token != null) {
                        sb.append(", r_token=");
                        sb.append(this.r_token);
                    }
                    if (this.download_url != null) {
                        sb.append(", download_url=");
                        sb.append(this.download_url);
                    }
                    StringBuilder replace = sb.replace(0, 2, "RocketSchema{");
                    replace.append('}');
                    return replace.toString();
                }

                public final boolean equals(Object obj) {
                    if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12435, new Class[]{Object.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12435, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
                    } else if (obj == this) {
                        return true;
                    } else {
                        if (!(obj instanceof RocketSchema)) {
                            return false;
                        }
                        RocketSchema rocketSchema = (RocketSchema) obj;
                        if (!unknownFields().equals(rocketSchema.unknownFields()) || !Internal.equals(this.r_schema, rocketSchema.r_schema) || !Internal.equals(this.r_token, rocketSchema.r_token) || !Internal.equals(this.download_url, rocketSchema.download_url)) {
                            return false;
                        }
                        return true;
                    }
                }

                public RocketSchema(String str, String str2, String str3) {
                    this(str, str2, str3, ByteString.EMPTY);
                }

                public RocketSchema(String str, String str2, String str3, ByteString byteString) {
                    super(ADAPTER, byteString);
                    this.r_schema = str;
                    this.r_token = str2;
                    this.download_url = str3;
                }
            }

            public static final class Builder extends Message.Builder<UserExtendInfo, Builder> {
                public static ChangeQuickRedirect changeQuickRedirect;
                public String r_schema_url;
                public RocketSchema rocket_schema_info;
                public String share_url;

                public final UserExtendInfo build() {
                    if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12429, new Class[0], UserExtendInfo.class)) {
                        return new UserExtendInfo(this.share_url, this.r_schema_url, this.rocket_schema_info, super.buildUnknownFields());
                    }
                    return (UserExtendInfo) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12429, new Class[0], UserExtendInfo.class);
                }

                public final Builder r_schema_url(String str) {
                    this.r_schema_url = str;
                    return this;
                }

                public final Builder rocket_schema_info(RocketSchema rocketSchema) {
                    this.rocket_schema_info = rocketSchema;
                    return this;
                }

                public final Builder share_url(String str) {
                    this.share_url = str;
                    return this;
                }
            }

            static final class ProtoAdapter_UserExtendInfo extends ProtoAdapter<UserExtendInfo> {
                public static ChangeQuickRedirect changeQuickRedirect;

                ProtoAdapter_UserExtendInfo() {
                    super(FieldEncoding.LENGTH_DELIMITED, UserExtendInfo.class);
                }

                public final int encodedSize(UserExtendInfo userExtendInfo) {
                    int i;
                    int i2;
                    UserExtendInfo userExtendInfo2 = userExtendInfo;
                    int i3 = 0;
                    if (PatchProxy.isSupport(new Object[]{userExtendInfo2}, this, changeQuickRedirect, false, 12430, new Class[]{UserExtendInfo.class}, Integer.TYPE)) {
                        return ((Integer) PatchProxy.accessDispatch(new Object[]{userExtendInfo2}, this, changeQuickRedirect, false, 12430, new Class[]{UserExtendInfo.class}, Integer.TYPE)).intValue();
                    }
                    if (userExtendInfo2.share_url != null) {
                        i = ProtoAdapter.STRING.encodedSizeWithTag(1, userExtendInfo2.share_url);
                    } else {
                        i = 0;
                    }
                    if (userExtendInfo2.r_schema_url != null) {
                        i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, userExtendInfo2.r_schema_url);
                    } else {
                        i2 = 0;
                    }
                    int i4 = i + i2;
                    if (userExtendInfo2.rocket_schema_info != null) {
                        i3 = RocketSchema.ADAPTER.encodedSizeWithTag(3, userExtendInfo2.rocket_schema_info);
                    }
                    return i4 + i3 + userExtendInfo.unknownFields().size();
                }

                public final UserExtendInfo redact(UserExtendInfo userExtendInfo) {
                    if (PatchProxy.isSupport(new Object[]{userExtendInfo}, this, changeQuickRedirect, false, 12433, new Class[]{UserExtendInfo.class}, UserExtendInfo.class)) {
                        return (UserExtendInfo) PatchProxy.accessDispatch(new Object[]{userExtendInfo}, this, changeQuickRedirect, false, 12433, new Class[]{UserExtendInfo.class}, UserExtendInfo.class);
                    }
                    Builder newBuilder = userExtendInfo.newBuilder();
                    if (newBuilder.rocket_schema_info != null) {
                        newBuilder.rocket_schema_info = (RocketSchema) RocketSchema.ADAPTER.redact(newBuilder.rocket_schema_info);
                    }
                    newBuilder.clearUnknownFields();
                    return newBuilder.build();
                }

                public final UserExtendInfo decode(ProtoReader protoReader) throws IOException {
                    ProtoReader protoReader2 = protoReader;
                    if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12432, new Class[]{ProtoReader.class}, UserExtendInfo.class)) {
                        return (UserExtendInfo) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12432, new Class[]{ProtoReader.class}, UserExtendInfo.class);
                    }
                    Builder builder = new Builder();
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag != -1) {
                            switch (nextTag) {
                                case 1:
                                    builder.share_url((String) ProtoAdapter.STRING.decode(protoReader2));
                                    break;
                                case 2:
                                    builder.r_schema_url((String) ProtoAdapter.STRING.decode(protoReader2));
                                    break;
                                case 3:
                                    builder.rocket_schema_info((RocketSchema) RocketSchema.ADAPTER.decode(protoReader2));
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

                public final void encode(ProtoWriter protoWriter, UserExtendInfo userExtendInfo) throws IOException {
                    ProtoWriter protoWriter2 = protoWriter;
                    UserExtendInfo userExtendInfo2 = userExtendInfo;
                    if (PatchProxy.isSupport(new Object[]{protoWriter2, userExtendInfo2}, this, changeQuickRedirect, false, 12431, new Class[]{ProtoWriter.class, UserExtendInfo.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{protoWriter2, userExtendInfo2}, this, changeQuickRedirect, false, 12431, new Class[]{ProtoWriter.class, UserExtendInfo.class}, Void.TYPE);
                        return;
                    }
                    if (userExtendInfo2.share_url != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, userExtendInfo2.share_url);
                    }
                    if (userExtendInfo2.r_schema_url != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, userExtendInfo2.r_schema_url);
                    }
                    if (userExtendInfo2.rocket_schema_info != null) {
                        RocketSchema.ADAPTER.encodeWithTag(protoWriter2, 3, userExtendInfo2.rocket_schema_info);
                    }
                    protoWriter2.writeBytes(userExtendInfo.unknownFields());
                }
            }

            public final Builder newBuilder() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12425, new Class[0], Builder.class)) {
                    return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12425, new Class[0], Builder.class);
                }
                Builder builder = new Builder();
                builder.share_url = this.share_url;
                builder.r_schema_url = this.r_schema_url;
                builder.rocket_schema_info = this.rocket_schema_info;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final int hashCode() {
                int i;
                int i2;
                int i3 = 0;
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12427, new Class[0], Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12427, new Class[0], Integer.TYPE)).intValue();
                }
                int i4 = this.hashCode;
                if (i4 == 0) {
                    int hashCode = unknownFields().hashCode() * 37;
                    if (this.share_url != null) {
                        i = this.share_url.hashCode();
                    } else {
                        i = 0;
                    }
                    int i5 = (hashCode + i) * 37;
                    if (this.r_schema_url != null) {
                        i2 = this.r_schema_url.hashCode();
                    } else {
                        i2 = 0;
                    }
                    int i6 = (i5 + i2) * 37;
                    if (this.rocket_schema_info != null) {
                        i3 = this.rocket_schema_info.hashCode();
                    }
                    i4 = i6 + i3;
                    this.hashCode = i4;
                }
                return i4;
            }

            public final String toString() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12428, new Class[0], String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12428, new Class[0], String.class);
                }
                StringBuilder sb = new StringBuilder();
                if (this.share_url != null) {
                    sb.append(", share_url=");
                    sb.append(this.share_url);
                }
                if (this.r_schema_url != null) {
                    sb.append(", r_schema_url=");
                    sb.append(this.r_schema_url);
                }
                if (this.rocket_schema_info != null) {
                    sb.append(", rocket_schema_info=");
                    sb.append(this.rocket_schema_info);
                }
                StringBuilder replace = sb.replace(0, 2, "UserExtendInfo{");
                replace.append('}');
                return replace.toString();
            }

            public final boolean equals(Object obj) {
                if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12426, new Class[]{Object.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12426, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
                } else if (obj == this) {
                    return true;
                } else {
                    if (!(obj instanceof UserExtendInfo)) {
                        return false;
                    }
                    UserExtendInfo userExtendInfo = (UserExtendInfo) obj;
                    if (!unknownFields().equals(userExtendInfo.unknownFields()) || !Internal.equals(this.share_url, userExtendInfo.share_url) || !Internal.equals(this.r_schema_url, userExtendInfo.r_schema_url) || !Internal.equals(this.rocket_schema_info, userExtendInfo.rocket_schema_info)) {
                        return false;
                    }
                    return true;
                }
            }

            public UserExtendInfo(String str, String str2, RocketSchema rocketSchema) {
                this(str, str2, rocketSchema, ByteString.EMPTY);
            }

            public UserExtendInfo(String str, String str2, RocketSchema rocketSchema, ByteString byteString) {
                super(ADAPTER, byteString);
                this.share_url = str;
                this.r_schema_url = str2;
                this.rocket_schema_info = rocketSchema;
            }
        }

        public static final class Builder extends Message.Builder<XiguaParams, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public String author_desc;
            public String description;
            public Long media_id;
            public Long ugc_publish_media_id;
            public String user_auth_info;
            public UserExtendInfo user_extend_info;
            public Boolean user_verified;

            public final XiguaParams build() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12420, new Class[0], XiguaParams.class)) {
                    return (XiguaParams) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12420, new Class[0], XiguaParams.class);
                }
                XiguaParams xiguaParams = new XiguaParams(this.user_auth_info, this.ugc_publish_media_id, this.media_id, this.author_desc, this.description, this.user_verified, this.user_extend_info, super.buildUnknownFields());
                return xiguaParams;
            }

            public final Builder author_desc(String str) {
                this.author_desc = str;
                return this;
            }

            public final Builder description(String str) {
                this.description = str;
                return this;
            }

            public final Builder media_id(Long l) {
                this.media_id = l;
                return this;
            }

            public final Builder ugc_publish_media_id(Long l) {
                this.ugc_publish_media_id = l;
                return this;
            }

            public final Builder user_auth_info(String str) {
                this.user_auth_info = str;
                return this;
            }

            public final Builder user_extend_info(UserExtendInfo userExtendInfo) {
                this.user_extend_info = userExtendInfo;
                return this;
            }

            public final Builder user_verified(Boolean bool) {
                this.user_verified = bool;
                return this;
            }
        }

        static final class ProtoAdapter_XiguaParams extends ProtoAdapter<XiguaParams> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_XiguaParams() {
                super(FieldEncoding.LENGTH_DELIMITED, XiguaParams.class);
            }

            public final XiguaParams redact(XiguaParams xiguaParams) {
                if (PatchProxy.isSupport(new Object[]{xiguaParams}, this, changeQuickRedirect, false, 12424, new Class[]{XiguaParams.class}, XiguaParams.class)) {
                    return (XiguaParams) PatchProxy.accessDispatch(new Object[]{xiguaParams}, this, changeQuickRedirect, false, 12424, new Class[]{XiguaParams.class}, XiguaParams.class);
                }
                Builder newBuilder = xiguaParams.newBuilder();
                if (newBuilder.user_extend_info != null) {
                    newBuilder.user_extend_info = (UserExtendInfo) UserExtendInfo.ADAPTER.redact(newBuilder.user_extend_info);
                }
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final XiguaParams decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12423, new Class[]{ProtoReader.class}, XiguaParams.class)) {
                    return (XiguaParams) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12423, new Class[]{ProtoReader.class}, XiguaParams.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.user_auth_info((String) ProtoAdapter.STRING.decode(protoReader2));
                                break;
                            case 2:
                                builder.ugc_publish_media_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 3:
                                builder.media_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 4:
                                builder.author_desc((String) ProtoAdapter.STRING.decode(protoReader2));
                                break;
                            case 5:
                                builder.description((String) ProtoAdapter.STRING.decode(protoReader2));
                                break;
                            case 6:
                                builder.user_verified((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                break;
                            case e.l /*7*/:
                                builder.user_extend_info((UserExtendInfo) UserExtendInfo.ADAPTER.decode(protoReader2));
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

            public final int encodedSize(XiguaParams xiguaParams) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                XiguaParams xiguaParams2 = xiguaParams;
                int i7 = 0;
                if (PatchProxy.isSupport(new Object[]{xiguaParams2}, this, changeQuickRedirect, false, 12421, new Class[]{XiguaParams.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{xiguaParams2}, this, changeQuickRedirect, false, 12421, new Class[]{XiguaParams.class}, Integer.TYPE)).intValue();
                }
                if (xiguaParams2.user_auth_info != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, xiguaParams2.user_auth_info);
                } else {
                    i = 0;
                }
                if (xiguaParams2.ugc_publish_media_id != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, xiguaParams2.ugc_publish_media_id);
                } else {
                    i2 = 0;
                }
                int i8 = i + i2;
                if (xiguaParams2.media_id != null) {
                    i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, xiguaParams2.media_id);
                } else {
                    i3 = 0;
                }
                int i9 = i8 + i3;
                if (xiguaParams2.author_desc != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, xiguaParams2.author_desc);
                } else {
                    i4 = 0;
                }
                int i10 = i9 + i4;
                if (xiguaParams2.description != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, xiguaParams2.description);
                } else {
                    i5 = 0;
                }
                int i11 = i10 + i5;
                if (xiguaParams2.user_verified != null) {
                    i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, xiguaParams2.user_verified);
                } else {
                    i6 = 0;
                }
                int i12 = i11 + i6;
                if (xiguaParams2.user_extend_info != null) {
                    i7 = UserExtendInfo.ADAPTER.encodedSizeWithTag(7, xiguaParams2.user_extend_info);
                }
                return i12 + i7 + xiguaParams.unknownFields().size();
            }

            public final void encode(ProtoWriter protoWriter, XiguaParams xiguaParams) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                XiguaParams xiguaParams2 = xiguaParams;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, xiguaParams2}, this, changeQuickRedirect, false, 12422, new Class[]{ProtoWriter.class, XiguaParams.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, xiguaParams2}, this, changeQuickRedirect, false, 12422, new Class[]{ProtoWriter.class, XiguaParams.class}, Void.TYPE);
                    return;
                }
                if (xiguaParams2.user_auth_info != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, xiguaParams2.user_auth_info);
                }
                if (xiguaParams2.ugc_publish_media_id != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, xiguaParams2.ugc_publish_media_id);
                }
                if (xiguaParams2.media_id != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, xiguaParams2.media_id);
                }
                if (xiguaParams2.author_desc != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter2, 4, xiguaParams2.author_desc);
                }
                if (xiguaParams2.description != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter2, 5, xiguaParams2.description);
                }
                if (xiguaParams2.user_verified != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 6, xiguaParams2.user_verified);
                }
                if (xiguaParams2.user_extend_info != null) {
                    UserExtendInfo.ADAPTER.encodeWithTag(protoWriter2, 7, xiguaParams2.user_extend_info);
                }
                protoWriter2.writeBytes(xiguaParams.unknownFields());
            }
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12416, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12416, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.user_auth_info = this.user_auth_info;
            builder.ugc_publish_media_id = this.ugc_publish_media_id;
            builder.media_id = this.media_id;
            builder.author_desc = this.author_desc;
            builder.description = this.description;
            builder.user_verified = this.user_verified;
            builder.user_extend_info = this.user_extend_info;
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
            int i7 = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12418, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12418, new Class[0], Integer.TYPE)).intValue();
            }
            int i8 = this.hashCode;
            if (i8 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.user_auth_info != null) {
                    i = this.user_auth_info.hashCode();
                } else {
                    i = 0;
                }
                int i9 = (hashCode + i) * 37;
                if (this.ugc_publish_media_id != null) {
                    i2 = this.ugc_publish_media_id.hashCode();
                } else {
                    i2 = 0;
                }
                int i10 = (i9 + i2) * 37;
                if (this.media_id != null) {
                    i3 = this.media_id.hashCode();
                } else {
                    i3 = 0;
                }
                int i11 = (i10 + i3) * 37;
                if (this.author_desc != null) {
                    i4 = this.author_desc.hashCode();
                } else {
                    i4 = 0;
                }
                int i12 = (i11 + i4) * 37;
                if (this.description != null) {
                    i5 = this.description.hashCode();
                } else {
                    i5 = 0;
                }
                int i13 = (i12 + i5) * 37;
                if (this.user_verified != null) {
                    i6 = this.user_verified.hashCode();
                } else {
                    i6 = 0;
                }
                int i14 = (i13 + i6) * 37;
                if (this.user_extend_info != null) {
                    i7 = this.user_extend_info.hashCode();
                }
                i8 = i14 + i7;
                this.hashCode = i8;
            }
            return i8;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12419, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12419, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.user_auth_info != null) {
                sb.append(", user_auth_info=");
                sb.append(this.user_auth_info);
            }
            if (this.ugc_publish_media_id != null) {
                sb.append(", ugc_publish_media_id=");
                sb.append(this.ugc_publish_media_id);
            }
            if (this.media_id != null) {
                sb.append(", media_id=");
                sb.append(this.media_id);
            }
            if (this.author_desc != null) {
                sb.append(", author_desc=");
                sb.append(this.author_desc);
            }
            if (this.description != null) {
                sb.append(", description=");
                sb.append(this.description);
            }
            if (this.user_verified != null) {
                sb.append(", user_verified=");
                sb.append(this.user_verified);
            }
            if (this.user_extend_info != null) {
                sb.append(", user_extend_info=");
                sb.append(this.user_extend_info);
            }
            StringBuilder replace = sb.replace(0, 2, "XiguaParams{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12417, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12417, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof XiguaParams)) {
                    return false;
                }
                XiguaParams xiguaParams = (XiguaParams) obj;
                if (!unknownFields().equals(xiguaParams.unknownFields()) || !Internal.equals(this.user_auth_info, xiguaParams.user_auth_info) || !Internal.equals(this.ugc_publish_media_id, xiguaParams.ugc_publish_media_id) || !Internal.equals(this.media_id, xiguaParams.media_id) || !Internal.equals(this.author_desc, xiguaParams.author_desc) || !Internal.equals(this.description, xiguaParams.description) || !Internal.equals(this.user_verified, xiguaParams.user_verified) || !Internal.equals(this.user_extend_info, xiguaParams.user_extend_info)) {
                    return false;
                }
                return true;
            }
        }

        public XiguaParams(String str, Long l, Long l2, String str2, String str3, Boolean bool, UserExtendInfo userExtendInfo) {
            this(str, l, l2, str2, str3, bool, userExtendInfo, ByteString.EMPTY);
        }

        public XiguaParams(String str, Long l, Long l2, String str2, String str3, Boolean bool, UserExtendInfo userExtendInfo, ByteString byteString) {
            super(ADAPTER, byteString);
            this.user_auth_info = str;
            this.ugc_publish_media_id = l;
            this.media_id = l2;
            this.author_desc = str2;
            this.description = str3;
            this.user_verified = bool;
            this.user_extend_info = userExtendInfo;
        }
    }

    public static final class Builder extends Message.Builder<User, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Boolean allow_be_located;
        public Boolean allow_find_by_contacts;
        public Boolean allow_others_download_video;
        public Boolean allow_others_download_when_sharing_video;
        public Boolean allow_share_show_profile;
        public Boolean allow_show_in_gossip;
        public Boolean allow_show_my_action;
        public Boolean allow_strange_comment;
        public Boolean allow_unfollower_comment;
        public Boolean allow_use_linkmic;
        public AnchorInfo anchor_info;
        public AnchorLevel anchor_level;
        public AuthorStats author_stats;
        public Image avatar_border;
        public Image avatar_jpg;
        public Image avatar_large;
        public Image avatar_medium;
        public Image avatar_thumb;
        public List<Image> badge_image_list = Internal.newMutableList();
        public String bg_img_url;
        public Long birthday;
        public String birthday_description;
        public Boolean birthday_valid;
        public Integer block_status;
        public Border border;
        public String city;
        public Integer comment_restrict;
        public String constellation;
        public Long create_time;
        public Integer disable_ichat;
        public String display_id;
        public Long enable_ichat_img;
        public Integer exp;
        public Integer experience;
        public Long fan_ticket_count;
        public FansClub fans_club;
        public Boolean fold_stranger_chat;
        public FollowInfo follow_info;
        public Long follow_status;
        public Integer gender;
        public Boolean hotsoon_verified;
        public String hotsoon_verified_reason;
        public Integer ichat_restrict_type;
        public Long id;
        public String id_str;
        public Integer income_share_percent;
        public Boolean is_follower;
        public Boolean is_following;
        public Integer level;
        public LinkmicStatus link_mic_stats;
        public Image medal;
        public Long modify_time;
        public Boolean need_profile_guide;
        public List<Image> new_real_time_icons = Internal.newMutableList();
        public String nickname;
        public OwnRoom own_room;
        public PayGrade pay_grade;
        public Long pay_score;
        public Long pay_scores;
        public Boolean push_comment_status;
        public Boolean push_digg;
        public Boolean push_follow;
        public Boolean push_friend_action;
        public Boolean push_ichat;
        public Boolean push_status;
        public Boolean push_video_post;
        public Boolean push_video_recommend;
        public List<Image> real_time_icons = Internal.newMutableList();
        public String sec_uid;
        public Integer secret;
        public String share_qrcode_uri;
        public Long short_id;
        public String signature;
        public String special_id;
        public UserStats stats;
        public Integer status;
        public String telephone;
        public Long ticket_count;
        public List<User> top_fans = Internal.newMutableList();
        public Long top_vip_no;
        public Long total_recharge_diamond_count;
        public UserAttr user_attr;
        public Integer user_role;
        public Boolean verified;
        public String verified_content;
        public Boolean verified_mobile;
        public String verified_reason;
        public AnchorLevel webcast_anchor_level;
        public Boolean with_commerce_permission;
        public Boolean with_fusion_shop_entry;
        public XiguaParams xigua_info;

        public final User build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12318, new Class[0], User.class)) {
                return (User) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12318, new Class[0], User.class);
            }
            User user = new User(this.id, this.short_id, this.nickname, this.gender, this.signature, this.level, this.birthday, this.telephone, this.avatar_thumb, this.avatar_medium, this.avatar_large, this.verified, this.experience, this.city, this.status, this.create_time, this.modify_time, this.secret, this.share_qrcode_uri, this.income_share_percent, this.badge_image_list, this.follow_info, this.pay_grade, this.fans_club, this.border, this.special_id, this.avatar_border, this.medal, this.real_time_icons, this.new_real_time_icons, this.top_vip_no, this.user_attr, this.own_room, this.pay_score, this.ticket_count, this.anchor_info, this.link_mic_stats, this.display_id, this.with_commerce_permission, this.with_fusion_shop_entry, this.total_recharge_diamond_count, this.webcast_anchor_level, this.verified_content, this.author_stats, this.top_fans, this.sec_uid, this.user_role, this.xigua_info, this.allow_be_located, this.allow_find_by_contacts, this.allow_others_download_video, this.allow_others_download_when_sharing_video, this.allow_share_show_profile, this.allow_show_in_gossip, this.allow_show_my_action, this.allow_strange_comment, this.allow_unfollower_comment, this.allow_use_linkmic, this.anchor_level, this.avatar_jpg, this.bg_img_url, this.birthday_description, this.birthday_valid, this.block_status, this.comment_restrict, this.constellation, this.disable_ichat, this.enable_ichat_img, this.exp, this.fan_ticket_count, this.fold_stranger_chat, this.follow_status, this.hotsoon_verified, this.hotsoon_verified_reason, this.ichat_restrict_type, this.id_str, this.is_follower, this.is_following, this.need_profile_guide, this.pay_scores, this.push_comment_status, this.push_digg, this.push_follow, this.push_friend_action, this.push_ichat, this.push_status, this.push_video_post, this.push_video_recommend, this.stats, this.verified_mobile, this.verified_reason, super.buildUnknownFields());
            return user;
        }

        public final Builder allow_be_located(Boolean bool) {
            this.allow_be_located = bool;
            return this;
        }

        public final Builder allow_find_by_contacts(Boolean bool) {
            this.allow_find_by_contacts = bool;
            return this;
        }

        public final Builder allow_others_download_video(Boolean bool) {
            this.allow_others_download_video = bool;
            return this;
        }

        public final Builder allow_others_download_when_sharing_video(Boolean bool) {
            this.allow_others_download_when_sharing_video = bool;
            return this;
        }

        public final Builder allow_share_show_profile(Boolean bool) {
            this.allow_share_show_profile = bool;
            return this;
        }

        public final Builder allow_show_in_gossip(Boolean bool) {
            this.allow_show_in_gossip = bool;
            return this;
        }

        public final Builder allow_show_my_action(Boolean bool) {
            this.allow_show_my_action = bool;
            return this;
        }

        public final Builder allow_strange_comment(Boolean bool) {
            this.allow_strange_comment = bool;
            return this;
        }

        public final Builder allow_unfollower_comment(Boolean bool) {
            this.allow_unfollower_comment = bool;
            return this;
        }

        public final Builder allow_use_linkmic(Boolean bool) {
            this.allow_use_linkmic = bool;
            return this;
        }

        public final Builder anchor_info(AnchorInfo anchorInfo) {
            this.anchor_info = anchorInfo;
            return this;
        }

        public final Builder anchor_level(AnchorLevel anchorLevel) {
            this.anchor_level = anchorLevel;
            return this;
        }

        public final Builder author_stats(AuthorStats authorStats) {
            this.author_stats = authorStats;
            return this;
        }

        public final Builder avatar_border(Image image) {
            this.avatar_border = image;
            return this;
        }

        public final Builder avatar_jpg(Image image) {
            this.avatar_jpg = image;
            return this;
        }

        public final Builder avatar_large(Image image) {
            this.avatar_large = image;
            return this;
        }

        public final Builder avatar_medium(Image image) {
            this.avatar_medium = image;
            return this;
        }

        public final Builder avatar_thumb(Image image) {
            this.avatar_thumb = image;
            return this;
        }

        public final Builder bg_img_url(String str) {
            this.bg_img_url = str;
            return this;
        }

        public final Builder birthday(Long l) {
            this.birthday = l;
            return this;
        }

        public final Builder birthday_description(String str) {
            this.birthday_description = str;
            return this;
        }

        public final Builder birthday_valid(Boolean bool) {
            this.birthday_valid = bool;
            return this;
        }

        public final Builder block_status(Integer num) {
            this.block_status = num;
            return this;
        }

        public final Builder border(Border border2) {
            this.border = border2;
            return this;
        }

        public final Builder city(String str) {
            this.city = str;
            return this;
        }

        public final Builder comment_restrict(Integer num) {
            this.comment_restrict = num;
            return this;
        }

        public final Builder constellation(String str) {
            this.constellation = str;
            return this;
        }

        public final Builder create_time(Long l) {
            this.create_time = l;
            return this;
        }

        public final Builder disable_ichat(Integer num) {
            this.disable_ichat = num;
            return this;
        }

        public final Builder display_id(String str) {
            this.display_id = str;
            return this;
        }

        public final Builder enable_ichat_img(Long l) {
            this.enable_ichat_img = l;
            return this;
        }

        public final Builder exp(Integer num) {
            this.exp = num;
            return this;
        }

        public final Builder experience(Integer num) {
            this.experience = num;
            return this;
        }

        public final Builder fan_ticket_count(Long l) {
            this.fan_ticket_count = l;
            return this;
        }

        public final Builder fans_club(FansClub fansClub) {
            this.fans_club = fansClub;
            return this;
        }

        public final Builder fold_stranger_chat(Boolean bool) {
            this.fold_stranger_chat = bool;
            return this;
        }

        public final Builder follow_info(FollowInfo followInfo) {
            this.follow_info = followInfo;
            return this;
        }

        public final Builder follow_status(Long l) {
            this.follow_status = l;
            return this;
        }

        public final Builder gender(Integer num) {
            this.gender = num;
            return this;
        }

        public final Builder hotsoon_verified(Boolean bool) {
            this.hotsoon_verified = bool;
            return this;
        }

        public final Builder hotsoon_verified_reason(String str) {
            this.hotsoon_verified_reason = str;
            return this;
        }

        public final Builder ichat_restrict_type(Integer num) {
            this.ichat_restrict_type = num;
            return this;
        }

        public final Builder id(Long l) {
            this.id = l;
            return this;
        }

        public final Builder id_str(String str) {
            this.id_str = str;
            return this;
        }

        public final Builder income_share_percent(Integer num) {
            this.income_share_percent = num;
            return this;
        }

        public final Builder is_follower(Boolean bool) {
            this.is_follower = bool;
            return this;
        }

        public final Builder is_following(Boolean bool) {
            this.is_following = bool;
            return this;
        }

        public final Builder level(Integer num) {
            this.level = num;
            return this;
        }

        public final Builder link_mic_stats(LinkmicStatus linkmicStatus) {
            this.link_mic_stats = linkmicStatus;
            return this;
        }

        public final Builder medal(Image image) {
            this.medal = image;
            return this;
        }

        public final Builder modify_time(Long l) {
            this.modify_time = l;
            return this;
        }

        public final Builder need_profile_guide(Boolean bool) {
            this.need_profile_guide = bool;
            return this;
        }

        public final Builder nickname(String str) {
            this.nickname = str;
            return this;
        }

        public final Builder own_room(OwnRoom ownRoom) {
            this.own_room = ownRoom;
            return this;
        }

        public final Builder pay_grade(PayGrade payGrade) {
            this.pay_grade = payGrade;
            return this;
        }

        public final Builder pay_score(Long l) {
            this.pay_score = l;
            return this;
        }

        public final Builder pay_scores(Long l) {
            this.pay_scores = l;
            return this;
        }

        public final Builder push_comment_status(Boolean bool) {
            this.push_comment_status = bool;
            return this;
        }

        public final Builder push_digg(Boolean bool) {
            this.push_digg = bool;
            return this;
        }

        public final Builder push_follow(Boolean bool) {
            this.push_follow = bool;
            return this;
        }

        public final Builder push_friend_action(Boolean bool) {
            this.push_friend_action = bool;
            return this;
        }

        public final Builder push_ichat(Boolean bool) {
            this.push_ichat = bool;
            return this;
        }

        public final Builder push_status(Boolean bool) {
            this.push_status = bool;
            return this;
        }

        public final Builder push_video_post(Boolean bool) {
            this.push_video_post = bool;
            return this;
        }

        public final Builder push_video_recommend(Boolean bool) {
            this.push_video_recommend = bool;
            return this;
        }

        public final Builder sec_uid(String str) {
            this.sec_uid = str;
            return this;
        }

        public final Builder secret(Integer num) {
            this.secret = num;
            return this;
        }

        public final Builder share_qrcode_uri(String str) {
            this.share_qrcode_uri = str;
            return this;
        }

        public final Builder short_id(Long l) {
            this.short_id = l;
            return this;
        }

        public final Builder signature(String str) {
            this.signature = str;
            return this;
        }

        public final Builder special_id(String str) {
            this.special_id = str;
            return this;
        }

        public final Builder stats(UserStats userStats) {
            this.stats = userStats;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }

        public final Builder telephone(String str) {
            this.telephone = str;
            return this;
        }

        public final Builder ticket_count(Long l) {
            this.ticket_count = l;
            return this;
        }

        public final Builder top_vip_no(Long l) {
            this.top_vip_no = l;
            return this;
        }

        public final Builder total_recharge_diamond_count(Long l) {
            this.total_recharge_diamond_count = l;
            return this;
        }

        public final Builder user_attr(UserAttr userAttr) {
            this.user_attr = userAttr;
            return this;
        }

        public final Builder user_role(Integer num) {
            this.user_role = num;
            return this;
        }

        public final Builder verified(Boolean bool) {
            this.verified = bool;
            return this;
        }

        public final Builder verified_content(String str) {
            this.verified_content = str;
            return this;
        }

        public final Builder verified_mobile(Boolean bool) {
            this.verified_mobile = bool;
            return this;
        }

        public final Builder verified_reason(String str) {
            this.verified_reason = str;
            return this;
        }

        public final Builder webcast_anchor_level(AnchorLevel anchorLevel) {
            this.webcast_anchor_level = anchorLevel;
            return this;
        }

        public final Builder with_commerce_permission(Boolean bool) {
            this.with_commerce_permission = bool;
            return this;
        }

        public final Builder with_fusion_shop_entry(Boolean bool) {
            this.with_fusion_shop_entry = bool;
            return this;
        }

        public final Builder xigua_info(XiguaParams xiguaParams) {
            this.xigua_info = xiguaParams;
            return this;
        }

        public final Builder badge_image_list(List<Image> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 12314, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 12314, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.badge_image_list = list;
            return this;
        }

        public final Builder new_real_time_icons(List<Image> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 12316, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 12316, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.new_real_time_icons = list;
            return this;
        }

        public final Builder real_time_icons(List<Image> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 12315, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 12315, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.real_time_icons = list;
            return this;
        }

        public final Builder top_fans(List<User> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 12317, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 12317, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.top_fans = list;
            return this;
        }
    }

    static final class ProtoAdapter_User extends ProtoAdapter<User> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_User() {
            super(FieldEncoding.LENGTH_DELIMITED, User.class);
        }

        public final User redact(User user) {
            if (PatchProxy.isSupport(new Object[]{user}, this, changeQuickRedirect, false, 12397, new Class[]{User.class}, User.class)) {
                return (User) PatchProxy.accessDispatch(new Object[]{user}, this, changeQuickRedirect, false, 12397, new Class[]{User.class}, User.class);
            }
            Builder newBuilder = user.newBuilder();
            if (newBuilder.avatar_thumb != null) {
                newBuilder.avatar_thumb = (Image) Image.ADAPTER.redact(newBuilder.avatar_thumb);
            }
            if (newBuilder.avatar_medium != null) {
                newBuilder.avatar_medium = (Image) Image.ADAPTER.redact(newBuilder.avatar_medium);
            }
            if (newBuilder.avatar_large != null) {
                newBuilder.avatar_large = (Image) Image.ADAPTER.redact(newBuilder.avatar_large);
            }
            Internal.redactElements(newBuilder.badge_image_list, Image.ADAPTER);
            if (newBuilder.follow_info != null) {
                newBuilder.follow_info = (FollowInfo) FollowInfo.ADAPTER.redact(newBuilder.follow_info);
            }
            if (newBuilder.pay_grade != null) {
                newBuilder.pay_grade = (PayGrade) PayGrade.ADAPTER.redact(newBuilder.pay_grade);
            }
            if (newBuilder.fans_club != null) {
                newBuilder.fans_club = (FansClub) FansClub.ADAPTER.redact(newBuilder.fans_club);
            }
            if (newBuilder.border != null) {
                newBuilder.border = (Border) Border.ADAPTER.redact(newBuilder.border);
            }
            if (newBuilder.avatar_border != null) {
                newBuilder.avatar_border = (Image) Image.ADAPTER.redact(newBuilder.avatar_border);
            }
            if (newBuilder.medal != null) {
                newBuilder.medal = (Image) Image.ADAPTER.redact(newBuilder.medal);
            }
            Internal.redactElements(newBuilder.real_time_icons, Image.ADAPTER);
            Internal.redactElements(newBuilder.new_real_time_icons, Image.ADAPTER);
            if (newBuilder.user_attr != null) {
                newBuilder.user_attr = (UserAttr) UserAttr.ADAPTER.redact(newBuilder.user_attr);
            }
            if (newBuilder.own_room != null) {
                newBuilder.own_room = (OwnRoom) OwnRoom.ADAPTER.redact(newBuilder.own_room);
            }
            if (newBuilder.anchor_info != null) {
                newBuilder.anchor_info = (AnchorInfo) AnchorInfo.ADAPTER.redact(newBuilder.anchor_info);
            }
            if (newBuilder.webcast_anchor_level != null) {
                newBuilder.webcast_anchor_level = (AnchorLevel) AnchorLevel.ADAPTER.redact(newBuilder.webcast_anchor_level);
            }
            if (newBuilder.author_stats != null) {
                newBuilder.author_stats = (AuthorStats) AuthorStats.ADAPTER.redact(newBuilder.author_stats);
            }
            Internal.redactElements(newBuilder.top_fans, User.ADAPTER);
            if (newBuilder.xigua_info != null) {
                newBuilder.xigua_info = (XiguaParams) XiguaParams.ADAPTER.redact(newBuilder.xigua_info);
            }
            if (newBuilder.anchor_level != null) {
                newBuilder.anchor_level = (AnchorLevel) AnchorLevel.ADAPTER.redact(newBuilder.anchor_level);
            }
            if (newBuilder.avatar_jpg != null) {
                newBuilder.avatar_jpg = (Image) Image.ADAPTER.redact(newBuilder.avatar_jpg);
            }
            if (newBuilder.stats != null) {
                newBuilder.stats = (UserStats) UserStats.ADAPTER.redact(newBuilder.stats);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final User decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12396, new Class[]{ProtoReader.class}, User.class)) {
                return (User) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12396, new Class[]{ProtoReader.class}, User.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 2:
                            builder.short_id((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 3:
                            builder.nickname((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 4:
                            builder.gender((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 5:
                            builder.signature((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 6:
                            builder.level((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case e.l /*7*/:
                            builder.birthday((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 8:
                            builder.telephone((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 9:
                            builder.avatar_thumb((Image) Image.ADAPTER.decode(protoReader2));
                            break;
                        case 10:
                            builder.avatar_medium((Image) Image.ADAPTER.decode(protoReader2));
                            break;
                        case 11:
                            builder.avatar_large((Image) Image.ADAPTER.decode(protoReader2));
                            break;
                        case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                            builder.verified((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 13:
                            builder.experience((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 14:
                            builder.city((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 15:
                            builder.status((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case SearchJediMixFeedAdapter.f42514c /*?: ONE_ARG  (16 int)*/:
                            builder.create_time((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 17:
                            builder.modify_time((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 18:
                            builder.secret((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 19:
                            builder.share_qrcode_uri((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 20:
                            builder.income_share_percent((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 21:
                            builder.badge_image_list.add(Image.ADAPTER.decode(protoReader2));
                            break;
                        case 22:
                            builder.follow_info((FollowInfo) FollowInfo.ADAPTER.decode(protoReader2));
                            break;
                        case 23:
                            builder.pay_grade((PayGrade) PayGrade.ADAPTER.decode(protoReader2));
                            break;
                        case 24:
                            builder.fans_club((FansClub) FansClub.ADAPTER.decode(protoReader2));
                            break;
                        case 25:
                            builder.border((Border) Border.ADAPTER.decode(protoReader2));
                            break;
                        case 26:
                            builder.special_id((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 27:
                            builder.avatar_border((Image) Image.ADAPTER.decode(protoReader2));
                            break;
                        case 28:
                            builder.medal((Image) Image.ADAPTER.decode(protoReader2));
                            break;
                        case 29:
                            builder.real_time_icons.add(Image.ADAPTER.decode(protoReader2));
                            break;
                        case c.f69366e /*30*/:
                            builder.new_real_time_icons.add(Image.ADAPTER.decode(protoReader2));
                            break;
                        case c.f69367f /*31*/:
                            builder.top_vip_no((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 32:
                            builder.user_attr((UserAttr) UserAttr.ADAPTER.decode(protoReader2));
                            break;
                        case 33:
                            builder.own_room((OwnRoom) OwnRoom.ADAPTER.decode(protoReader2));
                            break;
                        case 34:
                            builder.pay_score((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 35:
                            builder.ticket_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 36:
                            builder.anchor_info((AnchorInfo) AnchorInfo.ADAPTER.decode(protoReader2));
                            break;
                        case 37:
                            try {
                                builder.link_mic_stats((LinkmicStatus) LinkmicStatus.ADAPTER.decode(protoReader2));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 38:
                            builder.display_id((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 39:
                            builder.with_commerce_permission((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 40:
                            builder.with_fusion_shop_entry((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case 41:
                            builder.total_recharge_diamond_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 42:
                            builder.webcast_anchor_level((AnchorLevel) AnchorLevel.ADAPTER.decode(protoReader2));
                            break;
                        case 43:
                            builder.verified_content((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 44:
                            builder.author_stats((AuthorStats) AuthorStats.ADAPTER.decode(protoReader2));
                            break;
                        case 45:
                            builder.top_fans.add(User.ADAPTER.decode(protoReader2));
                            break;
                        case 46:
                            builder.sec_uid((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 47:
                            builder.user_role((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 48:
                            builder.xigua_info((XiguaParams) XiguaParams.ADAPTER.decode(protoReader2));
                            break;
                        default:
                            switch (nextTag) {
                                case PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST /*1001*/:
                                    builder.allow_be_located((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                    break;
                                case PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR /*1002*/:
                                    builder.allow_find_by_contacts((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                    break;
                                case 1003:
                                    builder.allow_others_download_video((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                    break;
                                case CrashModule.MODULE_ID /*1004*/:
                                    builder.allow_others_download_when_sharing_video((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                    break;
                                case 1005:
                                    builder.allow_share_show_profile((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                    break;
                                case 1006:
                                    builder.allow_show_in_gossip((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                    break;
                                case 1007:
                                    builder.allow_show_my_action((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                    break;
                                case 1008:
                                    builder.allow_strange_comment((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                    break;
                                case 1009:
                                    builder.allow_unfollower_comment((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                    break;
                                case 1010:
                                    builder.allow_use_linkmic((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                    break;
                                case 1011:
                                    builder.anchor_level((AnchorLevel) AnchorLevel.ADAPTER.decode(protoReader2));
                                    break;
                                case 1012:
                                    builder.avatar_jpg((Image) Image.ADAPTER.decode(protoReader2));
                                    break;
                                case 1013:
                                    builder.bg_img_url((String) ProtoAdapter.STRING.decode(protoReader2));
                                    break;
                                case 1014:
                                    builder.birthday_description((String) ProtoAdapter.STRING.decode(protoReader2));
                                    break;
                                case 1015:
                                    builder.birthday_valid((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                    break;
                                case 1016:
                                    builder.block_status((Integer) ProtoAdapter.INT32.decode(protoReader2));
                                    break;
                                case 1017:
                                    builder.comment_restrict((Integer) ProtoAdapter.INT32.decode(protoReader2));
                                    break;
                                case 1018:
                                    builder.constellation((String) ProtoAdapter.STRING.decode(protoReader2));
                                    break;
                                case 1019:
                                    builder.disable_ichat((Integer) ProtoAdapter.INT32.decode(protoReader2));
                                    break;
                                case 1020:
                                    builder.enable_ichat_img((Long) ProtoAdapter.INT64.decode(protoReader2));
                                    break;
                                case 1021:
                                    builder.exp((Integer) ProtoAdapter.INT32.decode(protoReader2));
                                    break;
                                case 1022:
                                    builder.fan_ticket_count((Long) ProtoAdapter.INT64.decode(protoReader2));
                                    break;
                                case 1023:
                                    builder.fold_stranger_chat((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                    break;
                                case 1024:
                                    builder.follow_status((Long) ProtoAdapter.INT64.decode(protoReader2));
                                    break;
                                case 1025:
                                    builder.hotsoon_verified((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                    break;
                                case 1026:
                                    builder.hotsoon_verified_reason((String) ProtoAdapter.STRING.decode(protoReader2));
                                    break;
                                case 1027:
                                    builder.ichat_restrict_type((Integer) ProtoAdapter.INT32.decode(protoReader2));
                                    break;
                                case 1028:
                                    builder.id_str((String) ProtoAdapter.STRING.decode(protoReader2));
                                    break;
                                case 1029:
                                    builder.is_follower((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                    break;
                                case 1030:
                                    builder.is_following((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                    break;
                                case 1031:
                                    builder.need_profile_guide((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                    break;
                                case 1032:
                                    builder.pay_scores((Long) ProtoAdapter.INT64.decode(protoReader2));
                                    break;
                                case 1033:
                                    builder.push_comment_status((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                    break;
                                case 1034:
                                    builder.push_digg((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                    break;
                                case 1035:
                                    builder.push_follow((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                    break;
                                case 1036:
                                    builder.push_friend_action((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                    break;
                                case 1037:
                                    builder.push_ichat((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                    break;
                                case 1038:
                                    builder.push_status((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                    break;
                                case 1039:
                                    builder.push_video_post((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                    break;
                                case 1040:
                                    builder.push_video_recommend((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                    break;
                                case 1041:
                                    builder.stats((UserStats) UserStats.ADAPTER.decode(protoReader2));
                                    break;
                                case 1042:
                                    builder.verified_mobile((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                                    break;
                                case 1043:
                                    builder.verified_reason((String) ProtoAdapter.STRING.decode(protoReader2));
                                    break;
                                default:
                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                    break;
                            }
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final int encodedSize(User user) {
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
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            int i28;
            int i29;
            int i30;
            int i31;
            int i32;
            int i33;
            int i34;
            int i35;
            int i36;
            int i37;
            int i38;
            int i39;
            int i40;
            int i41;
            int i42;
            int i43;
            int i44;
            int i45;
            int i46;
            int i47;
            int i48;
            int i49;
            int i50;
            int i51;
            int i52;
            int i53;
            int i54;
            int i55;
            int i56;
            int i57;
            int i58;
            int i59;
            int i60;
            int i61;
            int i62;
            int i63;
            int i64;
            int i65;
            int i66;
            int i67;
            int i68;
            int i69;
            int i70;
            int i71;
            int i72;
            int i73;
            int i74;
            int i75;
            int i76;
            int i77;
            int i78;
            int i79;
            int i80;
            int i81;
            int i82;
            int i83;
            int i84;
            int i85;
            int i86;
            User user2 = user;
            int i87 = 0;
            if (PatchProxy.isSupport(new Object[]{user2}, this, changeQuickRedirect, false, 12394, new Class[]{User.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{user2}, this, changeQuickRedirect, false, 12394, new Class[]{User.class}, Integer.TYPE)).intValue();
            }
            if (user2.id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, user2.id);
            } else {
                i = 0;
            }
            if (user2.short_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, user2.short_id);
            } else {
                i2 = 0;
            }
            int i88 = i + i2;
            if (user2.nickname != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, user2.nickname);
            } else {
                i3 = 0;
            }
            int i89 = i88 + i3;
            if (user2.gender != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(4, user2.gender);
            } else {
                i4 = 0;
            }
            int i90 = i89 + i4;
            if (user2.signature != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, user2.signature);
            } else {
                i5 = 0;
            }
            int i91 = i90 + i5;
            if (user2.level != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(6, user2.level);
            } else {
                i6 = 0;
            }
            int i92 = i91 + i6;
            if (user2.birthday != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, user2.birthday);
            } else {
                i7 = 0;
            }
            int i93 = i92 + i7;
            if (user2.telephone != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(8, user2.telephone);
            } else {
                i8 = 0;
            }
            int i94 = i93 + i8;
            if (user2.avatar_thumb != null) {
                i9 = Image.ADAPTER.encodedSizeWithTag(9, user2.avatar_thumb);
            } else {
                i9 = 0;
            }
            int i95 = i94 + i9;
            if (user2.avatar_medium != null) {
                i10 = Image.ADAPTER.encodedSizeWithTag(10, user2.avatar_medium);
            } else {
                i10 = 0;
            }
            int i96 = i95 + i10;
            if (user2.avatar_large != null) {
                i11 = Image.ADAPTER.encodedSizeWithTag(11, user2.avatar_large);
            } else {
                i11 = 0;
            }
            int i97 = i96 + i11;
            if (user2.verified != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(12, user2.verified);
            } else {
                i12 = 0;
            }
            int i98 = i97 + i12;
            if (user2.experience != null) {
                i13 = ProtoAdapter.INT32.encodedSizeWithTag(13, user2.experience);
            } else {
                i13 = 0;
            }
            int i99 = i98 + i13;
            if (user2.city != null) {
                i14 = ProtoAdapter.STRING.encodedSizeWithTag(14, user2.city);
            } else {
                i14 = 0;
            }
            int i100 = i99 + i14;
            if (user2.status != null) {
                i15 = ProtoAdapter.INT32.encodedSizeWithTag(15, user2.status);
            } else {
                i15 = 0;
            }
            int i101 = i100 + i15;
            if (user2.create_time != null) {
                i16 = ProtoAdapter.INT64.encodedSizeWithTag(16, user2.create_time);
            } else {
                i16 = 0;
            }
            int i102 = i101 + i16;
            if (user2.modify_time != null) {
                i17 = ProtoAdapter.INT64.encodedSizeWithTag(17, user2.modify_time);
            } else {
                i17 = 0;
            }
            int i103 = i102 + i17;
            if (user2.secret != null) {
                i18 = ProtoAdapter.INT32.encodedSizeWithTag(18, user2.secret);
            } else {
                i18 = 0;
            }
            int i104 = i103 + i18;
            if (user2.share_qrcode_uri != null) {
                i19 = ProtoAdapter.STRING.encodedSizeWithTag(19, user2.share_qrcode_uri);
            } else {
                i19 = 0;
            }
            int i105 = i104 + i19;
            if (user2.income_share_percent != null) {
                i20 = ProtoAdapter.INT32.encodedSizeWithTag(20, user2.income_share_percent);
            } else {
                i20 = 0;
            }
            int encodedSizeWithTag = i105 + i20 + Image.ADAPTER.asRepeated().encodedSizeWithTag(21, user2.badge_image_list);
            if (user2.follow_info != null) {
                i21 = FollowInfo.ADAPTER.encodedSizeWithTag(22, user2.follow_info);
            } else {
                i21 = 0;
            }
            int i106 = encodedSizeWithTag + i21;
            if (user2.pay_grade != null) {
                i22 = PayGrade.ADAPTER.encodedSizeWithTag(23, user2.pay_grade);
            } else {
                i22 = 0;
            }
            int i107 = i106 + i22;
            if (user2.fans_club != null) {
                i23 = FansClub.ADAPTER.encodedSizeWithTag(24, user2.fans_club);
            } else {
                i23 = 0;
            }
            int i108 = i107 + i23;
            if (user2.border != null) {
                i24 = Border.ADAPTER.encodedSizeWithTag(25, user2.border);
            } else {
                i24 = 0;
            }
            int i109 = i108 + i24;
            if (user2.special_id != null) {
                i25 = ProtoAdapter.STRING.encodedSizeWithTag(26, user2.special_id);
            } else {
                i25 = 0;
            }
            int i110 = i109 + i25;
            if (user2.avatar_border != null) {
                i26 = Image.ADAPTER.encodedSizeWithTag(27, user2.avatar_border);
            } else {
                i26 = 0;
            }
            int i111 = i110 + i26;
            if (user2.medal != null) {
                i27 = Image.ADAPTER.encodedSizeWithTag(28, user2.medal);
            } else {
                i27 = 0;
            }
            int encodedSizeWithTag2 = i111 + i27 + Image.ADAPTER.asRepeated().encodedSizeWithTag(29, user2.real_time_icons) + Image.ADAPTER.asRepeated().encodedSizeWithTag(30, user2.new_real_time_icons);
            if (user2.top_vip_no != null) {
                i28 = ProtoAdapter.INT64.encodedSizeWithTag(31, user2.top_vip_no);
            } else {
                i28 = 0;
            }
            int i112 = encodedSizeWithTag2 + i28;
            if (user2.user_attr != null) {
                i29 = UserAttr.ADAPTER.encodedSizeWithTag(32, user2.user_attr);
            } else {
                i29 = 0;
            }
            int i113 = i112 + i29;
            if (user2.own_room != null) {
                i30 = OwnRoom.ADAPTER.encodedSizeWithTag(33, user2.own_room);
            } else {
                i30 = 0;
            }
            int i114 = i113 + i30;
            if (user2.pay_score != null) {
                i31 = ProtoAdapter.INT64.encodedSizeWithTag(34, user2.pay_score);
            } else {
                i31 = 0;
            }
            int i115 = i114 + i31;
            if (user2.ticket_count != null) {
                i32 = ProtoAdapter.INT64.encodedSizeWithTag(35, user2.ticket_count);
            } else {
                i32 = 0;
            }
            int i116 = i115 + i32;
            if (user2.anchor_info != null) {
                i33 = AnchorInfo.ADAPTER.encodedSizeWithTag(36, user2.anchor_info);
            } else {
                i33 = 0;
            }
            int i117 = i116 + i33;
            if (user2.link_mic_stats != null) {
                i34 = LinkmicStatus.ADAPTER.encodedSizeWithTag(37, user2.link_mic_stats);
            } else {
                i34 = 0;
            }
            int i118 = i117 + i34;
            if (user2.display_id != null) {
                i35 = ProtoAdapter.STRING.encodedSizeWithTag(38, user2.display_id);
            } else {
                i35 = 0;
            }
            int i119 = i118 + i35;
            if (user2.with_commerce_permission != null) {
                i36 = ProtoAdapter.BOOL.encodedSizeWithTag(39, user2.with_commerce_permission);
            } else {
                i36 = 0;
            }
            int i120 = i119 + i36;
            if (user2.with_fusion_shop_entry != null) {
                i37 = ProtoAdapter.BOOL.encodedSizeWithTag(40, user2.with_fusion_shop_entry);
            } else {
                i37 = 0;
            }
            int i121 = i120 + i37;
            if (user2.total_recharge_diamond_count != null) {
                i38 = ProtoAdapter.INT64.encodedSizeWithTag(41, user2.total_recharge_diamond_count);
            } else {
                i38 = 0;
            }
            int i122 = i121 + i38;
            if (user2.webcast_anchor_level != null) {
                i39 = AnchorLevel.ADAPTER.encodedSizeWithTag(42, user2.webcast_anchor_level);
            } else {
                i39 = 0;
            }
            int i123 = i122 + i39;
            if (user2.verified_content != null) {
                i40 = ProtoAdapter.STRING.encodedSizeWithTag(43, user2.verified_content);
            } else {
                i40 = 0;
            }
            int i124 = i123 + i40;
            if (user2.author_stats != null) {
                i41 = AuthorStats.ADAPTER.encodedSizeWithTag(44, user2.author_stats);
            } else {
                i41 = 0;
            }
            int encodedSizeWithTag3 = i124 + i41 + User.ADAPTER.asRepeated().encodedSizeWithTag(45, user2.top_fans);
            if (user2.sec_uid != null) {
                i42 = ProtoAdapter.STRING.encodedSizeWithTag(46, user2.sec_uid);
            } else {
                i42 = 0;
            }
            int i125 = encodedSizeWithTag3 + i42;
            if (user2.user_role != null) {
                i43 = ProtoAdapter.INT32.encodedSizeWithTag(47, user2.user_role);
            } else {
                i43 = 0;
            }
            int i126 = i125 + i43;
            if (user2.xigua_info != null) {
                i44 = XiguaParams.ADAPTER.encodedSizeWithTag(48, user2.xigua_info);
            } else {
                i44 = 0;
            }
            int i127 = i126 + i44;
            if (user2.allow_be_located != null) {
                i45 = ProtoAdapter.BOOL.encodedSizeWithTag(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST, user2.allow_be_located);
            } else {
                i45 = 0;
            }
            int i128 = i127 + i45;
            if (user2.allow_find_by_contacts != null) {
                i46 = ProtoAdapter.BOOL.encodedSizeWithTag(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR, user2.allow_find_by_contacts);
            } else {
                i46 = 0;
            }
            int i129 = i128 + i46;
            if (user2.allow_others_download_video != null) {
                i47 = ProtoAdapter.BOOL.encodedSizeWithTag(1003, user2.allow_others_download_video);
            } else {
                i47 = 0;
            }
            int i130 = i129 + i47;
            if (user2.allow_others_download_when_sharing_video != null) {
                i48 = ProtoAdapter.BOOL.encodedSizeWithTag(CrashModule.MODULE_ID, user2.allow_others_download_when_sharing_video);
            } else {
                i48 = 0;
            }
            int i131 = i130 + i48;
            if (user2.allow_share_show_profile != null) {
                i49 = ProtoAdapter.BOOL.encodedSizeWithTag(1005, user2.allow_share_show_profile);
            } else {
                i49 = 0;
            }
            int i132 = i131 + i49;
            if (user2.allow_show_in_gossip != null) {
                i50 = ProtoAdapter.BOOL.encodedSizeWithTag(1006, user2.allow_show_in_gossip);
            } else {
                i50 = 0;
            }
            int i133 = i132 + i50;
            if (user2.allow_show_my_action != null) {
                i51 = ProtoAdapter.BOOL.encodedSizeWithTag(1007, user2.allow_show_my_action);
            } else {
                i51 = 0;
            }
            int i134 = i133 + i51;
            if (user2.allow_strange_comment != null) {
                i52 = ProtoAdapter.BOOL.encodedSizeWithTag(1008, user2.allow_strange_comment);
            } else {
                i52 = 0;
            }
            int i135 = i134 + i52;
            if (user2.allow_unfollower_comment != null) {
                i53 = ProtoAdapter.BOOL.encodedSizeWithTag(1009, user2.allow_unfollower_comment);
            } else {
                i53 = 0;
            }
            int i136 = i135 + i53;
            if (user2.allow_use_linkmic != null) {
                i54 = ProtoAdapter.BOOL.encodedSizeWithTag(1010, user2.allow_use_linkmic);
            } else {
                i54 = 0;
            }
            int i137 = i136 + i54;
            if (user2.anchor_level != null) {
                i55 = AnchorLevel.ADAPTER.encodedSizeWithTag(1011, user2.anchor_level);
            } else {
                i55 = 0;
            }
            int i138 = i137 + i55;
            if (user2.avatar_jpg != null) {
                i56 = Image.ADAPTER.encodedSizeWithTag(1012, user2.avatar_jpg);
            } else {
                i56 = 0;
            }
            int i139 = i138 + i56;
            if (user2.bg_img_url != null) {
                i57 = ProtoAdapter.STRING.encodedSizeWithTag(1013, user2.bg_img_url);
            } else {
                i57 = 0;
            }
            int i140 = i139 + i57;
            if (user2.birthday_description != null) {
                i58 = ProtoAdapter.STRING.encodedSizeWithTag(1014, user2.birthday_description);
            } else {
                i58 = 0;
            }
            int i141 = i140 + i58;
            if (user2.birthday_valid != null) {
                i59 = ProtoAdapter.BOOL.encodedSizeWithTag(1015, user2.birthday_valid);
            } else {
                i59 = 0;
            }
            int i142 = i141 + i59;
            if (user2.block_status != null) {
                i60 = ProtoAdapter.INT32.encodedSizeWithTag(1016, user2.block_status);
            } else {
                i60 = 0;
            }
            int i143 = i142 + i60;
            if (user2.comment_restrict != null) {
                i61 = ProtoAdapter.INT32.encodedSizeWithTag(1017, user2.comment_restrict);
            } else {
                i61 = 0;
            }
            int i144 = i143 + i61;
            if (user2.constellation != null) {
                i62 = ProtoAdapter.STRING.encodedSizeWithTag(1018, user2.constellation);
            } else {
                i62 = 0;
            }
            int i145 = i144 + i62;
            if (user2.disable_ichat != null) {
                i63 = ProtoAdapter.INT32.encodedSizeWithTag(1019, user2.disable_ichat);
            } else {
                i63 = 0;
            }
            int i146 = i145 + i63;
            if (user2.enable_ichat_img != null) {
                i64 = ProtoAdapter.INT64.encodedSizeWithTag(1020, user2.enable_ichat_img);
            } else {
                i64 = 0;
            }
            int i147 = i146 + i64;
            if (user2.exp != null) {
                i65 = ProtoAdapter.INT32.encodedSizeWithTag(1021, user2.exp);
            } else {
                i65 = 0;
            }
            int i148 = i147 + i65;
            if (user2.fan_ticket_count != null) {
                i66 = ProtoAdapter.INT64.encodedSizeWithTag(1022, user2.fan_ticket_count);
            } else {
                i66 = 0;
            }
            int i149 = i148 + i66;
            if (user2.fold_stranger_chat != null) {
                i67 = ProtoAdapter.BOOL.encodedSizeWithTag(1023, user2.fold_stranger_chat);
            } else {
                i67 = 0;
            }
            int i150 = i149 + i67;
            if (user2.follow_status != null) {
                i68 = ProtoAdapter.INT64.encodedSizeWithTag(1024, user2.follow_status);
            } else {
                i68 = 0;
            }
            int i151 = i150 + i68;
            if (user2.hotsoon_verified != null) {
                i69 = ProtoAdapter.BOOL.encodedSizeWithTag(1025, user2.hotsoon_verified);
            } else {
                i69 = 0;
            }
            int i152 = i151 + i69;
            if (user2.hotsoon_verified_reason != null) {
                i70 = ProtoAdapter.STRING.encodedSizeWithTag(1026, user2.hotsoon_verified_reason);
            } else {
                i70 = 0;
            }
            int i153 = i152 + i70;
            if (user2.ichat_restrict_type != null) {
                i71 = ProtoAdapter.INT32.encodedSizeWithTag(1027, user2.ichat_restrict_type);
            } else {
                i71 = 0;
            }
            int i154 = i153 + i71;
            if (user2.id_str != null) {
                i72 = ProtoAdapter.STRING.encodedSizeWithTag(1028, user2.id_str);
            } else {
                i72 = 0;
            }
            int i155 = i154 + i72;
            if (user2.is_follower != null) {
                i73 = ProtoAdapter.BOOL.encodedSizeWithTag(1029, user2.is_follower);
            } else {
                i73 = 0;
            }
            int i156 = i155 + i73;
            if (user2.is_following != null) {
                i74 = ProtoAdapter.BOOL.encodedSizeWithTag(1030, user2.is_following);
            } else {
                i74 = 0;
            }
            int i157 = i156 + i74;
            if (user2.need_profile_guide != null) {
                i75 = ProtoAdapter.BOOL.encodedSizeWithTag(1031, user2.need_profile_guide);
            } else {
                i75 = 0;
            }
            int i158 = i157 + i75;
            if (user2.pay_scores != null) {
                i76 = ProtoAdapter.INT64.encodedSizeWithTag(1032, user2.pay_scores);
            } else {
                i76 = 0;
            }
            int i159 = i158 + i76;
            if (user2.push_comment_status != null) {
                i77 = ProtoAdapter.BOOL.encodedSizeWithTag(1033, user2.push_comment_status);
            } else {
                i77 = 0;
            }
            int i160 = i159 + i77;
            if (user2.push_digg != null) {
                i78 = ProtoAdapter.BOOL.encodedSizeWithTag(1034, user2.push_digg);
            } else {
                i78 = 0;
            }
            int i161 = i160 + i78;
            if (user2.push_follow != null) {
                i79 = ProtoAdapter.BOOL.encodedSizeWithTag(1035, user2.push_follow);
            } else {
                i79 = 0;
            }
            int i162 = i161 + i79;
            if (user2.push_friend_action != null) {
                i80 = ProtoAdapter.BOOL.encodedSizeWithTag(1036, user2.push_friend_action);
            } else {
                i80 = 0;
            }
            int i163 = i162 + i80;
            if (user2.push_ichat != null) {
                i81 = ProtoAdapter.BOOL.encodedSizeWithTag(1037, user2.push_ichat);
            } else {
                i81 = 0;
            }
            int i164 = i163 + i81;
            if (user2.push_status != null) {
                i82 = ProtoAdapter.BOOL.encodedSizeWithTag(1038, user2.push_status);
            } else {
                i82 = 0;
            }
            int i165 = i164 + i82;
            if (user2.push_video_post != null) {
                i83 = ProtoAdapter.BOOL.encodedSizeWithTag(1039, user2.push_video_post);
            } else {
                i83 = 0;
            }
            int i166 = i165 + i83;
            if (user2.push_video_recommend != null) {
                i84 = ProtoAdapter.BOOL.encodedSizeWithTag(1040, user2.push_video_recommend);
            } else {
                i84 = 0;
            }
            int i167 = i166 + i84;
            if (user2.stats != null) {
                i85 = UserStats.ADAPTER.encodedSizeWithTag(1041, user2.stats);
            } else {
                i85 = 0;
            }
            int i168 = i167 + i85;
            if (user2.verified_mobile != null) {
                i86 = ProtoAdapter.BOOL.encodedSizeWithTag(1042, user2.verified_mobile);
            } else {
                i86 = 0;
            }
            int i169 = i168 + i86;
            if (user2.verified_reason != null) {
                i87 = ProtoAdapter.STRING.encodedSizeWithTag(1043, user2.verified_reason);
            }
            return i169 + i87 + user.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, User user) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            User user2 = user;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, user2}, this, changeQuickRedirect, false, 12395, new Class[]{ProtoWriter.class, User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, user2}, this, changeQuickRedirect, false, 12395, new Class[]{ProtoWriter.class, User.class}, Void.TYPE);
                return;
            }
            if (user2.id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, user2.id);
            }
            if (user2.short_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, user2.short_id);
            }
            if (user2.nickname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, user2.nickname);
            }
            if (user2.gender != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 4, user2.gender);
            }
            if (user2.signature != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 5, user2.signature);
            }
            if (user2.level != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 6, user2.level);
            }
            if (user2.birthday != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 7, user2.birthday);
            }
            if (user2.telephone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 8, user2.telephone);
            }
            if (user2.avatar_thumb != null) {
                Image.ADAPTER.encodeWithTag(protoWriter2, 9, user2.avatar_thumb);
            }
            if (user2.avatar_medium != null) {
                Image.ADAPTER.encodeWithTag(protoWriter2, 10, user2.avatar_medium);
            }
            if (user2.avatar_large != null) {
                Image.ADAPTER.encodeWithTag(protoWriter2, 11, user2.avatar_large);
            }
            if (user2.verified != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 12, user2.verified);
            }
            if (user2.experience != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 13, user2.experience);
            }
            if (user2.city != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 14, user2.city);
            }
            if (user2.status != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 15, user2.status);
            }
            if (user2.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 16, user2.create_time);
            }
            if (user2.modify_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 17, user2.modify_time);
            }
            if (user2.secret != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 18, user2.secret);
            }
            if (user2.share_qrcode_uri != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 19, user2.share_qrcode_uri);
            }
            if (user2.income_share_percent != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 20, user2.income_share_percent);
            }
            Image.ADAPTER.asRepeated().encodeWithTag(protoWriter2, 21, user2.badge_image_list);
            if (user2.follow_info != null) {
                FollowInfo.ADAPTER.encodeWithTag(protoWriter2, 22, user2.follow_info);
            }
            if (user2.pay_grade != null) {
                PayGrade.ADAPTER.encodeWithTag(protoWriter2, 23, user2.pay_grade);
            }
            if (user2.fans_club != null) {
                FansClub.ADAPTER.encodeWithTag(protoWriter2, 24, user2.fans_club);
            }
            if (user2.border != null) {
                Border.ADAPTER.encodeWithTag(protoWriter2, 25, user2.border);
            }
            if (user2.special_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 26, user2.special_id);
            }
            if (user2.avatar_border != null) {
                Image.ADAPTER.encodeWithTag(protoWriter2, 27, user2.avatar_border);
            }
            if (user2.medal != null) {
                Image.ADAPTER.encodeWithTag(protoWriter2, 28, user2.medal);
            }
            Image.ADAPTER.asRepeated().encodeWithTag(protoWriter2, 29, user2.real_time_icons);
            Image.ADAPTER.asRepeated().encodeWithTag(protoWriter2, 30, user2.new_real_time_icons);
            if (user2.top_vip_no != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 31, user2.top_vip_no);
            }
            if (user2.user_attr != null) {
                UserAttr.ADAPTER.encodeWithTag(protoWriter2, 32, user2.user_attr);
            }
            if (user2.own_room != null) {
                OwnRoom.ADAPTER.encodeWithTag(protoWriter2, 33, user2.own_room);
            }
            if (user2.pay_score != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 34, user2.pay_score);
            }
            if (user2.ticket_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 35, user2.ticket_count);
            }
            if (user2.anchor_info != null) {
                AnchorInfo.ADAPTER.encodeWithTag(protoWriter2, 36, user2.anchor_info);
            }
            if (user2.link_mic_stats != null) {
                LinkmicStatus.ADAPTER.encodeWithTag(protoWriter2, 37, user2.link_mic_stats);
            }
            if (user2.display_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 38, user2.display_id);
            }
            if (user2.with_commerce_permission != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 39, user2.with_commerce_permission);
            }
            if (user2.with_fusion_shop_entry != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 40, user2.with_fusion_shop_entry);
            }
            if (user2.total_recharge_diamond_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 41, user2.total_recharge_diamond_count);
            }
            if (user2.webcast_anchor_level != null) {
                AnchorLevel.ADAPTER.encodeWithTag(protoWriter2, 42, user2.webcast_anchor_level);
            }
            if (user2.verified_content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 43, user2.verified_content);
            }
            if (user2.author_stats != null) {
                AuthorStats.ADAPTER.encodeWithTag(protoWriter2, 44, user2.author_stats);
            }
            User.ADAPTER.asRepeated().encodeWithTag(protoWriter2, 45, user2.top_fans);
            if (user2.sec_uid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 46, user2.sec_uid);
            }
            if (user2.user_role != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 47, user2.user_role);
            }
            if (user2.xigua_info != null) {
                XiguaParams.ADAPTER.encodeWithTag(protoWriter2, 48, user2.xigua_info);
            }
            if (user2.allow_be_located != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST, user2.allow_be_located);
            }
            if (user2.allow_find_by_contacts != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR, user2.allow_find_by_contacts);
            }
            if (user2.allow_others_download_video != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1003, user2.allow_others_download_video);
            }
            if (user2.allow_others_download_when_sharing_video != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, CrashModule.MODULE_ID, user2.allow_others_download_when_sharing_video);
            }
            if (user2.allow_share_show_profile != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1005, user2.allow_share_show_profile);
            }
            if (user2.allow_show_in_gossip != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1006, user2.allow_show_in_gossip);
            }
            if (user2.allow_show_my_action != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1007, user2.allow_show_my_action);
            }
            if (user2.allow_strange_comment != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1008, user2.allow_strange_comment);
            }
            if (user2.allow_unfollower_comment != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1009, user2.allow_unfollower_comment);
            }
            if (user2.allow_use_linkmic != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1010, user2.allow_use_linkmic);
            }
            if (user2.anchor_level != null) {
                AnchorLevel.ADAPTER.encodeWithTag(protoWriter2, 1011, user2.anchor_level);
            }
            if (user2.avatar_jpg != null) {
                Image.ADAPTER.encodeWithTag(protoWriter2, 1012, user2.avatar_jpg);
            }
            if (user2.bg_img_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1013, user2.bg_img_url);
            }
            if (user2.birthday_description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1014, user2.birthday_description);
            }
            if (user2.birthday_valid != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1015, user2.birthday_valid);
            }
            if (user2.block_status != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1016, user2.block_status);
            }
            if (user2.comment_restrict != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1017, user2.comment_restrict);
            }
            if (user2.constellation != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1018, user2.constellation);
            }
            if (user2.disable_ichat != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1019, user2.disable_ichat);
            }
            if (user2.enable_ichat_img != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1020, user2.enable_ichat_img);
            }
            if (user2.exp != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1021, user2.exp);
            }
            if (user2.fan_ticket_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1022, user2.fan_ticket_count);
            }
            if (user2.fold_stranger_chat != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1023, user2.fold_stranger_chat);
            }
            if (user2.follow_status != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1024, user2.follow_status);
            }
            if (user2.hotsoon_verified != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1025, user2.hotsoon_verified);
            }
            if (user2.hotsoon_verified_reason != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1026, user2.hotsoon_verified_reason);
            }
            if (user2.ichat_restrict_type != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1027, user2.ichat_restrict_type);
            }
            if (user2.id_str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1028, user2.id_str);
            }
            if (user2.is_follower != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1029, user2.is_follower);
            }
            if (user2.is_following != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1030, user2.is_following);
            }
            if (user2.need_profile_guide != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1031, user2.need_profile_guide);
            }
            if (user2.pay_scores != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1032, user2.pay_scores);
            }
            if (user2.push_comment_status != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1033, user2.push_comment_status);
            }
            if (user2.push_digg != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1034, user2.push_digg);
            }
            if (user2.push_follow != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1035, user2.push_follow);
            }
            if (user2.push_friend_action != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1036, user2.push_friend_action);
            }
            if (user2.push_ichat != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1037, user2.push_ichat);
            }
            if (user2.push_status != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1038, user2.push_status);
            }
            if (user2.push_video_post != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1039, user2.push_video_post);
            }
            if (user2.push_video_recommend != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1040, user2.push_video_recommend);
            }
            if (user2.stats != null) {
                UserStats.ADAPTER.encodeWithTag(protoWriter2, 1041, user2.stats);
            }
            if (user2.verified_mobile != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 1042, user2.verified_mobile);
            }
            if (user2.verified_reason != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1043, user2.verified_reason);
            }
            protoWriter2.writeBytes(user.unknownFields());
        }
    }

    public User(Long l, Long l2, String str, Integer num, String str2, Integer num2, Long l3, String str3, Image image, Image image2, Image image3, Boolean bool, Integer num3, String str4, Integer num4, Long l4, Long l5, Integer num5, String str5, Integer num6, List<Image> list, FollowInfo followInfo, PayGrade payGrade, FansClub fansClub, Border border2, String str6, Image image4, Image image5, List<Image> list2, List<Image> list3, Long l6, UserAttr userAttr, OwnRoom ownRoom, Long l7, Long l8, AnchorInfo anchorInfo, LinkmicStatus linkmicStatus, String str7, Boolean bool2, Boolean bool3, Long l9, AnchorLevel anchorLevel, String str8, AuthorStats authorStats, List<User> list4, String str9, Integer num7, XiguaParams xiguaParams, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, AnchorLevel anchorLevel2, Image image6, String str10, String str11, Boolean bool14, Integer num8, Integer num9, String str12, Integer num10, Long l10, Integer num11, Long l11, Boolean bool15, Long l12, Boolean bool16, String str13, Integer num12, String str14, Boolean bool17, Boolean bool18, Boolean bool19, Long l13, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Boolean bool27, UserStats userStats, Boolean bool28, String str15) {
        this(l, l2, str, num, str2, num2, l3, str3, image, image2, image3, bool, num3, str4, num4, l4, l5, num5, str5, num6, list, followInfo, payGrade, fansClub, border2, str6, image4, image5, list2, list3, l6, userAttr, ownRoom, l7, l8, anchorInfo, linkmicStatus, str7, bool2, bool3, l9, anchorLevel, str8, authorStats, list4, str9, num7, xiguaParams, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, anchorLevel2, image6, str10, str11, bool14, num8, num9, str12, num10, l10, num11, l11, bool15, l12, bool16, str13, num12, str14, bool17, bool18, bool19, l13, bool20, bool21, bool22, bool23, bool24, bool25, bool26, bool27, userStats, bool28, str15, ByteString.EMPTY);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public User(Long l, Long l2, String str, Integer num, String str2, Integer num2, Long l3, String str3, Image image, Image image2, Image image3, Boolean bool, Integer num3, String str4, Integer num4, Long l4, Long l5, Integer num5, String str5, Integer num6, List<Image> list, FollowInfo followInfo, PayGrade payGrade, FansClub fansClub, Border border2, String str6, Image image4, Image image5, List<Image> list2, List<Image> list3, Long l6, UserAttr userAttr, OwnRoom ownRoom, Long l7, Long l8, AnchorInfo anchorInfo, LinkmicStatus linkmicStatus, String str7, Boolean bool2, Boolean bool3, Long l9, AnchorLevel anchorLevel, String str8, AuthorStats authorStats, List<User> list4, String str9, Integer num7, XiguaParams xiguaParams, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, AnchorLevel anchorLevel2, Image image6, String str10, String str11, Boolean bool14, Integer num8, Integer num9, String str12, Integer num10, Long l10, Integer num11, Long l11, Boolean bool15, Long l12, Boolean bool16, String str13, Integer num12, String str14, Boolean bool17, Boolean bool18, Boolean bool19, Long l13, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Boolean bool27, UserStats userStats, Boolean bool28, String str15, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = l;
        this.short_id = l2;
        this.nickname = str;
        this.gender = num;
        this.signature = str2;
        this.level = num2;
        this.birthday = l3;
        this.telephone = str3;
        this.avatar_thumb = image;
        this.avatar_medium = image2;
        this.avatar_large = image3;
        this.verified = bool;
        this.experience = num3;
        this.city = str4;
        this.status = num4;
        this.create_time = l4;
        this.modify_time = l5;
        this.secret = num5;
        this.share_qrcode_uri = str5;
        this.income_share_percent = num6;
        this.badge_image_list = Internal.immutableCopyOf("badge_image_list", list);
        this.follow_info = followInfo;
        this.pay_grade = payGrade;
        this.fans_club = fansClub;
        this.border = border2;
        this.special_id = str6;
        this.avatar_border = image4;
        this.medal = image5;
        this.real_time_icons = Internal.immutableCopyOf("real_time_icons", list2);
        this.new_real_time_icons = Internal.immutableCopyOf("new_real_time_icons", list3);
        this.top_vip_no = l6;
        this.user_attr = userAttr;
        this.own_room = ownRoom;
        this.pay_score = l7;
        this.ticket_count = l8;
        this.anchor_info = anchorInfo;
        this.link_mic_stats = linkmicStatus;
        this.display_id = str7;
        this.with_commerce_permission = bool2;
        this.with_fusion_shop_entry = bool3;
        this.total_recharge_diamond_count = l9;
        this.webcast_anchor_level = anchorLevel;
        this.verified_content = str8;
        this.author_stats = authorStats;
        this.top_fans = Internal.immutableCopyOf("top_fans", list4);
        this.sec_uid = str9;
        this.user_role = num7;
        this.xigua_info = xiguaParams;
        this.allow_be_located = bool4;
        this.allow_find_by_contacts = bool5;
        this.allow_others_download_video = bool6;
        this.allow_others_download_when_sharing_video = bool7;
        this.allow_share_show_profile = bool8;
        this.allow_show_in_gossip = bool9;
        this.allow_show_my_action = bool10;
        this.allow_strange_comment = bool11;
        this.allow_unfollower_comment = bool12;
        this.allow_use_linkmic = bool13;
        this.anchor_level = anchorLevel2;
        this.avatar_jpg = image6;
        this.bg_img_url = str10;
        this.birthday_description = str11;
        this.birthday_valid = bool14;
        this.block_status = num8;
        this.comment_restrict = num9;
        this.constellation = str12;
        this.disable_ichat = num10;
        this.enable_ichat_img = l10;
        this.exp = num11;
        this.fan_ticket_count = l11;
        this.fold_stranger_chat = bool15;
        this.follow_status = l12;
        this.hotsoon_verified = bool16;
        this.hotsoon_verified_reason = str13;
        this.ichat_restrict_type = num12;
        this.id_str = str14;
        this.is_follower = bool17;
        this.is_following = bool18;
        this.need_profile_guide = bool19;
        this.pay_scores = l13;
        this.push_comment_status = bool20;
        this.push_digg = bool21;
        this.push_follow = bool22;
        this.push_friend_action = bool23;
        this.push_ichat = bool24;
        this.push_status = bool25;
        this.push_video_post = bool26;
        this.push_video_recommend = bool27;
        this.stats = userStats;
        this.verified_mobile = bool28;
        this.verified_reason = str15;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12274, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12274, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.id = this.id;
        builder.short_id = this.short_id;
        builder.nickname = this.nickname;
        builder.gender = this.gender;
        builder.signature = this.signature;
        builder.level = this.level;
        builder.birthday = this.birthday;
        builder.telephone = this.telephone;
        builder.avatar_thumb = this.avatar_thumb;
        builder.avatar_medium = this.avatar_medium;
        builder.avatar_large = this.avatar_large;
        builder.verified = this.verified;
        builder.experience = this.experience;
        builder.city = this.city;
        builder.status = this.status;
        builder.create_time = this.create_time;
        builder.modify_time = this.modify_time;
        builder.secret = this.secret;
        builder.share_qrcode_uri = this.share_qrcode_uri;
        builder.income_share_percent = this.income_share_percent;
        builder.badge_image_list = Internal.copyOf("badge_image_list", this.badge_image_list);
        builder.follow_info = this.follow_info;
        builder.pay_grade = this.pay_grade;
        builder.fans_club = this.fans_club;
        builder.border = this.border;
        builder.special_id = this.special_id;
        builder.avatar_border = this.avatar_border;
        builder.medal = this.medal;
        builder.real_time_icons = Internal.copyOf("real_time_icons", this.real_time_icons);
        builder.new_real_time_icons = Internal.copyOf("new_real_time_icons", this.new_real_time_icons);
        builder.top_vip_no = this.top_vip_no;
        builder.user_attr = this.user_attr;
        builder.own_room = this.own_room;
        builder.pay_score = this.pay_score;
        builder.ticket_count = this.ticket_count;
        builder.anchor_info = this.anchor_info;
        builder.link_mic_stats = this.link_mic_stats;
        builder.display_id = this.display_id;
        builder.with_commerce_permission = this.with_commerce_permission;
        builder.with_fusion_shop_entry = this.with_fusion_shop_entry;
        builder.total_recharge_diamond_count = this.total_recharge_diamond_count;
        builder.webcast_anchor_level = this.webcast_anchor_level;
        builder.verified_content = this.verified_content;
        builder.author_stats = this.author_stats;
        builder.top_fans = Internal.copyOf("top_fans", this.top_fans);
        builder.sec_uid = this.sec_uid;
        builder.user_role = this.user_role;
        builder.xigua_info = this.xigua_info;
        builder.allow_be_located = this.allow_be_located;
        builder.allow_find_by_contacts = this.allow_find_by_contacts;
        builder.allow_others_download_video = this.allow_others_download_video;
        builder.allow_others_download_when_sharing_video = this.allow_others_download_when_sharing_video;
        builder.allow_share_show_profile = this.allow_share_show_profile;
        builder.allow_show_in_gossip = this.allow_show_in_gossip;
        builder.allow_show_my_action = this.allow_show_my_action;
        builder.allow_strange_comment = this.allow_strange_comment;
        builder.allow_unfollower_comment = this.allow_unfollower_comment;
        builder.allow_use_linkmic = this.allow_use_linkmic;
        builder.anchor_level = this.anchor_level;
        builder.avatar_jpg = this.avatar_jpg;
        builder.bg_img_url = this.bg_img_url;
        builder.birthday_description = this.birthday_description;
        builder.birthday_valid = this.birthday_valid;
        builder.block_status = this.block_status;
        builder.comment_restrict = this.comment_restrict;
        builder.constellation = this.constellation;
        builder.disable_ichat = this.disable_ichat;
        builder.enable_ichat_img = this.enable_ichat_img;
        builder.exp = this.exp;
        builder.fan_ticket_count = this.fan_ticket_count;
        builder.fold_stranger_chat = this.fold_stranger_chat;
        builder.follow_status = this.follow_status;
        builder.hotsoon_verified = this.hotsoon_verified;
        builder.hotsoon_verified_reason = this.hotsoon_verified_reason;
        builder.ichat_restrict_type = this.ichat_restrict_type;
        builder.id_str = this.id_str;
        builder.is_follower = this.is_follower;
        builder.is_following = this.is_following;
        builder.need_profile_guide = this.need_profile_guide;
        builder.pay_scores = this.pay_scores;
        builder.push_comment_status = this.push_comment_status;
        builder.push_digg = this.push_digg;
        builder.push_follow = this.push_follow;
        builder.push_friend_action = this.push_friend_action;
        builder.push_ichat = this.push_ichat;
        builder.push_status = this.push_status;
        builder.push_video_post = this.push_video_post;
        builder.push_video_recommend = this.push_video_recommend;
        builder.stats = this.stats;
        builder.verified_mobile = this.verified_mobile;
        builder.verified_reason = this.verified_reason;
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
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i50;
        int i51;
        int i52;
        int i53;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        int i60;
        int i61;
        int i62;
        int i63;
        int i64;
        int i65;
        int i66;
        int i67;
        int i68;
        int i69;
        int i70;
        int i71;
        int i72;
        int i73;
        int i74;
        int i75;
        int i76;
        int i77;
        int i78;
        int i79;
        int i80;
        int i81;
        int i82;
        int i83;
        int i84;
        int i85;
        int i86;
        int i87 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12276, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12276, new Class[0], Integer.TYPE)).intValue();
        }
        int i88 = this.hashCode;
        if (i88 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.id != null) {
                i = this.id.hashCode();
            } else {
                i = 0;
            }
            int i89 = (hashCode + i) * 37;
            if (this.short_id != null) {
                i2 = this.short_id.hashCode();
            } else {
                i2 = 0;
            }
            int i90 = (i89 + i2) * 37;
            if (this.nickname != null) {
                i3 = this.nickname.hashCode();
            } else {
                i3 = 0;
            }
            int i91 = (i90 + i3) * 37;
            if (this.gender != null) {
                i4 = this.gender.hashCode();
            } else {
                i4 = 0;
            }
            int i92 = (i91 + i4) * 37;
            if (this.signature != null) {
                i5 = this.signature.hashCode();
            } else {
                i5 = 0;
            }
            int i93 = (i92 + i5) * 37;
            if (this.level != null) {
                i6 = this.level.hashCode();
            } else {
                i6 = 0;
            }
            int i94 = (i93 + i6) * 37;
            if (this.birthday != null) {
                i7 = this.birthday.hashCode();
            } else {
                i7 = 0;
            }
            int i95 = (i94 + i7) * 37;
            if (this.telephone != null) {
                i8 = this.telephone.hashCode();
            } else {
                i8 = 0;
            }
            int i96 = (i95 + i8) * 37;
            if (this.avatar_thumb != null) {
                i9 = this.avatar_thumb.hashCode();
            } else {
                i9 = 0;
            }
            int i97 = (i96 + i9) * 37;
            if (this.avatar_medium != null) {
                i10 = this.avatar_medium.hashCode();
            } else {
                i10 = 0;
            }
            int i98 = (i97 + i10) * 37;
            if (this.avatar_large != null) {
                i11 = this.avatar_large.hashCode();
            } else {
                i11 = 0;
            }
            int i99 = (i98 + i11) * 37;
            if (this.verified != null) {
                i12 = this.verified.hashCode();
            } else {
                i12 = 0;
            }
            int i100 = (i99 + i12) * 37;
            if (this.experience != null) {
                i13 = this.experience.hashCode();
            } else {
                i13 = 0;
            }
            int i101 = (i100 + i13) * 37;
            if (this.city != null) {
                i14 = this.city.hashCode();
            } else {
                i14 = 0;
            }
            int i102 = (i101 + i14) * 37;
            if (this.status != null) {
                i15 = this.status.hashCode();
            } else {
                i15 = 0;
            }
            int i103 = (i102 + i15) * 37;
            if (this.create_time != null) {
                i16 = this.create_time.hashCode();
            } else {
                i16 = 0;
            }
            int i104 = (i103 + i16) * 37;
            if (this.modify_time != null) {
                i17 = this.modify_time.hashCode();
            } else {
                i17 = 0;
            }
            int i105 = (i104 + i17) * 37;
            if (this.secret != null) {
                i18 = this.secret.hashCode();
            } else {
                i18 = 0;
            }
            int i106 = (i105 + i18) * 37;
            if (this.share_qrcode_uri != null) {
                i19 = this.share_qrcode_uri.hashCode();
            } else {
                i19 = 0;
            }
            int i107 = (i106 + i19) * 37;
            if (this.income_share_percent != null) {
                i20 = this.income_share_percent.hashCode();
            } else {
                i20 = 0;
            }
            int hashCode2 = (((i107 + i20) * 37) + this.badge_image_list.hashCode()) * 37;
            if (this.follow_info != null) {
                i21 = this.follow_info.hashCode();
            } else {
                i21 = 0;
            }
            int i108 = (hashCode2 + i21) * 37;
            if (this.pay_grade != null) {
                i22 = this.pay_grade.hashCode();
            } else {
                i22 = 0;
            }
            int i109 = (i108 + i22) * 37;
            if (this.fans_club != null) {
                i23 = this.fans_club.hashCode();
            } else {
                i23 = 0;
            }
            int i110 = (i109 + i23) * 37;
            if (this.border != null) {
                i24 = this.border.hashCode();
            } else {
                i24 = 0;
            }
            int i111 = (i110 + i24) * 37;
            if (this.special_id != null) {
                i25 = this.special_id.hashCode();
            } else {
                i25 = 0;
            }
            int i112 = (i111 + i25) * 37;
            if (this.avatar_border != null) {
                i26 = this.avatar_border.hashCode();
            } else {
                i26 = 0;
            }
            int i113 = (i112 + i26) * 37;
            if (this.medal != null) {
                i27 = this.medal.hashCode();
            } else {
                i27 = 0;
            }
            int hashCode3 = (((((i113 + i27) * 37) + this.real_time_icons.hashCode()) * 37) + this.new_real_time_icons.hashCode()) * 37;
            if (this.top_vip_no != null) {
                i28 = this.top_vip_no.hashCode();
            } else {
                i28 = 0;
            }
            int i114 = (hashCode3 + i28) * 37;
            if (this.user_attr != null) {
                i29 = this.user_attr.hashCode();
            } else {
                i29 = 0;
            }
            int i115 = (i114 + i29) * 37;
            if (this.own_room != null) {
                i30 = this.own_room.hashCode();
            } else {
                i30 = 0;
            }
            int i116 = (i115 + i30) * 37;
            if (this.pay_score != null) {
                i31 = this.pay_score.hashCode();
            } else {
                i31 = 0;
            }
            int i117 = (i116 + i31) * 37;
            if (this.ticket_count != null) {
                i32 = this.ticket_count.hashCode();
            } else {
                i32 = 0;
            }
            int i118 = (i117 + i32) * 37;
            if (this.anchor_info != null) {
                i33 = this.anchor_info.hashCode();
            } else {
                i33 = 0;
            }
            int i119 = (i118 + i33) * 37;
            if (this.link_mic_stats != null) {
                i34 = this.link_mic_stats.hashCode();
            } else {
                i34 = 0;
            }
            int i120 = (i119 + i34) * 37;
            if (this.display_id != null) {
                i35 = this.display_id.hashCode();
            } else {
                i35 = 0;
            }
            int i121 = (i120 + i35) * 37;
            if (this.with_commerce_permission != null) {
                i36 = this.with_commerce_permission.hashCode();
            } else {
                i36 = 0;
            }
            int i122 = (i121 + i36) * 37;
            if (this.with_fusion_shop_entry != null) {
                i37 = this.with_fusion_shop_entry.hashCode();
            } else {
                i37 = 0;
            }
            int i123 = (i122 + i37) * 37;
            if (this.total_recharge_diamond_count != null) {
                i38 = this.total_recharge_diamond_count.hashCode();
            } else {
                i38 = 0;
            }
            int i124 = (i123 + i38) * 37;
            if (this.webcast_anchor_level != null) {
                i39 = this.webcast_anchor_level.hashCode();
            } else {
                i39 = 0;
            }
            int i125 = (i124 + i39) * 37;
            if (this.verified_content != null) {
                i40 = this.verified_content.hashCode();
            } else {
                i40 = 0;
            }
            int i126 = (i125 + i40) * 37;
            if (this.author_stats != null) {
                i41 = this.author_stats.hashCode();
            } else {
                i41 = 0;
            }
            int hashCode4 = (((i126 + i41) * 37) + this.top_fans.hashCode()) * 37;
            if (this.sec_uid != null) {
                i42 = this.sec_uid.hashCode();
            } else {
                i42 = 0;
            }
            int i127 = (hashCode4 + i42) * 37;
            if (this.user_role != null) {
                i43 = this.user_role.hashCode();
            } else {
                i43 = 0;
            }
            int i128 = (i127 + i43) * 37;
            if (this.xigua_info != null) {
                i44 = this.xigua_info.hashCode();
            } else {
                i44 = 0;
            }
            int i129 = (i128 + i44) * 37;
            if (this.allow_be_located != null) {
                i45 = this.allow_be_located.hashCode();
            } else {
                i45 = 0;
            }
            int i130 = (i129 + i45) * 37;
            if (this.allow_find_by_contacts != null) {
                i46 = this.allow_find_by_contacts.hashCode();
            } else {
                i46 = 0;
            }
            int i131 = (i130 + i46) * 37;
            if (this.allow_others_download_video != null) {
                i47 = this.allow_others_download_video.hashCode();
            } else {
                i47 = 0;
            }
            int i132 = (i131 + i47) * 37;
            if (this.allow_others_download_when_sharing_video != null) {
                i48 = this.allow_others_download_when_sharing_video.hashCode();
            } else {
                i48 = 0;
            }
            int i133 = (i132 + i48) * 37;
            if (this.allow_share_show_profile != null) {
                i49 = this.allow_share_show_profile.hashCode();
            } else {
                i49 = 0;
            }
            int i134 = (i133 + i49) * 37;
            if (this.allow_show_in_gossip != null) {
                i50 = this.allow_show_in_gossip.hashCode();
            } else {
                i50 = 0;
            }
            int i135 = (i134 + i50) * 37;
            if (this.allow_show_my_action != null) {
                i51 = this.allow_show_my_action.hashCode();
            } else {
                i51 = 0;
            }
            int i136 = (i135 + i51) * 37;
            if (this.allow_strange_comment != null) {
                i52 = this.allow_strange_comment.hashCode();
            } else {
                i52 = 0;
            }
            int i137 = (i136 + i52) * 37;
            if (this.allow_unfollower_comment != null) {
                i53 = this.allow_unfollower_comment.hashCode();
            } else {
                i53 = 0;
            }
            int i138 = (i137 + i53) * 37;
            if (this.allow_use_linkmic != null) {
                i54 = this.allow_use_linkmic.hashCode();
            } else {
                i54 = 0;
            }
            int i139 = (i138 + i54) * 37;
            if (this.anchor_level != null) {
                i55 = this.anchor_level.hashCode();
            } else {
                i55 = 0;
            }
            int i140 = (i139 + i55) * 37;
            if (this.avatar_jpg != null) {
                i56 = this.avatar_jpg.hashCode();
            } else {
                i56 = 0;
            }
            int i141 = (i140 + i56) * 37;
            if (this.bg_img_url != null) {
                i57 = this.bg_img_url.hashCode();
            } else {
                i57 = 0;
            }
            int i142 = (i141 + i57) * 37;
            if (this.birthday_description != null) {
                i58 = this.birthday_description.hashCode();
            } else {
                i58 = 0;
            }
            int i143 = (i142 + i58) * 37;
            if (this.birthday_valid != null) {
                i59 = this.birthday_valid.hashCode();
            } else {
                i59 = 0;
            }
            int i144 = (i143 + i59) * 37;
            if (this.block_status != null) {
                i60 = this.block_status.hashCode();
            } else {
                i60 = 0;
            }
            int i145 = (i144 + i60) * 37;
            if (this.comment_restrict != null) {
                i61 = this.comment_restrict.hashCode();
            } else {
                i61 = 0;
            }
            int i146 = (i145 + i61) * 37;
            if (this.constellation != null) {
                i62 = this.constellation.hashCode();
            } else {
                i62 = 0;
            }
            int i147 = (i146 + i62) * 37;
            if (this.disable_ichat != null) {
                i63 = this.disable_ichat.hashCode();
            } else {
                i63 = 0;
            }
            int i148 = (i147 + i63) * 37;
            if (this.enable_ichat_img != null) {
                i64 = this.enable_ichat_img.hashCode();
            } else {
                i64 = 0;
            }
            int i149 = (i148 + i64) * 37;
            if (this.exp != null) {
                i65 = this.exp.hashCode();
            } else {
                i65 = 0;
            }
            int i150 = (i149 + i65) * 37;
            if (this.fan_ticket_count != null) {
                i66 = this.fan_ticket_count.hashCode();
            } else {
                i66 = 0;
            }
            int i151 = (i150 + i66) * 37;
            if (this.fold_stranger_chat != null) {
                i67 = this.fold_stranger_chat.hashCode();
            } else {
                i67 = 0;
            }
            int i152 = (i151 + i67) * 37;
            if (this.follow_status != null) {
                i68 = this.follow_status.hashCode();
            } else {
                i68 = 0;
            }
            int i153 = (i152 + i68) * 37;
            if (this.hotsoon_verified != null) {
                i69 = this.hotsoon_verified.hashCode();
            } else {
                i69 = 0;
            }
            int i154 = (i153 + i69) * 37;
            if (this.hotsoon_verified_reason != null) {
                i70 = this.hotsoon_verified_reason.hashCode();
            } else {
                i70 = 0;
            }
            int i155 = (i154 + i70) * 37;
            if (this.ichat_restrict_type != null) {
                i71 = this.ichat_restrict_type.hashCode();
            } else {
                i71 = 0;
            }
            int i156 = (i155 + i71) * 37;
            if (this.id_str != null) {
                i72 = this.id_str.hashCode();
            } else {
                i72 = 0;
            }
            int i157 = (i156 + i72) * 37;
            if (this.is_follower != null) {
                i73 = this.is_follower.hashCode();
            } else {
                i73 = 0;
            }
            int i158 = (i157 + i73) * 37;
            if (this.is_following != null) {
                i74 = this.is_following.hashCode();
            } else {
                i74 = 0;
            }
            int i159 = (i158 + i74) * 37;
            if (this.need_profile_guide != null) {
                i75 = this.need_profile_guide.hashCode();
            } else {
                i75 = 0;
            }
            int i160 = (i159 + i75) * 37;
            if (this.pay_scores != null) {
                i76 = this.pay_scores.hashCode();
            } else {
                i76 = 0;
            }
            int i161 = (i160 + i76) * 37;
            if (this.push_comment_status != null) {
                i77 = this.push_comment_status.hashCode();
            } else {
                i77 = 0;
            }
            int i162 = (i161 + i77) * 37;
            if (this.push_digg != null) {
                i78 = this.push_digg.hashCode();
            } else {
                i78 = 0;
            }
            int i163 = (i162 + i78) * 37;
            if (this.push_follow != null) {
                i79 = this.push_follow.hashCode();
            } else {
                i79 = 0;
            }
            int i164 = (i163 + i79) * 37;
            if (this.push_friend_action != null) {
                i80 = this.push_friend_action.hashCode();
            } else {
                i80 = 0;
            }
            int i165 = (i164 + i80) * 37;
            if (this.push_ichat != null) {
                i81 = this.push_ichat.hashCode();
            } else {
                i81 = 0;
            }
            int i166 = (i165 + i81) * 37;
            if (this.push_status != null) {
                i82 = this.push_status.hashCode();
            } else {
                i82 = 0;
            }
            int i167 = (i166 + i82) * 37;
            if (this.push_video_post != null) {
                i83 = this.push_video_post.hashCode();
            } else {
                i83 = 0;
            }
            int i168 = (i167 + i83) * 37;
            if (this.push_video_recommend != null) {
                i84 = this.push_video_recommend.hashCode();
            } else {
                i84 = 0;
            }
            int i169 = (i168 + i84) * 37;
            if (this.stats != null) {
                i85 = this.stats.hashCode();
            } else {
                i85 = 0;
            }
            int i170 = (i169 + i85) * 37;
            if (this.verified_mobile != null) {
                i86 = this.verified_mobile.hashCode();
            } else {
                i86 = 0;
            }
            int i171 = (i170 + i86) * 37;
            if (this.verified_reason != null) {
                i87 = this.verified_reason.hashCode();
            }
            i88 = i171 + i87;
            this.hashCode = i88;
        }
        return i88;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12277, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12277, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.short_id != null) {
            sb.append(", short_id=");
            sb.append(this.short_id);
        }
        if (this.nickname != null) {
            sb.append(", nickname=");
            sb.append(this.nickname);
        }
        if (this.gender != null) {
            sb.append(", gender=");
            sb.append(this.gender);
        }
        if (this.signature != null) {
            sb.append(", signature=");
            sb.append(this.signature);
        }
        if (this.level != null) {
            sb.append(", level=");
            sb.append(this.level);
        }
        if (this.birthday != null) {
            sb.append(", birthday=");
            sb.append(this.birthday);
        }
        if (this.telephone != null) {
            sb.append(", telephone=");
            sb.append(this.telephone);
        }
        if (this.avatar_thumb != null) {
            sb.append(", avatar_thumb=");
            sb.append(this.avatar_thumb);
        }
        if (this.avatar_medium != null) {
            sb.append(", avatar_medium=");
            sb.append(this.avatar_medium);
        }
        if (this.avatar_large != null) {
            sb.append(", avatar_large=");
            sb.append(this.avatar_large);
        }
        if (this.verified != null) {
            sb.append(", verified=");
            sb.append(this.verified);
        }
        if (this.experience != null) {
            sb.append(", experience=");
            sb.append(this.experience);
        }
        if (this.city != null) {
            sb.append(", city=");
            sb.append(this.city);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.modify_time != null) {
            sb.append(", modify_time=");
            sb.append(this.modify_time);
        }
        if (this.secret != null) {
            sb.append(", secret=");
            sb.append(this.secret);
        }
        if (this.share_qrcode_uri != null) {
            sb.append(", share_qrcode_uri=");
            sb.append(this.share_qrcode_uri);
        }
        if (this.income_share_percent != null) {
            sb.append(", income_share_percent=");
            sb.append(this.income_share_percent);
        }
        if (!this.badge_image_list.isEmpty()) {
            sb.append(", badge_image_list=");
            sb.append(this.badge_image_list);
        }
        if (this.follow_info != null) {
            sb.append(", follow_info=");
            sb.append(this.follow_info);
        }
        if (this.pay_grade != null) {
            sb.append(", pay_grade=");
            sb.append(this.pay_grade);
        }
        if (this.fans_club != null) {
            sb.append(", fans_club=");
            sb.append(this.fans_club);
        }
        if (this.border != null) {
            sb.append(", border=");
            sb.append(this.border);
        }
        if (this.special_id != null) {
            sb.append(", special_id=");
            sb.append(this.special_id);
        }
        if (this.avatar_border != null) {
            sb.append(", avatar_border=");
            sb.append(this.avatar_border);
        }
        if (this.medal != null) {
            sb.append(", medal=");
            sb.append(this.medal);
        }
        if (!this.real_time_icons.isEmpty()) {
            sb.append(", real_time_icons=");
            sb.append(this.real_time_icons);
        }
        if (!this.new_real_time_icons.isEmpty()) {
            sb.append(", new_real_time_icons=");
            sb.append(this.new_real_time_icons);
        }
        if (this.top_vip_no != null) {
            sb.append(", top_vip_no=");
            sb.append(this.top_vip_no);
        }
        if (this.user_attr != null) {
            sb.append(", user_attr=");
            sb.append(this.user_attr);
        }
        if (this.own_room != null) {
            sb.append(", own_room=");
            sb.append(this.own_room);
        }
        if (this.pay_score != null) {
            sb.append(", pay_score=");
            sb.append(this.pay_score);
        }
        if (this.ticket_count != null) {
            sb.append(", ticket_count=");
            sb.append(this.ticket_count);
        }
        if (this.anchor_info != null) {
            sb.append(", anchor_info=");
            sb.append(this.anchor_info);
        }
        if (this.link_mic_stats != null) {
            sb.append(", link_mic_stats=");
            sb.append(this.link_mic_stats);
        }
        if (this.display_id != null) {
            sb.append(", display_id=");
            sb.append(this.display_id);
        }
        if (this.with_commerce_permission != null) {
            sb.append(", with_commerce_permission=");
            sb.append(this.with_commerce_permission);
        }
        if (this.with_fusion_shop_entry != null) {
            sb.append(", with_fusion_shop_entry=");
            sb.append(this.with_fusion_shop_entry);
        }
        if (this.total_recharge_diamond_count != null) {
            sb.append(", total_recharge_diamond_count=");
            sb.append(this.total_recharge_diamond_count);
        }
        if (this.webcast_anchor_level != null) {
            sb.append(", webcast_anchor_level=");
            sb.append(this.webcast_anchor_level);
        }
        if (this.verified_content != null) {
            sb.append(", verified_content=");
            sb.append(this.verified_content);
        }
        if (this.author_stats != null) {
            sb.append(", author_stats=");
            sb.append(this.author_stats);
        }
        if (!this.top_fans.isEmpty()) {
            sb.append(", top_fans=");
            sb.append(this.top_fans);
        }
        if (this.sec_uid != null) {
            sb.append(", sec_uid=");
            sb.append(this.sec_uid);
        }
        if (this.user_role != null) {
            sb.append(", user_role=");
            sb.append(this.user_role);
        }
        if (this.xigua_info != null) {
            sb.append(", xigua_info=");
            sb.append(this.xigua_info);
        }
        if (this.allow_be_located != null) {
            sb.append(", allow_be_located=");
            sb.append(this.allow_be_located);
        }
        if (this.allow_find_by_contacts != null) {
            sb.append(", allow_find_by_contacts=");
            sb.append(this.allow_find_by_contacts);
        }
        if (this.allow_others_download_video != null) {
            sb.append(", allow_others_download_video=");
            sb.append(this.allow_others_download_video);
        }
        if (this.allow_others_download_when_sharing_video != null) {
            sb.append(", allow_others_download_when_sharing_video=");
            sb.append(this.allow_others_download_when_sharing_video);
        }
        if (this.allow_share_show_profile != null) {
            sb.append(", allow_share_show_profile=");
            sb.append(this.allow_share_show_profile);
        }
        if (this.allow_show_in_gossip != null) {
            sb.append(", allow_show_in_gossip=");
            sb.append(this.allow_show_in_gossip);
        }
        if (this.allow_show_my_action != null) {
            sb.append(", allow_show_my_action=");
            sb.append(this.allow_show_my_action);
        }
        if (this.allow_strange_comment != null) {
            sb.append(", allow_strange_comment=");
            sb.append(this.allow_strange_comment);
        }
        if (this.allow_unfollower_comment != null) {
            sb.append(", allow_unfollower_comment=");
            sb.append(this.allow_unfollower_comment);
        }
        if (this.allow_use_linkmic != null) {
            sb.append(", allow_use_linkmic=");
            sb.append(this.allow_use_linkmic);
        }
        if (this.anchor_level != null) {
            sb.append(", anchor_level=");
            sb.append(this.anchor_level);
        }
        if (this.avatar_jpg != null) {
            sb.append(", avatar_jpg=");
            sb.append(this.avatar_jpg);
        }
        if (this.bg_img_url != null) {
            sb.append(", bg_img_url=");
            sb.append(this.bg_img_url);
        }
        if (this.birthday_description != null) {
            sb.append(", birthday_description=");
            sb.append(this.birthday_description);
        }
        if (this.birthday_valid != null) {
            sb.append(", birthday_valid=");
            sb.append(this.birthday_valid);
        }
        if (this.block_status != null) {
            sb.append(", block_status=");
            sb.append(this.block_status);
        }
        if (this.comment_restrict != null) {
            sb.append(", comment_restrict=");
            sb.append(this.comment_restrict);
        }
        if (this.constellation != null) {
            sb.append(", constellation=");
            sb.append(this.constellation);
        }
        if (this.disable_ichat != null) {
            sb.append(", disable_ichat=");
            sb.append(this.disable_ichat);
        }
        if (this.enable_ichat_img != null) {
            sb.append(", enable_ichat_img=");
            sb.append(this.enable_ichat_img);
        }
        if (this.exp != null) {
            sb.append(", exp=");
            sb.append(this.exp);
        }
        if (this.fan_ticket_count != null) {
            sb.append(", fan_ticket_count=");
            sb.append(this.fan_ticket_count);
        }
        if (this.fold_stranger_chat != null) {
            sb.append(", fold_stranger_chat=");
            sb.append(this.fold_stranger_chat);
        }
        if (this.follow_status != null) {
            sb.append(", follow_status=");
            sb.append(this.follow_status);
        }
        if (this.hotsoon_verified != null) {
            sb.append(", hotsoon_verified=");
            sb.append(this.hotsoon_verified);
        }
        if (this.hotsoon_verified_reason != null) {
            sb.append(", hotsoon_verified_reason=");
            sb.append(this.hotsoon_verified_reason);
        }
        if (this.ichat_restrict_type != null) {
            sb.append(", ichat_restrict_type=");
            sb.append(this.ichat_restrict_type);
        }
        if (this.id_str != null) {
            sb.append(", id_str=");
            sb.append(this.id_str);
        }
        if (this.is_follower != null) {
            sb.append(", is_follower=");
            sb.append(this.is_follower);
        }
        if (this.is_following != null) {
            sb.append(", is_following=");
            sb.append(this.is_following);
        }
        if (this.need_profile_guide != null) {
            sb.append(", need_profile_guide=");
            sb.append(this.need_profile_guide);
        }
        if (this.pay_scores != null) {
            sb.append(", pay_scores=");
            sb.append(this.pay_scores);
        }
        if (this.push_comment_status != null) {
            sb.append(", push_comment_status=");
            sb.append(this.push_comment_status);
        }
        if (this.push_digg != null) {
            sb.append(", push_digg=");
            sb.append(this.push_digg);
        }
        if (this.push_follow != null) {
            sb.append(", push_follow=");
            sb.append(this.push_follow);
        }
        if (this.push_friend_action != null) {
            sb.append(", push_friend_action=");
            sb.append(this.push_friend_action);
        }
        if (this.push_ichat != null) {
            sb.append(", push_ichat=");
            sb.append(this.push_ichat);
        }
        if (this.push_status != null) {
            sb.append(", push_status=");
            sb.append(this.push_status);
        }
        if (this.push_video_post != null) {
            sb.append(", push_video_post=");
            sb.append(this.push_video_post);
        }
        if (this.push_video_recommend != null) {
            sb.append(", push_video_recommend=");
            sb.append(this.push_video_recommend);
        }
        if (this.stats != null) {
            sb.append(", stats=");
            sb.append(this.stats);
        }
        if (this.verified_mobile != null) {
            sb.append(", verified_mobile=");
            sb.append(this.verified_mobile);
        }
        if (this.verified_reason != null) {
            sb.append(", verified_reason=");
            sb.append(this.verified_reason);
        }
        StringBuilder replace = sb.replace(0, 2, "User{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12275, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12275, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof User)) {
                return false;
            }
            User user = (User) obj;
            if (!unknownFields().equals(user.unknownFields()) || !Internal.equals(this.id, user.id) || !Internal.equals(this.short_id, user.short_id) || !Internal.equals(this.nickname, user.nickname) || !Internal.equals(this.gender, user.gender) || !Internal.equals(this.signature, user.signature) || !Internal.equals(this.level, user.level) || !Internal.equals(this.birthday, user.birthday) || !Internal.equals(this.telephone, user.telephone) || !Internal.equals(this.avatar_thumb, user.avatar_thumb) || !Internal.equals(this.avatar_medium, user.avatar_medium) || !Internal.equals(this.avatar_large, user.avatar_large) || !Internal.equals(this.verified, user.verified) || !Internal.equals(this.experience, user.experience) || !Internal.equals(this.city, user.city) || !Internal.equals(this.status, user.status) || !Internal.equals(this.create_time, user.create_time) || !Internal.equals(this.modify_time, user.modify_time) || !Internal.equals(this.secret, user.secret) || !Internal.equals(this.share_qrcode_uri, user.share_qrcode_uri) || !Internal.equals(this.income_share_percent, user.income_share_percent) || !this.badge_image_list.equals(user.badge_image_list) || !Internal.equals(this.follow_info, user.follow_info) || !Internal.equals(this.pay_grade, user.pay_grade) || !Internal.equals(this.fans_club, user.fans_club) || !Internal.equals(this.border, user.border) || !Internal.equals(this.special_id, user.special_id) || !Internal.equals(this.avatar_border, user.avatar_border) || !Internal.equals(this.medal, user.medal) || !this.real_time_icons.equals(user.real_time_icons) || !this.new_real_time_icons.equals(user.new_real_time_icons) || !Internal.equals(this.top_vip_no, user.top_vip_no) || !Internal.equals(this.user_attr, user.user_attr) || !Internal.equals(this.own_room, user.own_room) || !Internal.equals(this.pay_score, user.pay_score) || !Internal.equals(this.ticket_count, user.ticket_count) || !Internal.equals(this.anchor_info, user.anchor_info) || !Internal.equals(this.link_mic_stats, user.link_mic_stats) || !Internal.equals(this.display_id, user.display_id) || !Internal.equals(this.with_commerce_permission, user.with_commerce_permission) || !Internal.equals(this.with_fusion_shop_entry, user.with_fusion_shop_entry) || !Internal.equals(this.total_recharge_diamond_count, user.total_recharge_diamond_count) || !Internal.equals(this.webcast_anchor_level, user.webcast_anchor_level) || !Internal.equals(this.verified_content, user.verified_content) || !Internal.equals(this.author_stats, user.author_stats) || !this.top_fans.equals(user.top_fans) || !Internal.equals(this.sec_uid, user.sec_uid) || !Internal.equals(this.user_role, user.user_role) || !Internal.equals(this.xigua_info, user.xigua_info) || !Internal.equals(this.allow_be_located, user.allow_be_located) || !Internal.equals(this.allow_find_by_contacts, user.allow_find_by_contacts) || !Internal.equals(this.allow_others_download_video, user.allow_others_download_video) || !Internal.equals(this.allow_others_download_when_sharing_video, user.allow_others_download_when_sharing_video) || !Internal.equals(this.allow_share_show_profile, user.allow_share_show_profile) || !Internal.equals(this.allow_show_in_gossip, user.allow_show_in_gossip) || !Internal.equals(this.allow_show_my_action, user.allow_show_my_action) || !Internal.equals(this.allow_strange_comment, user.allow_strange_comment) || !Internal.equals(this.allow_unfollower_comment, user.allow_unfollower_comment) || !Internal.equals(this.allow_use_linkmic, user.allow_use_linkmic) || !Internal.equals(this.anchor_level, user.anchor_level) || !Internal.equals(this.avatar_jpg, user.avatar_jpg) || !Internal.equals(this.bg_img_url, user.bg_img_url) || !Internal.equals(this.birthday_description, user.birthday_description) || !Internal.equals(this.birthday_valid, user.birthday_valid) || !Internal.equals(this.block_status, user.block_status) || !Internal.equals(this.comment_restrict, user.comment_restrict) || !Internal.equals(this.constellation, user.constellation) || !Internal.equals(this.disable_ichat, user.disable_ichat) || !Internal.equals(this.enable_ichat_img, user.enable_ichat_img) || !Internal.equals(this.exp, user.exp) || !Internal.equals(this.fan_ticket_count, user.fan_ticket_count) || !Internal.equals(this.fold_stranger_chat, user.fold_stranger_chat) || !Internal.equals(this.follow_status, user.follow_status) || !Internal.equals(this.hotsoon_verified, user.hotsoon_verified) || !Internal.equals(this.hotsoon_verified_reason, user.hotsoon_verified_reason) || !Internal.equals(this.ichat_restrict_type, user.ichat_restrict_type) || !Internal.equals(this.id_str, user.id_str) || !Internal.equals(this.is_follower, user.is_follower) || !Internal.equals(this.is_following, user.is_following) || !Internal.equals(this.need_profile_guide, user.need_profile_guide) || !Internal.equals(this.pay_scores, user.pay_scores) || !Internal.equals(this.push_comment_status, user.push_comment_status) || !Internal.equals(this.push_digg, user.push_digg) || !Internal.equals(this.push_follow, user.push_follow) || !Internal.equals(this.push_friend_action, user.push_friend_action) || !Internal.equals(this.push_ichat, user.push_ichat) || !Internal.equals(this.push_status, user.push_status) || !Internal.equals(this.push_video_post, user.push_video_post) || !Internal.equals(this.push_video_recommend, user.push_video_recommend) || !Internal.equals(this.stats, user.stats) || !Internal.equals(this.verified_mobile, user.verified_mobile) || !Internal.equals(this.verified_reason, user.verified_reason)) {
                return false;
            }
            return true;
        }
    }
}
