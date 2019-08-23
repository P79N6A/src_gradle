package com.ss.android.ugc.aweme.music.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.e;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56797a = null;

    /* renamed from: b  reason: collision with root package name */
    public static String f56798b = null;

    /* renamed from: c  reason: collision with root package name */
    static int f56799c = 0;

    /* renamed from: d  reason: collision with root package name */
    private static final String f56800d = "d";

    /* renamed from: e  reason: collision with root package name */
    private static final Uri f56801e = Uri.parse("content://media/external/audio/albumart");

    public static String a() {
        return f56798b;
    }

    public static boolean a(MusicModel musicModel, Context context, boolean z) {
        boolean z2;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{musicModel, context2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f56797a, true, 60613, new Class[]{MusicModel.class, Context.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{musicModel, context2, Byte.valueOf(z)}, null, f56797a, true, 60613, new Class[]{MusicModel.class, Context.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (musicModel == null || !TextUtils.isEmpty(musicModel.getPath())) {
            try {
                z2 = g.b().w().booleanValue();
            } catch (a unused) {
                z2 = false;
            }
            if ((!z2 || musicModel == null || musicModel.getMusicType() != MusicModel.MusicType.BAIDU) && (musicModel == null || musicModel.getMusicStatus() != 0)) {
                return true;
            }
            String offlineDesc = musicModel.getOfflineDesc();
            if (TextUtils.isEmpty(offlineDesc)) {
                offlineDesc = context2.getString(C0906R.string.bel);
            }
            String str = offlineDesc;
            if (z) {
                com.bytedance.ies.dmt.ui.d.a.b(context2, str).a();
            }
            return false;
        } else {
            com.bytedance.ies.dmt.ui.d.a.b(context2, context2.getString(C0906R.string.beo)).a();
            return false;
        }
    }

    public static boolean a(e eVar, Context context, boolean z) {
        boolean z2;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{eVar, context2, (byte) 1}, null, f56797a, true, 60614, new Class[]{e.class, Context.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{eVar, context2, (byte) 1}, null, f56797a, true, 60614, new Class[]{e.class, Context.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (eVar == null || !TextUtils.isEmpty(eVar.getPath())) {
            try {
                z2 = g.b().w().booleanValue();
            } catch (a unused) {
                z2 = false;
            }
            if ((!z2 || eVar == null || eVar.getMusicType() != MusicModel.MusicType.BAIDU.ordinal()) && (eVar == null || eVar.getMusicStatus() != 0)) {
                return true;
            }
            String offlineDesc = eVar.getOfflineDesc();
            if (TextUtils.isEmpty(offlineDesc)) {
                offlineDesc = context2.getString(C0906R.string.bel);
            }
            com.bytedance.ies.dmt.ui.d.a.b(context2, offlineDesc).a();
            return false;
        } else {
            com.bytedance.ies.dmt.ui.d.a.b(context2, context2.getString(C0906R.string.beo)).a();
            return false;
        }
    }

    public static List<com.ss.android.ugc.aweme.music.adapter.type.d> a(List<Music> list, List<com.ss.android.ugc.aweme.music.adapter.type.d> list2) {
        List<com.ss.android.ugc.aweme.music.adapter.type.d> list3 = list2;
        if (PatchProxy.isSupport(new Object[]{list, list3}, null, f56797a, true, 60615, new Class[]{List.class, List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list, list3}, null, f56797a, true, 60615, new Class[]{List.class, List.class}, List.class);
        } else if (j.a((Collection<T>) list)) {
            return list3;
        } else {
            for (Music next : list) {
                if (next != null) {
                    MusicModel a2 = c.f56796b.a(next);
                    a2.setDataType(1);
                    list3.add(a2);
                }
            }
            return list3;
        }
    }

    public static List<com.ss.android.ugc.aweme.music.adapter.type.d> a(Map<String, List<com.ss.android.ugc.aweme.music.adapter.type.d>> map) {
        if (PatchProxy.isSupport(new Object[]{map}, null, f56797a, true, 60616, new Class[]{Map.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{map}, null, f56797a, true, 60616, new Class[]{Map.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<com.ss.android.ugc.aweme.music.adapter.type.d>> value : map.entrySet()) {
            arrayList.addAll((Collection) value.getValue());
        }
        return arrayList;
    }

    public static boolean a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f56797a, true, 60620, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f56797a, true, 60620, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null) {
            return true;
        } else {
            Music music = aweme.getMusic();
            User author = aweme.getAuthor();
            return aweme.isLawCriticalCountry() && music != null && author != null && !TextUtils.isEmpty(music.getOwnerId()) && TextUtils.equals(music.getOwnerId(), author.getUid());
        }
    }

    public static void a(Activity activity, int i) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, 1}, null, f56797a, true, 60624, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, 1}, null, f56797a, true, 60624, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(activity2, MusicDetailListActivity.class);
        intent.putExtra("music_type", 3);
        activity2.startActivityForResult(intent, 1);
    }

    public static void b() {
        if (PatchProxy.isSupport(new Object[0], null, f56797a, true, 60625, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f56797a, true, 60625, new Class[0], Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String stackTraceString = Log.getStackTraceString(new Throwable());
            if (stackTraceString.length() > 1024) {
                stackTraceString = stackTraceString.substring(0, 1024);
            }
            jSONObject.put("error_stack", stackTraceString);
        } catch (Exception unused) {
        }
        n.a("music_id_empty", jSONObject);
    }

    public static long a(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f56797a, true, 60617, new Class[]{String.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{str2}, null, f56797a, true, 60617, new Class[]{String.class}, Long.TYPE)).longValue();
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str2);
            return (long) Float.valueOf(mediaMetadataRetriever.extractMetadata(9)).floatValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    private static String c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f56797a, true, 60619, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, f56797a, true, 60619, new Class[]{String.class}, String.class);
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f56797a, true, 60626, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f56797a, true, 60626, new Class[]{String.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String stackTraceString = Log.getStackTraceString(new Throwable());
            if (stackTraceString.length() > 1024) {
                stackTraceString = stackTraceString.substring(0, 1024);
            }
            jSONObject.put("error_stack", stackTraceString);
            jSONObject.put("music_id", str2);
        } catch (Exception unused) {
        }
        n.a("music_id_has_space", jSONObject);
    }

    public static String a(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f56797a, true, 60611, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f56797a, true, 60611, new Class[]{Integer.TYPE}, String.class);
        } else if (i2 <= 0) {
            return "";
        } else {
            int i3 = i2 / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
            int i4 = i3 % 60;
            int i5 = i3 / 60;
            int i6 = i5 / 60;
            int i7 = i5 % 60;
            if (i6 == 0) {
                return String.format(Locale.CHINA, "%02d:%02d", new Object[]{Integer.valueOf(i7), Integer.valueOf(i4)});
            }
            return String.format(Locale.CHINA, "%02d:%02d:%02d", new Object[]{Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i4)});
        }
    }

    public static HashMap<String, String> a(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f56797a, true, 60621, new Class[]{Boolean.TYPE}, HashMap.class)) {
            return new HashMap<>();
        }
        return (HashMap) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f56797a, true, 60621, new Class[]{Boolean.TYPE}, HashMap.class);
    }

    public static Music a(List<Music> list, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{list, str2}, null, f56797a, true, 60612, new Class[]{List.class, String.class}, Music.class)) {
            return (Music) PatchProxy.accessDispatch(new Object[]{list, str2}, null, f56797a, true, 60612, new Class[]{List.class, String.class}, Music.class);
        } else if (CollectionUtils.isEmpty(list)) {
            return null;
        } else {
            for (Music next : list) {
                if (next != null && StringUtils.equal(next.getMid(), str2)) {
                    return next;
                }
            }
            return null;
        }
    }

    public static List<MusicModel> a(Context context, List<MusicModel> list) {
        boolean z;
        String str;
        List<MusicModel> list2 = list;
        if (PatchProxy.isSupport(new Object[]{context, list2}, null, f56797a, true, 60608, new Class[]{Context.class, List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{context, list2}, null, f56797a, true, 60608, new Class[]{Context.class, List.class}, List.class);
        } else if (context == null) {
            return new ArrayList();
        } else {
            list.clear();
            Cursor query = context.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "is_music", PushConstants.TITLE, "artist", "album", "album_id", "_data", "_display_name", "_size", "duration"}, null, null, "title_key");
            if (query == null) {
                return list2;
            }
            while (query.moveToNext()) {
                int i = query.getInt(query.getColumnIndex("is_music"));
                if (PatchProxy.isSupport(new Object[0], null, f56797a, true, 60618, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f56797a, true, 60618, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    String c2 = c("ro.build.display.id");
                    if (TextUtils.isEmpty(c2) || !c2.toLowerCase().contains("flyme")) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (z || i != 0) {
                    query.getLong(query.getColumnIndex("_id"));
                    String string = query.getString(query.getColumnIndex(PushConstants.TITLE));
                    String string2 = query.getString(query.getColumnIndex("artist"));
                    String string3 = query.getString(query.getColumnIndex("album"));
                    query.getLong(query.getColumnIndex("album_id"));
                    long j = query.getLong(query.getColumnIndex("duration"));
                    String string4 = query.getString(query.getColumnIndex("_data"));
                    query.getString(query.getColumnIndex("_display_name"));
                    query.getLong(query.getColumnIndex("_size"));
                    if (((IAVService) ServiceManager.get().getService(IAVService.class)).getSDKService().checkAudioFile(string4) >= 0 && j > 10000 && j < 600000) {
                        MusicModel musicModel = new MusicModel();
                        musicModel.setName(string);
                        musicModel.setMusicStatus(1);
                        musicModel.setAlbum(string3);
                        if (TextUtils.equals("<unknown>", string2)) {
                            string2 = "未知";
                        }
                        musicModel.setSinger(string2);
                        musicModel.setPath(string4);
                        musicModel.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
                        musicModel.setMusicType(MusicModel.MusicType.LOCAL);
                        if (PatchProxy.isSupport(new Object[]{new Long(j)}, null, f56797a, true, 60610, new Class[]{Long.TYPE}, String.class)) {
                            str = (String) PatchProxy.accessDispatch(new Object[]{new Long(j)}, null, f56797a, true, 60610, new Class[]{Long.TYPE}, String.class);
                        } else if (j <= 0) {
                            str = "";
                        } else {
                            long j2 = j / 1000;
                            long j3 = j2 % 60;
                            long j4 = j2 / 60;
                            long j5 = j4 / 60;
                            long j6 = j4 % 60;
                            if (0 == j5) {
                                str = String.format(Locale.CHINA, "%02d:%02d", new Object[]{Long.valueOf(j6), Long.valueOf(j3)});
                            } else {
                                str = String.format(Locale.CHINA, "%02d:%02d:%02d", new Object[]{Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j3)});
                            }
                        }
                        musicModel.setLocalMusicDuration(str);
                        musicModel.setDataType(1);
                        list2.add(musicModel);
                    }
                }
            }
            query.close();
            return list2;
        }
    }
}
