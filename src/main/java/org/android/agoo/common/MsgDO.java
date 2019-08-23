package org.android.agoo.common;

import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONObject;

public class MsgDO {
    public boolean agooFlag;
    public String body;
    public String dataId;
    public String errorCode;
    public String extData;
    public String fromAppkey;
    public String fromPkg;
    public boolean isFromCache;
    public boolean isStartProc;
    public String messageSource;
    public String msgIds;
    public String msgStatus;
    public String notifyEnable;
    public String pack;
    public String removePacks;
    public String reportStr;
    public String type;

    public String getMsgInfo() {
        HashMap hashMap = new HashMap();
        hashMap.put("msgIds", this.msgIds);
        hashMap.put("extData", this.extData);
        hashMap.put("body", this.body);
        hashMap.put("dataId", this.dataId);
        hashMap.put("pack", this.pack);
        hashMap.put("messageSource", this.messageSource);
        if (!TextUtils.isEmpty(this.removePacks)) {
            hashMap.put("removePacks", this.removePacks);
        }
        if (!TextUtils.isEmpty(this.errorCode)) {
            hashMap.put("errorCode", this.errorCode);
        }
        if (!TextUtils.isEmpty(this.type)) {
            hashMap.put("type", this.type);
        }
        return new JSONObject(hashMap).toString();
    }
}
