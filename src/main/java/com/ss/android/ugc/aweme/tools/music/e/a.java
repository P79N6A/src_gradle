package com.ss.android.ugc.aweme.tools.music.e;

import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.aichoosemusic.AIChooseMusicManager;
import com.ss.android.ugc.aweme.tools.music.f.e;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74880a;

    /* renamed from: d  reason: collision with root package name */
    private static a f74881d;
    @SerializedName("frame_count")

    /* renamed from: b  reason: collision with root package name */
    public int f74882b;
    @SerializedName("song_url_list")

    /* renamed from: c  reason: collision with root package name */
    public List<String> f74883c;

    @Nullable
    public static a a() {
        return f74881d;
    }

    public static void b() {
        String str;
        if (PatchProxy.isSupport(new Object[0], null, f74880a, true, 87233, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f74880a, true, 87233, new Class[0], Void.TYPE);
            return;
        }
        try {
            if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.tools.music.a.a.f74779a, true, 87140, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.tools.music.a.a.f74779a, true, 87140, new Class[0], String.class);
            } else {
                str = com.ss.android.ugc.aweme.tools.music.a.a.f74780b.getString("ai_music_setting", "");
            }
            if (!TextUtils.isEmpty(str)) {
                f74881d = (a) e.a().fromJson(str, a.class);
            }
        } catch (Exception unused) {
        }
        AIChooseMusicManager.h().c();
    }

    public static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f74880a, true, 87232, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f74880a, true, 87232, new Class[]{String.class}, Void.TYPE);
            return;
        }
        try {
            f74881d = (a) e.a().fromJson(str2, a.class);
            if (PatchProxy.isSupport(new Object[]{str2}, null, com.ss.android.ugc.aweme.tools.music.a.a.f74779a, true, 87139, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2}, null, com.ss.android.ugc.aweme.tools.music.a.a.f74779a, true, 87139, new Class[]{String.class}, Void.TYPE);
            } else {
                SharedPreferences.Editor edit = com.ss.android.ugc.aweme.tools.music.a.a.f74780b.edit();
                edit.putString("ai_music_setting", str2);
                edit.commit();
            }
        } catch (Exception unused) {
        }
        AIChooseMusicManager.h().c();
    }
}
