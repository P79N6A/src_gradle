package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ProgressBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.sticker.a.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001!B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/DispathTouchEventView;", "Landroid/widget/ProgressBar;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "clickListener", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/DispathTouchEventView$OnClickProgressBar;", "getClickListener", "()Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/DispathTouchEventView$OnClickProgressBar;", "setClickListener", "(Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/DispathTouchEventView$OnClickProgressBar;)V", "listener", "Lcom/ss/android/ugc/aweme/sticker/listener/IVoteEventListener;", "getListener", "()Lcom/ss/android/ugc/aweme/sticker/listener/IVoteEventListener;", "setListener", "(Lcom/ss/android/ugc/aweme/sticker/listener/IVoteEventListener;)V", "statusView", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/IStatusView;", "getStatusView", "()Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/IStatusView;", "setStatusView", "(Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/IStatusView;)V", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "OnClickProgressBar", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DispathTouchEventView extends ProgressBar {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69984a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private c f69985b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private d f69986c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private a f69987d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/DispathTouchEventView$OnClickProgressBar;", "", "onClick", "", "id", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a(int i);
    }

    @Nullable
    public final a getClickListener() {
        return this.f69987d;
    }

    @Nullable
    public final c getListener() {
        return this.f69985b;
    }

    @Nullable
    public final d getStatusView() {
        return this.f69986c;
    }

    public final void setClickListener(@Nullable a aVar) {
        this.f69987d = aVar;
    }

    public final void setListener(@Nullable c cVar) {
        this.f69985b = cVar;
    }

    public final void setStatusView(@Nullable d dVar) {
        this.f69986c = dVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DispathTouchEventView(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setOnClickListener(AnonymousClass1.f69989b);
    }

    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        Integer num;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f69984a, false, 79661, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f69984a, false, 79661, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        Integer num2 = null;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            d dVar = this.f69986c;
            if (dVar != null) {
                num2 = dVar.getStatus();
            }
            if (num2 == null || num2.intValue() != 0) {
                c cVar = this.f69985b;
                if (cVar != null) {
                    cVar.a(true);
                }
                return false;
            }
        } else if (num != null && num.intValue() == 1) {
            d dVar2 = this.f69986c;
            if (dVar2 != null) {
                num2 = dVar2.getStatus();
            }
            if (num2 == null || num2.intValue() != 0) {
                return false;
            }
            c cVar2 = this.f69985b;
            if (cVar2 != null) {
                cVar2.a(false);
            }
            a aVar = this.f69987d;
            if (aVar != null) {
                aVar.a(getId());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DispathTouchEventView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setOnClickListener(AnonymousClass1.f69989b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DispathTouchEventView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setOnClickListener(AnonymousClass1.f69989b);
    }
}
