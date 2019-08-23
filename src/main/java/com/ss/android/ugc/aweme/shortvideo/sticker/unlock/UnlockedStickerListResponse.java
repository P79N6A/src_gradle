package com.ss.android.ugc.aweme.shortvideo.sticker.unlock;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

@Keep
public class UnlockedStickerListResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("status_code")
    int code;
    @SerializedName("sticker_ids")
    List<String> idList;
    @SerializedName("status_msg")
    String message;
    @SerializedName("texts")
    List<LockStickerTextBean> textBeanList;

    public int getCode() {
        return this.code;
    }

    public List<String> getIdList() {
        return this.idList;
    }

    public String getMessage() {
        return this.message;
    }

    public List<LockStickerTextBean> getTextBeanList() {
        return this.textBeanList;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setIdList(List<String> list) {
        this.idList = list;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setTextBeanList(List<LockStickerTextBean> list) {
        this.textBeanList = list;
    }
}
