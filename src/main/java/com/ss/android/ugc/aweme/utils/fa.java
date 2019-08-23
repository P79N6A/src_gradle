package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.ss.ttuploader.TTVideoInfo;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u001a\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"addParams", "", "result", "Lcom/ss/android/ugc/aweme/shortvideo/model/VideoCreation;", "fieldmap", "Ljava/util/LinkedHashMap;", "", "convertVideoCreation", "info", "Lcom/ss/ttuploader/TTVideoInfo;", "tools.dmt-av-impl_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class fa {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75864a;

    @NotNull
    public static final VideoCreation a(@NotNull TTVideoInfo tTVideoInfo) {
        int i;
        int i2;
        TTVideoInfo tTVideoInfo2 = tTVideoInfo;
        if (PatchProxy.isSupport(new Object[]{tTVideoInfo2}, null, f75864a, true, 88696, new Class[]{TTVideoInfo.class}, VideoCreation.class)) {
            return (VideoCreation) PatchProxy.accessDispatch(new Object[]{tTVideoInfo2}, null, f75864a, true, 88696, new Class[]{TTVideoInfo.class}, VideoCreation.class);
        }
        Intrinsics.checkParameterIsNotNull(tTVideoInfo2, "info");
        try {
            JSONObject jSONObject = new JSONObject(tTVideoInfo2.mVideoMediaInfo);
            i = jSONObject.getInt("width");
            try {
                i2 = jSONObject.getInt("height");
            } catch (JSONException unused) {
                i2 = 0;
                VideoCreation videoHeight = new VideoCreation().setMaterialId(tTVideoInfo2.mVideoId).setCoverUri(tTVideoInfo2.mCoverUri).setVideoWidth(i).setVideoHeight(i2);
                Intrinsics.checkExpressionValueIsNotNull(videoHeight, "VideoCreation().setMater…tVideoHeight(videoHeight)");
                return videoHeight;
            }
        } catch (JSONException unused2) {
            i = 0;
            i2 = 0;
            VideoCreation videoHeight2 = new VideoCreation().setMaterialId(tTVideoInfo2.mVideoId).setCoverUri(tTVideoInfo2.mCoverUri).setVideoWidth(i).setVideoHeight(i2);
            Intrinsics.checkExpressionValueIsNotNull(videoHeight2, "VideoCreation().setMater…tVideoHeight(videoHeight)");
            return videoHeight2;
        }
        VideoCreation videoHeight22 = new VideoCreation().setMaterialId(tTVideoInfo2.mVideoId).setCoverUri(tTVideoInfo2.mCoverUri).setVideoWidth(i).setVideoHeight(i2);
        Intrinsics.checkExpressionValueIsNotNull(videoHeight22, "VideoCreation().setMater…tVideoHeight(videoHeight)");
        return videoHeight22;
    }

    public static final void a(@NotNull VideoCreation videoCreation, @NotNull LinkedHashMap<String, String> linkedHashMap) {
        VideoCreation videoCreation2 = videoCreation;
        LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
        if (PatchProxy.isSupport(new Object[]{videoCreation2, linkedHashMap2}, null, f75864a, true, 88697, new Class[]{VideoCreation.class, LinkedHashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoCreation2, linkedHashMap2}, null, f75864a, true, 88697, new Class[]{VideoCreation.class, LinkedHashMap.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(videoCreation2, "result");
        Intrinsics.checkParameterIsNotNull(linkedHashMap2, "fieldmap");
        linkedHashMap2.put("video_width", videoCreation2.videoWidth);
        linkedHashMap2.put("video_height", videoCreation2.videoHeight);
        linkedHashMap2.put("video_cover_uri", videoCreation2.mCoverUri);
    }
}
