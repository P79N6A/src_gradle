package com.ss.android.ugc.aweme.x;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class a implements Serializable {
    @SerializedName("mv_contact_video_path")
    public String contactVideoPath;
    @SerializedName("mv_video_music_ids")
    public List<String> musicIds;
    @SerializedName("mv_video_res_unzippath")
    public String mvResUnzipPath;
    @SerializedName("mv_res_zippath")
    public String mvResZipPath;
    @SerializedName("mv_type")
    public int mvType;
    @SerializedName("select_media_list")
    public ArrayList<String> selectMediaList = new ArrayList<>();
    @SerializedName("select_src_media_list")
    public ArrayList<String> srcSelectMediaList = new ArrayList<>();
    @SerializedName("mv_video_cover")
    public String videoCoverImgPath;
    @SerializedName("mv_video_cover_starttime")
    public int videoCoverStartTime;
}
