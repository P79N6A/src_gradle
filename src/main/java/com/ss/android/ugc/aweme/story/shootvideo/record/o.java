package com.ss.android.ugc.aweme.story.shootvideo.record;

import android.support.v7.app.AppCompatActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.shortvideo.sticker.aj;
import com.ss.android.ugc.aweme.shortvideo.sticker.b.a;
import com.ss.android.ugc.aweme.shortvideo.sticker.b.c;
import com.ss.android.ugc.aweme.story.shootvideo.record.base.d;
import dmt.av.video.b.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryStickerHelper;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/helper/IStickerHelper;", "context", "Landroid/support/v7/app/AppCompatActivity;", "recordController", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/IRecorderController;", "(Landroid/support/v7/app/AppCompatActivity;Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/IRecorderController;)V", "muteStickerHelper", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/helper/MuteStickerHelper;", "recognizeStickerHelper", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/helper/RecognizeStickerHelper;", "voiceRecognitionStickerHelper", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/VoiceRecognitionStickerHelper;", "register", "", "unregister", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73996a;

    /* renamed from: b  reason: collision with root package name */
    final a f73997b;

    /* renamed from: c  reason: collision with root package name */
    final c f73998c;

    /* renamed from: d  reason: collision with root package name */
    final aj f73999d;

    public o(@NotNull AppCompatActivity appCompatActivity, @NotNull d dVar) {
        Intrinsics.checkParameterIsNotNull(appCompatActivity, "context");
        Intrinsics.checkParameterIsNotNull(dVar, "recordController");
        this.f73997b = new a(appCompatActivity, dVar);
        this.f73998c = new c(appCompatActivity);
        this.f73999d = new aj(appCompatActivity, new h(dVar.g()));
    }
}
