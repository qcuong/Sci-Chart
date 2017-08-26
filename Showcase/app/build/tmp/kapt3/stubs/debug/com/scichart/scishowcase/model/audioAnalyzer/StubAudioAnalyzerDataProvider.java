package com.scichart.scishowcase.model.audioAnalyzer;

@kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u0016\u0017\u0018\u0019B\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0014R\u0011\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001a"}, d2 = {"Lcom/scichart/scishowcase/model/audioAnalyzer/StubAudioAnalyzerDataProvider;", "Lcom/scichart/scishowcase/model/DataProviderBase;", "Lcom/scichart/scishowcase/model/audioAnalyzer/AudioData;", "Lcom/scichart/scishowcase/model/audioAnalyzer/IAudioAnalyzerDataProvider;", "bufferSizeInShorts", "", "(I)V", "audioData", "getAudioData", "()Lcom/scichart/scishowcase/model/audioAnalyzer/AudioData;", "provider", "Lcom/scichart/scishowcase/model/audioAnalyzer/StubAudioAnalyzerDataProvider$AggregateYValueProvider;", "Lcom/scichart/scishowcase/model/audioAnalyzer/StubAudioAnalyzerDataProvider/AggregateYValueProvider;", "time", "", "getTime", "()J", "setTime", "(J)V", "getBufferSize", "getSampleRate", "onNext", "AggregateYValueProvider", "FrequencySinewaveYValueProvider", "IYValueProvider", "NoisySinewaveYValueProvider", "app_debug"})
public final class StubAudioAnalyzerDataProvider extends com.scichart.scishowcase.model.DataProviderBase<com.scichart.scishowcase.model.audioAnalyzer.AudioData> implements com.scichart.scishowcase.model.audioAnalyzer.IAudioAnalyzerDataProvider {
    private long time;
    @org.jetbrains.annotations.NotNull()
    private final com.scichart.scishowcase.model.audioAnalyzer.AudioData audioData = null;
    private final com.scichart.scishowcase.model.audioAnalyzer.StubAudioAnalyzerDataProvider.AggregateYValueProvider provider = null;
    private final int bufferSizeInShorts = 0;
    
    public final long getTime() {
        return 0L;
    }
    
    public final void setTime(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.scichart.scishowcase.model.audioAnalyzer.AudioData getAudioData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.scichart.scishowcase.model.audioAnalyzer.AudioData onNext() {
        return null;
    }
    
    @java.lang.Override()
    public int getBufferSize() {
        return 0;
    }
    
    @java.lang.Override()
    public int getSampleRate() {
        return 0;
    }
    
    public StubAudioAnalyzerDataProvider(int bufferSizeInShorts) {
        super(0L, null);
    }
    
    public StubAudioAnalyzerDataProvider() {
        super(0L, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\t\n\u0000\bb\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/scichart/scishowcase/model/audioAnalyzer/StubAudioAnalyzerDataProvider$IYValueProvider;", "", "getYValueForIndex", "", "index", "", "app_debug"})
    static abstract interface IYValueProvider {
        
        public abstract short getYValueForIndex(long index);
    }
    
    @kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\t\n\u0000\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/scichart/scishowcase/model/audioAnalyzer/StubAudioAnalyzerDataProvider$NoisySinewaveYValueProvider;", "Lcom/scichart/scishowcase/model/audioAnalyzer/StubAudioAnalyzerDataProvider$IYValueProvider;", "amplitude", "", "phase", "freq", "noiseAmplitude", "(DDDD)V", "random", "Ljava/util/Random;", "getYValueForIndex", "", "index", "", "app_debug"})
    static final class NoisySinewaveYValueProvider implements com.scichart.scishowcase.model.audioAnalyzer.StubAudioAnalyzerDataProvider.IYValueProvider {
        private final java.util.Random random = null;
        private final double amplitude = 0.0;
        private final double phase = 0.0;
        private final double freq = 0.0;
        private final double noiseAmplitude = 0.0;
        
        @java.lang.Override()
        public short getYValueForIndex(long index) {
            return 0;
        }
        
        public NoisySinewaveYValueProvider(double amplitude, double phase, double freq, double noiseAmplitude) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\n\n\u0000\n\u0002\u0010\t\n\u0000\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/scichart/scishowcase/model/audioAnalyzer/StubAudioAnalyzerDataProvider$FrequencySinewaveYValueProvider;", "Lcom/scichart/scishowcase/model/audioAnalyzer/StubAudioAnalyzerDataProvider$IYValueProvider;", "amplitude", "", "phase", "minFrequency", "maxFrequency", "step", "(DDDDD)V", "frequency", "getYValueForIndex", "", "index", "", "app_debug"})
    static final class FrequencySinewaveYValueProvider implements com.scichart.scishowcase.model.audioAnalyzer.StubAudioAnalyzerDataProvider.IYValueProvider {
        private double frequency;
        private final double amplitude = 0.0;
        private final double phase = 0.0;
        private final double minFrequency = 0.0;
        private final double maxFrequency = 0.0;
        private final double step = 0.0;
        
        @java.lang.Override()
        public short getYValueForIndex(long index) {
            return 0;
        }
        
        public FrequencySinewaveYValueProvider(double amplitude, double phase, double minFrequency, double maxFrequency, double step) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\n\n\u0000\n\u0002\u0010\t\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/scichart/scishowcase/model/audioAnalyzer/StubAudioAnalyzerDataProvider$AggregateYValueProvider;", "Lcom/scichart/scishowcase/model/audioAnalyzer/StubAudioAnalyzerDataProvider$IYValueProvider;", "providers", "", "([Lcom/scichart/scishowcase/model/audioAnalyzer/StubAudioAnalyzerDataProvider/IYValueProvider;)V", "getProviders", "()[Lcom/scichart/scishowcase/model/audioAnalyzer/StubAudioAnalyzerDataProvider/IYValueProvider;", "[Lcom/scichart/scishowcase/model/audioAnalyzer/StubAudioAnalyzerDataProvider/IYValueProvider;", "getYValueForIndex", "", "index", "", "app_debug"})
    static final class AggregateYValueProvider implements com.scichart.scishowcase.model.audioAnalyzer.StubAudioAnalyzerDataProvider.IYValueProvider {
        @org.jetbrains.annotations.NotNull()
        private final com.scichart.scishowcase.model.audioAnalyzer.StubAudioAnalyzerDataProvider.IYValueProvider[] providers = null;
        
        @java.lang.Override()
        public short getYValueForIndex(long index) {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.scichart.scishowcase.model.audioAnalyzer.StubAudioAnalyzerDataProvider.IYValueProvider[] getProviders() {
            return null;
        }
        
        public AggregateYValueProvider(@org.jetbrains.annotations.NotNull()
        com.scichart.scishowcase.model.audioAnalyzer.StubAudioAnalyzerDataProvider.IYValueProvider[] providers) {
            super();
        }
    }
}