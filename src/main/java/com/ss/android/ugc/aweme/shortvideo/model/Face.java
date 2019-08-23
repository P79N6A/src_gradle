package com.ss.android.ugc.aweme.shortvideo.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class Face {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long data_added;
    public int height;
    public String origin_path;
    public String path;
    public int width;

    public Face() {
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77634, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77634, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.path != null) {
            i = this.path.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        if (this.origin_path != null) {
            i2 = this.origin_path.hashCode();
        }
        return ((((((i3 + i2) * 31) + this.width) * 31) + this.height) * 31) + ((int) (this.data_added ^ (this.data_added >>> 32)));
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 77633, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 77633, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Face face = (Face) obj;
            if (this.width != face.width || this.height != face.height || this.data_added != face.data_added) {
                return false;
            }
            if (this.path == null ? face.path != null : !this.path.equals(face.path)) {
                return false;
            }
            if (this.origin_path != null) {
                return this.origin_path.equals(face.origin_path);
            }
            if (face.origin_path == null) {
                return true;
            }
            return false;
        }
    }

    public Face(String str, String str2, int i, int i2, long j) {
        this.path = str;
        this.origin_path = str2;
        this.width = i;
        this.height = i2;
        this.data_added = j;
    }
}
