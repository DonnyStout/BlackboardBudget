package edu.cnm.deepdive.blackboardbudget.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import edu.cnm.deepdive.blackboardbudget.models.Transaction;
import java.util.List;
import org.joda.time.LocalDate;

@Dao
public interface TransactionDao {

  @Query("SELECT * FROM `transaction` WHERE user_id LIKE :userId")
  List<Transaction> findAllByUser(long userId);

  @Query("SELECT * FROM `transaction` WHERE date LIKE :date AND user_id LIKE :userId")
  List<Transaction> findByDateAndUserId(LocalDate date, long userId);

  @Query("SELECT * FROM `transaction` WHERE name LIKE :name AND user_id LIKE :userId LIMIT 1")
  Transaction findByNameAndUserId(String name, long userId);

  @Query("SELECT * FROM `transaction`WHERE transaction_id LIKE :transactionId AND user_id LIKE :userId LIMIT 1")
  Transaction findById(long transactionId, long userId);
}
