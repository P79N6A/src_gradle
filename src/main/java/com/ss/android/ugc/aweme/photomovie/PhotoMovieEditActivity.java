package com.ss.android.ugc.aweme.photomovie;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.g.a;
import com.ss.android.medialib.photomovie.PhotoMoviePlayer;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.photomovie.edit.b;
import com.ss.android.ugc.aweme.photomovie.edit.change.PhotoMovieChangeModule;
import com.ss.android.ugc.aweme.photomovie.edit.cover.PhotoMovieCoverModule;
import com.ss.android.ugc.aweme.photomovie.edit.d;
import com.ss.android.ugc.aweme.photomovie.edit.music.PhotoMovieMusicModule;
import com.ss.android.ugc.aweme.photomovie.edit.player.PhotoMoviePlayerModule;
import com.ss.android.ugc.aweme.photomovie.edit.player.PhotoMoviePlayerPresenter;
import com.ss.android.ugc.aweme.photomovie.transition.f;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.n;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.tools.a.f;
import com.ss.android.ugc.aweme.tools.a.g;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class PhotoMovieEditActivity extends AmeActivity implements View.OnClickListener, PhotoMovieMusicModule.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58812a;

    /* renamed from: b  reason: collision with root package name */
    FrameLayout f58813b;

    /* renamed from: c  reason: collision with root package name */
    b f58814c;

    /* renamed from: d  reason: collision with root package name */
    public PhotoMoviePlayerModule f58815d;

    /* renamed from: e  reason: collision with root package name */
    public PhotoMovieCoverModule f58816e;

    /* renamed from: f  reason: collision with root package name */
    PhotoMovieChangeModule f58817f;
    PhotoMovieMusicModule g;
    public com.ss.android.ugc.aweme.photomovie.edit.a.b h;
    public n i;
    private TextView j;
    private View k;
    private FrameLayout l;
    private FrameLayout m;
    private TextView n;
    private PhotoMovieContext o;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f58812a, false, 63939, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58812a, false, 63939, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieEditActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieEditActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f58812a, false, 63940, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f58812a, false, 63940, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f58812a, false, 63933, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58812a, false, 63933, new Class[0], Void.TYPE);
            return;
        }
        findViewById(C0906R.id.asx).performClick();
    }

    public final JSONObject a() {
        if (!PatchProxy.isSupport(new Object[0], this, f58812a, false, 63936, new Class[0], JSONObject.class)) {
            return new t().a("is_photo", PushConstants.PUSH_TYPE_NOTIFY).a("position", "mid_page").a("media_type", "pic_movie").a();
        }
        return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f58812a, false, 63936, new Class[0], JSONObject.class);
    }

    public final void a(String str) {
        this.o.musicOrigin = str;
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f58812a, false, 63935, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f58812a, false, 63935, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 == 0) {
            if (!a.b()) {
                this.n.setText(getString(C0906R.string.bmm));
            }
            this.n.setCompoundDrawablesWithIntrinsicBounds(null, com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130839518), null, null);
        } else {
            if (!a.b()) {
                this.n.setText(getString(C0906R.string.bmn));
            }
            this.n.setCompoundDrawablesWithIntrinsicBounds(null, com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130839519), null, null);
        }
    }

    public void onClick(View view) {
        com.ss.android.ugc.aweme.tools.a.b bVar;
        com.ss.android.ugc.aweme.tools.a.a aVar;
        if (PatchProxy.isSupport(new Object[]{view}, this, f58812a, false, 63932, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f58812a, false, 63932, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.det) {
            com.ss.android.ugc.aweme.port.in.a.h.b();
            r.onEvent(MobClick.obtain().setEventName("next").setLabelName("mid_page").setJsonObject(c.a().a("media_type", "pic_movie").b()));
            PhotoMovieContext a2 = this.f58815d.a();
            a2.mVideoLength = (int) this.f58815d.c();
            a2.mFilterId = this.h.c().f47598b;
            a2.mFilterName = this.h.c().f47600d;
            if (PatchProxy.isSupport(new Object[]{a2}, null, com.ss.android.ugc.aweme.shortvideo.b.f65761a, true, 73883, new Class[]{BaseShortVideoContext.class}, com.ss.android.ugc.aweme.tools.a.b.class)) {
                bVar = (com.ss.android.ugc.aweme.tools.a.b) PatchProxy.accessDispatch(new Object[]{a2}, null, com.ss.android.ugc.aweme.shortvideo.b.f65761a, true, 73883, new Class[]{BaseShortVideoContext.class}, com.ss.android.ugc.aweme.tools.a.b.class);
            } else if (a2 == null) {
                bVar = com.ss.android.ugc.aweme.shortvideo.b.f65762b;
            } else {
                bVar = new com.ss.android.ugc.aweme.tools.a.b(a2) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f65764a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ BaseShortVideoContext f65765b;

                    {
                        this.f65765b = r1;
                    }

                    public final String a(f fVar) {
                        if (PatchProxy.isSupport(new Object[]{fVar}, this, f65764a, false, 73889, new Class[]{f.class}, String.class)) {
                            return (String) PatchProxy.accessDispatch(new Object[]{fVar}, this, f65764a, false, 73889, new Class[]{f.class}, String.class);
                        }
                        String str = null;
                        switch (AnonymousClass5.f65768a[fVar.ordinal()]) {
                            case 1:
                                str = this.f65765b.mainBusinessData;
                                break;
                            case 2:
                                str = this.f65765b.socialData;
                                break;
                            case 3:
                                str = this.f65765b.poiData;
                                break;
                            case 4:
                                str = this.f65765b.commerceData;
                                break;
                            case 5:
                                str = this.f65765b.ugData;
                                break;
                            case 6:
                                str = this.f65765b.techData;
                                break;
                            case e.l:
                                str = this.f65765b.globalData;
                                break;
                        }
                        return str;
                    }
                };
            }
            if (PatchProxy.isSupport(new Object[]{a2}, null, com.ss.android.ugc.aweme.shortvideo.b.f65761a, true, 73884, new Class[]{BaseShortVideoContext.class}, com.ss.android.ugc.aweme.tools.a.a.class)) {
                aVar = (com.ss.android.ugc.aweme.tools.a.a) PatchProxy.accessDispatch(new Object[]{a2}, null, com.ss.android.ugc.aweme.shortvideo.b.f65761a, true, 73884, new Class[]{BaseShortVideoContext.class}, com.ss.android.ugc.aweme.tools.a.a.class);
            } else {
                aVar = new com.ss.android.ugc.aweme.tools.a.a(a2) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f65766a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ BaseShortVideoContext f65767b;

                    {
                        this.f65767b = r1;
                    }

                    public final void a(f fVar, String str) {
                        if (PatchProxy.isSupport(new Object[]{fVar, str}, this, f65766a, false, 73890, new Class[]{f.class, String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{fVar, str}, this, f65766a, false, 73890, new Class[]{f.class, String.class}, Void.TYPE);
                            return;
                        }
                        switch (AnonymousClass5.f65768a[fVar.ordinal()]) {
                            case 1:
                                this.f65767b.mainBusinessData = str;
                                return;
                            case 2:
                                this.f65767b.socialData = str;
                                return;
                            case 3:
                                this.f65767b.poiData = str;
                                return;
                            case 4:
                                this.f65767b.commerceData = str;
                                return;
                            case 5:
                                this.f65767b.ugData = str;
                                return;
                            case 6:
                                this.f65767b.techData = str;
                                return;
                            case e.l:
                                this.f65767b.globalData = str;
                                break;
                        }
                    }
                };
            }
            g.a(bVar, aVar, com.ss.android.ugc.aweme.tools.a.e.EDIT, com.ss.android.ugc.aweme.tools.a.e.PUBLISH);
            if (PatchProxy.isSupport(new Object[]{this, a2, 1}, null, PhotoMoviePublishActivity.f58841a, true, 63986, new Class[]{Activity.class, PhotoMovieContext.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{this, a2, 1}, null, PhotoMoviePublishActivity.f58841a, true, 63986, new Class[]{Activity.class, PhotoMovieContext.class, Integer.TYPE}, Void.TYPE);
            } else {
                Intent intent = new Intent();
                intent.setClass(this, PhotoMoviePublishActivity.class);
                a2.mIsFromDraft = false;
                intent.putExtra("photo_movie_context", a2);
                startActivityForResult(intent, 1);
            }
        } else if (id == C0906R.id.asx || id == C0906R.id.d1a) {
            if (this.f58815d.a().mFrom == 1 || this.f58815d.a().mFrom == 2) {
                Dialog a3 = new a.C0185a(this).b((int) C0906R.string.a5y).b((int) C0906R.string.a5x, (DialogInterface.OnClickListener) null).a((int) C0906R.string.a0v, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58824a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f58824a, false, 63949, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f58824a, false, 63949, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        PhotoMovieEditActivity.this.finish();
                    }
                }).a().a();
                if (!fc.a() && !com.ss.android.ugc.aweme.app.a.a.a((Activity) this)) {
                    v.a(a3);
                }
                a3.show();
                return;
            }
            com.ss.android.ugc.aweme.port.in.a.K.a(this, this.f58815d.a());
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        int i2;
        PhotoMovieContext photoMovieContext;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f58812a, false, 63925, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f58812a, false, 63925, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieEditActivity", "onCreate", true);
        super.onCreate(bundle);
        if (PatchProxy.isSupport(new Object[0], this, f58812a, false, 63938, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58812a, false, 63938, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.NewEditPage) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = C0906R.layout.ae9;
        } else {
            i2 = C0906R.layout.ae7;
        }
        setContentView(i2);
        if (!fc.a() && !com.ss.android.ugc.aweme.app.a.a.a((Activity) this)) {
            v.a((Activity) this);
        }
        if (PatchProxy.isSupport(new Object[0], this, f58812a, false, 63928, new Class[0], PhotoMovieContext.class)) {
            photoMovieContext = (PhotoMovieContext) PatchProxy.accessDispatch(new Object[0], this, f58812a, false, 63928, new Class[0], PhotoMovieContext.class);
        } else {
            photoMovieContext = (PhotoMovieContext) getIntent().getParcelableExtra("photo_movie_context");
            if (photoMovieContext == null) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) this, getString(C0906R.string.abb)).a();
                finish();
            }
            if (photoMovieContext.mImageList != null && photoMovieContext.mImageList.size() <= 2) {
                photoMovieContext.mImageList.add(photoMovieContext.mImageList.get(0));
            }
            photoMovieContext.mMusicList = (List) getIntent().getSerializableExtra("photo_movie_context_music_list");
            if (photoMovieContext.mMusic == null) {
                photoMovieContext.mMusic = photoMovieContext.mMusicList.get(0);
            }
        }
        this.o = photoMovieContext;
        PhotoMovieContext photoMovieContext2 = this.o;
        if (PatchProxy.isSupport(new Object[]{photoMovieContext2}, this, f58812a, false, 63929, new Class[]{PhotoMovieContext.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{photoMovieContext2}, this, f58812a, false, 63929, new Class[]{PhotoMovieContext.class}, Void.TYPE);
        } else {
            this.l = (FrameLayout) findViewById(C0906R.id.b8w);
            this.m = (FrameLayout) findViewById(C0906R.id.b89);
            this.f58813b = (FrameLayout) findViewById(C0906R.id.b81);
            this.j = (TextView) findViewById(C0906R.id.der);
            this.n = (TextView) findViewById(C0906R.id.deq);
            this.k = findViewById(C0906R.id.des);
            this.j.setOnClickListener(new c(this, photoMovieContext2));
            findViewById(C0906R.id.det).setOnClickListener(this);
            this.k.setOnClickListener(new d(this, photoMovieContext2));
            findViewById(C0906R.id.asx).setOnClickListener(this);
            findViewById(C0906R.id.d1a).setOnClickListener(this);
            if (photoMovieContext2.mIsFromDraft) {
                findViewById(C0906R.id.d1a).setVisibility(0);
            }
            findViewById(C0906R.id.asx).setOnClickListener(this);
            this.n.setOnClickListener(new e(this));
            a(photoMovieContext2.mPlayType);
        }
        this.f58815d = new PhotoMoviePlayerModule(this, this.m, this.o);
        this.h = new com.ss.android.ugc.aweme.photomovie.edit.a.a(this, this.f58815d, findViewById(C0906R.id.bxu), this.f58813b);
        this.h.a(a());
        this.f58814c = new d(this.f58815d, this.h);
        if (PatchProxy.isSupport(new Object[0], this, f58812a, false, 63926, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58812a, false, 63926, new Class[0], Void.TYPE);
        } else {
            this.i = new n(this.m, this, this, this.h.c());
            this.i.a(1);
            this.i.f67470c = new n.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58818a;

                public final void a(h hVar) {
                    h hVar2 = hVar;
                    if (PatchProxy.isSupport(new Object[]{hVar2}, this, f58818a, false, 63945, new Class[]{h.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{hVar2}, this, f58818a, false, 63945, new Class[]{h.class}, Void.TYPE);
                        return;
                    }
                    PhotoMovieEditActivity.this.h.a(hVar2);
                    PhotoMoviePlayerModule photoMoviePlayerModule = PhotoMovieEditActivity.this.f58815d;
                    if (PatchProxy.isSupport(new Object[]{hVar2}, photoMoviePlayerModule, PhotoMoviePlayerModule.f58980a, false, 64142, new Class[]{h.class}, Void.TYPE)) {
                        PhotoMoviePlayerModule photoMoviePlayerModule2 = photoMoviePlayerModule;
                        PatchProxy.accessDispatch(new Object[]{hVar2}, photoMoviePlayerModule2, PhotoMoviePlayerModule.f58980a, false, 64142, new Class[]{h.class}, Void.TYPE);
                    } else {
                        PhotoMoviePlayerPresenter photoMoviePlayerPresenter = photoMoviePlayerModule.f58981b;
                        if (PatchProxy.isSupport(new Object[]{hVar2}, photoMoviePlayerPresenter, PhotoMoviePlayerPresenter.f3735a, false, 64160, new Class[]{h.class}, Void.TYPE)) {
                            Object[] objArr = {hVar2};
                            PhotoMoviePlayerPresenter photoMoviePlayerPresenter2 = photoMoviePlayerPresenter;
                            PatchProxy.accessDispatch(objArr, photoMoviePlayerPresenter2, PhotoMoviePlayerPresenter.f3735a, false, 64160, new Class[]{h.class}, Void.TYPE);
                        } else {
                            String str = hVar2.i;
                            photoMoviePlayerPresenter.f3736b.a(str);
                            photoMoviePlayerPresenter.f3737c.mFilterPath = str;
                            photoMoviePlayerPresenter.f3737c.mFilterName = hVar2.f47600d;
                            photoMoviePlayerPresenter.f3737c.mFilterId = hVar2.f47598b;
                        }
                    }
                    r.onEvent(MobClick.obtain().setEventName("filter_slide").setLabelName("slide").setJsonObject(PhotoMovieEditActivity.this.a()));
                }

                public final void a(h hVar, h hVar2, float f2) {
                    h hVar3 = hVar;
                    h hVar4 = hVar2;
                    if (PatchProxy.isSupport(new Object[]{hVar3, hVar4, Float.valueOf(f2)}, this, f58818a, false, 63944, new Class[]{h.class, h.class, Float.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{hVar3, hVar4, Float.valueOf(f2)}, this, f58818a, false, 63944, new Class[]{h.class, h.class, Float.TYPE}, Void.TYPE);
                        return;
                    }
                    PhotoMoviePlayerModule photoMoviePlayerModule = PhotoMovieEditActivity.this.f58815d;
                    String str = hVar3.i;
                    String str2 = hVar4.i;
                    if (PatchProxy.isSupport(new Object[]{str, str2, Float.valueOf(f2)}, photoMoviePlayerModule, PhotoMoviePlayerModule.f58980a, false, 64141, new Class[]{String.class, String.class, Float.TYPE}, Void.TYPE)) {
                        PhotoMoviePlayerModule photoMoviePlayerModule2 = photoMoviePlayerModule;
                        PatchProxy.accessDispatch(new Object[]{str, str2, Float.valueOf(f2)}, photoMoviePlayerModule2, PhotoMoviePlayerModule.f58980a, false, 64141, new Class[]{String.class, String.class, Float.TYPE}, Void.TYPE);
                        return;
                    }
                    PhotoMoviePlayerPresenter photoMoviePlayerPresenter = photoMoviePlayerModule.f58981b;
                    Object[] objArr = {str, str2, Float.valueOf(f2)};
                    if (PatchProxy.isSupport(objArr, photoMoviePlayerPresenter, PhotoMoviePlayerPresenter.f3735a, false, 64159, new Class[]{String.class, String.class, Float.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, str2, Float.valueOf(f2)}, photoMoviePlayerPresenter, PhotoMoviePlayerPresenter.f3735a, false, 64159, new Class[]{String.class, String.class, Float.TYPE}, Void.TYPE);
                        return;
                    }
                    PhotoMoviePlayer photoMoviePlayer = photoMoviePlayerPresenter.f3736b;
                    if (PatchProxy.isSupport(new Object[]{str, str2, Float.valueOf(f2)}, photoMoviePlayer, PhotoMoviePlayer.f29715a, false, 17503, new Class[]{String.class, String.class, Float.TYPE}, Void.TYPE)) {
                        Object[] objArr2 = {str, str2, Float.valueOf(f2)};
                        Object[] objArr3 = objArr2;
                        PhotoMoviePlayer photoMoviePlayer2 = photoMoviePlayer;
                        PatchProxy.accessDispatch(objArr3, photoMoviePlayer2, PhotoMoviePlayer.f29715a, false, 17503, new Class[]{String.class, String.class, Float.TYPE}, Void.TYPE);
                        return;
                    }
                    photoMoviePlayer.nativeSetFilter(photoMoviePlayer.f29716b, str, str2, f2);
                }
            };
            this.h.a(this.i);
        }
        if (PatchProxy.isSupport(new Object[0], this, f58812a, false, 63927, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58812a, false, 63927, new Class[0], Void.TYPE);
        } else {
            ((com.ss.android.ugc.aweme.photomovie.edit.player.b) this.f58815d.f58982c).f58988b = new f.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58820a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f58820a, false, 63946, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f58820a, false, 63946, new Class[0], Void.TYPE);
                        return;
                    }
                    super.a();
                    if (PhotoMovieEditActivity.this.i != null) {
                        PhotoMovieEditActivity.this.i.g = false;
                    }
                }

                public final void d() {
                    if (PatchProxy.isSupport(new Object[0], this, f58820a, false, 63947, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f58820a, false, 63947, new Class[0], Void.TYPE);
                        return;
                    }
                    super.d();
                    if (PhotoMovieEditActivity.this.i != null) {
                        PhotoMovieEditActivity.this.i.g = true;
                    }
                }
            };
        }
        r.a("enter_video_edit_page", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.o.creationId).a("shoot_way", this.o.mShootWay).a("draft_id", this.o.draftId).a("content_type", "slideshow").a("content_source", "upload").a("filter_list", this.h.c().f47600d).a("filter_id_list", this.h.c().f47598b).f34114b);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieEditActivity", "onCreate", false);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f58812a, false, 63934, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f58812a, false, 63934, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1 && i3 == -1) {
            PhotoMovieContext photoMovieContext = (PhotoMovieContext) intent2.getParcelableExtra("photo_movie_context");
            if (photoMovieContext != null) {
                this.f58815d.a().title = photoMovieContext.title;
                this.f58815d.a().structList = photoMovieContext.structList;
                this.f58815d.a().isPrivate = photoMovieContext.isPrivate;
                this.f58815d.a().challenges = photoMovieContext.challenges;
                this.f58815d.a().poiId = photoMovieContext.poiId;
                this.f58815d.a().mFinalVideoTmpPath = photoMovieContext.mFinalVideoTmpPath;
                this.f58815d.a().mCoverStartTm = photoMovieContext.mCoverStartTm;
            }
        }
    }

    public static void a(@NonNull Context context, @NonNull PhotoMovieContext photoMovieContext, @NonNull List<com.ss.android.ugc.aweme.shortvideo.e> list, @Nullable String str) {
        Context context2 = context;
        PhotoMovieContext photoMovieContext2 = photoMovieContext;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, photoMovieContext2, list, str2}, null, f58812a, true, 63924, new Class[]{Context.class, PhotoMovieContext.class, List.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context2, photoMovieContext2, list, str2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f58812a, true, 63924, new Class[]{Context.class, PhotoMovieContext.class, List.class, String.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, PhotoMovieEditActivity.class);
        photoMovieContext2.mShootWay = str2;
        intent.putExtra("photo_movie_context", photoMovieContext2);
        intent.putExtra("photo_movie_context_music_list", (Serializable) list);
        context2.startActivity(intent);
    }
}
