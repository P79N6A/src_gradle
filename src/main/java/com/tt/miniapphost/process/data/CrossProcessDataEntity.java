package com.tt.miniapphost.process.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.tt.miniapphost.AppBrandLogger;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CrossProcessDataEntity implements Parcelable {
    public static final Parcelable.Creator<CrossProcessDataEntity> CREATOR = new Parcelable.Creator<CrossProcessDataEntity>() {
        public final CrossProcessDataEntity[] newArray(int i) {
            return new CrossProcessDataEntity[i];
        }

        public final CrossProcessDataEntity createFromParcel(Parcel parcel) {
            return new CrossProcessDataEntity(parcel);
        }
    };
    private final String mData;
    private JSONObject mDataJsonObject;

    public static class Builder {
        private JSONObject mDataJSONObject = new JSONObject();

        public static Builder create() {
            return new Builder();
        }

        public CrossProcessDataEntity build() {
            return new CrossProcessDataEntity(this.mDataJSONObject);
        }

        public Builder put(@NonNull String str, @Nullable Object obj) {
            try {
                this.mDataJSONObject.put(str, obj);
            } catch (JSONException e2) {
                AppBrandLogger.eWithThrowable("CrossProcessDataEntity", "put", e2);
            }
            return this;
        }

        public Builder putCrossProcessDataEntity(@NonNull String str, @Nullable CrossProcessDataEntity crossProcessDataEntity) {
            try {
                JSONObject jSONObject = this.mDataJSONObject;
                Object obj = crossProcessDataEntity;
                if (crossProcessDataEntity != null) {
                    obj = crossProcessDataEntity.toString();
                }
                jSONObject.put(str, obj);
            } catch (JSONException e2) {
                AppBrandLogger.eWithThrowable("CrossProcessDataEntity", "putCrossProcessDataEntity", e2);
            }
            return this;
        }

        public Builder putStringList(@NonNull String str, @Nullable List list) {
            try {
                this.mDataJSONObject.put(str, new JSONArray(list));
            } catch (JSONException e2) {
                AppBrandLogger.eWithThrowable("CrossProcessDataEntity", "putStringList", e2);
            }
            return this;
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.mData;
    }

    @NonNull
    public JSONObject getDataJSONObject() {
        parse();
        return this.mDataJsonObject;
    }

    private void parse() {
        if (this.mDataJsonObject == null) {
            if (!TextUtils.isEmpty(this.mData)) {
                try {
                    this.mDataJsonObject = new JSONObject(this.mData);
                } catch (JSONException e2) {
                    AppBrandLogger.eWithThrowable("CrossProcessDataEntity", "CrossProcessDataEntity parse", e2);
                    this.mDataJsonObject = new JSONObject();
                }
            } else {
                this.mDataJsonObject = new JSONObject();
            }
        }
    }

    public CrossProcessDataEntity(@Nullable String str) {
        this.mData = str;
    }

    public boolean getBoolean(@NonNull String str) {
        return getBoolean(str, false);
    }

    public double getDouble(@NonNull String str) {
        return getDouble(str, Double.NaN);
    }

    public int getInt(@NonNull String str) {
        return getInt(str, 0);
    }

    public long getLong(@NonNull String str) {
        return getLong(str, 0);
    }

    @Nullable
    public String getString(@NonNull String str) {
        return getString(str, null);
    }

    @Nullable
    public List<String> getStringList(@NonNull String str) {
        return getStringList(str, null);
    }

    protected CrossProcessDataEntity(Parcel parcel) {
        this.mData = parcel.readString();
    }

    public CrossProcessDataEntity getCrossProcessDataEntity(@NonNull String str) {
        return new CrossProcessDataEntity(getString(str, null));
    }

    public JSONObject getJSONObject(@NonNull String str) {
        return getDataJSONObject().optJSONObject(str);
    }

    public boolean has(@NonNull String str) {
        return getDataJSONObject().has(str);
    }

    private CrossProcessDataEntity(@NonNull JSONObject jSONObject) {
        this.mDataJsonObject = jSONObject;
        this.mData = this.mDataJsonObject.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mData);
    }

    public boolean getBoolean(@NonNull String str, boolean z) {
        try {
            return getDataJSONObject().optBoolean(str, z);
        } catch (Exception e2) {
            AppBrandLogger.eWithThrowable("CrossProcessDataEntity", "getBoolean", e2);
            return z;
        }
    }

    public double getDouble(@NonNull String str, double d2) {
        getDataJSONObject();
        try {
            return getDataJSONObject().optDouble(str, d2);
        } catch (Exception e2) {
            AppBrandLogger.eWithThrowable("CrossProcessDataEntity", "getDouble", e2);
            return d2;
        }
    }

    public int getInt(@NonNull String str, int i) {
        try {
            return getDataJSONObject().optInt(str, i);
        } catch (Exception e2) {
            AppBrandLogger.eWithThrowable("CrossProcessDataEntity", "getInt", e2);
            return i;
        }
    }

    public long getLong(@NonNull String str, long j) {
        try {
            return getDataJSONObject().optLong(str, j);
        } catch (Exception e2) {
            AppBrandLogger.eWithThrowable("CrossProcessDataEntity", "getLong", e2);
            return j;
        }
    }

    @Nullable
    public String getString(@NonNull String str, @Nullable String str2) {
        try {
            return getDataJSONObject().optString(str, str2);
        } catch (Exception e2) {
            AppBrandLogger.eWithThrowable("CrossProcessDataEntity", "getString", e2);
            return str2;
        }
    }

    @Nullable
    public List<String> getStringList(@NonNull String str, @Nullable List<String> list) {
        try {
            JSONArray optJSONArray = getDataJSONObject().optJSONArray(str);
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
                return arrayList;
            }
        } catch (Exception e2) {
            AppBrandLogger.eWithThrowable("CrossProcessDataEntity", "getStringList", e2);
        }
        return list;
    }
}
