package com.ss.android.ugc.aweme.services.video;

import a.g;
import a.i;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.d.a;
import com.ss.android.ugc.aweme.shortvideo.e;
import com.ss.android.ugc.aweme.shortvideo.ej;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.story.shootvideo.friends.a.j;
import com.ss.android.ugc.aweme.video.b;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

public class AVPublishServiceImpl implements IAVPublishService {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void cancelRestoreOnMain() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71601, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71601, new Class[0], Void.TYPE);
            return;
        }
        ej.a().g = false;
        ej.a().a(a.b());
        a.a();
    }

    public List<c> getChallenges() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71609, new Class[0], List.class)) {
            return ej.a().f67529b;
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71609, new Class[0], List.class);
    }

    public e getCurMusic() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71608, new Class[0], e.class)) {
            return ej.a().b();
        }
        return (e) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71608, new Class[0], e.class);
    }

    public int getMusicChooseType() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71606, new Class[0], Integer.TYPE)) {
            return ej.a().f67532e;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71606, new Class[0], Integer.TYPE)).intValue();
    }

    public String getShootWay() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71605, new Class[0], String.class)) {
            return ej.a().f67531d;
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71605, new Class[0], String.class);
    }

    public boolean isPublishing() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71612, new Class[0], Boolean.TYPE)) {
            return ej.a().d();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71612, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean isUnKnown() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71614, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71614, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (ej.a().f67530c == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean needRestore() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71611, new Class[0], Boolean.TYPE)) {
            return ej.a().g;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71611, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void removeChallenges() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71602, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71602, new Class[0], Void.TYPE);
            return;
        }
        ej.a().c();
    }

    public boolean isPublishFinished() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71613, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71613, new Class[0], Boolean.TYPE)).booleanValue();
        }
        ej a2 = ej.a();
        if (a2.f67530c == 10 || a2.f67530c == 9 || a2.f67530c == 11 || a2.f67530c == 12) {
            return true;
        }
        return false;
    }

    static final /* synthetic */ Boolean lambda$tryRestorePublish$0$AVPublishServiceImpl() throws Exception {
        ej a2 = ej.a();
        if (PatchProxy.isSupport(new Object[0], a2, ej.f67528a, false, 74431, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, ej.f67528a, false, 74431, new Class[0], Void.TYPE);
        } else {
            RecordScene b2 = a.b();
            a2.g = false;
            if (b2 != null && !b2.isSegmentsNotValid()) {
                if (b2.isDuetMode()) {
                    b.c(b2.duetVideoPath);
                    b.c(b2.duetAudioPath);
                    a2.a(b2);
                    a.a();
                } else if (b2.recordMode == 1) {
                    b.c(b2.mp4Path);
                    b.c(b2.musicPath);
                    a2.a(b2);
                    a.a();
                } else if (b2.isReactionMode()) {
                    b.c(b2.reactionParams.videoPath);
                    b.c(b2.reactionParams.wavPath);
                    a2.a(b2);
                    a.a();
                } else if (TextUtils.isEmpty(b2.mp4Path)) {
                    a2.g = true;
                }
            }
        }
        return Boolean.valueOf(ej.a().g);
    }

    public void addChallenge(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, changeQuickRedirect, false, 71610, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, changeQuickRedirect, false, 71610, new Class[]{c.class}, Void.TYPE);
            return;
        }
        ej.a().a(cVar2);
    }

    public void setCurMusic(e eVar) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, changeQuickRedirect, false, 71603, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, changeQuickRedirect, false, 71603, new Class[]{e.class}, Void.TYPE);
            return;
        }
        ej.a().a(eVar2);
    }

    public void setMusicChooseType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71607, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71607, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        ej.a().f67532e = i;
    }

    public void setPublishStatus(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71604, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71604, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        ej.a().a(i);
    }

    public com.ss.android.ugc.aweme.story.shootvideo.friends.a.a queryKnowFriends(int i, int i2) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 71615, new Class[]{Integer.TYPE, Integer.TYPE}, com.ss.android.ugc.aweme.story.shootvideo.friends.a.a.class)) {
            return j.a(i, i2);
        }
        return (com.ss.android.ugc.aweme.story.shootvideo.friends.a.a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 71615, new Class[]{Integer.TYPE, Integer.TYPE}, com.ss.android.ugc.aweme.story.shootvideo.friends.a.a.class);
    }

    public void tryRestorePublish(@NotNull FragmentActivity fragmentActivity, @NotNull Function1<Boolean, Void> function1) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        Function1<Boolean, Void> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, function12}, this, changeQuickRedirect, false, 71600, new Class[]{FragmentActivity.class, Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity2, function12}, this, changeQuickRedirect, false, 71600, new Class[]{FragmentActivity.class, Function1.class}, Void.TYPE);
            return;
        }
        if (!isPublishing()) {
            if (((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().isPublishServiceRunning(fragmentActivity2)) {
                com.ss.android.ugc.aweme.util.c.a("continue publish");
                ai.d("PublishServiceImpl continue publish");
                fragmentActivity2.bindService(new Intent(fragmentActivity2, ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().getShortVideoPublishServiceClass()), com.ss.android.ugc.aweme.port.in.a.f61121d.a(fragmentActivity2), 1);
                return;
            }
            i.a(AVPublishServiceImpl$$Lambda$0.$instance).a((g<TResult, TContinuationResult>) new AVPublishServiceImpl$$Lambda$1<TResult,TContinuationResult>(function12), i.f1052b);
        }
    }
}
