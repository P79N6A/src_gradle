package beancopy;

import android.support.annotation.Keep;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.RocketFansGroupInfo;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.commerce.CommerceInfo;
import com.ss.android.ugc.aweme.commerce.d;
import com.ss.android.ugc.aweme.commerce.service.models.a;
import com.ss.android.ugc.aweme.commerce.service.models.e;
import com.ss.android.ugc.aweme.commerce.service.models.q;
import com.ss.android.ugc.aweme.commercialize.model.g;
import com.ss.android.ugc.aweme.discover.model.CategoryCoverStruct;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.ChallengeAnnouncement;
import com.ss.android.ugc.aweme.discover.model.ChallengeDisclaimer;
import com.ss.android.ugc.aweme.discover.model.ChallengeTransform;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.feed.api.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeControl;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRiskModel;
import com.ss.android.ugc.aweme.feed.model.AwemeStarAtlas;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.CommerceConfigData;
import com.ss.android.ugc.aweme.feed.model.DescendantsModel;
import com.ss.android.ugc.aweme.feed.model.Extra;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.FloatingCardInfo;
import com.ss.android.ugc.aweme.feed.model.GameInfo;
import com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord;
import com.ss.android.ugc.aweme.feed.model.HotSearchInfo;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.feed.model.ItemLikeEggData;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.LongVideo;
import com.ss.android.ugc.aweme.feed.model.Preload;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.feed.model.SpecialSticker;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.model.xigua.XiGuaTaskStruct;
import com.ss.android.ugc.aweme.miniapp_api.model.f;
import com.ss.android.ugc.aweme.miniapp_api.model.h;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.poi.model.b;
import com.ss.android.ugc.aweme.poi.model.k;
import com.ss.android.ugc.aweme.poi.model.m;
import com.ss.android.ugc.aweme.profile.model.AdCoverTitle;
import com.ss.android.ugc.aweme.profile.model.AvatarDecoration;
import com.ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.ss.android.ugc.aweme.profile.model.CommercePermissionStruct;
import com.ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.ss.android.ugc.aweme.profile.model.DouplusToastStruct;
import com.ss.android.ugc.aweme.profile.model.EffectArtistDetail;
import com.ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.HonorStruct;
import com.ss.android.ugc.aweme.profile.model.HotSearchSprintStruct;
import com.ss.android.ugc.aweme.profile.model.PlatformInfo;
import com.ss.android.ugc.aweme.profile.model.QuickShopInfo;
import com.ss.android.ugc.aweme.profile.model.QuickShopSecondFloorInfo;
import com.ss.android.ugc.aweme.profile.model.RecommendAwemeItem;
import com.ss.android.ugc.aweme.profile.model.RelativeUserInfo;
import com.ss.android.ugc.aweme.profile.model.StoryBlockInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.Address;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.PoiCardStruct;
import com.ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.ss.ugc.aweme.proto.ActivityTimeRangeV2;
import com.ss.ugc.aweme.proto.AdCoverTitleV2;
import com.ss.ugc.aweme.proto.AddressStructV2;
import com.ss.ugc.aweme.proto.AnnouncementStructV2;
import com.ss.ugc.aweme.proto.AvatarDecorationStructV2;
import com.ss.ugc.aweme.proto.AwemeCommerceStickerStructV2;
import com.ss.ugc.aweme.proto.AwemeControlStructV2;
import com.ss.ugc.aweme.proto.AwemeFloatingCardStructV2;
import com.ss.ugc.aweme.proto.AwemeLabelStructV2;
import com.ss.ugc.aweme.proto.AwemePromotionOtherStructV2;
import com.ss.ugc.aweme.proto.AwemeRiskStructV2;
import com.ss.ugc.aweme.proto.AwemeSearchStructV2;
import com.ss.ugc.aweme.proto.AwemeStarAtlasStructV2;
import com.ss.ugc.aweme.proto.AwemeStatisticsStructV2;
import com.ss.ugc.aweme.proto.AwemeStatusStructV2;
import com.ss.ugc.aweme.proto.AwemeStructV2;
import com.ss.ugc.aweme.proto.BitRateStructV2;
import com.ss.ugc.aweme.proto.BlueVBrandInfoStructV2;
import com.ss.ugc.aweme.proto.BranchBillboardWeeklyStructV2;
import com.ss.ugc.aweme.proto.CategoryCoverStructV2;
import com.ss.ugc.aweme.proto.ChallengeStructV2;
import com.ss.ugc.aweme.proto.CommerceActivityStructV2;
import com.ss.ugc.aweme.proto.CommerceConfigDataV2;
import com.ss.ugc.aweme.proto.CommerceInfoStructV2;
import com.ss.ugc.aweme.proto.CommercePermissionStructV2;
import com.ss.ugc.aweme.proto.CommerceStickerStructV2;
import com.ss.ugc.aweme.proto.CommerceStickerUnlockStructV2;
import com.ss.ugc.aweme.proto.CommerceUserStructV2;
import com.ss.ugc.aweme.proto.DescendantStructV2;
import com.ss.ugc.aweme.proto.DisclaimerStructV2;
import com.ss.ugc.aweme.proto.DouplusToastStructV2;
import com.ss.ugc.aweme.proto.EffectArtistStructV2;
import com.ss.ugc.aweme.proto.ExternalSongStructV2;
import com.ss.ugc.aweme.proto.ExtraStructV2;
import com.ss.ugc.aweme.proto.FollowersDetailV2;
import com.ss.ugc.aweme.proto.GameStructV2;
import com.ss.ugc.aweme.proto.GuideWordV2;
import com.ss.ugc.aweme.proto.HotsearchSprintStructV2;
import com.ss.ugc.aweme.proto.IconButtonStructV2;
import com.ss.ugc.aweme.proto.ImageInfoStructV2;
import com.ss.ugc.aweme.proto.InteractionStickerStructV2;
import com.ss.ugc.aweme.proto.ItemLikeEggDataV2;
import com.ss.ugc.aweme.proto.LifeStoryBlockStructV2;
import com.ss.ugc.aweme.proto.LiveHonorStructV2;
import com.ss.ugc.aweme.proto.LogPbStructV2;
import com.ss.ugc.aweme.proto.LongVideoStructV2;
import com.ss.ugc.aweme.proto.MicroAppCardStructV2;
import com.ss.ugc.aweme.proto.MicroAppStructV2;
import com.ss.ugc.aweme.proto.MusicStructV2;
import com.ss.ugc.aweme.proto.NewFaceStickerStructV2;
import com.ss.ugc.aweme.proto.OfflineInfoStructV2;
import com.ss.ugc.aweme.proto.OpenPlatformStructV2;
import com.ss.ugc.aweme.proto.OriginalMusicianStructV2;
import com.ss.ugc.aweme.proto.PermissionStructV2;
import com.ss.ugc.aweme.proto.PlatformSyncStatusStructV2;
import com.ss.ugc.aweme.proto.PoiBackendTypeStructV2;
import com.ss.ugc.aweme.proto.PoiCardStructV2;
import com.ss.ugc.aweme.proto.PoiStructV2;
import com.ss.ugc.aweme.proto.PositionStructV2;
import com.ss.ugc.aweme.proto.PreloadStructV2;
import com.ss.ugc.aweme.proto.QuickShopSecondFloorV2;
import com.ss.ugc.aweme.proto.QuickShopStructV2;
import com.ss.ugc.aweme.proto.RFansGroupInfoV2;
import com.ss.ugc.aweme.proto.RecommendItemStructV2;
import com.ss.ugc.aweme.proto.RelationDynamicLableStructV2;
import com.ss.ugc.aweme.proto.RelativeUserStructV2;
import com.ss.ugc.aweme.proto.ShareStructV2;
import com.ss.ugc.aweme.proto.SimpleUserStructV2;
import com.ss.ugc.aweme.proto.SmartPhoneSettingsStructV2;
import com.ss.ugc.aweme.proto.SpecialStickerStructV2;
import com.ss.ugc.aweme.proto.TextExtraStructV2;
import com.ss.ugc.aweme.proto.UrlStructV2;
import com.ss.ugc.aweme.proto.UserStructV2;
import com.ss.ugc.aweme.proto.VideoControlV2;
import com.ss.ugc.aweme.proto.VideoStructV2;
import com.ss.ugc.aweme.proto.VideoTextStructV2;
import com.ss.ugc.aweme.proto.VoteOptionStructV2;
import com.ss.ugc.aweme.proto.VoteStructV2;
import com.ss.ugc.aweme.proto.XiguaTaskStructV2;
import com.ss.ugc.aweme.proto.aweme_v2_feed_response;
import java.util.ArrayList;
import java.util.List;

@Keep
public class ConvertHelp {
    private ConvertHelp() {
    }

    public static List<a> List$com$ss$ugc$aweme$proto$ActivityTimeRangeV2$$List$com$ss$android$ugc$aweme$commerce$service$models$ActivityTimeRange(List<ActivityTimeRangeV2> list, List<a> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (ActivityTimeRangeV2 com$ss$ugc$aweme$proto$ActivityTimeRangeV2$$com$ss$android$ugc$aweme$commerce$service$models$ActivityTimeRange : list) {
            arrayList.add(com$ss$ugc$aweme$proto$ActivityTimeRangeV2$$com$ss$android$ugc$aweme$commerce$service$models$ActivityTimeRange(com$ss$ugc$aweme$proto$ActivityTimeRangeV2$$com$ss$android$ugc$aweme$commerce$service$models$ActivityTimeRange, null));
        }
        return arrayList;
    }

    public static List<AwemeLabelModel> List$com$ss$ugc$aweme$proto$AwemeLabelStructV2$$List$com$ss$android$ugc$aweme$feed$model$AwemeLabelModel(List<AwemeLabelStructV2> list, List<AwemeLabelModel> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (AwemeLabelStructV2 com$ss$ugc$aweme$proto$AwemeLabelStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeLabelModel : list) {
            arrayList.add(com$ss$ugc$aweme$proto$AwemeLabelStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeLabelModel(com$ss$ugc$aweme$proto$AwemeLabelStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeLabelModel, null));
        }
        return arrayList;
    }

    public static List<Aweme> List$com$ss$ugc$aweme$proto$AwemeStructV2$$List$com$ss$android$ugc$aweme$feed$model$Aweme(List<AwemeStructV2> list, List<Aweme> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (AwemeStructV2 com$ss$ugc$aweme$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme : list) {
            arrayList.add(com$ss$ugc$aweme$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme(com$ss$ugc$aweme$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme, null));
        }
        return arrayList;
    }

    public static List<BitRate> List$com$ss$ugc$aweme$proto$BitRateStructV2$$List$com$ss$android$ugc$aweme$feed$model$BitRate(List<BitRateStructV2> list, List<BitRate> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (BitRateStructV2 com$ss$ugc$aweme$proto$BitRateStructV2$$com$ss$android$ugc$aweme$feed$model$BitRate : list) {
            arrayList.add(com$ss$ugc$aweme$proto$BitRateStructV2$$com$ss$android$ugc$aweme$feed$model$BitRate(com$ss$ugc$aweme$proto$BitRateStructV2$$com$ss$android$ugc$aweme$feed$model$BitRate, null));
        }
        return arrayList;
    }

    public static List<Challenge> List$com$ss$ugc$aweme$proto$ChallengeStructV2$$List$com$ss$android$ugc$aweme$discover$model$Challenge(List<ChallengeStructV2> list, List<Challenge> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (ChallengeStructV2 com$ss$ugc$aweme$proto$ChallengeStructV2$$com$ss$android$ugc$aweme$discover$model$Challenge : list) {
            arrayList.add(com$ss$ugc$aweme$proto$ChallengeStructV2$$com$ss$android$ugc$aweme$discover$model$Challenge(com$ss$ugc$aweme$proto$ChallengeStructV2$$com$ss$android$ugc$aweme$discover$model$Challenge, null));
        }
        return arrayList;
    }

    public static List<CommerceConfigData> List$com$ss$ugc$aweme$proto$CommerceConfigDataV2$$List$com$ss$android$ugc$aweme$feed$model$CommerceConfigData(List<CommerceConfigDataV2> list, List<CommerceConfigData> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (CommerceConfigDataV2 com$ss$ugc$aweme$proto$CommerceConfigDataV2$$com$ss$android$ugc$aweme$feed$model$CommerceConfigData : list) {
            arrayList.add(com$ss$ugc$aweme$proto$CommerceConfigDataV2$$com$ss$android$ugc$aweme$feed$model$CommerceConfigData(com$ss$ugc$aweme$proto$CommerceConfigDataV2$$com$ss$android$ugc$aweme$feed$model$CommerceConfigData, null));
        }
        return arrayList;
    }

    public static List<ExternalMusicInfo> List$com$ss$ugc$aweme$proto$ExternalSongStructV2$$List$com$ss$android$ugc$aweme$music$model$ExternalMusicInfo(List<ExternalSongStructV2> list, List<ExternalMusicInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (ExternalSongStructV2 com$ss$ugc$aweme$proto$ExternalSongStructV2$$com$ss$android$ugc$aweme$music$model$ExternalMusicInfo : list) {
            arrayList.add(com$ss$ugc$aweme$proto$ExternalSongStructV2$$com$ss$android$ugc$aweme$music$model$ExternalMusicInfo(com$ss$ugc$aweme$proto$ExternalSongStructV2$$com$ss$android$ugc$aweme$music$model$ExternalMusicInfo, null));
        }
        return arrayList;
    }

    public static List<FollowerDetail> List$com$ss$ugc$aweme$proto$FollowersDetailV2$$List$com$ss$android$ugc$aweme$profile$model$FollowerDetail(List<FollowersDetailV2> list, List<FollowerDetail> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (FollowersDetailV2 com$ss$ugc$aweme$proto$FollowersDetailV2$$com$ss$android$ugc$aweme$profile$model$FollowerDetail : list) {
            arrayList.add(com$ss$ugc$aweme$proto$FollowersDetailV2$$com$ss$android$ugc$aweme$profile$model$FollowerDetail(com$ss$ugc$aweme$proto$FollowersDetailV2$$com$ss$android$ugc$aweme$profile$model$FollowerDetail, null));
        }
        return arrayList;
    }

    public static List<ImageInfo> List$com$ss$ugc$aweme$proto$ImageInfoStructV2$$List$com$ss$android$ugc$aweme$feed$model$ImageInfo(List<ImageInfoStructV2> list, List<ImageInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (ImageInfoStructV2 com$ss$ugc$aweme$proto$ImageInfoStructV2$$com$ss$android$ugc$aweme$feed$model$ImageInfo : list) {
            arrayList.add(com$ss$ugc$aweme$proto$ImageInfoStructV2$$com$ss$android$ugc$aweme$feed$model$ImageInfo(com$ss$ugc$aweme$proto$ImageInfoStructV2$$com$ss$android$ugc$aweme$feed$model$ImageInfo, null));
        }
        return arrayList;
    }

    public static List<InteractStickerStruct> List$com$ss$ugc$aweme$proto$InteractionStickerStructV2$$List$com$ss$android$ugc$aweme$sticker$data$InteractStickerStruct(List<InteractionStickerStructV2> list, List<InteractStickerStruct> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (InteractionStickerStructV2 com$ss$ugc$aweme$proto$InteractionStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$InteractStickerStruct : list) {
            arrayList.add(com$ss$ugc$aweme$proto$InteractionStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$InteractStickerStruct(com$ss$ugc$aweme$proto$InteractionStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$InteractStickerStruct, null));
        }
        return arrayList;
    }

    public static List<LongVideo> List$com$ss$ugc$aweme$proto$LongVideoStructV2$$List$com$ss$android$ugc$aweme$feed$model$LongVideo(List<LongVideoStructV2> list, List<LongVideo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (LongVideoStructV2 com$ss$ugc$aweme$proto$LongVideoStructV2$$com$ss$android$ugc$aweme$feed$model$LongVideo : list) {
            arrayList.add(com$ss$ugc$aweme$proto$LongVideoStructV2$$com$ss$android$ugc$aweme$feed$model$LongVideo(com$ss$ugc$aweme$proto$LongVideoStructV2$$com$ss$android$ugc$aweme$feed$model$LongVideo, null));
        }
        return arrayList;
    }

    public static List<Music> List$com$ss$ugc$aweme$proto$MusicStructV2$$List$com$ss$android$ugc$aweme$music$model$Music(List<MusicStructV2> list, List<Music> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (MusicStructV2 com$ss$ugc$aweme$proto$MusicStructV2$$com$ss$android$ugc$aweme$music$model$Music : list) {
            arrayList.add(com$ss$ugc$aweme$proto$MusicStructV2$$com$ss$android$ugc$aweme$music$model$Music(com$ss$ugc$aweme$proto$MusicStructV2$$com$ss$android$ugc$aweme$music$model$Music, null));
        }
        return arrayList;
    }

    public static List<d> List$com$ss$ugc$aweme$proto$OfflineInfoStructV2$$List$com$ss$android$ugc$aweme$commerce$OfflineInfo(List<OfflineInfoStructV2> list, List<d> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (OfflineInfoStructV2 com$ss$ugc$aweme$proto$OfflineInfoStructV2$$com$ss$android$ugc$aweme$commerce$OfflineInfo : list) {
            arrayList.add(com$ss$ugc$aweme$proto$OfflineInfoStructV2$$com$ss$android$ugc$aweme$commerce$OfflineInfo(com$ss$ugc$aweme$proto$OfflineInfoStructV2$$com$ss$android$ugc$aweme$commerce$OfflineInfo, null));
        }
        return arrayList;
    }

    public static PlatformInfo[] List$com$ss$ugc$aweme$proto$PlatformSyncStatusStructV2$$Arraycom$ss$android$ugc$aweme$profile$model$PlatformInfo(List<PlatformSyncStatusStructV2> list, PlatformInfo[] platformInfoArr) {
        if (list == null) {
            return platformInfoArr;
        }
        if (list.isEmpty()) {
            return new PlatformInfo[0];
        }
        PlatformInfo[] platformInfoArr2 = new PlatformInfo[list.size()];
        for (int i = 0; i < list.size(); i++) {
            platformInfoArr2[i] = com$ss$ugc$aweme$proto$PlatformSyncStatusStructV2$$com$ss$android$ugc$aweme$profile$model$PlatformInfo(list.get(i), null);
        }
        return platformInfoArr2;
    }

    public static List<Position> List$com$ss$ugc$aweme$proto$PositionStructV2$$List$com$ss$android$ugc$aweme$discover$model$Position(List<PositionStructV2> list, List<Position> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (PositionStructV2 com$ss$ugc$aweme$proto$PositionStructV2$$com$ss$android$ugc$aweme$discover$model$Position : list) {
            arrayList.add(com$ss$ugc$aweme$proto$PositionStructV2$$com$ss$android$ugc$aweme$discover$model$Position(com$ss$ugc$aweme$proto$PositionStructV2$$com$ss$android$ugc$aweme$discover$model$Position, null));
        }
        return arrayList;
    }

    public static List<RecommendAwemeItem> List$com$ss$ugc$aweme$proto$RecommendItemStructV2$$List$com$ss$android$ugc$aweme$profile$model$RecommendAwemeItem(List<RecommendItemStructV2> list, List<RecommendAwemeItem> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (RecommendItemStructV2 com$ss$ugc$aweme$proto$RecommendItemStructV2$$com$ss$android$ugc$aweme$profile$model$RecommendAwemeItem : list) {
            arrayList.add(com$ss$ugc$aweme$proto$RecommendItemStructV2$$com$ss$android$ugc$aweme$profile$model$RecommendAwemeItem(com$ss$ugc$aweme$proto$RecommendItemStructV2$$com$ss$android$ugc$aweme$profile$model$RecommendAwemeItem, null));
        }
        return arrayList;
    }

    public static List<RelativeUserInfo> List$com$ss$ugc$aweme$proto$RelativeUserStructV2$$List$com$ss$android$ugc$aweme$profile$model$RelativeUserInfo(List<RelativeUserStructV2> list, List<RelativeUserInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (RelativeUserStructV2 com$ss$ugc$aweme$proto$RelativeUserStructV2$$com$ss$android$ugc$aweme$profile$model$RelativeUserInfo : list) {
            arrayList.add(com$ss$ugc$aweme$proto$RelativeUserStructV2$$com$ss$android$ugc$aweme$profile$model$RelativeUserInfo(com$ss$ugc$aweme$proto$RelativeUserStructV2$$com$ss$android$ugc$aweme$profile$model$RelativeUserInfo, null));
        }
        return arrayList;
    }

    public static List<User> List$com$ss$ugc$aweme$proto$SimpleUserStructV2$$List$com$ss$android$ugc$aweme$profile$model$User(List<SimpleUserStructV2> list, List<User> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (SimpleUserStructV2 com$ss$ugc$aweme$proto$SimpleUserStructV2$$com$ss$android$ugc$aweme$profile$model$User : list) {
            arrayList.add(com$ss$ugc$aweme$proto$SimpleUserStructV2$$com$ss$android$ugc$aweme$profile$model$User(com$ss$ugc$aweme$proto$SimpleUserStructV2$$com$ss$android$ugc$aweme$profile$model$User, null));
        }
        return arrayList;
    }

    public static List<TextExtraStruct> List$com$ss$ugc$aweme$proto$TextExtraStructV2$$List$com$ss$android$ugc$aweme$model$TextExtraStruct(List<TextExtraStructV2> list, List<TextExtraStruct> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (TextExtraStructV2 com$ss$ugc$aweme$proto$TextExtraStructV2$$com$ss$android$ugc$aweme$model$TextExtraStruct : list) {
            arrayList.add(com$ss$ugc$aweme$proto$TextExtraStructV2$$com$ss$android$ugc$aweme$model$TextExtraStruct(com$ss$ugc$aweme$proto$TextExtraStructV2$$com$ss$android$ugc$aweme$model$TextExtraStruct, null));
        }
        return arrayList;
    }

    public static List<UrlModel> List$com$ss$ugc$aweme$proto$UrlStructV2$$List$com$ss$android$ugc$aweme$base$model$UrlModel(List<UrlStructV2> list, List<UrlModel> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (UrlStructV2 com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel : list) {
            arrayList.add(com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel, null));
        }
        return arrayList;
    }

    public static List<AwemeTextLabelModel> List$com$ss$ugc$aweme$proto$VideoTextStructV2$$List$com$ss$android$ugc$aweme$feed$model$AwemeTextLabelModel(List<VideoTextStructV2> list, List<AwemeTextLabelModel> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (VideoTextStructV2 com$ss$ugc$aweme$proto$VideoTextStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeTextLabelModel : list) {
            arrayList.add(com$ss$ugc$aweme$proto$VideoTextStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeTextLabelModel(com$ss$ugc$aweme$proto$VideoTextStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeTextLabelModel, null));
        }
        return arrayList;
    }

    public static List<VoteStruct.OptionsBean> List$com$ss$ugc$aweme$proto$VoteOptionStructV2$$List$com$ss$android$ugc$aweme$sticker$data$VoteStruct$OptionsBean(List<VoteOptionStructV2> list, List<VoteStruct.OptionsBean> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (VoteOptionStructV2 com$ss$ugc$aweme$proto$VoteOptionStructV2$$com$ss$android$ugc$aweme$sticker$data$VoteStruct$OptionsBean : list) {
            arrayList.add(com$ss$ugc$aweme$proto$VoteOptionStructV2$$com$ss$android$ugc$aweme$sticker$data$VoteStruct$OptionsBean(com$ss$ugc$aweme$proto$VoteOptionStructV2$$com$ss$android$ugc$aweme$sticker$data$VoteStruct$OptionsBean, null));
        }
        return arrayList;
    }

    public static a com$ss$ugc$aweme$proto$ActivityTimeRangeV2$$com$ss$android$ugc$aweme$commerce$service$models$ActivityTimeRange(ActivityTimeRangeV2 activityTimeRangeV2, a aVar) {
        if (activityTimeRangeV2 == null) {
            return aVar;
        }
        a aVar2 = new a();
        aVar2.start = BuiltInConvert.Double2F(activityTimeRangeV2.start, aVar2.start);
        aVar2.end = BuiltInConvert.Double2F(activityTimeRangeV2.end, aVar2.end);
        return aVar2;
    }

    public static AdCoverTitle com$ss$ugc$aweme$proto$AdCoverTitleV2$$com$ss$android$ugc$aweme$profile$model$AdCoverTitle(AdCoverTitleV2 adCoverTitleV2, AdCoverTitle adCoverTitle) {
        if (adCoverTitleV2 == null) {
            return adCoverTitle;
        }
        AdCoverTitle adCoverTitle2 = new AdCoverTitle();
        adCoverTitle2.title = adCoverTitleV2.title;
        adCoverTitle2.webUrl = adCoverTitleV2.web_url;
        return adCoverTitle2;
    }

    public static b com$ss$ugc$aweme$proto$AddressStructV2$$com$ss$android$ugc$aweme$poi$model$Address(AddressStructV2 addressStructV2, b bVar) {
        if (addressStructV2 == null) {
            return bVar;
        }
        b bVar2 = new b();
        bVar2.province = addressStructV2.province;
        bVar2.city = addressStructV2.city;
        bVar2.district = addressStructV2.district;
        bVar2.address = addressStructV2.address;
        bVar2.simpleAddr = addressStructV2.simple_addr;
        bVar2.cityCode = addressStructV2.city_code;
        bVar2.country = addressStructV2.country;
        bVar2.countryCode = addressStructV2.country_code;
        return bVar2;
    }

    public static Address com$ss$ugc$aweme$proto$AddressStructV2$$com$ss$android$ugc$aweme$sticker$data$Address(AddressStructV2 addressStructV2, Address address) {
        if (addressStructV2 == null) {
            return address;
        }
        Address address2 = new Address();
        address2.provice = addressStructV2.province;
        address2.city = addressStructV2.city;
        address2.district = addressStructV2.district;
        address2.address = addressStructV2.address;
        address2.simpleAddr = addressStructV2.simple_addr;
        return address2;
    }

    public static ChallengeAnnouncement com$ss$ugc$aweme$proto$AnnouncementStructV2$$com$ss$android$ugc$aweme$discover$model$ChallengeAnnouncement(AnnouncementStructV2 announcementStructV2, ChallengeAnnouncement challengeAnnouncement) {
        if (announcementStructV2 == null) {
            return challengeAnnouncement;
        }
        ChallengeAnnouncement challengeAnnouncement2 = new ChallengeAnnouncement();
        challengeAnnouncement2.title = announcementStructV2.title;
        challengeAnnouncement2.content = announcementStructV2.body;
        return challengeAnnouncement2;
    }

    public static AvatarDecoration com$ss$ugc$aweme$proto$AvatarDecorationStructV2$$com$ss$android$ugc$aweme$profile$model$AvatarDecoration(AvatarDecorationStructV2 avatarDecorationStructV2, AvatarDecoration avatarDecoration) {
        if (avatarDecorationStructV2 == null) {
            return avatarDecoration;
        }
        AvatarDecoration avatarDecoration2 = new AvatarDecoration();
        avatarDecoration2.id = BuiltInConvert.Long2J(avatarDecorationStructV2.id, avatarDecoration2.id);
        avatarDecoration2.name = avatarDecorationStructV2.name;
        avatarDecoration2.sourceUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(avatarDecorationStructV2.source_url, avatarDecoration2.sourceUrl);
        return avatarDecoration2;
    }

    public static g com$ss$ugc$aweme$proto$AwemeCommerceStickerStructV2$$com$ss$android$ugc$aweme$commercialize$model$CommerceStickerInfo(AwemeCommerceStickerStructV2 awemeCommerceStickerStructV2, g gVar) {
        if (awemeCommerceStickerStructV2 == null) {
            return gVar;
        }
        g gVar2 = new g();
        gVar2.commerceStickerId = BuiltInConvert.Long2J(awemeCommerceStickerStructV2.commerce_sticker_id, gVar2.commerceStickerId);
        gVar2.iconUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(awemeCommerceStickerStructV2.icon_url, gVar2.iconUrl);
        gVar2.letters = awemeCommerceStickerStructV2.letters;
        gVar2.openUrl = awemeCommerceStickerStructV2.open_url;
        gVar2.webUrl = awemeCommerceStickerStructV2.web_url;
        gVar2.webUrlTitle = awemeCommerceStickerStructV2.web_url_title;
        return gVar2;
    }

    public static AwemeControl com$ss$ugc$aweme$proto$AwemeControlStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeControl(AwemeControlStructV2 awemeControlStructV2, AwemeControl awemeControl) {
        if (awemeControlStructV2 == null) {
            return awemeControl;
        }
        AwemeControl awemeControl2 = new AwemeControl();
        awemeControl2.canForward = BuiltInConvert.Boolean2Z(awemeControlStructV2.can_forward, awemeControl2.canForward);
        awemeControl2.canShare = BuiltInConvert.Boolean2Z(awemeControlStructV2.can_share, awemeControl2.canShare);
        awemeControl2.canComment = BuiltInConvert.Boolean2Z(awemeControlStructV2.can_comment, awemeControl2.canComment);
        awemeControl2.canShowComment = BuiltInConvert.Boolean2Z(awemeControlStructV2.can_show_comment, awemeControl2.canShowComment);
        return awemeControl2;
    }

    public static FloatingCardInfo com$ss$ugc$aweme$proto$AwemeFloatingCardStructV2$$com$ss$android$ugc$aweme$feed$model$FloatingCardInfo(AwemeFloatingCardStructV2 awemeFloatingCardStructV2, FloatingCardInfo floatingCardInfo) {
        if (awemeFloatingCardStructV2 == null) {
            return floatingCardInfo;
        }
        FloatingCardInfo floatingCardInfo2 = new FloatingCardInfo();
        floatingCardInfo2.schema = awemeFloatingCardStructV2.schema;
        floatingCardInfo2.schemaDesc = awemeFloatingCardStructV2.schema_desc;
        floatingCardInfo2.icons = List$com$ss$ugc$aweme$proto$UrlStructV2$$List$com$ss$android$ugc$aweme$base$model$UrlModel(awemeFloatingCardStructV2.icons, floatingCardInfo2.icons);
        floatingCardInfo2.title = awemeFloatingCardStructV2.title;
        floatingCardInfo2.description = awemeFloatingCardStructV2.description;
        floatingCardInfo2.buttonDesc = awemeFloatingCardStructV2.button_desc;
        floatingCardInfo2.buttonBackground = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(awemeFloatingCardStructV2.button_bg, floatingCardInfo2.buttonBackground);
        return floatingCardInfo2;
    }

    public static AwemeLabelModel com$ss$ugc$aweme$proto$AwemeLabelStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeLabelModel(AwemeLabelStructV2 awemeLabelStructV2, AwemeLabelModel awemeLabelModel) {
        if (awemeLabelStructV2 == null) {
            return awemeLabelModel;
        }
        AwemeLabelModel awemeLabelModel2 = new AwemeLabelModel();
        awemeLabelModel2.urlModels = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(awemeLabelStructV2.label_url, awemeLabelModel2.urlModels);
        awemeLabelModel2.labelType = BuiltInConvert.Integer2I(awemeLabelStructV2.label_type, awemeLabelModel2.labelType);
        return awemeLabelModel2;
    }

    public static q com$ss$ugc$aweme$proto$AwemePromotionOtherStructV2$$com$ss$android$ugc$aweme$commerce$service$models$PromotionOtherInfo(AwemePromotionOtherStructV2 awemePromotionOtherStructV2, q qVar) {
        if (awemePromotionOtherStructV2 == null) {
            return qVar;
        }
        q qVar2 = new q();
        qVar2.recallReason = awemePromotionOtherStructV2.recall_reason;
        qVar2.cardPredictDuration = BuiltInConvert.Integer2I(awemePromotionOtherStructV2.card_predict_duration, qVar2.cardPredictDuration);
        qVar2.isOrderShareRecommend = BuiltInConvert.Boolean2Z(awemePromotionOtherStructV2.order_share_recommend, qVar2.isOrderShareRecommend);
        return qVar2;
    }

    public static AwemeRiskModel com$ss$ugc$aweme$proto$AwemeRiskStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeRiskModel(AwemeRiskStructV2 awemeRiskStructV2, AwemeRiskModel awemeRiskModel) {
        if (awemeRiskStructV2 == null) {
            return awemeRiskModel;
        }
        AwemeRiskModel awemeRiskModel2 = new AwemeRiskModel();
        awemeRiskModel2.vote = BuiltInConvert.Boolean2Z(awemeRiskStructV2.vote, awemeRiskModel2.vote);
        awemeRiskModel2.warn = BuiltInConvert.Boolean2Z(awemeRiskStructV2.warn, awemeRiskModel2.warn);
        awemeRiskModel2.riskSink = BuiltInConvert.Boolean2Z(awemeRiskStructV2.risk_sink, awemeRiskModel2.riskSink);
        awemeRiskModel2.type = BuiltInConvert.Integer2I(awemeRiskStructV2.type, awemeRiskModel2.type);
        awemeRiskModel2.content = awemeRiskStructV2.content;
        return awemeRiskModel2;
    }

    public static HotSearchInfo com$ss$ugc$aweme$proto$AwemeSearchStructV2$$com$ss$android$ugc$aweme$feed$model$HotSearchInfo(AwemeSearchStructV2 awemeSearchStructV2, HotSearchInfo hotSearchInfo) {
        if (awemeSearchStructV2 == null) {
            return hotSearchInfo;
        }
        HotSearchInfo hotSearchInfo2 = new HotSearchInfo();
        hotSearchInfo2.sentence = awemeSearchStructV2.sentence;
        hotSearchInfo2.challengeId = awemeSearchStructV2.challenge_id;
        hotSearchInfo2.searchWord = awemeSearchStructV2.search_word;
        hotSearchInfo2.value = BuiltInConvert.Long2J(awemeSearchStructV2.value, hotSearchInfo2.value);
        hotSearchInfo2.videoRank = BuiltInConvert.Integer2I(awemeSearchStructV2.vb_rank, hotSearchInfo2.videoRank);
        hotSearchInfo2.videoRankVV = BuiltInConvert.Long2J(awemeSearchStructV2.vb_rank_value, hotSearchInfo2.videoRankVV);
        return hotSearchInfo2;
    }

    public static AwemeStarAtlas com$ss$ugc$aweme$proto$AwemeStarAtlasStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStarAtlas(AwemeStarAtlasStructV2 awemeStarAtlasStructV2, AwemeStarAtlas awemeStarAtlas) {
        if (awemeStarAtlasStructV2 == null) {
            return awemeStarAtlas;
        }
        AwemeStarAtlas awemeStarAtlas2 = new AwemeStarAtlas();
        awemeStarAtlas2.reviewStatus = BuiltInConvert.Integer2I(awemeStarAtlasStructV2.review_status, awemeStarAtlas2.reviewStatus);
        return awemeStarAtlas2;
    }

    public static AwemeStatistics com$ss$ugc$aweme$proto$AwemeStatisticsStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatistics(AwemeStatisticsStructV2 awemeStatisticsStructV2, AwemeStatistics awemeStatistics) {
        if (awemeStatisticsStructV2 == null) {
            return awemeStatistics;
        }
        AwemeStatistics awemeStatistics2 = new AwemeStatistics();
        awemeStatistics2.commentCount = BuiltInConvert.Integer2I(awemeStatisticsStructV2.comment_count, awemeStatistics2.commentCount);
        awemeStatistics2.diggCount = BuiltInConvert.Integer2I(awemeStatisticsStructV2.digg_count, awemeStatistics2.diggCount);
        awemeStatistics2.downloadCount = BuiltInConvert.Integer2I(awemeStatisticsStructV2.download_count, awemeStatistics2.downloadCount);
        awemeStatistics2.playCount = BuiltInConvert.Integer2I(awemeStatisticsStructV2.play_count, awemeStatistics2.playCount);
        awemeStatistics2.shareCount = BuiltInConvert.Integer2I(awemeStatisticsStructV2.share_count, awemeStatistics2.shareCount);
        awemeStatistics2.forwardCount = BuiltInConvert.Integer2I(awemeStatisticsStructV2.forward_count, awemeStatistics2.forwardCount);
        return awemeStatistics2;
    }

    public static AwemeStatus com$ss$ugc$aweme$proto$AwemeStatusStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatus(AwemeStatusStructV2 awemeStatusStructV2, AwemeStatus awemeStatus) {
        if (awemeStatusStructV2 == null) {
            return awemeStatus;
        }
        AwemeStatus awemeStatus2 = new AwemeStatus();
        awemeStatus2.isDelete = BuiltInConvert.Boolean2Z(awemeStatusStructV2.is_delete, awemeStatus2.isDelete);
        awemeStatus2.allowShare = BuiltInConvert.Boolean2Z(awemeStatusStructV2.allow_share, awemeStatus2.allowShare);
        awemeStatus2.allowComment = BuiltInConvert.Boolean2Z(awemeStatusStructV2.allow_comment, awemeStatus2.allowComment);
        awemeStatus2.privateStatus = BuiltInConvert.Integer2I(awemeStatusStructV2.private_status, awemeStatus2.privateStatus);
        awemeStatus2.withFusionGoods = BuiltInConvert.Boolean2Z(awemeStatusStructV2.with_fusion_goods, awemeStatus2.withFusionGoods);
        awemeStatus2.inReviewing = BuiltInConvert.Boolean2Z(awemeStatusStructV2.in_reviewing, awemeStatus2.inReviewing);
        awemeStatus2.reviewed = BuiltInConvert.Integer2I(awemeStatusStructV2.reviewed, awemeStatus2.reviewed);
        awemeStatus2.selfSee = BuiltInConvert.Boolean2Z(awemeStatusStructV2.self_see, awemeStatus2.selfSee);
        awemeStatus2.isProhibited = BuiltInConvert.Boolean2Z(awemeStatusStructV2.is_prohibited, awemeStatus2.isProhibited);
        awemeStatus2.downloadStatus = BuiltInConvert.Integer2I(awemeStatusStructV2.download_status, awemeStatus2.downloadStatus);
        return awemeStatus2;
    }

    public static Aweme com$ss$ugc$aweme$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme(AwemeStructV2 awemeStructV2, Aweme aweme) {
        if (awemeStructV2 == null) {
            return aweme;
        }
        Aweme aweme2 = new Aweme();
        aweme2.aid = awemeStructV2.aweme_id;
        aweme2.desc = awemeStructV2.desc;
        aweme2.createTime = BuiltInConvert.Long2J(awemeStructV2.create_time, aweme2.createTime);
        aweme2.author = com$ss$ugc$aweme$proto$UserStructV2$$com$ss$android$ugc$aweme$profile$model$User(awemeStructV2.author, aweme2.author);
        aweme2.music = com$ss$ugc$aweme$proto$MusicStructV2$$com$ss$android$ugc$aweme$music$model$Music(awemeStructV2.music, aweme2.music);
        aweme2.challengeList = List$com$ss$ugc$aweme$proto$ChallengeStructV2$$List$com$ss$android$ugc$aweme$discover$model$Challenge(awemeStructV2.cha_list, aweme2.challengeList);
        aweme2.video = com$ss$ugc$aweme$proto$VideoStructV2$$com$ss$android$ugc$aweme$feed$model$Video(awemeStructV2.video, aweme2.video);
        aweme2.shareUrl = awemeStructV2.share_url;
        aweme2.userDigg = BuiltInConvert.Integer2I(awemeStructV2.user_digged, aweme2.userDigg);
        aweme2.statistics = com$ss$ugc$aweme$proto$AwemeStatisticsStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatistics(awemeStructV2.statistics, aweme2.statistics);
        aweme2.status = com$ss$ugc$aweme$proto$AwemeStatusStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatus(awemeStructV2.status, aweme2.status);
        aweme2.extra = awemeStructV2.extra;
        aweme2.rate = BuiltInConvert.Integer2I(awemeStructV2.rate, aweme2.rate);
        aweme2.textExtra = List$com$ss$ugc$aweme$proto$TextExtraStructV2$$List$com$ss$android$ugc$aweme$model$TextExtraStruct(awemeStructV2.text_extra, aweme2.textExtra);
        aweme2.labelLarge = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(awemeStructV2.label_large, aweme2.labelLarge);
        aweme2.labelThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(awemeStructV2.label_thumb, aweme2.labelThumb);
        aweme2.isTop = BuiltInConvert.Integer2I(awemeStructV2.is_top, aweme2.isTop);
        aweme2.labelTop = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(awemeStructV2.label_top, aweme2.labelTop);
        aweme2.shareInfo = com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$base$share$ShareInfo(awemeStructV2.share_info, aweme2.shareInfo);
        aweme2.originAuthor = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(awemeStructV2.label_origin_author, aweme2.originAuthor);
        aweme2.distance = awemeStructV2.distance;
        aweme2.musicStarter = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(awemeStructV2.label_music_starter, aweme2.musicStarter);
        aweme2.labelPrivate = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(awemeStructV2.label_private, aweme2.labelPrivate);
        aweme2.videoLabels = List$com$ss$ugc$aweme$proto$AwemeLabelStructV2$$List$com$ss$android$ugc$aweme$feed$model$AwemeLabelModel(awemeStructV2.video_labels, aweme2.videoLabels);
        aweme2.isVr = BuiltInConvert.Boolean2Z(awemeStructV2.is_vr, aweme2.isVr);
        aweme2.landingPage = awemeStructV2.landing_page;
        aweme2.isAd = BuiltInConvert.Boolean2Z(awemeStructV2.is_ads, aweme2.isAd);
        aweme2.poiStruct = com$ss$ugc$aweme$proto$PoiStructV2$$com$ss$android$ugc$aweme$poi$model$PoiStruct(awemeStructV2.poi_info, aweme2.poiStruct);
        aweme2.awemeType = BuiltInConvert.Integer2I(awemeStructV2.aweme_type, aweme2.awemeType);
        aweme2.relationLabel = com$ss$ugc$aweme$proto$RelationDynamicLableStructV2$$com$ss$android$ugc$aweme$feed$model$RelationDynamicLabel(awemeStructV2.relation_label, aweme2.relationLabel);
        aweme2.cmtSwt = BuiltInConvert.Boolean2Z(awemeStructV2.cmt_swt, aweme2.cmtSwt);
        aweme2.imageInfos = List$com$ss$ugc$aweme$proto$ImageInfoStructV2$$List$com$ss$android$ugc$aweme$feed$model$ImageInfo(awemeStructV2.image_infos, aweme2.imageInfos);
        aweme2.awemeRiskModel = com$ss$ugc$aweme$proto$AwemeRiskStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeRiskModel(awemeStructV2.risk_infos, aweme2.awemeRiskModel);
        aweme2.isRelieve = BuiltInConvert.Boolean2Z(awemeStructV2.is_relieve, aweme2.isRelieve);
        aweme2.position = List$com$ss$ugc$aweme$proto$PositionStructV2$$List$com$ss$android$ugc$aweme$discover$model$Position(awemeStructV2.position, aweme2.position);
        aweme2.uniqidPosition = List$com$ss$ugc$aweme$proto$PositionStructV2$$List$com$ss$android$ugc$aweme$discover$model$Position(awemeStructV2.uniqid_position, aweme2.uniqidPosition);
        aweme2.isHashTag = BuiltInConvert.Integer2I(awemeStructV2.is_hash_tag, aweme2.isHashTag);
        aweme2.isPgcShow = BuiltInConvert.Boolean2Z(awemeStructV2.is_pgcshow, aweme2.isPgcShow);
        aweme2.region = awemeStructV2.region;
        aweme2.textVideoLabels = List$com$ss$ugc$aweme$proto$VideoTextStructV2$$List$com$ss$android$ugc$aweme$feed$model$AwemeTextLabelModel(awemeStructV2.video_text, aweme2.textVideoLabels);
        aweme2.specialSticker = com$ss$ugc$aweme$proto$SpecialStickerStructV2$$com$ss$android$ugc$aweme$feed$model$SpecialSticker(awemeStructV2.sp_sticker, aweme2.specialSticker);
        aweme2.adSchedule = awemeStructV2.ad_schedule;
        aweme2.collectStatus = BuiltInConvert.Integer2I(awemeStructV2.collect_stat, aweme2.collectStatus);
        aweme2.textTopLabels = List$com$ss$ugc$aweme$proto$VideoTextStructV2$$List$com$ss$android$ugc$aweme$feed$model$AwemeTextLabelModel(awemeStructV2.label_top_text, aweme2.textTopLabels);
        aweme2.stickerIDs = awemeStructV2.stickers;
        aweme2.forwardItem = com$ss$ugc$aweme$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme(awemeStructV2.forward_item, aweme2.forwardItem);
        aweme2.forwardCommentId = awemeStructV2.forward_comment_id;
        aweme2.forwardItemId = awemeStructV2.forward_item_id;
        aweme2.preForwardId = awemeStructV2.pre_forward_id;
        aweme2.preventDownload = BuiltInConvert.Boolean2Z(awemeStructV2.prevent_download, aweme2.preventDownload);
        aweme2.nicknamePosition = List$com$ss$ugc$aweme$proto$PositionStructV2$$List$com$ss$android$ugc$aweme$discover$model$Position(awemeStructV2.nickname_position, aweme2.nicknamePosition);
        aweme2.commentSetting = BuiltInConvert.Integer2I(awemeStructV2.item_comment_settings, aweme2.commentSetting);
        aweme2.descendantsModel = com$ss$ugc$aweme$proto$DescendantStructV2$$com$ss$android$ugc$aweme$feed$model$DescendantsModel(awemeStructV2.descendants, aweme2.descendantsModel);
        aweme2.awemeRawAd = c.a(awemeStructV2.raw_ad_data, aweme2.awemeRawAd);
        aweme2.gameInfo = com$ss$ugc$aweme$proto$GameStructV2$$com$ss$android$ugc$aweme$feed$model$GameInfo(awemeStructV2.game_info, aweme2.gameInfo);
        aweme2.microAppInfo = com$ss$ugc$aweme$proto$MicroAppStructV2$$com$ss$android$ugc$aweme$miniapp_api$model$MicroAppInfo(awemeStructV2.micro_app_info, aweme2.microAppInfo);
        aweme2.withPromotionalMusic = BuiltInConvert.Boolean2Z(awemeStructV2.with_promotional_music, aweme2.withPromotionalMusic);
        aweme2.linkAdData = c.a(awemeStructV2.link_ad_data, aweme2.linkAdData);
        aweme2.xiGuaTask = com$ss$ugc$aweme$proto$XiguaTaskStructV2$$com$ss$android$ugc$aweme$feed$model$xigua$XiGuaTaskStruct(awemeStructV2.xigua_task, aweme2.xiGuaTask);
        aweme2.activityPendant = com$ss$ugc$aweme$proto$CommerceActivityStructV2$$com$ss$android$ugc$aweme$commerce$service$models$CommerceActivityStruct(awemeStructV2.activity_pendant, aweme2.activityPendant);
        aweme2.stickerEntranceInfo = com$ss$ugc$aweme$proto$NewFaceStickerStructV2$$com$ss$android$ugc$aweme$sticker$model$NewFaceStickerBean(awemeStructV2.sticker_detail, aweme2.stickerEntranceInfo);
        aweme2.longVideos = List$com$ss$ugc$aweme$proto$LongVideoStructV2$$List$com$ss$android$ugc$aweme$feed$model$LongVideo(awemeStructV2.long_video, aweme2.longVideos);
        aweme2.duetSetting = BuiltInConvert.Integer2I(awemeStructV2.item_duet, aweme2.duetSetting);
        aweme2.reactSetting = BuiltInConvert.Integer2I(awemeStructV2.item_react, aweme2.reactSetting);
        aweme2.hotSearchInfo = com$ss$ugc$aweme$proto$AwemeSearchStructV2$$com$ss$android$ugc$aweme$feed$model$HotSearchInfo(awemeStructV2.hot_info, aweme2.hotSearchInfo);
        aweme2.starAtlasOrderId = BuiltInConvert.Long2J(awemeStructV2.star_atlas_order_id, aweme2.starAtlasOrderId);
        aweme2.mLabelMusicStarterText = awemeStructV2.label_music_starter_text;
        aweme2.downloadWithoutWatermark = BuiltInConvert.Boolean2Z(awemeStructV2.without_watermark, aweme2.downloadWithoutWatermark);
        aweme2.preload = com$ss$ugc$aweme$proto$PreloadStructV2$$com$ss$android$ugc$aweme$feed$model$Preload(awemeStructV2.preload, aweme2.preload);
        aweme2.starRecommendTag = awemeStructV2.star_recommend_tag;
        aweme2.adOrderId = awemeStructV2.ad_order_id;
        aweme2.openPlatformName = awemeStructV2.open_platform_name;
        aweme2.starAtlasInfo = com$ss$ugc$aweme$proto$AwemeStarAtlasStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStarAtlas(awemeStructV2.star_atlas_info, aweme2.starAtlasInfo);
        aweme2.descLanguage = awemeStructV2.desc_language;
        aweme2.floatingCardInfo = com$ss$ugc$aweme$proto$AwemeFloatingCardStructV2$$com$ss$android$ugc$aweme$feed$model$FloatingCardInfo(awemeStructV2.floating_card_content, aweme2.floatingCardInfo);
        aweme2.interactStickerStructs = List$com$ss$ugc$aweme$proto$InteractionStickerStructV2$$List$com$ss$android$ugc$aweme$sticker$data$InteractStickerStruct(awemeStructV2.interaction_stickers, aweme2.interactStickerStructs);
        aweme2.openPlatformStruct = com$ss$ugc$aweme$proto$OpenPlatformStructV2$$com$ss$android$ugc$aweme$opensdk$model$OpenPlatformStruct(awemeStructV2.open_platform_info, aweme2.openPlatformStruct);
        aweme2.adLinkType = BuiltInConvert.Integer2I(awemeStructV2.ad_link_type, aweme2.adLinkType);
        aweme2.takeDownReason = BuiltInConvert.Integer2I(awemeStructV2.take_down_reason, aweme2.takeDownReason);
        aweme2.takeDownDesc = awemeStructV2.take_down_desc;
        aweme2.simplePromotionsString = awemeStructV2.simple_promotions;
        aweme2.uploadMiscInfoStructStr = awemeStructV2.misc_info;
        aweme2.promotionOtherInfo = com$ss$ugc$aweme$proto$AwemePromotionOtherStructV2$$com$ss$android$ugc$aweme$commerce$service$models$PromotionOtherInfo(awemeStructV2.promotion_other_info, aweme2.promotionOtherInfo);
        aweme2.originCommentIds = awemeStructV2.origin_comment_ids;
        aweme2.commerceConfigDataList = List$com$ss$ugc$aweme$proto$CommerceConfigDataV2$$List$com$ss$android$ugc$aweme$feed$model$CommerceConfigData(awemeStructV2.commerce_config_data, aweme2.commerceConfigDataList);
        aweme2.commerceStickerInfo = com$ss$ugc$aweme$proto$AwemeCommerceStickerStructV2$$com$ss$android$ugc$aweme$commercialize$model$CommerceStickerInfo(awemeStructV2.commerce_sticker_info, aweme2.commerceStickerInfo);
        aweme2.enableTopView = BuiltInConvert.Boolean2Z(awemeStructV2.enable_top_view, aweme2.enableTopView);
        aweme2.distributeType = BuiltInConvert.Integer2I(awemeStructV2.distribute_type, aweme2.distributeType);
        aweme2.videoControl = com$ss$ugc$aweme$proto$VideoControlV2$$com$ss$android$ugc$aweme$feed$model$VideoControl(awemeStructV2.video_control, aweme2.videoControl);
        aweme2.isEffectDesigner = BuiltInConvert.Integer2Z(awemeStructV2.is_effect_designer, aweme2.isEffectDesigner);
        aweme2.adAwemeSource = BuiltInConvert.Integer2I(awemeStructV2.ad_aweme_source, aweme2.adAwemeSource);
        aweme2.awemeControl = com$ss$ugc$aweme$proto$AwemeControlStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeControl(awemeStructV2.aweme_control, aweme2.awemeControl);
        return aweme2;
    }

    public static BitRate com$ss$ugc$aweme$proto$BitRateStructV2$$com$ss$android$ugc$aweme$feed$model$BitRate(BitRateStructV2 bitRateStructV2, BitRate bitRate) {
        if (bitRateStructV2 == null) {
            return bitRate;
        }
        BitRate bitRate2 = new BitRate();
        bitRate2.gearName = bitRateStructV2.gear_name;
        bitRate2.qualityType = BuiltInConvert.Integer2I(bitRateStructV2.quality_type, bitRate2.qualityType);
        bitRate2.bitRate = BuiltInConvert.Integer2I(bitRateStructV2.bit_rate, bitRate2.bitRate);
        bitRate2.playAddr = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(bitRateStructV2.play_addr, bitRate2.playAddr);
        bitRate2.isH265 = BuiltInConvert.Integer2I(bitRateStructV2.is_h265, bitRate2.isH265);
        return bitRate2;
    }

    public static BlueVBrandInfo com$ss$ugc$aweme$proto$BlueVBrandInfoStructV2$$com$ss$android$ugc$aweme$profile$model$BlueVBrandInfo(BlueVBrandInfoStructV2 blueVBrandInfoStructV2, BlueVBrandInfo blueVBrandInfo) {
        if (blueVBrandInfoStructV2 == null) {
            return blueVBrandInfo;
        }
        BlueVBrandInfo blueVBrandInfo2 = new BlueVBrandInfo();
        blueVBrandInfo2.categoryId = BuiltInConvert.Integer2I(blueVBrandInfoStructV2.category_id, blueVBrandInfo2.categoryId);
        blueVBrandInfo2.categoryName = blueVBrandInfoStructV2.category_name;
        blueVBrandInfo2.brandId = BuiltInConvert.Integer2I(blueVBrandInfoStructV2.brand_id, blueVBrandInfo2.brandId);
        blueVBrandInfo2.brandName = blueVBrandInfoStructV2.brand_name;
        blueVBrandInfo2.logoUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(blueVBrandInfoStructV2.logo_url, blueVBrandInfo2.logoUrl);
        blueVBrandInfo2.heat = BuiltInConvert.Integer2J(blueVBrandInfoStructV2.heat, blueVBrandInfo2.heat);
        blueVBrandInfo2.rank = BuiltInConvert.Integer2I(blueVBrandInfoStructV2.rank, blueVBrandInfo2.rank);
        blueVBrandInfo2.rankDiff = BuiltInConvert.Integer2I(blueVBrandInfoStructV2.rank_diff, blueVBrandInfo2.rankDiff);
        blueVBrandInfo2.tagName = blueVBrandInfoStructV2.tag_name;
        return blueVBrandInfo2;
    }

    public static com.ss.android.ugc.aweme.hotsearch.b.a com$ss$ugc$aweme$proto$BranchBillboardWeeklyStructV2$$com$ss$android$ugc$aweme$hotsearch$model$BillboardWeeklyInfo(BranchBillboardWeeklyStructV2 branchBillboardWeeklyStructV2, com.ss.android.ugc.aweme.hotsearch.b.a aVar) {
        if (branchBillboardWeeklyStructV2 == null) {
            return aVar;
        }
        com.ss.android.ugc.aweme.hotsearch.b.a aVar2 = new com.ss.android.ugc.aweme.hotsearch.b.a();
        aVar2.uid = branchBillboardWeeklyStructV2.uid;
        aVar2.editionNo = BuiltInConvert.Integer2I(branchBillboardWeeklyStructV2.edition_no, aVar2.editionNo);
        aVar2.startTime = BuiltInConvert.Long2J(branchBillboardWeeklyStructV2.start_time, aVar2.startTime);
        aVar2.endTime = BuiltInConvert.Long2J(branchBillboardWeeklyStructV2.end_time, aVar2.endTime);
        return aVar2;
    }

    public static CategoryCoverStruct com$ss$ugc$aweme$proto$CategoryCoverStructV2$$com$ss$android$ugc$aweme$discover$model$CategoryCoverStruct(CategoryCoverStructV2 categoryCoverStructV2, CategoryCoverStruct categoryCoverStruct) {
        if (categoryCoverStructV2 == null) {
            return categoryCoverStruct;
        }
        CategoryCoverStruct categoryCoverStruct2 = new CategoryCoverStruct();
        categoryCoverStruct2.awemeId = categoryCoverStructV2.aweme_id;
        categoryCoverStruct2.cover = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(categoryCoverStructV2.cover, categoryCoverStruct2.cover);
        categoryCoverStruct2.dynamicCover = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(categoryCoverStructV2.dynamic_cover, categoryCoverStruct2.dynamicCover);
        return categoryCoverStruct2;
    }

    public static Challenge com$ss$ugc$aweme$proto$ChallengeStructV2$$com$ss$android$ugc$aweme$discover$model$Challenge(ChallengeStructV2 challengeStructV2, Challenge challenge) {
        if (challengeStructV2 == null) {
            return challenge;
        }
        Challenge challenge2 = new Challenge();
        challenge2.cid = challengeStructV2.cid;
        challenge2.challengeName = challengeStructV2.cha_name;
        challenge2.desc = challengeStructV2.desc;
        challenge2.schema = challengeStructV2.schema;
        challenge2.author = com$ss$ugc$aweme$proto$UserStructV2$$com$ss$android$ugc$aweme$profile$model$User(challengeStructV2.author, challenge2.author);
        challenge2.userCount = BuiltInConvert.Integer2I(challengeStructV2.user_count, challenge2.userCount);
        challenge2.shareInfo = com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$base$share$ShareInfo(challengeStructV2.share_info, challenge2.shareInfo);
        challenge2.connectMusics = List$com$ss$ugc$aweme$proto$MusicStructV2$$List$com$ss$android$ugc$aweme$music$model$Music(challengeStructV2.connect_music, challenge2.connectMusics);
        challenge2.type = BuiltInConvert.Integer2I(challengeStructV2.type, challenge2.type);
        challenge2.subType = BuiltInConvert.Integer2I(challengeStructV2.sub_type, challenge2.subType);
        challenge2.backgroundImageUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(challengeStructV2.background_image_url, challenge2.backgroundImageUrl);
        challenge2.stickerId = challengeStructV2.sticker_id;
        challenge2.linkText = challengeStructV2.link_text;
        challenge2.linkAction = challengeStructV2.link_action;
        challenge2.pgcshow = BuiltInConvert.Boolean2Z(challengeStructV2.is_pgcshow, challenge2.pgcshow);
        challenge2.collectStatus = BuiltInConvert.Integer2I(challengeStructV2.collect_stat, challenge2.collectStatus);
        challenge2.coverItem = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(challengeStructV2.cover_item, challenge2.coverItem);
        challenge2.isChallenge = BuiltInConvert.Integer2I(challengeStructV2.is_challenge, challenge2.isChallenge);
        challenge2.viewCount = BuiltInConvert.Long2J(challengeStructV2.view_count, challenge2.viewCount);
        challenge2.challengeDisclaimer = com$ss$ugc$aweme$proto$DisclaimerStructV2$$com$ss$android$ugc$aweme$discover$model$ChallengeDisclaimer(challengeStructV2.disclaimer, challenge2.challengeDisclaimer);
        challenge2.allowUploadCover = BuiltInConvert.Boolean2I(challengeStructV2.allow_upload_cover, challenge2.allowUploadCover);
        challenge2.isCommerceAndValid = BuiltInConvert.Boolean2Z(challengeStructV2.is_commerce, challenge2.isCommerceAndValid);
        challenge2.categoryCover = com$ss$ugc$aweme$proto$CategoryCoverStructV2$$com$ss$android$ugc$aweme$discover$model$CategoryCoverStruct(challengeStructV2.category_cover_info, challenge2.categoryCover);
        challenge2.challengeProfileUrl = challengeStructV2.hashtag_profile;
        challenge2.challengeBgUrl = challengeStructV2.cover_photo;
        challenge2.isHotSearch = BuiltInConvert.Integer2I(challengeStructV2.is_hot_search, challenge2.isHotSearch);
        challenge2.linkType = BuiltInConvert.Integer2I(challengeStructV2.link_type, challenge2.linkType);
        challenge2.challengeAnnouncement = com$ss$ugc$aweme$proto$AnnouncementStructV2$$com$ss$android$ugc$aweme$discover$model$ChallengeAnnouncement(challengeStructV2.announcement_info, challenge2.challengeAnnouncement);
        challenge2.contentType = BuiltInConvert.Integer2I(challengeStructV2.content_type, challenge2.contentType);
        challenge2.moduleType = BuiltInConvert.Integer2I(challengeStructV2.module_type, challenge2.moduleType);
        challenge2.profileTagUrl = challengeStructV2.profile_tag;
        challenge2.attrs = challengeStructV2.cha_attrs;
        challenge2.transfrom = com$ss$ugc$aweme$proto$IconButtonStructV2$$com$ss$android$ugc$aweme$discover$model$ChallengeTransform(challengeStructV2.button, challenge2.transfrom);
        return challenge2;
    }

    public static e com$ss$ugc$aweme$proto$CommerceActivityStructV2$$com$ss$android$ugc$aweme$commerce$service$models$CommerceActivityStruct(CommerceActivityStructV2 commerceActivityStructV2, e eVar) {
        if (commerceActivityStructV2 == null) {
            return eVar;
        }
        e eVar2 = new e();
        eVar2.actType = BuiltInConvert.Integer2I(commerceActivityStructV2.act_type, eVar2.actType);
        eVar2.image = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(commerceActivityStructV2.image, eVar2.image);
        eVar2.jumpWebUrl = commerceActivityStructV2.jump_web_url;
        eVar2.jumpOpenUrl = commerceActivityStructV2.jump_open_url;
        eVar2.title = commerceActivityStructV2.title;
        eVar2.startTime = BuiltInConvert.Long2J(commerceActivityStructV2.start_time, eVar2.startTime);
        eVar2.endTime = BuiltInConvert.Long2J(commerceActivityStructV2.end_time, eVar2.endTime);
        eVar2.timeRange = List$com$ss$ugc$aweme$proto$ActivityTimeRangeV2$$List$com$ss$android$ugc$aweme$commerce$service$models$ActivityTimeRange(commerceActivityStructV2.time_range, eVar2.timeRange);
        eVar2.trackUrlList = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(commerceActivityStructV2.track_url_list, eVar2.trackUrlList);
        eVar2.clickTrackUrlList = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(commerceActivityStructV2.click_track_url_list, eVar2.clickTrackUrlList);
        return eVar2;
    }

    public static CommerceConfigData com$ss$ugc$aweme$proto$CommerceConfigDataV2$$com$ss$android$ugc$aweme$feed$model$CommerceConfigData(CommerceConfigDataV2 commerceConfigDataV2, CommerceConfigData commerceConfigData) {
        if (commerceConfigDataV2 == null) {
            return commerceConfigData;
        }
        CommerceConfigData commerceConfigData2 = new CommerceConfigData();
        commerceConfigData2.type = BuiltInConvert.Integer2I(commerceConfigDataV2.type, commerceConfigData2.type);
        commerceConfigData2.itemLikeEggData = com$ss$ugc$aweme$proto$ItemLikeEggDataV2$$com$ss$android$ugc$aweme$feed$model$ItemLikeEggData(commerceConfigDataV2.item_like_egg, commerceConfigData2.itemLikeEggData);
        return commerceConfigData2;
    }

    public static CommerceInfo com$ss$ugc$aweme$proto$CommerceInfoStructV2$$com$ss$android$ugc$aweme$commerce$CommerceInfo(CommerceInfoStructV2 commerceInfoStructV2, CommerceInfo commerceInfo) {
        if (commerceInfoStructV2 == null) {
            return commerceInfo;
        }
        CommerceInfo commerceInfo2 = new CommerceInfo();
        commerceInfo2.headImageUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(commerceInfoStructV2.head_image_url, commerceInfo2.headImageUrl);
        commerceInfo2.offlineInfoList = List$com$ss$ugc$aweme$proto$OfflineInfoStructV2$$List$com$ss$android$ugc$aweme$commerce$OfflineInfo(commerceInfoStructV2.offline_info_list, commerceInfo2.offlineInfoList);
        commerceInfo2.challengeList = c.a(commerceInfoStructV2.challenge_list, commerceInfo2.challengeList);
        commerceInfo2.smartPhone = com$ss$ugc$aweme$proto$SmartPhoneSettingsStructV2$$com$ss$android$ugc$aweme$commerce$SmartPhone(commerceInfoStructV2.smart_phone, commerceInfo2.smartPhone);
        commerceInfo2.quickShopUrl = commerceInfoStructV2.quick_shop_url;
        commerceInfo2.quickShopName = commerceInfoStructV2.quick_shop_name;
        commerceInfo2.siteId = commerceInfoStructV2.site_id;
        return commerceInfo2;
    }

    public static CommercePermissionStruct com$ss$ugc$aweme$proto$CommercePermissionStructV2$$com$ss$android$ugc$aweme$profile$model$CommercePermissionStruct(CommercePermissionStructV2 commercePermissionStructV2, CommercePermissionStruct commercePermissionStruct) {
        if (commercePermissionStructV2 == null) {
            return commercePermissionStruct;
        }
        CommercePermissionStruct commercePermissionStruct2 = new CommercePermissionStruct();
        commercePermissionStruct2.topItem = BuiltInConvert.Integer2I(commercePermissionStructV2.top_item, commercePermissionStruct2.topItem);
        commercePermissionStruct2.adLink = BuiltInConvert.Integer2I(commercePermissionStructV2.ad_link, commercePermissionStruct2.adLink);
        commercePermissionStruct2.starAtlasOrder = BuiltInConvert.Integer2I(commercePermissionStructV2.star_atlas_order, commercePermissionStruct2.starAtlasOrder);
        return commercePermissionStruct2;
    }

    public static com.ss.android.ugc.aweme.sticker.model.a com$ss$ugc$aweme$proto$CommerceStickerStructV2$$com$ss$android$ugc$aweme$sticker$model$CommerceSticker(CommerceStickerStructV2 commerceStickerStructV2, com.ss.android.ugc.aweme.sticker.model.a aVar) {
        if (commerceStickerStructV2 == null) {
            return aVar;
        }
        com.ss.android.ugc.aweme.sticker.model.a aVar2 = new com.ss.android.ugc.aweme.sticker.model.a();
        aVar2.id = commerceStickerStructV2.id;
        aVar2.adOwnerId = commerceStickerStructV2.ad_owner_id;
        aVar2.adOwnerName = commerceStickerStructV2.ad_owner_name;
        aVar2.detailDesc = commerceStickerStructV2.detail_desc;
        aVar2.detailLetters = commerceStickerStructV2.detail_letters;
        aVar2.detailOpenUrl = commerceStickerStructV2.detail_open_url;
        aVar2.detailWebUrl = commerceStickerStructV2.detail_web_url;
        aVar2.detailWebUrlTitle = commerceStickerStructV2.detail_web_url_title;
        aVar2.screenDesc = commerceStickerStructV2.screen_desc;
        aVar2.musicId = commerceStickerStructV2.music_id;
        aVar2.challengeId = commerceStickerStructV2.challenge_id;
        aVar2.screenIcon = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(commerceStickerStructV2.screen_icon, aVar2.screenIcon);
        aVar2.expireTime = BuiltInConvert.Long2J(commerceStickerStructV2.expire_time, aVar2.expireTime);
        aVar2.commerceStickerUnlockInfo = com$ss$ugc$aweme$proto$CommerceStickerUnlockStructV2$$com$ss$android$ugc$aweme$sticker$model$CommerceStickerUnlockInfo(commerceStickerStructV2.unlock_info, aVar2.commerceStickerUnlockInfo);
        return aVar2;
    }

    public static com.ss.android.ugc.aweme.sticker.model.b com$ss$ugc$aweme$proto$CommerceStickerUnlockStructV2$$com$ss$android$ugc$aweme$sticker$model$CommerceStickerUnlockInfo(CommerceStickerUnlockStructV2 commerceStickerUnlockStructV2, com.ss.android.ugc.aweme.sticker.model.b bVar) {
        if (commerceStickerUnlockStructV2 == null) {
            return bVar;
        }
        com.ss.android.ugc.aweme.sticker.model.b bVar2 = new com.ss.android.ugc.aweme.sticker.model.b();
        bVar2.desc = commerceStickerUnlockStructV2.desc;
        bVar2.webUrl = commerceStickerUnlockStructV2.web_url;
        bVar2.openUrl = commerceStickerUnlockStructV2.open_url;
        return bVar2;
    }

    public static CommerceUserInfo com$ss$ugc$aweme$proto$CommerceUserStructV2$$com$ss$android$ugc$aweme$profile$model$CommerceUserInfo(CommerceUserStructV2 commerceUserStructV2, CommerceUserInfo commerceUserInfo) {
        if (commerceUserStructV2 == null) {
            return commerceUserInfo;
        }
        CommerceUserInfo commerceUserInfo2 = new CommerceUserInfo();
        commerceUserInfo2.starAtlas = BuiltInConvert.Integer2I(commerceUserStructV2.star_atlas, commerceUserInfo2.starAtlas);
        commerceUserInfo2.showStarAtlasCooperation = BuiltInConvert.Boolean2Z(commerceUserStructV2.show_star_atlas_cooperation, commerceUserInfo2.showStarAtlasCooperation);
        return commerceUserInfo2;
    }

    public static DescendantsModel com$ss$ugc$aweme$proto$DescendantStructV2$$com$ss$android$ugc$aweme$feed$model$DescendantsModel(DescendantStructV2 descendantStructV2, DescendantsModel descendantsModel) {
        if (descendantStructV2 == null) {
            return descendantsModel;
        }
        DescendantsModel descendantsModel2 = new DescendantsModel();
        descendantsModel2.platforms = descendantStructV2.platforms;
        return descendantsModel2;
    }

    public static ChallengeDisclaimer com$ss$ugc$aweme$proto$DisclaimerStructV2$$com$ss$android$ugc$aweme$discover$model$ChallengeDisclaimer(DisclaimerStructV2 disclaimerStructV2, ChallengeDisclaimer challengeDisclaimer) {
        if (disclaimerStructV2 == null) {
            return challengeDisclaimer;
        }
        ChallengeDisclaimer challengeDisclaimer2 = new ChallengeDisclaimer();
        challengeDisclaimer2.title = disclaimerStructV2.title;
        challengeDisclaimer2.content = disclaimerStructV2.content;
        return challengeDisclaimer2;
    }

    public static DouplusToastStruct com$ss$ugc$aweme$proto$DouplusToastStructV2$$com$ss$android$ugc$aweme$profile$model$DouplusToastStruct(DouplusToastStructV2 douplusToastStructV2, DouplusToastStruct douplusToastStruct) {
        if (douplusToastStructV2 == null) {
            return douplusToastStruct;
        }
        DouplusToastStruct douplusToastStruct2 = new DouplusToastStruct();
        douplusToastStruct2.id = BuiltInConvert.Integer2I(douplusToastStructV2.id, douplusToastStruct2.id);
        douplusToastStruct2.toast = douplusToastStructV2.toast;
        return douplusToastStruct2;
    }

    public static EffectArtistDetail com$ss$ugc$aweme$proto$EffectArtistStructV2$$com$ss$android$ugc$aweme$profile$model$EffectArtistDetail(EffectArtistStructV2 effectArtistStructV2, EffectArtistDetail effectArtistDetail) {
        if (effectArtistStructV2 == null) {
            return effectArtistDetail;
        }
        EffectArtistDetail effectArtistDetail2 = new EffectArtistDetail();
        effectArtistDetail2.total = BuiltInConvert.Integer2I(effectArtistStructV2.total, effectArtistDetail2.total);
        return effectArtistDetail2;
    }

    public static ExternalMusicInfo com$ss$ugc$aweme$proto$ExternalSongStructV2$$com$ss$android$ugc$aweme$music$model$ExternalMusicInfo(ExternalSongStructV2 externalSongStructV2, ExternalMusicInfo externalMusicInfo) {
        if (externalSongStructV2 == null) {
            return externalMusicInfo;
        }
        ExternalMusicInfo externalMusicInfo2 = new ExternalMusicInfo();
        externalMusicInfo2.jumpUrl = externalSongStructV2.h5_url;
        externalMusicInfo2.partnerName = externalSongStructV2.partner_name;
        externalMusicInfo2.partnerSongId = externalSongStructV2.partner_song_id;
        externalMusicInfo2.externalSongKey = externalSongStructV2.external_song_key;
        return externalMusicInfo2;
    }

    public static Extra com$ss$ugc$aweme$proto$ExtraStructV2$$com$ss$android$ugc$aweme$feed$model$Extra(ExtraStructV2 extraStructV2, Extra extra) {
        if (extraStructV2 == null) {
            return extra;
        }
        Extra extra2 = new Extra();
        extra2.now = BuiltInConvert.Long2J(extraStructV2.now, extra2.now);
        extra2.fatalItemIds = extraStructV2.fatal_item_ids;
        return extra2;
    }

    public static FollowerDetail com$ss$ugc$aweme$proto$FollowersDetailV2$$com$ss$android$ugc$aweme$profile$model$FollowerDetail(FollowersDetailV2 followersDetailV2, FollowerDetail followerDetail) {
        if (followersDetailV2 == null) {
            return followerDetail;
        }
        FollowerDetail followerDetail2 = new FollowerDetail();
        followerDetail2.name = followersDetailV2.name;
        followerDetail2.icon = followersDetailV2.icon;
        followerDetail2.fansCount = BuiltInConvert.Integer2I(followersDetailV2.fans_count, followerDetail2.fansCount);
        followerDetail2.openUrl = followersDetailV2.open_url;
        followerDetail2.appleId = followersDetailV2.apple_id;
        followerDetail2.downloadUrl = followersDetailV2.download_url;
        followerDetail2.packageName = followersDetailV2.package_name;
        followerDetail2.appName = followersDetailV2.app_name;
        return followerDetail2;
    }

    public static GameInfo com$ss$ugc$aweme$proto$GameStructV2$$com$ss$android$ugc$aweme$feed$model$GameInfo(GameStructV2 gameStructV2, GameInfo gameInfo) {
        if (gameStructV2 == null) {
            return gameInfo;
        }
        GameInfo gameInfo2 = new GameInfo();
        gameInfo2.gameType = BuiltInConvert.Integer2I(gameStructV2.game_type, gameInfo2.gameType);
        gameInfo2.gameScore = BuiltInConvert.Integer2I(gameStructV2.game_score, gameInfo2.gameScore);
        return gameInfo2;
    }

    public static HotSearchGuideWord com$ss$ugc$aweme$proto$GuideWordV2$$com$ss$android$ugc$aweme$feed$model$HotSearchGuideWord(GuideWordV2 guideWordV2, HotSearchGuideWord hotSearchGuideWord) {
        if (guideWordV2 == null) {
            return hotSearchGuideWord;
        }
        HotSearchGuideWord hotSearchGuideWord2 = new HotSearchGuideWord();
        hotSearchGuideWord2.displayWord = guideWordV2.word;
        hotSearchGuideWord2.searchWord = guideWordV2.search_word;
        hotSearchGuideWord2.type = BuiltInConvert.Integer2I(guideWordV2.type, hotSearchGuideWord2.type);
        return hotSearchGuideWord2;
    }

    public static HotSearchSprintStruct com$ss$ugc$aweme$proto$HotsearchSprintStructV2$$com$ss$android$ugc$aweme$profile$model$HotSearchSprintStruct(HotsearchSprintStructV2 hotsearchSprintStructV2, HotSearchSprintStruct hotSearchSprintStruct) {
        if (hotsearchSprintStructV2 == null) {
            return hotSearchSprintStruct;
        }
        HotSearchSprintStruct hotSearchSprintStruct2 = new HotSearchSprintStruct();
        hotSearchSprintStruct2.sprint = BuiltInConvert.Integer2I(hotsearchSprintStructV2.sprint, hotSearchSprintStruct2.sprint);
        hotSearchSprintStruct2.hitRankPeoples = List$com$ss$ugc$aweme$proto$SimpleUserStructV2$$List$com$ss$android$ugc$aweme$profile$model$User(hotsearchSprintStructV2.followers, hotSearchSprintStruct2.hitRankPeoples);
        return hotSearchSprintStruct2;
    }

    public static ChallengeTransform com$ss$ugc$aweme$proto$IconButtonStructV2$$com$ss$android$ugc$aweme$discover$model$ChallengeTransform(IconButtonStructV2 iconButtonStructV2, ChallengeTransform challengeTransform) {
        if (iconButtonStructV2 == null) {
            return challengeTransform;
        }
        ChallengeTransform challengeTransform2 = new ChallengeTransform();
        challengeTransform2.text = iconButtonStructV2.text;
        challengeTransform2.iconUrlModel = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(iconButtonStructV2.icon, challengeTransform2.iconUrlModel);
        challengeTransform2.action = iconButtonStructV2.action;
        return challengeTransform2;
    }

    public static ImageInfo com$ss$ugc$aweme$proto$ImageInfoStructV2$$com$ss$android$ugc$aweme$feed$model$ImageInfo(ImageInfoStructV2 imageInfoStructV2, ImageInfo imageInfo) {
        if (imageInfoStructV2 == null) {
            return imageInfo;
        }
        ImageInfo imageInfo2 = new ImageInfo();
        imageInfo2.height = BuiltInConvert.Integer2I(imageInfoStructV2.height, imageInfo2.height);
        imageInfo2.width = BuiltInConvert.Integer2I(imageInfoStructV2.width, imageInfo2.width);
        imageInfo2.labelLarge = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(imageInfoStructV2.label_large, imageInfo2.labelLarge);
        imageInfo2.labelThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(imageInfoStructV2.label_thumb, imageInfo2.labelThumb);
        return imageInfo2;
    }

    public static InteractStickerStruct com$ss$ugc$aweme$proto$InteractionStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$InteractStickerStruct(InteractionStickerStructV2 interactionStickerStructV2, InteractStickerStruct interactStickerStruct) {
        if (interactionStickerStructV2 == null) {
            return interactStickerStruct;
        }
        InteractStickerStruct interactStickerStruct2 = new InteractStickerStruct();
        interactStickerStruct2.type = BuiltInConvert.Integer2I(interactionStickerStructV2.type, interactStickerStruct2.type);
        interactStickerStruct2.index = BuiltInConvert.Integer2I(interactionStickerStructV2.index, interactStickerStruct2.index);
        interactStickerStruct2.poiStruct = com$ss$ugc$aweme$proto$PoiStructV2$$com$ss$android$ugc$aweme$sticker$data$PoiStruct(interactionStickerStructV2.poi_info, interactStickerStruct2.poiStruct);
        interactStickerStruct2.trackList = interactionStickerStructV2.track_info;
        interactStickerStruct2.attr = interactionStickerStructV2.attr;
        interactStickerStruct2.voteStruct = com$ss$ugc$aweme$proto$VoteStructV2$$com$ss$android$ugc$aweme$sticker$data$VoteStruct(interactionStickerStructV2.vote_info, interactStickerStruct2.voteStruct);
        return interactStickerStruct2;
    }

    public static ItemLikeEggData com$ss$ugc$aweme$proto$ItemLikeEggDataV2$$com$ss$android$ugc$aweme$feed$model$ItemLikeEggData(ItemLikeEggDataV2 itemLikeEggDataV2, ItemLikeEggData itemLikeEggData) {
        if (itemLikeEggDataV2 == null) {
            return itemLikeEggData;
        }
        ItemLikeEggData itemLikeEggData2 = new ItemLikeEggData();
        itemLikeEggData2.materialUrl = itemLikeEggDataV2.material_url;
        return itemLikeEggData2;
    }

    public static StoryBlockInfo com$ss$ugc$aweme$proto$LifeStoryBlockStructV2$$com$ss$android$ugc$aweme$profile$model$StoryBlockInfo(LifeStoryBlockStructV2 lifeStoryBlockStructV2, StoryBlockInfo storyBlockInfo) {
        if (lifeStoryBlockStructV2 == null) {
            return storyBlockInfo;
        }
        StoryBlockInfo storyBlockInfo2 = new StoryBlockInfo();
        storyBlockInfo2.isBlock = BuiltInConvert.Boolean2Z(lifeStoryBlockStructV2.life_story_block, storyBlockInfo2.isBlock);
        storyBlockInfo2.isBlocked = BuiltInConvert.Boolean2Z(lifeStoryBlockStructV2.life_story_blocked, storyBlockInfo2.isBlocked);
        return storyBlockInfo2;
    }

    public static HonorStruct com$ss$ugc$aweme$proto$LiveHonorStructV2$$com$ss$android$ugc$aweme$profile$model$HonorStruct(LiveHonorStructV2 liveHonorStructV2, HonorStruct honorStruct) {
        if (liveHonorStructV2 == null) {
            return honorStruct;
        }
        HonorStruct honorStruct2 = new HonorStruct();
        honorStruct2.level = BuiltInConvert.Integer2I(liveHonorStructV2.honor_level, honorStruct2.level);
        honorStruct2.score = BuiltInConvert.Long2J(liveHonorStructV2.honor_score, honorStruct2.score);
        return honorStruct2;
    }

    public static LogPbBean com$ss$ugc$aweme$proto$LogPbStructV2$$com$ss$android$ugc$aweme$feed$model$LogPbBean(LogPbStructV2 logPbStructV2, LogPbBean logPbBean) {
        if (logPbStructV2 == null) {
            return logPbBean;
        }
        LogPbBean logPbBean2 = new LogPbBean();
        logPbBean2.imprId = logPbStructV2.impr_id;
        return logPbBean2;
    }

    public static LongVideo com$ss$ugc$aweme$proto$LongVideoStructV2$$com$ss$android$ugc$aweme$feed$model$LongVideo(LongVideoStructV2 longVideoStructV2, LongVideo longVideo) {
        if (longVideoStructV2 == null) {
            return longVideo;
        }
        LongVideo longVideo2 = new LongVideo();
        longVideo2.video = com$ss$ugc$aweme$proto$VideoStructV2$$com$ss$android$ugc$aweme$feed$model$Video(longVideoStructV2.video, longVideo2.video);
        longVideo2.longVideoType = BuiltInConvert.Integer2I(longVideoStructV2.long_video_type, longVideo2.longVideoType);
        longVideo2.trailerStartTime = BuiltInConvert.Double2I(longVideoStructV2.trailer_start_time, longVideo2.trailerStartTime);
        longVideo2.videoControl = com$ss$ugc$aweme$proto$VideoControlV2$$com$ss$android$ugc$aweme$feed$model$VideoControl(longVideoStructV2.video_control, longVideo2.videoControl);
        return longVideo2;
    }

    public static h com$ss$ugc$aweme$proto$MicroAppCardStructV2$$com$ss$android$ugc$aweme$miniapp_api$model$MiniAppCard(MicroAppCardStructV2 microAppCardStructV2, h hVar) {
        if (microAppCardStructV2 == null) {
            return hVar;
        }
        h hVar2 = new h();
        hVar2.imageUrl = microAppCardStructV2.image_url;
        hVar2.text = microAppCardStructV2.text;
        hVar2.waitTime = BuiltInConvert.Integer2I(microAppCardStructV2.wait_time, hVar2.waitTime);
        return hVar2;
    }

    public static f com$ss$ugc$aweme$proto$MicroAppStructV2$$com$ss$android$ugc$aweme$miniapp_api$model$MicroAppInfo(MicroAppStructV2 microAppStructV2, f fVar) {
        if (microAppStructV2 == null) {
            return fVar;
        }
        f fVar2 = new f();
        fVar2.appId = microAppStructV2.app_id;
        fVar2.name = microAppStructV2.app_name;
        fVar2.icon = microAppStructV2.icon;
        fVar2.orientation = BuiltInConvert.Integer2I(microAppStructV2.orientation, fVar2.orientation);
        fVar2.schema = microAppStructV2.schema;
        fVar2.state = BuiltInConvert.Integer2I(microAppStructV2.state, fVar2.state);
        fVar2.summary = microAppStructV2.summary;
        fVar2.type = BuiltInConvert.Integer2I(microAppStructV2.type, fVar2.type);
        fVar2.desc = microAppStructV2.description;
        fVar2.title = microAppStructV2.title;
        fVar2.miniAppCard = com$ss$ugc$aweme$proto$MicroAppCardStructV2$$com$ss$android$ugc$aweme$miniapp_api$model$MiniAppCard(microAppStructV2.card, fVar2.miniAppCard);
        return fVar2;
    }

    public static Music com$ss$ugc$aweme$proto$MusicStructV2$$com$ss$android$ugc$aweme$music$model$Music(MusicStructV2 musicStructV2, Music music) {
        if (musicStructV2 == null) {
            return music;
        }
        Music music2 = new Music();
        music2.id = BuiltInConvert.Long2J(musicStructV2.id, music2.id);
        music2.mid = musicStructV2.id_str;
        music2.musicName = musicStructV2.title;
        music2.authorName = musicStructV2.author;
        music2.album = musicStructV2.album;
        music2.converHd = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(musicStructV2.cover_hd, music2.converHd);
        music2.coverLarge = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(musicStructV2.cover_large, music2.coverLarge);
        music2.coverMedium = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(musicStructV2.cover_medium, music2.coverMedium);
        music2.coverThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(musicStructV2.cover_thumb, music2.coverThumb);
        music2.playUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(musicStructV2.play_url, music2.playUrl);
        music2.schema = musicStructV2.schema_url;
        music2.source = BuiltInConvert.Integer2I(musicStructV2.source_platform, music2.source);
        music2.startTime = BuiltInConvert.Integer2I(musicStructV2.start_time, music2.startTime);
        music2.endTime = BuiltInConvert.Integer2I(musicStructV2.end_time, music2.endTime);
        music2.duration = BuiltInConvert.Integer2I(musicStructV2.duration, music2.duration);
        music2.extra = musicStructV2.extra;
        music2.userCount = BuiltInConvert.Integer2I(musicStructV2.user_count, music2.userCount);
        music2.positions = List$com$ss$ugc$aweme$proto$PositionStructV2$$List$com$ss$android$ugc$aweme$discover$model$Position(musicStructV2.position, music2.positions);
        music2.shareInfo = com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$base$share$ShareInfo(musicStructV2.share_info, music2.shareInfo);
        music2.collectStatus = BuiltInConvert.Integer2I(musicStructV2.collect_stat, music2.collectStatus);
        music2.musicStatus = BuiltInConvert.Integer2I(musicStructV2.status, music2.musicStatus);
        music2.offlineDesc = musicStructV2.offline_desc;
        music2.effectsData = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(musicStructV2.effects_data, music2.effectsData);
        music2.ownerId = musicStructV2.owner_id;
        music2.ownerNickName = musicStructV2.owner_nickname;
        music2.audioTrack = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(musicStructV2.audio_track, music2.audioTrack);
        music2.bodyDanceUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(musicStructV2.bodydance_url, music2.bodyDanceUrl);
        music2.bodyDanceChallenge = com$ss$ugc$aweme$proto$ChallengeStructV2$$com$ss$android$ugc$aweme$discover$model$Challenge(musicStructV2.bodydance_challenge, music2.bodyDanceChallenge);
        music2.isOriginMusic = BuiltInConvert.Boolean2Z(musicStructV2.is_original, music2.isOriginMusic);
        music2.challenge = com$ss$ugc$aweme$proto$ChallengeStructV2$$com$ss$android$ugc$aweme$discover$model$Challenge(musicStructV2.challenge, music2.challenge);
        music2.billboardRank = BuiltInConvert.Integer2I(musicStructV2.billboard_rank, music2.billboardRank);
        music2.redirect = BuiltInConvert.Boolean2Z(musicStructV2.redirect, music2.redirect);
        music2.isAuthorDeleted = BuiltInConvert.Boolean2Z(musicStructV2.author_deleted, music2.isAuthorDeleted);
        music2.ownerHandle = musicStructV2.owner_handle;
        music2.preventDownload = BuiltInConvert.Boolean2Z(musicStructV2.prevent_download, music2.preventDownload);
        music2.billboardType = BuiltInConvert.Integer2I(musicStructV2.music_billboard_type, music2.billboardType);
        music2.weeklyBillInfo = com$ss$ugc$aweme$proto$BranchBillboardWeeklyStructV2$$com$ss$android$ugc$aweme$hotsearch$model$BillboardWeeklyInfo(musicStructV2.music_billboard_weekly_info, music2.weeklyBillInfo);
        music2.categoryCover = com$ss$ugc$aweme$proto$CategoryCoverStructV2$$com$ss$android$ugc$aweme$discover$model$CategoryCoverStruct(musicStructV2.category_cover_info, music2.categoryCover);
        music2.strongBeatUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(musicStructV2.strong_beat_url, music2.strongBeatUrl);
        music2.mExternalMusicInfos = List$com$ss$ugc$aweme$proto$ExternalSongStructV2$$List$com$ss$android$ugc$aweme$music$model$ExternalMusicInfo(musicStructV2.external_song_info, music2.mExternalMusicInfos);
        music2.secUid = musicStructV2.sec_uid;
        music2.lrcType = BuiltInConvert.Integer2I(musicStructV2.lyric_type, music2.lrcType);
        music2.lrcUrl = musicStructV2.lyric_url;
        music2.avatarThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(musicStructV2.avatar_thumb, music2.avatarThumb);
        music2.previewStartTime = BuiltInConvert.Double2F(musicStructV2.preview_start_time, music2.previewStartTime);
        music2.clusterId = BuiltInConvert.Long2J(musicStructV2.cluster_id, music2.clusterId);
        return music2;
    }

    public static com.ss.android.ugc.aweme.sticker.model.d com$ss$ugc$aweme$proto$NewFaceStickerStructV2$$com$ss$android$ugc$aweme$sticker$model$NewFaceStickerBean(NewFaceStickerStructV2 newFaceStickerStructV2, com.ss.android.ugc.aweme.sticker.model.d dVar) {
        if (newFaceStickerStructV2 == null) {
            return dVar;
        }
        com.ss.android.ugc.aweme.sticker.model.d dVar2 = new com.ss.android.ugc.aweme.sticker.model.d();
        dVar2.id = newFaceStickerStructV2.id;
        dVar2.name = newFaceStickerStructV2.name;
        dVar2.children = newFaceStickerStructV2.children;
        dVar2.iconUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(newFaceStickerStructV2.icon_url, dVar2.iconUrl);
        dVar2.ownerId = newFaceStickerStructV2.owner_id;
        dVar2.ownerName = newFaceStickerStructV2.owner_nickname;
        dVar2.userCount = BuiltInConvert.Integer2J(newFaceStickerStructV2.user_count, dVar2.userCount);
        dVar2.desc = newFaceStickerStructV2.desc;
        dVar2.shareInfo = com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$base$share$ShareInfo(newFaceStickerStructV2.share_info, dVar2.shareInfo);
        dVar2.isFavorite = BuiltInConvert.Boolean2Z(newFaceStickerStructV2.is_favorite, dVar2.isFavorite);
        dVar2.commerceSticker = com$ss$ugc$aweme$proto$CommerceStickerStructV2$$com$ss$android$ugc$aweme$sticker$model$CommerceSticker(newFaceStickerStructV2.commerce_sticker, dVar2.commerceSticker);
        dVar2.mTags = newFaceStickerStructV2.tags;
        dVar2.avatarThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(newFaceStickerStructV2.avatar_thumb, dVar2.avatarThumb);
        dVar2.viewCount = BuiltInConvert.Long2J(newFaceStickerStructV2.vv_count, dVar2.viewCount);
        dVar2.extra = newFaceStickerStructV2.extra;
        return dVar2;
    }

    public static d com$ss$ugc$aweme$proto$OfflineInfoStructV2$$com$ss$android$ugc$aweme$commerce$OfflineInfo(OfflineInfoStructV2 offlineInfoStructV2, d dVar) {
        if (offlineInfoStructV2 == null) {
            return dVar;
        }
        d dVar2 = new d();
        dVar2.offlineInfoType = BuiltInConvert.Integer2I(offlineInfoStructV2.offline_info_type, dVar2.offlineInfoType);
        dVar2.text = offlineInfoStructV2.text;
        dVar2.action = offlineInfoStructV2.action;
        return dVar2;
    }

    public static com.ss.android.ugc.aweme.opensdk.a.a com$ss$ugc$aweme$proto$OpenPlatformStructV2$$com$ss$android$ugc$aweme$opensdk$model$OpenPlatformStruct(OpenPlatformStructV2 openPlatformStructV2, com.ss.android.ugc.aweme.opensdk.a.a aVar) {
        if (openPlatformStructV2 == null) {
            return aVar;
        }
        com.ss.android.ugc.aweme.opensdk.a.a aVar2 = new com.ss.android.ugc.aweme.opensdk.a.a();
        aVar2.name = openPlatformStructV2.name;
        aVar2.icon = openPlatformStructV2.icon;
        aVar2.link = openPlatformStructV2.link;
        return aVar2;
    }

    public static com.ss.android.ugc.aweme.music.h com$ss$ugc$aweme$proto$OriginalMusicianStructV2$$com$ss$android$ugc$aweme$music$OriginalMusician(OriginalMusicianStructV2 originalMusicianStructV2, com.ss.android.ugc.aweme.music.h hVar) {
        if (originalMusicianStructV2 == null) {
            return hVar;
        }
        com.ss.android.ugc.aweme.music.h hVar2 = new com.ss.android.ugc.aweme.music.h();
        hVar2.musicCount = BuiltInConvert.Integer2I(originalMusicianStructV2.music_count, hVar2.musicCount);
        hVar2.musicUseCount = BuiltInConvert.Integer2I(originalMusicianStructV2.music_used_count, hVar2.musicUseCount);
        hVar2.musicQrcodeUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(originalMusicianStructV2.music_qrcode_url, hVar2.musicQrcodeUrl);
        hVar2.musicCoverUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(originalMusicianStructV2.music_cover_url, hVar2.musicCoverUrl);
        hVar2.diggCount = BuiltInConvert.Integer2I(originalMusicianStructV2.digg_count, hVar2.diggCount);
        return hVar2;
    }

    public static GeneralPermission com$ss$ugc$aweme$proto$PermissionStructV2$$com$ss$android$ugc$aweme$profile$model$GeneralPermission(PermissionStructV2 permissionStructV2, GeneralPermission generalPermission) {
        if (permissionStructV2 == null) {
            return generalPermission;
        }
        GeneralPermission generalPermission2 = new GeneralPermission();
        generalPermission2.mFollowToast = BuiltInConvert.Integer2I(permissionStructV2.follow_toast, generalPermission2.mFollowToast);
        generalPermission2.mOriginalList = BuiltInConvert.Integer2I(permissionStructV2.original_list, generalPermission2.mOriginalList);
        generalPermission2.mShopToast = BuiltInConvert.Integer2I(permissionStructV2.shop_toast, generalPermission2.mShopToast);
        generalPermission2.mShareToast = BuiltInConvert.Integer2I(permissionStructV2.share_toast, generalPermission2.mShareToast);
        return generalPermission2;
    }

    public static PlatformInfo com$ss$ugc$aweme$proto$PlatformSyncStatusStructV2$$com$ss$android$ugc$aweme$profile$model$PlatformInfo(PlatformSyncStatusStructV2 platformSyncStatusStructV2, PlatformInfo platformInfo) {
        if (platformSyncStatusStructV2 == null) {
            return platformInfo;
        }
        PlatformInfo platformInfo2 = new PlatformInfo();
        platformInfo2.patformName = platformSyncStatusStructV2.platform_name;
        platformInfo2.nickName = platformSyncStatusStructV2.nickname;
        platformInfo2.fullSynced = BuiltInConvert.Boolean2Z(platformSyncStatusStructV2.full_synced, platformInfo2.fullSynced);
        return platformInfo2;
    }

    public static k com$ss$ugc$aweme$proto$PoiBackendTypeStructV2$$com$ss$android$ugc$aweme$poi$model$PoiBackendType(PoiBackendTypeStructV2 poiBackendTypeStructV2, k kVar) {
        if (poiBackendTypeStructV2 == null) {
            return kVar;
        }
        k kVar2 = new k();
        kVar2.code = poiBackendTypeStructV2.code;
        kVar2.name = poiBackendTypeStructV2.name;
        return kVar2;
    }

    public static m com$ss$ugc$aweme$proto$PoiCardStructV2$$com$ss$android$ugc$aweme$poi$model$PoiCardStruct(PoiCardStructV2 poiCardStructV2, m mVar) {
        if (poiCardStructV2 == null) {
            return mVar;
        }
        m mVar2 = new m();
        mVar2.isShow = BuiltInConvert.Integer2I(poiCardStructV2.is_show, mVar2.isShow);
        mVar2.url = poiCardStructV2.url;
        return mVar2;
    }

    public static PoiCardStruct com$ss$ugc$aweme$proto$PoiCardStructV2$$com$ss$android$ugc$aweme$sticker$data$PoiCardStruct(PoiCardStructV2 poiCardStructV2, PoiCardStruct poiCardStruct) {
        if (poiCardStructV2 == null) {
            return poiCardStruct;
        }
        PoiCardStruct poiCardStruct2 = new PoiCardStruct();
        poiCardStruct2.isShow = poiCardStructV2.is_show;
        poiCardStruct2.url = poiCardStructV2.url;
        return poiCardStruct2;
    }

    public static PoiStruct com$ss$ugc$aweme$proto$PoiStructV2$$com$ss$android$ugc$aweme$poi$model$PoiStruct(PoiStructV2 poiStructV2, PoiStruct poiStruct) {
        if (poiStructV2 == null) {
            return poiStruct;
        }
        PoiStruct poiStruct2 = new PoiStruct();
        poiStruct2.poiId = poiStructV2.poi_id;
        poiStruct2.poiName = poiStructV2.poi_name;
        poiStruct2.typeCode = poiStructV2.type_code;
        poiStruct2.userCount = BuiltInConvert.Integer2I(poiStructV2.user_count, poiStruct2.userCount);
        poiStruct2.itemCount = BuiltInConvert.Integer2I(poiStructV2.item_count, poiStruct2.itemCount);
        poiStruct2.shareInfo = com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$base$share$ShareInfo(poiStructV2.share_info, poiStruct2.shareInfo);
        poiStruct2.coverHd = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(poiStructV2.cover_hd, poiStruct2.coverHd);
        poiStruct2.coverLarge = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(poiStructV2.cover_large, poiStruct2.coverLarge);
        poiStruct2.coverMedium = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(poiStructV2.cover_medium, poiStruct2.coverMedium);
        poiStruct2.coverThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(poiStructV2.cover_thumb, poiStruct2.coverThumb);
        poiStruct2.distance = poiStructV2.distance;
        poiStruct2.address = com$ss$ugc$aweme$proto$AddressStructV2$$com$ss$android$ugc$aweme$poi$model$Address(poiStructV2.address_info, poiStruct2.address);
        poiStruct2.iconType = BuiltInConvert.Integer2I(poiStructV2.icon_type, poiStruct2.iconType);
        poiStruct2.collectStatus = BuiltInConvert.Integer2I(poiStructV2.collect_stat, poiStruct2.collectStatus);
        poiStruct2.poiLongitude = BuiltInConvert.Number2String(poiStructV2.poi_longitude, poiStruct2.poiLongitude);
        poiStruct2.poiLatitude = BuiltInConvert.Number2String(poiStructV2.poi_latitude, poiStruct2.poiLatitude);
        poiStruct2.expandType = BuiltInConvert.Integer2J(poiStructV2.expand_type, poiStruct2.expandType);
        poiStruct2.iconOnMap = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(poiStructV2.icon_on_map, poiStruct2.iconOnMap);
        poiStruct2.iconOnEntry = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(poiStructV2.icon_on_entry, poiStruct2.iconOnEntry);
        poiStruct2.iconOnInfo = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(poiStructV2.icon_on_info, poiStruct2.iconOnInfo);
        poiStruct2.poiType = BuiltInConvert.Integer2J(poiStructV2.poi_type, poiStruct2.poiType);
        poiStruct2.poiVoucher = poiStructV2.poi_voucher;
        poiStruct2.poiRating = BuiltInConvert.Double2D(poiStructV2.rating, poiStruct2.poiRating);
        poiStruct2.poiCost = BuiltInConvert.Double2D(poiStructV2.cost, poiStruct2.poiCost);
        poiStruct2.poiRankDesc = poiStructV2.poi_rank_desc;
        poiStruct2.poiBusinessAreaName = poiStructV2.business_area_name;
        poiStruct2.poiIsLocalCity = BuiltInConvert.Boolean2Z(poiStructV2.is_local_city, poiStruct2.poiIsLocalCity);
        poiStruct2.poiOptionName = poiStructV2.option_name;
        poiStruct2.poiSubTitle = poiStructV2.poi_subtitle;
        poiStruct2.isCandidate = BuiltInConvert.Boolean2Z(poiStructV2.is_candidate, poiStruct2.isCandidate);
        poiStruct2.poiCard = com$ss$ugc$aweme$proto$PoiCardStructV2$$com$ss$android$ugc$aweme$poi$model$PoiCardStruct(poiStructV2.poi_card, poiStruct2.poiCard);
        poiStruct2.poiSubTitleType = BuiltInConvert.Integer2I(poiStructV2.poi_subtitle_type, poiStruct2.poiSubTitleType);
        poiStruct2.voucherReleaseAreas = poiStructV2.voucher_release_areas;
        poiStruct2.showHalfCard = BuiltInConvert.Integer2I(poiStructV2.is_show_halfcard, poiStruct2.showHalfCard);
        poiStruct2.poiBackendType = com$ss$ugc$aweme$proto$PoiBackendTypeStructV2$$com$ss$android$ugc$aweme$poi$model$PoiBackendType(poiStructV2.poi_backend_type, poiStruct2.poiBackendType);
        poiStruct2.coverItem = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(poiStructV2.cover_item, poiStruct2.coverItem);
        poiStruct2.isTopRecommend = BuiltInConvert.Boolean2Z(poiStructV2.is_top_recommend, poiStruct2.isTopRecommend);
        poiStruct2.isAdminArea = BuiltInConvert.Boolean2Z(poiStructV2.is_admin_area, poiStruct2.isAdminArea);
        return poiStruct2;
    }

    public static com.ss.android.ugc.aweme.sticker.data.PoiStruct com$ss$ugc$aweme$proto$PoiStructV2$$com$ss$android$ugc$aweme$sticker$data$PoiStruct(PoiStructV2 poiStructV2, com.ss.android.ugc.aweme.sticker.data.PoiStruct poiStruct) {
        if (poiStructV2 == null) {
            return poiStruct;
        }
        com.ss.android.ugc.aweme.sticker.data.PoiStruct poiStruct2 = new com.ss.android.ugc.aweme.sticker.data.PoiStruct();
        poiStruct2.poiId = poiStructV2.poi_id;
        poiStruct2.poiName = poiStructV2.poi_name;
        poiStruct2.typeCode = poiStructV2.type_code;
        poiStruct2.userCount = poiStructV2.user_count;
        poiStruct2.itemCount = poiStructV2.item_count;
        poiStruct2.shareInfo = com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$base$share$ShareInfo(poiStructV2.share_info, poiStruct2.shareInfo);
        poiStruct2.coverHd = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(poiStructV2.cover_hd, poiStruct2.coverHd);
        poiStruct2.coverLarge = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(poiStructV2.cover_large, poiStruct2.coverLarge);
        poiStruct2.coverMedium = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(poiStructV2.cover_medium, poiStruct2.coverMedium);
        poiStruct2.coverThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(poiStructV2.cover_thumb, poiStruct2.coverThumb);
        poiStruct2.distance = poiStructV2.distance;
        poiStruct2.address = com$ss$ugc$aweme$proto$AddressStructV2$$com$ss$android$ugc$aweme$sticker$data$Address(poiStructV2.address_info, poiStruct2.address);
        poiStruct2.iconType = poiStructV2.icon_type;
        poiStruct2.collectStatus = poiStructV2.collect_stat;
        poiStruct2.poiLongitude = BuiltInConvert.Number2String(poiStructV2.poi_longitude, poiStruct2.poiLongitude);
        poiStruct2.poiLatitude = BuiltInConvert.Number2String(poiStructV2.poi_latitude, poiStruct2.poiLatitude);
        poiStruct2.expandType = BuiltInConvert.Integer2Long(poiStructV2.expand_type, poiStruct2.expandType);
        poiStruct2.iconOnMap = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(poiStructV2.icon_on_map, poiStruct2.iconOnMap);
        poiStruct2.iconOnEntry = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(poiStructV2.icon_on_entry, poiStruct2.iconOnEntry);
        poiStruct2.iconOnInfo = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(poiStructV2.icon_on_info, poiStruct2.iconOnInfo);
        poiStruct2.poiType = BuiltInConvert.Integer2Long(poiStructV2.poi_type, poiStruct2.poiType);
        poiStruct2.poiVoucher = poiStructV2.poi_voucher;
        poiStruct2.poiRating = poiStructV2.rating;
        poiStruct2.poiCost = poiStructV2.cost;
        poiStruct2.poiRankDesc = poiStructV2.poi_rank_desc;
        poiStruct2.poiBusinessAreaName = poiStructV2.business_area_name;
        poiStruct2.poiIsLocalCity = poiStructV2.is_local_city;
        poiStruct2.poiOptionName = poiStructV2.option_name;
        poiStruct2.poiSubTitle = poiStructV2.poi_subtitle;
        poiStruct2.isCandidate = poiStructV2.is_candidate;
        poiStruct2.poiCard = com$ss$ugc$aweme$proto$PoiCardStructV2$$com$ss$android$ugc$aweme$sticker$data$PoiCardStruct(poiStructV2.poi_card, poiStruct2.poiCard);
        poiStruct2.poiSubTitleType = poiStructV2.poi_subtitle_type;
        poiStruct2.voucherReleaseAreas = poiStructV2.voucher_release_areas;
        poiStruct2.coverItem = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(poiStructV2.cover_item, poiStruct2.coverItem);
        return poiStruct2;
    }

    public static Position com$ss$ugc$aweme$proto$PositionStructV2$$com$ss$android$ugc$aweme$discover$model$Position(PositionStructV2 positionStructV2, Position position) {
        if (positionStructV2 == null) {
            return position;
        }
        Position position2 = new Position();
        position2.begin = BuiltInConvert.Integer2I(positionStructV2.begin, position2.begin);
        position2.end = BuiltInConvert.Integer2I(positionStructV2.end, position2.end);
        return position2;
    }

    public static Preload com$ss$ugc$aweme$proto$PreloadStructV2$$com$ss$android$ugc$aweme$feed$model$Preload(PreloadStructV2 preloadStructV2, Preload preload) {
        if (preloadStructV2 == null) {
            return preload;
        }
        Preload preload2 = new Preload();
        preload2.commentPreload = BuiltInConvert.Integer2I(preloadStructV2.comment, preload2.commentPreload);
        preload2.profilePreload = BuiltInConvert.Integer2I(preloadStructV2.profile, preload2.profilePreload);
        preload2.commentPro = BuiltInConvert.Double2D(preloadStructV2.comment_pro, preload2.commentPro);
        preload2.profilePro = BuiltInConvert.Double2D(preloadStructV2.profile_pro, preload2.profilePro);
        preload2.commentThres = BuiltInConvert.Double2D(preloadStructV2.comment_thres, preload2.commentThres);
        preload2.profileThres = BuiltInConvert.Double2D(preloadStructV2.profile_thres, preload2.profileThres);
        preload2.commentMedianTime = BuiltInConvert.Double2J(preloadStructV2.comment_median_time, preload2.commentMedianTime);
        preload2.profileMedianTime = BuiltInConvert.Double2J(preloadStructV2.profile_median_time, preload2.profileMedianTime);
        preload2.modelV2 = BuiltInConvert.Integer2I(preloadStructV2.model_v2, preload2.modelV2);
        return preload2;
    }

    public static QuickShopSecondFloorInfo com$ss$ugc$aweme$proto$QuickShopSecondFloorV2$$com$ss$android$ugc$aweme$profile$model$QuickShopSecondFloorInfo(QuickShopSecondFloorV2 quickShopSecondFloorV2, QuickShopSecondFloorInfo quickShopSecondFloorInfo) {
        if (quickShopSecondFloorV2 == null) {
            return quickShopSecondFloorInfo;
        }
        QuickShopSecondFloorInfo quickShopSecondFloorInfo2 = new QuickShopSecondFloorInfo();
        quickShopSecondFloorInfo2.processText = quickShopSecondFloorV2.process_text;
        quickShopSecondFloorInfo2.enterText = quickShopSecondFloorV2.enter_text;
        quickShopSecondFloorInfo2.transBgText = quickShopSecondFloorV2.trans_bg_text;
        return quickShopSecondFloorInfo2;
    }

    public static QuickShopInfo com$ss$ugc$aweme$proto$QuickShopStructV2$$com$ss$android$ugc$aweme$profile$model$QuickShopInfo(QuickShopStructV2 quickShopStructV2, QuickShopInfo quickShopInfo) {
        if (quickShopStructV2 == null) {
            return quickShopInfo;
        }
        QuickShopInfo quickShopInfo2 = new QuickShopInfo();
        quickShopInfo2.quickShopUrl = quickShopStructV2.quick_shop_url;
        quickShopInfo2.quickShopName = quickShopStructV2.quick_shop_name;
        quickShopInfo2.withTextEntry = BuiltInConvert.Boolean2Z(quickShopStructV2.with_text_entry, quickShopInfo2.withTextEntry);
        quickShopInfo2.secondFloorInfo = com$ss$ugc$aweme$proto$QuickShopSecondFloorV2$$com$ss$android$ugc$aweme$profile$model$QuickShopSecondFloorInfo(quickShopStructV2.second_floor_info, quickShopInfo2.secondFloorInfo);
        return quickShopInfo2;
    }

    public static RocketFansGroupInfo com$ss$ugc$aweme$proto$RFansGroupInfoV2$$com$ss$android$ugc$aweme$base$share$RocketFansGroupInfo(RFansGroupInfoV2 rFansGroupInfoV2, RocketFansGroupInfo rocketFansGroupInfo) {
        if (rFansGroupInfoV2 == null) {
            return rocketFansGroupInfo;
        }
        RocketFansGroupInfo rocketFansGroupInfo2 = new RocketFansGroupInfo();
        rocketFansGroupInfo2.schema = rFansGroupInfoV2.schema;
        rocketFansGroupInfo2.token = rFansGroupInfoV2.token;
        rocketFansGroupInfo2.downloadUrl = rFansGroupInfoV2.download_url;
        return rocketFansGroupInfo2;
    }

    public static RecommendAwemeItem com$ss$ugc$aweme$proto$RecommendItemStructV2$$com$ss$android$ugc$aweme$profile$model$RecommendAwemeItem(RecommendItemStructV2 recommendItemStructV2, RecommendAwemeItem recommendAwemeItem) {
        if (recommendItemStructV2 == null) {
            return recommendAwemeItem;
        }
        RecommendAwemeItem recommendAwemeItem2 = new RecommendAwemeItem();
        recommendAwemeItem2.aid = recommendItemStructV2.aweme_id;
        recommendAwemeItem2.cover = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(recommendItemStructV2.cover, recommendAwemeItem2.cover);
        recommendAwemeItem2.dynamicCover = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(recommendItemStructV2.dynamic_cover, recommendAwemeItem2.dynamicCover);
        recommendAwemeItem2.mediaType = BuiltInConvert.Number2String(recommendItemStructV2.media_type, recommendAwemeItem2.mediaType);
        return recommendAwemeItem2;
    }

    public static RelationDynamicLabel com$ss$ugc$aweme$proto$RelationDynamicLableStructV2$$com$ss$android$ugc$aweme$feed$model$RelationDynamicLabel(RelationDynamicLableStructV2 relationDynamicLableStructV2, RelationDynamicLabel relationDynamicLabel) {
        if (relationDynamicLableStructV2 == null) {
            return relationDynamicLabel;
        }
        RelationDynamicLabel relationDynamicLabel2 = new RelationDynamicLabel();
        relationDynamicLabel2.nickname = relationDynamicLableStructV2.nickname;
        relationDynamicLabel2.labelInfo = relationDynamicLableStructV2.label_info;
        relationDynamicLabel2.count = BuiltInConvert.Integer2I(relationDynamicLableStructV2.count, relationDynamicLabel2.count);
        relationDynamicLabel2.userId = relationDynamicLableStructV2.user_id;
        relationDynamicLabel2.type = BuiltInConvert.Integer2I(relationDynamicLableStructV2.type, relationDynamicLabel2.type);
        return relationDynamicLabel2;
    }

    public static RelativeUserInfo com$ss$ugc$aweme$proto$RelativeUserStructV2$$com$ss$android$ugc$aweme$profile$model$RelativeUserInfo(RelativeUserStructV2 relativeUserStructV2, RelativeUserInfo relativeUserInfo) {
        if (relativeUserStructV2 == null) {
            return relativeUserInfo;
        }
        RelativeUserInfo relativeUserInfo2 = new RelativeUserInfo();
        relativeUserInfo2.uid = BuiltInConvert.Number2String(relativeUserStructV2.uid, relativeUserInfo2.uid);
        relativeUserInfo2.avatar = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(relativeUserStructV2.avatar, relativeUserInfo2.avatar);
        return relativeUserInfo2;
    }

    public static ShareInfo com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$base$share$ShareInfo(ShareStructV2 shareStructV2, ShareInfo shareInfo) {
        if (shareStructV2 == null) {
            return shareInfo;
        }
        ShareInfo shareInfo2 = new ShareInfo();
        shareInfo2.shareUrl = shareStructV2.share_url;
        shareInfo2.shareWeiboDesc = shareStructV2.share_weibo_desc;
        shareInfo2.shareDesc = shareStructV2.share_desc;
        shareInfo2.shareTitle = shareStructV2.share_title;
        shareInfo2.qrCodeUrls = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(shareStructV2.share_qrcode_url, shareInfo2.qrCodeUrls);
        shareInfo2.goodsManagerUrl = shareStructV2.manage_goods_url;
        shareInfo2.imageUrls = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(shareStructV2.share_image_url, shareInfo2.imageUrls);
        shareInfo2.boolPersist = BuiltInConvert.Integer2I(shareStructV2.bool_persist, shareInfo2.boolPersist);
        shareInfo2.goodsRecUrl = shareStructV2.goods_rec_url;
        shareInfo2.shareTitleMyself = shareStructV2.share_title_myself;
        shareInfo2.shareTitleOther = shareStructV2.share_title_other;
        shareInfo2.shareLinkDesc = shareStructV2.share_link_desc;
        shareInfo2.shareSignatureUrl = shareStructV2.share_signature_url;
        shareInfo2.shareSignatureDesc = shareStructV2.share_signature_desc;
        shareInfo2.shareQuote = shareStructV2.share_quote;
        shareInfo2.whatsappShareDesc = shareStructV2.whatsapp_desc;
        return shareInfo2;
    }

    public static User com$ss$ugc$aweme$proto$SimpleUserStructV2$$com$ss$android$ugc$aweme$profile$model$User(SimpleUserStructV2 simpleUserStructV2, User user) {
        if (simpleUserStructV2 == null) {
            return user;
        }
        User user2 = new User();
        user2.uid = simpleUserStructV2.uid;
        user2.nickname = simpleUserStructV2.nickname;
        user2.signature = simpleUserStructV2.signature;
        user2.avatarThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(simpleUserStructV2.avatar_thumb, user2.avatarThumb);
        user2.followStatus = BuiltInConvert.Integer2I(simpleUserStructV2.follow_status, user2.followStatus);
        user2.avatarLarger = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(simpleUserStructV2.avatar_larger, user2.avatarLarger);
        user2.uniqueId = simpleUserStructV2.unique_id;
        user2.secUid = simpleUserStructV2.sec_uid;
        return user2;
    }

    public static com.ss.android.ugc.aweme.commerce.e com$ss$ugc$aweme$proto$SmartPhoneSettingsStructV2$$com$ss$android$ugc$aweme$commerce$SmartPhone(SmartPhoneSettingsStructV2 smartPhoneSettingsStructV2, com.ss.android.ugc.aweme.commerce.e eVar) {
        if (smartPhoneSettingsStructV2 == null) {
            return eVar;
        }
        com.ss.android.ugc.aweme.commerce.e eVar2 = new com.ss.android.ugc.aweme.commerce.e();
        eVar2.phoneNumber = smartPhoneSettingsStructV2.phone_number;
        eVar2.phoneId = smartPhoneSettingsStructV2.phone_id;
        eVar2.encryptKey = smartPhoneSettingsStructV2.encrypt_key;
        return eVar2;
    }

    public static SpecialSticker com$ss$ugc$aweme$proto$SpecialStickerStructV2$$com$ss$android$ugc$aweme$feed$model$SpecialSticker(SpecialStickerStructV2 specialStickerStructV2, SpecialSticker specialSticker) {
        if (specialStickerStructV2 == null) {
            return specialSticker;
        }
        SpecialSticker specialSticker2 = new SpecialSticker();
        specialSticker2.stickerType = BuiltInConvert.Integer2I(specialStickerStructV2.sticker_type, specialSticker2.stickerType);
        specialSticker2.linkUrl = specialStickerStructV2.link;
        specialSticker2.title = specialStickerStructV2.title;
        specialSticker2.stickerId = specialStickerStructV2.sticker_id;
        specialSticker2.iconUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(specialStickerStructV2.icon_url, specialSticker2.iconUrl);
        specialSticker2.openUrl = specialStickerStructV2.open_url;
        return specialSticker2;
    }

    public static TextExtraStruct com$ss$ugc$aweme$proto$TextExtraStructV2$$com$ss$android$ugc$aweme$model$TextExtraStruct(TextExtraStructV2 textExtraStructV2, TextExtraStruct textExtraStruct) {
        if (textExtraStructV2 == null) {
            return textExtraStruct;
        }
        TextExtraStruct textExtraStruct2 = new TextExtraStruct();
        textExtraStruct2.start = BuiltInConvert.Integer2I(textExtraStructV2.start, textExtraStruct2.start);
        textExtraStruct2.end = BuiltInConvert.Integer2I(textExtraStructV2.end, textExtraStruct2.end);
        textExtraStruct2.userId = textExtraStructV2.user_id;
        textExtraStruct2.type = BuiltInConvert.Integer2I(textExtraStructV2.type, textExtraStruct2.type);
        textExtraStruct2.hashTagName = textExtraStructV2.hashtag_name;
        textExtraStruct2.cid = textExtraStructV2.hashtag_id;
        textExtraStruct2.isCommerce = BuiltInConvert.Boolean2Z(textExtraStructV2.is_commerce, textExtraStruct2.isCommerce);
        textExtraStruct2.mSecUid = textExtraStructV2.sec_uid;
        textExtraStruct2.awemeId = textExtraStructV2.aweme_id;
        return textExtraStruct2;
    }

    public static UrlModel com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(UrlStructV2 urlStructV2, UrlModel urlModel) {
        if (urlStructV2 == null) {
            return urlModel;
        }
        UrlModel urlModel2 = new UrlModel();
        urlModel2.uri = urlStructV2.uri;
        urlModel2.urlList = urlStructV2.url_list;
        urlModel2.width = BuiltInConvert.Integer2I(urlStructV2.width, urlModel2.width);
        urlModel2.height = BuiltInConvert.Integer2I(urlStructV2.height, urlModel2.height);
        urlModel2.urlKey = urlStructV2.url_key;
        urlModel2.size = BuiltInConvert.Long2J(urlStructV2.data_size, urlModel2.size);
        urlModel2.fileHash = urlStructV2.file_hash;
        return urlModel2;
    }

    public static VideoUrlModel com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$feed$model$VideoUrlModel(UrlStructV2 urlStructV2, VideoUrlModel videoUrlModel) {
        if (urlStructV2 == null) {
            return videoUrlModel;
        }
        VideoUrlModel videoUrlModel2 = new VideoUrlModel();
        videoUrlModel2.uri = urlStructV2.uri;
        videoUrlModel2.urlList = urlStructV2.url_list;
        videoUrlModel2.width = BuiltInConvert.Integer2I(urlStructV2.width, videoUrlModel2.width);
        videoUrlModel2.height = BuiltInConvert.Integer2I(urlStructV2.height, videoUrlModel2.height);
        videoUrlModel2.urlKey = urlStructV2.url_key;
        videoUrlModel2.size = BuiltInConvert.Long2J(urlStructV2.data_size, videoUrlModel2.size);
        videoUrlModel2.fileHash = urlStructV2.file_hash;
        return videoUrlModel2;
    }

    public static User com$ss$ugc$aweme$proto$UserStructV2$$com$ss$android$ugc$aweme$profile$model$User(UserStructV2 userStructV2, User user) {
        if (userStructV2 == null) {
            return user;
        }
        User user2 = new User();
        user2.uid = userStructV2.uid;
        user2.shortId = userStructV2.short_id;
        user2.nickname = userStructV2.nickname;
        user2.gender = BuiltInConvert.Integer2I(userStructV2.gender, user2.gender);
        user2.signature = userStructV2.signature;
        user2.avatarLarger = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(userStructV2.avatar_larger, user2.avatarLarger);
        user2.avatarThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(userStructV2.avatar_thumb, user2.avatarThumb);
        user2.avatarMedium = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(userStructV2.avatar_medium, user2.avatarMedium);
        user2.birthday = userStructV2.birthday;
        user2.followStatus = BuiltInConvert.Integer2I(userStructV2.follow_status, user2.followStatus);
        user2.awemeCount = BuiltInConvert.Integer2I(userStructV2.aweme_count, user2.awemeCount);
        user2.followingCount = BuiltInConvert.Integer2I(userStructV2.following_count, user2.followingCount);
        user2.followerCount = BuiltInConvert.Integer2I(userStructV2.follower_count, user2.followerCount);
        user2.favoritingCount = BuiltInConvert.Integer2I(userStructV2.favoriting_count, user2.favoritingCount);
        user2.totalFavorited = BuiltInConvert.Integer2I(userStructV2.total_favorited, user2.totalFavorited);
        user2.isBlock = BuiltInConvert.Boolean2Z(userStructV2.is_block, user2.isBlock);
        user2.thirdName = userStructV2.third_name;
        user2.hideSearch = BuiltInConvert.Boolean2Z(userStructV2.hide_search, user2.hideSearch);
        user2.constellation = BuiltInConvert.Integer2I(userStructV2.constellation, user2.constellation);
        user2.city = userStructV2.location;
        user2.hideCity = BuiltInConvert.Boolean2Z(userStructV2.hide_location, user2.hideCity);
        user2.weiboVerify = userStructV2.weibo_verify;
        user2.customVerify = userStructV2.custom_verify;
        user2.uniqueId = userStructV2.unique_id;
        user2.bindPhone = userStructV2.bind_phone;
        user2.needRecommend = BuiltInConvert.Integer2Z(userStructV2.need_recommend, user2.needRecommend);
        user2.isBindedWeibo = BuiltInConvert.Boolean2Z(userStructV2.is_binded_weibo, user2.isBindedWeibo);
        user2.weiboNickname = userStructV2.weibo_name;
        user2.weiboSchema = userStructV2.weibo_schema;
        user2.weiboUrl = userStructV2.weibo_url;
        user2.storyOpen = BuiltInConvert.Boolean2Z(userStructV2.story_open, user2.storyOpen);
        user2.storyCount = BuiltInConvert.Integer2I(userStructV2.story_count, user2.storyCount);
        user2.recommendReason = userStructV2.recommend_reason;
        user2.hasFacebookToken = BuiltInConvert.Boolean2Z(userStructV2.has_facebook_token, user2.hasFacebookToken);
        user2.hasTwitterToken = BuiltInConvert.Boolean2Z(userStructV2.has_twitter_token, user2.hasTwitterToken);
        user2.fbExpireTime = BuiltInConvert.Integer2J(userStructV2.fb_expire_time, user2.fbExpireTime);
        user2.twExpireTime = BuiltInConvert.Integer2J(userStructV2.tw_expire_time, user2.twExpireTime);
        user2.hasYoutubeToken = BuiltInConvert.Boolean2Z(userStructV2.has_youtube_token, user2.hasYoutubeToken);
        user2.youtubeExpireTime = BuiltInConvert.Integer2J(userStructV2.youtube_expire_time, user2.youtubeExpireTime);
        user2.roomId = BuiltInConvert.Long2J(userStructV2.room_id, user2.roomId);
        user2.verifyStatus = BuiltInConvert.Integer2I(userStructV2.live_verify, user2.verifyStatus);
        user2.authorityStatus = BuiltInConvert.Long2J(userStructV2.authority_status, user2.authorityStatus);
        user2.verifyInfo = userStructV2.verify_info;
        user2.shieldFollowNotice = BuiltInConvert.Integer2I(userStructV2.shield_follow_notice, user2.shieldFollowNotice);
        user2.shieldDiggNotice = BuiltInConvert.Integer2I(userStructV2.shield_digg_notice, user2.shieldDiggNotice);
        user2.shieldCommentNotice = BuiltInConvert.Integer2I(userStructV2.shield_comment_notice, user2.shieldCommentNotice);
        user2.schoolName = userStructV2.school_name;
        user2.schoolPoiId = userStructV2.school_poi_id;
        user2.schoolType = BuiltInConvert.Integer2I(userStructV2.school_type, user2.schoolType);
        user2.shareInfo = com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$base$share$ShareInfo(userStructV2.share_info, user2.shareInfo);
        user2.withCommerceEntry = BuiltInConvert.Boolean2Z(userStructV2.with_commerce_entry, user2.withCommerceEntry);
        user2.verificationType = BuiltInConvert.Integer2I(userStructV2.verification_type, user2.verificationType);
        user2.originalMusician = com$ss$ugc$aweme$proto$OriginalMusicianStructV2$$com$ss$android$ugc$aweme$music$OriginalMusician(userStructV2.original_musician, user2.originalMusician);
        user2.enterpriseVerifyReason = userStructV2.enterprise_verify_reason;
        user2.isAdFake = BuiltInConvert.Boolean2Z(userStructV2.is_ad_fake, user2.isAdFake);
        user2.starUseNewDownload = BuiltInConvert.Boolean2Z(userStructV2.star_use_new_download, user2.starUseNewDownload);
        user2.fansCount = BuiltInConvert.Integer2I(userStructV2.mplatform_followers_count, user2.fansCount);
        user2.followerDetailList = List$com$ss$ugc$aweme$proto$FollowersDetailV2$$List$com$ss$android$ugc$aweme$profile$model$FollowerDetail(userStructV2.followers_detail, user2.followerDetailList);
        user2.hasMedal = BuiltInConvert.Boolean2Z(userStructV2.has_activity_medal, user2.hasMedal);
        user2.region = userStructV2.region;
        user2.accountRegion = userStructV2.account_region;
        user2.isSyncToutiao = BuiltInConvert.Integer2I(userStructV2.sync_to_toutiao, user2.isSyncToutiao);
        user2.commerceUserLevel = BuiltInConvert.Integer2I(userStructV2.commerce_user_level, user2.commerceUserLevel);
        user2.commerceInfo = com$ss$ugc$aweme$proto$CommerceInfoStructV2$$com$ss$android$ugc$aweme$commerce$CommerceInfo(userStructV2.commerce_info, user2.commerceInfo);
        user2.liveAgreement = BuiltInConvert.Integer2I(userStructV2.live_agreement, user2.liveAgreement);
        user2.platformInfos = List$com$ss$ugc$aweme$proto$PlatformSyncStatusStructV2$$Arraycom$ss$android$ugc$aweme$profile$model$PlatformInfo(userStructV2.platform_sync_info, user2.platformInfos);
        user2.isDisciplineMember = BuiltInConvert.Boolean2Z(userStructV2.is_discipline_member, user2.isDisciplineMember);
        user2.secret = BuiltInConvert.Integer2Z(userStructV2.secret, user2.secret);
        user2.hasOrders = BuiltInConvert.Boolean2Z(userStructV2.has_orders, user2.hasOrders);
        user2.preventDownload = BuiltInConvert.Boolean2Z(userStructV2.prevent_download, user2.preventDownload);
        user2.showImageBubble = BuiltInConvert.Boolean2Z(userStructV2.show_image_bubble, user2.showImageBubble);
        user2.unique_id_modify_time = BuiltInConvert.Integer2J(userStructV2.unique_id_modify_time, user2.unique_id_modify_time);
        user2.avatarVideoUri = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(userStructV2.video_icon, user2.avatarVideoUri);
        user2.insId = userStructV2.ins_id;
        user2.googleAccount = userStructV2.google_account;
        user2.youtubeChannelId = userStructV2.youtube_channel_id;
        user2.youtubeChannelTitle = userStructV2.youtube_channel_title;
        user2.withDouEntry = BuiltInConvert.Boolean2Z(userStructV2.with_dou_entry, user2.withDouEntry);
        user2.withFusionShopEntry = BuiltInConvert.Boolean2Z(userStructV2.with_fusion_shop_entry, user2.withFusionShopEntry);
        user2.isPhoneBinded = BuiltInConvert.Boolean2Z(userStructV2.is_phone_binded, user2.isPhoneBinded);
        user2.loginPlatform = BuiltInConvert.Integer2I(userStructV2.login_platform, user2.loginPlatform);
        user2.acceptPrivatePolicy = BuiltInConvert.Boolean2Z(userStructV2.accept_private_policy, user2.acceptPrivatePolicy);
        user2.verifyStatus = BuiltInConvert.Integer2I(userStructV2.realname_verify_status, user2.verifyStatus);
        user2.twitterId = userStructV2.twitter_id;
        user2.twitterName = userStructV2.twitter_name;
        user2.userCancelled = BuiltInConvert.Boolean2Z(userStructV2.user_canceled, user2.userCancelled);
        user2.hasEmail = BuiltInConvert.Boolean2Z(userStructV2.has_email, user2.hasEmail);
        user2.mIsGovMediaVip = BuiltInConvert.Boolean2Z(userStructV2.is_gov_media_vip, user2.mIsGovMediaVip);
        user2.dongtai_count = BuiltInConvert.Integer2I(userStructV2.dongtai_count, user2.dongtai_count);
        user2.registerTime = BuiltInConvert.Long2J(userStructV2.register_time, user2.registerTime);
        user2.withDouplusEntry = BuiltInConvert.Boolean2Z(userStructV2.with_douplus_entry, user2.withDouplusEntry);
        user2.createTime = userStructV2.create_time;
        user2.followerStatus = BuiltInConvert.Integer2I(userStructV2.follower_status, user2.followerStatus);
        user2.neiguangShield = BuiltInConvert.Integer2I(userStructV2.neiguang_shield, user2.neiguangShield);
        user2.commentSetting = BuiltInConvert.Integer2I(userStructV2.comment_setting, user2.commentSetting);
        user2.duetSetting = BuiltInConvert.Integer2I(userStructV2.duet_setting, user2.duetSetting);
        user2.withNewGoods = BuiltInConvert.Boolean2Z(userStructV2.with_new_goods, user2.withNewGoods);
        user2.isFlowcardMember = BuiltInConvert.Boolean2Z(userStructV2.is_flowcard_member, user2.isFlowcardMember);
        user2.roomCover = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(userStructV2.room_cover, user2.roomCover);
        user2.downloadSetting = BuiltInConvert.Integer2I(userStructV2.download_setting, user2.downloadSetting);
        user2.liveCommerce = BuiltInConvert.Boolean2Z(userStructV2.live_commerce, user2.liveCommerce);
        user2.collegeName = userStructV2.college_name;
        user2.enrollYear = userStructV2.enroll_year;
        user2.country = userStructV2.country;
        user2.province = userStructV2.province;
        user2.cityName = userStructV2.city;
        user2.coverUrls = List$com$ss$ugc$aweme$proto$UrlStructV2$$List$com$ss$android$ugc$aweme$base$model$UrlModel(userStructV2.cover_url, user2.coverUrls);
        user2.recommendReasonRelation = userStructV2.recommend_reason_relation;
        user2.isoCountryCode = userStructV2.iso_country_code;
        user2.showGenderStrategy = BuiltInConvert.Integer2I(userStructV2.show_gender_strategy, user2.showGenderStrategy);
        user2.district = userStructV2.district;
        user2.language = userStructV2.language;
        user2.roomTypeTag = userStructV2.room_type_tag;
        user2.douPlusShareLocation = BuiltInConvert.Integer2I(userStructV2.dou_plus_share_location, user2.douPlusShareLocation);
        user2.isCreater = BuiltInConvert.Boolean2Z(userStructV2.has_insights, user2.isCreater);
        user2.remarkName = userStructV2.remark_name;
        user2.tabType = BuiltInConvert.Integer2I(userStructV2.profile_tab_type, user2.tabType);
        user2.avatarDecoration = com$ss$ugc$aweme$proto$AvatarDecorationStructV2$$com$ss$android$ugc$aweme$profile$model$AvatarDecoration(userStructV2.avatar_decoration, user2.avatarDecoration);
        user2.watchStatus = BuiltInConvert.Boolean2I(userStructV2.watch_status, user2.watchStatus);
        user2.withCommerceNewbieTask = BuiltInConvert.Boolean2Z(userStructV2.with_commerce_newbie_task, user2.withCommerceNewbieTask);
        user2.withItemCommerceEntry = BuiltInConvert.Boolean2Z(userStructV2.with_item_commerce_entry, user2.withItemCommerceEntry);
        user2.starBillboardRank = BuiltInConvert.Integer2I(userStructV2.star_billboard_rank, user2.starBillboardRank);
        user2.education = BuiltInConvert.Integer2I(userStructV2.education, user2.education);
        user2.canModifySchoolInfo = BuiltInConvert.Boolean2Z(userStructV2.can_modify_school_info, user2.canModifySchoolInfo);
        user2.schoolInfoShowRange = BuiltInConvert.Integer2I(userStructV2.school_visible, user2.schoolInfoShowRange);
        user2.avatarPendantLarger = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(userStructV2.avatar_pendant_larger, user2.avatarPendantLarger);
        user2.avatarPendantThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(userStructV2.avatar_pendant_thumb, user2.avatarPendantThumb);
        user2.avatarPendantMedium = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(userStructV2.avatar_pendant_medium, user2.avatarPendantMedium);
        user2.recommendAwemeItems = List$com$ss$ugc$aweme$proto$RecommendItemStructV2$$List$com$ss$android$ugc$aweme$profile$model$RecommendAwemeItem(userStructV2.item_list, user2.recommendAwemeItems);
        user2.userMode = BuiltInConvert.Integer2I(userStructV2.user_mode, user2.userMode);
        user2.userPeriod = BuiltInConvert.Integer2I(userStructV2.user_period, user2.userPeriod);
        user2.isEffectArtist = BuiltInConvert.Boolean2Z(userStructV2.is_effect_artist, user2.isEffectArtist);
        user2.effectArtistDetail = com$ss$ugc$aweme$proto$EffectArtistStructV2$$com$ss$android$ugc$aweme$profile$model$EffectArtistDetail(userStructV2.effect_detail, user2.effectArtistDetail);
        user2.commercePermission = com$ss$ugc$aweme$proto$CommercePermissionStructV2$$com$ss$android$ugc$aweme$profile$model$CommercePermissionStruct(userStructV2.commerce_permissions, user2.commercePermission);
        user2.storyBlockInfo = com$ss$ugc$aweme$proto$LifeStoryBlockStructV2$$com$ss$android$ugc$aweme$profile$model$StoryBlockInfo(userStructV2.life_story_block, user2.storyBlockInfo);
        user2.hideFollowingFollowerList = BuiltInConvert.Integer2I(userStructV2.hide_following_follower_list, user2.hideFollowingFollowerList);
        user2.hasUnreadStory = userStructV2.has_unread_story;
        user2.latestStoryCover = List$com$ss$ugc$aweme$proto$UrlStructV2$$List$com$ss$android$ugc$aweme$base$model$UrlModel(userStructV2.new_story_cover, user2.latestStoryCover);
        user2.userStoryCount = BuiltInConvert.Integer2I(userStructV2.user_story_count, user2.userStoryCount);
        user2.hasStory = BuiltInConvert.Boolean2Z(userStructV2.has_story, user2.hasStory);
        user2.isStar = BuiltInConvert.Boolean2Z(userStructV2.is_star, user2.isStar);
        user2.douplusToastStruct = com$ss$ugc$aweme$proto$DouplusToastStructV2$$com$ss$android$ugc$aweme$profile$model$DouplusToastStruct(userStructV2.douplus_toast, user2.douplusToastStruct);
        user2.withLubanEntry = BuiltInConvert.Boolean2Z(userStructV2.with_luban_entry, user2.withLubanEntry);
        user2.adCoverUrl = List$com$ss$ugc$aweme$proto$UrlStructV2$$List$com$ss$android$ugc$aweme$base$model$UrlModel(userStructV2.ad_cover_url, user2.adCoverUrl);
        user2.adCoverTitle = com$ss$ugc$aweme$proto$AdCoverTitleV2$$com$ss$android$ugc$aweme$profile$model$AdCoverTitle(userStructV2.ad_cover_title, user2.adCoverTitle);
        user2.adOrderId = userStructV2.ad_order_id;
        user2.rFansGroupInfo = com$ss$ugc$aweme$proto$RFansGroupInfoV2$$com$ss$android$ugc$aweme$base$share$RocketFansGroupInfo(userStructV2.r_fans_group_info, user2.rFansGroupInfo);
        user2.withCommerceEnterpriseTabEntry = BuiltInConvert.Boolean2Z(userStructV2.with_commerce_enterprise_tab_entry, user2.withCommerceEnterpriseTabEntry);
        user2.honorStruct = com$ss$ugc$aweme$proto$LiveHonorStructV2$$com$ss$android$ugc$aweme$profile$model$HonorStruct(userStructV2.honor_info, user2.honorStruct);
        user2.commentFilterStatus = BuiltInConvert.Integer2I(userStructV2.comment_filter_status, user2.commentFilterStatus);
        user2.notifyPrivateAccount = BuiltInConvert.Integer2I(userStructV2.notify_private_account, user2.notifyPrivateAccount);
        user2.isBlocked = BuiltInConvert.Boolean2Z(userStructV2.is_blocked, user2.isBlocked);
        user2.forcePrivateAccount = BuiltInConvert.Boolean2Z(userStructV2.force_private_account, user2.forcePrivateAccount);
        user2.withStarAtlasEntry = BuiltInConvert.Boolean2Z(userStructV2.with_star_atlas_entry, user2.withStarAtlasEntry);
        user2.sprintSupportUserInfo = com$ss$ugc$aweme$proto$HotsearchSprintStructV2$$com$ss$android$ugc$aweme$profile$model$HotSearchSprintStruct(userStructV2.sprint_support_user_info, user2.sprintSupportUserInfo);
        user2.signatureLanguage = userStructV2.signature_language;
        user2.brandInfo = com$ss$ugc$aweme$proto$BlueVBrandInfoStructV2$$com$ss$android$ugc$aweme$profile$model$BlueVBrandInfo(userStructV2.brand_info, user2.brandInfo);
        user2.displayWvalantineActivityEntry = BuiltInConvert.Boolean2Z(userStructV2.display_wvalantine_activity_entry, user2.displayWvalantineActivityEntry);
        user2.shopMicroApp = userStructV2.shop_micro_app;
        user2.commerceUserInfo = com$ss$ugc$aweme$proto$CommerceUserStructV2$$com$ss$android$ugc$aweme$profile$model$CommerceUserInfo(userStructV2.commerce_user_info, user2.commerceUserInfo);
        user2.relativeUserInfos = List$com$ss$ugc$aweme$proto$RelativeUserStructV2$$List$com$ss$android$ugc$aweme$profile$model$RelativeUserInfo(userStructV2.relative_users, user2.relativeUserInfos);
        user2.quickShopInfo = com$ss$ugc$aweme$proto$QuickShopStructV2$$com$ss$android$ugc$aweme$profile$model$QuickShopInfo(userStructV2.quick_shop_info, user2.quickShopInfo);
        user2.relationLabel = userStructV2.relation_label;
        user2.challengeList = c.a(userStructV2.cha_list, user2.challengeList);
        user2.isMinor = BuiltInConvert.Boolean2Z(userStructV2.is_minor, user2.isMinor);
        user2.secUid = userStructV2.sec_uid;
        user2.recommendScore = BuiltInConvert.Double2D(userStructV2.recommend_score, user2.recommendScore);
        user2.wxTag = BuiltInConvert.Integer2I(userStructV2.wx_tag, user2.wxTag);
        user2.mGeneralPermission = com$ss$ugc$aweme$proto$PermissionStructV2$$com$ss$android$ugc$aweme$profile$model$GeneralPermission(userStructV2.general_permission, user2.mGeneralPermission);
        user2.birthdayHideLevel = BuiltInConvert.Integer2I(userStructV2.birthday_hide_level, user2.birthdayHideLevel);
        user2.bioUrl = userStructV2.bio_url;
        user2.bioEmail = userStructV2.bio_email;
        user2.latestOrderTime = userStructV2.latest_order_time;
        user2.isProAccount = BuiltInConvert.Boolean2Z(userStructV2.is_pro_account, user2.isProAccount);
        user2.email = userStructV2.email;
        user2.isEmailVerified = BuiltInConvert.Boolean2Z(userStructV2.is_email_verified, user2.isEmailVerified);
        user2.bioSecureUrl = userStructV2.bio_secure_url;
        user2.collectCount = BuiltInConvert.Integer2I(userStructV2.collect_count, user2.collectCount);
        user2.nicknameUpdateReminder = BuiltInConvert.Boolean2Z(userStructV2.nickname_update_reminder, user2.nicknameUpdateReminder);
        user2.avatarUpdateReminder = BuiltInConvert.Boolean2Z(userStructV2.avatar_update_reminder, user2.avatarUpdateReminder);
        return user2;
    }

    public static VideoControl com$ss$ugc$aweme$proto$VideoControlV2$$com$ss$android$ugc$aweme$feed$model$VideoControl(VideoControlV2 videoControlV2, VideoControl videoControl) {
        if (videoControlV2 == null) {
            return videoControl;
        }
        VideoControl videoControl2 = new VideoControl();
        videoControl2.shareType = BuiltInConvert.Integer2I(videoControlV2.share_type, videoControl2.shareType);
        videoControl2.showProgressBar = BuiltInConvert.Integer2I(videoControlV2.show_progress_bar, videoControl2.showProgressBar);
        videoControl2.draftProgressBar = BuiltInConvert.Integer2I(videoControlV2.draft_progress_bar, videoControl2.draftProgressBar);
        videoControl2.isAllowDuet = BuiltInConvert.Boolean2Z(videoControlV2.allow_duet, videoControl2.isAllowDuet);
        videoControl2.isAllowReact = BuiltInConvert.Boolean2Z(videoControlV2.allow_react, videoControl2.isAllowReact);
        videoControl2.preventDownloadType = BuiltInConvert.Integer2I(videoControlV2.prevent_download_type, videoControl2.preventDownloadType);
        videoControl2.isAllowDynamicWallpaper = BuiltInConvert.Boolean2Z(videoControlV2.allow_dynamic_wallpaper, videoControl2.isAllowDynamicWallpaper);
        videoControl2.timerStatus = BuiltInConvert.Integer2I(videoControlV2.timer_status, videoControl2.timerStatus);
        return videoControl2;
    }

    public static Video com$ss$ugc$aweme$proto$VideoStructV2$$com$ss$android$ugc$aweme$feed$model$Video(VideoStructV2 videoStructV2, Video video) {
        if (videoStructV2 == null) {
            return video;
        }
        Video video2 = new Video();
        video2.playAddr = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$feed$model$VideoUrlModel(videoStructV2.play_addr, video2.playAddr);
        video2.cover = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(videoStructV2.cover, video2.cover);
        video2.height = BuiltInConvert.Integer2I(videoStructV2.height, video2.height);
        video2.width = BuiltInConvert.Integer2I(videoStructV2.width, video2.width);
        video2.dynamicCover = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(videoStructV2.dynamic_cover, video2.dynamicCover);
        video2.originCover = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(videoStructV2.origin_cover, video2.originCover);
        video2.ratio = videoStructV2.ratio;
        video2.downloadAddr = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(videoStructV2.download_addr, video2.downloadAddr);
        video2.hasWaterMark = BuiltInConvert.Boolean2Z(videoStructV2.has_watermark, video2.hasWaterMark);
        video2.bitRate = List$com$ss$ugc$aweme$proto$BitRateStructV2$$List$com$ss$android$ugc$aweme$feed$model$BitRate(videoStructV2.bit_rate, video2.bitRate);
        video2.newDownloadAddr = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(videoStructV2.new_download_addr, video2.newDownloadAddr);
        video2.videoLength = BuiltInConvert.Integer2I(videoStructV2.duration, video2.videoLength);
        video2.suffixLogoAddr = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(videoStructV2.download_suffix_logo_addr, video2.suffixLogoAddr);
        video2.hasSuffixWaterMark = BuiltInConvert.Boolean2Z(videoStructV2.has_download_suffix_logo_addr, video2.hasSuffixWaterMark);
        video2.playAddrH265 = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$feed$model$VideoUrlModel(videoStructV2.play_addr_265, video2.playAddrH265);
        video2.uiAlikeAddr = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(videoStructV2.ui_alike_download_addr, video2.uiAlikeAddr);
        video2.captionDownloadAddr = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(videoStructV2.caption_download_addr, video2.captionDownloadAddr);
        return video2;
    }

    public static AwemeTextLabelModel com$ss$ugc$aweme$proto$VideoTextStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeTextLabelModel(VideoTextStructV2 videoTextStructV2, AwemeTextLabelModel awemeTextLabelModel) {
        if (videoTextStructV2 == null) {
            return awemeTextLabelModel;
        }
        AwemeTextLabelModel awemeTextLabelModel2 = new AwemeTextLabelModel();
        awemeTextLabelModel2.labelName = videoTextStructV2.text;
        awemeTextLabelModel2.bgColor = videoTextStructV2.color;
        awemeTextLabelModel2.textColor = videoTextStructV2.color_text;
        awemeTextLabelModel2.labelType = BuiltInConvert.Integer2I(videoTextStructV2.type, awemeTextLabelModel2.labelType);
        return awemeTextLabelModel2;
    }

    public static VoteStruct.OptionsBean com$ss$ugc$aweme$proto$VoteOptionStructV2$$com$ss$android$ugc$aweme$sticker$data$VoteStruct$OptionsBean(VoteOptionStructV2 voteOptionStructV2, VoteStruct.OptionsBean optionsBean) {
        if (voteOptionStructV2 == null) {
            return optionsBean;
        }
        VoteStruct.OptionsBean optionsBean2 = new VoteStruct.OptionsBean();
        optionsBean2.optionText = voteOptionStructV2.option_text;
        optionsBean2.optionId = BuiltInConvert.Long2J(voteOptionStructV2.option_id, optionsBean2.optionId);
        optionsBean2.voteCount = BuiltInConvert.Long2J(voteOptionStructV2.vote_count, optionsBean2.voteCount);
        optionsBean2.postOption = voteOptionStructV2.option;
        return optionsBean2;
    }

    public static VoteStruct com$ss$ugc$aweme$proto$VoteStructV2$$com$ss$android$ugc$aweme$sticker$data$VoteStruct(VoteStructV2 voteStructV2, VoteStruct voteStruct) {
        if (voteStructV2 == null) {
            return voteStruct;
        }
        VoteStruct voteStruct2 = new VoteStruct();
        voteStruct2.voteId = BuiltInConvert.Long2J(voteStructV2.vote_id, voteStruct2.voteId);
        voteStruct2.refId = BuiltInConvert.Long2J(voteStructV2.ref_id, voteStruct2.refId);
        voteStruct2.refType = BuiltInConvert.Integer2I(voteStructV2.ref_type, voteStruct2.refType);
        voteStruct2.question = voteStructV2.question;
        voteStruct2.options = List$com$ss$ugc$aweme$proto$VoteOptionStructV2$$List$com$ss$android$ugc$aweme$sticker$data$VoteStruct$OptionsBean(voteStructV2.options, voteStruct2.options);
        voteStruct2.selectOptionId = BuiltInConvert.Long2J(voteStructV2.select_option_id, voteStruct2.selectOptionId);
        return voteStruct2;
    }

    public static XiGuaTaskStruct com$ss$ugc$aweme$proto$XiguaTaskStructV2$$com$ss$android$ugc$aweme$feed$model$xigua$XiGuaTaskStruct(XiguaTaskStructV2 xiguaTaskStructV2, XiGuaTaskStruct xiGuaTaskStruct) {
        if (xiguaTaskStructV2 == null) {
            return xiGuaTaskStruct;
        }
        XiGuaTaskStruct xiGuaTaskStruct2 = new XiGuaTaskStruct();
        xiGuaTaskStruct2.isXiGuaTask = BuiltInConvert.Boolean2Z(xiguaTaskStructV2.is_xigua_task, xiGuaTaskStruct2.isXiGuaTask);
        xiGuaTaskStruct2.jumpUrl = xiguaTaskStructV2.jump_url;
        xiGuaTaskStruct2.title = xiguaTaskStructV2.title;
        xiGuaTaskStruct2.desc = xiguaTaskStructV2.desc;
        xiGuaTaskStruct2.iconUrl = xiguaTaskStructV2.icon_url;
        xiGuaTaskStruct2.switchType = BuiltInConvert.Integer2I(xiguaTaskStructV2.switch_type, xiGuaTaskStruct2.switchType);
        xiGuaTaskStruct2.entranceUrl = xiguaTaskStructV2.entrance_url;
        return xiGuaTaskStruct2;
    }

    public static FeedItemList com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList(aweme_v2_feed_response aweme_v2_feed_response, FeedItemList feedItemList) {
        if (aweme_v2_feed_response == null) {
            return feedItemList;
        }
        FeedItemList feedItemList2 = new FeedItemList();
        feedItemList2.status_code = BuiltInConvert.Integer2I(aweme_v2_feed_response.status_code, feedItemList2.status_code);
        feedItemList2.minCursor = BuiltInConvert.Long2J(aweme_v2_feed_response.min_cursor, feedItemList2.minCursor);
        feedItemList2.maxCursor = BuiltInConvert.Long2J(aweme_v2_feed_response.max_cursor, feedItemList2.maxCursor);
        feedItemList2.hasMore = BuiltInConvert.Integer2I(aweme_v2_feed_response.has_more, feedItemList2.hasMore);
        feedItemList2.items = List$com$ss$ugc$aweme$proto$AwemeStructV2$$List$com$ss$android$ugc$aweme$feed$model$Aweme(aweme_v2_feed_response.aweme_list, feedItemList2.items);
        feedItemList2.requestId = aweme_v2_feed_response.rid;
        feedItemList2.refreshClear = BuiltInConvert.Integer2I(aweme_v2_feed_response.refresh_clear, feedItemList2.refreshClear);
        feedItemList2.extra = com$ss$ugc$aweme$proto$ExtraStructV2$$com$ss$android$ugc$aweme$feed$model$Extra(aweme_v2_feed_response.extra, feedItemList2.extra);
        feedItemList2.logPb = com$ss$ugc$aweme$proto$LogPbStructV2$$com$ss$android$ugc$aweme$feed$model$LogPbBean(aweme_v2_feed_response.log_pb, feedItemList2.logPb);
        feedItemList2.hotSearchGuideWord = com$ss$ugc$aweme$proto$GuideWordV2$$com$ss$android$ugc$aweme$feed$model$HotSearchGuideWord(aweme_v2_feed_response.guide_word, feedItemList2.hotSearchGuideWord);
        feedItemList2.preloadAds = List$com$ss$ugc$aweme$proto$AwemeStructV2$$List$com$ss$android$ugc$aweme$feed$model$Aweme(aweme_v2_feed_response.preload_ads, feedItemList2.preloadAds);
        feedItemList2.status_msg = aweme_v2_feed_response.status_msg;
        feedItemList2.blockCode = BuiltInConvert.Integer2I(aweme_v2_feed_response.block_code, feedItemList2.blockCode);
        return feedItemList2;
    }
}
