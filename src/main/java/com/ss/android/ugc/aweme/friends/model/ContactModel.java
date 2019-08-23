package com.ss.android.ugc.aweme.friends.model;

import com.google.common.a.j;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.login.utils.b;
import java.util.Arrays;

public class ContactModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Expose(deserialize = false, serialize = false)
    public String firstName;
    @SerializedName("invited")
    @Expose
    public boolean invited;
    @Expose(deserialize = false, serialize = false)
    public String lastName;
    @Expose(deserialize = false, serialize = false)
    public String mSection;
    @SerializedName("name")
    @Expose
    public String name;
    @Expose(deserialize = false, serialize = false)
    public int originIndex;
    @SerializedName("phone_number")
    @Expose
    public String phoneNumber;
    @Expose(deserialize = false, serialize = false)
    public String url;

    public ContactModel() {
    }

    public int hashCode() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46602, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46602, new Class[0], Integer.TYPE)).intValue();
        }
        return Arrays.hashCode(new Object[]{this.phoneNumber, this.name});
    }

    public String nationalNumber() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46600, new Class[0], String.class)) {
            return b.a(this.phoneNumber);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46600, new Class[0], String.class);
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 46601, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 46601, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ContactModel contactModel = (ContactModel) obj;
            if (!j.a(this.phoneNumber, contactModel.phoneNumber) || !j.a(this.name, contactModel.name)) {
                return false;
            }
            return true;
        }
    }

    public ContactModel(String str, String str2) {
        this.phoneNumber = str;
        this.name = str2;
    }
}
