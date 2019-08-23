package com.ss.android.ugc.aweme.friends.model;

import com.google.common.a.j;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.login.utils.b;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class DouyinContactModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("addresses")
    public List<String> addresses;
    @SerializedName("birthday")
    public String birthday;
    @SerializedName("department_name")
    public String department;
    @SerializedName("emails")
    public List<String> emails;
    public String familyName;
    public String givenName;
    @SerializedName("instant_message_addresses")
    public Map<String, String> instantMessageAddresses;
    @SerializedName("job_desc")
    public String jobDesc;
    @SerializedName("image_url")
    public String mImageUrl;
    @SerializedName("modification_date")
    public String modificationDate;
    @SerializedName("name")
    public String name;
    @SerializedName("nick_name")
    public String nickName;
    @SerializedName("note")
    public String note;
    @SerializedName("organization_name")
    public String organization;
    @SerializedName("phone_number")
    public List<String> phoneNumber;
    public String section;
    @SerializedName("urls")
    public List<String> urls;

    public int hashCode() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46605, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46605, new Class[0], Integer.TYPE)).intValue();
        }
        return Arrays.hashCode(new Object[]{this.phoneNumber, this.name});
    }

    public String nationalNumber(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 46603, new Class[]{String.class}, String.class)) {
            return b.a(str);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 46603, new Class[]{String.class}, String.class);
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 46604, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 46604, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DouyinContactModel douyinContactModel = (DouyinContactModel) obj;
            if (!j.a(this.phoneNumber, douyinContactModel.phoneNumber) || !j.a(this.name, douyinContactModel.name)) {
                return false;
            }
            return true;
        }
    }
}
