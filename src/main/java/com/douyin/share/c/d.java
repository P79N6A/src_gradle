package com.douyin.share.c;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.douyin.share.a.a;
import com.douyin.share.a.c.c;
import com.rocket.android.opensdk.IRocketAPI;
import com.rocket.android.opensdk.RocketAPIFactory;
import com.rocket.android.opensdk.message.RocketImageContent;
import com.rocket.android.opensdk.message.RocketMediaContent;
import com.rocket.android.opensdk.message.RocketShareMessage;
import com.rocket.android.opensdk.message.RocketWebPageContent;
import com.rocket.android.opensdkext.ExtOpenConstants;
import com.rocket.android.opensdkext.RocketVideoPlayContent;
import com.rocket.android.opensdkext.VideoPlayThumbInfo;
import com.rocket.android.opensdkext.VideoPlayUrlInfo;
import com.rocket.android.opensdkext.VideoPlayWebInfo;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class d extends a {
    public final String a() {
        return "com.feiliao.flipchat.android";
    }

    public final boolean a(Context context) {
        return new c(context, "rs9760739781918870", "抖音短视频").a();
    }

    public final void a(Context context, Uri uri) {
        IRocketAPI createRocketAPI = RocketAPIFactory.createRocketAPI(context, "rs9760739781918870", true);
        RocketMediaContent rocketMediaContent = new RocketMediaContent();
        rocketMediaContent.mMediaObject = new RocketImageContent(uri.getPath());
        RocketShareMessage.Req req = new RocketShareMessage.Req();
        req.mMediaContent = rocketMediaContent;
        req.mScene = 1;
        createRocketAPI.sendReq(req);
    }

    private IShareService.ShareResult a(Activity activity, IShareService.ShareStruct shareStruct) {
        IShareService.ShareResult shareResult = new IShareService.ShareResult();
        if (!a(activity)) {
            shareResult.success = false;
            return shareResult;
        }
        IRocketAPI createRocketAPI = RocketAPIFactory.createRocketAPI(activity, "rs9760739781918870", true);
        RocketMediaContent rocketMediaContent = new RocketMediaContent();
        rocketMediaContent.mMediaObject = new RocketWebPageContent(shareStruct.url);
        rocketMediaContent.mTitle = shareStruct.title;
        rocketMediaContent.mContent = shareStruct.description;
        List<String> list = null;
        if (shareStruct.videoCover != null) {
            list = shareStruct.videoCover.getUrlList();
        }
        if (list != null && !CollectionUtils.isEmpty(list)) {
            rocketMediaContent.mThumbUrl = list.get(0);
        }
        rocketMediaContent.mSource = "抖音短视频";
        RocketShareMessage.Req req = new RocketShareMessage.Req();
        req.mMediaContent = rocketMediaContent;
        req.mScene = 1;
        createRocketAPI.sendReq(req);
        shareResult.success = true;
        return shareResult;
    }

    public final IShareService.ShareResult a(Activity activity, IShareService.ShareStruct shareStruct, String str) {
        long j;
        IShareService.ShareStruct shareStruct2 = shareStruct;
        IShareService.ShareResult shareResult = new IShareService.ShareResult();
        if (!a(activity)) {
            shareResult.success = false;
            return shareResult;
        } else if (!TextUtils.equals(shareStruct2.itemType, "aweme")) {
            return a(activity, shareStruct);
        } else {
            try {
                IRocketAPI createRocketAPI = RocketAPIFactory.createRocketAPI(activity, "rs9760739781918870", true);
                RocketVideoPlayContent rocketVideoPlayContent = new RocketVideoPlayContent();
                ArrayList<VideoPlayUrlInfo> arrayList = new ArrayList<>();
                if (shareStruct2.videoPlayList != null) {
                    for (String videoPlayUrlInfo : shareStruct2.videoPlayList) {
                        arrayList.add(new VideoPlayUrlInfo(videoPlayUrlInfo));
                    }
                }
                rocketVideoPlayContent.mediaUrls = arrayList;
                rocketVideoPlayContent.width = (long) shareStruct2.awemeWidth;
                rocketVideoPlayContent.height = (long) shareStruct2.awemeHeight;
                rocketVideoPlayContent.fileLength = (long) shareStruct2.awemeLength;
                rocketVideoPlayContent.duration = (long) shareStruct2.awemeDuration;
                String str2 = "";
                String str3 = "";
                List<String> list = null;
                if (shareStruct2.videoCover != null) {
                    list = shareStruct2.videoCover.getUrlList();
                }
                int i = shareStruct2.awemeWidth;
                int i2 = shareStruct2.awemeHeight;
                if (!TextUtils.isEmpty(shareStruct2.thumbUrl)) {
                    str2 = shareStruct2.thumbUrl;
                } else if (list != null && !CollectionUtils.isEmpty(list)) {
                    str2 = list.get(0);
                }
                if (!TextUtils.isEmpty(str2)) {
                    str3 = com.ss.android.ugc.aweme.base.c.a(GlobalContext.getContext(), str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    j = new File(str3).length();
                } else {
                    j = 0;
                }
                VideoPlayThumbInfo videoPlayThumbInfo = new VideoPlayThumbInfo(str2, (long) i, (long) i2, j);
                rocketVideoPlayContent.thumbInfo = videoPlayThumbInfo;
                rocketVideoPlayContent.webInfo = new VideoPlayWebInfo(shareStruct2.url, shareStruct2.description, shareStruct2.title, str2);
                if (!shareStruct2.isFromUploadSuccess) {
                    rocketVideoPlayContent.videoId = shareStruct2.awemeVid;
                }
                rocketVideoPlayContent.groupSource = ExtOpenConstants.GroupSource.DOUYIN;
                rocketVideoPlayContent.backFlowSchema = "snssdk1128://aweme/detail/" + Long.toString(shareStruct2.groupId);
                rocketVideoPlayContent.sourceGroupId = Long.toString(shareStruct2.groupId);
                RocketMediaContent rocketMediaContent = new RocketMediaContent();
                rocketMediaContent.mMediaObject = rocketVideoPlayContent;
                RocketShareMessage.Req req = new RocketShareMessage.Req();
                req.mMediaContent = rocketMediaContent;
                req.mScene = 1;
                createRocketAPI.sendReq(req);
                shareResult.success = true;
                return shareResult;
            } catch (Throwable unused) {
                return a(activity, shareStruct);
            }
        }
    }
}
