package com.ss.android.ugc.aweme.shortvideo;

import android.app.Dialog;
import android.arch.lifecycle.ViewModelProviders;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.internal.m;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.tools.j;
import com.ss.android.ugc.aweme.tools.n;
import com.ss.android.ugc.aweme.util.c;
import java.lang.reflect.Type;
import java.util.Map;

public final class y implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71489a;

    /* renamed from: b  reason: collision with root package name */
    public final ShortVideoRecordingOperationPanelFragment f71490b;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f71489a, false, 73951, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71489a, false, 73951, new Class[0], Void.TYPE);
            return;
        }
        this.f71490b.q().a((Object) this.f71490b, (bc) new n());
    }

    public y(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        this.f71490b = shortVideoRecordingOperationPanelFragment;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f71489a, false, 73950, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f71489a, false, 73950, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != j.class || this.f71490b.getActivity() == null || this.f71490b.getActivity().isFinishing()) {
            return null;
        } else {
            fh fhVar = ((ShortVideoContextViewModel) ViewModelProviders.of(this.f71490b.getActivity()).get(ShortVideoContextViewModel.class)).f65401b;
            if (fhVar == null) {
                return null;
            }
            r.onEvent(MobClick.obtain().setEventName("cancel_shoot").setLabelName("shoot_page").setJsonObject(this.f71490b.t()));
            if (fhVar.f67719b == 1) {
                if (PatchProxy.isSupport(new Object[0], this, f71489a, false, 73955, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f71489a, false, 73955, new Class[0], Void.TYPE);
                } else {
                    Dialog a2 = new a.C0185a(this.f71490b.getContext()).b((int) C0906R.string.bux).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) null).a((int) C0906R.string.aja, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f71491a;

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f71491a, false, 73959, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f71491a, false, 73959, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            y.this.a();
                        }
                    }).a().a();
                    if (!com.ss.android.ugc.aweme.app.a.a.a(this.f71490b.getContext())) {
                        v.a(a2);
                    }
                    a2.show();
                }
            } else {
                m mVar = (m) com.ss.android.ugc.aweme.common.g.a.a(this.f71490b.getContext(), m.class);
                String e2 = com.ss.android.ugc.aweme.port.in.a.L.e(e.a.RecordTutorialLink);
                if (com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableRecordTutorial) && !TextUtils.isEmpty(e2) && mVar != null && mVar.d(true)) {
                    mVar.e(false);
                    if (PatchProxy.isSupport(new Object[]{e2}, this, f71489a, false, 73953, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{e2}, this, f71489a, false, 73953, new Class[]{String.class}, Void.TYPE);
                    } else {
                        Dialog a3 = new a.C0185a(this.f71490b.getContext()).b((int) C0906R.string.bxe).b((int) C0906R.string.bxc, (DialogInterface.OnClickListener) new z(this)).a((int) C0906R.string.bxd, (DialogInterface.OnClickListener) new aa(this, e2)).a().a();
                        if (!com.ss.android.ugc.aweme.app.a.a.a(this.f71490b.getContext())) {
                            v.a(a3);
                        }
                        a3.show();
                        r.a("tutorial_popup_show", (Map) d.a().a("enter_from", "video_shoot_page").f34114b);
                    }
                } else if (fhVar.n == 0) {
                    a();
                } else {
                    if (PatchProxy.isSupport(new Object[0], this, f71489a, false, 73956, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f71489a, false, 73956, new Class[0], Void.TYPE);
                    } else {
                        try {
                            new AlertDialog.Builder(this.f71490b.getContext(), C0906R.style.rf).setMessage((int) C0906R.string.ajd).setNegativeButton((int) C0906R.string.pm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f71497a;

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f71497a, false, 73962, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f71497a, false, 73962, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                    } else if (!y.this.f71490b.isDetached()) {
                                        r.onEvent(MobClick.obtain().setEventName("cancel_shoot_fail").setLabelName("shoot_page").setJsonObject(y.this.f71490b.t()));
                                    }
                                }
                            }).setPositiveButton((int) C0906R.string.ii, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f71495a;

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f71495a, false, 73961, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f71495a, false, 73961, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                    } else if (!y.this.f71490b.isDetached()) {
                                        com.ss.android.ugc.aweme.port.in.a.p.a();
                                        y.this.a();
                                        r.onEvent(MobClick.obtain().setEventName("cancel_shoot_confirm").setLabelName("shoot_page").setJsonObject(y.this.f71490b.t()));
                                    }
                                }
                            }).setNeutralButton((int) C0906R.string.ia, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f71493a;

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f71493a, false, 73960, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f71493a, false, 73960, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                    } else if (y.this.f71490b.getActivity() != null) {
                                        fh fhVar = ((ShortVideoContextViewModel) ViewModelProviders.of(y.this.f71490b.getActivity()).get(ShortVideoContextViewModel.class)).f65401b;
                                        r.a("reshoot", (Map) d.a().a("creation_id", fhVar.q).a("shoot_way", fhVar.r).a("draft_id", fhVar.v).f34114b);
                                        y yVar = y.this;
                                        if (PatchProxy.isSupport(new Object[0], yVar, y.f71489a, false, 73952, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], yVar, y.f71489a, false, 73952, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        yVar.f71490b.q().a((Object) yVar.f71490b, (bc) new com.ss.android.ugc.aweme.tools.m());
                                    }
                                }
                            }).show();
                        } catch (Exception e3) {
                            c.a(e3.toString());
                        }
                    }
                }
            }
            return null;
        }
    }
}
