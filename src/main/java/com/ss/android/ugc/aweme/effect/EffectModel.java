package com.ss.android.ugc.aweme.effect;

import com.google.common.a.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;

public class EffectModel implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String category;
    public int color;
    public int duration;
    public String hint;
    public String iconUrl;
    public int imagePath;
    public String key;
    public String name;
    public String resDir;
    public int type;

    public int hashCode() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 38572, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 38572, new Class[0], Integer.TYPE)).intValue();
        }
        return j.a(this.name, this.hint, Integer.valueOf(this.imagePath), this.key, Integer.valueOf(this.type), this.iconUrl, this.resDir, Integer.valueOf(this.color), Integer.valueOf(this.duration), this.category);
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 38571, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 38571, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            EffectModel effectModel = (EffectModel) obj;
            if (this.imagePath != effectModel.imagePath || this.type != effectModel.type || this.color != effectModel.color || this.duration != effectModel.duration || !j.a(this.name, effectModel.name) || !j.a(this.hint, effectModel.hint) || !j.a(this.key, effectModel.key) || !j.a(this.iconUrl, effectModel.iconUrl) || !j.a(this.resDir, effectModel.resDir) || !j.a(this.category, effectModel.category)) {
                return false;
            }
            return true;
        }
    }
}
