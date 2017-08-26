package com.scichart.scishowcase.model;

@kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001bB%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0005H\u0016J\u001d\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0005H\u0016\u00a2\u0006\u0002\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005H\u0016\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/scichart/scishowcase/model/RecyclerBindingAdapter;", "T", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/scichart/scishowcase/model/RecyclerBindingAdapter$BindingHolder;", "holderLayout", "", "variableId", "items", "", "(IILjava/util/List;)V", "itemClickFlowable", "Lio/reactivex/Flowable;", "getItemClickFlowable", "()Lio/reactivex/Flowable;", "itemClickPublishSubject", "Lio/reactivex/subjects/PublishSubject;", "getItemCount", "onBindViewHolder", "", "holder", "position", "(Lcom/scichart/scishowcase/model/RecyclerBindingAdapter/BindingHolder;I)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "(Landroid/view/ViewGroup;I)Lcom/scichart/scishowcase/model/RecyclerBindingAdapter/BindingHolder;", "BindingHolder", "app_debug"})
public final class RecyclerBindingAdapter<T extends java.lang.Object> extends android.support.v7.widget.RecyclerView.Adapter<com.scichart.scishowcase.model.RecyclerBindingAdapter.BindingHolder> {
    private final io.reactivex.subjects.PublishSubject<T> itemClickPublishSubject = null;
    private final int holderLayout = 0;
    private final int variableId = 0;
    private java.util.List<? extends T> items;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<T> getItemClickFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.scichart.scishowcase.model.RecyclerBindingAdapter.BindingHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.scichart.scishowcase.model.RecyclerBindingAdapter.BindingHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public RecyclerBindingAdapter(int holderLayout, @android.support.annotation.IdRes()
    int variableId, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> items) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/scichart/scishowcase/model/RecyclerBindingAdapter$BindingHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "binding", "Landroid/databinding/ViewDataBinding;", "getBinding", "()Landroid/databinding/ViewDataBinding;", "app_debug"})
    public static final class BindingHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.databinding.ViewDataBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.databinding.ViewDataBinding getBinding() {
            return null;
        }
        
        public BindingHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
}