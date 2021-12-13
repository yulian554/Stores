package com.example.stores;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\n"}, d2 = {"Lcom/example/stores/StoreDao;", "", "addStore", "", "storeEntity", "Lcom/example/stores/StoreEntity;", "deleteStore", "getAllStores", "", "updateStore", "app_debug"})
public abstract interface StoreDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM StoreEntity")
    public abstract java.util.List<com.example.stores.StoreEntity> getAllStores();
    
    @androidx.room.Insert()
    public abstract void addStore(@org.jetbrains.annotations.NotNull()
    com.example.stores.StoreEntity storeEntity);
    
    @androidx.room.Update()
    public abstract void updateStore(@org.jetbrains.annotations.NotNull()
    com.example.stores.StoreEntity storeEntity);
    
    @androidx.room.Delete()
    public abstract void deleteStore(@org.jetbrains.annotations.NotNull()
    com.example.stores.StoreEntity storeEntity);
}