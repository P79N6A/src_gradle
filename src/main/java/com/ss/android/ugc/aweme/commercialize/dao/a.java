package com.ss.android.ugc.aweme.commercialize.dao;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Entity(tableName = "showAd")
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38662a;
    @PrimaryKey
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public String f38663b;

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f38662a, false, 30530, new Class[0], Integer.TYPE)) {
            return super.hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f38662a, false, 30530, new Class[0], Integer.TYPE)).intValue();
    }

    public a(String str) {
        this.f38663b = str;
    }

    public boolean equals(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, this, f38662a, false, 30529, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, f38662a, false, 30529, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj2 instanceof a) {
            return TextUtils.equals(((a) obj2).f38663b, this.f38663b);
        } else {
            return false;
        }
    }
}
