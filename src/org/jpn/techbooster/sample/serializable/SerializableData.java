package org.jpn.techbooster.sample.serializable;

import java.io.Serializable;
import java.nio.ByteBuffer;

public class SerializableData implements Serializable {
	private static final long serialVersionUID = 1L;
	private String string_;
	private int number_;
	private GLMaterial mat;

	public SerializableData() {
		mat = new GLMaterial();
	}

	public String getString() {
		return string_;
	}
	
	public void setString(String string) {
		string_ = string;
	}

	public int getNumber() {
		return number_;
	}
	
	public void setNumber(int number) {
		number_ = number;
	}

	protected class GLMaterial {
		/**
		 * マテリアル名
		 */
		String name ;
		/**
		 * 描画有無<br>
		 */
		boolean isVisible = true;
		/**
		 * 色情報
		 */
		float[]	color = null ;
		/**
		 * 拡散光
		 */
		float[]	dif = null ;
		/**
		 * 環境光
		 */
		float[]	amb = null ;
		/**
		 * 放射輝度
		 */
		float[]	emi = null ;
		/**
		 * 鏡面反射
		 */
		float[]	spc = null ;
		/**
		 * 鏡面反射強度
		 */
		float[] power = null;

		/**
		 * シェーディングモード<br>
		 * GL_SMOOTH or GL_FLAT
		 */
		boolean shadeMode_IsSmooth = true ; //OpenGLのデフォルトはGL_SMOOTH

		/**
		 * 頂点数
		 */
		int vertex_num ;
		/**
		 * テクスチャＩＤ（未使用の場合０）<br>
		 */
		int	texID = 0 ;
		// reload 用
		String texName = null;
		String alphaTexName = null;

		// interleaveFormat は無いので
		// ShortBuffer indexBuffer;
		ByteBuffer vertexBuffer;
		ByteBuffer normalBuffer;
		ByteBuffer uvBuffer = null;
		ByteBuffer colBuffer = null;

		boolean uvValid = false;
		boolean colValid = false;

		// int indexCount;
	}

}
