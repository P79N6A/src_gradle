package com.ss.android.ugc.aweme.shortvideo.ui;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.c;
import java.util.List;

@Keep
public class TimeSpeedModelExtension {
    private static final Gson GSON = ((IAVService) ServiceManager.get().getService(IAVService.class)).provideAvGson();
    public static ChangeQuickRedirect changeQuickRedirect;
    private int duration;
    private boolean isRedPacketSticker;
    private List<String> mARText;
    private List<String> mBubbleText;
    private c mChallenge;
    private String mPropSource;
    private String mStickerId;
    private List<String> mStickerMusicIds;
    private f mWindowInfo;
    private double speed;
    @Nullable
    private z stickerPoi;
    private String words;

    @Nullable
    public List<String> getARTexts() {
        return this.mARText;
    }

    @Nullable
    public List<String> getBubbleTexts() {
        return this.mBubbleText;
    }

    public int getDuration() {
        return this.duration;
    }

    @Nullable
    public c getHashtag() {
        return this.mChallenge;
    }

    public double getSpeed() {
        return this.speed;
    }

    public String getStickerId() {
        return this.mStickerId;
    }

    public List<String> getStickerMusicIds() {
        return this.mStickerMusicIds;
    }

    @Nullable
    public z getStickerPoi() {
        return this.stickerPoi;
    }

    public String getPropSource() {
        if (this.mPropSource == null) {
            return "";
        }
        return this.mPropSource;
    }

    public JsonObject toJson() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 80337, new Class[0], JsonObject.class)) {
            return GSON.toJsonTree(this).getAsJsonObject();
        }
        return (JsonObject) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 80337, new Class[0], JsonObject.class);
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 80336, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 80336, new Class[0], String.class);
        }
        return "durationSDK: " + getDuration() + " speed: " + getSpeed();
    }

    public void setStickerMusicIds(List<String> list) {
        this.mStickerMusicIds = list;
    }

    public static int calculateRealTime(List<TimeSpeedModelExtension> list) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{list}, null, changeQuickRedirect, true, 80339, new Class[]{List.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{list}, null, changeQuickRedirect, true, 80339, new Class[]{List.class}, Integer.TYPE)).intValue();
        } else if (list == null || list.size() <= 0) {
            return 0;
        } else {
            for (TimeSpeedModelExtension next : list) {
                i += calculateRealTime(next.duration, next.speed);
            }
            return i;
        }
    }

    public static TimeSpeedModelExtension fromJson(JsonObject jsonObject) {
        JsonObject jsonObject2 = jsonObject;
        if (!PatchProxy.isSupport(new Object[]{jsonObject2}, null, changeQuickRedirect, true, 80338, new Class[]{JsonObject.class}, TimeSpeedModelExtension.class)) {
            return (TimeSpeedModelExtension) GSON.fromJson((JsonElement) jsonObject2, TimeSpeedModelExtension.class);
        }
        return (TimeSpeedModelExtension) PatchProxy.accessDispatch(new Object[]{jsonObject2}, null, changeQuickRedirect, true, 80338, new Class[]{JsonObject.class}, TimeSpeedModelExtension.class);
    }

    public static int calculateRealTime(int i, double d2) {
        double d3 = (double) i;
        Double.isNaN(d3);
        return (int) ((d3 * 1.0d) / d2);
    }

    public static long calculateRealTime(long j, double d2) {
        double d3 = (double) j;
        Double.isNaN(d3);
        return (long) ((d3 * 1.0d) / d2);
    }

    public TimeSpeedModelExtension(int i, double d2, @Nullable String str, @Nullable c cVar, @Nullable List<String> list) {
        this.duration = i;
        this.speed = d2;
        this.mStickerId = str;
        this.mChallenge = cVar;
        this.mStickerMusicIds = list;
    }

    public TimeSpeedModelExtension(int i, double d2, @Nullable String str, @Nullable z zVar, @Nullable String str2, @Nullable c cVar, @Nullable List<String> list, @Nullable f fVar) {
        this.duration = i;
        this.speed = d2;
        this.mStickerId = str;
        this.stickerPoi = zVar;
        this.mPropSource = str2;
        this.mChallenge = cVar;
        this.mStickerMusicIds = list;
        this.mWindowInfo = fVar;
    }

    public TimeSpeedModelExtension(int i, double d2, @Nullable String str, @Nullable z zVar, @Nullable String str2, @Nullable c cVar, @Nullable List<String> list, @Nullable f fVar, @Nullable List<String> list2, @Nullable List<String> list3) {
        this.duration = i;
        this.speed = d2;
        this.mStickerId = str;
        this.stickerPoi = zVar;
        this.mPropSource = str2;
        this.mChallenge = cVar;
        this.mStickerMusicIds = list;
        this.mWindowInfo = fVar;
        this.mARText = list2;
        this.mBubbleText = list3;
    }
}
