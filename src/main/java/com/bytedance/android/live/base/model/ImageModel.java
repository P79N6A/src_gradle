package com.bytedance.android.live.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import com.bytedance.android.live.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@Keep
public class ImageModel implements Parcelable {
    public static final Parcelable.Creator<ImageModel> CREATOR = new Parcelable.Creator<ImageModel>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f7691a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ImageModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f7691a, false, 30, new Class[]{Parcel.class}, ImageModel.class)) {
                return new ImageModel(parcel2);
            }
            return (ImageModel) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f7691a, false, 30, new Class[]{Parcel.class}, ImageModel.class);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("avg_color")
    private String avgColor;
    @SerializedName("height")
    public int height;
    private boolean isFeedCandidate;
    private boolean isLoaded;
    private boolean isMonitored;
    @SerializedName("uri")
    private String mUri;
    @SerializedName("url_list")
    private List<String> mUrls = new ArrayList();
    @SerializedName("open_web_url")
    private String schema;
    @SerializedName("width")
    public int width;

    public int describeContents() {
        return 0;
    }

    public String getAvgColor() {
        return this.avgColor;
    }

    public int getHeight() {
        return this.height;
    }

    @SerializedName("open_web_url")
    public String getSchema() {
        return this.schema;
    }

    @SerializedName("uri")
    public String getUri() {
        return this.mUri;
    }

    @SerializedName("url_list")
    public List<String> getUrls() {
        return this.mUrls;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isFeedCandidate() {
        return this.isFeedCandidate;
    }

    public boolean isLoaded() {
        return this.isLoaded;
    }

    public boolean isMonitored() {
        return this.isMonitored;
    }

    public ImageModel() {
    }

    public int hashCode() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 25, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 25, new Class[0], Integer.TYPE)).intValue();
        }
        return hash(this.avgColor, this.mUri, this.mUrls, Integer.valueOf(this.width), Integer.valueOf(this.height));
    }

    public String toString() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 23, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 23, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{\"uri\":");
        sb.append("\"");
        if (this.mUri == null) {
            str = "";
        } else {
            str = this.mUri;
        }
        sb.append(str);
        sb.append("\",\"image_type\":\"");
        if (this.schema == null) {
            str2 = "";
        } else {
            str2 = this.schema;
        }
        sb.append(str2);
        sb.append("\",\"url_list\":[");
        if (this.mUrls != null) {
            int size = this.mUrls.size();
            for (int i = 0; i < size; i++) {
                sb.append("\"");
                sb.append(this.mUrls.get(i));
                sb.append("\"");
                if (i != size - 1) {
                    sb.append(",");
                }
            }
        }
        sb.append("]}");
        return sb.toString();
    }

    public void setAvgColor(String str) {
        this.avgColor = str;
    }

    public void setFeedCandidate(boolean z) {
        this.isFeedCandidate = z;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setLoaded(boolean z) {
        this.isLoaded = z;
    }

    public void setMonitored(boolean z) {
        this.isMonitored = z;
    }

    @SerializedName("open_web_url")
    public void setSchema(String str) {
        this.schema = str;
    }

    @SerializedName("uri")
    public void setUri(String str) {
        this.mUri = str;
    }

    @SerializedName("url_list")
    public void setUrls(List<String> list) {
        this.mUrls = list;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public static ImageModel genBy(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 27, new Class[]{String.class}, ImageModel.class)) {
            return (ImageModel) PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 27, new Class[]{String.class}, ImageModel.class);
        }
        ImageModel imageModel = new ImageModel();
        imageModel.setUrls(Collections.singletonList(str));
        return imageModel;
    }

    public ImageModel(Parcel parcel) {
        boolean z;
        boolean z2;
        this.mUri = parcel.readString();
        this.mUrls = parcel.createStringArrayList();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.schema = parcel.readString();
        boolean z3 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isLoaded = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isMonitored = z2;
        this.isFeedCandidate = parcel.readByte() != 0 ? true : z3;
    }

    public static ImageModel fromJson(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 22, new Class[]{String.class}, ImageModel.class)) {
            return (ImageModel) a.a().fromJson(str2, ImageModel.class);
        }
        return (ImageModel) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 22, new Class[]{String.class}, ImageModel.class);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int hash(java.lang.Object... r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Integer.TYPE
            r3 = 0
            r5 = 1
            r6 = 28
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0039
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 1
            r14 = 28
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Integer.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x0039:
            if (r0 != 0) goto L_0x003c
            return r9
        L_0x003c:
            int r2 = r0.length
            r1 = 0
            r3 = 1
        L_0x003f:
            if (r1 >= r2) goto L_0x0051
            r4 = r0[r1]
            int r3 = r3 * 31
            if (r4 != 0) goto L_0x0049
            r4 = 0
            goto L_0x004d
        L_0x0049:
            int r4 = r4.hashCode()
        L_0x004d:
            int r3 = r3 + r4
            int r1 = r1 + 1
            goto L_0x003f
        L_0x0051:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.base.model.ImageModel.hash(java.lang.Object[]):int");
    }

    public static String toJsonString(ImageModel imageModel) {
        ImageModel imageModel2 = imageModel;
        if (PatchProxy.isSupport(new Object[]{imageModel2}, null, changeQuickRedirect, true, 20, new Class[]{ImageModel.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{imageModel2}, null, changeQuickRedirect, true, 20, new Class[]{ImageModel.class}, String.class);
        } else if (imageModel2 == null) {
            return "";
        } else {
            return a.a().toJson((Object) imageModel2);
        }
    }

    @Nullable
    public static ImageModel fromJson(JSONObject jSONObject) {
        if (!PatchProxy.isSupport(new Object[]{jSONObject}, null, changeQuickRedirect, true, 21, new Class[]{JSONObject.class}, ImageModel.class)) {
            return (ImageModel) a.a().fromJson(jSONObject.toString(), ImageModel.class);
        }
        return (ImageModel) PatchProxy.accessDispatch(new Object[]{jSONObject}, null, changeQuickRedirect, true, 21, new Class[]{JSONObject.class}, ImageModel.class);
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 24, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 24, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ImageModel imageModel = (ImageModel) obj;
            if (this.width != imageModel.width || this.height != imageModel.height || !equals(this.avgColor, imageModel.avgColor) || !equals(this.mUri, imageModel.mUri) || !equals(this.mUrls, imageModel.mUrls)) {
                return false;
            }
            return true;
        }
    }

    public ImageModel(String str, List<String> list) {
        this.mUri = str;
        this.mUrls = list;
    }

    private static boolean equals(Object obj, Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        if (PatchProxy.isSupport(new Object[]{obj3, obj4}, null, changeQuickRedirect, true, 29, new Class[]{Object.class, Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj3, obj4}, null, changeQuickRedirect, true, 29, new Class[]{Object.class, Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj3 == obj4 || (obj3 != null && obj.equals(obj2))) {
            return true;
        } else {
            return false;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 26, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 26, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeString(this.mUri);
        parcel.writeStringList(this.mUrls);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.schema);
        parcel.writeByte(this.isLoaded ? (byte) 1 : 0);
        parcel.writeByte(this.isMonitored ? (byte) 1 : 0);
        parcel.writeByte(this.isFeedCandidate ? (byte) 1 : 0);
    }

    public ImageModel(String str, List<String> list, String str2) {
        this.mUri = str;
        this.mUrls = list;
        this.schema = str2;
    }
}
