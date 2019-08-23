package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.ViewModelProviders;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.a.a;
import com.ss.android.ugc.aweme.shortvideo.ui.a.c;
import com.ss.android.ugc.aweme.tools.ai;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.gamora.recorder.RecordTitleViewModel;
import java.lang.reflect.Type;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

public final class et implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67601a;

    /* renamed from: b  reason: collision with root package name */
    ShortVideoRecordingOperationPanelFragment f67602b;

    /* renamed from: c  reason: collision with root package name */
    c f67603c;

    /* renamed from: d  reason: collision with root package name */
    a f67604d;

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f67601a, false, 74507, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f67601a, false, 74507, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != ai.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67605a;

                /* renamed from: b  reason: collision with root package name */
                RecordTitleViewModel f67606b;

                /* renamed from: c  reason: collision with root package name */
                fh f67607c;

                /* renamed from: d  reason: collision with root package name */
                ShortVideoContextViewModel f67608d;

                public final void a(Object obj, T t) {
                    long j;
                    int i;
                    boolean z = true;
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f67605a, false, 74508, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f67605a, false, 74508, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    if (this.f67606b == null) {
                        this.f67606b = (RecordTitleViewModel) com.ss.android.ugc.gamora.a.a.a(et.this.f67602b.getActivity()).get(RecordTitleViewModel.class);
                    }
                    if (this.f67607c == null) {
                        this.f67607c = ((ShortVideoContextViewModel) ViewModelProviders.of(et.this.f67602b.getActivity()).get(ShortVideoContextViewModel.class)).f65401b;
                        this.f67608d = (ShortVideoContextViewModel) ViewModelProviders.of(et.this.f67602b.getActivity()).get(ShortVideoContextViewModel.class);
                    }
                    ai aiVar = (ai) t;
                    RecordTitleViewModel recordTitleViewModel = this.f67606b;
                    Pair pair = new Pair(aiVar.f74617b, Long.valueOf(aiVar.f74618c));
                    Intrinsics.checkParameterIsNotNull(pair, "value");
                    recordTitleViewModel.c(new RecordTitleViewModel.f(pair));
                    long j2 = aiVar.f74618c;
                    if (this.f67607c.c()) {
                        j = this.f67607c.f67720c;
                    } else {
                        j = ff.a();
                    }
                    if (j2 <= j) {
                        z = false;
                    }
                    et.this.f67603c.e(z);
                    if (!aiVar.f74617b.isEmpty() || aiVar.f74618c != 0) {
                        c cVar = et.this.f67603c;
                        if (z) {
                            i = 0;
                        } else {
                            i = 4;
                        }
                        cVar.e(i);
                        et.this.f67603c.d(4);
                        et.this.f67603c.c(4);
                        if (this.f67608d.f()) {
                            et.this.f67603c.f(0);
                            et.this.f67603c.e(0);
                        }
                        return;
                    }
                    et.this.f67603c.f(4);
                    et.this.f67603c.e(4);
                    et.this.f67603c.c(0);
                    VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) et.this.f67602b.getActivity();
                    if (!videoRecordNewActivity.f4034c.b() && !videoRecordNewActivity.f4034c.c() && this.f67608d.f()) {
                        et.this.f67603c.d(0);
                    }
                }
            };
        }
    }

    public et(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment, c cVar, a aVar) {
        this.f67602b = shortVideoRecordingOperationPanelFragment;
        this.f67603c = cVar;
        this.f67604d = aVar;
    }
}
