package com.ss.android.ugc.gamora.editor;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.a.b;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.RoundingParams;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.edit.s;
import com.ss.android.ugc.aweme.utils.ey;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u0002J\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0018J\u001a\u0010\u0019\u001a\u00020\f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u001bJ\"\u0010\u001c\u001a\u00020\f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u001b2\u0006\u0010\u0013\u001a\u00020\u000eJ\u001a\u0010\u001d\u001a\u00020\f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u001bJ\u000e\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u001f\u001a\u00020\fH\u0002J\u0018\u0010 \u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u000eH\u0002J\u0018\u0010\"\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u000eH\u0002J\u0018\u0010#\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u000eH\u0002J\u0018\u0010$\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/ugc/gamora/editor/EditToolbarHelper;", "", "activity", "Landroid/support/v4/app/FragmentActivity;", "editViewModel", "Lcom/ss/android/ugc/gamora/editor/EditViewModel;", "editToolbarViewModel", "Lcom/ss/android/ugc/gamora/editor/EditToolbarViewModel;", "(Landroid/support/v4/app/FragmentActivity;Lcom/ss/android/ugc/gamora/editor/EditViewModel;Lcom/ss/android/ugc/gamora/editor/EditToolbarViewModel;)V", "mPopupWindow", "Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleView;", "dispatchItemGuide", "", "type", "", "isShow", "", "view", "Landroid/view/View;", "direct", "initAutoEnhanceObserver", "item", "Lcom/ss/android/ugc/aweme/shortvideo/edit/EditToolBarItem;", "initChooseMusicObserver", "Lcom/ss/android/ugc/aweme/shortvideo/edit/EditMusicToolBarItem;", "initItemEnableObserver", "map", "", "initItemGuideObserver", "initItemVisibleObserver", "initVolumeObserver", "tryHideEffectGuide", "tryShowEffectGuide", "gravity", "tryShowMusicGuide", "tryShowStickerGuide", "tryShowVoiceGuide", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    com.bytedance.ies.dmt.ui.a.b f77577a;

    /* renamed from: b  reason: collision with root package name */
    final FragmentActivity f77578b;

    /* renamed from: c  reason: collision with root package name */
    final EditViewModel f77579c;

    /* renamed from: d  reason: collision with root package name */
    private final EditToolbarViewModel f77580d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "i", "", "onChanged", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
    static final class a<T> implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.f f77581a;

        a(com.ss.android.ugc.aweme.shortvideo.edit.f fVar) {
            this.f77581a = fVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                com.ss.android.ugc.aweme.shortvideo.edit.f fVar = this.f77581a;
                Intrinsics.checkExpressionValueIsNotNull(num, AdvanceSetting.NETWORK_TYPE);
                fVar.setIcon(num.intValue());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "v", "", "onChanged", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
    static final class b<T> implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.d f77582a;

        b(com.ss.android.ugc.aweme.shortvideo.edit.d dVar) {
            this.f77582a = dVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                com.ss.android.ugc.aweme.shortvideo.edit.d dVar = this.f77582a;
                Intrinsics.checkExpressionValueIsNotNull(num, AdvanceSetting.NETWORK_TYPE);
                dVar.setText(num.intValue());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "v", "", "onChanged", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.d f77583a;

        c(com.ss.android.ugc.aweme.shortvideo.edit.d dVar) {
            this.f77583a = dVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                this.f77583a.getToolIvContainer().setBackground(null);
                this.f77583a.getToolIv().setScaleX(1.0f);
                this.f77583a.getToolIv().setScaleY(1.0f);
                GenericDraweeHierarchy genericDraweeHierarchy = (GenericDraweeHierarchy) this.f77583a.getToolIv().getHierarchy();
                Intrinsics.checkExpressionValueIsNotNull(genericDraweeHierarchy, "item.getToolIv().hierarchy");
                genericDraweeHierarchy.setRoundingParams(null);
                com.ss.android.ugc.aweme.shortvideo.edit.d dVar = this.f77583a;
                Intrinsics.checkExpressionValueIsNotNull(num, AdvanceSetting.NETWORK_TYPE);
                dVar.setIcon(num.intValue());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "v", "Lkotlin/Pair;", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class d<T> implements Observer<Pair<? extends UrlModel, ? extends Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.d f77584a;

        d(com.ss.android.ugc.aweme.shortvideo.edit.d dVar) {
            this.f77584a = dVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Pair pair = (Pair) obj;
            if (pair != null) {
                ((GenericDraweeHierarchy) this.f77584a.getToolIv().getHierarchy()).setPlaceholderImage(2130839026);
                GenericDraweeHierarchy genericDraweeHierarchy = (GenericDraweeHierarchy) this.f77584a.getToolIv().getHierarchy();
                Intrinsics.checkExpressionValueIsNotNull(genericDraweeHierarchy, "item.getToolIv().hierarchy");
                genericDraweeHierarchy.setRoundingParams(RoundingParams.asCircle());
                if (((Boolean) pair.getSecond()).booleanValue()) {
                    this.f77584a.getToolIvContainer().setBackgroundResource(2130839026);
                    this.f77584a.getToolIv().setScaleX(0.625f);
                    this.f77584a.getToolIv().setScaleY(0.625f);
                } else {
                    this.f77584a.getToolIvContainer().setBackground(null);
                    this.f77584a.getToolIv().setScaleX(1.0f);
                    this.f77584a.getToolIv().setScaleY(1.0f);
                }
                com.ss.android.ugc.aweme.base.c.b(this.f77584a.getToolIv(), (UrlModel) pair.getFirst());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "b", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.gamora.editor.e$e  reason: collision with other inner class name */
    static final class C0818e<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f77585a;

        C0818e(View view) {
            this.f77585a = view;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                View view = this.f77585a;
                Intrinsics.checkExpressionValueIsNotNull(bool, AdvanceSetting.NETWORK_TYPE);
                view.setEnabled(bool.booleanValue());
                if (bool.booleanValue()) {
                    this.f77585a.setAlpha(1.0f);
                } else {
                    this.f77585a.setAlpha(0.5f);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "b", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class f<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f77586a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f77587b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f77588c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f77589d;

        f(e eVar, int i, View view, int i2) {
            this.f77586a = eVar;
            this.f77587b = i;
            this.f77588c = view;
            this.f77589d = i2;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            int i2;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                e eVar = this.f77586a;
                int i3 = this.f77587b;
                Intrinsics.checkExpressionValueIsNotNull(bool, AdvanceSetting.NETWORK_TYPE);
                boolean booleanValue = bool.booleanValue();
                View view = this.f77588c;
                int i4 = this.f77589d;
                if (i3 != 4) {
                    if (i3 != 6) {
                        switch (i3) {
                            case 1:
                                if (booleanValue) {
                                    com.bytedance.ies.dmt.ui.a.b a2 = new b.a(eVar.f77578b).b((int) C0906R.string.a_j).a(5000).a(true).a();
                                    float e2 = ((float) (a2.e() - view.getMeasuredWidth())) + UIUtils.dip2Px(eVar.f77578b, 8.0f);
                                    float dip2Px = UIUtils.dip2Px(eVar.f77578b, 3.0f) + e2;
                                    if (!eVar.f77579c.h()) {
                                        a2.a(view, 80, dip2Px, -((int) e2));
                                    } else if (ey.a((Context) eVar.f77578b)) {
                                        a2.a(view, 48, dip2Px, -((int) e2));
                                    } else {
                                        a2.a(view, 48, 4.0f, -((int) UIUtils.dip2Px(eVar.f77578b, 12.0f)));
                                    }
                                    s.a("music", true);
                                    r.a("function_toast_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "video_edit_page").a("type", "music").f34114b);
                                    break;
                                }
                                break;
                            case 2:
                                if (booleanValue) {
                                    if (eVar.f77579c.g() || (com.ss.android.ugc.aweme.port.in.a.L.a(e.a.CombinedShootModeTipShown) && eVar.f77579c.b().mOrigin == 0)) {
                                        if (eVar.f77577a == null) {
                                            b.a aVar = new b.a(eVar.f77578b);
                                            if (eVar.f77579c.g()) {
                                                i2 = C0906R.string.a_i;
                                            } else {
                                                i2 = C0906R.string.a_q;
                                            }
                                            eVar.f77577a = aVar.b(i2).a(5000).a(true).a();
                                        }
                                        com.bytedance.ies.dmt.ui.a.b bVar = eVar.f77577a;
                                        if (bVar != null) {
                                            bVar.a(view, 48, UIUtils.dip2Px(eVar.f77578b, 3.0f), 0);
                                            if (!eVar.f77579c.g()) {
                                                com.ss.android.ugc.aweme.port.in.a.L.a(e.a.CombinedShootModeTipShown, false);
                                                break;
                                            } else {
                                                s.a("effect", true);
                                                r.a("function_toast_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "video_edit_page").a("type", "effect").f34114b);
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    com.bytedance.ies.dmt.ui.a.b bVar2 = eVar.f77577a;
                                    if (bVar2 != null && bVar2.isShowing()) {
                                        bVar2.dismiss();
                                        break;
                                    }
                                }
                                break;
                        }
                    } else if (booleanValue) {
                        com.bytedance.ies.dmt.ui.a.b a3 = new b.a(eVar.f77578b).b((int) C0906R.string.a_m).a(5000).a(true).a();
                        float e3 = ((float) (a3.e() - view.getMeasuredWidth())) + UIUtils.dip2Px(eVar.f77578b, 8.0f);
                        float dip2Px2 = UIUtils.dip2Px(eVar.f77578b, 3.0f) + e3;
                        if (eVar.f77579c.f() == 2) {
                            if (ey.a((Context) eVar.f77578b)) {
                                i = 5;
                            } else {
                                i = 3;
                            }
                            a3.a(view, i, true);
                        } else {
                            a3.a(view, 80, dip2Px2, -((int) e3));
                        }
                        s.a("voice", true);
                        r.a("function_toast_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "video_edit_page").a("type", "voice").f34114b);
                    }
                } else if (booleanValue) {
                    new b.a(eVar.f77578b).b((int) C0906R.string.a_l).a(5000).a(true).a().a(view, 48, true);
                    s.a("sticker", true);
                    r.a("function_toast_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "video_edit_page").a("type", "info_sticker").f34114b);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "b", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class g<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f77590a;

        g(View view) {
            this.f77590a = view;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                View view = this.f77590a;
                Intrinsics.checkExpressionValueIsNotNull(bool, AdvanceSetting.NETWORK_TYPE);
                if (bool.booleanValue()) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "v", "", "onChanged", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
    static final class h<T> implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f77591a;

        h(View view) {
            this.f77591a = view;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                ViewGroup.LayoutParams layoutParams = this.f77591a.getLayoutParams();
                if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
                    layoutParams = null;
                }
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                if (layoutParams2 != null) {
                    layoutParams2.rightMargin = num.intValue();
                }
                if (Build.VERSION.SDK_INT >= 17 && layoutParams2 != null) {
                    Intrinsics.checkExpressionValueIsNotNull(num, AdvanceSetting.NETWORK_TYPE);
                    layoutParams2.setMarginEnd(num.intValue());
                }
                this.f77591a.requestLayout();
            }
        }
    }

    public final void a(@NotNull View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f77580d.n().observe(this.f77578b, new h(view));
    }

    public final void a(@NotNull com.ss.android.ugc.aweme.shortvideo.edit.f fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "item");
        this.f77580d.r().observe(this.f77578b, new a(fVar));
    }

    public final void a(@NotNull com.ss.android.ugc.aweme.shortvideo.edit.d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "item");
        this.f77580d.k().observe(this.f77578b, new b(dVar));
        this.f77580d.l().observe(this.f77578b, new c(dVar));
        this.f77580d.m().observe(this.f77578b, new d(dVar));
    }

    public final void b(@NotNull Map<Integer, ? extends View> map) {
        Intrinsics.checkParameterIsNotNull(map, "map");
        for (Map.Entry next : map.entrySet()) {
            int intValue = ((Number) next.getKey()).intValue();
            View view = (View) next.getValue();
            MutableLiveData mutableLiveData = this.f77580d.g().get(Integer.valueOf(intValue));
            if (mutableLiveData != null) {
                mutableLiveData.observe(this.f77578b, new C0818e(view));
            }
        }
    }

    public final void a(@NotNull Map<Integer, ? extends View> map) {
        Intrinsics.checkParameterIsNotNull(map, "map");
        for (Map.Entry next : map.entrySet()) {
            int intValue = ((Number) next.getKey()).intValue();
            View view = (View) next.getValue();
            MutableLiveData mutableLiveData = this.f77580d.f().get(Integer.valueOf(intValue));
            if (mutableLiveData != null) {
                mutableLiveData.observe(this.f77578b, new g(view));
            }
        }
    }

    public final void a(@NotNull Map<Integer, ? extends View> map, int i) {
        Intrinsics.checkParameterIsNotNull(map, "map");
        for (Map.Entry next : map.entrySet()) {
            int intValue = ((Number) next.getKey()).intValue();
            View view = (View) next.getValue();
            MutableLiveData mutableLiveData = this.f77580d.h().get(Integer.valueOf(intValue));
            if (mutableLiveData != null) {
                mutableLiveData.observe(this.f77578b, new f(this, intValue, view, i));
            }
        }
    }

    public e(@NotNull FragmentActivity fragmentActivity, @NotNull EditViewModel editViewModel, @NotNull EditToolbarViewModel editToolbarViewModel) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(editViewModel, "editViewModel");
        Intrinsics.checkParameterIsNotNull(editToolbarViewModel, "editToolbarViewModel");
        this.f77578b = fragmentActivity;
        this.f77579c = editViewModel;
        this.f77580d = editToolbarViewModel;
    }
}
