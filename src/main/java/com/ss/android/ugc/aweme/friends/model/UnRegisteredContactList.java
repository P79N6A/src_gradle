package com.ss.android.ugc.aweme.friends.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class UnRegisteredContactList {
    @SerializedName("unregistered_user")
    public List<ContactModel> contacts;
    @SerializedName("status_code")
    public int status_code = -1;
}
