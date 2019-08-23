package com.ss.android.ugc.aweme.shortvideo.util;

import a.i;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.common.utility.Lists;
import com.facebook.common.internal.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.camera.g;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.services.story.IStoryRecordService;
import com.ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.ss.android.ugc.aweme.shortvideo.e;
import com.ss.android.ugc.aweme.shortvideo.ej;
import com.ss.android.ugc.aweme.shortvideo.er;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.shortvideo.hm;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71123a;

    /* renamed from: b  reason: collision with root package name */
    private static long f71124b;

    public static void a(@NonNull Context context, @NonNull Intent intent, boolean z, boolean z2, boolean z3) {
        Context context2 = context;
        Intent intent2 = intent;
        boolean z4 = z;
        boolean z5 = z2;
        if (PatchProxy.isSupport(new Object[]{context2, intent2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, null, f71123a, true, 80844, new Class[]{Context.class, Intent.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {context2, intent2, Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f71123a, true, 80844, new Class[]{Context.class, Intent.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        ai.a("notifyToolPermissionActivity,try to restart VideoRecordNewActivity,recreateSupport" + z4 + ",clearOld:" + z5);
        intent2.putExtra("recreate_record_activity_support", z4);
        intent2.putExtra("recreate_record_and_clear", z5);
        if (z5 && a.M.a(a.C0682a.OpenCameraFrameOptimize)) {
            ai.b(k.c(new Exception(" clearOld = true")));
        }
        intent2.putExtra("navigate_back_to_main", z3);
        if (ej.a().a(context2)) {
            if (!com.ss.android.ugc.aweme.port.in.a.a() || !z4 || !VideoRecordPermissionActivity.a(context)) {
                intent2.setClass(context2, VideoRecordPermissionActivity.class);
            } else {
                intent2.setClass(context2, VideoRecordNewActivity.class);
                if (z5 && VideoRecordPermissionActivity.a(context, intent)) {
                    return;
                }
            }
            context.startActivity(intent);
        }
    }

    public static void a(Context context, Intent intent) {
        Context context2 = context;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{context2, intent2}, null, f71123a, true, 80842, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, intent2}, null, f71123a, true, 80842, new Class[]{Context.class, Intent.class}, Void.TYPE);
        } else if (intent2 != null && context2 != null) {
            if (context2 instanceof Activity) {
                a((Activity) context2, intent2);
                return;
            }
            aa.a().a(context2);
            intent2.setClass(context2, VideoRecordPermissionActivity.class);
            context.startActivity(intent);
        }
    }

    public static void a(Activity activity, Intent intent) {
        final Activity activity2 = activity;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{activity2, intent2}, null, f71123a, true, 80841, new Class[]{Activity.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, intent2}, null, f71123a, true, 80841, new Class[]{Activity.class, Intent.class}, Void.TYPE);
        } else if (intent2 != null && activity2 != null) {
            intent2.putExtra("extra_start_record_time", System.currentTimeMillis());
            aa.a().a(activity2);
            intent2.putExtra("extra_av_navigation_bar_height", fc.d(activity));
            if (!VideoRecordPermissionActivity.a((Context) activity) || er.a()) {
                intent2.setClass(activity2, VideoRecordPermissionActivity.class);
                activity.startActivity(intent);
                return;
            }
            b.a().b();
            b.a().c();
            boolean booleanExtra = intent2.getBooleanExtra("enter_record_directly_from_system", false);
            boolean booleanExtra2 = intent2.getBooleanExtra("recreate_record_activity_support", false);
            if (!booleanExtra) {
                if (!VideoRecordPermissionActivity.b(intent) || !com.ss.android.ugc.aweme.port.in.a.a()) {
                    IStoryRecordService iStoryRecordService = (IStoryRecordService) ServiceManager.get().getService(IStoryRecordService.class);
                    if ((!VideoRecordPermissionActivity.a(intent) && !VideoRecordPermissionActivity.b(intent) && com.ss.android.ugc.aweme.port.in.a.a() && !booleanExtra2) || (iStoryRecordService != null && iStoryRecordService.isStoryRecording())) {
                        n.a("record", com.ss.android.ugc.aweme.app.d.c.a().a("event", "isRecording").a("user_info", com.ss.android.ugc.aweme.port.in.a.b()).b());
                        com.bytedance.ies.dmt.ui.d.a.b(activity.getApplicationContext(), (int) C0906R.string.ah7).a();
                    } else if (!ej.a().a((Context) activity2)) {
                        n.a("record", com.ss.android.ugc.aweme.app.d.c.a().a("event", "isPublishing").b());
                    } else {
                        if (!dmt.av.video.b.n.a() && !g.b().j) {
                            j.a(g.b(), activity.getApplicationContext());
                        }
                        try {
                            f71124b = Long.valueOf(intent2.getStringExtra("star_atlas_id")).longValue();
                        } catch (Exception unused) {
                        }
                        r.a("av_memory_log", (Map) d.a().a("creation_id", intent2.getStringExtra("creation_id")).a("enter_from", intent2.getStringExtra("enter_from")).a("dalvikPss", aa.a().g).a("nativePss", aa.a().h).a("otherPss", aa.a().j).a("totalPss", aa.a().i).f34114b);
                        if (PatchProxy.isSupport(new Object[]{activity2, intent2}, null, f71123a, true, 80845, new Class[]{Activity.class, Intent.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{activity2, intent2}, null, f71123a, true, 80845, new Class[]{Activity.class, Intent.class}, Void.TYPE);
                            return;
                        }
                        b.a().c();
                        com.ss.android.b.a.a.a.a(d.f71128b);
                        com.ss.android.ugc.aweme.port.in.a.a(new hm().a());
                        if (PatchProxy.isSupport(new Object[]{activity2, intent2}, null, f71123a, true, 80846, new Class[]{Activity.class, Intent.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{activity2, intent2}, null, f71123a, true, 80846, new Class[]{Activity.class, Intent.class}, Void.TYPE);
                        } else {
                            String stringExtra = intent2.getStringExtra("first_face_sticker");
                            String stringExtra2 = intent2.getStringExtra("music_reuse_sticker_id");
                            String stringExtra3 = intent2.getStringExtra("challenge_id");
                            String stringExtra4 = intent2.getStringExtra("music_id");
                            String stringExtra5 = intent2.getStringExtra("direct_use_sticker_music");
                            String stringExtra6 = intent2.getStringExtra("poi_struct_in_tools_line");
                            if (!TextUtils.isEmpty(stringExtra6)) {
                                com.ss.android.ugc.aweme.shortvideo.d.a.b(stringExtra6);
                            }
                            ArrayList arrayList = new ArrayList();
                            AnonymousClass1 r8 = new a.g<Bundle, i<Bundle>>() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f71125a;

                                /* access modifiers changed from: private */
                                /* renamed from: a */
                                public i<Bundle> then(i<Bundle> iVar) throws Exception {
                                    if (PatchProxy.isSupport(new Object[]{iVar}, this, f71125a, false, 80850, new Class[]{i.class}, i.class)) {
                                        return (i) PatchProxy.accessDispatch(new Object[]{iVar}, this, f71125a, false, 80850, new Class[]{i.class}, i.class);
                                    } else if (!iVar.c() && !iVar.d()) {
                                        return i.a(iVar.e());
                                    } else {
                                        if (iVar.d() && iVar.f() != null) {
                                            com.bytedance.ies.dmt.ui.d.a.b((Context) activity2, iVar.f().getMessage()).a();
                                        }
                                        return i.a(new Bundle());
                                    }
                                }
                            };
                            if (!TextUtils.isEmpty(stringExtra)) {
                                arrayList.add(VideoRecordPermissionActivity.a(activity2, stringExtra, "cold_start").b((a.g<TResult, i<TContinuationResult>>) r8));
                            }
                            if (!TextUtils.isEmpty(stringExtra2)) {
                                arrayList.add(VideoRecordPermissionActivity.a((Context) activity2, stringExtra2).b((a.g<TResult, i<TContinuationResult>>) r8));
                            }
                            if (!TextUtils.isEmpty(stringExtra3)) {
                                arrayList.add(VideoRecordPermissionActivity.a(stringExtra3).b((a.g<TResult, i<TContinuationResult>>) r8));
                            }
                            if (!TextUtils.isEmpty(stringExtra4)) {
                                arrayList.add(VideoRecordPermissionActivity.b(activity2, stringExtra4).b((a.g<TResult, i<TContinuationResult>>) r8));
                            }
                            if (!TextUtils.isEmpty(stringExtra5)) {
                                arrayList.add(VideoRecordPermissionActivity.b(activity2, stringExtra5).b((a.g<TResult, i<TContinuationResult>>) r8));
                            }
                            if (Lists.isEmpty(arrayList)) {
                                a(activity2, intent2, null);
                            } else {
                                i.a((Collection<? extends i<TResult>>) arrayList).a((a.g<TResult, TContinuationResult>) new e<TResult,TContinuationResult>(activity2, intent2), i.f1052b);
                            }
                        }
                        if (com.ss.android.ugc.aweme.port.in.a.h.d()) {
                            com.ss.android.ugc.aweme.port.in.a.h.b(activity.getApplicationContext());
                        }
                    }
                }
            }
        }
    }

    static void a(Activity activity, Intent intent, List<Bundle> list) {
        Activity activity2 = activity;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{activity2, intent2, list}, null, f71123a, true, 80847, new Class[]{Activity.class, Intent.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, intent2, list}, null, f71123a, true, 80847, new Class[]{Activity.class, Intent.class, List.class}, Void.TYPE);
            return;
        }
        Intent intent3 = new Intent(activity2, VideoRecordNewActivity.class);
        boolean booleanExtra = intent2.getBooleanExtra("show_no_splash_ad", false);
        boolean booleanExtra2 = intent2.getBooleanExtra("sticker_pannel_show", false);
        boolean booleanExtra3 = intent2.getBooleanExtra("enter_record_from_other_platform", false);
        String str = null;
        if (booleanExtra3) {
            ej.a().a((e) null);
            ej.a().c();
        }
        if (booleanExtra) {
            com.ss.android.ugc.aweme.port.in.a.f61121d.a(true);
        }
        intent3.putExtra("sticker_pannel_show", booleanExtra2);
        intent3.putExtra("enter_record_from_other_platform", booleanExtra3);
        if (list != null) {
            for (Bundle putExtras : list) {
                intent3.putExtras(putExtras);
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            intent3.putExtras(extras);
        }
        if (!TextUtils.isEmpty(intent2.getStringExtra("micro_app_class"))) {
            intent3.putExtra("micro_app_class", intent2.getStringExtra("micro_app_class"));
        }
        if (intent3.getExtras() != null) {
            str = intent3.getExtras().getString("creation_id");
        }
        if (TextUtils.isEmpty(str)) {
            intent3.putExtra("creation_id", UUID.randomUUID().toString());
        }
        if (f71124b != 0) {
            intent3.putExtra("star_atlas_id", f71124b);
        }
        if (com.ss.android.g.a.a()) {
            TTUploaderService.a();
        }
        activity2.startActivity(intent3);
    }

    public static void a(@NonNull Activity activity, @NonNull Intent intent, boolean z, boolean z2, boolean z3) {
        Activity activity2 = activity;
        Intent intent2 = intent;
        boolean z4 = z;
        boolean z5 = z2;
        if (PatchProxy.isSupport(new Object[]{activity2, intent2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, null, f71123a, true, 80843, new Class[]{Activity.class, Intent.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {activity2, intent2, Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f71123a, true, 80843, new Class[]{Activity.class, Intent.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        ai.a("startToolPermissionActivity,try to restart VideoRecordNewActivity,recreateSupport" + z4 + ",clearOld:" + z5);
        intent2.putExtra("recreate_record_activity_support", z4);
        intent2.putExtra("recreate_record_and_clear", z5);
        if (z5 && com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.OpenCameraFrameOptimize)) {
            ai.b(k.c(new Exception(" clearOld = true")));
        }
        intent2.putExtra("navigate_back_to_main", z3);
        if (ej.a().a((Context) activity2)) {
            if (!com.ss.android.ugc.aweme.port.in.a.a() || !z4 || !VideoRecordPermissionActivity.a((Context) activity)) {
                intent2.setClass(activity2, VideoRecordPermissionActivity.class);
            } else {
                intent2.setClass(activity2, VideoRecordNewActivity.class);
                if (z5 && VideoRecordPermissionActivity.a((Context) activity, intent)) {
                    return;
                }
            }
            a(activity, intent);
        }
    }
}
