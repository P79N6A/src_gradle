package com.bytedance.g.b;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class a implements Serializable, Cloneable {
    @SerializedName("javaScriptResource")
    public String javascriptResource;
    @SerializedName("vendorKey")
    public String vender;
    @SerializedName("verificationParameters")
    public String verificationParameters;

    public boolean valid() {
        if (this.javascriptResource == null || this.javascriptResource.isEmpty()) {
            return false;
        }
        return true;
    }
}
