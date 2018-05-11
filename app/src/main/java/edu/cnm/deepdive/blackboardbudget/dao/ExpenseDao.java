package edu.cnm.deepdive.blackboardbudget.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import edu.cnm.deepdive.blackboardbudget.models.Expense;
import org.joda.time.LocalDate;

@Dao
public interface ExpenseDao {

  @Query("SELECT * FROM expense WHERE user_id LIKE :userId")
  Expense getAllByUser(long userId);

  @Query("SELECT * FROM expense WHERE date LIKE :date AND user_id LIKE :userID")
  Expense findByDateAndUserId(LocalDate date, long userId);

  @Query("SELECT * FROM expense WHERE expense_id LIKE :expenseId LIMIt 1")
  Expense findById(long expenseId);
}
