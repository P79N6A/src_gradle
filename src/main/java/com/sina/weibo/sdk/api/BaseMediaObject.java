package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.sina.weibo.sdk.utils.LogUtil;

public abstract class BaseMediaObject implements Parcelable {
    public String actionUrl;
    public String description;
    public String identify;
    public String schema;
    public byte[] thumbData;
    public String title;

    public int describeContents() {
        return 0;
    }

    public abstract int getObjType();

    /* access modifiers changed from: protected */
    public abstract BaseMediaObject toExtraMediaObject(String str);

    /* access modifiers changed from: protected */
    public abstract String toExtraMediaString();

    public BaseMediaObject() {
    }

    /* access modifiers changed from: protected */
    public boolean checkArgs() {
        int i;
        if (this.actionUrl == null || this.actionUrl.length() > 512) {
            LogUtil.e("Weibo.BaseMediaObject", "checkArgs fail, actionUrl is invalid");
            return false;
        } else if (this.identify == null || this.identify.length() > 512) {
            LogUtil.e("Weibo.BaseMediaObject", "checkArgs fail, identify is invalid");
            return false;
        } else if (this.thumbData == null || this.thumbData.length > 32768) {
            StringBuilder sb = new StringBuilder("checkArgs fail, thumbData is invalid,size is ");
            if (this.thumbData != null) {
                i = this.thumbData.length;
            } else {
                i = -1;
            }
            sb.append(i);
            sb.append("! more then 32768.");
            LogUtil.e("Weibo.BaseMediaObject", sb.toString());
            return false;
        } else if (this.title == null || this.title.length() > 512) {
            LogUtil.e("Weibo.BaseMediaObject", "checkArgs fail, title is invalid");
            return false;
        } else if (this.description != null && this.description.length() <= 1024) {
            return true;
        } else {
            LogUtil.e("Weibo.BaseMediaObject", "checkArgs fail, description is invalid");
            return false;
        }
    }

    public BaseMediaObject(Parcel parcel) {
        this.actionUrl = parcel.readString();
        this.schema = parcel.readString();
        this.identify = parcel.readString();
        this.title = parcel.readString();
        this.description = parcel.readString();
        this.thumbData = parcel.createByteArray();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027 A[SYNTHETIC, Splitter:B:18:0x0027] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x002f A[SYNTHETIC, Splitter:B:26:0x002f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setThumbImage(android.graphics.Bitmap r4) {
        /*
            r3 = this;
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x001e }
            r1.<init>()     // Catch:{ Exception -> 0x001e }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x001a, all -> 0x0017 }
            r2 = 85
            r4.compress(r0, r2, r1)     // Catch:{ Exception -> 0x001a, all -> 0x0017 }
            byte[] r4 = r1.toByteArray()     // Catch:{ Exception -> 0x001a, all -> 0x0017 }
            r3.thumbData = r4     // Catch:{ Exception -> 0x001a, all -> 0x0017 }
            r1.close()     // Catch:{ IOException -> 0x002c }
            return
        L_0x0017:
            r4 = move-exception
            r0 = r1
            goto L_0x002d
        L_0x001a:
            r0 = r1
            goto L_0x001e
        L_0x001c:
            r4 = move-exception
            goto L_0x002d
        L_0x001e:
            java.lang.String r4 = "Weibo.BaseMediaObject"
            java.lang.String r1 = "put thumb failed"
            com.sina.weibo.sdk.utils.LogUtil.e(r4, r1)     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x002c
            r0.close()     // Catch:{ IOException -> 0x002b }
            return
        L_0x002b:
            return
        L_0x002c:
            return
        L_0x002d:
            if (r0 == 0) goto L_0x0032
            r0.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sina.weibo.sdk.api.BaseMediaObject.setThumbImage(android.graphics.Bitmap):void");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.actionUrl);
        parcel.writeString(this.schema);
        parcel.writeString(this.identify);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeByteArray(this.thumbData);
    }
}
