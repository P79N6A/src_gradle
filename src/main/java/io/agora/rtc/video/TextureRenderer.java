package io.agora.rtc.video;

import android.opengl.GLES20;
import android.opengl.Matrix;
import io.agora.rtc.internal.Logging;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

public class TextureRenderer {
    static float[] squareVertices = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f};
    private ShortBuffer drawListBuffer;
    private short[] drawOrder = {0, 1, 2, 0, 2, 3};
    private final String mFragmentShaderOes = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES s_texture;\nvoid main() {\ngl_FragColor = texture2D(s_texture, textureCoordinate);\n}";
    private final String mFragmentShaderRgba = "precision mediump float;\nvarying vec2 textureCoordinate;\nuniform sampler2D s_texture;\nvoid main() {\ngl_FragColor = texture2D(s_texture, textureCoordinate);\n}";
    private float[] mMVPMatrix = new float[16];
    private boolean mOesTexture = true;
    private final int mProgram;
    private float[] mSTMatrix = new float[16];
    private final String mVertexShader = "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nvarying vec2 textureCoordinate;\nvoid main()\n{\ngl_Position = uMVPMatrix * position;\nvec4 tex4 = vec4(inputTextureCoordinate.xy, 1.0, 1.0);\ntextureCoordinate = (uSTMatrix * tex4).xy;\n}";
    private int muMVPMatrixHandle;
    private int muSTMatrixHandle;
    float[] textureVertices = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f};
    private FloatBuffer textureVerticesBuffer;
    private FloatBuffer vertexBuffer;
    private final int vertexStride = 8;

    public void rotate(int i) {
        double d2 = (double) i;
        Double.isNaN(d2);
        double d3 = (d2 / 180.0d) * 3.141592653589793d;
        this.mMVPMatrix[0] = (float) Math.cos(d3);
        this.mMVPMatrix[1] = -((float) Math.sin(d3));
        this.mMVPMatrix[4] = (float) Math.sin(d3);
        this.mMVPMatrix[5] = (float) Math.cos(d3);
    }

    private void printMatrix(float[] fArr) {
        for (int i = 0; i < 4; i++) {
            StringBuilder sb = new StringBuilder();
            int i2 = i * 4;
            sb.append(fArr[i2 + 0]);
            sb.append(" ");
            sb.append(fArr[i2 + 1]);
            sb.append(" ");
            sb.append(fArr[i2 + 2]);
            sb.append(" ");
            sb.append(fArr[i2 + 3]);
            Logging.d("TextureRenderer", sb.toString());
        }
    }

    public void draw(int i) {
        GLES20.glUseProgram(this.mProgram);
        GLES20.glActiveTexture(33984);
        if (this.mOesTexture) {
            GLES20.glBindTexture(36197, i);
        } else {
            GLES20.glBindTexture(3553, i);
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.mProgram, "position");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 8, this.vertexBuffer);
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.mProgram, "inputTextureCoordinate");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
        GLES20.glVertexAttribPointer(glGetAttribLocation2, 2, 5126, false, 8, this.textureVerticesBuffer);
        GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle, 1, false, this.mMVPMatrix, 0);
        GLES20.glUniformMatrix4fv(this.muSTMatrixHandle, 1, false, this.mSTMatrix, 0);
        GLES20.glDrawElements(4, this.drawOrder.length, 5123, this.drawListBuffer);
        GLES20.glDisableVertexAttribArray(glGetAttribLocation);
        GLES20.glDisableVertexAttribArray(glGetAttribLocation2);
        GLES20.glUseProgram(0);
    }

    public TextureRenderer(boolean z) {
        int i;
        this.mOesTexture = z;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(squareVertices.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.vertexBuffer = allocateDirect.asFloatBuffer();
        this.vertexBuffer.put(squareVertices);
        this.vertexBuffer.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(this.drawOrder.length * 2);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.drawListBuffer = allocateDirect2.asShortBuffer();
        this.drawListBuffer.put(this.drawOrder);
        this.drawListBuffer.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(this.textureVertices.length * 4);
        allocateDirect3.order(ByteOrder.nativeOrder());
        this.textureVerticesBuffer = allocateDirect3.asFloatBuffer();
        this.textureVerticesBuffer.put(this.textureVertices);
        this.textureVerticesBuffer.position(0);
        int loadShader = loadShader(35633, "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nvarying vec2 textureCoordinate;\nvoid main()\n{\ngl_Position = uMVPMatrix * position;\nvec4 tex4 = vec4(inputTextureCoordinate.xy, 1.0, 1.0);\ntextureCoordinate = (uSTMatrix * tex4).xy;\n}");
        if (this.mOesTexture) {
            i = loadShader(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES s_texture;\nvoid main() {\ngl_FragColor = texture2D(s_texture, textureCoordinate);\n}");
        } else {
            i = loadShader(35632, "precision mediump float;\nvarying vec2 textureCoordinate;\nuniform sampler2D s_texture;\nvoid main() {\ngl_FragColor = texture2D(s_texture, textureCoordinate);\n}");
        }
        this.mProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(this.mProgram, loadShader);
        GLES20.glAttachShader(this.mProgram, i);
        GLES20.glLinkProgram(this.mProgram);
        this.muMVPMatrixHandle = GLES20.glGetUniformLocation(this.mProgram, "uMVPMatrix");
        this.muSTMatrixHandle = GLES20.glGetUniformLocation(this.mProgram, "uSTMatrix");
        Matrix.setIdentityM(this.mMVPMatrix, 0);
        Matrix.setIdentityM(this.mSTMatrix, 0);
    }

    private int loadShader(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        return glCreateShader;
    }

    public void draw(int i, float[] fArr) {
        for (int i2 = 0; i2 < fArr.length; i2++) {
            this.mSTMatrix[i2] = fArr[i2];
        }
        draw(i);
    }
}
