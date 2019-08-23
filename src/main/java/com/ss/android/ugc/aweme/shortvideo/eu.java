package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.ViewModelProviders;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.ui.a.a;
import com.ss.android.ugc.aweme.tools.ai;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.gamora.recorder.RecordToolbarViewModel;
import java.lang.reflect.Type;

public final class eu implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67610a;

    /* renamed from: b  reason: collision with root package name */
    ShortVideoRecordingOperationPanelFragment f67611b;

    /* renamed from: c  reason: collision with root package name */
    public a f67612c;

    /* renamed from: d  reason: collision with root package name */
    public RecordToolbarViewModel f67613d;

    eu(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment, a aVar) {
        this.f67611b = shortVideoRecordingOperationPanelFragment;
        this.f67612c = aVar;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        if (PatchProxy.isSupport(new Object[]{bdVar, type}, this, f67610a, false, 74509, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type}, this, f67610a, false, 74509, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type != ai.class) {
            return null;
        } else {
            final bg a2 = bdVar.a((bh) this, type);
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67614a;

                public final void a(Object obj, T t) {
                    boolean z;
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f67614a, false, 74510, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f67614a, false, 74510, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    if (a2 != null) {
                        a2.a(obj, t);
                    }
                    ai aiVar = (ai) t;
                    if (eu.this.f67613d == null) {
                        eu.this.f67613d = (RecordToolbarViewModel) ViewModelProviders.of(eu.this.f67611b.getActivity()).get(RecordToolbarViewModel.class);
                    }
                    if (aiVar.f74618c != 0 || !aiVar.f74617b.isEmpty()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f67614a, false, 74511, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67614a, false, 74511, new Class[]{Boolean.TYPE}, Void.TYPE);
                    } else if (eu.this.f67611b.r().f65401b.b() || eu.this.f67611b.r().f65401b.c()) {
                        eu.this.f67612c.g(8);
                    } else {
                        eu.this.f67612c.f(z);
                        if (z) {
                            eu.this.f67612c.a(1.0f);
                            eu.this.f67612c.i(255);
                            if (ej.a().b() == null) {
                                eu.this.f67612c.a(com.ss.android.ugc.bytex.a.a.a.a(eu.this.f67611b.getContext().getResources(), 2130839503));
                                eu.this.f67612c.h(C0906R.string.sy);
                            }
                        } else {
                            eu.this.f67612c.i(127);
                            eu.this.f67612c.a(0.5f);
                            if (ej.a().b() != null && eu.this.f67611b.r().f65401b.a()) {
                                eu.this.f67612c.a(com.ss.android.ugc.bytex.a.a.a.a(eu.this.f67611b.getResources(), 2130839504));
                                e b2 = ej.a().b();
                                if (b2 != null) {
                                    StringBuilder sb = new StringBuilder(b2.getName());
                                    if (b2.getSinger() != null && !b2.getSinger().isEmpty()) {
                                        sb.append("-");
                                        sb.append(b2.getSinger());
                                    }
                                    eu.this.f67612c.a(sb.toString());
                                }
                            }
                        }
                    }
                    eu.this.f67613d.k.setValue(Boolean.valueOf(z));
                }
            };
        }
    }
}
