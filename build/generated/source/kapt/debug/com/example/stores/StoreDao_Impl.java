package com.example.stores;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class StoreDao_Impl implements StoreDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<StoreEntity> __insertionAdapterOfStoreEntity;

  private final EntityDeletionOrUpdateAdapter<StoreEntity> __deletionAdapterOfStoreEntity;

  private final EntityDeletionOrUpdateAdapter<StoreEntity> __updateAdapterOfStoreEntity;

  public StoreDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfStoreEntity = new EntityInsertionAdapter<StoreEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `StoreEntity` (`id`,`name`,`phone`,`website`,`isFavorite`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StoreEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getPhone() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPhone());
        }
        if (value.getWebsite() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getWebsite());
        }
        final int _tmp;
        _tmp = value.isFavorite() ? 1 : 0;
        stmt.bindLong(5, _tmp);
      }
    };
    this.__deletionAdapterOfStoreEntity = new EntityDeletionOrUpdateAdapter<StoreEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `StoreEntity` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StoreEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfStoreEntity = new EntityDeletionOrUpdateAdapter<StoreEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `StoreEntity` SET `id` = ?,`name` = ?,`phone` = ?,`website` = ?,`isFavorite` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StoreEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getPhone() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPhone());
        }
        if (value.getWebsite() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getWebsite());
        }
        final int _tmp;
        _tmp = value.isFavorite() ? 1 : 0;
        stmt.bindLong(5, _tmp);
        stmt.bindLong(6, value.getId());
      }
    };
  }

  @Override
  public void addStore(final StoreEntity storeEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfStoreEntity.insert(storeEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteStore(final StoreEntity storeEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfStoreEntity.handle(storeEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateStore(final StoreEntity storeEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfStoreEntity.handle(storeEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<StoreEntity> getAllStores() {
    final String _sql = "SELECT * FROM StoreEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
      final int _cursorIndexOfWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "website");
      final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
      final List<StoreEntity> _result = new ArrayList<StoreEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final StoreEntity _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpPhone;
        if (_cursor.isNull(_cursorIndexOfPhone)) {
          _tmpPhone = null;
        } else {
          _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
        }
        final String _tmpWebsite;
        if (_cursor.isNull(_cursorIndexOfWebsite)) {
          _tmpWebsite = null;
        } else {
          _tmpWebsite = _cursor.getString(_cursorIndexOfWebsite);
        }
        final boolean _tmpIsFavorite;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
        _tmpIsFavorite = _tmp != 0;
        _item = new StoreEntity(_tmpId,_tmpName,_tmpPhone,_tmpWebsite,_tmpIsFavorite);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
