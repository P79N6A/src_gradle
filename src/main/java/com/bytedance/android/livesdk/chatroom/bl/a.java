package com.bytedance.android.livesdk.chatroom.bl;

import com.bytedance.android.livesdk.chatroom.model.a.h;
import com.bytedance.android.livesdk.message.model.FansclubStatisticMessage;
import com.bytedance.android.livesdk.message.model.ab;
import com.bytedance.android.livesdk.message.model.ac;
import com.bytedance.android.livesdk.message.model.ad;
import com.bytedance.android.livesdk.message.model.ae;
import com.bytedance.android.livesdk.message.model.ag;
import com.bytedance.android.livesdk.message.model.ah;
import com.bytedance.android.livesdk.message.model.ai;
import com.bytedance.android.livesdk.message.model.aj;
import com.bytedance.android.livesdk.message.model.ak;
import com.bytedance.android.livesdk.message.model.al;
import com.bytedance.android.livesdk.message.model.an;
import com.bytedance.android.livesdk.message.model.ao;
import com.bytedance.android.livesdk.message.model.ap;
import com.bytedance.android.livesdk.message.model.aq;
import com.bytedance.android.livesdk.message.model.ar;
import com.bytedance.android.livesdk.message.model.as;
import com.bytedance.android.livesdk.message.model.at;
import com.bytedance.android.livesdk.message.model.ax;
import com.bytedance.android.livesdk.message.model.ay;
import com.bytedance.android.livesdk.message.model.b;
import com.bytedance.android.livesdk.message.model.ba;
import com.bytedance.android.livesdk.message.model.bb;
import com.bytedance.android.livesdk.message.model.bc;
import com.bytedance.android.livesdk.message.model.be;
import com.bytedance.android.livesdk.message.model.bg;
import com.bytedance.android.livesdk.message.model.bh;
import com.bytedance.android.livesdk.message.model.bi;
import com.bytedance.android.livesdk.message.model.bj;
import com.bytedance.android.livesdk.message.model.bl;
import com.bytedance.android.livesdk.message.model.bm;
import com.bytedance.android.livesdk.message.model.bo;
import com.bytedance.android.livesdk.message.model.bp;
import com.bytedance.android.livesdk.message.model.bq;
import com.bytedance.android.livesdk.message.model.br;
import com.bytedance.android.livesdk.message.model.c;
import com.bytedance.android.livesdk.message.model.e;
import com.bytedance.android.livesdk.message.model.f;
import com.bytedance.android.livesdk.message.model.g;
import com.bytedance.android.livesdk.message.model.j;
import com.bytedance.android.livesdk.message.model.k;
import com.bytedance.android.livesdk.message.model.l;
import com.bytedance.android.livesdk.message.model.o;
import com.bytedance.android.livesdk.message.model.p;
import com.bytedance.android.livesdk.message.model.q;
import com.bytedance.android.livesdk.message.model.t;
import com.bytedance.android.livesdk.message.model.u;
import com.bytedance.android.livesdk.message.model.v;
import com.bytedance.android.livesdk.message.model.w;
import com.bytedance.android.livesdk.message.model.x;
import com.bytedance.android.livesdk.message.model.y;
import com.bytedance.android.livesdk.message.model.z;
import com.bytedance.android.livesdk.message.proto.AssetMessage;
import com.bytedance.android.livesdk.message.proto.BattleModeMessage;
import com.bytedance.android.livesdk.message.proto.ChatMessage;
import com.bytedance.android.livesdk.message.proto.CommentsMessage;
import com.bytedance.android.livesdk.message.proto.CommerceSaleMessage;
import com.bytedance.android.livesdk.message.proto.CommonToastMessage;
import com.bytedance.android.livesdk.message.proto.ControlMessage;
import com.bytedance.android.livesdk.message.proto.CreateRedPacketMessage;
import com.bytedance.android.livesdk.message.proto.DecorationModifyMessage;
import com.bytedance.android.livesdk.message.proto.DiggMessage;
import com.bytedance.android.livesdk.message.proto.DoodleGiftMessage;
import com.bytedance.android.livesdk.message.proto.DouplusMessage;
import com.bytedance.android.livesdk.message.proto.DutyGiftMessage;
import com.bytedance.android.livesdk.message.proto.FansclubMessage;
import com.bytedance.android.livesdk.message.proto.FansclubReviewMessage;
import com.bytedance.android.livesdk.message.proto.FansclubStatisticsMessage;
import com.bytedance.android.livesdk.message.proto.FollowGuideMessage;
import com.bytedance.android.livesdk.message.proto.FreeCellGiftMessage;
import com.bytedance.android.livesdk.message.proto.GamblingStatusChangedMessage;
import com.bytedance.android.livesdk.message.proto.GiftMessage;
import com.bytedance.android.livesdk.message.proto.GiftUpdateMessage;
import com.bytedance.android.livesdk.message.proto.GuideMessage;
import com.bytedance.android.livesdk.message.proto.InRoomBannerMessage;
import com.bytedance.android.livesdk.message.proto.LevelUpMessage;
import com.bytedance.android.livesdk.message.proto.LinkMicArmies;
import com.bytedance.android.livesdk.message.proto.LinkMicBattle;
import com.bytedance.android.livesdk.message.proto.LinkMicBattleFinish;
import com.bytedance.android.livesdk.message.proto.LinkMicBattleTaskMessage;
import com.bytedance.android.livesdk.message.proto.LinkMicMethod;
import com.bytedance.android.livesdk.message.proto.LinkMicSignalingMethod;
import com.bytedance.android.livesdk.message.proto.LiveShoppingMessage;
import com.bytedance.android.livesdk.message.proto.LotteryMessage;
import com.bytedance.android.livesdk.message.proto.LuckyBoxMessage;
import com.bytedance.android.livesdk.message.proto.MediaLiveReplayVidMessage;
import com.bytedance.android.livesdk.message.proto.MemberMessage;
import com.bytedance.android.livesdk.message.proto.NoticeMessage;
import com.bytedance.android.livesdk.message.proto.NotifyMessage;
import com.bytedance.android.livesdk.message.proto.PushMessage;
import com.bytedance.android.livesdk.message.proto.PushRoomAdCard;
import com.bytedance.android.livesdk.message.proto.RoomImgMessage;
import com.bytedance.android.livesdk.message.proto.RoomMessage;
import com.bytedance.android.livesdk.message.proto.RoomUserSeqMessage;
import com.bytedance.android.livesdk.message.proto.RoomVerifyMessage;
import com.bytedance.android.livesdk.message.proto.ScreenChatMessage;
import com.bytedance.android.livesdk.message.proto.SocialMessage;
import com.bytedance.android.livesdk.message.proto.SpecialPushMessage;
import com.bytedance.android.livesdk.message.proto.SunDailyRankMessage;
import com.bytedance.android.livesdk.message.proto.TurntableBurstMessage;
import com.bytedance.android.livesdk.message.proto.UserStatsMessage;
import com.bytedance.android.livesdk.message.proto.VideoLiveCouponRcmdMessage;
import com.bytedance.android.livesdk.message.proto.VideoLiveGoodsOrderMessage;
import com.bytedance.android.livesdk.message.proto.VideoLiveGoodsRcmdMessage;
import com.bytedance.android.livesdk.message.proto.XGLotteryMessage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.HashMap;

public enum a {
    CHAT(com.bytedance.android.livesdkapi.depend.f.a.CHAT.getWsMethod(), e.class, ChatMessage.ADAPTER),
    CONTROL(com.bytedance.android.livesdkapi.depend.f.a.CONTROL.getWsMethod(), j.class, ControlMessage.ADAPTER),
    DIGG(com.bytedance.android.livesdkapi.depend.f.a.DIGG.getWsMethod(), p.class, DiggMessage.ADAPTER),
    GIFT(com.bytedance.android.livesdkapi.depend.f.a.GIFT.getWsMethod(), ab.class, GiftMessage.ADAPTER),
    MEMBER(com.bytedance.android.livesdkapi.depend.f.a.MEMBER.getWsMethod(), as.class, MemberMessage.ADAPTER),
    ROOM(com.bytedance.android.livesdkapi.depend.f.a.ROOM.getWsMethod(), bb.class, RoomMessage.ADAPTER),
    SOCIAL(com.bytedance.android.livesdkapi.depend.f.a.SOCIAL.getWsMethod(), bj.class, SocialMessage.ADAPTER),
    SCREEN(com.bytedance.android.livesdkapi.depend.f.a.SCREEN.getWsMethod(), bi.class, ScreenChatMessage.ADAPTER),
    ROOM_NOTIFY(com.bytedance.android.livesdkapi.depend.f.a.ROOM_NOTIFY.getWsMethod(), bc.class, NotifyMessage.ADAPTER),
    REMIND(com.bytedance.android.livesdkapi.depend.f.a.REMIND.getWsMethod(), ax.class, NoticeMessage.ADAPTER),
    DAILY_RANK(com.bytedance.android.livesdkapi.depend.f.a.DAILY_RANK.getWsMethod(), l.class, SunDailyRankMessage.ADAPTER),
    DAILY_REGION_RANK(com.bytedance.android.livesdkapi.depend.f.a.DAILY_REGION_RANK.getWsMethod(), l.class, SunDailyRankMessage.ADAPTER),
    DOODLE_GIFT(com.bytedance.android.livesdkapi.depend.f.a.DOODLE_GIFT.getWsMethod(), q.class, DoodleGiftMessage.ADAPTER),
    MODIFY_DECORATION(com.bytedance.android.livesdkapi.depend.f.a.MODIFY_DECORATION.getWsMethod(), o.class, DecorationModifyMessage.ADAPTER),
    ROOM_PUSH(com.bytedance.android.livesdkapi.depend.f.a.ROOM_PUSH.getWsMethod(), be.class, PushMessage.ADAPTER),
    USER_STATS(com.bytedance.android.livesdkapi.depend.f.a.USER_STATS.getWsMethod(), bm.class, UserStatsMessage.ADAPTER),
    IN_ROOM_BANNER(com.bytedance.android.livesdkapi.depend.f.a.IN_ROOM_BANNER_MESSAGE.getWsMethod(), ae.class, InRoomBannerMessage.ADAPTER),
    ROOM_RICH_CHAT(com.bytedance.android.livesdkapi.depend.f.a.ROOM_RICH_CHAT_MESSAGE.getWsMethod(), ay.class, SpecialPushMessage.ADAPTER),
    PROMOTION_CARD(com.bytedance.android.livesdkapi.depend.f.a.PROMOTION_CARD_MESSAGE.getWsMethod(), at.class, PushRoomAdCard.ADAPTER),
    BANNER_RED_POINT(com.bytedance.android.livesdkapi.depend.f.a.BANNER_RED_POINT.getWsMethod(), b.class, PushRoomAdCard.ADAPTER),
    LINK_MIC(com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC.getWsMethod(), al.class, LinkMicMethod.ADAPTER),
    LINK_MIC_SIGNAL(com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC_SIGNAL.getWsMethod(), an.class, LinkMicSignalingMethod.ADAPTER),
    ROOM_IMG(com.bytedance.android.livesdkapi.depend.f.a.ROOM_IMG_MESSAGE.getWsMethod(), ba.class, RoomImgMessage.ADAPTER),
    BATTLE_MODE(com.bytedance.android.livesdkapi.depend.f.a.BATTLE_MODE.getWsMethod(), h.class, BattleModeMessage.ADAPTER),
    GAME_GUIZ(com.bytedance.android.livesdkapi.depend.f.a.GAME_QUIZ.getWsMethod(), z.class, GamblingStatusChangedMessage.ADAPTER),
    LINK_MIC_ARMIES(com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC_ARMIES.getWsMethod(), ah.class, LinkMicArmies.ADAPTER),
    LINK_MIC_BATTLE(com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC_BATTLE.getWsMethod(), aj.class, LinkMicBattle.ADAPTER),
    LINK_MIC_BATTLE_FINISH(com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC_BATTLE_FINISH.getWsMethod(), ai.class, LinkMicBattleFinish.ADAPTER),
    LINK_MIC_BATTLE_TASK(com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC_BATTLE_TASK.getWsMethod(), ak.class, LinkMicBattleTaskMessage.ADAPTER),
    LOTTERY(com.bytedance.android.livesdkapi.depend.f.a.LOTTERY.getWsMethod(), ap.class, LotteryMessage.ADAPTER),
    TURN_TABLE_BURST(com.bytedance.android.livesdkapi.depend.f.a.TURN_TABLE_BURST.getWsMethod(), bl.class, TurntableBurstMessage.ADAPTER),
    GIFT_UPDATE(com.bytedance.android.livesdkapi.depend.f.a.GIFT_UPDATE.getWsMethod(), ac.class, GiftUpdateMessage.ADAPTER),
    COMMON_TOAST(com.bytedance.android.livesdkapi.depend.f.a.COMMON_TOAST.getWsMethod(), com.bytedance.android.livesdk.message.model.h.class, CommonToastMessage.ADAPTER),
    LUCKY_BOX(com.bytedance.android.livesdkapi.depend.f.a.LUCKY_BOX.getWsMethod(), aq.class, LuckyBoxMessage.ADAPTER),
    COMMENT_IMAGE(com.bytedance.android.livesdkapi.depend.f.a.COMMENT_IMAGE.getWsMethod(), f.class, CommentsMessage.ADAPTER),
    FANS_CLUB_STATISTICS(com.bytedance.android.livesdkapi.depend.f.a.FANS_CLUB_STATISTICS.getWsMethod(), FansclubStatisticMessage.class, FansclubStatisticsMessage.ADAPTER),
    USER_SEQ(com.bytedance.android.livesdkapi.depend.f.a.USER_SEQ.getWsMethod(), bg.class, RoomUserSeqMessage.ADAPTER),
    ROOM_VERIFY(com.bytedance.android.livesdkapi.depend.f.a.ROOM_VERIFY.getWsMethod(), bh.class, RoomVerifyMessage.ADAPTER),
    LIVE_SHOPPING(com.bytedance.android.livesdkapi.depend.f.a.LIVE_SHOPPING.getWsMethod(), ao.class, LiveShoppingMessage.ADAPTER),
    FANS_CLUB(com.bytedance.android.livesdkapi.depend.f.a.FANS_CLUB.getWsMethod(), v.class, FansclubMessage.ADAPTER),
    CREATE_RED_PACKET(com.bytedance.android.livesdkapi.depend.f.a.CREATE_RED_PACKET.getWsMethod(), k.class, CreateRedPacketMessage.ADAPTER),
    LOTTERY_XG(com.bytedance.android.livesdkapi.depend.f.a.LOTTERY_XG.getWsMethod(), bp.class, XGLotteryMessage.ADAPTER),
    RECOMMEND_GOODS(com.bytedance.android.livesdkapi.depend.f.a.RECOMMEND_GOODS.getWsMethod(), br.class, VideoLiveGoodsRcmdMessage.ADAPTER),
    RECOMMEND_COUPON(com.bytedance.android.livesdkapi.depend.f.a.RECOMMEND_COUPON.getWsMethod(), bq.class, VideoLiveCouponRcmdMessage.ADAPTER),
    GOODS_ORDER(com.bytedance.android.livesdkapi.depend.f.a.GOODS_ORDER.getWsMethod(), bo.class, VideoLiveGoodsOrderMessage.ADAPTER),
    FANS_CLUB_REVIEW(com.bytedance.android.livesdkapi.depend.f.a.FANS_CLUB_REVIEW.getWsMethod(), w.class, FansclubReviewMessage.ADAPTER),
    MEDIA_REPLAY(com.bytedance.android.livesdkapi.depend.f.a.MEDIA_REPLAY.getWsMethod(), ar.class, MediaLiveReplayVidMessage.ADAPTER),
    COMMERCE_SALE_MESSAGE(com.bytedance.android.livesdkapi.depend.f.a.COMMERCE_SALE_MESSAGE.getWsMethod(), g.class, CommerceSaleMessage.ADAPTER),
    FOLLOW_GUIDE(com.bytedance.android.livesdkapi.depend.f.a.FOLLOW_GUIDE.getWsMethod(), x.class, FollowGuideMessage.ADAPTER),
    HONOR_LEVEL_UP(com.bytedance.android.livesdkapi.depend.f.a.HONOR_LEVEL_UP.getWsMethod(), ag.class, LevelUpMessage.ADAPTER),
    FREE_CELL_GIFT_MESSAGE(com.bytedance.android.livesdkapi.depend.f.a.FREE_CELL_GIFT_MESSAGE.getWsMethod(), y.class, FreeCellGiftMessage.ADAPTER),
    DUTY_GIFT_MESSAGE(com.bytedance.android.livesdkapi.depend.f.a.DUTY_GIFT_MESSAGE.getWsMethod(), u.class, DutyGiftMessage.ADAPTER),
    GUIDE_MESSAGE(com.bytedance.android.livesdkapi.depend.f.a.GUIDE_MESSAGE.getWsMethod(), ad.class, GuideMessage.ADAPTER),
    ASSET_MESSAGE(com.bytedance.android.livesdkapi.depend.f.a.ASSET_MESSAGE.getWsMethod(), com.bytedance.android.livesdk.message.model.a.class, AssetMessage.ADAPTER),
    DOU_PLUS_MESSAGE(com.bytedance.android.livesdkapi.depend.f.a.DOU_PLUS_MESSAGE.getWsMethod(), t.class, DouplusMessage.ADAPTER);
    
    private static final HashMap<String, a> MESSAGE_MAP = null;
    public static ChangeQuickRedirect changeQuickRedirect;
    private Class<? extends c> messageClass;
    private c messageObject;
    private String method;
    private ProtoAdapter<? extends Message> protoAdapter;

    static {
        int i;
        MESSAGE_MAP = new HashMap<>();
        for (a aVar : values()) {
            MESSAGE_MAP.put(aVar.method, aVar);
        }
    }

    public static c getMessageObject(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 3951, new Class[]{String.class}, c.class)) {
            return MESSAGE_MAP.get(str2).messageObject;
        }
        return (c) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 3951, new Class[]{String.class}, c.class);
    }

    public static Class<? extends c> getMessageClass(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 3950, new Class[]{String.class}, Class.class)) {
            return (Class) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 3950, new Class[]{String.class}, Class.class);
        } else if (MESSAGE_MAP.containsKey(str2)) {
            return MESSAGE_MAP.get(str2).messageClass;
        } else {
            return null;
        }
    }

    public static ProtoAdapter<? extends Message> getProtoAdapter(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 3952, new Class[]{String.class}, ProtoAdapter.class)) {
            return (ProtoAdapter) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 3952, new Class[]{String.class}, ProtoAdapter.class);
        }
        a aVar = MESSAGE_MAP.get(str2);
        if (aVar == null) {
            return null;
        }
        return aVar.protoAdapter;
    }

    private a(String str, Class<? extends c> cls, ProtoAdapter<? extends Message> protoAdapter2) {
        this.method = str;
        this.messageClass = cls;
        this.protoAdapter = protoAdapter2;
        try {
            this.messageObject = (c) cls.newInstance();
        } catch (InstantiationException unused) {
        } catch (IllegalAccessException unused2) {
        }
    }
}
