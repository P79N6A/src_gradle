package com.ss.android.ugc.aweme.services.publish;

import android.app.ActivityManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.common.g.a;
import com.ss.android.ugc.aweme.draft.a.c;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.port.internal.m;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.publish.IPublishService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoPublishService;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.edit.cc;
import com.ss.android.ugc.aweme.shortvideo.ej;
import com.ss.android.ugc.aweme.shortvideo.ff;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import java.util.List;

public class PublishServiceImpl implements IPublishService {
    public static ChangeQuickRedirect changeQuickRedirect;

    public Class<? extends Service> getShortVideoPublishServiceClass() {
        return ShortVideoPublishService.class;
    }

    public boolean isVideoPublishPreviewActivity(Context context) {
        return context instanceof VEVideoPublishPreviewActivity;
    }

    public void cancelSynthetise(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 71558, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 71558, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (isPublishServiceRunning(context)) {
            ai.d("PublishServiceImpl cancelSynthetise");
            context2.stopService(new Intent(context2, getShortVideoPublishServiceClass()));
        }
    }

    public boolean checkIsAlreadyPublished(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 71553, new Class[]{Context.class}, Boolean.TYPE)) {
            return ej.a().a(context2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 71553, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
    }

    public boolean isPublishServiceRunning(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 71551, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 71551, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        return isMyServiceRunning(context2, getShortVideoPublishServiceClass());
    }

    public void setUploadRecoverPath(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 71555, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 71555, new Class[]{String.class}, Void.TYPE);
            return;
        }
        ((m) a.a(com.ss.android.ugc.aweme.port.in.a.f61119b, m.class)).a(str2);
    }

    public boolean inPublishPage(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 71554, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 71554, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        ej a2 = ej.a();
        if (PatchProxy.isSupport(new Object[]{context2}, a2, ej.f67528a, false, 74434, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, a2, ej.f67528a, false, 74434, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        if (!a2.d() || !iAVService.getPublishService().isPublishServiceRunning(context2)) {
            return false;
        }
        return true;
    }

    static final /* synthetic */ void lambda$null$0$PublishServiceImpl(c cVar, IPublishService.OnGetRecoverDraftCallback onGetRecoverDraftCallback) {
        if (cVar != null) {
            onGetRecoverDraftCallback.onSuccess(cVar);
        } else {
            onGetRecoverDraftCallback.onFail();
        }
    }

    public void getRecoverDraftIfHave(Context context, IPublishService.OnGetRecoverDraftCallback onGetRecoverDraftCallback) {
        Context context2 = context;
        IPublishService.OnGetRecoverDraftCallback onGetRecoverDraftCallback2 = onGetRecoverDraftCallback;
        if (PatchProxy.isSupport(new Object[]{context2, onGetRecoverDraftCallback2}, this, changeQuickRedirect, false, 71557, new Class[]{Context.class, IPublishService.OnGetRecoverDraftCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, onGetRecoverDraftCallback2}, this, changeQuickRedirect, false, 71557, new Class[]{Context.class, IPublishService.OnGetRecoverDraftCallback.class}, Void.TYPE);
            return;
        }
        String b2 = ((m) a.a(context2, m.class)).b();
        if (TextUtils.isEmpty(b2)) {
            onGetRecoverDraftCallback.onFail();
        } else {
            com.ss.android.ugc.aweme.tools.a.a().execute(new PublishServiceImpl$$Lambda$0(b2, onGetRecoverDraftCallback2));
        }
    }

    public boolean processPublish(@NonNull FragmentActivity fragmentActivity, @NonNull Intent intent) {
        if (PatchProxy.isSupport(new Object[]{fragmentActivity, intent}, this, changeQuickRedirect, false, 71550, new Class[]{FragmentActivity.class, Intent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{fragmentActivity, intent}, this, changeQuickRedirect, false, 71550, new Class[]{FragmentActivity.class, Intent.class}, Boolean.TYPE)).booleanValue();
        }
        return com.ss.android.ugc.aweme.port.in.a.t.a(fragmentActivity, intent, getShortVideoPublishServiceClass(), "extra_video_publish_args", "photo_movie_publish_args");
    }

    private boolean isMyServiceRunning(Context context, Class<?> cls) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, cls}, this, changeQuickRedirect, false, 71552, new Class[]{Context.class, Class.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, cls}, this, changeQuickRedirect, false, 71552, new Class[]{Context.class, Class.class}, Boolean.TYPE)).booleanValue();
        } else if (context2 == null) {
            return false;
        } else {
            ActivityManager activityManager = (ActivityManager) context2.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            if (activityManager == null) {
                return false;
            }
            List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(Integer.MAX_VALUE);
            if (runningServices == null) {
                return false;
            }
            for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
                if (cls.getName().equals(runningServiceInfo.service.getClassName())) {
                    return true;
                }
            }
            return false;
        }
    }

    public void publishFromDraft(@NonNull FragmentActivity fragmentActivity, @NonNull c cVar) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, cVar2}, this, changeQuickRedirect, false, 71556, new Class[]{FragmentActivity.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity2, cVar2}, this, changeQuickRedirect, false, 71556, new Class[]{FragmentActivity.class, c.class}, Void.TYPE);
            return;
        }
        Bundle bundle = new Bundle();
        if (cVar2.L == 2) {
            PhotoMovieContext photoMovieContext = cVar2.f43436d;
            if (photoMovieContext != null && cVar2.f43435c != null) {
                photoMovieContext.mOutputVideoPath = ff.b(".mp4");
                photoMovieContext.mInputAudioPath = ff.b(".wav");
                photoMovieContext.challenges = cVar2.f43435c.f43425c;
                photoMovieContext.title = cVar2.f43435c.f43423a;
                photoMovieContext.structList = cVar2.f43435c.f43424b;
                photoMovieContext.isPrivate = cVar2.y;
                photoMovieContext.poiId = cVar.z();
                photoMovieContext.mSaveModel = cVar.y();
                bundle.putInt("video_type", 0);
                bundle.putParcelable("photo_movie_publish_args", photoMovieContext);
                bundle.putString("shoot_way", photoMovieContext.mShootWay);
            } else {
                return;
            }
        } else {
            cb a2 = new cc("PublishServiceImpl").a(cVar2);
            bundle.putInt("video_type", 0);
            bundle.putSerializable("extra_video_publish_args", a2);
            bundle.putString("shoot_way", a2.mShootWay);
        }
        bundle.putBoolean("publish_retry", true);
        ((m) a.a(fragmentActivity2, m.class)).a((String) null);
        Intent intent = new Intent();
        if (com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.UploadOptimizeForPie)) {
            intent.putExtra("publish_bundle", bundle);
        } else {
            intent.putExtras(bundle);
        }
        processPublish(fragmentActivity2, intent);
    }

    public void startPublish(@NonNull FragmentActivity fragmentActivity, @NonNull Bundle bundle) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, bundle2}, this, changeQuickRedirect, false, 71549, new Class[]{FragmentActivity.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity2, bundle2}, this, changeQuickRedirect, false, 71549, new Class[]{FragmentActivity.class, Bundle.class}, Void.TYPE);
            return;
        }
        ai.d("PublishServiceImpl startPublish publish");
        if (bundle2.getBoolean("enter_record_from_other_platform", false)) {
            Intent intent = new Intent();
            if (com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.UploadOptimizeForPie)) {
                intent.putExtra("publish_bundle", bundle2);
            } else {
                intent.putExtras(bundle2);
            }
            processPublish(fragmentActivity2, intent);
            fragmentActivity2.setResult(-1, intent);
            fragmentActivity.finish();
            return;
        }
        Intent intent2 = new Intent(fragmentActivity2, com.ss.android.ugc.aweme.port.in.a.f61121d.b());
        intent2.addFlags(67108864);
        if (com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.UploadOptimizeForPie)) {
            intent2.putExtra("publish_bundle", bundle2);
        } else {
            intent2.putExtras(bundle2);
        }
        fragmentActivity2.startActivity(intent2);
    }
}
