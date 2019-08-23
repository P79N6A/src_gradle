package com.ss.android.ugc.aweme.shortvideo.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.ExternalAVConstants;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.shortvideo.ah;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.e;
import com.ss.android.ugc.aweme.shortvideo.i.i;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RecordScene {
    public static ChangeQuickRedirect changeQuickRedirect;
    public UrlModel audioTrack;
    public String challengeStr;
    public ah cherEffectParam;
    public String creationId;
    public String duetAudioPath;
    public String duetVideoPath;
    public ExtractFramesModel extractFramesModel;
    public int faceBeauty;
    public String filterIds;
    public String filterLabels;
    public int hardEncode;
    public long maxDuration;
    public String mp4Path;
    public e musicModel;
    public String musicPath;
    public int musicStart;
    public String poiContextStr;
    public i reactionParams;
    public int recordMode;
    public int shootMode;
    public ArrayList<TimeSpeedModelExtension> videoSegments;

    public c getChallengeFromStr() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77663, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77663, new Class[0], c.class);
        } else if (TextUtils.isEmpty(this.challengeStr)) {
            return null;
        } else {
            SimpleAVChallenge deserializeFromJson = SimpleAVChallenge.deserializeFromJson(this.challengeStr);
            if (deserializeFromJson == null) {
                return null;
            }
            return deserializeFromJson.parse2AVChallenge();
        }
    }

    public boolean isDuetMode() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77656, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77656, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!StringUtils.isEmpty(this.duetVideoPath) || !StringUtils.isEmpty(this.duetAudioPath)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isReactionMode() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77657, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77657, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.reactionParams != null && !StringUtils.isEmpty(this.reactionParams.videoPath)) {
            z = true;
        }
        return z;
    }

    public boolean isSegmentsNotValid() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77655, new Class[0], Boolean.TYPE)) {
            return CollectionUtils.isEmpty(this.videoSegments);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77655, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public RecordScene audioTrack(UrlModel urlModel) {
        this.audioTrack = urlModel;
        return this;
    }

    public RecordScene creationId(@NonNull String str) {
        this.creationId = str;
        return this;
    }

    public RecordScene faceBeauty(int i) {
        this.faceBeauty = i;
        return this;
    }

    public RecordScene hardEncode(int i) {
        this.hardEncode = i;
        return this;
    }

    public RecordScene maxDuration(long j) {
        this.maxDuration = j;
        return this;
    }

    public RecordScene mp4Path(String str) {
        this.mp4Path = str;
        return this;
    }

    public RecordScene musicModel(e eVar) {
        this.musicModel = eVar;
        return this;
    }

    public RecordScene musicPath(String str) {
        this.musicPath = str;
        return this;
    }

    public RecordScene musicStart(int i) {
        this.musicStart = i;
        return this;
    }

    public RecordScene reactionParams(i iVar) {
        this.reactionParams = iVar;
        return this;
    }

    public RecordScene recordMode(@ExternalAVConstants.RecordMode int i) {
        this.recordMode = i;
        return this;
    }

    public static ArrayList<TimeSpeedModelExtension> string2TimeSpeedModels(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 77650, new Class[]{String.class}, ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 77650, new Class[]{String.class}, ArrayList.class);
        }
        try {
            return string2TimeSpeedModelsNew(str);
        } catch (Exception unused) {
            return string2TimeSpeedModelsOld(str);
        }
    }

    public RecordScene videoSegment(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 77654, new Class[]{String.class}, RecordScene.class)) {
            return (RecordScene) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 77654, new Class[]{String.class}, RecordScene.class);
        }
        this.videoSegments = string2TimeSpeedModels(str);
        return this;
    }

    public static String challenge2str(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, null, changeQuickRedirect, true, 77664, new Class[]{c.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{cVar}, null, changeQuickRedirect, true, 77664, new Class[]{c.class}, String.class);
        } else if (cVar == null) {
            return "";
        } else {
            return SimpleAVChallenge.serializeToStr(SimpleAVChallenge.fromAVChallenge(cVar));
        }
    }

    public static ah getCherEffectParam(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 77658, new Class[]{String.class}, ah.class)) {
            return (ah) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 77658, new Class[]{String.class}, ah.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            try {
                return (ah) a.f61120c.fromJson(str2, ah.class);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Nullable
    public static String getFirstStickerMusicIds(ArrayList<TimeSpeedModelExtension> arrayList) {
        ArrayList<TimeSpeedModelExtension> arrayList2 = arrayList;
        if (PatchProxy.isSupport(new Object[]{arrayList2}, null, changeQuickRedirect, true, 77661, new Class[]{ArrayList.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{arrayList2}, null, changeQuickRedirect, true, 77661, new Class[]{ArrayList.class}, String.class);
        } else if (CollectionUtils.isEmpty(arrayList)) {
            return null;
        } else {
            List stickerMusicIds = arrayList2.get(0).getStickerMusicIds();
            if (CollectionUtils.isEmpty(stickerMusicIds)) {
                return null;
            }
            return a.f61120c.toJson((Object) stickerMusicIds);
        }
    }

    public static String getPropSourceByModel(ArrayList<TimeSpeedModelExtension> arrayList) {
        if (PatchProxy.isSupport(new Object[]{arrayList}, null, changeQuickRedirect, true, 77660, new Class[]{ArrayList.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{arrayList}, null, changeQuickRedirect, true, 77660, new Class[]{ArrayList.class}, String.class);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<TimeSpeedModelExtension> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            TimeSpeedModelExtension next = it2.next();
            if (!next.getPropSource().isEmpty()) {
                arrayList2.add(next.getPropSource());
            }
        }
        arrayList2.removeAll(Collections.singleton(null));
        return join(arrayList2, ",");
    }

    public static String getStickerIdsByModel(ArrayList<TimeSpeedModelExtension> arrayList) {
        if (PatchProxy.isSupport(new Object[]{arrayList}, null, changeQuickRedirect, true, 77659, new Class[]{ArrayList.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{arrayList}, null, changeQuickRedirect, true, 77659, new Class[]{ArrayList.class}, String.class);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<TimeSpeedModelExtension> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().getStickerId());
        }
        arrayList2.removeAll(Collections.singleton(null));
        return join(arrayList2, ",");
    }

    public static boolean isChangeSpeed(ArrayList<TimeSpeedModelExtension> arrayList) {
        if (PatchProxy.isSupport(new Object[]{arrayList}, null, changeQuickRedirect, true, 77649, new Class[]{ArrayList.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{arrayList}, null, changeQuickRedirect, true, 77649, new Class[]{ArrayList.class}, Boolean.TYPE)).booleanValue();
        } else if (CollectionUtils.isEmpty(arrayList)) {
            return false;
        } else {
            Iterator<TimeSpeedModelExtension> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                TimeSpeedModelExtension next = it2.next();
                if (0.6d <= next.getSpeed()) {
                    if (next.getSpeed() > 1.5d) {
                    }
                }
                return true;
            }
            return false;
        }
    }

    public static i string2ReactionParams(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 77651, new Class[]{String.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 77651, new Class[]{String.class}, i.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            return (i) a.f61120c.fromJson(str2, i.class);
        }
    }

    private static ArrayList<TimeSpeedModelExtension> string2TimeSpeedModelsNew(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 77652, new Class[]{String.class}, ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 77652, new Class[]{String.class}, ArrayList.class);
        }
        ArrayList arrayList = (ArrayList) a.f61120c.fromJson(str2, new TypeToken<ArrayList<JsonObject>>() {
        }.getType());
        ArrayList<TimeSpeedModelExtension> arrayList2 = new ArrayList<>(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(TimeSpeedModelExtension.fromJson((JsonObject) it2.next()));
        }
        return arrayList2;
    }

    public static String timeSpeedModels2String(ArrayList<TimeSpeedModelExtension> arrayList) {
        if (PatchProxy.isSupport(new Object[]{arrayList}, null, changeQuickRedirect, true, 77647, new Class[]{ArrayList.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{arrayList}, null, changeQuickRedirect, true, 77647, new Class[]{ArrayList.class}, String.class);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<TimeSpeedModelExtension> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().toJson());
        }
        return new GsonBuilder().serializeNulls().create().toJson((Object) arrayList2);
    }

    public static String getSpeedStringByModel(ArrayList<TimeSpeedModelExtension> arrayList) {
        if (PatchProxy.isSupport(new Object[]{arrayList}, null, changeQuickRedirect, true, 77648, new Class[]{ArrayList.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{arrayList}, null, changeQuickRedirect, true, 77648, new Class[]{ArrayList.class}, String.class);
        } else if (CollectionUtils.isEmpty(arrayList)) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder();
            Iterator<TimeSpeedModelExtension> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                TimeSpeedModelExtension next = it2.next();
                if (next.getSpeed() > 0.2d && next.getSpeed() < 0.4d) {
                    sb.append("1,");
                } else if (next.getSpeed() > 0.4d && next.getSpeed() < 0.6d) {
                    sb.append("2,");
                } else if (0.6d < next.getSpeed() && next.getSpeed() < 1.5d) {
                    sb.append("3,");
                } else if (next.getSpeed() == 1.5d) {
                    sb.append("6,");
                } else if (1.5d < next.getSpeed() && next.getSpeed() < 2.5d) {
                    sb.append("4,");
                } else if (2.5d < next.getSpeed() && next.getSpeed() < 3.5d) {
                    sb.append("5,");
                }
            }
            String sb2 = sb.toString();
            return sb2.substring(0, sb2.length() - 1);
        }
    }

    private static ArrayList<TimeSpeedModelExtension> string2TimeSpeedModelsOld(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 77653, new Class[]{String.class}, ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 77653, new Class[]{String.class}, ArrayList.class);
        }
        ArrayList<TimeSpeedModelExtension> arrayList = new ArrayList<>();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        String[] split = str2.split("\\$");
        if (split.length > 0) {
            for (String split2 : split) {
                String[] split3 = split2.split(",");
                if (split3.length == 2) {
                    try {
                        TimeSpeedModelExtension timeSpeedModelExtension = new TimeSpeedModelExtension(Integer.parseInt(split3[0]), (double) Float.parseFloat(split3[1]), null, null, null);
                        arrayList.add(timeSpeedModelExtension);
                    } catch (Exception unused) {
                    }
                }
                if (split3.length == 3) {
                    try {
                        TimeSpeedModelExtension timeSpeedModelExtension2 = new TimeSpeedModelExtension(Integer.parseInt(split3[0]), (double) Float.parseFloat(split3[1]), split3[2], null, null);
                        arrayList.add(timeSpeedModelExtension2);
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        return arrayList;
    }

    public static String join(List<String> list, String str) {
        String str2 = str;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{list, str2}, null, changeQuickRedirect, true, 77662, new Class[]{List.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{list, str2}, null, changeQuickRedirect, true, 77662, new Class[]{List.class, String.class}, String.class);
        }
        StringBuilder sb = new StringBuilder();
        for (String next : list) {
            if (z) {
                z = false;
            } else {
                sb.append(str2);
            }
            sb.append(next);
        }
        return sb.toString();
    }
}
