package com.ss.android.ugc.aweme.story.shootvideo.services;

import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.draft.a.c;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.port.in.k;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.story.api.IAVStoryService;
import com.ss.android.ugc.aweme.story.api.j;
import com.ss.android.ugc.aweme.story.shootvideo.publish.h;
import com.ss.android.ugc.aweme.story.shootvideo.record.j;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
public class AVStoryServiceImpl implements IAVStoryService {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void updateStoryActivityRemainTime() {
    }

    public MutableLiveData<j> getPublishState() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85989, new Class[0], MutableLiveData.class)) {
            return com.ss.android.ugc.aweme.story.shootvideo.publish.upload.j.a().f73749c;
        }
        return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85989, new Class[0], MutableLiveData.class);
    }

    public boolean isStoryRecording() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85988, new Class[0], Boolean.TYPE)) {
            return ((IAVService) ServiceManager.get().getService(IAVService.class)).storyRecordService().isStoryRecording();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85988, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void reset() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85990, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85990, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.story.shootvideo.publish.upload.j a2 = com.ss.android.ugc.aweme.story.shootvideo.publish.upload.j.a();
        if (PatchProxy.isSupport(new Object[0], a2, com.ss.android.ugc.aweme.story.shootvideo.publish.upload.j.f73747a, false, 85490, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, com.ss.android.ugc.aweme.story.shootvideo.publish.upload.j.f73747a, false, 85490, new Class[0], Void.TYPE);
            return;
        }
        if (a2.f73750d != null && a2.f73750d.size() > 0) {
            for (String next : a2.f73750d.keySet()) {
                a2.a(next, a2.f73750d.get(next));
            }
            a2.f73750d.clear();
            a2.f73751e.f71843e = 5;
            a2.b();
        }
    }

    public boolean isStoryPublishing(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 85987, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 85987, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (!((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().isPublishServiceRunning(context2) || !com.ss.android.ugc.aweme.story.shootvideo.publish.upload.j.a().c()) {
            return false;
        } else {
            return true;
        }
    }

    public void updatePublishStartTime(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 85991, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 85991, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.story.shootvideo.publish.upload.j.a().f73751e.f71840b = j2;
    }

    public void cancelPublish(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 85986, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 85986, new Class[]{String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.story.shootvideo.publish.upload.j a2 = com.ss.android.ugc.aweme.story.shootvideo.publish.upload.j.a();
        if (PatchProxy.isSupport(new Object[]{str2}, a2, com.ss.android.ugc.aweme.story.shootvideo.publish.upload.j.f73747a, false, 85487, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, a2, com.ss.android.ugc.aweme.story.shootvideo.publish.upload.j.f73747a, false, 85487, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!(str2 == null || a2.f73750d == null || a2.f73750d.get(str2) == null)) {
            a2.f73750d.remove(str2);
            a2.a(str2, a2.f73750d.get(str2));
        }
        a2.f73751e.f71843e = 5;
        a2.b();
    }

    private void publishFromDraft(@NonNull FragmentActivity fragmentActivity, @NonNull c cVar) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, cVar2}, this, changeQuickRedirect, false, 85985, new Class[]{FragmentActivity.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity2, cVar2}, this, changeQuickRedirect, false, 85985, new Class[]{FragmentActivity.class, c.class}, Void.TYPE);
            return;
        }
        publishAgain(fragmentActivity2, ((IAVService) ServiceManager.get().getService(IAVService.class)).videoModelCoverService().convertFromDraft(cVar2));
    }

    private void publishAgain(@NonNull FragmentActivity fragmentActivity, @NonNull Object obj) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, obj2}, this, changeQuickRedirect, false, 85984, new Class[]{FragmentActivity.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity2, obj2}, this, changeQuickRedirect, false, 85984, new Class[]{FragmentActivity.class, Object.class}, Void.TYPE);
        } else if (obj2 != null && ((IAVService) ServiceManager.get().getService(IAVService.class)).videoModelCoverService().instanceOfVideoPublishEditModel(obj2)) {
            Bundle a2 = h.a(obj);
            a2.putBoolean("publish_retry", true);
            Intent intent = new Intent();
            intent.putExtras(a2);
            ((IAVStoryService) ServiceManager.get().getService(IAVStoryService.class)).processPublish(fragmentActivity2, intent);
        } else if (a.a()) {
            throw new IllegalStateException("republish failed " + obj2);
        }
    }

    public boolean processPublish(@NotNull FragmentActivity fragmentActivity, @NotNull Intent intent) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, intent2}, this, changeQuickRedirect, false, 85982, new Class[]{FragmentActivity.class, Intent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{fragmentActivity2, intent2}, this, changeQuickRedirect, false, 85982, new Class[]{FragmentActivity.class, Intent.class}, Boolean.TYPE)).booleanValue();
        }
        com.ss.android.ugc.aweme.util.c.a("processPublish story");
        if (!intent2.hasExtra("story_args")) {
            return false;
        }
        Intent intent3 = new Intent(fragmentActivity2, ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().getShortVideoPublishServiceClass());
        intent3.putExtras(intent2);
        try {
            fragmentActivity2.startService(intent3);
            return true;
        } catch (SecurityException e2) {
            SecurityException securityException = e2;
            com.ss.android.ugc.aweme.util.c.a("PublishServiceImpl.processPublish() startService error " + securityException.toString());
            return false;
        }
    }

    public void startPublish(@NotNull FragmentActivity fragmentActivity, @NotNull Bundle bundle) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, bundle2}, this, changeQuickRedirect, false, 85981, new Class[]{FragmentActivity.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity2, bundle2}, this, changeQuickRedirect, false, 85981, new Class[]{FragmentActivity.class, Bundle.class}, Void.TYPE);
        } else if (bundle2.getBoolean("back_to_main_after_publish", true)) {
            Intent intent = new Intent(fragmentActivity2, ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getApplicationService().b());
            intent.addFlags(67108864);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_STORY_PUBLISH", true);
            intent.putExtras(bundle2);
            fragmentActivity2.startActivity(intent);
            fragmentActivity2.overridePendingTransition(0, 0);
        } else {
            Intent intent2 = new Intent();
            intent2.putExtras(bundle2);
            processPublish(fragmentActivity2, intent2);
        }
    }

    public void launchRecord(@NonNull Context context, @NonNull Intent intent) {
        boolean z;
        Context context2 = context;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{context2, intent2}, this, changeQuickRedirect, false, 85980, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, intent2}, this, changeQuickRedirect, false, 85980, new Class[]{Context.class, Intent.class}, Void.TYPE);
            return;
        }
        if (!intent2.hasExtra("creation_id")) {
            intent2.putExtra("creation_id", UUID.randomUUID().toString());
        }
        if (intent2.getIntExtra("extra_launch_type", 2) != 2 || !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(context2)) {
            com.ss.android.ugc.aweme.story.shootvideo.record.j jVar = com.ss.android.ugc.aweme.story.shootvideo.record.j.f73940c;
            if (PatchProxy.isSupport(new Object[]{context2, intent2}, jVar, com.ss.android.ugc.aweme.story.shootvideo.record.j.f73938a, false, 85675, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
                Object[] objArr = {context2, intent2};
                Object[] objArr2 = objArr;
                com.ss.android.ugc.aweme.story.shootvideo.record.j jVar2 = jVar;
                ChangeQuickRedirect changeQuickRedirect2 = com.ss.android.ugc.aweme.story.shootvideo.record.j.f73938a;
                PatchProxy.accessDispatch(objArr2, jVar2, changeQuickRedirect2, false, 85675, new Class[]{Context.class, Intent.class}, Void.TYPE);
                return;
            }
            Function1 cVar = new j.c(com.ss.android.ugc.aweme.story.shootvideo.record.j.f73940c);
            if (PatchProxy.isSupport(new Object[]{context2, intent2, cVar}, jVar, com.ss.android.ugc.aweme.story.shootvideo.record.j.f73938a, false, 85674, new Class[]{Context.class, Intent.class, Function1.class}, Void.TYPE)) {
                Object[] objArr3 = {context2, intent2, cVar};
                Object[] objArr4 = objArr3;
                com.ss.android.ugc.aweme.story.shootvideo.record.j jVar3 = jVar;
                ChangeQuickRedirect changeQuickRedirect3 = com.ss.android.ugc.aweme.story.shootvideo.record.j.f73938a;
                PatchProxy.accessDispatch(objArr4, jVar3, changeQuickRedirect3, false, 85674, new Class[]{Context.class, Intent.class, Function1.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(context2, "context");
            Intrinsics.checkParameterIsNotNull(intent2, "intent");
            Intrinsics.checkParameterIsNotNull(cVar, "launch");
            com.ss.android.ugc.aweme.story.shootvideo.record.j.f73939b = intent2;
            if (jVar.a(context2)) {
                Function1 aVar = new j.a(com.ss.android.ugc.aweme.story.shootvideo.record.j.f73940c);
                if (PatchProxy.isSupport(new Object[]{context2, cVar, aVar}, jVar, com.ss.android.ugc.aweme.story.shootvideo.record.j.f73938a, false, 85677, new Class[]{Context.class, Function1.class, Function1.class}, Boolean.TYPE)) {
                    Object[] objArr5 = {context2, cVar, aVar};
                    Object[] objArr6 = objArr5;
                    com.ss.android.ugc.aweme.story.shootvideo.record.j jVar4 = jVar;
                    ChangeQuickRedirect changeQuickRedirect4 = com.ss.android.ugc.aweme.story.shootvideo.record.j.f73938a;
                    ((Boolean) PatchProxy.accessDispatch(objArr6, jVar4, changeQuickRedirect4, false, 85677, new Class[]{Context.class, Function1.class, Function1.class}, Boolean.TYPE)).booleanValue();
                } else {
                    Intrinsics.checkParameterIsNotNull(context2, "context");
                    Intrinsics.checkParameterIsNotNull(cVar, "onPermissionAllowed");
                    Intrinsics.checkParameterIsNotNull(aVar, "onPermissionDenied");
                    if (PatchProxy.isSupport(new Object[]{context2}, jVar, com.ss.android.ugc.aweme.story.shootvideo.record.j.f73938a, false, 85680, new Class[]{Context.class}, Boolean.TYPE)) {
                        com.ss.android.ugc.aweme.story.shootvideo.record.j jVar5 = jVar;
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, jVar5, com.ss.android.ugc.aweme.story.shootvideo.record.j.f73938a, false, 85680, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
                    } else {
                        k kVar = com.ss.android.ugc.aweme.port.in.a.H;
                        Intrinsics.checkExpressionValueIsNotNull(kVar, "AVEnv.sAPI");
                        int b2 = kVar.E().b(context2);
                        k kVar2 = com.ss.android.ugc.aweme.port.in.a.H;
                        Intrinsics.checkExpressionValueIsNotNull(kVar2, "AVEnv.sAPI");
                        int a2 = kVar2.E().a(context2);
                        k kVar3 = com.ss.android.ugc.aweme.port.in.a.H;
                        Intrinsics.checkExpressionValueIsNotNull(kVar3, "AVEnv.sAPI");
                        int c2 = kVar3.E().c(context2);
                        if (b2 == 0 && a2 == 0 && c2 == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        jVar.a(context2, cVar);
                    } else {
                        k kVar4 = com.ss.android.ugc.aweme.port.in.a.H;
                        Intrinsics.checkExpressionValueIsNotNull(kVar4, "AVEnv.sAPI");
                        kVar4.E().a((AppCompatActivity) context2, new j.b(context2, cVar, aVar), "android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE");
                    }
                }
            }
            return;
        }
        ((IAVService) ServiceManager.get().getService(IAVService.class)).turnStoryRecordPage(intent2);
    }

    public void rePublishStory(@NotNull FragmentActivity fragmentActivity, @NotNull String str, @NotNull com.ss.android.ugc.aweme.story.api.a<Object> aVar) {
        Object obj;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        String str2 = str;
        com.ss.android.ugc.aweme.story.api.a<Object> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, str2, aVar2}, this, changeQuickRedirect, false, 85983, new Class[]{FragmentActivity.class, String.class, com.ss.android.ugc.aweme.story.api.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity2, str2, aVar2}, this, changeQuickRedirect, false, 85983, new Class[]{FragmentActivity.class, String.class, com.ss.android.ugc.aweme.story.api.a.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.story.shootvideo.publish.upload.j a2 = com.ss.android.ugc.aweme.story.shootvideo.publish.upload.j.a();
        if (PatchProxy.isSupport(new Object[]{str2}, a2, com.ss.android.ugc.aweme.story.shootvideo.publish.upload.j.f73747a, false, 85486, new Class[]{String.class}, Object.class)) {
            com.ss.android.ugc.aweme.story.shootvideo.publish.upload.j jVar = a2;
            obj = PatchProxy.accessDispatch(new Object[]{str2}, jVar, com.ss.android.ugc.aweme.story.shootvideo.publish.upload.j.f73747a, false, 85486, new Class[]{String.class}, Object.class);
        } else {
            obj = a2.f73750d.get(str2);
        }
        if (obj != null) {
            aVar2.a(null);
            publishAgain(fragmentActivity2, obj);
            return;
        }
        aVar2.a("no publish task which path is " + str2);
    }
}
