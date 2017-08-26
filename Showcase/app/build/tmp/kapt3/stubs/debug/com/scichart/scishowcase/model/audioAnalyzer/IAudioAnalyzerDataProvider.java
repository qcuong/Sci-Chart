package com.scichart.scishowcase.model.audioAnalyzer;

@kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/scichart/scishowcase/model/audioAnalyzer/IAudioAnalyzerDataProvider;", "Lcom/scichart/scishowcase/model/IDataProvider;", "Lcom/scichart/scishowcase/model/audioAnalyzer/AudioData;", "getBufferSize", "", "getSampleRate", "app_debug"})
public abstract interface IAudioAnalyzerDataProvider extends com.scichart.scishowcase.model.IDataProvider<com.scichart.scishowcase.model.audioAnalyzer.AudioData> {
    
    public abstract int getBufferSize();
    
    public abstract int getSampleRate();
}