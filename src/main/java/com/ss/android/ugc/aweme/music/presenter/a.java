package com.ss.android.ugc.aweme.music.presenter;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.i;
import com.ss.android.ugc.aweme.music.model.AwemeSearchMusicList;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.util.c;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56341a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f56342b;

    /* renamed from: c  reason: collision with root package name */
    private long f56343c;

    public final ArrayList<MusicModel> a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f56341a, false, 60017, new Class[]{String.class}, ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[]{str}, this, f56341a, false, 60017, new Class[]{String.class}, ArrayList.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            try {
                AwemeSearchMusicList awemeSearchMusicList = (AwemeSearchMusicList) JSON.parseObject(str, AwemeSearchMusicList.class);
                if (awemeSearchMusicList != null) {
                    this.f56343c = (long) awemeSearchMusicList.cursor;
                    List<Music> list = awemeSearchMusicList.musicList;
                    if (list != null) {
                        ArrayList<MusicModel> arrayList = new ArrayList<>();
                        for (Music a2 : list) {
                            MusicModel a3 = c.f56796b.a(a2);
                            if (a3 != null) {
                                arrayList.add(a3);
                            }
                            a3.setLogPb(awemeSearchMusicList.logPb);
                        }
                        this.f56342b = awemeSearchMusicList.isHasMore();
                        return arrayList;
                    }
                }
            } catch (Exception unused) {
            }
            return null;
        }
    }

    public final String a(String str, boolean z, String str2) {
        String str3;
        String str4 = str;
        String str5 = str2;
        if (PatchProxy.isSupport(new Object[]{str4, Byte.valueOf(z ? (byte) 1 : 0), str5}, this, f56341a, false, 60016, new Class[]{String.class, Boolean.TYPE, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str4, Byte.valueOf(z), str5}, this, f56341a, false, 60016, new Class[]{String.class, Boolean.TYPE, String.class}, String.class);
        }
        if (!z) {
            try {
                this.f56343c = 0;
            } catch (Exception unused) {
                return null;
            }
        }
        long j = this.f56343c;
        if (PatchProxy.isSupport(new Object[]{str4, new Long(j), str5}, null, com.ss.android.ugc.aweme.music.api.a.f56300a, true, 59986, new Class[]{String.class, Long.TYPE, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str4, new Long(j), str5}, null, com.ss.android.ugc.aweme.music.api.a.f56300a, true, 59986, new Class[]{String.class, Long.TYPE, String.class}, String.class);
        }
        i iVar = new i("https://aweme.snssdk.com/aweme/v1/music/search/");
        iVar.a("cursor", j);
        iVar.a("count", 8);
        iVar.a("keyword", str4);
        if (com.ss.android.g.a.b()) {
            str3 = "[71,74]";
        } else {
            str3 = "[22]";
        }
        iVar.a("source_platforms", str3);
        iVar.a("search_source", str5);
        return iVar.toString();
    }
}
