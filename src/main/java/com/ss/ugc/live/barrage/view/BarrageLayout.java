package com.ss.ugc.live.barrage.view;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.MainThread;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.ss.ugc.live.barrage.b.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u0007H\u0007J\u0006\u0010\u0011\u001a\u00020\u000eJ\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/ugc/live/barrage/view/BarrageLayout;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mBarrageControllerPriorityList", "Ljava/util/ArrayList;", "Lcom/ss/ugc/live/barrage/controller/AbsBarrageController;", "mTouchController", "addController", "", "controller", "priority", "cleanBarrage", "draw", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "barrage_release"}, k = 1, mv = {1, 1, 15})
public final class BarrageLayout extends View {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<a> f78710a;

    /* renamed from: b  reason: collision with root package name */
    private a f78711b;

    @JvmOverloads
    public BarrageLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public BarrageLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @JvmOverloads
    @MainThread
    public final void a(@Nullable a aVar) {
        a(aVar, this.f78710a.size());
    }

    public final void a() {
        Iterator<a> it2 = this.f78710a.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
    }

    public final void draw(@NotNull Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        super.draw(canvas);
        Iterator<a> it2 = this.f78710a.iterator();
        while (it2.hasNext()) {
            Intrinsics.checkParameterIsNotNull(canvas, "canvas");
            Iterator it3 = it2.next().f78700f.iterator();
            while (it3.hasNext()) {
                ((com.ss.ugc.live.barrage.a.a) it3.next()).a(canvas);
            }
        }
    }

    public final boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        switch (motionEvent.getAction()) {
            case 0:
                Iterator<a> it2 = this.f78710a.iterator();
                while (it2.hasNext()) {
                    a next = it2.next();
                    if (next.a(motionEvent)) {
                        this.f78711b = next;
                        return true;
                    }
                }
                break;
            case 1:
                if (this.f78711b == null) {
                    this.f78711b = null;
                    break;
                } else {
                    a aVar = this.f78711b;
                    if (aVar == null) {
                        Intrinsics.throwNpe();
                    }
                    return aVar.a(motionEvent);
                }
            case 2:
            case 3:
                if (this.f78711b != null) {
                    a aVar2 = this.f78711b;
                    if (aVar2 == null) {
                        Intrinsics.throwNpe();
                    }
                    return aVar2.a(motionEvent);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: private */
    @JvmOverloads
    @MainThread
    public void a(@Nullable a aVar, int i) {
        if (aVar != null) {
            if (i > this.f78710a.size() || i < 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            this.f78710a.add(i, aVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BarrageLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f78710a = new ArrayList<>();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BarrageLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
