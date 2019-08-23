package com.ss.android.ugc.aweme.im.sdk.chat.input.photo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.chooser.f;
import com.ss.android.ugc.aweme.im.sdk.chat.model.OnlyPictureContent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class j implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<String> checkTexts;
    private int fromGallery = 1;
    private int height;
    private String mime;
    private String path;
    private int with;

    public List<String> getCheckTexts() {
        return this.checkTexts;
    }

    public int getFromGallery() {
        return this.fromGallery;
    }

    public int getHeight() {
        return this.height;
    }

    public String getMime() {
        return this.mime;
    }

    public String getPath() {
        return this.path;
    }

    public int getWith() {
        return this.with;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 50997, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 50997, new Class[0], String.class);
        }
        return "PhotoParam{path='" + this.path + '\'' + ", mime='" + this.mime + '\'' + ", with=" + this.with + ", height=" + this.height + ", fromGallery=" + this.fromGallery + ", checkTexts=" + this.checkTexts + '}';
    }

    public void setCheckTexts(List<String> list) {
        this.checkTexts = list;
    }

    public void setFromGallery(int i) {
        this.fromGallery = i;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setMime(String str) {
        this.mime = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setWith(int i) {
        this.with = i;
    }

    public static j fromContent(OnlyPictureContent onlyPictureContent) {
        if (PatchProxy.isSupport(new Object[]{onlyPictureContent}, null, changeQuickRedirect, true, 51000, new Class[]{OnlyPictureContent.class}, j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[]{onlyPictureContent}, null, changeQuickRedirect, true, 51000, new Class[]{OnlyPictureContent.class}, j.class);
        }
        j jVar = new j();
        jVar.path = onlyPictureContent.getPicturePath();
        jVar.mime = onlyPictureContent.getMime();
        jVar.with = onlyPictureContent.getWidth();
        jVar.height = onlyPictureContent.getHeight();
        return jVar;
    }

    public static j fromMediaModel(f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, null, changeQuickRedirect, true, 50998, new Class[]{f.class}, j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[]{fVar2}, null, changeQuickRedirect, true, 50998, new Class[]{f.class}, j.class);
        } else if (fVar2 == null) {
            return null;
        } else {
            j jVar = new j();
            jVar.path = fVar2.f27990b;
            jVar.mime = fVar2.g;
            jVar.with = fVar2.i;
            jVar.height = fVar2.j;
            return jVar;
        }
    }

    public static ArrayList<j> fromPhotoItems(List<i> list) {
        if (PatchProxy.isSupport(new Object[]{list}, null, changeQuickRedirect, true, 50999, new Class[]{List.class}, ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[]{list}, null, changeQuickRedirect, true, 50999, new Class[]{List.class}, ArrayList.class);
        } else if (list == null || list.isEmpty()) {
            return null;
        } else {
            ArrayList<j> arrayList = new ArrayList<>();
            for (i next : list) {
                if (next != null) {
                    arrayList.add(fromMediaModel(next.f50847b));
                }
            }
            return arrayList;
        }
    }
}
