package com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.vesdk.VEImageDetectUtils;
import com.ss.android.vesdk.v;
import com.tencent.bugly.CrashModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000bJ\u0006\u0010&\u001a\u00020#J\u0006\u0010'\u001a\u00020#J\u0006\u0010(\u001a\u00020#J\b\u0010)\u001a\u00020#H\u0002J(\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u001eH\u0016J\b\u0010.\u001a\u00020#H\u0002J\u0012\u0010/\u001a\u00020#2\b\u00100\u001a\u0004\u0018\u00010\u001cH\u0002J\u000e\u00101\u001a\u00020#2\u0006\u00102\u001a\u00020\u0017J\u000e\u00103\u001a\u00020#2\u0006\u00104\u001a\u00020\u0015J\u001e\u00105\u001a\u00020#2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000b072\b\u00100\u001a\u0004\u0018\u00010\u001cJ\u000e\u00108\u001a\u00020#2\u0006\u00109\u001a\u00020:R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/PixaloopManager;", "Lcom/ss/android/vesdk/VEImageDetectUtils$IDetectImageResultListener;", "()V", "count", "", "getCount$tools_dmt_av_impl_douyinCnRelease", "()I", "setCount$tools_dmt_av_impl_douyinCnRelease", "(I)V", "curScanAllalgorithmIndex", "curStickerId", "", "detectUtilsWrapper", "Lcom/ss/android/vesdk/VEImageDetectUtilsWrapper;", "lastImgPath", "<set-?>", "Landroid/os/Handler;", "mainHandler", "getMainHandler", "()Landroid/os/Handler;", "managerListener", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/listener/PixaloopManagerListener;", "mediaRecordPresenter", "Lcom/ss/android/medialib/presenter/MediaRecordPresenter;", "scanAllalgorithmCount", "scanAllalgorithmType", "scanFinishDataList", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/data/PixaloopData;", "scanPhotoStatus", "", "workHandler", "workThread", "Landroid/os/HandlerThread;", "animateImageToPreview", "", "key", "path", "clearData", "destory", "getDCIMPhotoList", "initHandler", "onDetectResult", "stickerId", "scanAlgorithm", "scanResult", "scanFinish", "scanPhotoResult", "pixaloopData", "setMediaRecordPresenter", "presenter", "setPixaloopManagerListener", "listener", "startScanImg", "imgList", "", "stopScan", "stopStickerId", "", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements VEImageDetectUtils.IDetectImageResultListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69386a;
    public static final a o = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    final HandlerThread f69387b = new HandlerThread("pixaloop_work");
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public Handler f69388c;

    /* renamed from: d  reason: collision with root package name */
    String f69389d;

    /* renamed from: e  reason: collision with root package name */
    int f69390e;

    /* renamed from: f  reason: collision with root package name */
    int f69391f;
    boolean g = true;
    public com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.c.c h;
    final ArrayList<com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b> i = new ArrayList<>();
    public String j;
    String k;
    public v l = new v();
    MediaRecordPresenter m;
    public int n;
    private Handler p;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/PixaloopManager$Companion;", "", "()V", "MSG_GET_PHOTO_LIST", "", "MSG_SCAN_PHOTO_RESULT", "MSG_SCAN_PHOTO_START", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/PixaloopManager$initHandler$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b$b  reason: collision with other inner class name */
    public static final class C0728b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69397a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f69398b;

        public final void handleMessage(@NotNull Message message) {
            if (PatchProxy.isSupport(new Object[]{message}, this, f69397a, false, 78912, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message}, this, f69397a, false, 78912, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(message, "msg");
            if (message.what == 1001) {
                Message obtain = Message.obtain();
                obtain.obj = a.f69354f.b();
                obtain.what = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST;
                Handler handler = this.f69398b.f69388c;
                if (handler == null) {
                    Intrinsics.throwNpe();
                }
                handler.sendMessage(obtain);
                return;
            }
            if (message.what == 1004) {
                Bundle data = message.getData();
                ArrayList<String> stringArrayList = data.getStringArrayList("img_list");
                ArrayList<String> stringArrayList2 = data.getStringArrayList("alg_list");
                if (!j.a((Collection<T>) stringArrayList) && !j.a((Collection<T>) stringArrayList2)) {
                    v vVar = this.f69398b.l;
                    String str = this.f69398b.j;
                    if (str == null) {
                        Intrinsics.throwNpe();
                    }
                    if (stringArrayList == null) {
                        Intrinsics.throwNpe();
                    }
                    List list = stringArrayList;
                    if (stringArrayList2 == null) {
                        Intrinsics.throwNpe();
                    }
                    vVar.a(str, list, stringArrayList2, this.f69398b);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0728b(b bVar, Looper looper) {
            super(looper);
            this.f69398b = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/PixaloopManager$initHandler$2", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69414a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f69415b;

        public final void handleMessage(@NotNull Message message) {
            boolean z;
            boolean z2;
            Message message2 = message;
            if (PatchProxy.isSupport(new Object[]{message2}, this, f69414a, false, 78913, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, this, f69414a, false, 78913, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(message2, "msg");
            if (message2.what == 1001) {
                Object obj = message2.obj;
                if (obj != null) {
                    List list = (List) obj;
                    com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.c.c cVar = this.f69415b.h;
                    if (cVar != null) {
                        cVar.a(list);
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                }
            } else if (message2.what == 1002) {
                Object obj2 = message2.obj;
                if (obj2 != null) {
                    com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b bVar = (com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b) obj2;
                    if (bVar != null && this.f69415b.j != null && !(!Intrinsics.areEqual((Object) this.f69415b.j, (Object) bVar.f69364e))) {
                        b bVar2 = this.f69415b;
                        if (PatchProxy.isSupport(new Object[]{bVar}, bVar2, b.f69386a, false, 78905, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bVar}, bVar2, b.f69386a, false, 78905, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b.class}, Void.TYPE);
                            return;
                        }
                        if (bVar2.f69391f <= bVar2.f69390e) {
                            bVar2.f69391f++;
                            if (Intrinsics.areEqual((Object) com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.a.f69355d, (Object) bVar2.f69389d)) {
                                if (!bVar2.g) {
                                    if (bVar == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    if (!bVar.f69363d) {
                                        z2 = false;
                                        bVar2.g = z2;
                                    }
                                }
                                z2 = true;
                                bVar2.g = z2;
                            } else {
                                if (bVar2.g) {
                                    if (bVar == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    if (bVar.f69363d) {
                                        z = true;
                                        bVar2.g = z;
                                    }
                                }
                                z = false;
                                bVar2.g = z;
                            }
                            if (bVar2.f69391f == bVar2.f69390e) {
                                if (bVar == null) {
                                    Intrinsics.throwNpe();
                                }
                                bVar.f69363d = bVar2.g;
                                com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.c.c cVar2 = bVar2.h;
                                if (cVar2 != null) {
                                    cVar2.a(bVar);
                                }
                                if (bVar.f69363d) {
                                    bVar2.i.add(bVar);
                                }
                                bVar2.f69391f = 0;
                                bVar2.g = true;
                                if (!TextUtils.isEmpty(bVar.f69361b) && Intrinsics.areEqual((Object) bVar.f69361b, (Object) bVar2.k)) {
                                    bVar2.a();
                                }
                            }
                        }
                        bVar2.n++;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.data.PixaloopData");
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, Looper looper) {
            super(looper);
            this.f69415b = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f69386a, false, 78904, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69386a, false, 78904, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.c.c cVar = this.h;
        if (cVar != null) {
            cVar.b(this.i);
        }
        this.i.clear();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f69386a, false, 78911, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69386a, false, 78911, new Class[0], Void.TYPE);
            return;
        }
        this.k = null;
        this.f69390e = 0;
        this.g = true;
        this.f69391f = 0;
        this.i.clear();
    }

    public b() {
        if (PatchProxy.isSupport(new Object[0], this, f69386a, false, 78903, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69386a, false, 78903, new Class[0], Void.TYPE);
            return;
        }
        this.f69387b.start();
        this.p = new C0728b(this, this.f69387b.getLooper());
        this.f69388c = new c(this, Looper.getMainLooper());
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f69386a, false, 78907, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69386a, false, 78907, new Class[0], Void.TYPE);
            return;
        }
        Handler handler = this.p;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("workHandler");
        }
        if (handler != null) {
            Handler handler2 = this.p;
            if (handler2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("workHandler");
            }
            if (handler2 == null) {
                Intrinsics.throwNpe();
            }
            handler2.sendEmptyMessage(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST);
        }
    }

    public final void a(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f69386a, false, 78910, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f69386a, false, 78910, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.l.a();
    }

    public final void a(@NotNull String str, @NotNull String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f69386a, false, 78909, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f69386a, false, 78909, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str3, "key");
        Intrinsics.checkParameterIsNotNull(str4, "path");
        MediaRecordPresenter mediaRecordPresenter = this.m;
        if (mediaRecordPresenter != null) {
            mediaRecordPresenter.a(str3, str4);
        }
    }

    public final void a(@NotNull List<String> list, @Nullable com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b bVar) {
        com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.a aVar;
        if (PatchProxy.isSupport(new Object[]{list, bVar}, this, f69386a, false, 78908, new Class[]{List.class, com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, bVar}, this, f69386a, false, 78908, new Class[]{List.class, com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list, "imgList");
        this.n = 0;
        if (bVar != null) {
            aVar = bVar.h;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            a();
        } else if (!j.a((Collection<T>) list) || !j.a((Collection<T>) bVar.a())) {
            c();
            Handler handler = this.f69388c;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            Handler handler2 = this.p;
            if (handler2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("workHandler");
            }
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
            }
            this.k = list.get(list.size() - 1);
            this.j = bVar.f69364e;
            this.f69390e = bVar.a().size();
            this.f69389d = bVar.h.f69359c;
            Message obtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("img_list", (ArrayList) list);
            List<String> a2 = bVar.a();
            if (a2 != null) {
                bundle.putStringArrayList("alg_list", (ArrayList) a2);
                Intrinsics.checkExpressionValueIsNotNull(obtain, "message");
                obtain.setData(bundle);
                obtain.what = CrashModule.MODULE_ID;
                Handler handler3 = this.p;
                if (handler3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("workHandler");
                }
                if (handler3 != null) {
                    handler3.sendMessage(obtain);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
        } else {
            a();
        }
    }

    public final void onDetectResult(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f69386a, false, 78902, new Class[]{String.class, String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6, Byte.valueOf(z)}, this, f69386a, false, 78902, new Class[]{String.class, String.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str4, "stickerId");
        Intrinsics.checkParameterIsNotNull(str5, "path");
        Intrinsics.checkParameterIsNotNull(str6, "scanAlgorithm");
        if (this.j != null && !(!Intrinsics.areEqual((Object) this.j, (Object) str4))) {
            Message obtain = Message.obtain();
            com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b bVar = new com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b(str5, str6, z);
            bVar.f69364e = str4;
            obtain.obj = bVar;
            obtain.what = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR;
            if (this.f69388c != null) {
                Handler handler = this.f69388c;
                if (handler == null) {
                    Intrinsics.throwNpe();
                }
                handler.sendMessage(obtain);
            }
        }
    }
}
