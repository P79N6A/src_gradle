package com.ss.android.ugc.aweme.o;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity;
import com.ss.android.ugc.aweme.choosemusic.f.c;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.api.MusicApi;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.presenter.m;
import com.ss.android.ugc.aweme.music.presenter.n;
import com.ss.android.ugc.aweme.music.ui.o;
import com.ss.android.ugc.aweme.music.ui.p;
import com.ss.android.ugc.aweme.music.ui.t;
import com.ss.android.ugc.aweme.music.util.d;
import com.ss.android.ugc.aweme.photomovie.a;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.port.in.z;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.shortvideo.e;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicListModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.ui.OnlineMusicFragmentActivity;
import com.ss.android.ugc.aweme.shortvideo.util.l;
import com.ss.android.ugc.aweme.utils.bm;
import com.ss.android.ugc.b.b;
import java.util.ArrayList;
import java.util.List;

public final class s implements aa {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58311a;

    public final String b() {
        return a.f58869b;
    }

    public final void a(Fragment fragment, int i, String str, int i2, Object obj, boolean z, @Nullable Bundle bundle, String str2, String str3) {
        boolean z2;
        Fragment fragment2 = fragment;
        Bundle bundle2 = bundle;
        String str4 = str2;
        String str5 = str3;
        if (PatchProxy.isSupport(new Object[]{fragment2, Integer.valueOf(i), str, Integer.valueOf(i2), null, Byte.valueOf(z ? (byte) 1 : 0), bundle2, str4, str5}, this, f58311a, false, 54832, new Class[]{Fragment.class, Integer.TYPE, String.class, Integer.TYPE, Object.class, Boolean.TYPE, Bundle.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2, Integer.valueOf(i), str, Integer.valueOf(i2), null, Byte.valueOf(z), bundle2, str4, str5}, this, f58311a, false, 54832, new Class[]{Fragment.class, Integer.TYPE, String.class, Integer.TYPE, Object.class, Boolean.TYPE, Bundle.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{fragment2, Integer.valueOf(i), str, Integer.valueOf(i2), null, Byte.valueOf(z), bundle2, str4, str5}, null, d.f56797a, true, 60622, new Class[]{Fragment.class, Integer.TYPE, String.class, Integer.TYPE, MusicModel.class, Boolean.TYPE, Bundle.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2, Integer.valueOf(i), str, Integer.valueOf(i2), null, Byte.valueOf(z), bundle2, str4, str5}, null, d.f56797a, true, 60622, new Class[]{Fragment.class, Integer.TYPE, String.class, Integer.TYPE, MusicModel.class, Boolean.TYPE, Bundle.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (!com.ss.android.ugc.aweme.choosemusic.f.d.b()) {
            if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.choosemusic.f.d.f35901a, true, 26787, new Class[0], Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.choosemusic.f.d.f35901a, true, 26787, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                z2 = AbTestManager.a().aA() == 1 || AbTestManager.a().aA() == 2;
            }
            if (z2) {
                String string = fragment2.getString(C0906R.string.sy);
                if (PatchProxy.isSupport(new Object[]{fragment2, Integer.valueOf(i), string, Integer.valueOf(i2), null, Byte.valueOf(z), bundle2, str4, str5}, null, ChooseMusicActivity.f35747a, true, 26438, new Class[]{Fragment.class, Integer.TYPE, String.class, Integer.TYPE, MusicModel.class, Boolean.TYPE, Bundle.class, String.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{fragment2, Integer.valueOf(i), string, Integer.valueOf(i2), null, Byte.valueOf(z), bundle2, str4, str5}, null, ChooseMusicActivity.f35747a, true, 26438, new Class[]{Fragment.class, Integer.TYPE, String.class, Integer.TYPE, MusicModel.class, Boolean.TYPE, Bundle.class, String.class, String.class}, Void.TYPE);
                } else {
                    Intent intent = new Intent(fragment.getActivity(), ChooseMusicActivity.class);
                    intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
                    if (((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().getChallenges().size() > 0) {
                        intent.putExtra("challenge", ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().getChallenges().get(0).cid);
                    }
                    intent.putExtra(PushConstants.TITLE, string);
                    intent.putExtra("music_model", null);
                    intent.putExtra("music_allow_clear", z);
                    intent.putExtra("creation_id", str5);
                    intent.putExtra("shoot_way", str4);
                    if (bundle2 != null) {
                        intent.putExtra("arguments", bundle2);
                    }
                    fragment2.startActivityForResult(intent, i);
                }
                c.f35897b = "video_shoot_page";
                return;
            }
        }
        int i3 = i;
        int i4 = i2;
        boolean z3 = z;
        OnlineMusicFragmentActivity.a(fragment, i, str, i2, null, z, bundle);
    }

    public final void a(String str, z zVar) {
        final z zVar2 = zVar;
        if (PatchProxy.isSupport(new Object[]{str, zVar2}, this, f58311a, false, 54834, new Class[]{String.class, z.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, zVar2}, this, f58311a, false, 54834, new Class[]{String.class, z.class}, Void.TYPE);
            return;
        }
        m mVar = new m();
        mVar.a(new n() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58312a;

            public final void b_(Exception exc) {
                if (PatchProxy.isSupport(new Object[]{exc}, this, f58312a, false, 54850, new Class[]{Exception.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{exc}, this, f58312a, false, 54850, new Class[]{Exception.class}, Void.TYPE);
                    return;
                }
                if (zVar2 != null) {
                    zVar2.a(exc);
                }
            }

            public final void a(MusicDetail musicDetail) {
                e eVar;
                if (PatchProxy.isSupport(new Object[]{musicDetail}, this, f58312a, false, 54849, new Class[]{MusicDetail.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{musicDetail}, this, f58312a, false, 54849, new Class[]{MusicDetail.class}, Void.TYPE);
                    return;
                }
                if (zVar2 != null) {
                    z zVar = zVar2;
                    if (musicDetail.music != null) {
                        eVar = new com.ss.android.ugc.aweme.shortvideo.o.c().apply(com.ss.android.ugc.aweme.music.util.c.f56796b.a(musicDetail.music));
                    } else {
                        eVar = null;
                    }
                    zVar.a(eVar);
                }
            }
        });
        mVar.a(str, 0);
    }

    public final void a(e eVar, aa.d dVar) {
        final aa.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{eVar, dVar2}, this, f58311a, false, 54836, new Class[]{e.class, aa.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, dVar2}, this, f58311a, false, 54836, new Class[]{e.class, aa.d.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.b.b.a aVar = new com.ss.android.ugc.b.b.a();
        aVar.a(d.a(false));
        b bVar = new b();
        t tVar = new t(null, p.q);
        tVar.a((com.ss.android.ugc.aweme.music.e) new com.ss.android.ugc.aweme.music.e() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58315a;

            public final void a(String str, int i, String str2, int i2) {
                String str3 = str;
                String str4 = str2;
                if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i), str4, Integer.valueOf(i2)}, this, f58315a, false, 54852, new Class[]{String.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i), str4, Integer.valueOf(i2)}, this, f58315a, false, 54852, new Class[]{String.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                dVar2.a(str3, i, str4, i2);
            }

            public final void a(String str, int i, String str2, Exception exc) {
                String str3 = str;
                String str4 = str2;
                Exception exc2 = exc;
                if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i), str4, exc2}, this, f58315a, false, 54853, new Class[]{String.class, Integer.TYPE, String.class, Exception.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i), str4, exc2}, this, f58315a, false, 54853, new Class[]{String.class, Integer.TYPE, String.class, Exception.class}, Void.TYPE);
                    return;
                }
                dVar2.a(str3, i, str4, exc2);
            }

            public final void a(String str, int i, @Nullable String str2, @Nullable float[] fArr) {
                String str3 = str;
                String str4 = str2;
                if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i), str4, null}, this, f58315a, false, 54851, new Class[]{String.class, Integer.TYPE, String.class, float[].class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i), str4, null}, this, f58315a, false, 54851, new Class[]{String.class, Integer.TYPE, String.class, float[].class}, Void.TYPE);
                    return;
                }
                dVar2.a(str3, i, str4, (float[]) null);
            }
        });
        bVar.a((com.ss.android.ugc.b.a.a) tVar);
        bVar.a(((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getMusicService().a(eVar.getMusicId(), "draft_page"));
        if (eVar.getMusicType() == MusicModel.MusicType.ONLINE.ordinal()) {
            aVar.f77132b = 4;
            aVar.f77131a = eVar.getPath();
            bVar.b(aVar);
            return;
        }
        aVar.f77132b = 3;
        aVar.f77131a = eVar.getPath();
        bVar.b(aVar);
    }

    public final boolean a(e eVar, Context context, boolean z) {
        e eVar2 = eVar;
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{eVar2, context2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f58311a, false, 54837, new Class[]{e.class, Context.class, Boolean.TYPE}, Boolean.TYPE)) {
            return d.a(eVar2, context2, true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{eVar2, context2, Byte.valueOf(z)}, this, f58311a, false, 54837, new Class[]{e.class, Context.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final boolean a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f58311a, false, 54846, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return MusicModel.MusicType.LOCAL.ordinal() == i;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f58311a, false, 54846, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final e a() {
        if (!PatchProxy.isSupport(new Object[0], this, f58311a, false, 54845, new Class[0], e.class)) {
            return new com.ss.android.ugc.aweme.shortvideo.o.c().apply(com.ss.android.ugc.aweme.music.util.c.f56796b.a(a.a()));
        }
        return (e) PatchProxy.accessDispatch(new Object[0], this, f58311a, false, 54845, new Class[0], e.class);
    }

    public final int b(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, this, f58311a, false, 54839, new Class[]{String.class}, Integer.TYPE)) {
            return (int) d.a(str);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, f58311a, false, 54839, new Class[]{String.class}, Integer.TYPE)).intValue();
    }

    public final UrlModel a(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f58311a, false, 54842, new Class[]{Object.class}, UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[]{obj}, this, f58311a, false, 54842, new Class[]{Object.class}, UrlModel.class);
        }
        if (obj != null) {
            MusicModel musicModel = (MusicModel) obj;
            if (musicModel.getMusic() != null) {
                return musicModel.getMusic().getAudioTrack();
            }
        }
        return null;
    }

    public final aa.b a(final aa.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f58311a, false, 54844, new Class[]{aa.c.class}, aa.b.class)) {
            return (aa.b) PatchProxy.accessDispatch(new Object[]{cVar}, this, f58311a, false, 54844, new Class[]{aa.c.class}, aa.b.class);
        }
        final com.ss.android.ugc.aweme.shortvideo.presenter.d dVar = new com.ss.android.ugc.aweme.shortvideo.presenter.d();
        dVar.a(new MusicListModel());
        dVar.a(new com.ss.android.ugc.aweme.shortvideo.presenter.c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58318a;

            public final void a(MusicList musicList, String str) {
                if (PatchProxy.isSupport(new Object[]{musicList, str}, this, f58318a, false, 54854, new Class[]{MusicList.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{musicList, str}, this, f58318a, false, 54854, new Class[]{MusicList.class, String.class}, Void.TYPE);
                    return;
                }
                if (cVar != null) {
                    ArrayList arrayList = null;
                    if (!(musicList == null || musicList.musicList == null)) {
                        arrayList = new ArrayList(musicList.musicList.size());
                        for (Music a2 : musicList.musicList) {
                            arrayList.add(new com.ss.android.ugc.aweme.shortvideo.o.c().apply(com.ss.android.ugc.aweme.music.util.c.f56796b.a(a2)));
                        }
                    }
                    cVar.a((List<e>) arrayList, str);
                }
            }

            public final void a(Exception exc, String str) {
                if (PatchProxy.isSupport(new Object[]{exc, str}, this, f58318a, false, 54855, new Class[]{Exception.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{exc, str}, this, f58318a, false, 54855, new Class[]{Exception.class, String.class}, Void.TYPE);
                    return;
                }
                if (cVar != null) {
                    cVar.a(exc, str);
                }
            }
        });
        return new aa.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58321a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f58321a, false, 54857, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f58321a, false, 54857, new Class[0], Void.TYPE);
                    return;
                }
                dVar.a(null);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean a(java.lang.Object... r18) {
                /*
                    r17 = this;
                    r0 = r18
                    r1 = 1
                    java.lang.Object[] r2 = new java.lang.Object[r1]
                    r9 = 0
                    r2[r9] = r0
                    com.meituan.robust.ChangeQuickRedirect r4 = f58321a
                    java.lang.Class[] r7 = new java.lang.Class[r1]
                    java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
                    r7[r9] = r3
                    java.lang.Class r8 = java.lang.Boolean.TYPE
                    r5 = 0
                    r6 = 54856(0xd648, float:7.687E-41)
                    r3 = r17
                    boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                    if (r2 == 0) goto L_0x003d
                    java.lang.Object[] r10 = new java.lang.Object[r1]
                    r10[r9] = r0
                    com.meituan.robust.ChangeQuickRedirect r12 = f58321a
                    r13 = 0
                    r14 = 54856(0xd648, float:7.687E-41)
                    java.lang.Class[] r15 = new java.lang.Class[r1]
                    java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
                    r15[r9] = r0
                    java.lang.Class r16 = java.lang.Boolean.TYPE
                    r11 = r17
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    return r0
                L_0x003d:
                    r1 = r17
                    com.ss.android.ugc.aweme.shortvideo.presenter.d r2 = r0
                    boolean r0 = r2.a((java.lang.Object[]) r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.o.s.AnonymousClass4.a(java.lang.Object[]):boolean");
            }
        };
    }

    public final String a(@NonNull String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, this, f58311a, false, 54838, new Class[]{String.class}, String.class)) {
            return com.ss.android.ugc.aweme.music.util.e.a(str);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f58311a, false, 54838, new Class[]{String.class}, String.class);
    }

    public final com.ss.android.ugc.a.b.d a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (!PatchProxy.isSupport(new Object[]{str3, str4}, this, f58311a, false, 54835, new Class[]{String.class, String.class}, com.ss.android.ugc.a.b.d.class)) {
            return new o(str3, str4);
        }
        return (com.ss.android.ugc.a.b.d) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f58311a, false, 54835, new Class[]{String.class, String.class}, com.ss.android.ugc.a.b.d.class);
    }

    public final void a(Context context, String str, int i, ProgressDialog progressDialog, aa.a aVar) {
        Context context2 = context;
        String str2 = str;
        ProgressDialog progressDialog2 = progressDialog;
        final aa.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context2, str2, Integer.valueOf(i), progressDialog2, aVar2}, this, f58311a, false, 54847, new Class[]{Context.class, String.class, Integer.TYPE, ProgressDialog.class, aa.a.class}, Void.TYPE)) {
            Object[] objArr = {context2, str2, Integer.valueOf(i), progressDialog2, aVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f58311a, false, 54847, new Class[]{Context.class, String.class, Integer.TYPE, ProgressDialog.class, aa.a.class}, Void.TYPE);
            return;
        }
        try {
            final MusicDetail a2 = MusicApi.a(str2, 0);
            l lVar = new l(context2, progressDialog2);
            MusicModel a3 = com.ss.android.ugc.aweme.music.util.c.f56796b.a(a2.music);
            try {
                AnonymousClass5 r2 = new l.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58324a;

                    public final void a(Exception exc) {
                        if (PatchProxy.isSupport(new Object[]{exc}, this, f58324a, false, 54859, new Class[]{Exception.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{exc}, this, f58324a, false, 54859, new Class[]{Exception.class}, Void.TYPE);
                            return;
                        }
                        if (aVar2 != null) {
                            aVar2.a(exc);
                        }
                    }

                    public final void a(String str) {
                        if (PatchProxy.isSupport(new Object[]{str}, this, f58324a, false, 54858, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str}, this, f58324a, false, 54858, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        if (aVar2 != null) {
                            try {
                                aVar2.a(str, new com.ss.android.ugc.aweme.shortvideo.o.c().apply(com.ss.android.ugc.aweme.music.util.c.f56796b.a(a2.music)));
                            } catch (Exception e2) {
                                aVar2.a(e2);
                            }
                        }
                    }
                };
                if (PatchProxy.isSupport(new Object[]{a3, r2}, lVar, l.f71140a, false, 80881, new Class[]{MusicModel.class, l.a.class}, Void.TYPE)) {
                    l lVar2 = lVar;
                    PatchProxy.accessDispatch(new Object[]{a3, r2}, lVar2, l.f71140a, false, 80881, new Class[]{MusicModel.class, l.a.class}, Void.TYPE);
                } else if (a3 == null) {
                    r2.a(new Exception("musicModel is null"));
                } else {
                    t tVar = new t(com.ss.android.ugc.aweme.music.util.e.a(a3), p.q);
                    tVar.a((com.ss.android.ugc.aweme.music.e) new com.ss.android.ugc.aweme.music.e(r2) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f71143a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ a f71144b;

                        {
                            this.f71144b = r2;
                        }

                        public final void a(String str, int i, String str2, int i2) {
                            if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), str2, Integer.valueOf(i2)}, this, f71143a, false, 80883, new Class[]{String.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), str2, Integer.valueOf(i2)}, this, f71143a, false, 80883, new Class[]{String.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            final int i3 = i2;
                            com.ss.android.b.a.a.a.b(new Runnable() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f71149a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f71149a, false, 80886, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f71149a, false, 80886, new Class[0], Void.TYPE);
                                    } else if (l.this.f71141b != null && l.this.f71141b.isShowing()) {
                                        l.this.f71141b.setProgress(i3);
                                    }
                                }
                            });
                        }

                        public final void a(String str, int i, String str2, Exception exc) {
                            final Exception exc2 = exc;
                            if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), str2, exc2}, this, f71143a, false, 80884, new Class[]{String.class, Integer.TYPE, String.class, Exception.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), str2, exc2}, this, f71143a, false, 80884, new Class[]{String.class, Integer.TYPE, String.class, Exception.class}, Void.TYPE);
                                return;
                            }
                            com.ss.android.b.a.a.a.b(new Runnable() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f71152a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f71152a, false, 80887, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f71152a, false, 80887, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    if (exc2 != null && exc2.getMessage() != null && exc2.getMessage().startsWith("android storage memory size is too low")) {
                                        com.bytedance.ies.dmt.ui.d.a.b(l.this.f71142c, (int) C0906R.string.a63).a();
                                    } else if (exc2 == null || exc2.getMessage().startsWith("cancel by user")) {
                                        com.bytedance.ies.dmt.ui.d.a.b(l.this.f71142c, (int) C0906R.string.bei).a();
                                    }
                                    if (l.this.f71141b != null) {
                                        l.this.f71141b.dismiss();
                                        l.this.f71141b = null;
                                    }
                                    AnonymousClass1.this.f71144b.a(exc2);
                                }
                            });
                        }

                        public final void a(String str, int i, String str2, float[] fArr) {
                            final String str3 = str;
                            if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i), str2, null}, this, f71143a, false, 80882, new Class[]{String.class, Integer.TYPE, String.class, float[].class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i), str2, null}, this, f71143a, false, 80882, new Class[]{String.class, Integer.TYPE, String.class, float[].class}, Void.TYPE);
                                return;
                            }
                            com.ss.android.b.a.a.a.b(new Runnable() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f71146a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f71146a, false, 80885, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f71146a, false, 80885, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    if (l.this.f71141b != null) {
                                        l.this.f71141b.dismiss();
                                        l.this.f71141b = null;
                                    }
                                    if (!bm.a(str3)) {
                                        com.bytedance.ies.dmt.ui.d.a.b(l.this.f71142c, (int) C0906R.string.bei).a();
                                    } else if (((IAVService) ServiceManager.get().getService(IAVService.class)).getSDKService().checkAudioFile(str3) < 0) {
                                        com.bytedance.ies.dmt.ui.d.a.b(l.this.f71142c, (int) C0906R.string.bei).a();
                                    } else {
                                        AnonymousClass1.this.f71144b.a(str3);
                                    }
                                }
                            });
                        }
                    });
                    b bVar = new b();
                    if (com.ss.android.g.a.c()) {
                        bVar.f77129a = AbTestManager.a().ap();
                    }
                    bVar.a((com.ss.android.ugc.b.a.a) tVar);
                    com.ss.android.ugc.b.b.a aVar3 = new com.ss.android.ugc.b.b.a();
                    aVar3.a(d.a(false));
                    aVar3.f77132b = 4;
                    if (a3.getPath() == null) {
                        r2.a(new Exception("the music's download path is null"));
                    } else {
                        aVar3.f77131a = a3.getPath();
                        bVar.b(aVar3);
                    }
                }
            } catch (Exception e2) {
                e = e2;
                aVar2.a(e);
            }
        } catch (Exception e3) {
            e = e3;
            aVar2.a(e);
        }
    }
}
