package com.taobao.applink.param;

import android.content.Context;
import com.taobao.applink.exception.TBAppLinkException;
import com.taobao.applink.exception.a;
import com.taobao.applink.util.e;
import org.json.JSONException;
import org.json.JSONObject;

public class TBDetailParam extends TBNavParam {
    private String mItemID;

    private TBDetailParam() {
    }

    public TBDetailParam(String str) {
        this.mParams.put("module", "detail");
        this.mItemID = str;
    }

    public boolean checkParams(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("itemId");
            if (!e.b(string)) {
                return false;
            }
            this.mParams.put("module", "detail");
            this.mItemID = string;
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    public String getH5URL() throws TBAppLinkException {
        if (e.b(this.mItemID)) {
            return super.getH5URL(String.format("http://h5.m.taobao.com/awp/core/detail.htm?id=%s&", new Object[]{this.mItemID}));
        }
        throw new TBAppLinkException(a.ITEMID_ILLEGAL);
    }

    public String getJumpUrl(Context context) throws TBAppLinkException {
        if (e.b(this.mItemID)) {
            this.mExtraParams.put("itemId", this.mItemID);
            return super.getJumpUrl(context);
        }
        throw new TBAppLinkException(a.ITEMID_ILLEGAL);
    }
}