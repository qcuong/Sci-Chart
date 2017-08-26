package com.scichart.scishowcase.viewModels.audioAnalyzer;

@kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/scichart/scishowcase/viewModels/audioAnalyzer/AudioStreamViewModel;", "Lcom/scichart/scishowcase/viewModels/ChartViewModel;", "context", "Landroid/content/Context;", "audioStreamBufferSize", "", "(Landroid/content/Context;I)V", "audioDS", "Lcom/scichart/charting/model/dataSeries/XyDataSeries;", "", "", "onNextAudioData", "", "audioData", "Lcom/scichart/scishowcase/model/audioAnalyzer/AudioData;", "app_debug"})
public final class AudioStreamViewModel extends com.scichart.scishowcase.viewModels.ChartViewModel {
    private final com.scichart.charting.model.dataSeries.XyDataSeries<java.lang.Long, java.lang.Short> audioDS = null;
    
    public final void onNextAudioData(@org.jetbrains.annotations.NotNull()
    com.scichart.scishowcase.model.audioAnalyzer.AudioData audioData) {
    }
    
    public AudioStreamViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int audioStreamBufferSize) {
        super(null);
    }
}