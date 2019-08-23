package com.ss.ttm.player;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class MediaFormat {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Map<String, Object> mMap;

    public final Map<String, Object> getValues() {
        return this.mMap;
    }

    public MediaFormat() {
        this.mMap = new HashMap();
    }

    public final String toString() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90679, new Class[0], String.class)) {
            return this.mMap.toString();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90679, new Class[0], String.class);
    }

    public MediaFormat(Map<String, Object> map) {
        this.mMap = map;
    }

    public static final MediaFormat createAudioFormat(android.media.MediaFormat mediaFormat) {
        android.media.MediaFormat mediaFormat2 = mediaFormat;
        if (PatchProxy.isSupport(new Object[]{mediaFormat2}, null, changeQuickRedirect, true, 90676, new Class[]{android.media.MediaFormat.class}, MediaFormat.class)) {
            return (MediaFormat) PatchProxy.accessDispatch(new Object[]{mediaFormat2}, null, changeQuickRedirect, true, 90676, new Class[]{android.media.MediaFormat.class}, MediaFormat.class);
        } else if (mediaFormat2 == null) {
            return null;
        } else {
            return createAudioFormat(mediaFormat2.getInteger("track-id"), mediaFormat2.getInteger("sample-rate"), mediaFormat2.getInteger("channel-count"));
        }
    }

    public static final MediaFormat createVideoFormat(android.media.MediaFormat mediaFormat) {
        android.media.MediaFormat mediaFormat2 = mediaFormat;
        if (PatchProxy.isSupport(new Object[]{mediaFormat2}, null, changeQuickRedirect, true, 90678, new Class[]{android.media.MediaFormat.class}, MediaFormat.class)) {
            return (MediaFormat) PatchProxy.accessDispatch(new Object[]{mediaFormat2}, null, changeQuickRedirect, true, 90678, new Class[]{android.media.MediaFormat.class}, MediaFormat.class);
        } else if (mediaFormat2 == null) {
            return null;
        } else {
            return createVideoFormat(mediaFormat2.getInteger("track-id"), mediaFormat2.getInteger("width"), mediaFormat2.getInteger("height"), mediaFormat2.getInteger("bitrate"));
        }
    }

    public final float getFloat(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 90664, new Class[]{String.class}, Float.TYPE)) {
            return ((Float) this.mMap.get(str2)).floatValue();
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 90664, new Class[]{String.class}, Float.TYPE)).floatValue();
    }

    public final int getInteger(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 90662, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) this.mMap.get(str2)).intValue();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 90662, new Class[]{String.class}, Integer.TYPE)).intValue();
    }

    public final long getLong(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 90663, new Class[]{String.class}, Long.TYPE)) {
            return ((Long) this.mMap.get(str2)).longValue();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 90663, new Class[]{String.class}, Long.TYPE)).longValue();
    }

    public final String getString(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 90665, new Class[]{String.class}, String.class)) {
            return (String) this.mMap.get(str2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 90665, new Class[]{String.class}, String.class);
    }

    public static final MediaFormat createSubtitleFormat(android.media.MediaFormat mediaFormat) {
        android.media.MediaFormat mediaFormat2 = mediaFormat;
        if (PatchProxy.isSupport(new Object[]{mediaFormat2}, null, changeQuickRedirect, true, 90677, new Class[]{android.media.MediaFormat.class}, MediaFormat.class)) {
            return (MediaFormat) PatchProxy.accessDispatch(new Object[]{mediaFormat2}, null, changeQuickRedirect, true, 90677, new Class[]{android.media.MediaFormat.class}, MediaFormat.class);
        } else if (mediaFormat2 == null) {
            return null;
        } else {
            return createSubtitleFormat(mediaFormat2.getInteger("track-id"), mediaFormat2.getString("language"));
        }
    }

    public static final MediaFormat createAudioFormat(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, changeQuickRedirect, true, 90673, new Class[]{JSONObject.class}, MediaFormat.class)) {
            return (MediaFormat) PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, changeQuickRedirect, true, 90673, new Class[]{JSONObject.class}, MediaFormat.class);
        } else if (jSONObject2 == null) {
            return null;
        } else {
            return createAudioFormat(jSONObject2.optInt("track-id"), jSONObject2.optInt("sample-rate"), jSONObject2.optInt("channel-count"));
        }
    }

    public static final MediaFormat createSubtitleFormat(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, changeQuickRedirect, true, 90674, new Class[]{JSONObject.class}, MediaFormat.class)) {
            return (MediaFormat) PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, changeQuickRedirect, true, 90674, new Class[]{JSONObject.class}, MediaFormat.class);
        } else if (jSONObject2 == null) {
            return null;
        } else {
            return createSubtitleFormat(jSONObject2.optInt("track-id"), jSONObject2.optString("language"));
        }
    }

    public static final MediaFormat createVideoFormat(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, changeQuickRedirect, true, 90675, new Class[]{JSONObject.class}, MediaFormat.class)) {
            return (MediaFormat) PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, changeQuickRedirect, true, 90675, new Class[]{JSONObject.class}, MediaFormat.class);
        } else if (jSONObject2 == null) {
            return null;
        } else {
            return createVideoFormat(jSONObject2.optInt("track-id"), jSONObject2.optInt("width"), jSONObject2.optInt("height"), jSONObject2.optInt("bitrate"));
        }
    }

    public static final MediaFormat createSubtitleFormat(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, null, changeQuickRedirect, true, 90671, new Class[]{Integer.TYPE, String.class}, MediaFormat.class)) {
            return (MediaFormat) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, null, changeQuickRedirect, true, 90671, new Class[]{Integer.TYPE, String.class}, MediaFormat.class);
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setInteger("track-id", i);
        mediaFormat.setString("language", str2);
        return mediaFormat;
    }

    public final void setFloat(String str, float f2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Float.valueOf(f2)}, this, changeQuickRedirect, false, 90668, new Class[]{String.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Float.valueOf(f2)}, this, changeQuickRedirect, false, 90668, new Class[]{String.class, Float.TYPE}, Void.TYPE);
            return;
        }
        this.mMap.put(str2, Float.valueOf(f2));
    }

    public final void setInteger(String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90666, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90666, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mMap.put(str2, Integer.valueOf(i));
    }

    public final void setLong(String str, long j) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, changeQuickRedirect, false, 90667, new Class[]{String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, changeQuickRedirect, false, 90667, new Class[]{String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        this.mMap.put(str2, Long.valueOf(j));
    }

    public final void setString(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, changeQuickRedirect, false, 90669, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, changeQuickRedirect, false, 90669, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        this.mMap.put(str3, str4);
    }

    public static final MediaFormat createAudioFormat(int i, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, changeQuickRedirect, true, 90670, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, MediaFormat.class)) {
            return (MediaFormat) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, changeQuickRedirect, true, 90670, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, MediaFormat.class);
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setInteger("track-id", i);
        mediaFormat.setInteger("sample-rate", i2);
        mediaFormat.setInteger("channel-count", i3);
        return mediaFormat;
    }

    public static final MediaFormat createVideoFormat(int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, null, changeQuickRedirect, true, 90672, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, MediaFormat.class)) {
            return (MediaFormat) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, null, changeQuickRedirect, true, 90672, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, MediaFormat.class);
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setInteger("track-id", i);
        mediaFormat.setInteger("width", i2);
        mediaFormat.setInteger("height", i3);
        mediaFormat.setInteger("bitrate", i4);
        return mediaFormat;
    }
}
