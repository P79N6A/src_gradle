package com.ss.android.ugc.aweme.setting;

import android.content.Context;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakContainer;
import com.bytedance.dataplatform.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.account.util.n;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.feed.ag;
import com.ss.android.ugc.aweme.setting.api.AbTestApi;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.setting.model.LocalAbTestModel;
import com.ss.android.ugc.aweme.setting.model.MLModel;
import com.ss.android.ugc.aweme.setting.r;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.aweme.video.local.h;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.playerkit.c.c;
import java.util.Iterator;
import java.util.List;

public class AbTestManager implements r.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63777a;
    private static final AbTestModel y = new AbTestModel();
    private static volatile AbTestManager z;
    private Integer A;
    private Integer B;
    private Integer C;
    private Integer D;
    private Integer E;
    private Integer F;
    private Boolean G;
    private Boolean H;
    private Boolean I;
    private Boolean J;
    private AbTestModel K;
    private Integer L;
    private Boolean M;
    private Boolean N;
    private Boolean O;
    private Boolean P;
    private Integer Q;
    private Integer R;
    private Integer S;
    private Integer T;
    private Integer U;
    private Boolean V;
    private Integer W;
    private Integer X;
    private Integer Y;
    private Boolean Z;
    private Boolean aa;
    private Integer ab;
    private Integer ac;
    private Integer ad;
    private Boolean ae;
    private Boolean af;
    private Boolean ag;
    private Boolean ah;
    private Boolean ai;
    private Integer aj;
    private Boolean ak;

    /* renamed from: b  reason: collision with root package name */
    public Integer f63778b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f63779c;

    /* renamed from: d  reason: collision with root package name */
    public Integer f63780d;

    /* renamed from: e  reason: collision with root package name */
    public Integer f63781e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f63782f;
    public Integer g;
    public Boolean h;
    public Boolean i;
    public Integer j;
    public Boolean k;
    public Boolean l;
    public Integer m;
    public LocalAbTestModel n;
    public Boolean o;
    public Boolean p;
    public x q;
    public Integer r;
    public Integer s;
    public Boolean t;
    public Integer u;
    public Boolean v;
    public WeakContainer<a> w = new WeakContainer<>();
    public i x;

    @IntRange(from = 0, to = 1)
    public @interface ReplyStrategy {
    }

    public interface a {
        void onChanged();
    }

    public final boolean a(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f63777a, false, 71724, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f63777a, false, 71724, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return false;
        }
        switch (d2.showKeyboardStrategy) {
            case 1:
                if (i3 == 0) {
                    return true;
                }
                break;
            case 2:
                if (i3 < 3) {
                    return true;
                }
                break;
            case 3:
                if (i3 < 5) {
                    return true;
                }
                break;
        }
        return false;
    }

    public AbTestManager() {
        r.a().a(r.f64011d, (r.a) this);
    }

    private static Context co() {
        Context context;
        if (PatchProxy.isSupport(new Object[0], null, f63777a, true, 71657, new Class[0], Context.class)) {
            return (Context) PatchProxy.accessDispatch(new Object[0], null, f63777a, true, 71657, new Class[0], Context.class);
        }
        if (d.a() != null) {
            context = d.a();
        } else {
            context = GlobalContext.getContext();
        }
        return context;
    }

    @ReplyStrategy
    private int cp() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71777, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71777, new Class[0], Integer.TYPE)).intValue();
        } else if (com.ss.android.g.a.a()) {
            return 1;
        } else {
            AbTestModel d2 = d();
            if (d2 == null) {
                return 0;
            }
            return d2.replyStrategy;
        }
    }

    public final boolean A() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71709, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71709, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return false;
        }
        return d2.enableMockUIWatermark;
    }

    public final boolean B() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71710, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71710, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return false;
        }
        return d2.enableCaptionWatermark;
    }

    public final boolean C() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71711, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71711, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return false;
        }
        return d2.enableFriendsEnhanceFollowBack;
    }

    public final boolean D() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71713, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71713, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 != null) {
            i2 = d2.closeClientWatermark;
        } else {
            i2 = 0;
        }
        if (i2 == 1) {
            return true;
        }
        return false;
    }

    public final Integer H() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71723, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71723, new Class[0], Integer.class);
        }
        int i3 = 0;
        AbTestModel d2 = d();
        if (d2 != null) {
            int i4 = d2.feedTabNameVersion;
            if (i4 >= 0 && i4 <= 2) {
                i2 = i4;
            }
            i3 = Integer.valueOf(i2);
        }
        return i3;
    }

    public final boolean N() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71734, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71734, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null || d2.searchAwemeStaggered != 1) {
            return false;
        }
        return true;
    }

    public final boolean P() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71736, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71736, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.g.a.a()) {
            return false;
        } else {
            AbTestModel d2 = d();
            if (d2 == null || d2.categoryListUseV2 != 1) {
                return false;
            }
            return true;
        }
    }

    public final boolean Q() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71737, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71737, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.g.a.a()) {
            return true;
        } else {
            AbTestModel d2 = d();
            if (d2 == null || d2.newFollowFeedComment != 1) {
                return false;
            }
            return true;
        }
    }

    public final boolean R() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71738, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71738, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 != null && d2.enableFollowTabRecommendUser) {
            z2 = true;
        }
        return z2;
    }

    public final int S() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71739, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71739, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.linkSelectorType;
    }

    public final int T() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71741, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71741, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 != null) {
            i2 = d2.getdUseNewLoginStyle();
        }
        return i2;
    }

    public final boolean V() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71746, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71746, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return false;
        }
        return d2.feedDisplayInnerMsgPlatform;
    }

    public final boolean W() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71758, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71758, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 != null && d2.commerceOrderOpenType == 1) {
            return true;
        }
        return false;
    }

    public final int X() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71767, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71767, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.visibleGoods;
    }

    public final boolean Y() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71772, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71772, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return false;
        }
        return d2.openCommentFilter;
    }

    public final boolean Z() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71774, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71774, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (cp() == 1) {
            return true;
        } else {
            return false;
        }
    }

    public final int aA() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71842, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71842, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 1;
        }
        return d2.musicListType;
    }

    public final int aE() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71852, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71852, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.newHistorySug;
    }

    public final int aF() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71854, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71854, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.spotListStyle;
    }

    public final int aG() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71856, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71856, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.hotLiveEnterNewStyle;
    }

    public final boolean aH() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71857, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71857, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return false;
        }
        return d2.skyLightRecommendLive;
    }

    public final int aI() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71859, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71859, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.underageProtect;
    }

    public final int aJ() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71860, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71860, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 10;
        }
        return d2.ttnetThreadPriority;
    }

    public final boolean aK() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71864, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71864, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.g.a.a()) {
            return false;
        } else {
            AbTestModel d2 = d();
            if (d2 == null) {
                return false;
            }
            return d2.miniEmojiPanelEnabled;
        }
    }

    public final boolean aL() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71865, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71865, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 != null && d2.imFansVsStyle == 1) {
            return true;
        }
        return false;
    }

    public final boolean aM() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71867, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71867, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return false;
        }
        return d2.isCopyLinkQRCodeInFirstRow;
    }

    public final boolean aN() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71871, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71871, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return false;
        }
        return d2.enableGlobalTranslation;
    }

    public final boolean aO() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71872, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71872, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return false;
        }
        return d2.isMusicInstantSearchEnabled;
    }

    public final int aP() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71875, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71875, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.platformShareNotifyAhead;
    }

    public final int aQ() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71877, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71877, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.shareIconVariant;
    }

    public final int aR() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71881, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71881, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 != null) {
            return d2.douPlusEntryStyle;
        }
        return 1;
    }

    public final int aS() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71882, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71882, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 != null) {
            return d2.douPlusBringToFront;
        }
        return 0;
    }

    public final int aT() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71886, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71886, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.profileNavbarShareStyle;
    }

    public final boolean aU() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71887, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71887, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 != null) {
            i2 = d2.dongtaiStrategy;
        } else {
            i2 = 0;
        }
        if (i2 == 1) {
            return true;
        }
        return false;
    }

    public final boolean aV() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71888, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71888, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 != null) {
            i2 = d2.useProfileCollectionTab;
        } else {
            i2 = 0;
        }
        if (i2 == 1) {
            return true;
        }
        return false;
    }

    public final boolean aW() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71889, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71889, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 != null && d2.toUpdateShareIconToFavorite) {
            z2 = true;
        }
        return z2;
    }

    public final boolean aX() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71896, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71896, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 != null && d2.enableNewUserGuide) {
            z2 = true;
        }
        return z2;
    }

    public final int aY() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71897, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71897, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 != null) {
            return d2.gatherMode;
        }
        return 0;
    }

    public final int aZ() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71905, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71905, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 != null) {
            return d2.detailEnterAnimationTime;
        }
        return 0;
    }

    public final boolean aa() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71785, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71785, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (d().enableDynamicRate == 1) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean ab() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71786, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71786, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 != null && d2.outAppShareDirect == 1) {
            return true;
        }
        return false;
    }

    public final boolean ac() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71787, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71787, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 != null && d2.imQrcodeShareDirect == 1) {
            return true;
        }
        return false;
    }

    public final int ad() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71790, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71790, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.useLiveWallpaper;
    }

    public final int ae() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71792, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71792, new Class[0], Integer.TYPE)).intValue();
        } else if (com.ss.android.g.a.a()) {
            return 0;
        } else {
            AbTestModel d2 = d();
            if (d2 == null) {
                return 0;
            }
            return d2.closeWeiboEntry;
        }
    }

    public final int aj() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71799, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71799, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 21;
        }
        return d2.bindPhoneForPostComment;
    }

    public final int ak() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71800, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71800, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 21;
        }
        return d2.bindPhoneForPostAweme;
    }

    public final boolean am() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71808, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71808, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return false;
        }
        return d2.useVideoCacheHttpDns;
    }

    public final boolean an() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71811, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71811, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return false;
        }
        return d2.stopMainAnimWhenInvisible;
    }

    public final int ao() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71812, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71812, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.imShareShowUserIconPlan;
    }

    public final boolean ap() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71816, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71816, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return false;
        }
        return d2.mMusicTTDownload;
    }

    public final int aq() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71819, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71819, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 1;
        }
        return d2.userFollowingListSortType;
    }

    public final int ar() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71822, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71822, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.ttnetCookieEnable;
    }

    public final int at() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71826, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71826, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.searchInDetailMode;
    }

    public final int au() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71827, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71827, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.searchUserStyle;
    }

    public final int av() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71835, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71835, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.getFindFascinatingMode();
    }

    public final int aw() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71837, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71837, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.videoShowType;
    }

    public final int ax() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71838, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71838, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.videoCoverType;
    }

    public final boolean az() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71841, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71841, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 != null && d2.isHotAwemeBillboardEnable) {
            z2 = true;
        }
        return z2;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71659, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71659, new Class[0], Void.TYPE);
            return;
        }
        c();
        b.b();
    }

    public final boolean bA() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71972, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71972, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return false;
        }
        return d2.privacyReminder;
    }

    public final int bC() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71974, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71974, new Class[0], Integer.TYPE)).intValue();
        } else if (this.x != null) {
            return this.x.f63975a;
        } else {
            this.x = bB();
            return this.x.f63975a;
        }
    }

    public final int bD() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71975, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71975, new Class[0], Integer.TYPE)).intValue();
        } else if (this.x != null) {
            return this.x.f63976b;
        } else {
            this.x = bB();
            return this.x.f63976b;
        }
    }

    public final int bE() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71977, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71977, new Class[0], Integer.TYPE)).intValue();
        } else if (this.x != null) {
            return this.x.f63979e;
        } else {
            this.x = bB();
            return this.x.f63979e;
        }
    }

    public final int bF() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71978, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71978, new Class[0], Integer.TYPE)).intValue();
        } else if (this.x != null) {
            return this.x.f63978d;
        } else {
            this.x = bB();
            return this.x.f63978d;
        }
    }

    public final boolean bH() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71981, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71981, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null || d2.enableSwipeUpGuidStyle3 == 1) {
            return true;
        }
        return false;
    }

    public final boolean bI() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71982, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71982, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null || d2.enableTransitionToProfileGuid == 1) {
            return true;
        }
        return false;
    }

    public final boolean bJ() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71984, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71984, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null || d2.enableFollowHintGuid == 1) {
            return true;
        }
        return false;
    }

    public final boolean bK() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71988, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71988, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 != null && d2.enableNewUserDetailShareIcon == 1) {
            return true;
        }
        return false;
    }

    public final boolean bL() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71991, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71991, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return false;
        }
        return d2.enableLiveInFollowFeedFullScreen;
    }

    public final boolean bM() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71992, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71992, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return false;
        }
        return d2.enableFollowTabAutoRefreshWithoutTimeLimit;
    }

    public final int bN() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71993, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71993, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.followFeedSkyLiveStrategy;
    }

    public final int bO() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71994, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71994, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.secondTabFollowFeedSkyLiveStrategy;
    }

    public final int bP() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71995, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71995, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.followLiveSkylightAutoShowStrategy;
    }

    public final int bQ() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71996, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71996, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.profileFollowRelationStyle;
    }

    public final int bR() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71997, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71997, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null || com.ss.android.g.a.a()) {
            return 0;
        }
        return d2.profileTopicStyle;
    }

    public final int bS() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71998, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71998, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.decoderType;
    }

    public final int bT() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 72000, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 72000, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.followFeedDisplayStyle;
    }

    public final boolean bU() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 72001, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 72001, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return false;
        }
        return d2.enableFollowTabUnreadAlertInside;
    }

    public final int bW() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 72006, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 72006, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.motionMaxMinute;
    }

    public final boolean bX() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 72008, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 72008, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return true;
        }
        return d2.awemeSplashFirstLaunchEnabled;
    }

    public final boolean bY() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 72009, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 72009, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 != null && d2.enablePlayerAlog == 1) {
            return true;
        }
        return false;
    }

    public final boolean bZ() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 72011, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 72011, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return false;
        }
        return d2.enableCommentLikedByCreator;
    }

    public final int ba() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71906, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71906, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 4;
        }
        return d2.searchEggMaxWaitToShowTime;
    }

    public final boolean bb() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71909, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71909, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return false;
        }
        return d2.enableEndWaterMarkMT;
    }

    public final int bc() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71915, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71915, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.showRemarkIconStyle;
    }

    public final boolean bd() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71916, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71916, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return false;
        }
        return d2.enableH265BlackList;
    }

    public final Integer be() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71917, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71917, new Class[0], Integer.class);
        }
        int i3 = 0;
        AbTestModel d2 = d();
        if (d2 != null) {
            int i4 = d2.inviteWithTextOrPic;
            if (i4 >= 0 && i4 <= 1) {
                i2 = i4;
            }
            i3 = Integer.valueOf(i2);
        }
        return i3;
    }

    public final boolean bf() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71919, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71919, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 != null) {
            return d2.enableMultiPlayer;
        }
        return false;
    }

    public final int bg() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71920, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71920, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.webViewRadiusSolution;
    }

    public final boolean bh() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71925, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71925, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null || d2.enableShareSpecialQRCode != 1) {
            return false;
        }
        return true;
    }

    public final boolean bi() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71926, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71926, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 != null && d2.enableSyncToutiao) {
            z2 = true;
        }
        return z2;
    }

    public final int bj() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71927, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71927, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.secondTabLastStatus;
    }

    public final boolean bk() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71931, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71931, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 != null && d2.isFollowListRecommand()) {
            z2 = true;
        }
        return z2;
    }

    public final int bm() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71944, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71944, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.superResRatioLevel;
    }

    public final int bn() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71945, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71945, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.superResBitrate;
    }

    public final int bo() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71946, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71946, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.superRes265;
    }

    public final boolean bp() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71950, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71950, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return true;
        }
        return d2.h265PlayAddrPolicyUnify;
    }

    public final com.aweme.storage.a bq() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71952, new Class[0], com.aweme.storage.a.class)) {
            return (com.aweme.storage.a) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71952, new Class[0], com.aweme.storage.a.class);
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return null;
        }
        return d2.cacheStrategy;
    }

    public final int br() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71953, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71953, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.doubleTapToLikeStyle;
    }

    public final synchronized boolean bs() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71954, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71954, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return false;
        }
        return d2.swipeGuideStyle;
    }

    public final int bt() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71955, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71955, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 1;
        }
        return d2.showAds;
    }

    public final int bu() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71956, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71956, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.nonStdAdPost;
    }

    public final int bv() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71957, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71957, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.nonStdHotSearch;
    }

    public final int bw() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71958, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71958, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.nonStdMusicList;
    }

    public final boolean bx() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71963, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71963, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 != null && d2.isAntiAddictedSkipLoginEnable()) {
            z2 = true;
        }
        return z2;
    }

    public final boolean by() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71964, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71964, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 != null && d2.antiAddictedLoginGuideEnable) {
            z2 = true;
        }
        return z2;
    }

    public final void c() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71660, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71660, new Class[0], Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(com.ss.android.d.d.b()) && !TextUtils.equals(com.ss.android.d.d.b(), PushConstants.PUSH_TYPE_NOTIFY)) {
            z2 = true;
        }
        AbTestApi.a(z2);
    }

    public final boolean cb() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 72015, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 72015, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 != null && d2.groupChatSwitch == 1) {
            return true;
        }
        return false;
    }

    public final boolean cc() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 72019, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 72019, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return false;
        }
        return d2.supportSwipeBack;
    }

    public final int cd() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 72020, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 72020, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.microAppItemType;
    }

    public final boolean ce() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 72021, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 72021, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return false;
        }
        return d2.useFeedbackBubble;
    }

    public final boolean cf() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 72022, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 72022, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return false;
        }
        return d2.enableFullScreenAwemeTitleExpand;
    }

    public final boolean ci() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 72025, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 72025, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 != null && d2.newUserGuide4style == 1) {
            return true;
        }
        return false;
    }

    public final int cj() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 72027, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 72027, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (!com.ss.android.g.a.a() || d2 == null) {
            return 0;
        }
        return d2.showPlayCountType;
    }

    public final boolean ck() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 72028, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 72028, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return false;
        }
        return d2.isPresentDuetChain;
    }

    public final boolean cl() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 72030, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 72030, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (com.ss.android.g.a.a() || d2 == null) {
            return false;
        }
        return d2.showFeedTagGuideArrow;
    }

    public final boolean cm() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 72031, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 72031, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return false;
        }
        return d2.enableConcernLiveSlide;
    }

    public final int cn() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 72033, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 72033, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (!com.ss.android.g.a.a() || d2 == null) {
            return 0;
        }
        return d2.mtCopywritingSaveOrDownload;
    }

    public final int g() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71668, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71668, new Class[0], Integer.TYPE)).intValue();
        } else if (d() != null) {
            return d().newProfileLiveAvatarAnimation;
        } else {
            return 0;
        }
    }

    public final Integer k() {
        if (!PatchProxy.isSupport(new Object[0], this, f63777a, false, 71672, new Class[0], Integer.class)) {
            return 0;
        }
        return (Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71672, new Class[0], Integer.class);
    }

    public final int l() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71673, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71673, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (com.ss.android.g.a.a()) {
            return 0;
        }
        return d2.profileRecommendUserStrategy;
    }

    public final int m() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71674, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71674, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (!com.ss.android.g.a.a()) {
            return 0;
        }
        return d2.unifyNickname;
    }

    public final int n() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71675, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71675, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (com.ss.android.g.a.a()) {
            return 0;
        }
        return d2.profileRecommendUserUnreadStrategy;
    }

    public final int u() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71691, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71691, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 0;
        }
        return d2.teensModeDaysAlertCount;
    }

    public final int x() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71696, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71696, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 != null) {
            return d2.dislikeReasonsStyle;
        }
        return 0;
    }

    public final int z() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71708, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71708, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return 1;
        }
        return d2.followFeedVideoCutType;
    }

    public static AbTestManager a() {
        if (PatchProxy.isSupport(new Object[0], null, f63777a, true, 71658, new Class[0], AbTestManager.class)) {
            return (AbTestManager) PatchProxy.accessDispatch(new Object[0], null, f63777a, true, 71658, new Class[0], AbTestManager.class);
        }
        if (z == null) {
            synchronized (AbTestManager.class) {
                if (z == null) {
                    z = new AbTestManager();
                }
            }
        }
        return z;
    }

    public static boolean e() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], null, f63777a, true, 71663, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f63777a, true, 71663, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (com.ss.android.ugc.aweme.g.b.a() && a.b().b(co(), "ENABLED", false)) {
            z2 = true;
        }
        return z2;
    }

    public final int E() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71714, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71714, new Class[0], Integer.TYPE)).intValue();
        } else if (this.B != null) {
            return this.B.intValue();
        } else {
            AbTestModel d2 = d();
            if (d2 == null) {
                this.B = 1;
            } else {
                int i2 = d2.nearbyStyle;
                if (i2 <= 0 || i2 > 2) {
                    i2 = 1;
                }
                this.B = Integer.valueOf(i2);
            }
            return this.B.intValue();
        }
    }

    public final int F() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71715, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71715, new Class[0], Integer.TYPE)).intValue();
        } else if (this.C != null) {
            return this.C.intValue();
        } else {
            AbTestModel d2 = d();
            if (d2 == null) {
                this.C = 0;
            } else {
                int i3 = d2.refreshStyle;
                if (i3 >= 0 && i3 <= 1) {
                    i2 = i3;
                }
                this.C = Integer.valueOf(i2);
            }
            return this.C.intValue();
        }
    }

    public final Integer G() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71722, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71722, new Class[0], Integer.class);
        } else if (!com.ss.android.g.a.a()) {
            return 2;
        } else {
            if (this.F != null) {
                return this.F;
            }
            AbTestModel d2 = d();
            if (d2 == null) {
                this.F = 0;
            } else {
                int i3 = d2.followFeedStyle;
                if (i3 >= 0 && i3 <= 2) {
                    i2 = i3;
                }
                this.F = Integer.valueOf(i2);
            }
            return this.F;
        }
    }

    public final boolean I() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71725, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71725, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.g.a.a()) {
            return false;
        } else {
            if (this.E != null) {
                return this.E.equals(1);
            }
            AbTestModel d2 = d();
            if (d2 != null) {
                this.E = Integer.valueOf(d2.newFollowFeedStyle);
                return this.E.equals(1);
            }
            this.E = 1;
            return this.E.equals(1);
        }
    }

    public final boolean J() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71727, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71727, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.P != null) {
            return this.P.booleanValue();
        } else {
            AbTestModel d2 = d();
            if (d2 != null) {
                this.P = Boolean.valueOf(d2.isDescriptionAutoTranslate);
                return this.P.booleanValue();
            }
            this.P = Boolean.FALSE;
            return false;
        }
    }

    public final boolean K() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71728, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71728, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.N != null) {
            return this.N.booleanValue();
        } else {
            AbTestModel d2 = d();
            if (d2 != null) {
                this.N = Boolean.valueOf(d2.isProfilePureBackgroundStyle);
                return this.N.booleanValue();
            }
            this.N = Boolean.FALSE;
            return false;
        }
    }

    public final boolean L() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71729, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71729, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.O != null) {
            return this.O.booleanValue();
        } else {
            AbTestModel d2 = d();
            if (d2 != null) {
                this.O = Boolean.valueOf(d2.isBigselfIntroduce);
                return this.O.booleanValue();
            }
            this.O = Boolean.FALSE;
            return false;
        }
    }

    public final boolean M() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71730, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71730, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.M != null) {
            return this.M.booleanValue();
        } else {
            AbTestModel d2 = d();
            if (d2 != null) {
                this.M = Boolean.valueOf(d2.isfollowFeedShowForward);
                return this.M.booleanValue();
            }
            this.M = Boolean.FALSE;
            return false;
        }
    }

    public final boolean O() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71735, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71735, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.g.a.c()) {
            return false;
        } else {
            if (this.L == null) {
                AbTestModel d2 = d();
                if (d2 == null) {
                    this.L = 1;
                } else {
                    this.L = Integer.valueOf(d2.i18nNewFollowFeedStyle);
                }
            }
            return this.L.equals(1);
        }
    }

    public final int U() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71742, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71742, new Class[0], Integer.TYPE)).intValue();
        } else if (this.D != null) {
            return this.D.intValue();
        } else {
            AbTestModel d2 = d();
            if (d2 == null) {
                this.D = 0;
            } else {
                int i3 = d2.shareGuide;
                if (i3 >= 0 && i3 <= 2) {
                    i2 = i3;
                }
                this.D = Integer.valueOf(i2);
            }
            return this.D.intValue();
        }
    }

    public final int aB() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71844, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71844, new Class[0], Integer.TYPE)).intValue();
        } else if (this.T != null) {
            return this.T.intValue();
        } else {
            AbTestModel d2 = d();
            if (d2 == null) {
                this.T = 8;
            } else {
                this.T = Integer.valueOf(d2.followFeedDisplayType);
            }
            return this.T.intValue();
        }
    }

    public final int aC() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71847, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71847, new Class[0], Integer.TYPE)).intValue();
        } else if (this.U != null) {
            return this.U.intValue();
        } else {
            AbTestModel d2 = d();
            if (d2 == null) {
                this.U = 1;
            } else {
                this.U = Integer.valueOf(d2.followFeedLiveType);
            }
            return this.U.intValue();
        }
    }

    public final boolean aD() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71848, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71848, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.V != null) {
            return this.V.booleanValue();
        } else {
            AbTestModel d2 = d();
            if (d2 == null) {
                this.V = Boolean.FALSE;
            } else {
                this.V = Boolean.valueOf(d2.followFeedEnterFullScreenDetail);
            }
            return this.V.booleanValue();
        }
    }

    public final boolean af() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71793, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71793, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.g.a.a()) {
            return true;
        } else {
            if (this.ag != null) {
                return this.ag.booleanValue();
            }
            AbTestModel d2 = d();
            if (d2 != null) {
                this.ag = Boolean.valueOf(d2.breakResumeCheckEnabled);
            } else {
                this.ag = Boolean.TRUE;
            }
            return this.ag.booleanValue();
        }
    }

    public final boolean ag() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71794, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71794, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.g.a.a()) {
            return false;
        } else {
            if (this.ah != null) {
                return this.ah.booleanValue();
            }
            AbTestModel d2 = d();
            if (d2 != null) {
                this.ah = Boolean.valueOf(d2.forceRequestValidation);
            } else {
                this.ah = Boolean.FALSE;
            }
            return this.ah.booleanValue();
        }
    }

    public final boolean ah() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71795, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71795, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.g.a.a()) {
            return true;
        } else {
            if (this.ai != null) {
                return this.ai.booleanValue();
            }
            AbTestModel d2 = d();
            if (d2 != null) {
                this.ai = Boolean.valueOf(d2.playLinkSelectEnabled);
            } else {
                this.ai = Boolean.TRUE;
            }
            return this.ai.booleanValue();
        }
    }

    public final boolean al() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71804, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71804, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = d();
        if (d2 == null || !com.ss.android.g.a.c()) {
            return false;
        }
        if (d2.isEnableMultiAccountLogin() && n.c() == 0) {
            z2 = true;
        }
        return z2;
    }

    public final boolean as() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71823, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71823, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.R == null) {
            AbTestModel d2 = d();
            if (d2 == null) {
                this.R = 0;
            } else {
                this.R = Integer.valueOf(d2.isCarouselHotSearchWords);
            }
            if (this.R.intValue() == 1) {
                return true;
            }
            return false;
        } else if (this.R.intValue() == 1) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean ay() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71839, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71839, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.Q == null) {
            AbTestModel d2 = d();
            if (d2 == null) {
                this.Q = 0;
            } else {
                this.Q = Integer.valueOf(d2.isShowIndependenceRankingListEntrance);
            }
            if (this.Q.intValue() == 1) {
                return true;
            }
            return false;
        } else if (this.Q.intValue() == 1) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean bG() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71980, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71980, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.ak != null) {
            return this.ak.booleanValue();
        } else {
            AbTestModel d2 = d();
            boolean z2 = true;
            if (!(d2 == null || d2.banRecommendSlideStoryCarema == 1)) {
                z2 = false;
            }
            this.ak = Boolean.valueOf(z2);
            return this.ak.booleanValue();
        }
    }

    public final boolean bV() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 72002, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 72002, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.g.a.a()) {
            return false;
        } else {
            if (this.aa == null) {
                AbTestModel d2 = d();
                if (d2 == null) {
                    this.aa = Boolean.FALSE;
                } else {
                    this.aa = Boolean.valueOf(d2.enableFeedRefreshFromCache);
                }
            }
            return this.aa.booleanValue();
        }
    }

    public final Integer bl() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71935, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71935, new Class[0], Integer.class);
        } else if (this.S != null) {
            return this.S;
        } else {
            AbTestModel d2 = d();
            if (d2 == null) {
                return 0;
            }
            this.S = Integer.valueOf(d2.fullScreenFeedLiveDisplayType);
            return this.S;
        }
    }

    public final boolean bz() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71968, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71968, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.Z == null) {
            AbTestModel d2 = d();
            if (d2 == null) {
                this.Z = Boolean.FALSE;
            } else {
                this.Z = Boolean.valueOf(d2.revealVideoDownload);
            }
        }
        return this.Z.booleanValue();
    }

    public final boolean ca() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 72012, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 72012, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.g.a.a()) {
            return false;
        } else {
            if (this.ae == null) {
                AbTestModel d2 = d();
                if (d2 == null) {
                    this.ae = Boolean.FALSE;
                } else {
                    this.ae = Boolean.valueOf(d2.usePbForRecommendFeed);
                }
            }
            return this.ae.booleanValue();
        }
    }

    public final int cg() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 72023, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 72023, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.ac == null) {
            AbTestModel d2 = d();
            if (!com.ss.android.g.a.a() || d2 == null) {
                this.ac = 0;
            } else {
                this.ac = Integer.valueOf(d2.mUnloginDiggLimit);
            }
        }
        return this.ac.intValue();
    }

    public final int ch() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 72024, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 72024, new Class[0], Integer.TYPE)).intValue();
        } else if (!com.ss.android.g.a.a()) {
            return 0;
        } else {
            if (this.ad == null) {
                AbTestModel d2 = d();
                if (d2 == null) {
                    this.ad = 0;
                } else {
                    this.ad = Integer.valueOf(d2.mtLocationPopupType);
                }
            }
            return this.ad.intValue();
        }
    }

    public final AbTestModel d() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71661, new Class[0], AbTestModel.class)) {
            return (AbTestModel) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71661, new Class[0], AbTestModel.class);
        }
        ag.i().e();
        if (this.K == null) {
            AbTestModel abTestModel = null;
            if (e()) {
                abTestModel = (AbTestModel) a.b().a(co(), "ab_test_model", AbTestModel.class);
            }
            if (abTestModel == null) {
                abTestModel = (AbTestModel) b.b().a(co(), "ab_test_model", AbTestModel.class);
            }
            this.K = abTestModel;
            if (abTestModel == null) {
                abTestModel = y;
            }
            com.ss.android.ugc.aweme.cloudcontrol.b.b.a(abTestModel);
            ag.i().f();
            return abTestModel;
        }
        ag.i().f();
        return this.K;
    }

    public final LocalAbTestModel f() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71664, new Class[0], LocalAbTestModel.class)) {
            return (LocalAbTestModel) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71664, new Class[0], LocalAbTestModel.class);
        } else if (this.n == null) {
            return (LocalAbTestModel) com.ss.android.ugc.aweme.setting.ui.n.b().a(co(), "local_ab_test_model", LocalAbTestModel.class);
        } else {
            return this.n;
        }
    }

    public final boolean h() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71669, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71669, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.g.a.a() && d() != null) {
            return d().enableCompanyProfilePageOptimize;
        } else {
            return false;
        }
    }

    public final boolean i() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71670, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71670, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.g.a.a()) {
            if (this.af == null) {
                AbTestModel d2 = d();
                if (d2 != null) {
                    if (com.ss.android.g.a.c()) {
                        if (d2.userRecommendStrategy == 1) {
                            z2 = true;
                        }
                    }
                }
                this.af = Boolean.valueOf(z2);
            }
            return this.af.booleanValue();
        } else if (d() == null || d().userRecommend == 1) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean j() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71671, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71671, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.g.a.a() && d() != null && d().userRecommendCardEnhance == 1) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean o() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71678, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71678, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.Y == null) {
            AbTestModel d2 = d();
            if (d2 == null) {
                this.Y = 0;
                return false;
            }
            this.Y = Integer.valueOf(d2.longPressInDetailPage);
            if (this.Y.intValue() == 1) {
                return true;
            }
            return false;
        } else if (this.Y.intValue() == 1) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean p() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71680, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71680, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.I != null) {
            return this.I.booleanValue();
        } else {
            AbTestModel d2 = d();
            if (d2 == null) {
                this.I = Boolean.FALSE;
                return this.I.booleanValue();
            }
            this.I = Boolean.valueOf(d2.isTTNetInterceptWebview);
            return this.I.booleanValue();
        }
    }

    public final boolean q() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71681, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71681, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.J != null) {
            return this.J.booleanValue();
        } else {
            AbTestModel d2 = d();
            if (d2 == null) {
                this.J = Boolean.FALSE;
                return this.J.booleanValue();
            }
            this.J = Boolean.valueOf(d2.isTTNetInterceptAll);
            return this.J.booleanValue();
        }
    }

    public final boolean r() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71685, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71685, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.G != null) {
            return this.G.booleanValue();
        } else {
            AbTestModel d2 = d();
            if (d2 == null) {
                this.G = Boolean.FALSE;
                return this.G.booleanValue();
            }
            this.G = Boolean.valueOf(d2.isUseTTNetExecutor);
            return this.G.booleanValue();
        }
    }

    public final boolean s() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71687, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71687, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.H != null) {
            return this.H.booleanValue();
        } else {
            AbTestModel d2 = d();
            if (d2 == null) {
                this.H = Boolean.FALSE;
                return this.H.booleanValue();
            }
            this.H = Boolean.valueOf(d2.isUseFeedImmediate);
            return this.H.booleanValue();
        }
    }

    public final int t() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71689, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71689, new Class[0], Integer.TYPE)).intValue();
        } else if (this.ab != null) {
            return this.ab.intValue();
        } else {
            AbTestModel d2 = d();
            if (d2 == null) {
                this.ab = 0;
                return this.ab.intValue();
            }
            this.ab = Integer.valueOf(d2.isShowLongVideoOperation);
            return this.ab.intValue();
        }
    }

    public final int v() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71693, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71693, new Class[0], Integer.TYPE)).intValue();
        } else if (this.A != null) {
            return this.A.intValue();
        } else {
            AbTestModel d2 = d();
            if (d2 == null) {
                this.A = 0;
            } else {
                int i3 = d2.feedStyle;
                if (i3 >= 0 && i3 <= 2) {
                    i2 = i3;
                }
                this.A = Integer.valueOf(i2);
            }
            return this.A.intValue();
        }
    }

    public final int w() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71695, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71695, new Class[0], Integer.TYPE)).intValue();
        }
        this.W = 0;
        AbTestModel d2 = d();
        if (d2 != null) {
            this.W = Integer.valueOf(d2.mtMaskLayerStyle);
        }
        return this.W.intValue();
    }

    public final int y() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71698, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71698, new Class[0], Integer.TYPE)).intValue();
        }
        this.X = 0;
        AbTestModel d2 = d();
        if (d2 != null) {
            this.X = Integer.valueOf(d2.xiGuaTaskPosition);
        }
        return this.X.intValue();
    }

    public final int ai() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71798, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71798, new Class[0], Integer.TYPE)).intValue();
        } else if (com.ss.android.g.a.a()) {
            if (this.aj != null) {
                return this.aj.intValue();
            }
            this.aj = Integer.valueOf(d().preloaderType);
            if (this.aj.intValue() == 1 && o.b().m() != c.a.TT) {
                this.aj = 0;
            }
            return this.aj.intValue();
        } else if (this.aj != null) {
            return this.aj.intValue();
        } else {
            this.aj = Integer.valueOf(d().preloaderType);
            return this.aj.intValue();
        }
    }

    @NonNull
    public i bB() {
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71973, new Class[0], i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71973, new Class[0], i.class);
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            i iVar = new i(0, 0, 0, 0, 0);
            return iVar;
        } else if (d2.followFeedLayoutStrategy == 1) {
            i iVar2 = new i(1, d2.followFeedFilterStrategy, d2.feedSwipeLeft, d2.fullScreenUnfollow, d2.followUnreadStyle);
            return iVar2;
        } else if (d2.followFeedLayoutStrategy == 2) {
            i iVar3 = new i(2, d2.followFeedFilterStrategy, d2.feedSwipeLeft, 0, 0);
            return iVar3;
        } else if (d2.followFeedLayoutStrategy == 3) {
            i iVar4 = new i(3, d2.followFeedFilterStrategy, d2.feedSwipeLeft, 0, 0);
            return iVar4;
        } else {
            i iVar5 = new i(d2.followFeedLayoutStrategy, d2.followFeedFilterStrategy, d2.feedSwipeLeft, 0, 0);
            return iVar5;
        }
    }

    public final void a(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f63777a, false, 71747, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f63777a, false, 71747, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.w.add(aVar2);
    }

    public final AbTestManager a(AbTestModel abTestModel) {
        AbTestModel abTestModel2 = abTestModel;
        if (PatchProxy.isSupport(new Object[]{abTestModel2}, this, f63777a, false, 71655, new Class[]{AbTestModel.class}, AbTestManager.class)) {
            return (AbTestManager) PatchProxy.accessDispatch(new Object[]{abTestModel2}, this, f63777a, false, 71655, new Class[]{AbTestModel.class}, AbTestManager.class);
        }
        b.b().b((Context) k.a(), "ab_test_model", (Object) abTestModel2);
        if (!e()) {
            this.K = abTestModel2;
        }
        if (PatchProxy.isSupport(new Object[0], this, f63777a, false, 71656, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63777a, false, 71656, new Class[0], Void.TYPE);
        } else {
            boolean z2 = this.K.useSurfaceView;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, null, h.f76170a, true, 89162, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, null, h.f76170a, true, 89162, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else {
                h.f76171b.storeBoolean("useSurfaceView", z2);
            }
        }
        if (abTestModel2 != null) {
            com.ss.android.ugc.aweme.aj.b.b().a((Context) k.a(), "last_ab_setting_version", abTestModel2.settingsVersion);
        }
        return this;
    }

    public final MLModel a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f63777a, false, 71970, new Class[]{String.class}, MLModel.class)) {
            return (MLModel) PatchProxy.accessDispatch(new Object[]{str2}, this, f63777a, false, 71970, new Class[]{String.class}, MLModel.class);
        }
        AbTestModel d2 = d();
        if (d2 == null) {
            return null;
        }
        return a(d2.modelList, str2);
    }

    private MLModel a(List<MLModel> list, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{list, str2}, this, f63777a, false, 71971, new Class[]{List.class, String.class}, MLModel.class)) {
            return (MLModel) PatchProxy.accessDispatch(new Object[]{list, str2}, this, f63777a, false, 71971, new Class[]{List.class, String.class}, MLModel.class);
        } else if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        } else {
            for (MLModel next : list) {
                if (str2.equalsIgnoreCase(next.scene)) {
                    return next;
                }
            }
            return null;
        }
    }

    public final void a(boolean z2, boolean z3) {
        boolean z4 = z2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f63777a, false, 71749, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f63777a, false, 71749, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        r.a().a(r.f64011d, z4);
        if (z4) {
            if (z3) {
                com.ss.android.ugc.aweme.feed.guide.d.f45399b = true;
            }
            com.ss.android.ugc.aweme.setting.a.b bVar = new com.ss.android.ugc.aweme.setting.a.b();
            VideoBitRateABManager a2 = VideoBitRateABManager.a();
            if (PatchProxy.isSupport(new Object[]{bVar}, a2, VideoBitRateABManager.f75999a, false, 89053, new Class[]{com.ss.android.ugc.aweme.setting.a.b.class}, Void.TYPE)) {
                VideoBitRateABManager videoBitRateABManager = a2;
                PatchProxy.accessDispatch(new Object[]{bVar}, videoBitRateABManager, VideoBitRateABManager.f75999a, false, 89053, new Class[]{com.ss.android.ugc.aweme.setting.a.b.class}, Void.TYPE);
            } else if (!com.ss.android.ugc.aweme.requestcombine.a.f63567e.a()) {
                a2.b();
            }
            Iterator it2 = this.w.iterator();
            while (it2.hasNext()) {
                a aVar = (a) it2.next();
                if (aVar != null) {
                    aVar.onChanged();
                }
            }
        }
    }
}
