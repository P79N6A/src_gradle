package com.ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.record.i;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.tools.g;
import com.ss.android.ugc.gamora.a.a;
import com.ss.android.ugc.gamora.recorder.RecordTitleViewModel;
import java.lang.reflect.Type;

public final class dy implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66803a;

    /* renamed from: b  reason: collision with root package name */
    ShortVideoRecordingOperationPanelFragment f66804b;

    public dy(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        this.f66804b = shortVideoRecordingOperationPanelFragment;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        if (PatchProxy.isSupport(new Object[]{bdVar, type}, this, f66803a, false, 74368, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type}, this, f66803a, false, 74368, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type != g.class) {
            return null;
        } else {
            final bg a2 = bdVar.a((bh) this, type);
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f66805a;

                /* renamed from: b  reason: collision with root package name */
                RecordTitleViewModel f66806b;

                private void a(int i) {
                    boolean z;
                    boolean z2 = true;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f66805a, false, 74370, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f66805a, false, 74370, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    RecordTitleViewModel recordTitleViewModel = this.f66806b;
                    if (i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    recordTitleViewModel.a(z);
                    RecordTitleViewModel recordTitleViewModel2 = this.f66806b;
                    if (i != 0) {
                        z2 = false;
                    }
                    recordTitleViewModel2.b(z2);
                }

                public final void a(Object obj, T t) {
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f66805a, false, 74369, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f66805a, false, 74369, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    if (a2 != null) {
                        a2.a(obj, t);
                    }
                    if (this.f66806b == null) {
                        this.f66806b = (RecordTitleViewModel) a.a(dy.this.f66804b.getActivity()).get(RecordTitleViewModel.class);
                    }
                    g gVar = (g) t;
                    if (PatchProxy.isSupport(new Object[]{gVar}, this, f66805a, false, 74371, new Class[]{g.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{gVar}, this, f66805a, false, 74371, new Class[]{g.class}, Void.TYPE);
                    } else {
                        CharSequence charSequence = (CharSequence) gVar.f74762c;
                        if ((TextUtils.equals(charSequence, dy.this.f66804b.getResources().getString(i.RECORD_MODE_M.getTagResId())) || TextUtils.equals(charSequence, dy.this.f66804b.getResources().getString(com.ss.android.ugc.aweme.shortvideo.record.g.RECORD_MODE_M.getTagResId()))) && (dy.this.f66804b instanceof PlanC)) {
                            this.f66806b.f77609e.setValue(null);
                        }
                    }
                    if (TextUtils.equals((CharSequence) gVar.f74762c, dy.this.f66804b.getResources().getString(C0906R.string.bx9)) || TextUtils.equals((CharSequence) gVar.f74762c, dy.this.f66804b.getResources().getString(C0906R.string.bx3))) {
                        a(8);
                    } else if (!dy.this.f66804b.r().f65401b.b() && !dy.this.f66804b.r().f65401b.c()) {
                        if (!(dy.this.f66804b instanceof PlanC) || !((PlanC) dy.this.f66804b).c() || ((PlanC) dy.this.f66804b).z) {
                            a(0);
                        }
                    }
                }
            };
        }
    }
}
