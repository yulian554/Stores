package com.example.stores;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\f2\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u0014\u0010\u0018\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u001a\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/stores/StoreAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/stores/StoreAdapter$ViewHolder;", "stores", "", "Lcom/example/stores/StoreEntity;", "listener", "Lcom/example/stores/OnClickListener;", "(Ljava/util/List;Lcom/example/stores/OnClickListener;)V", "mContext", "Landroid/content/Context;", "add", "", "storeEntity", "delete", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setStore", "store", "update", "ViewHolder", "app_debug"})
public final class StoreAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.stores.StoreAdapter.ViewHolder> {
    private android.content.Context mContext;
    private java.util.List<com.example.stores.StoreEntity> stores;
    private com.example.stores.OnClickListener listener;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.stores.StoreAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.stores.StoreAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setStore(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.stores.StoreEntity> store) {
    }
    
    public final void add(@org.jetbrains.annotations.NotNull()
    com.example.stores.StoreEntity storeEntity) {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull()
    com.example.stores.StoreEntity storeEntity) {
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    com.example.stores.StoreEntity storeEntity) {
    }
    
    public StoreAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.stores.StoreEntity> stores, @org.jetbrains.annotations.NotNull()
    com.example.stores.OnClickListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/example/stores/StoreAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/stores/StoreAdapter;Landroid/view/View;)V", "binding", "Lcom/example/stores/databinding/ItemStoreBinding;", "getBinding", "()Lcom/example/stores/databinding/ItemStoreBinding;", "setListener", "", "storeEntity", "Lcom/example/stores/StoreEntity;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.stores.databinding.ItemStoreBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.stores.databinding.ItemStoreBinding getBinding() {
            return null;
        }
        
        public final void setListener(@org.jetbrains.annotations.NotNull()
        com.example.stores.StoreEntity storeEntity) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}