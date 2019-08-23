package com.ss.android.ugc.aweme.choosemusic.d;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import java.util.List;

public class v extends BaseResponse {
    @SerializedName("banner_list")

    /* renamed from: a  reason: collision with root package name */
    public List<Banner> f35865a;
    @SerializedName("mc_list")

    /* renamed from: b  reason: collision with root package name */
    public List<MusicCollectionItem> f35866b;
    @SerializedName("music_list")

    /* renamed from: c  reason: collision with root package name */
    public List<Music> f35867c;
    @SerializedName("extra_music_list")

    /* renamed from: d  reason: collision with root package name */
    public List<Music> f35868d;
    @SerializedName("music_list_type")

    /* renamed from: e  reason: collision with root package name */
    public int f35869e;
    @SerializedName("radio_cursor")

    /* renamed from: f  reason: collision with root package name */
    public int f35870f;
}
