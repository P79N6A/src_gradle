package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.bytedance.common.utility.UIUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.feed.f.k;
import com.ss.android.ugc.aweme.poi.widget.c;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.d;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u001fH\u0016J\b\u00104\u001a\u00020\u0007H$J\n\u00105\u001a\u0004\u0018\u00010\tH\u0016J\b\u00106\u001a\u000202H$J\b\u00107\u001a\u000202H$J\u0010\u00108\u001a\u0002022\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u00109\u001a\u000202H\u0016J\b\u0010:\u001a\u000202H\u0016J\b\u0010;\u001a\u000202H\u0016J\u0010\u0010<\u001a\u0002022\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@H\u0016J\u0010\u0010B\u001a\u0002022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010C\u001a\u0002022\b\u0010D\u001a\u0004\u0018\u00010\tH\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006E"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/BaseInteractStickerView;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IInteractStickerView;", "type", "", "context", "Landroid/content/Context;", "contentView", "Landroid/view/View;", "stickerStruct", "Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;", "interactStickerParams", "Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;", "(ILandroid/content/Context;Landroid/view/View;Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;)V", "getContentView", "()Landroid/view/View;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getInteractStickerParams", "()Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;", "setInteractStickerParams", "(Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;)V", "listTrackData", "", "Lcom/ss/android/ugc/aweme/sticker/data/NormalTrackTimeStamp;", "getListTrackData", "()Ljava/util/List;", "setListTrackData", "(Ljava/util/List;)V", "mPoiBubblePopWindow", "Lcom/ss/android/ugc/aweme/poi/widget/BubblePopupWindow;", "getMPoiBubblePopWindow", "()Lcom/ss/android/ugc/aweme/poi/widget/BubblePopupWindow;", "setMPoiBubblePopWindow", "(Lcom/ss/android/ugc/aweme/poi/widget/BubblePopupWindow;)V", "mShowPoiPopWindowRunnable", "Ljava/lang/Runnable;", "getMShowPoiPopWindowRunnable", "()Ljava/lang/Runnable;", "setMShowPoiPopWindowRunnable", "(Ljava/lang/Runnable;)V", "stickStruct", "getStickStruct", "()Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;", "setStickStruct", "(Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;)V", "getType", "()I", "adjustPopWindow", "", "popWindow", "createBubbleView", "getStickerStruct", "mobClick", "onClickPop", "onDestroyView", "onPause", "onResume", "requestLayout", "tryDismissPop", "tryShowPoiPopWindow", "", "x", "", "y", "updateInteractStickerParams", "updateStickerStruct", "struct", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70005a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public c f70006b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public Runnable f70007c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public InteractStickerStruct f70008d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public List<? extends NormalTrackTimeStamp> f70009e;

    /* renamed from: f  reason: collision with root package name */
    public final int f70010f;
    @NotNull
    public Context g;
    @NotNull
    public final View h;
    @Nullable
    public com.ss.android.ugc.aweme.sticker.d i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a$a  reason: collision with other inner class name */
    static final class C0735a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70011a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f70012b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f70013c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f70014d;

        C0735a(a aVar, float f2, float f3) {
            this.f70012b = aVar;
            this.f70013c = f2;
            this.f70014d = f3;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams;
            if (PatchProxy.isSupport(new Object[0], this, f70011a, false, 79639, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f70011a, false, 79639, new Class[0], Void.TYPE);
                return;
            }
            if (this.f70012b.f70006b == null) {
                a aVar = this.f70012b;
                Context context = this.f70012b.g;
                if (context != null) {
                    aVar.f70006b = new c((Activity) context, false);
                    c cVar = this.f70012b.f70006b;
                    if (cVar != null) {
                        cVar.r = 300;
                    }
                    c cVar2 = this.f70012b.f70006b;
                    if (cVar2 != null) {
                        cVar2.a(false);
                    }
                    c cVar3 = this.f70012b.f70006b;
                    if (cVar3 != null) {
                        cVar3.m = true;
                    }
                    c cVar4 = this.f70012b.f70006b;
                    if (cVar4 != null) {
                        cVar4.n = true;
                    }
                    c cVar5 = this.f70012b.f70006b;
                    if (cVar5 != null) {
                        cVar5.a(this.f70012b.f());
                    }
                    a aVar2 = this.f70012b;
                    c cVar6 = this.f70012b.f70006b;
                    if (cVar6 == null) {
                        Intrinsics.throwNpe();
                    }
                    aVar2.a(cVar6);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                }
            }
            c cVar7 = this.f70012b.f70006b;
            if (cVar7 != null) {
                cVar7.e(this.f70012b.g.getResources().getColor(C0906R.color.f4488b));
            }
            c cVar8 = this.f70012b.f70006b;
            if (cVar8 != null) {
                cVar8.f();
            }
            if (this.f70012b.f70006b != null) {
                c cVar9 = this.f70012b.f70006b;
                if (cVar9 == null) {
                    Intrinsics.throwNpe();
                }
                if (((float) cVar9.c()) > ((float) p.b(this.f70012b.g)) - UIUtils.dip2Px(this.f70012b.g, 32.0f)) {
                    c cVar10 = this.f70012b.f70006b;
                    if (cVar10 == null) {
                        Intrinsics.throwNpe();
                    }
                    cVar10.b((int) (((float) p.b(this.f70012b.g)) - UIUtils.dip2Px(this.f70012b.g, 32.0f)));
                    c cVar11 = this.f70012b.f70006b;
                    if (cVar11 == null) {
                        Intrinsics.throwNpe();
                    }
                    View contentView = cVar11.getContentView();
                    if (contentView != null) {
                        View childAt = ((ViewGroup) contentView).getChildAt(0);
                        if (childAt != null) {
                            layoutParams = childAt.getLayoutParams();
                        } else {
                            layoutParams = null;
                        }
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        if (layoutParams2 != null) {
                            layoutParams2.leftMargin = (int) UIUtils.dip2Px(this.f70012b.g, 12.0f);
                        }
                        if (layoutParams2 != null) {
                            layoutParams2.rightMargin = (int) UIUtils.dip2Px(this.f70012b.g, 12.0f);
                        }
                        c cVar12 = this.f70012b.f70006b;
                        if (cVar12 == null) {
                            Intrinsics.throwNpe();
                        }
                        View contentView2 = cVar12.getContentView();
                        if (contentView2 != null) {
                            View childAt2 = ((ViewGroup) contentView2).getChildAt(0);
                            if (childAt2 != null) {
                                childAt2.setLayoutParams(layoutParams2);
                            }
                            c cVar13 = this.f70012b.f70006b;
                            if (cVar13 != null) {
                                cVar13.f();
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                }
            }
            final int[] iArr = new int[2];
            this.f70012b.h.getLocationOnScreen(iArr);
            c cVar14 = this.f70012b.f70006b;
            if (cVar14 != null) {
                cVar14.t = new com.ss.android.ugc.aweme.base.b.a.d<Point>(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f70015a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ C0735a f70016b;

                    {
                        this.f70016b = r1;
                    }

                    public final /* synthetic */ Object a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f70015a, false, 79640, new Class[0], Point.class)) {
                            return new Point(((int) this.f70016b.f70013c) + iArr[0], ((int) this.f70016b.f70014d) + iArr[1]);
                        }
                        return (Point) PatchProxy.accessDispatch(new Object[0], this, f70015a, false, 79640, new Class[0], Point.class);
                    }
                };
            }
            c cVar15 = this.f70012b.f70006b;
            if (cVar15 != null) {
                cVar15.u = new c.a(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f70018a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ C0735a f70019b;

                    {
                        this.f70019b = r1;
                    }

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f70018a, false, 79641, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f70018a, false, 79641, new Class[0], Void.TYPE);
                            return;
                        }
                        c cVar = this.f70019b.f70012b.f70006b;
                        if (cVar != null) {
                            cVar.dismiss();
                        }
                        this.f70019b.f70012b.g();
                    }
                };
            }
            c cVar16 = this.f70012b.f70006b;
            if (cVar16 != null) {
                cVar16.setOnDismissListener(new PopupWindow.OnDismissListener(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f70020a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ C0735a f70021b;

                    {
                        this.f70021b = r1;
                    }

                    public final void onDismiss() {
                        if (PatchProxy.isSupport(new Object[0], this, f70020a, false, 79642, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f70020a, false, 79642, new Class[0], Void.TYPE);
                            return;
                        }
                        com.ss.android.ugc.aweme.sticker.d dVar = this.f70021b.f70012b.i;
                        if (dVar != null) {
                            com.ss.android.ugc.aweme.sticker.a.a aVar = dVar.l;
                            if (aVar != null) {
                                aVar.a(this.f70021b.f70012b.c(), false);
                            }
                        }
                    }
                });
            }
            c cVar17 = this.f70012b.f70006b;
            if (cVar17 != null) {
                cVar17.o = -1;
            }
            c cVar18 = this.f70012b.f70006b;
            if (cVar18 != null) {
                cVar18.b(this.f70012b.h);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70022a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f70023b;

        b(a aVar) {
            this.f70023b = aVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f70022a, false, 79643, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f70022a, false, 79643, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.b.a.a.a.b(this.f70023b.f70007c);
        }
    }

    public void a() {
    }

    public void a(@NotNull c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f70005a, false, 79637, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f70005a, false, 79637, new Class[]{c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "popWindow");
    }

    public void b() {
    }

    public abstract void e();

    @NotNull
    public abstract View f();

    public abstract void g();

    @Nullable
    public final InteractStickerStruct d() {
        return this.f70008d;
    }

    public void a(@Nullable InteractStickerStruct interactStickerStruct) {
        this.f70008d = interactStickerStruct;
    }

    public void a(@NotNull com.ss.android.ugc.aweme.sticker.d dVar) {
        com.ss.android.ugc.aweme.sticker.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f70005a, false, 79632, new Class[]{com.ss.android.ugc.aweme.sticker.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f70005a, false, 79632, new Class[]{com.ss.android.ugc.aweme.sticker.d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar2, "interactStickerParams");
        this.i = dVar2;
    }

    public void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f70005a, false, 79634, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f70005a, false, 79634, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f70007c != null) {
            com.ss.android.b.a.a.a.c(this.f70007c);
            this.f70007c = null;
        }
        c cVar = this.f70006b;
        if (cVar != null) {
            cVar.d();
        }
        this.f70006b = null;
    }

    public final void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f70005a, false, 79635, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f70005a, false, 79635, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f70007c != null) {
            com.ss.android.b.a.a.a.c(this.f70007c);
            this.f70007c = null;
        }
        if (this.f70006b != null) {
            c cVar = this.f70006b;
            if (cVar != null) {
                cVar.dismiss();
            }
            this.f70006b = null;
        }
        com.ss.android.ugc.aweme.sticker.d dVar = this.i;
        if (dVar != null) {
            com.ss.android.ugc.aweme.sticker.a.a aVar = dVar.l;
            if (aVar != null) {
                aVar.a(c(), false);
            }
        }
    }

    public final boolean a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f70005a, false, 79636, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f70005a, false, 79636, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        bg.a(new k(c()));
        c cVar = this.f70006b;
        if (cVar == null || !cVar.isShowing()) {
            e();
            this.f70007c = new C0735a(this, f2, f3);
            this.h.post(new b(this));
            return true;
        }
        bg.a(new k());
        return false;
    }

    public a(int i2, @NotNull Context context, @NotNull View view, @NotNull InteractStickerStruct interactStickerStruct, @Nullable com.ss.android.ugc.aweme.sticker.d dVar) {
        String str;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(view, "contentView");
        Intrinsics.checkParameterIsNotNull(interactStickerStruct, "stickerStruct");
        this.f70010f = i2;
        this.g = context;
        this.h = view;
        this.i = dVar;
        this.f70008d = interactStickerStruct;
        try {
            Gson d2 = m.d();
            InteractStickerStruct interactStickerStruct2 = this.f70008d;
            if (interactStickerStruct2 != null) {
                str = interactStickerStruct2.getTrackList();
            } else {
                str = null;
            }
            this.f70009e = (List) d2.fromJson(str, new TypeToken<List<? extends NormalTrackTimeStamp>>() {
            }.getType());
        } catch (JsonSyntaxException unused) {
        }
    }
}
