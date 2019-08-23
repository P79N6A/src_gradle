package com.ss.ttvideoengine.gl;

import android.opengl.GLES20;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ShaderHelper {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int compileShader(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, null, changeQuickRedirect, true, 91465, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, null, changeQuickRedirect, true, 91465, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)).intValue();
        }
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str2);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                GLES20.glDeleteShader(glCreateShader);
                glCreateShader = 0;
            }
        }
        if (glCreateShader != 0) {
            return glCreateShader;
        }
        throw new RuntimeException("Error creating shader.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int createAndLinkProgram(int r19, int r20, java.lang.String[] r21) {
        /*
            r0 = r21
            r1 = 3
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            r9 = 0
            r2[r9] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            r10 = 1
            r2[r10] = r3
            r11 = 2
            r2[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r9] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r10] = r3
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            r7[r11] = r3
            java.lang.Class r8 = java.lang.Integer.TYPE
            r3 = 0
            r5 = 1
            r6 = 91466(0x1654a, float:1.28171E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0067
            java.lang.Object[] r12 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            r12[r9] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r12[r10] = r2
            r12[r11] = r0
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = changeQuickRedirect
            r15 = 1
            r16 = 91466(0x1654a, float:1.28171E-40)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Integer.TYPE
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x0067:
            int r1 = android.opengl.GLES20.glCreateProgram()
            if (r1 == 0) goto L_0x0098
            r2 = r19
            android.opengl.GLES20.glAttachShader(r1, r2)
            r2 = r20
            android.opengl.GLES20.glAttachShader(r1, r2)
            if (r0 == 0) goto L_0x0085
            int r2 = r0.length
            r3 = 0
        L_0x007b:
            if (r3 >= r2) goto L_0x0085
            r4 = r0[r3]
            android.opengl.GLES20.glBindAttribLocation(r1, r3, r4)
            int r3 = r3 + 1
            goto L_0x007b
        L_0x0085:
            android.opengl.GLES20.glLinkProgram(r1)
            int[] r0 = new int[r10]
            r2 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r1, r2, r0, r9)
            r0 = r0[r9]
            if (r0 != 0) goto L_0x0098
            android.opengl.GLES20.glDeleteProgram(r1)
            r1 = 0
        L_0x0098:
            if (r1 == 0) goto L_0x009b
            return r1
        L_0x009b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Error creating program."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.gl.ShaderHelper.createAndLinkProgram(int, int, java.lang.String[]):int");
    }
}
