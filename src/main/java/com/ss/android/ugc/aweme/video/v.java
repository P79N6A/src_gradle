package com.ss.android.ugc.aweme.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.playerkit.c.b;
import java.util.HashMap;
import java.util.Map;

public enum v implements b {
    Normal(true, "prepare_time", "first_frame_time"),
    Local(true, "prepare_time", "first_frame_time"),
    Story(false, "story_prepare_time", "story_first_frame_time");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Map<String, String> sKeysBitRatedMap;
    String mFirstFrameKey;
    boolean mLoop;
    String mPrepareKey;

    public final boolean isLoop() {
        return this.mLoop;
    }

    public final String getFirstFrameKey() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 89040, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 89040, new Class[0], String.class);
        } else if (VideoBitRateABManager.a().c()) {
            return sKeysBitRatedMap.get(this.mFirstFrameKey);
        } else {
            return this.mFirstFrameKey;
        }
    }

    public final String getPrepareKey() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 89039, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 89039, new Class[0], String.class);
        } else if (VideoBitRateABManager.a().c()) {
            return sKeysBitRatedMap.get(this.mPrepareKey);
        } else {
            return this.mPrepareKey;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        sKeysBitRatedMap = hashMap;
        hashMap.put("prepare_time", "video_bitrate_prepare_time");
        sKeysBitRatedMap.put("story_prepare_time", "story_video_bitrate_prepare_time");
        sKeysBitRatedMap.put("first_frame_time", "aweme_video_bitrate_first_frame_log");
        sKeysBitRatedMap.put("story_first_frame_time", "story_video_bitrate_first_frame_time");
    }

    private v(boolean z, String str, String str2) {
        this.mLoop = z;
        this.mPrepareKey = str;
        this.mFirstFrameKey = str2;
    }
}
