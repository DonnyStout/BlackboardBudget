package edu.cnm.deepdive.blackboardbudget.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import edu.cnm.deepdive.blackboardbudget.models.TransactionType;

@Dao
public interface TransactionTypeDao {


  @Query("SELECT * FROM transactiontype WHERE transaction_id LIKE :transactionId LIMIT 1")
  TransactionType findByTransactionId(long transactionId);

  @Query("SELECT * FROM transactiontype WHERE type_id LIKE :typeId LIMIT 1")
  TransactionType findByTypeId(long typeId);
}
