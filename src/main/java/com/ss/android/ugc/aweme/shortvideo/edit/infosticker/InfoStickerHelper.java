package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModelProviders;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.ArrayMap;
import android.support.v4.util.Pair;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.common.internal.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.effect.j;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.bi;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.c;
import com.ss.android.ugc.aweme.shortvideo.edit.p;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.StoryStickerGestureLayout;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.g;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o;
import com.ss.android.vesdk.aj;
import com.ss.android.vesdk.r;
import dmt.av.video.s;
import dmt.av.video.w;
import java.util.FormatFlagsConversionMismatchException;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public class InfoStickerHelper implements LifecycleObserver, p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67201a;
    private View A;
    private String B;
    private boolean C;
    private int D;
    private Map<c, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.a> E = new ArrayMap();

    /* renamed from: b  reason: collision with root package name */
    public boolean f67202b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f67203c;

    /* renamed from: d  reason: collision with root package name */
    FragmentActivity f67204d;

    /* renamed from: e  reason: collision with root package name */
    public CutMultiVideoViewModel f67205e;

    /* renamed from: f  reason: collision with root package name */
    public int f67206f = 30;
    public com.ss.android.vesdk.p g;
    StoryStickerGestureLayout h;
    public InfoStickerViewModel i;
    public cb j;
    public boolean k;
    public List<com.ss.android.ugc.aweme.music.b.a.a> l;
    public SafeHandler m;
    @BindView(2131492974)
    ImageView mCancelBtn;
    @BindView(2131493025)
    View mContentLayout;
    @BindView(2131493289)
    public InfoStickerEditView mInfoStickerEditView;
    @BindView(2131492963)
    ImageView mPlayBtn;
    @BindView(2131493617)
    ImageView mSaveBtn;
    @BindView(2131493773)
    DmtTextView mSelectTitle;
    @BindView(2131493909)
    public VideoEditView mVideoEditView;
    public g n;
    FrameLayout o;
    public MutableLiveData<Bitmap> p;
    public MutableLiveData<Boolean> q;
    public int r;
    int s;
    public Rect t;
    public com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.a u;
    public Runnable v = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67207a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f67207a, false, 76852, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f67207a, false, 76852, new Class[0], Void.TYPE);
            } else if (InfoStickerHelper.this.g != null) {
                InfoStickerHelper.this.f67205e.f66182d.setValue(Long.valueOf((long) InfoStickerHelper.this.g.u()));
                InfoStickerHelper.this.m.postDelayed(InfoStickerHelper.this.v, 30);
            }
        }
    };
    public b w;
    public a x;
    public c y;
    boolean z;

    public interface a {
        void a(boolean z);

        void b(boolean z);
    }

    public interface b {
        int a(y yVar, boolean z, boolean z2);

        PointF a(y yVar, float f2, float f3);

        Float a(float f2);

        void a(y yVar, int i, int i2, boolean z, boolean z2);
    }

    public final void a(@Nullable c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f67201a, false, 76791, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f67201a, false, 76791, new Class[]{c.class}, Void.TYPE);
        } else if (cVar != this.y) {
            if (cVar != null) {
                if (!this.E.containsKey(cVar)) {
                    this.E.put(cVar, cVar.d());
                }
                cVar.setAlpha(true);
                if (e(cVar)) {
                    this.g.s();
                }
                f(cVar);
                if (this.y != null) {
                    this.y.setAlpha(false);
                    if (e(this.y)) {
                        this.g.s();
                    }
                }
                c(cVar);
            } else {
                for (Map.Entry next : this.E.entrySet()) {
                    c cVar2 = (c) next.getKey();
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.a aVar = (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.a) next.getValue();
                    if (!(cVar2 == null || aVar == null)) {
                        cVar2.a(aVar, this.mInfoStickerEditView.f67187d, this.mInfoStickerEditView.f67188e);
                    }
                }
                this.E.clear();
            }
            this.y = cVar;
        }
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f67201a, false, 76793, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f67201a, false, 76793, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.mInfoStickerEditView.a(z2);
    }

    public final void a(FragmentActivity fragmentActivity, View view, @NonNull List<com.ss.android.ugc.aweme.music.b.a.a> list) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        View view2 = view;
        List<com.ss.android.ugc.aweme.music.b.a.a> list2 = list;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, view2, list2}, this, f67201a, false, 76794, new Class[]{FragmentActivity.class, View.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity2, view2, list2}, this, f67201a, false, 76794, new Class[]{FragmentActivity.class, View.class, List.class}, Void.TYPE);
            return;
        }
        this.l = list2;
        a(fragmentActivity2, view2, list2.get(0).f56315e);
    }

    public final void a(FragmentActivity fragmentActivity, View view, String str, boolean z2) {
        final FragmentActivity fragmentActivity2 = fragmentActivity;
        View view2 = view;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, view2, str2, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f67201a, false, 76797, new Class[]{FragmentActivity.class, View.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity2, view2, str2, Byte.valueOf(z2)}, this, f67201a, false, 76797, new Class[]{FragmentActivity.class, View.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f67204d = fragmentActivity2;
        this.B = str2;
        this.m = new SafeHandler(fragmentActivity2);
        this.i = (InfoStickerViewModel) ViewModelProviders.of(fragmentActivity).get(InfoStickerViewModel.class);
        this.A = ((ViewStub) view2.findViewById(C0906R.id.cwp)).inflate();
        ButterKnife.bind((Object) this, this.A);
        this.mInfoStickerEditView.w = this.f67202b;
        this.mInfoStickerEditView.setVisibility(0);
        this.mInfoStickerEditView.a(fragmentActivity, this.m, this.g, this.h, this.j, z2);
        this.mContentLayout.setVisibility(8);
        this.mInfoStickerEditView.setOnInfoStickerTimeEdit(new g(this));
        this.o = (FrameLayout) this.A.findViewById(C0906R.id.ci4);
        this.o.getViewTreeObserver().addOnGlobalLayoutListener(new h(this, fragmentActivity2, z2));
        k();
        this.mInfoStickerEditView.setStickerOnMoveListener(new b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f67209a;

            public final Float a(float f2) {
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f67209a, false, 76856, new Class[]{Float.TYPE}, Float.class)) {
                    return (Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f67209a, false, 76856, new Class[]{Float.TYPE}, Float.class);
                } else if (InfoStickerHelper.this.u != null) {
                    return InfoStickerHelper.this.u.a(f2);
                } else {
                    return Float.valueOf(f2);
                }
            }

            public final int a(y yVar, boolean z, boolean z2) {
                y yVar2 = yVar;
                if (PatchProxy.isSupport(new Object[]{yVar2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f67209a, false, 76854, new Class[]{y.class, Boolean.TYPE, Boolean.TYPE}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{yVar2, Byte.valueOf(z), Byte.valueOf(z2)}, this, f67209a, false, 76854, new Class[]{y.class, Boolean.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
                } else if (InfoStickerHelper.this.u == null) {
                    return -1;
                } else {
                    if (z) {
                        InfoStickerHelper.this.u.a();
                    } else if (yVar2 != null && !InfoStickerHelper.this.a()) {
                        return InfoStickerHelper.this.u.a(yVar.c((float) InfoStickerHelper.this.r), z2, false);
                    }
                    return -1;
                }
            }

            public final PointF a(y yVar, float f2, float f3) {
                y yVar2 = yVar;
                float f4 = f2;
                float f5 = f3;
                if (PatchProxy.isSupport(new Object[]{yVar2, Float.valueOf(f2), Float.valueOf(f3)}, this, f67209a, false, 76855, new Class[]{y.class, Float.TYPE, Float.TYPE}, PointF.class)) {
                    return (PointF) PatchProxy.accessDispatch(new Object[]{yVar2, Float.valueOf(f2), Float.valueOf(f3)}, this, f67209a, false, 76855, new Class[]{y.class, Float.TYPE, Float.TYPE}, PointF.class);
                } else if (InfoStickerHelper.this.u == null || yVar2 == null) {
                    return new PointF(0.0f, 0.0f);
                } else {
                    PointF[] c2 = yVar2.c((float) InfoStickerHelper.this.r);
                    for (PointF pointF : c2) {
                        pointF.x += f4;
                        pointF.y += f5;
                    }
                    return InfoStickerHelper.this.u.a(c2, f4, f5, false);
                }
            }

            public final void a(y yVar, int i, int i2, boolean z, boolean z2) {
                y yVar2 = yVar;
                int i3 = 0;
                boolean z3 = true;
                if (PatchProxy.isSupport(new Object[]{yVar2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f67209a, false, 76853, new Class[]{y.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{yVar2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z), Byte.valueOf(z2)}, this, f67209a, false, 76853, new Class[]{y.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
                    return;
                }
                if (!z2) {
                    if (z) {
                        InfoStickerHelper.this.g.c(yVar2.f67432c.id, 1.0f);
                    }
                    if (InfoStickerHelper.this.i == null || InfoStickerHelper.this.i.f67219d == null || !((Boolean) InfoStickerHelper.this.i.f67219d.getValue()).booleanValue()) {
                        z3 = false;
                    }
                    if (!z3) {
                        if (fc.a()) {
                            fb.a(fragmentActivity2);
                            if (fb.a()) {
                                i3 = -fc.c(fragmentActivity2);
                            }
                        }
                        InfoStickerHelper.this.n.a(yVar, i, i2, z, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.a(InfoStickerHelper.this.t, yVar2.b((float) InfoStickerHelper.this.r, (float) i3)));
                    }
                }
                if (InfoStickerHelper.this.w != null) {
                    InfoStickerHelper.this.w.a(yVar, i, i2, z, z2);
                }
                if (InfoStickerHelper.this.a()) {
                    InfoStickerHelper.this.g.s();
                }
            }
        });
        this.mInfoStickerEditView.h.i = new q(this);
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f67201a, false, 76798, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f67201a, false, 76798, new Class[0], Boolean.TYPE)).booleanValue();
        }
        MutableLiveData<Boolean> mutableLiveData = this.i.f67219d;
        if (mutableLiveData == null || mutableLiveData.getValue() == null) {
            return false;
        }
        return ((Boolean) mutableLiveData.getValue()).booleanValue();
    }

    public final void a(com.ss.android.vesdk.p pVar, FrameLayout frameLayout) {
        if (PatchProxy.isSupport(new Object[]{pVar, frameLayout}, this, f67201a, false, 76799, new Class[]{com.ss.android.vesdk.p.class, FrameLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pVar, frameLayout}, this, f67201a, false, 76799, new Class[]{com.ss.android.vesdk.p.class, FrameLayout.class}, Void.TYPE);
        } else if (pVar != null && frameLayout != null) {
            this.o.post(new r(this, pVar, frameLayout));
        }
    }

    public final void a(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f67201a, false, 76809, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f67201a, false, 76809, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.mInfoStickerEditView.setStickerDataChangeListener(aVar2);
    }

    public final void a(String str, String str2, String str3, int i2) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6, Integer.valueOf(i2)}, this, f67201a, false, 76815, new Class[]{String.class, String.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6, Integer.valueOf(i2)}, this, f67201a, false, 76815, new Class[]{String.class, String.class, String.class, Integer.TYPE}, Void.TYPE);
        } else if (this.mInfoStickerEditView.getStickNumber() >= this.f67206f) {
            com.bytedance.ies.dmt.ui.d.a.b(this.mInfoStickerEditView.getContext(), (int) C0906R.string.b1e, 0).a();
        } else {
            this.mInfoStickerEditView.a(str4, str5, str6, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(int i2, int i3, int i4, c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), 0, cVar2}, this, f67201a, false, 76827, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, c.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), 0, cVar2}, this, f67201a, false, 76827, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, c.class}, Boolean.TYPE)).booleanValue();
        }
        int i5 = i2;
        boolean a2 = this.mVideoEditView.a(i2, i3, 0);
        if (a2 && cVar2 != null) {
            this.f67205e.f66182d.setValue(Long.valueOf((long) cVar2.a(0)));
            this.i.a().setValue(s.b((long) cVar2.a(0)));
        }
        return a2;
    }

    public final boolean a(@NotNull RectF rectF) {
        if (PatchProxy.isSupport(new Object[]{rectF}, this, f67201a, false, 76831, new Class[]{RectF.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{rectF}, this, f67201a, false, 76831, new Class[]{RectF.class}, Boolean.TYPE)).booleanValue();
        } else if (!this.j.hasInfoStickers()) {
            return false;
        } else {
            aj d2 = this.g.d();
            RectF rectF2 = new RectF();
            for (com.ss.android.ugc.aweme.n.b next : this.j.infoStickerModel.stickers) {
                try {
                    float[] g2 = this.g.g(next.id);
                    rectF2.set(g2[0] * ((float) d2.f77890a), g2[3] * ((float) d2.f77891b), g2[2] * ((float) d2.f77890a), g2[1] * ((float) d2.f77891b));
                    if (rectF2.top >= rectF.top) {
                        if (rectF2.bottom > rectF.bottom) {
                        }
                    }
                    return true;
                } catch (r e2) {
                    ai.b("getInfoStickerBoundingBox error, index is " + next.id + " veState is " + this.g.l().getValue());
                    throw e2;
                }
            }
            return false;
        }
    }

    public final boolean h() {
        if (this.mInfoStickerEditView != null) {
            return this.mInfoStickerEditView.v;
        }
        return false;
    }

    private String m() {
        if (!PatchProxy.isSupport(new Object[0], this, f67201a, false, 76802, new Class[0], String.class)) {
            return d(this.y);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f67201a, false, 76802, new Class[0], String.class);
    }

    private void p() {
        if (PatchProxy.isSupport(new Object[0], this, f67201a, false, 76821, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67201a, false, 76821, new Class[0], Void.TYPE);
            return;
        }
        a(false, (c) null);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f67201a, false, 76810, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67201a, false, 76810, new Class[0], Void.TYPE);
            return;
        }
        if (this.C) {
            d();
        }
    }

    private void k() {
        if (PatchProxy.isSupport(new Object[0], this, f67201a, false, 76800, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67201a, false, 76800, new Class[0], Void.TYPE);
            return;
        }
        this.n = this.h.getDeleteView();
        if (this.f67202b) {
            this.n.a();
        }
        this.n.setStickerDeleteListener(new g.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f67212a;

            public final boolean a() {
                return true;
            }

            public final boolean a(Object obj) {
                if (PatchProxy.isSupport(new Object[]{obj}, this, f67212a, false, 76857, new Class[]{Object.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f67212a, false, 76857, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
                } else if (obj == null || !(obj instanceof y) || InfoStickerHelper.this.g == null) {
                    return false;
                } else {
                    InfoStickerHelper.this.g.c(((y) obj).f67432c.id, 0.3137255f);
                    return true;
                }
            }

            public final boolean c(Object obj) {
                if (PatchProxy.isSupport(new Object[]{obj}, this, f67212a, false, 76859, new Class[]{Object.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f67212a, false, 76859, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
                } else if (obj == null || !(obj instanceof y) || InfoStickerHelper.this.g == null) {
                    return false;
                } else {
                    InfoStickerHelper.this.g.c(((y) obj).f67432c.id, 1.0f);
                    return true;
                }
            }

            public final boolean b(Object obj) {
                String str;
                Object obj2 = obj;
                if (PatchProxy.isSupport(new Object[]{obj2}, this, f67212a, false, 76858, new Class[]{Object.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, f67212a, false, 76858, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
                }
                if (!(obj2 == null || !(obj2 instanceof y) || InfoStickerHelper.this.mInfoStickerEditView == null)) {
                    InfoStickerEditView infoStickerEditView = InfoStickerHelper.this.mInfoStickerEditView;
                    if (PatchProxy.isSupport(new Object[0], infoStickerEditView, InfoStickerEditView.f67184a, false, 76770, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], infoStickerEditView, InfoStickerEditView.f67184a, false, 76770, new Class[0], Void.TYPE);
                    } else if (infoStickerEditView.l != null) {
                        infoStickerEditView.l.a();
                    }
                    if (InfoStickerHelper.this.mInfoStickerEditView.h != null) {
                        y yVar = (y) obj2;
                        InfoStickerHelper.this.mInfoStickerEditView.h.a(yVar);
                        if (yVar.f67432c != null) {
                            com.ss.android.ugc.aweme.utils.a aVar = com.ss.android.ugc.aweme.utils.a.f75468b;
                            d a2 = d.a().a("creation_id", InfoStickerHelper.this.j.creationId).a("draft_id", InfoStickerHelper.this.j.draftId);
                            if (InfoStickerHelper.this.f67202b) {
                                str = "edit_post_page";
                            } else {
                                str = "video_edit_page";
                            }
                            aVar.a("prop_delete", a2.a("enter_from", str).a("prop_id", yVar.f67432c.stickerId).a("shoot_way", InfoStickerHelper.this.j.mShootWay).f34114b);
                        }
                        return true;
                    }
                }
                return false;
            }
        });
    }

    private boolean n() {
        if (PatchProxy.isSupport(new Object[0], this, f67201a, false, 76812, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f67201a, false, 76812, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.y instanceof y) {
            return true;
        } else {
            if ((this.y instanceof o) || !com.ss.android.ugc.aweme.framework.core.a.b().f3306d) {
                return false;
            }
            throw new IllegalStateException();
        }
    }

    private int q() {
        if (PatchProxy.isSupport(new Object[0], this, f67201a, false, 76825, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f67201a, false, 76825, new Class[0], Integer.TYPE)).intValue();
        } else if (fc.a()) {
            return ((fc.e(this.f67204d) - this.D) - fc.c(this.f67204d)) - fc.d(this.f67204d);
        } else {
            return fc.a(this.f67204d) - this.D;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f67201a, false, 76804, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67201a, false, 76804, new Class[0], Void.TYPE);
        } else if (this.z) {
            Pair<Long, Long> playBoundary = this.mVideoEditView.getPlayBoundary();
            this.i.a().setValue(s.a((long) ((Long) playBoundary.first).intValue()));
            a(Math.max(((Long) playBoundary.first).intValue() - 30, 0), ((Long) playBoundary.second).intValue());
        }
    }

    public final boolean g() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f67201a, false, 76820, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f67201a, false, 76820, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mInfoStickerEditView == null || this.mInfoStickerEditView.h == null) {
            return false;
        } else {
            if (this.mInfoStickerEditView.h.f67227b.size() > 0) {
                z2 = true;
            }
            return z2;
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [android.text.SpannableString] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void o() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f67201a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 76813(0x12c0d, float:1.07638E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f67201a
            r5 = 0
            r6 = 76813(0x12c0d, float:1.07638E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            boolean r1 = r9.C
            if (r1 == 0) goto L_0x003c
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r9.mSelectTitle
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131562851(0x7f0d1163, float:1.8751142E38)
            java.lang.String r0 = r0.getString(r1)
            goto L_0x00c1
        L_0x003c:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView r1 = r9.mVideoEditView
            float r1 = r1.getSelectedTime()
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 * r1
            r3 = 1065185444(0x3f7d70a4, float:0.99)
            float r2 = r2 * r3
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView r3 = r9.mVideoEditView
            long r3 = r3.getMinVideoLength()
            float r3 = (float) r3
            r4 = 1
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0059
            r2 = 1
            goto L_0x005a
        L_0x0059:
            r2 = 0
        L_0x005a:
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r5 = "%.1f"
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r6[r0] = r1
            java.lang.String r1 = java.lang.String.format(r3, r5, r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r9.mSelectTitle     // Catch:{ FormatFlagsConversionMismatchException -> 0x0083 }
            android.content.Context r3 = r3.getContext()     // Catch:{ FormatFlagsConversionMismatchException -> 0x0083 }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ FormatFlagsConversionMismatchException -> 0x0083 }
            r5 = 2131560840(0x7f0d0988, float:1.8747064E38)
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ FormatFlagsConversionMismatchException -> 0x0083 }
            r6[r0] = r1     // Catch:{ FormatFlagsConversionMismatchException -> 0x0083 }
            java.lang.String r3 = r3.getString(r5, r6)     // Catch:{ FormatFlagsConversionMismatchException -> 0x0083 }
            r0 = r3
            goto L_0x009c
        L_0x0083:
            r3 = move-exception
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r9.mSelectTitle
            android.content.Context r5 = r5.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131560839(0x7f0d0987, float:1.8747062E38)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r1
            java.lang.String r0 = r5.getString(r6, r4)
            r9.a((java.util.FormatFlagsConversionMismatchException) r3, (java.lang.String) r0)
        L_0x009c:
            if (r2 == 0) goto L_0x00c1
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r0)
            int r3 = r0.indexOf(r1)
            int r0 = r0.indexOf(r1)
            int r1 = r1.length()
            int r0 = r0 + r1
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r9.mSelectTitle
            android.content.res.Resources r1 = r1.getResources()
            r4 = 2131625107(0x7f0e0493, float:1.8877413E38)
            int r1 = r1.getColor(r4)
            android.text.SpannableString r0 = com.ss.android.ugc.aweme.shortvideo.util.aj.a(r2, r3, r0, r1)
        L_0x00c1:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r9.mSelectTitle
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerHelper.o():void");
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f67201a, false, 76808, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67201a, false, 76808, new Class[0], Void.TYPE);
            return;
        }
        this.C = !this.C;
        c(this.C);
        o();
        if (this.x != null) {
            this.x.b(this.C);
        }
        if (!this.C) {
            this.mPlayBtn.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(this.f67204d.getResources(), 2130838325));
            this.i.a().setValue(s.a((long) this.g.u()));
            this.i.a().setValue(s.b());
            this.m.removeCallbacks(this.v);
            if (this.y != null) {
                this.y.setAlpha(true);
            }
        } else {
            this.mPlayBtn.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(this.f67204d.getResources(), 2130838324));
            this.m.post(this.v);
            this.i.a().setValue(s.a());
        }
        this.mVideoEditView.b(true ^ this.C);
    }

    public final boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f67201a, false, 76819, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f67201a, false, 76819, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mInfoStickerEditView == null || this.mInfoStickerEditView.h == null || this.mInfoStickerEditView.h.f67227b == null || this.mInfoStickerEditView.h.f67227b.size() <= 0) {
            return false;
        } else {
            boolean z2 = false;
            for (y next : this.mInfoStickerEditView.h.f67227b) {
                if (next.f67433d) {
                    next.f67433d = false;
                    z2 = true;
                }
            }
            if (z2) {
                this.mInfoStickerEditView.y = false;
                this.mInfoStickerEditView.invalidate();
            }
            return z2;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i() {
        String str;
        InfoStickerEditView infoStickerEditView = this.mInfoStickerEditView;
        if (PatchProxy.isSupport(new Object[0], infoStickerEditView, InfoStickerEditView.f67184a, false, 76758, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], infoStickerEditView, InfoStickerEditView.f67184a, false, 76758, new Class[0], Void.TYPE);
        } else {
            infoStickerEditView.b();
        }
        this.E.clear();
        com.ss.android.ugc.aweme.utils.a aVar = com.ss.android.ugc.aweme.utils.a.f75468b;
        d a2 = d.a().a("prop_id", m()).a("creation_id", this.j.creationId).a("draft_id", this.j.draftId).a("content_source", this.j.getAvetParameter().getContentSource()).a("shoot_entrance", this.j.mShootWay);
        if (this.f67202b) {
            str = "edit_post_page";
        } else {
            str = "video_edit_page";
        }
        aVar.a("prop_timeset_confirm", a2.a("enter_from", str).f34114b);
        p();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void j() {
        String str;
        InfoStickerEditView infoStickerEditView = this.mInfoStickerEditView;
        if (PatchProxy.isSupport(new Object[0], infoStickerEditView, InfoStickerEditView.f67184a, false, 76756, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], infoStickerEditView, InfoStickerEditView.f67184a, false, 76756, new Class[0], Void.TYPE);
        } else {
            infoStickerEditView.b();
        }
        com.ss.android.ugc.aweme.utils.a aVar = com.ss.android.ugc.aweme.utils.a.f75468b;
        d a2 = d.a().a("prop_id", m()).a("creation_id", this.j.creationId).a("draft_id", this.j.draftId).a("content_source", this.j.getAvetParameter().getContentSource()).a("shoot_entrance", this.j.mShootWay);
        if (this.f67202b) {
            str = "edit_post_page";
        } else {
            str = "video_edit_page";
        }
        aVar.a("prop_timeset_cancel", a2.a("enter_from", str).f34114b);
        p();
    }

    private void l() {
        if (PatchProxy.isSupport(new Object[0], this, f67201a, false, 76801, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67201a, false, 76801, new Class[0], Void.TYPE);
            return;
        }
        if (!this.k) {
            this.k = true;
            this.mCancelBtn.setOnClickListener(new s(this));
            this.mSaveBtn.setOnClickListener(new t(this));
            this.mPlayBtn.setOnClickListener(new u(this));
            this.f67205e = (CutMultiVideoViewModel) ViewModelProviders.of(this.f67204d).get(CutMultiVideoViewModel.class);
            this.mVideoEditView.setMinVideoLength(1000);
            this.mVideoEditView.setMaxVideoLength((long) this.g.t());
            this.f67205e.m = this.j.isMvThemeVideoType();
            this.f67205e.n = this.g.t();
            this.mVideoEditView.setFirstFrameVisibleLiveData(this.q);
            this.mVideoEditView.setFirstFrameBitmapLiveData(this.p);
            this.mVideoEditView.setVeEditor(this.g);
            if (this.l == null || this.l.isEmpty()) {
                this.mVideoEditView.a(this.f67204d, this.f67205e, this.B);
            } else {
                if (this.l.size() == 1) {
                    this.l.get(0).h = (long) this.g.t();
                }
                this.mVideoEditView.a(this.f67204d, this.f67205e, this.l);
            }
            this.mVideoEditView.setEnableBoundaryText(true);
            this.mVideoEditView.setPointerType(2);
            VideoEditViewModel videoEditViewModel = this.mVideoEditView.getVideoEditViewModel();
            videoEditViewModel.f66562c.observe(this.f67204d, new v(this));
            videoEditViewModel.f66565f.observe(this.f67204d, new w(this));
            videoEditViewModel.j.observe(this.f67204d, new x(this));
            videoEditViewModel.i.observe(this.f67204d, new i(this));
            videoEditViewModel.i.observe(this.f67204d, new j(this));
            videoEditViewModel.g.observe(this.f67204d, new k(this));
            videoEditViewModel.h.observe(this.f67204d, new l(this));
            videoEditViewModel.f66564e.observe(this.f67204d, new m(this));
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f67201a, false, 76805, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67201a, false, 76805, new Class[0], Void.TYPE);
        } else if (this.z) {
            e();
            a(0, this.g.t());
            this.i.a().setValue(s.a((long) ((Long) this.mVideoEditView.getPlayBoundary().first).intValue()));
        }
    }

    private static boolean e(@NonNull c cVar) {
        return cVar instanceof y;
    }

    public final void a(com.ss.android.ugc.aweme.story.shootvideo.a.a aVar) {
        if (this.mInfoStickerEditView != null && this.mInfoStickerEditView.h != null) {
            this.mInfoStickerEditView.h.h = aVar;
        }
    }

    public final void a(com.ss.android.ugc.aweme.n.a aVar) {
        com.ss.android.ugc.aweme.n.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f67201a, false, 76818, new Class[]{com.ss.android.ugc.aweme.n.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f67201a, false, 76818, new Class[]{com.ss.android.ugc.aweme.n.a.class}, Void.TYPE);
            return;
        }
        this.mInfoStickerEditView.a(aVar2);
    }

    public final void b(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f67201a, false, 76822, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f67201a, false, 76822, new Class[]{c.class}, Void.TYPE);
            return;
        }
        a(true, cVar2);
    }

    private void c(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f67201a, false, 76824, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f67201a, false, 76824, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.mInfoStickerEditView.b(z2);
        if (this.y != null && n()) {
            this.y.setAlpha(true);
        }
    }

    private String d(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f67201a, false, 76803, new Class[]{c.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{cVar2}, this, f67201a, false, 76803, new Class[]{c.class}, String.class);
        } else if (e(cVar)) {
            return ((y) cVar2).f67432c.stickerId;
        } else {
            if (cVar2 instanceof o) {
                return "text_sticker";
            }
            return "";
        }
    }

    private void f(@NonNull c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f67201a, false, 76826, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f67201a, false, 76826, new Class[]{c.class}, Void.TYPE);
            return;
        }
        int a2 = cVar.a(0);
        int b2 = cVar.b(this.g.t());
        if (a2 >= 0 && b2 >= 0 && !a(a2, b2, 0, cVar)) {
            this.m.postDelayed(new o(this, a2, b2, cVar), 300);
        }
        o();
    }

    private void c(c cVar) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f67201a, false, 76792, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f67201a, false, 76792, new Class[]{c.class}, Void.TYPE);
        } else if (cVar != null) {
            com.ss.android.ugc.aweme.utils.a aVar = com.ss.android.ugc.aweme.utils.a.f75468b;
            d a2 = d.a().a("prop_id", d(cVar)).a("creation_id", this.j.creationId);
            if (this.y == null) {
                str = "click";
            } else {
                str = "change";
            }
            d a3 = a2.a(PushConstants.MZ_PUSH_MESSAGE_METHOD, str).a("draft_id", this.j.draftId).a("content_type", this.j.getAvetParameter().getContentType()).a("content_source", this.j.getAvetParameter().getContentSource()).a("shoot_entrance", this.j.mShootWay);
            if (this.f67202b) {
                str2 = "edit_post_page";
            } else {
                str2 = "video_edit_page";
            }
            aVar.a("prop_time_set", a3.a("enter_from", str2).f34114b);
        }
    }

    public final void b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f67201a, false, 76829, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f67201a, false, 76829, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mInfoStickerEditView != null) {
            this.mInfoStickerEditView.setHaveTimeEdit(z2);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f67201a, false, 76811, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f67201a, false, 76811, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        o();
        if (this.y != null) {
            if (n()) {
                this.mInfoStickerEditView.a((y) this.y, i2, i3, 0);
                return;
            }
            TextStickerData data = ((o) this.y).getData();
            if (data != null) {
                data.mStartTime = i2;
                data.mEndTime = i3;
            }
        }
    }

    private void a(FormatFlagsConversionMismatchException formatFlagsConversionMismatchException, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{formatFlagsConversionMismatchException, str2}, this, f67201a, false, 76814, new Class[]{FormatFlagsConversionMismatchException.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{formatFlagsConversionMismatchException, str2}, this, f67201a, false, 76814, new Class[]{FormatFlagsConversionMismatchException.class, String.class}, Void.TYPE);
            return;
        }
        try {
            bi a2 = bi.a().a("exception", k.c(formatFlagsConversionMismatchException));
            StringBuilder sb = new StringBuilder("normal_str=");
            sb.append(str2);
            sb.append(", error_str=");
            try {
                sb.append(this.mSelectTitle.getContext().getResources().getString(C0906R.string.b1h));
                n.a("info_sticker_string_format_event", a2.a("event", sb.toString()).b());
            } catch (Exception e2) {
                e = e2;
                ai.b(e.getLocalizedMessage());
            }
        } catch (Exception e3) {
            e = e3;
            ai.b(e.getLocalizedMessage());
        }
    }

    private void a(boolean z2, c cVar) {
        int i2;
        int i3;
        int i4;
        boolean z3 = z2;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), cVar2}, this, f67201a, false, 76823, new Class[]{Boolean.TYPE, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), cVar2}, this, f67201a, false, 76823, new Class[]{Boolean.TYPE, c.class}, Void.TYPE);
            return;
        }
        this.z = z3;
        l();
        c(!z3);
        a(cVar2);
        this.D = this.mContentLayout.getHeight();
        if (this.D == 0) {
            this.D = ((int) UIUtils.dip2Px(this.f67204d, 210.0f)) + 84;
        }
        j.a(this.mContentLayout, z3, this.D, this.mContentLayout, (com.ss.android.ugc.aweme.base.a<Void>) new n<Void>(this, z3));
        if (this.x != null) {
            this.x.a(z3);
        }
        if (z3) {
            MutableLiveData b2 = this.i.b();
            int a2 = com.ss.android.ugc.aweme.themechange.base.b.f74589e.a(true, false, false, false, false);
            int i5 = this.D;
            int q2 = q();
            if (fc.a()) {
                i4 = fb.b(this.f67204d, fb.f67663b);
            } else {
                i4 = 0;
            }
            b2.setValue(w.a(a2, 0, i5, q2, i4, 0));
            this.mPlayBtn.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(this.mPlayBtn.getContext().getResources(), 2130838325));
            this.mPlayBtn.setEnabled(true);
            this.mVideoEditView.setEnabled(true);
            this.mVideoEditView.b(true);
            this.i.a().setValue(s.b(0));
            return;
        }
        this.mPlayBtn.setEnabled(false);
        this.mVideoEditView.setEnabled(false);
        this.m.removeCallbacks(this.v);
        this.i.a().setValue(s.b());
        MutableLiveData b3 = this.i.b();
        int color = this.mInfoStickerEditView.getResources().getColor(C0906R.color.h7);
        if (fc.a()) {
            i2 = fc.c(this.f67204d);
        } else {
            i2 = 0;
        }
        int i6 = this.D;
        int q3 = q();
        if (fc.a()) {
            i3 = fb.b(this.f67204d, fb.f67663b);
        } else {
            i3 = 0;
        }
        b3.setValue(w.b(color, i2, i6, q3, i3, 0));
        this.C = false;
    }

    public InfoStickerHelper(com.ss.android.vesdk.p pVar, StoryStickerGestureLayout storyStickerGestureLayout, cb cbVar) {
        this.g = pVar;
        this.h = storyStickerGestureLayout;
        this.j = cbVar;
        this.f67206f = ((Integer) com.ss.android.ugc.aweme.port.in.a.o.f().a()).intValue();
        if (this.f67206f == 0) {
            this.f67206f = 30;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r14, int r15, int[] r16) {
        /*
            r13 = this;
            r7 = r13
            r8 = r16
            r9 = 3
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r10 = 0
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r11 = 1
            r0[r11] = r1
            r12 = 2
            r0[r12] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f67201a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 76828(0x12c1c, float:1.07659E-40)
            r1 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x005f
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r0[r11] = r1
            r0[r12] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f67201a
            r3 = 0
            r4 = 76828(0x12c1c, float:1.07659E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r13
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x005f:
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.fc.a()
            if (r0 != 0) goto L_0x0066
            return
        L_0x0066:
            com.ss.android.vesdk.p r0 = r7.g
            if (r0 != 0) goto L_0x006b
            return
        L_0x006b:
            android.widget.FrameLayout r0 = r7.o
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.p r1 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.p
            r2 = r14
            r3 = r15
            r1.<init>(r13, r14, r15, r8)
            r0.post(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerHelper.a(int, int, int[]):void");
    }

    public final void a(FragmentActivity fragmentActivity, View view, String str) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        View view2 = view;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, view2, str2}, this, f67201a, false, 76796, new Class[]{FragmentActivity.class, View.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity2, view2, str2}, this, f67201a, false, 76796, new Class[]{FragmentActivity.class, View.class, String.class}, Void.TYPE);
            return;
        }
        a(fragmentActivity2, view2, str2, false);
    }
}
