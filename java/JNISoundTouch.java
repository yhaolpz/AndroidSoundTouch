package com.amoment.audio;

import android.support.annotation.FloatRange;
import android.support.annotation.IntRange;

/*
速率：
setRate(double) 指定播放速率，原始值为1.0，大快小慢
setTempo(double) 指定节拍，原始值为1.0，大快小慢
音调：
setPitch(double) 指定音调值，原始值为1.0
setPitchOctaves(double) 在原音调基础上以八度音为单位进行调整，取值为[-1.00,+1.00]
setPitchSemiTones(int) 在原音调基础上以半音为单位进行调整，取值为[-12,+12]
 */
public class JNISoundTouch {

    /**
     * 原声采样率
     */
    public native void setSampleRate(int sampleRate);

    /**
     * 原声通道数
     */
    public native void setChannels(int channel);

    /**
     * 调整节拍
     *
     * @param newTempo 指定节拍，原始值为1.0，大快小慢
     */
//    public native void setTempo(float newTempo);

    /**
     * 调整节拍
     *
     * @param newTempo 指定节拍，原始值为0，大快小慢,(-50 .. +100)
     */
    public native void setTempoChange(@FloatRange(from = -50, to = 100) float newTempo);

    /**
     * 调整音调
     *
     * @param newPitch (-12 .. +12)
     */
    public native void setPitchSemiTones(@IntRange(from = -12, to = 12) int newPitch);

    /**
     * 改变播放速度
     *
     * @param newRate 指定速度，原始值为1.0，大快小慢
     */
//    public native void setRate(float newRate);

    /**
     * 改变播放速度
     *
     * @param newRate 指定速度，原始值为0，大快小慢,(-50 .. +100)
     */
    public native void setRateChange(@FloatRange(from = -50, to = 100) float newRate);


    public native void putSamples(short[] samples, int len);

    public native short[] receiveSamples();

    static {
        System.loadLibrary("soundtouch");
    }
}
