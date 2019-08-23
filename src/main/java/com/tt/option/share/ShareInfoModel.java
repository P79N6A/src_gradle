package com.tt.option.share;

import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.e;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.AppbrandApplication;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.entity.MicroSchemaEntity;
import com.tt.miniapphost.process.annotation.MiniAppProcess;
import java.io.Serializable;
import java.lang.reflect.Method;
import org.json.JSONObject;

public class ShareInfoModel implements Serializable {
    public AppInfoEntity appInfo;
    public String channel;
    public String desc;
    public String entryPath;
    public String extra;
    public String gameRecordVideoExtraArgs;
    public String gameRecordVideoPath;
    public String imageUrl;
    public boolean isExtraContainVideoPath;
    public String linkTitle;
    public String miniImageUrl;
    public int orientation;
    public String queryString;
    public String schema;
    public String shareType;
    public String title;
    public String token;
    public String ugUrl;
    public boolean withShareTicket;

    public String toString() {
        return "ShareInfoModel{\n\nchannel='" + this.channel + '\'' + ",\n\n title='" + this.title + '\'' + ",\n\n linkTitle='" + this.linkTitle + '\'' + ",\n\n imageUrl='" + this.imageUrl + '\'' + ",\n\n queryString='" + this.queryString + '\'' + ",\n\n extra='" + this.extra + '\'' + ",\n\n isExtraContainVideoPath=" + this.isExtraContainVideoPath + ",\n\n appInfo=" + this.appInfo + ",\n\n entryPath='" + this.entryPath + '\'' + ",\n\n token='" + this.token + '\'' + ",\n\n miniImageUrl='" + this.miniImageUrl + '\'' + ",\n\n ugUrl='" + this.ugUrl + '\'' + ",\n\n schema='" + this.schema + '\'' + ",\n\n withShareTicket=" + this.withShareTicket + ",\n\n shareType='" + this.shareType + '\'' + ",\n\n desc='" + this.desc + '\'' + ",\n\n gameRecordVideoPath='" + this.gameRecordVideoPath + '\'' + ",\n\n gameRecordVideoExtraArgs='" + this.gameRecordVideoExtraArgs + '\'' + ",\n\n orientation=" + this.orientation + '}';
    }

    @MiniAppProcess
    private static String getRealPath(String str) {
        try {
            Class<?> cls = Class.forName("com.tt.miniapp.storage.filestorge.FileManager");
            Method declaredMethod = cls.getDeclaredMethod("inst", new Class[0]);
            return (String) cls.getDeclaredMethod("getRealFilePath", new Class[]{String.class}).invoke(declaredMethod.invoke(null, new Object[0]), new Object[]{str});
        } catch (Exception e2) {
            AppBrandLogger.stacktrace(6, "ShareInfoModel", e2.getStackTrace());
            return str;
        }
    }

    @MiniAppProcess
    public static ShareInfoModel parse(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            ShareInfoModel shareInfoModel = new ShareInfoModel();
            shareInfoModel.channel = jSONObject.optString("channel");
            shareInfoModel.title = jSONObject.optString(PushConstants.TITLE);
            shareInfoModel.linkTitle = jSONObject.optString("linkTitle");
            shareInfoModel.imageUrl = jSONObject.optString("imageUrl");
            shareInfoModel.appInfo = AppbrandApplication.getInst().getAppInfo();
            String optString = jSONObject.optString("query");
            String optString2 = jSONObject.optString("path");
            if (shareInfoModel.appInfo.type != 2) {
                optString = optString2;
            }
            shareInfoModel.queryString = optString;
            JSONObject optJSONObject = jSONObject.optJSONObject(PushConstants.EXTRA);
            if (optJSONObject != null) {
                String optString3 = optJSONObject.optString("videoPath");
                if (!TextUtils.isEmpty(optString3)) {
                    shareInfoModel.isExtraContainVideoPath = true;
                    String realPath = getRealPath(optString3);
                    if (!TextUtils.isEmpty(realPath)) {
                        optJSONObject.put("videoPath", realPath);
                    }
                }
                shareInfoModel.extra = optJSONObject.toString();
            } else {
                shareInfoModel.extra = "";
            }
            shareInfoModel.entryPath = jSONObject.optString("entryPath");
            if (shareInfoModel.title.length() == 0) {
                shareInfoModel.title = shareInfoModel.appInfo.appName;
            }
            MicroSchemaEntity.Builder subScene = new MicroSchemaEntity.Builder().appId(shareInfoModel.appInfo.appId).iconUrl(shareInfoModel.appInfo.icon).name(shareInfoModel.appInfo.appName).ssType(e.f34152b).type(shareInfoModel.appInfo.type).launchFrom("publish_weitoutiao").scene("013010").subScene("");
            if (shareInfoModel.appInfo.type == 2) {
                subScene.query(shareInfoModel.queryString);
            } else {
                subScene.startPage(shareInfoModel.queryString);
            }
            shareInfoModel.schema = subScene.build().toSchema();
            return shareInfoModel;
        } catch (Exception e2) {
            AppBrandLogger.stacktrace(6, "ShareInfoModel", e2.getStackTrace());
            return null;
        }
    }
}
