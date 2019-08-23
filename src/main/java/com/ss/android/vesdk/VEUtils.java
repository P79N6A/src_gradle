package com.ss.android.vesdk;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ttve.model.VEMusicWaveBean;
import com.ss.android.ttve.model.f;
import com.ss.android.ttve.monitor.d;
import com.ss.android.ttve.nativePort.TEAudioUtilsCallback;
import com.ss.android.ttve.nativePort.TEEffectUtils;
import com.ss.android.ttve.nativePort.TEImageFactory;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ttve.nativePort.TEVideoUtilsCallback;
import com.ss.android.vesdk.VEListener;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class VEUtils {

    public interface a {
        void a(int i);
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public String f77852a;

        /* renamed from: b  reason: collision with root package name */
        public String f77853b;

        /* renamed from: c  reason: collision with root package name */
        public String f77854c;

        /* renamed from: d  reason: collision with root package name */
        public String f77855d;

        /* renamed from: e  reason: collision with root package name */
        public int f77856e = -1;

        /* renamed from: f  reason: collision with root package name */
        public float f77857f = 0.4f;
        public int g = 8;
        public int h = 180;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
    }

    public static String findBestRemuxSuffix(@NonNull String str) throws r {
        return TEVideoUtils.findBestRemuxSuffix(str);
    }

    public static int isCanImport(String str) {
        d.a("iesve_veutils_if_video_support_import", 1, (com.ss.android.vesdk.keyvaluepair.a) null);
        return TEVideoUtils.isCanImport(str);
    }

    public static String getPipePath(FileDescriptor fileDescriptor) {
        if (fileDescriptor == null) {
            return null;
        }
        int nativeFd = getNativeFd(fileDescriptor);
        if (nativeFd == -1) {
            return null;
        }
        return "pipe:" + nativeFd;
    }

    public static long getVideoReverseSize(@NonNull String str) {
        int[] iArr = new int[10];
        if (getVideoFileInfo(str, iArr) < 0) {
            return -1;
        }
        return (((long) (iArr[3] / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE)) * 5000) / 1024;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003f A[SYNTHETIC, Splitter:B:24:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0046 A[SYNTHETIC, Splitter:B:32:0x0046] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int getNativeFd(java.io.FileDescriptor r3) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 12
            if (r0 >= r1) goto L_0x0027
            java.lang.Class r0 = r3.getClass()     // Catch:{ NoSuchFieldException -> 0x0020, IllegalAccessException -> 0x0019 }
            java.lang.String r1 = "descriptor"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch:{ NoSuchFieldException -> 0x0020, IllegalAccessException -> 0x0019 }
            r1 = 1
            r0.setAccessible(r1)     // Catch:{ NoSuchFieldException -> 0x0020, IllegalAccessException -> 0x0019 }
            int r3 = r0.getInt(r3)     // Catch:{ NoSuchFieldException -> 0x0020, IllegalAccessException -> 0x0019 }
            goto L_0x004a
        L_0x0019:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r3)
            throw r0
        L_0x0020:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r3)
            throw r0
        L_0x0027:
            r0 = 0
            android.os.ParcelFileDescriptor r3 = android.os.ParcelFileDescriptor.dup(r3)     // Catch:{ IOException -> 0x0043, all -> 0x003c }
            int r0 = r3.getFd()     // Catch:{ IOException -> 0x0044, all -> 0x0037 }
            if (r3 != 0) goto L_0x0035
            r3.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            r3 = r0
            goto L_0x004a
        L_0x0037:
            r0 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
            goto L_0x003d
        L_0x003c:
            r3 = move-exception
        L_0x003d:
            if (r0 != 0) goto L_0x0042
            r0.close()     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            throw r3
        L_0x0043:
            r3 = r0
        L_0x0044:
            if (r3 != 0) goto L_0x0049
            r3.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            r3 = -1
        L_0x004a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEUtils.getNativeFd(java.io.FileDescriptor):int");
    }

    private static String ms2TimeFormat(int i) {
        long j = (long) i;
        return String.format(Locale.ENGLISH, "%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j))), Long.valueOf(j - TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(j)))});
    }

    public static int concatVideo(String[] strArr, String str) {
        return TEVideoUtils.concat(strArr, str);
    }

    public static int execFFmpegCommand(@NonNull String str, @Nullable final a aVar) {
        return TEVideoUtils.executeFFmpegCommand(str, new TEVideoUtils.ExecuteCommandListener() {
            public final void onProgressChanged(int i) {
                if (aVar != null) {
                    aVar.a(i);
                }
            }
        });
    }

    public static int getAudioFileInfo(@NonNull String str, @NonNull int[] iArr) {
        d.a("iesve_veutils_get_audio_info", 1, (com.ss.android.vesdk.keyvaluepair.a) null);
        return TEVideoUtils.getAudioFileInfo(str, iArr);
    }

    public static int getQREncodedData(String str, final VEListener.m mVar) {
        return TEEffectUtils.getQREncodedData(str, null, new TEEffectUtils.ImageListener() {
            public final void onData(int[] iArr, int i, int i2, int i3) {
            }
        });
    }

    public static int getVideoFileInfo(@NonNull String str, @NonNull int[] iArr) {
        d.a("iesve_veutils_get_video_info", 1, (com.ss.android.vesdk.keyvaluepair.a) null);
        return TEVideoUtils.getVideoFileInfo(str, iArr);
    }

    public static String getPipePathFromUri(Uri uri, Context context) {
        try {
            return getPipePath(context.getContentResolver().openFileDescriptor(uri, "r").getFileDescriptor());
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public static int reverseAudio(@NonNull String str, @NonNull String str2) {
        return execFFmpegCommand("ffmpeg -i " + str + " -af areverse " + str2, null);
    }

    public static int convertVideo2Webp(b bVar, a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("ffmpeg");
        if (bVar.l > 0 || bVar.m > 0) {
            sb.append(" -accurate_seek");
            sb.append(" -ss ");
            sb.append(ms2TimeFormat(bVar.l));
            sb.append(" -t ");
            sb.append(ms2TimeFormat(bVar.m));
        }
        sb.append(" -y -i ");
        sb.append(bVar.f77852a);
        sb.append(" -vf scale=");
        sb.append(bVar.h);
        sb.append(":");
        sb.append(bVar.i);
        sb.append(" -r ");
        sb.append(bVar.g);
        sb.append(" -loop 0 ");
        sb.append(bVar.f77853b);
        return execFFmpegCommand(sb.toString(), aVar);
    }

    public static String getFileBestStreamAudio(@NonNull String str, @NonNull String str2) {
        ArrayList arrayList = new ArrayList();
        int fileAudio = TEVideoUtils.getFileAudio(str, str2, arrayList, true);
        if (fileAudio != 0) {
            y.d("VEUtils", "getFileBestStreamAudio error " + fileAudio);
            return null;
        } else if (arrayList.size() > 0) {
            if (arrayList.size() > 1) {
                y.c("VEUtils", "getFileBestStreamAudio, find more than one stream");
            }
            return (String) arrayList.get(0);
        } else {
            y.d("VEUtils", "getFileBestStreamAudio error, outFiles.size == 0 ");
            return null;
        }
    }

    public static int convertVideo2Gif(@NonNull b bVar, a aVar) {
        int i;
        String str;
        int execFFmpegCommand = execFFmpegCommand(String.format(Locale.US, "ffmpeg -y -i %s -vf fps=%d,scale=%d:-1:flags=lanczos,palettegen %s", new Object[]{bVar.f77852a, Integer.valueOf(bVar.g), Integer.valueOf(bVar.h), bVar.f77854c}), null);
        if (execFFmpegCommand != 0) {
            return execFFmpegCommand;
        }
        int[] iArr = new int[10];
        int videoFileInfo = getVideoFileInfo(bVar.f77852a, iArr);
        if (videoFileInfo != 0) {
            return videoFileInfo;
        }
        int i2 = iArr[0];
        if (bVar.f77856e < 0) {
            TEImageFactory.ImageInfo imageInfo = TEImageFactory.getImageInfo(null, bVar.f77855d);
            int i3 = 278;
            float f2 = ((float) i2) / 540.0f;
            if (imageInfo != null && imageInfo.getWidth() > 0) {
                i3 = imageInfo.getWidth();
            }
            i = (int) (((float) i3) * f2);
        } else {
            i = bVar.f77856e;
        }
        if (TextUtils.isEmpty(bVar.f77855d)) {
            str = String.format(Locale.US, "ffmpeg -y -i %s -i %s -filter_complex setpts=%f*PTS,fps=%d,scale=%d:-1:flags=lanczos[x];[x][1:v]paletteuse %s", new Object[]{bVar.f77852a, bVar.f77854c, Float.valueOf(bVar.f77857f), Integer.valueOf(bVar.g), Integer.valueOf(bVar.h), bVar.f77853b});
        } else {
            str = String.format(Locale.US, "ffmpeg -y -i %s -i %s -i %s -filter_complex [1:v]scale=%d:-1[o1];[0:v]setpts=%f*PTS,fps=%d[o0];[o0][o1]overlay=x=%d:y=H-h-%d,scale=%d:-1:flags=lanczos[x];[x][2:v]paletteuse %s", new Object[]{bVar.f77852a, bVar.f77855d, bVar.f77854c, Integer.valueOf(i), Float.valueOf(bVar.f77857f), Integer.valueOf(bVar.g), Integer.valueOf(bVar.j), Integer.valueOf(bVar.k), Integer.valueOf(bVar.h), bVar.f77853b});
        }
        int execFFmpegCommand2 = execFFmpegCommand(str, aVar);
        new File(bVar.f77854c).delete();
        return execFFmpegCommand2;
    }

    public static int getFileAudio(@NonNull String str, @NonNull String str2, @NonNull ArrayList<String> arrayList) {
        return TEVideoUtils.getFileAudio(str, str2, arrayList, false);
    }

    public static int isCanTransCode(@NonNull String str, int i, int i2) {
        return TEVideoUtils.isCanTransCode(str, i, i2);
    }

    @Nullable
    public static VEMusicWaveBean getMusicWaveData(@NonNull String str, int i, int i2) {
        return getMusicWaveData(str, i, i2, 10, 0, 0);
    }

    @Nullable
    public static VEMusicWaveBean getResampleMusicWaveData(@NonNull float[] fArr, int i, int i2) {
        if (fArr.length == 0) {
            return null;
        }
        return TEVideoUtils.getResampleMusicWaveData(fArr, i, i2);
    }

    public static int isCanImportFd(FileDescriptor fileDescriptor, long j, long j2) {
        return TEVideoUtils.isCanImportFd(getNativeFd(fileDescriptor), j, j2);
    }

    public static int mixAudio(@NonNull ArrayList<String> arrayList, @NonNull String str, @Nullable aa aaVar) {
        TEAudioUtilsCallback tEAudioUtilsCallback = new TEAudioUtilsCallback();
        tEAudioUtilsCallback.setListener(aaVar);
        return TEVideoUtils.mixAudio(arrayList, str, tEAudioUtilsCallback);
    }

    public static int getVideoFrames(@NonNull String str, @NonNull int[] iArr, @NonNull t tVar) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(tVar);
        d.a("iesve_veutils_extract_video_frames", 1, (com.ss.android.vesdk.keyvaluepair.a) null);
        return TEVideoUtils.getVideoFrames(str, iArr, 0, 0, false, tEVideoUtilsCallback);
    }

    public static int mux(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return -100;
        }
        d.a("iesve_veutils_combine_audio_and_video_start", 1, (com.ss.android.vesdk.keyvaluepair.a) null);
        int mux = TEVideoUtils.mux(str, str2, str3);
        com.ss.android.vesdk.keyvaluepair.a aVar = new com.ss.android.vesdk.keyvaluepair.a();
        if (mux == 0) {
            str4 = "succ";
        } else {
            str4 = "fail";
        }
        aVar.a("iesve_veutils_combine_audio_and_video_finish_result", str4);
        aVar.a("iesve_veutils_combine_audio_and_video_finish_reason", "");
        d.a("iesve_veutils_combine_audio_and_video_finish", 1, aVar);
        return mux;
    }

    public static int trimToDraft(String str, int[] iArr, String str2, int[] iArr2) {
        return TEVideoUtils.trimVideoFile(str, iArr, str2, iArr2);
    }

    public static int getVideoFileInfoFd(@NonNull FileDescriptor fileDescriptor, long j, long j2, @NonNull int[] iArr) {
        d.a("iesve_veutils_get_video_info", 1, (com.ss.android.vesdk.keyvaluepair.a) null);
        return TEVideoUtils.getVideoFileInfoFd(getNativeFd(fileDescriptor), j, j2, iArr);
    }

    public static int transCodeAudio(@NonNull String str, @NonNull String str2, int i, int i2) {
        return TEVideoUtils.transCodeAudioFile(str, 0, -1, str2, i, i2, -1);
    }

    public static aj calcTargetRes(int[] iArr, int[] iArr2, c[] cVarArr, int i) {
        int i2;
        int i3;
        aj ajVar = new aj(-1, -1);
        if (iArr2 == null || iArr == null || cVarArr == null) {
            return ajVar;
        }
        int length = iArr.length;
        if (length <= 0) {
            return ajVar;
        }
        float f2 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = iArr2[i6];
            int i8 = iArr[i6];
            if (cVarArr[i6] == c.ROTATE_90 || cVarArr[i6] == c.ROTATE_270) {
                i8 = iArr2[i6];
                i7 = iArr[i6];
            }
            f2 = Math.max(f2, ((float) i7) / ((float) i8));
            i4 = Math.max(i4, i8);
            i5 = Math.max(i5, i7);
        }
        if (length != 1) {
            f2 = Math.min(f2, 1.7777778f);
        }
        if (f2 >= 1.0f) {
            i3 = Math.min(i4, i);
            i2 = (int) (((float) i3) * f2);
        } else {
            i2 = Math.min(i5, i);
            i3 = (int) (((float) i2) / f2);
        }
        ajVar.f77890a = ((i3 + 16) - 1) & -16;
        ajVar.f77891b = ((i2 + 16) - 1) & -16;
        return ajVar;
    }

    public static ac createRTAudioWaveformMgr(int i, int i2, int i3, float f2, int i4) {
        ac acVar = new ac(i, i2, i3, f2, i4);
        return acVar;
    }

    @Nullable
    public static VEMusicWaveBean getMusicWaveData(@NonNull String str, int i, int i2, int i3, int i4) {
        return getMusicWaveData(str, i, i2, 10, i3, i4);
    }

    public static int transCodeAudio(@NonNull String str, @NonNull String str2, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append("ffmpeg");
        sb.append(" -i ");
        sb.append(str);
        if (i != -1) {
            sb.append(" -ac ");
            sb.append(i);
        }
        if (i2 != -1) {
            sb.append(" -ab ");
            sb.append(i2);
        }
        if (i3 != -1) {
            sb.append(" -ar ");
            sb.append(i3);
        }
        sb.append(" " + str2);
        y.a("VEUtils", sb.toString());
        return execFFmpegCommand(sb.toString(), null);
    }

    public static int transCodeAudio(@NonNull String str, int i, int i2, @NonNull String str2, int i3, int i4) {
        return TEVideoUtils.transCodeAudioFile(str, i, i2, str2, i3, i4, -1);
    }

    public static int getVideoFrames(@NonNull String str, @NonNull int[] iArr, int i, int i2, boolean z, @NonNull t tVar) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(tVar);
        d.a("iesve_veutils_extract_video_frames", 1, (com.ss.android.vesdk.keyvaluepair.a) null);
        return TEVideoUtils.getVideoFrames(str, iArr, i, i2, z, tEVideoUtilsCallback);
    }

    @Nullable
    public static VEMusicWaveBean getMusicWaveData(@NonNull String str, int i, int i2, int i3, int i4, int i5) {
        if (i == 0) {
            i = f.f31229f;
        }
        VEMusicWaveBean audioWaveData = TEVideoUtils.getAudioWaveData(str, i, i2, i3, i4, i5);
        if (audioWaveData == null || audioWaveData.getWaveBean().length == 0) {
            return null;
        }
        return audioWaveData;
    }

    public static int getVideoThumb(@NonNull String str, int i, @NonNull t tVar, boolean z, int i2, int i3, long j, int i4) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        t tVar2 = tVar;
        tEVideoUtilsCallback.setListener(tVar);
        d.a("iesve_veutils_extract_video_thumb", 1, (com.ss.android.vesdk.keyvaluepair.a) null);
        return TEVideoUtils.getVideoThumb(str, i, tEVideoUtilsCallback, z, i2, i3, j, i4);
    }
}
