package com.ss.android.ugc.aweme.music.ui;

import android.content.res.Resources;
import android.support.annotation.ColorInt;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.util.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.a.b;
import com.ss.android.ugc.aweme.music.a.d;
import com.ss.android.ugc.aweme.music.a.i;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0003J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0006J\u0018\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0006\u0010#\u001a\u00020\u001dR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001e\u0010\u0010\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001e\u0010\u0013\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u001e\u0010\u0016\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/ugc/aweme/music/ui/MusicTabView;", "", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "currentTab", "", "tvCollection", "Landroid/widget/TextView;", "getTvCollection", "()Landroid/widget/TextView;", "setTvCollection", "(Landroid/widget/TextView;)V", "tvHot", "getTvHot", "setTvHot", "tvIndicatorFavorites", "getTvIndicatorFavorites", "setTvIndicatorFavorites", "tvIndicatorRecommended", "getTvIndicatorRecommended", "setTvIndicatorRecommended", "tvLocalMusic", "getTvLocalMusic", "setTvLocalMusic", "getColor", "isSelected", "", "hide", "", "notifyTabChanged", "setCurrentTab", "tabPos", "setFont", "textView", "show", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class MusicTabView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56639a;

    /* renamed from: b  reason: collision with root package name */
    public int f56640b;

    /* renamed from: c  reason: collision with root package name */
    final View f56641c;
    @NotNull
    @BindView(2131497847)
    public TextView tvCollection;
    @NotNull
    @BindView(2131497949)
    public TextView tvHot;
    @NotNull
    @BindView(2131497961)
    public TextView tvIndicatorFavorites;
    @NotNull
    @BindView(2131497962)
    public TextView tvIndicatorRecommended;
    @NotNull
    @BindView(2131497991)
    public TextView tvLocalMusic;

    private void a() {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        if (PatchProxy.isSupport(new Object[0], this, f56639a, false, 60517, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56639a, false, 60517, new Class[0], Void.TYPE);
            return;
        }
        TextView textView = this.tvIndicatorRecommended;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvIndicatorRecommended");
        }
        int i2 = 4;
        if (this.f56640b == 0) {
            i = 0;
        } else {
            i = 4;
        }
        textView.setVisibility(i);
        TextView textView2 = this.tvIndicatorFavorites;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvIndicatorFavorites");
        }
        if (this.f56640b == 1) {
            i2 = 0;
        }
        textView2.setVisibility(i2);
        TextView textView3 = this.tvLocalMusic;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvLocalMusic");
        }
        if (this.f56640b == 2) {
            z = true;
        } else {
            z = false;
        }
        textView3.setTextColor(a(z));
        TextView textView4 = this.tvCollection;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvCollection");
        }
        if (this.f56640b == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        textView4.setTextColor(a(z2));
        TextView textView5 = this.tvHot;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvHot");
        }
        if (this.f56640b == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        textView5.setTextColor(a(z3));
        TextView textView6 = this.tvLocalMusic;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvLocalMusic");
        }
        if (this.f56640b == 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        a(textView6, z4);
        TextView textView7 = this.tvCollection;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvCollection");
        }
        if (this.f56640b == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        a(textView7, z5);
        TextView textView8 = this.tvHot;
        if (textView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvHot");
        }
        if (this.f56640b == 0) {
            z6 = true;
        }
        a(textView8, z6);
    }

    public MusicTabView(@NotNull View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f56641c = view;
        ButterKnife.bind((Object) this, this.f56641c);
        TextView textView = this.tvHot;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvHot");
        }
        textView.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56642a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ MusicTabView f56643b;

            {
                this.f56643b = r1;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f56642a, false, 60522, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f56642a, false, 60522, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (this.f56643b.f56640b != 0) {
                    this.f56643b.a(0);
                    bg.a(new i(0));
                    bg.b(new d("popular_song"));
                    r.a("change_music_tab", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("tab_name", "popular_song").f34114b);
                }
            }
        });
        TextView textView2 = this.tvCollection;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvCollection");
        }
        textView2.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56644a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ MusicTabView f56645b;

            {
                this.f56645b = r1;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f56644a, false, 60523, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f56644a, false, 60523, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                IAccountUserService userService = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService();
                Intrinsics.checkExpressionValueIsNotNull(userService, "ServiceManager.get().get…class.java).userService()");
                if (!userService.isLogin()) {
                    bg.a(new b(true));
                } else if (this.f56645b.f56640b != 1) {
                    this.f56645b.a(1);
                    bg.a(new i(1));
                    bg.b(new d("music_collection"));
                    r.a("change_music_tab", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("tab_name", "favorite_song").f34114b);
                }
            }
        });
        TextView textView3 = this.tvLocalMusic;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvLocalMusic");
        }
        textView3.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56646a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ MusicTabView f56647b;

            {
                this.f56647b = r1;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f56646a, false, 60524, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f56646a, false, 60524, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (this.f56647b.f56640b != 2) {
                    this.f56647b.a(2);
                    bg.a(new i(2));
                    r.a("change_music_tab", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("tab_name", "local_song").f34114b);
                }
            }
        });
    }

    @ColorInt
    private final int a(boolean z) {
        int i;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f56639a, false, 60520, new Class[]{Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f56639a, false, 60520, new Class[]{Boolean.TYPE}, Integer.TYPE)).intValue();
        }
        Resources resources = this.f56641c.getResources();
        if (z) {
            i = C0906R.color.p9;
        } else {
            i = C0906R.color.p_;
        }
        return resources.getColor(i);
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f56639a, false, 60516, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f56639a, false, 60516, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f56640b = i;
        a();
    }

    private final void a(TextView textView, boolean z) {
        String str;
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{textView2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f56639a, false, 60521, new Class[]{TextView.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, Byte.valueOf(z)}, this, f56639a, false, 60521, new Class[]{TextView.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (textView2 instanceof DmtTextView) {
            DmtTextView dmtTextView = (DmtTextView) textView2;
            if (z) {
                str = c.g;
            } else {
                str = c.f20594a;
            }
            dmtTextView.setFontType(str);
        }
    }
}
