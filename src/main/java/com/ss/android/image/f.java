package com.ss.android.image;

import android.text.TextUtils;
import com.bytedance.common.utility.DigestUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.http.a.b.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class f implements Serializable {
    private static final long serialVersionUID = -6027923654002990158L;

    /* renamed from: a  reason: collision with root package name */
    private transient boolean f29237a;
    public volatile boolean mDownloaded;
    protected String mExtraKey;
    public int mHeight;
    public boolean mIsGif;
    public boolean mIsVideo;
    public String mKey;
    public boolean mNeedAlpha;
    public String mOpenUrl;
    public String mUri;
    public String mUrlList;
    public int mWidth;

    public String getExtraKey() {
        return this.mExtraKey;
    }

    public boolean isFixedDisplaySize() {
        return this.f29237a;
    }

    public boolean isValid() {
        if (this.mWidth <= 0 || this.mHeight <= 0 || TextUtils.isEmpty(this.mUri) || TextUtils.isEmpty(this.mUrlList)) {
            return false;
        }
        return true;
    }

    public JSONObject toJsonObj() {
        if (TextUtils.isEmpty(this.mUri)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uri", this.mUri);
            jSONObject.put("width", this.mWidth);
            jSONObject.put("height", this.mHeight);
            if (this.mOpenUrl != null) {
                jSONObject.put(com.ss.android.ugc.aweme.app.f.f34168b, this.mOpenUrl);
            }
            if (!TextUtils.isEmpty(this.mUrlList)) {
                try {
                    jSONObject.put("url_list", new JSONArray(this.mUrlList));
                } catch (Exception unused) {
                }
            }
            return jSONObject;
        } catch (Exception unused2) {
            return null;
        }
    }

    public void setExtraKey(String str) {
        this.mExtraKey = str;
    }

    public static f fromJsonStr(String str) {
        return fromJsonStr(str, true);
    }

    public static boolean isHttpUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return true;
        }
        return false;
    }

    public static JSONArray toJsonArray(List<f> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (f jsonObj : list) {
            JSONObject jsonObj2 = jsonObj.toJsonObj();
            if (jsonObj2 != null) {
                jSONArray.put(jsonObj2);
            }
        }
        return jSONArray;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.mWidth != fVar.mWidth || this.mHeight != fVar.mHeight || this.mIsGif != fVar.mIsGif || this.mDownloaded != fVar.mDownloaded || this.mIsVideo != fVar.mIsVideo || this.f29237a != fVar.f29237a) {
            return false;
        }
        if (this.mUri == null ? fVar.mUri != null : !this.mUri.equals(fVar.mUri)) {
            return false;
        }
        if (this.mOpenUrl == null ? fVar.mOpenUrl != null : !this.mOpenUrl.equals(fVar.mOpenUrl)) {
            return false;
        }
        if (this.mUrlList == null ? fVar.mUrlList != null : !this.mUrlList.equals(fVar.mUrlList)) {
            return false;
        }
        if (this.mExtraKey == null ? fVar.mExtraKey != null : !this.mExtraKey.equals(fVar.mExtraKey)) {
            return false;
        }
        if (this.mKey == null ? fVar.mKey != null : !this.mKey.equals(fVar.mKey)) {
            return false;
        }
        return true;
    }

    public f(String str, String str2) {
        this(str, str2, 0, 0, false);
    }

    public static f fromJsonStr(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return fromJson(new JSONObject(str), z);
        } catch (Exception unused) {
            return null;
        }
    }

    public static List<f> parseImageList(JSONArray jSONArray, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            f fromJson = fromJson(jSONArray.getJSONObject(i), z);
            if (fromJson != null) {
                arrayList.add(fromJson);
            }
        }
        return arrayList;
    }

    public static String getUrlFromImageInfo(f fVar, boolean z) {
        String str;
        String str2 = null;
        if (fVar == null) {
            return null;
        }
        if (z) {
            str = fVar.mUri;
        } else {
            str = null;
        }
        List<i> extractImageUrlList = extractImageUrlList(str, fVar.mUrlList);
        if (extractImageUrlList != null && extractImageUrlList.size() > 0) {
            str2 = extractImageUrlList.get(0).f29264a;
        }
        return str2;
    }

    public static ArrayList<f> optImageList(JSONArray jSONArray, boolean z) {
        ArrayList<f> arrayList = null;
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                f fromJson = fromJson(optJSONObject, z);
                if (fromJson != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fromJson);
                }
            }
        }
        return arrayList;
    }

    public static f fromJson(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("uri");
        String optString2 = jSONObject.optString("url_list");
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        int optInt3 = jSONObject.optInt("r_width", -1);
        int optInt4 = jSONObject.optInt("r_height", -1);
        if (optInt3 != -1) {
            optInt = optInt3;
        }
        if (optInt4 != -1) {
            optInt2 = optInt4;
        }
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        if (z && (optInt <= 0 || optInt2 <= 0)) {
            return null;
        }
        f fVar = new f(optString, optString2, optInt, optInt2);
        fVar.mOpenUrl = jSONObject.optString(com.ss.android.ugc.aweme.app.f.f34168b, null);
        return fVar;
    }

    public static List<i> extractImageUrlList(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            try {
                JSONArray jSONArray = new JSONArray(str2);
                int length = jSONArray.length();
                if (length > 3) {
                    length = 3;
                }
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString(PushConstants.WEB_URL);
                    if (!TextUtils.isEmpty(string)) {
                        i iVar = new i(string);
                        arrayList.add(iVar);
                        JSONObject optJSONObject = jSONObject.optJSONObject("header");
                        if (optJSONObject != null) {
                            Iterator<String> keys = optJSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                String string2 = optJSONObject.getString(next);
                                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string2)) {
                                    iVar.f29265b.add(new e(next, string2));
                                }
                            }
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        if (arrayList.isEmpty() && !TextUtils.isEmpty(str) && isHttpUrl(str.toLowerCase())) {
            arrayList.add(new i(str));
        }
        return arrayList;
    }

    public static ArrayList<f> optImageList(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject == null || str == null || str.length() == 0 || !jSONObject.has(str)) {
            return null;
        }
        return optImageList(jSONObject.optJSONArray(str), z);
    }

    public f(String str, String str2, int i, int i2) {
        this(str, str2, i, i2, false);
    }

    public f(String str, String str2, int i, int i2, boolean z) {
        this.mUri = str;
        this.mUrlList = str2;
        this.mKey = DigestUtils.md5Hex(this.mUri);
        this.mWidth = i;
        this.mHeight = i2;
        if (this.mWidth > 0 && this.mHeight > 0) {
            this.f29237a = z;
        }
    }
}
