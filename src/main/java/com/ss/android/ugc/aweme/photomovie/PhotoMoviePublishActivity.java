package com.ss.android.ugc.aweme.photomovie;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.services.publish.AVPublishExtensionUtils;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.services.publish.PoiAndGoodsPublishModel;
import com.ss.android.ugc.aweme.shortvideo.ff;
import com.ss.android.ugc.aweme.shortvideo.util.am;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class PhotoMoviePublishActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58841a;

    /* renamed from: b  reason: collision with root package name */
    public PhotoMovieContext f58842b;

    /* renamed from: c  reason: collision with root package name */
    TextView f58843c;

    /* renamed from: d  reason: collision with root package name */
    TextView f58844d;

    /* renamed from: e  reason: collision with root package name */
    private PhotoMoviePublishFragment f58845e;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f58841a, false, 63998, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58841a, false, 63998, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePublishActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePublishActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f58841a, false, 63999, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f58841a, false, 63999, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePublishActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f58841a, false, 63995, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58841a, false, 63995, new Class[0], Void.TYPE);
            return;
        }
        PhotoMovieContext a2 = a();
        Intent intent = new Intent();
        intent.putExtra("photo_movie_context", a2);
        setResult(-1, intent);
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f58841a, false, 63994, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58841a, false, 63994, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        if (am.a().b() < 3) {
            am.a().a(0);
        }
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f58841a, false, 63996, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58841a, false, 63996, new Class[0], Void.TYPE);
        } else if (this.f58842b == null || this.f58842b.mIsFromDraft) {
            super.onBackPressed();
        } else {
            b();
            finish();
        }
    }

    /* access modifiers changed from: package-private */
    public PhotoMovieContext a() {
        if (PatchProxy.isSupport(new Object[0], this, f58841a, false, 63991, new Class[0], PhotoMovieContext.class)) {
            return (PhotoMovieContext) PatchProxy.accessDispatch(new Object[0], this, f58841a, false, 63991, new Class[0], PhotoMovieContext.class);
        }
        PhotoMoviePublishFragment photoMoviePublishFragment = (PhotoMoviePublishFragment) getSupportFragmentManager().findFragmentById(C0906R.id.aic);
        if (PatchProxy.isSupport(new Object[0], photoMoviePublishFragment, PhotoMoviePublishFragment.f58857a, false, 64021, new Class[0], PhotoMovieContext.class)) {
            return (PhotoMovieContext) PatchProxy.accessDispatch(new Object[0], photoMoviePublishFragment, PhotoMoviePublishFragment.f58857a, false, 64021, new Class[0], PhotoMovieContext.class);
        }
        photoMoviePublishFragment.f58862f.b();
        photoMoviePublishFragment.f58858b.title = photoMoviePublishFragment.f58862f.c();
        if (photoMoviePublishFragment.f58862f.d() != null) {
            photoMoviePublishFragment.f58858b.structList = photoMoviePublishFragment.f58862f.d();
        }
        photoMoviePublishFragment.f58858b.isPrivate = photoMoviePublishFragment.g.a();
        if (photoMoviePublishFragment.f58861e.a() != null) {
            photoMoviePublishFragment.f58858b.challenges = Collections.singletonList(photoMoviePublishFragment.f58861e.f68864b);
        }
        photoMoviePublishFragment.f58858b.poiId = ((PoiAndGoodsPublishModel) AVPublishExtensionUtils.findModel(photoMoviePublishFragment.p, PoiAndGoodsPublishModel.class)).getPoiContext();
        if (TextUtils.isEmpty(photoMoviePublishFragment.f58858b.mFinalVideoTmpPath)) {
            photoMoviePublishFragment.f58858b.mFinalVideoTmpPath = ff.b("-concat-v");
        }
        for (Pair<Class<?>, IAVPublishExtension<?>> pair : photoMoviePublishFragment.p) {
            ((IAVPublishExtension) pair.second).onBackPressed(b.a(photoMoviePublishFragment.f58858b));
        }
        return photoMoviePublishFragment.f58858b;
    }

    public final void a(PhotoMovieContext photoMovieContext) {
        PhotoMovieContext photoMovieContext2 = photoMovieContext;
        if (PatchProxy.isSupport(new Object[]{photoMovieContext2}, this, f58841a, false, 63993, new Class[]{PhotoMovieContext.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{photoMovieContext2}, this, f58841a, false, 63993, new Class[]{PhotoMovieContext.class}, Void.TYPE);
            return;
        }
        r.a("enter_video_edit_page", (Map) d.a().a("creation_id", photoMovieContext2.creationId).a("shoot_way", photoMovieContext2.mShootWay).a("draft_id", photoMovieContext2.draftId).a("filter_list", photoMovieContext2.mFilterName).a("filter_id_list", photoMovieContext2.mFilterId).a("content_type", "slideshow").a("content_source", "upload").f34114b);
    }

    public void onCreate(Bundle bundle) {
        PhotoMoviePublishFragment photoMoviePublishFragment;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f58841a, false, 63988, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f58841a, false, 63988, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePublishActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.cv);
        this.f58843c = (TextView) findViewById(C0906R.id.iu);
        this.f58844d = (TextView) findViewById(C0906R.id.q2);
        this.f58842b = (PhotoMovieContext) getIntent().getParcelableExtra("photo_movie_context");
        final ArrayList arrayList = (ArrayList) getIntent().getSerializableExtra("photo_movie_context_music_list");
        if (!this.f58842b.mIsFromDraft) {
            this.f58843c.setText(null);
            this.f58843c.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58846a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f58846a, false, 64000, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f58846a, false, 64000, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    r.onEvent(MobClick.obtain().setEventName("back_to_edit").setLabelName("edit_page"));
                    PhotoMoviePublishActivity.this.a(PhotoMoviePublishActivity.this.f58842b);
                    PhotoMoviePublishActivity.this.b();
                    PhotoMoviePublishActivity.this.finish();
                }
            });
        } else {
            this.f58843c.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58848a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f58848a, false, 64001, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f58848a, false, 64001, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    r.onEvent(MobClick.obtain().setEventName("back_to_edit").setLabelName("edit_page"));
                    PhotoMoviePublishActivity photoMoviePublishActivity = PhotoMoviePublishActivity.this;
                    ArrayList arrayList = arrayList;
                    if (PatchProxy.isSupport(new Object[]{arrayList}, photoMoviePublishActivity, PhotoMoviePublishActivity.f58841a, false, 63992, new Class[]{ArrayList.class}, Void.TYPE)) {
                        PhotoMoviePublishActivity photoMoviePublishActivity2 = photoMoviePublishActivity;
                        PatchProxy.accessDispatch(new Object[]{arrayList}, photoMoviePublishActivity2, PhotoMoviePublishActivity.f58841a, false, 63992, new Class[]{ArrayList.class}, Void.TYPE);
                    } else {
                        PhotoMovieEditActivity.a(photoMoviePublishActivity, photoMoviePublishActivity.a(), arrayList, "edit_draft");
                    }
                    PhotoMoviePublishActivity.this.a(PhotoMoviePublishActivity.this.f58842b);
                    PhotoMoviePublishActivity.this.finish();
                }
            });
            this.f58844d.setVisibility(0);
            this.f58844d.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58851a;

                public final void onClick(View view) {
                    boolean z;
                    if (PatchProxy.isSupport(new Object[]{view}, this, f58851a, false, 64002, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f58851a, false, 64002, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    PhotoMoviePublishActivity photoMoviePublishActivity = PhotoMoviePublishActivity.this;
                    if (PatchProxy.isSupport(new Object[0], photoMoviePublishActivity, PhotoMoviePublishActivity.f58841a, false, 63990, new Class[0], Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[0], photoMoviePublishActivity, PhotoMoviePublishActivity.f58841a, false, 63990, new Class[0], Boolean.TYPE)).booleanValue();
                    } else {
                        z = ((PhotoMoviePublishFragment) photoMoviePublishActivity.getSupportFragmentManager().findFragmentById(C0906R.id.aic)).n;
                    }
                    if (z) {
                        PhotoMoviePublishActivity photoMoviePublishActivity2 = PhotoMoviePublishActivity.this;
                        if (PatchProxy.isSupport(new Object[0], photoMoviePublishActivity2, PhotoMoviePublishActivity.f58841a, false, 63989, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], photoMoviePublishActivity2, PhotoMoviePublishActivity.f58841a, false, 63989, new Class[0], Void.TYPE);
                        } else {
                            new a.C0185a(photoMoviePublishActivity2).b((int) C0906R.string.bux).a((int) C0906R.string.aja, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f58855a;

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f58855a, false, 64004, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f58855a, false, 64004, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    PhotoMoviePublishActivity.this.finish();
                                }
                            }).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f58853a;

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f58853a, false, 64003, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f58853a, false, 64003, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    dialogInterface.dismiss();
                                }
                            }).a().a();
                        }
                    } else {
                        PhotoMoviePublishActivity.this.finish();
                    }
                }
            });
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        this.f58845e = (PhotoMoviePublishFragment) supportFragmentManager.findFragmentById(C0906R.id.aic);
        if (this.f58845e == null) {
            PhotoMovieContext photoMovieContext = this.f58842b;
            if (PatchProxy.isSupport(new Object[]{photoMovieContext}, null, PhotoMoviePublishFragment.f58857a, true, 64005, new Class[]{PhotoMovieContext.class}, PhotoMoviePublishFragment.class)) {
                photoMoviePublishFragment = (PhotoMoviePublishFragment) PatchProxy.accessDispatch(new Object[]{photoMovieContext}, null, PhotoMoviePublishFragment.f58857a, true, 64005, new Class[]{PhotoMovieContext.class}, PhotoMoviePublishFragment.class);
            } else {
                PhotoMoviePublishFragment photoMoviePublishFragment2 = new PhotoMoviePublishFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("photo_movie_context", photoMovieContext);
                photoMoviePublishFragment2.setArguments(bundle2);
                photoMoviePublishFragment = photoMoviePublishFragment2;
            }
            this.f58845e = photoMoviePublishFragment;
            supportFragmentManager.beginTransaction().add((int) C0906R.id.aic, (Fragment) this.f58845e).commit();
        }
        r.a("enter_video_post_page", (Map) d.a().a("creation_id", this.f58842b.creationId).a("shoot_way", this.f58842b.mShootWay).a("draft_id", this.f58842b.draftId).a("filter_list", this.f58842b.mFilterName).a("filter_id_list", this.f58842b.mFilterId).a("content_type", "slideshow").a("content_source", "upload").f34114b);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePublishActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f58841a, false, 63997, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f58841a, false, 63997, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (this.f58845e != null && this.f58845e.isAdded()) {
            int i3 = i;
            int i4 = i2;
            this.f58845e.onActivityResult(i, i2, intent2);
        }
    }
}
