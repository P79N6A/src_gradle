package com.ss.android.ugc.aweme.shortvideo.m;

import android.content.Context;
import android.media.AudioManager;
import com.meituan.robust.ChangeQuickRedirect;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68366a;

    /* renamed from: b  reason: collision with root package name */
    Context f68367b;

    /* renamed from: c  reason: collision with root package name */
    public AudioManager f68368c;

    public interface a {
        void a();
    }

    public b(Context context) {
        this.f68367b = context;
        this.f68368c = (AudioManager) context.getSystemService("audio");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x00c7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r22, int r23, int r24, com.ss.android.ugc.aweme.shortvideo.m.b.a r25) {
        /*
            r21 = this;
            r8 = r21
            r0 = r24
            r9 = r25
            r10 = 4
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r22)
            r11 = 0
            r1[r11] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)
            r12 = 1
            r1[r12] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r24)
            r13 = 2
            r1[r13] = r2
            r14 = 3
            r1[r14] = r9
            com.meituan.robust.ChangeQuickRedirect r3 = f68366a
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r11] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r12] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r13] = r2
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.m.b$a> r2 = com.ss.android.ugc.aweme.shortvideo.m.b.a.class
            r6[r14] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 78518(0x132b6, float:1.10027E-40)
            r2 = r21
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0079
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r22)
            r1[r11] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)
            r1[r12] = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
            r1[r13] = r0
            r1[r14] = r9
            com.meituan.robust.ChangeQuickRedirect r3 = f68366a
            r4 = 0
            r5 = 78518(0x132b6, float:1.10027E-40)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r11] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r12] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r13] = r0
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.m.b$a> r0 = com.ss.android.ugc.aweme.shortvideo.m.b.a.class
            r6[r14] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0079:
            android.media.MediaPlayer r1 = new android.media.MediaPlayer
            r1.<init>()
            android.content.Context r2 = r8.f68367b
            android.content.res.Resources r2 = r2.getResources()
            r3 = r22
            android.content.res.AssetFileDescriptor r2 = r2.openRawResourceFd(r3)
            r1.reset()     // Catch:{ IOException -> 0x00c7, all -> 0x00c2 }
            java.io.FileDescriptor r16 = r2.getFileDescriptor()     // Catch:{ IOException -> 0x00c7, all -> 0x00c2 }
            long r17 = r2.getStartOffset()     // Catch:{ IOException -> 0x00c7, all -> 0x00c2 }
            long r19 = r2.getLength()     // Catch:{ IOException -> 0x00c7, all -> 0x00c2 }
            r15 = r1
            r15.setDataSource(r16, r17, r19)     // Catch:{ IOException -> 0x00c7, all -> 0x00c2 }
            r1.setAudioStreamType(r14)     // Catch:{ IOException -> 0x00c7, all -> 0x00c2 }
            r1.prepareAsync()     // Catch:{ IOException -> 0x00c7, all -> 0x00c2 }
            com.ss.android.ugc.aweme.shortvideo.m.b$1 r3 = new com.ss.android.ugc.aweme.shortvideo.m.b$1     // Catch:{ IOException -> 0x00c7, all -> 0x00c2 }
            r4 = r23
            r3.<init>(r4)     // Catch:{ IOException -> 0x00c7, all -> 0x00c2 }
            r1.setOnPreparedListener(r3)     // Catch:{ IOException -> 0x00c7, all -> 0x00c2 }
            com.ss.android.ugc.aweme.shortvideo.m.b$2 r3 = new com.ss.android.ugc.aweme.shortvideo.m.b$2     // Catch:{ IOException -> 0x00c7, all -> 0x00c2 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x00c7, all -> 0x00c2 }
            r1.setOnErrorListener(r3)     // Catch:{ IOException -> 0x00c7, all -> 0x00c2 }
            com.ss.android.ugc.aweme.shortvideo.m.b$3 r3 = new com.ss.android.ugc.aweme.shortvideo.m.b$3     // Catch:{ IOException -> 0x00c7, all -> 0x00c2 }
            r3.<init>(r0, r9)     // Catch:{ IOException -> 0x00c7, all -> 0x00c2 }
            r1.setOnCompletionListener(r3)     // Catch:{ IOException -> 0x00c7, all -> 0x00c2 }
            r2.close()     // Catch:{ IOException -> 0x00c1 }
            return
        L_0x00c1:
            return
        L_0x00c2:
            r0 = move-exception
            r2.close()     // Catch:{ IOException -> 0x00c6 }
        L_0x00c6:
            throw r0
        L_0x00c7:
            r2.close()     // Catch:{ IOException -> 0x00cb }
            return
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.m.b.a(int, int, int, com.ss.android.ugc.aweme.shortvideo.m.b$a):void");
    }
}
