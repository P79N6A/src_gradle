package com.ss.android.ugc.aweme.story.shootvideo.publish;

import a.g;
import a.i;
import a.j;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.common.util.concurrent.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.k;
import com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.t;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\bH\u0002J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J4\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u0002J \u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u000fH\u0002J\u0010\u0010!\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/publish/IMStoryPublisher;", "", "activity", "Lcom/ss/android/ugc/aweme/story/shootvideo/VideoStoryEditPublishActivity;", "mModel", "Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", "(Lcom/ss/android/ugc/aweme/story/shootvideo/VideoStoryEditPublishActivity;Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;)V", "videoCoverSuffix", "", "getFileMD5", "path", "getMediaCoverTask", "Lbolts/Task;", "videoPath", "videoType", "", "isSrcVideo", "", "getVideoFrameTask", "packSendInfoAndFinish", "", "result", "Lcom/ss/android/ugc/aweme/shortvideo/SynthetiseResult;", "isVideo", "coverPath", "srcFramePath", "srcVideoMd5", "saveBitmapToLocal", "bitmap", "Landroid/graphics/Bitmap;", "filePath", "scaleMiniCover", "shortLength", "startPublish", "callback", "Ljava/lang/Runnable;", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73676a;

    /* renamed from: b  reason: collision with root package name */
    public final String f73677b = "_video_cover";

    /* renamed from: c  reason: collision with root package name */
    public final VideoStoryEditPublishActivity f73678c;

    /* renamed from: d  reason: collision with root package name */
    public final cb f73679d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "byteBuffer", "Ljava/nio/ByteBuffer;", "width", "", "height", "<anonymous parameter 3>", "processFrame"}, k = 3, mv = {1, 1, 15})
    static final class a implements t {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73680a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f73681b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f73682c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f73683d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j f73684e;

        a(b bVar, String str, boolean z, j jVar) {
            this.f73681b = bVar;
            this.f73682c = str;
            this.f73683d = z;
            this.f73684e = jVar;
        }

        public final boolean a(@NotNull ByteBuffer byteBuffer, int i, int i2, int i3) {
            ByteBuffer byteBuffer2 = byteBuffer;
            if (PatchProxy.isSupport(new Object[]{byteBuffer2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f73680a, false, 85404, new Class[]{ByteBuffer.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{byteBuffer2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f73680a, false, 85404, new Class[]{ByteBuffer.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(byteBuffer, "byteBuffer");
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(byteBuffer.array()));
            if (createBitmap != null) {
                String str = this.f73682c + this.f73681b.f73677b;
                this.f73681b.a(createBitmap, str, this.f73683d);
                this.f73684e.b(str);
            } else {
                this.f73684e.b("");
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "srcFrameTask", "Lbolts/Task;", "", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.publish.b$b  reason: collision with other inner class name */
    public static final class C0764b<TTaskResult, TContinuationResult> implements g<TResult, TContinuationResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73685a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f73686b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f73687c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k f73688d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Runnable f73689e;

        public C0764b(b bVar, Ref.BooleanRef booleanRef, k kVar, Runnable runnable) {
            this.f73686b = bVar;
            this.f73687c = booleanRef;
            this.f73688d = kVar;
            this.f73689e = runnable;
        }

        public final /* synthetic */ Object then(i iVar) {
            T t;
            final i iVar2 = iVar;
            if (PatchProxy.isSupport(new Object[]{iVar2}, this, f73685a, false, 85405, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar2}, this, f73685a, false, 85405, new Class[]{i.class}, Void.TYPE);
            } else {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = null;
                if (this.f73687c.element && (this.f73686b.f73679d.getFrom() == 0 || this.f73686b.f73679d.getFrom() == 1)) {
                    b bVar = this.f73686b;
                    String str = this.f73686b.f73679d.mPath;
                    Intrinsics.checkExpressionValueIsNotNull(str, "mModel.mPath");
                    if (PatchProxy.isSupport(new Object[]{str}, bVar, b.f73676a, false, 85398, new Class[]{String.class}, String.class)) {
                        b bVar2 = bVar;
                        t = (String) PatchProxy.accessDispatch(new Object[]{str}, bVar2, b.f73676a, false, 85398, new Class[]{String.class}, String.class);
                    } else {
                        File file = new File(str);
                        if (file.length() > 524288) {
                            t = c.a(a.a((InputStream) a.a(str)));
                        } else {
                            t = c.a(file);
                        }
                    }
                    objectRef.element = t;
                }
                l.a(this.f73688d.a(this.f73686b.f73679d), new com.google.common.util.concurrent.k<SynthetiseResult>(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f73690a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ C0764b f73691b;

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "call", "()Lkotlin/Unit;"}, k = 3, mv = {1, 1, 15})
                    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.publish.b$b$1$a */
                    static final class a<V> implements Callable<Unit> {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f73694a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f73695b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ Throwable f73696c;

                        a(AnonymousClass1 r1, Throwable th) {
                            this.f73695b = r1;
                            this.f73696c = th;
                        }

                        public final /* synthetic */ Object call() {
                            if (PatchProxy.isSupport(new Object[0], this, f73694a, false, 85408, new Class[0], Unit.class)) {
                                return (Unit) PatchProxy.accessDispatch(new Object[0], this, f73694a, false, 85408, new Class[0], Unit.class);
                            }
                            com.bytedance.ies.dmt.ui.d.a.b((Context) this.f73695b.f73691b.f73686b.f73678c, (int) C0906R.string.bb2).a();
                            Runnable runnable = this.f73695b.f73691b.f73689e;
                            if (runnable == null) {
                                return null;
                            }
                            runnable.run();
                            return Unit.INSTANCE;
                        }
                    }

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "coverTask", "Lbolts/Task;", "", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
                    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.publish.b$b$1$b  reason: collision with other inner class name */
                    static final class C0765b<TTaskResult, TContinuationResult> implements g<String, Unit> {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f73697a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f73698b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ SynthetiseResult f73699c;

                        C0765b(AnonymousClass1 r1, SynthetiseResult synthetiseResult) {
                            this.f73698b = r1;
                            this.f73699c = synthetiseResult;
                        }

                        public final /* synthetic */ Object then(i iVar) {
                            String str;
                            i iVar2 = iVar;
                            if (PatchProxy.isSupport(new Object[]{iVar2}, this, f73697a, false, 85409, new Class[]{i.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{iVar2}, this, f73697a, false, 85409, new Class[]{i.class}, Void.TYPE);
                            } else {
                                b bVar = this.f73698b.f73691b.f73686b;
                                SynthetiseResult synthetiseResult = this.f73699c;
                                boolean z = this.f73698b.f73691b.f73687c.element;
                                Intrinsics.checkExpressionValueIsNotNull(iVar2, "coverTask");
                                Object e2 = iVar.e();
                                Intrinsics.checkExpressionValueIsNotNull(e2, "coverTask.result");
                                String str2 = (String) e2;
                                i iVar3 = iVar2;
                                Intrinsics.checkExpressionValueIsNotNull(iVar3, "srcFrameTask");
                                Object e3 = iVar3.e();
                                Intrinsics.checkExpressionValueIsNotNull(e3, "srcFrameTask.result");
                                String str3 = (String) e3;
                                String str4 = (String) objectRef.element;
                                if (PatchProxy.isSupport(new Object[]{synthetiseResult, Byte.valueOf(z ? (byte) 1 : 0), str2, str3, str4}, bVar, b.f73676a, false, 85403, new Class[]{SynthetiseResult.class, Boolean.TYPE, String.class, String.class, String.class}, Void.TYPE)) {
                                    b bVar2 = bVar;
                                    PatchProxy.accessDispatch(new Object[]{synthetiseResult, Byte.valueOf(z), str2, str3, str4}, bVar2, b.f73676a, false, 85403, new Class[]{SynthetiseResult.class, Boolean.TYPE, String.class, String.class, String.class}, Void.TYPE);
                                } else if (synthetiseResult != null) {
                                    Intent intent = new Intent();
                                    intent.putStringArrayListExtra("im_edit_texts", (ArrayList) synthetiseResult.texts);
                                    intent.putExtra("im_is_from_gallery", bVar.f73679d.isMediaFromGallery() ? 1 : 0);
                                    intent.putExtra("im_local_path", synthetiseResult.outputFile);
                                    intent.putExtra("im_src_frame_path", str3);
                                    intent.putExtra("im_src_video_md5", str4);
                                    intent.putExtra("im_height", synthetiseResult.videoHeight);
                                    intent.putExtra("im_width", synthetiseResult.videoWidth);
                                    intent.putExtra("im_video_cover", str2);
                                    if (z) {
                                        str = "im_video";
                                    } else {
                                        str = "im_photo";
                                    }
                                    intent.putExtra("im_type", str);
                                    bVar.f73678c.setResult(7, intent);
                                    bVar.f73678c.finish();
                                }
                                Runnable runnable = this.f73698b.f73691b.f73689e;
                                if (runnable != null) {
                                    runnable.run();
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    public final void onFailure(@NotNull Throwable th) {
                        Throwable th2 = th;
                        if (PatchProxy.isSupport(new Object[]{th2}, this, f73690a, false, 85407, new Class[]{Throwable.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{th2}, this, f73690a, false, 85407, new Class[]{Throwable.class}, Void.TYPE);
                            return;
                        }
                        Intrinsics.checkParameterIsNotNull(th2, "t");
                        i.a((Callable<TResult>) new a<TResult>(this, th2), i.f1052b);
                    }

                    public final /* synthetic */ void onSuccess(Object obj) {
                        SynthetiseResult synthetiseResult = (SynthetiseResult) obj;
                        if (PatchProxy.isSupport(new Object[]{synthetiseResult}, this, f73690a, false, 85406, new Class[]{SynthetiseResult.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{synthetiseResult}, this, f73690a, false, 85406, new Class[]{SynthetiseResult.class}, Void.TYPE);
                            return;
                        }
                        this.f73691b.f73688d.d(this.f73691b.f73686b.f73679d);
                        b bVar = this.f73691b.f73686b;
                        String outputFile = this.f73691b.f73686b.f73679d.getOutputFile();
                        Intrinsics.checkExpressionValueIsNotNull(outputFile, "mModel.outputFile");
                        bVar.a(outputFile, this.f73691b.f73686b.f73679d.videoType, false).a((g<TResult, TContinuationResult>) new C0765b<TResult,TContinuationResult>(this, synthetiseResult), i.f1052b);
                    }

                    {
                        this.f73691b = r1;
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    public b(@NotNull VideoStoryEditPublishActivity videoStoryEditPublishActivity, @NotNull cb cbVar) {
        Intrinsics.checkParameterIsNotNull(videoStoryEditPublishActivity, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(cbVar, "mModel");
        this.f73678c = videoStoryEditPublishActivity;
        this.f73679d = cbVar;
    }

    private final i<String> a(String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f73676a, false, 85400, new Class[]{String.class, Boolean.TYPE}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, f73676a, false, 85400, new Class[]{String.class, Boolean.TYPE}, i.class);
        }
        j jVar = new j();
        VEUtils.getVideoFrames(str2, new int[]{0}, new a(this, str2, z, jVar));
        i<TResult> iVar = jVar.f1091a;
        Intrinsics.checkExpressionValueIsNotNull(iVar, "taskCompletionSource.task");
        return iVar;
    }

    private final void a(String str, int i) {
        float f2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, 240}, this, f73676a, false, 85402, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, 240}, this, f73676a, false, 85402, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        if (decodeFile != null) {
            if (240 > decodeFile.getWidth() || 240 > decodeFile.getHeight()) {
                return;
            }
            float f3 = 240.0f;
            if (decodeFile.getWidth() < decodeFile.getHeight()) {
                f3 = (240.0f / ((float) decodeFile.getWidth())) * ((float) decodeFile.getHeight());
                f2 = 240.0f;
            } else {
                f2 = (240.0f / ((float) decodeFile.getHeight())) * ((float) decodeFile.getWidth());
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeFile, (int) f2, (int) f3, true);
            Intrinsics.checkExpressionValueIsNotNull(createScaledBitmap, "newBitmap");
            a(createScaledBitmap, str2, false);
        }
    }

    public final i<String> a(String str, int i, boolean z) {
        i<String> iVar;
        String str2 = str;
        int i2 = i;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f73676a, false, 85399, new Class[]{String.class, Integer.TYPE, Boolean.TYPE}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Byte.valueOf(z)}, this, f73676a, false, 85399, new Class[]{String.class, Integer.TYPE, Boolean.TYPE}, i.class);
        } else if (i2 == 7) {
            return a(str2, z2);
        } else {
            if (i2 != 9) {
                i<String> a2 = i.a("");
                Intrinsics.checkExpressionValueIsNotNull(a2, "Task.forResult(\"\")");
                return a2;
            }
            if (z2) {
                StringBuilder sb = new StringBuilder();
                int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str2, ClassUtils.PACKAGE_SEPARATOR, 0, false, 6, (Object) null);
                if (str2 != null) {
                    String substring = str2.substring(0, lastIndexOf$default);
                    Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    sb.append(substring);
                    sb.append(this.f73677b);
                    String sb2 = sb.toString();
                    Bitmap decodeFile = BitmapFactory.decodeFile(str);
                    Intrinsics.checkExpressionValueIsNotNull(decodeFile, "BitmapFactory.decodeFile(videoPath)");
                    a(decodeFile, sb2, z2);
                    iVar = i.a(sb2);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                iVar = a(str2, z2);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar, "if (isSrcVideo) {\n      …cVideo)\n                }");
            return iVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x009f A[SYNTHETIC, Splitter:B:31:0x009f] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a7 A[SYNTHETIC, Splitter:B:38:0x00a7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.graphics.Bitmap r21, java.lang.String r22, boolean r23) {
        /*
            r20 = this;
            r0 = r21
            r1 = r22
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            java.lang.Byte r4 = java.lang.Byte.valueOf(r23)
            r12 = 2
            r3[r12] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = f73676a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.graphics.Bitmap> r4 = android.graphics.Bitmap.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r8[r12] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 85401(0x14d99, float:1.19672E-40)
            r4 = r20
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x005d
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r10] = r0
            r13[r11] = r1
            java.lang.Byte r0 = java.lang.Byte.valueOf(r23)
            r13[r12] = r0
            com.meituan.robust.ChangeQuickRedirect r15 = f73676a
            r16 = 0
            r17 = 85401(0x14d99, float:1.19672E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r12] = r1
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r20
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x005d:
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            boolean r3 = r2.exists()
            if (r3 == 0) goto L_0x006b
            r2.delete()
        L_0x006b:
            r3 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00a3, all -> 0x0099 }
            r4.<init>(r2)     // Catch:{ Exception -> 0x00a3, all -> 0x0099 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0095, all -> 0x0091 }
            r3 = 80
            r5 = r4
            java.io.OutputStream r5 = (java.io.OutputStream) r5     // Catch:{ Exception -> 0x0095, all -> 0x0091 }
            r0.compress(r2, r3, r5)     // Catch:{ Exception -> 0x0095, all -> 0x0091 }
            r4.flush()     // Catch:{ Exception -> 0x0095, all -> 0x0091 }
            if (r23 == 0) goto L_0x008a
            r0 = 240(0xf0, float:3.36E-43)
            r2 = r20
            r2.a((java.lang.String) r1, (int) r0)     // Catch:{ Exception -> 0x0097, all -> 0x0088 }
            goto L_0x008c
        L_0x0088:
            r0 = move-exception
            goto L_0x009d
        L_0x008a:
            r2 = r20
        L_0x008c:
            r4.close()     // Catch:{ Exception -> 0x0090 }
            goto L_0x00ab
        L_0x0090:
            return
        L_0x0091:
            r0 = move-exception
            r2 = r20
            goto L_0x009d
        L_0x0095:
            r2 = r20
        L_0x0097:
            r3 = r4
            goto L_0x00a5
        L_0x0099:
            r0 = move-exception
            r2 = r20
            r4 = r3
        L_0x009d:
            if (r4 == 0) goto L_0x00a2
            r4.close()     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            throw r0
        L_0x00a3:
            r2 = r20
        L_0x00a5:
            if (r3 == 0) goto L_0x00ab
            r3.close()     // Catch:{ Exception -> 0x00aa }
        L_0x00aa:
            return
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.shootvideo.publish.b.a(android.graphics.Bitmap, java.lang.String, boolean):void");
    }
}
