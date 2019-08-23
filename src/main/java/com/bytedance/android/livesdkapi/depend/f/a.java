package com.bytedance.android.livesdkapi.depend.f;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

public enum a {
    HELLO(0, "Hello"),
    SETTING(0, "Setting"),
    GET_SETTING(0, "GetSettting"),
    REQUEST_RECONNECT(0, "RequestReconnect"),
    DEFAULT(0, "--default--"),
    DIGG(0, "WebcastDiggMessage"),
    GIFT(0, "WebcastGiftMessage"),
    GIFT_GROUP(0, "GiftGroupMessage"),
    SYSTEM(0, "SystemMessage"),
    CHAT(0, "WebcastChatMessage"),
    CONTROL(0, "WebcastControlMessage"),
    MEMBER(0, "WebcastMemberMessage"),
    ROOM(0, "WebcastRoomMessage"),
    SOCIAL(0, "WebcastSocialMessage"),
    SCREEN(0, "WebcastScreenChatMessage"),
    NOTICE(0, "NoticeListUnreadCountMessage"),
    ROOM_START(0, "RoomStartMessage"),
    ROOM_NOTIFY(0, "WebcastRoomNotifyMessage"),
    REMIND(0, "WebcastNoticeMessage"),
    DAILY_RANK(0, "WebcastSunDailyRankMessage"),
    ROOM_PUSH(0, "WebcastPushMessage"),
    DOODLE_GIFT(0, "WebcastDoodleGiftMessage"),
    MODIFY_DECORATION(0, "WebcastDecorationModifyMethod"),
    USER_STATS(0, "WebcastUserStatsMessage"),
    IN_ROOM_BANNER_MESSAGE(0, "WebcastInRoomBannerMessage"),
    ROOM_RICH_CHAT_MESSAGE(0, "WebcastSpecialPushMessage"),
    IM_MESSAGE(0, "IESChatMessage"),
    PROMOTION_CARD_MESSAGE(0, "WebcastPushRoomAdCard"),
    BANNER_RED_POINT(0, "WebcastInRoomBannerRedPoint"),
    LINK_MIC(0, "WebcastLinkMicMethod"),
    LINK_MIC_SIGNAL(0, "WebcastLinkMicSignalingMethod"),
    NOTICE_COUNT(0, "NoticeCountMessage"),
    CLOUD_CONTROL(0, "CloudControl"),
    ROOM_IMG_MESSAGE(0, "WebcastRoomImgMessage"),
    BATTLE_MODE(0, "WebcastBattleModeMessage"),
    GAME_QUIZ(0, "WebcastGamblingStatusChangedMessage"),
    LINK_MIC_ARMIES(0, "WebcastLinkMicArmiesMethod"),
    LINK_MIC_BATTLE(0, "WebcastLinkMicBattleMethod"),
    LINK_MIC_BATTLE_FINISH(0, "WebcastLinkMicBattleFinishMethod"),
    LINK_MIC_BATTLE_TASK(0, "WebcastLinkMicBattleTaskMessage"),
    LOTTERY(0, "WebcastLotteryMessage"),
    TURN_TABLE_BURST(0, "WebcastTurntableBurstMessage"),
    COMMON_TOAST(0, "WebcastCommonToastMessage"),
    GIFT_UPDATE(0, "WebcastGiftUpdateMessage"),
    LUCKY_BOX(0, "WebcastLuckyBoxMessage"),
    COMMENT_IMAGE(0, "WebcastCommentsMessage"),
    FANS_CLUB_STATISTICS(0, "WebcastFansclubStatisticsMessage"),
    USER_SEQ(0, "WebcastRoomUserSeqMessage"),
    LIVE_SHOPPING(0, "WebcastLiveShoppingMessage"),
    FANS_CLUB(0, "WebcastFansclubMessage"),
    LOTTERY_XG(0, "WebcastXGLotteryMessage"),
    CREATE_RED_PACKET(0, "WebcastCreateRedPacketMessage"),
    RECOMMEND_GOODS(0, "WebcastVideoLiveGoodsRcmdMessage"),
    RECOMMEND_COUPON(0, "WebcastVideoLiveCouponRcmdMessage"),
    GOODS_ORDER(0, "WebcastVideoLiveGoodsOrderMessage"),
    FANS_CLUB_REVIEW(0, "WebcastFansclubReviewMessage"),
    ROOM_VERIFY(0, "WebcastRoomVerifyMessage"),
    MEDIA_REPLAY(0, "WebcastMediaLiveReplayVidMessage"),
    COMMERCE_SALE_MESSAGE(0, "CommerceSaleMessage"),
    FOLLOW_GUIDE(0, "WebcastFollowGuideMessage"),
    HONOR_LEVEL_UP(0, "WebcastLevelUpMessage"),
    GUIDE_MESSAGE(0, "WebcastGuideMessage"),
    FREE_CELL_GIFT_MESSAGE(0, "WebcastFreeCellGiftMessage"),
    DUTY_GIFT_MESSAGE(0, "WebcastDutyGiftMessage"),
    ASSET_MESSAGE(0, "WebcastAssetMessage"),
    DAILY_REGION_RANK(0, "WebcastSunDailyRegionRankMessage"),
    DOU_PLUS_MESSAGE(0, "WebcastDouplusMessage");
    
    public static final Map<Integer, Map<Integer, a>> SERVICE_MAP = null;
    public static ChangeQuickRedirect changeQuickRedirect;
    int service;
    String wsMethod;

    public final int getService() {
        return this.service;
    }

    public final String getWsMethod() {
        return this.wsMethod;
    }

    public final int getIntType() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 14963, new Class[0], Integer.TYPE)) {
            return ordinal();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 14963, new Class[0], Integer.TYPE)).intValue();
    }

    static {
        SERVICE_MAP = new HashMap();
        HashMap hashMap = new HashMap();
        for (a aVar : values()) {
            hashMap.put(Integer.valueOf(aVar.ordinal()), aVar);
        }
        SERVICE_MAP.put(0, hashMap);
    }

    public static a get(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 14962, new Class[]{Integer.TYPE, Integer.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 14962, new Class[]{Integer.TYPE, Integer.TYPE}, a.class);
        }
        a aVar = null;
        Map map = SERVICE_MAP.get(Integer.valueOf(i));
        if (map != null) {
            aVar = (a) map.get(Integer.valueOf(i2));
        }
        return aVar;
    }

    private a(int i, String str) {
        this.service = i;
        this.wsMethod = str;
    }
}
