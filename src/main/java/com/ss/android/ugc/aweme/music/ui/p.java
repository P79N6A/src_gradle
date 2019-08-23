package com.ss.android.ugc.aweme.music.ui;

import a.g;
import a.i;
import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.FFMpegManager;
import com.ss.android.ugc.aweme.BuildConfig;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.c;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import com.ss.android.ugc.b.b;
import com.ss.android.ugc.b.c;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public class p implements com.ss.android.ugc.aweme.music.a {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f56722f;
    public static f q;

    /* renamed from: a  reason: collision with root package name */
    private int f56723a;
    protected c g;
    protected int h;
    public d i;
    public b j = new b();
    public a k;
    public String l;
    public String m;
    public int n;
    public boolean o;
    public MusicModel p;

    public interface a {
        void a();
    }

    private static String a(int i2) {
        switch (i2) {
            case 0:
            case 1:
            case 8:
            case 9:
            case 10:
                return "change_music_page";
            case 2:
                return "search_music";
            case 3:
                return "change_music_page_detail";
            case e.l:
                return "personal_homepage";
            default:
                return "";
        }
    }

    private static String a(int i2, int i3) {
        if (i3 == 0) {
            switch (i2) {
                case 0:
                    return "edit_page_list";
                case 1:
                    return "edit_page_favourite";
                case 2:
                    return "edit_page_search";
                case 3:
                    return "edit_page_banner";
                case e.l:
                    return "single_song";
                case 8:
                    return "edit_page_fm";
                case 9:
                    return "sticker_rec";
                case 10:
                    return "challenge_rec";
            }
        } else if (i3 == 2) {
            switch (i2) {
                case 0:
                    return "shoot_page_list";
                case 1:
                    return "shoot_page_favourite";
                case 2:
                    return "shoot_page_search";
                case 3:
                    return "shoot_page_banner";
                default:
                    switch (i2) {
                        case 8:
                            return "shoot_page_fm";
                        case 9:
                            return "sticker_rec";
                        case 10:
                            return "challenge_rec";
                    }
            }
        }
        return "";
    }

    @NonNull
    static String c(int i2) {
        return i2 == 0 ? "song_choose_page" : i2 == 1 ? "song_choose_page" : i2 == 2 ? "song_choose_page" : i2 == 3 ? "song_category" : "";
    }

    private static String d(int i2) {
        if (i2 == 0) {
            return "music_library_hot";
        }
        if (i2 == 1) {
            return "music_library_mine";
        }
        if (i2 == 2) {
            return "music_library_search";
        }
        if (i2 == 3) {
            return "music_library_list";
        }
        return null;
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f56722f, false, 60334, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f56722f, false, 60334, new Class[]{String.class}, Void.TYPE);
        } else if (this.p != null) {
            if (this.f56723a == 2) {
                com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
                a2.a("music_id", this.p.getMusicId()).a("enter_from", "search_music").a("search_keyword", com.ss.android.ugc.aweme.music.util.d.a()).a("log_pb", new Gson().toJson((Object) this.p.getLogPb()));
                r.a(str, v.a(a2.f34114b));
                return;
            }
            r.a(str, (Map) com.ss.android.ugc.aweme.app.d.d.a().a("music_id", this.p.getMusicId()).a("enter_from", c(this.f56723a)).a("enter_method", "click_play_music").f34114b);
        }
    }

    public void a(MusicModel musicModel, int i2, boolean z) {
        MusicModel musicModel2 = musicModel;
        final boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{musicModel2, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f56722f, false, 60336, new Class[]{MusicModel.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel2, Integer.valueOf(i2), Byte.valueOf(z)}, this, f56722f, false, 60336, new Class[]{MusicModel.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (this.g != null) {
            Activity h2 = this.g.h();
            this.f56723a = i2;
            if ((h2 == null || a(musicModel, (Context) h2)) && musicModel2 != null) {
                this.p = musicModel2;
                this.j.b();
                String path = musicModel.getPath();
                final com.ss.android.ugc.b.b.a aVar = new com.ss.android.ugc.b.b.a();
                aVar.a(com.ss.android.ugc.aweme.music.util.d.a(true));
                if (musicModel.getMusicType() == MusicModel.MusicType.ONLINE) {
                    aVar.f77132b = 4;
                    String a2 = c.a().a(path);
                    aVar.f77133c = musicModel.getDuration();
                    if (TextUtils.isEmpty(a2) || !com.ss.android.ugc.aweme.video.b.b(a2) || new File(a2).length() <= 0) {
                        com.ss.android.ugc.aweme.music.c.a().f56320b = new c.a() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f56726a;

                            public final void a(String str) {
                                if (PatchProxy.isSupport(new Object[]{str}, this, f56726a, false, 60351, new Class[]{String.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{str}, this, f56726a, false, 60351, new Class[]{String.class}, Void.TYPE);
                                    return;
                                }
                                aVar.f77131a = str;
                                p.this.j.a(aVar, z2);
                                if (p.this.k != null) {
                                    p.this.k.a();
                                }
                            }
                        };
                        com.ss.android.ugc.aweme.music.c.a().a(musicModel, aVar.f77134d);
                    } else {
                        aVar.f77131a = a2;
                        this.j.a(aVar, z2);
                        if (this.k != null) {
                            this.k.a();
                        }
                    }
                }
            }
        }
    }

    public boolean a(MusicModel musicModel, Context context) {
        MusicModel musicModel2 = musicModel;
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{musicModel2, context2}, this, f56722f, false, 60339, new Class[]{MusicModel.class, Context.class}, Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.music.util.d.a(musicModel2, context2, true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{musicModel2, context2}, this, f56722f, false, 60339, new Class[]{MusicModel.class, Context.class}, Boolean.TYPE)).booleanValue();
    }

    public final void a(String str, MusicModel musicModel, String str2) {
        String str3 = str;
        MusicModel musicModel2 = musicModel;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, musicModel2, str4}, this, f56722f, false, 60344, new Class[]{String.class, MusicModel.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, musicModel2, str4}, this, f56722f, false, 60344, new Class[]{String.class, MusicModel.class, String.class}, Void.TYPE);
        } else if (this.g != null) {
            this.o = true;
            if (this.g.h() != null) {
                b();
                com.ss.android.ugc.aweme.music.util.b.a().pause();
                ((IAVService) ServiceManager.get().getService(IAVService.class)).getMusicWaveBean(str, 1, false, false, -1, new s(this, musicModel2, str3, str4));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(MusicModel musicModel, String str, String str2, Object obj) {
        if (obj != null && (obj instanceof MusicWaveBean)) {
            musicModel.setMusicWaveBean((MusicWaveBean) obj);
        }
        if (this.i != null) {
            this.i.setProgress(100);
            this.i.dismiss();
        }
        a(musicModel);
        this.g.a(str, musicModel, str2);
    }

    static {
        com.ss.android.ugc.aweme.al.a aVar;
        if (q == null) {
            try {
                aVar = new com.ss.android.ugc.aweme.al.b(new File(com.ss.android.ugc.aweme.video.b.f(), "music_effects"), BuildConfig.VERSION_CODE, 16777216);
            } catch (IOException unused) {
                aVar = new com.ss.android.ugc.aweme.al.c();
            }
            q = new f(aVar);
        }
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f56722f, false, 60332, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56722f, false, 60332, new Class[0], Void.TYPE);
            return;
        }
        this.j.b();
    }

    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f56722f, false, 60331, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56722f, false, 60331, new Class[0], Void.TYPE);
            return;
        }
        this.j.a((com.ss.android.ugc.b.a.d) new com.ss.android.ugc.b.a.d() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56724a;

            public final void a(int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{4, Integer.valueOf(i2)}, this, f56724a, false, 60350, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{4, Integer.valueOf(i2)}, this, f56724a, false, 60350, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                p.this.a("play_music");
                if (p.this.o && p.this.j != null) {
                    p.this.b();
                }
                if (!(p.this.g == null || p.this.g.g() == null || i2 == 0)) {
                    p.this.g.g().setDuration(i2);
                }
            }
        });
    }

    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f56722f, false, 60346, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56722f, false, 60346, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g = null;
        }
        com.ss.android.ugc.aweme.music.c.a().f56320b = null;
        this.j.a();
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f56722f, false, 60333, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56722f, false, 60333, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            this.i = d.b(this.g.h(), this.g.h().getResources().getString(C0906R.string.f4484cat));
            this.i.setIndeterminate(false);
        }
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f56722f, false, 60342, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56722f, false, 60342, new Class[0], Void.TYPE);
            return;
        }
        b();
        if (this.i != null) {
            this.i.dismiss();
            this.i = null;
        }
    }

    public final p b(int i2) {
        this.h = i2;
        return this;
    }

    public p(c cVar) {
        this.g = cVar;
    }

    public void a(MusicModel musicModel) {
        MusicModel musicModel2 = musicModel;
        if (PatchProxy.isSupport(new Object[]{musicModel2}, this, f56722f, false, 60345, new Class[]{MusicModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel2}, this, f56722f, false, 60345, new Class[]{MusicModel.class}, Void.TYPE);
            return;
        }
        ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setCurMusic(new com.ss.android.ugc.aweme.shortvideo.o.c().apply(musicModel2));
    }

    public final void b(MusicModel musicModel, int i2) {
        MusicModel musicModel2 = musicModel;
        if (PatchProxy.isSupport(new Object[]{musicModel2, Integer.valueOf(i2)}, this, f56722f, false, 60337, new Class[]{MusicModel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel2, Integer.valueOf(i2)}, this, f56722f, false, 60337, new Class[]{MusicModel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        b(musicModel2, i2, true);
    }

    public final void a(MusicModel musicModel, int i2) {
        MusicModel musicModel2 = musicModel;
        if (PatchProxy.isSupport(new Object[]{musicModel2, Integer.valueOf(i2)}, this, f56722f, false, 60335, new Class[]{MusicModel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel2, Integer.valueOf(i2)}, this, f56722f, false, 60335, new Class[]{MusicModel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(musicModel2, i2, true);
    }

    public final void b(MusicModel musicModel, int i2, boolean z) {
        String str;
        MusicModel musicModel2 = musicModel;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{musicModel2, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f56722f, false, 60338, new Class[]{MusicModel.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel2, Integer.valueOf(i2), Byte.valueOf(z)}, this, f56722f, false, 60338, new Class[]{MusicModel.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (this.g != null && musicModel2 != null) {
            this.p = musicModel2;
            this.o = false;
            com.ss.android.ugc.aweme.app.d.c cVar = new com.ss.android.ugc.aweme.app.d.c();
            if (i3 == 2) {
                cVar.a("source", "search");
            }
            if (this.h != 1) {
                String str2 = "";
                String str3 = "";
                if (this.h == 0) {
                    str2 = "mid_page";
                    str3 = "video_edit_page";
                } else if (this.h == 2) {
                    str2 = "shoot_page";
                    str3 = "video_shoot_page";
                }
                cVar.a("enter_from", d(i2));
                if (musicModel.getMusicType() == MusicModel.MusicType.ONLINE) {
                    if (!StringUtils.isEmpty(musicModel.getMusicId())) {
                        r.onEvent(MobClick.obtain().setEventName("music_add").setLabelName(str2).setValue(musicModel.getMusicId()).setJsonObject(cVar.b()));
                        String a2 = a(i2);
                        if (com.ss.android.ugc.aweme.choosemusic.f.d.b() || AbTestManager.a().aA() == 0 || TextUtils.equals("personal_homepage", a2)) {
                            com.ss.android.ugc.aweme.app.d.d a3 = com.ss.android.ugc.aweme.app.d.d.a();
                            com.ss.android.ugc.aweme.app.d.d a4 = a3.a("enter_from", a2).a("music_id", musicModel.getMusicId());
                            if (i3 == 1) {
                                str = "favourite_song";
                            } else {
                                str = this.m;
                            }
                            com.ss.android.ugc.aweme.app.d.d a5 = a4.a("category_name", str).a("order", this.n + 1);
                            if (TextUtils.equals("personal_homepage", a2)) {
                                str3 = "";
                            }
                            a5.a("previous_page", str3);
                            if (TextUtils.equals(a2, "search_music")) {
                                a3.a("search_keyword", com.ss.android.ugc.aweme.music.util.d.a());
                                a3.a("log_pb", new Gson().toJson((Object) musicModel.getLogPb()));
                                r.a("add_music", v.a(a3.f34114b));
                            } else {
                                r.a("add_music", (Map) a3.f34114b);
                            }
                        }
                    }
                } else if (!StringUtils.isEmpty(musicModel.getSongId())) {
                    r.onEvent(MobClick.obtain().setEventName("music_add").setLabelName(str2).setValue(musicModel.getSongId()).setJsonObject(cVar.b()));
                }
            } else if (!StringUtils.isEmpty(musicModel.getMusicId())) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("song_position", this.l);
                    if (i3 == 2) {
                        jSONObject.put("search_keyword", musicModel.getSearchKeyWords());
                    }
                } catch (JSONException unused) {
                }
                r.onEvent(MobClick.obtain().setEventName("shoot").setLabelName("popular_song").setValue(musicModel.getMusicId()).setJsonObject(jSONObject));
            }
            a(musicModel);
            if (musicModel.getMusicType() != MusicModel.MusicType.LOCAL) {
                com.ss.android.ugc.b.b.a aVar = new com.ss.android.ugc.b.b.a();
                aVar.a(com.ss.android.ugc.aweme.music.util.d.a(false));
                Activity h2 = this.g.h();
                if (h2 == null || !a(musicModel, (Context) h2)) {
                    this.g.a(musicModel, new Exception(h2.getString(C0906R.string.beo)));
                    return;
                }
                if (musicModel.getMusicType().equals(MusicModel.MusicType.ONLINE)) {
                    if (z) {
                        e();
                    }
                    aVar.f77132b = 4;
                    aVar.f77131a = musicModel.getPath();
                    a(aVar, musicModel, i3, a(i3, this.h));
                    b();
                }
            } else if (FFMpegManager.a().c(musicModel.getPath()) == 0) {
                a(musicModel.getPath(), musicModel, a(i3, this.h));
            } else {
                Activity h3 = this.g.h();
                if (h3 != null) {
                    com.bytedance.ies.dmt.ui.d.a.c((Context) h3, (int) C0906R.string.b7a).a();
                }
            }
        }
    }

    private void a(com.ss.android.ugc.b.b.a aVar, MusicModel musicModel, int i2, String str) {
        String str2;
        MusicModel musicModel2 = musicModel;
        if (PatchProxy.isSupport(new Object[]{aVar, musicModel2, Integer.valueOf(i2), str}, this, f56722f, false, 60340, new Class[]{com.ss.android.ugc.b.b.a.class, MusicModel.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, musicModel2, Integer.valueOf(i2), str}, this, f56722f, false, 60340, new Class[]{com.ss.android.ugc.b.b.a.class, MusicModel.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        MobClick extValueString = MobClick.obtain().setEventName("music_download_start").setLabelName("perf_monitor").setExtValueString(musicModel.getMusicId());
        t tVar = new t();
        if (AbTestManager.a().ap()) {
            str2 = "TTDownloader";
        } else {
            str2 = "Downloader";
        }
        r.onEvent(extValueString.setJsonObject(tVar.a("sdk_type", str2).a()));
        i a2 = i.a((Callable<TResult>) new q<TResult>(musicModel2));
        r rVar = new r(this, aVar, musicModel, i2, str);
        a2.a((g<TResult, TContinuationResult>) rVar, i.f1052b);
    }
}
