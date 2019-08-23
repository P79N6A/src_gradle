package com.ss.android.ugc.aweme.choosemusic.e;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/choosemusic/popup/FavoritedPopupWindow;", "Landroid/widget/PopupWindow;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dismissRunnable", "Ljava/lang/Runnable;", "ivCover", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "root", "Landroid/view/View;", "dismiss", "", "dismissDelayed", "delayMillis", "", "show", "anchor", "musicModel", "Lcom/ss/android/ugc/aweme/shortvideo/model/MusicModel;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35873a;

    /* renamed from: b  reason: collision with root package name */
    public final Runnable f35874b = new C0455a(this);

    /* renamed from: c  reason: collision with root package name */
    public final RemoteImageView f35875c;

    /* renamed from: d  reason: collision with root package name */
    public final View f35876d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.choosemusic.e.a$a  reason: collision with other inner class name */
    static final class C0455a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35877a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f35878b;

        C0455a(a aVar) {
            this.f35878b = aVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f35877a, false, 26759, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f35877a, false, 26759, new Class[0], Void.TYPE);
                return;
            }
            this.f35878b.dismiss();
        }
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f35873a, false, 26757, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35873a, false, 26757, new Class[0], Void.TYPE);
        } else if (isShowing()) {
            b.a(this);
        }
    }

    public a(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C0906R.layout.abl, null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…added_to_favorited, null)");
        this.f35876d = inflate;
        setContentView(this.f35876d);
        View findViewById = this.f35876d.findViewById(C0906R.id.b3f);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "root.findViewById(R.id.iv_music_cover)");
        this.f35875c = (RemoteImageView) findViewById;
        setWidth(-2);
        setHeight(-2);
        setAnimationStyle(C0906R.style.fs);
        setBackgroundDrawable(new ColorDrawable(0));
        this.f35876d.measure(0, 0);
    }
}
