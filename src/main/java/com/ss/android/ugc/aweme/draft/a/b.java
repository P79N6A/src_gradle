package com.ss.android.ugc.aweme.draft.a;

import android.annotation.SuppressLint;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.ExternalAVConstants;
import com.ss.android.ugc.aweme.shortvideo.edit.q;
import com.ss.android.ugc.aweme.shortvideo.i.i;
import com.ss.android.ugc.aweme.shortvideo.j;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.SocialModel;
import com.ss.android.ugc.aweme.x.a;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\b¿\u0001\b\b\u0018\u00002\u00020\u0001BÍ\u0004\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0003\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010\"\u001a\u00020\n\u0012\b\b\u0002\u0010#\u001a\u00020\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010&\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010(\u0012\b\b\u0002\u0010)\u001a\u00020\n\u0012\b\b\u0002\u0010*\u001a\u00020\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000103\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000105\u0012\b\b\u0002\u00106\u001a\u00020\n\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u00108\u001a\u000209\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=\u0012\b\b\u0002\u0010>\u001a\u00020\u0003\u0012\b\b\u0002\u0010?\u001a\u00020\u0003\u0012\b\b\u0002\u0010@\u001a\u00020\u0003\u0012\b\b\u0002\u0010A\u001a\u00020\u0003\u0012\b\b\u0002\u0010B\u001a\u00020\u0003\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D\u0012\u0010\b\u0002\u0010E\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010(¢\u0006\u0002\u0010GJ\n\u0010Í\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010Î\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010Ï\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\n\u0010Ð\u0001\u001a\u00020\nHÆ\u0003J\f\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Ò\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Ó\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Ô\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Õ\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Ö\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010×\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\n\u0010Ø\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010Ù\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Ú\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Û\u0001\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\f\u0010Ü\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Ý\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\f\u0010Þ\u0001\u001a\u0004\u0018\u00010!HÆ\u0003J\n\u0010ß\u0001\u001a\u00020\nHÆ\u0003J\n\u0010à\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010á\u0001\u001a\u0004\u0018\u00010%HÆ\u0003J\n\u0010â\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010ã\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0012\u0010ä\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010(HÆ\u0003J\n\u0010å\u0001\u001a\u00020\nHÆ\u0003J\n\u0010æ\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010ç\u0001\u001a\u0004\u0018\u00010,HÆ\u0003J\f\u0010è\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010é\u0001\u001a\u0004\u0018\u00010/HÆ\u0003J\f\u0010ê\u0001\u001a\u0004\u0018\u000101HÆ\u0003J\f\u0010ë\u0001\u001a\u0004\u0018\u000103HÆ\u0003J\f\u0010ì\u0001\u001a\u0004\u0018\u000105HÆ\u0003J\n\u0010í\u0001\u001a\u00020\nHÆ\u0003J\f\u0010î\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010ï\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\n\u0010ð\u0001\u001a\u000209HÆ\u0003J\f\u0010ñ\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010ò\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010ó\u0001\u001a\u0004\u0018\u00010=HÆ\u0003J\n\u0010ô\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010õ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ö\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010÷\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ø\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ù\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010ú\u0001\u001a\u0004\u0018\u00010DHÆ\u0003J\u0012\u0010û\u0001\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010(HÆ\u0003J\n\u0010ü\u0001\u001a\u00020\nHÆ\u0003J\n\u0010ý\u0001\u001a\u00020\nHÆ\u0003J\n\u0010þ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ÿ\u0001\u001a\u00020\u0003HÆ\u0003JÒ\u0004\u0010\u0002\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0011\u001a\u00020\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010&\u001a\u00020\u00032\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010(2\b\b\u0002\u0010)\u001a\u00020\n2\b\b\u0002\u0010*\u001a\u00020\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\b\b\u0002\u00106\u001a\u00020\n2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u00108\u001a\u0002092\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=2\b\b\u0002\u0010>\u001a\u00020\u00032\b\b\u0002\u0010?\u001a\u00020\u00032\b\b\u0002\u0010@\u001a\u00020\u00032\b\b\u0002\u0010A\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u00032\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D2\u0010\b\u0002\u0010E\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010(HÆ\u0001J\u0015\u0010\u0002\u001a\u00020\n2\t\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0002\u001a\u00020\u0003HÖ\u0001J\n\u0010\u0002\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\"\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001e\u0010#\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR \u00102\u001a\u0004\u0018\u0001038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001e\u0010*\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010M\"\u0004\bU\u0010OR \u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001e\u00108\u001a\u0002098\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010W\"\u0004\b_\u0010YR\u001c\u0010.\u001a\u0004\u0018\u00010/X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR \u0010<\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010M\"\u0004\bi\u0010OR \u0010C\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR \u0010:\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010W\"\u0004\bo\u0010YR\u001e\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010I\"\u0004\bq\u0010KR \u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR \u00107\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010W\"\u0004\bw\u0010YR \u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010W\"\u0004\by\u0010YR \u0010-\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010W\"\u0004\b{\u0010YR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010M\"\u0004\b}\u0010OR\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010M\"\u0004\b\u0010OR\"\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010W\"\u0005\b\u0001\u0010YR$\u0010 \u001a\u0004\u0018\u00010!8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001f\u00106\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b6\u0010I\"\u0005\b\u0001\u0010KR\u001f\u0010\t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\t\u0010I\"\u0005\b\u0001\u0010KR\u001f\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u0011\u0010I\"\u0005\b\u0001\u0010KR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010W\"\u0005\b\u0001\u0010YR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010W\"\u0005\b\u0001\u0010YR$\u0010$\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001c\u0010B\u001a\u00020\u0003X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010M\"\u0005\b\u0001\u0010OR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010W\"\u0005\b\u0001\u0010YR$\u00100\u001a\u0004\u0018\u0001018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010W\"\u0005\b\u0001\u0010YR\"\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010W\"\u0005\b\u0001\u0010YR$\u00104\u001a\u0004\u0018\u0001058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010 \u0001R$\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R \u0010\f\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¥\u0001\u0010M\"\u0005\b¦\u0001\u0010OR \u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b§\u0001\u0010M\"\u0005\b¨\u0001\u0010OR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b©\u0001\u0010W\"\u0005\bª\u0001\u0010YR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b«\u0001\u0010W\"\u0005\b¬\u0001\u0010YR \u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b­\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b±\u0001\u0010W\"\u0005\b²\u0001\u0010YR*\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010(8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b·\u0001\u0010W\"\u0005\b¸\u0001\u0010YR$\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R \u0010)\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b½\u0001\u0010I\"\u0005\b¾\u0001\u0010KR \u0010A\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¿\u0001\u0010M\"\u0005\bÀ\u0001\u0010OR \u0010@\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÁ\u0001\u0010M\"\u0005\bÂ\u0001\u0010OR\"\u0010;\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÃ\u0001\u0010W\"\u0005\bÄ\u0001\u0010YR \u0010?\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÅ\u0001\u0010M\"\u0005\bÆ\u0001\u0010OR \u0010>\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÇ\u0001\u0010M\"\u0005\bÈ\u0001\u0010OR*\u0010E\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010(8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÉ\u0001\u0010´\u0001\"\u0006\bÊ\u0001\u0010¶\u0001R \u0010&\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bË\u0001\u0010M\"\u0005\bÌ\u0001\u0010O¨\u0006\u0002"}, d2 = {"Lcom/ss/android/ugc/aweme/draft/model/AVDraftExtras;", "", "shootMode", "", "from", "creationId", "", "shootWay", "draftId", "isMultiVideo", "", "durationMode", "recordMode", "gameScore", "reactionParams", "Lcom/ss/android/ugc/aweme/shortvideo/reaction/ReactionParams;", "microAppId", "isMuted", "musicOrigin", "mainBusinessData", "socialData", "poiData", "commerceData", "ugData", "techData", "globalData", "poiId", "extractFramesModel", "Lcom/ss/android/ugc/aweme/shortvideo/model/ExtractFramesModel;", "filterId", "uploadSaveModel", "Lcom/ss/android/ugc/aweme/shortvideo/model/AVUploadSaveModel;", "infoStickerModel", "Lcom/ss/android/ugc/aweme/infosticker/InfoStickerModel;", "autoEnhanceOn", "autoEnhanceType", "microAppInfo", "Lcom/ss/android/ugc/aweme/shortvideo/edit/MicroAppModel;", "videoType", "texts", "", "usePaint", "commentSetting", "socialModel", "Lcom/ss/android/ugc/aweme/shortvideo/model/SocialModel;", "firstStickerMusicIds", "defaultSelectStickerPoi", "Lcom/ss/android/ugc/aweme/draft/model/DefaultSelectStickerPoi;", "mvCreateVideoData", "Lcom/ss/android/ugc/aweme/mvtheme/MvCreateVideoData;", "avUploadMiscInfoStruct", "Lcom/ss/android/ugc/aweme/shortvideo/AVUploadMiscInfoStruct;", "previewConfigure", "Lcom/ss/android/ugc/aweme/draft/model/DraftPreviewConfigure;", "isFastImport", "fastImportResolution", "createTime", "", "draftVideoPath", "videoCoverPath", "draftCherEffectParam", "Lcom/ss/android/ugc/aweme/draft/model/DraftCherEffectParam;", "videoOutWidth", "videoOutHeight", "videoCanvasWidth", "videoCanvasHeight", "musicEnd", "draftVEAudioEffectParam", "Lcom/ss/android/ugc/aweme/draft/model/DraftVEAudioEffectParam;", "videoSegmentsCopy", "Lcom/ss/android/ugc/aweme/draft/model/DraftVideoSegment;", "(IILjava/lang/String;Ljava/lang/String;IZZIILcom/ss/android/ugc/aweme/shortvideo/reaction/ReactionParams;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/ugc/aweme/shortvideo/model/ExtractFramesModel;Ljava/lang/String;Lcom/ss/android/ugc/aweme/shortvideo/model/AVUploadSaveModel;Lcom/ss/android/ugc/aweme/infosticker/InfoStickerModel;ZILcom/ss/android/ugc/aweme/shortvideo/edit/MicroAppModel;ILjava/util/List;ZILcom/ss/android/ugc/aweme/shortvideo/model/SocialModel;Ljava/lang/String;Lcom/ss/android/ugc/aweme/draft/model/DefaultSelectStickerPoi;Lcom/ss/android/ugc/aweme/mvtheme/MvCreateVideoData;Lcom/ss/android/ugc/aweme/shortvideo/AVUploadMiscInfoStruct;Lcom/ss/android/ugc/aweme/draft/model/DraftPreviewConfigure;ZLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/ss/android/ugc/aweme/draft/model/DraftCherEffectParam;IIIIILcom/ss/android/ugc/aweme/draft/model/DraftVEAudioEffectParam;Ljava/util/List;)V", "getAutoEnhanceOn", "()Z", "setAutoEnhanceOn", "(Z)V", "getAutoEnhanceType", "()I", "setAutoEnhanceType", "(I)V", "getAvUploadMiscInfoStruct", "()Lcom/ss/android/ugc/aweme/shortvideo/AVUploadMiscInfoStruct;", "setAvUploadMiscInfoStruct", "(Lcom/ss/android/ugc/aweme/shortvideo/AVUploadMiscInfoStruct;)V", "getCommentSetting", "setCommentSetting", "getCommerceData", "()Ljava/lang/String;", "setCommerceData", "(Ljava/lang/String;)V", "getCreateTime", "()J", "setCreateTime", "(J)V", "getCreationId", "setCreationId", "getDefaultSelectStickerPoi", "()Lcom/ss/android/ugc/aweme/draft/model/DefaultSelectStickerPoi;", "setDefaultSelectStickerPoi", "(Lcom/ss/android/ugc/aweme/draft/model/DefaultSelectStickerPoi;)V", "getDraftCherEffectParam", "()Lcom/ss/android/ugc/aweme/draft/model/DraftCherEffectParam;", "setDraftCherEffectParam", "(Lcom/ss/android/ugc/aweme/draft/model/DraftCherEffectParam;)V", "getDraftId", "setDraftId", "getDraftVEAudioEffectParam", "()Lcom/ss/android/ugc/aweme/draft/model/DraftVEAudioEffectParam;", "setDraftVEAudioEffectParam", "(Lcom/ss/android/ugc/aweme/draft/model/DraftVEAudioEffectParam;)V", "getDraftVideoPath", "setDraftVideoPath", "getDurationMode", "setDurationMode", "getExtractFramesModel", "()Lcom/ss/android/ugc/aweme/shortvideo/model/ExtractFramesModel;", "setExtractFramesModel", "(Lcom/ss/android/ugc/aweme/shortvideo/model/ExtractFramesModel;)V", "getFastImportResolution", "setFastImportResolution", "getFilterId", "setFilterId", "getFirstStickerMusicIds", "setFirstStickerMusicIds", "getFrom", "setFrom", "getGameScore", "setGameScore", "getGlobalData", "setGlobalData", "getInfoStickerModel", "()Lcom/ss/android/ugc/aweme/infosticker/InfoStickerModel;", "setInfoStickerModel", "(Lcom/ss/android/ugc/aweme/infosticker/InfoStickerModel;)V", "setFastImport", "setMultiVideo", "setMuted", "getMainBusinessData", "setMainBusinessData", "getMicroAppId", "setMicroAppId", "getMicroAppInfo", "()Lcom/ss/android/ugc/aweme/shortvideo/edit/MicroAppModel;", "setMicroAppInfo", "(Lcom/ss/android/ugc/aweme/shortvideo/edit/MicroAppModel;)V", "getMusicEnd", "setMusicEnd", "getMusicOrigin", "setMusicOrigin", "getMvCreateVideoData", "()Lcom/ss/android/ugc/aweme/mvtheme/MvCreateVideoData;", "setMvCreateVideoData", "(Lcom/ss/android/ugc/aweme/mvtheme/MvCreateVideoData;)V", "getPoiData", "setPoiData", "getPoiId", "setPoiId", "getPreviewConfigure", "()Lcom/ss/android/ugc/aweme/draft/model/DraftPreviewConfigure;", "setPreviewConfigure", "(Lcom/ss/android/ugc/aweme/draft/model/DraftPreviewConfigure;)V", "getReactionParams", "()Lcom/ss/android/ugc/aweme/shortvideo/reaction/ReactionParams;", "setReactionParams", "(Lcom/ss/android/ugc/aweme/shortvideo/reaction/ReactionParams;)V", "getRecordMode", "setRecordMode", "getShootMode", "setShootMode", "getShootWay", "setShootWay", "getSocialData", "setSocialData", "getSocialModel", "()Lcom/ss/android/ugc/aweme/shortvideo/model/SocialModel;", "setSocialModel", "(Lcom/ss/android/ugc/aweme/shortvideo/model/SocialModel;)V", "getTechData", "setTechData", "getTexts", "()Ljava/util/List;", "setTexts", "(Ljava/util/List;)V", "getUgData", "setUgData", "getUploadSaveModel", "()Lcom/ss/android/ugc/aweme/shortvideo/model/AVUploadSaveModel;", "setUploadSaveModel", "(Lcom/ss/android/ugc/aweme/shortvideo/model/AVUploadSaveModel;)V", "getUsePaint", "setUsePaint", "getVideoCanvasHeight", "setVideoCanvasHeight", "getVideoCanvasWidth", "setVideoCanvasWidth", "getVideoCoverPath", "setVideoCoverPath", "getVideoOutHeight", "setVideoOutHeight", "getVideoOutWidth", "setVideoOutWidth", "getVideoSegmentsCopy", "setVideoSegmentsCopy", "getVideoType", "setVideoType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "tools.service_release"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"TooManyMethodParam"})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43427a;
    @SerializedName("autoEnhanceOn")
    public boolean A;
    @SerializedName("autoEnhanceType")
    public int B;
    @SerializedName("micro_app_info")
    @Nullable
    public q C;
    @SerializedName("video_type")
    public int D;
    @SerializedName("texts")
    @Nullable
    public List<String> E;
    @SerializedName("usePaint")
    public boolean F;
    @SerializedName("commentSetting")
    public int G;
    @Nullable
    public SocialModel H;
    @SerializedName("firstStickerMusicIds")
    @Nullable
    public String I;
    @Nullable
    public d J;
    @SerializedName("mv_theme_create_video")
    @Nullable
    public a K;
    @SerializedName("av_upload_misc_struct")
    @Nullable
    public j L;
    @SerializedName("draft_preview_configure")
    @Nullable
    public g M;
    @SerializedName("is_fast_import")
    public boolean N;
    @SerializedName("fast_import_resolution")
    @Nullable
    public String O;
    @SerializedName("first_create_time")
    public long P;
    @SerializedName("draft_video_path")
    @Nullable
    public String Q;
    @SerializedName("videoCoverPath")
    @Nullable
    public String R;
    @SerializedName("cher_effect_param")
    @Nullable
    public e S;
    @SerializedName("videoOutWidth")
    public int T;
    @SerializedName("videoOutHeight")
    public int U;
    @SerializedName("videoCanvasWidth")
    public int V;
    @SerializedName("videoCanvasHeight")
    public int W;
    public int X;
    @SerializedName("draft_ve_audio_effect_param")
    @Nullable
    public i Y;
    @SerializedName("video_segments_copy")
    @Nullable
    public List<j> Z;
    @SerializedName("shootMode")

    /* renamed from: b  reason: collision with root package name */
    public int f43428b;
    @SerializedName("from")

    /* renamed from: c  reason: collision with root package name */
    public int f43429c;
    @SerializedName("creationId")
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public String f43430d;
    @SerializedName("shootWay")
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public String f43431e;
    @SerializedName("draftId")

    /* renamed from: f  reason: collision with root package name */
    public int f43432f;
    @SerializedName("isMultiVideo")
    public boolean g;
    @SerializedName("durationMode")
    public boolean h;
    @SerializedName("recordMode")
    public int i;
    @SerializedName("gameScore")
    public int j;
    @SerializedName("reactionParams")
    @Nullable
    public i k;
    @SerializedName("microAppId")
    @Nullable
    public String l;
    @SerializedName("isMuted")
    public boolean m;
    @SerializedName("musicOrigin")
    @Nullable
    public String n;
    @SerializedName("mainBusinessData")
    @Nullable
    public String o;
    @SerializedName("socialData")
    @Nullable
    public String p;
    @SerializedName("poiData")
    @Nullable
    public String q;
    @SerializedName("commerceData")
    @Nullable
    public String r;
    @SerializedName("ugData")
    @Nullable
    public String s;
    @SerializedName("techData")
    @Nullable
    public String t;
    @SerializedName("globalData")
    @Nullable
    public String u;
    @SerializedName("poiId")
    @Nullable
    public String v;
    @SerializedName("extractFramesModel")
    @Nullable
    public ExtractFramesModel w;
    @SerializedName("filterId")
    @Nullable
    public String x;
    @SerializedName("uploadSaveModel")
    @Nullable
    public AVUploadSaveModel y;
    @SerializedName("infoStickerModel")
    @Nullable
    public com.ss.android.ugc.aweme.n.a z;

    public b() {
        this(0, 0, null, null, 0, false, false, 0, 0, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, null, 0, null, false, 0, null, null, null, null, null, null, false, null, 0, null, null, null, 0, 0, 0, 0, 0, null, null, -1, 524287);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f43427a, false, 38470, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f43427a, false, 38470, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f43428b == bVar.f43428b) {
                    if ((this.f43429c == bVar.f43429c) && Intrinsics.areEqual((Object) this.f43430d, (Object) bVar.f43430d) && Intrinsics.areEqual((Object) this.f43431e, (Object) bVar.f43431e)) {
                        if (this.f43432f == bVar.f43432f) {
                            if (this.g == bVar.g) {
                                if (this.h == bVar.h) {
                                    if (this.i == bVar.i) {
                                        if ((this.j == bVar.j) && Intrinsics.areEqual((Object) this.k, (Object) bVar.k) && Intrinsics.areEqual((Object) this.l, (Object) bVar.l)) {
                                            if ((this.m == bVar.m) && Intrinsics.areEqual((Object) this.n, (Object) bVar.n) && Intrinsics.areEqual((Object) this.o, (Object) bVar.o) && Intrinsics.areEqual((Object) this.p, (Object) bVar.p) && Intrinsics.areEqual((Object) this.q, (Object) bVar.q) && Intrinsics.areEqual((Object) this.r, (Object) bVar.r) && Intrinsics.areEqual((Object) this.s, (Object) bVar.s) && Intrinsics.areEqual((Object) this.t, (Object) bVar.t) && Intrinsics.areEqual((Object) this.u, (Object) bVar.u) && Intrinsics.areEqual((Object) this.v, (Object) bVar.v) && Intrinsics.areEqual((Object) this.w, (Object) bVar.w) && Intrinsics.areEqual((Object) this.x, (Object) bVar.x) && Intrinsics.areEqual((Object) this.y, (Object) bVar.y) && Intrinsics.areEqual((Object) this.z, (Object) bVar.z)) {
                                                if (this.A == bVar.A) {
                                                    if ((this.B == bVar.B) && Intrinsics.areEqual((Object) this.C, (Object) bVar.C)) {
                                                        if ((this.D == bVar.D) && Intrinsics.areEqual((Object) this.E, (Object) bVar.E)) {
                                                            if (this.F == bVar.F) {
                                                                if ((this.G == bVar.G) && Intrinsics.areEqual((Object) this.H, (Object) bVar.H) && Intrinsics.areEqual((Object) this.I, (Object) bVar.I) && Intrinsics.areEqual((Object) this.J, (Object) bVar.J) && Intrinsics.areEqual((Object) this.K, (Object) bVar.K) && Intrinsics.areEqual((Object) this.L, (Object) bVar.L) && Intrinsics.areEqual((Object) this.M, (Object) bVar.M)) {
                                                                    if ((this.N == bVar.N) && Intrinsics.areEqual((Object) this.O, (Object) bVar.O)) {
                                                                        if ((this.P == bVar.P) && Intrinsics.areEqual((Object) this.Q, (Object) bVar.Q) && Intrinsics.areEqual((Object) this.R, (Object) bVar.R) && Intrinsics.areEqual((Object) this.S, (Object) bVar.S)) {
                                                                            if (this.T == bVar.T) {
                                                                                if (this.U == bVar.U) {
                                                                                    if (this.V == bVar.V) {
                                                                                        if (this.W == bVar.W) {
                                                                                            if (!(this.X == bVar.X) || !Intrinsics.areEqual((Object) this.Y, (Object) bVar.Y) || !Intrinsics.areEqual((Object) this.Z, (Object) bVar.Z)) {
                                                                                                return false;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f43427a, false, 38469, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f43427a, false, 38469, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = ((this.f43428b * 31) + this.f43429c) * 31;
        String str = this.f43430d;
        int hashCode = (i3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f43431e;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f43432f) * 31;
        boolean z2 = this.g;
        if (z2) {
            z2 = true;
        }
        int i4 = (hashCode2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.h;
        if (z3) {
            z3 = true;
        }
        int i5 = (((((i4 + (z3 ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31;
        i iVar = this.k;
        int hashCode3 = (i5 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        String str3 = this.l;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z4 = this.m;
        if (z4) {
            z4 = true;
        }
        int i6 = (hashCode4 + (z4 ? 1 : 0)) * 31;
        String str4 = this.n;
        int hashCode5 = (i6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.o;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.p;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.q;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.r;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.s;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.t;
        int hashCode11 = (hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.u;
        int hashCode12 = (hashCode11 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.v;
        int hashCode13 = (hashCode12 + (str12 != null ? str12.hashCode() : 0)) * 31;
        ExtractFramesModel extractFramesModel = this.w;
        int hashCode14 = (hashCode13 + (extractFramesModel != null ? extractFramesModel.hashCode() : 0)) * 31;
        String str13 = this.x;
        int hashCode15 = (hashCode14 + (str13 != null ? str13.hashCode() : 0)) * 31;
        AVUploadSaveModel aVUploadSaveModel = this.y;
        int hashCode16 = (hashCode15 + (aVUploadSaveModel != null ? aVUploadSaveModel.hashCode() : 0)) * 31;
        com.ss.android.ugc.aweme.n.a aVar = this.z;
        int hashCode17 = (hashCode16 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        boolean z5 = this.A;
        if (z5) {
            z5 = true;
        }
        int i7 = (((hashCode17 + (z5 ? 1 : 0)) * 31) + this.B) * 31;
        q qVar = this.C;
        int hashCode18 = (((i7 + (qVar != null ? qVar.hashCode() : 0)) * 31) + this.D) * 31;
        List<String> list = this.E;
        int hashCode19 = (hashCode18 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z6 = this.F;
        if (z6) {
            z6 = true;
        }
        int i8 = (((hashCode19 + (z6 ? 1 : 0)) * 31) + this.G) * 31;
        SocialModel socialModel = this.H;
        int hashCode20 = (i8 + (socialModel != null ? socialModel.hashCode() : 0)) * 31;
        String str14 = this.I;
        int hashCode21 = (hashCode20 + (str14 != null ? str14.hashCode() : 0)) * 31;
        d dVar = this.J;
        int hashCode22 = (hashCode21 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        a aVar2 = this.K;
        int hashCode23 = (hashCode22 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        j jVar = this.L;
        int hashCode24 = (hashCode23 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        g gVar = this.M;
        int hashCode25 = (hashCode24 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        boolean z7 = this.N;
        if (z7) {
            z7 = true;
        }
        int i9 = (hashCode25 + (z7 ? 1 : 0)) * 31;
        String str15 = this.O;
        int hashCode26 = str15 != null ? str15.hashCode() : 0;
        long j2 = this.P;
        int i10 = (((i9 + hashCode26) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str16 = this.Q;
        int hashCode27 = (i10 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.R;
        int hashCode28 = (hashCode27 + (str17 != null ? str17.hashCode() : 0)) * 31;
        e eVar = this.S;
        int hashCode29 = (((((((((((hashCode28 + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.T) * 31) + this.U) * 31) + this.V) * 31) + this.W) * 31) + this.X) * 31;
        i iVar2 = this.Y;
        int hashCode30 = (hashCode29 + (iVar2 != null ? iVar2.hashCode() : 0)) * 31;
        List<j> list2 = this.Z;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode30 + i2;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f43427a, false, 38468, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f43427a, false, 38468, new Class[0], String.class);
        }
        return "AVDraftExtras(shootMode=" + this.f43428b + ", from=" + this.f43429c + ", creationId=" + this.f43430d + ", shootWay=" + this.f43431e + ", draftId=" + this.f43432f + ", isMultiVideo=" + this.g + ", durationMode=" + this.h + ", recordMode=" + this.i + ", gameScore=" + this.j + ", reactionParams=" + this.k + ", microAppId=" + this.l + ", isMuted=" + this.m + ", musicOrigin=" + this.n + ", mainBusinessData=" + this.o + ", socialData=" + this.p + ", poiData=" + this.q + ", commerceData=" + this.r + ", ugData=" + this.s + ", techData=" + this.t + ", globalData=" + this.u + ", poiId=" + this.v + ", extractFramesModel=" + this.w + ", filterId=" + this.x + ", uploadSaveModel=" + this.y + ", infoStickerModel=" + this.z + ", autoEnhanceOn=" + this.A + ", autoEnhanceType=" + this.B + ", microAppInfo=" + this.C + ", videoType=" + this.D + ", texts=" + this.E + ", usePaint=" + this.F + ", commentSetting=" + this.G + ", socialModel=" + this.H + ", firstStickerMusicIds=" + this.I + ", defaultSelectStickerPoi=" + this.J + ", mvCreateVideoData=" + this.K + ", avUploadMiscInfoStruct=" + this.L + ", previewConfigure=" + this.M + ", isFastImport=" + this.N + ", fastImportResolution=" + this.O + ", createTime=" + this.P + ", draftVideoPath=" + this.Q + ", videoCoverPath=" + this.R + ", draftCherEffectParam=" + this.S + ", videoOutWidth=" + this.T + ", videoOutHeight=" + this.U + ", videoCanvasWidth=" + this.V + ", videoCanvasHeight=" + this.W + ", musicEnd=" + this.X + ", draftVEAudioEffectParam=" + this.Y + ", videoSegmentsCopy=" + this.Z + ")";
    }

    private b(@ExternalAVConstants.ShootMode int i2, int i3, @Nullable String str, @Nullable String str2, int i4, boolean z2, boolean z3, @ExternalAVConstants.RecordMode int i5, int i6, @Nullable i iVar, @Nullable String str3, boolean z4, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable ExtractFramesModel extractFramesModel, @Nullable String str13, @Nullable AVUploadSaveModel aVUploadSaveModel, @Nullable com.ss.android.ugc.aweme.n.a aVar, boolean z5, int i7, @Nullable q qVar, int i8, @Nullable List<String> list, boolean z6, int i9, @Nullable SocialModel socialModel, @Nullable String str14, @Nullable d dVar, @Nullable a aVar2, @Nullable j jVar, @Nullable g gVar, boolean z7, @Nullable String str15, long j2, @Nullable String str16, @Nullable String str17, @Nullable e eVar, int i10, int i11, int i12, int i13, int i14, @Nullable i iVar2, @Nullable List<j> list2) {
        this.f43428b = i2;
        this.f43429c = i3;
        this.f43430d = str;
        this.f43431e = str2;
        this.f43432f = i4;
        this.g = z2;
        this.h = z3;
        this.i = i5;
        this.j = i6;
        this.k = iVar;
        this.l = str3;
        this.m = z4;
        this.n = str4;
        this.o = str5;
        this.p = str6;
        this.q = str7;
        this.r = str8;
        this.s = str9;
        this.t = str10;
        this.u = str11;
        this.v = str12;
        this.w = extractFramesModel;
        this.x = str13;
        this.y = aVUploadSaveModel;
        this.z = aVar;
        this.A = z5;
        this.B = i7;
        this.C = qVar;
        this.D = i8;
        this.E = list;
        this.F = z6;
        this.G = i9;
        this.H = socialModel;
        this.I = str14;
        this.J = dVar;
        this.K = aVar2;
        this.L = jVar;
        this.M = gVar;
        this.N = z7;
        this.O = str15;
        this.P = j2;
        this.Q = str16;
        this.R = str17;
        this.S = eVar;
        this.T = i10;
        this.U = i11;
        this.V = i12;
        this.W = i13;
        this.X = i14;
        this.Y = iVar2;
        this.Z = list2;
    }

    private /* synthetic */ b(int i2, int i3, String str, String str2, int i4, boolean z2, boolean z3, int i5, int i6, i iVar, String str3, boolean z4, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ExtractFramesModel extractFramesModel, String str13, AVUploadSaveModel aVUploadSaveModel, com.ss.android.ugc.aweme.n.a aVar, boolean z5, int i7, q qVar, int i8, List list, boolean z6, int i9, SocialModel socialModel, String str14, d dVar, a aVar2, j jVar, g gVar, boolean z7, String str15, long j2, String str16, String str17, e eVar, int i10, int i11, int i12, int i13, int i14, i iVar2, List list2, int i15, int i16) {
        this(0, 3, UUID.randomUUID().toString(), "", 0, false, false, 0, 0, null, null, false, "origin", null, null, null, null, null, null, null, null, null, null, null, null, false, 0, null, 0, null, false, 0, null, null, null, null, null, null, false, "720*1280", 0, null, null, null, 0, 0, 0, 0, 0, null, null);
    }
}
