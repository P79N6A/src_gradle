package io.agora.rtc.video;

import android.opengl.GLES20;
import io.agora.rtc.video.RendererCommon;
import java.nio.FloatBuffer;
import java.util.IdentityHashMap;
import java.util.Map;

public class GlRectDrawer implements RendererCommon.GlDrawer {
    private static final FloatBuffer FULL_RECTANGLE_BUF = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer FULL_RECTANGLE_TEX_BUF = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    private FloatBuffer mPosCoordinate = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private FloatBuffer mTexCoordinate = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    private final Map<String, Shader> shaders = new IdentityHashMap();

    static class Shader {
        public final GlShader glShader;
        public final int texMatrixLocation = this.glShader.getUniformLocation("texMatrix");

        public Shader(String str) {
            this.glShader = new GlShader("varying vec2 interp_tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\n\nuniform mat4 texMatrix;\n\nvoid main() {\n    gl_Position = in_pos;\n    interp_tc = (texMatrix * in_tc).xy;\n}\n", str);
        }
    }

    public void release() {
        for (Shader shader : this.shaders.values()) {
            shader.glShader.release();
        }
        this.shaders.clear();
    }

    private void prepareShader(String str, float[] fArr) {
        prepareShader(str, fArr, FULL_RECTANGLE_TEX_BUF);
    }

    private void prepareShader(String str, float[] fArr, FloatBuffer floatBuffer) {
        Shader shader;
        if (this.shaders.containsKey(str)) {
            shader = this.shaders.get(str);
        } else {
            Shader shader2 = new Shader(str);
            this.shaders.put(str, shader2);
            shader2.glShader.useProgram();
            if (str == "precision mediump float;\nvarying vec2 interp_tc;\n\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\n\nvoid main() {\n  float y = texture2D(y_tex, interp_tc).r;\n  float u = texture2D(u_tex, interp_tc).r - 0.5;\n  float v = texture2D(v_tex, interp_tc).r - 0.5;\n  gl_FragColor = vec4(y + 1.403 * v,                       y - 0.344 * u - 0.714 * v,                       y + 1.77 * u, 1);\n}\n") {
                GLES20.glUniform1i(shader2.glShader.getUniformLocation("y_tex"), 0);
                GLES20.glUniform1i(shader2.glShader.getUniformLocation("u_tex"), 1);
                GLES20.glUniform1i(shader2.glShader.getUniformLocation("v_tex"), 2);
            } else if (str == "precision mediump float;\nvarying vec2 interp_tc;\n\nuniform sampler2D rgb_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(rgb_tex, interp_tc);\n}\n") {
                GLES20.glUniform1i(shader2.glShader.getUniformLocation("rgb_tex"), 0);
            } else if (str == "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n") {
                GLES20.glUniform1i(shader2.glShader.getUniformLocation("oes_tex"), 0);
            } else {
                throw new IllegalStateException("Unknown fragment shader: " + str);
            }
            GlUtil.checkNoGLES2Error("Initialize fragment shader uniform values.");
            shader = shader2;
        }
        shader.glShader.setVertexAttribArray("in_pos", 2, FULL_RECTANGLE_BUF);
        shader.glShader.setVertexAttribArray("in_tc", 2, floatBuffer);
        shader.glShader.useProgram();
        GLES20.glUniformMatrix4fv(shader.texMatrixLocation, 1, false, fArr, 0);
    }

    private void drawRectangle(int i, int i2, int i3, int i4) {
        GLES20.glViewport(i, i2, i3, i4);
        GLES20.glDrawArrays(5, 0, 4);
    }

    private float[] ComputePosVertexAttribArray(int i, int i2, int i3, int i4) {
        float f2 = ((((float) (i2 - i4)) * 2.0f) / ((float) i2)) - 1.0f;
        float f3 = ((((float) i3) * 2.0f) / ((float) i)) - 1.0f;
        return new float[]{-1.0f, f2, f3, f2, -1.0f, 1.0f, f3, 1.0f};
    }

    private float[] ComputeVertexAttribArray(int i, int i2, int i3, int i4) {
        float f2 = ((float) i3) / ((float) i4);
        float f3 = (float) i;
        float f4 = (float) i2;
        if (f3 / f4 >= f2) {
            float f5 = ((f3 - (f4 * f2)) / 2.0f) / f3;
            float f6 = 1.0f - f5;
            return new float[]{f5, 0.0f, f6, 0.0f, f5, 1.0f, f6, 1.0f};
        }
        float f7 = ((f4 - (f3 / f2)) / 2.0f) / f4;
        float f8 = 1.0f - f7;
        return new float[]{0.0f, f7, 1.0f, f7, 0.0f, f8, 1.0f, f8};
    }

    private void prepareShader(String str, float[] fArr, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        Shader shader;
        if (this.shaders.containsKey(str)) {
            shader = this.shaders.get(str);
        } else {
            Shader shader2 = new Shader(str);
            this.shaders.put(str, shader2);
            shader2.glShader.useProgram();
            if (str == "precision mediump float;\nvarying vec2 interp_tc;\n\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\n\nvoid main() {\n  float y = texture2D(y_tex, interp_tc).r;\n  float u = texture2D(u_tex, interp_tc).r - 0.5;\n  float v = texture2D(v_tex, interp_tc).r - 0.5;\n  gl_FragColor = vec4(y + 1.403 * v,                       y - 0.344 * u - 0.714 * v,                       y + 1.77 * u, 1);\n}\n") {
                GLES20.glUniform1i(shader2.glShader.getUniformLocation("y_tex"), 0);
                GLES20.glUniform1i(shader2.glShader.getUniformLocation("u_tex"), 1);
                GLES20.glUniform1i(shader2.glShader.getUniformLocation("v_tex"), 2);
            } else if (str == "precision mediump float;\nvarying vec2 interp_tc;\n\nuniform sampler2D rgb_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(rgb_tex, interp_tc);\n}\n") {
                GLES20.glUniform1i(shader2.glShader.getUniformLocation("rgb_tex"), 0);
            } else if (str == "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n") {
                GLES20.glUniform1i(shader2.glShader.getUniformLocation("oes_tex"), 0);
            } else {
                throw new IllegalStateException("Unknown fragment shader: " + str);
            }
            GlUtil.checkNoGLES2Error("Initialize fragment shader uniform values.");
            shader = shader2;
        }
        shader.glShader.setVertexAttribArray("in_pos", 2, floatBuffer2);
        shader.glShader.setVertexAttribArray("in_tc", 2, floatBuffer);
        shader.glShader.useProgram();
        GLES20.glUniformMatrix4fv(shader.texMatrixLocation, 1, false, fArr, 0);
    }

    public void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5) {
        prepareShader("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n", fArr);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        drawRectangle(i2, i3, i4, i5);
        GLES20.glBindTexture(36197, 0);
    }

    public void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5) {
        prepareShader("precision mediump float;\nvarying vec2 interp_tc;\n\nuniform sampler2D rgb_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(rgb_tex, interp_tc);\n}\n", fArr);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        drawRectangle(i2, i3, i4, i5);
        GLES20.glBindTexture(3553, 0);
    }

    public void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4) {
        prepareShader("precision mediump float;\nvarying vec2 interp_tc;\n\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\n\nvoid main() {\n  float y = texture2D(y_tex, interp_tc).r;\n  float u = texture2D(u_tex, interp_tc).r - 0.5;\n  float v = texture2D(v_tex, interp_tc).r - 0.5;\n  gl_FragColor = vec4(y + 1.403 * v,                       y - 0.344 * u - 0.714 * v,                       y + 1.77 * u, 1);\n}\n", fArr);
        for (int i5 = 0; i5 < 3; i5++) {
            GLES20.glActiveTexture(33984 + i5);
            GLES20.glBindTexture(3553, iArr[i5]);
        }
        drawRectangle(i, i2, i3, i4);
        for (int i6 = 0; i6 < 3; i6++) {
            GLES20.glActiveTexture(i6 + 33984);
            GLES20.glBindTexture(3553, 0);
        }
    }

    public void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.mTexCoordinate = GlUtil.createFloatBuffer(ComputeVertexAttribArray(i4, i5, i6, i7));
        prepareShader("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n", fArr, this.mTexCoordinate);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        drawRectangle(i2, i3, i6, i7);
        GLES20.glBindTexture(36197, 0);
    }

    public void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.mTexCoordinate = GlUtil.createFloatBuffer(ComputeVertexAttribArray(i4, i5, i6, i7));
        prepareShader("precision mediump float;\nvarying vec2 interp_tc;\n\nuniform sampler2D rgb_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(rgb_tex, interp_tc);\n}\n", fArr, this.mTexCoordinate);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        drawRectangle(i2, i3, i6, i7);
        GLES20.glBindTexture(3553, 0);
    }

    public void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        float[] ComputeVertexAttribArray = ComputeVertexAttribArray(i4, i5, i8, i9);
        float[] ComputePosVertexAttribArray = ComputePosVertexAttribArray(i6, i7, i8, i9);
        this.mTexCoordinate = GlUtil.createFloatBuffer(ComputeVertexAttribArray);
        this.mPosCoordinate = GlUtil.createFloatBuffer(ComputePosVertexAttribArray);
        prepareShader("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n", fArr, this.mTexCoordinate, this.mPosCoordinate);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        drawRectangle(i2, i3, i6, i7);
        GLES20.glBindTexture(36197, 0);
    }

    public void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        float[] ComputeVertexAttribArray = ComputeVertexAttribArray(i4, i5, i8, i9);
        float[] ComputePosVertexAttribArray = ComputePosVertexAttribArray(i6, i7, i8, i9);
        this.mTexCoordinate = GlUtil.createFloatBuffer(ComputeVertexAttribArray);
        this.mPosCoordinate = GlUtil.createFloatBuffer(ComputePosVertexAttribArray);
        prepareShader("precision mediump float;\nvarying vec2 interp_tc;\n\nuniform sampler2D rgb_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(rgb_tex, interp_tc);\n}\n", fArr, this.mTexCoordinate, this.mPosCoordinate);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        drawRectangle(i2, i3, i6, i7);
        GLES20.glBindTexture(3553, 0);
    }
}
