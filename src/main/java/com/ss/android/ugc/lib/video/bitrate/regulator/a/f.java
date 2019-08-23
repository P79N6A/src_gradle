package com.ss.android.ugc.lib.video.bitrate.regulator.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.lib.video.bitrate.regulator.b;
import java.util.Collections;
import java.util.List;

public class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77677a;

    /* renamed from: b  reason: collision with root package name */
    public c f77678b;

    /* renamed from: c  reason: collision with root package name */
    public b f77679c;

    /* renamed from: d  reason: collision with root package name */
    public int f77680d;

    /* renamed from: e  reason: collision with root package name */
    public double f77681e;

    public int getBitRate() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f77677a, false, 90489, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f77677a, false, 90489, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f77678b != null) {
            i = this.f77678b.getBitRate();
        }
        return i;
    }

    public String getGearName() {
        if (PatchProxy.isSupport(new Object[0], this, f77677a, false, 90490, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f77677a, false, 90490, new Class[0], String.class);
        } else if (this.f77678b != null) {
            return this.f77678b.getGearName();
        } else {
            return "";
        }
    }

    public int getQualityType() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f77677a, false, 90491, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f77677a, false, 90491, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f77678b != null) {
            i = this.f77678b.getQualityType();
        }
        return i;
    }

    public String getUrlKey() {
        if (PatchProxy.isSupport(new Object[0], this, f77677a, false, 90493, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f77677a, false, 90493, new Class[0], String.class);
        } else if (this.f77678b != null) {
            return this.f77678b.getUrlKey();
        } else {
            return "";
        }
    }

    public int isH265() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f77677a, false, 90492, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f77677a, false, 90492, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f77678b != null) {
            i = this.f77678b.isH265();
        }
        return i;
    }

    public List<String> urlList() {
        if (PatchProxy.isSupport(new Object[0], this, f77677a, false, 90494, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f77677a, false, 90494, new Class[0], List.class);
        } else if (this.f77678b != null) {
            return this.f77678b.urlList();
        } else {
            return Collections.emptyList();
        }
    }
}
