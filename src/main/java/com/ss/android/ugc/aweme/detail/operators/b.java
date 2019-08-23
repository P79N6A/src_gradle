package com.ss.android.ugc.aweme.detail.operators;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.detail.e.a;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.detail.operators.s;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public class b implements s.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41216a;

    /* renamed from: b  reason: collision with root package name */
    protected a f41217b = new a(1);

    /* renamed from: c  reason: collision with root package name */
    private String f41218c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.detail.e.b f41219d = new com.ss.android.ugc.aweme.detail.e.b();

    public int a(int i) {
        return i + PushConstants.WORK_RECEIVER_EVENTCORE_ERROR;
    }

    public final boolean a(@NonNull Fragment fragment) {
        return true;
    }

    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f41216a, false, 34753, new Class[0], Boolean.TYPE)) {
            return this.f41219d.m();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f41216a, false, 34753, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f41216a, false, 34755, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41216a, false, 34755, new Class[0], Void.TYPE);
            return;
        }
        this.f41219d.k();
        this.f41219d.j();
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f41216a, false, 34752, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f41216a, false, 34752, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f41217b.getData() == null || CollectionUtils.isEmpty(((BatchDetailList) this.f41217b.getData()).getItems())) {
            return true;
        } else {
            return false;
        }
    }

    public b(@Nullable String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "[" + str + "]";
        }
        this.f41218c = str2;
    }

    public final void a(@NonNull DetailFragmentPanel detailFragmentPanel) {
        if (PatchProxy.isSupport(new Object[]{detailFragmentPanel}, this, f41216a, false, 34750, new Class[]{DetailFragmentPanel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{detailFragmentPanel}, this, f41216a, false, 34750, new Class[]{DetailFragmentPanel.class}, Void.TYPE);
            return;
        }
        this.f41219d.a(detailFragmentPanel);
        this.f41219d.a(this.f41217b);
    }

    public final boolean a(@NonNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f41216a, false, 34754, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f41216a, false, 34754, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        Aweme b2 = com.ss.android.ugc.aweme.feed.a.a().b(str2);
        if (b2 == null) {
            b2 = com.ss.android.ugc.aweme.feed.a.a().a(str2);
        }
        if (b2 == null) {
            return false;
        }
        com.ss.android.ugc.aweme.detail.e.b bVar = this.f41219d;
        if (PatchProxy.isSupport(new Object[]{b2}, bVar, com.ss.android.ugc.aweme.detail.e.b.f41184a, false, 34997, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{b2}, bVar, com.ss.android.ugc.aweme.detail.e.b.f41184a, false, 34997, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (bVar.f2978e == null || ((a) bVar.f2978e).getData() == null || ((BatchDetailList) ((a) bVar.f2978e).getData()).getItems() == null || !((BatchDetailList) ((a) bVar.f2978e).getData()).getItems().remove(b2)) {
            return false;
        } else {
            return true;
        }
    }

    public void a(int i, @NonNull com.ss.android.ugc.aweme.feed.param.b bVar, int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f41216a, false, 34751, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z)}, this, f41216a, false, 34751, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f41219d.a(this.f41218c, bVar.getPushParams(), bVar.getEventType());
    }
}
