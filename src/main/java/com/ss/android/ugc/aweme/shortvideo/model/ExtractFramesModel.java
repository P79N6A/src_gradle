package com.ss.android.ugc.aweme.shortvideo.model;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExtractFramesModel implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("extractFramesDir")
    public String extractFramesDir;
    @SerializedName("extractType")
    public String extractType;
    @SerializedName("frames")
    public Map<Integer, ArrayList<String>> frames = new HashMap();
    @SerializedName("stickerFacesMap")
    public Map<Integer, String> stickerFaces = new HashMap();
    private String stickerIds;

    public String getStickerIds() {
        return this.stickerIds;
    }

    public void clearAllFrames() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77630, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77630, new Class[0], Void.TYPE);
            return;
        }
        if (this.frames != null) {
            this.frames.clear();
        }
    }

    public String toString() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77632, new Class[0], String.class)) {
            return new GsonBuilder().create().toJson((Object) this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77632, new Class[0], String.class);
    }

    public List<String> getAllFrames() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77631, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77631, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (this.frames == null || this.frames.isEmpty()) {
            return arrayList;
        }
        for (int i = 0; i < this.frames.size(); i++) {
            List list = this.frames.get(Integer.valueOf(i));
            if (list != null && !list.isEmpty()) {
                arrayList.addAll(list);
            }
            String str = this.stickerFaces.get(Integer.valueOf(i));
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public List<String> removeLastSegment() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77625, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77625, new Class[0], List.class);
        } else if (this.frames == null || this.frames.size() <= 0) {
            return new ArrayList();
        } else {
            return this.frames.remove(Integer.valueOf(this.frames.size() - 1));
        }
    }

    public void removeStickerFace() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77627, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77627, new Class[0], Void.TYPE);
            return;
        }
        if (this.stickerFaces != null && !this.stickerFaces.isEmpty()) {
            if (this.frames != null && !this.frames.isEmpty()) {
                i = this.frames.size();
            }
            this.stickerFaces.remove(Integer.valueOf(i));
        }
    }

    public void setStickerIds(String str) {
        this.stickerIds = str;
    }

    public ExtractFramesModel(String str) {
        this.extractType = str;
    }

    public static ExtractFramesModel string2Model(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 77624, new Class[]{String.class}, ExtractFramesModel.class)) {
            return (ExtractFramesModel) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 77624, new Class[]{String.class}, ExtractFramesModel.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            return (ExtractFramesModel) new GsonBuilder().create().fromJson(str2, ExtractFramesModel.class);
        }
    }

    public void addFrameAtLastSegment(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 77629, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 77629, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.frames != null && this.frames.size() > 0) {
            this.frames.get(Integer.valueOf(this.frames.size() - 1)).add(str);
        }
    }

    public void addFrameSegment(@NonNull ArrayList<String> arrayList) {
        if (PatchProxy.isSupport(new Object[]{arrayList}, this, changeQuickRedirect, false, 77628, new Class[]{ArrayList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arrayList}, this, changeQuickRedirect, false, 77628, new Class[]{ArrayList.class}, Void.TYPE);
            return;
        }
        if (this.frames != null) {
            this.frames.put(Integer.valueOf(this.frames.size()), arrayList);
        }
    }

    public void addStickFace(String str) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 77626, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 77626, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.stickerFaces == null) {
            this.stickerFaces = new HashMap();
        }
        if (this.frames != null && !this.frames.isEmpty()) {
            i = this.frames.size();
        }
        this.stickerFaces.put(Integer.valueOf(i), str);
    }
}
