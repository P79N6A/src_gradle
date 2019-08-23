package com.ss.android.ugc.aweme.im.sdk.chat;

import android.support.annotation.LayoutRes;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.im.sdk.chat.model.AudioContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.CommandShareContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.CommentContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.CommonRedEnvelopeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.EPlatformCardContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.EmojiContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.GroupInviteContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.GroupNoticeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.OnlyPictureContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SayHelloContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SelfStoryReplyContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareChallengeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareCouponContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareGoodContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareGoodWindowContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareLiveContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareMiniAppContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareMusicContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SharePictureContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SharePoiContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareRankingListContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareUserContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareWebContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.StickerEmojiContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.StoryPictureContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.StoryReplyContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.StoryVideoContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SystemContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.VideoRedEnvelopeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.VideoRedEnvelopeNewYearContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.VideoUpdateTipsContent;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.BaseViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.CommandShareSendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.CommandShareViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.CommentSendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.CommentViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.CommonRedEnvelopeHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.CommonRedEnvelopeSendHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.EPlatformReceiveViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.EPlatformSendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.EmojiSendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.EmojiViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.GreetMessageViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.GroupInviteSendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.GroupInviteViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.GroupNoticeViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.LoadMoreViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.OnlyPictureSendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.OnlyPictureViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.SayHelloViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.SelfStoryReplyReceiveViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.SelfStoryReplySendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareAwemeReceiveViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareAwemeSendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareChallengeSendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareChallengeSimpleSendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareChallengeSimpleViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareChallengeViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareCouponSimpleSendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareCouponSimpleViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareGoodSendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareGoodViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareGoodWindowSendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareGoodWindowViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareLiveReceiveViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareLiveSendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareMiniAppSendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareMiniAppViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareMusicMultiReceiveViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareMusicMultiSendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareMusicSimpleReceiveViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareMusicSimpleSendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.SharePoiSendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.SharePoiSimpleSendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.SharePoiSimpleViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.SharePoiViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareRankingSimpleSendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareRankingSimpleViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareUserMultiReceiveViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareUserMultiSendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareUserSimpleReceiveViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareUserSimpleSendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareWebReceiveViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareWebSendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.StoryPictureSendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.StoryPictureViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.StoryReplyReceiveViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.StoryReplySendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.StoryVideoReceiveViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.StoryVideoSendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.SystemViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.TextSendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.TextViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.VideoRedEnvelopeHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.VideoRedEnvelopeNewYearHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.VideoRedEnvelopeNewYearSendHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.VideoRedEnvelopeSendHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.VideoUpdateTipsViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.VoiceMessageViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.viewholder.VoiceMessagesSendViewHolder;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;
import com.ss.android.ugc.aweme.im.sdk.utils.bc;
import com.ss.android.ugc.aweme.im.sdk.utils.l;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.c;

public enum m {
    ITEM_SYSTEM_RECEIVE(0) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.xh;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SystemContent.class;
        }
    },
    ITEM_TEXT_RECEIVE(1) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.xi;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return TextContent.class;
        }
    },
    ITEM_TEXT_SEND(2) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.xj;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return TextContent.class;
        }
    },
    ITEM_SHARE_AWEME_RECEIVE(3) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x_;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareAwemeContent.class;
        }
    },
    ITEM_SHARE_AWEME_SEND(4) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.xa;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareAwemeContent.class;
        }
    },
    ITEM_SHARE_PICTURE_RECEIVE(5) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x_;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SharePictureContent.class;
        }
    },
    ITEM_SHARE_PICTURE_SEND(6) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.xa;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SharePictureContent.class;
        }
    },
    ITEM_ONLY_PICTURE_RECEIVE(10) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.wz;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return OnlyPictureContent.class;
        }
    },
    ITEM_ONLY_PICTURE_SEND(11) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x0;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return OnlyPictureContent.class;
        }
    },
    ITEM_BIG_EMOJI_RECEIVE(12) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.wm;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return EmojiContent.class;
        }
    },
    ITEM_BIG_EMOJI_SEND(13) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.wn;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return EmojiContent.class;
        }
    },
    ITEM_COMMAND_SHARE_RECEIVE(15) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.wo;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return CommandShareContent.class;
        }

        public final BaseContent parse(n nVar) {
            if (PatchProxy.isSupport(new Object[]{nVar}, this, changeQuickRedirect, false, 50456, new Class[]{n.class}, BaseContent.class)) {
                return (BaseContent) PatchProxy.accessDispatch(new Object[]{nVar}, this, changeQuickRedirect, false, 50456, new Class[]{n.class}, BaseContent.class);
            }
            CommandShareContent commandShareContent = (CommandShareContent) m.super.parse(nVar);
            commandShareContent.setSendMsg(false);
            return commandShareContent;
        }
    },
    ITEM_COMMAND_SHARE_SEND(16) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.wp;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return CommandShareContent.class;
        }

        public final BaseContent parse(n nVar) {
            if (PatchProxy.isSupport(new Object[]{nVar}, this, changeQuickRedirect, false, 50457, new Class[]{n.class}, BaseContent.class)) {
                return (BaseContent) PatchProxy.accessDispatch(new Object[]{nVar}, this, changeQuickRedirect, false, 50457, new Class[]{n.class}, BaseContent.class);
            }
            CommandShareContent commandShareContent = (CommandShareContent) m.super.parse(nVar);
            commandShareContent.setSendMsg(true);
            return commandShareContent;
        }
    },
    ITEM_COMMENT_RECEIVE(17) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.wq;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return CommentContent.class;
        }
    },
    ITEM_COMMENT_SEND(18) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.wr;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return CommentContent.class;
        }
    },
    ITEM_SHARE_POI_MULTI_RECEIVE(24) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x3;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SharePoiContent.class;
        }
    },
    ITEM_SHARE_POI_MULTI_SEND(25) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x4;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SharePoiContent.class;
        }
    },
    ITEM_SHARE_POI_SIMPLE_RECEIVE(26) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x7;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SharePoiContent.class;
        }
    },
    ITEM_SHARE_POI_SIMPLE_SEND(27) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x8;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SharePoiContent.class;
        }
    },
    ITEM_SHARE_COUPON_RECEIVE(68) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x7;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareCouponContent.class;
        }
    },
    ITEM_SHARE_COUPON_SEND(69) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x8;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareCouponContent.class;
        }
    },
    ITEM_LOAD_MORE(9) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.w8;
        }

        public final String getMsgHint(BaseContent baseContent) {
            return "";
        }
    },
    ITEM_DEFAULT_RECEIVE(7) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 50458, new Class[0], Integer.TYPE)) {
                return ITEM_TEXT_RECEIVE.getItemLayoutId();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 50458, new Class[0], Integer.TYPE)).intValue();
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 50459, new Class[0], Class.class)) {
                return ITEM_TEXT_RECEIVE.getMessageContentClazz();
            }
            return (Class) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 50459, new Class[0], Class.class);
        }

        public final String getMsgHint(BaseContent baseContent) {
            if (!PatchProxy.isSupport(new Object[]{baseContent}, this, changeQuickRedirect, false, 50460, new Class[]{BaseContent.class}, String.class)) {
                return m.getDefaultText(false);
            }
            return (String) PatchProxy.accessDispatch(new Object[]{baseContent}, this, changeQuickRedirect, false, 50460, new Class[]{BaseContent.class}, String.class);
        }

        public final BaseContent parse(n nVar) {
            if (PatchProxy.isSupport(new Object[]{nVar}, this, changeQuickRedirect, false, 50461, new Class[]{n.class}, BaseContent.class)) {
                return (BaseContent) PatchProxy.accessDispatch(new Object[]{nVar}, this, changeQuickRedirect, false, 50461, new Class[]{n.class}, BaseContent.class);
            }
            TextContent textContent = new TextContent();
            textContent.setText(m.getDefaultText(false));
            textContent.setDefault(true);
            return textContent;
        }
    },
    ITEM_VIDEO_UPDATE_TIPS(14) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.xk;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return VideoUpdateTipsContent.class;
        }
    },
    ITEM_SAY_HELLO(19) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x1;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SayHelloContent.class;
        }

        public final BaseContent parse(n nVar) {
            if (PatchProxy.isSupport(new Object[]{nVar}, this, changeQuickRedirect, false, 50462, new Class[]{n.class}, BaseContent.class)) {
                return (BaseContent) PatchProxy.accessDispatch(new Object[]{nVar}, this, changeQuickRedirect, false, 50462, new Class[]{n.class}, BaseContent.class);
            }
            SayHelloContent sayHelloContent = (SayHelloContent) m.super.parse(nVar);
            sayHelloContent.setMsgHint(String.format(GlobalContext.getContext().getResources().getString(C0906R.string.ax1), new Object[]{sayHelloContent.getNickname()}));
            return sayHelloContent;
        }
    },
    ITEM_VOICE_RECEIVE(20) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.xl;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return AudioContent.class;
        }
    },
    ITEM_VOICE_SEND(21) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.xm;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return AudioContent.class;
        }

        public final BaseContent parse(n nVar) {
            if (PatchProxy.isSupport(new Object[]{nVar}, this, changeQuickRedirect, false, 50463, new Class[]{n.class}, BaseContent.class)) {
                return (BaseContent) PatchProxy.accessDispatch(new Object[]{nVar}, this, changeQuickRedirect, false, 50463, new Class[]{n.class}, BaseContent.class);
            } else if (nVar.getContent().equals("FakeVoiceMessage")) {
                return null;
            } else {
                return m.super.parse(nVar);
            }
        }
    },
    ITEM_SHARE_RANK_LIST_SEND(23) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x8;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareRankingListContent.class;
        }
    },
    ITEM_SHARE_RANK_LIST_RECEIVE(22) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x7;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareRankingListContent.class;
        }
    },
    ITEM_SHARE_MUSIC_MULTI_SEND(29) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x4;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareMusicContent.class;
        }
    },
    ITEM_SHARE_MUSIC_MULTI_RECEIVE(28) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x3;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareMusicContent.class;
        }
    },
    ITEM_SHARE_MUSIC_SIMPLE_SEND(31) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x8;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareMusicContent.class;
        }
    },
    ITEM_SHARE_MUSIC_SIMPLE_RECEIVE(30) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x7;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareMusicContent.class;
        }
    },
    ITEM_SHARE_CHALLENGE_MULTI_SEND(33) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x4;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareChallengeContent.class;
        }
    },
    ITEM_SHARE_CHALLENGE_MULTI_RECEIVE(32) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x3;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareChallengeContent.class;
        }
    },
    ITEM_SHARE_CHALLENGE_SIMPLE_SEND(35) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x8;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareChallengeContent.class;
        }
    },
    ITEM_SHARE_CHALLENGE_SIMPLE_RECEIVE(34) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x7;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareChallengeContent.class;
        }
    },
    ITEM_SHARE_MINI_APP_SEND(39) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x8;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareMiniAppContent.class;
        }
    },
    ITEM_SHARE_MINI_APP_RECEIVE(38) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x7;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareMiniAppContent.class;
        }
    },
    ITEM_DEFAULT_SEND(8) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 50464, new Class[0], Integer.TYPE)) {
                return ITEM_TEXT_SEND.getItemLayoutId();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 50464, new Class[0], Integer.TYPE)).intValue();
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 50465, new Class[0], Class.class)) {
                return ITEM_TEXT_SEND.getMessageContentClazz();
            }
            return (Class) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 50465, new Class[0], Class.class);
        }

        public final String getMsgHint(BaseContent baseContent) {
            if (!PatchProxy.isSupport(new Object[]{baseContent}, this, changeQuickRedirect, false, 50466, new Class[]{BaseContent.class}, String.class)) {
                return m.getDefaultText(true);
            }
            return (String) PatchProxy.accessDispatch(new Object[]{baseContent}, this, changeQuickRedirect, false, 50466, new Class[]{BaseContent.class}, String.class);
        }

        public final BaseContent parse(n nVar) {
            if (PatchProxy.isSupport(new Object[]{nVar}, this, changeQuickRedirect, false, 50467, new Class[]{n.class}, BaseContent.class)) {
                return (BaseContent) PatchProxy.accessDispatch(new Object[]{nVar}, this, changeQuickRedirect, false, 50467, new Class[]{n.class}, BaseContent.class);
            }
            TextContent textContent = new TextContent();
            textContent.setText(m.getDefaultText(true));
            textContent.setDefault(true);
            return textContent;
        }
    },
    ITEM_SHARE_USER_MULTI_SEND(41) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x4;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareUserContent.class;
        }
    },
    ITEM_SHARE_USER_MULTI_RECEIVE(40) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x3;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareUserContent.class;
        }
    },
    ITEM_SHARE_USER_SIMPLE_SEND(43) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x8;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareUserContent.class;
        }
    },
    ITEM_SHARE_USER_SIMPLE_RECEIVE(42) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x7;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareUserContent.class;
        }
    },
    ITEM_SHARE_WEB_SEND(45) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x8;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareWebContent.class;
        }
    },
    ITEM_SHARE_WEB_RECEIVE(44) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x7;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareWebContent.class;
        }
    },
    ITEM_SHARE_LIVE_SEND(47) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.xa;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareLiveContent.class;
        }
    },
    ITEM_SHARE_LIVE_RECEIVE(46) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x_;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareLiveContent.class;
        }
    },
    ITEM_STORY_REPLY_SEND(49) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.xd;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return StoryReplyContent.class;
        }
    },
    ITEM_STORY_REPLY_RECEIVE(48) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.xc;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return StoryReplyContent.class;
        }
    },
    ITEM_STORY_VIDEO_SEND(51) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.xg;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return StoryVideoContent.class;
        }
    },
    ITEM_STORY_VIDEO_RECEIVE(50) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.xf;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return StoryVideoContent.class;
        }
    },
    ITEM_STORY_PICTURE_RECEIVE(52) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.wz;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return StoryPictureContent.class;
        }
    },
    ITEM_STORY_PICTURE_SEND(53) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x0;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return StoryPictureContent.class;
        }
    },
    ITEM_COMMON_RED_ENVELOPE_RECEIVE(54) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x7;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return CommonRedEnvelopeContent.class;
        }
    },
    ITEM_COMMON_RED_ENVELOPE_SEND(55) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x8;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return CommonRedEnvelopeContent.class;
        }
    },
    ITEM_VIDEO_RED_ENVELOPE_RECEIVE(56) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x7;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return VideoRedEnvelopeContent.class;
        }
    },
    ITEM_VIDEO_RED_ENVELOPE_SEND(57) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x8;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return VideoRedEnvelopeContent.class;
        }
    },
    ITEM_VIDEO_RED_ENVELOPE_NEW_YEAR_RECEIVE(58) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x7;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return VideoRedEnvelopeNewYearContent.class;
        }
    },
    ITEM_VIDEO_RED_ENVELOPE_NEW_YEAR_SEND(59) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x8;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return VideoRedEnvelopeNewYearContent.class;
        }
    },
    ITEM_XPLAN_DEFAULT_SEND(61) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 50468, new Class[0], Integer.TYPE)) {
                return ITEM_TEXT_SEND.getItemLayoutId();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 50468, new Class[0], Integer.TYPE)).intValue();
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 50469, new Class[0], Class.class)) {
                return ITEM_TEXT_SEND.getMessageContentClazz();
            }
            return (Class) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 50469, new Class[0], Class.class);
        }

        public final String getMsgHint(BaseContent baseContent) {
            if (!PatchProxy.isSupport(new Object[]{baseContent}, this, changeQuickRedirect, false, 50470, new Class[]{BaseContent.class}, String.class)) {
                return m.getXplanDefaultText(true);
            }
            return (String) PatchProxy.accessDispatch(new Object[]{baseContent}, this, changeQuickRedirect, false, 50470, new Class[]{BaseContent.class}, String.class);
        }

        public final BaseContent parse(n nVar) {
            if (PatchProxy.isSupport(new Object[]{nVar}, this, changeQuickRedirect, false, 50471, new Class[]{n.class}, BaseContent.class)) {
                return (BaseContent) PatchProxy.accessDispatch(new Object[]{nVar}, this, changeQuickRedirect, false, 50471, new Class[]{n.class}, BaseContent.class);
            }
            TextContent textContent = new TextContent();
            textContent.setText(m.getXplanDefaultText(true));
            textContent.setDefault(true);
            return textContent;
        }
    },
    ITEM_XPLAN_DEFAULT_RECEIVE(60) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 50472, new Class[0], Integer.TYPE)) {
                return ITEM_TEXT_RECEIVE.getItemLayoutId();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 50472, new Class[0], Integer.TYPE)).intValue();
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 50473, new Class[0], Class.class)) {
                return ITEM_TEXT_RECEIVE.getMessageContentClazz();
            }
            return (Class) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 50473, new Class[0], Class.class);
        }

        public final String getMsgHint(BaseContent baseContent) {
            if (!PatchProxy.isSupport(new Object[]{baseContent}, this, changeQuickRedirect, false, 50474, new Class[]{BaseContent.class}, String.class)) {
                return m.getXplanDefaultText(false);
            }
            return (String) PatchProxy.accessDispatch(new Object[]{baseContent}, this, changeQuickRedirect, false, 50474, new Class[]{BaseContent.class}, String.class);
        }

        public final BaseContent parse(n nVar) {
            if (PatchProxy.isSupport(new Object[]{nVar}, this, changeQuickRedirect, false, 50475, new Class[]{n.class}, BaseContent.class)) {
                return (BaseContent) PatchProxy.accessDispatch(new Object[]{nVar}, this, changeQuickRedirect, false, 50475, new Class[]{n.class}, BaseContent.class);
            }
            TextContent textContent = new TextContent();
            textContent.setText(m.getXplanDefaultText(false));
            textContent.setDefault(true);
            return textContent;
        }
    },
    ITEM_RECALL_SEND(67) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 50476, new Class[0], Integer.TYPE)) {
                return ITEM_TEXT_SEND.getItemLayoutId();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 50476, new Class[0], Integer.TYPE)).intValue();
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 50477, new Class[0], Class.class)) {
                return ITEM_TEXT_SEND.getMessageContentClazz();
            }
            return (Class) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 50477, new Class[0], Class.class);
        }

        public final String getMsgHint(BaseContent baseContent) {
            if (!PatchProxy.isSupport(new Object[]{baseContent}, this, changeQuickRedirect, false, 50478, new Class[]{BaseContent.class}, String.class)) {
                return m.getRecallText(true);
            }
            return (String) PatchProxy.accessDispatch(new Object[]{baseContent}, this, changeQuickRedirect, false, 50478, new Class[]{BaseContent.class}, String.class);
        }

        public final BaseContent parse(n nVar) {
            if (PatchProxy.isSupport(new Object[]{nVar}, this, changeQuickRedirect, false, 50479, new Class[]{n.class}, BaseContent.class)) {
                return (BaseContent) PatchProxy.accessDispatch(new Object[]{nVar}, this, changeQuickRedirect, false, 50479, new Class[]{n.class}, BaseContent.class);
            }
            TextContent textContent = new TextContent();
            if (ad.g(nVar)) {
                textContent.setText(GlobalContext.getContext().getResources().getString(C0906R.string.auw));
            } else {
                textContent.setText(m.getRecallText(true));
            }
            return textContent;
        }
    },
    ITEM_RECALL_RECEIVE(66) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 50480, new Class[0], Integer.TYPE)) {
                return ITEM_TEXT_RECEIVE.getItemLayoutId();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 50480, new Class[0], Integer.TYPE)).intValue();
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 50481, new Class[0], Class.class)) {
                return ITEM_TEXT_RECEIVE.getMessageContentClazz();
            }
            return (Class) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 50481, new Class[0], Class.class);
        }

        public final String getMsgHint(BaseContent baseContent) {
            if (!PatchProxy.isSupport(new Object[]{baseContent}, this, changeQuickRedirect, false, 50482, new Class[]{BaseContent.class}, String.class)) {
                return m.getRecallText(false);
            }
            return (String) PatchProxy.accessDispatch(new Object[]{baseContent}, this, changeQuickRedirect, false, 50482, new Class[]{BaseContent.class}, String.class);
        }

        public final BaseContent parse(n nVar) {
            if (PatchProxy.isSupport(new Object[]{nVar}, this, changeQuickRedirect, false, 50483, new Class[]{n.class}, BaseContent.class)) {
                return (BaseContent) PatchProxy.accessDispatch(new Object[]{nVar}, this, changeQuickRedirect, false, 50483, new Class[]{n.class}, BaseContent.class);
            }
            TextContent textContent = new TextContent();
            if (ad.g(nVar)) {
                textContent.setText(GlobalContext.getContext().getResources().getString(C0906R.string.auw));
            } else {
                textContent.setText(m.getRecallText(false));
            }
            return textContent;
        }
    },
    ITEM_XPLAN_STICKER_EMOJI_RECEIVE(62) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.wm;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return StickerEmojiContent.class;
        }
    },
    ITEM_XPLAN_STICKER_EMOJI_SEND(63) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.wn;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return StickerEmojiContent.class;
        }
    },
    ITEM_SELF_STORY_REPLY_RECEIVE(64) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.xc;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SelfStoryReplyContent.class;
        }
    },
    ITEM_SELF_STORY_REPLY_SEND(65) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.xd;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SelfStoryReplyContent.class;
        }
    },
    ITEM_SHARE_GOOD_RECEIVE(70) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x7;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareGoodContent.class;
        }
    },
    ITEM_SHARE_GOOD_SEND(71) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x8;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareGoodContent.class;
        }
    },
    ITEM_SHARE_GOOD_WINDOW_RECEIVE(72) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x7;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareGoodWindowContent.class;
        }
    },
    ITEM_SHARE_GOOD_WINDOW_SEND(73) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.x8;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return ShareGoodWindowContent.class;
        }
    },
    ITEM_E_PLATFORM_CARD_RECEIVE(74) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.wt;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return EPlatformCardContent.class;
        }
    },
    ITEM_E_PLATFORM_CARD_SEND(75) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.wu;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return EPlatformCardContent.class;
        }
    },
    ITEM_GROUP_GREET_TIPS(76) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.wv;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return SayHelloContent.class;
        }

        public final BaseContent parse(n nVar) {
            if (PatchProxy.isSupport(new Object[]{nVar}, this, changeQuickRedirect, false, 50484, new Class[]{n.class}, BaseContent.class)) {
                return (BaseContent) PatchProxy.accessDispatch(new Object[]{nVar}, this, changeQuickRedirect, false, 50484, new Class[]{n.class}, BaseContent.class);
            }
            SayHelloContent sayHelloContent = (SayHelloContent) m.super.parse(nVar);
            sayHelloContent.setMsgHint("[" + GlobalContext.getContext().getString(C0906R.string.ar2) + "]");
            return sayHelloContent;
        }
    },
    ITEM_GROUP_INVITE_SEND(78) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.wx;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return GroupInviteContent.class;
        }
    },
    ITEM_GROUP_INVITE_RECEIVE(77) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.ww;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return GroupInviteContent.class;
        }
    },
    ITEM_GROUP_NOTICE(79) {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int getItemLayoutId() {
            return C0906R.layout.wy;
        }

        public final Class<? extends BaseContent> getMessageContentClazz() {
            return GroupNoticeContent.class;
        }
    };
    
    private static final Class<? extends BaseContent> DEFAULT_CONTENT_CLAZZ = null;
    @LayoutRes
    private static final int DEFAULT_RECEIVE_LAYOUT_ID = 0;
    @LayoutRes
    private static final int DEFAULT_SEND_LAYOUT_ID = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int itemType;

    @LayoutRes
    public int getItemLayoutId() {
        return DEFAULT_RECEIVE_LAYOUT_ID;
    }

    public int getItemViewType() {
        return this.itemType;
    }

    public Class<? extends BaseContent> getMessageContentClazz() {
        return DEFAULT_CONTENT_CLAZZ;
    }

    static {
        DEFAULT_CONTENT_CLAZZ = TextContent.class;
        DEFAULT_RECEIVE_LAYOUT_ID = C0906R.layout.xi;
        DEFAULT_SEND_LAYOUT_ID = C0906R.layout.xj;
    }

    public static BaseContent content(n nVar) {
        n nVar2 = nVar;
        if (!PatchProxy.isSupport(new Object[]{nVar2}, null, changeQuickRedirect, true, 50453, new Class[]{n.class}, BaseContent.class)) {
            return valueOf(nVar).parse(nVar2);
        }
        return (BaseContent) PatchProxy.accessDispatch(new Object[]{nVar2}, null, changeQuickRedirect, true, 50453, new Class[]{n.class}, BaseContent.class);
    }

    public static boolean isMineMsg(n nVar) {
        if (!PatchProxy.isSupport(new Object[]{nVar}, null, changeQuickRedirect, true, 50455, new Class[]{n.class}, Boolean.TYPE)) {
            return nVar.isSelf();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{nVar}, null, changeQuickRedirect, true, 50455, new Class[]{n.class}, Boolean.TYPE)).booleanValue();
    }

    public static String getDefaultText(boolean z) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 50448, new Class[]{Boolean.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, changeQuickRedirect, true, 50448, new Class[]{Boolean.TYPE}, String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            str = GlobalContext.getContext().getString(C0906R.string.avm);
        } else {
            str = GlobalContext.getContext().getString(C0906R.string.avl);
        }
        sb.append(str);
        sb.append(" ");
        sb.append(GlobalContext.getContext().getString(C0906R.string.aqy));
        return sb.toString();
    }

    public static String getRecallText(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 50450, new Class[]{Boolean.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, changeQuickRedirect, true, 50450, new Class[]{Boolean.TYPE}, String.class);
        } else if (z) {
            return GlobalContext.getContext().getString(C0906R.string.awk);
        } else {
            return GlobalContext.getContext().getString(C0906R.string.awj);
        }
    }

    public static String getXplanDefaultText(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 50449, new Class[]{Boolean.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, changeQuickRedirect, true, 50449, new Class[]{Boolean.TYPE}, String.class);
        } else if (bc.a()) {
            return GlobalContext.getContext().getString(C0906R.string.b0p);
        } else {
            return GlobalContext.getContext().getString(C0906R.string.b05);
        }
    }

    public String getMsgHint(BaseContent baseContent) {
        if (PatchProxy.isSupport(new Object[]{baseContent}, this, changeQuickRedirect, false, 50447, new Class[]{BaseContent.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{baseContent}, this, changeQuickRedirect, false, 50447, new Class[]{BaseContent.class}, String.class);
        } else if (baseContent == null) {
            return "";
        } else {
            return baseContent.getMsgHint();
        }
    }

    public BaseContent parse(n nVar) {
        if (PatchProxy.isSupport(new Object[]{nVar}, this, changeQuickRedirect, false, 50445, new Class[]{n.class}, BaseContent.class)) {
            return (BaseContent) PatchProxy.accessDispatch(new Object[]{nVar}, this, changeQuickRedirect, false, 50445, new Class[]{n.class}, BaseContent.class);
        }
        BaseContent baseContent = null;
        String content = nVar.getContent();
        try {
            baseContent = (BaseContent) l.a(content, getMessageContentClazz());
        } catch (Exception unused) {
        }
        if (baseContent == null) {
            try {
                a.a("MessageViewType parse: itemType:" + this.itemType + " messageStr:" + nVar.toString());
                a.a("MessageViewType parse: itemType:" + this.itemType + " contentStr:" + content);
                baseContent = (BaseContent) getMessageContentClazz().newInstance();
            } catch (IllegalAccessException | InstantiationException unused2) {
            }
        }
        return baseContent;
    }

    public static m valueOf(int i) {
        switch (i) {
            case 0:
                return ITEM_SYSTEM_RECEIVE;
            case 1:
                return ITEM_TEXT_RECEIVE;
            case 2:
                return ITEM_TEXT_SEND;
            case 3:
                return ITEM_SHARE_AWEME_RECEIVE;
            case 4:
                return ITEM_SHARE_AWEME_SEND;
            case 5:
                return ITEM_SHARE_PICTURE_RECEIVE;
            case 6:
                return ITEM_SHARE_PICTURE_SEND;
            case e.l:
                return ITEM_DEFAULT_RECEIVE;
            case 8:
                return ITEM_DEFAULT_SEND;
            case 9:
                return ITEM_LOAD_MORE;
            case 10:
                return ITEM_ONLY_PICTURE_RECEIVE;
            case 11:
                return ITEM_ONLY_PICTURE_SEND;
            case SearchNilInfo.HIT_TYPE_SENSITIVE:
                return ITEM_BIG_EMOJI_RECEIVE;
            case 13:
                return ITEM_BIG_EMOJI_SEND;
            case 14:
                return ITEM_VIDEO_UPDATE_TIPS;
            case 15:
                return ITEM_COMMAND_SHARE_RECEIVE;
            case SearchJediMixFeedAdapter.f42514c:
                return ITEM_COMMAND_SHARE_SEND;
            case 17:
                return ITEM_COMMENT_RECEIVE;
            case 18:
                return ITEM_COMMENT_SEND;
            case 19:
                return ITEM_SAY_HELLO;
            case 20:
                return ITEM_VOICE_RECEIVE;
            case 21:
                return ITEM_VOICE_SEND;
            case 22:
                return ITEM_SHARE_RANK_LIST_RECEIVE;
            case 23:
                return ITEM_SHARE_RANK_LIST_SEND;
            case 24:
                return ITEM_SHARE_POI_MULTI_RECEIVE;
            case 25:
                return ITEM_SHARE_POI_MULTI_SEND;
            case 26:
                return ITEM_SHARE_POI_SIMPLE_RECEIVE;
            case 27:
                return ITEM_SHARE_POI_SIMPLE_SEND;
            case 28:
                return ITEM_SHARE_MUSIC_MULTI_RECEIVE;
            case 29:
                return ITEM_SHARE_MUSIC_MULTI_SEND;
            case c.f69366e /*?: ONE_ARG  (30 int)*/:
                return ITEM_SHARE_MUSIC_SIMPLE_RECEIVE;
            case c.f69367f /*?: ONE_ARG  (31 int)*/:
                return ITEM_SHARE_MUSIC_SIMPLE_SEND;
            case 32:
                return ITEM_SHARE_CHALLENGE_MULTI_RECEIVE;
            case 33:
                return ITEM_SHARE_CHALLENGE_MULTI_SEND;
            case 34:
                return ITEM_SHARE_CHALLENGE_SIMPLE_RECEIVE;
            case 35:
                return ITEM_SHARE_CHALLENGE_SIMPLE_SEND;
            case 36:
                return ITEM_SHARE_RANK_LIST_RECEIVE;
            case 37:
                return ITEM_SHARE_RANK_LIST_SEND;
            case 38:
                return ITEM_SHARE_MINI_APP_RECEIVE;
            case 39:
                return ITEM_SHARE_MINI_APP_SEND;
            case 40:
                return ITEM_SHARE_USER_MULTI_RECEIVE;
            case 41:
                return ITEM_SHARE_USER_MULTI_SEND;
            case 42:
                return ITEM_SHARE_USER_SIMPLE_RECEIVE;
            case 43:
                return ITEM_SHARE_USER_SIMPLE_SEND;
            case 44:
                return ITEM_SHARE_WEB_RECEIVE;
            case 45:
                return ITEM_SHARE_WEB_SEND;
            case 46:
                return ITEM_SHARE_LIVE_RECEIVE;
            case 47:
                return ITEM_SHARE_LIVE_SEND;
            case 48:
                return ITEM_STORY_REPLY_RECEIVE;
            case 49:
                return ITEM_STORY_REPLY_SEND;
            case 50:
                return ITEM_STORY_VIDEO_RECEIVE;
            case 51:
                return ITEM_STORY_VIDEO_SEND;
            case 52:
                return ITEM_STORY_PICTURE_RECEIVE;
            case 53:
                return ITEM_STORY_PICTURE_SEND;
            case 54:
                return ITEM_COMMON_RED_ENVELOPE_RECEIVE;
            case 55:
                return ITEM_COMMON_RED_ENVELOPE_SEND;
            case 56:
                return ITEM_VIDEO_RED_ENVELOPE_RECEIVE;
            case 57:
                return ITEM_VIDEO_RED_ENVELOPE_SEND;
            case 58:
                return ITEM_VIDEO_RED_ENVELOPE_NEW_YEAR_RECEIVE;
            case 59:
                return ITEM_VIDEO_RED_ENVELOPE_NEW_YEAR_SEND;
            case 60:
                return ITEM_XPLAN_DEFAULT_RECEIVE;
            case 61:
                return ITEM_XPLAN_DEFAULT_SEND;
            case 62:
                return ITEM_XPLAN_STICKER_EMOJI_RECEIVE;
            case 63:
                return ITEM_XPLAN_STICKER_EMOJI_SEND;
            case 64:
                return ITEM_SELF_STORY_REPLY_RECEIVE;
            case 65:
                return ITEM_SELF_STORY_REPLY_SEND;
            case 66:
                return ITEM_RECALL_RECEIVE;
            case 67:
                return ITEM_RECALL_SEND;
            case 68:
                return ITEM_SHARE_COUPON_RECEIVE;
            case 69:
                return ITEM_SHARE_COUPON_SEND;
            case 70:
                return ITEM_SHARE_GOOD_RECEIVE;
            case 71:
                return ITEM_SHARE_GOOD_SEND;
            case 72:
                return ITEM_SHARE_GOOD_WINDOW_RECEIVE;
            case 73:
                return ITEM_SHARE_GOOD_WINDOW_SEND;
            case 74:
                return ITEM_E_PLATFORM_CARD_RECEIVE;
            case 75:
                return ITEM_E_PLATFORM_CARD_SEND;
            case 76:
                return ITEM_GROUP_GREET_TIPS;
            case 77:
                return ITEM_GROUP_INVITE_RECEIVE;
            case 78:
                return ITEM_GROUP_INVITE_SEND;
            case 79:
                return ITEM_GROUP_NOTICE;
            default:
                return ITEM_DEFAULT_RECEIVE;
        }
    }

    public BaseViewHolder getViewHolder(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, changeQuickRedirect, false, 50446, new Class[]{View.class}, BaseViewHolder.class)) {
            return (BaseViewHolder) PatchProxy.accessDispatch(new Object[]{view2}, this, changeQuickRedirect, false, 50446, new Class[]{View.class}, BaseViewHolder.class);
        }
        int itemViewType = getItemViewType();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(itemViewType), view2}, null, MessageViewHolderFactory.f50267a, true, 50442, new Class[]{Integer.TYPE, View.class}, BaseViewHolder.class)) {
            return (BaseViewHolder) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(itemViewType), view2}, null, MessageViewHolderFactory.f50267a, true, 50442, new Class[]{Integer.TYPE, View.class}, BaseViewHolder.class);
        }
        switch (itemViewType) {
            case 0:
                return new SystemViewHolder(view2, itemViewType);
            case 1:
                return new TextViewHolder(view2, itemViewType);
            case 2:
                return new TextSendViewHolder(view2, itemViewType);
            case 3:
                return new ShareAwemeReceiveViewHolder(view2, itemViewType);
            case 4:
                return new ShareAwemeSendViewHolder(view2, itemViewType);
            case 5:
                return new ShareAwemeReceiveViewHolder(view2, itemViewType);
            case 6:
                return new ShareAwemeSendViewHolder(view2, itemViewType);
            case e.l:
                return new TextViewHolder(view2, itemViewType);
            case 8:
                return new TextSendViewHolder(view2, itemViewType);
            case 9:
                return new LoadMoreViewHolder(view2, itemViewType);
            case 10:
                return new OnlyPictureViewHolder(view2, itemViewType);
            case 11:
                return new OnlyPictureSendViewHolder(view2, itemViewType);
            case SearchNilInfo.HIT_TYPE_SENSITIVE:
                return new EmojiViewHolder(view2, itemViewType);
            case 13:
                return new EmojiSendViewHolder(view2, itemViewType);
            case 14:
                return new VideoUpdateTipsViewHolder(view2, itemViewType);
            case 15:
                return new CommandShareViewHolder(view2, itemViewType);
            case SearchJediMixFeedAdapter.f42514c:
                return new CommandShareSendViewHolder(view2, itemViewType);
            case 17:
                return new CommentViewHolder(view2, itemViewType);
            case 18:
                return new CommentSendViewHolder(view2, itemViewType);
            case 19:
                return new SayHelloViewHolder(view2, itemViewType);
            case 20:
                return new VoiceMessageViewHolder(view2, itemViewType);
            case 21:
                return new VoiceMessagesSendViewHolder(view2, itemViewType);
            case 22:
                return new ShareRankingSimpleViewHolder(view2, itemViewType);
            case 23:
                return new ShareRankingSimpleSendViewHolder(view2, itemViewType);
            case 24:
                return new SharePoiViewHolder(view2, itemViewType);
            case 25:
                return new SharePoiSendViewHolder(view2, itemViewType);
            case 26:
                return new SharePoiSimpleViewHolder(view2, itemViewType);
            case 27:
                return new SharePoiSimpleSendViewHolder(view2, itemViewType);
            case 28:
                return new ShareMusicMultiReceiveViewHolder(view2, itemViewType);
            case 29:
                return new ShareMusicMultiSendViewHolder(view2, itemViewType);
            case c.f69366e /*?: ONE_ARG  (30 int)*/:
                return new ShareMusicSimpleReceiveViewHolder(view2, itemViewType);
            case c.f69367f /*?: ONE_ARG  (31 int)*/:
                return new ShareMusicSimpleSendViewHolder(view2, itemViewType);
            case 32:
                return new ShareChallengeViewHolder(view2, itemViewType);
            case 33:
                return new ShareChallengeSendViewHolder(view2, itemViewType);
            case 34:
                return new ShareChallengeSimpleViewHolder(view2, itemViewType);
            case 35:
                return new ShareChallengeSimpleSendViewHolder(view2, itemViewType);
            case 36:
                return new ShareRankingSimpleViewHolder(view2, itemViewType);
            case 37:
                return new ShareRankingSimpleSendViewHolder(view2, itemViewType);
            case 38:
                return new ShareMiniAppViewHolder(view2, itemViewType);
            case 39:
                return new ShareMiniAppSendViewHolder(view2, itemViewType);
            case 40:
                return new ShareUserMultiReceiveViewHolder(view2, itemViewType);
            case 41:
                return new ShareUserMultiSendViewHolder(view2, itemViewType);
            case 42:
                return new ShareUserSimpleReceiveViewHolder(view2, itemViewType);
            case 43:
                return new ShareUserSimpleSendViewHolder(view2, itemViewType);
            case 44:
                return new ShareWebReceiveViewHolder(view2, itemViewType);
            case 45:
                return new ShareWebSendViewHolder(view2, itemViewType);
            case 46:
                return new ShareLiveReceiveViewHolder(view2, itemViewType);
            case 47:
                return new ShareLiveSendViewHolder(view2, itemViewType);
            case 48:
                return new StoryReplyReceiveViewHolder(view2, itemViewType);
            case 49:
                return new StoryReplySendViewHolder(view2, itemViewType);
            case 50:
                return new StoryVideoReceiveViewHolder(view2, itemViewType);
            case 51:
                return new StoryVideoSendViewHolder(view2, itemViewType);
            case 52:
                return new StoryPictureViewHolder(view2, itemViewType);
            case 53:
                return new StoryPictureSendViewHolder(view2, itemViewType);
            case 54:
                return new CommonRedEnvelopeHolder(view2, itemViewType);
            case 55:
                return new CommonRedEnvelopeSendHolder(view2, itemViewType);
            case 56:
                return new VideoRedEnvelopeHolder(view2, itemViewType);
            case 57:
                return new VideoRedEnvelopeSendHolder(view2, itemViewType);
            case 58:
                return new VideoRedEnvelopeNewYearHolder(view2, itemViewType);
            case 59:
                return new VideoRedEnvelopeNewYearSendHolder(view2, itemViewType);
            case 60:
                return new TextViewHolder(view2, itemViewType);
            case 61:
                return new TextSendViewHolder(view2, itemViewType);
            case 62:
                return new EmojiViewHolder(view2, itemViewType);
            case 63:
                return new EmojiSendViewHolder(view2, itemViewType);
            case 64:
                return new SelfStoryReplyReceiveViewHolder(view2, itemViewType);
            case 65:
                return new SelfStoryReplySendViewHolder(view2, itemViewType);
            case 68:
                return new ShareCouponSimpleViewHolder(view2, itemViewType);
            case 69:
                return new ShareCouponSimpleSendViewHolder(view2, itemViewType);
            case 70:
                return new ShareGoodViewHolder(view2, itemViewType);
            case 71:
                return new ShareGoodSendViewHolder(view2, itemViewType);
            case 72:
                return new ShareGoodWindowViewHolder(view2, itemViewType);
            case 73:
                return new ShareGoodWindowSendViewHolder(view2, itemViewType);
            case 74:
                return new EPlatformReceiveViewHolder(view2, itemViewType);
            case 75:
                return new EPlatformSendViewHolder(view2, itemViewType);
            case 76:
                return new GreetMessageViewHolder(view2, itemViewType);
            case 77:
                return new GroupInviteViewHolder(view2, itemViewType);
            case 78:
                return new GroupInviteSendViewHolder(view2, itemViewType);
            case 79:
                return new GroupNoticeViewHolder(view2, itemViewType);
            default:
                return new TextViewHolder(view2, itemViewType);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x032a, code lost:
        if (isMineMsg(r17) != false) goto L_0x032c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0330, code lost:
        r1 = 34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0367, code lost:
        if (isMineMsg(r17) != false) goto L_0x032c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x03d8, code lost:
        if (isMineMsg(r17) != false) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0093, code lost:
        if (isMineMsg(r17) != false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0095, code lost:
        r1 = 61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f6, code lost:
        if (isMineMsg(r17) != false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x017c, code lost:
        if (isMineMsg(r17) != false) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01a4, code lost:
        r1 = r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.im.sdk.chat.m valueOf(com.bytedance.im.core.d.n r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.im.core.d.n> r3 = com.bytedance.im.core.d.n.class
            r7[r9] = r3
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.m> r8 = com.ss.android.ugc.aweme.im.sdk.chat.m.class
            r3 = 0
            r5 = 1
            r6 = 50451(0xc513, float:7.0697E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 1
            r14 = 50451(0xc513, float:7.0697E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.im.core.d.n> r0 = com.bytedance.im.core.d.n.class
            r15[r9] = r0
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.m> r16 = com.ss.android.ugc.aweme.im.sdk.chat.m.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.ss.android.ugc.aweme.im.sdk.chat.m r0 = (com.ss.android.ugc.aweme.im.sdk.chat.m) r0
            return r0
        L_0x0037:
            boolean r2 = r17.isRecalled()
            if (r2 == 0) goto L_0x004d
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x0046
            r0 = 67
            goto L_0x0048
        L_0x0046:
            r0 = 66
        L_0x0048:
            com.ss.android.ugc.aweme.im.sdk.chat.m r0 = valueOf((int) r0)
            return r0
        L_0x004d:
            java.lang.String r2 = r17.getContent()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 7
            r4 = 8
            if (r2 == 0) goto L_0x0067
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x0062
            r3 = 8
        L_0x0062:
            com.ss.android.ugc.aweme.im.sdk.chat.m r0 = valueOf((int) r3)
            return r0
        L_0x0067:
            int r2 = r17.getMsgType()
            switch(r2) {
                case 1: goto L_0x03ec;
                case 2: goto L_0x03dc;
                default: goto L_0x006e;
            }
        L_0x006e:
            r5 = 2
            r6 = 3
            switch(r2) {
                case 7: goto L_0x03d4;
                case 8: goto L_0x03c9;
                case 9: goto L_0x03c4;
                default: goto L_0x0073;
            }
        L_0x0073:
            switch(r2) {
                case 12: goto L_0x03b8;
                case 13: goto L_0x03a8;
                case 14: goto L_0x03a3;
                case 15: goto L_0x039e;
                case 16: goto L_0x038e;
                case 17: goto L_0x037c;
                case 18: goto L_0x036a;
                case 19: goto L_0x0318;
                case 20: goto L_0x02c1;
                case 21: goto L_0x02af;
                case 22: goto L_0x0258;
                case 23: goto L_0x0246;
                case 24: goto L_0x0234;
                case 25: goto L_0x01dd;
                case 26: goto L_0x01cb;
                case 27: goto L_0x01b9;
                case 28: goto L_0x01a7;
                default: goto L_0x0076;
            }
        L_0x0076:
            switch(r2) {
                case 35: goto L_0x019c;
                case 36: goto L_0x0193;
                default: goto L_0x0079;
            }
        L_0x0079:
            switch(r2) {
                case 51: goto L_0x0181;
                case 52: goto L_0x0178;
                case 53: goto L_0x0166;
                default: goto L_0x007c;
            }
        L_0x007c:
            switch(r2) {
                case 61: goto L_0x0154;
                case 62: goto L_0x0142;
                default: goto L_0x007f;
            }
        L_0x007f:
            switch(r2) {
                case 1001: goto L_0x013c;
                case 1002: goto L_0x0136;
                default: goto L_0x0082;
            }
        L_0x0082:
            r1 = 60
            r5 = 61
            switch(r2) {
                case 5: goto L_0x0124;
                case 30: goto L_0x0112;
                case 32: goto L_0x00d4;
                case 38: goto L_0x00ca;
                case 58: goto L_0x00b8;
                case 70: goto L_0x00a6;
                default: goto L_0x0089;
            }
        L_0x0089:
            boolean r2 = com.ss.android.ugc.aweme.im.sdk.utils.ad.e(r17)
            if (r2 == 0) goto L_0x0099
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x03ed
        L_0x0095:
            r1 = 61
            goto L_0x03ed
        L_0x0099:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x00a3
            r1 = 8
            goto L_0x03ed
        L_0x00a3:
            r1 = 7
            goto L_0x03ed
        L_0x00a6:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x00b2
            r0 = 75
            r1 = 75
            goto L_0x03ed
        L_0x00b2:
            r0 = 74
            r1 = 74
            goto L_0x03ed
        L_0x00b8:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x00c4
            r0 = 78
            r1 = 78
            goto L_0x03ed
        L_0x00c4:
            r0 = 77
            r1 = 77
            goto L_0x03ed
        L_0x00ca:
            r1 = 59
            r2 = 58
            int r9 = getRedEnvelopeItemType(r0, r1, r2)
            goto L_0x01a4
        L_0x00d4:
            boolean r2 = com.ss.android.ugc.aweme.im.sdk.utils.ad.e(r17)
            r3 = 48
            if (r2 == 0) goto L_0x0109
            com.ss.android.ugc.aweme.im.sdk.chat.m r2 = valueOf((int) r3)
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r2 = r2.parse(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.model.StoryReplyContent r2 = (com.ss.android.ugc.aweme.im.sdk.chat.model.StoryReplyContent) r2
            if (r2 == 0) goto L_0x00f9
            com.ss.android.ugc.aweme.im.sdk.chat.model.StoryContent r2 = r2.getStoryContent()
            int r2 = r2.getSyncAweme()
            if (r2 != 0) goto L_0x00f9
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x03ed
            goto L_0x0095
        L_0x00f9:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x0105
            r0 = 49
        L_0x0101:
            r1 = 49
            goto L_0x03ed
        L_0x0105:
            r1 = 48
            goto L_0x03ed
        L_0x0109:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x0105
            r0 = 49
            goto L_0x0101
        L_0x0112:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x011e
            r0 = 51
            r1 = 51
            goto L_0x03ed
        L_0x011e:
            r0 = 50
            r1 = 50
            goto L_0x03ed
        L_0x0124:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x0130
            r0 = 13
            r1 = 13
            goto L_0x03ed
        L_0x0130:
            r0 = 12
            r1 = 12
            goto L_0x03ed
        L_0x0136:
            r9 = 76
            r1 = 76
            goto L_0x03ed
        L_0x013c:
            r9 = 79
            r1 = 79
            goto L_0x03ed
        L_0x0142:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x014e
            r0 = 73
            r1 = 73
            goto L_0x03ed
        L_0x014e:
            r0 = 72
            r1 = 72
            goto L_0x03ed
        L_0x0154:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x0160
            r0 = 71
            r1 = 71
            goto L_0x03ed
        L_0x0160:
            r0 = 70
            r1 = 70
            goto L_0x03ed
        L_0x0166:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x0172
            r0 = 65
            r1 = 65
            goto L_0x03ed
        L_0x0172:
            r0 = 64
            r1 = 64
            goto L_0x03ed
        L_0x0178:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x03ed
        L_0x017e:
            r1 = 2
            goto L_0x03ed
        L_0x0181:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x018d
            r0 = 63
            r1 = 63
            goto L_0x03ed
        L_0x018d:
            r0 = 62
            r1 = 62
            goto L_0x03ed
        L_0x0193:
            r1 = 57
            r2 = 56
            int r9 = getRedEnvelopeItemType(r0, r1, r2)
            goto L_0x01a4
        L_0x019c:
            r1 = 55
            r2 = 54
            int r9 = getRedEnvelopeItemType(r0, r1, r2)
        L_0x01a4:
            r1 = r9
            goto L_0x03ed
        L_0x01a7:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x01b3
            r0 = 69
            r1 = 69
            goto L_0x03ed
        L_0x01b3:
            r0 = 68
            r1 = 68
            goto L_0x03ed
        L_0x01b9:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x01c5
            r0 = 53
            r1 = 53
            goto L_0x03ed
        L_0x01c5:
            r0 = 52
            r1 = 52
            goto L_0x03ed
        L_0x01cb:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x01d7
            r0 = 45
            r1 = 45
            goto L_0x03ed
        L_0x01d7:
            r0 = 44
            r1 = 44
            goto L_0x03ed
        L_0x01dd:
            java.lang.String r1 = r17.getContent()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x01f9
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x01f3
            r0 = 43
        L_0x01ef:
            r1 = 43
            goto L_0x03ed
        L_0x01f3:
            r0 = 42
        L_0x01f5:
            r1 = 42
            goto L_0x03ed
        L_0x01f9:
            r1 = 40
            com.ss.android.ugc.aweme.im.sdk.chat.m r2 = valueOf((int) r1)
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r2 = r2.parse(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.model.ShareUserContent r2 = (com.ss.android.ugc.aweme.im.sdk.chat.model.ShareUserContent) r2
            if (r2 == 0) goto L_0x0228
            java.util.List r3 = r2.getAwemeCoverList()
            boolean r3 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0228
            java.util.List r2 = r2.getAwemeCoverList()
            int r2 = r2.size()
            if (r2 >= r6) goto L_0x021c
            goto L_0x0228
        L_0x021c:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x03ed
            r0 = 41
            r1 = 41
            goto L_0x03ed
        L_0x0228:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x0231
            r0 = 43
            goto L_0x01ef
        L_0x0231:
            r0 = 42
            goto L_0x01f5
        L_0x0234:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x0240
            r0 = 39
            r1 = 39
            goto L_0x03ed
        L_0x0240:
            r0 = 38
            r1 = 38
            goto L_0x03ed
        L_0x0246:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x0252
            r0 = 37
            r1 = 37
            goto L_0x03ed
        L_0x0252:
            r0 = 36
            r1 = 36
            goto L_0x03ed
        L_0x0258:
            java.lang.String r1 = r17.getContent()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0274
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x026e
            r0 = 31
        L_0x026a:
            r1 = 31
            goto L_0x03ed
        L_0x026e:
            r0 = 30
        L_0x0270:
            r1 = 30
            goto L_0x03ed
        L_0x0274:
            r1 = 28
            com.ss.android.ugc.aweme.im.sdk.chat.m r2 = valueOf((int) r1)
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r2 = r2.parse(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.model.ShareMusicContent r2 = (com.ss.android.ugc.aweme.im.sdk.chat.model.ShareMusicContent) r2
            if (r2 == 0) goto L_0x02a3
            java.util.List r3 = r2.getAwemeCoverList()
            boolean r3 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x02a3
            java.util.List r2 = r2.getAwemeCoverList()
            int r2 = r2.size()
            if (r2 >= r6) goto L_0x0297
            goto L_0x02a3
        L_0x0297:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x03ed
            r0 = 29
            r1 = 29
            goto L_0x03ed
        L_0x02a3:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x02ac
            r0 = 31
            goto L_0x026a
        L_0x02ac:
            r0 = 30
            goto L_0x0270
        L_0x02af:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x02bb
            r0 = 47
            r1 = 47
            goto L_0x03ed
        L_0x02bb:
            r0 = 46
            r1 = 46
            goto L_0x03ed
        L_0x02c1:
            java.lang.String r1 = r17.getContent()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x02dd
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x02d7
            r0 = 27
        L_0x02d3:
            r1 = 27
            goto L_0x03ed
        L_0x02d7:
            r0 = 26
        L_0x02d9:
            r1 = 26
            goto L_0x03ed
        L_0x02dd:
            r1 = 24
            com.ss.android.ugc.aweme.im.sdk.chat.m r2 = valueOf((int) r1)
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r2 = r2.parse(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.model.SharePoiContent r2 = (com.ss.android.ugc.aweme.im.sdk.chat.model.SharePoiContent) r2
            if (r2 == 0) goto L_0x030c
            java.util.List r3 = r2.getCoverUrl()
            boolean r3 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x030c
            java.util.List r2 = r2.getCoverUrl()
            int r2 = r2.size()
            if (r2 >= r6) goto L_0x0300
            goto L_0x030c
        L_0x0300:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x03ed
            r0 = 25
            r1 = 25
            goto L_0x03ed
        L_0x030c:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x0315
            r0 = 27
            goto L_0x02d3
        L_0x0315:
            r0 = 26
            goto L_0x02d9
        L_0x0318:
            java.lang.String r1 = r17.getContent()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 34
            r3 = 35
            if (r1 == 0) goto L_0x0334
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x0330
        L_0x032c:
            r1 = 35
            goto L_0x03ed
        L_0x0330:
            r1 = 34
            goto L_0x03ed
        L_0x0334:
            r1 = 32
            com.ss.android.ugc.aweme.im.sdk.chat.m r4 = valueOf((int) r1)
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r4 = r4.parse(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.model.ShareChallengeContent r4 = (com.ss.android.ugc.aweme.im.sdk.chat.model.ShareChallengeContent) r4
            if (r4 == 0) goto L_0x0363
            java.util.List r5 = r4.getCoverUrl()
            boolean r5 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0363
            java.util.List r4 = r4.getCoverUrl()
            int r4 = r4.size()
            if (r4 >= r6) goto L_0x0357
            goto L_0x0363
        L_0x0357:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x03ed
            r0 = 33
            r1 = 33
            goto L_0x03ed
        L_0x0363:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x0330
            goto L_0x032c
        L_0x036a:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x0376
            r0 = 23
            r1 = 23
            goto L_0x03ed
        L_0x0376:
            r0 = 22
            r1 = 22
            goto L_0x03ed
        L_0x037c:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x0388
            r0 = 21
            r1 = 21
            goto L_0x03ed
        L_0x0388:
            r0 = 20
            r1 = 20
            goto L_0x03ed
        L_0x038e:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x0399
            r0 = 18
            r1 = 18
            goto L_0x03ed
        L_0x0399:
            r0 = 17
            r1 = 17
            goto L_0x03ed
        L_0x039e:
            r9 = 19
            r1 = 19
            goto L_0x03ed
        L_0x03a3:
            r9 = 14
            r1 = 14
            goto L_0x03ed
        L_0x03a8:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x03b3
            r0 = 16
            r1 = 16
            goto L_0x03ed
        L_0x03b3:
            r0 = 15
            r1 = 15
            goto L_0x03ed
        L_0x03b8:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x03c1
            r0 = 6
            r1 = 6
            goto L_0x03ed
        L_0x03c1:
            r0 = 5
            r1 = 5
            goto L_0x03ed
        L_0x03c4:
            r9 = 9
            r1 = 9
            goto L_0x03ed
        L_0x03c9:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x03d2
            r6 = 4
            r1 = 4
            goto L_0x03ed
        L_0x03d2:
            r1 = 3
            goto L_0x03ed
        L_0x03d4:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x03ed
            goto L_0x017e
        L_0x03dc:
            boolean r0 = isMineMsg(r17)
            if (r0 == 0) goto L_0x03e7
            r0 = 11
            r1 = 11
            goto L_0x03ed
        L_0x03e7:
            r0 = 10
            r1 = 10
            goto L_0x03ed
        L_0x03ec:
            r1 = 0
        L_0x03ed:
            com.ss.android.ugc.aweme.im.sdk.chat.m r0 = valueOf((int) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.m.valueOf(com.bytedance.im.core.d.n):com.ss.android.ugc.aweme.im.sdk.chat.m");
    }

    private m(int i) {
        this.itemType = 1;
        this.itemType = i;
    }

    private static int getRedEnvelopeItemType(n nVar, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{nVar, Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 50452, new Class[]{n.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{nVar, Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 50452, new Class[]{n.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (isMineMsg(nVar)) {
            if (bc.a()) {
                return i;
            }
            return 61;
        } else if (bc.a()) {
            return i2;
        } else {
            return 60;
        }
    }

    public static BaseContent content(int i, String str, boolean z, long j) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2, Byte.valueOf(z ? (byte) 1 : 0), new Long(j2)}, null, changeQuickRedirect, true, 50454, new Class[]{Integer.TYPE, String.class, Boolean.TYPE, Long.TYPE}, BaseContent.class)) {
            return (BaseContent) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2, Byte.valueOf(z), new Long(j2)}, null, changeQuickRedirect, true, 50454, new Class[]{Integer.TYPE, String.class, Boolean.TYPE, Long.TYPE}, BaseContent.class);
        } else if (TextUtils.isEmpty(str)) {
            a.a("Content of stranger message is empty");
            return new TextContent();
        } else {
            n nVar = new n();
            nVar.getExt().put("s:is_recalled", String.valueOf(z));
            nVar.setContent(str2);
            nVar.setMsgType(i);
            nVar.setSender(j2);
            return content(nVar);
        }
    }
}
