package dmt.av.video.a;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.x.a;
import com.ss.android.vesdk.p;
import dmt.av.video.r;
import dmt.av.video.t;
import dmt.av.video.u;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0016J\"\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0012H\u0016¨\u0006\u0013"}, d2 = {"Ldmt/av/video/editorfactory/VEVideoEditorMusicEffectImpl;", "Ldmt/av/video/editorfactory/VEVideoEditor;", "()V", "changeMusic", "", "params", "Ldmt/av/video/VEPreviewMusicParams;", "changeMusicVolume", "op", "Lcom/ss/android/ugc/aweme/services/video/VEVolumeChangeOp;", "cutMusic", "Ldmt/av/video/VEMusicStartChangeOp;", "initVEEditor", "", "context", "Landroid/content/Context;", "editor", "Lcom/ss/android/vesdk/VEEditor;", "Ldmt/av/video/VEPreviewParams;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class i extends a {
    public static ChangeQuickRedirect j;

    public final boolean a(@NotNull t tVar) {
        t tVar2 = tVar;
        if (PatchProxy.isSupport(new Object[]{tVar2}, this, j, false, 92167, new Class[]{t.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{tVar2}, this, j, false, 92167, new Class[]{t.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(tVar2, "params");
        return false;
    }

    public final boolean a(@NotNull VEVolumeChangeOp vEVolumeChangeOp) {
        if (PatchProxy.isSupport(new Object[]{vEVolumeChangeOp}, this, j, false, 92168, new Class[]{VEVolumeChangeOp.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{vEVolumeChangeOp}, this, j, false, 92168, new Class[]{VEVolumeChangeOp.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(vEVolumeChangeOp, "op");
        p pVar = this.g;
        Intrinsics.checkExpressionValueIsNotNull(pVar, "mVEEditor");
        return this.g.a(pVar.k, 1, vEVolumeChangeOp.mVolume);
    }

    public final boolean a(@NotNull r rVar) {
        if (PatchProxy.isSupport(new Object[]{rVar}, this, j, false, 92169, new Class[]{r.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{rVar}, this, j, false, 92169, new Class[]{r.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(rVar, "op");
        p pVar = this.g;
        Intrinsics.checkExpressionValueIsNotNull(pVar, "mVEEditor");
        if (this.g.a(pVar.k, rVar.f83058b, rVar.f83058b + rVar.f83059c, false) >= 0) {
            return true;
        }
        return false;
    }

    public final int a(@Nullable Context context, @NotNull p pVar, @NotNull u uVar) {
        int i;
        p pVar2 = pVar;
        u uVar2 = uVar;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{context, pVar2, uVar2}, this, j, false, 92166, new Class[]{Context.class, p.class, u.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context, pVar2, uVar2}, this, j, false, 92166, new Class[]{Context.class, p.class, u.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(pVar2, "editor");
        Intrinsics.checkParameterIsNotNull(uVar2, "params");
        super.a(context, pVar, uVar);
        a aVar = uVar2.mvCreateVideoData;
        if (aVar != null && j.b(aVar.selectMediaList) && !TextUtils.isEmpty(aVar.mvResZipPath)) {
            String[] strArr = new String[aVar.selectMediaList.size()];
            String[] strArr2 = new String[aVar.selectMediaList.size()];
            ArrayList<String> arrayList = aVar.selectMediaList;
            Intrinsics.checkExpressionValueIsNotNull(arrayList, "data.selectMediaList");
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                strArr[i3] = aVar.selectMediaList.get(i3);
                strArr2[i3] = "img";
            }
            if (this.g != null) {
                if (uVar2.mPageType == 3 || uVar2.mPageType == 2 || uVar2.mIsFromDraft) {
                    i = this.g.a(aVar.mvResZipPath, strArr, strArr2, uVar2.mMusicPath, uVar2.mMusicInPoint, uVar2.mMusicOutPoint);
                } else {
                    i = this.g.a(aVar.mvResZipPath, strArr, strArr2);
                }
                i2 = i;
            }
            this.i = aVar.musicIds;
        }
        return i2;
    }
}
