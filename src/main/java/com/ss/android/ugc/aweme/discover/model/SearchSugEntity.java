package com.ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.util.List;
import java.util.Map;

public class SearchSugEntity {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("content")
    public String content;
    public Map<String, String> extraParam;
    public boolean isMobShow;
    @SerializedName("word_record")
    public Word mWord;
    @SerializedName("pos")
    public List<Position> position;
    @SerializedName("sug_type")
    public String sugType;
    @SerializedName("sug_user")
    public SearchUser sugUser;

    public boolean isUserType() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37124, new Class[0], Boolean.TYPE)) {
            return TextUtils.equals(this.sugType, AllStoryActivity.f73306b);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37124, new Class[0], Boolean.TYPE)).booleanValue();
    }
}
