package com.ss.android.ugc.aweme.choosemusic.widgets;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.choosemusic.b.e;
import com.ss.android.ugc.aweme.choosemusic.d.r;
import com.ss.android.ugc.aweme.choosemusic.f.c;
import com.ss.android.ugc.aweme.choosemusic.viewholder.MusicRadioViewHolder;
import com.ss.android.ugc.aweme.music.adapter.d;
import com.ss.android.ugc.aweme.music.adapter.f;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0005¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0002J\u0018\u0010\u0019\u001a\u00020\u00152\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0002J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0007J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0015H\u0002J\u0012\u0010#\u001a\u00020\u00152\b\u0010$\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010%\u001a\u00020\u0015H\u0016J\u0006\u0010&\u001a\u00020\u0015J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\tJ\u0016\u0010)\u001a\u00020\u00002\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fJ\u000e\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/android/ugc/aweme/choosemusic/widgets/MusicRadioWidget;", "Lcom/ss/android/ugc/aweme/arch/widgets/ListItemWidget;", "Lcom/ss/android/ugc/aweme/choosemusic/viewholder/MusicRadioViewHolder;", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/arch/widgets/base/KVData;", "()V", "mCurrentPlayIndex", "", "mISelectMusic", "Lcom/ss/android/ugc/aweme/choosemusic/listener/ISelectMusicListener;", "mIsLoadMore", "", "mMusicMobBean", "Lcom/ss/android/ugc/aweme/choosemusic/MusicMobBean;", "mOnInternalEventListener", "Lcom/ss/android/ugc/aweme/music/adapter/OnInternalEventListener;", "Lcom/ss/android/ugc/aweme/choosemusic/event/NewMusicInternalEvent;", "mPosition", "mPostSelectMusicListener", "Lcom/ss/android/ugc/aweme/choosemusic/listener/PostSelectMusicListener;", "bindMusicData", "", "music", "", "Lcom/ss/android/ugc/aweme/shortvideo/model/MusicModel;", "bindMusicRadioData", "blockItems", "", "Lcom/ss/android/ugc/aweme/choosemusic/model/IMusicBlockItem;", "bindPosition", "position", "bindViewHolder", "view", "Lcom/ss/android/ugc/aweme/arch/widgets/ItemWidgetViewHolder;", "loadMoreData", "onChanged", "kvData", "onCreate", "resetPlaying", "setISelectMusic", "ISelectMusic", "setOnInternalEventListener", "listener", "setPostSelectMusicListener", "postSelectMusicListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class MusicRadioWidget extends ListItemWidget<MusicRadioViewHolder> implements Observer<com.ss.android.ugc.aweme.arch.widgets.base.a> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f36176b;
    public com.ss.android.ugc.aweme.choosemusic.a k;
    public int l = -1;
    public com.ss.android.ugc.aweme.choosemusic.b.b m;
    public f<com.ss.android.ugc.aweme.choosemusic.a.b> n;
    public e o;
    private int p = -1;
    private boolean q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "viewHolder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "kotlin.jvm.PlatformType", "view", "Landroid/view/View;", "model", "Lcom/ss/android/ugc/aweme/shortvideo/model/MusicModel;", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36177a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MusicRadioWidget f36178b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f36179c;

        a(MusicRadioWidget musicRadioWidget, List list) {
            this.f36178b = musicRadioWidget;
            this.f36179c = list;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: com.ss.android.ugc.aweme.shortvideo.model.MusicModel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: android.os.Bundle} */
        /* JADX WARNING: type inference failed for: r2v19 */
        /* JADX WARNING: type inference failed for: r2v30 */
        /* JADX WARNING: type inference failed for: r2v31 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.support.v7.widget.RecyclerView.ViewHolder r22, android.view.View r23, com.ss.android.ugc.aweme.shortvideo.model.MusicModel r24) {
            /*
                r21 = this;
                r7 = r21
                r8 = r22
                r9 = r23
                r10 = r24
                r11 = 3
                java.lang.Object[] r0 = new java.lang.Object[r11]
                r12 = 0
                r0[r12] = r8
                r13 = 1
                r0[r13] = r9
                r14 = 2
                r0[r14] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f36177a
                java.lang.Class[] r5 = new java.lang.Class[r11]
                java.lang.Class<android.support.v7.widget.RecyclerView$ViewHolder> r1 = android.support.v7.widget.RecyclerView.ViewHolder.class
                r5[r12] = r1
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r5[r13] = r1
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r1 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.class
                r5[r14] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 27018(0x698a, float:3.786E-41)
                r1 = r21
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0054
                java.lang.Object[] r0 = new java.lang.Object[r11]
                r0[r12] = r8
                r0[r13] = r9
                r0[r14] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f36177a
                r3 = 0
                r4 = 27018(0x698a, float:3.786E-41)
                java.lang.Class[] r5 = new java.lang.Class[r11]
                java.lang.Class<android.support.v7.widget.RecyclerView$ViewHolder> r1 = android.support.v7.widget.RecyclerView.ViewHolder.class
                r5[r12] = r1
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r5[r13] = r1
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r1 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.class
                r5[r14] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r21
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0054:
                boolean r0 = r8 instanceof com.ss.android.ugc.aweme.choosemusic.viewholder.MusicRadioViewHolder
                if (r0 != 0) goto L_0x0059
                return
            L_0x0059:
                if (r10 != 0) goto L_0x0070
                java.util.List r0 = r7.f36179c
                java.util.Collection r0 = (java.util.Collection) r0
                if (r0 == 0) goto L_0x0067
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0068
            L_0x0067:
                r12 = 1
            L_0x0068:
                if (r12 == 0) goto L_0x006f
                com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget r0 = r7.f36178b
                r0.e()
            L_0x006f:
                return
            L_0x0070:
                java.lang.String r0 = "view"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r9, r0)
                int r0 = r23.getId()
                r1 = 2131167671(0x7f0709b7, float:1.7949622E38)
                if (r0 != r1) goto L_0x0183
                com.ss.android.ugc.aweme.framework.core.a r0 = com.ss.android.ugc.aweme.framework.core.a.b()
                java.lang.String r1 = "AppTracker.get()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                android.app.Activity r0 = r0.a()
                if (r0 != 0) goto L_0x0090
                java.lang.String r0 = ""
                goto L_0x0097
            L_0x0090:
                r1 = 2131559966(0x7f0d061e, float:1.874529E38)
                java.lang.String r0 = r0.getString(r1)
            L_0x0097:
                com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                java.lang.Class<com.ss.android.ugc.aweme.IAccountService> r2 = com.ss.android.ugc.aweme.IAccountService.class
                java.lang.Object r1 = r1.getService(r2)
                com.ss.android.ugc.aweme.IAccountService r1 = (com.ss.android.ugc.aweme.IAccountService) r1
                com.ss.android.ugc.aweme.IAccountUserService r1 = r1.userService()
                java.lang.String r2 = "ServiceManager.get().get…class.java).userService()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                boolean r1 = r1.isLogin()
                r2 = 0
                if (r1 != 0) goto L_0x00e6
                com.ss.android.ugc.aweme.framework.core.a r1 = com.ss.android.ugc.aweme.framework.core.a.b()
                java.lang.String r3 = "AppTracker.get()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
                android.app.Activity r1 = r1.a()
                java.lang.String r3 = com.ss.android.ugc.aweme.choosemusic.f.d.a((int) r12)
                java.lang.String r4 = "click_favorite_music"
                boolean r5 = com.ss.android.ugc.aweme.i18n.c.a()
                if (r5 != 0) goto L_0x00e2
                r5 = r0
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                boolean r5 = android.text.TextUtils.isEmpty(r5)
                if (r5 == 0) goto L_0x00d6
                goto L_0x00e2
            L_0x00d6:
                com.ss.android.ugc.aweme.utils.ad r2 = com.ss.android.ugc.aweme.utils.ad.a()
                java.lang.String r5 = "login_title"
                com.ss.android.ugc.aweme.utils.ad r0 = r2.a((java.lang.String) r5, (java.lang.String) r0)
                android.os.Bundle r2 = r0.f75487b
            L_0x00e2:
                com.ss.android.ugc.aweme.login.e.a((android.app.Activity) r1, (java.lang.String) r3, (java.lang.String) r4, (android.os.Bundle) r2)
                return
            L_0x00e6:
                r0 = r8
                com.ss.android.ugc.aweme.choosemusic.viewholder.MusicRadioViewHolder r0 = (com.ss.android.ugc.aweme.choosemusic.viewholder.MusicRadioViewHolder) r0
                java.lang.Object[] r14 = new java.lang.Object[r12]
                com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.choosemusic.viewholder.MusicRadioViewHolder.f36129c
                r17 = 0
                r18 = 26935(0x6937, float:3.7744E-41)
                java.lang.Class[] r1 = new java.lang.Class[r12]
                java.lang.Class r20 = java.lang.Void.TYPE
                r15 = r0
                r19 = r1
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
                if (r1 == 0) goto L_0x0110
                java.lang.Object[] r11 = new java.lang.Object[r12]
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.choosemusic.viewholder.MusicRadioViewHolder.f36129c
                r14 = 0
                r15 = 26935(0x6937, float:3.7744E-41)
                java.lang.Class[] r1 = new java.lang.Class[r12]
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x0165
            L_0x0110:
                java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r1 = r0.s
                if (r1 == 0) goto L_0x011d
                int r3 = r0.t
                java.lang.Object r1 = kotlin.collections.CollectionsKt.getOrNull(r1, r3)
                com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r1
                goto L_0x011e
            L_0x011d:
                r1 = r2
            L_0x011e:
                if (r1 == 0) goto L_0x0165
                java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r1 = r0.s
                if (r1 == 0) goto L_0x012d
                int r3 = r0.t
                java.lang.Object r1 = kotlin.collections.CollectionsKt.getOrNull(r1, r3)
                com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r1
                goto L_0x012e
            L_0x012d:
                r1 = r2
            L_0x012e:
                android.content.Context r3 = r0.u
                boolean r1 = com.ss.android.ugc.aweme.music.util.d.a((com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r1, (android.content.Context) r3, (boolean) r13)
                if (r1 == 0) goto L_0x0165
                com.ss.android.ugc.aweme.music.adapter.f<com.ss.android.ugc.aweme.choosemusic.a.b> r1 = r0.r
                if (r1 == 0) goto L_0x0159
                java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r3 = r0.s
                if (r3 == 0) goto L_0x0146
                int r2 = r0.t
                java.lang.Object r2 = kotlin.collections.CollectionsKt.getOrNull(r3, r2)
                com.ss.android.ugc.aweme.shortvideo.model.MusicModel r2 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r2
            L_0x0146:
                boolean r3 = r0.v
                if (r3 == 0) goto L_0x014d
                java.lang.String r3 = "unfollow_type"
                goto L_0x014f
            L_0x014d:
                java.lang.String r3 = "follow_type"
            L_0x014f:
                int r4 = r0.t
                com.ss.android.ugc.aweme.choosemusic.a.b r5 = new com.ss.android.ugc.aweme.choosemusic.a.b
                r5.<init>(r2, r3, r12, r4)
                r1.a(r5)
            L_0x0159:
                boolean r1 = r0.v
                r1 = r1 ^ r13
                r0.v = r1
                com.ss.android.ugc.aweme.music.ui.CheckableImageView r1 = r0.k
                if (r1 == 0) goto L_0x0165
                r1.b()
            L_0x0165:
                com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget r1 = r7.f36178b
                com.ss.android.ugc.aweme.choosemusic.a r1 = r1.k
                if (r1 == 0) goto L_0x016f
                java.lang.String r2 = "click_button"
                r1.f35733c = r2
            L_0x016f:
                boolean r1 = r0.v
                java.lang.String r2 = r24.getMusicId()
                com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget r3 = r7.f36178b
                com.ss.android.ugc.aweme.choosemusic.a r3 = r3.k
                int r0 = r0.t
                com.ss.android.ugc.aweme.feed.model.LogPbBean r4 = r24.getLogPb()
                com.ss.android.ugc.aweme.choosemusic.f.c.a((boolean) r1, (java.lang.String) r2, (com.ss.android.ugc.aweme.choosemusic.a) r3, (int) r0, (com.ss.android.ugc.aweme.feed.model.LogPbBean) r4)
                return
            L_0x0183:
                r1 = 2131168222(0x7f070bde, float:1.795074E38)
                r2 = 2131168263(0x7f070c07, float:1.7950823E38)
                r3 = 2131168187(0x7f070bbb, float:1.7950669E38)
                if (r0 == r1) goto L_0x01ca
                if (r0 == r3) goto L_0x01ca
                if (r0 != r2) goto L_0x0193
                goto L_0x01ca
            L_0x0193:
                r1 = 2131168264(0x7f070c08, float:1.7950825E38)
                if (r0 != r1) goto L_0x01c9
                com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget r0 = r7.f36178b
                com.ss.android.ugc.aweme.choosemusic.a r0 = r0.k
                if (r0 == 0) goto L_0x01a2
                java.lang.String r1 = ""
                r0.f35733c = r1
            L_0x01a2:
                com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget r0 = r7.f36178b
                com.ss.android.ugc.aweme.choosemusic.b.e r0 = r0.o
                if (r0 == 0) goto L_0x01ad
                r1 = 8
                r0.b(r1)
            L_0x01ad:
                com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget r0 = r7.f36178b
                com.ss.android.ugc.aweme.choosemusic.b.b r0 = r0.m
                if (r0 == 0) goto L_0x01b6
                r0.b(r10)
            L_0x01b6:
                com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget r0 = r7.f36178b
                com.ss.android.ugc.aweme.choosemusic.a r0 = r0.k
                java.lang.String r1 = r24.getMusicId()
                com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget r2 = r7.f36178b
                int r2 = r2.l
                com.ss.android.ugc.aweme.feed.model.LogPbBean r3 = r24.getLogPb()
                com.ss.android.ugc.aweme.choosemusic.f.c.a((com.ss.android.ugc.aweme.choosemusic.a) r0, (java.lang.String) r1, (int) r2, (com.ss.android.ugc.aweme.feed.model.LogPbBean) r3)
            L_0x01c9:
                return
            L_0x01ca:
                com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget r0 = r7.f36178b
                com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r0.g
                java.lang.String r1 = "music_position"
                r4 = -1
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                java.lang.Object r0 = r0.b((java.lang.String) r1, r5)
                java.lang.Integer r0 = (java.lang.Integer) r0
                com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget r1 = r7.f36178b
                int r1 = r1.l
                if (r0 != 0) goto L_0x01e2
                goto L_0x0226
            L_0x01e2:
                int r0 = r0.intValue()
                if (r0 != r1) goto L_0x0226
                com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget r0 = r7.f36178b
                com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r0.g
                java.lang.String r1 = "music_index"
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                java.lang.Object r0 = r0.b((java.lang.String) r1, r5)
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1 = r8
                com.ss.android.ugc.aweme.choosemusic.viewholder.MusicRadioViewHolder r1 = (com.ss.android.ugc.aweme.choosemusic.viewholder.MusicRadioViewHolder) r1
                int r1 = r1.t
                if (r0 != 0) goto L_0x0200
                goto L_0x0226
            L_0x0200:
                int r0 = r0.intValue()
                if (r0 != r1) goto L_0x0226
                com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget r0 = r7.f36178b
                com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r0.g
                java.lang.String r1 = "music_position"
                java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
                r0.a((java.lang.String) r1, (java.lang.Object) r2)
                com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget r0 = r7.f36178b
                com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r0.g
                java.lang.String r1 = "music_index"
                java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
                r0.a((java.lang.String) r1, (java.lang.Object) r2)
                com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget r0 = r7.f36178b
                r0.f()
                return
            L_0x0226:
                r0 = r8
                com.ss.android.ugc.aweme.choosemusic.viewholder.MusicRadioViewHolder r0 = (com.ss.android.ugc.aweme.choosemusic.viewholder.MusicRadioViewHolder) r0
                int r1 = r0.t
                com.ss.android.ugc.aweme.choosemusic.f.c.a((int) r1)
                com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget r1 = r7.f36178b
                com.ss.android.ugc.aweme.choosemusic.a r1 = r1.k
                if (r1 == 0) goto L_0x0241
                int r4 = r23.getId()
                if (r4 != r3) goto L_0x023d
                java.lang.String r3 = "click_start_your_fm"
                goto L_0x023f
            L_0x023d:
                java.lang.String r3 = "click_play_icon"
            L_0x023f:
                r1.f35733c = r3
            L_0x0241:
                int r1 = r23.getId()
                if (r1 != r2) goto L_0x0260
                java.lang.String r1 = r24.getMusicId()
                com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget r2 = r7.f36178b
                com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r2.g
                java.lang.String r3 = "last_play_music_id"
                java.lang.String r4 = ""
                java.lang.Object r2 = r2.b((java.lang.String) r3, r4)
                java.lang.String r2 = (java.lang.String) r2
                com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget r3 = r7.f36178b
                com.ss.android.ugc.aweme.choosemusic.a r3 = r3.k
                com.ss.android.ugc.aweme.choosemusic.f.c.a((java.lang.String) r1, (java.lang.String) r2, (com.ss.android.ugc.aweme.choosemusic.a) r3)
            L_0x0260:
                com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget r1 = r7.f36178b
                r1.f()
                r0.a((boolean) r13, (boolean) r13)
                com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget r1 = r7.f36178b
                com.ss.android.ugc.aweme.choosemusic.b.b r1 = r1.m
                if (r1 == 0) goto L_0x0278
                com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget$a$1 r2 = new com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget$a$1
                r2.<init>(r7)
                com.ss.android.ugc.aweme.music.ui.p$a r2 = (com.ss.android.ugc.aweme.music.ui.p.a) r2
                r1.a((com.ss.android.ugc.aweme.music.ui.p.a) r2)
            L_0x0278:
                com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget r1 = r7.f36178b
                com.ss.android.ugc.aweme.choosemusic.b.b r1 = r1.m
                if (r1 == 0) goto L_0x0285
                com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget r2 = r7.f36178b
                com.ss.android.ugc.aweme.choosemusic.a r2 = r2.k
                r1.a(r10, r2)
            L_0x0285:
                com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget r1 = r7.f36178b
                com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r1.g
                java.lang.String r2 = "music_position"
                com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget r3 = r7.f36178b
                int r3 = r3.l
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1.a((java.lang.String) r2, (java.lang.Object) r3)
                com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget r1 = r7.f36178b
                com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r1.g
                java.lang.String r2 = "music_index"
                int r0 = r0.t
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1.a((java.lang.String) r2, (java.lang.Object) r0)
                com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget r0 = r7.f36178b
                com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r0.g
                java.lang.String r1 = "music_loading"
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                r0.a((java.lang.String) r1, (java.lang.Object) r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget.a.a(android.support.v7.widget.RecyclerView$ViewHolder, android.view.View, com.ss.android.ugc.aweme.shortvideo.model.MusicModel):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/choosemusic/widgets/MusicRadioWidget$bindViewHolder$1", "Lcom/ss/android/ugc/aweme/choosemusic/viewholder/MusicRadioViewHolder$OnLoadMoreLisenter;", "loadMore", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements MusicRadioViewHolder.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36182a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MusicRadioWidget f36183b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f36182a, false, 27020, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f36182a, false, 27020, new Class[0], Void.TYPE);
                return;
            }
            this.f36183b.e();
        }

        b(MusicRadioWidget musicRadioWidget) {
            this.f36183b = musicRadioWidget;
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f36176b, false, 27014, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36176b, false, 27014, new Class[0], Void.TYPE);
        } else if (!this.q) {
            this.q = true;
            this.g.a("should_load_more_pick", (Object) Boolean.TRUE);
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f36176b, false, 27017, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36176b, false, 27017, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.choosemusic.b.b bVar = this.m;
        if (bVar != null) {
            bVar.a((MusicModel) null);
        }
    }

    public final void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f36176b, false, 27011, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36176b, false, 27011, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        Observer observer = this;
        this.g.a("music_index", observer).a("music_collect_status", observer).a("status_pick_load_more", observer).a("pick_list_more", observer).a("play_compeleted", observer).a("play_error", observer).a("music_loading", observer);
    }

    public final void a(@NotNull ItemWidgetViewHolder itemWidgetViewHolder) {
        ItemWidgetViewHolder itemWidgetViewHolder2 = itemWidgetViewHolder;
        if (PatchProxy.isSupport(new Object[]{itemWidgetViewHolder2}, this, f36176b, false, 27013, new Class[]{ItemWidgetViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{itemWidgetViewHolder2}, this, f36176b, false, 27013, new Class[]{ItemWidgetViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(itemWidgetViewHolder2, "view");
        super.a(itemWidgetViewHolder);
        List list = (List) this.g.a("list");
        this.k = new com.ss.android.ugc.aweme.choosemusic.a("change_music_page", "my_fm", "click_start_your_fm", c.a());
        com.ss.android.ugc.aweme.choosemusic.a aVar = this.k;
        if (aVar != null) {
            aVar.h = true;
        }
        if (PatchProxy.isSupport(new Object[]{list}, this, f36176b, false, 27015, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f36176b, false, 27015, new Class[]{List.class}, Void.TYPE);
        } else if (list != null && this.l < list.size()) {
            Object obj = list.get(this.l);
            if (obj != null) {
                List<MusicModel> list2 = ((r) obj).f35857b;
                if (PatchProxy.isSupport(new Object[]{list2}, this, f36176b, false, 27016, new Class[]{List.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{list2}, this, f36176b, false, 27016, new Class[]{List.class}, Void.TYPE);
                } else {
                    MusicRadioViewHolder musicRadioViewHolder = (MusicRadioViewHolder) this.f34346a;
                    if (PatchProxy.isSupport(new Object[]{list2}, musicRadioViewHolder, MusicRadioViewHolder.f36129c, false, 26933, new Class[]{List.class}, Void.TYPE)) {
                        MusicRadioViewHolder musicRadioViewHolder2 = musicRadioViewHolder;
                        PatchProxy.accessDispatch(new Object[]{list2}, musicRadioViewHolder2, MusicRadioViewHolder.f36129c, false, 26933, new Class[]{List.class}, Void.TYPE);
                    } else {
                        musicRadioViewHolder.s = list2;
                        List<MusicModel> list3 = musicRadioViewHolder.s;
                        if (list3 != null && !list3.isEmpty()) {
                            musicRadioViewHolder.a(musicRadioViewHolder.t, false);
                        }
                    }
                    MusicRadioViewHolder musicRadioViewHolder3 = (MusicRadioViewHolder) this.f34346a;
                    d aVar2 = new a(this, list2);
                    if (PatchProxy.isSupport(new Object[]{aVar2}, musicRadioViewHolder3, MusicRadioViewHolder.f36129c, false, 26932, new Class[]{d.class}, Void.TYPE)) {
                        MusicRadioViewHolder musicRadioViewHolder4 = musicRadioViewHolder3;
                        PatchProxy.accessDispatch(new Object[]{aVar2}, musicRadioViewHolder4, MusicRadioViewHolder.f36129c, false, 26932, new Class[]{d.class}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(aVar2, "IOnClickListener");
                        musicRadioViewHolder3.q = aVar2;
                    }
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.choosemusic.model.MusicBlockItem");
            }
        }
        ((MusicRadioViewHolder) this.f34346a).r = this.n;
        ((MusicRadioViewHolder) this.f34346a).p = new b(this);
    }

    public final /* synthetic */ void onChanged(Object obj) {
        com.ss.android.ugc.aweme.arch.widgets.base.a aVar = (com.ss.android.ugc.aweme.arch.widgets.base.a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f36176b, false, 27012, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f36176b, false, 27012, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE);
            return;
        }
        if (this.f34346a != null) {
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            String str = aVar.f34376a;
            String str2 = null;
            int i = -1;
            switch (str.hashCode()) {
                case -1322093457:
                    if (str.equals("play_compeleted")) {
                        String str3 = (String) aVar.a();
                        MusicModel c2 = ((MusicRadioViewHolder) this.f34346a).c();
                        if (c2 != null) {
                            str2 = c2.getMusicId();
                        }
                        if (Intrinsics.areEqual((Object) str3, (Object) str2)) {
                            this.g.a("music_position", (Object) -1);
                            this.g.a("music_index", (Object) -1);
                            return;
                        }
                    }
                    break;
                case -60075939:
                    if (str.equals("status_pick_load_more")) {
                        this.q = false;
                        ((MusicRadioViewHolder) this.f34346a).a((List) null);
                        return;
                    }
                    break;
                case 502104354:
                    if (str.equals("music_loading")) {
                        Integer num = (Integer) this.g.a("music_position");
                        if (num != null) {
                            i = num.intValue();
                        }
                        if (this.l == i) {
                            Object a2 = this.g.a("music_loading");
                            Intrinsics.checkExpressionValueIsNotNull(a2, "mDataCenter[WidgetConstants.KEY_MUSIC_LOADING]");
                            ((MusicRadioViewHolder) this.f34346a).a(true, ((Boolean) a2).booleanValue());
                            break;
                        }
                    }
                    break;
                case 945257400:
                    if (str.equals("pick_list_more")) {
                        this.q = false;
                        ((MusicRadioViewHolder) this.f34346a).a((List) aVar.a());
                        return;
                    }
                    break;
                case 1579846200:
                    if (str.equals("music_index")) {
                        Integer num2 = (Integer) this.g.b("music_position", -1);
                        Integer num3 = (Integer) this.g.b("music_index", -1);
                        int i2 = this.l;
                        if (num2 != null && num2.intValue() == i2) {
                            int i3 = this.p;
                            if (num3 != null && i3 == num3.intValue()) {
                                ((MusicRadioViewHolder) this.f34346a).a(false, false);
                                com.ss.android.ugc.aweme.choosemusic.b.b bVar = this.m;
                                if (bVar != null) {
                                    bVar.a((MusicModel) null);
                                    break;
                                } else {
                                    return;
                                }
                            } else {
                                Intrinsics.checkExpressionValueIsNotNull(num3, "musicIndex");
                                this.p = num3.intValue();
                                return;
                            }
                        } else {
                            ((MusicRadioViewHolder) this.f34346a).a(false, false);
                            this.p = -1;
                            return;
                        }
                    }
                    break;
                case 1912965437:
                    if (str.equals("play_error")) {
                        String str4 = (String) aVar.a();
                        MusicModel c3 = ((MusicRadioViewHolder) this.f34346a).c();
                        if (c3 != null) {
                            str2 = c3.getMusicId();
                        }
                        if (Intrinsics.areEqual((Object) str4, (Object) str2)) {
                            this.g.a("music_position", (Object) -1);
                            this.g.a("music_index", (Object) -1);
                            return;
                        }
                    }
                    break;
            }
        }
    }
}
