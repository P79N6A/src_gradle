package com.ss.android.ugc.aweme.services.music;

import a.i;
import com.ss.android.ugc.aweme.music.a;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.ui.c;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import java.util.List;

public interface IMusicService {

    public interface MusicCallback<T1, T2> {
        void run(T1 t1, T2 t2);
    }

    Music getDefaultMusic();

    Music getMusicDetail(String str, int i);

    a provideMusicDownloadPlayHelper(c cVar);

    i<List<MusicModel>> refreshHotMusicList();

    i<SuggestMusicList> refreshSuggestList(String str, String str2);

    i<CollectedMusicList> userCollectedMusicList(int i, int i2);
}
