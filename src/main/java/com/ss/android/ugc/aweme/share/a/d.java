package com.ss.android.ugc.aweme.share.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

public class d implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("command")
    String command;
    @SerializedName("share_user_did")
    private long did;
    @SerializedName("share_user_iid")
    private long iid;
    @SerializedName("log_pb")
    LogPbBean logPbBean;
    @SerializedName("sec_uid")
    private String mSecUid;
    @SerializedName("relation_from")
    private String relationFrom = "";
    @SerializedName("rid")
    private String rid = "";
    @SerializedName("schema")
    private String schema = "";
    @SerializedName("schema_type")
    private int schemaType;
    @SerializedName("schema_detail")
    private e schemeDetail;
    @SerializedName("share_sdk")
    private String shareSdk = "";
    @SerializedName("share_user_id")
    private String shareUserId = "";
    @SerializedName("share_user_name")
    private String shareUserName = "";
    @SerializedName("status_code")
    private int statusCode;
    @SerializedName("status_msg")
    private String statusMsg;

    public long getDid() {
        return this.did;
    }

    public long getIid() {
        return this.iid;
    }

    public LogPbBean getLogPbBean() {
        return this.logPbBean;
    }

    public String getRelationFrom() {
        return this.relationFrom;
    }

    public String getRid() {
        return this.rid;
    }

    public String getSchema() {
        return this.schema;
    }

    public int getSchemaType() {
        return this.schemaType;
    }

    public e getSchemeDetail() {
        return this.schemeDetail;
    }

    public String getSecUid() {
        return this.mSecUid;
    }

    public String getShareSdk() {
        return this.shareSdk;
    }

    public String getShareUserId() {
        return this.shareUserId;
    }

    public String getShareUserName() {
        return this.shareUserName;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMsg() {
        return this.statusMsg;
    }

    public String getLogPbImprId() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 73453, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 73453, new Class[0], String.class);
        } else if (this.logPbBean != null) {
            return this.logPbBean.getImprId();
        } else {
            return "";
        }
    }

    public void setDid(long j) {
        this.did = j;
    }

    public void setIid(long j) {
        this.iid = j;
    }

    public void setRelationFrom(String str) {
        this.relationFrom = str;
    }

    public void setRid(String str) {
        this.rid = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSchemaType(int i) {
        this.schemaType = i;
    }

    public void setSchemeDetail(e eVar) {
        this.schemeDetail = eVar;
    }

    public void setSecUid(String str) {
        this.mSecUid = str;
    }

    public void setShareSdk(String str) {
        this.shareSdk = str;
    }

    public void setShareUserId(String str) {
        this.shareUserId = str;
    }

    public void setShareUserName(String str) {
        this.shareUserName = str;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public void setStatusMsg(String str) {
        this.statusMsg = str;
    }
}
