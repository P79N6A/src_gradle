package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.f;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b;
import com.ss.android.ugc.aweme.sticker.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0012\u0010X\u001a\u00020Y2\b\u0010Z\u001a\u0004\u0018\u00010[H\u0016J&\u0010\\\u001a\u00020(2\b\u0010]\u001a\u0004\u0018\u0001012\b\u0010^\u001a\u0004\u0018\u0001012\b\u0010_\u001a\u0004\u0018\u000101H\u0002J\u001c\u0010`\u001a\u00020(2\b\u0010a\u001a\u0004\u0018\u0001012\b\u0010b\u001a\u0004\u0018\u000101H\u0002J\u001c\u0010c\u001a\u00020(2\b\u0010d\u001a\u0004\u0018\u00010e2\b\u0010f\u001a\u0004\u0018\u000101H\u0017J\u0014\u0010g\u001a\u00020Y2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u0014R\u001a\u0010\u001c\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\u001c\u00100\u001a\u0004\u0018\u000101X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0012\"\u0004\b8\u0010\u0014R\u001c\u00109\u001a\u0004\u0018\u00010:X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010E\u001a\u00020@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010B\"\u0004\bG\u0010DR\u001a\u0010H\u001a\u00020(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010*\"\u0004\bJ\u0010,R\u001c\u0010K\u001a\u0004\u0018\u000101X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u00103\"\u0004\bM\u00105R\u001a\u0010N\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0012\"\u0004\bP\u0010\u0014R\u001a\u0010Q\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0012\"\u0004\bS\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006h"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/impl/WidgetOnTouchListener;", "Landroid/view/View$OnTouchListener;", "Lcom/bytedance/common/utility/collection/WeakHandler$IHandler;", "activity", "Landroid/app/Activity;", "interactStickers", "", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/InteractSticker;", "interactStickerParams", "Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;", "videoDataGetter", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IVideoDataGetter;", "clickHandle", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IClickHandle;", "(Landroid/app/Activity;Ljava/util/List;Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IVideoDataGetter;Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IClickHandle;)V", "MSG_TAP", "", "getMSG_TAP", "()I", "setMSG_TAP", "(I)V", "getActivity", "()Landroid/app/Activity;", "getClickHandle", "()Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IClickHandle;", "curType", "getCurType", "setCurType", "doubleTapSlop", "getDoubleTapSlop", "setDoubleTapSlop", "getInteractStickerParams", "()Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;", "setInteractStickerParams", "(Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;)V", "getInteractStickers", "()Ljava/util/List;", "setInteractStickers", "(Ljava/util/List;)V", "mAlwaysInBiggerTapRegion", "", "getMAlwaysInBiggerTapRegion", "()Z", "setMAlwaysInBiggerTapRegion", "(Z)V", "mAlwaysInTapRegion", "getMAlwaysInTapRegion", "setMAlwaysInTapRegion", "mCurDownEvent", "Landroid/view/MotionEvent;", "getMCurDownEvent", "()Landroid/view/MotionEvent;", "setMCurDownEvent", "(Landroid/view/MotionEvent;)V", "mDoubleTapSlopSquare", "getMDoubleTapSlopSquare", "setMDoubleTapSlopSquare", "mHandler", "Lcom/bytedance/common/utility/collection/WeakHandler;", "getMHandler", "()Lcom/bytedance/common/utility/collection/WeakHandler;", "setMHandler", "(Lcom/bytedance/common/utility/collection/WeakHandler;)V", "mInitX", "", "getMInitX", "()F", "setMInitX", "(F)V", "mInitY", "getMInitY", "setMInitY", "mIsDoubleTap", "getMIsDoubleTap", "setMIsDoubleTap", "mPreUpEvent", "getMPreUpEvent", "setMPreUpEvent", "mTouchSlopSquare", "getMTouchSlopSquare", "setMTouchSlopSquare", "touchSlop", "getTouchSlop", "setTouchSlop", "getVideoDataGetter", "()Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IVideoDataGetter;", "setVideoDataGetter", "(Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IVideoDataGetter;)V", "handleMsg", "", "msg", "Landroid/os/Message;", "isConsideredDoubleTap", "firstDown", "firstUp", "secondDown", "isConsideredSingleTap", "curDown", "curUp", "onTouch", "v", "Landroid/view/View;", "event", "updateInteractStickers", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements View.OnTouchListener, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69867a;

    /* renamed from: b  reason: collision with root package name */
    public int f69868b;

    /* renamed from: c  reason: collision with root package name */
    public float f69869c;

    /* renamed from: d  reason: collision with root package name */
    public float f69870d;

    /* renamed from: e  reason: collision with root package name */
    public int f69871e;

    /* renamed from: f  reason: collision with root package name */
    public int f69872f;
    public int g = (this.f69872f * this.f69872f);
    public int h = (this.f69871e * this.f69871e);
    public boolean i;
    public boolean j;
    public boolean k;
    @Nullable
    public MotionEvent l;
    @Nullable
    public MotionEvent m;
    public int n = -1;
    @Nullable
    public WeakHandler o = new WeakHandler(this);
    @NotNull
    public final Activity p;
    @NotNull
    public List<b> q;
    @Nullable
    public d r;
    @Nullable
    public f s;
    @NotNull
    public final com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.a t;

    public final void a(@NotNull List<b> list) {
        List<b> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f69867a, false, 79593, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f69867a, false, 79593, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "interactStickers");
        this.q = list2;
    }

    public final void handleMsg(@Nullable Message message) {
        Integer num;
        long j2;
        if (PatchProxy.isSupport(new Object[]{message}, this, f69867a, false, 79596, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f69867a, false, 79596, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message != null) {
            num = Integer.valueOf(message.what);
        } else {
            num = null;
        }
        int i2 = this.f69868b;
        if (num != null && num.intValue() == i2) {
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.a aVar = this.t;
            f fVar = this.s;
            if (fVar != null) {
                j2 = fVar.Y();
            } else {
                j2 = 0;
            }
            Object obj = message.obj;
            if (obj != null) {
                aVar.a(j2, (MotionEvent) obj);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.MotionEvent");
            }
        }
    }

    @SuppressLint({"Recycle"})
    public final boolean onTouch(@Nullable View view, @Nullable MotionEvent motionEvent) {
        Integer num;
        boolean z;
        boolean z2;
        Message message;
        long j2;
        long j3;
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f69867a, false, 79594, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f69867a, false, 79594, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        long j4 = 0;
        if (num != null && num.intValue() == 0) {
            WeakHandler weakHandler = this.o;
            if (weakHandler != null && weakHandler.hasMessages(this.f69868b)) {
                WeakHandler weakHandler2 = this.o;
                if (weakHandler2 != null) {
                    weakHandler2.removeMessages(this.f69868b);
                }
            }
            MotionEvent motionEvent2 = this.l;
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.l = MotionEvent.obtain(motionEvent);
            this.j = true;
            this.i = true;
            this.f69869c = motionEvent.getX();
            this.f69870d = motionEvent.getY();
            this.n = -1;
            for (b bVar : this.q) {
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.d dVar = bVar.f69893d;
                f fVar = this.s;
                if (fVar != null) {
                    j3 = fVar.Y();
                } else {
                    j3 = 0;
                }
                if (dVar.a(j3, bVar.f69893d.c(), motionEvent.getX(), motionEvent.getY())) {
                    this.n = bVar.f69893d.c();
                    d dVar2 = this.r;
                    if (dVar2 != null) {
                        com.ss.android.ugc.aweme.sticker.a.a aVar = dVar2.l;
                        if (aVar != null) {
                            aVar.a();
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        if (num != null && num.intValue() == 2) {
            int x = (int) (motionEvent.getX() - this.f69869c);
            int y = (int) (motionEvent.getY() - this.f69870d);
            int i2 = (x * x) + (y * y);
            if (i2 > this.g || Math.abs(x) >= this.f69872f) {
                this.j = false;
                WeakHandler weakHandler3 = this.o;
                if (weakHandler3 != null) {
                    weakHandler3.removeMessages(this.f69868b);
                }
            }
            if (i2 > this.h) {
                this.i = false;
            }
        } else {
            if (num != null && num.intValue() == 1 && this.j) {
                this.k = false;
                MotionEvent motionEvent3 = this.l;
                MotionEvent motionEvent4 = this.m;
                MotionEvent motionEvent5 = motionEvent4;
                if (PatchProxy.isSupport(new Object[]{motionEvent3, motionEvent4, motionEvent}, this, f69867a, false, 79595, new Class[]{MotionEvent.class, MotionEvent.class, MotionEvent.class}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent3, motionEvent5, motionEvent}, this, f69867a, false, 79595, new Class[]{MotionEvent.class, MotionEvent.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                } else {
                    if (!(motionEvent3 == null || motionEvent5 == null || motionEvent == null || !this.i)) {
                        long eventTime = motionEvent.getEventTime() - motionEvent5.getEventTime();
                        if (eventTime <= ((long) ViewConfiguration.getDoubleTapTimeout()) && eventTime >= 40) {
                            int x2 = ((int) motionEvent3.getX()) - ((int) motionEvent.getX());
                            int y2 = ((int) motionEvent3.getY()) - ((int) motionEvent.getY());
                            if ((x2 * x2) + (y2 * y2) < this.h) {
                                z = true;
                            }
                        }
                    }
                    z = false;
                }
                if (z) {
                    this.k = true;
                    com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.a aVar2 = this.t;
                    f fVar2 = this.s;
                    if (fVar2 != null) {
                        j2 = fVar2.Y();
                    } else {
                        j2 = 0;
                    }
                    aVar2.a(j2, this.n, this.l);
                }
                if (!this.k) {
                    if (this.l == null || motionEvent == null) {
                        z2 = false;
                    } else {
                        z2 = this.j;
                    }
                    if (z2) {
                        WeakHandler weakHandler4 = this.o;
                        if (weakHandler4 != null) {
                            message = weakHandler4.obtainMessage(this.f69868b);
                        } else {
                            message = null;
                        }
                        if (message != null) {
                            message.obj = this.l;
                        }
                        WeakHandler weakHandler5 = this.o;
                        if (weakHandler5 != null) {
                            long doubleTapTimeout = ((long) ViewConfiguration.getDoubleTapTimeout()) - motionEvent.getEventTime();
                            MotionEvent motionEvent6 = this.l;
                            if (motionEvent6 != null) {
                                j4 = motionEvent6.getEventTime();
                            }
                            weakHandler5.sendMessageDelayed(message, doubleTapTimeout + j4);
                        }
                    }
                }
                MotionEvent motionEvent7 = this.m;
                if (motionEvent7 != null) {
                    motionEvent7.recycle();
                }
                this.m = MotionEvent.obtain(motionEvent);
            }
            return false;
        }
        return false;
    }

    public a(@NotNull Activity activity, @NotNull List<b> list, @Nullable d dVar, @Nullable f fVar, @NotNull com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.a aVar) {
        Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(list, "interactStickers");
        Intrinsics.checkParameterIsNotNull(aVar, "clickHandle");
        this.p = activity;
        this.q = list;
        this.r = dVar;
        this.s = fVar;
        this.t = aVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(this.p);
        Intrinsics.checkExpressionValueIsNotNull(viewConfiguration, "ViewConfiguration.get(activity)");
        this.f69871e = viewConfiguration.getScaledDoubleTapSlop();
        ViewConfiguration viewConfiguration2 = ViewConfiguration.get(this.p);
        Intrinsics.checkExpressionValueIsNotNull(viewConfiguration2, "ViewConfiguration.get(activity)");
        this.f69872f = viewConfiguration2.getScaledTouchSlop() * 3;
    }
}
