package com.tt.miniapphost.entity;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.app.e;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.process.annotation.AnyProcess;
import org.json.JSONException;
import org.json.JSONObject;

@AnyProcess
public class MicroSchemaEntity {
    final String TAG;
    @NonNull
    private String appId;
    @Nullable
    private String extra;
    @Nullable
    private String iconUrl;
    @Nullable
    private String launchFrom;
    @Nullable
    private String name;
    private int orientation;
    private String query;
    @Nullable
    private String refererInfo;
    @Nullable
    private String scene;
    @Nullable
    private String ssType;
    @Nullable
    private String startPage;
    @Nullable
    private String subScene;
    private int type;
    @Nullable
    private String versionType;

    public static final class Builder {
        public String appId;
        public String extra;
        public String iconUrl;
        public String launchFrom;
        public String name;
        public int orientation;
        public String query;
        public String refererInfo;
        public String scene;
        public String ssType;
        public String startPage;
        public String subScene;
        public int type;
        public String versionType;

        public final String getExtra() {
            return this.extra;
        }

        public final MicroSchemaEntity build() {
            return new MicroSchemaEntity(this);
        }

        public final Builder appId(String str) {
            this.appId = str;
            return this;
        }

        public final Builder iconUrl(String str) {
            this.iconUrl = str;
            return this;
        }

        public final Builder launchFrom(String str) {
            this.launchFrom = str;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder orientation(int i) {
            this.orientation = i;
            return this;
        }

        public final Builder query(String str) {
            this.query = str;
            return this;
        }

        public final Builder scene(String str) {
            this.scene = str;
            return this;
        }

        public final Builder setExtra(String str) {
            this.extra = str;
            return this;
        }

        public final Builder setRefererInfo(String str) {
            this.refererInfo = str;
            return this;
        }

        public final Builder setVersionType(String str) {
            this.versionType = str;
            return this;
        }

        public final Builder ssType(String str) {
            this.ssType = str;
            return this;
        }

        public final Builder startPage(String str) {
            this.startPage = str;
            return this;
        }

        public final Builder subScene(String str) {
            this.subScene = str;
            return this;
        }

        public final Builder type(int i) {
            this.type = i;
            return this;
        }
    }

    @NonNull
    public String getAppId() {
        return this.appId;
    }

    @Nullable
    public String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public String getLaunchFrom() {
        return this.launchFrom;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public String getQuery() {
        return this.query;
    }

    @Nullable
    public String getRefererInfo() {
        return this.refererInfo;
    }

    @Nullable
    public String getScene() {
        return this.scene;
    }

    @Nullable
    public String getSsType() {
        return this.ssType;
    }

    @Nullable
    public String getStartPage() {
        return this.startPage;
    }

    @Nullable
    public String getSubScene() {
        return this.subScene;
    }

    public int getType() {
        return this.type;
    }

    @Nullable
    public String getVersionType() {
        return this.versionType;
    }

    @Nullable
    public String toSchema() {
        if (TextUtils.isEmpty(getAppId())) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(getIconUrl())) {
                jSONObject.put("icon", getIconUrl());
            }
            if (!TextUtils.isEmpty(getName())) {
                jSONObject.put("name", getName());
            }
            jSONObject.put("orientation", getOrientation());
        } catch (JSONException e2) {
            AppBrandLogger.stacktrace(6, "MicroSchemaEntity", e2.getStackTrace());
        }
        String jSONObject2 = jSONObject.toString();
        String str = "microapp";
        if (getType() == 2) {
            str = "microgame";
        }
        String launchFrom2 = getLaunchFrom();
        String scene2 = getScene();
        String subScene2 = getSubScene();
        String str2 = e.f34152b;
        if (!TextUtils.isEmpty(getSsType())) {
            str2 = getSsType();
        }
        String startPage2 = getStartPage();
        String query2 = getQuery();
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("://");
        sb.append(str);
        sb.append("?");
        sb.append("app_id=");
        sb.append(getAppId());
        if (!TextUtils.isEmpty(launchFrom2)) {
            sb.append("&launch_from=");
            sb.append(launchFrom2);
        }
        if (!TextUtils.isEmpty(jSONObject2)) {
            sb.append("&meta=");
            sb.append(Uri.encode(jSONObject2));
        }
        if (!TextUtils.isEmpty(scene2)) {
            sb.append("&scene=");
            sb.append(scene2);
        }
        if (!TextUtils.isEmpty(subScene2)) {
            sb.append("&sub_scene=");
            sb.append(subScene2);
        }
        if (getType() == 2) {
            if (!TextUtils.isEmpty(query2)) {
                sb.append("&query=");
                sb.append(query2);
            }
        } else if (!TextUtils.isEmpty(startPage2)) {
            sb.append("&start_page=");
            sb.append(Uri.encode(startPage2));
        }
        if (!TextUtils.isEmpty(this.extra)) {
            sb.append("&extra=");
            sb.append(this.extra);
        }
        if (!TextUtils.isEmpty(getRefererInfo())) {
            sb.append("&referer_info=");
            sb.append(getRefererInfo());
        }
        if (!TextUtils.isEmpty(getVersionType())) {
            sb.append("&version_type=");
            sb.append(getVersionType());
        }
        return sb.toString();
    }

    private MicroSchemaEntity(Builder builder) {
        this.TAG = "MicroSchemaEntity";
        this.type = 1;
        this.ssType = builder.ssType;
        this.appId = builder.appId;
        this.name = builder.name;
        this.iconUrl = builder.iconUrl;
        this.launchFrom = builder.launchFrom;
        this.scene = builder.scene;
        this.subScene = builder.subScene;
        this.startPage = builder.startPage;
        this.query = builder.query;
        this.type = builder.type;
        this.orientation = builder.orientation;
        this.extra = builder.extra;
        this.refererInfo = builder.refererInfo;
        this.versionType = builder.versionType;
    }
}
