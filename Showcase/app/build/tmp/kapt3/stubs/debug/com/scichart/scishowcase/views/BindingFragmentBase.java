package com.scichart.scishowcase.views;

@kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H%J,\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\r\u0010\u001d\u001a\u00028\u0001H$\u00a2\u0006\u0002\u0010\u000fR\u001c\u0010\u0007\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\u00028\u0001X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001e"}, d2 = {"Lcom/scichart/scishowcase/views/BindingFragmentBase;", "TBinding", "Landroid/databinding/ViewDataBinding;", "TViewModel", "Lcom/scichart/scishowcase/viewModels/FragmentViewModelBase;", "Lcom/trello/rxlifecycle2/components/support/RxFragment;", "()V", "binding", "getBinding", "()Landroid/databinding/ViewDataBinding;", "setBinding", "(Landroid/databinding/ViewDataBinding;)V", "Landroid/databinding/ViewDataBinding;", "viewModel", "getViewModel", "()Lcom/scichart/scishowcase/viewModels/FragmentViewModelBase;", "setViewModel", "(Lcom/scichart/scishowcase/viewModels/FragmentViewModelBase;)V", "Lcom/scichart/scishowcase/viewModels/FragmentViewModelBase;", "getLayoutId", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateViewModel", "app_debug"})
public abstract class BindingFragmentBase<TBinding extends android.databinding.ViewDataBinding, TViewModel extends com.scichart.scishowcase.viewModels.FragmentViewModelBase> extends com.trello.rxlifecycle2.components.support.RxFragment {
    @org.jetbrains.annotations.NotNull()
    protected TBinding binding;
    @org.jetbrains.annotations.NotNull()
    protected TViewModel viewModel;
    
    @org.jetbrains.annotations.NotNull()
    protected final TBinding getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    TBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final TViewModel getViewModel() {
        return null;
    }
    
    protected final void setViewModel(@org.jetbrains.annotations.NotNull()
    TViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.Nullable()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    @android.support.annotation.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    @android.support.annotation.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.support.annotation.LayoutRes()
    protected abstract int getLayoutId();
    
    @org.jetbrains.annotations.NotNull()
    protected abstract TViewModel onCreateViewModel();
    
    public BindingFragmentBase() {
        super();
    }
}