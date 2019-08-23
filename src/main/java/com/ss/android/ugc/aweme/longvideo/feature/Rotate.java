package com.ss.android.ugc.aweme.longvideo.feature;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.longvideo.b.d;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u000278B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0018J\u000e\u0010+\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0018J\u0006\u0010,\u001a\u00020)J\u0006\u0010-\u001a\u00020.J\u000e\u0010/\u001a\u00020)2\u0006\u0010\u0012\u001a\u00020\rJ\u0010\u00100\u001a\u00020)2\b\u00101\u001a\u0004\u0018\u000102J\b\u00103\u001a\u00020)H\u0007J\b\u00104\u001a\u00020)H\u0007J\b\u00105\u001a\u00020)H\u0007J\b\u00106\u001a\u00020)H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u0019X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0018\u00010\u001dR\u00020\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001b¨\u00069"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/feature/Rotate;", "Landroid/arch/lifecycle/LifecycleObserver;", "activity", "Landroid/support/v4/app/FragmentActivity;", "rotateView", "Landroid/view/View;", "videoView", "video", "Lcom/ss/android/ugc/aweme/feed/model/Video;", "(Landroid/support/v4/app/FragmentActivity;Landroid/view/View;Landroid/view/View;Lcom/ss/android/ugc/aweme/feed/model/Video;)V", "getActivity", "()Landroid/support/v4/app/FragmentActivity;", "canAutoRotate", "", "getCanAutoRotate", "()Z", "setCanAutoRotate", "(Z)V", "isLandscape", "setLandscape", "isLandscapeVideo", "setLandscapeVideo", "observers", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/longvideo/feature/Rotate$Observer;", "Lkotlin/collections/ArrayList;", "getRotateView", "()Landroid/view/View;", "rotationObserver", "Lcom/ss/android/ugc/aweme/longvideo/feature/Rotate$RotationObserver;", "getRotationObserver", "()Lcom/ss/android/ugc/aweme/longvideo/feature/Rotate$RotationObserver;", "setRotationObserver", "(Lcom/ss/android/ugc/aweme/longvideo/feature/Rotate$RotationObserver;)V", "startRotateByOrientationChange", "getStartRotateByOrientationChange", "setStartRotateByOrientationChange", "getVideo", "()Lcom/ss/android/ugc/aweme/feed/model/Video;", "getVideoView", "attach", "", "observer", "detach", "doRotateByClick", "getRotateStatus", "", "notify", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onDestroy", "onResume", "onStop", "resetAutoRotate", "Observer", "RotationObserver", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class Rotate implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3473a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3474b = true;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<a> f3475c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f3476d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3477e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3478f;
    @Nullable
    public b g;
    @NotNull
    public final FragmentActivity h;
    @NotNull
    public final View i;
    @NotNull
    public final View j;
    @Nullable
    public final Video k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/feature/Rotate$Observer;", "", "rotateChange", "", "isLandscape", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a(boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0006\u0010\u000f\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/feature/Rotate$RotationObserver;", "Landroid/database/ContentObserver;", "handler", "Landroid/os/Handler;", "(Lcom/ss/android/ugc/aweme/longvideo/feature/Rotate;Landroid/os/Handler;)V", "mResolver", "Landroid/content/ContentResolver;", "getMResolver", "()Landroid/content/ContentResolver;", "setMResolver", "(Landroid/content/ContentResolver;)V", "onChange", "", "selfChange", "", "startObserver", "stopObserver", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public final class b extends ContentObserver {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53924a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public ContentResolver f53925b;

        public final void onChange(boolean z) {
            boolean z2 = true;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f53924a, false, 56714, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f53924a, false, 56714, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            super.onChange(z);
            Rotate rotate = Rotate.this;
            if (Rotate.this.c() != 1) {
                z2 = false;
            }
            rotate.f3477e = z2;
            Rotate.this.a();
        }

        public b(Handler handler) {
            super(handler);
            this.f53925b = Rotate.this.h.getContentResolver();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53927a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Rotate f53928b;

        c(Rotate rotate) {
            this.f53928b = rotate;
        }

        public final void run() {
            Boolean bool;
            if (PatchProxy.isSupport(new Object[0], this, f53927a, false, 56717, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53927a, false, 56717, new Class[0], Void.TYPE);
                return;
            }
            FragmentActivity fragmentActivity = this.f53928b.h;
            if (fragmentActivity != null) {
                bool = Boolean.valueOf(fragmentActivity.isFinishing());
            } else {
                bool = null;
            }
            if (!bool.booleanValue()) {
                this.f53928b.h.setRequestedOrientation(4);
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
    }

    public final int c() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f3473a, false, 56713, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3473a, false, 56713, new Class[0], Integer.TYPE)).intValue();
        }
        try {
            ContentResolver contentResolver = this.h.getContentResolver();
            if (contentResolver != null) {
                i2 = Settings.System.getInt(contentResolver, "accelerometer_rotation");
            }
        } catch (Settings.SettingNotFoundException unused) {
        }
        return i2;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3473a, false, 56706, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3473a, false, 56706, new Class[0], Void.TYPE);
        } else if (this.f3477e) {
            this.h.setRequestedOrientation(4);
        } else if (this.f3478f) {
            this.h.setRequestedOrientation(0);
        } else {
            this.h.setRequestedOrientation(1);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3473a, false, 56708, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3473a, false, 56708, new Class[0], Void.TYPE);
        } else if (!this.h.isFinishing()) {
            if (this.f3478f) {
                this.h.setRequestedOrientation(1);
            } else {
                this.h.setRequestedOrientation(0);
            }
            if (this.f3477e) {
                com.ss.android.b.a.a.a.a(new c(this), PushConstants.WORK_RECEIVER_EVENTCORE_ERROR);
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3473a, false, 56707, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3473a, false, 56707, new Class[0], Void.TYPE);
            return;
        }
        b bVar = this.g;
        if (bVar != null) {
            if (PatchProxy.isSupport(new Object[0], bVar, b.f53924a, false, 56716, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], bVar, b.f53924a, false, 56716, new Class[0], Void.TYPE);
            } else {
                ContentResolver contentResolver = bVar.f53925b;
                if (contentResolver != null) {
                    contentResolver.unregisterContentObserver(bVar);
                }
            }
        }
        this.f3475c.clear();
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3473a, false, 56711, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3473a, false, 56711, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        for (a a2 : this.f3475c) {
            a2.a(z);
        }
    }

    public Rotate(@NotNull FragmentActivity fragmentActivity, @NotNull View view, @NotNull View view2, @Nullable Video video) {
        int i2;
        int i3;
        Intrinsics.checkParameterIsNotNull(fragmentActivity, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(view, "rotateView");
        Intrinsics.checkParameterIsNotNull(view2, "videoView");
        this.h = fragmentActivity;
        this.i = view;
        this.j = view2;
        this.k = video;
        boolean z = true;
        Video video2 = this.k;
        if (video2 != null) {
            i2 = video2.getWidth();
        } else {
            i2 = 0;
        }
        Video video3 = this.k;
        if (video3 != null) {
            i3 = video3.getHeight();
        } else {
            i3 = 0;
        }
        this.f3476d = d.a.a(i2, i3);
        this.h.getLifecycle().addObserver(this);
        if (!this.f3476d) {
            this.h.setRequestedOrientation(1);
        } else {
            this.f3477e = c() != 1 ? false : z;
            a();
        }
        this.g = new b(new Handler());
        b bVar = this.g;
        if (bVar != null) {
            if (PatchProxy.isSupport(new Object[0], bVar, b.f53924a, false, 56715, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], bVar, b.f53924a, false, 56715, new Class[0], Void.TYPE);
                return;
            }
            ContentResolver contentResolver = bVar.f53925b;
            if (contentResolver != null) {
                contentResolver.registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), false, bVar);
            }
        }
    }
}
