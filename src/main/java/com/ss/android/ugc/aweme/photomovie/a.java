package com.ss.android.ugc.aweme.photomovie;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.utils.bk;
import com.ss.android.ugc.aweme.video.b;
import com.ss.android.ugc.b.c;
import java.io.File;
import java.util.ArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58868a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f58869b = (b() + com.ss.android.ugc.b.a.b("music_photo_movie_default.mp3"));

    /* renamed from: c  reason: collision with root package name */
    private static final String f58870c = b();

    private static String b() {
        if (PatchProxy.isSupport(new Object[0], null, f58868a, true, 63904, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f58868a, true, 63904, new Class[0], String.class);
        }
        String b2 = c.a().b();
        if (!b2.endsWith("/")) {
            b2 = b2 + File.separator;
        }
        return b2;
    }

    @NonNull
    public static Music a() {
        if (PatchProxy.isSupport(new Object[0], null, f58868a, true, 63905, new Class[0], Music.class)) {
            return (Music) PatchProxy.accessDispatch(new Object[0], null, f58868a, true, 63905, new Class[0], Music.class);
        }
        if (!b.b(f58869b)) {
            bk.a(GlobalContext.getContext(), "music_photo_movie_default.mp3", com.ss.android.ugc.b.a.b("music_photo_movie_default.mp3"), f58870c);
        }
        Music music = new Music();
        music.setMusicName("PLANET");
        music.setMid("6507141718198029069");
        music.setAuthorName("ラムジ");
        UrlModel urlModel = new UrlModel();
        ArrayList arrayList = new ArrayList();
        urlModel.setUri("asset:///ic_photo_movie_default.png");
        arrayList.add("asset:///ic_photo_movie_default.png");
        urlModel.setUrlList(arrayList);
        music.setCoverThumb(urlModel);
        UrlModel urlModel2 = new UrlModel();
        ArrayList arrayList2 = new ArrayList();
        urlModel2.setUri("asset:///ic_photo_movie_default.png");
        arrayList2.add("asset:///ic_photo_movie_default.png");
        urlModel2.setUrlList(arrayList2);
        music.setCoverMedium(urlModel2);
        UrlModel urlModel3 = new UrlModel();
        ArrayList arrayList3 = new ArrayList();
        urlModel3.setUri("music_photo_movie_default.mp3");
        arrayList3.add("music_photo_movie_default.mp3");
        urlModel3.setUrlList(arrayList3);
        music.setPlayUrl(urlModel3);
        return music;
    }
}
