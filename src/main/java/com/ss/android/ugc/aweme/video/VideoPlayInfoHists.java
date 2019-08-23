package com.ss.android.ugc.aweme.video;

import android.support.annotation.Keep;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.playerkit.session.Session;

@Keep
public class VideoPlayInfoHists {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int block_cnt = -1;
    public int block_time = -1;
    public int cache_size = -1;
    public int internet_speed = -1;
    public float play_bitrate = -1.0f;
    public int play_time = -1;
    public String source_id;
    public int video_bitrate = -1;

    public static class a implements ExclusionStrategy {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76005a;

        public final boolean shouldSkipClass(Class<?> cls) {
            return false;
        }

        public final boolean shouldSkipField(FieldAttributes fieldAttributes) {
            if (PatchProxy.isSupport(new Object[]{fieldAttributes}, this, f76005a, false, 89069, new Class[]{FieldAttributes.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{fieldAttributes}, this, f76005a, false, 89069, new Class[]{FieldAttributes.class}, Boolean.TYPE)).booleanValue();
            } else if (fieldAttributes.getDeclaringClass() != VideoPlayInfoHists.class || (!"source_id".equals(fieldAttributes.getName()) && !"video_bitrate".equals(fieldAttributes.getName()) && !"play_time".equals(fieldAttributes.getName()))) {
                return false;
            } else {
                return true;
            }
        }
    }

    public static VideoPlayInfoHists convert(Session session) {
        Session session2 = session;
        if (PatchProxy.isSupport(new Object[]{session2}, null, changeQuickRedirect, true, 89068, new Class[]{Session.class}, VideoPlayInfoHists.class)) {
            return (VideoPlayInfoHists) PatchProxy.accessDispatch(new Object[]{session2}, null, changeQuickRedirect, true, 89068, new Class[]{Session.class}, VideoPlayInfoHists.class);
        }
        VideoPlayInfoHists videoPlayInfoHists = new VideoPlayInfoHists();
        videoPlayInfoHists.internet_speed = (int) session2.speed;
        videoPlayInfoHists.cache_size = session2.cacheSize;
        videoPlayInfoHists.video_bitrate = session2.bitrate;
        videoPlayInfoHists.block_cnt = session2.blockCnt;
        videoPlayInfoHists.block_time = session2.blockTime;
        videoPlayInfoHists.play_time = session2.playTime;
        videoPlayInfoHists.play_bitrate = session2.playBitrate;
        return videoPlayInfoHists;
    }
}
