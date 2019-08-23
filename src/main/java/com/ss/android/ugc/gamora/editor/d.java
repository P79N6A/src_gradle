package com.ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.edit.f;
import com.ss.android.ugc.aweme.shortvideo.edit.g;
import com.ss.android.ugc.aweme.shortvideo.edit.h;
import com.ss.android.ugc.aweme.shortvideo.edit.i;
import com.ss.android.ugc.aweme.shortvideo.edit.j;
import com.ss.android.ugc.aweme.utils.ax;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u0004\u0018\u00010\u0012J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\u001fH\u0002J\u0012\u0010\"\u001a\u00020\u001f2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\"\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u00122\b\u0010#\u001a\u0004\u0018\u00010$H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/ugc/gamora/editor/EditTitlebarScene;", "Lcom/bytedance/scene/Scene;", "()V", "editToolbarViewModel", "Lcom/ss/android/ugc/gamora/editor/EditToolbarViewModel;", "editViewModel", "Lcom/ss/android/ugc/gamora/editor/EditViewModel;", "mBackImageView", "Landroid/widget/ImageView;", "mEditToolbarModule", "Lcom/ss/android/ugc/aweme/shortvideo/edit/EditToolbarModule;", "mToolbarContainer", "Landroid/view/ViewGroup;", "mTvBackTip", "Landroid/widget/TextView;", "titleBarViewMap", "", "", "Landroid/view/View;", "titleLayout", "Landroid/support/constraint/ConstraintLayout;", "toolbarHelper", "Lcom/ss/android/ugc/gamora/editor/EditToolbarHelper;", "getAutoEnhanceView", "getChooseMusicItem", "Lcom/ss/android/ugc/aweme/shortvideo/edit/EditToolBarItem;", "getContentSource", "", "getContentType", "getTvSticker", "initObserver", "", "initToolbarItemObserver", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "onViewCreated", "view", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d extends com.bytedance.scene.e {
    public ConstraintLayout i;
    public EditViewModel j;
    public ViewGroup k;
    public final Map<Integer, View> l = new LinkedHashMap();
    public h m;
    private EditToolbarViewModel n;
    private ImageView o;
    private TextView p;
    private e q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "items", "", "Lcom/ss/android/ugc/gamora/editor/EditToolbarItemModel;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class a<T> implements Observer<List<? extends f>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f77567a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/gamora/editor/EditTitlebarScene$initObserver$1$2$1", "Lcom/ss/android/ugc/aweme/shortvideo/edit/EditToolbarDAInterceptor;", "onClickMore", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.gamora.editor.d$a$a  reason: collision with other inner class name */
        public static final class C0816a implements g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f77568a;

            public final void a() {
                String str;
                String str2;
                com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", d.a(this.f77568a.f77567a).b().creationId).a("enter_from", "video_edit_page").a("shoot_way", d.a(this.f77568a.f77567a).b().mShootWay);
                d dVar = this.f77568a.f77567a;
                EditViewModel editViewModel = dVar.j;
                if (editViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("editViewModel");
                }
                if (editViewModel.b().getAvetParameter() != null) {
                    EditViewModel editViewModel2 = dVar.j;
                    if (editViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("editViewModel");
                    }
                    str = editViewModel2.b().getAvetParameter().getContentType();
                } else {
                    EditViewModel editViewModel3 = dVar.j;
                    if (editViewModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("editViewModel");
                    }
                    if (editViewModel3.b().isMvThemeVideoType()) {
                        str = "mv";
                    } else {
                        str = "video";
                    }
                }
                com.ss.android.ugc.aweme.app.d.d a3 = a2.a("content_type", str);
                d dVar2 = this.f77568a.f77567a;
                EditViewModel editViewModel4 = dVar2.j;
                if (editViewModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("editViewModel");
                }
                if (editViewModel4.b().getAvetParameter() != null) {
                    EditViewModel editViewModel5 = dVar2.j;
                    if (editViewModel5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("editViewModel");
                    }
                    str2 = editViewModel5.b().getAvetParameter().getContentSource();
                } else {
                    EditViewModel editViewModel6 = dVar2.j;
                    if (editViewModel6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("editViewModel");
                    }
                    if (!editViewModel6.b().mFromCut) {
                        EditViewModel editViewModel7 = dVar2.j;
                        if (editViewModel7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("editViewModel");
                        }
                        if (!editViewModel7.b().mFromMultiCut) {
                            EditViewModel editViewModel8 = dVar2.j;
                            if (editViewModel8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("editViewModel");
                            }
                            if (!editViewModel8.b().isMvThemeVideoType()) {
                                str2 = "shoot";
                            }
                        }
                    }
                    str2 = "upload";
                }
                r.a("click_more_icon", (Map) a3.a("content_source", str2).f34114b);
            }

            C0816a(a aVar) {
                this.f77568a = aVar;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/gamora/editor/EditTitlebarScene$initObserver$1$1$1", "Lcom/ss/android/ugc/aweme/utils/DebounceOnClickListener;", "doClick", "", "v", "Landroid/view/View;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        public static final class b extends ax {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f77569a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f77570b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List f77571c;

            public final void a(@Nullable View view) {
                d.a(this.f77570b.f77567a).e().setValue(Integer.valueOf(this.f77569a.f77594a));
            }

            b(f fVar, a aVar, List list) {
                this.f77569a = fVar;
                this.f77570b = aVar;
                this.f77571c = list;
            }
        }

        a(d dVar) {
            this.f77567a = dVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            h hVar;
            View view;
            List<f> list = (List) obj;
            List arrayList = new ArrayList();
            if (list != null) {
                for (f fVar : list) {
                    if (fVar.f77594a == 1) {
                        f.a aVar = com.ss.android.ugc.aweme.shortvideo.edit.f.f67171d;
                        Activity activity = this.f77567a.f22093a;
                        if (activity == null) {
                            Intrinsics.throwNpe();
                        }
                        Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
                        view = aVar.b(activity, fVar.f77596c, fVar.f77595b);
                    } else {
                        f.a aVar2 = com.ss.android.ugc.aweme.shortvideo.edit.f.f67171d;
                        Activity activity2 = this.f77567a.f22093a;
                        if (activity2 == null) {
                            Intrinsics.throwNpe();
                        }
                        Intrinsics.checkExpressionValueIsNotNull(activity2, "activity!!");
                        view = aVar2.a(activity2, fVar.f77596c, fVar.f77595b);
                    }
                    if (d.a(this.f77567a).h()) {
                        arrayList.add(view);
                    } else {
                        d.b(this.f77567a).addView(view);
                    }
                    this.f77567a.l.put(Integer.valueOf(fVar.f77594a), view);
                    view.setOnClickListener(new b(fVar, this, arrayList));
                }
            }
            if (d.a(this.f77567a).h()) {
                d dVar = this.f77567a;
                h.a aVar3 = h.i;
                int f2 = d.a(this.f77567a).f();
                ViewGroup b2 = d.b(this.f77567a);
                Activity activity3 = this.f77567a.f22093a;
                if (activity3 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(activity3, "activity!!");
                if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(f2), b2, arrayList, activity3}, aVar3, h.a.f67181a, false, 76248, new Class[]{Integer.TYPE, ViewGroup.class, List.class, Activity.class}, h.class)) {
                    Intrinsics.checkParameterIsNotNull(b2, "toolBarContainer");
                    Intrinsics.checkParameterIsNotNull(arrayList, "editToolbarList");
                    Intrinsics.checkParameterIsNotNull(activity3, "context");
                    switch (f2) {
                        case 1:
                            hVar = new i(b2, arrayList, activity3);
                            break;
                        case 2:
                            hVar = new j(b2, arrayList, activity3);
                            break;
                        default:
                            hVar = null;
                            break;
                    }
                } else {
                    hVar = (h) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(f2), b2, arrayList, activity3}, aVar3, h.a.f67181a, false, 76248, new Class[]{Integer.TYPE, ViewGroup.class, List.class, Activity.class}, h.class);
                }
                if (hVar != null) {
                    hVar.a();
                    hVar.f67176b = new C0816a(this);
                } else {
                    hVar = null;
                }
                dVar.m = hVar;
            }
            this.f77567a.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class b<T> implements Observer<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f77572a;

        b(d dVar) {
            this.f77572a = dVar;
        }

        public final void onChanged(@Nullable Object obj) {
            h hVar = this.f77572a.m;
            if (hVar != null) {
                hVar.c();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "v", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f77573a;

        c(d dVar) {
            this.f77573a = dVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                h hVar = this.f77573a.m;
                if (hVar != null) {
                    Intrinsics.checkExpressionValueIsNotNull(bool, AdvanceSetting.NETWORK_TYPE);
                    boolean booleanValue = bool.booleanValue();
                    int i = 0;
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : 0)}, hVar, h.f67175a, false, 76242, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        h hVar2 = hVar;
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(booleanValue)}, hVar2, h.f67175a, false, 76242, new Class[]{Boolean.TYPE}, Void.TYPE);
                    } else {
                        ViewGroup viewGroup = hVar.f67180f;
                        if (!booleanValue) {
                            i = 8;
                        }
                        viewGroup.setVisibility(i);
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "i", "", "onChanged", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.gamora.editor.d$d  reason: collision with other inner class name */
    static final class C0817d<T> implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f77574a;

        C0817d(d dVar) {
            this.f77574a = dVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                ViewGroup.LayoutParams layoutParams = d.c(this.f77574a).getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    Intrinsics.checkExpressionValueIsNotNull(num, AdvanceSetting.NETWORK_TYPE);
                    marginLayoutParams.topMargin = num.intValue();
                    d.c(this.f77574a).setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/gamora/editor/EditTitlebarScene$initView$1", "Lcom/ss/android/ugc/aweme/utils/DebounceOnClickListener;", "doClick", "", "v", "Landroid/view/View;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e extends ax {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f77575a;

        e(d dVar) {
            this.f77575a = dVar;
        }

        public final void a(@NotNull View view) {
            Intrinsics.checkParameterIsNotNull(view, NotifyType.VIBRATE);
            d.a(this.f77575a).c().setValue(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/gamora/editor/EditTitlebarScene$initView$2", "Lcom/ss/android/ugc/aweme/utils/DebounceOnClickListener;", "doClick", "", "v", "Landroid/view/View;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class f extends ax {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f77576a;

        f(d dVar) {
            this.f77576a = dVar;
        }

        public final void a(@NotNull View view) {
            Intrinsics.checkParameterIsNotNull(view, NotifyType.VIBRATE);
            d.a(this.f77576a).c().setValue(null);
        }
    }

    @Nullable
    public final View b() {
        return this.l.get(4);
    }

    public final void a() {
        e eVar = this.q;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarHelper");
        }
        eVar.a(this.l);
        e eVar2 = this.q;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarHelper");
        }
        eVar2.b(this.l);
        e eVar3 = this.q;
        if (eVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarHelper");
        }
        eVar3.a(this.l, 80);
        View view = this.l.get(1);
        if (view != null) {
            e eVar4 = this.q;
            if (eVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbarHelper");
            }
            if (view != null) {
                eVar4.a((com.ss.android.ugc.aweme.shortvideo.edit.d) view);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditMusicToolBarItem");
            }
        }
        View view2 = this.l.get(7);
        if (view2 != null) {
            e eVar5 = this.q;
            if (eVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbarHelper");
            }
            eVar5.a(view2);
        }
        View view3 = this.l.get(9);
        if (view3 != null) {
            e eVar6 = this.q;
            if (eVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbarHelper");
            }
            if (view3 != null) {
                eVar6.a((com.ss.android.ugc.aweme.shortvideo.edit.f) view3);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem");
        }
    }

    public static final /* synthetic */ EditViewModel a(d dVar) {
        EditViewModel editViewModel = dVar.j;
        if (editViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editViewModel");
        }
        return editViewModel;
    }

    public static final /* synthetic */ ViewGroup b(d dVar) {
        ViewGroup viewGroup = dVar.k;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mToolbarContainer");
        }
        return viewGroup;
    }

    public static final /* synthetic */ ConstraintLayout c(d dVar) {
        ConstraintLayout constraintLayout = dVar.i;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleLayout");
        }
        return constraintLayout;
    }

    public final void e(@Nullable Bundle bundle) {
        super.e(bundle);
        Activity activity = this.f22093a;
        if (activity != null) {
            ViewModel viewModel = ViewModelProviders.of((FragmentActivity) activity).get(EditViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…ditViewModel::class.java]");
            this.j = (EditViewModel) viewModel;
            Activity activity2 = this.f22093a;
            if (activity2 != null) {
                ViewModel viewModel2 = ViewModelProviders.of((FragmentActivity) activity2).get(EditToolbarViewModel.class);
                Intrinsics.checkExpressionValueIsNotNull(viewModel2, "ViewModelProviders.of(ac…barViewModel::class.java]");
                this.n = (EditToolbarViewModel) viewModel2;
                Activity activity3 = this.f22093a;
                if (activity3 != null) {
                    FragmentActivity fragmentActivity = (FragmentActivity) activity3;
                    EditViewModel editViewModel = this.j;
                    if (editViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("editViewModel");
                    }
                    EditToolbarViewModel editToolbarViewModel = this.n;
                    if (editToolbarViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("editToolbarViewModel");
                    }
                    this.q = new e(fragmentActivity, editViewModel, editToolbarViewModel);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public final void a(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.a(view, bundle);
        View a2 = a((int) C0906R.id.iu);
        Intrinsics.checkExpressionValueIsNotNull(a2, "findViewById(R.id.back)");
        this.o = (ImageView) a2;
        ImageView imageView = this.o;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBackImageView");
        }
        imageView.setOnClickListener(new e(this));
        View a3 = a((int) C0906R.id.d9f);
        Intrinsics.checkExpressionValueIsNotNull(a3, "findViewById(R.id.tv_back_tip)");
        this.p = (TextView) a3;
        TextView textView = this.p;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvBackTip");
        }
        textView.setOnClickListener(new f(this));
        View a4 = a((int) C0906R.id.bae);
        Intrinsics.checkExpressionValueIsNotNull(a4, "findViewById(R.id.layout_tool_container)");
        this.k = (ViewGroup) a4;
        EditToolbarViewModel editToolbarViewModel = this.n;
        if (editToolbarViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editToolbarViewModel");
        }
        LiveData a5 = editToolbarViewModel.a();
        LifecycleOwner lifecycleOwner = this;
        ImageView imageView2 = this.o;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBackImageView");
        }
        com.ss.android.ugc.gamora.recorder.a.a(a5, lifecycleOwner, imageView2);
        EditToolbarViewModel editToolbarViewModel2 = this.n;
        if (editToolbarViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editToolbarViewModel");
        }
        LiveData b2 = editToolbarViewModel2.b();
        TextView textView2 = this.p;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvBackTip");
        }
        com.ss.android.ugc.gamora.recorder.a.a(b2, lifecycleOwner, textView2);
        EditToolbarViewModel editToolbarViewModel3 = this.n;
        if (editToolbarViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editToolbarViewModel");
        }
        editToolbarViewModel3.d().observe(lifecycleOwner, new a(this));
        EditToolbarViewModel editToolbarViewModel4 = this.n;
        if (editToolbarViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editToolbarViewModel");
        }
        editToolbarViewModel4.i().observe(lifecycleOwner, new b(this));
        EditToolbarViewModel editToolbarViewModel5 = this.n;
        if (editToolbarViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editToolbarViewModel");
        }
        editToolbarViewModel5.j().observe(lifecycleOwner, new c(this));
        EditToolbarViewModel editToolbarViewModel6 = this.n;
        if (editToolbarViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editToolbarViewModel");
        }
        editToolbarViewModel6.o().observe(lifecycleOwner, new C0817d(this));
    }

    @NotNull
    public final View a(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        View inflate = layoutInflater.inflate(C0906R.layout.act, viewGroup, false);
        if (inflate != null) {
            this.i = (ConstraintLayout) inflate;
            ConstraintLayout constraintLayout = this.i;
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleLayout");
            }
            return constraintLayout;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
    }
}
