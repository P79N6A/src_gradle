package com.ss.android.ugc.aweme.shortvideo.local;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ao.a;
import com.ss.android.ugc.aweme.base.activity.b;
import com.ss.android.ugc.aweme.base.activity.e;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.photo.c;
import com.ss.android.ugc.aweme.photo.j;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.shortvideo.e.j;
import com.ss.android.ugc.aweme.shortvideo.ff;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class a implements a.f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68330a;

    /* renamed from: b  reason: collision with root package name */
    public final AbsActivity f68331b;

    /* renamed from: c  reason: collision with root package name */
    public int f68332c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f68333d = true;

    /* renamed from: e  reason: collision with root package name */
    public long f68334e = ff.a();

    /* renamed from: f  reason: collision with root package name */
    public C0718a f68335f;
    public a.e g;
    public int h;
    private final e i;
    private com.ss.android.ugc.aweme.common.widget.a j;
    private PhotoMovieContext k;
    private fh l;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.local.a$a  reason: collision with other inner class name */
    public interface C0718a {
        void a(@NonNull PhotoContext photoContext);

        void a(@NonNull PhotoMovieContext photoMovieContext, @NonNull List<com.ss.android.ugc.aweme.shortvideo.e> list);

        void a(@NonNull String str, boolean z);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f68330a, false, 77539, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68330a, false, 77539, new Class[0], Void.TYPE);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("key_support_flag", this.f68332c);
        bundle.putBoolean("Key_enable_multi_video", this.f68333d);
        bundle.putLong("Key_min_duration", this.f68334e);
        int i2 = 2;
        if ((this.f68332c & 1) != 0 || (this.f68332c & 2) == 0) {
            i2 = 1;
        }
        bundle.putInt("key_photo_select_min_count", i2);
        bundle.putInt("key_photo_select_max_count", 12);
        bundle.putInt("key_video_select_min_count", 1);
        bundle.putInt("key_video_select_max_count", 12);
        bundle.putInt("key_choose_scene", this.h);
        bundle.putParcelable("key_short_video_context", this.l);
        if (this.l.an) {
            MvChoosePhotoActivity.a(this.f68331b, bundle, 1, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR);
        } else if ("from_chat".equals(this.l.s)) {
            MvChoosePhotoActivity.a(this.f68331b, bundle, 1, 4);
        } else {
            MvChoosePhotoActivity.a(this.f68331b, bundle, 1);
        }
    }

    public final void a(Exception exc, String str) {
        if (PatchProxy.isSupport(new Object[]{exc, str}, this, f68330a, false, 77542, new Class[]{Exception.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, str}, this, f68330a, false, 77542, new Class[]{Exception.class, String.class}, Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.dismiss();
        }
        this.k.mMusicPath = com.ss.android.ugc.aweme.port.in.a.i.b();
        this.f68335f.a(this.k, (List<com.ss.android.ugc.aweme.shortvideo.e>) new ArrayList<com.ss.android.ugc.aweme.shortvideo.e>() {
            {
                add(com.ss.android.ugc.aweme.port.in.a.i.a());
            }
        });
    }

    public final void a(List<com.ss.android.ugc.aweme.shortvideo.e> list, String str) {
        List<com.ss.android.ugc.aweme.shortvideo.e> list2;
        if (PatchProxy.isSupport(new Object[]{list, str}, this, f68330a, false, 77541, new Class[]{List.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, str}, this, f68330a, false, 77541, new Class[]{List.class, String.class}, Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.dismiss();
        }
        if (list == null) {
            this.k.mMusicList = null;
            list2 = new ArrayList<>();
        } else {
            list2 = list;
        }
        this.k.mMusicPath = str;
        this.f68335f.a(this.k, list2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean a(@NonNull C0718a aVar, int i2, int i3, Intent intent) {
        if (i2 != 1) {
            return false;
        }
        if (i3 == -1) {
            if (intent.hasExtra("video_file")) {
                aVar.a(intent.getStringExtra("video_file"), intent.getBooleanExtra("video_multi_edit", false));
            } else if (intent.hasExtra("image_file")) {
                final String stringExtra = intent.getStringExtra("image_file");
                final String stringExtra2 = intent.getStringExtra("image_poidata");
                if (PatchProxy.isSupport(new Object[]{stringExtra, stringExtra2}, this, f68330a, false, 77543, new Class[]{String.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{stringExtra, stringExtra2}, this, f68330a, false, 77543, new Class[]{String.class, String.class}, Void.TYPE);
                } else {
                    final d b2 = d.b(this.f68331b, "");
                    b2.setIndeterminate(true);
                    v.a((Dialog) b2);
                    com.ss.android.b.a.a.a.a(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f68336a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f68336a, false, 77547, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f68336a, false, 77547, new Class[0], Void.TYPE);
                                return;
                            }
                            final PhotoContext a2 = j.a(stringExtra, new c());
                            a2.md5 = j.a.a(new File(stringExtra));
                            com.ss.android.b.a.a.a.b(new Runnable() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f68341a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f68341a, false, 77548, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f68341a, false, 77548, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    b2.dismiss();
                                    if (a2 == null) {
                                        com.bytedance.ies.dmt.ui.d.a.b((Context) a.this.f68331b, (int) C0906R.string.b0w).a();
                                        return;
                                    }
                                    a2.poiData = stringExtra2;
                                    a.this.f68335f.a(a2);
                                }
                            });
                        }
                    });
                }
            } else if (intent.hasExtra("photo_movie_context")) {
                this.k = (PhotoMovieContext) intent.getParcelableExtra("photo_movie_context");
                if (PatchProxy.isSupport(new Object[0], this, f68330a, false, 77540, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f68330a, false, 77540, new Class[0], Void.TYPE);
                } else {
                    if (this.g == null) {
                        this.g = com.ss.android.ugc.aweme.port.in.a.i.a((a.f) this);
                    }
                    this.g.a(new Object[0]);
                    this.j = com.ss.android.ugc.aweme.common.widget.a.a(this.f68331b, this.f68331b.getString(C0906R.string.a0t), "compress_photo_movie_loading.json");
                }
            }
        }
        return true;
    }

    public a(@NonNull AbsActivity absActivity, @NonNull e eVar, @NonNull fh fhVar, @NonNull UploadButton uploadButton, @NonNull C0718a aVar) {
        this.f68331b = absActivity;
        this.l = fhVar;
        this.i = eVar;
        this.f68335f = aVar;
        uploadButton.post(new b(uploadButton));
        this.i.a((b) new c(this, aVar));
    }
}
