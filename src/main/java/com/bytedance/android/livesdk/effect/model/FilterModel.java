package com.bytedance.android.livesdk.effect.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Keep
public class FilterModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Effect effect;
    private int filterType;
    private boolean isNew;
    private LocalFilterModel localFilter;
    private List<String> tags;
    private int usedType;

    public FilterModel() {
    }

    public Effect getEffect() {
        return this.effect;
    }

    public int getFilterType() {
        return this.filterType;
    }

    public LocalFilterModel getLocalFilter() {
        return this.localFilter;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public int getUsedType() {
        return this.usedType;
    }

    public boolean isNew() {
        return this.isNew;
    }

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 8273, new Class[0], Integer.TYPE)) {
            return getFilterId().hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 8273, new Class[0], Integer.TYPE)).intValue();
    }

    public String getFilterId() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 8268, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 8268, new Class[0], String.class);
        }
        switch (this.filterType) {
            case 0:
            case 1:
                if (this.localFilter == null) {
                    return null;
                }
                return this.localFilter.getId();
            case 2:
                return this.effect.effect_id;
            default:
                return null;
        }
    }

    public String getFilterPath() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 8269, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 8269, new Class[0], String.class);
        }
        switch (this.filterType) {
            case 0:
            case 1:
                if (this.localFilter == null) {
                    return "";
                }
                return this.localFilter.getFilterFilePath();
            case 2:
                if (!new File(this.effect.unzipPath, "config.json").exists()) {
                    return "";
                }
                return new File(this.effect.unzipPath).getAbsolutePath();
            default:
                return "";
        }
    }

    public String getName() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 8270, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 8270, new Class[0], String.class);
        }
        switch (this.filterType) {
            case 0:
            case 1:
                if (this.localFilter == null) {
                    return null;
                }
                return this.localFilter.getName();
            case 2:
                return this.effect.name;
            default:
                return null;
        }
    }

    public void setEffect(Effect effect2) {
        this.effect = effect2;
    }

    public void setFilterType(int i) {
        this.filterType = i;
    }

    public void setLocalFilter(LocalFilterModel localFilterModel) {
        this.localFilter = localFilterModel;
    }

    public void setNew(boolean z) {
        this.isNew = z;
    }

    public void setUsedType(int i) {
        this.usedType = i;
    }

    public FilterModel(Effect effect2) {
        this.filterType = 2;
        this.effect = effect2;
    }

    public void setTags(List<String> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 8271, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 8271, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.tags = new ArrayList();
        this.tags.addAll(list);
    }

    /* JADX WARNING: type inference failed for: r18v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r5 = 0
            r6 = 8272(0x2050, float:1.1592E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 0
            r14 = 8272(0x2050, float:1.1592E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003b:
            r2 = r17
            if (r2 != r0) goto L_0x0040
            return r1
        L_0x0040:
            boolean r1 = r0 instanceof com.bytedance.android.livesdk.effect.model.FilterModel
            if (r1 == 0) goto L_0x0053
            java.lang.String r1 = r17.getFilterId()
            com.bytedance.android.livesdk.effect.model.FilterModel r0 = (com.bytedance.android.livesdk.effect.model.FilterModel) r0
            java.lang.String r0 = r0.getFilterId()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            return r0
        L_0x0053:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.effect.model.FilterModel.equals(java.lang.Object):boolean");
    }
}
