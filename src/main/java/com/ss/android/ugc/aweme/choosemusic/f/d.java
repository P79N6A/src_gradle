package com.ss.android.ugc.aweme.choosemusic.f;

import android.support.annotation.NonNull;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.util.c;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.ex;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35901a;

    @NonNull
    public static String a(int i) {
        return i == 0 ? "popular_song" : i == 3 ? "song_category" : i == 2 ? "search_result" : "";
    }

    public static boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f35901a, true, 26788, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f35901a, true, 26788, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!ex.b() && AbTestManager.a().aA() == 2) {
            z = true;
        }
        return z;
    }

    public static boolean b() {
        int i;
        if (PatchProxy.isSupport(new Object[0], null, f35901a, true, 26789, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f35901a, true, 26789, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestManager a2 = AbTestManager.a();
        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71843, new Class[0], Integer.TYPE)) {
            i = ((Integer) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71843, new Class[0], Integer.TYPE)).intValue();
        } else {
            AbTestModel d2 = a2.d();
            if (d2 == null) {
                i = 0;
            } else {
                i = d2.musicListType2;
            }
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    public static List<MusicModel> b(List<Music> list) {
        if (PatchProxy.isSupport(new Object[]{list}, null, f35901a, true, 26786, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, null, f35901a, true, 26786, new Class[]{List.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        for (Music next : list) {
            if (next != null) {
                MusicModel a2 = c.f56796b.a(next);
                a2.setChallengeUserCount(next.getUserCount());
                a2.setChallengeMusic(true);
                a2.setDataType(0);
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public static List<MusicModel> a(List<Music> list) {
        if (PatchProxy.isSupport(new Object[]{list}, null, f35901a, true, 26785, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, null, f35901a, true, 26785, new Class[]{List.class}, List.class);
        } else if (list == null) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Music next : list) {
                if (next != null) {
                    arrayList.add(c.f56796b.a(next));
                }
            }
            return arrayList;
        }
    }

    public static MusicModel a(List<MusicModel> list, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{list, str2}, null, f35901a, true, 26790, new Class[]{List.class, String.class}, MusicModel.class)) {
            return (MusicModel) PatchProxy.accessDispatch(new Object[]{list, str2}, null, f35901a, true, 26790, new Class[]{List.class, String.class}, MusicModel.class);
        } else if (CollectionUtils.isEmpty(list)) {
            return null;
        } else {
            for (MusicModel next : list) {
                if (next != null && StringUtils.equal(next.getMusicId(), str2)) {
                    return next;
                }
            }
            return null;
        }
    }
}
