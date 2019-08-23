package com.ss.android.ugc.aweme.story.feed.view.profile;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Keep
public class ProfileEntityList implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("followers")
    private List<ProfileEntity> profileEntities = new ArrayList();

    public List<ProfileEntity> getProfileEntities() {
        return this.profileEntities;
    }
}
