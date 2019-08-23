package com.ss.android.ugc.aweme.feed.share;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.common.c.b;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.utils.ex;
import com.tt.option.share.ShareInfoModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46055a;

    static class a extends IShareService.ShareStruct {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public final String getThumbPath() {
            String f2;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 42138, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 42138, new Class[0], String.class);
            }
            String thumbPath = super.getThumbPath();
            if (!TextUtils.isEmpty(thumbPath)) {
                return thumbPath;
            }
            String str = this.thumbUrl;
            if (PatchProxy.isSupport(new Object[]{str}, null, i.f46055a, true, 42135, new Class[]{String.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{str}, null, i.f46055a, true, 42135, new Class[]{String.class}, String.class);
            }
            Context context = GlobalContext.getContext();
            String a2 = c.a(context, str);
            if (StringUtils.isEmpty(a2)) {
                if (PatchProxy.isSupport(new Object[]{context}, null, i.f46055a, true, 42136, new Class[]{Context.class}, String.class)) {
                    f2 = (String) PatchProxy.accessDispatch(new Object[]{context}, null, i.f46055a, true, 42136, new Class[]{Context.class}, String.class);
                } else {
                    b bVar = new b(context);
                    bVar.e();
                    f2 = bVar.f();
                }
                a2 = f2;
            }
            return a2;
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static IShareService.ShareStruct a(Context context, com.ss.android.ugc.aweme.web.b.a.a aVar) {
        Context context2 = context;
        com.ss.android.ugc.aweme.web.b.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context2, aVar2}, null, f46055a, true, 42109, new Class[]{Context.class, com.ss.android.ugc.aweme.web.b.a.a.class}, IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{context2, aVar2}, null, f46055a, true, 42109, new Class[]{Context.class, com.ss.android.ugc.aweme.web.b.a.a.class}, IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.identifier = "web";
        if (context2 != null) {
            shareStruct.appName = context2.getString(C0906R.string.ak);
        } else {
            shareStruct.appName = "抖音短视频";
        }
        shareStruct.title = aVar2.f76619a;
        shareStruct.description = aVar2.f76620b;
        shareStruct.thumbUrl = aVar2.f76621c;
        shareStruct.url = a(aVar2.f76622d);
        shareStruct.setThumbPath(null);
        shareStruct.uid4Share = null;
        shareStruct.shareText = null;
        shareStruct.groupId = 0;
        shareStruct.itemId = 0;
        shareStruct.adId = 0;
        shareStruct.itemType = "web";
        return shareStruct;
    }

    public static IShareService.ShareStruct a(Context context, Aweme aweme, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, aweme, str2}, null, f46055a, true, 42113, new Class[]{Context.class, Aweme.class, String.class}, IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{context2, aweme, str2}, null, f46055a, true, 42113, new Class[]{Context.class, Aweme.class, String.class}, IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.identifier = aweme.getAid();
        if (context2 != null) {
            shareStruct.appName = context2.getString(C0906R.string.ak);
        } else {
            shareStruct.appName = "抖音短视频";
        }
        shareStruct.title = "";
        shareStruct.description = "";
        shareStruct.setThumbPath(str2);
        shareStruct.thumbUrl = TextUtils.isEmpty(shareStruct.getThumbPath()) ? "" : shareStruct.getThumbPath();
        shareStruct.url = aweme.getShareInfo().getShareUrl();
        shareStruct.uid4Share = null;
        shareStruct.shareText = null;
        shareStruct.groupId = 0;
        shareStruct.itemId = 0;
        shareStruct.adId = 0;
        shareStruct.itemType = "aweme";
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("desc", aweme.getDesc());
        shareStruct.extraParams = hashMap;
        return shareStruct;
    }

    public static IShareService.ShareStruct a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f46055a, true, 42117, new Class[]{Context.class, String.class}, IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f46055a, true, 42117, new Class[]{Context.class, String.class}, IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.identifier = "valentine_share";
        if (context2 != null) {
            shareStruct.appName = context2.getString(C0906R.string.ak);
        } else {
            shareStruct.appName = "抖音短视频";
        }
        shareStruct.setThumbPath(str2);
        shareStruct.thumbUrl = TextUtils.isEmpty(shareStruct.getThumbPath()) ? "" : shareStruct.getThumbPath();
        shareStruct.itemType = "valentine_hit_rank";
        return shareStruct;
    }

    public static IShareService.ShareStruct a(Context context, Aweme aweme, boolean z) {
        long j;
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f46055a, true, 42119, new Class[]{Context.class, Aweme.class, Boolean.TYPE}, IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{context2, aweme2, Byte.valueOf(z)}, null, f46055a, true, 42119, new Class[]{Context.class, Aweme.class, Boolean.TYPE}, IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        if (aweme.getShareInfo() == null) {
            return shareStruct;
        }
        shareStruct.identifier = aweme.getAuthor().getUid();
        if (context2 != null) {
            shareStruct.appName = context2.getString(C0906R.string.ak);
        } else {
            shareStruct.appName = "抖音短视频";
        }
        shareStruct.title = aweme.getShareInfo().getShareTitle();
        shareStruct.boolPersist = aweme.getShareInfo() != null && aweme.getShareInfo().getBoolPersist() == 1;
        shareStruct.description = aweme.getShareInfo().getShareDesc();
        if (context2 != null) {
            String a2 = c.a(aweme.getVideo().getOriginCover());
            if (!z || TextUtils.isEmpty(a2)) {
                shareStruct.thumbUrl = new com.douyin.share.i(context2, c.a(aweme.getVideo().getCover())).f23234c;
            } else {
                shareStruct.thumbUrl = new com.douyin.share.i(context2, a2).f23234c;
            }
        }
        if (aweme.getShareInfo() != null) {
            shareStruct.url = a(aweme.getShareInfo().getShareUrl());
        } else {
            shareStruct.url = a(aweme.getShareUrl());
        }
        if (aweme.getVideo().getDownloadAddr() != null) {
            shareStruct.videoPlayList = aweme.getVideo().getDownloadAddr().getUrlList();
        }
        shareStruct.uid4Share = aweme.getAuthor().getUid();
        shareStruct.authorId = aweme.getAuthor().getUid();
        PoiStruct poiStruct = aweme.getPoiStruct();
        if (poiStruct != null) {
            shareStruct.poiId = poiStruct.poiId;
            shareStruct.poiType = poiStruct.getIconType();
        }
        shareStruct.cityInfo = aa.a();
        shareStruct.distnceInfo = aa.i(aweme);
        shareStruct.logPb = ai.a().a(aa.c(aweme));
        shareStruct.shareText = null;
        long j2 = 0;
        shareStruct.itemId = (aweme.getStatus().getPrivateStatus() == 1 || aweme.getStatus().isDelete()) ? -1 : 0;
        AwemeStatus status = aweme.getStatus();
        if (status.isDelete()) {
            shareStruct.itemIdStr = "delete";
        } else if (status.getPrivateStatus() == 1) {
            shareStruct.itemIdStr = PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE;
        } else {
            shareStruct.itemIdStr = aweme.getAid();
        }
        shareStruct.videoCover = aweme.getVideo().getCover();
        shareStruct.authorName = aweme.getAuthor().getNickname();
        shareStruct.thumb4Share = aweme.getAuthor().getAvatarThumb();
        shareStruct.awemeType = aweme.getAwemeType();
        a(aweme2, shareStruct);
        if (com.ss.android.ugc.aweme.commercialize.utils.c.t(aweme)) {
            Long creativeId = aweme.getAwemeRawAd().getCreativeId();
            Long groupId = aweme.getAwemeRawAd().getGroupId();
            if (creativeId == null) {
                j = 0;
            } else {
                j = creativeId.longValue();
            }
            shareStruct.adId = j;
            if (groupId != null) {
                j2 = groupId.longValue();
            }
            shareStruct.groupId = j2;
        } else {
            shareStruct.adId = 0;
            shareStruct.groupId = 0;
        }
        shareStruct.itemType = "aweme";
        if (aweme.getVideo().getPlayAddr() != null) {
            String[] split = aweme.getVideo().getPlayAddr().getUri().split("_");
            if (split.length > 1) {
                shareStruct.awemeVid = split[0];
            }
        }
        shareStruct.awemeWidth = aweme.getVideo().getWidth();
        shareStruct.awemeHeight = aweme.getVideo().getHeight();
        shareStruct.awemeDuration = aweme.getVideo().getDuration();
        shareStruct.awemeLength = aweme.getVideo().getVideoLength();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("desc", aweme.getDesc());
        hashMap.put("play_mode", AwemeAppData.p().ap ? "auto" : "normal");
        hashMap.put("is_star", aweme.getAuthor().isStar() ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_NOTIFY);
        shareStruct.extraParams = hashMap;
        shareStruct.isLongItem = com.ss.android.ugc.aweme.longvideo.b.a.a(context);
        return shareStruct;
    }

    private static void a(Aweme aweme, IShareService.ShareStruct shareStruct) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{aweme, shareStruct2}, null, f46055a, true, 42121, new Class[]{Aweme.class, IShareService.ShareStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, shareStruct2}, null, f46055a, true, 42121, new Class[]{Aweme.class, IShareService.ShareStruct.class}, Void.TYPE);
            return;
        }
        if (shareStruct2.awemeType == 2) {
            List<ImageInfo> imageInfos = aweme.getImageInfos();
            if (imageInfos == null || imageInfos.isEmpty()) {
                shareStruct2.awemeWidth = 124;
                shareStruct2.awemeHeight = 165;
            } else {
                ImageInfo imageInfo = imageInfos.get(0);
                shareStruct2.awemeWidth = imageInfo.getWidth();
                shareStruct2.awemeHeight = imageInfo.getHeight();
                shareStruct2.videoCover = imageInfo.getLabelLarge();
            }
        } else if (shareStruct2.awemeType == 0) {
            Video video = aweme.getVideo();
            if (video == null) {
                shareStruct2.awemeWidth = 124;
                shareStruct2.awemeHeight = 165;
                return;
            }
            shareStruct2.awemeWidth = video.getWidth();
            shareStruct2.awemeHeight = video.getHeight();
            shareStruct2.videoCover = aweme.getVideo().getOriginCover();
        }
    }

    public static IShareService.ShareStruct a(Context context, User user, List<Aweme> list) {
        Context context2 = context;
        User user2 = user;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{context2, user2, list}, null, f46055a, true, 42125, new Class[]{Context.class, User.class, List.class}, IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{context2, user2, list}, null, f46055a, true, 42125, new Class[]{Context.class, User.class, List.class}, IShareService.ShareStruct.class);
        } else if (user2 == null) {
            return null;
        } else {
            IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
            shareStruct.identifier = user.getUid();
            if (context2 != null) {
                shareStruct.appName = context2.getString(C0906R.string.ak);
            } else {
                shareStruct.appName = "抖音短视频";
            }
            shareStruct.title = user.getShareInfo().getShareTitle();
            shareStruct.description = user.getShareInfo().getShareDesc();
            shareStruct.setThumbPath(null);
            shareStruct.thumbUrl = TextUtils.isEmpty(shareStruct.getThumbPath()) ? "" : shareStruct.getThumbPath();
            String shareUrl = user.getShareInfo().getShareUrl();
            if (shareUrl != null && !shareUrl.startsWith("http://") && !shareUrl.startsWith("https://")) {
                shareUrl = "https://" + shareUrl;
            }
            shareStruct.url = a(shareUrl);
            shareStruct.uid4Share = null;
            shareStruct.shareText = null;
            shareStruct.groupId = 0;
            shareStruct.itemId = 0;
            shareStruct.adId = 0;
            shareStruct.itemType = AllStoryActivity.f73306b;
            shareStruct.videoCover = user.getAvatarMedium();
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("uid", user.getUid());
            hashMap.put("name", user.getNickname());
            hashMap.put("desc", TextUtils.isEmpty(user.getUniqueId()) ? user.getShortId() : user.getUniqueId());
            if (!ex.a(user2, ex.g(user)) && list != null && list.size() >= 3) {
                ArrayList arrayList = new ArrayList();
                for (Aweme next : list) {
                    if (next.getAwemeType() == 2) {
                        arrayList.add(a(next));
                    } else {
                        arrayList.add(next.getVideo().getCover());
                    }
                    i++;
                    if (i >= 3) {
                        break;
                    }
                }
                if (arrayList.size() >= 3) {
                    hashMap.put("aweme_cover_list", JSON.toJSONString(arrayList));
                }
            }
            shareStruct.extraParams = hashMap;
            return shareStruct;
        }
    }

    public static IShareService.ShareStruct a(Context context, Music music, List<Aweme> list) {
        Context context2 = context;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{context2, music, list}, null, f46055a, true, 42129, new Class[]{Context.class, Music.class, List.class}, IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{context2, music, list}, null, f46055a, true, 42129, new Class[]{Context.class, Music.class, List.class}, IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct a2 = a();
        a2.identifier = music.getMid();
        if (context2 != null) {
            a2.appName = context2.getString(C0906R.string.ak);
        } else {
            a2.appName = "抖音短视频";
        }
        a2.title = music.getShareInfo().getShareTitle();
        a2.description = music.getShareInfo().getShareDesc();
        if (context2 != null) {
            a2.thumbUrl = new com.douyin.share.i(context2, c.a(music.getCoverThumb())).f23234c;
        }
        a2.videoCover = music.getCoverMedium();
        a2.url = a(music.getShareInfo().getShareUrl());
        a2.shareText = null;
        a2.groupId = 0;
        a2.itemId = 0;
        a2.adId = 0;
        a2.itemType = "music";
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("music_id", music.getMid());
        hashMap.put("music_name", music.getMusicName());
        hashMap.put("user_count", String.valueOf(music.getUserCount()));
        hashMap.put("cover_thumb", JSON.toJSONString(music.getCoverThumb()));
        if (list != null && list.size() >= 3) {
            ArrayList arrayList = new ArrayList();
            for (Aweme next : list) {
                if (next.getAwemeType() == 2) {
                    arrayList.add(a(next));
                } else {
                    arrayList.add(next.getVideo().getCover());
                }
                i++;
                if (i >= 3) {
                    break;
                }
            }
            if (arrayList.size() >= 3) {
                hashMap.put("aweme_cover_list", JSON.toJSONString(arrayList));
            }
        }
        a2.extraParams = hashMap;
        return a2;
    }

    public static IShareService.ShareStruct a(Context context, ShareInfoModel shareInfoModel) {
        ShareInfoModel shareInfoModel2 = shareInfoModel;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{context, shareInfoModel2}, null, f46055a, true, 42131, new Class[]{Context.class, ShareInfoModel.class}, IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{context, shareInfoModel2}, null, f46055a, true, 42131, new Class[]{Context.class, ShareInfoModel.class}, IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.identifier = shareInfoModel2.appInfo.appId;
        shareStruct.appName = shareInfoModel2.appInfo.appName;
        shareStruct.title = shareInfoModel2.title;
        shareStruct.description = shareInfoModel2.desc;
        shareStruct.thumbUrl = shareInfoModel2.imageUrl;
        shareStruct.url = a(shareInfoModel2.ugUrl);
        c.b(shareInfoModel2.imageUrl);
        shareStruct.itemType = "game";
        HashMap<String, String> hashMap = new HashMap<>();
        if (shareInfoModel2.appInfo.type == 2) {
            z = true;
        }
        hashMap.put("isGame", String.valueOf(z));
        hashMap.put("query", shareInfoModel2.queryString);
        hashMap.put("app_id", shareInfoModel2.appInfo.appId);
        shareStruct.extraParams = hashMap;
        shareStruct.setThumbPath(null);
        shareStruct.uid4Share = null;
        shareStruct.shareText = null;
        shareStruct.groupId = 0;
        shareStruct.itemId = 0;
        shareStruct.adId = 0;
        return shareStruct;
    }

    public static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f46055a, true, 42137, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f46055a, true, 42137, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str) || str2.contains("timestamp=")) {
            return str2;
        } else {
            com.ss.android.common.util.i iVar = new com.ss.android.common.util.i(str2);
            iVar.a("timestamp", u.a(System.currentTimeMillis()));
            return iVar.a();
        }
    }

    public static IShareService.ShareStruct a() {
        if (PatchProxy.isSupport(new Object[0], null, f46055a, true, 42134, new Class[0], IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[0], null, f46055a, true, 42134, new Class[0], IShareService.ShareStruct.class);
        }
        return new a((byte) 0);
    }

    public static UrlModel a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f46055a, true, 42122, new Class[]{Aweme.class}, UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[]{aweme}, null, f46055a, true, 42122, new Class[]{Aweme.class}, UrlModel.class);
        }
        List<ImageInfo> imageInfos = aweme.getImageInfos();
        if (!CollectionUtils.isEmpty(imageInfos)) {
            return imageInfos.get(0).getLabelThumb();
        }
        return null;
    }

    public static IShareService.ShareStruct b(Context context, com.ss.android.ugc.aweme.web.b.a.a aVar) {
        Context context2 = context;
        com.ss.android.ugc.aweme.web.b.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context2, aVar2}, null, f46055a, true, 42110, new Class[]{Context.class, com.ss.android.ugc.aweme.web.b.a.a.class}, IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{context2, aVar2}, null, f46055a, true, 42110, new Class[]{Context.class, com.ss.android.ugc.aweme.web.b.a.a.class}, IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct a2 = a();
        a2.identifier = "web";
        a2.appName = context2.getString(C0906R.string.ak);
        a2.title = aVar2.f76619a;
        a2.description = aVar2.f76620b;
        a2.thumbUrl = "file://" + aVar2.f76623e;
        a2.setThumbPath(aVar2.f76623e);
        a2.url = a(aVar2.f76622d);
        a2.itemType = "pic";
        a2.uid4Share = null;
        a2.shareText = null;
        a2.groupId = 0;
        a2.itemId = 0;
        a2.adId = 0;
        return a2;
    }

    public static IShareService.ShareStruct a(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (!PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f46055a, true, 42120, new Class[]{Context.class, Aweme.class}, IShareService.ShareStruct.class)) {
            return a(context2, aweme2, false);
        }
        return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f46055a, true, 42120, new Class[]{Context.class, Aweme.class}, IShareService.ShareStruct.class);
    }

    public static IShareService.ShareStruct b(Context context, Aweme aweme, String str) {
        if (!PatchProxy.isSupport(new Object[]{context, aweme, str}, null, f46055a, true, 42118, new Class[]{Context.class, Aweme.class, String.class}, IShareService.ShareStruct.class)) {
            return new IShareService.ShareStruct();
        }
        return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{context, aweme, str}, null, f46055a, true, 42118, new Class[]{Context.class, Aweme.class, String.class}, IShareService.ShareStruct.class);
    }

    public static IShareService.ShareStruct a(Context context, ShareInfo shareInfo, String str) {
        String str2;
        Context context2 = context;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{context2, shareInfo, str3}, null, f46055a, true, 42116, new Class[]{Context.class, ShareInfo.class, String.class}, IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{context2, shareInfo, str3}, null, f46055a, true, 42116, new Class[]{Context.class, ShareInfo.class, String.class}, IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.identifier = "hot_search_ranking_list";
        if (context2 != null) {
            shareStruct.appName = context2.getString(C0906R.string.ak);
        } else {
            shareStruct.appName = "抖音短视频";
        }
        shareStruct.title = context2.getString(C0906R.string.amq);
        shareStruct.description = shareInfo.getShareLinkDesc();
        shareStruct.setThumbPath(str3);
        if (TextUtils.isEmpty(shareStruct.getThumbPath())) {
            str2 = "";
        } else {
            str2 = shareStruct.getThumbPath();
        }
        shareStruct.thumbUrl = str2;
        shareStruct.url = shareInfo.getShareUrl();
        shareStruct.uid4Share = null;
        shareStruct.shareText = null;
        shareStruct.groupId = 0;
        shareStruct.itemId = 0;
        shareStruct.adId = 0;
        shareStruct.itemType = "ranking";
        return shareStruct;
    }

    public static IShareService.ShareStruct a(Context context, Challenge challenge, String str) {
        String str2;
        String str3;
        Context context2 = context;
        String str4 = str;
        if (PatchProxy.isSupport(new Object[]{context2, challenge, str4}, null, f46055a, true, 42126, new Class[]{Context.class, Challenge.class, String.class}, IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{context2, challenge, str4}, null, f46055a, true, 42126, new Class[]{Context.class, Challenge.class, String.class}, IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct a2 = a();
        a2.identifier = challenge.getCid();
        if (context2 != null) {
            a2.appName = context2.getString(C0906R.string.ak);
        } else {
            a2.appName = "抖音短视频";
        }
        if (challenge.getShareInfo() == null) {
            str2 = "";
        } else {
            str2 = challenge.getShareInfo().getShareTitle();
        }
        a2.title = str2;
        if (challenge.getShareInfo() == null) {
            str3 = "";
        } else {
            str3 = challenge.getShareInfo().getShareDesc();
        }
        a2.description = str3;
        if (context2 != null) {
            a2.thumbUrl = new com.douyin.share.i(context2, str4).f23234c;
        }
        a2.url = a(challenge.getShareInfo().getShareUrl());
        a2.setThumbPath(null);
        a2.uid4Share = challenge.getAuthor().getUid();
        a2.shareText = null;
        a2.groupId = 0;
        a2.itemId = 0;
        a2.adId = 0;
        a2.itemType = "challenge";
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("challenge_id", challenge.getCid());
        hashMap.put("challenge_name", challenge.getChallengeName());
        hashMap.put("view_count", String.valueOf(challenge.getDisplayCount()));
        a2.extraParams = hashMap;
        return a2;
    }

    public static IShareService.ShareStruct c(Context context, Aweme aweme, String str) {
        String str2;
        String str3;
        Context context2 = context;
        Aweme aweme2 = aweme;
        String str4 = str;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, str4}, null, f46055a, true, 42124, new Class[]{Context.class, Aweme.class, String.class}, IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{context2, aweme2, str4}, null, f46055a, true, 42124, new Class[]{Context.class, Aweme.class, String.class}, IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.identifier = aweme.getAuthor().getUid();
        shareStruct.shareText = context2.getString(C0906R.string.o5);
        shareStruct.thumbUrl = "file://" + str4;
        shareStruct.setThumbPath(str4);
        if (aweme.getShareInfo() != null) {
            str2 = aweme.getShareInfo().getShareUrl();
        } else {
            str2 = "";
        }
        shareStruct.url = a(str2);
        if (aweme.getShareInfo() != null && aweme.getShareInfo().getBoolPersist() == 1) {
            z = true;
        }
        shareStruct.boolPersist = z;
        shareStruct.uid4Share = aweme.getAuthor().getUid();
        if (aweme.getShareInfo() != null) {
            str3 = aweme.getShareInfo().getShareTitle();
        } else {
            str3 = "";
        }
        shareStruct.title = str3;
        AwemeStatus status = aweme.getStatus();
        if (status.isDelete()) {
            shareStruct.itemIdStr = "delete";
        } else if (status.getPrivateStatus() == 1) {
            shareStruct.itemIdStr = PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE;
        } else {
            shareStruct.itemIdStr = aweme.getAid();
        }
        if (aweme.getAwemeType() == 2) {
            a(aweme2, shareStruct);
        } else {
            shareStruct.videoCover = aweme.getVideo().getCover();
        }
        shareStruct.authorName = aweme.getAuthor().getNickname();
        shareStruct.thumb4Share = aweme.getAuthor().getAvatarThumb();
        shareStruct.awemeType = aweme.getAwemeType();
        shareStruct.itemType = "aweme";
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("desc", aweme.getDesc());
        shareStruct.extraParams = hashMap;
        a(aweme2, shareStruct);
        return shareStruct;
    }

    public static IShareService.ShareStruct a(Context context, Challenge challenge, String str, List<Aweme> list) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{context, challenge, str, list}, null, f46055a, true, 42127, new Class[]{Context.class, Challenge.class, String.class, List.class}, IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{context, challenge, str, list}, null, f46055a, true, 42127, new Class[]{Context.class, Challenge.class, String.class, List.class}, IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct a2 = a(context, challenge, str);
        if (list != null && list.size() >= 3) {
            ArrayList arrayList = new ArrayList();
            for (Aweme next : list) {
                if (next.getAwemeType() == 2) {
                    arrayList.add(a(next));
                } else {
                    arrayList.add(next.getVideo().getCover());
                }
                i++;
                if (i >= 3) {
                    break;
                }
            }
            if (arrayList.size() >= 3) {
                a2.extraParams.put("cover_thumb", JSON.toJSONString(arrayList));
            }
        }
        return a2;
    }
}
