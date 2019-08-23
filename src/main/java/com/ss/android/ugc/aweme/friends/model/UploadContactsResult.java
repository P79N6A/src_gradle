package com.ss.android.ugc.aweme.friends.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public class UploadContactsResult extends BaseResponse {
    @SerializedName("unregistered_contact")
    public List<ContactModel> contacts;
    @SerializedName("registered_user")
    public List<User> users;
}
