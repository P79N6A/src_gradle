package com.ss.android.ugc.aweme.shortvideo.ui;

import a.g;
import a.i;
import a.j;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.persistent.SharedPrefsEditorCompat;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.f;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.feed.ui.au;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.services.story.IStoryRecordService;
import com.ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.ss.android.ugc.aweme.shortvideo.e;
import com.ss.android.ugc.aweme.shortvideo.ej;
import com.ss.android.ugc.aweme.shortvideo.er;
import com.ss.android.ugc.aweme.shortvideo.hm;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import com.ss.android.ugc.aweme.utils.af;
import com.ss.android.ugc.aweme.utils.bc;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;

public class VideoRecordPermissionActivity extends AbsActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70691a;

    /* renamed from: b  reason: collision with root package name */
    ToolSafeHandler f70692b = new ToolSafeHandler(this);

    /* renamed from: c  reason: collision with root package name */
    long f70693c = 0;

    /* renamed from: d  reason: collision with root package name */
    boolean f70694d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f70695e = false;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f70691a, false, 80722, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70691a, false, 80722, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f70691a, false, 80723, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f70691a, false, 80723, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f70691a, false, 80702, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70691a, false, 80702, new Class[0], Void.TYPE);
            return;
        }
        boolean booleanExtra = getIntent().getBooleanExtra("enter_record_directly_from_system", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("recreate_record_activity_support", false);
        if (booleanExtra) {
            finish();
        } else if (a.c()) {
            com.bytedance.ies.dmt.ui.d.a.b(getApplicationContext(), (int) C0906R.string.byo).a();
            finish();
        } else if (!b(getIntent()) || !a.a()) {
            IStoryRecordService iStoryRecordService = (IStoryRecordService) ServiceManager.get().getService(IStoryRecordService.class);
            if ((!a(getIntent()) && !b(getIntent()) && a.a() && !booleanExtra2) || (iStoryRecordService != null && iStoryRecordService.isStoryRecording())) {
                n.a("record", c.a().a("event", "isRecording").a("user_info", a.b()).b());
                if (e()) {
                    com.bytedance.ies.dmt.ui.d.a.b(getApplicationContext(), (int) C0906R.string.byo).a();
                } else {
                    com.bytedance.ies.dmt.ui.d.a.b(getApplicationContext(), (int) C0906R.string.byn).a();
                }
                finish();
            } else if (!ej.a().a((Context) this)) {
                n.a("record", c.a().a("event", "isPublishing").b());
                finish();
            } else {
                b();
                try {
                    if (com.ss.android.g.a.a()) {
                        this.f70694d = getIntent().getBooleanExtra("is_star_atlas", false);
                    } else {
                        this.f70693c = Long.valueOf(getIntent().getStringExtra("star_atlas_id")).longValue();
                    }
                } catch (Exception unused) {
                }
            }
        } else {
            finish();
        }
    }

    public static boolean a(Intent intent) {
        Intent intent2 = intent;
        if (!PatchProxy.isSupport(new Object[]{intent2}, null, f70691a, true, 80706, new Class[]{Intent.class}, Boolean.TYPE)) {
            return intent2 != null && "main".equals(intent2.getStringExtra("from"));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{intent2}, null, f70691a, true, 80706, new Class[]{Intent.class}, Boolean.TYPE)).booleanValue();
    }

    public static boolean a(Context context, Intent intent) {
        Context context2 = context;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{context2, intent2}, null, f70691a, true, 80717, new Class[]{Context.class, Intent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, intent2}, null, f70691a, true, 80717, new Class[]{Context.class, Intent.class}, Boolean.TYPE)).booleanValue();
        } else if (!a.a() || !intent2.getBooleanExtra("extra_clear_dialog_show_needed", true)) {
            return false;
        } else {
            a.C0185a a2 = new a.C0185a(context2).a((int) C0906R.string.c3r);
            if (com.ss.android.g.a.a()) {
                a2.b((int) C0906R.string.c3q);
            }
            a2.b((int) C0906R.string.c3l, cj.f70872b).a((int) C0906R.string.a0v, (DialogInterface.OnClickListener) new ck(context2, intent2)).a().a();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(List<Bundle> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f70691a, false, 80719, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f70691a, false, 80719, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(this, VideoRecordNewActivity.class);
        boolean booleanExtra = getIntent().getBooleanExtra("show_no_splash_ad", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("sticker_pannel_show", false);
        boolean booleanExtra3 = getIntent().getBooleanExtra("enter_record_from_other_platform", false);
        if (booleanExtra3) {
            ej.a().a((e) null);
            ej.a().c();
        }
        if (booleanExtra) {
            com.ss.android.ugc.aweme.port.in.a.f61121d.a(true);
        }
        intent.putExtra("sticker_pannel_show", booleanExtra2);
        intent.putExtra("enter_record_from_other_platform", booleanExtra3);
        if (list != null) {
            for (Bundle putExtras : list) {
                intent.putExtras(putExtras);
            }
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        if (!TextUtils.isEmpty(getIntent().getStringExtra("micro_app_class"))) {
            intent.putExtra("micro_app_class", getIntent().getStringExtra("micro_app_class"));
        }
        TextUtils.isEmpty(intent.getStringExtra("shoot_way"));
        if (TextUtils.isEmpty(intent.getStringExtra("creation_id"))) {
            intent.putExtra("creation_id", UUID.randomUUID().toString());
        }
        if (com.ss.android.g.a.a()) {
            intent.putExtra("is_star_atlas", this.f70694d);
        } else if (this.f70693c != 0) {
            intent.putExtra("star_atlas_id", this.f70693c);
        }
        intent.putExtra("extra_start_record_time", intent.getLongExtra("extra_start_record_time", System.currentTimeMillis()));
        if (com.ss.android.g.a.a()) {
            TTUploaderService.a();
        }
        startActivity(intent);
        finish();
    }

    private boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f70691a, false, 80703, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f70691a, false, 80703, new Class[0], Boolean.TYPE)).booleanValue();
        }
        f fVar = com.ss.android.ugc.aweme.port.in.a.x;
        if (fVar == null || fVar.e() == null) {
            return false;
        }
        return fVar.e().k();
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f70691a, false, 80712, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70691a, false, 80712, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        au.f46526a = getClass();
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f70691a, false, 80720, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70691a, false, 80720, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        this.f70695e = true;
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f70691a, false, 80721, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70691a, false, 80721, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        this.f70695e = false;
    }

    public final void d() {
        final boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f70691a, false, 80711, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70691a, false, 80711, new Class[0], Void.TYPE);
            return;
        }
        if (!PatchProxy.isSupport(new Object[0], this, f70691a, false, 80710, new Class[0], Boolean.TYPE)) {
            String[] strArr = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE"};
            int i = 0;
            while (true) {
                if (i >= 3) {
                    break;
                }
                String str = strArr[i];
                if (com.ss.android.ugc.aweme.port.in.a.H.E().a((Context) this, str) == -1 && !com.ss.android.ugc.aweme.port.in.a.H.E().a((Activity) this, str)) {
                    z = true;
                    break;
                }
                i++;
            }
        } else {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f70691a, false, 80710, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Dialog a2 = new a.C0185a(this).b((int) C0906R.string.fr).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70705a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f70705a, false, 80737, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f70705a, false, 80737, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                VideoRecordPermissionActivity.this.finish();
            }
        }).a((int) C0906R.string.a0x, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70702a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f70702a, false, 80736, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f70702a, false, 80736, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                } else if (z) {
                    com.ss.android.ugc.aweme.port.in.a.H.E().d(VideoRecordPermissionActivity.this);
                    VideoRecordPermissionActivity.this.finish();
                } else {
                    VideoRecordPermissionActivity.this.b();
                }
            }
        }).a().a();
        a2.setOnCancelListener(new DialogInterface.OnCancelListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70707a;

            public final void onCancel(DialogInterface dialogInterface) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f70707a, false, 80738, new Class[]{DialogInterface.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f70707a, false, 80738, new Class[]{DialogInterface.class}, Void.TYPE);
                    return;
                }
                VideoRecordPermissionActivity.this.finish();
            }
        });
        bc.a(a2);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f70691a, false, 80705, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70691a, false, 80705, new Class[0], Void.TYPE);
        } else if (a((Context) this)) {
            this.f70692b.a(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f70698a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f70698a, false, 80734, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f70698a, false, 80734, new Class[0], Void.TYPE);
                        return;
                    }
                    VideoRecordPermissionActivity.this.c();
                }
            });
        } else if (com.ss.android.ugc.aweme.port.in.a.H.E().a()) {
            com.ss.android.ugc.aweme.port.in.a.H.E().a(this, new cf(this), "android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE");
        } else {
            this.f70692b.a(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f70700a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f70700a, false, 80735, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f70700a, false, 80735, new Class[0], Void.TYPE);
                        return;
                    }
                    VideoRecordPermissionActivity.this.d();
                }
            });
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f70691a, false, 80709, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70691a, false, 80709, new Class[0], Void.TYPE);
            return;
        }
        b.a().c();
        if (!isFinishing() && !isDestroyed2() && (Build.VERSION.SDK_INT < 17 || !isDestroyed())) {
            com.ss.android.b.a.a.a.a(cg.f70865b);
            com.ss.android.ugc.aweme.port.in.a.a(new hm().a());
            if (PatchProxy.isSupport(new Object[0], this, f70691a, false, 80713, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f70691a, false, 80713, new Class[0], Void.TYPE);
            } else {
                String stringExtra = getIntent().getStringExtra("first_face_sticker");
                String stringExtra2 = getIntent().getStringExtra("music_reuse_sticker_id");
                String stringExtra3 = getIntent().getStringExtra("challenge_id");
                String stringExtra4 = getIntent().getStringExtra("music_id");
                String stringExtra5 = getIntent().getStringExtra("direct_use_sticker_music");
                String stringExtra6 = getIntent().getStringExtra("poi_struct_in_tools_line");
                if (!TextUtils.isEmpty(stringExtra6)) {
                    com.ss.android.ugc.aweme.shortvideo.d.a.b(stringExtra6);
                }
                ArrayList arrayList = new ArrayList();
                AnonymousClass7 r6 = new g<Bundle, i<Bundle>>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f70709a;

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public i<Bundle> then(i<Bundle> iVar) throws Exception {
                        if (PatchProxy.isSupport(new Object[]{iVar}, this, f70709a, false, 80739, new Class[]{i.class}, i.class)) {
                            return (i) PatchProxy.accessDispatch(new Object[]{iVar}, this, f70709a, false, 80739, new Class[]{i.class}, i.class);
                        } else if (!iVar.c() && !iVar.d()) {
                            return i.a(iVar.e());
                        } else {
                            if (iVar.d() && iVar.f() != null) {
                                com.bytedance.ies.dmt.ui.d.a.b((Context) VideoRecordPermissionActivity.this, iVar.f().getMessage()).a();
                            }
                            return i.a(new Bundle());
                        }
                    }
                };
                if (!TextUtils.isEmpty(stringExtra)) {
                    arrayList.add(a(this, stringExtra, "cold_start").b((g<TResult, i<TContinuationResult>>) r6));
                }
                if (!TextUtils.isEmpty(stringExtra2)) {
                    arrayList.add(a((Context) this, stringExtra2).b((g<TResult, i<TContinuationResult>>) r6));
                }
                if (!TextUtils.isEmpty(stringExtra3)) {
                    arrayList.add(a(stringExtra3).b((g<TResult, i<TContinuationResult>>) r6));
                }
                if (!TextUtils.isEmpty(stringExtra4)) {
                    arrayList.add(b(this, stringExtra4).b((g<TResult, i<TContinuationResult>>) r6));
                }
                if (!TextUtils.isEmpty(stringExtra5)) {
                    arrayList.add(b(this, stringExtra5).b((g<TResult, i<TContinuationResult>>) r6));
                }
                if (Lists.isEmpty(arrayList)) {
                    a((List<Bundle>) null);
                } else {
                    i.a((Collection<? extends i<TResult>>) arrayList).a((g<TResult, TContinuationResult>) new ch<TResult,TContinuationResult>(this), i.f1052b);
                }
            }
            if (com.ss.android.ugc.aweme.port.in.a.h.d()) {
                com.ss.android.ugc.aweme.port.in.a.h.b(getApplicationContext());
            }
        }
    }

    public void onNewIntent(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, f70691a, false, 80704, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent}, this, f70691a, false, 80704, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        if (b(intent)) {
            b();
        }
    }

    public static boolean b(Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2}, null, f70691a, true, 80707, new Class[]{Intent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{intent2}, null, f70691a, true, 80707, new Class[]{Intent.class}, Boolean.TYPE)).booleanValue();
        } else if (intent2 == null || !intent2.getBooleanExtra("enter_record_from_other_platform", false)) {
            return false;
        } else {
            return true;
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f70691a, false, 80701, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f70691a, false, 80701, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onCreate", true);
        super.onCreate(bundle);
        af.a(getIntent().getSerializableExtra("challenge"));
        b.a().b();
        b.a().c();
        if (er.a()) {
            com.ss.android.ugc.aweme.port.in.a.x.a((Activity) this, "", "schema_record", (Bundle) null, (f.a) new f.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f70696a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f70696a, false, 80732, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f70696a, false, 80732, new Class[0], Void.TYPE);
                        return;
                    }
                    VideoRecordPermissionActivity.this.a();
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f70696a, false, 80733, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f70696a, false, 80733, new Class[0], Void.TYPE);
                        return;
                    }
                    VideoRecordPermissionActivity.this.finish();
                }
            });
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onCreate", false);
            return;
        }
        a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onCreate", false);
    }

    public static i<Bundle> a(@NonNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f70691a, true, 80716, new Class[]{String.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str2}, null, f70691a, true, 80716, new Class[]{String.class}, i.class);
        }
        j jVar = new j();
        i.a((Callable<TResult>) new ci<TResult>(str2, jVar));
        return jVar.f1091a;
    }

    public static boolean a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f70691a, true, 80708, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f70691a, true, 80708, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        int b2 = com.ss.android.ugc.aweme.port.in.a.H.E().b(context2);
        int a2 = com.ss.android.ugc.aweme.port.in.a.H.E().a(context2);
        int c2 = com.ss.android.ugc.aweme.port.in.a.H.E().c(context2);
        if (b2 == 0 && a2 == 0 && c2 == 0) {
            return true;
        }
        return false;
    }

    public static i<Bundle> a(Context context, @NonNull String str) {
        Context context2 = context;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{context2, str2}, null, f70691a, true, 80714, new Class[]{Context.class, String.class}, i.class)) {
            return a(context2, str2, "");
        }
        return (i) PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f70691a, true, 80714, new Class[]{Context.class, String.class}, i.class);
    }

    public static i<Bundle> b(Context context, @NonNull String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f70691a, true, 80718, new Class[]{Context.class, String.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f70691a, true, 80718, new Class[]{Context.class, String.class}, i.class);
        }
        j jVar = new j();
        d b2 = d.b(context2, context.getResources().getString(C0906R.string.f4484cat));
        b2.setIndeterminate(false);
        i.a((Callable<TResult>) new cl<TResult>(context2, str2, b2, jVar));
        return jVar.f1091a;
    }

    static final /* synthetic */ Void a(@NonNull String str, j jVar) throws Exception {
        try {
            com.ss.android.ugc.aweme.shortvideo.c a2 = com.ss.android.ugc.aweme.port.in.a.f61122e.a(str, 0, false);
            ej.a().a(a2);
            String challenge2str = RecordScene.challenge2str(a2);
            if (PatchProxy.isSupport(new Object[]{challenge2str}, null, com.ss.android.ugc.aweme.shortvideo.d.a.f66731a, true, 75272, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{challenge2str}, null, com.ss.android.ugc.aweme.shortvideo.d.a.f66731a, true, 75272, new Class[]{String.class}, Void.TYPE);
            } else {
                SharedPreferences.Editor edit = com.ss.android.ugc.aweme.q.c.a(com.ss.android.ugc.aweme.port.in.a.f61119b, "publish", 0).edit();
                edit.putString("challenge", challenge2str);
                SharedPrefsEditorCompat.apply(edit);
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable("challenge", a2);
            jVar.a(bundle);
        } catch (Exception e2) {
            jVar.a(e2);
        }
        return null;
    }

    @NonNull
    public static i<Bundle> a(Context context, @NonNull String str, String str2) {
        Context context2 = context;
        String str3 = str;
        final String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4}, null, f70691a, true, 80715, new Class[]{Context.class, String.class, String.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{context2, str3, str4}, null, f70691a, true, 80715, new Class[]{Context.class, String.class, String.class}, i.class);
        }
        final j jVar = new j();
        EffectPlatform effectPlatform = new EffectPlatform(context2, com.ss.android.ugc.aweme.port.in.a.h.c(), com.ss.android.ugc.aweme.port.in.a.D.getOKHttpClient());
        final ArrayList arrayList = new ArrayList();
        for (String str5 : str3.split(",")) {
            if (!arrayList.contains(str5)) {
                arrayList.add(str5);
            }
        }
        if (Lists.isEmpty(arrayList)) {
            jVar.a(new Bundle());
            return jVar.f1091a;
        }
        effectPlatform.a((String) arrayList.get(0), (String) null, (com.ss.android.ugc.effectmanager.effect.b.i) new com.ss.android.ugc.effectmanager.effect.b.i() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70711a;

            public final void b(Effect effect) {
            }

            public final void a(Effect effect) {
                if (PatchProxy.isSupport(new Object[]{effect}, this, f70711a, false, 80740, new Class[]{Effect.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{effect}, this, f70711a, false, 80740, new Class[]{Effect.class}, Void.TYPE);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("reuse_sticker_ids", arrayList);
                bundle.putParcelable("first_sticker", effect);
                bundle.putString("event_shoot_event_track", str4);
                jVar.a(bundle);
            }

            public final void a(Effect effect, com.ss.android.ugc.effectmanager.common.e.c cVar) {
                com.ss.android.ugc.effectmanager.common.e.c cVar2 = cVar;
                if (PatchProxy.isSupport(new Object[]{effect, cVar2}, this, f70711a, false, 80741, new Class[]{Effect.class, com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{effect, cVar2}, this, f70711a, false, 80741, new Class[]{Effect.class, com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE);
                    return;
                }
                jVar.a(cVar2.f77317c);
            }
        });
        return jVar.f1091a;
    }
}
